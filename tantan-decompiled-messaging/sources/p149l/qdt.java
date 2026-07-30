package p149l;

import android.util.Pair;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.base.util.IntSet;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes13.dex */
public final class qdt {

    /* JADX INFO: renamed from: a */
    public final float f153962a;

    /* JADX INFO: renamed from: b */
    public final boolean f153963b;

    /* JADX INFO: renamed from: d */
    public RecyclerView f153965d;

    /* JADX INFO: renamed from: f */
    public c4g0 f153967f;

    /* JADX INFO: renamed from: g */
    public c4g0 f153968g;

    /* JADX INFO: renamed from: j */
    public mcr f153971j;

    /* JADX INFO: renamed from: k */
    public v9j<Boolean> f153972k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public InterfaceC19468b f153973l;

    /* JADX INFO: renamed from: c */
    public final C22393b<Pair<Boolean, IntSet>> f153964c = C22393b.m221521b();

    /* JADX INFO: renamed from: e */
    public IntSet f153966e = null;

    /* JADX INFO: renamed from: h */
    public final Object f153969h = new Object();

    /* JADX INFO: renamed from: i */
    public final Object f153970i = new Object();

    /* JADX INFO: renamed from: m */
    public final RecyclerView.AbstractC0582t f153974m = new C19467a();

    /* JADX INFO: renamed from: l.qdt$a */
    public class C19467a extends RecyclerView.AbstractC0582t {
        public C19467a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                qdt.this.m174108l(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.qdt$b */
    @FunctionalInterface
    public interface InterfaceC19468b {
        /* JADX INFO: renamed from: m */
        void mo102830m(List<Integer> list, boolean z);
    }

    public qdt(boolean z, @NotNull mcr mcrVar, @Nullable v9j<Boolean> v9jVar, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        this.f153963b = z;
        this.f153971j = mcrVar;
        this.f153972k = v9jVar;
        this.f153962a = f;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Boolean m174103g(Pair pair, Pair pair2) {
        return ((Boolean) pair2.first).booleanValue() ? Boolean.FALSE : Boolean.valueOf(pair2.equals(pair));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m174104h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m174105i(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public void m174107k(@NonNull RecyclerView recyclerView) {
        if (recyclerView == null) {
            m174119w();
            return;
        }
        synchronized (this.f153969h) {
            try {
                RecyclerView recyclerView2 = this.f153965d;
                if (recyclerView2 != null) {
                    recyclerView2.removeOnScrollListener(this.f153974m);
                }
                recyclerView.addOnScrollListener(this.f153974m);
                this.f153965d = recyclerView;
                this.f153964c.onNext(new Pair<>(Boolean.FALSE, IntSet.emptySet()));
                m174116t();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m174108l(boolean z) {
        synchronized (this.f153969h) {
            try {
                RecyclerView recyclerView = this.f153965d;
                if (recyclerView == null) {
                    return;
                }
                this.f153964c.onNext(new Pair<>(Boolean.valueOf(z), qjc0.m174986e(recyclerView, this.f153963b, this.f153962a)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m174109m() {
        this.f153973l = null;
        synchronized (this.f153969h) {
            try {
                RecyclerView recyclerView = this.f153965d;
                if (recyclerView != null) {
                    recyclerView.removeOnScrollListener(this.f153974m);
                    this.f153965d = null;
                    mkd0.m154992z(this.f153968g);
                    mkd0.m154992z(this.f153967f);
                    this.f153971j = null;
                    this.f153972k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m174110n(Pair<Boolean, IntSet> pair) {
        boolean z;
        IntSet intSetDifference;
        synchronized (this.f153970i) {
            try {
                IntSet intSet = (IntSet) pair.second;
                z = false;
                if (this.f153966e != null && !((Boolean) pair.first).booleanValue() && intSet.max() < this.f153966e.max()) {
                    z = true;
                }
                intSetDifference = ((Boolean) pair.first).booleanValue() ? intSet : intSet.difference(this.f153966e);
                this.f153966e = intSet;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            InterfaceC19468b interfaceC19468b = this.f153973l;
            if (interfaceC19468b != null) {
                interfaceC19468b.mo102830m(new ArrayList(intSetDifference), z);
            }
        } catch (Throwable th2) {
            CrashHelper.m81296c(th2);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m174111o(Boolean bool) {
        m174108l(true);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Boolean m174112p(Pair pair) {
        return Boolean.valueOf(C4319c.f15548i.equals(this.f153971j.lifecycle_()));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Boolean m174113q(Pair pair) {
        v9j<Boolean> v9jVar = this.f153972k;
        return Boolean.valueOf(v9jVar == null || v9jVar.call().booleanValue());
    }

    /* JADX INFO: renamed from: r */
    public void m174114r(final Frag frag, C22393b<Boolean> c22393b) {
        mkd0.m154992z(this.f153968g);
        this.f153968g = frag.duringCreated(c22393b).onBackpressureLatest().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.hdt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(frag.getUserVisibleHint());
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.idt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112681a.m174111o((Boolean) obj);
            }
        }, new e30() { // from class: l.jdt
            @Override // p149l.e30
            public final void call(Object obj) {
                qdt.m174104h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public void m174115s(@Nullable InterfaceC19468b interfaceC19468b) {
        this.f153973l = interfaceC19468b;
    }

    /* JADX INFO: renamed from: t */
    public final void m174116t() {
        mkd0.m154992z(this.f153967f);
        this.f153967f = this.f153971j.duringCreated(this.f153964c).observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.kdt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f122619a.m174112p((Pair) obj);
            }
        }).filter(new w9j() { // from class: l.ldt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f127601a.m174113q((Pair) obj);
            }
        }).distinctUntilChanged(new x9j() { // from class: l.mdt
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return qdt.m174103g((Pair) obj, (Pair) obj2);
            }
        }).filter(new w9j() { // from class: l.ndt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((IntSet) ((Pair) obj).second).isEmpty());
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.odt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143241a.m174110n((Pair) obj);
            }
        }, new e30() { // from class: l.pdt
            @Override // p149l.e30
            public final void call(Object obj) {
                qdt.m174105i((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public void m174117u() {
        m174108l(true);
    }

    /* JADX INFO: renamed from: v */
    public void m174118v() {
        m174108l(false);
    }

    /* JADX INFO: renamed from: w */
    public void m174119w() {
        synchronized (this.f153969h) {
            try {
                if (this.f153965d == null) {
                    return;
                }
                mkd0.m154992z(this.f153967f);
                this.f153965d.removeOnScrollListener(this.f153974m);
                this.f153965d = null;
                synchronized (this.f153970i) {
                    this.f153966e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
