package com.vivo.push;

import android.content.Context;
import com.vivo.push.p111b.C14540f;
import com.vivo.push.util.VivoPushException;
import java.util.ArrayList;
import java.util.List;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
public class PushClient {
    public static final String DEFAULT_REQUEST_ID = "1";
    private static volatile PushClient sPushClient;

    private PushClient(Context context) {
        C14608e.m84861a().m84875a(context);
    }

    private void checkParam(String str) {
        if (str != null) {
            return;
        }
        ig3.m135964a("PushManager String param should not be ".concat(String.valueOf(str)));
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
        C14608e.m84861a().m84882a(str, iPushActionListener);
    }

    public void checkManifest() throws VivoPushException {
        C14608e.m84861a().m84886b();
    }

    public void delTopic(String str, IPushActionListener iPushActionListener) {
        ArrayList<String> arrayList = new ArrayList<>(1);
        arrayList.add(str);
        C14608e.m84861a().m84890b(arrayList, iPushActionListener);
    }

    public String getAlias() {
        return C14608e.m84861a().m84900j();
    }

    public String getRegId() {
        return C14608e.m84861a().m84896f();
    }

    public List<String> getTopics() {
        return C14608e.m84861a().m84892c();
    }

    public String getVersion() {
        return "3.4.0.0";
    }

    public void initialize() throws VivoPushException {
        checkManifest();
        C14608e.m84861a().m84878a(new C14540f());
    }

    public boolean isSupport() {
        return C14608e.m84861a().m84894d();
    }

    public void setSystemModel(boolean z) {
        C14608e.m84861a().m84885a(z);
    }

    public void setTopic(String str, IPushActionListener iPushActionListener) {
        ArrayList<String> arrayList = new ArrayList<>(1);
        arrayList.add(str);
        C14608e.m84861a().m84883a(arrayList, iPushActionListener);
    }

    public void turnOffPush(IPushActionListener iPushActionListener) {
        C14608e.m84861a().m84887b(iPushActionListener);
    }

    public void turnOnPush(IPushActionListener iPushActionListener) {
        C14608e.m84861a().m84877a(iPushActionListener);
    }

    public void unBindAlias(String str, IPushActionListener iPushActionListener) {
        checkParam(str);
        C14608e.m84861a().m84889b(str, iPushActionListener);
    }
}
