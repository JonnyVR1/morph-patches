package com.p046p1.mobile.putong.core.p053ui.messages.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.List;
import p149l.c3c0;
import p149l.knb0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class MenuCustomView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Context f32373a;

    /* JADX INFO: renamed from: b */
    public PopupWindow f32374b;

    public MenuCustomView(Context context, boolean z) {
        super(context, null);
        m49874c(context, z);
    }

    /* JADX INFO: renamed from: b */
    public final int m49873b(int i) {
        return (int) (getResources().getDisplayMetrics().density * i);
    }

    /* JADX INFO: renamed from: c */
    public final void m49874c(Context context, boolean z) {
        this.f32373a = context;
        setOrientation(1);
        if (z) {
            setBackgroundResource(c3c0.f78856s1);
            setPadding(0, xdl0.m208407w(10.0f), 0, xdl0.m208407w(20.0f));
        } else {
            setBackgroundResource(c3c0.f78847r1);
            setPadding(0, xdl0.m208407w(20.0f), 0, xdl0.m208407w(10.0f));
        }
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m49875d(knb0 knb0Var, View view) {
        PopupWindow popupWindow = this.f32374b;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        ((Runnable) knb0Var.f123874b).run();
    }

    public void setData(List<knb0<String, Runnable, Integer, Void>> list) {
        for (final knb0<String, Runnable, Integer, Void> knb0Var : list) {
            LinearLayout linearLayout = new LinearLayout(this.f32373a);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, m49873b(40)));
            linearLayout.setPadding(m49873b(24), 0, m49873b(36), 0);
            linearLayout.setOrientation(0);
            ImageView imageView = new ImageView(this.f32373a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m49873b(22), m49873b(22));
            Integer num = knb0Var.f123875c;
            if (num != null) {
                imageView.setImageResource(num.intValue());
            }
            imageView.setLayoutParams(layoutParams);
            TextView textView = new TextView(this.f32373a);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = m49873b(8);
            textView.setLayoutParams(layoutParams2);
            textView.setText(knb0Var.f123873a);
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setTextSize(14.0f);
            textView.setTextColor(Color.parseColor("#e6000000"));
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.khy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f123239a.m49875d(knb0Var, view);
                }
            });
            linearLayout.setGravity(16);
            linearLayout.addView(imageView);
            linearLayout.addView(textView);
            addView(linearLayout);
        }
    }

    public void setPopupWindow(PopupWindow popupWindow) {
        this.f32374b = popupWindow;
    }
}
