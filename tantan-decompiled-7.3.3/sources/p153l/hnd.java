package p153l;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C8018a;
import com.p051p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p051p1.mobile.putong.core.newui.home.cache.CacheCardType;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public class hnd implements nql {

    /* JADX INFO: renamed from: h */
    public static int f110720h = 10;

    /* JADX INFO: renamed from: i */
    public static int f110721i = 7;

    /* JADX INFO: renamed from: f */
    public CacheCardType f110727f;

    /* JADX INFO: renamed from: a */
    public boolean f110722a = false;

    /* JADX INFO: renamed from: b */
    public int f110723b = 0;

    /* JADX INFO: renamed from: c */
    public final HashMap<String, Deque<View>> f110724c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public C22507a<Integer> f110725d = C22507a.m222758b();

    /* JADX INFO: renamed from: e */
    public boolean f110726e = false;

    /* JADX INFO: renamed from: g */
    public final e3i0.InterfaceC16697e f110728g = new e3i0.InterfaceC16697e() { // from class: l.cnd
        @Override // p153l.e3i0.InterfaceC16697e
        /* JADX INFO: renamed from: a */
        public final void mo111496a(View view, int i, ViewGroup viewGroup) {
            this.f82713a.m136055n(view, i, viewGroup);
        }
    };

    /* JADX INFO: renamed from: l.hnd$a */
    public class C17512a implements e3i0.InterfaceC16697e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CardBottomFrame f110729a;

        public C17512a(CardBottomFrame cardBottomFrame) {
            this.f110729a = cardBottomFrame;
        }

        @Override // p153l.e3i0.InterfaceC16697e
        /* JADX INFO: renamed from: a */
        public void mo111496a(@NonNull View view, int i, @Nullable ViewGroup viewGroup) {
            if (C8018a.f22733g) {
                this.f110729a.getDes();
            }
            C8018a.m38417i().m38418f(view.getContext(), new qk4(this.f110729a, view, C8018a.m38417i().m38423l(this.f110729a)));
        }
    }

    public hnd(CacheCardType cacheCardType) {
        this.f110727f = cacheCardType;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m136047l(Bundle bundle) {
    }

    @Override // p153l.nql
    /* JADX INFO: renamed from: a */
    public int mo136048a(boolean z) {
        return kec0.f125796d8;
    }

    @Override // p153l.nql
    /* JADX INFO: renamed from: b */
    public View mo136049b() {
        if (!this.f110724c.containsKey("default")) {
            return null;
        }
        View viewPop = this.f110724c.get("default").pop();
        m136058q(this.f110724c.get("default").size());
        return viewPop;
    }

    @Override // p153l.nql
    /* JADX INFO: renamed from: c */
    public boolean mo136050c() {
        if (this.f110724c.containsKey("default")) {
            return !this.f110724c.get("default").isEmpty();
        }
        return false;
    }

    @Override // p153l.nql
    /* JADX INFO: renamed from: d */
    public C22421c<uxj0> mo136051d(final int i) {
        return this.f110725d.filter(new qcj() { // from class: l.fnd
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() >= i);
            }
        }).map(new qcj() { // from class: l.gnd
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    @Override // p153l.nql
    /* JADX INFO: renamed from: g */
    public void mo136053g(Context context, ner nerVar) {
        if (this.f110726e) {
            return;
        }
        this.f110726e = true;
        e3i0 e3i0Var = new e3i0(context);
        for (int i = 0; i < f110720h; i++) {
            if (gra.m131668d()) {
                if (i == 2) {
                    m136057p(e3i0Var);
                }
            } else if (i == 3) {
                m136057p(e3i0Var);
            }
            e3i0Var.m119299d(mo136048a(false), null, this.f110728g);
        }
        nerVar.creates(new y20() { // from class: l.dnd
            @Override // p153l.y20
            public final void call(Object obj) {
                hnd.m136047l((Bundle) obj);
            }
        }, new x20() { // from class: l.end
            @Override // p153l.x20
            public final void call() {
                this.f94763a.m136056o();
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public CacheCardType m136054m() {
        return this.f110727f;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m136055n(View view, int i, ViewGroup viewGroup) {
        if (!this.f110724c.containsKey("default")) {
            this.f110724c.put("default", new ConcurrentLinkedDeque());
        }
        if (view instanceof NewNewProfileCard) {
            ((NewNewProfileCard) view).f22530p2 = true;
        }
        this.f110724c.get("default").push(view);
        this.f110723b++;
        if (this.f110723b == (gra.m131668d() ? 3 : 4)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            CoreSuggested coreSuggested = CoreModule.f18264c.f20405m0;
            coreSuggested.f20213z2 = jCurrentTimeMillis - coreSuggested.f20210y2;
            if (CoreModule.f18264c.f20405m0.f20064A2 > 0 && CoreModule.f18264c.f20405m0.f20213z2 > 0) {
                i4g0.m138493B("e_homepage_network_and_layout", "p_suggest_users_home_view", new pf60("suggest_network_time", Long.valueOf(CoreModule.f18264c.f20405m0.f20064A2)), new pf60("card_layout_time", Long.valueOf(CoreModule.f18264c.f20405m0.f20213z2)), new pf60("suggest_network_time_diff_card_layout_time", Long.valueOf(CoreModule.f18264c.f20405m0.f20064A2 - CoreModule.f18264c.f20405m0.f20213z2)));
            }
        }
        this.f110725d.onNext(Integer.valueOf(this.f110723b));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m136056o() {
        this.f110724c.clear();
        uj4.m196318c(m136054m());
    }

    /* JADX INFO: renamed from: p */
    public final void m136057p(e3i0 e3i0Var) {
        List<CardBottomFrame> listM38421j = C8018a.m38417i().m38421j();
        if (jyb.m147479J(listM38421j)) {
            return;
        }
        for (CardBottomFrame cardBottomFrame : listM38421j) {
            if (cardBottomFrame.getFrameLayoutId() > 0) {
                e3i0Var.m119299d(cardBottomFrame.getFrameLayoutId(), null, new C17512a(cardBottomFrame));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m136058q(int i) {
        if (this.f110723b != f110720h || i > f110721i) {
            return;
        }
        i4g0.m138493B("e_preload_home_card_used", "p_suggest_users_home_view", pf60.m172085a("left_card_count", Integer.valueOf(i)));
    }

    @Override // p153l.nql
    /* JADX INFO: renamed from: f */
    public void mo136052f() {
    }
}
