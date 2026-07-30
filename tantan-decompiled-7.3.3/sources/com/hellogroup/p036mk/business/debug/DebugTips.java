package com.hellogroup.p036mk.business.debug;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p153l.a6k0;
import p153l.lpj0;

/* JADX INFO: loaded from: classes7.dex */
public class DebugTips extends TextView {
    public DebugTips(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18031e();
    }

    /* JADX INFO: renamed from: a */
    public static ViewGroup.LayoutParams m18027a(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int[] iArrM18030d = m18030d(i, i2);
        marginLayoutParams.leftMargin = iArrM18030d[0];
        marginLayoutParams.topMargin = iArrM18030d[1];
        return marginLayoutParams;
    }

    /* JADX INFO: renamed from: b */
    public static ViewGroup m18028b(Activity activity) {
        return (ViewGroup) activity.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: c */
    public static String m18029c(String str) {
        return "bid: " + str;
    }

    /* JADX INFO: renamed from: d */
    public static int[] m18030d(int i, int i2) {
        int iM155247c = lpj0.m155247c(10.0f);
        return new int[]{iM155247c, i2 - (iM155247c * 3)};
    }

    /* JADX INFO: renamed from: e */
    private void m18031e() {
        setBackgroundColor(Integer.MIN_VALUE);
        setTextColor(-1);
    }

    /* JADX INFO: renamed from: f */
    public static DebugTips m18032f(Context context, String str) {
        DebugTips debugTips = new DebugTips(context);
        debugTips.setText(m18029c(a6k0.m96329a(str)));
        return debugTips;
    }

    /* JADX INFO: renamed from: g */
    public static DebugTips m18033g(Context context, String str, int i, int i2) {
        DebugTips debugTipsM18032f = m18032f(context, str);
        debugTipsM18032f.setLayoutParams(m18027a(i, i2));
        return debugTipsM18032f;
    }

    public DebugTips(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DebugTips(Context context) {
        this(context, null);
    }
}
