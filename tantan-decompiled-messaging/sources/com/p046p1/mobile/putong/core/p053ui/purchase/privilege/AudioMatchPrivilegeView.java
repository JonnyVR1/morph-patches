package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p149l.d3c0;
import p149l.gb1;
import p149l.qib0;
import p149l.sab0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AudioMatchPrivilegeView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f34995d;

    /* JADX INFO: renamed from: e */
    public Guideline f34996e;

    /* JADX INFO: renamed from: f */
    public Guideline f34997f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f34998g;

    /* JADX INFO: renamed from: h */
    public AutoVDraweeView f34999h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f35000i;

    /* JADX INFO: renamed from: j */
    public AutoVDraweeView f35001j;

    /* JADX INFO: renamed from: k */
    public VLinear f35002k;

    /* JADX INFO: renamed from: l */
    public VImage f35003l;

    /* JADX INFO: renamed from: m */
    public SVGAnimationView f35004m;

    public AudioMatchPrivilegeView(Context context) {
        super(context);
    }

    private void init() {
        if (xdl0.m208408w0() < 960) {
            m54215l0();
        }
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            this.f34999h.setImageUrl(userM169527p9.m60124fp().url);
            if (NullChecker.m81303a(userM169527p9.settings) && TEnum.equals(userM169527p9.settings.getLookingFor(), "female")) {
                m54211j0();
                return;
            }
            if (NullChecker.m81303a(userM169527p9.settings) && TEnum.equals(userM169527p9.settings.getLookingFor(), "male")) {
                m54212k0();
            } else if (TEnum.equals(userM169527p9.gender, "female")) {
                m54212k0();
            } else {
                m54211j0();
            }
        }
    }

    /* JADX INFO: renamed from: j0 */
    private void m54211j0() {
        qib0.f154691G.m102354Y0(this.f35001j, d3c0.f83708Pa);
    }

    /* JADX INFO: renamed from: k0 */
    private void m54212k0() {
        qib0.f154691G.m102354Y0(this.f35001j, d3c0.f83722Qa);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m54213h0(View view) {
        gb1.m125113a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m54214i0(PurchaseType purchaseType) {
        String str;
        String str2;
        if (sab0.m182891i(purchaseType)) {
            str = "https://auto.tancdn.com/v1/raw/ba15ae47-96dd-434b-900f-91692d51b57e14.pdf";
            str2 = "https://auto.tancdn.com/v1/raw/24286ac3-5f6f-4be2-8ec5-3ba231a5725614.pdf";
        } else {
            str = "https://auto.tancdn.com/v1/raw/43a454d2-a42a-41e8-8f40-1dfbd4d0c89d12.pdf";
            str2 = "https://auto.tancdn.com/v1/raw/52af8cbe-8c18-488a-b453-3431b647b6dd12.pdf";
        }
        SVGALoader.with(getContext()).from(str).autoPlay(false).into(this.f35004m);
        SVGALoader.with(getContext()).from(str2).autoPlay(false).into(this.f34995d);
        this.f35002k.setBackgroundResource(sab0.m182891i(purchaseType) ? d3c0.f83986k4 : d3c0.f84201z9);
        this.f35003l.setImageResource(sab0.m182891i(purchaseType) ? d3c0.f83944h4 : d3c0.f84159w9);
        this.f34998g.setBackgroundResource(sab0.m182891i(purchaseType) ? d3c0.f83958i4 : d3c0.f84173x9);
        this.f35000i.setBackgroundResource(sab0.m182891i(purchaseType) ? d3c0.f83972j4 : d3c0.f84187y9);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m54215l0() {
        int iM186890d = t100.m186890d(70.0f);
        int iM186890d2 = t100.m186890d(84.0f);
        ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) this.f34998g.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0220a).width = iM186890d2;
        ((ViewGroup.MarginLayoutParams) c0220a).height = iM186890d2;
        this.f34998g.setLayoutParams(c0220a);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f34999h.getLayoutParams();
        layoutParams.width = iM186890d;
        layoutParams.height = iM186890d;
        this.f34999h.setLayoutParams(layoutParams);
        ConstraintLayout.C0220a c0220a2 = (ConstraintLayout.C0220a) this.f35000i.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0220a2).width = iM186890d2;
        ((ViewGroup.MarginLayoutParams) c0220a2).height = iM186890d2;
        this.f35000i.setLayoutParams(c0220a2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f35001j.getLayoutParams();
        layoutParams2.width = iM186890d;
        layoutParams2.height = iM186890d;
        this.f35001j.setLayoutParams(layoutParams2);
        this.f34996e.setGuidelinePercent(0.46f);
        this.f34997f.setGuidelinePercent(0.54f);
        ViewGroup.LayoutParams layoutParams3 = this.f34995d.getLayoutParams();
        layoutParams3.width = t100.m186890d(125.0f);
        layoutParams3.height = t100.m186890d(125.0f);
        this.f34995d.setLayoutParams(layoutParams3);
    }

    /* JADX INFO: renamed from: m0 */
    public void m54216m0() {
        this.f34995d.startAnimation();
        this.f35004m.startAnimation();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54213h0(this);
        init();
    }

    public AudioMatchPrivilegeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AudioMatchPrivilegeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
