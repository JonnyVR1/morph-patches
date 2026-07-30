package com.p046p1.mobile.putong.live.livingroom.voice.intl.giftRecord;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveBossCallDetail;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p149l.g5c0;
import p149l.h1c0;
import p149l.hxs;
import p149l.kvc0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceGiftRecordUserView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f53157a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f53158b;

    /* JADX INFO: renamed from: c */
    public View f53159c;

    public VoiceGiftRecordUserView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m78161a(BLiveBossCallDetail bLiveBossCallDetail, boolean z) {
        int i = bLiveBossCallDetail.position;
        TextView textView = this.f53157a;
        if (i == 0) {
            textView.setText(R$string.f47568uf);
        } else {
            textView.setText("NO." + (bLiveBossCallDetail.position + 1));
        }
        hxs.m133402o("context_single_room", this.f53158b, bLiveBossCallDetail.userAvatar);
        this.f53159c.setSelected(z);
        this.f53157a.setSelected(z);
        TextView textView2 = this.f53157a;
        if (z) {
            textView2.setTextColor(-1);
        } else {
            textView2.setTextColor(kvc0.m147352a(h1c0.f105386m1));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53157a = (TextView) findViewById(g5c0.f100917e4);
        this.f53158b = (VDraweeView) findViewById(g5c0.f101093x2);
        this.f53159c = findViewById(g5c0.f100671D5);
    }

    public VoiceGiftRecordUserView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftRecordUserView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VoiceGiftRecordUserView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
