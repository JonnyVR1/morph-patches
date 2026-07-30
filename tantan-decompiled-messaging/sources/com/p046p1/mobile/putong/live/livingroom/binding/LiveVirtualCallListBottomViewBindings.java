package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.LiveVirtualCallListBottomView;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualCallListBottomViewBindings<T extends q0m> extends FrameLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f48073a;

    /* JADX INFO: renamed from: b */
    public LiveVirtualCallListBottomView f48074b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f48075c;

    /* JADX INFO: renamed from: d */
    public ImageView f48076d;

    /* JADX INFO: renamed from: e */
    public TextView f48077e;

    /* JADX INFO: renamed from: f */
    public TextView f48078f;

    public LiveVirtualCallListBottomViewBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m72031a(ViewGroup viewGroup) {
        this.f48074b = (LiveVirtualCallListBottomView) viewGroup;
        LinearLayout linearLayout = (LinearLayout) viewGroup.getChildAt(0);
        this.f48075c = linearLayout;
        String str = linearLayout == null ? "_bottom_bg" : null;
        ImageView imageView = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f48076d = imageView;
        if (imageView == null) {
            str = "_icon";
        }
        TextView textView = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f48077e = textView;
        if (textView == null) {
            str = "_text";
        }
        TextView textView2 = (TextView) viewGroup.getChildAt(1);
        this.f48078f = textView2;
        if (textView2 == null) {
            str = "_red_dot";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public LiveVirtualCallListBottomView getRoot() {
        return this.f48074b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48073a = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168026F6, viewGroup, false);
        m72031a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72031a(this);
    }

    public LiveVirtualCallListBottomViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualCallListBottomViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
