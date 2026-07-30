package com.p046p1.mobile.putong.core.api;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4729a0;
import com.p046p1.mobile.putong.core.data.DeviceType;
import com.p046p1.mobile.putong.core.data.HideSpecialUser;
import com.p046p1.mobile.putong.core.data.HideSpecialUserList;
import com.p046p1.mobile.putong.core.data.InsertConversationUser;
import com.p046p1.mobile.putong.core.data.SpecialCard;
import com.p046p1.mobile.putong.core.data.SpecialCardGender;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.subjects.C22392a;
import p149l.c4g0;
import p149l.e30;
import p149l.e51;
import p149l.ggi;
import p149l.hpd0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.qib0;
import p149l.qnd;
import p149l.qqi0;
import p149l.tpd0;
import p149l.uqd0;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;
import p149l.zpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.a0 */
/* JADX INFO: loaded from: classes9.dex */
public class C4729a0 {

    /* JADX INFO: renamed from: q */
    public static volatile C4729a0 f19521q;

    /* JADX INFO: renamed from: a */
    public zpd0 f19522a = new zpd0("last_special_card_shown_time" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public tpd0 f19523b = new tpd0("num_insert_card_limit_left" + CoreModule.m29931H().userId(), -99);

    /* JADX INFO: renamed from: c */
    public tpd0 f19524c = new tpd0("swipe_wright_time_show_card" + CoreModule.m29931H().userId(), 9999999);

    /* JADX INFO: renamed from: d */
    public uqd0 f19525d = new uqd0("current_hide_special_user_id" + CoreModule.m29931H().userId(), "");

    /* JADX INFO: renamed from: e */
    public hpd0 f19526e;

    /* JADX INFO: renamed from: f */
    public tpd0 f19527f;

    /* JADX INFO: renamed from: g */
    public tpd0 f19528g;

    /* JADX INFO: renamed from: h */
    public hpd0 f19529h;

    /* JADX INFO: renamed from: i */
    public hpd0 f19530i;

    /* JADX INFO: renamed from: j */
    public hpd0 f19531j;

    /* JADX INFO: renamed from: k */
    public ggi<HideSpecialUserList> f19532k;

    /* JADX INFO: renamed from: l */
    public C22392a<HideSpecialUserList> f19533l;

    /* JADX INFO: renamed from: m */
    public ArrayList<String> f19534m;

    /* JADX INFO: renamed from: n */
    public ArrayList<String> f19535n;

    /* JADX INFO: renamed from: o */
    public String f19536o;

    /* JADX INFO: renamed from: p */
    public c4g0 f19537p;

    public C4729a0() {
        String str = "has_special_card_swiping" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f19526e = new hpd0(str, bool);
        this.f19527f = new tpd0("special_card_config_last_update_time" + CoreModule.m29931H().userId(), 0);
        this.f19528g = new tpd0("gp_special_card_toast_show_count_" + CoreModule.m29931H().userId(), -1);
        this.f19529h = new hpd0("has_show_intl_tab_emoji_alert" + qib0.f154713b0.f139230a.userId(), bool);
        this.f19530i = new hpd0("has_show_emoji_guide_page" + qib0.f154713b0.f139230a.userId(), bool);
        this.f19531j = new hpd0("has_show_name_emoji_alert" + qib0.f154713b0.f139230a.userId(), bool);
        this.f19532k = new ggi<>(new qnd("intl_special_card_hide_users", "_1", CoreModule.m29931H().userId()), -1, HideSpecialUserList.PROTOBUF_ADAPTER);
        this.f19533l = C22392a.m221512b();
        this.f19534m = new ArrayList<>();
        this.f19535n = new ArrayList<>();
        this.f19536o = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ HideSpecialUserList m31383a(ggi.C17074a c17074a) {
        return (HideSpecialUserList) c17074a.f102512a;
    }

    /* JADX INFO: renamed from: j */
    public static C4729a0 m31387j() {
        if (f19521q == null) {
            synchronized (C4729a0.class) {
                try {
                    if (f19521q == null) {
                        f19521q = new C4729a0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19521q;
    }

    /* JADX INFO: renamed from: e */
    public void m31388e(String str) {
        this.f19535n.add(str);
    }

    /* JADX INFO: renamed from: f */
    public void m31389f(String str) {
        this.f19534m.add(str);
        if (this.f19534m.size() == this.f19524c.get().intValue() && m31406x()) {
            this.f19536o = str;
            m31396n(CoreModule.f17545c.f19663m0.f19343H2.m221515e().f153135a.get(0));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m31390g() {
        this.f19535n.clear();
        this.f19534m.clear();
    }

    /* JADX INFO: renamed from: h */
    public List<User> m31391h(List<User> list) {
        if ((this.f19533l.m221515e() == null || vwb.m200296J(this.f19533l.m221515e().users)) && (ura.m195053e().m195057d().mo33760Ul().m221515e() == null || vwb.m200296J(ura.m195053e().m195057d().mo33760Ul().m221515e().users))) {
            return list;
        }
        List arrayList = new ArrayList();
        if (this.f19533l.m221515e() != null && !vwb.m200296J(this.f19533l.m221515e().users)) {
            arrayList = this.f19533l.m221515e().users;
        }
        List arrayList2 = new ArrayList();
        if (ura.m195053e().m195057d().mo33760Ul().m221515e() != null && !vwb.m200296J(ura.m195053e().m195057d().mo33760Ul().m221515e().users)) {
            arrayList2 = ura.m195053e().m195057d().mo33760Ul().m221515e().users;
        }
        HideSpecialUserList hideSpecialUserListNew_ = HideSpecialUserList.new_();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((HideSpecialUser) it.next()).timeStamp.longValue() <= mqi0.m155944o() - 86400000) {
                it.remove();
            }
        }
        for (User user : list) {
            Iterator it2 = arrayList.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                if (user.f56011id.equals(((HideSpecialUser) it2.next()).userId)) {
                    z = true;
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (user.f56011id.equals(((InsertConversationUser) it3.next()).userId)) {
                    z = true;
                }
            }
            if (!z) {
                arrayList3.add(user);
            }
        }
        hideSpecialUserListNew_.users.addAll(arrayList);
        this.f19533l.m132487l(hideSpecialUserListNew_);
        return arrayList3;
    }

    /* JADX INFO: renamed from: i */
    public String m31392i() {
        return this.f19536o;
    }

    /* JADX INFO: renamed from: k */
    public void m31393k() {
        this.f19537p = this.f19532k.m125973k().filter(new w9j() { // from class: l.p4b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                ggi.C17074a c17074a = (ggi.C17074a) obj;
                return Boolean.valueOf((c17074a == null || c17074a.f102512a == 0) ? false : true);
            }
        }).map(new w9j() { // from class: l.q4b
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4729a0.m31383a((ggi.C17074a) obj);
            }
        }).compose(mkd0.m154965Q()).subscribe(mkd0.m154955G(new e30() { // from class: l.r4b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157645a.m31402t((HideSpecialUserList) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public void m31394l() {
        this.f19525d.put("");
        this.f19526e.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: m */
    public void m31395m(SpecialCard specialCard) {
        m31393k();
        if (this.f19527f.get().intValue() == specialCard.version) {
            return;
        }
        this.f19524c.put(Integer.valueOf(specialCard.swipe_wright_time));
        this.f19523b.put(Integer.valueOf(specialCard.num_limited_left));
        this.f19527f.put(Integer.valueOf(specialCard.version));
        this.f19528g.put(-1);
    }

    /* JADX INFO: renamed from: n */
    public final void m31396n(String str) {
        this.f19525d.put(str);
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f19472id = str;
        userInfo.canUndo = true;
        userInfo.preSwipedDirection = null;
        CoreModule.f17545c.f19663m0.m31154w6(userInfo, 1);
    }

    /* JADX INFO: renamed from: o */
    public boolean m31397o(List<Integer> list) {
        if (list == null) {
            return false;
        }
        return list.size() == 0 || list.contains(Integer.valueOf(qib0.f154717f0));
    }

    /* JADX INFO: renamed from: p */
    public boolean m31398p(DeviceType deviceType) {
        if (deviceType == null) {
            return false;
        }
        return TEnum.equals(deviceType, "both") || TEnum.equals(deviceType, "android");
    }

    /* JADX INFO: renamed from: q */
    public boolean m31399q(SpecialCardGender specialCardGender, User user) {
        if (specialCardGender == null) {
            return false;
        }
        return TEnum.equals(specialCardGender, "both") || user.gender.toString().equals(specialCardGender.toString());
    }

    /* JADX INFO: renamed from: r */
    public boolean m31400r(List<Double> list) {
        if (this.f19528g.get().intValue() < 0) {
            return true;
        }
        long jM155944o = mqi0.m155944o();
        int iDoubleValue = (int) (list.get(this.f19528g.get().intValue()).doubleValue() * 24.0d);
        return jM155944o - this.f19522a.get().longValue() >= TimeUnit.MILLISECONDS.convert((long) iDoubleValue, TimeUnit.HOURS);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m31401s(int i) {
        return ((int) ((mqi0.m155943n() - qqi0.m175935c((long) CoreModule.f17545c.f19639e0.m169527p9().createdTime)) / 86400000)) >= i;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m31402t(HideSpecialUserList hideSpecialUserList) {
        this.f19533l.m132487l(hideSpecialUserList);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m31403u(String str) {
        HideSpecialUserList hideSpecialUserListNew_ = HideSpecialUserList.new_();
        List<HideSpecialUser> arrayList = new ArrayList();
        if (NullChecker.m81303a(this.f19533l.m221515e()) && !vwb.m200296J(this.f19533l.m221515e().users)) {
            arrayList = this.f19533l.m221515e().users;
        }
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        for (HideSpecialUser hideSpecialUser : arrayList) {
            if (hideSpecialUser.timeStamp.longValue() > mqi0.m155944o() - 86400000) {
                if (str.equals(hideSpecialUser.userId)) {
                    hideSpecialUser.timeStamp = Long.valueOf(mqi0.m155944o());
                    z = true;
                }
                arrayList2.add(hideSpecialUser);
            }
        }
        if (!z) {
            HideSpecialUser hideSpecialUserNew_ = HideSpecialUser.new_();
            hideSpecialUserNew_.userId = str;
            hideSpecialUserNew_.timeStamp = Long.valueOf(mqi0.m155944o());
            arrayList2.add(hideSpecialUserNew_);
        }
        hideSpecialUserListNew_.users.addAll(arrayList2);
        this.f19532k.m125967c();
        this.f19532k.m125978p(hideSpecialUserListNew_);
        this.f19533l.m132487l(hideSpecialUserListNew_);
    }

    /* JADX INFO: renamed from: v */
    public void m31404v() {
        this.f19525d.put("");
        this.f19526e.put(Boolean.FALSE);
        if (NullChecker.m81303a(this.f19537p)) {
            this.f19537p.unsubscribe();
            this.f19537p = null;
        }
        f19521q = null;
    }

    /* JADX INFO: renamed from: w */
    public void m31405w(final String str) {
        e51.m114774y(new Runnable() { // from class: l.s4b
            @Override // java.lang.Runnable
            public final void run() {
                this.f162278a.m31403u(str);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final boolean m31406x() {
        if (CoreModule.f17545c.f19663m0.f19343H2.m221515e() == null || CoreModule.f17545c.f19663m0.f19343H2.m221515e().f153135a.isEmpty() || this.f19523b.get().intValue() <= 0) {
            return false;
        }
        SpecialCard specialCardM200501G = CoreModule.f17546d.m200501G();
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (specialCardM200501G != null && userM169527p9 != null && m31398p(specialCardM200501G.device_OS) && m31399q(specialCardM200501G.gender, userM169527p9) && m31397o(specialCardM200501G.signup_country) && (((m31401s(specialCardM200501G.actived_duration) && IntlCountryCodeController.m28119o()) || !IntlCountryCodeController.m28119o()) && (m31400r(specialCardM200501G.interval_day) || !this.f19525d.get().isEmpty()))) {
            boolean zIsEmpty = this.f19525d.get().isEmpty();
            zpd0 zpd0Var = this.f19522a;
            if (zIsEmpty) {
                zpd0Var.put(Long.valueOf(mqi0.m155944o()));
                tpd0 tpd0Var = this.f19523b;
                tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() - 1));
                int iIntValue = this.f19528g.get().intValue();
                tpd0 tpd0Var2 = this.f19528g;
                if (iIntValue < 0) {
                    tpd0Var2.put(0);
                } else if (tpd0Var2.get().intValue() < specialCardM200501G.interval_day.size() - 1) {
                    tpd0 tpd0Var3 = this.f19528g;
                    tpd0Var3.put(Integer.valueOf(tpd0Var3.get().intValue() + 1));
                } else if (specialCardM200501G.interval_hour_cycle_mode == 1) {
                    this.f19528g.put(0);
                }
            } else {
                zpd0Var.put(Long.valueOf(mqi0.m155944o()));
            }
            return true;
        }
        return false;
    }
}
