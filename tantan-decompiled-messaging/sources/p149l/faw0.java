package p149l;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.C2240s;
import com.google.android.gms.internal.ads.zzfso;
import com.google.android.gms.internal.ads.zzgyl;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.tencent.open.SocialConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class faw0 implements s8w0 {

    /* JADX INFO: renamed from: a */
    public final Object f96666a;

    /* JADX INFO: renamed from: b */
    public final gaw0 f96667b;

    /* JADX INFO: renamed from: c */
    public final oaw0 f96668c;

    /* JADX INFO: renamed from: d */
    public final p8w0 f96669d;

    public faw0(@NonNull Object obj, @NonNull gaw0 gaw0Var, @NonNull oaw0 oaw0Var, @NonNull p8w0 p8w0Var) {
        this.f96666a = obj;
        this.f96667b = gaw0Var;
        this.f96668c = oaw0Var;
        this.f96669d = p8w0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static String m120308i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        frr0 frr0VarM13246L = C2240s.m13246L();
        frr0VarM13246L.m122898s(5);
        frr0VarM13246L.m122896q(zzgyl.zzv(bArr, 0, bArr.length));
        return Base64.encodeToString(((C2240s) frr0VarM13246L.m153521m()).m12744h(), 11);
    }

    @Override // p149l.s8w0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final synchronized String mo120309a(Context context, String str) {
        Map mapZzb;
        mapZzb = this.f96668c.zzb();
        mapZzb.put("f", "q");
        mapZzb.put("ctx", context);
        mapZzb.put("aid", null);
        return m120308i(m120317j(null, mapZzb));
    }

    @Override // p149l.s8w0
    /* JADX INFO: renamed from: b */
    public final synchronized void mo120310b(String str, MotionEvent motionEvent) throws zzfso {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put(Constants.KEY_T, new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.f96666a.getClass().getDeclaredMethod("he", Map.class).invoke(this.f96666a, map);
            this.f96669d.m167828d(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfso(2005, e);
        }
    }

    @Override // p149l.s8w0
    @Nullable
    /* JADX INFO: renamed from: c */
    public final synchronized String mo120311c(Context context, String str, View view, Activity activity) {
        Map mapZzc;
        mapZzc = this.f96668c.zzc();
        mapZzc.put("f", ResourceDirection.f38808v);
        mapZzc.put("ctx", context);
        mapZzc.put("aid", null);
        mapZzc.put(OMSTemplateModeType.view, view);
        mapZzc.put(SocialConstants.PARAM_ACT, activity);
        return m120308i(m120317j(null, mapZzc));
    }

    @Override // p149l.s8w0
    @Nullable
    /* JADX INFO: renamed from: d */
    public final synchronized String mo120312d(Context context, String str, String str2, View view, Activity activity) {
        Map mapZza;
        mapZza = this.f96668c.zza();
        mapZza.put("f", "c");
        mapZza.put("ctx", context);
        mapZza.put("cs", str2);
        mapZza.put("aid", null);
        mapZza.put(OMSTemplateModeType.view, view);
        mapZza.put(SocialConstants.PARAM_ACT, activity);
        return m120308i(m120317j(null, mapZza));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized int m120313e() throws zzfso {
        try {
        } catch (Exception e) {
            throw new zzfso(2006, e);
        }
        return ((Integer) this.f96666a.getClass().getDeclaredMethod("lcs", null).invoke(this.f96666a, null)).intValue();
    }

    /* JADX INFO: renamed from: f */
    public final gaw0 m120314f() {
        return this.f96667b;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m120315g() throws zzfso {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f96666a.getClass().getDeclaredMethod("close", null).invoke(this.f96666a, null);
            this.f96669d.m167828d(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfso(2003, e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized boolean m120316h() throws zzfso {
        try {
        } catch (Exception e) {
            throw new zzfso(2001, e);
        }
        return ((Boolean) this.f96666a.getClass().getDeclaredMethod("init", null).invoke(this.f96666a, null)).booleanValue();
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final synchronized byte[] m120317j(Map map, Map map2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.f96669d.m167827c(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) this.f96666a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f96666a, null, map2);
    }
}
