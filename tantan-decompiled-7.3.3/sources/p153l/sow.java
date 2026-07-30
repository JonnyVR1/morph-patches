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

/* JADX INFO: loaded from: classes7.dex */
public class sow {

    /* JADX INFO: renamed from: H */
    public int f169934H;

    /* JADX INFO: renamed from: a */
    public boolean f169953a;

    /* JADX INFO: renamed from: b */
    public int f169955b;

    /* JADX INFO: renamed from: c */
    public int f169957c;

    /* JADX INFO: renamed from: h0 */
    public boolean f169968h0;

    /* JADX INFO: renamed from: o */
    public int f169975o;

    /* JADX INFO: renamed from: p */
    public int f169976p;

    /* JADX INFO: renamed from: w */
    public float f169983w;

    /* JADX INFO: renamed from: y */
    public int f169985y;

    /* JADX INFO: renamed from: d */
    public int f169959d = -1;

    /* JADX INFO: renamed from: e */
    public int f169961e = -1;

    /* JADX INFO: renamed from: f */
    public int f169963f = -1;

    /* JADX INFO: renamed from: g */
    public int f169965g = -1;

    /* JADX INFO: renamed from: g0 */
    public boolean f169966g0 = false;

    /* JADX INFO: renamed from: m */
    public int f169973m = 640;

    /* JADX INFO: renamed from: n */
    public int f169974n = 480;

    /* JADX INFO: renamed from: h */
    public int f169967h = 352;

    /* JADX INFO: renamed from: i */
    public int f169969i = 640;

    /* JADX INFO: renamed from: j */
    public int f169970j = 160;

    /* JADX INFO: renamed from: k */
    public int f169971k = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256;

    /* JADX INFO: renamed from: l */
    public boolean f169972l = false;

    /* JADX INFO: renamed from: q */
    public int f169977q = 0;

    /* JADX INFO: renamed from: r */
    public int f169978r = 0;

    /* JADX INFO: renamed from: s */
    public int f169979s = 20;

    /* JADX INFO: renamed from: t */
    public int f169980t = 1;

    /* JADX INFO: renamed from: u */
    public int f169981u = PlaybackException.CUSTOM_ERROR_CODE_BASE;

    /* JADX INFO: renamed from: v */
    public int f169982v = ShareConstants.MD5_FILE_BUF_LENGTH;

    /* JADX INFO: renamed from: F */
    public int f169932F = 128000;

    /* JADX INFO: renamed from: x */
    public int f169984x = -1;

    /* JADX INFO: renamed from: G */
    public int f169933G = 30000;

    /* JADX INFO: renamed from: A */
    public int f169927A = -1;

    /* JADX INFO: renamed from: B */
    public int f169928B = -1;

    /* JADX INFO: renamed from: C */
    public int f169929C = 44100;

    /* JADX INFO: renamed from: D */
    public int f169930D = 1024;

    /* JADX INFO: renamed from: E */
    public int f169931E = 1;

    /* JADX INFO: renamed from: z */
    public int f169986z = 5;

    /* JADX INFO: renamed from: I */
    public int f169935I = 20;

    /* JADX INFO: renamed from: J */
    public int f169936J = 2;

    /* JADX INFO: renamed from: K */
    public int f169937K = 0;

    /* JADX INFO: renamed from: L */
    public float f169938L = 1.7777778f;

    /* JADX INFO: renamed from: M */
    public boolean f169939M = false;

    /* JADX INFO: renamed from: N */
    public boolean f169940N = false;

    /* JADX INFO: renamed from: O */
    public boolean f169941O = false;

    /* JADX INFO: renamed from: P */
    public boolean f169942P = false;

    /* JADX INFO: renamed from: Q */
    public boolean f169943Q = false;

    /* JADX INFO: renamed from: R */
    public float f169944R = 1.0f;

    /* JADX INFO: renamed from: S */
    public int f169945S = 23;

    /* JADX INFO: renamed from: T */
    public boolean f169946T = false;

    /* JADX INFO: renamed from: V */
    public boolean f169948V = false;

    /* JADX INFO: renamed from: W */
    public boolean f169949W = false;

    /* JADX INFO: renamed from: X */
    public List<int[]> f169950X = new ArrayList();

    /* JADX INFO: renamed from: b0 */
    public List<Camera.Size> f169956b0 = new ArrayList();

    /* JADX INFO: renamed from: Y */
    public boolean f169951Y = false;

    /* JADX INFO: renamed from: Z */
    public int f169952Z = 0;

    /* JADX INFO: renamed from: a0 */
    public boolean f169954a0 = false;

    /* JADX INFO: renamed from: c0 */
    public int f169958c0 = 0;

    /* JADX INFO: renamed from: f0 */
    public boolean f169964f0 = false;

    /* JADX INFO: renamed from: d0 */
    public boolean f169960d0 = false;

    /* JADX INFO: renamed from: e0 */
    public boolean f169962e0 = false;

    /* JADX INFO: renamed from: U */
    public boolean f169947U = true;

    /* JADX INFO: renamed from: a */
    public void m187280a() {
        MDLog.m7449i(MDLogTag.MOMENT_CAMERA_TAG, toString());
    }

    /* JADX INFO: renamed from: b */
    public int m187281b() {
        return this.f169955b * this.f169957c;
    }

    /* JADX INFO: renamed from: c */
    public int m187282c() {
        return this.f169966g0 ? this.f169965g : this.f169957c;
    }

    /* JADX INFO: renamed from: d */
    public int m187283d() {
        return this.f169966g0 ? this.f169963f : this.f169955b;
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
