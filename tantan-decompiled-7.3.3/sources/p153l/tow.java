package p153l;

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

/* JADX INFO: loaded from: classes.dex */
public class tow {

    /* JADX INFO: renamed from: A */
    public int f175444A;

    /* JADX INFO: renamed from: B */
    public int f175445B;

    /* JADX INFO: renamed from: C */
    public int f175446C;

    /* JADX INFO: renamed from: J */
    public float f175453J;

    /* JADX INFO: renamed from: L */
    public int f175455L;

    /* JADX INFO: renamed from: U */
    public int f175464U;

    /* JADX INFO: renamed from: c */
    public int f175474c;

    /* JADX INFO: renamed from: d */
    public boolean f175476d;

    /* JADX INFO: renamed from: e */
    public int f175478e;

    /* JADX INFO: renamed from: f */
    public int f175480f;

    /* JADX INFO: renamed from: k */
    public int f175490k;

    /* JADX INFO: renamed from: l */
    public int f175492l;

    /* JADX INFO: renamed from: u */
    public int f175510u;

    /* JADX INFO: renamed from: v */
    public int f175511v;

    /* JADX INFO: renamed from: w */
    public int f175512w;

    /* JADX INFO: renamed from: x */
    public int f175513x;

    /* JADX INFO: renamed from: z */
    public int f175515z;

    /* JADX INFO: renamed from: g */
    public int f175482g = -1;

    /* JADX INFO: renamed from: h */
    public int f175484h = -1;

    /* JADX INFO: renamed from: i */
    public int f175486i = -1;

    /* JADX INFO: renamed from: j */
    public int f175488j = -1;

    /* JADX INFO: renamed from: y */
    public int f175514y = 0;

    /* JADX INFO: renamed from: t0 */
    public boolean f175509t0 = false;

    /* JADX INFO: renamed from: a */
    public boolean f175470a = false;

    /* JADX INFO: renamed from: b */
    public boolean f175472b = false;

    /* JADX INFO: renamed from: s */
    public int f175506s = 640;

    /* JADX INFO: renamed from: t */
    public int f175508t = 480;

    /* JADX INFO: renamed from: m */
    public int f175494m = 352;

    /* JADX INFO: renamed from: n */
    public int f175496n = 640;

    /* JADX INFO: renamed from: o */
    public int f175498o = 160;

    /* JADX INFO: renamed from: p */
    public int f175500p = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256;

    /* JADX INFO: renamed from: q */
    public boolean f175502q = false;

    /* JADX INFO: renamed from: D */
    public int f175447D = 0;

    /* JADX INFO: renamed from: E */
    public int f175448E = 0;

    /* JADX INFO: renamed from: F */
    public int f175449F = 20;

    /* JADX INFO: renamed from: G */
    public int f175450G = 1;

    /* JADX INFO: renamed from: H */
    public int f175451H = PlaybackException.CUSTOM_ERROR_CODE_BASE;

    /* JADX INFO: renamed from: I */
    public int f175452I = ShareConstants.MD5_FILE_BUF_LENGTH;

    /* JADX INFO: renamed from: S */
    public int f175462S = 128000;

    /* JADX INFO: renamed from: K */
    public int f175454K = -1;

    /* JADX INFO: renamed from: T */
    public int f175463T = 30000;

    /* JADX INFO: renamed from: N */
    public int f175457N = -1;

    /* JADX INFO: renamed from: O */
    public int f175458O = -1;

    /* JADX INFO: renamed from: P */
    public int f175459P = 44100;

    /* JADX INFO: renamed from: Q */
    public int f175460Q = 1024;

    /* JADX INFO: renamed from: R */
    public int f175461R = 1;

    /* JADX INFO: renamed from: M */
    public int f175456M = 5;

    /* JADX INFO: renamed from: V */
    public int f175465V = 20;

    /* JADX INFO: renamed from: W */
    public int f175466W = 2;

    /* JADX INFO: renamed from: X */
    public int f175467X = 0;

    /* JADX INFO: renamed from: Y */
    public float f175468Y = 1.7777778f;

    /* JADX INFO: renamed from: Z */
    public boolean f175469Z = false;

    /* JADX INFO: renamed from: a0 */
    public boolean f175471a0 = false;

    /* JADX INFO: renamed from: b0 */
    public boolean f175473b0 = false;

    /* JADX INFO: renamed from: c0 */
    public boolean f175475c0 = false;

    /* JADX INFO: renamed from: d0 */
    public boolean f175477d0 = false;

    /* JADX INFO: renamed from: e0 */
    public float f175479e0 = 1.0f;

    /* JADX INFO: renamed from: f0 */
    public int f175481f0 = 23;

    /* JADX INFO: renamed from: g0 */
    public boolean f175483g0 = false;

    /* JADX INFO: renamed from: i0 */
    public boolean f175487i0 = false;

    /* JADX INFO: renamed from: j0 */
    public boolean f175489j0 = false;

    /* JADX INFO: renamed from: k0 */
    public List<int[]> f175491k0 = new ArrayList();

    /* JADX INFO: renamed from: o0 */
    public List<Camera.Size> f175499o0 = new ArrayList();

    /* JADX INFO: renamed from: l0 */
    public boolean f175493l0 = false;

    /* JADX INFO: renamed from: m0 */
    public int f175495m0 = 0;

    /* JADX INFO: renamed from: n0 */
    public boolean f175497n0 = false;

    /* JADX INFO: renamed from: p0 */
    public int f175501p0 = 0;

    /* JADX INFO: renamed from: s0 */
    public boolean f175507s0 = false;

    /* JADX INFO: renamed from: q0 */
    public boolean f175503q0 = false;

    /* JADX INFO: renamed from: r0 */
    public boolean f175505r0 = false;

    /* JADX INFO: renamed from: h0 */
    public boolean f175485h0 = true;

    /* JADX INFO: renamed from: r */
    public boolean f175504r = false;

    /* JADX INFO: renamed from: a */
    public void m192085a() {
        MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, toString());
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
