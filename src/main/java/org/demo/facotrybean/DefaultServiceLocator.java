package org.demo.facotrybean;

/**
 * Created by Administrator on 2019/3/21.
 */
public class DefaultServiceLocator {

    private static ClientServiceF clientService = new ClientServiceImpl();

    private static AccountService accountService = new AccountServiceImpl();

    public ClientServiceF createClientServiceInstance() {
        return clientService;
    }

    public AccountService createAccountServiceInstance() {
        return accountService;
    }
}
