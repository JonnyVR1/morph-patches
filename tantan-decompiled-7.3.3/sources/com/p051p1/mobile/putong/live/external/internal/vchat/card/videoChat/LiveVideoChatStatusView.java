package com.p051p1.mobile.putong.live.external.internal.vchat.card.videoChat;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChat;
import p153l.bnl0;
import p153l.m9c0;
import p153l.n3d0;
import p153l.nbc0;
import p153l.qa00;
import p153l.yuk0;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVideoChatStatusView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f45930a;

    /* JADX INFO: renamed from: b */
    public TextView f45931b;

    public LiveVideoChatStatusView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setGravity(17);
        this.f45930a = new ImageView(getContext());
        int i = qa00.f156326m;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = qa00.f156320g;
        layoutParams.rightMargin = qa00.f156316c;
        addView(this.f45930a, layoutParams);
        TextView textView = new TextView(getContext());
        this.f45931b = textView;
        textView.setTextColor(n3d0.m161277a(m9c0.f135375I));
        this.f45931b.setTextSize(12.0f);
        int i2 = bnl0.f77545f;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams2.gravity = 17;
        layoutParams2.rightMargin = qa00.f156321h;
        addView(this.f45931b, layoutParams2);
    }

    public void setStatus(String str) {
        BLiveVideoChat bLiveVideoChatNew_ = BLiveVideoChat.new_();
        bLiveVideoChatNew_.status = str;
        if (yuk0.m217440f(bLiveVideoChatNew_)) {
            this.f45930a.setImageResource(nbc0.f141159f1);
            this.f45931b.setText("空闲");
        } else if (yuk0.m217436b(bLiveVideoChatNew_) || yuk0.m217435a(bLiveVideoChatNew_)) {
            this.f45930a.setImageResource(nbc0.f141153d1);
            this.f45931b.setText("正在通话");
        } else {
            this.f45930a.setImageResource(nbc0.f141156e1);
            this.f45931b.setText("离线");
        }
    }

    public LiveVideoChatStatusView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVideoChatStatusView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
