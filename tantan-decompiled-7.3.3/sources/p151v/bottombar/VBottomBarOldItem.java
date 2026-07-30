package p151v.bottombar;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.LayoutRes;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import p151v.VDraweeView;
import p151v.VText;
import p153l.abc0;
import p153l.bkq;
import p153l.bnl0;
import p153l.f9j;
import p153l.gec0;
import p153l.qa00;
import p153l.r8g0;
import p153l.vcc0;
import p153l.z8c0;

/* JADX INFO: loaded from: classes3.dex */
public class VBottomBarOldItem extends VBottomBarDefaultItem {

    /* JADX INFO: renamed from: h */
    public VDraweeView f210463h;

    /* JADX INFO: renamed from: i */
    public VBottomBarRippleView f210464i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f210465j;

    /* JADX INFO: renamed from: k */
    public RelativeLayout f210466k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f210467l;

    /* JADX INFO: renamed from: m */
    public boolean f210468m;

    public VBottomBarOldItem(Context context) {
        super(context);
        mo41503c();
    }

    @Override // p151v.bottombar.VBottomBarDefaultItem
    /* JADX INFO: renamed from: b */
    public void mo224613b() {
        int i;
        int i2;
        super.mo224613b();
        C22709a c22709a = this.f210450a;
        if (c22709a == null) {
            return;
        }
        C22709a.a aVar = c22709a.f210495i;
        if (aVar == null || (i = aVar.f210498c) == 0 || (i2 = aVar.f210499d) == 0) {
            this.f210464i.m224625g(c22709a.f210489c, c22709a.f210491e);
        } else {
            this.f210464i.m224625g(i, i2);
        }
        if (r8g0.m180203b(c22709a.f210494h)) {
            return;
        }
        bnl0.m105525M0(this.f210463h, true);
        this.f210463h.getHierarchy().m207042E(new ColorDrawable(getContext().getResources().getColor(z8c0.f203358s)));
        this.f210463h.setImageURI(c22709a.f210494h);
        this.f210464i.setRippleListener(new VBottomBarRippleView.InterfaceC22707b() { // from class: l.jok0
            @Override // p151v.bottombar.VBottomBarRippleView.InterfaceC22707b
            /* JADX INFO: renamed from: a */
            public final void mo146469a(float f, float f2) {
                this.f122035a.m224620h(f, f2);
            }
        });
    }

    @Override // p151v.bottombar.VBottomBarDefaultItem
    /* JADX INFO: renamed from: c */
    public void mo41503c() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(gec0.f103791d, (ViewGroup) this, true);
        if (viewInflate.getLayoutParams() == null) {
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        }
        setClipChildren(false);
        setClipToPadding(false);
        this.f210463h = (VDraweeView) viewInflate.findViewById(vcc0.f183427l0);
        this.f210464i = (VBottomBarRippleView) viewInflate.findViewById(vcc0.f183370H0);
        this.f210467l = (FrameLayout) findViewById(vcc0.f183375K);
        this.f210466k = (RelativeLayout) findViewById(vcc0.f183429m0);
        this.f210465j = (RelativeLayout) findViewById(vcc0.f183372I0);
        super.mo41503c();
    }

    @Override // p151v.bottombar.VBottomBarDefaultItem
    /* JADX INFO: renamed from: d */
    public void mo40665d(boolean z, boolean z2) {
        if (z) {
            VBottomBarRippleView vBottomBarRippleView = this.f210464i;
            if (z2) {
                vBottomBarRippleView.m224627i();
            } else {
                vBottomBarRippleView.m224623d();
            }
            this.f210451b.setTextColor(getResources().getColor(z8c0.f203359t));
            this.f210451b.setTypeface(null, 1);
        } else {
            this.f210464i.m224624f();
            boolean z3 = this.f210456g;
            VText vText = this.f210451b;
            if (z3) {
                vText.setTextColor(getResources().getColor(z8c0.f203361v));
            } else {
                vText.setTextColor(getResources().getColor(z8c0.f203354o));
            }
            this.f210451b.setTypeface(null, 0);
        }
        VDraweeView vDraweeView = this.f210463h;
        if (vDraweeView == null || !this.f210468m) {
            return;
        }
        vDraweeView.setAlpha(isSelected() ? 1.0f : 0.5f);
    }

    /* JADX INFO: renamed from: f */
    public void m224618f(@LayoutRes int i) {
        if (this.f210466k.getChildCount() > 0) {
            this.f210466k.removeAllViews();
        }
        View.inflate(getContext(), i, this.f210466k);
        this.f210466k.setVisibility(0);
    }

    /* JADX INFO: renamed from: g */
    public void m224619g(SimpleDraweeView simpleDraweeView, String str, int i, int i2) {
        simpleDraweeView.setController(f9j.m124665g().mo8264b(simpleDraweeView.getController()).m8259C(ImageRequestBuilder.m8646y(Uri.parse(str)).m8657K(new bkq(i, i2)).m8668a()).build());
    }

    @Override // p151v.bottombar.VBottomBarDefaultItem
    public View getIconView() {
        return this.f210464i;
    }

    public VDraweeView getPicture() {
        return this.f210463h;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m224620h(float f, float f2) {
        this.f210463h.setScaleX(f2);
        this.f210463h.setScaleY(f2);
    }

    /* JADX INFO: renamed from: i */
    public void m224621i(String str, boolean z) {
        if (r8g0.m180203b(str)) {
            return;
        }
        bnl0.m105525M0(this.f210463h, true);
        VDraweeView vDraweeView = this.f210463h;
        if (z) {
            m224619g(vDraweeView, str, 2, 30);
        } else {
            vDraweeView.setImageURI(str);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m224622j() {
        bnl0.m105537U(this.f210465j, qa00.m175859d(13.0f));
        setBackgroundResource(abc0.f69442f);
        bnl0.m105538V(this.f210467l, qa00.m175859d(17.0f));
        this.f210468m = true;
    }

    @Override // p151v.bottombar.VBottomBarDefaultItem
    public void setDarkMode(boolean z) {
        super.setDarkMode(z);
        this.f210464i.setDarkMode(z);
        mo40665d(isSelected(), false);
    }

    public VBottomBarOldItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo41503c();
    }

    public VBottomBarOldItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo41503c();
    }
}
