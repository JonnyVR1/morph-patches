package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.ktv.KtvView;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceKtvDialogViewBindings<T extends k3m> extends LinearLayout implements iam<T> {

    /* JADX INFO: renamed from: a */
    public T f48965a;

    /* JADX INFO: renamed from: b */
    public KtvView f48966b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f48967c;

    /* JADX INFO: renamed from: d */
    public VText f48968d;

    public LiveVirtualVoiceKtvDialogViewBindings(Context context) {
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
    public void m73223f(ViewGroup viewGroup) {
        this.f48966b = (KtvView) viewGroup;
        RecyclerView recyclerView = (RecyclerView) viewGroup.getChildAt(1);
        this.f48967c = recyclerView;
        String str = recyclerView == null ? "_music_effect" : null;
        VText vText = (VText) viewGroup.getChildAt(2);
        this.f48968d = vText;
        if (vText == null) {
            str = "_go";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    public KtvView getRoot() {
        return this.f48966b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48965a = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199050d7, viewGroup, false);
        m73223f((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73223f(this);
    }

    public LiveVirtualVoiceKtvDialogViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceKtvDialogViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
