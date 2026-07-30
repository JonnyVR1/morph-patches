package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.drm.C1860h;
import com.google.android.exoplayer2.drm.InterfaceC1859g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p149l.ar3;
import p149l.d860;
import p149l.fs4;
import p149l.g5j;
import p149l.jwv;
import p149l.m5j;
import p149l.p11;
import p149l.p75;
import p149l.pza0;
import p149l.v680;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.h */
/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(18)
@Deprecated
public final class C1860h implements InterfaceC1859g {

    /* JADX INFO: renamed from: d */
    public static final InterfaceC1859g.c f7475d = new InterfaceC1859g.c() { // from class: l.i5j
        @Override // com.google.android.exoplayer2.drm.InterfaceC1859g.c
        /* JADX INFO: renamed from: a */
        public final InterfaceC1859g mo9956a(UUID uuid) {
            return C1860h.m9960n(uuid);
        }
    };

    /* JADX INFO: renamed from: a */
    public final UUID f7476a;

    /* JADX INFO: renamed from: b */
    public final MediaDrm f7477b;

    /* JADX INFO: renamed from: c */
    public int f7478c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.h$a */
    @RequiresApi(31)
    public static class a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m9973a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m9974b(MediaDrm mediaDrm, byte[] bArr, v680 v680Var) {
            LogSessionId logSessionIdM197200a = v680Var.m197200a();
            if (logSessionIdM197200a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            m5j.m153140a(p11.m167011e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdM197200a);
        }
    }

