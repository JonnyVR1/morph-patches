package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.User;
import l.t100;
import l.xdl0;
import p007l.e1c0;
import p007l.vqg;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedTimeViewInList extends VFrame {

    /* JADX INFO: renamed from: a */
    public TextView f4015a;

    public FeedTimeViewInList(Context context) {
        super(context);
        m6358p(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    private void m6358p(Context context) {
        TextView textView = new TextView(context);
        this.f4015a = textView;
        textView.setTextSize(20.0f);
        this.f4015a.setTextColor(getResources().getColor(e1c0.f7141g0));
        setBackgroundColor(-1);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(this.f4015a);
    }

    /* JADX INFO: renamed from: s */
    public void m6359s(String str, String str2, int i, String str3) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (User.isWisdomStar(str3)) {
            layoutParams.leftMargin = t100.d(18.0f);
        } else {
            layoutParams.leftMargin = t100.d(12.0f);
        }
        layoutParams.bottomMargin = t100.d(16.0f);
        this.f4015a.setLayoutParams(layoutParams);
        this.f4015a.setText(str2);
        this.f4015a.setVisibility(0);
        if (i != 0) {
            xdl0.X(this.f4015a, 0);
            return;
        }
        if (vqg.m15538r0(str3)) {
            xdl0.X(this.f4015a, t100.d(6.0f));
            return;
        }
        boolean zEquals = TextUtils.equals("from_profile_album", str);
        TextView textView = this.f4015a;
        if (zEquals) {
            xdl0.X(textView, t100.d(22.0f));
        } else {
            xdl0.X(textView, t100.d(28.0f));
        }
    }

    public FeedTimeViewInList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6358p(context);
    }

    public FeedTimeViewInList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6358p(context);
    }
}
