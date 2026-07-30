package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewUtils;
import com.p051p1.mobile.putong.data.User;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.d79;
import p153l.dbc0;
import p153l.qa00;
import p153l.wh4;
import p153l.xu90;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomExpandedBasicInfoView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f24202c;

    /* JADX INFO: renamed from: d */
    public VText f24203d;

    /* JADX INFO: renamed from: e */
    public ImageView f24204e;

    /* JADX INFO: renamed from: f */
    public ImageView f24205f;

    /* JADX INFO: renamed from: g */
    public ImageView f24206g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f24207h;

    /* JADX INFO: renamed from: i */
    @ColorInt
    public int f24208i;

    public CardBottomExpandedBasicInfoView(Context context) {
        super(context);
        this.f24208i = Color.parseColor("#FFFFFF");
    }

    /* JADX INFO: renamed from: V */
    private void m39906V(User user) {
        boolean zIsPicVerificationVerified = user.isPicVerificationVerified();
        ImageView imageView = this.f24204e;
        if (zIsPicVerificationVerified) {
            bnl0.m105524M(imageView, true);
        } else {
            bnl0.m105524M(imageView, false);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m39907P(View view) {
        wh4.m206335a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m39908Q(User user) {
        if (user == null) {
            return true;
        }
        if (TextUtils.equals(user.f56859id, CoreModule.m30929H().userId())) {
            return false;
        }
        return user.isBannedNew() || user.isAccountCancellation();
    }

    /* JADX INFO: renamed from: R */
    public final void m39909R(User user, boolean z) {
        if (m39908Q(user)) {
            this.f24203d.setText((user.isHideAgeFromSVip() || user.age.intValue() <= 0 || user.isHideAgeForTeamAccount()) ? "" : String.valueOf(user.age));
        } else {
            this.f24203d.setText(String.valueOf(user.age));
        }
        this.f24203d.setTextColor(this.f24208i);
        boolean z2 = !user.isHideAgeFromSVipWithOutMe();
        if (z && user.isHideAgeFromSVip()) {
            z2 = false;
        }
        bnl0.m105524M(this.f24203d, z2);
    }

    /* JADX INFO: renamed from: S */
    public final void m39910S(User user, boolean z) {
        int iM213127f = xu90.m213122d().m213127f(user);
        if (iM213127f == -1 || bnl0.m105529O0(this.f24204e)) {
            this.f24205f.setVisibility(8);
        } else {
            this.f24205f.setVisibility(0);
            xu90.m213122d().m213131j(iM213127f, this.f24205f, false);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m39911T(User user) {
        boolean zM39908Q = m39908Q(user);
        VText vText = this.f24202c;
        if (zM39908Q) {
            vText.setText(user.publicId);
        } else {
            vText.setText(user.name);
        }
        this.f24202c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f24202c.setTextColor(this.f24208i);
    }

    /* JADX INFO: renamed from: W */
    public void m39912W(User user, boolean z, boolean z2) {
        if (user == null) {
            return;
        }
        m39911T(user);
        m39909R(user, z);
        m39906V(user);
        m39910S(user, z);
        m39913X(user, z, z2);
    }

    /* JADX INFO: renamed from: X */
    public final void m39913X(User user, boolean z, boolean z2) {
        if (user == null) {
            bnl0.m105524M(this.f24206g, false);
            return;
        }
        if ((user.isSVIP() && user.isHideIconFromSVip()) || (user.isVIP() && user.gpHideVip())) {
            bnl0.m105524M(this.f24206g, false);
            return;
        }
        if (z && (user.isHideIconFromSVipWithMe() || user.gpHideVip())) {
            bnl0.m105524M(this.f24206g, false);
            return;
        }
        if (CoreModule.f18276o.m132214d().mo34940ve(user)) {
            bnl0.m105524M(this.f24206g, true);
            this.f24206g.setImageDrawable(CoreModule.f18263b.getResources().getDrawable(dbc0.f86565Sc));
            return;
        }
        if (d79.m114661T() && user.isSVIP()) {
            bnl0.m105524M(this.f24206g, true);
            this.f24206g.setImageDrawable(CoreModule.f18263b.getResources().getDrawable(dbc0.f86533Rc));
            return;
        }
        boolean zIsVIP = user.isVIP();
        ImageView imageView = this.f24206g;
        if (!zIsVIP) {
            bnl0.m105524M(imageView, false);
            return;
        }
        bnl0.m105524M(imageView, true);
        VipNewUtils.m58690d(getContext(), this.f24206g, "vip");
        this.f24206g.setImageDrawable(CoreModule.f18263b.getResources().getDrawable(dbc0.f86597Tc));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39907P(this);
        bnl0.m105537U(this, qa00.m175859d(4.0f));
    }

    public void setTextColor(int i) {
        this.f24208i = i;
    }

    public CardBottomExpandedBasicInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24208i = Color.parseColor("#FFFFFF");
    }

    public CardBottomExpandedBasicInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24208i = Color.parseColor("#FFFFFF");
    }
}
