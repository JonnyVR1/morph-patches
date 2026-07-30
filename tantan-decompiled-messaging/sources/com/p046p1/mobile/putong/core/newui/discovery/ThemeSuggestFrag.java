package com.p046p1.mobile.putong.core.newui.discovery;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.GPTopicCard;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.newui.discovery.ThemeSuggestFrag;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.LookingFor;
import com.p046p1.mobile.putong.data.SuperlikeReason;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VPager;
import p149l.e30;
import p149l.f6c0;
import p149l.gmi0;
import p149l.j760;
import p149l.mkd0;
import p149l.rgj;
import p149l.roj0;
import p149l.vwb;
import p149l.w9j;
import p149l.x9j;
import p149l.xdl0;
import p149l.zki0;

/* JADX INFO: loaded from: classes11.dex */
public class ThemeSuggestFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public VPager f21372A;

    /* JADX INFO: renamed from: B */
    public VButton f21373B;

    /* JADX INFO: renamed from: D */
    public zki0 f21375D;

    /* JADX INFO: renamed from: z */
    public TabLayout f21378z;

    /* JADX INFO: renamed from: C */
    public List<GPTopicCard> f21374C = new ArrayList();

    /* JADX INFO: renamed from: E */
    public String f21376E = "nearby";

    /* JADX INFO: renamed from: F */
    public int f21377F = 0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.discovery.ThemeSuggestFrag$a */
    public class C7841a implements TabLayout.OnTabSelectedListener {
        public C7841a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            ThemeSuggestFrag.this.m36320k5();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (NullChecker.m81303a(tab) && NullChecker.m81303a(tab.getCustomView())) {
                ThemeSuggestFrag.this.f21377F = tab.getPosition();
                ThemeSuggestFrag themeSuggestFrag = ThemeSuggestFrag.this;
                themeSuggestFrag.f21376E = ((GPTopicCard) themeSuggestFrag.f21374C.get(tab.getPosition())).name;
                ThemeSuggestFrag themeSuggestFrag2 = ThemeSuggestFrag.this;
                String str = themeSuggestFrag2.f21376E;
                int i = themeSuggestFrag2.f21377F;
                if (TextUtils.isEmpty(str)) {
                    ThemeSuggestFrag themeSuggestFrag3 = ThemeSuggestFrag.this;
                    int i2 = themeSuggestFrag3.f21377F;
                    if (i2 == 0) {
                        themeSuggestFrag3.f21376E = "nearby";
                    } else if (i2 == 1) {
                        themeSuggestFrag3.f21376E = "online";
                    } else if (i2 == 2) {
                        themeSuggestFrag3.f21376E = SuperlikeReason.popular;
                    } else if (i2 == 3) {
                        themeSuggestFrag3.f21376E = ShareConstants.NEW_VERSION;
                    } else if (i2 == 4) {
                        themeSuggestFrag3.f21376E = "select";
                    }
                }
                ((SuggestTabItem) tab.getCustomView()).m36289q(((GPTopicCard) ThemeSuggestFrag.this.f21374C.get(tab.getPosition())).iconRes);
                boolean zM179167a = rgj.m179167a(ThemeSuggestFrag.this.f21376E);
                ThemeSuggestFrag themeSuggestFrag4 = ThemeSuggestFrag.this;
                if (zM179167a) {
                    xdl0.m208344M(themeSuggestFrag4.f21373B, true);
                    ThemeSuggestFrag themeSuggestFrag5 = ThemeSuggestFrag.this;
                    themeSuggestFrag5.f21373B.setText(((GPTopicCard) themeSuggestFrag5.f21374C.get(tab.getPosition())).payBtnDesc);
                } else {
                    xdl0.m208344M(themeSuggestFrag4.f21373B, false);
                }
                ThemeSuggestFrag.this.mo29638J4().m109040p(j760.m140076a("theme_type", ThemeSuggestFrag.this.f21376E));
                ThemeSuggestFrag.this.mo29638J4().m109036l();
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            ((SuggestTabItem) tab.getCustomView()).m36290z((GPTopicCard) ThemeSuggestFrag.this.f21374C.get(tab.getPosition()));
        }
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ LookingFor m36296M4(User user) {
        if (NullChecker.m81303a(user) && NullChecker.m81303a(user.settings)) {
            return user.settings.lookingFor;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c5 */
    public /* synthetic */ void m36311c5(List list) {
        this.f21374C = list;
        this.f21375D.m219181j(list);
        m36319j5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f5 */
    public /* synthetic */ void m36312f5(Boolean bool) {
        if (bool.booleanValue()) {
            xdl0.m208344M(this.f21373B, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g5 */
    public /* synthetic */ void m36313g5(View view) {
        String str;
        Privilege privilege = Privilege.see_theme_unlock_online;
        if (TextUtils.equals(this.f21376E, SuperlikeReason.popular)) {
            privilege = Privilege.see_theme_unlock_pop;
            str = "unlock_popular";
        } else {
            str = "unlock_online";
        }
        CoreModule.m29935P().m94651a().mo33622wr(act(), str, privilege);
    }

    /* JADX INFO: renamed from: b5 */
    public View m36314b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gmi0.m126983b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        CoreModule.f17545c.f19639e0.m169517n7();
        this.f21374C.addAll(rgj.m179168b(vwb.m200324f0(GPTopicCard.new_(), GPTopicCard.new_(), GPTopicCard.new_(), GPTopicCard.new_(), GPTopicCard.new_())));
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ Boolean m36315d5(HashMap map) {
        return Boolean.valueOf(NullChecker.m81303a(map.get(this.f21376E)));
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ Integer m36316e5(HashMap map) {
        return Integer.valueOf(((List) map.get(this.f21376E)).size());
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        duringCreated(CoreModule.f17545c.f19639e0.f149422m1).filter(new w9j() { // from class: l.xli0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.yli0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198899a.m36311c5((List) obj);
            }
        }));
        duringCreated(C22306c.combineLatest(CoreModule.f17545c.m31483n3().map(new w9j() { // from class: l.zli0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).likersLimit.remaining);
            }
        }), CoreModule.f17545c.f19639e0.f149430n1.first(new w9j() { // from class: l.ami0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f70626a.m36315d5((HashMap) obj);
            }
        }).map(new w9j() { // from class: l.bmi0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f76286a.m36316e5((HashMap) obj);
            }
        }), new x9j() { // from class: l.cmi0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new Pair((Integer) obj, (Integer) obj2);
            }
        })).map(new w9j() { // from class: l.dmi0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Pair pair = (Pair) obj;
                return Boolean.valueOf(((Integer) pair.first).intValue() > 0 || ((Integer) pair.second).intValue() <= 0);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.emi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92219a.m36312f5((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).map(new w9j() { // from class: l.fmi0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ThemeSuggestFrag.m36296M4((User) obj);
            }
        }).distinctUntilChanged().skip(1).subscribe(mkd0.m154955G(new e30() { // from class: l.tli0
            @Override // p149l.e30
            public final void call(Object obj) {
                e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.uli0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f17545c.f19639e0.m169517n7();
                    }
                }, 1000L);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f21375D = new zki0(getChildFragmentManager(), this.f21374C);
        this.f21372A.setOffscreenPageLimit(4);
        this.f21372A.setAdapter(this.f21375D);
        this.f21378z.setupWithViewPager(this.f21372A);
        this.f21372A.setCurrentItem(0);
        this.f21378z.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C7841a());
        xdl0.m208329E0(this.f21373B, new View.OnClickListener() { // from class: l.sli0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165232a.m36313g5(view);
            }
        });
        m36319j5();
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m36317h5(roj0 roj0Var) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ void m36318i5(Throwable th) {
        act().progressDismiss();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m36314b5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j5 */
    public final void m36319j5() {
        for (int i = 0; i < this.f21378z.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f21378z.getTabAt(i);
            GPTopicCard gPTopicCard = this.f21374C.get(i);
            SuggestTabItem suggestTabItem = (SuggestTabItem) mo20578H2().inflate(f6c0.f95698af, (ViewGroup) null);
            tabAt.setCustomView(suggestTabItem);
            if (this.f21377F == i) {
                suggestTabItem.m36289q(gPTopicCard.iconRes);
            } else {
                suggestTabItem.m36290z(gPTopicCard);
            }
            suggestTabItem.f21365f.setText(gPTopicCard.topicName);
        }
    }

    /* JADX INFO: renamed from: k5 */
    public final void m36320k5() {
        act().progress(R$string.f17842J5);
        duringCreated(CoreModule.f17545c.f19639e0.m169521o7(this.f21376E)).subscribe(mkd0.m154956H(new e30() { // from class: l.vli0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181952a.m36317h5((roj0) obj);
            }
        }, new e30() { // from class: l.wli0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186953a.m36318i5((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_explore_theme_recommend";
    }
}
