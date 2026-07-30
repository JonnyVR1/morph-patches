package com.p051p1.mobile.putong.live.livingroom.common.debugdialog;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p153l.aej0;
import p153l.bnl0;
import p153l.iej0;
import p153l.mdc0;
import p153l.n9c0;
import p153l.vbg0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class TraceView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Context f49825a;

    public TraceView(Context context) {
        super(context);
        m73994c(context);
    }

    /* JADX INFO: renamed from: a */
    public void m73992a(aej0 aej0Var) {
        boolean z;
        for (int i = 0; i < aej0Var.m97251c().size(); i++) {
            boolean z2 = true;
            if (i == 0) {
                z = false;
            } else if (i == aej0Var.m97251c().size() - 1) {
                z = true;
                z2 = false;
            } else {
                z2 = false;
                z = false;
            }
            m73993b(aej0Var.m97251c().get(i), z2, z);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m73993b(vbg0 vbg0Var, boolean z, boolean z2) {
        View viewInflate = LayoutInflater.from(this.f49825a).inflate(yec0.f198922T2, (ViewGroup) null, false);
        viewInflate.findViewById(mdc0.f136361z7);
        TextView textView = (TextView) viewInflate.findViewById(mdc0.f136139c1);
        TextView textView2 = (TextView) viewInflate.findViewById(mdc0.f135989L6);
        TextView textView3 = (TextView) viewInflate.findViewById(mdc0.f136091X0);
        TextView textView4 = (TextView) viewInflate.findViewById(mdc0.f136309u0);
        TextView textView5 = (TextView) viewInflate.findViewById(mdc0.f136112Z3);
        TextView textView6 = (TextView) viewInflate.findViewById(mdc0.f136294s3);
        TextView textView7 = (TextView) viewInflate.findViewById(mdc0.f136124a6);
        View viewFindViewById = viewInflate.findViewById(mdc0.f136080V7);
        if (z) {
            textView2.setText("总耗时：" + vbg0Var.getTotalTime() + "ms");
        } else {
            textView2.setText("耗时：" + vbg0Var.getTotalTime() + "ms");
        }
        textView3.setText("当前时间：" + vbg0Var.getStartTime());
        textView4.setText("CalssName：" + vbg0Var.getClassName());
        textView5.setText("MethodName：" + vbg0Var.getMethodName());
        textView6.setText("LineNumber：" + vbg0Var.getLineNumber());
        textView.setText("描述：" + vbg0Var.getDescribe());
        if (TextUtils.isEmpty(vbg0Var.getStackInfo())) {
            bnl0.m105524M(textView7, false);
        } else {
            bnl0.m105524M(textView7, true);
            textView7.setText("StackInfo：" + vbg0Var.getStackInfo());
        }
        if (z2) {
            viewFindViewById.setVisibility(8);
        } else {
            viewFindViewById.setVisibility(0);
        }
        long jM200706g = vbg0Var.getTotalTime();
        long jM139630n = iej0.INSTANCE.m139630n();
        Context context = this.f49825a;
        if (jM200706g > jM139630n) {
            textView.setTextColor(context.getResources().getColor(n9c0.f140859q1));
            textView2.setTextColor(this.f49825a.getResources().getColor(n9c0.f140859q1));
        } else {
            textView.setTextColor(context.getResources().getColor(n9c0.f140836j));
            textView2.setTextColor(this.f49825a.getResources().getColor(n9c0.f140836j));
        }
        addView(viewInflate);
    }

    /* JADX INFO: renamed from: c */
    public final void m73994c(Context context) {
        this.f49825a = context;
        setOrientation(1);
    }

    public TraceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m73994c(context);
    }

    public TraceView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m73994c(context);
    }
}
