package p149l;

import android.hardware.Camera;
import com.cosmos.mdlog.MDLog;
import com.google.android.exoplayer2.PlaybackException;
import com.momo.mcamera.util.MDLogTag;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes7.dex */
public class tlw {

    /* JADX INFO: renamed from: H */
    public int f171064H;

    /* JADX INFO: renamed from: a */
    public boolean f171083a;

    /* JADX INFO: renamed from: b */
    public int f171085b;

    /* JADX INFO: renamed from: c */
    public int f171087c;

    /* JADX INFO: renamed from: h0 */
    public boolean f171098h0;

    /* JADX INFO: renamed from: o */
    public int f171105o;

    /* JADX INFO: renamed from: p */
    public int f171106p;

    /* JADX INFO: renamed from: w */
    public float f171113w;

    /* JADX INFO: renamed from: y */
    public int f171115y;

    /* JADX INFO: renamed from: d */
    public int f171089d = -1;

    /* JADX INFO: renamed from: e */
    public int f171091e = -1;

    /* JADX INFO: renamed from: f */
    public int f171093f = -1;

    /* JADX INFO: renamed from: g */
    public int f171095g = -1;

    /* JADX INFO: renamed from: g0 */
    public boolean f171096g0 = false;

    /* JADX INFO: renamed from: m */
    public int f171103m = 640;

    /* JADX INFO: renamed from: n */
    public int f171104n = 480;

    /* JADX INFO: renamed from: h */
    public int f171097h = 352;

    /* JADX INFO: renamed from: i */
    public int f171099i = 640;

    /* JADX INFO: renamed from: j */
    public int f171100j = 160;

    /* JADX INFO: renamed from: k */
    public int f171101k = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256;

    /* JADX INFO: renamed from: l */
    public boolean f171102l = false;

    /* JADX INFO: renamed from: q */
    public int f171107q = 0;

    /* JADX INFO: renamed from: r */
    public int f171108r = 0;

    /* JADX INFO: renamed from: s */
    public int f171109s = 20;

    /* JADX INFO: renamed from: t */
    public int f171110t = 1;

    /* JADX INFO: renamed from: u */
    public int f171111u = PlaybackException.CUSTOM_ERROR_CODE_BASE;

    /* JADX INFO: renamed from: v */
    public int f171112v = ShareConstants.MD5_FILE_BUF_LENGTH;

    /* JADX INFO: renamed from: F */
    public int f171062F = 128000;

    /* JADX INFO: renamed from: x */
    public int f171114x = -1;

    /* JADX INFO: renamed from: G */
    public int f171063G = 30000;

    /* JADX INFO: renamed from: A */
    public int f171057A = -1;

    /* JADX INFO: renamed from: B */
    public int f171058B = -1;

    /* JADX INFO: renamed from: C */
    public int f171059C = 44100;

    /* JADX INFO: renamed from: D */
    public int f171060D = 1024;

    /* JADX INFO: renamed from: E */
    public int f171061E = 1;

    /* JADX INFO: renamed from: z */
    public int f171116z = 5;

    /* JADX INFO: renamed from: I */
    public int f171065I = 20;

    /* JADX INFO: renamed from: J */
    public int f171066J = 2;

    /* JADX INFO: renamed from: K */
    public int f171067K = 0;

    /* JADX INFO: renamed from: L */
    public float f171068L = 1.7777778f;

    /* JADX INFO: renamed from: M */
    public boolean f171069M = false;

    /* JADX INFO: renamed from: N */
    public boolean f171070N = false;

    /* JADX INFO: renamed from: O */
    public boolean f171071O = false;

    /* JADX INFO: renamed from: P */
    public boolean f171072P = false;

    /* JADX INFO: renamed from: Q */
    public boolean f171073Q = false;

    /* JADX INFO: renamed from: R */
    public float f171074R = 1.0f;

    /* JADX INFO: renamed from: S */
    public int f171075S = 23;

    /* JADX INFO: renamed from: T */
    public boolean f171076T = false;

    /* JADX INFO: renamed from: V */
    public boolean f171078V = false;

    /* JADX INFO: renamed from: W */
    public boolean f171079W = false;

    /* JADX INFO: renamed from: X */
    public List<int[]> f171080X = new ArrayList();

    /* JADX INFO: renamed from: b0 */
    public List<Camera.Size> f171086b0 = new ArrayList();

    /* JADX INFO: renamed from: Y */
    public boolean f171081Y = false;

    /* JADX INFO: renamed from: Z */
    public int f171082Z = 0;

    /* JADX INFO: renamed from: a0 */
    public boolean f171084a0 = false;

    /* JADX INFO: renamed from: c0 */
    public int f171088c0 = 0;

    /* JADX INFO: renamed from: f0 */
    public boolean f171094f0 = false;

    /* JADX INFO: renamed from: d0 */
    public boolean f171090d0 = false;

    /* JADX INFO: renamed from: e0 */
    public boolean f171092e0 = false;

    /* JADX INFO: renamed from: U */
    public boolean f171077U = true;

    /* JADX INFO: renamed from: a */
    public void m189629a() {
        MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, toString());
    }

    /* JADX INFO: renamed from: b */
    public int m189630b() {
        return this.f171085b * this.f171087c;
    }

    /* JADX INFO: renamed from: c */
    public int m189631c() {
        return this.f171096g0 ? this.f171095g : this.f171087c;
    }

    /* JADX INFO: renamed from: d */
    public int m189632d() {
        return this.f171096g0 ? this.f171093f : this.f171085b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResParameter:");
        for (Field field : getClass().getDeclaredFields()) {
            if (!Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                try {
                    sb.append(field.getName());
                    sb.append('=');
                    sb.append(field.get(this));
                    sb.append(';');
                } catch (IllegalAccessException unused) {
                }
            }
        }
        return sb.toString();
    }
}
