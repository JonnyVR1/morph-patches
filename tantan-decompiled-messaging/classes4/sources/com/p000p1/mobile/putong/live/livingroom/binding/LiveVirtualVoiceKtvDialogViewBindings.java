package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.ktv.KtvView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVirtualVoiceKtvDialogViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f4159a;

    /* JADX INFO: renamed from: b */
    public KtvView f4160b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f4161c;

    /* JADX INFO: renamed from: d */
    public VText f4162d;

    public LiveVirtualVoiceKtvDialogViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5479C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void m5480f(ViewGroup viewGroup) {
        this.f4160b = (KtvView) viewGroup;
        RecyclerView childAt = viewGroup.getChildAt(1);
        this.f4161c = childAt;
        String str = childAt == null ? "_music_effect" : null;
        VText childAt2 = viewGroup.getChildAt(2);
        this.f4162d = childAt2;
        if (childAt2 == null) {
            str = "_go";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public KtvView getRoot() {
        return this.f4160b;
    }

    /* JADX INFO: renamed from: i1 */
    public void m5481i1(T t) {
        this.f4159a = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19814d7, viewGroup, false);
        m5480f((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5480f(this);
    }

    public LiveVirtualVoiceKtvDialogViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceKtvDialogViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
