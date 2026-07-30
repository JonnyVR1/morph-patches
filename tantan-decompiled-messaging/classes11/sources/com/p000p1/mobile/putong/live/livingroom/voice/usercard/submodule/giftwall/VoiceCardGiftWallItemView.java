package com.p000p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveUserCardGiftWallGift;
import l.g5c0;
import l.hce;
import l.hxs;
import l.i3c0;
import l.t100;
import l.xdl0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceCardGiftWallItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceCardGiftIconView f7424d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f7425e;

    /* JADX INFO: renamed from: f */
    public VText f7426f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f7427g;

    /* JADX INFO: renamed from: h */
    public Paint f7428h;

    public VoiceCardGiftWallItemView(Context context) {
        super(context);
        this.f7428h = new Paint();
    }

    /* JADX INFO: renamed from: h0 */
    public void m8925h0(BLiveUserCardGiftWallGift bLiveUserCardGiftWallGift, Act act) {
        if (bLiveUserCardGiftWallGift == null || TextUtils.isEmpty(bLiveUserCardGiftWallGift.id)) {
            this.f7424d.setActualImageResource(i3c0.Aa);
            this.f7426f.setText("");
            this.f7427g.setController((hce) null);
            this.f7425e.setController((hce) null);
            this.f7424d.setClear(false);
            return;
        }
        hxs.s("context_single_room", this.f7424d, bLiveUserCardGiftWallGift.icon);
        int i = bLiveUserCardGiftWallGift.count;
        VText vText = this.f7426f;
        if (i < 999) {
            vText.setText("×" + bLiveUserCardGiftWallGift.count);
        } else {
            vText.setText("×999");
        }
        if (TextUtils.isEmpty(bLiveUserCardGiftWallGift.iconTopLabel)) {
            this.f7427g.setController((hce) null);
            this.f7424d.setClear(false);
        } else {
            this.f7424d.setClear(true);
            hxs.s("context_single_room", this.f7427g, bLiveUserCardGiftWallGift.iconTopLabel);
        }
        xdl0.D0(Math.max(((int) Math.ceil(this.f7428h.measureText(this.f7426f.getText().toString()))) + t100.d(10.0f), t100.d(27.0f)), new View[]{this.f7425e});
        hxs.y(this.f7425e, bLiveUserCardGiftWallGift.bgImage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f7424d = (VoiceCardGiftIconView) findViewById(g5c0.d2);
        this.f7425e = findViewById(g5c0.a2);
        this.f7426f = findViewById(g5c0.Z1);
        this.f7427g = findViewById(g5c0.q2);
        this.f7428h.setTextSize(t100.d(9.0f));
        this.f7424d.m8924u(2, t100.d(11.0f));
    }

    public VoiceCardGiftWallItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7428h = new Paint();
    }

    public VoiceCardGiftWallItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7428h = new Paint();
    }
}
