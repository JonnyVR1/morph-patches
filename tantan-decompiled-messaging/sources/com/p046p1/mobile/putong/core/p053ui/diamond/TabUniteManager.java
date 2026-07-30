package com.p046p1.mobile.putong.core.p053ui.diamond;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationConfiguration;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.p053ui.diamond.TabUniteManager;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.c4g0;
import p149l.e30;
import p149l.hpd0;
import p149l.jo0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.tpd0;
import p149l.vwb;
import p149l.w9j;
import p149l.x9j;
import p149l.xma;
import p149l.y9j;
import p149l.zpd0;

/* JADX INFO: loaded from: classes10.dex */
public class TabUniteManager {

    /* JADX INFO: renamed from: m */
    public static volatile TabUniteManager f28888m;

    /* JADX INFO: renamed from: a */
    public final zpd0 f28889a = new zpd0("tab_unite_time_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public final tpd0 f28890b = new tpd0("tab_unite_online_time_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: c */
    public final tpd0 f28891c = new tpd0("tab_unite_super_time_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: d */
    public final zpd0 f28892d = new zpd0("tab_unite_show_promotion_time_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: e */
    public final zpd0 f28893e = new zpd0("tab_unite_show_see_time_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public final zpd0 f28894f = new zpd0("tab_unite_show_boost_time_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: g */
    public final hpd0 f28895g = new hpd0("tab_unite_boost_third_time_" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: h */
    public final tpd0 f28896h = new tpd0("tab_unite_boost_time_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: i */
    public final zpd0 f28897i = new zpd0("tab_unite_show_o_diamond_time_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: j */
    public boolean f28898j = false;

    /* JADX INFO: renamed from: k */
    public final C22392a<BadgeIconType> f28899k = C22392a.m221513c(BadgeIconType.NONE);

    /* JADX INFO: renamed from: l */
    public c4g0 f28900l;

    public enum BadgeIconType {
        NONE,
        PROMOTION,
        SEE,
        BOOST,
        BOOST_ONCE,
        ODIAMOND
    }

    public TabUniteManager() {
        m44956k();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m44947b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m44948c(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static TabUniteManager m44953i() {
        if (f28888m == null) {
            synchronized (TabUniteManager.class) {
                try {
                    if (f28888m == null) {
                        f28888m = new TabUniteManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f28888m;
    }

    /* JADX INFO: renamed from: h */
    public void m44954h(BadgeIconType badgeIconType) {
        if (badgeIconType == BadgeIconType.ODIAMOND) {
            this.f28897i.put(0L);
            return;
        }
        if (badgeIconType == BadgeIconType.PROMOTION) {
            this.f28892d.put(0L);
            return;
        }
        if (badgeIconType == BadgeIconType.SEE) {
            this.f28893e.put(0L);
            return;
        }
        if (badgeIconType == BadgeIconType.BOOST_ONCE) {
            this.f28895g.put(Boolean.FALSE);
            this.f28896h.put(0);
            return;
        }
        if (badgeIconType == BadgeIconType.BOOST) {
            this.f28894f.put(0L);
            this.f28896h.put(0);
        } else if (badgeIconType == BadgeIconType.NONE) {
            this.f28892d.put(0L);
            this.f28893e.put(0L);
            this.f28894f.put(0L);
            this.f28895g.put(Boolean.FALSE);
            this.f28896h.put(0);
            this.f28897i.put(0L);
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m44955j() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("me_badge_icon_see_configs");
            if (TextUtils.isEmpty(strM79302F)) {
                return 1;
            }
            return Math.max(new JSONObject(strM79302F).getInt("see_interval_days"), 1);
        } catch (Exception unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m44956k() {
        if (CoreModule.m29935P().m94651a().mo158371f()) {
            CoreModule.f17545c.f19598Q1.f20117R.m121230k().filter(new w9j() { // from class: l.tqh0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m81303a((MonetizationConfiguration) obj));
                }
            }).take(1).delay(1L, TimeUnit.SECONDS).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.uqh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f177751a.m44958m((MonetizationConfiguration) obj);
                }
            }));
            if (!mqi0.m155929D(this.f28889a.get().longValue())) {
                this.f28889a.put(Long.valueOf(mqi0.m155944o()));
                C22306c.combineLatest(CoreModule.f17545c.f19555C0.m210114x3(), CoreModule.f17545c.m31483n3(), new x9j() { // from class: l.vqh0
                    @Override // p149l.x9j
                    public final Object call(Object obj, Object obj2) {
                        return new Pair((List) obj, (Counter) obj2);
                    }
                }).first().subscribe(mkd0.m154956H(new e30() { // from class: l.wqh0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f187693a.m44959n((Pair) obj);
                    }
                }, new e30() { // from class: l.xqh0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        TabUniteManager.m44948c((Throwable) obj);
                    }
                }));
            }
            CoreModule.f17545c.f19687u0.m30425Y6();
            this.f28900l = C22306c.combineLatest(CoreModule.f17545c.f19654j0.m30580E4().skip(1), CoreModule.f17545c.f19687u0.m30407P6().skip(1), CoreModule.f17545c.m31483n3(), new y9j() { // from class: l.yqh0
                @Override // p149l.y9j
                /* JADX INFO: renamed from: a */
                public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                    return Pair.create(Pair.create((List) obj, (CoreLikers.C4719a) obj2), (Counter) obj3);
                }
            }).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.zqh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f204384a.m44960o((Pair) obj);
                }
            }, new e30() { // from class: l.arh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    TabUniteManager.m44947b((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m44957l() {
        long jLongValue = this.f28892d.get().longValue();
        long jLongValue2 = this.f28893e.get().longValue();
        long jLongValue3 = this.f28894f.get().longValue();
        long jLongValue4 = this.f28897i.get().longValue();
        if (mqi0.m155929D(jLongValue) || mqi0.m155929D(jLongValue2) || mqi0.m155929D(jLongValue3)) {
            return true;
        }
        return CoreModule.m29935P().m94651a().mo158371f() && mqi0.m155929D(jLongValue4);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m44958m(MonetizationConfiguration monetizationConfiguration) {
        long jLongValue = this.f28897i.get().longValue();
        BadgeIconType badgeIconType = BadgeIconType.NONE;
        BadgeIconType badgeIconType2 = (CoreModule.f17545c.f19598Q1.f20117R.m34760N() && jLongValue == 0 && !xma.m210043F3()) ? BadgeIconType.ODIAMOND : badgeIconType;
        if (badgeIconType2 == badgeIconType || this.f28898j) {
            return;
        }
        this.f28898j = true;
        m44962q(badgeIconType2);
        this.f28899k.m132487l(badgeIconType2);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m44959n(Pair pair) {
        this.f28890b.put(Integer.valueOf(CoreModule.m29935P().m94651a().mo33468b3()));
        this.f28891c.put(Integer.valueOf(CoreModule.f17545c.m31484o3().superLikeLimit.remainAll()));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m44960o(Pair pair) {
        BadgeIconType badgeIconType;
        if (m44957l()) {
            return;
        }
        boolean zM81303a = NullChecker.m81303a((Merchandise) vwb.m200346r((Collection) ((Pair) pair.first).first, new w9j() { // from class: l.brh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Merchandise merchandise = (Merchandise) obj;
                return Boolean.valueOf((merchandise.category == ProductCategory.get(ProductCategory.tttVip) && (CoreModule.m29935P().m94656g().mo35019Le(merchandise) || CoreModule.m29935P().m94656g().mo35072pj(ProductCategory.tttVip, merchandise))) || (merchandise.category == ProductCategory.get("svip") && (CoreModule.m29935P().m94656g().mo35045Zs(merchandise) || CoreModule.m29935P().m94656g().mo35072pj("svip", merchandise))));
            }
        }));
        long jLongValue = this.f28892d.get().longValue();
        long jLongValue2 = this.f28893e.get().longValue();
        long jLongValue3 = this.f28897i.get().longValue();
        int iMo33375Nf = CoreModule.m29935P().m94651a().mo33375Nf();
        int iIntValue = this.f28896h.get().intValue();
        if (CoreModule.f17545c.f19598Q1.f20117R.m34760N() && jLongValue3 == 0 && !xma.m210043F3() && CoreModule.m29935P().m94651a().mo158371f()) {
            badgeIconType = BadgeIconType.ODIAMOND;
        } else if (!zM81303a || mqi0.m155929D(jLongValue)) {
            badgeIconType = (((CoreLikers.C4719a) ((Pair) pair.first).second).f19271c <= 0 || !xma.m210071e4() || mqi0.m155929D(jLongValue2) || !mqi0.m155952w(jLongValue2, m44955j() * 24)) ? BadgeIconType.NONE : BadgeIconType.SEE;
        } else {
            badgeIconType = BadgeIconType.PROMOTION;
        }
        if (iMo33375Nf < iIntValue) {
            this.f28896h.put(Integer.valueOf(iMo33375Nf));
        }
        if (badgeIconType == BadgeIconType.NONE || this.f28898j) {
            return;
        }
        this.f28898j = true;
        m44962q(badgeIconType);
        this.f28899k.m132487l(badgeIconType);
    }

    /* JADX INFO: renamed from: p */
    public void m44961p() {
        mkd0.m154992z(this.f28900l);
        this.f28900l = null;
        f28888m = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m44962q(BadgeIconType badgeIconType) {
        long jM155944o = mqi0.m155944o();
        if (badgeIconType == BadgeIconType.ODIAMOND) {
            this.f28897i.put(Long.valueOf(jM155944o));
            return;
        }
        if (badgeIconType == BadgeIconType.PROMOTION) {
            this.f28892d.put(Long.valueOf(jM155944o));
            return;
        }
        if (badgeIconType == BadgeIconType.SEE) {
            this.f28893e.put(Long.valueOf(jM155944o));
            return;
        }
        if (badgeIconType == BadgeIconType.BOOST_ONCE) {
            this.f28895g.put(Boolean.TRUE);
            this.f28896h.put(Integer.valueOf(CoreModule.m29935P().m94651a().mo33375Nf()));
            this.f28894f.put(Long.valueOf(jM155944o));
            return;
        }
        if (badgeIconType == BadgeIconType.BOOST) {
            this.f28896h.put(Integer.valueOf(CoreModule.m29935P().m94651a().mo33375Nf()));
            this.f28894f.put(Long.valueOf(jM155944o));
        }
    }

    /* JADX INFO: renamed from: r */
    public void m44963r() {
        this.f28899k.m132487l(BadgeIconType.ODIAMOND);
    }
}
