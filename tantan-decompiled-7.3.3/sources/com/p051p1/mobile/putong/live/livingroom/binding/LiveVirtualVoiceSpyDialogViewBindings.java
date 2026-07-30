package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.spy.SpyDialogView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceSpyDialogViewBindings<T extends k3m> extends LinearLayout implements iam<T> {

    /* JADX INFO: renamed from: a */
    public T f49006a;

    /* JADX INFO: renamed from: b */
    public SpyDialogView f49007b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f49008c;

    /* JADX INFO: renamed from: d */
    public VText f49009d;

    public LiveVirtualVoiceSpyDialogViewBindings(Context context) {
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

    /* JADX INFO: renamed from: f */
    public void m73229f(ViewGroup viewGroup) {
        this.f49007b = (SpyDialogView) viewGroup;
        VDraweeView vDraweeView = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        this.f49008c = vDraweeView;
        String str = vDraweeView == null ? "_description" : null;
        VText vText = (VText) viewGroup.getChildAt(2);
        this.f49009d = vText;
        if (vText == null) {
            str = "_go";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    public SpyDialogView getRoot() {
        return this.f49007b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f49006a = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199141k7, viewGroup, false);
        m73229f((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73229f(this);
    }

    public LiveVirtualVoiceSpyDialogViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceSpyDialogViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
