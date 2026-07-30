package com.p000p1.mobile.putong.core.p001ui.messages.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.List;
import l.c3c0;
import l.knb0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MenuCustomView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Context f195a;

    /* JADX INFO: renamed from: b */
    public PopupWindow f196b;

    public MenuCustomView(Context context, boolean z) {
        super(context, null);
        m296c(context, z);
    }

    /* JADX INFO: renamed from: b */
    public final int m295b(int i) {
        return (int) (getResources().getDisplayMetrics().density * i);
    }

    /* JADX INFO: renamed from: c */
    public final void m296c(Context context, boolean z) {
        this.f195a = context;
        setOrientation(1);
        if (z) {
            setBackgroundResource(c3c0.s1);
            setPadding(0, xdl0.w(10.0f), 0, xdl0.w(20.0f));
        } else {
            setBackgroundResource(c3c0.r1);
            setPadding(0, xdl0.w(20.0f), 0, xdl0.w(10.0f));
        }
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m297d(knb0 knb0Var, View view) {
        PopupWindow popupWindow = this.f196b;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        ((Runnable) knb0Var.b).run();
    }

    public void setData(List<knb0<String, Runnable, Integer, Void>> list) {
        for (final knb0<String, Runnable, Integer, Void> knb0Var : list) {
            LinearLayout linearLayout = new LinearLayout(this.f195a);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, m295b(40)));
            linearLayout.setPadding(m295b(24), 0, m295b(36), 0);
            linearLayout.setOrientation(0);
            ImageView imageView = new ImageView(this.f195a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m295b(22), m295b(22));
            Object obj = knb0Var.c;
            if (obj != null) {
                imageView.setImageResource(((Integer) obj).intValue());
            }
            imageView.setLayoutParams(layoutParams);
            TextView textView = new TextView(this.f195a);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = m295b(8);
            textView.setLayoutParams(layoutParams2);
            textView.setText((CharSequence) knb0Var.a);
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setTextSize(14.0f);
            textView.setTextColor(Color.parseColor("#e6000000"));
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.khy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14334a.m297d(knb0Var, view);
                }
            });
            linearLayout.setGravity(16);
            linearLayout.addView(imageView);
            linearLayout.addView(textView);
            addView(linearLayout);
        }
    }

    public void setPopupWindow(PopupWindow popupWindow) {
        this.f196b = popupWindow;
    }
}
