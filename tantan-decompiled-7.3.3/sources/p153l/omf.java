package p153l;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.holder.HomeCardExpandedType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public class omf implements nql {

    /* JADX INFO: renamed from: k */
    public static int f147923k = 5;

    /* JADX INFO: renamed from: l */
    public static int f147924l = 4;

    /* JADX INFO: renamed from: m */
    public static int f147925m = 4;

    /* JADX INFO: renamed from: g */
    public CacheCardType f147932g;

    /* JADX INFO: renamed from: h */
    public e3i0 f147933h;

    /* JADX INFO: renamed from: a */
    public Deque<View> f147926a = new ConcurrentLinkedDeque();

    /* JADX INFO: renamed from: b */
    public C22507a<Integer> f147927b = C22507a.m222759c(0);

    /* JADX INFO: renamed from: c */
    public boolean f147928c = false;

    /* JADX INFO: renamed from: d */
    public boolean f147929d = false;

    /* JADX INFO: renamed from: e */
    public int f147930e = 0;

    /* JADX INFO: renamed from: f */
    public int f147931f = 0;

    /* JADX INFO: renamed from: i */
    public final HashMap<ner, SparseArray<RecyclerView.C0585u>> f147934i = new HashMap<>();

    /* JADX INFO: renamed from: j */
    public final e3i0.InterfaceC16697e f147935j = new e3i0.InterfaceC16697e() { // from class: l.hmf
        @Override // p153l.e3i0.InterfaceC16697e
        /* JADX INFO: renamed from: a */
        public final void mo111496a(View view, int i, ViewGroup viewGroup) {
            this.f110623a.m168225v(view, i, viewGroup);
        }
    };

    /* JADX INFO: renamed from: l.omf$a */
    public class C19164a implements e3i0.InterfaceC16697e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HomeCardExpandedType f147936a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f147937b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f147938c;

        public C19164a(HomeCardExpandedType homeCardExpandedType, Context context, int i) {
            this.f147936a = homeCardExpandedType;
            this.f147937b = context;
            this.f147938c = i;
        }

        @Override // p153l.e3i0.InterfaceC16697e
        /* JADX INFO: renamed from: a */
        public void mo111496a(@NonNull View view, int i, @Nullable ViewGroup viewGroup) {
            f6l f6lVarCreateEmptyHolder = this.f147936a.createEmptyHolder();
            if (!f6lVarCreateEmptyHolder.mo116949j(view)) {
                CrashHelper.m82479c(new RuntimeException("异步加载布局的类型不一致：" + this.f147936a.getAlias()));
                return;
            }
            f6lVarCreateEmptyHolder.m116948i(view);
            if (((Act) this.f147937b).lifecycle_() == C4470c.f16271m || ((Act) this.f147937b).lifecycle_() == C4470c.f16273o || ((Act) this.f147937b).isFinishing() || ((Act) this.f147937b).isDestroyed()) {
                return;
            }
            rof.m182405d().m182406c((Act) this.f147937b).m150508b(this.f147936a.getType(), view);
            omf.this.f147931f++;
            if (omf.this.f147931f == this.f147938c) {
                C22507a<Integer> c22507a = omf.this.f147927b;
                c22507a.onNext(Integer.valueOf(c22507a.m222761e().intValue() + 1));
            }
        }
    }

    public omf(CacheCardType cacheCardType) {
        this.f147932g = cacheCardType;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m168212j(Bundle bundle) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m168213k(Integer num) {
    }

    /* JADX INFO: renamed from: z */
    private void m168219z(int i) {
        if (this.f147930e != f147923k || i > f147924l) {
            return;
        }
        i4g0.m138493B("e_preload_home_card_used", "p_suggest_users_home_view", pf60.m172085a("left_card_count", Integer.valueOf(i)));
    }

    @Override // p153l.nql
    /* JADX INFO: renamed from: a */
    public int mo136048a(boolean z) {
        return z ? kec0.f125764ba : kec0.f125691X2;
    }

    @Override // p153l.nql
    /* JADX INFO: renamed from: b */
    public View mo136049b() {
        View viewPop = this.f147926a.pop();
        m168219z(this.f147926a.size());
        return viewPop;
    }

    @Override // p153l.nql
    /* JADX INFO: renamed from: c */
    public boolean mo136050c() {
        return !this.f147926a.isEmpty();
    }

    @Override // p153l.nql
    /* JADX INFO: renamed from: d */
    public C22421c<uxj0> mo136051d(int i) {
        return this.f147927b.doOnNext(new y20() { // from class: l.kmf
            @Override // p153l.y20
            public final void call(Object obj) {
                omf.m168213k((Integer) obj);
            }
        }).filter(new qcj() { // from class: l.lmf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f132685a.m168223t((Integer) obj);
            }
        }).map(new qcj() { // from class: l.mmf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).doOnNext(new y20() { // from class: l.nmf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142700a.m168224u((uxj0) obj);
            }
        });
    }

    @Override // p153l.nql
    /* JADX INFO: renamed from: f */
    public void mo136052f() {
        if (NullChecker.m82486a(this.f147933h)) {
            this.f147933h.m119298b();
        }
    }

    @Override // p153l.nql
    /* JADX INFO: renamed from: g */
    public void mo136053g(Context context, ner nerVar) {
        if (this.f147928c) {
            return;
        }
        System.currentTimeMillis();
        this.f147928c = true;
        if (this.f147933h == null) {
            this.f147933h = new e3i0(context);
        }
        int i = 0;
        while (i < f147923k) {
            if (i == 2) {
                m168220q(this.f147933h, context);
            }
            this.f147933h.m119300e(mo136048a(false), null, this.f147935j, i < 2);
            i++;
        }
        nerVar.creates(new y20() { // from class: l.imf
            @Override // p153l.y20
            public final void call(Object obj) {
                omf.m168212j((Bundle) obj);
            }
        }, new x20() { // from class: l.jmf
            @Override // p153l.x20
            public final void call() {
                this.f121667a.m168226w();
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m168220q(e3i0 e3i0Var, Context context) {
        ArrayList<HomeCardExpandedType> arrayList = new ArrayList();
        arrayList.add(HomeCardExpandedType.AVATAR);
        arrayList.add(HomeCardExpandedType.BASE_INFO);
        FrameLayout frameLayout = new FrameLayout(context);
        if (jyb.m147479J(arrayList)) {
            return;
        }
        for (HomeCardExpandedType homeCardExpandedType : arrayList) {
            homeCardExpandedType.getPreLoadSize();
            for (int i = 0; i < 2; i++) {
                m168228y(e3i0Var, context, frameLayout, homeCardExpandedType, f147925m, true);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public int mo168221r() {
        return 2;
    }

    /* JADX INFO: renamed from: s */
    public CacheCardType m168222s() {
        return this.f147932g;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Boolean m168223t(Integer num) {
        return Boolean.valueOf(num.intValue() >= mo168221r());
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m168225v(View view, int i, ViewGroup viewGroup) {
        this.f147926a.push(view);
        int i2 = this.f147930e + 1;
        this.f147930e = i2;
        if (i2 == 2) {
            C22507a<Integer> c22507a = this.f147927b;
            c22507a.onNext(Integer.valueOf(c22507a.m222761e().intValue() + 1));
            long jCurrentTimeMillis = System.currentTimeMillis();
            CoreSuggested coreSuggested = CoreModule.f18264c.f20405m0;
            coreSuggested.f20213z2 = jCurrentTimeMillis - coreSuggested.f20210y2;
            if (CoreModule.f18264c.f20405m0.f20064A2 <= 0 || CoreModule.f18264c.f20405m0.f20213z2 <= 0) {
                return;
            }
            i4g0.m138493B("e_homepage_network_and_layout", "p_suggest_users_home_view", new pf60("suggest_network_time", Long.valueOf(CoreModule.f18264c.f20405m0.f20064A2)), new pf60("card_layout_time", Long.valueOf(CoreModule.f18264c.f20405m0.f20213z2)), new pf60("suggest_network_time_diff_card_layout_time", Long.valueOf(CoreModule.f18264c.f20405m0.f20064A2 - CoreModule.f18264c.f20405m0.f20213z2)));
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m168226w() {
        this.f147926a.clear();
        uj4.m196318c(m168222s());
    }

    /* JADX INFO: renamed from: x */
    public void m168227x(e3i0 e3i0Var, Context context, FrameLayout frameLayout, HomeCardExpandedType homeCardExpandedType, int i) {
        m168228y(e3i0Var, context, frameLayout, homeCardExpandedType, i, false);
    }

    /* JADX INFO: renamed from: y */
    public void m168228y(e3i0 e3i0Var, Context context, FrameLayout frameLayout, HomeCardExpandedType homeCardExpandedType, int i, boolean z) {
        if (homeCardExpandedType.getLayoutId() > 0) {
            e3i0Var.m119300e(homeCardExpandedType.getLayoutId(), frameLayout, new C19164a(homeCardExpandedType, context, i), z);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m168224u(uxj0 uxj0Var) {
    }
}
