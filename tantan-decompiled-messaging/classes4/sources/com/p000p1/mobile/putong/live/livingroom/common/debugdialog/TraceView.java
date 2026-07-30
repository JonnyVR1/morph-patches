package com.p000p1.mobile.putong.live.livingroom.common.debugdialog;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import l.e5j0;
import l.o3g0;
import l.w4j0;
import l.xdl0;
import p002l.g5c0;
import p002l.h1c0;
import p002l.t6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class TraceView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Context f5019a;

    public TraceView(Context context) {
        super(context);
        m6322c(context);
    }

    /* JADX INFO: renamed from: a */
    public void m6320a(w4j0 w4j0Var) {
        boolean z;
        for (int i = 0; i < w4j0Var.c().size(); i++) {
            boolean z2 = true;
            if (i == 0) {
                z = false;
            } else if (i == w4j0Var.c().size() - 1) {
                z = true;
                z2 = false;
            } else {
                z2 = false;
                z = false;
            }
            m6321b((o3g0) w4j0Var.c().get(i), z2, z);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6321b(o3g0 o3g0Var, boolean z, boolean z2) {
        View viewInflate = LayoutInflater.from(this.f5019a).inflate(t6c0.f19686T2, (ViewGroup) null, false);
        viewInflate.findViewById(g5c0.f11266z7);
        TextView textView = (TextView) viewInflate.findViewById(g5c0.f11044c1);
        TextView textView2 = (TextView) viewInflate.findViewById(g5c0.f10894L6);
        TextView textView3 = (TextView) viewInflate.findViewById(g5c0.f10996X0);
        TextView textView4 = (TextView) viewInflate.findViewById(g5c0.f11214u0);
        TextView textView5 = (TextView) viewInflate.findViewById(g5c0.f11017Z3);
        TextView textView6 = (TextView) viewInflate.findViewById(g5c0.f11199s3);
        TextView textView7 = (TextView) viewInflate.findViewById(g5c0.f11029a6);
        View viewFindViewById = viewInflate.findViewById(g5c0.f10985V7);
        if (z) {
            textView2.setText("总耗时：" + o3g0Var.g() + "ms");
        } else {
            textView2.setText("耗时：" + o3g0Var.g() + "ms");
        }
        textView3.setText("当前时间：" + o3g0Var.f());
        textView4.setText("CalssName：" + o3g0Var.a());
        textView5.setText("MethodName：" + o3g0Var.d());
        textView6.setText("LineNumber：" + o3g0Var.c());
        textView.setText("描述：" + o3g0Var.b());
        if (TextUtils.isEmpty(o3g0Var.e())) {
            xdl0.M(textView7, false);
        } else {
            xdl0.M(textView7, true);
            textView7.setText("StackInfo：" + o3g0Var.e());
        }
        if (z2) {
            viewFindViewById.setVisibility(8);
        } else {
            viewFindViewById.setVisibility(0);
        }
        long jG = o3g0Var.g();
        long jN = e5j0.INSTANCE.n();
        Context context = this.f5019a;
        if (jG > jN) {
            textView.setTextColor(context.getResources().getColor(h1c0.f11818q1));
            textView2.setTextColor(this.f5019a.getResources().getColor(h1c0.f11818q1));
        } else {
            textView.setTextColor(context.getResources().getColor(h1c0.f11795j));
            textView2.setTextColor(this.f5019a.getResources().getColor(h1c0.f11795j));
        }
        addView(viewInflate);
    }

    /* JADX INFO: renamed from: c */
    public final void m6322c(Context context) {
        this.f5019a = context;
        setOrientation(1);
    }

    public TraceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m6322c(context);
    }

    public TraceView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6322c(context);
    }
}
