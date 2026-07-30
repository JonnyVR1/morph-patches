package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.User;
import p147v.VFrame;
import p149l.e1c0;
import p149l.t100;
import p149l.vqg;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedTimeViewInList extends VFrame {

    /* JADX INFO: renamed from: a */
    public TextView f42554a;

    public FeedTimeViewInList(Context context) {
        super(context);
        m65257p(context);
    }

    /* JADX INFO: renamed from: p */
    private void m65257p(Context context) {
        TextView textView = new TextView(context);
        this.f42554a = textView;
        textView.setTextSize(20.0f);
        this.f42554a.setTextColor(getResources().getColor(e1c0.f88785g0));
        setBackgroundColor(-1);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(this.f42554a);
    }

    /* JADX INFO: renamed from: s */
    public void m65258s(String str, String str2, int i, String str3) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (User.isWisdomStar(str3)) {
            layoutParams.leftMargin = t100.m186890d(18.0f);
        } else {
            layoutParams.leftMargin = t100.m186890d(12.0f);
        }
        layoutParams.bottomMargin = t100.m186890d(16.0f);
        this.f42554a.setLayoutParams(layoutParams);
        this.f42554a.setText(str2);
        this.f42554a.setVisibility(0);
        if (i != 0) {
            xdl0.m208360X(this.f42554a, 0);
            return;
        }
        if (vqg.m199568r0(str3)) {
            xdl0.m208360X(this.f42554a, t100.m186890d(6.0f));
            return;
        }
        boolean zEquals = TextUtils.equals("from_profile_album", str);
        TextView textView = this.f42554a;
        if (zEquals) {
            xdl0.m208360X(textView, t100.m186890d(22.0f));
        } else {
            xdl0.m208360X(textView, t100.m186890d(28.0f));
        }
    }

    public FeedTimeViewInList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65257p(context);
    }

    public FeedTimeViewInList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65257p(context);
    }
}
