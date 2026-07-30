package com.p046p1.mobile.putong.live.livingroom.other.floatwindow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VButton;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class CloseNoticeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f51166a;

    /* JADX INFO: renamed from: b */
    public VText f51167b;

    /* JADX INFO: renamed from: c */
    public VButton f51168c;

    /* JADX INFO: renamed from: d */
    public VButton f51169d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.floatwindow.CloseNoticeView$a */
    public static class C12883a {
        /* JADX INFO: renamed from: b */
        public static void m75442b(CloseNoticeView closeNoticeView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            closeNoticeView.f51166a = (VText) viewGroup.getChildAt(1);
            closeNoticeView.f51167b = (VText) viewGroup.getChildAt(2);
            closeNoticeView.f51168c = (VButton) viewGroup.getChildAt(3);
            closeNoticeView.f51169d = (VButton) viewGroup.getChildAt(4);
        }
    }

    public CloseNoticeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m75440e(View view) {
        C12883a.m75442b(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75440e(this);
    }

    public CloseNoticeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CloseNoticeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
