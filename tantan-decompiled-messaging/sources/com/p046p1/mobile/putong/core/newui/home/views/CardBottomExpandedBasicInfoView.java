package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewUtils;
import com.p046p1.mobile.putong.data.User;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.t100;
import p149l.tm90;
import p149l.u59;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xg4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomExpandedBasicInfoView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f23460c;

    /* JADX INFO: renamed from: d */
    public VText f23461d;

    /* JADX INFO: renamed from: e */
    public ImageView f23462e;

    /* JADX INFO: renamed from: f */
    public ImageView f23463f;

    /* JADX INFO: renamed from: g */
    public ImageView f23464g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f23465h;

    /* JADX INFO: renamed from: i */
    @ColorInt
    public int f23466i;

    public CardBottomExpandedBasicInfoView(Context context) {
        super(context);
        this.f23466i = Color.parseColor("#FFFFFF");
    }

    /* JADX INFO: renamed from: V */
    private void m38903V(User user) {
        boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
        ImageView imageView = this.f23462e;
        if (zIsPicVerificationVerified) {
            xdl0.m208344M(imageView, true);
        } else {
            xdl0.m208344M(imageView, false);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m38904P(View view) {
        xg4.m208622a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m38905Q(User user) {
        if (user == null) {
            return true;
        }
        if (TextUtils.equals(user.f56011id, CoreModule.m29931H().userId())) {
            return false;
        }
        return user.isBannedNew() || user.isAccountCancellation();
    }

    /* JADX INFO: renamed from: R */
    public final void m38906R(User user, boolean z) {
        if (m38905Q(user)) {
            this.f23461d.setText((user.isHideAgeFromSVip() || user.age.intValue() <= 0 || user.isHideAgeForTeamAccount()) ? "" : String.valueOf(user.age));
        } else {
            this.f23461d.setText(String.valueOf(user.age));
        }
        this.f23461d.setTextColor(this.f23466i);
        boolean z2 = !user.isHideAgeFromSVipWithOutMe();
        if (z && user.isHideAgeFromSVip()) {
            z2 = false;
        }
        xdl0.m208344M(this.f23461d, z2);
    }

    /* JADX INFO: renamed from: S */
    public final void m38907S(User user, boolean z) {
        int iM189648f = tm90.m189643d().m189648f(user);
        if (iM189648f == -1 || xdl0.m208349O0(this.f23462e)) {
            this.f23463f.setVisibility(8);
        } else {
            this.f23463f.setVisibility(0);
            tm90.m189643d().m189652j(iM189648f, this.f23463f, false);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m38908T(User user) {
        boolean zM38905Q = m38905Q(user);
        VText vText = this.f23460c;
        if (zM38905Q) {
            vText.setText(user.publicId);
        } else {
            vText.setText(user.name);
        }
        this.f23460c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f23460c.setTextColor(this.f23466i);
    }

    /* JADX INFO: renamed from: W */
    public void m38909W(User user, boolean z, boolean z2) {
        if (user == null) {
            return;
        }
        m38908T(user);
        m38906R(user, z);
        m38903V(user);
        m38907S(user, z);
        m38910X(user, z, z2);
    }

    /* JADX INFO: renamed from: X */
    public final void m38910X(User user, boolean z, boolean z2) {
        if (user == null) {
            xdl0.m208344M(this.f23464g, false);
            return;
        }
        if ((user.isSVIP() && user.isHideIconFromSVip()) || (user.isVIP() && user.gpHideVip())) {
            xdl0.m208344M(this.f23464g, false);
            return;
        }
        if (z && (user.isHideIconFromSVipWithMe() || user.gpHideVip())) {
            xdl0.m208344M(this.f23464g, false);
            return;
        }
        if (CoreModule.f17557o.m195057d().mo33937ve(user)) {
            xdl0.m208344M(this.f23464g, true);
            this.f23464g.setImageDrawable(CoreModule.f17544b.getResources().getDrawable(x2c0.f189699Rc));
            return;
        }
        if (u59.m191810S() && user.isSVIP()) {
            xdl0.m208344M(this.f23464g, true);
            this.f23464g.setImageDrawable(CoreModule.f17544b.getResources().getDrawable(x2c0.f189668Qc));
            return;
        }
        boolean zIsVIP = user.isVIP();
        ImageView imageView = this.f23464g;
        if (!zIsVIP) {
            xdl0.m208344M(imageView, false);
            return;
        }
        xdl0.m208344M(imageView, true);
        VipNewUtils.m57507d(getContext(), this.f23464g, "vip");
        this.f23464g.setImageDrawable(CoreModule.f17544b.getResources().getDrawable(x2c0.f189730Sc));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38904P(this);
        xdl0.m208357U(this, t100.m186890d(4.0f));
    }

    public void setTextColor(int i) {
        this.f23466i = i;
    }

    public CardBottomExpandedBasicInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23466i = Color.parseColor("#FFFFFF");
    }

    public CardBottomExpandedBasicInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23466i = Color.parseColor("#FFFFFF");
    }
}
