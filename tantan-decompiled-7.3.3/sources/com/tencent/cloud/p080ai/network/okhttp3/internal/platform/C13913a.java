package com.tencent.cloud.p080ai.network.okhttp3.internal.platform;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import com.tencent.cloud.p080ai.network.okhttp3.EnumC13931q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.platform.a */
/* JADX INFO: loaded from: classes12.dex */
@SuppressLint({"NewApi"})
public class C13913a extends C13914b {
    public C13913a(Class<?> cls) {
        super(cls, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: e */
    public static C13915c m82965e() {
        int i;
        if (!C13915c.m82985d()) {
            return null;
        }
        try {
            try {
                i = Build.VERSION.SDK_INT;
            } catch (ReflectiveOperationException unused) {
            }
        } catch (NoClassDefFoundError unused2) {
            i = 0;
        }
        if (i >= 29) {
            return new C13913a(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
        }
        return null;
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13914b, com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c
    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    /* JADX INFO: renamed from: a */
    public void mo82967a(SSLSocket sSLSocket, String str, List<EnumC13931q> list) throws IOException {
        try {
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                EnumC13931q enumC13931q = list.get(i);
                if (enumC13931q != EnumC13931q.HTTP_1_0) {
                    arrayList.add(enumC13931q.f57780a);
                }
            }
            sSLParameters.setApplicationProtocols((String[]) arrayList.toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13914b, com.tencent.cloud.p080ai.network.okhttp3.internal.platform.C13915c
    @IgnoreJRERequirement
    /* JADX INFO: renamed from: a */
    public String mo82966a(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
