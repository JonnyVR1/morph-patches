package com.p051p1.mobile.putong.live.livingroom.base.player;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.view.LiveLoadingView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.base.pusher.C12878a;
import p151v.VText;
import p153l.bnl0;
import p153l.iam;
import p153l.ig80;
import p153l.mdc0;
import p153l.n3d0;
import p153l.obc0;
import p153l.oct;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class LivePlayerView extends FrameLayout implements iam<ig80> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f48698a;

    /* JADX INFO: renamed from: b */
    public ViewStub f48699b;

    /* JADX INFO: renamed from: c */
    public VText f48700c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f48701d;

    /* JADX INFO: renamed from: e */
    public VText f48702e;

    /* JADX INFO: renamed from: f */
    public ImageView f48703f;

    /* JADX INFO: renamed from: g */
    public ViewStub f48704g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f48705h;

    /* JADX INFO: renamed from: i */
    public ig80 f48706i;

    /* JADX INFO: renamed from: j */
    public LiveLoadingView f48707j;

    public LivePlayerView(@NonNull Context context) {
        super(context);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: c */
    public final void m73102c(View view) {
        oct.m167234a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ig80 ig80Var) {
        this.f48706i = ig80Var;
    }

    @Override // p153l.iam
    public void destroy() {
        m73112p();
        setWaterMarkVisible(false);
    }

    /* JADX INFO: renamed from: e */
    public void m73104e() {
        m73115u(false);
        m73105f();
    }

    /* JADX INFO: renamed from: f */
    public void m73105f() {
        LinearLayout linearLayout = this.f48705h;
        if (linearLayout != null) {
            bnl0.m105524M(linearLayout, false);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m73106i() {
        LinearLayout linearLayout = this.f48705h;
        if (linearLayout != null) {
            bnl0.m105524M(linearLayout.findViewById(mdc0.f136063U), false);
            bnl0.m105524M(this.f48705h.findViewById(mdc0.f136274q1), false);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m73107j() {
        LiveLoadingView liveLoadingView = this.f48707j;
        return liveLoadingView != null && liveLoadingView.m69925e();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m73108k(View view) {
        this.f48706i.m139882K4();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m73109l(View view) {
        this.f48706i.m139882K4();
    }

    /* JADX INFO: renamed from: m */
    public void m73110m() {
        m73104e();
        setPlayerCoverVisible(true);
        m73114s(true);
    }

    /* JADX INFO: renamed from: n */
    public void m73111n(boolean z) {
        bnl0.m105524M(this.f48698a, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73102c(this);
        C12878a.INSTANCE.m73163a(this.f48703f);
        bnl0.m105540X(this.f48701d, bnl0.m105511F0() + qa00.m175859d(50.0f));
    }

    /* JADX INFO: renamed from: p */
    public void m73112p() {
        m73114s(false);
        m73104e();
        setPlayerCoverVisible(true);
    }

    /* JADX INFO: renamed from: q */
    public void m73113q(String str) {
        m73115u(false);
        if (this.f48705h == null) {
            LinearLayout linearLayout = (LinearLayout) this.f48699b.inflate();
            this.f48705h = linearLayout;
            linearLayout.setBackgroundColor(0);
            this.f48705h.findViewById(mdc0.f136274q1).setOnClickListener(new View.OnClickListener() { // from class: l.mct
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f135845a.m73108k(view);
                }
            });
        }
        ((TextView) this.f48705h.findViewById(mdc0.f136301t1)).setText(str);
        this.f48705h.findViewById(mdc0.f135923E3).setBackground(getContext().getDrawable(obc0.f146155Q));
        bnl0.m105524M(this.f48705h.findViewById(mdc0.f136274q1), true);
        bnl0.m105524M(this.f48705h.findViewById(mdc0.f136063U), true);
        bnl0.m105524M(this.f48705h, true);
    }

    /* JADX INFO: renamed from: s */
    public void m73114s(boolean z) {
        bnl0.m105524M(this.f48700c, z);
    }

    public void setPlayerCoverVisible(boolean z) {
    }

    public void setWaterMarkUserId(String str) {
        this.f48702e.setText(String.format("%s", str));
    }

    public void setWaterMarkVisible(boolean z) {
        bnl0.m105524M(this.f48701d, z);
    }

    /* JADX INFO: renamed from: u */
    public void m73115u(boolean z) {
        if (this.f48707j == null) {
            this.f48707j = (LiveLoadingView) this.f48704g.inflate();
        }
        LiveLoadingView liveLoadingView = this.f48707j;
        if (z) {
            bnl0.m105524M(liveLoadingView, true);
            this.f48707j.m69927g();
        } else {
            liveLoadingView.m69928h();
            bnl0.m105524M(this.f48704g, false);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m73116v(String str) {
        m73115u(false);
        if (this.f48705h == null) {
            LinearLayout linearLayout = (LinearLayout) this.f48699b.inflate();
            this.f48705h = linearLayout;
            linearLayout.setBackgroundColor(0);
            this.f48705h.findViewById(mdc0.f136274q1).setOnClickListener(new View.OnClickListener() { // from class: l.nct
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f141400a.m73109l(view);
                }
            });
        }
        if (TextUtils.isEmpty(str)) {
            str = n3d0.m161280d(R$string.f48116h0);
        }
        ((TextView) this.f48705h.findViewById(mdc0.f136301t1)).setText(str);
        this.f48705h.findViewById(mdc0.f135923E3).setBackground(null);
        bnl0.m105524M(this.f48705h, true);
        m73106i();
        m73114s(false);
    }

    /* JADX INFO: renamed from: w */
    public void m73117w(boolean z) {
        this.f48701d.setTranslationY(z ? qa00.m175859d(24.0f) : 0);
    }

    public LivePlayerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LivePlayerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
