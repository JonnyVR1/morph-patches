package p149l;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class ilf implements col {

    /* JADX INFO: renamed from: k */
    public static int f113821k = 5;

    /* JADX INFO: renamed from: l */
    public static int f113822l = 4;

    /* JADX INFO: renamed from: m */
    public static int f113823m = 4;

    /* JADX INFO: renamed from: g */
    public CacheCardType f113830g;

    /* JADX INFO: renamed from: h */
    public wuh0 f113831h;

    /* JADX INFO: renamed from: a */
    public Deque<View> f113824a = new ConcurrentLinkedDeque();

    /* JADX INFO: renamed from: b */
    public C22392a<Integer> f113825b = C22392a.m221513c(0);

    /* JADX INFO: renamed from: c */
    public boolean f113826c = false;

    /* JADX INFO: renamed from: d */
    public boolean f113827d = false;

    /* JADX INFO: renamed from: e */
    public int f113828e = 0;

    /* JADX INFO: renamed from: f */
    public int f113829f = 0;

    /* JADX INFO: renamed from: i */
    public final HashMap<mcr, SparseArray<RecyclerView.C0583u>> f113832i = new HashMap<>();

    /* JADX INFO: renamed from: j */
    public final wuh0.InterfaceC20963e f113833j = new wuh0.InterfaceC20963e() { // from class: l.blf
        @Override // p149l.wuh0.InterfaceC20963e
        /* JADX INFO: renamed from: a */
        public final void mo102516a(View view, int i, ViewGroup viewGroup) {
            this.f76179a.m136999v(view, i, viewGroup);
        }
    };

    /* JADX INFO: renamed from: l.ilf$a */
    public class C17574a implements wuh0.InterfaceC20963e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeCardExpandedType f113834a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f113835b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f113836c;

        public C17574a(HomeCardExpandedType homeCardExpandedType, Context context, int i) {
            this.f113834a = homeCardExpandedType;
            this.f113835b = context;
            this.f113836c = i;
        }

        @Override // p149l.wuh0.InterfaceC20963e
        /* JADX INFO: renamed from: a */
        public void mo102516a(@NonNull View view, int i, @Nullable ViewGroup viewGroup) {
            p3l p3lVarCreateEmptyHolder = this.f113834a.createEmptyHolder();
            if (!p3lVarCreateEmptyHolder.mo209780j(view)) {
                CrashHelper.m81296c(new RuntimeException("异步加载布局的类型不一致：" + this.f113834a.getAlias()));
                return;
            }
            p3lVarCreateEmptyHolder.m209779i(view);
            if (((Act) this.f113835b).lifecycle_() == C4319c.f15552m || ((Act) this.f113835b).lifecycle_() == C4319c.f15554o || ((Act) this.f113835b).isFinishing() || ((Act) this.f113835b).isDestroyed()) {
                return;
            }
            lnf.m150685d().m150686c((Act) this.f113835b).m117202b(this.f113834a.getType(), view);
            ilf.this.f113829f++;
            if (ilf.this.f113829f == this.f113836c) {
                C22392a<Integer> c22392a = ilf.this.f113825b;
                c22392a.onNext(Integer.valueOf(c22392a.m221515e().intValue() + 1));
            }
        }
    }

    public ilf(CacheCardType cacheCardType) {
        this.f113830g = cacheCardType;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m136986j(Bundle bundle) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m136987k(Integer num) {
    }

    /* JADX INFO: renamed from: z */
    private void m136993z(int i) {
        if (this.f113828e != f113821k || i > f113822l) {
            return;
        }
        zvf0.m220369B("e_preload_home_card_used", "p_suggest_users_home_view", j760.m140076a("left_card_count", Integer.valueOf(i)));
    }

    @Override // p149l.col
    /* JADX INFO: renamed from: a */
    public int mo102628a(boolean z) {
        return z ? f6c0.f95596U9 : f6c0.f95637X2;
    }

    @Override // p149l.col
    /* JADX INFO: renamed from: b */
    public View mo102629b() {
        View viewPop = this.f113824a.pop();
        m136993z(this.f113824a.size());
        return viewPop;
    }

    @Override // p149l.col
    /* JADX INFO: renamed from: c */
    public boolean mo102630c() {
        return !this.f113824a.isEmpty();
    }

    @Override // p149l.col
    /* JADX INFO: renamed from: d */
    public C22306c<roj0> mo102631d(int i) {
        return this.f113825b.doOnNext(new e30() { // from class: l.elf
            @Override // p149l.e30
            public final void call(Object obj) {
                ilf.m136987k((Integer) obj);
            }
        }).filter(new w9j() { // from class: l.flf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f98155a.m136997t((Integer) obj);
            }
        }).map(new w9j() { // from class: l.glf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).doOnNext(new e30() { // from class: l.hlf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108342a.m136998u((roj0) obj);
            }
        });
    }

    @Override // p149l.col
    /* JADX INFO: renamed from: f */
    public void mo102632f() {
        if (NullChecker.m81303a(this.f113831h)) {
            this.f113831h.m205637b();
        }
    }

    @Override // p149l.col
    /* JADX INFO: renamed from: g */
    public void mo102633g(Context context, mcr mcrVar) {
        if (this.f113826c) {
            return;
        }
        System.currentTimeMillis();
        this.f113826c = true;
        if (this.f113831h == null) {
            this.f113831h = new wuh0(context);
        }
        int i = 0;
        while (i < f113821k) {
            if (i == 2) {
                m136994q(this.f113831h, context);
            }
            this.f113831h.m205639e(mo102628a(false), null, this.f113833j, i < 2);
            i++;
        }
        mcrVar.creates(new e30() { // from class: l.clf
            @Override // p149l.e30
            public final void call(Object obj) {
                ilf.m136986j((Bundle) obj);
            }
        }, new d30() { // from class: l.dlf
            @Override // p149l.d30
            public final void call() {
                this.f86800a.m137000w();
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m136994q(wuh0 wuh0Var, Context context) {
        ArrayList<HomeCardExpandedType> arrayList = new ArrayList();
        arrayList.add(HomeCardExpandedType.AVATAR);
        arrayList.add(HomeCardExpandedType.BASE_INFO);
        FrameLayout frameLayout = new FrameLayout(context);
        if (vwb.m200296J(arrayList)) {
            return;
        }
        for (HomeCardExpandedType homeCardExpandedType : arrayList) {
            homeCardExpandedType.getPreLoadSize();
            for (int i = 0; i < 2; i++) {
                m137002y(wuh0Var, context, frameLayout, homeCardExpandedType, f113823m, true);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public int mo136995r() {
        return 2;
    }

    /* JADX INFO: renamed from: s */
    public CacheCardType m136996s() {
        return this.f113830g;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Boolean m136997t(Integer num) {
        return Boolean.valueOf(num.intValue() >= mo136995r());
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m136999v(View view, int i, ViewGroup viewGroup) {
        this.f113824a.push(view);
        int i2 = this.f113828e + 1;
        this.f113828e = i2;
        if (i2 == 2) {
            C22392a<Integer> c22392a = this.f113825b;
            c22392a.onNext(Integer.valueOf(c22392a.m221515e().intValue() + 1));
            long jCurrentTimeMillis = System.currentTimeMillis();
            CoreSuggested coreSuggested = CoreModule.f17545c.f19663m0;
            coreSuggested.f19471z2 = jCurrentTimeMillis - coreSuggested.f19468y2;
            if (CoreModule.f17545c.f19663m0.f19322A2 <= 0 || CoreModule.f17545c.f19663m0.f19471z2 <= 0) {
                return;
            }
            zvf0.m220369B("e_homepage_network_and_layout", "p_suggest_users_home_view", new j760("suggest_network_time", Long.valueOf(CoreModule.f17545c.f19663m0.f19322A2)), new j760("card_layout_time", Long.valueOf(CoreModule.f17545c.f19663m0.f19471z2)), new j760("suggest_network_time_diff_card_layout_time", Long.valueOf(CoreModule.f17545c.f19663m0.f19322A2 - CoreModule.f17545c.f19663m0.f19471z2)));
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m137000w() {
        this.f113824a.clear();
        vi4.m198497c(m136996s());
    }

    /* JADX INFO: renamed from: x */
    public void m137001x(wuh0 wuh0Var, Context context, FrameLayout frameLayout, HomeCardExpandedType homeCardExpandedType, int i) {
        m137002y(wuh0Var, context, frameLayout, homeCardExpandedType, i, false);
    }

    /* JADX INFO: renamed from: y */
    public void m137002y(wuh0 wuh0Var, Context context, FrameLayout frameLayout, HomeCardExpandedType homeCardExpandedType, int i, boolean z) {
        if (homeCardExpandedType.getLayoutId() > 0) {
            wuh0Var.m205639e(homeCardExpandedType.getLayoutId(), frameLayout, new C17574a(homeCardExpandedType, context, i), z);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m136998u(roj0 roj0Var) {
    }
}
