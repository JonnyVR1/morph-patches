package com.p046p1.mobile.putong.live.livingroom.common.debugdialog;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p149l.e5j0;
import p149l.g5c0;
import p149l.h1c0;
import p149l.o3g0;
import p149l.t6c0;
import p149l.w4j0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class TraceView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Context f48977a;

    public TraceView(Context context) {
        super(context);
        m72811c(context);
    }

    /* JADX INFO: renamed from: a */
    public void m72809a(w4j0 w4j0Var) {
        boolean z;
        for (int i = 0; i < w4j0Var.m201530c().size(); i++) {
            boolean z2 = true;
            if (i == 0) {
                z = false;
            } else if (i == w4j0Var.m201530c().size() - 1) {
                z = true;
                z2 = false;
            } else {
                z2 = false;
                z = false;
            }
            m72810b(w4j0Var.m201530c().get(i), z2, z);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m72810b(o3g0 o3g0Var, boolean z, boolean z2) {
        View viewInflate = LayoutInflater.from(this.f48977a).inflate(t6c0.f168190T2, (ViewGroup) null, false);
        viewInflate.findViewById(g5c0.f101116z7);
        TextView textView = (TextView) viewInflate.findViewById(g5c0.f100894c1);
        TextView textView2 = (TextView) viewInflate.findViewById(g5c0.f100744L6);
        TextView textView3 = (TextView) viewInflate.findViewById(g5c0.f100846X0);
        TextView textView4 = (TextView) viewInflate.findViewById(g5c0.f101064u0);
        TextView textView5 = (TextView) viewInflate.findViewById(g5c0.f100867Z3);
        TextView textView6 = (TextView) viewInflate.findViewById(g5c0.f101049s3);
        TextView textView7 = (TextView) viewInflate.findViewById(g5c0.f100879a6);
        View viewFindViewById = viewInflate.findViewById(g5c0.f100835V7);
        if (z) {
            textView2.setText("总耗时：" + o3g0Var.getTotalTime() + "ms");
        } else {
            textView2.setText("耗时：" + o3g0Var.getTotalTime() + "ms");
        }
        textView3.setText("当前时间：" + o3g0Var.getStartTime());
        textView4.setText("CalssName：" + o3g0Var.getClassName());
        textView5.setText("MethodName：" + o3g0Var.getMethodName());
        textView6.setText("LineNumber：" + o3g0Var.getLineNumber());
        textView.setText("描述：" + o3g0Var.getDescribe());
        if (TextUtils.isEmpty(o3g0Var.getStackInfo())) {
            xdl0.m208344M(textView7, false);
        } else {
            xdl0.m208344M(textView7, true);
            textView7.setText("StackInfo：" + o3g0Var.getStackInfo());
        }
        if (z2) {
            viewFindViewById.setVisibility(8);
        } else {
            viewFindViewById.setVisibility(0);
        }
        long jM162425g = o3g0Var.getTotalTime();
        long jM114826n = e5j0.INSTANCE.m114826n();
        Context context = this.f48977a;
        if (jM162425g > jM114826n) {
            textView.setTextColor(context.getResources().getColor(h1c0.f105398q1));
            textView2.setTextColor(this.f48977a.getResources().getColor(h1c0.f105398q1));
        } else {
            textView.setTextColor(context.getResources().getColor(h1c0.f105375j));
            textView2.setTextColor(this.f48977a.getResources().getColor(h1c0.f105375j));
        }
        addView(viewInflate);
    }

    /* JADX INFO: renamed from: c */
    public final void m72811c(Context context) {
        this.f48977a = context;
        setOrientation(1);
    }

    public TraceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m72811c(context);
    }

    public TraceView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m72811c(context);
    }
}
