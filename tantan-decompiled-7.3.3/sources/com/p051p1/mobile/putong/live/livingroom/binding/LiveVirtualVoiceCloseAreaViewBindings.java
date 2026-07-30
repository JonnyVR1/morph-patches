package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.close.VirtualVoiceCloseView;
import p151v.VImage;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceCloseAreaViewBindings<T extends k3m> extends ConstraintLayout implements iam<T> {

    /* JADX INFO: renamed from: d */
    public T f48951d;

    /* JADX INFO: renamed from: e */
    public VirtualVoiceCloseView f48952e;

    /* JADX INFO: renamed from: f */
    public VImage f48953f;

    /* JADX INFO: renamed from: g */
    public VImage f48954g;

    /* JADX INFO: renamed from: h */
    public VImage f48955h;

    public LiveVirtualVoiceCloseAreaViewBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public VirtualVoiceCloseView getRoot() {
        return this.f48952e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73220h0(ViewGroup viewGroup) {
        this.f48952e = (VirtualVoiceCloseView) viewGroup;
        VImage vImage = (VImage) viewGroup.getChildAt(0);
        this.f48953f = vImage;
        String str = vImage == null ? "_voiceClose" : null;
        VImage vImage2 = (VImage) viewGroup.getChildAt(1);
        this.f48954g = vImage2;
        if (vImage2 == null) {
            str = "_group_info";
        }
        VImage vImage3 = (VImage) viewGroup.getChildAt(2);
        this.f48955h = vImage3;
        if (vImage3 == null) {
            str = "_share";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48951d = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198998Z6, viewGroup, false);
        m73220h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73220h0(this);
    }

    public LiveVirtualVoiceCloseAreaViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceCloseAreaViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
