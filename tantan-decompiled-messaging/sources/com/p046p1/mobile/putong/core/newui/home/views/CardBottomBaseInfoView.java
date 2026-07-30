package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VImage;
import p147v.VText;
import p149l.bt0;
import p149l.jjb0;
import p149l.le7;
import p149l.tg4;
import p149l.xdl0;
import p149l.y0c0;
import p149l.z2c0;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomBaseInfoView extends LinearMeasureOrderLayout {

    /* JADX INFO: renamed from: c */
    public VText f23424c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f23425d;

    /* JADX INFO: renamed from: e */
    public VText f23426e;

    /* JADX INFO: renamed from: f */
    public VFrame f23427f;

    /* JADX INFO: renamed from: g */
    public VIcon f23428g;

    /* JADX INFO: renamed from: h */
    public VIcon f23429h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f23430i;

    /* JADX INFO: renamed from: j */
    public VImage f23431j;

    /* JADX INFO: renamed from: k */
    public int f23432k;

    /* JADX INFO: renamed from: l */
    public User f23433l;

    /* JADX INFO: renamed from: m */
    public String f23434m;

    /* JADX INFO: renamed from: n */
    public boolean f23435n;

    /* JADX INFO: renamed from: o */
    public boolean f23436o;

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
    public final void m38889h(View view) {
        tg4.m188803a(this, view);
    }

    @DrawableRes
    /* JADX INFO: renamed from: i */
    public int m38890i(User user) {
        if (user.isPicVerificationVerified()) {
            return z2c0.f201202j;
        }
        return 0;
    }

    @DrawableRes
    /* JADX INFO: renamed from: j */
    public int m38891j(User user) {
        if (user.isPicVerificationVerified()) {
            return z2c0.f201203k;
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m38892k(boolean z) {
        if (jjb0.m141784b() || this.f23436o) {
            xdl0.m208344M(this.f23427f, false);
            return;
        }
        boolean zIsPicVerificationVerified = this.f23433l.isPicVerificationVerified();
        VFrame vFrame = this.f23427f;
        if (!zIsPicVerificationVerified) {
            xdl0.m208344M(vFrame, false);
            return;
        }
        xdl0.m208344M(vFrame, true);
        boolean zIsMe = this.f23433l.isMe();
        VFrame vFrame2 = this.f23427f;
        if (zIsMe) {
            xdl0.m208329E0(vFrame2, new View.OnClickListener() { // from class: l.sg4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f164368a.m38893l(view);
                }
            });
            this.f23427f.setClickable(true);
        } else {
            vFrame2.setOnClickListener(null);
            this.f23427f.setClickable(false);
        }
        this.f23428g.setImageResource(m38891j(this.f23433l));
        this.f23429h.setImageResource(m38890i(this.f23433l));
        if (z && !TextUtils.equals(this.f23434m, this.f23433l.f56011id) && m38895n(this.f23433l)) {
            bt0.m103732e(this.f23428g);
            bt0.m103739l(this.f23428g, View.ROTATION, 0L, 3000L, null, 0.0f, 360.0f).start();
            User user = this.f23433l;
            this.f23434m = user.f56011id;
            m38894m(user);
        }
        CoreModule.m29935P().m94651a().mo33418Tj(z, this.f23433l, this.f23427f);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m38893l(View view) {
        m38896o((Act) getContext(), this.f23433l);
    }

    /* JADX INFO: renamed from: m */
    public final void m38894m(User user) {
        if (user.isMe()) {
            return;
        }
        if (user.isIdAndPicBothVerified()) {
            CoreModule.f17545c.f19639e0.f149466s1.put(Boolean.TRUE);
        } else if (user.isPicVerificationVerified()) {
            CoreModule.f17545c.f19639e0.f149459r1.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m38895n(User user) {
        boolean zBooleanValue;
        if (user.isMe()) {
            return false;
        }
        if (user.isIdAndPicBothVerified()) {
            zBooleanValue = CoreModule.f17545c.f19639e0.f149466s1.get().booleanValue();
        } else {
            if (!user.isPicVerificationVerified()) {
                return false;
            }
            zBooleanValue = CoreModule.f17545c.f19639e0.f149459r1.get().booleanValue();
        }
        return !zBooleanValue;
    }

    /* JADX INFO: renamed from: o */
    public void m38896o(Act act, User user) {
        if (le7.m149482d() && user.isIdAndPicBothVerified()) {
            CoreModule.m29935P().m94651a().mo33640zq(act, true);
            return;
        }
        if (user.isPicVerificationVerified()) {
            CoreModule.m29935P().m94651a().mo33564pp(act);
            return;
        }
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending")) {
            CoreModule.m29935P().m94651a().mo33610vh(act);
        } else {
            CoreModule.m29935P().m94651a().mo33392Po(act);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38889h(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m38897p(User user, boolean z, boolean z2) {
        this.f23424c.getPaint().setShader(null);
        this.f23424c.setText(user.name);
        this.f23426e.setText(String.valueOf(user.age));
        this.f23424c.setTextColor(getResources().getColor(y0c0.f195301m));
        this.f23426e.setTextColor(getResources().getColor(y0c0.f195301m));
        xdl0.m208344M(this.f23426e, z2 || user.isHideAgeForTeamAccount() || !user.isHideAgeFromSVip());
        m38892k(z);
        if (this.f23435n) {
            return;
        }
        int iMo33419Tl = CoreModule.m29935P().m94651a().mo33419Tl(user);
        if (iMo33419Tl == -1 || xdl0.m208349O0(this.f23427f)) {
            xdl0.m208344M(this.f23431j, false);
        } else {
            xdl0.m208344M(this.f23431j, true);
            CoreModule.m29935P().m94651a().mo33342Im(iMo33419Tl, this.f23431j, true);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m38898q(User user, int i, boolean z, boolean z2) {
        this.f23432k = i;
        if (user == null) {
            return;
        }
        this.f23433l = user;
        m38897p(user, z, z2);
    }

    /* JADX INFO: renamed from: r */
    public void m38899r() {
        this.f23435n = true;
    }

    public void setHideCertificationIcon(boolean z) {
        this.f23436o = z;
    }

    public CardBottomBaseInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardBottomBaseInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
