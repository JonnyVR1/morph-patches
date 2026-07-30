package com.p000p1.mobile.putong.live.livingroom.other.floatwindow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import v.VButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class CloseNoticeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f7208a;

    /* JADX INFO: renamed from: b */
    public VText f7209b;

    /* JADX INFO: renamed from: c */
    public VButton f7210c;

    /* JADX INFO: renamed from: d */
    public VButton f7211d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.floatwindow.CloseNoticeView$a */
    public static class C0472a {
        /* JADX INFO: renamed from: b */
        public static void m9075b(CloseNoticeView closeNoticeView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            closeNoticeView.f7208a = viewGroup.getChildAt(1);
            closeNoticeView.f7209b = viewGroup.getChildAt(2);
            closeNoticeView.f7210c = viewGroup.getChildAt(3);
            closeNoticeView.f7211d = viewGroup.getChildAt(4);
        }
    }

    public CloseNoticeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m9073e(View view) {
        C0472a.m9075b(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9073e(this);
    }

    public CloseNoticeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CloseNoticeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
