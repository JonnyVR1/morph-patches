package com.p046p1.mobile.putong.core.newui.home;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p046p1.mobile.putong.data.User;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p149l.et4;
import p149l.j760;
import p149l.jj4;
import p149l.mah0;
import p149l.mqi0;
import p149l.qib0;
import p149l.upa;
import p149l.va40;
import p149l.vwb;
import p149l.vy8;
import p149l.wsf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.d */
/* JADX INFO: loaded from: classes11.dex */
public class C7994d {

    /* JADX INFO: renamed from: a */
    public String f22972a;

    /* JADX INFO: renamed from: b */
    public String f22973b;

    /* JADX INFO: renamed from: c */
    public String f22974c;

    /* JADX INFO: renamed from: d */
    public String f22975d;

    /* JADX INFO: renamed from: e */
    public String f22976e;

    /* JADX INFO: renamed from: f */
    public String f22977f;

    /* JADX INFO: renamed from: g */
    public HomeStatisticsHelper.ScActionName f22978g;

    /* JADX INFO: renamed from: h */
    public HomeStatisticsHelper.ScActionFrom f22979h;

    /* JADX INFO: renamed from: i */
    public int f22980i;

    /* JADX INFO: renamed from: j */
    public int f22981j;

    /* JADX INFO: renamed from: k */
    public int f22982k;

    /* JADX INFO: renamed from: l */
    public int f22983l;

    /* JADX INFO: renamed from: m */
    public int f22984m;

    /* JADX INFO: renamed from: n */
    public int f22985n;

    /* JADX INFO: renamed from: o */
    public String f22986o;

    /* JADX INFO: renamed from: p */
    public String f22987p;

    /* JADX INFO: renamed from: q */
    public boolean f22988q;

    /* JADX INFO: renamed from: r */
    public boolean f22989r;

    /* JADX INFO: renamed from: s */
    public boolean f22990s;

    /* JADX INFO: renamed from: t */
    public String f22991t;

    /* JADX INFO: renamed from: u */
    public String f22992u;

    /* JADX INFO: renamed from: v */
    public String f22993v;

    /* JADX INFO: renamed from: w */
    public boolean f22994w;

    /* JADX INFO: renamed from: x */
    public List<String> f22995x;

    /* JADX INFO: renamed from: y */
    public ArrayList<j760<String, Object>> f22996y;

    public C7994d(String str, HomeStatisticsHelper.ScActionFrom scActionFrom, String str2) {
        this.f22972a = "";
        this.f22973b = "";
        this.f22974c = "click";
        this.f22975d = "";
        this.f22976e = "";
        this.f22977f = "";
        this.f22978g = HomeStatisticsHelper.ScActionName.UNKNOWN;
        this.f22979h = HomeStatisticsHelper.ScActionFrom.SUGGEST;
        this.f22980i = 0;
        this.f22981j = 0;
        this.f22982k = 1;
        this.f22983l = 1;
        this.f22984m = 0;
        this.f22985n = 1;
        this.f22986o = "";
        this.f22991t = "";
        this.f22992u = "";
        this.f22993v = "";
        this.f22994w = false;
        this.f22995x = new ArrayList();
        this.f22996y = new ArrayList<>();
        this.f22972a = str;
        this.f22979h = scActionFrom;
        this.f22975d = str2;
        this.f22977f = String.valueOf(mqi0.m155944o() / 1000);
    }

