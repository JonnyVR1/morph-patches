package com.p051p1.mobile.putong.live.livingroom.other.floatwindow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VButton;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class CloseNoticeView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f52014a;

    /* JADX INFO: renamed from: b */
    public VText f52015b;

    /* JADX INFO: renamed from: c */
    public VButton f52016c;

    /* JADX INFO: renamed from: d */
    public VButton f52017d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.other.floatwindow.CloseNoticeView$a */
    public static class C13046a {
        /* JADX INFO: renamed from: b */
        public static void m76625b(CloseNoticeView closeNoticeView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            closeNoticeView.f52014a = (VText) viewGroup.getChildAt(1);
            closeNoticeView.f52015b = (VText) viewGroup.getChildAt(2);
            closeNoticeView.f52016c = (VButton) viewGroup.getChildAt(3);
            closeNoticeView.f52017d = (VButton) viewGroup.getChildAt(4);
        }
    }

    public CloseNoticeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m76623e(View view) {
        C13046a.m76625b(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76623e(this);
    }

    public CloseNoticeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CloseNoticeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
