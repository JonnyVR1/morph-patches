package p153l;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.C2263s;
import com.google.android.gms.internal.ads.zzfso;
import com.google.android.gms.internal.ads.zzgyl;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.tencent.open.SocialConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ljw0 implements yhw0 {

    /* JADX INFO: renamed from: a */
    public final Object f132416a;

    /* JADX INFO: renamed from: b */
    public final mjw0 f132417b;

    /* JADX INFO: renamed from: c */
    public final ujw0 f132418c;

    /* JADX INFO: renamed from: d */
    public final vhw0 f132419d;

    public ljw0(@NonNull Object obj, @NonNull mjw0 mjw0Var, @NonNull ujw0 ujw0Var, @NonNull vhw0 vhw0Var) {
        this.f132416a = obj;
        this.f132417b = mjw0Var;
        this.f132418c = ujw0Var;
        this.f132419d = vhw0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static String m154582i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        l0s0 l0s0VarM13300L = C2263s.m13300L();
        l0s0VarM13300L.m152375s(5);
        l0s0VarM13300L.m152373q(zzgyl.zzv(bArr, 0, bArr.length));
        return Base64.encodeToString(((C2263s) l0s0VarM13300L.m185950m()).m12798h(), 11);
    }

    @Override // p153l.yhw0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final synchronized String mo154583a(Context context, String str) {
        Map mapZzb;
        mapZzb = this.f132418c.zzb();
        mapZzb.put("f", "q");
        mapZzb.put("ctx", context);
        mapZzb.put("aid", null);
        return m154582i(m154591j(null, mapZzb));
    }

    @Override // p153l.yhw0
    /* JADX INFO: renamed from: b */
    public final synchronized void mo154584b(String str, MotionEvent motionEvent) throws zzfso {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put(Constants.KEY_T, new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.f132416a.getClass().getDeclaredMethod("he", Map.class).invoke(this.f132416a, map);
            this.f132419d.m201303d(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfso(2005, e);
        }
    }

    @Override // p153l.yhw0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final synchronized String mo154585c(Context context, String str, View view, Activity activity) {
        Map mapZzc;
        mapZzc = this.f132418c.zzc();
        mapZzc.put("f", ResourceDirection.f39656v);
        mapZzc.put("ctx", context);
        mapZzc.put("aid", null);
        mapZzc.put(OMSTemplateModeType.view, view);
        mapZzc.put(SocialConstants.PARAM_ACT, activity);
        return m154582i(m154591j(null, mapZzc));
    }

    @Override // p153l.yhw0
    @Nullable
    /* JADX INFO: renamed from: d */
    public final synchronized String mo154586d(Context context, String str, String str2, View view, Activity activity) {
        Map mapZza;
        mapZza = this.f132418c.zza();
        mapZza.put("f", "c");
        mapZza.put("ctx", context);
        mapZza.put("cs", str2);
        mapZza.put("aid", null);
        mapZza.put(OMSTemplateModeType.view, view);
        mapZza.put(SocialConstants.PARAM_ACT, activity);
        return m154582i(m154591j(null, mapZza));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized int m154587e() throws zzfso {
        try {
        } catch (Exception e) {
            throw new zzfso(2006, e);
        }
        return ((Integer) this.f132416a.getClass().getDeclaredMethod("lcs", null).invoke(this.f132416a, null)).intValue();
    }

    /* JADX INFO: renamed from: f */
    public final mjw0 m154588f() {
        return this.f132417b;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m154589g() throws zzfso {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f132416a.getClass().getDeclaredMethod("close", null).invoke(this.f132416a, null);
            this.f132419d.m201303d(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfso(2003, e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized boolean m154590h() throws zzfso {
        try {
        } catch (Exception e) {
            throw new zzfso(2001, e);
        }
        return ((Boolean) this.f132416a.getClass().getDeclaredMethod("init", null).invoke(this.f132416a, null)).booleanValue();
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final synchronized byte[] m154591j(Map map, Map map2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.f132419d.m201302c(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) this.f132416a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f132416a, null, map2);
    }
}
