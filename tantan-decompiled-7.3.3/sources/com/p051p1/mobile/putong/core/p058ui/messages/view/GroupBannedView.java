package com.p051p1.mobile.putong.core.p058ui.messages.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class GroupBannedView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f33172a;

    /* JADX INFO: renamed from: b */
    public TextView f33173b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.GroupBannedView$a */
    public class ViewOnClickListenerC8750a implements View.OnClickListener {
        public ViewOnClickListenerC8750a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.GroupBannedView$b */
    public static class C8751b {
        /* JADX INFO: renamed from: b */
        public static void m50982b(GroupBannedView groupBannedView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            groupBannedView.f33172a = (VImage) viewGroup.getChildAt(0);
            groupBannedView.f33173b = (TextView) viewGroup.getChildAt(1);
        }
    }

    public GroupBannedView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m50980c(View view) {
        C8751b.m50982b(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50980c(this);
        setOnClickListener(new ViewOnClickListenerC8750a());
    }

    public void setBannedText(String str) {
        this.f33173b.setText(str);
    }

    public GroupBannedView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GroupBannedView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
