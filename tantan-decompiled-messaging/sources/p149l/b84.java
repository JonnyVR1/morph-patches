package p149l;

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
public class b84 extends vg2 {

    /* JADX INFO: renamed from: a */
    private WeakReference<g4e> f74046a;

    /* JADX INFO: renamed from: b */
    private WeakReference<ipm> f74047b;

    /* JADX INFO: renamed from: d */
    private final CleverTapInstanceConfig f74049d;

    /* JADX INFO: renamed from: e */
    private final hyd f74050e;

    /* JADX INFO: renamed from: f */
    private bwf f74051f;

    /* JADX INFO: renamed from: g */
    @Deprecated
    private WeakReference<wt3> f74052g;

    /* JADX INFO: renamed from: i */
    @Deprecated
    private WeakReference<vv3> f74054i;

    /* JADX INFO: renamed from: m */
    private et2 f74058m;

    /* JADX INFO: renamed from: c */
    private final List<tfb0> f74048c = new ArrayList();

    /* JADX INFO: renamed from: h */
    private final List<fe50> f74053h = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: j */
    private wv3 f74055j = null;

    /* JADX INFO: renamed from: k */
    private xv3 f74056k = null;

    /* JADX INFO: renamed from: l */
    private final List<fr4> f74057l = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: l.b84$a */
    public class RunnableC15826a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ArrayList f74059a;

        public RunnableC15826a(ArrayList arrayList) {
            this.f74059a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b84.this.f74046a == null || b84.this.f74046a.get() == null) {
                return;
            }
            ((g4e) b84.this.f74046a.get()).m124364a(this.f74059a);
        }
    }

    public b84(CleverTapInstanceConfig cleverTapInstanceConfig, hyd hydVar) {
        this.f74049d = cleverTapInstanceConfig;
        this.f74050e = hydVar;
    }

    /* JADX INFO: renamed from: B */
    public bgh0 m100726B() {
        return null;
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: c */
    public void mo100729c(fr4 fr4Var) {
        this.f74057l.add(fr4Var);
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: d */
    public void mo100730d(@NonNull fe50 fe50Var) {
        this.f74053h.add(fe50Var);
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: e */
    public et2 mo100731e() {
        return this.f74058m;
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: f */
    public List<fr4> mo100732f() {
        return this.f74057l;
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: g */
    public bwf mo100733g() {
        return this.f74051f;
    }

    @Override // p149l.vg2
    @Deprecated
    /* JADX INFO: renamed from: h */
    public wt3 mo100734h() {
        WeakReference<wt3> weakReference = this.f74052g;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f74052g.get();
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: i */
    public xei mo100735i() {
        return null;
    }

    @Override // p149l.vg2
    @Nullable
    /* JADX INFO: renamed from: j */
    public bfi mo100736j() {
        return null;
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: k */
    public ojj mo100737k() {
        return null;
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: l */
    public ipm mo100738l() {
        WeakReference<ipm> weakReference = this.f74047b;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f74047b.get();
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: m */
    public lpm mo100739m() {
        return null;
    }

    @Override // p149l.vg2
    @Deprecated
    /* JADX INFO: renamed from: n */
    public vv3 mo100740n() {
        WeakReference<vv3> weakReference = this.f74054i;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f74054i.get();
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: o */
    public wv3 mo100741o() {
        return this.f74055j;
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: p */
    public xv3 mo100742p() {
        return this.f74056k;
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: q */
    public List<tfb0> mo100743q() {
        return this.f74048c;
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: r */
    public okd0 mo100744r() {
        return null;
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: s */
    public void mo100745s(String str) {
        synchronized (this.f74053h) {
            try {
                for (fe50 fe50Var : this.f74053h) {
                    if (fe50Var != null) {
                        fe50Var.mo121026a(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: t */
    public void mo100746t(ArrayList<CleverTapDisplayUnit> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            this.f74049d.getLogger().verbose(this.f74049d.getAccountId(), "DisplayUnit : No Display Units found");
            return;
        }
        WeakReference<g4e> weakReference = this.f74046a;
        if (weakReference == null || weakReference.get() == null) {
            this.f74049d.getLogger().verbose(this.f74049d.getAccountId(), "DisplayUnit : No registered listener, failed to notify");
        } else {
            Utils.m5929z(new RunnableC15826a(arrayList));
        }
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: u */
    public void mo100747u(String str) {
        if (str == null) {
            str = this.f74050e.m133539E();
        }
        if (str == null) {
            return;
        }
        try {
            m100726B();
        } catch (Throwable unused) {
        }
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: v */
    public void mo100748v(et2 et2Var) {
        this.f74058m = et2Var;
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: w */
    public void mo100749w(bwf bwfVar) {
        this.f74051f = bwfVar;
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: y */
    public void mo100751y(wv3 wv3Var) {
        this.f74055j = wv3Var;
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: z */
    public void mo100752z(xv3 xv3Var) {
        this.f74056k = xv3Var;
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: a */
    public void mo100727a() {
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: b */
    public void mo100728b() {
    }

    @Override // p149l.vg2
    /* JADX INFO: renamed from: x */
    public void mo100750x(bfi bfiVar) {
    }
}
