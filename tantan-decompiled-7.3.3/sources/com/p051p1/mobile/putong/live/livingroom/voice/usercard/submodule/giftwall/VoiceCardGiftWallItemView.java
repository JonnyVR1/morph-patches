package com.p051p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveUserCardGiftWallGift;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.mdc0;
import p153l.obc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceCardGiftWallItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VoiceCardGiftIconView f54666d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f54667e;

    /* JADX INFO: renamed from: f */
    public VText f54668f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f54669g;

    /* JADX INFO: renamed from: h */
    public Paint f54670h;

    public VoiceCardGiftWallItemView(Context context) {
        super(context);
        this.f54670h = new Paint();
    }

    /* JADX INFO: renamed from: h0 */
    public void m79892h0(BLiveUserCardGiftWallGift bLiveUserCardGiftWallGift, Act act) {
        if (bLiveUserCardGiftWallGift == null || TextUtils.isEmpty(bLiveUserCardGiftWallGift.f45317id)) {
            this.f54666d.setActualImageResource(obc0.f145976Aa);
            this.f54668f.setText("");
            this.f54669g.setController(null);
            this.f54667e.setController(null);
            this.f54666d.setClear(false);
            return;
        }
        izs.m142868s("context_single_room", this.f54666d, bLiveUserCardGiftWallGift.icon);
        int i = bLiveUserCardGiftWallGift.count;
        VText vText = this.f54668f;
        if (i < 999) {
            vText.setText("×" + bLiveUserCardGiftWallGift.count);
        } else {
            vText.setText("×999");
        }
        if (TextUtils.isEmpty(bLiveUserCardGiftWallGift.iconTopLabel)) {
            this.f54669g.setController(null);
            this.f54666d.setClear(false);
        } else {
            this.f54666d.setClear(true);
            izs.m142868s("context_single_room", this.f54669g, bLiveUserCardGiftWallGift.iconTopLabel);
        }
        bnl0.m105507D0(Math.max(((int) Math.ceil(this.f54670h.measureText(this.f54668f.getText().toString()))) + qa00.m175859d(10.0f), qa00.m175859d(27.0f)), this.f54667e);
        izs.m142874y(this.f54667e, bLiveUserCardGiftWallGift.bgImage);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f54666d = (VoiceCardGiftIconView) findViewById(mdc0.f136150d2);
        this.f54667e = (VDraweeView) findViewById(mdc0.f136120a2);
        this.f54668f = (VText) findViewById(mdc0.f136110Z1);
        this.f54669g = (VDraweeView) findViewById(mdc0.f136275q2);
        this.f54670h.setTextSize(qa00.m175859d(9.0f));
        this.f54666d.m79891u(2, qa00.m175859d(11.0f));
    }

    public VoiceCardGiftWallItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54670h = new Paint();
    }

    public VoiceCardGiftWallItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54670h = new Paint();
    }
}
