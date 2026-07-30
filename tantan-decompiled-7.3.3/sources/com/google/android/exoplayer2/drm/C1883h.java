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
import com.google.android.exoplayer2.drm.C1883h;
import com.google.android.exoplayer2.drm.InterfaceC1882g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p153l.b8j;
import p153l.bf80;
import p153l.bmk0;
import p153l.et4;
import p153l.g8j;
import p153l.ig60;
import p153l.kyv;
import p153l.q85;
import p153l.t7b0;
import p153l.w11;
import p153l.zr3;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.h */
/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(18)
@Deprecated
public final class C1883h implements InterfaceC1882g {

    /* JADX INFO: renamed from: d */
    public static final InterfaceC1882g.c f7512d = new InterfaceC1882g.c() { // from class: l.c8j
        @Override // com.google.android.exoplayer2.drm.InterfaceC1882g.c
        /* JADX INFO: renamed from: a */
        public final InterfaceC1882g mo10010a(UUID uuid) {
            return C1883h.m10014n(uuid);
        }
    };

    /* JADX INFO: renamed from: a */
    public final UUID f7513a;

    /* JADX INFO: renamed from: b */
    public final MediaDrm f7514b;

    /* JADX INFO: renamed from: c */
    public int f7515c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.h$a */
    @RequiresApi(31)
    public static class a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m10027a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m10028b(MediaDrm mediaDrm, byte[] bArr, bf80 bf80Var) {
            LogSessionId logSessionIdM103880a = bf80Var.m103880a();
            if (logSessionIdM103880a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            g8j.m129408a(w11.m204369e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdM103880a);
        }
    }

