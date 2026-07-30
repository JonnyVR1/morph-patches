package com.p046p1.mobile.putong.core.p053ui.visitor;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.UnPrivilegedVisitor;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VisitorsRecommendationType;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.e30;
import p149l.e51;
import p149l.eqh0;
import p149l.i0g0;
import p149l.iam0;
import p149l.j760;
import p149l.mqi0;
import p149l.o6j0;
import p149l.qib0;
import p149l.vwb;
import p149l.xdl0;
import p149l.y5m0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class VisitorsUnPrivilegeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VisitorsUnPrivilegeView f38120a;

    /* JADX INFO: renamed from: b */
    public VRelative f38121b;

    /* JADX INFO: renamed from: c */
    public HeaderFrameWrapper f38122c;

    /* JADX INFO: renamed from: d */
    public VLinear f38123d;

    /* JADX INFO: renamed from: e */
    public VLinear f38124e;

    /* JADX INFO: renamed from: f */
    public VText f38125f;

    /* JADX INFO: renamed from: g */
    public VText f38126g;

    /* JADX INFO: renamed from: h */
    public TextView f38127h;

    /* JADX INFO: renamed from: i */
    public String f38128i;

    /* JADX INFO: renamed from: j */
    public String f38129j;

    /* JADX INFO: renamed from: k */
    public String f38130k;

    public VisitorsUnPrivilegeView(Context context) {
        super(context);
        this.f38128i = "";
        this.f38129j = "p_my_visitor";
        this.f38130k = "p_my_visitor,e_visitor_decrypt,click";
    }

    /* JADX INFO: renamed from: h */
    public static String m57847h(User user) {
        if (user == null) {
            return "";
        }
        int i = user.location.distance;
        if (i <= 100) {
            return "距离你100m";
        }
        if (i < 1000) {
            return "距离你" + i + "m";
        }
        if (i >= 10000) {
            return "距离你10+km";
        }
        return "距离你" + (i / 1000) + "km";
    }

    /* JADX INFO: renamed from: i */
    public static CharSequence m57848i(UnPrivilegedVisitor unPrivilegedVisitor, User user) {
        if (TextUtils.equals(unPrivilegedVisitor.recommendationType, VisitorsRecommendationType.visitMost)) {
            return C9049e.m57965e(mqi0.m155944o(), unPrivilegedVisitor.lastVisitTime).replaceAll("月", "个月");
        }
        if (TextUtils.equals(unPrivilegedVisitor.recommendationType, VisitorsRecommendationType.sameCity)) {
            return m57847h(user);
        }
        if (TextUtils.equals(unPrivilegedVisitor.recommendationType, VisitorsRecommendationType.latestActive)) {
            return user == null ? "" : C9049e.m57966f(user).replaceAll("月", "个月");
        }
        if (TextUtils.equals(unPrivilegedVisitor.recommendationType, "matched")) {
            return C9049e.m57965e(mqi0.m155944o(), unPrivilegedVisitor.lastVisitTime).replaceAll("月", "个月");
        }
        if (user == null) {
            return "";
        }
        return user.age + "岁";
    }

    /* JADX INFO: renamed from: j */
    public static CharSequence m57849j(UnPrivilegedVisitor unPrivilegedVisitor, User user) {
        CharSequence charSequenceM57848i = m57848i(unPrivilegedVisitor, user);
        int i = unPrivilegedVisitor.visitCount;
        String str = i > 0 ? String.format("访问%s次", C9049e.m57963c(i)) : "";
        if (TextUtils.isEmpty(str)) {
            return charSequenceM57848i;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (!TextUtils.isEmpty(charSequenceM57848i)) {
            spannableStringBuilder.append((CharSequence) " · ");
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#fe7e1d")), 0, str.length(), 33);
        spannableStringBuilder.append(charSequenceM57848i);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: k */
    public static CharSequence m57850k(UnPrivilegedVisitor unPrivilegedVisitor) {
        String str;
        String str2 = unPrivilegedVisitor.recommendationText;
        User userM175432I3 = CoreModule.f17545c.f19668n2.m175432I3(unPrivilegedVisitor.userId);
        if (userM175432I3 == null) {
            return "【异常用户】";
        }
        if (TextUtils.equals(unPrivilegedVisitor.recommendationType, VisitorsRecommendationType.visitMost)) {
            return i0g0.m133861b0(unPrivilegedVisitor.recommendationText.replace("%s", String.format(" %s ", Integer.valueOf(unPrivilegedVisitor.visitCount))), vwb.m200324f0(String.valueOf(unPrivilegedVisitor.visitCount)), Color.parseColor("#fe7e1d"), Typeface.DEFAULT);
        }
        if (!TextUtils.equals(unPrivilegedVisitor.recommendationType, VisitorsRecommendationType.sameCity)) {
            return str2;
        }
        User userMe_ = CoreModule.m29932K().me_();
        if (NullChecker.m81303a(userM175432I3.location.region.city)) {
            str = userM175432I3.location.region.city;
        } else if (NullChecker.m81303a(userMe_.location.region.city)) {
            str = userMe_.location.region.city;
        } else {
            str = NullChecker.m81303a(userM175432I3.location.region.country) ? userM175432I3.location.region.country : "中国";
        }
        return i0g0.m133861b0(unPrivilegedVisitor.recommendationText.replace("%s", str), vwb.m200324f0(str), Color.parseColor("#fe7e1d"), Typeface.DEFAULT);
    }

    /* JADX INFO: renamed from: f */
    public final void m57851f(View view) {
        iam0.m135161a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public Act m57852g() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: l */
    public final String m57853l(String str) {
        if (TextUtils.equals(str, VisitorsRecommendationType.visitMost)) {
            return "1";
        }
        if (TextUtils.equals(str, VisitorsRecommendationType.sameCity)) {
            return "2";
        }
        if (TextUtils.equals(str, VisitorsRecommendationType.latestActive)) {
            return "3";
        }
        return TextUtils.equals(str, "matched") ? "4" : "5";
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m57854m(final AbstractC9045a.a aVar, PurchaseType purchaseType) {
        e51.m114743H(m57852g(), new Runnable() { // from class: l.ham0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.getData();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m57855n(final AbstractC9045a.a aVar, int i, View view) {
        CoreModule.m29935P().m94656g().mo35021Og(m57852g(), CoreModule.m29932K().isNewMainActContext(m57852g()) ? "p_navigation,visit_module" : "p_navigation_visit,button_pull", new e30() { // from class: l.gam0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101683a.m57854m(aVar, (PurchaseType) obj);
            }
        }, null, null, Privilege.oDiamondVisitor);
        zvf0.m220399u("e_visitor_click_infos", this.f38129j, vwb.m200311Y("visitor_click_type", TextUtils.isEmpty(this.f38128i) ? "title" : this.f38128i), vwb.m200311Y("user_index", String.valueOf(i + 1)), vwb.m200311Y("visitor_button_text", this.f38127h.getText()), vwb.m200311Y("visitor_user_title", this.f38125f.getText()), vwb.m200311Y("visitor_user_sub_title", this.f38126g.getText()));
        this.f38128i = "";
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m57856o(View view) {
        this.f38128i = "avatar";
        this.f38120a.performClick();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57851f(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m57857p(UnPrivilegedVisitor unPrivilegedVisitor, View view) {
        o6j0.m162861e("e_visitor_decrypt", this.f38129j, j760.m140076a("visitor_decrypt_type", m57853l(unPrivilegedVisitor.recommendationType)));
        this.f38128i = "button";
        this.f38120a.performClick();
    }

    /* JADX INFO: renamed from: q */
    public void m57858q(y5m0 y5m0Var, final int i, final AbstractC9045a.a aVar) {
        setBackgroundColor(-1);
        final UnPrivilegedVisitor unPrivilegedVisitor = y5m0Var.f196457d;
        User userM175432I3 = CoreModule.f17545c.f19668n2.m175432I3(unPrivilegedVisitor.userId);
        if (userM175432I3 == null) {
            this.f38125f.setText("【异常用户】");
            qib0.f154691G.m184725o(this.f38122c.get_pic());
            this.f38122c.m79695G0(false);
            this.f38126g.setText("");
            return;
        }
        boolean z = y5m0Var.f196458e;
        HeaderFrameWrapper headerFrameWrapper = this.f38122c;
        if (z) {
            headerFrameWrapper.m79697i0(userM175432I3.m60124fp().profileSmall().formatted(), 2, 20);
        } else {
            headerFrameWrapper.m79708t0(userM175432I3);
        }
        this.f38125f.setText(m57850k(unPrivilegedVisitor));
        this.f38125f.setTypeface(eqh0.m117752c(3), 0);
        this.f38126g.setText(m57849j(unPrivilegedVisitor, userM175432I3));
        o6j0.m162868l("e_visitor_decrypt", this.f38129j, j760.m140076a("visitor_decrypt_type", m57853l(unPrivilegedVisitor.recommendationType)));
        this.f38127h.setText(unPrivilegedVisitor.buttonText);
        this.f38127h.setTypeface(eqh0.m117752c(3), 0);
        xdl0.m208329E0(this.f38120a, new View.OnClickListener() { // from class: l.dam0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85242a.m57855n(aVar, i, view);
            }
        });
        xdl0.m208329E0(this.f38122c, new View.OnClickListener() { // from class: l.eam0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90215a.m57856o(view);
            }
        });
        xdl0.m208329E0(this.f38127h, new View.OnClickListener() { // from class: l.fam0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96617a.m57857p(unPrivilegedVisitor, view);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m57859r(String str, String str2) {
        this.f38129j = str;
        this.f38130k = str2;
    }

    public VisitorsUnPrivilegeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38128i = "";
        this.f38129j = "p_my_visitor";
        this.f38130k = "p_my_visitor,e_visitor_decrypt,click";
    }

    public VisitorsUnPrivilegeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38128i = "";
        this.f38129j = "p_my_visitor";
        this.f38130k = "p_my_visitor,e_visitor_decrypt,click";
    }
}
