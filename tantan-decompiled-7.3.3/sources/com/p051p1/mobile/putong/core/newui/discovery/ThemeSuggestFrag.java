package com.p051p1.mobile.putong.core.newui.discovery;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.GPTopicCard;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.newui.discovery.ThemeSuggestFrag;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.LookingFor;
import com.p051p1.mobile.putong.data.SuperlikeReason;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VPager;
import p153l.bnl0;
import p153l.gvi0;
import p153l.jyb;
import p153l.kec0;
import p153l.ljj;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.rcj;
import p153l.uxj0;
import p153l.y20;
import p153l.zti0;

/* JADX INFO: loaded from: classes11.dex */
public class ThemeSuggestFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public VPager f22114A;

    /* JADX INFO: renamed from: B */
    public VButton f22115B;

    /* JADX INFO: renamed from: D */
    public zti0 f22117D;

    /* JADX INFO: renamed from: z */
    public TabLayout f22120z;

    /* JADX INFO: renamed from: C */
    public List<GPTopicCard> f22116C = new ArrayList();

    /* JADX INFO: renamed from: E */
    public String f22118E = "nearby";

    /* JADX INFO: renamed from: F */
    public int f22119F = 0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.discovery.ThemeSuggestFrag$a */
    public class C7992a implements TabLayout.OnTabSelectedListener {
        public C7992a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            ThemeSuggestFrag.this.m37323k5();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (NullChecker.m82486a(tab) && NullChecker.m82486a(tab.getCustomView())) {
                ThemeSuggestFrag.this.f22119F = tab.getPosition();
                ThemeSuggestFrag themeSuggestFrag = ThemeSuggestFrag.this;
                themeSuggestFrag.f22118E = ((GPTopicCard) themeSuggestFrag.f22116C.get(tab.getPosition())).name;
                ThemeSuggestFrag themeSuggestFrag2 = ThemeSuggestFrag.this;
                String str = themeSuggestFrag2.f22118E;
                int i = themeSuggestFrag2.f22119F;
                if (TextUtils.isEmpty(str)) {
                    ThemeSuggestFrag themeSuggestFrag3 = ThemeSuggestFrag.this;
                    int i2 = themeSuggestFrag3.f22119F;
                    if (i2 == 0) {
                        themeSuggestFrag3.f22118E = "nearby";
                    } else if (i2 == 1) {
                        themeSuggestFrag3.f22118E = "online";
                    } else if (i2 == 2) {
                        themeSuggestFrag3.f22118E = SuperlikeReason.popular;
                    } else if (i2 == 3) {
                        themeSuggestFrag3.f22118E = ShareConstants.NEW_VERSION;
                    } else if (i2 == 4) {
                        themeSuggestFrag3.f22118E = "select";
                    }
                }
                ((SuggestTabItem) tab.getCustomView()).m37292q(((GPTopicCard) ThemeSuggestFrag.this.f22116C.get(tab.getPosition())).iconRes);
                boolean zM154509a = ljj.m154509a(ThemeSuggestFrag.this.f22118E);
                ThemeSuggestFrag themeSuggestFrag4 = ThemeSuggestFrag.this;
                if (zM154509a) {
                    bnl0.m105524M(themeSuggestFrag4.f22115B, true);
                    ThemeSuggestFrag themeSuggestFrag5 = ThemeSuggestFrag.this;
                    themeSuggestFrag5.f22115B.setText(((GPTopicCard) themeSuggestFrag5.f22116C.get(tab.getPosition())).payBtnDesc);
                } else {
                    bnl0.m105524M(themeSuggestFrag4.f22115B, false);
                }
                ThemeSuggestFrag.this.mo30636J4().m152781p(pf60.m172085a("theme_type", ThemeSuggestFrag.this.f22118E));
                ThemeSuggestFrag.this.mo30636J4().m152777l();
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            ((SuggestTabItem) tab.getCustomView()).m37293z((GPTopicCard) ThemeSuggestFrag.this.f22116C.get(tab.getPosition()));
        }
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ LookingFor m37299M4(User user) {
        if (NullChecker.m82486a(user) && NullChecker.m82486a(user.settings)) {
            return user.settings.lookingFor;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c5 */
    public /* synthetic */ void m37314c5(List list) {
        this.f22116C = list;
        this.f22117D.m221540j(list);
        m37322j5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f5 */
    public /* synthetic */ void m37315f5(Boolean bool) {
        if (bool.booleanValue()) {
            bnl0.m105524M(this.f22115B, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g5 */
    public /* synthetic */ void m37316g5(View view) {
        String str;
        Privilege privilege = Privilege.see_theme_unlock_online;
        if (TextUtils.equals(this.f22118E, SuperlikeReason.popular)) {
            privilege = Privilege.see_theme_unlock_pop;
            str = "unlock_popular";
        } else {
            str = "unlock_online";
        }
        CoreModule.m30933P().m143405a().mo34625wr(act(), str, privilege);
    }

    /* JADX INFO: renamed from: b5 */
    public View m37317b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gvi0.m132558b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        CoreModule.f18264c.f20381e0.m116590n7();
        this.f22116C.addAll(ljj.m154510b(jyb.m147507f0(GPTopicCard.new_(), GPTopicCard.new_(), GPTopicCard.new_(), GPTopicCard.new_(), GPTopicCard.new_())));
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ Boolean m37318d5(HashMap map) {
        return Boolean.valueOf(NullChecker.m82486a(map.get(this.f22118E)));
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ Integer m37319e5(HashMap map) {
        return Integer.valueOf(((List) map.get(this.f22118E)).size());
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        duringCreated(CoreModule.f18264c.f20381e0.f89279m1).filter(new qcj() { // from class: l.xui0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.yui0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201620a.m37314c5((List) obj);
            }
        }));
        duringCreated(C22421c.combineLatest(CoreModule.f18264c.m32486n3().map(new qcj() { // from class: l.zui0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).likersLimit.remaining);
            }
        }), CoreModule.f18264c.f20381e0.f89287n1.first(new qcj() { // from class: l.avi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f73622a.m37318d5((HashMap) obj);
            }
        }).map(new qcj() { // from class: l.bvi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f78598a.m37319e5((HashMap) obj);
            }
        }), new rcj() { // from class: l.cvi0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new Pair((Integer) obj, (Integer) obj2);
            }
        })).map(new qcj() { // from class: l.dvi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Pair pair = (Pair) obj;
                return Boolean.valueOf(((Integer) pair.first).intValue() > 0 || ((Integer) pair.second).intValue() <= 0);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.evi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96004a.m37315f5((Boolean) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).map(new qcj() { // from class: l.fvi0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ThemeSuggestFrag.m37299M4((User) obj);
            }
        }).distinctUntilChanged().skip(1).subscribe(psd0.m173596G(new y20() { // from class: l.tui0
            @Override // p153l.y20
            public final void call(Object obj) {
                l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.uui0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f18264c.f20381e0.m116590n7();
                    }
                }, 1000L);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f22117D = new zti0(getChildFragmentManager(), this.f22116C);
        this.f22114A.setOffscreenPageLimit(4);
        this.f22114A.setAdapter(this.f22117D);
        this.f22120z.setupWithViewPager(this.f22114A);
        this.f22114A.setCurrentItem(0);
        this.f22120z.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C7992a());
        bnl0.m105509E0(this.f22115B, new View.OnClickListener() { // from class: l.sui0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170690a.m37316g5(view);
            }
        });
        m37322j5();
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ void m37320h5(uxj0 uxj0Var) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: i5 */
    public final /* synthetic */ void m37321i5(Throwable th) {
        act().progressDismiss();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m37317b5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j5 */
    public final void m37322j5() {
        for (int i = 0; i < this.f22120z.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f22120z.getTabAt(i);
            GPTopicCard gPTopicCard = this.f22116C.get(i);
            SuggestTabItem suggestTabItem = (SuggestTabItem) mo21577H2().inflate(kec0.f125871hf, (ViewGroup) null);
            tabAt.setCustomView(suggestTabItem);
            if (this.f22119F == i) {
                suggestTabItem.m37292q(gPTopicCard.iconRes);
            } else {
                suggestTabItem.m37293z(gPTopicCard);
            }
            suggestTabItem.f22107f.setText(gPTopicCard.topicName);
        }
    }

    /* JADX INFO: renamed from: k5 */
    public final void m37323k5() {
        act().progress(R$string.f18632L5);
        duringCreated(CoreModule.f18264c.f20381e0.m116594o7(this.f22118E)).subscribe(psd0.m173597H(new y20() { // from class: l.vui0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185818a.m37320h5((uxj0) obj);
            }
        }, new y20() { // from class: l.wui0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190867a.m37321i5((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_explore_theme_recommend";
    }
}
