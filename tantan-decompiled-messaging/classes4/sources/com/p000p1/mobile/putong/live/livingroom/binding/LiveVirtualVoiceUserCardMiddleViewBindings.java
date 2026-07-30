package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.virtual.userCard.middle.VoiceVirtualUserCardMiddleView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVirtualVoiceUserCardMiddleViewBindings<T extends q0m> extends LinearLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f4227a;

    /* JADX INFO: renamed from: b */
    public VoiceVirtualUserCardMiddleView f4228b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f4229c;

    public LiveVirtualVoiceUserCardMiddleViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5505C0() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m5506a(ViewGroup viewGroup) {
        this.f4228b = (VoiceVirtualUserCardMiddleView) viewGroup;
        VRecyclerView childAt = viewGroup.getChildAt(0);
        this.f4229c = childAt;
        String str = childAt == null ? "_entrance" : null;
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public void destroy() {
    }

    public VoiceVirtualUserCardMiddleView getRoot() {
        return this.f4228b;
    }

    /* JADX INFO: renamed from: i1 */
    public void m5507i1(T t) {
        this.f4227a = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19957o7, viewGroup, false);
        m5506a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5506a(this);
    }

    public LiveVirtualVoiceUserCardMiddleViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualVoiceUserCardMiddleViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
