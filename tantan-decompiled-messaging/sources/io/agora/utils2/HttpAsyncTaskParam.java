package io.agora.utils2;

import java.net.Proxy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
class HttpAsyncTaskParam {
    public String agent;
    public byte[] body;
    public String fullUrl;
    public HashMap<String, String> headers;
    Proxy httpProxy;
    public String method;
    public String pass;
    public int timeout_millsec;
    public String user;
}
