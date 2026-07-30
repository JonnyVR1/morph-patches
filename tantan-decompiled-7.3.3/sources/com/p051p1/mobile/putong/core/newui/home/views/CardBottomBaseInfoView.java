package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.e9c0;
import p153l.fbc0;
import p153l.gt0;
import p153l.nrb0;
import p153l.pf7;
import p153l.sh4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomBaseInfoView extends LinearMeasureOrderLayout {

    /* JADX INFO: renamed from: c */
    public VText f24166c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f24167d;

    /* JADX INFO: renamed from: e */
    public VText f24168e;

    /* JADX INFO: renamed from: f */
    public VFrame f24169f;

    /* JADX INFO: renamed from: g */
    public VIcon f24170g;

    /* JADX INFO: renamed from: h */
    public VIcon f24171h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f24172i;

    /* JADX INFO: renamed from: j */
    public VImage f24173j;

    /* JADX INFO: renamed from: k */
    public int f24174k;

    /* JADX INFO: renamed from: l */
    public User f24175l;

    /* JADX INFO: renamed from: m */
    public String f24176m;

    /* JADX INFO: renamed from: n */
    public boolean f24177n;

    /* JADX INFO: renamed from: o */
    public boolean f24178o;

    public CardBottomBaseInfoView(Context context) {
        this(context, null);
    }

    private void setODiamondUIUpdateStyle(VText vText) {
        if (vText == null) {
            return;
        }
        int[] iArr = {Color.parseColor("#F8B467"), Color.parseColor("#FFDA98"), Color.parseColor("#FFE5B6"), Color.parseColor("#F8B467")};
        float[] fArr = {0.0f, 0.3f, 0.6f, 1.0f};
        float width = vText.getWidth();
        if (width == 0.0f) {
            width = vText.getPaint().getTextSize() * vText.getText().length();
        }
        vText.getPaint().setShader(new LinearGradient(0.0f, 0.0f, width, 0.0f, iArr, fArr, Shader.TileMode.CLAMP));
        invalidate();
    }

    private void setSupremePartnerStyleText(VText vText) {
        if (vText == null) {
            return;
        }
        vText.getPaint().setShader(new LinearGradient(0.0f, 0.0f, vText.getPaint().getTextSize() * vText.getText().length(), 0.0f, new int[]{Color.parseColor("#ECD39D"), Color.parseColor("#FFEAB9"), Color.parseColor("#ECD29B")}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        invalidate();
    }

    /* JADX INFO: renamed from: h */
    public final void m39892h(View view) {
        sh4.m185859a(this, view);
    }

    @DrawableRes
    /* JADX INFO: renamed from: i */
    public int m39893i(User user) {
        if (user.isPicVerificationVerified()) {
            return fbc0.f98071j;
        }
        return 0;
    }

    @DrawableRes
    /* JADX INFO: renamed from: j */
    public int m39894j(User user) {
        if (user.isPicVerificationVerified()) {
            return fbc0.f98072k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m39895k(boolean z) {
        if (nrb0.m164466b() || this.f24178o) {
            bnl0.m105524M(this.f24169f, false);
            return;
        }
        boolean zIsPicVerificationVerified = this.f24175l.isPicVerificationVerified();
        VFrame vFrame = this.f24169f;
        if (!zIsPicVerificationVerified) {
            bnl0.m105524M(vFrame, false);
            return;
        }
        bnl0.m105524M(vFrame, true);
        boolean zIsMe = this.f24175l.isMe();
        VFrame vFrame2 = this.f24169f;
        if (zIsMe) {
            bnl0.m105509E0(vFrame2, new View.OnClickListener() { // from class: l.rh4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f163074a.m39896l(view);
                }
            });
            this.f24169f.setClickable(true);
        } else {
            vFrame2.setOnClickListener(null);
            this.f24169f.setClickable(false);
        }
        this.f24170g.setImageResource(m39894j(this.f24175l));
        this.f24171h.setImageResource(m39893i(this.f24175l));
        if (z && !TextUtils.equals(this.f24176m, this.f24175l.f56859id) && m39898n(this.f24175l)) {
            gt0.m132159e(this.f24170g);
            gt0.m132166l(this.f24170g, View.ROTATION, 0L, 3000L, null, 0.0f, 360.0f).start();
            User user = this.f24175l;
            this.f24176m = user.f56859id;
            m39897m(user);
        }
        CoreModule.m30933P().m143405a().mo34421Tj(z, this.f24175l, this.f24169f);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m39896l(View view) {
        m39899o((Act) getContext(), this.f24175l);
    }

    /* JADX INFO: renamed from: m */
    public final void m39897m(User user) {
        if (user.isMe()) {
            return;
        }
        if (user.isIdAndPicBothVerified()) {
            CoreModule.f18264c.f20381e0.f89323s1.put(Boolean.TRUE);
        } else if (user.isPicVerificationVerified()) {
            CoreModule.f18264c.f20381e0.f89316r1.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m39898n(User user) {
        boolean zBooleanValue;
        if (user.isMe()) {
            return false;
        }
        if (user.isIdAndPicBothVerified()) {
            zBooleanValue = CoreModule.f18264c.f20381e0.f89323s1.get().booleanValue();
        } else {
            if (!user.isPicVerificationVerified()) {
                return false;
            }
            zBooleanValue = CoreModule.f18264c.f20381e0.f89316r1.get().booleanValue();
        }
        return !zBooleanValue;
    }

    /* JADX INFO: renamed from: o */
    public void m39899o(Act act, User user) {
        if (pf7.m172089d() && user.isIdAndPicBothVerified()) {
            CoreModule.m30933P().m143405a().mo34643zq(act, true);
            return;
        }
        if (user.isPicVerificationVerified()) {
            CoreModule.m30933P().m143405a().mo34567pp(act);
            return;
        }
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending")) {
            CoreModule.m30933P().m143405a().mo34613vh(act);
        } else {
            CoreModule.m30933P().m143405a().mo34395Po(act);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39892h(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m39900p(User user, boolean z, boolean z2) {
        this.f24166c.getPaint().setShader(null);
        this.f24166c.setText(user.name);
        this.f24168e.setText(String.valueOf(user.age));
        this.f24166c.setTextColor(getResources().getColor(e9c0.f92625m));
        this.f24168e.setTextColor(getResources().getColor(e9c0.f92625m));
        bnl0.m105524M(this.f24168e, z2 || user.isHideAgeForTeamAccount() || !user.isHideAgeFromSVip());
        m39895k(z);
        if (this.f24177n) {
            return;
        }
        int iMo34422Tl = CoreModule.m30933P().m143405a().mo34422Tl(user);
        if (iMo34422Tl == -1 || bnl0.m105529O0(this.f24169f)) {
            bnl0.m105524M(this.f24173j, false);
        } else {
            bnl0.m105524M(this.f24173j, true);
            CoreModule.m30933P().m143405a().mo34345Im(iMo34422Tl, this.f24173j, true);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m39901q(User user, int i, boolean z, boolean z2) {
        this.f24174k = i;
        if (user == null) {
            return;
        }
        this.f24175l = user;
        m39900p(user, z, z2);
    }

    /* JADX INFO: renamed from: r */
    public void m39902r() {
        this.f24177n = true;
    }

    public void setHideCertificationIcon(boolean z) {
        this.f24178o = z;
    }

    public CardBottomBaseInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardBottomBaseInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
