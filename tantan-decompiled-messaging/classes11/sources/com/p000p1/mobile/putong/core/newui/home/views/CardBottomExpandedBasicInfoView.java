package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.vip.privilegeNewUi.VipNewUtils;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.t100;
import l.tm90;
import l.u59;
import l.x2c0;
import l.xdl0;
import l.xg4;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBottomExpandedBasicInfoView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f2238c;

    /* JADX INFO: renamed from: d */
    public VText f2239d;

    /* JADX INFO: renamed from: e */
    public ImageView f2240e;

    /* JADX INFO: renamed from: f */
    public ImageView f2241f;

    /* JADX INFO: renamed from: g */
    public ImageView f2242g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f2243h;

    /* JADX INFO: renamed from: i */
    @ColorInt
    public int f2244i;

    public CardBottomExpandedBasicInfoView(Context context) {
        super(context);
        this.f2244i = Color.parseColor("#FFFFFF");
    }

    /* JADX INFO: renamed from: V */
    private void m2910V(User user) {
        boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
        ImageView imageView = this.f2240e;
        if (zIsPicVerificationVerified) {
            xdl0.M(imageView, true);
        } else {
            xdl0.M(imageView, false);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m2911P(View view) {
        xg4.a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m2912Q(User user) {
        if (user == null) {
            return true;
        }
        if (TextUtils.equals(((DbObject) user).id, CoreModule.H().userId())) {
            return false;
        }
        return user.isBannedNew() || user.isAccountCancellation();
    }

    /* JADX INFO: renamed from: R */
    public final void m2913R(User user, boolean z) {
        if (m2912Q(user)) {
            this.f2239d.setText((user.isHideAgeFromSVip() || user.age.intValue() <= 0 || user.isHideAgeForTeamAccount()) ? "" : String.valueOf(user.age));
        } else {
            this.f2239d.setText(String.valueOf(user.age));
        }
        this.f2239d.setTextColor(this.f2244i);
        boolean z2 = !user.isHideAgeFromSVipWithOutMe();
        if (z && user.isHideAgeFromSVip()) {
            z2 = false;
        }
        xdl0.M(this.f2239d, z2);
    }

    /* JADX INFO: renamed from: S */
    public final void m2914S(User user, boolean z) {
        int iF = tm90.d().f(user);
        if (iF == -1 || xdl0.O0(this.f2240e)) {
            this.f2241f.setVisibility(8);
        } else {
            this.f2241f.setVisibility(0);
            tm90.d().j(iF, this.f2241f, false);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m2915T(User user) {
        boolean zM2912Q = m2912Q(user);
        VText vText = this.f2238c;
        if (zM2912Q) {
            vText.setText(user.publicId);
        } else {
            vText.setText(user.name);
        }
        this.f2238c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f2238c.setTextColor(this.f2244i);
    }

    /* JADX INFO: renamed from: W */
    public void m2916W(User user, boolean z, boolean z2) {
        if (user == null) {
            return;
        }
        m2915T(user);
        m2913R(user, z);
        m2910V(user);
        m2914S(user, z);
        m2917X(user, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X */
    public final void m2917X(User user, boolean z, boolean z2) {
        if (user == null) {
            xdl0.M(this.f2242g, false);
            return;
        }
        if ((user.isSVIP() && user.isHideIconFromSVip()) || (user.isVIP() && user.gpHideVip())) {
            xdl0.M(this.f2242g, false);
            return;
        }
        if (z && (user.isHideIconFromSVipWithMe() || user.gpHideVip())) {
            xdl0.M(this.f2242g, false);
            return;
        }
        if (CoreModule.o.d().ve(user)) {
            xdl0.M(this.f2242g, true);
            this.f2242g.setImageDrawable(CoreModule.b.getResources().getDrawable(x2c0.Rc));
            return;
        }
        if (u59.S() && user.isSVIP()) {
            xdl0.M(this.f2242g, true);
            this.f2242g.setImageDrawable(CoreModule.b.getResources().getDrawable(x2c0.Qc));
            return;
        }
        boolean zIsVIP = user.isVIP();
        ImageView imageView = this.f2242g;
        if (!zIsVIP) {
            xdl0.M(imageView, false);
            return;
        }
        xdl0.M(imageView, true);
        VipNewUtils.d(getContext(), this.f2242g, "vip");
        this.f2242g.setImageDrawable(CoreModule.b.getResources().getDrawable(x2c0.Sc));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2911P(this);
        xdl0.U(this, t100.d(4.0f));
    }

    public void setTextColor(int i) {
        this.f2244i = i;
    }

    public CardBottomExpandedBasicInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2244i = Color.parseColor("#FFFFFF");
    }

    public CardBottomExpandedBasicInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2244i = Color.parseColor("#FFFFFF");
    }
}
