package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.User;
import p151v.VFrame;
import p153l.bnl0;
import p153l.k9c0;
import p153l.ksg;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class FeedTimeViewInList extends VFrame {

    /* JADX INFO: renamed from: a */
    public TextView f43402a;

    public FeedTimeViewInList(Context context) {
        super(context);
        m66440p(context);
    }

    /* JADX INFO: renamed from: p */
    private void m66440p(Context context) {
        TextView textView = new TextView(context);
        this.f43402a = textView;
        textView.setTextSize(20.0f);
        this.f43402a.setTextColor(getResources().getColor(k9c0.f124508g0));
        setBackgroundColor(-1);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(this.f43402a);
    }

    /* JADX INFO: renamed from: s */
    public void m66441s(String str, String str2, int i, String str3) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (User.isWisdomStar(str3)) {
            layoutParams.leftMargin = qa00.m175859d(18.0f);
        } else {
            layoutParams.leftMargin = qa00.m175859d(12.0f);
        }
        layoutParams.bottomMargin = qa00.m175859d(16.0f);
        this.f43402a.setLayoutParams(layoutParams);
        this.f43402a.setText(str2);
        this.f43402a.setVisibility(0);
        if (i != 0) {
            bnl0.m105540X(this.f43402a, 0);
            return;
        }
        if (ksg.m151227r0(str3)) {
            bnl0.m105540X(this.f43402a, qa00.m175859d(6.0f));
            return;
        }
        boolean zEquals = TextUtils.equals("from_profile_album", str);
        TextView textView = this.f43402a;
        if (zEquals) {
            bnl0.m105540X(textView, qa00.m175859d(22.0f));
        } else {
            bnl0.m105540X(textView, qa00.m175859d(28.0f));
        }
    }

    public FeedTimeViewInList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m66440p(context);
    }

    public FeedTimeViewInList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66440p(context);
    }
}
