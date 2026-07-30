package com.p000p1.mobile.putong.core.p001ui.diamond;

import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.core.data.Merchandise;
import com.p000p1.mobile.putong.core.data.MonetizationConfiguration;
import com.p000p1.mobile.putong.core.data.ProductCategory;
import com.p000p1.mobile.putong.core.p001ui.diamond.TabUniteManager;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.e30;
import l.hpd0;
import l.jo0;
import l.mkd0;
import l.mqi0;
import l.tpd0;
import l.vwb;
import l.w9j;
import l.x9j;
import l.xma;
import l.y9j;
import l.zpd0;
import org.json.JSONObject;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class TabUniteManager {

    /* JADX INFO: renamed from: m */
    public static volatile TabUniteManager f1282m;

    /* JADX INFO: renamed from: a */
    public final zpd0 f1283a = new zpd0("tab_unite_time_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public final tpd0 f1284b = new tpd0("tab_unite_online_time_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: c */
    public final tpd0 f1285c = new tpd0("tab_unite_super_time_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: d */
    public final zpd0 f1286d = new zpd0("tab_unite_show_promotion_time_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: e */
    public final zpd0 f1287e = new zpd0("tab_unite_show_see_time_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public final zpd0 f1288f = new zpd0("tab_unite_show_boost_time_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: g */
    public final hpd0 f1289g = new hpd0("tab_unite_boost_third_time_" + CoreModule.H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: h */
    public final tpd0 f1290h = new tpd0("tab_unite_boost_time_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: i */
    public final zpd0 f1291i = new zpd0("tab_unite_show_o_diamond_time_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: j */
    public boolean f1292j = false;

    /* JADX INFO: renamed from: k */
    public final a<BadgeIconType> f1293k = a.c(BadgeIconType.NONE);

    /* JADX INFO: renamed from: l */
    public c4g0 f1294l;

    public enum BadgeIconType {
        NONE,
        PROMOTION,
        SEE,
        BOOST,
        BOOST_ONCE,
        ODIAMOND
    }

    public TabUniteManager() {
        m2270k();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2261b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2262c(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static TabUniteManager m2267i() {
        if (f1282m == null) {
            synchronized (TabUniteManager.class) {
                try {
                    if (f1282m == null) {
                        f1282m = new TabUniteManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f1282m;
    }

    /* JADX INFO: renamed from: h */
    public void m2268h(BadgeIconType badgeIconType) {
        if (badgeIconType == BadgeIconType.ODIAMOND) {
            this.f1291i.put(0L);
            return;
        }
        if (badgeIconType == BadgeIconType.PROMOTION) {
            this.f1286d.put(0L);
            return;
        }
        if (badgeIconType == BadgeIconType.SEE) {
            this.f1287e.put(0L);
            return;
        }
        if (badgeIconType == BadgeIconType.BOOST_ONCE) {
            this.f1289g.put(Boolean.FALSE);
            this.f1290h.put(0);
            return;
        }
        if (badgeIconType == BadgeIconType.BOOST) {
            this.f1288f.put(0L);
            this.f1290h.put(0);
        } else if (badgeIconType == BadgeIconType.NONE) {
            this.f1286d.put(0L);
            this.f1287e.put(0L);
            this.f1288f.put(0L);
            this.f1289g.put(Boolean.FALSE);
            this.f1290h.put(0);
            this.f1291i.put(0L);
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m2269j() {
        try {
            String strF = RemoteConfig.x().F("me_badge_icon_see_configs");
            if (TextUtils.isEmpty(strF)) {
                return 1;
            }
            return Math.max(new JSONObject(strF).getInt("see_interval_days"), 1);
        } catch (Exception unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2270k() {
        if (CoreModule.P().a().f()) {
            CoreModule.c.Q1.R.k().filter(new w9j() { // from class: l.tqh0
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.a((MonetizationConfiguration) obj));
                }
            }).take(1).delay(1L, TimeUnit.SECONDS).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.uqh0
                public final void call(Object obj) {
                    this.f7803a.m2272m((MonetizationConfiguration) obj);
                }
            }));
            if (!mqi0.D(((Long) this.f1283a.get()).longValue())) {
                this.f1283a.put(Long.valueOf(mqi0.o()));
                c.combineLatest(CoreModule.c.C0.x3(), CoreModule.c.n3(), new x9j() { // from class: l.vqh0
                    public final Object call(Object obj, Object obj2) {
                        return new Pair((List) obj, (Counter) obj2);
                    }
                }).first().subscribe(mkd0.H(new e30() { // from class: l.wqh0
                    public final void call(Object obj) {
                        this.f8222a.m2273n((Pair) obj);
                    }
                }, new e30() { // from class: l.xqh0
                    public final void call(Object obj) {
                        TabUniteManager.m2262c((Throwable) obj);
                    }
                }));
            }
            CoreModule.c.u0.Y6();
            this.f1294l = c.combineLatest(CoreModule.c.j0.E4().skip(1), CoreModule.c.u0.P6().skip(1), CoreModule.c.n3(), new y9j() { // from class: l.yqh0
                /* JADX INFO: renamed from: a */
                public final Object m11275a(Object obj, Object obj2, Object obj3) {
                    return Pair.create(Pair.create((List) obj, (CoreLikers.a) obj2), (Counter) obj3);
                }
            }).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.zqh0
                public final void call(Object obj) {
                    this.f9309a.m2274o((Pair) obj);
                }
            }, new e30() { // from class: l.arh0
                public final void call(Object obj) {
                    TabUniteManager.m2261b((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2271l() {
        long jLongValue = ((Long) this.f1286d.get()).longValue();
        long jLongValue2 = ((Long) this.f1287e.get()).longValue();
        long jLongValue3 = ((Long) this.f1288f.get()).longValue();
        long jLongValue4 = ((Long) this.f1291i.get()).longValue();
        if (mqi0.D(jLongValue) || mqi0.D(jLongValue2) || mqi0.D(jLongValue3)) {
            return true;
        }
        return CoreModule.P().a().f() && mqi0.D(jLongValue4);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m2272m(MonetizationConfiguration monetizationConfiguration) {
        long jLongValue = ((Long) this.f1291i.get()).longValue();
        BadgeIconType badgeIconType = BadgeIconType.NONE;
        BadgeIconType badgeIconType2 = (CoreModule.c.Q1.R.N() && jLongValue == 0 && !xma.F3()) ? BadgeIconType.ODIAMOND : badgeIconType;
        if (badgeIconType2 == badgeIconType || this.f1292j) {
            return;
        }
        this.f1292j = true;
        m2276q(badgeIconType2);
        this.f1293k.onNext(badgeIconType2);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m2273n(Pair pair) {
        this.f1284b.put(Integer.valueOf(CoreModule.P().a().b3()));
        this.f1285c.put(Integer.valueOf(CoreModule.c.o3().superLikeLimit.remainAll()));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m2274o(Pair pair) {
        BadgeIconType badgeIconType;
        if (m2271l()) {
            return;
        }
        boolean zA = NullChecker.a((Merchandise) vwb.r((Collection) ((Pair) pair.first).first, new w9j() { // from class: l.brh0
            public final Object call(Object obj) {
                Merchandise merchandise = (Merchandise) obj;
                return Boolean.valueOf((merchandise.category == ProductCategory.get(ProductCategory.tttVip) && (CoreModule.P().g().Le(merchandise) || CoreModule.P().g().pj(ProductCategory.tttVip, merchandise))) || (merchandise.category == ProductCategory.get("svip") && (CoreModule.P().g().Zs(merchandise) || CoreModule.P().g().pj("svip", merchandise))));
            }
        }));
        long jLongValue = ((Long) this.f1286d.get()).longValue();
        long jLongValue2 = ((Long) this.f1287e.get()).longValue();
        long jLongValue3 = ((Long) this.f1291i.get()).longValue();
        int iNf = CoreModule.P().a().Nf();
        int iIntValue = ((Integer) this.f1290h.get()).intValue();
        if (CoreModule.c.Q1.R.N() && jLongValue3 == 0 && !xma.F3() && CoreModule.P().a().f()) {
            badgeIconType = BadgeIconType.ODIAMOND;
        } else if (!zA || mqi0.D(jLongValue)) {
            badgeIconType = (((CoreLikers.a) ((Pair) pair.first).second).c <= 0 || !xma.e4() || mqi0.D(jLongValue2) || !mqi0.w(jLongValue2, m2269j() * 24)) ? BadgeIconType.NONE : BadgeIconType.SEE;
        } else {
            badgeIconType = BadgeIconType.PROMOTION;
        }
        if (iNf < iIntValue) {
            this.f1290h.put(Integer.valueOf(iNf));
        }
        if (badgeIconType == BadgeIconType.NONE || this.f1292j) {
            return;
        }
        this.f1292j = true;
        m2276q(badgeIconType);
        this.f1293k.onNext(badgeIconType);
    }

    /* JADX INFO: renamed from: p */
    public void m2275p() {
        mkd0.z(this.f1294l);
        this.f1294l = null;
        f1282m = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m2276q(BadgeIconType badgeIconType) {
        long jO = mqi0.o();
        if (badgeIconType == BadgeIconType.ODIAMOND) {
            this.f1291i.put(Long.valueOf(jO));
            return;
        }
        if (badgeIconType == BadgeIconType.PROMOTION) {
            this.f1286d.put(Long.valueOf(jO));
            return;
        }
        if (badgeIconType == BadgeIconType.SEE) {
            this.f1287e.put(Long.valueOf(jO));
            return;
        }
        if (badgeIconType == BadgeIconType.BOOST_ONCE) {
            this.f1289g.put(Boolean.TRUE);
            this.f1290h.put(Integer.valueOf(CoreModule.P().a().Nf()));
            this.f1288f.put(Long.valueOf(jO));
            return;
        }
        if (badgeIconType == BadgeIconType.BOOST) {
            this.f1290h.put(Integer.valueOf(CoreModule.P().a().Nf()));
            this.f1288f.put(Long.valueOf(jO));
        }
    }

    /* JADX INFO: renamed from: r */
    public void m2277r() {
        this.f1293k.onNext(BadgeIconType.ODIAMOND);
    }
}
