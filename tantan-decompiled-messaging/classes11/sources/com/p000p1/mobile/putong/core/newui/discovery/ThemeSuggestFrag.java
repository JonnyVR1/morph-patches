package com.p000p1.mobile.putong.core.newui.discovery;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.core.newui.discovery.ThemeSuggestFrag;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.GPTopicCard;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.LookingFor;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.e30;
import l.e51;
import l.f6c0;
import l.gmi0;
import l.j760;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.w9j;
import l.x9j;
import l.xdl0;
import p009l.rgj;
import p009l.zki0;
import rx.c;
import v.VButton;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ThemeSuggestFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public VPager f150A;

    /* JADX INFO: renamed from: B */
    public VButton f151B;

    /* JADX INFO: renamed from: D */
    public zki0 f153D;

    /* JADX INFO: renamed from: z */
    public TabLayout f156z;

    /* JADX INFO: renamed from: C */
    public List<GPTopicCard> f152C = new ArrayList();

    /* JADX INFO: renamed from: E */
    public String f154E = "nearby";

    /* JADX INFO: renamed from: F */
    public int f155F = 0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.discovery.ThemeSuggestFrag$a */
    public class C0005a implements TabLayout.OnTabSelectedListener {
        public C0005a() {
        }

        public void onTabReselected(TabLayout.Tab tab) {
            ThemeSuggestFrag.this.m241k5();
        }

        public void onTabSelected(TabLayout.Tab tab) {
            if (NullChecker.a(tab) && NullChecker.a(tab.getCustomView())) {
                ThemeSuggestFrag.this.f155F = tab.getPosition();
                ThemeSuggestFrag themeSuggestFrag = ThemeSuggestFrag.this;
                themeSuggestFrag.f154E = ((GPTopicCard) themeSuggestFrag.f152C.get(tab.getPosition())).name;
                ThemeSuggestFrag themeSuggestFrag2 = ThemeSuggestFrag.this;
                String str = themeSuggestFrag2.f154E;
                int i = themeSuggestFrag2.f155F;
                if (TextUtils.isEmpty(str)) {
                    ThemeSuggestFrag themeSuggestFrag3 = ThemeSuggestFrag.this;
                    int i2 = themeSuggestFrag3.f155F;
                    if (i2 == 0) {
                        themeSuggestFrag3.f154E = "nearby";
                    } else if (i2 == 1) {
                        themeSuggestFrag3.f154E = "online";
                    } else if (i2 == 2) {
                        themeSuggestFrag3.f154E = "popular";
                    } else if (i2 == 3) {
                        themeSuggestFrag3.f154E = "new";
                    } else if (i2 == 4) {
                        themeSuggestFrag3.f154E = "select";
                    }
                }
                ((SuggestTabItem) tab.getCustomView()).m207q(((GPTopicCard) ThemeSuggestFrag.this.f152C.get(tab.getPosition())).iconRes);
                boolean zM21658a = rgj.m21658a(ThemeSuggestFrag.this.f154E);
                ThemeSuggestFrag themeSuggestFrag4 = ThemeSuggestFrag.this;
                if (zM21658a) {
                    xdl0.M(themeSuggestFrag4.f151B, true);
                    ThemeSuggestFrag themeSuggestFrag5 = ThemeSuggestFrag.this;
                    themeSuggestFrag5.f151B.setText(((GPTopicCard) themeSuggestFrag5.f152C.get(tab.getPosition())).payBtnDesc);
                } else {
                    xdl0.M(themeSuggestFrag4.f151B, false);
                }
                ThemeSuggestFrag.this.J4().p(new j760[]{j760.a("theme_type", ThemeSuggestFrag.this.f154E)});
                ThemeSuggestFrag.this.J4().l();
            }
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            ((SuggestTabItem) tab.getCustomView()).m208z((GPTopicCard) ThemeSuggestFrag.this.f152C.get(tab.getPosition()));
        }
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ LookingFor m214M4(User user) {
        if (NullChecker.a(user) && NullChecker.a(user.settings)) {
            return user.settings.lookingFor;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c5 */
    public /* synthetic */ void m229c5(List list) {
        this.f152C = list;
        this.f153D.m25851j(list);
        m240j5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f5 */
    public /* synthetic */ void m230f5(Boolean bool) {
        if (bool.booleanValue()) {
            xdl0.M(this.f151B, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g5 */
    public /* synthetic */ void m231g5(View view) {
        String str;
        Privilege privilege = Privilege.see_theme_unlock_online;
        if (TextUtils.equals(this.f154E, "popular")) {
            privilege = Privilege.see_theme_unlock_pop;
            str = "unlock_popular";
        } else {
            str = "unlock_online";
        }
        CoreModule.P().a().wr(act(), str, privilege);
    }

    /* JADX INFO: renamed from: b5 */
    public View m232b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gmi0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d4 */
    public void m233d4() {
        super.d4();
        CoreModule.c.e0.n7();
        this.f152C.addAll(rgj.m21659b(vwb.f0(new GPTopicCard[]{GPTopicCard.new_(), GPTopicCard.new_(), GPTopicCard.new_(), GPTopicCard.new_(), GPTopicCard.new_()})));
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ Boolean m234d5(HashMap map) {
        return Boolean.valueOf(NullChecker.a(map.get(this.f154E)));
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ Integer m235e5(HashMap map) {
        return Integer.valueOf(((List) map.get(this.f154E)).size());
    }

    /* JADX INFO: renamed from: f4 */
    public void m236f4() {
        super.f4();
        duringCreated(CoreModule.c.e0.m1).filter(new w9j() { // from class: l.xli0
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.J((List) obj));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.yli0
            public final void call(Object obj) {
                this.f23139a.m229c5((List) obj);
            }
        }));
        duringCreated(c.combineLatest(CoreModule.c.n3().map(new w9j() { // from class: l.zli0
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).likersLimit.remaining);
            }
        }), CoreModule.c.e0.n1.first(new w9j() { // from class: l.ami0
            public final Object call(Object obj) {
                return this.f9579a.m234d5((HashMap) obj);
            }
        }).map(new w9j() { // from class: l.bmi0
            public final Object call(Object obj) {
                return this.f10194a.m235e5((HashMap) obj);
            }
        }), new x9j() { // from class: l.cmi0
            public final Object call(Object obj, Object obj2) {
                return new Pair((Integer) obj, (Integer) obj2);
            }
        })).map(new w9j() { // from class: l.dmi0
            public final Object call(Object obj) {
                Pair pair = (Pair) obj;
                return Boolean.valueOf(((Integer) pair.first).intValue() > 0 || ((Integer) pair.second).intValue() <= 0);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.emi0
            public final void call(Object obj) {
                this.f12604a.m230f5((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.c.e0.o9()).map(new w9j() { // from class: l.fmi0
            public final Object call(Object obj) {
                return ThemeSuggestFrag.m214M4((User) obj);
            }
        }).distinctUntilChanged().skip(1).subscribe(mkd0.G(new e30() { // from class: l.tli0
            public final void call(Object obj) {
                e51.H(CoreModule.b, new Runnable() { // from class: l.uli0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.c.e0.n7();
                    }
                }, 1000L);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public void m237g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f153D = new zki0(getChildFragmentManager(), this.f152C);
        this.f150A.setOffscreenPageLimit(4);
        this.f150A.setAdapter(this.f153D);
        this.f156z.setupWithViewPager(this.f150A);
        this.f150A.setCurrentItem(0);
        this.f156z.addOnTabSelectedListener(new C0005a());
        xdl0.E0(this.f151B, new View.OnClickListener() { // from class: l.sli0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20356a.m231g5(view);
            }
        });
        m240j5();
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m238h5(roj0 roj0Var) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ void m239i5(Throwable th) {
        act().progressDismiss();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m232b5(layoutInflater, viewGroup);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, com.p1.mobile.putong.core.newui.discovery.SuggestTabItem] */
    /* JADX INFO: renamed from: j5 */
    public final void m240j5() {
        for (int i = 0; i < this.f156z.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f156z.getTabAt(i);
            GPTopicCard gPTopicCard = this.f152C.get(i);
            ?? r3 = (SuggestTabItem) H2().inflate(f6c0.af, (ViewGroup) null);
            tabAt.setCustomView((View) r3);
            if (this.f155F == i) {
                r3.m207q(gPTopicCard.iconRes);
            } else {
                r3.m208z(gPTopicCard);
            }
            r3.f143f.setText(gPTopicCard.topicName);
        }
    }

    /* JADX INFO: renamed from: k5 */
    public final void m241k5() {
        act().progress(R.string.J5);
        duringCreated(CoreModule.c.e0.o7(this.f154E)).subscribe(mkd0.H(new e30() { // from class: l.vli0
            public final void call(Object obj) {
                this.f21643a.m238h5((roj0) obj);
            }
        }, new e30() { // from class: l.wli0
            public final void call(Object obj) {
                this.f22186a.m239i5((Throwable) obj);
            }
        }));
    }

    public String pageId() {
        return "p_explore_theme_recommend";
    }
}
