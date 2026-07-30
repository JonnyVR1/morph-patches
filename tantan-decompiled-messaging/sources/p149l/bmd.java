package p149l;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.C7867a;
import com.p046p1.mobile.putong.core.newui.home.base.impl.cardbottom.opt.CardBottomFrame;
import com.p046p1.mobile.putong.core.newui.home.cache.CacheCardType;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class bmd implements col {

    /* JADX INFO: renamed from: h */
    public static int f76263h = 10;

    /* JADX INFO: renamed from: i */
    public static int f76264i = 7;

    /* JADX INFO: renamed from: f */
    public CacheCardType f76270f;

    /* JADX INFO: renamed from: a */
    public boolean f76265a = false;

    /* JADX INFO: renamed from: b */
    public int f76266b = 0;

    /* JADX INFO: renamed from: c */
    public final HashMap<String, Deque<View>> f76267c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public C22392a<Integer> f76268d = C22392a.m221512b();

    /* JADX INFO: renamed from: e */
    public boolean f76269e = false;

    /* JADX INFO: renamed from: g */
    public final wuh0.InterfaceC20963e f76271g = new wuh0.InterfaceC20963e() { // from class: l.wld
        @Override // p149l.wuh0.InterfaceC20963e
        /* JADX INFO: renamed from: a */
        public final void mo102516a(View view, int i, ViewGroup viewGroup) {
            this.f186891a.m102635n(view, i, viewGroup);
        }
    };

    /* JADX INFO: renamed from: l.bmd$a */
    public class C15907a implements wuh0.InterfaceC20963e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CardBottomFrame f76272a;

        public C15907a(CardBottomFrame cardBottomFrame) {
            this.f76272a = cardBottomFrame;
        }

        @Override // p149l.wuh0.InterfaceC20963e
        /* JADX INFO: renamed from: a */
        public void mo102516a(@NonNull View view, int i, @Nullable ViewGroup viewGroup) {
            if (C7867a.f21991g) {
                this.f76272a.getDes();
            }
            C7867a.m37414i().m37415f(view.getContext(), new rj4(this.f76272a, view, C7867a.m37414i().m37420l(this.f76272a)));
        }
    }

    public bmd(CacheCardType cacheCardType) {
        this.f76270f = cacheCardType;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m102627l(Bundle bundle) {
    }

    @Override // p149l.col
    /* JADX INFO: renamed from: a */
    public int mo102628a(boolean z) {
        return f6c0.f95626W7;
    }

    @Override // p149l.col
    /* JADX INFO: renamed from: b */
    public View mo102629b() {
        if (!this.f76267c.containsKey("default")) {
            return null;
        }
        View viewPop = this.f76267c.get("default").pop();
        m102638q(this.f76267c.get("default").size());
        return viewPop;
    }

    @Override // p149l.col
    /* JADX INFO: renamed from: c */
    public boolean mo102630c() {
        if (this.f76267c.containsKey("default")) {
            return !this.f76267c.get("default").isEmpty();
        }
        return false;
    }

    @Override // p149l.col
    /* JADX INFO: renamed from: d */
    public C22306c<roj0> mo102631d(final int i) {
        return this.f76268d.filter(new w9j() { // from class: l.zld
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() >= i);
            }
        }).map(new w9j() { // from class: l.amd
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    @Override // p149l.col
    /* JADX INFO: renamed from: g */
    public void mo102633g(Context context, mcr mcrVar) {
        if (this.f76269e) {
            return;
        }
        this.f76269e = true;
        wuh0 wuh0Var = new wuh0(context);
        for (int i = 0; i < f76263h; i++) {
            if (upa.m194737d()) {
                if (i == 2) {
                    m102637p(wuh0Var);
                }
            } else if (i == 3) {
                m102637p(wuh0Var);
            }
            wuh0Var.m205638d(mo102628a(false), null, this.f76271g);
        }
        mcrVar.creates(new e30() { // from class: l.xld
            @Override // p149l.e30
            public final void call(Object obj) {
                bmd.m102627l((Bundle) obj);
            }
        }, new d30() { // from class: l.yld
            @Override // p149l.d30
            public final void call() {
                this.f198875a.m102636o();
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public CacheCardType m102634m() {
        return this.f76270f;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m102635n(View view, int i, ViewGroup viewGroup) {
        if (!this.f76267c.containsKey("default")) {
            this.f76267c.put("default", new ConcurrentLinkedDeque());
        }
        if (view instanceof NewNewProfileCard) {
            ((NewNewProfileCard) view).f21788p2 = true;
        }
        this.f76267c.get("default").push(view);
        this.f76266b++;
        if (this.f76266b == (upa.m194737d() ? 3 : 4)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            CoreSuggested coreSuggested = CoreModule.f17545c.f19663m0;
            coreSuggested.f19471z2 = jCurrentTimeMillis - coreSuggested.f19468y2;
            if (CoreModule.f17545c.f19663m0.f19322A2 > 0 && CoreModule.f17545c.f19663m0.f19471z2 > 0) {
                zvf0.m220369B("e_homepage_network_and_layout", "p_suggest_users_home_view", new j760("suggest_network_time", Long.valueOf(CoreModule.f17545c.f19663m0.f19322A2)), new j760("card_layout_time", Long.valueOf(CoreModule.f17545c.f19663m0.f19471z2)), new j760("suggest_network_time_diff_card_layout_time", Long.valueOf(CoreModule.f17545c.f19663m0.f19322A2 - CoreModule.f17545c.f19663m0.f19471z2)));
            }
        }
        this.f76268d.onNext(Integer.valueOf(this.f76266b));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m102636o() {
        this.f76267c.clear();
        vi4.m198497c(m102634m());
    }

    /* JADX INFO: renamed from: p */
    public final void m102637p(wuh0 wuh0Var) {
        List<CardBottomFrame> listM37418j = C7867a.m37414i().m37418j();
        if (vwb.m200296J(listM37418j)) {
            return;
        }
        for (CardBottomFrame cardBottomFrame : listM37418j) {
            if (cardBottomFrame.getFrameLayoutId() > 0) {
                wuh0Var.m205638d(cardBottomFrame.getFrameLayoutId(), null, new C15907a(cardBottomFrame));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m102638q(int i) {
        if (this.f76266b != f76263h || i > f76264i) {
            return;
        }
        zvf0.m220369B("e_preload_home_card_used", "p_suggest_users_home_view", j760.m140076a("left_card_count", Integer.valueOf(i)));
    }

    @Override // p149l.col
    /* JADX INFO: renamed from: f */
    public void mo102632f() {
    }
}
