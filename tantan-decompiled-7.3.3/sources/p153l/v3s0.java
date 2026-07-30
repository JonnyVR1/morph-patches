package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.C2223n;
import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2271t;
import com.google.android.gms.internal.ads.zzawc;
import com.meituan.robust.Constants;
import com.p051p1.mobile.putong.data.ResourceDirection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class v3s0 implements ujw0 {

    /* JADX INFO: renamed from: a */
    public final xhw0 f182287a;

    /* JADX INFO: renamed from: b */
    public final siw0 f182288b;

    /* JADX INFO: renamed from: c */
    public final ViewOnAttachStateChangeListenerC2271t f182289c;

    /* JADX INFO: renamed from: d */
    public final zzawc f182290d;

    /* JADX INFO: renamed from: e */
    public final y2s0 f182291e;

    /* JADX INFO: renamed from: f */
    public final j4s0 f182292f;

    /* JADX INFO: renamed from: g */
    public final c4s0 f182293g;

    /* JADX INFO: renamed from: h */
    public final u3s0 f182294h;

    public v3s0(@NonNull xhw0 xhw0Var, @NonNull siw0 siw0Var, @NonNull ViewOnAttachStateChangeListenerC2271t viewOnAttachStateChangeListenerC2271t, @NonNull zzawc zzawcVar, @Nullable y2s0 y2s0Var, @Nullable j4s0 j4s0Var, @Nullable c4s0 c4s0Var, @Nullable u3s0 u3s0Var) {
        this.f182287a = xhw0Var;
        this.f182288b = siw0Var;
        this.f182289c = viewOnAttachStateChangeListenerC2271t;
        this.f182290d = zzawcVar;
        this.f182291e = y2s0Var;
        this.f182292f = j4s0Var;
        this.f182293g = c4s0Var;
        this.f182294h = u3s0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m199627a(View view) {
        this.f182289c.m13365d(view);
    }

    /* JADX INFO: renamed from: b */
    public final Map m199628b() {
        HashMap map = new HashMap();
        xhw0 xhw0Var = this.f182287a;
        C2223n c2223nM186043b = this.f182288b.m186043b();
        map.put(ResourceDirection.f39656v, xhw0Var.mo104576b());
        map.put("gms", Boolean.valueOf(this.f182287a.mo104577c()));
        map.put(Constants.INT, c2223nM186043b.m13050K0());
        map.put("up", Boolean.valueOf(this.f182290d.zza()));
        map.put(com.clevertap.android.sdk.Constants.KEY_T, new Throwable());
        c4s0 c4s0Var = this.f182293g;
        if (c4s0Var != null) {
            map.put("tcq", Long.valueOf(c4s0Var.m107962c()));
            map.put("tpq", Long.valueOf(this.f182293g.m107966g()));
            map.put("tcv", Long.valueOf(this.f182293g.m107963d()));
            map.put("tpv", Long.valueOf(this.f182293g.m107967h()));
            map.put("tchv", Long.valueOf(this.f182293g.m107961b()));
            map.put("tphv", Long.valueOf(this.f182293g.m107965f()));
            map.put("tcc", Long.valueOf(this.f182293g.m107960a()));
            map.put("tpc", Long.valueOf(this.f182293g.m107964e()));
        }
        return map;
    }

    @Override // p153l.ujw0
    public final Map zza() {
        ViewOnAttachStateChangeListenerC2271t viewOnAttachStateChangeListenerC2271t = this.f182289c;
        Map mapM199628b = m199628b();
        mapM199628b.put("lts", Long.valueOf(viewOnAttachStateChangeListenerC2271t.m13363a()));
        return mapM199628b;
    }

    @Override // p153l.ujw0
    public final Map zzb() {
        Map mapM199628b = m199628b();
        C2223n c2223nM186042a = this.f182288b.m186042a();
        mapM199628b.put("gai", Boolean.valueOf(this.f182287a.mo104578d()));
        mapM199628b.put("did", c2223nM186042a.m13049J0());
        mapM199628b.put("dst", Integer.valueOf(c2223nM186042a.m13054x0() - 1));
        mapM199628b.put("doo", Boolean.valueOf(c2223nM186042a.m13051u0()));
        y2s0 y2s0Var = this.f182291e;
        if (y2s0Var != null) {
            mapM199628b.put(com.clevertap.android.sdk.Constants.NOTIF_TITLE, Long.valueOf(y2s0Var.m214102a()));
        }
        j4s0 j4s0Var = this.f182292f;
        if (j4s0Var != null) {
            mapM199628b.put("vs", Long.valueOf(j4s0Var.m143453c()));
            mapM199628b.put("vf", Long.valueOf(this.f182292f.m143452b()));
        }
        return mapM199628b;
    }

    @Override // p153l.ujw0
    public final Map zzc() {
        u3s0 u3s0Var = this.f182294h;
        Map mapM199628b = m199628b();
        if (u3s0Var != null) {
            mapM199628b.put("vst", u3s0Var.m194419a());
        }
        return mapM199628b;
    }
}
