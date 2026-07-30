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
import p149l.hwb;
import p149l.v680;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.g */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface InterfaceC1859g {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final byte[] f7470a;

        /* JADX INFO: renamed from: b */
        public final String f7471b;

        /* JADX INFO: renamed from: c */
        public final int f7472c;

        public a(byte[] bArr, String str, int i) {
            this.f7470a = bArr;
            this.f7471b = str;
            this.f7472c = i;
        }

        /* JADX INFO: renamed from: a */
        public byte[] m9954a() {
            return this.f7470a;
        }

        /* JADX INFO: renamed from: b */
        public String m9955b() {
            return this.f7471b;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.g$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo9889a(InterfaceC1859g interfaceC1859g, @Nullable byte[] bArr, int i, int i2, @Nullable byte[] bArr2);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.g$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        InterfaceC1859g mo9956a(UUID uuid);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.g$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final byte[] f7473a;

        /* JADX INFO: renamed from: b */
        public final String f7474b;

        public d(byte[] bArr, String str) {
            this.f7473a = bArr;
            this.f7474b = str;
        }

        /* JADX INFO: renamed from: a */
        public byte[] m9957a() {
            return this.f7473a;
        }

        /* JADX INFO: renamed from: b */
        public String m9958b() {
            return this.f7474b;
        }
    }

    /* JADX INFO: renamed from: a */
    Map<String, String> mo9941a(byte[] bArr);

    /* JADX INFO: renamed from: b */
    d mo9942b();

    /* JADX INFO: renamed from: c */
    byte[] mo9943c() throws MediaDrmException;

    /* JADX INFO: renamed from: d */
    void mo9944d(byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: e */
    void mo9945e(@Nullable b bVar);

    @Nullable
    /* JADX INFO: renamed from: f */
    byte[] mo9946f(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    /* JADX INFO: renamed from: h */
    void mo9947h(byte[] bArr) throws DeniedByServerException;

    /* JADX INFO: renamed from: i */
    int mo9948i();

    /* JADX INFO: renamed from: j */
    hwb mo9949j(byte[] bArr) throws MediaCryptoException;

    /* JADX INFO: renamed from: k */
    boolean mo9950k(byte[] bArr, String str);

    /* JADX INFO: renamed from: l */
    void mo9951l(byte[] bArr);

    /* JADX INFO: renamed from: m */
    a mo9952m(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i, @Nullable HashMap<String, String> map) throws NotProvisionedException;

    void release();

    /* JADX INFO: renamed from: g */
    default void mo9953g(byte[] bArr, v680 v680Var) {
    }
}
