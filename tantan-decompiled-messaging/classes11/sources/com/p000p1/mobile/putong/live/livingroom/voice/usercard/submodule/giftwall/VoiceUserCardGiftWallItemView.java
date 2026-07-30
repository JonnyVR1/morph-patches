package com.p000p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import l.e30;
import l.h1c0;
import l.hxs;
import l.kvc0;
import l.oxo0;
import l.t100;
import l.xdl0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceUserCardGiftWallItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f7440d;

    /* JADX INFO: renamed from: e */
    public View f7441e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f7442f;

    /* JADX INFO: renamed from: g */
    public VText f7443g;

    public VoiceUserCardGiftWallItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8938i0(View view) {
        oxo0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: j0 */
    public void m8939j0(final BLiveVoiceGiftItem bLiveVoiceGiftItem, final e30<BLiveVoiceGiftItem> e30Var) {
        if (bLiveVoiceGiftItem == null) {
            return;
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.nxo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveVoiceGiftItem);
            }
        });
        xdl0.M(this.f7442f, !bLiveVoiceGiftItem.id.equals("0001"));
        xdl0.M(this.f7441e, !bLiveVoiceGiftItem.id.equals("0001"));
        boolean zEquals = bLiveVoiceGiftItem.id.equals("0001");
        VText vText = this.f7443g;
        if (zEquals) {
            vText.setText(bLiveVoiceGiftItem.name);
            this.f7443g.setTextColor(kvc0.a(h1c0.h1));
            hxs.s("context_livingAct", this.f7440d, "https://auto.tancdn.com/v1/images/eyJpZCI6IldLR1I3U0ozRlBURkVXQlRINDVHWk9PVlRJS0pDTzE0IiwidyI6MTQ0LCJoIjoxNDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDU1NTYzMzk5NTYzMTgzNjE2fQ.png");
            return;
        }
        vText.setText(bLiveVoiceGiftItem.name + "x" + bLiveVoiceGiftItem.mvpAmount);
        this.f7443g.setTextColor(kvc0.a(h1c0.m1));
        VDraweeView vDraweeView = this.f7440d;
        String str = bLiveVoiceGiftItem.icon;
        int i = t100.D;
        hxs.u("context_livingAct", vDraweeView, str, i, i);
        VDraweeView vDraweeView2 = this.f7442f;
        String str2 = bLiveVoiceGiftItem.mvpAvatar;
        int i2 = t100.p;
        hxs.u("context_livingAct", vDraweeView2, str2, i2, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8938i0(this);
    }

    public VoiceUserCardGiftWallItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceUserCardGiftWallItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
