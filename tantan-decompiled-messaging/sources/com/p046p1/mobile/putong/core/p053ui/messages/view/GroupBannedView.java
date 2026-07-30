package com.p046p1.mobile.putong.core.p053ui.messages.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class GroupBannedView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f32324a;

    /* JADX INFO: renamed from: b */
    public TextView f32325b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.GroupBannedView$a */
    public class ViewOnClickListenerC8587a implements View.OnClickListener {
        public ViewOnClickListenerC8587a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.GroupBannedView$b */
    public static class C8588b {
        /* JADX INFO: renamed from: b */
        public static void m49799b(GroupBannedView groupBannedView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            groupBannedView.f32324a = (VImage) viewGroup.getChildAt(0);
            groupBannedView.f32325b = (TextView) viewGroup.getChildAt(1);
        }
    }

    public GroupBannedView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m49797c(View view) {
        C8588b.m49799b(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49797c(this);
        setOnClickListener(new ViewOnClickListenerC8587a());
    }

    public void setBannedText(String str) {
        this.f32325b.setText(str);
    }

    public GroupBannedView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GroupBannedView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
