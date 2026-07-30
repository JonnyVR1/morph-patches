package com.p051p1.mobile.putong.core.p058ui.diamond;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationConfiguration;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.p058ui.diamond.TabUniteManager;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.byd0;
import p153l.fo0;
import p153l.joa;
import p153l.jxd0;
import p153l.jyb;
import p153l.kcg0;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.rcj;
import p153l.scj;
import p153l.vxd0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class TabUniteManager {

    /* JADX INFO: renamed from: m */
    public static volatile TabUniteManager f29736m;

    /* JADX INFO: renamed from: a */
    public final byd0 f29737a = new byd0("tab_unite_time_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public final vxd0 f29738b = new vxd0("tab_unite_online_time_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: c */
    public final vxd0 f29739c = new vxd0("tab_unite_super_time_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: d */
    public final byd0 f29740d = new byd0("tab_unite_show_promotion_time_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: e */
    public final byd0 f29741e = new byd0("tab_unite_show_see_time_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: f */
    public final byd0 f29742f = new byd0("tab_unite_show_boost_time_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: g */
    public final jxd0 f29743g = new jxd0("tab_unite_boost_third_time_" + CoreModule.m30929H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: h */
    public final vxd0 f29744h = new vxd0("tab_unite_boost_time_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: i */
    public final byd0 f29745i = new byd0("tab_unite_show_o_diamond_time_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: j */
    public boolean f29746j = false;

    /* JADX INFO: renamed from: k */
    public final C22507a<BadgeIconType> f29747k = C22507a.m222759c(BadgeIconType.NONE);

    /* JADX INFO: renamed from: l */
    public kcg0 f29748l;

    public enum BadgeIconType {
        NONE,
        PROMOTION,
        SEE,
        BOOST,
        BOOST_ONCE,
        ODIAMOND
    }

    public TabUniteManager() {
        m46139k();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m46130b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m46131c(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static TabUniteManager m46136i() {
        if (f29736m == null) {
            synchronized (TabUniteManager.class) {
                try {
                    if (f29736m == null) {
                        f29736m = new TabUniteManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f29736m;
    }

    /* JADX INFO: renamed from: h */
    public void m46137h(BadgeIconType badgeIconType) {
        if (badgeIconType == BadgeIconType.ODIAMOND) {
            this.f29745i.put(0L);
            return;
        }
        if (badgeIconType == BadgeIconType.PROMOTION) {
            this.f29740d.put(0L);
            return;
        }
        if (badgeIconType == BadgeIconType.SEE) {
            this.f29741e.put(0L);
            return;
        }
        if (badgeIconType == BadgeIconType.BOOST_ONCE) {
            this.f29743g.put(Boolean.FALSE);
            this.f29744h.put(0);
            return;
        }
        if (badgeIconType == BadgeIconType.BOOST) {
            this.f29742f.put(0L);
            this.f29744h.put(0);
        } else if (badgeIconType == BadgeIconType.NONE) {
            this.f29740d.put(0L);
            this.f29741e.put(0L);
            this.f29742f.put(0L);
            this.f29743g.put(Boolean.FALSE);
            this.f29744h.put(0);
            this.f29745i.put(0L);
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m46138j() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("me_badge_icon_see_configs");
            if (TextUtils.isEmpty(strM80485F)) {
                return 1;
            }
            return Math.max(new JSONObject(strM80485F).getInt("see_interval_days"), 1);
        } catch (Exception unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m46139k() {
        if (CoreModule.m30933P().m143405a().mo180463f()) {
            CoreModule.f18264c.f20340Q1.f20859R.m159274k().filter(new qcj() { // from class: l.bzh0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m82486a((MonetizationConfiguration) obj));
                }
            }).take(1).delay(1L, TimeUnit.SECONDS).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.czh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f84474a.m46141m((MonetizationConfiguration) obj);
                }
            }));
            if (!pzi0.m174439D(this.f29737a.get().longValue())) {
                this.f29737a.put(Long.valueOf(pzi0.m174454o()));
                C22421c.combineLatest(CoreModule.f18264c.f20297C0.m146427y3(), CoreModule.f18264c.m32486n3(), new rcj() { // from class: l.dzh0
                    @Override // p153l.rcj
                    public final Object call(Object obj, Object obj2) {
                        return new Pair((List) obj, (Counter) obj2);
                    }
                }).first().subscribe(psd0.m173597H(new y20() { // from class: l.ezh0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f96597a.m46142n((Pair) obj);
                    }
                }, new y20() { // from class: l.fzh0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        TabUniteManager.m46131c((Throwable) obj);
                    }
                }));
            }
            CoreModule.f18264c.f20429u0.m31435c7();
            this.f29748l = C22421c.combineLatest(CoreModule.f18264c.f20396j0.m31583E4().skip(1), CoreModule.f18264c.f20429u0.m31417T6().skip(1), CoreModule.f18264c.m32486n3(), new scj() { // from class: l.gzh0
                @Override // p153l.scj
                /* JADX INFO: renamed from: a */
                public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                    return Pair.create(Pair.create((List) obj, (CoreLikers.C4870a) obj2), (Counter) obj3);
                }
            }).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.hzh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f112246a.m46143o((Pair) obj);
                }
            }, new y20() { // from class: l.izh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    TabUniteManager.m46130b((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m46140l() {
        long jLongValue = this.f29740d.get().longValue();
        long jLongValue2 = this.f29741e.get().longValue();
        long jLongValue3 = this.f29742f.get().longValue();
        long jLongValue4 = this.f29745i.get().longValue();
        if (pzi0.m174439D(jLongValue) || pzi0.m174439D(jLongValue2) || pzi0.m174439D(jLongValue3)) {
            return true;
        }
        return CoreModule.m30933P().m143405a().mo180463f() && pzi0.m174439D(jLongValue4);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m46141m(MonetizationConfiguration monetizationConfiguration) {
        long jLongValue = this.f29745i.get().longValue();
        BadgeIconType badgeIconType = BadgeIconType.NONE;
        BadgeIconType badgeIconType2 = (CoreModule.f18264c.f20340Q1.f20859R.m35763N() && jLongValue == 0 && !joa.m146357G3()) ? BadgeIconType.ODIAMOND : badgeIconType;
        if (badgeIconType2 == badgeIconType || this.f29746j) {
            return;
        }
        this.f29746j = true;
        m46145q(badgeIconType2);
        this.f29747k.m137019l(badgeIconType2);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m46142n(Pair pair) {
        this.f29738b.put(Integer.valueOf(CoreModule.m30933P().m143405a().mo34471b3()));
        this.f29739c.put(Integer.valueOf(CoreModule.f18264c.m32487o3().superLikeLimit.remainAll()));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m46143o(Pair pair) {
        BadgeIconType badgeIconType;
        if (m46140l()) {
            return;
        }
        boolean zM82486a = NullChecker.m82486a((Merchandise) jyb.m147529r((Collection) ((Pair) pair.first).first, new qcj() { // from class: l.jzh0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Merchandise merchandise = (Merchandise) obj;
                return Boolean.valueOf((merchandise.category == ProductCategory.get(ProductCategory.tttVip) && (CoreModule.m30933P().m143410g().mo36022Le(merchandise) || CoreModule.m30933P().m143410g().mo36075pj(ProductCategory.tttVip, merchandise))) || (merchandise.category == ProductCategory.get("svip") && (CoreModule.m30933P().m143410g().mo36048Zs(merchandise) || CoreModule.m30933P().m143410g().mo36075pj("svip", merchandise))));
            }
        }));
        long jLongValue = this.f29740d.get().longValue();
        long jLongValue2 = this.f29741e.get().longValue();
        long jLongValue3 = this.f29745i.get().longValue();
        int iMo34378Nf = CoreModule.m30933P().m143405a().mo34378Nf();
        int iIntValue = this.f29744h.get().intValue();
        if (CoreModule.f18264c.f20340Q1.f20859R.m35763N() && jLongValue3 == 0 && !joa.m146357G3() && CoreModule.m30933P().m143405a().mo180463f()) {
            badgeIconType = BadgeIconType.ODIAMOND;
        } else if (!zM82486a || pzi0.m174439D(jLongValue)) {
            badgeIconType = (((CoreLikers.C4870a) ((Pair) pair.first).second).f20013c <= 0 || !joa.m146386f4() || pzi0.m174439D(jLongValue2) || !pzi0.m174462w(jLongValue2, m46138j() * 24)) ? BadgeIconType.NONE : BadgeIconType.SEE;
        } else {
            badgeIconType = BadgeIconType.PROMOTION;
        }
        if (iMo34378Nf < iIntValue) {
            this.f29744h.put(Integer.valueOf(iMo34378Nf));
        }
        if (badgeIconType == BadgeIconType.NONE || this.f29746j) {
            return;
        }
        this.f29746j = true;
        m46145q(badgeIconType);
        this.f29747k.m137019l(badgeIconType);
    }

    /* JADX INFO: renamed from: p */
    public void m46144p() {
        psd0.m173633z(this.f29748l);
        this.f29748l = null;
        f29736m = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m46145q(BadgeIconType badgeIconType) {
        long jM174454o = pzi0.m174454o();
        if (badgeIconType == BadgeIconType.ODIAMOND) {
            this.f29745i.put(Long.valueOf(jM174454o));
            return;
        }
        if (badgeIconType == BadgeIconType.PROMOTION) {
            this.f29740d.put(Long.valueOf(jM174454o));
            return;
        }
        if (badgeIconType == BadgeIconType.SEE) {
            this.f29741e.put(Long.valueOf(jM174454o));
            return;
        }
        if (badgeIconType == BadgeIconType.BOOST_ONCE) {
            this.f29743g.put(Boolean.TRUE);
            this.f29744h.put(Integer.valueOf(CoreModule.m30933P().m143405a().mo34378Nf()));
            this.f29742f.put(Long.valueOf(jM174454o));
            return;
        }
        if (badgeIconType == BadgeIconType.BOOST) {
            this.f29744h.put(Integer.valueOf(CoreModule.m30933P().m143405a().mo34378Nf()));
            this.f29742f.put(Long.valueOf(jM174454o));
        }
    }

    /* JADX INFO: renamed from: r */
    public void m46146r() {
        this.f29747k.m137019l(BadgeIconType.ODIAMOND);
    }
}