    public C1883h(UUID uuid) throws UnsupportedSchemeException {
        w11.m204369e(uuid);
        w11.m204366b(!zr3.f205730b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f7513a = uuid;
        MediaDrm mediaDrm = new MediaDrm(m10021u(uuid));
        this.f7514b = mediaDrm;
        this.f7515c = 1;
        if (zr3.f205732d.equals(uuid) && m10024z()) {
            m10022w(mediaDrm);
        }
    }

    /* JADX INFO: renamed from: A */
    public static C1883h m10013A(UUID uuid) throws UnsupportedDrmException {
        try {
            return new C1883h(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(1, e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(2, e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ InterfaceC1882g m10014n(UUID uuid) {
        try {
            return m10013A(uuid);
        } catch (UnsupportedDrmException unused) {
            kyv.m152145c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new C1880e();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m10015o(C1883h c1883h, InterfaceC1882g.b bVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        c1883h.getClass();
        bVar.mo9943a(c1883h, bArr, i, i2, bArr2);
    }

    /* JADX INFO: renamed from: p */
    public static byte[] m10016p(byte[] bArr) {
        ig60 ig60Var = new ig60(bArr);
        int iM139831u = ig60Var.m139831u();
        short sM139833w = ig60Var.m139833w();
        short sM139833w2 = ig60Var.m139833w();
        if (sM139833w != 1 || sM139833w2 != 1) {
            kyv.m152148f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sM139833w3 = ig60Var.m139833w();
        Charset charset = et4.f95691e;
        String strM139793F = ig60Var.m139793F(sM139833w3, charset);
        if (strM139793F.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strM139793F.indexOf("</DATA>");
        if (iIndexOf == -1) {
            kyv.m152151i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strM139793F.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strM139793F.substring(iIndexOf);
        int i = iM139831u + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putShort(sM139833w);
        byteBufferAllocate.putShort(sM139833w2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    /* JADX INFO: renamed from: q */
    public static String m10017q(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        return (bmk0.f77313a == 33 && "https://default.url".equals(str)) ? "" : str;
    }

    /* JADX INFO: renamed from: r */
    public static byte[] m10018r(UUID uuid, byte[] bArr) {
        return zr3.f205731c.equals(uuid) ? q85.m175763a(bArr) : bArr;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e A[RETURN] */
    /* JADX INFO: renamed from: s */
    public static byte[] m10019s(UUID uuid, byte[] bArr) {
        byte[] bArrM189558e;
        UUID uuid2 = zr3.f205733e;
        if (uuid2.equals(uuid)) {
            byte[] bArrM189558e2 = t7b0.m189558e(bArr, uuid);
            if (bArrM189558e2 != null) {
                bArr = bArrM189558e2;
            }
            bArr = t7b0.m189554a(uuid2, m10016p(bArr));
        }
        if (bmk0.f77313a < 23 && zr3.f205732d.equals(uuid)) {
            bArrM189558e = t7b0.m189558e(bArr, uuid);
            if (bArrM189558e != null) {
                return bArrM189558e;
            }
        } else if (uuid2.equals(uuid) && "Amazon".equals(bmk0.f77315c)) {
            String str = bmk0.f77316d;
            if ("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) {
                bArrM189558e = t7b0.m189558e(bArr, uuid);
                if (bArrM189558e != null) {
                    return bArrM189558e;
                }
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: t */
    public static String m10020t(UUID uuid, String str) {
        return (bmk0.f77313a < 26 && zr3.f205731c.equals(uuid) && (DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4.equals(str) || DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG_4.equals(str))) ? "cenc" : str;
    }

    /* JADX INFO: renamed from: u */
    public static UUID m10021u(UUID uuid) {
        return (bmk0.f77313a >= 27 || !zr3.f205731c.equals(uuid)) ? uuid : zr3.f205730b;
    }

    /* JADX INFO: renamed from: w */
    public static void m10022w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    /* JADX INFO: renamed from: y */
    public static DrmInitData.SchemeData m10023y(UUID uuid, List<DrmInitData.SchemeData> list) {
        if (!zr3.f205732d.equals(uuid)) {
            return list.get(0);
        }
        if (bmk0.f77313a >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = list.get(0);
            int i = 0;
            int length = 0;
            while (true) {
                if (i >= list.size()) {
                    byte[] bArr = new byte[length];
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        byte[] bArr2 = (byte[]) w11.m204369e(list.get(i3).data);
                        int length2 = bArr2.length;
                        System.arraycopy(bArr2, 0, bArr, i2, length2);
                        i2 += length2;
                    }
                    return schemeData.m9956b(bArr);
                }
                DrmInitData.SchemeData schemeData2 = list.get(i);
                byte[] bArr3 = (byte[]) w11.m204369e(schemeData2.data);
                if (!bmk0.m105123c(schemeData2.mimeType, schemeData.mimeType) || !bmk0.m105123c(schemeData2.licenseServerUrl, schemeData.licenseServerUrl) || !t7b0.m189556c(bArr3)) {
                    break;
                }
                length += bArr3.length;
                i++;
            }
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            DrmInitData.SchemeData schemeData3 = list.get(i4);
            int iM189560g = t7b0.m189560g((byte[]) w11.m204369e(schemeData3.data));
            int i5 = bmk0.f77313a;
            if ((i5 < 23 && iM189560g == 0) || (i5 >= 23 && iM189560g == 1)) {
                return schemeData3;
            }
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m10024z() {
        return "ASUS_Z00AD".equals(bmk0.f77316d);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: a */
    public Map<String, String> mo9995a(byte[] bArr) {
        return this.f7514b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: b */
    public InterfaceC1882g.d mo9996b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f7514b.getProvisionRequest();
        return new InterfaceC1882g.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: c */
    public byte[] mo9997c() throws MediaDrmException {
        return this.f7514b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: d */
    public void mo9998d(byte[] bArr, byte[] bArr2) {
        this.f7514b.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: e */
    public void mo9999e(@Nullable final InterfaceC1882g.b bVar) {
        this.f7514b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: l.d8j
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                C1883h.m10015o(this.f85602a, bVar, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    @Nullable
    /* JADX INFO: renamed from: f */
    public byte[] mo10000f(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (zr3.f205731c.equals(this.f7513a)) {
            bArr2 = q85.m175764b(bArr2);
        }
        return this.f7514b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: g */
    public void mo10007g(byte[] bArr, bf80 bf80Var) {
        if (bmk0.f77313a >= 31) {
            try {
                a.m10028b(this.f7514b, bArr, bf80Var);
            } catch (UnsupportedOperationException unused) {
                kyv.m152151i("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: h */
    public void mo10001h(byte[] bArr) throws DeniedByServerException {
        this.f7514b.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: i */
    public int mo10002i() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: k */
    public boolean mo10004k(byte[] bArr, String str) {
        if (bmk0.f77313a >= 31) {
            return a.m10027a(this.f7514b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f7513a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: l */
    public void mo10005l(byte[] bArr) {
        this.f7514b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: m */
    public InterfaceC1882g.a mo10006m(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i, @Nullable HashMap<String, String> map) throws NotProvisionedException {
        DrmInitData.SchemeData schemeDataM10023y;
        byte[] bArrM10019s;
        String strM10020t;
        if (list != null) {
            schemeDataM10023y = m10023y(this.f7513a, list);
            bArrM10019s = m10019s(this.f7513a, (byte[]) w11.m204369e(schemeDataM10023y.data));
            strM10020t = m10020t(this.f7513a, schemeDataM10023y.mimeType);
        } else {
            schemeDataM10023y = null;
            bArrM10019s = null;
            strM10020t = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f7514b.getKeyRequest(bArr, bArrM10019s, strM10020t, i, map);
        byte[] bArrM10018r = m10018r(this.f7513a, keyRequest.getData());
        String strM10017q = m10017q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strM10017q) && schemeDataM10023y != null && !TextUtils.isEmpty(schemeDataM10023y.licenseServerUrl)) {
            strM10017q = schemeDataM10023y.licenseServerUrl;
        }
        return new InterfaceC1882g.a(bArrM10018r, strM10017q, bmk0.f77313a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    public synchronized void release() {
        int i = this.f7515c - 1;
        this.f7515c = i;
        if (i == 0) {
            this.f7514b.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1882g
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public b8j mo10003j(byte[] bArr) throws MediaCryptoException {
        return new b8j(m10021u(this.f7513a), bArr, bmk0.f77313a < 21 && zr3.f205732d.equals(this.f7513a) && "L3".equals(m10026x("securityLevel")));
    }

    /* JADX INFO: renamed from: x */
    public String m10026x(String str) {
        return this.f7514b.getPropertyString(str);
    }
}
