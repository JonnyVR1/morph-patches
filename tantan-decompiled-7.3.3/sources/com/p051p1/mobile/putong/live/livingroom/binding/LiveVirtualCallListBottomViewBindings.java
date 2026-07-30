package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.LiveVirtualCallListBottomView;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVirtualCallListBottomViewBindings<T extends k3m> extends FrameLayout implements iam<T> {

    /* JADX INFO: renamed from: a */
    public T f48921a;

    /* JADX INFO: renamed from: b */
    public LiveVirtualCallListBottomView f48922b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f48923c;

    /* JADX INFO: renamed from: d */
    public ImageView f48924d;

    /* JADX INFO: renamed from: e */
    public TextView f48925e;

    /* JADX INFO: renamed from: f */
    public TextView f48926f;

    public LiveVirtualCallListBottomViewBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    /* JADX INFO: renamed from: a */
    public void m73214a(ViewGroup viewGroup) {
        this.f48922b = (LiveVirtualCallListBottomView) viewGroup;
        LinearLayout linearLayout = (LinearLayout) viewGroup.getChildAt(0);
        this.f48923c = linearLayout;
        String str = linearLayout == null ? "_bottom_bg" : null;
        ImageView imageView = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f48924d = imageView;
        if (imageView == null) {
            str = "_icon";
        }
        TextView textView = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f48925e = textView;
        if (textView == null) {
            str = "_text";
        }
        TextView textView2 = (TextView) viewGroup.getChildAt(1);
        this.f48926f = textView2;
        if (textView2 == null) {
            str = "_red_dot";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public LiveVirtualCallListBottomView getRoot() {
        return this.f48922b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48921a = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198758F6, viewGroup, false);
        m73214a((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73214a(this);
    }

    public LiveVirtualCallListBottomViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVirtualCallListBottomViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
