package com.p046p1.mobile.putong.core.p053ui.vip;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.legacy.widget.Space;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.p046p1.mobile.putong.core.p053ui.vip.VipItemDetailPage;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.b3c0;
import p149l.d30;
import p149l.k6c0;
import p149l.qib0;
import p149l.sab0;
import p149l.t0g0;
import p149l.t100;
import p149l.vhl0;
import p149l.wx80;
import p149l.xdl0;
import p149l.xma;
import p149l.z0c0;

/* JADX INFO: loaded from: classes9.dex */
public class VipItemDetailPage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f37050a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f37051b;

    /* JADX INFO: renamed from: c */
    public VImage f37052c;

    /* JADX INFO: renamed from: d */
    public GradientBgButton f37053d;

    /* JADX INFO: renamed from: e */
    public ImageView f37054e;

    /* JADX INFO: renamed from: f */
    public Space f37055f;

    /* JADX INFO: renamed from: g */
    public VText f37056g;

    /* JADX INFO: renamed from: h */
    public VText f37057h;

    /* JADX INFO: renamed from: i */
    public VText f37058i;

    /* JADX INFO: renamed from: j */
    public Space f37059j;

    /* JADX INFO: renamed from: k */
    public VButton f37060k;

    /* JADX INFO: renamed from: l */
    public VText f37061l;

    public VipItemDetailPage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m56268b(d30 d30Var, d30 d30Var2, Act act, View view) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        d30Var2.call();
        CoreModule.m29935P().m94651a().mo33591sp(act);
    }

    /* JADX INFO: renamed from: f */
    public final void m56272f(View view) {
        vhl0.m198466a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public void m56273g(Act act, wx80 wx80Var, PurchaseType purchaseType, d30 d30Var, d30 d30Var2) {
        m56274h(act, wx80Var, purchaseType, d30Var, d30Var2, null);
    }

    /* JADX INFO: renamed from: h */
    public void m56274h(final Act act, wx80 wx80Var, PurchaseType purchaseType, final d30 d30Var, final d30 d30Var2, final d30 d30Var3) {
        Privilege privilegeM205960l = wx80Var.m205960l();
        Privilege privilege = Privilege.see_not_match_guide;
        if (privilegeM205960l == privilege) {
            this.f37051b.setVisibility(8);
            this.f37053d.setVisibility(8);
            this.f37054e.setVisibility(8);
            DynamicAvatarRoundView dynamicAvatarRoundView = (DynamicAvatarRoundView) act.inflater().inflate(k6c0.f121408m2, (ViewGroup) null, false);
            dynamicAvatarRoundView.m56226s(CoreModule.m29935P().m94656g().mo35041Yi());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f37050a.addView(dynamicAvatarRoundView, layoutParams);
            String strValueOf = String.valueOf(wx80Var.m205968t());
            int iMo35039Y4 = CoreModule.m29935P().m94656g().mo35039Y4();
            int iIndexOf = strValueOf.indexOf(t0g0.m186865f(iMo35039Y4));
            int length = t0g0.m186865f(iMo35039Y4).length() + iIndexOf;
            SpannableString spannableString = new SpannableString(strValueOf);
            spannableString.setSpan(new ForegroundColorSpan(act.color(z0c0.f200984l)), iIndexOf, length, 33);
            this.f37056g.setText(spannableString);
        } else if (!TextUtils.isEmpty(wx80Var.m205959k())) {
            this.f37053d.setVisibility(8);
            this.f37051b.setVisibility(0);
            this.f37054e.setVisibility(8);
            qib0.f154691G.m102331L0(this.f37051b, wx80Var.m205959k());
        } else if (wx80Var.m205952f() != 0 && wx80Var.m205950e() != 0) {
            this.f37051b.setVisibility(8);
            this.f37053d.setVisibility(0);
            this.f37053d.setButtonColorStart(act.color(wx80Var.m205952f()));
            this.f37053d.setButtonColorEnd(act.color(wx80Var.m205950e()));
            int iM205946c = wx80Var.m205946c();
            ImageView imageView = this.f37054e;
            if (iM205946c != 0) {
                imageView.setVisibility(0);
                this.f37054e.setImageDrawable(act.drawable(wx80Var.m205946c()));
            } else {
                imageView.setVisibility(8);
            }
        } else if (wx80Var.m205958j() != 0) {
            if (wx80Var.m205958j() == b3c0.f73129p6) {
                this.f37051b.setPadding(0, t100.m186890d(8.0f), 0, t100.m186890d(8.0f));
            }
            this.f37053d.setVisibility(8);
            this.f37051b.setVisibility(0);
            qib0.f154691G.m102354Y0(this.f37051b, wx80Var.m205958j());
            int iM205946c2 = wx80Var.m205946c();
            ImageView imageView2 = this.f37054e;
            if (iM205946c2 != 0) {
                imageView2.setVisibility(0);
                this.f37054e.setImageDrawable(act.drawable(wx80Var.m205946c()));
            } else {
                imageView2.setVisibility(8);
            }
        } else {
            this.f37051b.setVisibility(8);
            this.f37053d.setVisibility(8);
            this.f37054e.setVisibility(8);
        }
        boolean zIsEmpty = TextUtils.isEmpty(wx80Var.m205968t());
        VText vText = this.f37056g;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setText(wx80Var.m205968t());
            this.f37056g.setTextColor(wx80Var.m205969u() != 0 ? act.color(wx80Var.m205969u()) : act.color(z0c0.f200981i));
            this.f37056g.setVisibility(0);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(wx80Var.m205965q());
        VText vText2 = this.f37057h;
        if (zIsEmpty2) {
            vText2.setVisibility(0);
        } else {
            vText2.setText(wx80Var.m205965q());
            this.f37057h.setTextColor(wx80Var.m205966r() > 0 ? act.color(wx80Var.m205966r()) : act.color(z0c0.f200982j));
            this.f37057h.setVisibility(0);
        }
        if (TextUtils.isEmpty(wx80Var.m205948d()) || TextUtils.equals(wx80Var.m205948d(), wx80Var.m205965q())) {
            this.f37059j.getLayoutParams().height = t100.m186890d(40.0f);
            this.f37055f.getLayoutParams().height = t100.m186890d(8.0f);
            this.f37058i.setVisibility(8);
        } else {
            this.f37058i.setText(wx80Var.m205948d());
            this.f37059j.getLayoutParams().height = t100.m186890d(22.0f);
            this.f37055f.getLayoutParams().height = t100.m186890d(19.0f);
            this.f37058i.setVisibility(0);
        }
        Privilege privilegeM205960l2 = wx80Var.m205960l();
        VButton vButton = this.f37060k;
        if (privilegeM205960l2 == privilege) {
            vButton.setBackgroundResource(b3c0.f73105m6);
        } else {
            vButton.setBackgroundResource(b3c0.f73113n6);
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(wx80Var.m205948d());
        VButton vButton2 = this.f37060k;
        if (zIsEmpty3) {
            vButton2.setText(R$string.f20580F1);
            this.f37061l.setText(R$string.f20636d);
        } else {
            vButton2.setText(R$string.f20586H1);
            this.f37061l.setText(R$string.f20583G1);
        }
        int iM205957i = wx80Var.m205957i();
        VImage vImage = this.f37052c;
        if (iM205957i != 0) {
            vImage.setVisibility(0);
            this.f37052c.setImageResource(wx80Var.m205957i());
        } else {
            vImage.setVisibility(8);
        }
        if (m56275i(purchaseType)) {
            this.f37060k.setOnClickListener(new View.OnClickListener() { // from class: l.qhl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var.call();
                }
            });
            this.f37061l.setOnClickListener(new View.OnClickListener() { // from class: l.rhl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var2.call();
                }
            });
            return;
        }
        boolean zM182887e = sab0.m182887e(purchaseType);
        VText vText3 = this.f37061l;
        if (!zM182887e) {
            xdl0.m208344M(vText3, false);
            this.f37060k.setText(R$string.f20636d);
            this.f37060k.setOnClickListener(new View.OnClickListener() { // from class: l.uhl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var2.call();
                }
            });
        } else {
            xdl0.m208344M(vText3, true);
            this.f37061l.setOnClickListener(new View.OnClickListener() { // from class: l.shl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var2.call();
                }
            });
            this.f37060k.setText(R$string.f20692v1);
            this.f37060k.setOnClickListener(new View.OnClickListener() { // from class: l.thl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VipItemDetailPage.m56268b(d30Var3, d30Var2, act, view);
                }
            });
            this.f37056g.setText(act.getString(R$string.f20654j));
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m56275i(PurchaseType purchaseType) {
        if (sab0.m182887e(purchaseType)) {
            return CoreModule.m29935P().m94656g().mo35037Xa() <= 0;
        }
        if (sab0.m182905w(purchaseType)) {
            return !CoreModule.f17545c.f19639e0.m169527p9().isVIP();
        }
        if (sab0.m182901s(purchaseType)) {
            return CoreModule.m29935P().m94651a().mo33489e2();
        }
        if (CoreModule.m29935P().m94651a().mo33584s6() || CoreModule.m29935P().m94651a().mo33507h5()) {
            return xma.m210063a4(purchaseType);
        }
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56272f(this);
    }

    public void setGetBackgroundResource(@DrawableRes int i) {
        this.f37060k.setBackgroundResource(i);
    }

    public VipItemDetailPage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VipItemDetailPage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