    public C1860h(UUID uuid) throws UnsupportedSchemeException {
        p11.m167011e(uuid);
        p11.m167008b(!ar3.f71229b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f7476a = uuid;
        MediaDrm mediaDrm = new MediaDrm(m9967u(uuid));
        this.f7477b = mediaDrm;
        this.f7478c = 1;
        if (ar3.f71231d.equals(uuid) && m9970z()) {
            m9968w(mediaDrm);
        }
    }

    /* JADX INFO: renamed from: A */
    public static C1860h m9959A(UUID uuid) throws UnsupportedDrmException {
        try {
            return new C1860h(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(1, e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(2, e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ InterfaceC1859g m9960n(UUID uuid) {
        try {
            return m9959A(uuid);
        } catch (UnsupportedDrmException unused) {
            jwv.m143683c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new C1857e();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m9961o(C1860h c1860h, InterfaceC1859g.b bVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        c1860h.getClass();
        bVar.mo9889a(c1860h, bArr, i, i2, bArr2);
    }

    /* JADX INFO: renamed from: p */
    public static byte[] m9962p(byte[] bArr) {
        d860 d860Var = new d860(bArr);
        int iM110315u = d860Var.m110315u();
        short sM110317w = d860Var.m110317w();
        short sM110317w2 = d860Var.m110317w();
        if (sM110317w != 1 || sM110317w2 != 1) {
            jwv.m143686f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sM110317w3 = d860Var.m110317w();
        Charset charset = fs4.f99038e;
        String strM110277F = d860Var.m110277F(sM110317w3, charset);
        if (strM110277F.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strM110277F.indexOf("</DATA>");
        if (iIndexOf == -1) {
            jwv.m143689i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strM110277F.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strM110277F.substring(iIndexOf);
        int i = iM110315u + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putShort(sM110317w);
        byteBufferAllocate.putShort(sM110317w2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    /* JADX INFO: renamed from: q */
    public static String m9963q(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        return (vck0.f180948a == 33 && "https://default.url".equals(str)) ? "" : str;
    }

    /* JADX INFO: renamed from: r */
    public static byte[] m9964r(UUID uuid, byte[] bArr) {
        return ar3.f71230c.equals(uuid) ? p75.m167701a(bArr) : bArr;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e A[RETURN] */
    /* JADX INFO: renamed from: s */
    public static byte[] m9965s(UUID uuid, byte[] bArr) {
        byte[] bArrM172219e;
        UUID uuid2 = ar3.f71232e;
        if (uuid2.equals(uuid)) {
            byte[] bArrM172219e2 = pza0.m172219e(bArr, uuid);
            if (bArrM172219e2 != null) {
                bArr = bArrM172219e2;
            }
            bArr = pza0.m172215a(uuid2, m9962p(bArr));
        }
        if (vck0.f180948a < 23 && ar3.f71231d.equals(uuid)) {
            bArrM172219e = pza0.m172219e(bArr, uuid);
            if (bArrM172219e != null) {
                return bArrM172219e;
            }
        } else if (uuid2.equals(uuid) && "Amazon".equals(vck0.f180950c)) {
            String str = vck0.f180951d;
            if ("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) {
                bArrM172219e = pza0.m172219e(bArr, uuid);
                if (bArrM172219e != null) {
                    return bArrM172219e;
                }
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: t */
    public static String m9966t(UUID uuid, String str) {
        return (vck0.f180948a < 26 && ar3.f71230c.equals(uuid) && (DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4.equals(str) || DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG_4.equals(str))) ? "cenc" : str;
    }

    /* JADX INFO: renamed from: u */
    public static UUID m9967u(UUID uuid) {
        return (vck0.f180948a >= 27 || !ar3.f71230c.equals(uuid)) ? uuid : ar3.f71229b;
    }

    /* JADX INFO: renamed from: w */
    public static void m9968w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    /* JADX INFO: renamed from: y */
    public static DrmInitData.SchemeData m9969y(UUID uuid, List<DrmInitData.SchemeData> list) {
        if (!ar3.f71231d.equals(uuid)) {
            return list.get(0);
        }
        if (vck0.f180948a >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = list.get(0);
            int i = 0;
            int length = 0;
            while (true) {
                if (i >= list.size()) {
                    byte[] bArr = new byte[length];
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        byte[] bArr2 = (byte[]) p11.m167011e(list.get(i3).data);
                        int length2 = bArr2.length;
                        System.arraycopy(bArr2, 0, bArr, i2, length2);
                        i2 += length2;
                    }
                    return schemeData.m9902b(bArr);
                }
                DrmInitData.SchemeData schemeData2 = list.get(i);
                byte[] bArr3 = (byte[]) p11.m167011e(schemeData2.data);
                if (!vck0.m197845c(schemeData2.mimeType, schemeData.mimeType) || !vck0.m197845c(schemeData2.licenseServerUrl, schemeData.licenseServerUrl) || !pza0.m172217c(bArr3)) {
                    break;
                }
                length += bArr3.length;
                i++;
            }
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            DrmInitData.SchemeData schemeData3 = list.get(i4);
            int iM172221g = pza0.m172221g((byte[]) p11.m167011e(schemeData3.data));
            int i5 = vck0.f180948a;
            if ((i5 < 23 && iM172221g == 0) || (i5 >= 23 && iM172221g == 1)) {
                return schemeData3;
            }
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m9970z() {
        return "ASUS_Z00AD".equals(vck0.f180951d);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: a */
    public Map<String, String> mo9941a(byte[] bArr) {
        return this.f7477b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: b */
    public InterfaceC1859g.d mo9942b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f7477b.getProvisionRequest();
        return new InterfaceC1859g.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: c */
    public byte[] mo9943c() throws MediaDrmException {
        return this.f7477b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: d */
    public void mo9944d(byte[] bArr, byte[] bArr2) {
        this.f7477b.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: e */
    public void mo9945e(@Nullable final InterfaceC1859g.b bVar) {
        this.f7477b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: l.j5j
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                C1860h.m9961o(this.f116326a, bVar, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    @Nullable
    /* JADX INFO: renamed from: f */
    public byte[] mo9946f(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (ar3.f71230c.equals(this.f7476a)) {
            bArr2 = p75.m167702b(bArr2);
        }
        return this.f7477b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: g */
    public void mo9953g(byte[] bArr, v680 v680Var) {
        if (vck0.f180948a >= 31) {
            try {
                a.m9974b(this.f7477b, bArr, v680Var);
            } catch (UnsupportedOperationException unused) {
                jwv.m143689i("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: h */
    public void mo9947h(byte[] bArr) throws DeniedByServerException {
        this.f7477b.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: i */
    public int mo9948i() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: k */
    public boolean mo9950k(byte[] bArr, String str) {
        if (vck0.f180948a >= 31) {
            return a.m9973a(this.f7477b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f7476a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: l */
    public void mo9951l(byte[] bArr) {
        this.f7477b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: m */
    public InterfaceC1859g.a mo9952m(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i, @Nullable HashMap<String, String> map) throws NotProvisionedException {
        DrmInitData.SchemeData schemeDataM9969y;
        byte[] bArrM9965s;
        String strM9966t;
        if (list != null) {
            schemeDataM9969y = m9969y(this.f7476a, list);
            bArrM9965s = m9965s(this.f7476a, (byte[]) p11.m167011e(schemeDataM9969y.data));
            strM9966t = m9966t(this.f7476a, schemeDataM9969y.mimeType);
        } else {
            schemeDataM9969y = null;
            bArrM9965s = null;
            strM9966t = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f7477b.getKeyRequest(bArr, bArrM9965s, strM9966t, i, map);
        byte[] bArrM9964r = m9964r(this.f7476a, keyRequest.getData());
        String strM9963q = m9963q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strM9963q) && schemeDataM9969y != null && !TextUtils.isEmpty(schemeDataM9969y.licenseServerUrl)) {
            strM9963q = schemeDataM9969y.licenseServerUrl;
        }
        return new InterfaceC1859g.a(bArrM9964r, strM9963q, vck0.f180948a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    public synchronized void release() {
        int i = this.f7478c - 1;
        this.f7478c = i;
        if (i == 0) {
            this.f7477b.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1859g
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public g5j mo9949j(byte[] bArr) throws MediaCryptoException {
        return new g5j(m9967u(this.f7476a), bArr, vck0.f180948a < 21 && ar3.f71231d.equals(this.f7476a) && "L3".equals(m9972x("securityLevel")));
    }

    /* JADX INFO: renamed from: x */
    public String m9972x(String str) {
        return this.f7477b.getPropertyString(str);
    }
}
