package com.p051p1.mobile.putong.account.p055ui.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.C20845vj;
import p153l.InterfaceC20833vh;
import p153l.bbc0;
import p153l.bnl0;
import p153l.h1e0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountCameraVideoControlView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public AccountRecordButton f17497a;

    /* JADX INFO: renamed from: b */
    public VFrame f17498b;

    /* JADX INFO: renamed from: c */
    public AccountCameraMenuView f17499c;

    /* JADX INFO: renamed from: d */
    public AccountRedDotView f17500d;

    /* JADX INFO: renamed from: e */
    public AccountCameraMenuView f17501e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f17502f;

    /* JADX INFO: renamed from: g */
    public ImageView f17503g;

    /* JADX INFO: renamed from: h */
    public ImageView f17504h;

    /* JADX INFO: renamed from: i */
    public int f17505i;

    /* JADX INFO: renamed from: j */
    public InterfaceC20833vh f17506j;

    /* JADX INFO: renamed from: k */
    public boolean f17507k;

    public AccountCameraVideoControlView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m29945f(View view) {
        C20845vj.m201428a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m29946g() {
        int i = this.f17505i;
        if (i != 2) {
            if (i == 4) {
                this.f17505i = 5;
                return;
            } else if (i != 5) {
                return;
            }
        }
        this.f17505i = 4;
    }

    /* JADX INFO: renamed from: h */
    public final void m29947h() {
        m29957r();
        this.f17505i = 1;
    }

    /* JADX INFO: renamed from: i */
    public void m29948i() {
        this.f17505i = 2;
    }

    /* JADX INFO: renamed from: j */
    public void m29949j(Media media) {
        AccountCameraMenuView accountCameraMenuView = this.f17501e;
        if (media == null) {
            accountCameraMenuView.getDraweeLayout().setBackgroundResource(bbc0.f75843U);
            return;
        }
        accountCameraMenuView.getDraweeView().setBackgroundResource(bbc0.f75846V);
        VDraweeView draweeView = this.f17501e.getDraweeView();
        draweeView.getHierarchy().m207045H(new RoundingParams().m8322v(false).m8319s(bnl0.m105587w(5.0f)));
        draweeView.getHierarchy().m207062w(h1e0.f107451h);
        int iM175859d = qa00.m175859d(3.0f);
        draweeView.setPadding(iM175859d, iM175859d, iM175859d, iM175859d);
        uqb0.f180374G.m127150m0(draweeView, media.url);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m29950k(View view) {
        if (NullChecker.m82486a(this.f17506j)) {
            this.f17506j.mo179144i(view);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m29951l(View view) {
        if (NullChecker.m82486a(this.f17506j)) {
            this.f17506j.mo179178v(view);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m29952m(View view) {
        if (NullChecker.m82486a(this.f17506j)) {
            this.f17506j.mo179134f(view);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m29953n(View view) {
        if (this.f17505i == 1) {
            return;
        }
        if (NullChecker.m82486a(this.f17506j) && this.f17506j.mo179161p()) {
            return;
        }
        m29959t();
        m29946g();
        m29955p();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m29954o(View view) {
        this.f17505i = 6;
        m29955p();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29945f(this);
        m29947h();
    }

    /* JADX INFO: renamed from: p */
    public final void m29955p() {
        if (NullChecker.m82486a(this.f17506j)) {
            this.f17506j.onStateChanged(this.f17505i);
        }
        int i = this.f17505i;
        if (i == 2) {
            this.f17498b.setVisibility(0);
            this.f17501e.setVisibility(0);
            this.f17502f.setVisibility(8);
            this.f17497a.setState(1);
            return;
        }
        if (i == 4) {
            this.f17498b.setVisibility(8);
            this.f17501e.setVisibility(8);
            this.f17502f.setVisibility(8);
            this.f17497a.setState(2);
            return;
        }
        if (i != 5) {
            return;
        }
        this.f17498b.setVisibility(0);
        this.f17501e.setVisibility(8);
        this.f17502f.setVisibility(0);
        this.f17497a.setState(1);
    }

    /* JADX INFO: renamed from: q */
    public void m29956q() {
        this.f17505i = 1;
    }

    /* JADX INFO: renamed from: r */
    public final void m29957r() {
        this.f17499c.setOnClickListener(new View.OnClickListener() { // from class: l.qj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157899a.m29950k(view);
            }
        });
        bnl0.m105509E0(this.f17501e, new View.OnClickListener() { // from class: l.rj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163405a.m29951l(view);
            }
        });
        this.f17503g.setOnClickListener(new View.OnClickListener() { // from class: l.sj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f168888a.m29952m(view);
            }
        });
        this.f17497a.setOnClickListener(new View.OnClickListener() { // from class: l.tj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174520a.m29953n(view);
            }
        });
        this.f17504h.setOnClickListener(new View.OnClickListener() { // from class: l.uj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179166a.m29954o(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m29958s(boolean z) {
        bnl0.m105524M(this.f17500d, z);
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        this.f17497a.setActivated(z);
    }

    public void setCallback(InterfaceC20833vh interfaceC20833vh) {
        this.f17506j = interfaceC20833vh;
    }

    public void setState(int i) {
        this.f17505i = i;
        m29955p();
    }

    /* JADX INFO: renamed from: t */
    public final void m29959t() {
        if (this.f17507k) {
            return;
        }
        this.f17507k = true;
    }

    public AccountCameraVideoControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountCameraVideoControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
