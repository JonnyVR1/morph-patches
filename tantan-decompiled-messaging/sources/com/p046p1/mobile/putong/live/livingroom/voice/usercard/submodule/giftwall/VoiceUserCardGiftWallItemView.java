package com.p046p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import p147v.VDraweeView;
import p147v.VText;
import p149l.e30;
import p149l.h1c0;
import p149l.hxs;
import p149l.kvc0;
import p149l.oxo0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceUserCardGiftWallItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f53834d;

    /* JADX INFO: renamed from: e */
    public View f53835e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f53836f;

    /* JADX INFO: renamed from: g */
    public VText f53837g;

    public VoiceUserCardGiftWallItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m78722i0(View view) {
        oxo0.m166572a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: j0 */
    public void m78723j0(final BLiveVoiceGiftItem bLiveVoiceGiftItem, final e30<BLiveVoiceGiftItem> e30Var) {
        if (bLiveVoiceGiftItem == null) {
            return;
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.nxo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveVoiceGiftItem);
            }
        });
        xdl0.m208344M(this.f53836f, !bLiveVoiceGiftItem.f44498id.equals("0001"));
        xdl0.m208344M(this.f53835e, !bLiveVoiceGiftItem.f44498id.equals("0001"));
        boolean zEquals = bLiveVoiceGiftItem.f44498id.equals("0001");
        VText vText = this.f53837g;
        if (zEquals) {
            vText.setText(bLiveVoiceGiftItem.name);
            this.f53837g.setTextColor(kvc0.m147352a(h1c0.f105371h1));
            hxs.m133406s("context_livingAct", this.f53834d, "https://auto.tancdn.com/v1/images/eyJpZCI6IldLR1I3U0ozRlBURkVXQlRINDVHWk9PVlRJS0pDTzE0IiwidyI6MTQ0LCJoIjoxNDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDU1NTYzMzk5NTYzMTgzNjE2fQ.png");
            return;
        }
        vText.setText(bLiveVoiceGiftItem.name + BaseSei.f13930X + bLiveVoiceGiftItem.mvpAmount);
        this.f53837g.setTextColor(kvc0.m147352a(h1c0.f105386m1));
        VDraweeView vDraweeView = this.f53834d;
        String str = bLiveVoiceGiftItem.icon;
        int i = t100.f167229D;
        hxs.m133408u("context_livingAct", vDraweeView, str, i, i);
        VDraweeView vDraweeView2 = this.f53836f;
        String str2 = bLiveVoiceGiftItem.mvpAvatar;
        int i2 = t100.f167267p;
        hxs.m133408u("context_livingAct", vDraweeView2, str2, i2, i2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78722i0(this);
    }

    public VoiceUserCardGiftWallItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceUserCardGiftWallItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
