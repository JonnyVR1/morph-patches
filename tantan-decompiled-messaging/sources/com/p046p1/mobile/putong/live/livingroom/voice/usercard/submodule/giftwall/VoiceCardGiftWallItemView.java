package com.p046p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveUserCardGiftWallGift;
import p147v.VDraweeView;
import p147v.VText;
import p149l.g5c0;
import p149l.hxs;
import p149l.i3c0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceCardGiftWallItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceCardGiftIconView f53818d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f53819e;

    /* JADX INFO: renamed from: f */
    public VText f53820f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f53821g;

    /* JADX INFO: renamed from: h */
    public Paint f53822h;

    public VoiceCardGiftWallItemView(Context context) {
        super(context);
        this.f53822h = new Paint();
    }

    /* JADX INFO: renamed from: h0 */
    public void m78709h0(BLiveUserCardGiftWallGift bLiveUserCardGiftWallGift, Act act) {
        if (bLiveUserCardGiftWallGift == null || TextUtils.isEmpty(bLiveUserCardGiftWallGift.f44469id)) {
            this.f53818d.setActualImageResource(i3c0.f110648Aa);
            this.f53820f.setText("");
            this.f53821g.setController(null);
            this.f53819e.setController(null);
            this.f53818d.setClear(false);
            return;
        }
        hxs.m133406s("context_single_room", this.f53818d, bLiveUserCardGiftWallGift.icon);
        int i = bLiveUserCardGiftWallGift.count;
        VText vText = this.f53820f;
        if (i < 999) {
            vText.setText("×" + bLiveUserCardGiftWallGift.count);
        } else {
            vText.setText("×999");
        }
        if (TextUtils.isEmpty(bLiveUserCardGiftWallGift.iconTopLabel)) {
            this.f53821g.setController(null);
            this.f53818d.setClear(false);
        } else {
            this.f53818d.setClear(true);
            hxs.m133406s("context_single_room", this.f53821g, bLiveUserCardGiftWallGift.iconTopLabel);
        }
        xdl0.m208327D0(Math.max(((int) Math.ceil(this.f53822h.measureText(this.f53820f.getText().toString()))) + t100.m186890d(10.0f), t100.m186890d(27.0f)), this.f53819e);
        hxs.m133412y(this.f53819e, bLiveUserCardGiftWallGift.bgImage);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53818d = (VoiceCardGiftIconView) findViewById(g5c0.f100905d2);
        this.f53819e = (VDraweeView) findViewById(g5c0.f100875a2);
        this.f53820f = (VText) findViewById(g5c0.f100865Z1);
        this.f53821g = (VDraweeView) findViewById(g5c0.f101030q2);
        this.f53822h.setTextSize(t100.m186890d(9.0f));
        this.f53818d.m78708u(2, t100.m186890d(11.0f));
    }

    public VoiceCardGiftWallItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53822h = new Paint();
    }

    public VoiceCardGiftWallItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53822h = new Paint();
    }
}
