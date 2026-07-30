package com.p000p1.mobile.putong.core.api;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0155a0;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.DeviceType;
import com.p1.mobile.putong.core.data.HideSpecialUser;
import com.p1.mobile.putong.core.data.HideSpecialUserList;
import com.p1.mobile.putong.core.data.InsertConversationUser;
import com.p1.mobile.putong.core.data.InsertConversationsList;
import com.p1.mobile.putong.core.data.SpecialCard;
import com.p1.mobile.putong.core.data.SpecialCardGender;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.e30;
import l.e51;
import l.ggi;
import l.hpd0;
import l.mkd0;
import l.mqi0;
import l.q860;
import l.qqi0;
import l.tpd0;
import l.uqd0;
import l.vwb;
import l.w9j;
import l.zpd0;
import p006l.qib0;
import p006l.qnd;
import p006l.ura;
import rx.subjects.a;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.a0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0155a0 {

    /* JADX INFO: renamed from: q */
    public static volatile C0155a0 f3510q;

    /* JADX INFO: renamed from: a */
    public zpd0 f3511a = new zpd0("last_special_card_shown_time" + CoreModule.m1850H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public tpd0 f3512b = new tpd0("num_insert_card_limit_left" + CoreModule.m1850H().userId(), -99);

    /* JADX INFO: renamed from: c */
    public tpd0 f3513c = new tpd0("swipe_wright_time_show_card" + CoreModule.m1850H().userId(), 9999999);

    /* JADX INFO: renamed from: d */
    public uqd0 f3514d = new uqd0("current_hide_special_user_id" + CoreModule.m1850H().userId(), "");

    /* JADX INFO: renamed from: e */
    public hpd0 f3515e;

    /* JADX INFO: renamed from: f */
    public tpd0 f3516f;

    /* JADX INFO: renamed from: g */
    public tpd0 f3517g;

    /* JADX INFO: renamed from: h */
    public hpd0 f3518h;

    /* JADX INFO: renamed from: i */
    public hpd0 f3519i;

    /* JADX INFO: renamed from: j */
    public hpd0 f3520j;

    /* JADX INFO: renamed from: k */
    public ggi<HideSpecialUserList> f3521k;

    /* JADX INFO: renamed from: l */
    public a<HideSpecialUserList> f3522l;

    /* JADX INFO: renamed from: m */
    public ArrayList<String> f3523m;

    /* JADX INFO: renamed from: n */
    public ArrayList<String> f3524n;

    /* JADX INFO: renamed from: o */
    public String f3525o;

    /* JADX INFO: renamed from: p */
    public c4g0 f3526p;

    public C0155a0() {
        String str = "has_special_card_swiping" + CoreModule.m1850H().userId();
        Boolean bool = Boolean.FALSE;
        this.f3515e = new hpd0(str, bool);
        this.f3516f = new tpd0("special_card_config_last_update_time" + CoreModule.m1850H().userId(), 0);
        this.f3517g = new tpd0("gp_special_card_toast_show_count_" + CoreModule.m1850H().userId(), -1);
        this.f3518h = new hpd0("has_show_intl_tab_emoji_alert" + qib0.f19804b0.f17706a.userId(), bool);
        this.f3519i = new hpd0("has_show_emoji_guide_page" + qib0.f19804b0.f17706a.userId(), bool);
        this.f3520j = new hpd0("has_show_name_emoji_alert" + qib0.f19804b0.f17706a.userId(), bool);
        this.f3521k = new ggi<>(new qnd("intl_special_card_hide_users", "_1", CoreModule.m1850H().userId()), -1, HideSpecialUserList.PROTOBUF_ADAPTER);
        this.f3522l = a.b();
        this.f3523m = new ArrayList<>();
        this.f3524n = new ArrayList<>();
        this.f3525o = "";
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ HideSpecialUserList m3313a(ggi.a aVar) {
        return (HideSpecialUserList) aVar.a;
    }

    /* JADX INFO: renamed from: j */
    public static C0155a0 m3317j() {
        if (f3510q == null) {
            synchronized (C0155a0.class) {
                try {
                    if (f3510q == null) {
                        f3510q = new C0155a0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f3510q;
    }

    /* JADX INFO: renamed from: e */
    public void m3318e(String str) {
        this.f3524n.add(str);
    }

    /* JADX INFO: renamed from: f */
    public void m3319f(String str) {
        this.f3523m.add(str);
        if (this.f3523m.size() == ((Integer) this.f3513c.get()).intValue() && m3336x()) {
            this.f3525o = str;
            m3326n((String) ((q860) CoreModule.f1534c.f3652m0.f3332H2.e()).a.get(0));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m3320g() {
        this.f3524n.clear();
        this.f3523m.clear();
    }

    /* JADX INFO: renamed from: h */
    public List<User> m3321h(List<User> list) {
        if ((this.f3522l.e() == null || vwb.J(((HideSpecialUserList) this.f3522l.e()).users)) && (ura.m25555e().m25559d().m5697Ul().e() == null || vwb.J(((InsertConversationsList) ura.m25555e().m25559d().m5697Ul().e()).users))) {
            return list;
        }
        List arrayList = new ArrayList();
        if (this.f3522l.e() != null && !vwb.J(((HideSpecialUserList) this.f3522l.e()).users)) {
            arrayList = ((HideSpecialUserList) this.f3522l.e()).users;
        }
        List arrayList2 = new ArrayList();
        if (ura.m25555e().m25559d().m5697Ul().e() != null && !vwb.J(((InsertConversationsList) ura.m25555e().m25559d().m5697Ul().e()).users)) {
            arrayList2 = ((InsertConversationsList) ura.m25555e().m25559d().m5697Ul().e()).users;
        }
        HideSpecialUserList hideSpecialUserListNew_ = HideSpecialUserList.new_();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((HideSpecialUser) it.next()).timeStamp.longValue() <= mqi0.o() - 86400000) {
                it.remove();
            }
        }
        for (User user : list) {
            Iterator it2 = arrayList.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                if (((DbObject) user).id.equals(((HideSpecialUser) it2.next()).userId)) {
                    z = true;
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (((DbObject) user).id.equals(((InsertConversationUser) it3.next()).userId)) {
                    z = true;
                }
            }
            if (!z) {
                arrayList3.add(user);
            }
        }
        hideSpecialUserListNew_.users.addAll(arrayList);
        this.f3522l.onNext(hideSpecialUserListNew_);
        return arrayList3;
    }

    /* JADX INFO: renamed from: i */
    public String m3322i() {
        return this.f3525o;
    }

    /* JADX INFO: renamed from: k */
    public void m3323k() {
        this.f3526p = this.f3521k.k().filter(new w9j() { // from class: l.p4b
            public final Object call(Object obj) {
                ggi.a aVar = (ggi.a) obj;
                return Boolean.valueOf((aVar == null || aVar.a == null) ? false : true);
            }
        }).map(new w9j() { // from class: l.q4b
            public final Object call(Object obj) {
                return C0155a0.m3313a((ggi.a) obj);
            }
        }).compose(mkd0.Q()).subscribe(mkd0.G(new e30() { // from class: l.r4b
            public final void call(Object obj) {
                this.f20290a.m3332t((HideSpecialUserList) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public void m3324l() {
        this.f3514d.put("");
        this.f3515e.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: m */
    public void m3325m(SpecialCard specialCard) {
        m3323k();
        if (((Integer) this.f3516f.get()).intValue() == specialCard.version) {
            return;
        }
        this.f3513c.put(Integer.valueOf(specialCard.swipe_wright_time));
        this.f3512b.put(Integer.valueOf(specialCard.num_limited_left));
        this.f3516f.put(Integer.valueOf(specialCard.version));
        this.f3517g.put(-1);
    }

    /* JADX INFO: renamed from: n */
    public final void m3326n(String str) {
        this.f3514d.put(str);
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f3461id = str;
        userInfo.canUndo = true;
        userInfo.preSwipedDirection = null;
        CoreModule.f1534c.f3652m0.m3084w6(userInfo, 1);
    }

    /* JADX INFO: renamed from: o */
    public boolean m3327o(List<Integer> list) {
        if (list == null) {
            return false;
        }
        return list.size() == 0 || list.contains(Integer.valueOf(qib0.f19808f0));
    }

    /* JADX INFO: renamed from: p */
    public boolean m3328p(DeviceType deviceType) {
        if (deviceType == null) {
            return false;
        }
        return TEnum.equals(deviceType, "both") || TEnum.equals(deviceType, "android");
    }

    /* JADX INFO: renamed from: q */
    public boolean m3329q(SpecialCardGender specialCardGender, User user) {
        if (specialCardGender == null) {
            return false;
        }
        return TEnum.equals(specialCardGender, "both") || user.gender.toString().equals(specialCardGender.toString());
    }

    /* JADX INFO: renamed from: r */
    public boolean m3330r(List<Double> list) {
        if (((Integer) this.f3517g.get()).intValue() < 0) {
            return true;
        }
        long jO = mqi0.o();
        int iDoubleValue = (int) (list.get(((Integer) this.f3517g.get()).intValue()).doubleValue() * 24.0d);
        return jO - ((Long) this.f3511a.get()).longValue() >= TimeUnit.MILLISECONDS.convert((long) iDoubleValue, TimeUnit.HOURS);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m3331s(int i) {
        return ((int) ((mqi0.n() - qqi0.c((long) CoreModule.f1534c.f3628e0.m21490p9().createdTime)) / 86400000)) >= i;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m3332t(HideSpecialUserList hideSpecialUserList) {
        this.f3522l.onNext(hideSpecialUserList);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m3333u(String str) {
        HideSpecialUserList hideSpecialUserListNew_ = HideSpecialUserList.new_();
        List<HideSpecialUser> arrayList = new ArrayList();
        if (NullChecker.a(this.f3522l.e()) && !vwb.J(((HideSpecialUserList) this.f3522l.e()).users)) {
            arrayList = ((HideSpecialUserList) this.f3522l.e()).users;
        }
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        for (HideSpecialUser hideSpecialUser : arrayList) {
            if (hideSpecialUser.timeStamp.longValue() > mqi0.o() - 86400000) {
                if (str.equals(hideSpecialUser.userId)) {
                    hideSpecialUser.timeStamp = Long.valueOf(mqi0.o());
                    z = true;
                }
                arrayList2.add(hideSpecialUser);
            }
        }
        if (!z) {
            HideSpecialUser hideSpecialUserNew_ = HideSpecialUser.new_();
            hideSpecialUserNew_.userId = str;
            hideSpecialUserNew_.timeStamp = Long.valueOf(mqi0.o());
            arrayList2.add(hideSpecialUserNew_);
        }
        hideSpecialUserListNew_.users.addAll(arrayList2);
        this.f3521k.c();
        this.f3521k.p(hideSpecialUserListNew_);
        this.f3522l.onNext(hideSpecialUserListNew_);
    }

    /* JADX INFO: renamed from: v */
    public void m3334v() {
        this.f3514d.put("");
        this.f3515e.put(Boolean.FALSE);
        if (NullChecker.a(this.f3526p)) {
            this.f3526p.unsubscribe();
            this.f3526p = null;
        }
        f3510q = null;
    }

    /* JADX INFO: renamed from: w */
    public void m3335w(final String str) {
        e51.y(new Runnable() { // from class: l.s4b
            @Override // java.lang.Runnable
            public final void run() {
                this.f21009a.m3333u(str);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final boolean m3336x() {
        if (CoreModule.f1534c.f3652m0.f3332H2.e() == null || ((q860) CoreModule.f1534c.f3652m0.f3332H2.e()).a.isEmpty() || ((Integer) this.f3512b.get()).intValue() <= 0) {
            return false;
        }
        SpecialCard specialCardM25980G = CoreModule.f1535d.m25980G();
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (specialCardM25980G != null && userM21490p9 != null && m3328p(specialCardM25980G.device_OS) && m3329q(specialCardM25980G.gender, userM21490p9) && m3327o(specialCardM25980G.signup_country) && (((m3331s(specialCardM25980G.actived_duration) && IntlCountryCodeController.m14o()) || !IntlCountryCodeController.m14o()) && (m3330r(specialCardM25980G.interval_day) || !((String) this.f3514d.get()).isEmpty()))) {
            boolean zIsEmpty = ((String) this.f3514d.get()).isEmpty();
            zpd0 zpd0Var = this.f3511a;
            if (zIsEmpty) {
                zpd0Var.put(Long.valueOf(mqi0.o()));
                tpd0 tpd0Var = this.f3512b;
                tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() - 1));
                int iIntValue = ((Integer) this.f3517g.get()).intValue();
                tpd0 tpd0Var2 = this.f3517g;
                if (iIntValue < 0) {
                    tpd0Var2.put(0);
                } else if (((Integer) tpd0Var2.get()).intValue() < specialCardM25980G.interval_day.size() - 1) {
                    tpd0 tpd0Var3 = this.f3517g;
                    tpd0Var3.put(Integer.valueOf(((Integer) tpd0Var3.get()).intValue() + 1));
                } else if (specialCardM25980G.interval_hour_cycle_mode == 1) {
                    this.f3517g.put(0);
                }
            } else {
                zpd0Var.put(Long.valueOf(mqi0.o()));
            }
            return true;
        }
        return false;
    }
}
