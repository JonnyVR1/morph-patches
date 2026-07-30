package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import com.p000p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.jjb0;
import l.le7;
import l.tg4;
import l.xdl0;
import l.y0c0;
import l.z2c0;
import v.VDraweeView;
import v.VFrame;
import v.VIcon;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBottomBaseInfoView extends LinearMeasureOrderLayout {

    /* JADX INFO: renamed from: c */
    public VText f2202c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f2203d;

    /* JADX INFO: renamed from: e */
    public VText f2204e;

    /* JADX INFO: renamed from: f */
    public VFrame f2205f;

    /* JADX INFO: renamed from: g */
    public VIcon f2206g;

    /* JADX INFO: renamed from: h */
    public VIcon f2207h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f2208i;

    /* JADX INFO: renamed from: j */
    public VImage f2209j;

    /* JADX INFO: renamed from: k */
    public int f2210k;

    /* JADX INFO: renamed from: l */
    public User f2211l;

    /* JADX INFO: renamed from: m */
    public String f2212m;

    /* JADX INFO: renamed from: n */
    public boolean f2213n;

    /* JADX INFO: renamed from: o */
    public boolean f2214o;

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
    public final void m2896h(View view) {
        tg4.a(this, view);
    }

    @DrawableRes
    /* JADX INFO: renamed from: i */
    public int m2897i(User user) {
        if (user.isPicVerificationVerified()) {
            return z2c0.j;
        }
        return 0;
    }

    @DrawableRes
    /* JADX INFO: renamed from: j */
    public int m2898j(User user) {
        if (user.isPicVerificationVerified()) {
            return z2c0.k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m2899k(boolean z) {
        if (jjb0.b() || this.f2214o) {
            xdl0.M(this.f2205f, false);
            return;
        }
        boolean zIsPicVerificationVerified = this.f2211l.isPicVerificationVerified();
        VFrame vFrame = this.f2205f;
        if (!zIsPicVerificationVerified) {
            xdl0.M(vFrame, false);
            return;
        }
        xdl0.M(vFrame, true);
        boolean zIsMe = this.f2211l.isMe();
        VFrame vFrame2 = this.f2205f;
        if (zIsMe) {
            xdl0.E0(vFrame2, new View.OnClickListener() { // from class: l.sg4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20235a.m2900l(view);
                }
            });
            this.f2205f.setClickable(true);
        } else {
            vFrame2.setOnClickListener((View.OnClickListener) null);
            this.f2205f.setClickable(false);
        }
        this.f2206g.setImageResource(m2898j(this.f2211l));
        this.f2207h.setImageResource(m2897i(this.f2211l));
        if (z && !TextUtils.equals(this.f2212m, ((DbObject) this.f2211l).id) && m2902n(this.f2211l)) {
            bt0.e(this.f2206g);
            bt0.l(this.f2206g, View.ROTATION, 0L, 3000L, (Interpolator) null, new float[]{0.0f, 360.0f}).start();
            User user = this.f2211l;
            this.f2212m = ((DbObject) user).id;
            m2901m(user);
        }
        CoreModule.P().a().Tj(z, this.f2211l, this.f2205f);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m2900l(View view) {
        m2903o((Act) getContext(), this.f2211l);
    }

    /* JADX INFO: renamed from: m */
    public final void m2901m(User user) {
        if (user.isMe()) {
            return;
        }
        if (user.isIdAndPicBothVerified()) {
            CoreModule.c.e0.s1.put(Boolean.TRUE);
        } else if (user.isPicVerificationVerified()) {
            CoreModule.c.e0.r1.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m2902n(User user) {
        boolean zBooleanValue;
        if (user.isMe()) {
            return false;
        }
        if (user.isIdAndPicBothVerified()) {
            zBooleanValue = ((Boolean) CoreModule.c.e0.s1.get()).booleanValue();
        } else {
            if (!user.isPicVerificationVerified()) {
                return false;
            }
            zBooleanValue = ((Boolean) CoreModule.c.e0.r1.get()).booleanValue();
        }
        return !zBooleanValue;
    }

    /* JADX INFO: renamed from: o */
    public void m2903o(Act act, User user) {
        if (le7.d() && user.isIdAndPicBothVerified()) {
            CoreModule.P().a().zq(act, true);
            return;
        }
        if (user.isPicVerificationVerified()) {
            CoreModule.P().a().pp(act);
            return;
        }
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4) && TEnum.equals(verificationCenterK4.picVerificationInfo.status, "pending")) {
            CoreModule.P().a().vh(act);
        } else {
            CoreModule.P().a().Po(act);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2896h(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m2904p(User user, boolean z, boolean z2) {
        this.f2202c.getPaint().setShader(null);
        this.f2202c.setText(user.name);
        this.f2204e.setText(String.valueOf(user.age));
        this.f2202c.setTextColor(getResources().getColor(y0c0.m));
        this.f2204e.setTextColor(getResources().getColor(y0c0.m));
        xdl0.M(this.f2204e, z2 || user.isHideAgeForTeamAccount() || !user.isHideAgeFromSVip());
        m2899k(z);
        if (this.f2213n) {
            return;
        }
        int iTl = CoreModule.P().a().Tl(user);
        if (iTl == -1 || xdl0.O0(this.f2205f)) {
            xdl0.M(this.f2209j, false);
        } else {
            xdl0.M(this.f2209j, true);
            CoreModule.P().a().Im(iTl, this.f2209j, true);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m2905q(User user, int i, boolean z, boolean z2) {
        this.f2210k = i;
        if (user == null) {
            return;
        }
        this.f2211l = user;
        m2904p(user, z, z2);
    }

    /* JADX INFO: renamed from: r */
    public void m2906r() {
        this.f2213n = true;
    }

    public void setHideCertificationIcon(boolean z) {
        this.f2214o = z;
    }

    public CardBottomBaseInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardBottomBaseInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
