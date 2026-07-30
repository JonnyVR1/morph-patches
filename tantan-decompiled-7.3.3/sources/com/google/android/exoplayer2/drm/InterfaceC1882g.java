package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p153l.bf80;
import p153l.vxb;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.g */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1882g {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final byte[] f7507a;

        /* JADX INFO: renamed from: b */
        public final String f7508b;

        /* JADX INFO: renamed from: c */
        public final int f7509c;

        public a(byte[] bArr, String str, int i) {
            this.f7507a = bArr;
            this.f7508b = str;
            this.f7509c = i;
        }

        /* JADX INFO: renamed from: a */
        public byte[] m10008a() {
            return this.f7507a;
        }

        /* JADX INFO: renamed from: b */
        public String m10009b() {
            return this.f7508b;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.g$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo9943a(InterfaceC1882g interfaceC1882g, @Nullable byte[] bArr, int i, int i2, @Nullable byte[] bArr2);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.g$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        InterfaceC1882g mo10010a(UUID uuid);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.g$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final byte[] f7510a;

        /* JADX INFO: renamed from: b */
        public final String f7511b;

        public d(byte[] bArr, String str) {
            this.f7510a = bArr;
            this.f7511b = str;
        }

        /* JADX INFO: renamed from: a */
        public byte[] m10011a() {
            return this.f7510a;
        }

        /* JADX INFO: renamed from: b */
        public String m10012b() {
            return this.f7511b;
        }
    }

    /* JADX INFO: renamed from: a */
    Map<String, String> mo9995a(byte[] bArr);

    /* JADX INFO: renamed from: b */
    d mo9996b();

    /* JADX INFO: renamed from: c */
    byte[] mo9997c() throws MediaDrmException;

    /* JADX INFO: renamed from: d */
    void mo9998d(byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: e */
    void mo9999e(@Nullable b bVar);

    @Nullable
    /* JADX INFO: renamed from: f */
    byte[] mo10000f(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    /* JADX INFO: renamed from: h */
    void mo10001h(byte[] bArr) throws DeniedByServerException;

    /* JADX INFO: renamed from: i */
    int mo10002i();

    /* JADX INFO: renamed from: j */
    vxb mo10003j(byte[] bArr) throws MediaCryptoException;

    /* JADX INFO: renamed from: k */
    boolean mo10004k(byte[] bArr, String str);

    /* JADX INFO: renamed from: l */
    void mo10005l(byte[] bArr);

    /* JADX INFO: renamed from: m */
    a mo10006m(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i, @Nullable HashMap<String, String> map) throws NotProvisionedException;

    void release();

    /* JADX INFO: renamed from: g */
    default void mo10007g(byte[] bArr, bf80 bf80Var) {
    }
}
