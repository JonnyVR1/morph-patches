package p149l;

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
public final class bfu0 implements wcu0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final los0 f75354a;

    /* JADX INFO: renamed from: b */
    public final byt0 f75355b;

    /* JADX INFO: renamed from: c */
    public final axt0 f75356c;

    /* JADX INFO: renamed from: d */
    public final y6u0 f75357d;

    /* JADX INFO: renamed from: e */
    public final Context f75358e;

    /* JADX INFO: renamed from: f */
    public final kxv0 f75359f;

    /* JADX INFO: renamed from: g */
    public final zzcei f75360g;

    /* JADX INFO: renamed from: h */
    public final iyv0 f75361h;

    /* JADX INFO: renamed from: i */
    public boolean f75362i = false;

    /* JADX INFO: renamed from: j */
    public boolean f75363j = false;

    /* JADX INFO: renamed from: k */
    public boolean f75364k = true;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final hos0 f75365l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public final ios0 f75366m;

    public bfu0(@Nullable hos0 hos0Var, @Nullable ios0 ios0Var, @Nullable los0 los0Var, byt0 byt0Var, axt0 axt0Var, y6u0 y6u0Var, Context context, kxv0 kxv0Var, zzcei zzceiVar, iyv0 iyv0Var) {
        this.f75365l = hos0Var;
        this.f75366m = ios0Var;
        this.f75354a = los0Var;
        this.f75355b = byt0Var;
        this.f75356c = axt0Var;
        this.f75357d = y6u0Var;
        this.f75358e = context;
        this.f75359f = kxv0Var;
        this.f75360g = zzceiVar;
        this.f75361h = iyv0Var;
    }

    /* JADX INFO: renamed from: r */
    public static final HashMap m101565r(Map map) {
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

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: J */
    public final boolean mo101566J() {
        return this.f75359f.f125169M;
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: a */
    public final void mo101567a(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z, @Nullable ImageView.ScaleType scaleType) {
        if (this.f75363j && this.f75359f.f125169M) {
            return;
        }
        m101583q(view);
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: b */
    public final void mo101568b() {
        this.f75363j = true;
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: c */
    public final void mo101569c(@Nullable wpt0 wpt0Var) {
        x2t0.m206869g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: d */
    public final boolean mo101570d(Bundle bundle) {
        return false;
    }

    @Override // p149l.wcu0
    @Nullable
    /* JADX INFO: renamed from: e */
    public final JSONObject mo101571e(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: f */
    public final void mo101572f(View view, View view2, Map map, Map map2, boolean z, @Nullable ImageView.ScaleType scaleType, int i) {
        if (!this.f75363j) {
            x2t0.m206869g("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f75359f.f125169M) {
            m101583q(view2);
        } else {
            x2t0.m206869g("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // p149l.wcu0
    @Nullable
    /* JADX INFO: renamed from: g */
    public final JSONObject mo101573g(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: i */
    public final void mo101575i(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        try {
            if (!this.f75362i) {
                this.f75362i = vny0.m199083u().m211401n(this.f75358e, this.f75360g.zza, this.f75359f.f125160D.toString(), this.f75361h.f115496f);
            }
            if (this.f75364k) {
                los0 los0Var = this.f75354a;
                if (los0Var != null && !los0Var.mo142526J()) {
                    this.f75354a.mo142529g();
                    this.f75355b.zza();
                    return;
                }
                hos0 hos0Var = this.f75365l;
                if (hos0Var != null && !hos0Var.m132261t8()) {
                    this.f75365l.zzt();
                    this.f75355b.zza();
                    return;
                }
                ios0 ios0Var = this.f75366m;
                if (ios0Var == null || ios0Var.m137388t8()) {
                    return;
                }
                this.f75366m.zzr();
                this.f75355b.zza();
            }
        } catch (RemoteException e) {
            x2t0.m206870h("Failed to call recordImpression", e);
        }
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: k */
    public final void mo101577k(View view, @Nullable Map map) {
        try {
            uyl uylVarM181848Y2 = s050.m181848Y2(view);
            los0 los0Var = this.f75354a;
            if (los0Var != null) {
                los0Var.mo142533y7(uylVarM181848Y2);
                return;
            }
            hos0 hos0Var = this.f75365l;
            if (hos0Var != null) {
                hos0Var.m132252k7(uylVarM181848Y2);
                return;
            }
            ios0 ios0Var = this.f75366m;
            if (ios0Var != null) {
                ios0Var.m137387s8(uylVarM181848Y2);
            }
        } catch (RemoteException e) {
            x2t0.m206870h("Failed to call untrackView", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cc A[Catch: JSONException -> 0x0044, RemoteException -> 0x0122, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0044, blocks: (B:47:0x00b1, B:48:0x00c6, B:50:0x00cc), top: B:70:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00c6 A[SYNTHETIC] */
    @Override // p149l.wcu0
    /* JADX INFO: renamed from: m */
    public final void mo101579m(View view, @Nullable Map map, @Nullable Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        ClassLoader classLoader;
        Iterator it;
        uyl uylVarZzn;
        try {
            uyl uylVarM181848Y2 = s050.m181848Y2(view);
            JSONObject jSONObject = this.f75359f.f125204k0;
            boolean z = true;
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132452x1)).booleanValue() && jSONObject.length() != 0) {
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
                            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132464y1)).booleanValue() && next.equals("3010")) {
                                los0 los0Var = this.f75354a;
                                Object objM181847P2 = null;
                                if (los0Var != null) {
                                    try {
                                        uylVarZzn = los0Var.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    hos0 hos0Var = this.f75365l;
                                    if (hos0Var != null) {
                                        uylVarZzn = hos0Var.m132255n8();
                                    } else {
                                        ios0 ios0Var = this.f75366m;
                                        uylVarZzn = ios0Var != null ? ios0Var.m137379g7() : null;
                                    }
                                }
                                if (uylVarZzn != null) {
                                    objM181847P2 = s050.m181847P2(uylVarZzn);
                                }
                                if (objM181847P2 != null) {
                                    cls = objM181847P2.getClass();
                                    ArrayList arrayList = new ArrayList();
                                    prs0.m171062c(jSONArrayOptJSONArray, arrayList);
                                    vny0.m199080r();
                                    classLoader = this.f75358e.getClassLoader();
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
                                    prs0.m171062c(jSONArrayOptJSONArray, arrayList2);
                                    vny0.m199080r();
                                    classLoader = this.f75358e.getClassLoader();
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
            this.f75364k = z;
            HashMap mapM101565r = m101565r(map);
            HashMap mapM101565r2 = m101565r(map2);
            los0 los0Var2 = this.f75354a;
            if (los0Var2 != null) {
                los0Var2.mo142531o1(uylVarM181848Y2, s050.m181848Y2(mapM101565r), s050.m181848Y2(mapM101565r2));
                return;
            }
            hos0 hos0Var2 = this.f75365l;
            if (hos0Var2 != null) {
                hos0Var2.m132259r8(uylVarM181848Y2, s050.m181848Y2(mapM101565r), s050.m181848Y2(mapM101565r2));
                this.f75365l.m132258q8(uylVarM181848Y2);
                return;
            }
            ios0 ios0Var2 = this.f75366m;
            if (ios0Var2 != null) {
                ios0Var2.m137386r8(uylVarM181848Y2, s050.m181848Y2(mapM101565r), s050.m181848Y2(mapM101565r2));
                this.f75366m.m137385q8(uylVarM181848Y2);
            }
        } catch (RemoteException e) {
            x2t0.m206870h("Failed to call trackView", e);
        }
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: p */
    public final void mo101582p(skt0 skt0Var) {
        x2t0.m206869g("Mute This Ad is not supported for 3rd party ads");
    }

    /* JADX INFO: renamed from: q */
    public final void m101583q(View view) {
        try {
            los0 los0Var = this.f75354a;
            if (los0Var != null && !los0Var.mo142532t()) {
                this.f75354a.mo142530k7(s050.m181848Y2(view));
                this.f75356c.onAdClicked();
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132323ma)).booleanValue()) {
                    this.f75357d.zzs();
                    return;
                }
                return;
            }
            hos0 hos0Var = this.f75365l;
            if (hos0Var != null && !hos0Var.m132260s8()) {
                this.f75365l.m132257p8(s050.m181848Y2(view));
                this.f75356c.onAdClicked();
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132323ma)).booleanValue()) {
                    this.f75357d.zzs();
                    return;
                }
                return;
            }
            ios0 ios0Var = this.f75366m;
            if (ios0Var == null || ios0Var.m137378b()) {
                return;
            }
            this.f75366m.m137384p8(s050.m181848Y2(view));
            this.f75356c.onAdClicked();
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132323ma)).booleanValue()) {
                this.f75357d.zzs();
            }
        } catch (RemoteException e) {
            x2t0.m206870h("Failed to call handleClick", e);
        }
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: t */
    public final boolean mo101584t() {
        return true;
    }

    @Override // p149l.wcu0
    public final int zza() {
        return 0;
    }

    @Override // p149l.wcu0
    public final void zzg() {
        throw null;
    }

    @Override // p149l.wcu0
    public final void zzh() {
    }

    @Override // p149l.wcu0
    public final void zzi() {
    }

    @Override // p149l.wcu0
    public final void zzp() {
    }

    @Override // p149l.wcu0
    public final void zzr() {
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: j */
    public final void mo101576j(Bundle bundle) {
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: l */
    public final void mo101578l(View view) {
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: n */
    public final void mo101580n(Bundle bundle) {
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: o */
    public final void mo101581o(ees0 ees0Var) {
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: u */
    public final void mo101585u(String str) {
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: h */
    public final void mo101574h(View view, MotionEvent motionEvent, @Nullable View view2) {
    }
}
