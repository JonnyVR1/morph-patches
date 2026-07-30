package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import l.d3c0;
import l.gb1;
import l.sab0;
import l.t100;
import l.xdl0;
import p006l.qib0;
import v.AutoVDraweeView;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AudioMatchPrivilegeView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f4776d;

    /* JADX INFO: renamed from: e */
    public Guideline f4777e;

    /* JADX INFO: renamed from: f */
    public Guideline f4778f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f4779g;

    /* JADX INFO: renamed from: h */
    public AutoVDraweeView f4780h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f4781i;

    /* JADX INFO: renamed from: j */
    public AutoVDraweeView f4782j;

    /* JADX INFO: renamed from: k */
    public VLinear f4783k;

    /* JADX INFO: renamed from: l */
    public VImage f4784l;

    /* JADX INFO: renamed from: m */
    public SVGAnimationView f4785m;

    public AudioMatchPrivilegeView(Context context) {
        super(context);
    }

    private void init() {
        if (xdl0.w0() < 960) {
            m7550l0();
        }
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (NullChecker.a(userM21490p9)) {
            this.f4780h.setImageUrl(((Media) userM21490p9.fp()).url);
            if (NullChecker.a(userM21490p9.settings) && TEnum.equals(userM21490p9.settings.getLookingFor(), "female")) {
                m7546j0();
                return;
            }
            if (NullChecker.a(userM21490p9.settings) && TEnum.equals(userM21490p9.settings.getLookingFor(), "male")) {
                m7547k0();
            } else if (TEnum.equals(userM21490p9.gender, "female")) {
                m7547k0();
            } else {
                m7546j0();
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    private void m7546j0() {
        qib0.f19782G.m12767Y0(this.f4782j, d3c0.Pa);
    }

    /* JADX INFO: renamed from: k0 */
    private void m7547k0() {
        qib0.f19782G.m12767Y0(this.f4782j, d3c0.Qa);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m7548h0(View view) {
        gb1.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public void m7549i0(PurchaseType purchaseType) {
        String str;
        String str2;
        if (sab0.i(purchaseType)) {
            str = "https://auto.tancdn.com/v1/raw/ba15ae47-96dd-434b-900f-91692d51b57e14.pdf";
            str2 = "https://auto.tancdn.com/v1/raw/24286ac3-5f6f-4be2-8ec5-3ba231a5725614.pdf";
        } else {
            str = "https://auto.tancdn.com/v1/raw/43a454d2-a42a-41e8-8f40-1dfbd4d0c89d12.pdf";
            str2 = "https://auto.tancdn.com/v1/raw/52af8cbe-8c18-488a-b453-3431b647b6dd12.pdf";
        }
        SVGALoader.with(getContext()).from(str).autoPlay(false).into(this.f4785m);
        SVGALoader.with(getContext()).from(str2).autoPlay(false).into(this.f4776d);
        this.f4783k.setBackgroundResource(sab0.i(purchaseType) ? d3c0.k4 : d3c0.z9);
        this.f4784l.setImageResource(sab0.i(purchaseType) ? d3c0.h4 : d3c0.w9);
        this.f4779g.setBackgroundResource(sab0.i(purchaseType) ? d3c0.i4 : d3c0.x9);
        this.f4781i.setBackgroundResource(sab0.i(purchaseType) ? d3c0.j4 : d3c0.y9);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m7550l0() {
        int iD = t100.d(70.0f);
        int iD2 = t100.d(84.0f);
        ConstraintLayout.a layoutParams = this.f4779g.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = iD2;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = iD2;
        this.f4779g.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f4780h.getLayoutParams();
        layoutParams2.width = iD;
        layoutParams2.height = iD;
        this.f4780h.setLayoutParams(layoutParams2);
        ConstraintLayout.a layoutParams3 = this.f4781i.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams3).width = iD2;
        ((ViewGroup.MarginLayoutParams) layoutParams3).height = iD2;
        this.f4781i.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f4782j.getLayoutParams();
        layoutParams4.width = iD;
        layoutParams4.height = iD;
        this.f4782j.setLayoutParams(layoutParams4);
        this.f4777e.setGuidelinePercent(0.46f);
        this.f4778f.setGuidelinePercent(0.54f);
        ViewGroup.LayoutParams layoutParams5 = this.f4776d.getLayoutParams();
        layoutParams5.width = t100.d(125.0f);
        layoutParams5.height = t100.d(125.0f);
        this.f4776d.setLayoutParams(layoutParams5);
    }

    /* JADX INFO: renamed from: m0 */
    public void m7551m0() {
        this.f4776d.startAnimation();
        this.f4785m.startAnimation();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7548h0(this);
        init();
    }

    public AudioMatchPrivilegeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AudioMatchPrivilegeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
