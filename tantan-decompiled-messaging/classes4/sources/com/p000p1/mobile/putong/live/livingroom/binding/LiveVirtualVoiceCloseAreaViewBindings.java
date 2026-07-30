package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.livingroom.virtual.room.close.VirtualVoiceCloseView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVirtualVoiceCloseAreaViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f4145d;

    /* JADX INFO: renamed from: e */
    public VirtualVoiceCloseView f4146e;

    /* JADX INFO: renamed from: f */
    public VImage f4147f;

    /* JADX INFO: renamed from: g */
    public VImage f4148g;

    /* JADX INFO: renamed from: h */
    public VImage f4149h;

    public LiveVirtualVoiceCloseAreaViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5470C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public VirtualVoiceCloseView getRoot() {
        return this.f4146e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5471h0(ViewGroup viewGroup) {
        this.f4146e = (VirtualVoiceCloseView) viewGroup;
        VImage childAt = viewGroup.getChildAt(0);
        this.f4147f = childAt;
        String str = childAt == null ? "_voiceClose" : null;
        VImage childAt2 = viewGroup.getChildAt(1);
        this.f4148g = childAt2;
        if (childAt2 == null) {
            str = "_group_info";
        }
        VImage childAt3 = viewGroup.getChildAt(2);
        this.f4149h = childAt3;
        if (childAt3 == null) {
            str = "_share";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void m5472i1(T t) {
        this.f4145d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19762Z6, viewGroup, false);
        m5471h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5471h0(this);
    }

    public LiveVirtualVoiceCloseAreaViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceCloseAreaViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
