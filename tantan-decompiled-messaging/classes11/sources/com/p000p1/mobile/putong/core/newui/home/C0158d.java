package com.p000p1.mobile.putong.core.newui.home;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.sina.weibo.sdk.constant.WBConstants;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l.j760;
import l.mah0;
import l.qib0;
import l.upa;
import l.vwb;
import l.vy8;
import p009l.et4;
import p009l.jj4;
import p009l.mqi0;
import p009l.va40;
import p009l.wsf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0158d {

    /* JADX INFO: renamed from: a */
    public String f1750a;

    /* JADX INFO: renamed from: b */
    public String f1751b;

    /* JADX INFO: renamed from: c */
    public String f1752c;

    /* JADX INFO: renamed from: d */
    public String f1753d;

    /* JADX INFO: renamed from: e */
    public String f1754e;

    /* JADX INFO: renamed from: f */
    public String f1755f;

    /* JADX INFO: renamed from: g */
    public HomeStatisticsHelper.ScActionName f1756g;

    /* JADX INFO: renamed from: h */
    public HomeStatisticsHelper.ScActionFrom f1757h;

    /* JADX INFO: renamed from: i */
    public int f1758i;

    /* JADX INFO: renamed from: j */
    public int f1759j;

    /* JADX INFO: renamed from: k */
    public int f1760k;

    /* JADX INFO: renamed from: l */
    public int f1761l;

    /* JADX INFO: renamed from: m */
    public int f1762m;

    /* JADX INFO: renamed from: n */
    public int f1763n;

    /* JADX INFO: renamed from: o */
    public String f1764o;

    /* JADX INFO: renamed from: p */
    public String f1765p;

    /* JADX INFO: renamed from: q */
    public boolean f1766q;

    /* JADX INFO: renamed from: r */
    public boolean f1767r;

    /* JADX INFO: renamed from: s */
    public boolean f1768s;

    /* JADX INFO: renamed from: t */
    public String f1769t;

    /* JADX INFO: renamed from: u */
    public String f1770u;

    /* JADX INFO: renamed from: v */
    public String f1771v;

    /* JADX INFO: renamed from: w */
    public boolean f1772w;

    /* JADX INFO: renamed from: x */
    public List<String> f1773x;

    /* JADX INFO: renamed from: y */
    public ArrayList<j760<String, Object>> f1774y;

    public C0158d(String str, HomeStatisticsHelper.ScActionFrom scActionFrom, String str2) {
        this.f1750a = "";
        this.f1751b = "";
        this.f1752c = "click";
        this.f1753d = "";
        this.f1754e = "";
        this.f1755f = "";
        this.f1756g = HomeStatisticsHelper.ScActionName.UNKNOWN;
        this.f1757h = HomeStatisticsHelper.ScActionFrom.SUGGEST;
        this.f1758i = 0;
        this.f1759j = 0;
        this.f1760k = 1;
        this.f1761l = 1;
        this.f1762m = 0;
        this.f1763n = 1;
        this.f1764o = "";
        this.f1769t = "";
        this.f1770u = "";
        this.f1771v = "";
        this.f1772w = false;
        this.f1773x = new ArrayList();
        this.f1774y = new ArrayList<>();
        this.f1750a = str;
        this.f1757h = scActionFrom;
        this.f1753d = str2;
        this.f1755f = String.valueOf(mqi0.m18550o() / 1000);
    }

    /* JADX INFO: renamed from: A */
    public C0158d m2438A(int i) {
        this.f1762m = i;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public C0158d m2439B(String str) {
        this.f1764o = str;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public void m2440C(List<String> list) {
        this.f1773x = list;
    }

    /* JADX INFO: renamed from: D */
    public void m2441D(String str) {
        this.f1769t = str;
    }

    /* JADX INFO: renamed from: E */
    public C0158d m2442E(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f1753d = str;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public void m2443F(String str) {
        this.f1770u = str;
    }

    /* JADX INFO: renamed from: a */
    public C0158d m2444a(String str) {
        this.f1754e = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C0158d m2445b(j760<String, Object> j760Var) {
        if (j760Var == null) {
            return this;
        }
        this.f1774y.add(j760Var);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C0158d m2446c(wsf0 wsf0Var, jj4 jj4Var) {
        if (NullChecker.a(wsf0Var)) {
            jj4 jj4VarMo2811l = wsf0Var.mo2811l();
            if (NullChecker.a(jj4VarMo2811l) && NullChecker.a(jj4VarMo2811l.m17128b()) && NullChecker.a(jj4VarMo2811l.m17128b().f15201a) && NullChecker.a(jj4VarMo2811l.m17128b().f15202b)) {
                if (NullChecker.a(jj4VarMo2811l.m17131e()) && m2457n(jj4VarMo2811l.m17131e().id)) {
                    this.f1758i = 0;
                } else {
                    this.f1758i = (NullChecker.a(jj4VarMo2811l.m17128b().f15201a) && ((Boolean) jj4VarMo2811l.m17128b().f15201a.e()).booleanValue()) ? 0 : 1;
                }
                this.f1760k = (NullChecker.a(jj4VarMo2811l.m17128b().f15202b) && ((Boolean) jj4VarMo2811l.m17128b().f15202b.e()).booleanValue()) ? 1 : 0;
            } else {
                if (NullChecker.a(jj4VarMo2811l) && NullChecker.a(jj4VarMo2811l.m17131e()) && m2457n(jj4VarMo2811l.m17131e().id)) {
                    this.f1758i = 0;
                } else {
                    this.f1758i = 2;
                }
                this.f1760k = 2;
            }
        }
        if (NullChecker.a(jj4Var) && NullChecker.a(jj4Var.m17128b()) && NullChecker.a(jj4Var.m17128b().f15201a) && NullChecker.a(jj4Var.m17128b().f15202b)) {
            if (NullChecker.a(jj4Var.m17131e()) && m2457n(jj4Var.m17131e().id)) {
                this.f1759j = 0;
            } else {
                this.f1759j = !((Boolean) jj4Var.m17128b().f15201a.e()).booleanValue() ? 1 : 0;
            }
            this.f1761l = ((Boolean) jj4Var.m17128b().f15202b.e()).booleanValue() ? 1 : 0;
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C0158d m2447d(wsf0 wsf0Var) {
        if (NullChecker.a(wsf0Var)) {
            jj4 jj4VarMo2814o = wsf0Var.mo2814o();
            if (NullChecker.a(jj4VarMo2814o) && NullChecker.a(jj4VarMo2814o.m17128b()) && NullChecker.a(jj4VarMo2814o.m17128b().f15201a) && NullChecker.a(jj4VarMo2814o.m17128b().f15202b)) {
                if (NullChecker.a(jj4VarMo2814o.m17131e()) && m2457n(jj4VarMo2814o.m17131e().id)) {
                    this.f1758i = 0;
                } else {
                    this.f1758i = !((Boolean) jj4VarMo2814o.m17128b().f15201a.e()).booleanValue() ? 1 : 0;
                }
                this.f1760k = ((Boolean) jj4VarMo2814o.m17128b().f15202b.e()).booleanValue() ? 1 : 0;
                return this;
            }
            if (NullChecker.a(jj4VarMo2814o) && NullChecker.a(jj4VarMo2814o.m17131e()) && m2457n(jj4VarMo2814o.m17131e().id)) {
                this.f1758i = 0;
            } else {
                this.f1758i = 2;
            }
            this.f1760k = 2;
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public void m2448e(Map<String, String> map) {
        map.put("pageId", this.f1750a);
        map.put("action_name", this.f1756g.getName());
        map.put("action_type", this.f1752c);
        map.put(WBConstants.AUTH_PARAMS_VERSION, qib0.s);
        map.put("update_relationships_source", this.f1757h.getFrom());
        map.put("os", "android");
    }

    /* JADX INFO: renamed from: f */
    public HomeStatisticsHelper.ScActionFrom m2449f() {
        return this.f1757h;
    }

    /* JADX INFO: renamed from: g */
    public String m2450g() {
        return this.f1752c;
    }

    /* JADX INFO: renamed from: h */
    public String m2451h() {
        return this.f1750a;
    }

    /* JADX INFO: renamed from: i */
    public int m2452i() {
        return this.f1763n;
    }

    /* JADX INFO: renamed from: j */
    public String m2453j() {
        return this.f1769t;
    }

    /* JADX INFO: renamed from: k */
    public HomeStatisticsHelper.ScActionName m2454k() {
        return this.f1756g;
    }

    /* JADX INFO: renamed from: l */
    public j760<String, Object>[] m2455l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j760("actionname", this.f1756g.getName()));
        arrayList.add(new j760("moments_user_id", this.f1753d));
        arrayList.add(j760.a("next_IsWhiteBlock", Integer.valueOf(this.f1758i)));
        arrayList.add(j760.a("IsWhiteBlock", Integer.valueOf(this.f1759j)));
        arrayList.add(j760.a("normal_pic", Integer.valueOf(this.f1761l)));
        arrayList.add(j760.a("next_normal_pic", Integer.valueOf(this.f1760k)));
        arrayList.add(new j760("actiontype", this.f1752c));
        arrayList.add(new j760(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_CODE, this.f1754e));
        arrayList.add(new j760("create_time", this.f1755f));
        arrayList.add(new j760("update_relationships_module_id", this.f1751b));
        arrayList.add(new j760("update_relationships_page_id", this.f1750a));
        arrayList.add(new j760("update_relationships_source", this.f1757h.getFrom()));
        arrayList.add(new j760("pic_uploads", Integer.valueOf(this.f1762m)));
        arrayList.add(new j760("pic_num", Integer.valueOf(this.f1763n)));
        arrayList.add(new j760("pic_url", this.f1764o));
        arrayList.add(new j760("suggest_info", this.f1765p));
        arrayList.add(new j760("swipe_scene", "default"));
        arrayList.add(new j760("city_cover", Boolean.valueOf(this.f1766q)));
        arrayList.add(new j760("is_selected_users", Boolean.valueOf(this.f1767r)));
        arrayList.add(new j760("mystery_status", this.f1768s ? "mystery" : "normal"));
        arrayList.add(new j760("profile_list_showed", et4.m14104a(",", this.f1773x)));
        arrayList.add(new j760("card_name", this.f1771v));
        arrayList.add(new j760("online_like", Boolean.valueOf(this.f1772w)));
        if (upa.J3()) {
            arrayList.add(new j760("from_top_tab", va40.m23330a(NewTanFragTag.ALREADY_AUTH) ? "verified" : "tantan"));
        }
        if (NullChecker.a(CoreModule.c) && NullChecker.a(CoreModule.c.e0) && !TextUtils.isEmpty(this.f1753d)) {
            User userPa = CoreModule.c.e0.Pa(this.f1753d);
            if (NullChecker.a(userPa) && NullChecker.a(userPa.ussTags) && !TextUtils.isEmpty(userPa.ussTags.avatarIdentifier)) {
                arrayList.add(new j760("portrait_id", userPa.ussTags.avatarIdentifier));
            }
        }
        if (!vwb.J(this.f1774y)) {
            arrayList.addAll(this.f1774y);
        }
        return (j760[]) arrayList.toArray(new j760[arrayList.size()]);
    }

    /* JADX INFO: renamed from: m */
    public String m2456m() {
        return this.f1770u;
    }

    /* JADX INFO: renamed from: n */
    public boolean m2457n(String str) {
        if (m2458o(str)) {
            return true;
        }
        return vy8.g() && mah0.y0(str);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2458o(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        str.getClass();
        return str.equals("VirtualCard");
    }

    /* JADX INFO: renamed from: p */
    public void m2459p() {
        this.f1755f = String.valueOf(mqi0.m18550o() / 1000);
    }

    /* JADX INFO: renamed from: q */
    public C0158d m2460q(HomeStatisticsHelper.ScActionName scActionName) {
        this.f1756g = scActionName;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public C0158d m2461r(HomeStatisticsHelper.ScActionFrom scActionFrom) {
        this.f1757h = scActionFrom;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public C0158d m2462s(String str) {
        this.f1752c = str;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public C0158d m2463t(String str) {
        this.f1771v = str;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public void m2464u(boolean z) {
        this.f1766q = z;
    }

    /* JADX INFO: renamed from: v */
    public C0158d m2465v(String str) {
        this.f1765p = str;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public C0158d m2466w(String str) {
        this.f1751b = str;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public C0158d m2467x(boolean z) {
        this.f1772w = z;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public void m2468y(boolean z) {
        this.f1768s = z;
    }

    /* JADX INFO: renamed from: z */
    public C0158d m2469z(int i) {
        this.f1763n = i + 1;
        return this;
    }

    public C0158d(String str) {
        this.f1750a = "";
        this.f1751b = "";
        this.f1752c = "click";
        this.f1753d = "";
        this.f1754e = "";
        this.f1755f = "";
        this.f1756g = HomeStatisticsHelper.ScActionName.UNKNOWN;
        this.f1757h = HomeStatisticsHelper.ScActionFrom.SUGGEST;
        this.f1758i = 0;
        this.f1759j = 0;
        this.f1760k = 1;
        this.f1761l = 1;
        this.f1762m = 0;
        this.f1763n = 1;
        this.f1764o = "";
        this.f1769t = "";
        this.f1770u = "";
        this.f1771v = "";
        this.f1772w = false;
        this.f1773x = new ArrayList();
        this.f1774y = new ArrayList<>();
        this.f1750a = str;
        this.f1755f = String.valueOf(mqi0.m18550o() / 1000);
    }
}
