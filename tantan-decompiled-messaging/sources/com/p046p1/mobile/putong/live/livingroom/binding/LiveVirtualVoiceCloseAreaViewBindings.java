package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.close.VirtualVoiceCloseView;
import p147v.VImage;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceCloseAreaViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f48103d;

    /* JADX INFO: renamed from: e */
    public VirtualVoiceCloseView f48104e;

    /* JADX INFO: renamed from: f */
    public VImage f48105f;

    /* JADX INFO: renamed from: g */
    public VImage f48106g;

    /* JADX INFO: renamed from: h */
    public VImage f48107h;

    public LiveVirtualVoiceCloseAreaViewBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public VirtualVoiceCloseView getRoot() {
        return this.f48104e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72037h0(ViewGroup viewGroup) {
        this.f48104e = (VirtualVoiceCloseView) viewGroup;
        VImage vImage = (VImage) viewGroup.getChildAt(0);
        this.f48105f = vImage;
        String str = vImage == null ? "_voiceClose" : null;
        VImage vImage2 = (VImage) viewGroup.getChildAt(1);
        this.f48106g = vImage2;
        if (vImage2 == null) {
            str = "_group_info";
        }
        VImage vImage3 = (VImage) viewGroup.getChildAt(2);
        this.f48107h = vImage3;
        if (vImage3 == null) {
            str = "_share";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48103d = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168266Z6, viewGroup, false);
        m72037h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72037h0(this);
    }

    public LiveVirtualVoiceCloseAreaViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceCloseAreaViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
