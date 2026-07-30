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

/* JADX INFO: loaded from: classes.dex */
public class ulw {

    /* JADX INFO: renamed from: A */
    public int f177102A;

    /* JADX INFO: renamed from: B */
    public int f177103B;

    /* JADX INFO: renamed from: C */
    public int f177104C;

    /* JADX INFO: renamed from: J */
    public float f177111J;

    /* JADX INFO: renamed from: L */
    public int f177113L;

    /* JADX INFO: renamed from: U */
    public int f177122U;

    /* JADX INFO: renamed from: c */
    public int f177132c;

    /* JADX INFO: renamed from: d */
    public boolean f177134d;

    /* JADX INFO: renamed from: e */
    public int f177136e;

    /* JADX INFO: renamed from: f */
    public int f177138f;

    /* JADX INFO: renamed from: k */
    public int f177148k;

    /* JADX INFO: renamed from: l */
    public int f177150l;

    /* JADX INFO: renamed from: u */
    public int f177168u;

    /* JADX INFO: renamed from: v */
    public int f177169v;

    /* JADX INFO: renamed from: w */
    public int f177170w;

    /* JADX INFO: renamed from: x */
    public int f177171x;

    /* JADX INFO: renamed from: z */
    public int f177173z;

    /* JADX INFO: renamed from: g */
    public int f177140g = -1;

    /* JADX INFO: renamed from: h */
    public int f177142h = -1;

    /* JADX INFO: renamed from: i */
    public int f177144i = -1;

    /* JADX INFO: renamed from: j */
    public int f177146j = -1;

    /* JADX INFO: renamed from: y */
    public int f177172y = 0;

    /* JADX INFO: renamed from: t0 */
    public boolean f177167t0 = false;

    /* JADX INFO: renamed from: a */
    public boolean f177128a = false;

    /* JADX INFO: renamed from: b */
    public boolean f177130b = false;

    /* JADX INFO: renamed from: s */
    public int f177164s = 640;

    /* JADX INFO: renamed from: t */
    public int f177166t = 480;

    /* JADX INFO: renamed from: m */
    public int f177152m = 352;

    /* JADX INFO: renamed from: n */
    public int f177154n = 640;

    /* JADX INFO: renamed from: o */
    public int f177156o = 160;

    /* JADX INFO: renamed from: p */
    public int f177158p = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256;

    /* JADX INFO: renamed from: q */
    public boolean f177160q = false;

    /* JADX INFO: renamed from: D */
    public int f177105D = 0;

    /* JADX INFO: renamed from: E */
    public int f177106E = 0;

    /* JADX INFO: renamed from: F */
    public int f177107F = 20;

    /* JADX INFO: renamed from: G */
    public int f177108G = 1;

    /* JADX INFO: renamed from: H */
    public int f177109H = PlaybackException.CUSTOM_ERROR_CODE_BASE;

    /* JADX INFO: renamed from: I */
    public int f177110I = ShareConstants.MD5_FILE_BUF_LENGTH;

    /* JADX INFO: renamed from: S */
    public int f177120S = 128000;

    /* JADX INFO: renamed from: K */
    public int f177112K = -1;

    /* JADX INFO: renamed from: T */
    public int f177121T = 30000;

    /* JADX INFO: renamed from: N */
    public int f177115N = -1;

    /* JADX INFO: renamed from: O */
    public int f177116O = -1;

    /* JADX INFO: renamed from: P */
    public int f177117P = 44100;

    /* JADX INFO: renamed from: Q */
    public int f177118Q = 1024;

    /* JADX INFO: renamed from: R */
    public int f177119R = 1;

    /* JADX INFO: renamed from: M */
    public int f177114M = 5;

    /* JADX INFO: renamed from: V */
    public int f177123V = 20;

    /* JADX INFO: renamed from: W */
    public int f177124W = 2;

    /* JADX INFO: renamed from: X */
    public int f177125X = 0;

    /* JADX INFO: renamed from: Y */
    public float f177126Y = 1.7777778f;

    /* JADX INFO: renamed from: Z */
    public boolean f177127Z = false;

    /* JADX INFO: renamed from: a0 */
    public boolean f177129a0 = false;

    /* JADX INFO: renamed from: b0 */
    public boolean f177131b0 = false;

    /* JADX INFO: renamed from: c0 */
    public boolean f177133c0 = false;

    /* JADX INFO: renamed from: d0 */
    public boolean f177135d0 = false;

    /* JADX INFO: renamed from: e0 */
    public float f177137e0 = 1.0f;

    /* JADX INFO: renamed from: f0 */
    public int f177139f0 = 23;

    /* JADX INFO: renamed from: g0 */
    public boolean f177141g0 = false;

    /* JADX INFO: renamed from: i0 */
    public boolean f177145i0 = false;

    /* JADX INFO: renamed from: j0 */
    public boolean f177147j0 = false;

    /* JADX INFO: renamed from: k0 */
    public List<int[]> f177149k0 = new ArrayList();

    /* JADX INFO: renamed from: o0 */
    public List<Camera.Size> f177157o0 = new ArrayList();

    /* JADX INFO: renamed from: l0 */
    public boolean f177151l0 = false;

    /* JADX INFO: renamed from: m0 */
    public int f177153m0 = 0;

    /* JADX INFO: renamed from: n0 */
    public boolean f177155n0 = false;

    /* JADX INFO: renamed from: p0 */
    public int f177159p0 = 0;

    /* JADX INFO: renamed from: s0 */
    public boolean f177165s0 = false;

    /* JADX INFO: renamed from: q0 */
    public boolean f177161q0 = false;

    /* JADX INFO: renamed from: r0 */
    public boolean f177163r0 = false;

    /* JADX INFO: renamed from: h0 */
    public boolean f177143h0 = true;

    /* JADX INFO: renamed from: r */
    public boolean f177162r = false;

    /* JADX INFO: renamed from: a */
    public void m194271a() {
        MDLog.m7395i(MDLogTag.MOMENT_CAMERA_TAG, toString());
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
