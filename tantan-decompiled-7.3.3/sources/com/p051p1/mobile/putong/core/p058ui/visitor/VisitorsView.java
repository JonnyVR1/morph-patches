package com.p051p1.mobile.putong.core.p058ui.visitor;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.cfm0;
import p153l.f9c0;
import p153l.hfm0;
import p153l.pzi0;
import p153l.ujm0;
import p153l.wj90;

/* JADX INFO: loaded from: classes12.dex */
public class VisitorsView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VRelative f38979a;

    /* JADX INFO: renamed from: b */
    public HeaderFrameWrapper f38980b;

    /* JADX INFO: renamed from: c */
    public VLinear f38981c;

    /* JADX INFO: renamed from: d */
    public VText f38982d;

    /* JADX INFO: renamed from: e */
    public VText f38983e;

    /* JADX INFO: renamed from: f */
    public VText f38984f;

    /* JADX INFO: renamed from: g */
    public VText f38985g;

    public VisitorsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static String m59043c(User user) {
        if (user == null) {
            return "";
        }
        String strM59150g = C9212e.m59150g(user);
        String strM59149f = C9212e.m59149f(user);
        if (TextUtils.isEmpty(strM59150g)) {
            return strM59149f;
        }
        return strM59150g + " · " + strM59149f;
    }

    /* JADX INFO: renamed from: a */
    public final void m59044a(View view) {
        ujm0.m196414a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public Act m59045b() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    public void m59046d(cfm0 cfm0Var) {
        setBackgroundColor(-1);
        User userM121463I3 = CoreModule.f18264c.f20410n2.m121463I3(cfm0Var.f81524b.userId);
        if (userM121463I3 == null) {
            this.f38982d.setText("【异常用户】");
            this.f38980b.setBackgroundResource(0);
            return;
        }
        boolean zM206620c = wj90.m206620c(userM121463I3);
        HeaderFrameWrapper headerFrameWrapper = this.f38980b;
        if (zM206620c) {
            headerFrameWrapper.m80880i0(userM121463I3.m61308fp().profileSmall().formatted(), 2, 20);
        } else {
            headerFrameWrapper.m80891t0(userM121463I3);
        }
        bnl0.m105524M(this.f38983e, false);
        if (cfm0Var.f81523a == -2) {
            String str = (TextUtils.isEmpty(userM121463I3.location.region.city) || userM121463I3.location.isHideRegionCity()) ? "" : userM121463I3.location.region.city;
            if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(userM121463I3.location.region.country) && !userM121463I3.location.isHideRegionCountry()) {
                str = userM121463I3.location.region.country;
            }
            this.f38982d.setText(hfm0.m134813b(m59045b(), cfm0Var, userM121463I3, str));
        } else {
            this.f38982d.setText(userM121463I3.name);
            if (!CoreModule.m30930K().hideAge(userM121463I3)) {
                bnl0.m105524M(this.f38983e, true);
                this.f38983e.setText(userM121463I3.age + "");
            }
        }
        this.f38984f.setText(C9212e.m59148e(pzi0.m174454o(), cfm0Var.f81524b.lastVisitTime));
        int i = cfm0Var.f81524b.visitCount;
        String str2 = i > 0 ? String.format("访问%s次", C9212e.m59146c(i)) : "";
        if (TextUtils.isEmpty(str2)) {
            this.f38985g.setText(m59043c(userM121463I3));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (!TextUtils.isEmpty(m59043c(userM121463I3))) {
            spannableStringBuilder.append((CharSequence) " · ");
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(f9c0.f97859d)), 0, str2.length(), 33);
        spannableStringBuilder.append((CharSequence) m59043c(userM121463I3));
        this.f38985g.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m59044a(this);
        this.f38982d.setTypeface(null, 1);
    }

    public VisitorsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VisitorsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
