package com.p000p1.mobile.putong.core.p004ui.vip;

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
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.VipItemDetailPage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.core.ui.GradientBgButton;
import com.tantanapp.common.utils.NullChecker;
import l.b3c0;
import l.d30;
import l.k6c0;
import l.sab0;
import l.t0g0;
import l.t100;
import l.vhl0;
import l.xdl0;
import l.z0c0;
import p006l.qib0;
import p006l.wx80;
import p006l.xma;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VipItemDetailPage extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f6831a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f6832b;

    /* JADX INFO: renamed from: c */
    public VImage f6833c;

    /* JADX INFO: renamed from: d */
    public GradientBgButton f6834d;

    /* JADX INFO: renamed from: e */
    public ImageView f6835e;

    /* JADX INFO: renamed from: f */
    public Space f6836f;

    /* JADX INFO: renamed from: g */
    public VText f6837g;

    /* JADX INFO: renamed from: h */
    public VText f6838h;

    /* JADX INFO: renamed from: i */
    public VText f6839i;

    /* JADX INFO: renamed from: j */
    public Space f6840j;

    /* JADX INFO: renamed from: k */
    public VButton f6841k;

    /* JADX INFO: renamed from: l */
    public VText f6842l;

    public VipItemDetailPage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m9702b(d30 d30Var, d30 d30Var2, Act act, View view) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        d30Var2.call();
        CoreModule.m1854P().m11706a().m5528sp(act);
    }

    /* JADX INFO: renamed from: f */
    public final void m9706f(View view) {
        vhl0.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public void m9707g(Act act, wx80 wx80Var, PurchaseType purchaseType, d30 d30Var, d30 d30Var2) {
        m9708h(act, wx80Var, purchaseType, d30Var, d30Var2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v67, types: [android.view.View, com.p1.mobile.putong.core.ui.vip.DynamicAvatarRoundView] */
    /* JADX INFO: renamed from: h */
    public void m9708h(final Act act, wx80 wx80Var, PurchaseType purchaseType, final d30 d30Var, final d30 d30Var2, final d30 d30Var3) {
        Privilege privilegeM26841l = wx80Var.m26841l();
        Privilege privilege = Privilege.see_not_match_guide;
        if (privilegeM26841l == privilege) {
            this.f6832b.setVisibility(8);
            this.f6834d.setVisibility(8);
            this.f6835e.setVisibility(8);
            ?? r0 = (DynamicAvatarRoundView) act.inflater().inflate(k6c0.m2, (ViewGroup) null, false);
            r0.m9659s(CoreModule.m1854P().m11711g().m6978Yi());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f6831a.addView((View) r0, layoutParams);
            String strValueOf = String.valueOf(wx80Var.m26849t());
            int iM6976Y4 = CoreModule.m1854P().m11711g().m6976Y4();
            int iIndexOf = strValueOf.indexOf(t0g0.f(iM6976Y4));
            int length = t0g0.f(iM6976Y4).length() + iIndexOf;
            SpannableString spannableString = new SpannableString(strValueOf);
            spannableString.setSpan(new ForegroundColorSpan(act.color(z0c0.l)), iIndexOf, length, 33);
            this.f6837g.setText(spannableString);
        } else if (!TextUtils.isEmpty(wx80Var.m26840k())) {
            this.f6834d.setVisibility(8);
            this.f6832b.setVisibility(0);
            this.f6835e.setVisibility(8);
            qib0.f19782G.m12744L0(this.f6832b, wx80Var.m26840k());
        } else if (wx80Var.m26833f() != 0 && wx80Var.m26831e() != 0) {
            this.f6832b.setVisibility(8);
            this.f6834d.setVisibility(0);
            this.f6834d.setButtonColorStart(act.color(wx80Var.m26833f()));
            this.f6834d.setButtonColorEnd(act.color(wx80Var.m26831e()));
            int iM26827c = wx80Var.m26827c();
            ImageView imageView = this.f6835e;
            if (iM26827c != 0) {
                imageView.setVisibility(0);
                this.f6835e.setImageDrawable(act.drawable(wx80Var.m26827c()));
            } else {
                imageView.setVisibility(8);
            }
        } else if (wx80Var.m26839j() != 0) {
            if (wx80Var.m26839j() == b3c0.p6) {
                this.f6832b.setPadding(0, t100.d(8.0f), 0, t100.d(8.0f));
            }
            this.f6834d.setVisibility(8);
            this.f6832b.setVisibility(0);
            qib0.f19782G.m12767Y0(this.f6832b, wx80Var.m26839j());
            int iM26827c2 = wx80Var.m26827c();
            ImageView imageView2 = this.f6835e;
            if (iM26827c2 != 0) {
                imageView2.setVisibility(0);
                this.f6835e.setImageDrawable(act.drawable(wx80Var.m26827c()));
            } else {
                imageView2.setVisibility(8);
            }
        } else {
            this.f6832b.setVisibility(8);
            this.f6834d.setVisibility(8);
            this.f6835e.setVisibility(8);
        }
        boolean zIsEmpty = TextUtils.isEmpty(wx80Var.m26849t());
        VText vText = this.f6837g;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setText(wx80Var.m26849t());
            this.f6837g.setTextColor(wx80Var.m26850u() != 0 ? act.color(wx80Var.m26850u()) : act.color(z0c0.i));
            this.f6837g.setVisibility(0);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(wx80Var.m26846q());
        VText vText2 = this.f6838h;
        if (zIsEmpty2) {
            vText2.setVisibility(0);
        } else {
            vText2.setText(wx80Var.m26846q());
            this.f6838h.setTextColor(wx80Var.m26847r() > 0 ? act.color(wx80Var.m26847r()) : act.color(z0c0.j));
            this.f6838h.setVisibility(0);
        }
        if (TextUtils.isEmpty(wx80Var.m26829d()) || TextUtils.equals(wx80Var.m26829d(), wx80Var.m26846q())) {
            this.f6840j.getLayoutParams().height = t100.d(40.0f);
            this.f6836f.getLayoutParams().height = t100.d(8.0f);
            this.f6839i.setVisibility(8);
        } else {
            this.f6839i.setText(wx80Var.m26829d());
            this.f6840j.getLayoutParams().height = t100.d(22.0f);
            this.f6836f.getLayoutParams().height = t100.d(19.0f);
            this.f6839i.setVisibility(0);
        }
        Privilege privilegeM26841l2 = wx80Var.m26841l();
        VButton vButton = this.f6841k;
        if (privilegeM26841l2 == privilege) {
            vButton.setBackgroundResource(b3c0.m6);
        } else {
            vButton.setBackgroundResource(b3c0.n6);
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(wx80Var.m26829d());
        VButton vButton2 = this.f6841k;
        if (zIsEmpty3) {
            vButton2.setText(R.string.F1);
            this.f6842l.setText(R.string.d);
        } else {
            vButton2.setText(R.string.H1);
            this.f6842l.setText(R.string.G1);
        }
        int iM26838i = wx80Var.m26838i();
        VImage vImage = this.f6833c;
        if (iM26838i != 0) {
            vImage.setVisibility(0);
            this.f6833c.setImageResource(wx80Var.m26838i());
        } else {
            vImage.setVisibility(8);
        }
        if (m9709i(purchaseType)) {
            this.f6841k.setOnClickListener(new View.OnClickListener() { // from class: l.qhl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var.call();
                }
            });
            this.f6842l.setOnClickListener(new View.OnClickListener() { // from class: l.rhl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var2.call();
                }
            });
            return;
        }
        boolean zE = sab0.e(purchaseType);
        VText vText3 = this.f6842l;
        if (!zE) {
            xdl0.M(vText3, false);
            this.f6841k.setText(R.string.d);
            this.f6841k.setOnClickListener(new View.OnClickListener() { // from class: l.uhl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var2.call();
                }
            });
        } else {
            xdl0.M(vText3, true);
            this.f6842l.setOnClickListener(new View.OnClickListener() { // from class: l.shl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var2.call();
                }
            });
            this.f6841k.setText(R.string.v1);
            this.f6841k.setOnClickListener(new View.OnClickListener() { // from class: l.thl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VipItemDetailPage.m9702b(d30Var3, d30Var2, act, view);
                }
            });
            this.f6837g.setText(act.getString(R.string.j));
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m9709i(PurchaseType purchaseType) {
        if (sab0.e(purchaseType)) {
            return CoreModule.m1854P().m11711g().m6974Xa() <= 0;
        }
        if (sab0.w(purchaseType)) {
            return !CoreModule.f1534c.f3628e0.m21490p9().isVIP();
        }
        if (sab0.s(purchaseType)) {
            return CoreModule.m1854P().m11706a().m5426e2();
        }
        if (CoreModule.m1854P().m11706a().m5521s6() || CoreModule.m1854P().m11706a().m5444h5()) {
            return xma.m27371a4(purchaseType);
        }
        return true;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9706f(this);
    }

    public void setGetBackgroundResource(@DrawableRes int i) {
        this.f6841k.setBackgroundResource(i);
    }

    public VipItemDetailPage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VipItemDetailPage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
