package com.p051p1.mobile.putong.core.p058ui.visitor;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.UnPrivilegedVisitor;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VisitorsRecommendationType;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.cfm0;
import p153l.i4g0;
import p153l.jyb;
import p153l.l51;
import p153l.lyh0;
import p153l.mjm0;
import p153l.pf60;
import p153l.pzi0;
import p153l.q8g0;
import p153l.sfj0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class VisitorsUnPrivilegeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VisitorsUnPrivilegeView f38968a;

    /* JADX INFO: renamed from: b */
    public VRelative f38969b;

    /* JADX INFO: renamed from: c */
    public HeaderFrameWrapper f38970c;

    /* JADX INFO: renamed from: d */
    public VLinear f38971d;

    /* JADX INFO: renamed from: e */
    public VLinear f38972e;

    /* JADX INFO: renamed from: f */
    public VText f38973f;

    /* JADX INFO: renamed from: g */
    public VText f38974g;

    /* JADX INFO: renamed from: h */
    public TextView f38975h;

    /* JADX INFO: renamed from: i */
    public String f38976i;

    /* JADX INFO: renamed from: j */
    public String f38977j;

    /* JADX INFO: renamed from: k */
    public String f38978k;

    public VisitorsUnPrivilegeView(Context context) {
        super(context);
        this.f38976i = "";
        this.f38977j = "p_my_visitor";
        this.f38978k = "p_my_visitor,e_visitor_decrypt,click";
    }

    /* JADX INFO: renamed from: h */
    public static String m59030h(User user) {
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
    public static CharSequence m59031i(UnPrivilegedVisitor unPrivilegedVisitor, User user) {
        if (TextUtils.equals(unPrivilegedVisitor.recommendationType, VisitorsRecommendationType.visitMost)) {
            return C9212e.m59148e(pzi0.m174454o(), unPrivilegedVisitor.lastVisitTime).replaceAll("月", "个月");
        }
        if (TextUtils.equals(unPrivilegedVisitor.recommendationType, VisitorsRecommendationType.sameCity)) {
            return m59030h(user);
        }
        if (TextUtils.equals(unPrivilegedVisitor.recommendationType, VisitorsRecommendationType.latestActive)) {
            return user == null ? "" : C9212e.m59149f(user).replaceAll("月", "个月");
        }
        if (TextUtils.equals(unPrivilegedVisitor.recommendationType, "matched")) {
            return C9212e.m59148e(pzi0.m174454o(), unPrivilegedVisitor.lastVisitTime).replaceAll("月", "个月");
        }
        if (user == null) {
            return "";
        }
        return user.age + "岁";
    }

    /* JADX INFO: renamed from: j */
    public static CharSequence m59032j(UnPrivilegedVisitor unPrivilegedVisitor, User user) {
        CharSequence charSequenceM59031i = m59031i(unPrivilegedVisitor, user);
        int i = unPrivilegedVisitor.visitCount;
        String str = i > 0 ? String.format("访问%s次", C9212e.m59146c(i)) : "";
        if (TextUtils.isEmpty(str)) {
            return charSequenceM59031i;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (!TextUtils.isEmpty(charSequenceM59031i)) {
            spannableStringBuilder.append((CharSequence) " · ");
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#fe7e1d")), 0, str.length(), 33);
        spannableStringBuilder.append(charSequenceM59031i);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: k */
    public static CharSequence m59033k(UnPrivilegedVisitor unPrivilegedVisitor) {
        String str;
        String str2 = unPrivilegedVisitor.recommendationText;
        User userM121463I3 = CoreModule.f18264c.f20410n2.m121463I3(unPrivilegedVisitor.userId);
        if (userM121463I3 == null) {
            return "【异常用户】";
        }
        if (TextUtils.equals(unPrivilegedVisitor.recommendationType, VisitorsRecommendationType.visitMost)) {
            return q8g0.m175796b0(unPrivilegedVisitor.recommendationText.replace("%s", String.format(" %s ", Integer.valueOf(unPrivilegedVisitor.visitCount))), jyb.m147507f0(String.valueOf(unPrivilegedVisitor.visitCount)), Color.parseColor("#fe7e1d"), Typeface.DEFAULT);
        }
        if (!TextUtils.equals(unPrivilegedVisitor.recommendationType, VisitorsRecommendationType.sameCity)) {
            return str2;
        }
        User userMe_ = CoreModule.m30930K().me_();
        if (NullChecker.m82486a(userM121463I3.location.region.city)) {
            str = userM121463I3.location.region.city;
        } else if (NullChecker.m82486a(userMe_.location.region.city)) {
            str = userMe_.location.region.city;
        } else {
            str = NullChecker.m82486a(userM121463I3.location.region.country) ? userM121463I3.location.region.country : "中国";
        }
        return q8g0.m175796b0(unPrivilegedVisitor.recommendationText.replace("%s", str), jyb.m147507f0(str), Color.parseColor("#fe7e1d"), Typeface.DEFAULT);
    }

    /* JADX INFO: renamed from: f */
    public final void m59034f(View view) {
        mjm0.m158595a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public Act m59035g() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: l */
    public final String m59036l(String str) {
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
    public final /* synthetic */ void m59037m(final AbstractC9208a.a aVar, PurchaseType purchaseType) {
        l51.m152888H(m59035g(), new Runnable() { // from class: l.ljm0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.getData();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m59038n(final AbstractC9208a.a aVar, int i, View view) {
        CoreModule.m30933P().m143410g().mo36024Og(m59035g(), CoreModule.m30930K().isNewMainActContext(m59035g()) ? "p_navigation,visit_module" : "p_navigation_visit,button_pull", new y20() { // from class: l.kjm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127116a.m59037m(aVar, (PurchaseType) obj);
            }
        }, null, null, Privilege.oDiamondVisitor);
        i4g0.m138523u("e_visitor_click_infos", this.f38977j, jyb.m147494Y("visitor_click_type", TextUtils.isEmpty(this.f38976i) ? "title" : this.f38976i), jyb.m147494Y("user_index", String.valueOf(i + 1)), jyb.m147494Y("visitor_button_text", this.f38975h.getText()), jyb.m147494Y("visitor_user_title", this.f38973f.getText()), jyb.m147494Y("visitor_user_sub_title", this.f38974g.getText()));
        this.f38976i = "";
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m59039o(View view) {
        this.f38976i = "avatar";
        this.f38968a.performClick();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m59034f(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m59040p(UnPrivilegedVisitor unPrivilegedVisitor, View view) {
        sfj0.m185598e("e_visitor_decrypt", this.f38977j, pf60.m172085a("visitor_decrypt_type", m59036l(unPrivilegedVisitor.recommendationType)));
        this.f38976i = "button";
        this.f38968a.performClick();
    }

    /* JADX INFO: renamed from: q */
    public void m59041q(cfm0 cfm0Var, final int i, final AbstractC9208a.a aVar) {
        setBackgroundColor(-1);
        final UnPrivilegedVisitor unPrivilegedVisitor = cfm0Var.f81526d;
        User userM121463I3 = CoreModule.f18264c.f20410n2.m121463I3(unPrivilegedVisitor.userId);
        if (userM121463I3 == null) {
            this.f38973f.setText("【异常用户】");
            uqb0.f180374G.m98798o(this.f38970c.get_pic());
            this.f38970c.m80878G0(false);
            this.f38974g.setText("");
            return;
        }
        boolean z = cfm0Var.f81527e;
        HeaderFrameWrapper headerFrameWrapper = this.f38970c;
        if (z) {
            headerFrameWrapper.m80880i0(userM121463I3.m61308fp().profileSmall().formatted(), 2, 20);
        } else {
            headerFrameWrapper.m80891t0(userM121463I3);
        }
        this.f38973f.setText(m59033k(unPrivilegedVisitor));
        this.f38973f.setTypeface(lyh0.m156283c(3), 0);
        this.f38974g.setText(m59032j(unPrivilegedVisitor, userM121463I3));
        sfj0.m185605l("e_visitor_decrypt", this.f38977j, pf60.m172085a("visitor_decrypt_type", m59036l(unPrivilegedVisitor.recommendationType)));
        this.f38975h.setText(unPrivilegedVisitor.buttonText);
        this.f38975h.setTypeface(lyh0.m156283c(3), 0);
        bnl0.m105509E0(this.f38968a, new View.OnClickListener() { // from class: l.hjm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110246a.m59038n(aVar, i, view);
            }
        });
        bnl0.m105509E0(this.f38970c, new View.OnClickListener() { // from class: l.ijm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115249a.m59039o(view);
            }
        });
        bnl0.m105509E0(this.f38975h, new View.OnClickListener() { // from class: l.jjm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121197a.m59040p(unPrivilegedVisitor, view);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m59042r(String str, String str2) {
        this.f38977j = str;
        this.f38978k = str2;
    }

    public VisitorsUnPrivilegeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38976i = "";
        this.f38977j = "p_my_visitor";
        this.f38978k = "p_my_visitor,e_visitor_decrypt,click";
    }

    public VisitorsUnPrivilegeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38976i = "";
        this.f38977j = "p_my_visitor";
        this.f38978k = "p_my_visitor,e_visitor_decrypt,click";
    }
}
