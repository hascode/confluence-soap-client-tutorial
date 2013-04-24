package com.hascode.confluence.rpc;

import javax.xml.rpc.ServiceException;

import com.atlassian.confluence.rpc.AuthenticationFailedException;
import com.atlassian.confluence.rpc.RemoteException;
import com.atlassian.confluence.rpc.soap.beans.RemotePage;

import devel.hascode.confluence.rpc.soap_axis.confluenceservice_v2.ConfluenceSoapService;
import devel.hascode.confluence.rpc.soap_axis.confluenceservice_v2.ConfluenceSoapServiceServiceLocator;

public class PageReader {
	public static void main(final String[] args)
			throws AuthenticationFailedException, RemoteException,
			java.rmi.RemoteException, ServiceException {
		final ConfluenceSoapService service;
		ConfluenceSoapServiceServiceLocator serviceLocator = new ConfluenceSoapServiceServiceLocator();
		service = serviceLocator.getConfluenceserviceV2();

		// insert your account data here
		String token = service.login("theuser", "thepassword");

		// we are going to fetch a page from the pre-installed Demonstration
		// Space
		RemotePage page = service.getPage(token, "ds", "Tutorial");
		String renderedOutput = service.renderContent(token, "ds",
				page.getId(), page.getContent());
		System.out.println(renderedOutput);
	}
}
