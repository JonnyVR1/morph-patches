package com.momo.xengine.mestatistics;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes8.dex */
final class Server {
    private static final String API = "https://cosmos-open.immomo.com/cg-monitor/upload";
    private static final String ARS_KEY = "KVA1h3qbcSHb";
    private static final String RSA_KEY = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKbj7WvmhEVXZbeqvMGXdMDvGlD6/Aa/MRxkhtUzdMBtB1FzUGOs77Yo7Es3cxt4HQGrioAaPXCyNC4KX1L8qdcCAwEAAQ==";
    private static final String TAG = "MEStatistics";
    private static final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

    public static void send(final StatisticalEvent statisticalEvent) {
        singleThreadExecutor.execute(new Runnable() { // from class: com.momo.xengine.mestatistics.a
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                Server.sendImpl(statisticalEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sendImpl(StatisticalEvent statisticalEvent) throws Exception {
        String string = statisticalEvent.toString();
        byte[] bArrRsa_encrypt = EncryptionTool.rsa_encrypt(ARS_KEY, RSA_KEY);
        byte[] bArrAes_encrypt = EncryptionTool.aes_encrypt(string, EncryptionTool.SHA256(ARS_KEY));
        HttpPostMultipart httpPostMultipart = new HttpPostMultipart(API, "utf-8", null);
        httpPostMultipart.addFormField("msc", Base64.encode(bArrRsa_encrypt));
        httpPostMultipart.addFormField("mzip", Base64.encode(bArrAes_encrypt));
        httpPostMultipart.finish();
    }
}
