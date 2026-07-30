package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.spy.SpyDialogView;
import p147v.VDraweeView;
import p147v.VText;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceSpyDialogViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f48158a;

    /* JADX INFO: renamed from: b */
    public SpyDialogView f48159b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f48160c;

    /* JADX INFO: renamed from: d */
    public VText f48161d;

    public LiveVirtualVoiceSpyDialogViewBindings(Context context) {
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

    /* JADX INFO: renamed from: f */
    public void m72046f(ViewGroup viewGroup) {
        this.f48159b = (SpyDialogView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f48160c = vDraweeView;
        String str = vDraweeView == null ? "_description" : null;
        VText vText = (VText) viewGroup.getChildAt(2);
        this.f48161d = vText;
        if (vText == null) {
            str = "_go";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    public SpyDialogView getRoot() {
        return this.f48159b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48158a = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168409k7, viewGroup, false);
        m72046f((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72046f(this);
    }

    public LiveVirtualVoiceSpyDialogViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceSpyDialogViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
