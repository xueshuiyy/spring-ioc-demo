package org.demo.facotrybean;

/**
 * Created by Administrator on 2019/3/21.
 */
public class ClientService {
    private static ClientService clientService = new ClientService();
    private ClientService() {}

    // 静态方法
    public static ClientService createInstance() {
        return clientService;
    }
}
