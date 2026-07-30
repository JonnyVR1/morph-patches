package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.util.AttributeSet;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.newui.view.NestedUseAgencyScrollView;
import com.tantanapp.common.utils.NullChecker;
import p153l.bnl0;
import p153l.l51;
import p153l.pzi0;

/* JADX INFO: loaded from: classes11.dex */
public class StateScrollVIew extends NestedUseAgencyScrollView {

    /* JADX INFO: renamed from: G */
    public boolean f27586G;

    /* JADX INFO: renamed from: H */
    public InterfaceC8396a f27587H;

    /* JADX INFO: renamed from: I */
    public Runnable f27588I;

    /* JADX INFO: renamed from: J */
    public long f27589J;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.StateScrollVIew$a */
    public interface InterfaceC8396a {
        /* JADX INFO: renamed from: a */
        void mo44682a(boolean z);
    }

    public StateScrollVIew(Context context) {
        super(context);
        this.f27586G = false;
        this.f27588I = new Runnable() { // from class: l.v3g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f182209a.m44680V();
            }
        };
        this.f27589J = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m44680V() {
        this.f27586G = false;
        if (NullChecker.m82486a(this.f27587H)) {
            this.f27587H.mo44682a(false);
        }
    }

    private Act getAct() {
        return (Act) bnl0.m105508E(this);
    }

    /* JADX INFO: renamed from: W */
    public void m44681W() {
        l51.m152890J(this.f27588I);
        l51.m152888H(getAct(), this.f27588I, 50L);
    }

    public InterfaceC8396a getOnScrollStateListener() {
        return this.f27587H;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f27586G) {
            if (pzi0.m174454o() - this.f27589J > 30) {
                m44681W();
                this.f27589J = pzi0.m174454o();
                return;
            }
            return;
        }
        this.f27586G = true;
        m44681W();
        if (NullChecker.m82486a(this.f27587H)) {
            this.f27587H.mo44682a(true);
        }
    }

    public void setOnScrollStateListener(InterfaceC8396a interfaceC8396a) {
        this.f27587H = interfaceC8396a;
    }

    public StateScrollVIew(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27586G = false;
        this.f27588I = new Runnable() { // from class: l.v3g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f182209a.m44680V();
            }
        };
        this.f27589J = 0L;
    }

    public StateScrollVIew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27586G = false;
        this.f27588I = new Runnable() { // from class: l.v3g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f182209a.m44680V();
            }
        };
        this.f27589J = 0L;
    }
}
