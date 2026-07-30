package com.p051p1.mobile.putong.core.p058ui.messages.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.List;
import p153l.bnl0;
import p153l.ibc0;
import p153l.ovb0;

/* JADX INFO: loaded from: classes4.dex */
public class MenuCustomView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Context f33221a;

    /* JADX INFO: renamed from: b */
    public PopupWindow f33222b;

    public MenuCustomView(Context context, boolean z) {
        super(context, null);
        m51057c(context, z);
    }

    /* JADX INFO: renamed from: b */
    public final int m51056b(int i) {
        return (int) (getResources().getDisplayMetrics().density * i);
    }

    /* JADX INFO: renamed from: c */
    public final void m51057c(Context context, boolean z) {
        this.f33221a = context;
        setOrientation(1);
        if (z) {
            setBackgroundResource(ibc0.f114131s1);
            setPadding(0, bnl0.m105587w(10.0f), 0, bnl0.m105587w(20.0f));
        } else {
            setBackgroundResource(ibc0.f114122r1);
            setPadding(0, bnl0.m105587w(20.0f), 0, bnl0.m105587w(10.0f));
        }
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m51058d(ovb0 ovb0Var, View view) {
        PopupWindow popupWindow = this.f33222b;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        ((Runnable) ovb0Var.f149249b).run();
    }

    public void setData(List<ovb0<String, Runnable, Integer, Void>> list) {
        for (final ovb0<String, Runnable, Integer, Void> ovb0Var : list) {
            LinearLayout linearLayout = new LinearLayout(this.f33221a);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, m51056b(40)));
            linearLayout.setPadding(m51056b(24), 0, m51056b(36), 0);
            linearLayout.setOrientation(0);
            ImageView imageView = new ImageView(this.f33221a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m51056b(22), m51056b(22));
            Integer num = ovb0Var.f149250c;
            if (num != null) {
                imageView.setImageResource(num.intValue());
            }
            imageView.setLayoutParams(layoutParams);
            TextView textView = new TextView(this.f33221a);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = m51056b(8);
            textView.setLayoutParams(layoutParams2);
            textView.setText(ovb0Var.f149248a);
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setTextSize(14.0f);
            textView.setTextColor(Color.parseColor("#e6000000"));
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.hqy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f111200a.m51058d(ovb0Var, view);
                }
            });
            linearLayout.setGravity(16);
            linearLayout.addView(imageView);
            linearLayout.addView(textView);
            addView(linearLayout);
        }
    }

    public void setPopupWindow(PopupWindow popupWindow) {
        this.f33222b = popupWindow;
    }
}
