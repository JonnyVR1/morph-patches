package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.util.AttributeSet;
import com.p000p1.mobile.putong.newui.view.NestedUseAgencyScrollView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.e51;
import l.xdl0;
import p009l.mqi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class StateScrollVIew extends NestedUseAgencyScrollView {

    /* JADX INFO: renamed from: G */
    public boolean f5516G;

    /* JADX INFO: renamed from: H */
    public InterfaceC0397a f5517H;

    /* JADX INFO: renamed from: I */
    public Runnable f5518I;

    /* JADX INFO: renamed from: J */
    public long f5519J;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.StateScrollVIew$a */
    public interface InterfaceC0397a {
        /* JADX INFO: renamed from: a */
        void mo7742a(boolean z);
    }

    public StateScrollVIew(Context context) {
        super(context);
        this.f5516G = false;
        this.f5518I = new Runnable() { // from class: l.mvf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17122a.m7740V();
            }
        };
        this.f5519J = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m7740V() {
        this.f5516G = false;
        if (NullChecker.a(this.f5517H)) {
            this.f5517H.mo7742a(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Act getAct() {
        return xdl0.E(this);
    }

    /* JADX INFO: renamed from: W */
    public void m7741W() {
        e51.J(this.f5518I);
        e51.H(getAct(), this.f5518I, 50L);
    }

    public InterfaceC0397a getOnScrollStateListener() {
        return this.f5517H;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f5516G) {
            if (mqi0.m18550o() - this.f5519J > 30) {
                m7741W();
                this.f5519J = mqi0.m18550o();
                return;
            }
            return;
        }
        this.f5516G = true;
        m7741W();
        if (NullChecker.a(this.f5517H)) {
            this.f5517H.mo7742a(true);
        }
    }

    public void setOnScrollStateListener(InterfaceC0397a interfaceC0397a) {
        this.f5517H = interfaceC0397a;
    }

    public StateScrollVIew(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5516G = false;
        this.f5518I = new Runnable() { // from class: l.mvf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17122a.m7740V();
            }
        };
        this.f5519J = 0L;
    }

    public StateScrollVIew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5516G = false;
        this.f5518I = new Runnable() { // from class: l.mvf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17122a.m7740V();
            }
        };
        this.f5519J = 0L;
    }
}
