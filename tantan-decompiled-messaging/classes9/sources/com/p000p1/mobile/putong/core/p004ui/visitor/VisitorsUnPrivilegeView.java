package com.p000p1.mobile.putong.core.p004ui.visitor;

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
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.camera.TTCameraConfig;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.UnPrivilegedVisitor;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.e51;
import l.eqh0;
import l.i0g0;
import l.iam0;
import l.j760;
import l.mqi0;
import l.o6j0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p006l.qib0;
import p006l.y5m0;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VisitorsUnPrivilegeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VisitorsUnPrivilegeView f7901a;

    /* JADX INFO: renamed from: b */
    public VRelative f7902b;

    /* JADX INFO: renamed from: c */
    public HeaderFrameWrapper f7903c;

    /* JADX INFO: renamed from: d */
    public VLinear f7904d;

    /* JADX INFO: renamed from: e */
    public VLinear f7905e;

    /* JADX INFO: renamed from: f */
    public VText f7906f;

    /* JADX INFO: renamed from: g */
    public VText f7907g;

    /* JADX INFO: renamed from: h */
    public TextView f7908h;

    /* JADX INFO: renamed from: i */
    public String f7909i;

    /* JADX INFO: renamed from: j */
    public String f7910j;

    /* JADX INFO: renamed from: k */
    public String f7911k;

    public VisitorsUnPrivilegeView(Context context) {
        super(context);
        this.f7909i = "";
        this.f7910j = "p_my_visitor";
        this.f7911k = "p_my_visitor,e_visitor_decrypt,click";
    }

    /* JADX INFO: renamed from: h */
    public static String m11356h(User user) {
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
        return "距离你" + (i / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) + "km";
    }

    /* JADX INFO: renamed from: i */
    public static CharSequence m11357i(UnPrivilegedVisitor unPrivilegedVisitor, User user) {
        if (TextUtils.equals(unPrivilegedVisitor.recommendationType, "visitMost")) {
            return C0485e.m11483e(mqi0.o(), unPrivilegedVisitor.lastVisitTime).replaceAll("月", "个月");
        }
        if (TextUtils.equals(unPrivilegedVisitor.recommendationType, "sameCity")) {
            return m11356h(user);
        }
        if (TextUtils.equals(unPrivilegedVisitor.recommendationType, "latestActive")) {
            return user == null ? "" : C0485e.m11484f(user).replaceAll("月", "个月");
        }
        if (TextUtils.equals(unPrivilegedVisitor.recommendationType, "matched")) {
            return C0485e.m11483e(mqi0.o(), unPrivilegedVisitor.lastVisitTime).replaceAll("月", "个月");
        }
        if (user == null) {
            return "";
        }
        return user.age + "岁";
    }

    /* JADX INFO: renamed from: j */
    public static CharSequence m11358j(UnPrivilegedVisitor unPrivilegedVisitor, User user) {
        CharSequence charSequenceM11357i = m11357i(unPrivilegedVisitor, user);
        int i = unPrivilegedVisitor.visitCount;
        String str = i > 0 ? String.format("访问%s次", C0485e.m11481c(i)) : "";
        if (TextUtils.isEmpty(str)) {
            return charSequenceM11357i;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (!TextUtils.isEmpty(charSequenceM11357i)) {
            spannableStringBuilder.append((CharSequence) " · ");
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#fe7e1d")), 0, str.length(), 33);
        spannableStringBuilder.append(charSequenceM11357i);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: k */
    public static CharSequence m11359k(UnPrivilegedVisitor unPrivilegedVisitor) {
        String str;
        String str2 = unPrivilegedVisitor.recommendationText;
        User userM22248I3 = CoreModule.f1534c.f3657n2.m22248I3(unPrivilegedVisitor.userId);
        if (userM22248I3 == null) {
            return "【异常用户】";
        }
        if (TextUtils.equals(unPrivilegedVisitor.recommendationType, "visitMost")) {
            return i0g0.b0(unPrivilegedVisitor.recommendationText.replace("%s", String.format(" %s ", Integer.valueOf(unPrivilegedVisitor.visitCount))), vwb.f0(new String[]{String.valueOf(unPrivilegedVisitor.visitCount)}), Color.parseColor("#fe7e1d"), Typeface.DEFAULT);
        }
        if (!TextUtils.equals(unPrivilegedVisitor.recommendationType, "sameCity")) {
            return str2;
        }
        User userMe_ = CoreModule.m1851K().me_();
        if (NullChecker.a(userM22248I3.location.region.city)) {
            str = userM22248I3.location.region.city;
        } else if (NullChecker.a(userMe_.location.region.city)) {
            str = userMe_.location.region.city;
        } else {
            str = NullChecker.a(userM22248I3.location.region.country) ? userM22248I3.location.region.country : "中国";
        }
        return i0g0.b0(unPrivilegedVisitor.recommendationText.replace("%s", str), vwb.f0(new String[]{str}), Color.parseColor("#fe7e1d"), Typeface.DEFAULT);
    }

    /* JADX INFO: renamed from: f */
    public final void m11360f(View view) {
        iam0.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public Act m11361g() {
        return getContext();
    }

    /* JADX INFO: renamed from: l */
    public final String m11362l(String str) {
        if (TextUtils.equals(str, "visitMost")) {
            return "1";
        }
        if (TextUtils.equals(str, "sameCity")) {
            return "2";
        }
        if (TextUtils.equals(str, "latestActive")) {
            return "3";
        }
        return TextUtils.equals(str, "matched") ? "4" : "5";
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m11363m(final AbstractC0481a.a aVar, PurchaseType purchaseType) {
        e51.H(m11361g(), new Runnable() { // from class: l.ham0
            @Override // java.lang.Runnable
            public final void run() {
                aVar.getData();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m11364n(final AbstractC0481a.a aVar, int i, View view) {
        CoreModule.m1854P().m11711g().m6958Og(m11361g(), CoreModule.m1851K().isNewMainActContext(m11361g()) ? "p_navigation,visit_module" : "p_navigation_visit,button_pull", new e30() { // from class: l.gam0
            public final void call(Object obj) {
                this.f13134a.m11363m(aVar, (PurchaseType) obj);
            }
        }, null, null, Privilege.oDiamondVisitor);
        zvf0.u("e_visitor_click_infos", this.f7910j, new j760[]{vwb.Y("visitor_click_type", TextUtils.isEmpty(this.f7909i) ? "title" : this.f7909i), vwb.Y("user_index", String.valueOf(i + 1)), vwb.Y("visitor_button_text", this.f7908h.getText()), vwb.Y("visitor_user_title", this.f7906f.getText()), vwb.Y("visitor_user_sub_title", this.f7907g.getText())});
        this.f7909i = "";
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m11365o(View view) {
        this.f7909i = TTCameraConfig.TYPE_ID_CARD_AVATAR;
        this.f7901a.performClick();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11360f(this);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m11366p(UnPrivilegedVisitor unPrivilegedVisitor, View view) {
        o6j0.e("e_visitor_decrypt", this.f7910j, new j760[]{j760.a("visitor_decrypt_type", m11362l(unPrivilegedVisitor.recommendationType))});
        this.f7909i = "button";
        this.f7901a.performClick();
    }

    /* JADX INFO: renamed from: q */
    public void m11367q(y5m0 y5m0Var, final int i, final AbstractC0481a.a aVar) {
        setBackgroundColor(-1);
        final UnPrivilegedVisitor unPrivilegedVisitor = y5m0Var.f28036d;
        User userM22248I3 = CoreModule.f1534c.f3657n2.m22248I3(unPrivilegedVisitor.userId);
        if (userM22248I3 == null) {
            this.f7906f.setText("【异常用户】");
            qib0.f19782G.o(this.f7903c.get_pic());
            this.f7903c.G0(false);
            this.f7907g.setText("");
            return;
        }
        boolean z = y5m0Var.f28037e;
        HeaderFrameWrapper headerFrameWrapper = this.f7903c;
        if (z) {
            headerFrameWrapper.i0(userM22248I3.fp().profileSmall().formatted(), 2, 20);
        } else {
            headerFrameWrapper.t0(userM22248I3);
        }
        this.f7906f.setText(m11359k(unPrivilegedVisitor));
        this.f7906f.setTypeface(eqh0.c(3), 0);
        this.f7907g.setText(m11358j(unPrivilegedVisitor, userM22248I3));
        o6j0.l("e_visitor_decrypt", this.f7910j, new j760[]{j760.a("visitor_decrypt_type", m11362l(unPrivilegedVisitor.recommendationType))});
        this.f7908h.setText(unPrivilegedVisitor.buttonText);
        this.f7908h.setTypeface(eqh0.c(3), 0);
        xdl0.E0(this.f7901a, new View.OnClickListener() { // from class: l.dam0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10264a.m11364n(aVar, i, view);
            }
        });
        xdl0.E0(this.f7903c, new View.OnClickListener() { // from class: l.eam0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11033a.m11365o(view);
            }
        });
        xdl0.E0(this.f7908h, new View.OnClickListener() { // from class: l.fam0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12621a.m11366p(unPrivilegedVisitor, view);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void m11368r(String str, String str2) {
        this.f7910j = str;
        this.f7911k = str2;
    }

    public VisitorsUnPrivilegeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7909i = "";
        this.f7910j = "p_my_visitor";
        this.f7911k = "p_my_visitor,e_visitor_decrypt,click";
    }

    public VisitorsUnPrivilegeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7909i = "";
        this.f7910j = "p_my_visitor";
        this.f7911k = "p_my_visitor,e_visitor_decrypt,click";
    }
}
