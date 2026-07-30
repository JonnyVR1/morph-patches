package com.p000p1.mobile.putong.core.p001ui.messages.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GroupBannedView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f146a;

    /* JADX INFO: renamed from: b */
    public TextView f147b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.GroupBannedView$a */
    public class ViewOnClickListenerC0012a implements View.OnClickListener {
        public ViewOnClickListenerC0012a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.GroupBannedView$b */
    public static class C0013b {
        /* JADX INFO: renamed from: b */
        public static void m217b(GroupBannedView groupBannedView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            groupBannedView.f146a = viewGroup.getChildAt(0);
            groupBannedView.f147b = (TextView) viewGroup.getChildAt(1);
        }
    }

    public GroupBannedView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m215c(View view) {
        C0013b.m217b(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m215c(this);
        setOnClickListener(new ViewOnClickListenerC0012a());
    }

    public void setBannedText(String str) {
        this.f147b.setText(str);
    }

    public GroupBannedView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GroupBannedView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
