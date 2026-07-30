package com.p046p1.mobile.putong.live.external.internal.vchat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VFrame;
import p147v.VImage;
import p149l.s7m;
import p149l.tmk0;
import p149l.uou;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatPreviewView extends ConstraintLayout implements s7m<tmk0> {

    /* JADX INFO: renamed from: d */
    public VFrame f45418d;

    /* JADX INFO: renamed from: e */
    public VImage f45419e;

    /* JADX INFO: renamed from: f */
    public VButton f45420f;

    /* JADX INFO: renamed from: g */
    public VImage f45421g;

    /* JADX INFO: renamed from: h */
    public tmk0 f45422h;

    public LiveVChatPreviewView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m69775m0(View view) {
        if (NullChecker.m81303a(this.f45422h)) {
            this.f45422h.m189700U2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m69776n0(View view) {
        if (NullChecker.m81303a(this.f45422h)) {
            this.f45422h.m189703X2();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m69777k0(View view) {
        uou.m194566a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(tmk0 tmk0Var) {
        this.f45422h = tmk0Var;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m69779o0(View view) {
        if (NullChecker.m81303a(this.f45422h)) {
            this.f45422h.m189699T2();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69777k0(this);
        xdl0.m208329E0(this.f45421g, new View.OnClickListener() { // from class: l.rou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160418a.m69775m0(view);
            }
        });
        xdl0.m208329E0(this.f45420f, new View.OnClickListener() { // from class: l.sou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165724a.m69776n0(view);
            }
        });
        xdl0.m208329E0(this.f45419e, new View.OnClickListener() { // from class: l.tou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171409a.m69779o0(view);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public void m69780p0(boolean z) {
        xdl0.m208344M(this, z);
    }

    public LiveVChatPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
