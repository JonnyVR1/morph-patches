package com.p051p1.mobile.putong.core.newui.home;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p051p1.mobile.putong.data.User;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p153l.d09;
import p153l.du4;
import p153l.f1g0;
import p153l.gra;
import p153l.ik4;
import p153l.jj40;
import p153l.jyb;
import p153l.pf60;
import p153l.pzi0;
import p153l.uih0;
import p153l.uqb0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.d */
/* JADX INFO: loaded from: classes11.dex */
public class C8145d {

    /* JADX INFO: renamed from: a */
    public String f23714a;

    /* JADX INFO: renamed from: b */
    public String f23715b;

    /* JADX INFO: renamed from: c */
    public String f23716c;

    /* JADX INFO: renamed from: d */
    public String f23717d;

    /* JADX INFO: renamed from: e */
    public String f23718e;

    /* JADX INFO: renamed from: f */
    public String f23719f;

    /* JADX INFO: renamed from: g */
    public HomeStatisticsHelper.ScActionName f23720g;

    /* JADX INFO: renamed from: h */
    public HomeStatisticsHelper.ScActionFrom f23721h;

    /* JADX INFO: renamed from: i */
    public int f23722i;

    /* JADX INFO: renamed from: j */
    public int f23723j;

    /* JADX INFO: renamed from: k */
    public int f23724k;

    /* JADX INFO: renamed from: l */
    public int f23725l;

    /* JADX INFO: renamed from: m */
    public int f23726m;

    /* JADX INFO: renamed from: n */
    public int f23727n;

    /* JADX INFO: renamed from: o */
    public String f23728o;

    /* JADX INFO: renamed from: p */
    public String f23729p;

    /* JADX INFO: renamed from: q */
    public boolean f23730q;

    /* JADX INFO: renamed from: r */
    public boolean f23731r;

    /* JADX INFO: renamed from: s */
    public boolean f23732s;

    /* JADX INFO: renamed from: t */
    public String f23733t;

    /* JADX INFO: renamed from: u */
    public String f23734u;

    /* JADX INFO: renamed from: v */
    public String f23735v;

    /* JADX INFO: renamed from: w */
    public boolean f23736w;

    /* JADX INFO: renamed from: x */
    public List<String> f23737x;

    /* JADX INFO: renamed from: y */
    public ArrayList<pf60<String, Object>> f23738y;

    public C8145d(String str, HomeStatisticsHelper.ScActionFrom scActionFrom, String str2) {
        this.f23714a = "";
        this.f23715b = "";
        this.f23716c = "click";
        this.f23717d = "";
        this.f23718e = "";
        this.f23719f = "";
        this.f23720g = HomeStatisticsHelper.ScActionName.UNKNOWN;
        this.f23721h = HomeStatisticsHelper.ScActionFrom.SUGGEST;
        this.f23722i = 0;
        this.f23723j = 0;
        this.f23724k = 1;
        this.f23725l = 1;
        this.f23726m = 0;
        this.f23727n = 1;
        this.f23728o = "";
        this.f23733t = "";
        this.f23734u = "";
        this.f23735v = "";
        this.f23736w = false;
        this.f23737x = new ArrayList();
        this.f23738y = new ArrayList<>();
        this.f23714a = str;
        this.f23721h = scActionFrom;
        this.f23717d = str2;
        this.f23719f = String.valueOf(pzi0.m174454o() / 1000);
    }

