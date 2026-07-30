package com.p051p1.mobile.putong.core.api;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4880a0;
import com.p051p1.mobile.putong.core.data.DeviceType;
import com.p051p1.mobile.putong.core.data.HideSpecialUser;
import com.p051p1.mobile.putong.core.data.HideSpecialUserList;
import com.p051p1.mobile.putong.core.data.InsertConversationUser;
import com.p051p1.mobile.putong.core.data.SpecialCard;
import com.p051p1.mobile.putong.core.data.SpecialCardGender;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.subjects.C22507a;
import p153l.byd0;
import p153l.dji;
import p153l.gta;
import p153l.jxd0;
import p153l.jyb;
import p153l.kcg0;
import p153l.l51;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.tzi0;
import p153l.uqb0;
import p153l.vod;
import p153l.vxd0;
import p153l.wyd0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.a0 */
/* JADX INFO: loaded from: classes9.dex */
public class C4880a0 {

    /* JADX INFO: renamed from: q */
    public static volatile C4880a0 f20263q;

    /* JADX INFO: renamed from: a */
    public byd0 f20264a = new byd0("last_special_card_shown_time" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: b */
    public vxd0 f20265b = new vxd0("num_insert_card_limit_left" + CoreModule.m30929H().userId(), -99);

    /* JADX INFO: renamed from: c */
    public vxd0 f20266c = new vxd0("swipe_wright_time_show_card" + CoreModule.m30929H().userId(), 9999999);

    /* JADX INFO: renamed from: d */
    public wyd0 f20267d = new wyd0("current_hide_special_user_id" + CoreModule.m30929H().userId(), "");

    /* JADX INFO: renamed from: e */
    public jxd0 f20268e;

    /* JADX INFO: renamed from: f */
    public vxd0 f20269f;

    /* JADX INFO: renamed from: g */
    public vxd0 f20270g;

    /* JADX INFO: renamed from: h */
    public jxd0 f20271h;

    /* JADX INFO: renamed from: i */
    public jxd0 f20272i;

    /* JADX INFO: renamed from: j */
    public jxd0 f20273j;

    /* JADX INFO: renamed from: k */
    public dji<HideSpecialUserList> f20274k;

    /* JADX INFO: renamed from: l */
    public C22507a<HideSpecialUserList> f20275l;

    /* JADX INFO: renamed from: m */
    public ArrayList<String> f20276m;

    /* JADX INFO: renamed from: n */
    public ArrayList<String> f20277n;

    /* JADX INFO: renamed from: o */
    public String f20278o;

    /* JADX INFO: renamed from: p */
    public kcg0 f20279p;

    public C4880a0() {
        String str = "has_special_card_swiping" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f20268e = new jxd0(str, bool);
        this.f20269f = new vxd0("special_card_config_last_update_time" + CoreModule.m30929H().userId(), 0);
        this.f20270g = new vxd0("gp_special_card_toast_show_count_" + CoreModule.m30929H().userId(), -1);
        this.f20271h = new jxd0("has_show_intl_tab_emoji_alert" + uqb0.f180396b0.f170324a.userId(), bool);
        this.f20272i = new jxd0("has_show_emoji_guide_page" + uqb0.f180396b0.f170324a.userId(), bool);
        this.f20273j = new jxd0("has_show_name_emoji_alert" + uqb0.f180396b0.f170324a.userId(), bool);
        this.f20274k = new dji<>(new vod("intl_special_card_hide_users", "_1", CoreModule.m30929H().userId()), -1, HideSpecialUserList.PROTOBUF_ADAPTER);
        this.f20275l = C22507a.m222758b();
        this.f20276m = new ArrayList<>();
        this.f20277n = new ArrayList<>();
        this.f20278o = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ HideSpecialUserList m32386a(dji.C16549a c16549a) {
        return (HideSpecialUserList) c16549a.f88861a;
    }

    /* JADX INFO: renamed from: j */
    public static C4880a0 m32390j() {
        if (f20263q == null) {
            synchronized (C4880a0.class) {
                try {
                    if (f20263q == null) {
                        f20263q = new C4880a0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20263q;
    }

    /* JADX INFO: renamed from: e */
    public void m32391e(String str) {
        this.f20277n.add(str);
    }

    /* JADX INFO: renamed from: f */
    public void m32392f(String str) {
        this.f20276m.add(str);
        if (this.f20276m.size() == this.f20266c.get().intValue() && m32409x()) {
            this.f20278o = str;
            m32399n(CoreModule.f18264c.f20405m0.f20085H2.m222761e().f184001a.get(0));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m32393g() {
        this.f20277n.clear();
        this.f20276m.clear();
    }

    /* JADX INFO: renamed from: h */
    public List<User> m32394h(List<User> list) {
        if ((this.f20275l.m222761e() == null || jyb.m147479J(this.f20275l.m222761e().users)) && (gta.m132210e().m132214d().mo34763Ul().m222761e() == null || jyb.m147479J(gta.m132210e().m132214d().mo34763Ul().m222761e().users))) {
            return list;
        }
        List arrayList = new ArrayList();
        if (this.f20275l.m222761e() != null && !jyb.m147479J(this.f20275l.m222761e().users)) {
            arrayList = this.f20275l.m222761e().users;
        }
        List arrayList2 = new ArrayList();
        if (gta.m132210e().m132214d().mo34763Ul().m222761e() != null && !jyb.m147479J(gta.m132210e().m132214d().mo34763Ul().m222761e().users)) {
            arrayList2 = gta.m132210e().m132214d().mo34763Ul().m222761e().users;
        }
        HideSpecialUserList hideSpecialUserListNew_ = HideSpecialUserList.new_();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((HideSpecialUser) it.next()).timeStamp.longValue() <= pzi0.m174454o() - 86400000) {
                it.remove();
            }
        }
        for (User user : list) {
            Iterator it2 = arrayList.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                if (user.f56859id.equals(((HideSpecialUser) it2.next()).userId)) {
                    z = true;
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (user.f56859id.equals(((InsertConversationUser) it3.next()).userId)) {
                    z = true;
                }
            }
            if (!z) {
                arrayList3.add(user);
            }
        }
        hideSpecialUserListNew_.users.addAll(arrayList);
        this.f20275l.m137019l(hideSpecialUserListNew_);
        return arrayList3;
    }

    /* JADX INFO: renamed from: i */
    public String m32395i() {
        return this.f20278o;
    }

    /* JADX INFO: renamed from: k */
    public void m32396k() {
        this.f20279p = this.f20274k.m116105k().filter(new qcj() { // from class: l.c6b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                dji.C16549a c16549a = (dji.C16549a) obj;
                return Boolean.valueOf((c16549a == null || c16549a.f88861a == 0) ? false : true);
            }
        }).map(new qcj() { // from class: l.d6b
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4880a0.m32386a((dji.C16549a) obj);
            }
        }).compose(psd0.m173606Q()).subscribe(psd0.m173596G(new y20() { // from class: l.e6b
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92271a.m32405t((HideSpecialUserList) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public void m32397l() {
        this.f20267d.put("");
        this.f20268e.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: m */
    public void m32398m(SpecialCard specialCard) {
        m32396k();
        if (this.f20269f.get().intValue() == specialCard.version) {
            return;
        }
        this.f20266c.put(Integer.valueOf(specialCard.swipe_wright_time));
        this.f20265b.put(Integer.valueOf(specialCard.num_limited_left));
        this.f20269f.put(Integer.valueOf(specialCard.version));
        this.f20270g.put(-1);
    }

    /* JADX INFO: renamed from: n */
    public final void m32399n(String str) {
        this.f20267d.put(str);
        CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f20214id = str;
        userInfo.canUndo = true;
        userInfo.preSwipedDirection = null;
        CoreModule.f18264c.f20405m0.m32157w6(userInfo, 1);
    }

    /* JADX INFO: renamed from: o */
    public boolean m32400o(List<Integer> list) {
        if (list == null) {
            return false;
        }
        return list.size() == 0 || list.contains(Integer.valueOf(uqb0.f180400f0));
    }

    /* JADX INFO: renamed from: p */
    public boolean m32401p(DeviceType deviceType) {
        if (deviceType == null) {
            return false;
        }
        return TEnum.equals(deviceType, "both") || TEnum.equals(deviceType, "android");
    }

    /* JADX INFO: renamed from: q */
    public boolean m32402q(SpecialCardGender specialCardGender, User user) {
        if (specialCardGender == null) {
            return false;
        }
        return TEnum.equals(specialCardGender, "both") || user.gender.toString().equals(specialCardGender.toString());
    }

    /* JADX INFO: renamed from: r */
    public boolean m32403r(List<Double> list) {
        if (this.f20270g.get().intValue() < 0) {
            return true;
        }
        long jM174454o = pzi0.m174454o();
        int iDoubleValue = (int) (list.get(this.f20270g.get().intValue()).doubleValue() * 24.0d);
        return jM174454o - this.f20264a.get().longValue() >= TimeUnit.MILLISECONDS.convert((long) iDoubleValue, TimeUnit.HOURS);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m32404s(int i) {
        return ((int) ((pzi0.m174453n() - tzi0.m193665c((long) CoreModule.f18264c.f20381e0.m116600p9().createdTime)) / 86400000)) >= i;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m32405t(HideSpecialUserList hideSpecialUserList) {
        this.f20275l.m137019l(hideSpecialUserList);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m32406u(String str) {
        HideSpecialUserList hideSpecialUserListNew_ = HideSpecialUserList.new_();
        List<HideSpecialUser> arrayList = new ArrayList();
        if (NullChecker.m82486a(this.f20275l.m222761e()) && !jyb.m147479J(this.f20275l.m222761e().users)) {
            arrayList = this.f20275l.m222761e().users;
        }
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        for (HideSpecialUser hideSpecialUser : arrayList) {
            if (hideSpecialUser.timeStamp.longValue() > pzi0.m174454o() - 86400000) {
                if (str.equals(hideSpecialUser.userId)) {
                    hideSpecialUser.timeStamp = Long.valueOf(pzi0.m174454o());
                    z = true;
                }
                arrayList2.add(hideSpecialUser);
            }
        }
        if (!z) {
            HideSpecialUser hideSpecialUserNew_ = HideSpecialUser.new_();
            hideSpecialUserNew_.userId = str;
            hideSpecialUserNew_.timeStamp = Long.valueOf(pzi0.m174454o());
            arrayList2.add(hideSpecialUserNew_);
        }
        hideSpecialUserListNew_.users.addAll(arrayList2);
        this.f20274k.m116099c();
        this.f20274k.m116110p(hideSpecialUserListNew_);
        this.f20275l.m137019l(hideSpecialUserListNew_);
    }

    /* JADX INFO: renamed from: v */
    public void m32407v() {
        this.f20267d.put("");
        this.f20268e.put(Boolean.FALSE);
        if (NullChecker.m82486a(this.f20279p)) {
            this.f20279p.unsubscribe();
            this.f20279p = null;
        }
        f20263q = null;
    }

    /* JADX INFO: renamed from: w */
    public void m32408w(final String str) {
        l51.m152919y(new Runnable() { // from class: l.f6b
            @Override // java.lang.Runnable
            public final void run() {
                this.f97387a.m32406u(str);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final boolean m32409x() {
        if (CoreModule.f18264c.f20405m0.f20085H2.m222761e() == null || CoreModule.f18264c.f20405m0.f20085H2.m222761e().f184001a.isEmpty() || this.f20265b.get().intValue() <= 0) {
            return false;
        }
        SpecialCard specialCardM217947G = CoreModule.f18265d.m217947G();
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (specialCardM217947G != null && userM116600p9 != null && m32401p(specialCardM217947G.device_OS) && m32402q(specialCardM217947G.gender, userM116600p9) && m32400o(specialCardM217947G.signup_country) && (((m32404s(specialCardM217947G.actived_duration) && IntlCountryCodeController.m29118o()) || !IntlCountryCodeController.m29118o()) && (m32403r(specialCardM217947G.interval_day) || !this.f20267d.get().isEmpty()))) {
            boolean zIsEmpty = this.f20267d.get().isEmpty();
            byd0 byd0Var = this.f20264a;
            if (zIsEmpty) {
                byd0Var.put(Long.valueOf(pzi0.m174454o()));
                vxd0 vxd0Var = this.f20265b;
                vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() - 1));
                int iIntValue = this.f20270g.get().intValue();
                vxd0 vxd0Var2 = this.f20270g;
                if (iIntValue < 0) {
                    vxd0Var2.put(0);
                } else if (vxd0Var2.get().intValue() < specialCardM217947G.interval_day.size() - 1) {
                    vxd0 vxd0Var3 = this.f20270g;
                    vxd0Var3.put(Integer.valueOf(vxd0Var3.get().intValue() + 1));
                } else if (specialCardM217947G.interval_hour_cycle_mode == 1) {
                    this.f20270g.put(0);
                }
            } else {
                byd0Var.put(Long.valueOf(pzi0.m174454o()));
            }
            return true;
        }
        return false;
    }
}
