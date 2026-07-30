package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class a94 extends ch2 {

    /* JADX INFO: renamed from: a */
    private WeakReference<u5e> f68984a;

    /* JADX INFO: renamed from: b */
    private WeakReference<krm> f68985b;

    /* JADX INFO: renamed from: d */
    private final CleverTapInstanceConfig f68987d;

    /* JADX INFO: renamed from: e */
    private final uzd f68988e;

    /* JADX INFO: renamed from: f */
    private pxf f68989f;

    /* JADX INFO: renamed from: g */
    @Deprecated
    private WeakReference<vu3> f68990g;

    /* JADX INFO: renamed from: i */
    @Deprecated
    private WeakReference<uw3> f68992i;

    /* JADX INFO: renamed from: m */
    private ut2 f68996m;

    /* JADX INFO: renamed from: c */
    private final List<xnb0> f68986c = new ArrayList();

    /* JADX INFO: renamed from: h */
    private final List<mm50> f68991h = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: j */
    private vw3 f68993j = null;

    /* JADX INFO: renamed from: k */
    private ww3 f68994k = null;

    /* JADX INFO: renamed from: l */
    private final List<es4> f68995l = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: l.a94$a */
    public class RunnableC15671a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ArrayList f68997a;

        public RunnableC15671a(ArrayList arrayList) {
            this.f68997a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a94.this.f68984a == null || a94.this.f68984a.get() == null) {
                return;
            }
            ((u5e) a94.this.f68984a.get()).m194584a(this.f68997a);
        }
    }

    public a94(CleverTapInstanceConfig cleverTapInstanceConfig, uzd uzdVar) {
        this.f68987d = cleverTapInstanceConfig;
        this.f68988e = uzdVar;
    }

    /* JADX INFO: renamed from: B */
    public joh0 m96506B() {
        return null;
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: c */
    public void mo96509c(es4 es4Var) {
        this.f68995l.add(es4Var);
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: d */
    public void mo96510d(@NonNull mm50 mm50Var) {
        this.f68991h.add(mm50Var);
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: e */
    public ut2 mo96511e() {
        return this.f68996m;
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: f */
    public List<es4> mo96512f() {
        return this.f68995l;
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: g */
    public pxf mo96513g() {
        return this.f68989f;
    }

    @Override // p153l.ch2
    @Deprecated
    /* JADX INFO: renamed from: h */
    public vu3 mo96514h() {
        WeakReference<vu3> weakReference = this.f68990g;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f68990g.get();
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: i */
    public thi mo96515i() {
        return null;
    }

    @Override // p153l.ch2
    @Nullable
    /* JADX INFO: renamed from: j */
    public xhi mo96516j() {
        return null;
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: k */
    public hmj mo96517k() {
        return null;
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: l */
    public krm mo96518l() {
        WeakReference<krm> weakReference = this.f68985b;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f68985b.get();
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: m */
    public nrm mo96519m() {
        return null;
    }

    @Override // p153l.ch2
    @Deprecated
    /* JADX INFO: renamed from: n */
    public uw3 mo96520n() {
        WeakReference<uw3> weakReference = this.f68992i;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f68992i.get();
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: o */
    public vw3 mo96521o() {
        return this.f68993j;
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: p */
    public ww3 mo96522p() {
        return this.f68994k;
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: q */
    public List<xnb0> mo96523q() {
        return this.f68986c;
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: r */
    public rsd0 mo96524r() {
        return null;
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: s */
    public void mo96525s(String str) {
        synchronized (this.f68991h) {
            try {
                for (mm50 mm50Var : this.f68991h) {
                    if (mm50Var != null) {
                        mm50Var.mo158955a(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: t */
    public void mo96526t(ArrayList<CleverTapDisplayUnit> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            this.f68987d.getLogger().verbose(this.f68987d.getAccountId(), "DisplayUnit : No Display Units found");
            return;
        }
        WeakReference<u5e> weakReference = this.f68984a;
        if (weakReference == null || weakReference.get() == null) {
            this.f68987d.getLogger().verbose(this.f68987d.getAccountId(), "DisplayUnit : No registered listener, failed to notify");
        } else {
            Utils.m5983z(new RunnableC15671a(arrayList));
        }
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: u */
    public void mo96527u(String str) {
        if (str == null) {
            str = this.f68988e.m198762E();
        }
        if (str == null) {
            return;
        }
        try {
            m96506B();
        } catch (Throwable unused) {
        }
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: v */
    public void mo96528v(ut2 ut2Var) {
        this.f68996m = ut2Var;
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: w */
    public void mo96529w(pxf pxfVar) {
        this.f68989f = pxfVar;
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: y */
    public void mo96531y(vw3 vw3Var) {
        this.f68993j = vw3Var;
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: z */
    public void mo96532z(ww3 ww3Var) {
        this.f68994k = ww3Var;
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: a */
    public void mo96507a() {
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: b */
    public void mo96508b() {
    }

    @Override // p153l.ch2
    /* JADX INFO: renamed from: x */
    public void mo96530x(xhi xhiVar) {
    }
}
