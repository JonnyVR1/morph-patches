package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.ktv.KtvView;
import p147v.VText;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualVoiceKtvDialogViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f48117a;

    /* JADX INFO: renamed from: b */
    public KtvView f48118b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f48119c;

    /* JADX INFO: renamed from: d */
    public VText f48120d;

    public LiveVirtualVoiceKtvDialogViewBindings(Context context) {
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
    public void m72040f(ViewGroup viewGroup) {
        this.f48118b = (KtvView) viewGroup;
        RecyclerView recyclerView = (RecyclerView) viewGroup.getChildAt(1);
        this.f48119c = recyclerView;
        String str = recyclerView == null ? "_music_effect" : null;
        VText vText = (VText) viewGroup.getChildAt(2);
        this.f48120d = vText;
        if (vText == null) {
            str = "_go";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    public KtvView getRoot() {
        return this.f48118b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48117a = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168318d7, viewGroup, false);
        m72040f((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72040f(this);
    }

    public LiveVirtualVoiceKtvDialogViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceKtvDialogViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
