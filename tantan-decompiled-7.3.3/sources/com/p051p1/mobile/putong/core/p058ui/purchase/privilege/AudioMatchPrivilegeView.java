package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p153l.bnl0;
import p153l.jbc0;
import p153l.nb1;
import p153l.qa00;
import p153l.uqb0;
import p153l.wib0;

/* JADX INFO: loaded from: classes12.dex */
public class AudioMatchPrivilegeView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f35843d;

    /* JADX INFO: renamed from: e */
    public Guideline f35844e;

    /* JADX INFO: renamed from: f */
    public Guideline f35845f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f35846g;

    /* JADX INFO: renamed from: h */
    public AutoVDraweeView f35847h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f35848i;

    /* JADX INFO: renamed from: j */
    public AutoVDraweeView f35849j;

    /* JADX INFO: renamed from: k */
    public VLinear f35850k;

    /* JADX INFO: renamed from: l */
    public VImage f35851l;

    /* JADX INFO: renamed from: m */
    public SVGAnimationView f35852m;

    public AudioMatchPrivilegeView(Context context) {
        super(context);
    }

    private void init() {
        if (bnl0.m105588w0() < 960) {
            m55398l0();
        }
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            this.f35847h.setImageUrl(userM116600p9.m61308fp().url);
            if (NullChecker.m82486a(userM116600p9.settings) && TEnum.equals(userM116600p9.settings.getLookingFor(), "female")) {
                m55394j0();
                return;
            }
            if (NullChecker.m82486a(userM116600p9.settings) && TEnum.equals(userM116600p9.settings.getLookingFor(), "male")) {
                m55395k0();
            } else if (TEnum.equals(userM116600p9.gender, "female")) {
                m55395k0();
            } else {
                m55394j0();
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    private void m55394j0() {
        uqb0.f180374G.m127138Y0(this.f35849j, jbc0.f119363Pa);
    }

    /* JADX INFO: renamed from: k0 */
    private void m55395k0() {
        uqb0.f180374G.m127138Y0(this.f35849j, jbc0.f119377Qa);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m55396h0(View view) {
        nb1.m162108a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m55397i0(PurchaseType purchaseType) {
        String str;
        String str2;
        if (wib0.m206565i(purchaseType)) {
            str = "https://auto.tancdn.com/v1/raw/ba15ae47-96dd-434b-900f-91692d51b57e14.pdf";
            str2 = "https://auto.tancdn.com/v1/raw/24286ac3-5f6f-4be2-8ec5-3ba231a5725614.pdf";
        } else {
            str = "https://auto.tancdn.com/v1/raw/43a454d2-a42a-41e8-8f40-1dfbd4d0c89d12.pdf";
            str2 = "https://auto.tancdn.com/v1/raw/52af8cbe-8c18-488a-b453-3431b647b6dd12.pdf";
        }
        SVGALoader.with(getContext()).from(str).autoPlay(false).into(this.f35852m);
        SVGALoader.with(getContext()).from(str2).autoPlay(false).into(this.f35843d);
        this.f35850k.setBackgroundResource(wib0.m206565i(purchaseType) ? jbc0.f119641k4 : jbc0.f119856z9);
        this.f35851l.setImageResource(wib0.m206565i(purchaseType) ? jbc0.f119599h4 : jbc0.f119814w9);
        this.f35846g.setBackgroundResource(wib0.m206565i(purchaseType) ? jbc0.f119613i4 : jbc0.f119828x9);
        this.f35848i.setBackgroundResource(wib0.m206565i(purchaseType) ? jbc0.f119627j4 : jbc0.f119842y9);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m55398l0() {
        int iM175859d = qa00.m175859d(70.0f);
        int iM175859d2 = qa00.m175859d(84.0f);
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) this.f35846g.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0221a).width = iM175859d2;
        ((ViewGroup.MarginLayoutParams) c0221a).height = iM175859d2;
        this.f35846g.setLayoutParams(c0221a);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35847h.getLayoutParams();
        layoutParams.width = iM175859d;
        layoutParams.height = iM175859d;
        this.f35847h.setLayoutParams(layoutParams);
        ConstraintLayout.C0221a c0221a2 = (ConstraintLayout.C0221a) this.f35848i.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0221a2).width = iM175859d2;
        ((ViewGroup.MarginLayoutParams) c0221a2).height = iM175859d2;
        this.f35848i.setLayoutParams(c0221a2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f35849j.getLayoutParams();
        layoutParams2.width = iM175859d;
        layoutParams2.height = iM175859d;
        this.f35849j.setLayoutParams(layoutParams2);
        this.f35844e.setGuidelinePercent(0.46f);
        this.f35845f.setGuidelinePercent(0.54f);
        ViewGroup.LayoutParams layoutParams3 = this.f35843d.getLayoutParams();
        layoutParams3.width = qa00.m175859d(125.0f);
        layoutParams3.height = qa00.m175859d(125.0f);
        this.f35843d.setLayoutParams(layoutParams3);
    }

    /* JADX INFO: renamed from: m0 */
    public void m55399m0() {
        this.f35843d.startAnimation();
        this.f35852m.startAnimation();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55396h0(this);
        init();
    }

    public AudioMatchPrivilegeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AudioMatchPrivilegeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
