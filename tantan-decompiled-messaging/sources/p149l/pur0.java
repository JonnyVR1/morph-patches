package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.C2200n;
import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2248t;
import com.google.android.gms.internal.ads.zzawc;
import com.meituan.robust.Constants;
import com.p046p1.mobile.putong.data.ResourceDirection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class pur0 implements oaw0 {

    /* JADX INFO: renamed from: a */
    public final r8w0 f151342a;

    /* JADX INFO: renamed from: b */
    public final m9w0 f151343b;

    /* JADX INFO: renamed from: c */
    public final ViewOnAttachStateChangeListenerC2248t f151344c;

    /* JADX INFO: renamed from: d */
    public final zzawc f151345d;

    /* JADX INFO: renamed from: e */
    public final str0 f151346e;

    /* JADX INFO: renamed from: f */
    public final dvr0 f151347f;

    /* JADX INFO: renamed from: g */
    public final wur0 f151348g;

    /* JADX INFO: renamed from: h */
    public final our0 f151349h;

    public pur0(@NonNull r8w0 r8w0Var, @NonNull m9w0 m9w0Var, @NonNull ViewOnAttachStateChangeListenerC2248t viewOnAttachStateChangeListenerC2248t, @NonNull zzawc zzawcVar, @Nullable str0 str0Var, @Nullable dvr0 dvr0Var, @Nullable wur0 wur0Var, @Nullable our0 our0Var) {
        this.f151342a = r8w0Var;
        this.f151343b = m9w0Var;
        this.f151344c = viewOnAttachStateChangeListenerC2248t;
        this.f151345d = zzawcVar;
        this.f151346e = str0Var;
        this.f151347f = dvr0Var;
        this.f151348g = wur0Var;
        this.f151349h = our0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m171476a(View view) {
        this.f151344c.m13311d(view);
    }

    /* JADX INFO: renamed from: b */
    public final Map m171477b() {
        HashMap map = new HashMap();
        r8w0 r8w0Var = this.f151342a;
        C2200n c2200nM153623b = this.f151343b.m153623b();
        map.put(ResourceDirection.f38808v, r8w0Var.mo178287b());
        map.put("gms", Boolean.valueOf(this.f151342a.mo178288c()));
        map.put(Constants.INT, c2200nM153623b.m12996K0());
        map.put("up", Boolean.valueOf(this.f151345d.zza()));
        map.put(com.clevertap.android.sdk.Constants.KEY_T, new Throwable());
        wur0 wur0Var = this.f151348g;
        if (wur0Var != null) {
            map.put("tcq", Long.valueOf(wur0Var.m205672c()));
            map.put("tpq", Long.valueOf(this.f151348g.m205676g()));
            map.put("tcv", Long.valueOf(this.f151348g.m205673d()));
            map.put("tpv", Long.valueOf(this.f151348g.m205677h()));
            map.put("tchv", Long.valueOf(this.f151348g.m205671b()));
            map.put("tphv", Long.valueOf(this.f151348g.m205675f()));
            map.put("tcc", Long.valueOf(this.f151348g.m205670a()));
            map.put("tpc", Long.valueOf(this.f151348g.m205674e()));
        }
        return map;
    }

    @Override // p149l.oaw0
    public final Map zza() {
        ViewOnAttachStateChangeListenerC2248t viewOnAttachStateChangeListenerC2248t = this.f151344c;
        Map mapM171477b = m171477b();
        mapM171477b.put("lts", Long.valueOf(viewOnAttachStateChangeListenerC2248t.m13309a()));
        return mapM171477b;
    }

    @Override // p149l.oaw0
    public final Map zzb() {
        Map mapM171477b = m171477b();
        C2200n c2200nM153622a = this.f151343b.m153622a();
        mapM171477b.put("gai", Boolean.valueOf(this.f151342a.mo178289d()));
        mapM171477b.put("did", c2200nM153622a.m12995J0());
        mapM171477b.put("dst", Integer.valueOf(c2200nM153622a.m13000x0() - 1));
        mapM171477b.put("doo", Boolean.valueOf(c2200nM153622a.m12997u0()));
        str0 str0Var = this.f151346e;
        if (str0Var != null) {
            mapM171477b.put(com.clevertap.android.sdk.Constants.NOTIF_TITLE, Long.valueOf(str0Var.m185970a()));
        }
        dvr0 dvr0Var = this.f151347f;
        if (dvr0Var != null) {
            mapM171477b.put("vs", Long.valueOf(dvr0Var.m113816c()));
            mapM171477b.put("vf", Long.valueOf(this.f151347f.m113815b()));
        }
        return mapM171477b;
    }

    @Override // p149l.oaw0
    public final Map zzc() {
        our0 our0Var = this.f151349h;
        Map mapM171477b = m171477b();
        if (our0Var != null) {
            mapM171477b.put("vst", our0Var.m166128a());
        }
        return mapM171477b;
    }
}
