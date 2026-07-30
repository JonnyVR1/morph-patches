package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.util.AttributeSet;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.newui.view.NestedUseAgencyScrollView;
import com.tantanapp.common.utils.NullChecker;
import p149l.e51;
import p149l.mqi0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class StateScrollVIew extends NestedUseAgencyScrollView {

    /* JADX INFO: renamed from: G */
    public boolean f26738G;

    /* JADX INFO: renamed from: H */
    public InterfaceC8233a f26739H;

    /* JADX INFO: renamed from: I */
    public Runnable f26740I;

    /* JADX INFO: renamed from: J */
    public long f26741J;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.StateScrollVIew$a */
    public interface InterfaceC8233a {
        /* JADX INFO: renamed from: a */
        void mo43496a(boolean z);
    }

    public StateScrollVIew(Context context) {
        super(context);
        this.f26738G = false;
        this.f26740I = new Runnable() { // from class: l.mvf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f135899a.m43494V();
            }
        };
        this.f26741J = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m43494V() {
        this.f26738G = false;
        if (NullChecker.m81303a(this.f26739H)) {
            this.f26739H.mo43496a(false);
        }
    }

    private Act getAct() {
        return (Act) xdl0.m208328E(this);
    }

    /* JADX INFO: renamed from: W */
    public void m43495W() {
        e51.m114745J(this.f26740I);
        e51.m114743H(getAct(), this.f26740I, 50L);
    }

    public InterfaceC8233a getOnScrollStateListener() {
        return this.f26739H;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f26738G) {
            if (mqi0.m155944o() - this.f26741J > 30) {
                m43495W();
                this.f26741J = mqi0.m155944o();
                return;
            }
            return;
        }
        this.f26738G = true;
        m43495W();
        if (NullChecker.m81303a(this.f26739H)) {
            this.f26739H.mo43496a(true);
        }
    }

    public void setOnScrollStateListener(InterfaceC8233a interfaceC8233a) {
        this.f26739H = interfaceC8233a;
    }

    public StateScrollVIew(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26738G = false;
        this.f26740I = new Runnable() { // from class: l.mvf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f135899a.m43494V();
            }
        };
        this.f26741J = 0L;
    }

    public StateScrollVIew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26738G = false;
        this.f26740I = new Runnable() { // from class: l.mvf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f135899a.m43494V();
            }
        };
        this.f26741J = 0L;
    }
}
