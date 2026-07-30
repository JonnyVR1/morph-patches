package com.p000p1.mobile.putong.core.p004ui.visitor;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.ui.headframe.HeaderFrameWrapper;
import l.mqi0;
import l.qam0;
import l.sb90;
import l.xdl0;
import l.z0c0;
import p006l.d6m0;
import p006l.y5m0;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VisitorsView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VRelative f7912a;

    /* JADX INFO: renamed from: b */
    public HeaderFrameWrapper f7913b;

    /* JADX INFO: renamed from: c */
    public VLinear f7914c;

    /* JADX INFO: renamed from: d */
    public VText f7915d;

    /* JADX INFO: renamed from: e */
    public VText f7916e;

    /* JADX INFO: renamed from: f */
    public VText f7917f;

    /* JADX INFO: renamed from: g */
    public VText f7918g;

    public VisitorsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static String m11369c(User user) {
        if (user == null) {
            return "";
        }
        String strM11485g = C0485e.m11485g(user);
        String strM11484f = C0485e.m11484f(user);
        if (TextUtils.isEmpty(strM11485g)) {
            return strM11484f;
        }
        return strM11485g + " · " + strM11484f;
    }

    /* JADX INFO: renamed from: a */
    public final void m11370a(View view) {
        qam0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public Act m11371b() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public void m11372d(y5m0 y5m0Var) {
        setBackgroundColor(-1);
        User userM22248I3 = CoreModule.f1534c.f3657n2.m22248I3(y5m0Var.f28034b.userId);
        if (userM22248I3 == null) {
            this.f7915d.setText("【异常用户】");
            this.f7913b.setBackgroundResource(0);
            return;
        }
        boolean zC = sb90.c(userM22248I3);
        HeaderFrameWrapper headerFrameWrapper = this.f7913b;
        if (zC) {
            headerFrameWrapper.i0(userM22248I3.fp().profileSmall().formatted(), 2, 20);
        } else {
            headerFrameWrapper.t0(userM22248I3);
        }
        xdl0.M(this.f7916e, false);
        if (y5m0Var.f28033a == -2) {
            String str = (TextUtils.isEmpty(userM22248I3.location.region.city) || userM22248I3.location.isHideRegionCity()) ? "" : userM22248I3.location.region.city;
            if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(userM22248I3.location.region.country) && !userM22248I3.location.isHideRegionCountry()) {
                str = userM22248I3.location.region.country;
            }
            this.f7915d.setText(d6m0.m13810b(m11371b(), y5m0Var, userM22248I3, str));
        } else {
            this.f7915d.setText(userM22248I3.name);
            if (!CoreModule.m1851K().hideAge(userM22248I3)) {
                xdl0.M(this.f7916e, true);
                this.f7916e.setText(userM22248I3.age + "");
            }
        }
        this.f7917f.setText(C0485e.m11483e(mqi0.o(), y5m0Var.f28034b.lastVisitTime));
        int i = y5m0Var.f28034b.visitCount;
        String str2 = i > 0 ? String.format("访问%s次", C0485e.m11481c(i)) : "";
        if (TextUtils.isEmpty(str2)) {
            this.f7918g.setText(m11369c(userM22248I3));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (!TextUtils.isEmpty(m11369c(userM22248I3))) {
            spannableStringBuilder.append((CharSequence) " · ");
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(z0c0.d)), 0, str2.length(), 33);
        spannableStringBuilder.append((CharSequence) m11369c(userM22248I3));
        this.f7918g.setText(spannableStringBuilder);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11370a(this);
        this.f7915d.setTypeface((Typeface) null, 1);
    }

    public VisitorsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VisitorsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
