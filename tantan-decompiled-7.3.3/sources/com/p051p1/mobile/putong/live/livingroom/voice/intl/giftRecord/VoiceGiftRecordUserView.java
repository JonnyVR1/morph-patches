package com.p051p1.mobile.putong.live.livingroom.voice.intl.giftRecord;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveBossCallDetail;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p153l.izs;
import p153l.mdc0;
import p153l.n3d0;
import p153l.n9c0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceGiftRecordUserView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f54005a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f54006b;

    /* JADX INFO: renamed from: c */
    public View f54007c;

    public VoiceGiftRecordUserView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m79344a(BLiveBossCallDetail bLiveBossCallDetail, boolean z) {
        int i = bLiveBossCallDetail.position;
        TextView textView = this.f54005a;
        if (i == 0) {
            textView.setText(R$string.f48416uf);
        } else {
            textView.setText("NO." + (bLiveBossCallDetail.position + 1));
        }
        izs.m142864o("context_single_room", this.f54006b, bLiveBossCallDetail.userAvatar);
        this.f54007c.setSelected(z);
        this.f54005a.setSelected(z);
        TextView textView2 = this.f54005a;
        if (z) {
            textView2.setTextColor(-1);
        } else {
            textView2.setTextColor(n3d0.m161277a(n9c0.f140847m1));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f54005a = (TextView) findViewById(mdc0.f136162e4);
        this.f54006b = (VDraweeView) findViewById(mdc0.f136338x2);
        this.f54007c = findViewById(mdc0.f135916D5);
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
