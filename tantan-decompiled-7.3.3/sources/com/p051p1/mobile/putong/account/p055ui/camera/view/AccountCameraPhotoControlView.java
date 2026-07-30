package com.p051p1.mobile.putong.account.p055ui.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.C20047si;
import p153l.InterfaceC20833vh;
import p153l.bbc0;
import p153l.bnl0;
import p153l.h1e0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountCameraPhotoControlView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public AccountRecordButton f17491a;

    /* JADX INFO: renamed from: b */
    public VFrame f17492b;

    /* JADX INFO: renamed from: c */
    public AccountCameraMenuView f17493c;

    /* JADX INFO: renamed from: d */
    public AccountRedDotView f17494d;

    /* JADX INFO: renamed from: e */
    public AccountCameraMenuView f17495e;

    /* JADX INFO: renamed from: f */
    public InterfaceC20833vh f17496f;

    public AccountCameraPhotoControlView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m29932d(View view) {
        C20047si.m185993a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m29933e() {
        m29938j();
    }

    /* JADX INFO: renamed from: f */
    public void m29934f(Media media) {
        AccountCameraMenuView accountCameraMenuView = this.f17495e;
        if (media == null) {
            accountCameraMenuView.getDraweeLayout().setBackgroundResource(bbc0.f75843U);
            return;
        }
        accountCameraMenuView.getDraweeView().setBackgroundResource(bbc0.f75846V);
        VDraweeView draweeView = this.f17495e.getDraweeView();
        draweeView.getHierarchy().m207045H(new RoundingParams().m8322v(false).m8319s(bnl0.m105587w(6.0f)));
        draweeView.getHierarchy().m207062w(h1e0.f107451h);
        draweeView.getLayoutParams();
        int iM175859d = qa00.m175859d(3.0f);
        draweeView.setPadding(iM175859d, iM175859d, iM175859d, iM175859d);
        uqb0.f180374G.m127150m0(draweeView, media.url);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m29935g(View view) {
        if (NullChecker.m82486a(this.f17496f)) {
            this.f17496f.mo179144i(view);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m29936h(View view) {
        if (!NullChecker.m82486a(this.f17496f) || this.f17496f.mo179161p()) {
            return;
        }
        this.f17496f.onStateChanged(3);
        this.f17496f.onStateChanged(2);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m29937i(View view) {
        if (NullChecker.m82486a(this.f17496f)) {
            this.f17496f.mo179178v(view);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m29938j() {
        this.f17493c.setOnClickListener(new View.OnClickListener() { // from class: l.pi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152503a.m29935g(view);
            }
        });
        this.f17491a.setOnClickListener(new View.OnClickListener() { // from class: l.qi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157786a.m29936h(view);
            }
        });
        this.f17495e.setOnClickListener(new View.OnClickListener() { // from class: l.ri
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163327a.m29937i(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m29939k(boolean z) {
        bnl0.m105524M(this.f17494d, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29932d(this);
        m29933e();
    }

    public void setCallback(InterfaceC20833vh interfaceC20833vh) {
        this.f17496f = interfaceC20833vh;
    }

    public void setEnable(boolean z) {
        this.f17491a.setEnabled(z);
    }

    public AccountCameraPhotoControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountCameraPhotoControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
