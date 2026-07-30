package p153l;

import android.util.Pair;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.base.util.IntSet;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes13.dex */
public final class rft {

    /* JADX INFO: renamed from: a */
    public final float f162862a;

    /* JADX INFO: renamed from: b */
    public final boolean f162863b;

    /* JADX INFO: renamed from: d */
    public RecyclerView f162865d;

    /* JADX INFO: renamed from: f */
    public kcg0 f162867f;

    /* JADX INFO: renamed from: g */
    public kcg0 f162868g;

    /* JADX INFO: renamed from: j */
    public ner f162871j;

    /* JADX INFO: renamed from: k */
    public pcj<Boolean> f162872k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public InterfaceC19833b f162873l;

    /* JADX INFO: renamed from: c */
    public final C22508b<Pair<Boolean, IntSet>> f162864c = C22508b.m222767b();

    /* JADX INFO: renamed from: e */
    public IntSet f162866e = null;

    /* JADX INFO: renamed from: h */
    public final Object f162869h = new Object();

    /* JADX INFO: renamed from: i */
    public final Object f162870i = new Object();

    /* JADX INFO: renamed from: m */
    public final RecyclerView.AbstractC0584t f162874m = new C19832a();

    /* JADX INFO: renamed from: l.rft$a */
    public class C19832a extends RecyclerView.AbstractC0584t {
        public C19832a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                rft.this.m181293l(false);
            }
        }
    }

    /* JADX INFO: renamed from: l.rft$b */
    @FunctionalInterface
    public interface InterfaceC19833b {
        /* JADX INFO: renamed from: m */
        void mo100705m(List<Integer> list, boolean z);
    }

    public rft(boolean z, @NotNull ner nerVar, @Nullable pcj<Boolean> pcjVar, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        this.f162863b = z;
        this.f162871j = nerVar;
        this.f162872k = pcjVar;
        this.f162862a = f;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Boolean m181288g(Pair pair, Pair pair2) {
        return ((Boolean) pair2.first).booleanValue() ? Boolean.FALSE : Boolean.valueOf(pair2.equals(pair));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m181289h(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m181290i(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public void m181292k(@NonNull RecyclerView recyclerView) {
        if (recyclerView == null) {
            m181304w();
            return;
        }
        synchronized (this.f162869h) {
            try {
                RecyclerView recyclerView2 = this.f162865d;
                if (recyclerView2 != null) {
                    recyclerView2.removeOnScrollListener(this.f162874m);
                }
                recyclerView.addOnScrollListener(this.f162874m);
                this.f162865d = recyclerView;
                this.f162864c.onNext(new Pair<>(Boolean.FALSE, IntSet.emptySet()));
                m181301t();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m181293l(boolean z) {
        synchronized (this.f162869h) {
            try {
                RecyclerView recyclerView = this.f162865d;
                if (recyclerView == null) {
                    return;
                }
                this.f162864c.onNext(new Pair<>(Boolean.valueOf(z), xrc0.m212809e(recyclerView, this.f162863b, this.f162862a)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m181294m() {
        this.f162873l = null;
        synchronized (this.f162869h) {
            try {
                RecyclerView recyclerView = this.f162865d;
                if (recyclerView != null) {
                    recyclerView.removeOnScrollListener(this.f162874m);
                    this.f162865d = null;
                    psd0.m173633z(this.f162868g);
                    psd0.m173633z(this.f162867f);
                    this.f162871j = null;
                    this.f162872k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m181295n(Pair<Boolean, IntSet> pair) {
        boolean z;
        IntSet intSetDifference;
        synchronized (this.f162870i) {
            try {
                IntSet intSet = (IntSet) pair.second;
                z = false;
                if (this.f162866e != null && !((Boolean) pair.first).booleanValue() && intSet.max() < this.f162866e.max()) {
                    z = true;
                }
                intSetDifference = ((Boolean) pair.first).booleanValue() ? intSet : intSet.difference(this.f162866e);
                this.f162866e = intSet;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            InterfaceC19833b interfaceC19833b = this.f162873l;
            if (interfaceC19833b != null) {
                interfaceC19833b.mo100705m(new ArrayList(intSetDifference), z);
            }
        } catch (Throwable th2) {
            CrashHelper.m82479c(th2);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m181296o(Boolean bool) {
        m181293l(true);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Boolean m181297p(Pair pair) {
        return Boolean.valueOf(C4470c.f16267i.equals(this.f162871j.lifecycle_()));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Boolean m181298q(Pair pair) {
        pcj<Boolean> pcjVar = this.f162872k;
        return Boolean.valueOf(pcjVar == null || pcjVar.call().booleanValue());
    }

    /* JADX INFO: renamed from: r */
    public void m181299r(final Frag frag, C22508b<Boolean> c22508b) {
        psd0.m173633z(this.f162868g);
        this.f162868g = frag.duringCreated(c22508b).onBackpressureLatest().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.ift
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(frag.getUserVisibleHint());
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.jft
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120631a.m181296o((Boolean) obj);
            }
        }, new y20() { // from class: l.kft
            @Override // p153l.y20
            public final void call(Object obj) {
                rft.m181289h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public void m181300s(@Nullable InterfaceC19833b interfaceC19833b) {
        this.f162873l = interfaceC19833b;
    }

    /* JADX INFO: renamed from: t */
    public final void m181301t() {
        psd0.m173633z(this.f162867f);
        this.f162867f = this.f162871j.duringCreated(this.f162864c).observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.lft
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f131897a.m181297p((Pair) obj);
            }
        }).filter(new qcj() { // from class: l.mft
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f136670a.m181298q((Pair) obj);
            }
        }).distinctUntilChanged(new rcj() { // from class: l.nft
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return rft.m181288g((Pair) obj, (Pair) obj2);
            }
        }).filter(new qcj() { // from class: l.oft
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((IntSet) ((Pair) obj).second).isEmpty());
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.pft
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152206a.m181295n((Pair) obj);
            }
        }, new y20() { // from class: l.qft
            @Override // p153l.y20
            public final void call(Object obj) {
                rft.m181290i((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public void m181302u() {
        m181293l(true);
    }

    /* JADX INFO: renamed from: v */
    public void m181303v() {
        m181293l(false);
    }

    /* JADX INFO: renamed from: w */
    public void m181304w() {
        synchronized (this.f162869h) {
            try {
                if (this.f162865d == null) {
                    return;
                }
                psd0.m173633z(this.f162867f);
                this.f162865d.removeOnScrollListener(this.f162874m);
                this.f162865d = null;
                synchronized (this.f162870i) {
                    this.f162866e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
