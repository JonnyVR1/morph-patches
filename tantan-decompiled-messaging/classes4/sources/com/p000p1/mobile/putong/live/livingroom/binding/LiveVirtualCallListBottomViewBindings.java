package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.live.livingroom.virtual.room.LiveVirtualCallListBottomView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVirtualCallListBottomViewBindings<T extends q0m> extends FrameLayout implements s7m<T> {

    /* JADX INFO: renamed from: a */
    public T f4115a;

    /* JADX INFO: renamed from: b */
    public LiveVirtualCallListBottomView f4116b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f4117c;

    /* JADX INFO: renamed from: d */
    public ImageView f4118d;

    /* JADX INFO: renamed from: e */
    public TextView f4119e;

    /* JADX INFO: renamed from: f */
    public TextView f4120f;

    public LiveVirtualCallListBottomViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5454C0() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m5455a(ViewGroup viewGroup) {
        this.f4116b = (LiveVirtualCallListBottomView) viewGroup;
        LinearLayout linearLayout = (LinearLayout) viewGroup.getChildAt(0);
        this.f4117c = linearLayout;
        String str = linearLayout == null ? "_bottom_bg" : null;
        ImageView imageView = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f4118d = imageView;
        if (imageView == null) {
            str = "_icon";
        }
        TextView textView = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f4119e = textView;
        if (textView == null) {
            str = "_text";
        }
        TextView textView2 = (TextView) viewGroup.getChildAt(1);
        this.f4120f = textView2;
        if (textView2 == null) {
            str = "_red_dot";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public void destroy() {
    }

    public LiveVirtualCallListBottomView getRoot() {
        return this.f4116b;
    }

    /* JADX INFO: renamed from: i1 */
    public void m5456i1(T t) {
        this.f4115a = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19522F6, viewGroup, false);
        m5455a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5455a(this);
    }

    public LiveVirtualCallListBottomViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualCallListBottomViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
