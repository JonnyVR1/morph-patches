package com.p046p1.mobile.putong.live.livingroom.voice.intl.giftRecord;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveBossGift;
import p147v.VDraweeView;
import p147v.VText;
import p149l.e30;
import p149l.g5c0;
import p149l.hxs;
import p149l.jbu;
import p149l.x8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class GiftRecordDetailItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f53151d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f53152e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f53153f;

    /* JADX INFO: renamed from: g */
    public VText f53154g;

    /* JADX INFO: renamed from: h */
    public VText f53155h;

    /* JADX INFO: renamed from: i */
    public VText f53156i;

    public GiftRecordDetailItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    public void m78160j0(final BLiveBossGift bLiveBossGift, final e30<String> e30Var) {
        hxs.m133402o("context_single_room", this.f53153f, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkFPMjdGTTdFWFBYMjJUS1g0UEhMMk1RM0lEWFBDVzEyIiwidyI6MzYsImgiOjM2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzYxODQxMjU1MDQ2MjI0ODI3MH0.webp");
        hxs.m133402o("context_single_room", this.f53151d, bLiveBossGift.giftUrl);
        hxs.m133402o("context_single_room", this.f53152e, bLiveBossGift.userAvatar);
        this.f53154g.setText(bLiveBossGift.giftName + " x" + bLiveBossGift.giftNum);
        this.f53155h.setText(jbu.m140811S(bLiveBossGift.createdTime * 1000));
        this.f53156i.setText(x8u.m207438h((long) bLiveBossGift.popularityValue));
        xdl0.m208329E0(this.f53152e, new View.OnClickListener() { // from class: l.kuj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveBossGift.userId);
            }
        });
        xdl0.m208329E0(this.f53151d, new View.OnClickListener() { // from class: l.luj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveBossGift.userId);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53151d = (VDraweeView) findViewById(g5c0.f100641A2);
        this.f53152e = (VDraweeView) findViewById(g5c0.f101054t);
        this.f53153f = (VDraweeView) findViewById(g5c0.f100694G1);
        this.f53154g = (VText) findViewById(g5c0.f100885b2);
        this.f53155h = (VText) findViewById(g5c0.f101021p2);
        this.f53156i = (VText) findViewById(g5c0.f100688F4);
    }

    public GiftRecordDetailItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftRecordDetailItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
