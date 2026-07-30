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
import l.i3c0;
import l.kvc0;
import l.t100;
import l.ubn0;
import l.xdl0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceGiftWallLocalItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f7435d;

    /* JADX INFO: renamed from: e */
    public View f7436e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f7437f;

    /* JADX INFO: renamed from: g */
    public VText f7438g;

    /* JADX INFO: renamed from: h */
    public VText f7439h;

    public VoiceGiftWallLocalItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8935i0(View view) {
        ubn0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: j0 */
    public void m8936j0(final BLiveVoiceGiftItem bLiveVoiceGiftItem, final e30<BLiveVoiceGiftItem> e30Var) {
        if (bLiveVoiceGiftItem == null) {
            return;
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.tbn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveVoiceGiftItem);
            }
        });
        xdl0.M(this.f7437f, !bLiveVoiceGiftItem.id.equals("0001"));
        xdl0.M(this.f7436e, !bLiveVoiceGiftItem.id.equals("0001"));
        boolean zEquals = bLiveVoiceGiftItem.id.equals("0001");
        VText vText = this.f7438g;
        if (zEquals) {
            vText.setText(bLiveVoiceGiftItem.name);
            this.f7438g.setTextColor(kvc0.a(h1c0.p1));
            hxs.x(this.f7435d, i3c0.S8);
            xdl0.M(this.f7439h, false);
            return;
        }
        vText.setText(bLiveVoiceGiftItem.name);
        xdl0.M(this.f7439h, true);
        this.f7439h.setText("x" + bLiveVoiceGiftItem.mvpAmount);
        this.f7439h.setTextColor(kvc0.a(h1c0.m1));
        hxs.u("context_livingAct", this.f7435d, bLiveVoiceGiftItem.icon, t100.d(61.0f), t100.d(61.0f));
        hxs.u("context_livingAct", this.f7437f, bLiveVoiceGiftItem.mvpAvatar, t100.d(37.0f), t100.d(37.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8935i0(this);
    }

    public VoiceGiftWallLocalItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallLocalItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
