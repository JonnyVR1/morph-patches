package com.vivo.push;

import android.content.Context;
import com.vivo.push.p116b.C14688f;
import com.vivo.push.util.VivoPushException;
import java.util.ArrayList;
import java.util.List;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
public class PushClient {
    public static final String DEFAULT_REQUEST_ID = "1";
    private static volatile PushClient sPushClient;

    private PushClient(Context context) {
        C14756e.m86032a().m86046a(context);
    }

    private void checkParam(String str) {
        if (str != null) {
            return;
        }
        wg3.m206174a("PushManager String param should not be ".concat(String.valueOf(str)));
    }

    public static synchronized PushClient getInstance(Context context) {
        try {
            if (sPushClient == null) {
                sPushClient = new PushClient(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return sPushClient;
    }

    public void bindAlias(String str, IPushActionListener iPushActionListener) {
        checkParam(str);
        C14756e.m86032a().m86053a(str, iPushActionListener);
    }

    public void checkManifest() throws VivoPushException {
        C14756e.m86032a().m86057b();
    }

    public void delTopic(String str, IPushActionListener iPushActionListener) {
        ArrayList<String> arrayList = new ArrayList<>(1);
        arrayList.add(str);
        C14756e.m86032a().m86061b(arrayList, iPushActionListener);
    }

    public String getAlias() {
        return C14756e.m86032a().m86071j();
    }

    public String getRegId() {
        return C14756e.m86032a().m86067f();
    }

    public List<String> getTopics() {
        return C14756e.m86032a().m86063c();
    }

    public String getVersion() {
        return "3.4.0.0";
    }

    public void initialize() throws VivoPushException {
        checkManifest();
        C14756e.m86032a().m86049a(new C14688f());
    }

    public boolean isSupport() {
        return C14756e.m86032a().m86065d();
    }

    public void setSystemModel(boolean z) {
        C14756e.m86032a().m86056a(z);
    }

    public void setTopic(String str, IPushActionListener iPushActionListener) {
        ArrayList<String> arrayList = new ArrayList<>(1);
        arrayList.add(str);
        C14756e.m86032a().m86054a(arrayList, iPushActionListener);
    }

    public void turnOffPush(IPushActionListener iPushActionListener) {
        C14756e.m86032a().m86058b(iPushActionListener);
    }

    public void turnOnPush(IPushActionListener iPushActionListener) {
        C14756e.m86032a().m86048a(iPushActionListener);
    }

    public void unBindAlias(String str, IPushActionListener iPushActionListener) {
        checkParam(str);
        C14756e.m86032a().m86060b(str, iPushActionListener);
    }
}