    /* JADX INFO: renamed from: A */
    public C7994d m38460A(int i) {
        this.f22984m = i;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public C7994d m38461B(String str) {
        this.f22986o = str;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public void m38462C(List<String> list) {
        this.f22995x = list;
    }

    /* JADX INFO: renamed from: D */
    public void m38463D(String str) {
        this.f22991t = str;
    }

    /* JADX INFO: renamed from: E */
    public C7994d m38464E(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f22975d = str;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public void m38465F(String str) {
        this.f22992u = str;
    }

    /* JADX INFO: renamed from: a */
    public C7994d m38466a(String str) {
        this.f22976e = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C7994d m38467b(j760<String, Object> j760Var) {
        if (j760Var == null) {
            return this;
        }
        this.f22996y.add(j760Var);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C7994d m38468c(wsf0 wsf0Var, jj4 jj4Var) {
        if (NullChecker.m81303a(wsf0Var)) {
            jj4 jj4VarMo38815l = wsf0Var.mo38815l();
            if (NullChecker.m81303a(jj4VarMo38815l) && NullChecker.m81303a(jj4VarMo38815l.m141743b()) && NullChecker.m81303a(jj4VarMo38815l.m141743b().f118233a) && NullChecker.m81303a(jj4VarMo38815l.m141743b().f118234b)) {
                if (NullChecker.m81303a(jj4VarMo38815l.m141746e()) && m38479n(jj4VarMo38815l.m141746e().f19472id)) {
                    this.f22980i = 0;
                } else {
                    this.f22980i = (NullChecker.m81303a(jj4VarMo38815l.m141743b().f118233a) && jj4VarMo38815l.m141743b().f118233a.m221515e().booleanValue()) ? 0 : 1;
                }
                this.f22982k = (NullChecker.m81303a(jj4VarMo38815l.m141743b().f118234b) && jj4VarMo38815l.m141743b().f118234b.m221515e().booleanValue()) ? 1 : 0;
            } else {
                if (NullChecker.m81303a(jj4VarMo38815l) && NullChecker.m81303a(jj4VarMo38815l.m141746e()) && m38479n(jj4VarMo38815l.m141746e().f19472id)) {
                    this.f22980i = 0;
                } else {
                    this.f22980i = 2;
                }
                this.f22982k = 2;
            }
        }
        if (NullChecker.m81303a(jj4Var) && NullChecker.m81303a(jj4Var.m141743b()) && NullChecker.m81303a(jj4Var.m141743b().f118233a) && NullChecker.m81303a(jj4Var.m141743b().f118234b)) {
            if (NullChecker.m81303a(jj4Var.m141746e()) && m38479n(jj4Var.m141746e().f19472id)) {
                this.f22981j = 0;
            } else {
                this.f22981j = !jj4Var.m141743b().f118233a.m221515e().booleanValue() ? 1 : 0;
            }
            this.f22983l = jj4Var.m141743b().f118234b.m221515e().booleanValue() ? 1 : 0;
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C7994d m38469d(wsf0 wsf0Var) {
        if (NullChecker.m81303a(wsf0Var)) {
            jj4 jj4VarMo38818o = wsf0Var.mo38818o();
            if (NullChecker.m81303a(jj4VarMo38818o) && NullChecker.m81303a(jj4VarMo38818o.m141743b()) && NullChecker.m81303a(jj4VarMo38818o.m141743b().f118233a) && NullChecker.m81303a(jj4VarMo38818o.m141743b().f118234b)) {
                if (NullChecker.m81303a(jj4VarMo38818o.m141746e()) && m38479n(jj4VarMo38818o.m141746e().f19472id)) {
                    this.f22980i = 0;
                } else {
                    this.f22980i = !jj4VarMo38818o.m141743b().f118233a.m221515e().booleanValue() ? 1 : 0;
                }
                this.f22982k = jj4VarMo38818o.m141743b().f118234b.m221515e().booleanValue() ? 1 : 0;
                return this;
            }
            if (NullChecker.m81303a(jj4VarMo38818o) && NullChecker.m81303a(jj4VarMo38818o.m141746e()) && m38479n(jj4VarMo38818o.m141746e().f19472id)) {
                this.f22980i = 0;
            } else {
                this.f22980i = 2;
            }
            this.f22982k = 2;
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public void m38470e(Map<String, String> map) {
        map.put("pageId", this.f22972a);
        map.put("action_name", this.f22978g.getName());
        map.put("action_type", this.f22974c);
        map.put(WBConstants.AUTH_PARAMS_VERSION, qib0.f154730s);
        map.put("update_relationships_source", this.f22979h.getFrom());
        map.put("os", "android");
    }

    /* JADX INFO: renamed from: f */
    public HomeStatisticsHelper.ScActionFrom m38471f() {
        return this.f22979h;
    }

    /* JADX INFO: renamed from: g */
    public String m38472g() {
        return this.f22974c;
    }

    /* JADX INFO: renamed from: h */
    public String m38473h() {
        return this.f22972a;
    }

    /* JADX INFO: renamed from: i */
    public int m38474i() {
        return this.f22985n;
    }

    /* JADX INFO: renamed from: j */
    public String m38475j() {
        return this.f22991t;
    }

    /* JADX INFO: renamed from: k */
    public HomeStatisticsHelper.ScActionName m38476k() {
        return this.f22978g;
    }

    /* JADX INFO: renamed from: l */
    public j760<String, Object>[] m38477l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j760("actionname", this.f22978g.getName()));
        arrayList.add(new j760("moments_user_id", this.f22975d));
        arrayList.add(j760.m140076a("next_IsWhiteBlock", Integer.valueOf(this.f22980i)));
        arrayList.add(j760.m140076a("IsWhiteBlock", Integer.valueOf(this.f22981j)));
        arrayList.add(j760.m140076a("normal_pic", Integer.valueOf(this.f22983l)));
        arrayList.add(j760.m140076a("next_normal_pic", Integer.valueOf(this.f22982k)));
        arrayList.add(new j760("actiontype", this.f22974c));
        arrayList.add(new j760("code", this.f22976e));
        arrayList.add(new j760("create_time", this.f22977f));
        arrayList.add(new j760("update_relationships_module_id", this.f22973b));
        arrayList.add(new j760("update_relationships_page_id", this.f22972a));
        arrayList.add(new j760("update_relationships_source", this.f22979h.getFrom()));
        arrayList.add(new j760("pic_uploads", Integer.valueOf(this.f22984m)));
        arrayList.add(new j760("pic_num", Integer.valueOf(this.f22985n)));
        arrayList.add(new j760("pic_url", this.f22986o));
        arrayList.add(new j760("suggest_info", this.f22987p));
        arrayList.add(new j760("swipe_scene", "default"));
        arrayList.add(new j760("city_cover", Boolean.valueOf(this.f22988q)));
        arrayList.add(new j760("is_selected_users", Boolean.valueOf(this.f22989r)));
        arrayList.add(new j760("mystery_status", this.f22990s ? "mystery" : "normal"));
        arrayList.add(new j760("profile_list_showed", et4.m117971a(Constants.SEPARATOR_COMMA, this.f22995x)));
        arrayList.add(new j760("card_name", this.f22993v));
        arrayList.add(new j760("online_like", Boolean.valueOf(this.f22994w)));
        if (upa.m194655J3()) {
            arrayList.add(new j760("from_top_tab", va40.m197619a(NewTanFragTag.ALREADY_AUTH) ? "verified" : "tantan"));
        }
        if (NullChecker.m81303a(CoreModule.f17545c) && NullChecker.m81303a(CoreModule.f17545c.f19639e0) && !TextUtils.isEmpty(this.f22975d)) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f22975d);
            if (NullChecker.m81303a(userM169430Pa) && NullChecker.m81303a(userM169430Pa.ussTags) && !TextUtils.isEmpty(userM169430Pa.ussTags.avatarIdentifier)) {
                arrayList.add(new j760("portrait_id", userM169430Pa.ussTags.avatarIdentifier));
            }
        }
        if (!vwb.m200296J(this.f22996y)) {
            arrayList.addAll(this.f22996y);
        }
        return (j760[]) arrayList.toArray(new j760[arrayList.size()]);
    }

    /* JADX INFO: renamed from: m */
    public String m38478m() {
        return this.f22992u;
    }

    /* JADX INFO: renamed from: n */
    public boolean m38479n(String str) {
        if (m38480o(str)) {
            return true;
        }
        return vy8.m200609g() && mah0.m153738y0(str);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m38480o(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        str.getClass();
        return str.equals(CoreSuggested.UserInfo.VIRTUAL_CARD);
    }

    /* JADX INFO: renamed from: p */
    public void m38481p() {
        this.f22977f = String.valueOf(mqi0.m155944o() / 1000);
    }

    /* JADX INFO: renamed from: q */
    public C7994d m38482q(HomeStatisticsHelper.ScActionName scActionName) {
        this.f22978g = scActionName;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public C7994d m38483r(HomeStatisticsHelper.ScActionFrom scActionFrom) {
        this.f22979h = scActionFrom;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public C7994d m38484s(String str) {
        this.f22974c = str;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public C7994d m38485t(String str) {
        this.f22993v = str;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public void m38486u(boolean z) {
        this.f22988q = z;
    }

    /* JADX INFO: renamed from: v */
    public C7994d m38487v(String str) {
        this.f22987p = str;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public C7994d m38488w(String str) {
        this.f22973b = str;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public C7994d m38489x(boolean z) {
        this.f22994w = z;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public void m38490y(boolean z) {
        this.f22990s = z;
    }

    /* JADX INFO: renamed from: z */
    public C7994d m38491z(int i) {
        this.f22985n = i + 1;
        return this;
    }

    public C7994d(String str) {
        this.f22972a = "";
        this.f22973b = "";
        this.f22974c = "click";
        this.f22975d = "";
        this.f22976e = "";
        this.f22977f = "";
        this.f22978g = HomeStatisticsHelper.ScActionName.UNKNOWN;
        this.f22979h = HomeStatisticsHelper.ScActionFrom.SUGGEST;
        this.f22980i = 0;
        this.f22981j = 0;
        this.f22982k = 1;
        this.f22983l = 1;
        this.f22984m = 0;
        this.f22985n = 1;
        this.f22986o = "";
        this.f22991t = "";
        this.f22992u = "";
        this.f22993v = "";
        this.f22994w = false;
        this.f22995x = new ArrayList();
        this.f22996y = new ArrayList<>();
        this.f22972a = str;
        this.f22977f = String.valueOf(mqi0.m155944o() / 1000);
    }
}
