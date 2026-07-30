package com.p046p1.mobile.putong.core.p053ui.visitor;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.d6m0;
import p149l.mqi0;
import p149l.qam0;
import p149l.sb90;
import p149l.xdl0;
import p149l.y5m0;
import p149l.z0c0;

/* JADX INFO: loaded from: classes9.dex */
public class VisitorsView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VRelative f38131a;

    /* JADX INFO: renamed from: b */
    public HeaderFrameWrapper f38132b;

    /* JADX INFO: renamed from: c */
    public VLinear f38133c;

    /* JADX INFO: renamed from: d */
    public VText f38134d;

    /* JADX INFO: renamed from: e */
    public VText f38135e;

    /* JADX INFO: renamed from: f */
    public VText f38136f;

    /* JADX INFO: renamed from: g */
    public VText f38137g;

    public VisitorsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static String m57860c(User user) {
        if (user == null) {
            return "";
        }
        String strM57967g = C9049e.m57967g(user);
        String strM57966f = C9049e.m57966f(user);
        if (TextUtils.isEmpty(strM57967g)) {
            return strM57966f;
        }
        return strM57967g + " · " + strM57966f;
    }

    /* JADX INFO: renamed from: a */
    public final void m57861a(View view) {
        qam0.m173739a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public Act m57862b() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    public void m57863d(y5m0 y5m0Var) {
        setBackgroundColor(-1);
        User userM175432I3 = CoreModule.f17545c.f19668n2.m175432I3(y5m0Var.f196455b.userId);
        if (userM175432I3 == null) {
            this.f38134d.setText("【异常用户】");
            this.f38132b.setBackgroundResource(0);
            return;
        }
        boolean zM183207c = sb90.m183207c(userM175432I3);
        HeaderFrameWrapper headerFrameWrapper = this.f38132b;
        if (zM183207c) {
            headerFrameWrapper.m79697i0(userM175432I3.m60124fp().profileSmall().formatted(), 2, 20);
        } else {
            headerFrameWrapper.m79708t0(userM175432I3);
        }
        xdl0.m208344M(this.f38135e, false);
        if (y5m0Var.f196454a == -2) {
            String str = (TextUtils.isEmpty(userM175432I3.location.region.city) || userM175432I3.location.isHideRegionCity()) ? "" : userM175432I3.location.region.city;
            if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(userM175432I3.location.region.country) && !userM175432I3.location.isHideRegionCountry()) {
                str = userM175432I3.location.region.country;
            }
            this.f38134d.setText(d6m0.m110174b(m57862b(), y5m0Var, userM175432I3, str));
        } else {
            this.f38134d.setText(userM175432I3.name);
            if (!CoreModule.m29932K().hideAge(userM175432I3)) {
                xdl0.m208344M(this.f38135e, true);
                this.f38135e.setText(userM175432I3.age + "");
            }
        }
        this.f38136f.setText(C9049e.m57965e(mqi0.m155944o(), y5m0Var.f196455b.lastVisitTime));
        int i = y5m0Var.f196455b.visitCount;
        String str2 = i > 0 ? String.format("访问%s次", C9049e.m57963c(i)) : "";
        if (TextUtils.isEmpty(str2)) {
            this.f38137g.setText(m57860c(userM175432I3));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (!TextUtils.isEmpty(m57860c(userM175432I3))) {
            spannableStringBuilder.append((CharSequence) " · ");
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(z0c0.f200976d)), 0, str2.length(), 33);
        spannableStringBuilder.append((CharSequence) m57860c(userM175432I3));
        this.f38137g.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57861a(this);
        this.f38134d.setTypeface(null, 1);
    }

    public VisitorsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VisitorsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
