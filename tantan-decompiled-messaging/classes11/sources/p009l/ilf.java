package p009l;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import l.d30;
import l.e30;
import l.f6c0;
import l.j760;
import l.mcr;
import l.roj0;
import l.vwb;
import l.w9j;
import l.wuh0;
import l.zvf0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ilf implements col {

    /* JADX INFO: renamed from: k */
    public static int f14686k = 5;

    /* JADX INFO: renamed from: l */
    public static int f14687l = 4;

    /* JADX INFO: renamed from: m */
    public static int f14688m = 4;

    /* JADX INFO: renamed from: g */
    public CacheCardType f14695g;

    /* JADX INFO: renamed from: h */
    public wuh0 f14696h;

    /* JADX INFO: renamed from: a */
    public Deque<View> f14689a = new ConcurrentLinkedDeque();

    /* JADX INFO: renamed from: b */
    public a<Integer> f14690b = a.c(0);

    /* JADX INFO: renamed from: c */
    public boolean f14691c = false;

    /* JADX INFO: renamed from: d */
    public boolean f14692d = false;

    /* JADX INFO: renamed from: e */
    public int f14693e = 0;

    /* JADX INFO: renamed from: f */
    public int f14694f = 0;

    /* JADX INFO: renamed from: i */
    public final HashMap<mcr, SparseArray<RecyclerView.u>> f14697i = new HashMap<>();

    /* JADX INFO: renamed from: j */
    public final wuh0.e f14698j = new wuh0.e() { // from class: l.blf
        /* JADX INFO: renamed from: a */
        public final void m12103a(View view, int i, ViewGroup viewGroup) {
            this.f10168a.m16635v(view, i, viewGroup);
        }
    };

    /* JADX INFO: renamed from: l.ilf$a */
    public class C0959a implements wuh0.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeCardExpandedType f14699a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f14700b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f14701c;

        public C0959a(HomeCardExpandedType homeCardExpandedType, Context context, int i) {
            this.f14699a = homeCardExpandedType;
            this.f14700b = context;
            this.f14701c = i;
        }

        /* JADX INFO: renamed from: a */
        public void m16639a(@NonNull View view, int i, @Nullable ViewGroup viewGroup) {
            p3l p3lVarCreateEmptyHolder = this.f14699a.createEmptyHolder();
            if (!p3lVarCreateEmptyHolder.mo24918j(view)) {
                CrashHelper.c(new RuntimeException("异步加载布局的类型不一致：" + this.f14699a.getAlias()));
                return;
            }
            p3lVarCreateEmptyHolder.m24917i(view);
            if (this.f14700b.lifecycle_() == c.m || this.f14700b.lifecycle_() == c.o || this.f14700b.isFinishing() || this.f14700b.isDestroyed()) {
                return;
            }
            lnf.m17966d().m17967c((Act) this.f14700b).m13977b(this.f14699a.getType(), view);
            ilf.this.f14694f++;
            if (ilf.this.f14694f == this.f14701c) {
                a<Integer> aVar = ilf.this.f14690b;
                aVar.onNext(Integer.valueOf(((Integer) aVar.e()).intValue() + 1));
            }
        }
    }

    public ilf(CacheCardType cacheCardType) {
        this.f14695g = cacheCardType;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m16622j(Bundle bundle) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m16623k(Integer num) {
    }

    /* JADX INFO: renamed from: z */
    private void m16629z(int i) {
        if (this.f14693e != f14686k || i > f14687l) {
            return;
        }
        zvf0.B("e_preload_home_card_used", "p_suggest_users_home_view", new j760[]{j760.a("left_card_count", Integer.valueOf(i))});
    }

    @Override // p009l.col
    /* JADX INFO: renamed from: a */
    public int mo12114a(boolean z) {
        return z ? f6c0.U9 : f6c0.X2;
    }

    @Override // p009l.col
    /* JADX INFO: renamed from: b */
    public View mo12115b() {
        View viewPop = this.f14689a.pop();
        m16629z(this.f14689a.size());
        return viewPop;
    }

    @Override // p009l.col
    /* JADX INFO: renamed from: c */
    public boolean mo12116c() {
        return !this.f14689a.isEmpty();
    }

    @Override // p009l.col
    /* JADX INFO: renamed from: d */
    public rx.c<roj0> mo12117d(int i) {
        return this.f14690b.doOnNext(new e30() { // from class: l.elf
            public final void call(Object obj) {
                ilf.m16623k((Integer) obj);
            }
        }).filter(new w9j() { // from class: l.flf
            public final Object call(Object obj) {
                return this.f13082a.m16633t((Integer) obj);
            }
        }).map(new w9j() { // from class: l.glf
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).doOnNext(new e30() { // from class: l.hlf
            public final void call(Object obj) {
                this.f14167a.m16634u((roj0) obj);
            }
        });
    }

    @Override // p009l.col
    /* JADX INFO: renamed from: f */
    public void mo12118f() {
        if (NullChecker.a(this.f14696h)) {
            this.f14696h.b();
        }
    }

    @Override // p009l.col
    /* JADX INFO: renamed from: g */
    public void mo12119g(Context context, mcr mcrVar) {
        if (this.f14691c) {
            return;
        }
        System.currentTimeMillis();
        this.f14691c = true;
        if (this.f14696h == null) {
            this.f14696h = new wuh0(context);
        }
        int i = 0;
        while (i < f14686k) {
            if (i == 2) {
                m16630q(this.f14696h, context);
            }
            this.f14696h.e(mo12114a(false), (ViewGroup) null, this.f14698j, i < 2);
            i++;
        }
        mcrVar.creates(new e30() { // from class: l.clf
            public final void call(Object obj) {
                ilf.m16622j((Bundle) obj);
            }
        }, new d30() { // from class: l.dlf
            public final void call() {
                this.f11896a.m16636w();
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m16630q(wuh0 wuh0Var, Context context) {
        ArrayList<HomeCardExpandedType> arrayList = new ArrayList();
        arrayList.add(HomeCardExpandedType.AVATAR);
        arrayList.add(HomeCardExpandedType.BASE_INFO);
        FrameLayout frameLayout = new FrameLayout(context);
        if (vwb.J(arrayList)) {
            return;
        }
        for (HomeCardExpandedType homeCardExpandedType : arrayList) {
            homeCardExpandedType.getPreLoadSize();
            for (int i = 0; i < 2; i++) {
                m16638y(wuh0Var, context, frameLayout, homeCardExpandedType, f14688m, true);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public int mo16631r() {
        return 2;
    }

    /* JADX INFO: renamed from: s */
    public CacheCardType m16632s() {
        return this.f14695g;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Boolean m16633t(Integer num) {
        return Boolean.valueOf(num.intValue() >= mo16631r());
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m16635v(View view, int i, ViewGroup viewGroup) {
        this.f14689a.push(view);
        int i2 = this.f14693e + 1;
        this.f14693e = i2;
        if (i2 == 2) {
            a<Integer> aVar = this.f14690b;
            aVar.onNext(Integer.valueOf(((Integer) aVar.e()).intValue() + 1));
            long jCurrentTimeMillis = System.currentTimeMillis();
            CoreSuggested coreSuggested = CoreModule.c.m0;
            coreSuggested.z2 = jCurrentTimeMillis - coreSuggested.y2;
            if (CoreModule.c.m0.A2 <= 0 || CoreModule.c.m0.z2 <= 0) {
                return;
            }
            zvf0.B("e_homepage_network_and_layout", "p_suggest_users_home_view", new j760[]{new j760("suggest_network_time", Long.valueOf(CoreModule.c.m0.A2)), new j760("card_layout_time", Long.valueOf(CoreModule.c.m0.z2)), new j760("suggest_network_time_diff_card_layout_time", Long.valueOf(CoreModule.c.m0.A2 - CoreModule.c.m0.z2))});
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m16636w() {
        this.f14689a.clear();
        vi4.m23380c(m16632s());
    }

    /* JADX INFO: renamed from: x */
    public void m16637x(wuh0 wuh0Var, Context context, FrameLayout frameLayout, HomeCardExpandedType homeCardExpandedType, int i) {
        m16638y(wuh0Var, context, frameLayout, homeCardExpandedType, i, false);
    }

    /* JADX INFO: renamed from: y */
    public void m16638y(wuh0 wuh0Var, Context context, FrameLayout frameLayout, HomeCardExpandedType homeCardExpandedType, int i, boolean z) {
        if (homeCardExpandedType.getLayoutId() > 0) {
            wuh0Var.e(homeCardExpandedType.getLayoutId(), frameLayout, new C0959a(homeCardExpandedType, context, i), z);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m16634u(roj0 roj0Var) {
    }
}
