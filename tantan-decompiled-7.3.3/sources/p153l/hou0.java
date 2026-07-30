package p153l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcei;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class hou0 implements cmu0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final rxs0 f110950a;

    /* JADX INFO: renamed from: b */
    public final h7u0 f110951b;

    /* JADX INFO: renamed from: c */
    public final g6u0 f110952c;

    /* JADX INFO: renamed from: d */
    public final egu0 f110953d;

    /* JADX INFO: renamed from: e */
    public final Context f110954e;

    /* JADX INFO: renamed from: f */
    public final q6w0 f110955f;

    /* JADX INFO: renamed from: g */
    public final zzcei f110956g;

    /* JADX INFO: renamed from: h */
    public final o7w0 f110957h;

    /* JADX INFO: renamed from: i */
    public boolean f110958i = false;

    /* JADX INFO: renamed from: j */
    public boolean f110959j = false;

    /* JADX INFO: renamed from: k */
    public boolean f110960k = true;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final nxs0 f110961l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public final oxs0 f110962m;

    public hou0(@Nullable nxs0 nxs0Var, @Nullable oxs0 oxs0Var, @Nullable rxs0 rxs0Var, h7u0 h7u0Var, g6u0 g6u0Var, egu0 egu0Var, Context context, q6w0 q6w0Var, zzcei zzceiVar, o7w0 o7w0Var) {
        this.f110961l = nxs0Var;
        this.f110962m = oxs0Var;
        this.f110950a = rxs0Var;
        this.f110951b = h7u0Var;
        this.f110952c = g6u0Var;
        this.f110953d = egu0Var;
        this.f110954e = context;
        this.f110955f = q6w0Var;
        this.f110956g = zzceiVar;
        this.f110957h = o7w0Var;
    }

    /* JADX INFO: renamed from: r */
    public static final HashMap m136461r(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map2;
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: J */
    public final boolean mo111316J() {
        return this.f110955f.f155859M;
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: a */
    public final void mo111317a(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z, @Nullable ImageView.ScaleType scaleType) {
        if (this.f110959j && this.f110955f.f155859M) {
            return;
        }
        m136462q(view);
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: b */
    public final void mo111318b() {
        this.f110959j = true;
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: c */
    public final void mo111319c(@Nullable czt0 czt0Var) {
        dct0.m115298g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: d */
    public final boolean mo111320d(Bundle bundle) {
        return false;
    }

    @Override // p153l.cmu0
    @Nullable
    /* JADX INFO: renamed from: e */
    public final JSONObject mo111321e(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: f */
    public final void mo111322f(View view, View view2, Map map, Map map2, boolean z, @Nullable ImageView.ScaleType scaleType, int i) {
        if (!this.f110959j) {
            dct0.m115298g("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f110955f.f155859M) {
            m136462q(view2);
        } else {
            dct0.m115298g("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // p153l.cmu0
    @Nullable
    /* JADX INFO: renamed from: g */
    public final JSONObject mo111323g(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: i */
    public final void mo111325i(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        try {
            if (!this.f110958i) {
                this.f110958i = bxy0.m106937u().m114545n(this.f110954e, this.f110956g.zza, this.f110955f.f155850D.toString(), this.f110957h.f145320f);
            }
            if (this.f110960k) {
                rxs0 rxs0Var = this.f110950a;
                if (rxs0Var != null && !rxs0Var.mo174239J()) {
                    this.f110950a.mo174242g();
                    this.f110951b.zza();
                    return;
                }
                nxs0 nxs0Var = this.f110961l;
                if (nxs0Var != null && !nxs0Var.m165282t8()) {
                    this.f110961l.zzt();
                    this.f110951b.zza();
                    return;
                }
                oxs0 oxs0Var = this.f110962m;
                if (oxs0Var == null || oxs0Var.m169736t8()) {
                    return;
                }
                this.f110962m.zzr();
                this.f110951b.zza();
            }
        } catch (RemoteException e) {
            dct0.m115299h("Failed to call recordImpression", e);
        }
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: k */
    public final void mo111327k(View view, @Nullable Map map) {
        try {
            p1m p1mVarM134038Y2 = h950.m134038Y2(view);
            rxs0 rxs0Var = this.f110950a;
            if (rxs0Var != null) {
                rxs0Var.mo174246y7(p1mVarM134038Y2);
                return;
            }
            nxs0 nxs0Var = this.f110961l;
            if (nxs0Var != null) {
                nxs0Var.m165273k7(p1mVarM134038Y2);
                return;
            }
            oxs0 oxs0Var = this.f110962m;
            if (oxs0Var != null) {
                oxs0Var.m169735s8(p1mVarM134038Y2);
            }
        } catch (RemoteException e) {
            dct0.m115299h("Failed to call untrackView", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cc A[Catch: JSONException -> 0x0044, RemoteException -> 0x0122, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0044, blocks: (B:47:0x00b1, B:48:0x00c6, B:50:0x00cc), top: B:70:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00c6 A[SYNTHETIC] */
    @Override // p153l.cmu0
    /* JADX INFO: renamed from: m */
    public final void mo111329m(View view, @Nullable Map map, @Nullable Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        ClassLoader classLoader;
        Iterator it;
        p1m p1mVarZzn;
        try {
            p1m p1mVarM134038Y2 = h950.m134038Y2(view);
            JSONObject jSONObject = this.f110955f.f155894k0;
            boolean z = true;
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168523x1)).booleanValue() && jSONObject.length() != 0) {
                Map map3 = map == null ? new HashMap() : map;
                Map map4 = map2 == null ? new HashMap() : map2;
                HashMap map5 = new HashMap();
                map5.putAll(map3);
                map5.putAll(map4);
                Iterator<String> itKeys = jSONObject.keys();
                loop0: while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        WeakReference weakReference = (WeakReference) map5.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168535y1)).booleanValue() && next.equals("3010")) {
                                rxs0 rxs0Var = this.f110950a;
                                Object objM134037P2 = null;
                                if (rxs0Var != null) {
                                    try {
                                        p1mVarZzn = rxs0Var.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    nxs0 nxs0Var = this.f110961l;
                                    if (nxs0Var != null) {
                                        p1mVarZzn = nxs0Var.m165276n8();
                                    } else {
                                        oxs0 oxs0Var = this.f110962m;
                                        p1mVarZzn = oxs0Var != null ? oxs0Var.m169727g7() : null;
                                    }
                                }
                                if (p1mVarZzn != null) {
                                    objM134037P2 = h950.m134037P2(p1mVarZzn);
                                }
                                if (objM134037P2 != null) {
                                    cls = objM134037P2.getClass();
                                    ArrayList arrayList = new ArrayList();
                                    v0t0.m198931c(jSONArrayOptJSONArray, arrayList);
                                    bxy0.m106934r();
                                    classLoader = this.f110954e.getClassLoader();
                                    it = arrayList.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    v0t0.m198931c(jSONArrayOptJSONArray, arrayList2);
                                    bxy0.m106934r();
                                    classLoader = this.f110954e.getClassLoader();
                                    it = arrayList2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                            }
                                        }
                                    }
                                } catch (JSONException unused2) {
                                    continue;
                                }
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.f110960k = z;
            HashMap mapM136461r = m136461r(map);
            HashMap mapM136461r2 = m136461r(map2);
            rxs0 rxs0Var2 = this.f110950a;
            if (rxs0Var2 != null) {
                rxs0Var2.mo174244o1(p1mVarM134038Y2, h950.m134038Y2(mapM136461r), h950.m134038Y2(mapM136461r2));
                return;
            }
            nxs0 nxs0Var2 = this.f110961l;
            if (nxs0Var2 != null) {
                nxs0Var2.m165280r8(p1mVarM134038Y2, h950.m134038Y2(mapM136461r), h950.m134038Y2(mapM136461r2));
                this.f110961l.m165279q8(p1mVarM134038Y2);
                return;
            }
            oxs0 oxs0Var2 = this.f110962m;
            if (oxs0Var2 != null) {
                oxs0Var2.m169734r8(p1mVarM134038Y2, h950.m134038Y2(mapM136461r), h950.m134038Y2(mapM136461r2));
                this.f110962m.m169733q8(p1mVarM134038Y2);
            }
        } catch (RemoteException e) {
            dct0.m115299h("Failed to call trackView", e);
        }
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: p */
    public final void mo111332p(ytt0 ytt0Var) {
        dct0.m115298g("Mute This Ad is not supported for 3rd party ads");
    }

    /* JADX INFO: renamed from: q */
    public final void m136462q(View view) {
        try {
            rxs0 rxs0Var = this.f110950a;
            if (rxs0Var != null && !rxs0Var.mo174245t()) {
                this.f110950a.mo174243k7(h950.m134038Y2(view));
                this.f110952c.onAdClicked();
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168394ma)).booleanValue()) {
                    this.f110953d.zzs();
                    return;
                }
                return;
            }
            nxs0 nxs0Var = this.f110961l;
            if (nxs0Var != null && !nxs0Var.m165281s8()) {
                this.f110961l.m165278p8(h950.m134038Y2(view));
                this.f110952c.onAdClicked();
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168394ma)).booleanValue()) {
                    this.f110953d.zzs();
                    return;
                }
                return;
            }
            oxs0 oxs0Var = this.f110962m;
            if (oxs0Var == null || oxs0Var.m169726b()) {
                return;
            }
            this.f110962m.m169732p8(h950.m134038Y2(view));
            this.f110952c.onAdClicked();
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168394ma)).booleanValue()) {
                this.f110953d.zzs();
            }
        } catch (RemoteException e) {
            dct0.m115299h("Failed to call handleClick", e);
        }
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: t */
    public final boolean mo111333t() {
        return true;
    }

    @Override // p153l.cmu0
    public final int zza() {
        return 0;
    }

    @Override // p153l.cmu0
    public final void zzg() {
        throw null;
    }

    @Override // p153l.cmu0
    public final void zzh() {
    }

    @Override // p153l.cmu0
    public final void zzi() {
    }

    @Override // p153l.cmu0
    public final void zzp() {
    }

    @Override // p153l.cmu0
    public final void zzr() {
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: j */
    public final void mo111326j(Bundle bundle) {
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: l */
    public final void mo111328l(View view) {
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: n */
    public final void mo111330n(Bundle bundle) {
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: o */
    public final void mo111331o(kns0 kns0Var) {
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: u */
    public final void mo111334u(String str) {
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: h */
    public final void mo111324h(View view, MotionEvent motionEvent, @Nullable View view2) {
    }
}
