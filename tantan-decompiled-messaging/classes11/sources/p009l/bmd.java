package p009l;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C0031a;
import com.p000p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p000p1.mobile.putong.core.newui.home.cache.CacheCardType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import l.d30;
import l.e30;
import l.f6c0;
import l.j760;
import l.mcr;
import l.roj0;
import l.upa;
import l.vwb;
import l.w9j;
import l.wuh0;
import l.zvf0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bmd implements col {

    /* JADX INFO: renamed from: h */
    public static int f10176h = 10;

    /* JADX INFO: renamed from: i */
    public static int f10177i = 7;

    /* JADX INFO: renamed from: f */
    public CacheCardType f10183f;

    /* JADX INFO: renamed from: a */
    public boolean f10178a = false;

    /* JADX INFO: renamed from: b */
    public int f10179b = 0;

    /* JADX INFO: renamed from: c */
    public final HashMap<String, Deque<View>> f10180c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public a<Integer> f10181d = a.b();

    /* JADX INFO: renamed from: e */
    public boolean f10182e = false;

    /* JADX INFO: renamed from: g */
    public final wuh0.e f10184g = new wuh0.e() { // from class: l.wld
        /* JADX INFO: renamed from: a */
        public final void m24319a(View view, int i, ViewGroup viewGroup) {
            this.f22184a.m12121n(view, i, viewGroup);
        }
    };

    /* JADX INFO: renamed from: l.bmd$a */
    public class C0788a implements wuh0.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CardBottomFrame f10185a;

        public C0788a(CardBottomFrame cardBottomFrame) {
            this.f10185a = cardBottomFrame;
        }

        /* JADX INFO: renamed from: a */
        public void m12125a(@NonNull View view, int i, @Nullable ViewGroup viewGroup) {
            if (C0031a.f769g) {
                this.f10185a.getDes();
            }
            C0031a.m1385i().m1386f(view.getContext(), new rj4(this.f10185a, view, C0031a.m1385i().m1391l(this.f10185a)));
        }
    }

    public bmd(CacheCardType cacheCardType) {
        this.f10183f = cacheCardType;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m12113l(Bundle bundle) {
    }

    @Override // p009l.col
    /* JADX INFO: renamed from: a */
    public int mo12114a(boolean z) {
        return f6c0.W7;
    }

    @Override // p009l.col
    /* JADX INFO: renamed from: b */
    public View mo12115b() {
        if (!this.f10180c.containsKey("default")) {
            return null;
        }
        View viewPop = this.f10180c.get("default").pop();
        m12124q(this.f10180c.get("default").size());
        return viewPop;
    }

    @Override // p009l.col
    /* JADX INFO: renamed from: c */
    public boolean mo12116c() {
        if (this.f10180c.containsKey("default")) {
            return !this.f10180c.get("default").isEmpty();
        }
        return false;
    }

    @Override // p009l.col
    /* JADX INFO: renamed from: d */
    public c<roj0> mo12117d(final int i) {
        return this.f10181d.filter(new w9j() { // from class: l.zld
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() >= i);
            }
        }).map(new w9j() { // from class: l.amd
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    @Override // p009l.col
    /* JADX INFO: renamed from: g */
    public void mo12119g(Context context, mcr mcrVar) {
        if (this.f10182e) {
            return;
        }
        this.f10182e = true;
        wuh0 wuh0Var = new wuh0(context);
        for (int i = 0; i < f10176h; i++) {
            if (upa.d()) {
                if (i == 2) {
                    m12123p(wuh0Var);
                }
            } else if (i == 3) {
                m12123p(wuh0Var);
            }
            wuh0Var.d(mo12114a(false), (ViewGroup) null, this.f10184g);
        }
        mcrVar.creates(new e30() { // from class: l.xld
            public final void call(Object obj) {
                bmd.m12113l((Bundle) obj);
            }
        }, new d30() { // from class: l.yld
            public final void call() {
                this.f23136a.m12122o();
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public CacheCardType m12120m() {
        return this.f10183f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m12121n(View view, int i, ViewGroup viewGroup) {
        if (!this.f10180c.containsKey("default")) {
            this.f10180c.put("default", new ConcurrentLinkedDeque());
        }
        if (view instanceof NewNewProfileCard) {
            ((NewNewProfileCard) view).f566p2 = true;
        }
        this.f10180c.get("default").push(view);
        this.f10179b++;
        if (this.f10179b == (upa.d() ? 3 : 4)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            CoreSuggested coreSuggested = CoreModule.c.m0;
            coreSuggested.z2 = jCurrentTimeMillis - coreSuggested.y2;
            if (CoreModule.c.m0.A2 > 0 && CoreModule.c.m0.z2 > 0) {
                zvf0.B("e_homepage_network_and_layout", "p_suggest_users_home_view", new j760[]{new j760("suggest_network_time", Long.valueOf(CoreModule.c.m0.A2)), new j760("card_layout_time", Long.valueOf(CoreModule.c.m0.z2)), new j760("suggest_network_time_diff_card_layout_time", Long.valueOf(CoreModule.c.m0.A2 - CoreModule.c.m0.z2))});
            }
        }
        this.f10181d.onNext(Integer.valueOf(this.f10179b));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m12122o() {
        this.f10180c.clear();
        vi4.m23380c(m12120m());
    }

    /* JADX INFO: renamed from: p */
    public final void m12123p(wuh0 wuh0Var) {
        List<CardBottomFrame> listM1389j = C0031a.m1385i().m1389j();
        if (vwb.J(listM1389j)) {
            return;
        }
        for (CardBottomFrame cardBottomFrame : listM1389j) {
            if (cardBottomFrame.getFrameLayoutId() > 0) {
                wuh0Var.d(cardBottomFrame.getFrameLayoutId(), (ViewGroup) null, new C0788a(cardBottomFrame));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m12124q(int i) {
        if (this.f10179b != f10176h || i > f10177i) {
            return;
        }
        zvf0.B("e_preload_home_card_used", "p_suggest_users_home_view", new j760[]{j760.a("left_card_count", Integer.valueOf(i))});
    }

    @Override // p009l.col
    /* JADX INFO: renamed from: f */
    public void mo12118f() {
    }
}