    /* JADX INFO: renamed from: A */
    public C8145d m39463A(int i) {
        this.f23726m = i;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public C8145d m39464B(String str) {
        this.f23728o = str;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public void m39465C(List<String> list) {
        this.f23737x = list;
    }

    /* JADX INFO: renamed from: D */
    public void m39466D(String str) {
        this.f23733t = str;
    }

    /* JADX INFO: renamed from: E */
    public C8145d m39467E(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f23717d = str;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public void m39468F(String str) {
        this.f23734u = str;
    }

    /* JADX INFO: renamed from: a */
    public C8145d m39469a(String str) {
        this.f23718e = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C8145d m39470b(pf60<String, Object> pf60Var) {
        if (pf60Var == null) {
            return this;
        }
        this.f23738y.add(pf60Var);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C8145d m39471c(f1g0 f1g0Var, ik4 ik4Var) {
        if (NullChecker.m82486a(f1g0Var)) {
            ik4 ik4VarMo39818l = f1g0Var.mo39818l();
            if (NullChecker.m82486a(ik4VarMo39818l) && NullChecker.m82486a(ik4VarMo39818l.m140257b()) && NullChecker.m82486a(ik4VarMo39818l.m140257b().f115329a) && NullChecker.m82486a(ik4VarMo39818l.m140257b().f115330b)) {
                if (NullChecker.m82486a(ik4VarMo39818l.m140260e()) && m39482n(ik4VarMo39818l.m140260e().f20214id)) {
                    this.f23722i = 0;
                } else {
                    this.f23722i = (NullChecker.m82486a(ik4VarMo39818l.m140257b().f115329a) && ik4VarMo39818l.m140257b().f115329a.m222761e().booleanValue()) ? 0 : 1;
                }
                this.f23724k = (NullChecker.m82486a(ik4VarMo39818l.m140257b().f115330b) && ik4VarMo39818l.m140257b().f115330b.m222761e().booleanValue()) ? 1 : 0;
            } else {
                if (NullChecker.m82486a(ik4VarMo39818l) && NullChecker.m82486a(ik4VarMo39818l.m140260e()) && m39482n(ik4VarMo39818l.m140260e().f20214id)) {
                    this.f23722i = 0;
                } else {
                    this.f23722i = 2;
                }
                this.f23724k = 2;
            }
        }
        if (NullChecker.m82486a(ik4Var) && NullChecker.m82486a(ik4Var.m140257b()) && NullChecker.m82486a(ik4Var.m140257b().f115329a) && NullChecker.m82486a(ik4Var.m140257b().f115330b)) {
            if (NullChecker.m82486a(ik4Var.m140260e()) && m39482n(ik4Var.m140260e().f20214id)) {
                this.f23723j = 0;
            } else {
                this.f23723j = !ik4Var.m140257b().f115329a.m222761e().booleanValue() ? 1 : 0;
            }
            this.f23725l = ik4Var.m140257b().f115330b.m222761e().booleanValue() ? 1 : 0;
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C8145d m39472d(f1g0 f1g0Var) {
        if (NullChecker.m82486a(f1g0Var)) {
            ik4 ik4VarMo39821o = f1g0Var.mo39821o();
            if (NullChecker.m82486a(ik4VarMo39821o) && NullChecker.m82486a(ik4VarMo39821o.m140257b()) && NullChecker.m82486a(ik4VarMo39821o.m140257b().f115329a) && NullChecker.m82486a(ik4VarMo39821o.m140257b().f115330b)) {
                if (NullChecker.m82486a(ik4VarMo39821o.m140260e()) && m39482n(ik4VarMo39821o.m140260e().f20214id)) {
                    this.f23722i = 0;
                } else {
                    this.f23722i = !ik4VarMo39821o.m140257b().f115329a.m222761e().booleanValue() ? 1 : 0;
                }
                this.f23724k = ik4VarMo39821o.m140257b().f115330b.m222761e().booleanValue() ? 1 : 0;
                return this;
            }
            if (NullChecker.m82486a(ik4VarMo39821o) && NullChecker.m82486a(ik4VarMo39821o.m140260e()) && m39482n(ik4VarMo39821o.m140260e().f20214id)) {
                this.f23722i = 0;
            } else {
                this.f23722i = 2;
            }
            this.f23724k = 2;
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public void m39473e(Map<String, String> map) {
        map.put("pageId", this.f23714a);
        map.put("action_name", this.f23720g.getName());
        map.put("action_type", this.f23716c);
        map.put(WBConstants.AUTH_PARAMS_VERSION, uqb0.f180413s);
        map.put("update_relationships_source", this.f23721h.getFrom());
        map.put("os", "android");
    }

    /* JADX INFO: renamed from: f */
    public HomeStatisticsHelper.ScActionFrom m39474f() {
        return this.f23721h;
    }

    /* JADX INFO: renamed from: g */
    public String m39475g() {
        return this.f23716c;
    }

    /* JADX INFO: renamed from: h */
    public String m39476h() {
        return this.f23714a;
    }

    /* JADX INFO: renamed from: i */
    public int m39477i() {
        return this.f23727n;
    }

    /* JADX INFO: renamed from: j */
    public String m39478j() {
        return this.f23733t;
    }

    /* JADX INFO: renamed from: k */
    public HomeStatisticsHelper.ScActionName m39479k() {
        return this.f23720g;
    }

    /* JADX INFO: renamed from: l */
    public pf60<String, Object>[] m39480l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new pf60("actionname", this.f23720g.getName()));
        arrayList.add(new pf60("moments_user_id", this.f23717d));
        arrayList.add(pf60.m172085a("next_IsWhiteBlock", Integer.valueOf(this.f23722i)));
        arrayList.add(pf60.m172085a("IsWhiteBlock", Integer.valueOf(this.f23723j)));
        arrayList.add(pf60.m172085a("normal_pic", Integer.valueOf(this.f23725l)));
        arrayList.add(pf60.m172085a("next_normal_pic", Integer.valueOf(this.f23724k)));
        arrayList.add(new pf60("actiontype", this.f23716c));
        arrayList.add(new pf60("code", this.f23718e));
        arrayList.add(new pf60("create_time", this.f23719f));
        arrayList.add(new pf60("update_relationships_module_id", this.f23715b));
        arrayList.add(new pf60("update_relationships_page_id", this.f23714a));
        arrayList.add(new pf60("update_relationships_source", this.f23721h.getFrom()));
        arrayList.add(new pf60("pic_uploads", Integer.valueOf(this.f23726m)));
        arrayList.add(new pf60("pic_num", Integer.valueOf(this.f23727n)));
        arrayList.add(new pf60("pic_url", this.f23728o));
        arrayList.add(new pf60("suggest_info", this.f23729p));
        arrayList.add(new pf60("swipe_scene", "default"));
        arrayList.add(new pf60("city_cover", Boolean.valueOf(this.f23730q)));
        arrayList.add(new pf60("is_selected_users", Boolean.valueOf(this.f23731r)));
        arrayList.add(new pf60("mystery_status", this.f23732s ? "mystery" : "normal"));
        arrayList.add(new pf60("profile_list_showed", du4.m118067a(Constants.SEPARATOR_COMMA, this.f23737x)));
        arrayList.add(new pf60("card_name", this.f23735v));
        arrayList.add(new pf60("online_like", Boolean.valueOf(this.f23736w)));
        if (gra.m131586J3()) {
            arrayList.add(new pf60("from_top_tab", jj40.m144998a(NewTanFragTag.ALREADY_AUTH) ? "verified" : "tantan"));
        }
        if (NullChecker.m82486a(CoreModule.f18264c) && NullChecker.m82486a(CoreModule.f18264c.f20381e0) && !TextUtils.isEmpty(this.f23717d)) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f23717d);
            if (NullChecker.m82486a(userM116503Pa) && NullChecker.m82486a(userM116503Pa.ussTags) && !TextUtils.isEmpty(userM116503Pa.ussTags.avatarIdentifier)) {
                arrayList.add(new pf60("portrait_id", userM116503Pa.ussTags.avatarIdentifier));
            }
        }
        if (!jyb.m147479J(this.f23738y)) {
            arrayList.addAll(this.f23738y);
        }
        return (pf60[]) arrayList.toArray(new pf60[arrayList.size()]);
    }

    /* JADX INFO: renamed from: m */
    public String m39481m() {
        return this.f23734u;
    }

    /* JADX INFO: renamed from: n */
    public boolean m39482n(String str) {
        if (m39483o(str)) {
            return true;
        }
        return d09.m113370g() && uih0.m196232y0(str);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m39483o(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        str.getClass();
        return str.equals(CoreSuggested.UserInfo.VIRTUAL_CARD);
    }

    /* JADX INFO: renamed from: p */
    public void m39484p() {
        this.f23719f = String.valueOf(pzi0.m174454o() / 1000);
    }

    /* JADX INFO: renamed from: q */
    public C8145d m39485q(HomeStatisticsHelper.ScActionName scActionName) {
        this.f23720g = scActionName;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public C8145d m39486r(HomeStatisticsHelper.ScActionFrom scActionFrom) {
        this.f23721h = scActionFrom;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public C8145d m39487s(String str) {
        this.f23716c = str;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public C8145d m39488t(String str) {
        this.f23735v = str;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public void m39489u(boolean z) {
        this.f23730q = z;
    }

    /* JADX INFO: renamed from: v */
    public C8145d m39490v(String str) {
        this.f23729p = str;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public C8145d m39491w(String str) {
        this.f23715b = str;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public C8145d m39492x(boolean z) {
        this.f23736w = z;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public void m39493y(boolean z) {
        this.f23732s = z;
    }

    /* JADX INFO: renamed from: z */
    public C8145d m39494z(int i) {
        this.f23727n = i + 1;
        return this;
    }

    public C8145d(String str) {
        this.f23714a = "";
        this.f23715b = "";
        this.f23716c = "click";
        this.f23717d = "";
        this.f23718e = "";
        this.f23719f = "";
        this.f23720g = HomeStatisticsHelper.ScActionName.UNKNOWN;
        this.f23721h = HomeStatisticsHelper.ScActionFrom.SUGGEST;
        this.f23722i = 0;
        this.f23723j = 0;
        this.f23724k = 1;
        this.f23725l = 1;
        this.f23726m = 0;
        this.f23727n = 1;
        this.f23728o = "";
        this.f23733t = "";
        this.f23734u = "";
        this.f23735v = "";
        this.f23736w = false;
        this.f23737x = new ArrayList();
        this.f23738y = new ArrayList<>();
        this.f23714a = str;
        this.f23719f = String.valueOf(pzi0.m174454o() / 1000);
    }
}
