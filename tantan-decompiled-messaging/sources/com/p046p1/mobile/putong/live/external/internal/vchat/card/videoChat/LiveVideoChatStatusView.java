package com.p046p1.mobile.putong.live.external.internal.vchat.card.videoChat;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChat;
import p149l.g1c0;
import p149l.h3c0;
import p149l.kvc0;
import p149l.slk0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVideoChatStatusView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f45082a;

    /* JADX INFO: renamed from: b */
    public TextView f45083b;

    public LiveVideoChatStatusView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setGravity(17);
        this.f45082a = new ImageView(getContext());
        int i = t100.f167264m;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = t100.f167258g;
        layoutParams.rightMargin = t100.f167254c;
        addView(this.f45082a, layoutParams);
        TextView textView = new TextView(getContext());
        this.f45083b = textView;
        textView.setTextColor(kvc0.m147352a(g1c0.f100145I));
        this.f45083b.setTextSize(12.0f);
        int i2 = xdl0.f192404f;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams2.gravity = 17;
        layoutParams2.rightMargin = t100.f167259h;
        addView(this.f45083b, layoutParams2);
    }

    public void setStatus(String str) {
        BLiveVideoChat bLiveVideoChatNew_ = BLiveVideoChat.new_();
        bLiveVideoChatNew_.status = str;
        if (slk0.m184830f(bLiveVideoChatNew_)) {
            this.f45082a.setImageResource(h3c0.f105668f1);
            this.f45083b.setText("空闲");
        } else if (slk0.m184826b(bLiveVideoChatNew_) || slk0.m184825a(bLiveVideoChatNew_)) {
            this.f45082a.setImageResource(h3c0.f105662d1);
            this.f45083b.setText("正在通话");
        } else {
            this.f45082a.setImageResource(h3c0.f105665e1);
            this.f45083b.setText("离线");
        }
    }

    public LiveVideoChatStatusView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVideoChatStatusView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
