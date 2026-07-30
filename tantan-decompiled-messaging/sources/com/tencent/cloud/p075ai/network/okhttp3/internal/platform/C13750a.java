package com.tencent.cloud.p075ai.network.okhttp3.internal.platform;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import com.tencent.cloud.p075ai.network.okhttp3.EnumC13768q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.platform.a */
/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"NewApi"})
public class C13750a extends C13751b {
    public C13750a(Class<?> cls) {
        super(cls, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: e */
    public static C13752c m81782e() {
        int i;
        if (!C13752c.m81802d()) {
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
            return new C13750a(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
        }
        return null;
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13751b, com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c
    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    /* JADX INFO: renamed from: a */
    public void mo81784a(SSLSocket sSLSocket, String str, List<EnumC13768q> list) throws IOException {
        try {
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                EnumC13768q enumC13768q = list.get(i);
                if (enumC13768q != EnumC13768q.HTTP_1_0) {
                    arrayList.add(enumC13768q.f56932a);
                }
            }
            sSLParameters.setApplicationProtocols((String[]) arrayList.toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13751b, com.tencent.cloud.p075ai.network.okhttp3.internal.platform.C13752c
    @IgnoreJRERequirement
    /* JADX INFO: renamed from: a */
    public String mo81783a(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
