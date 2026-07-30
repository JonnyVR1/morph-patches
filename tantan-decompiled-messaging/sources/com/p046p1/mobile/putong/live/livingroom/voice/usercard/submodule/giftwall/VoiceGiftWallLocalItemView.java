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
import p149l.i3c0;
import p149l.kvc0;
import p149l.t100;
import p149l.ubn0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceGiftWallLocalItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f53829d;

    /* JADX INFO: renamed from: e */
    public View f53830e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f53831f;

    /* JADX INFO: renamed from: g */
    public VText f53832g;

    /* JADX INFO: renamed from: h */
    public VText f53833h;

    public VoiceGiftWallLocalItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m78719i0(View view) {
        ubn0.m192879a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: j0 */
    public void m78720j0(final BLiveVoiceGiftItem bLiveVoiceGiftItem, final e30<BLiveVoiceGiftItem> e30Var) {
        if (bLiveVoiceGiftItem == null) {
            return;
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.tbn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveVoiceGiftItem);
            }
        });
        xdl0.m208344M(this.f53831f, !bLiveVoiceGiftItem.f44498id.equals("0001"));
        xdl0.m208344M(this.f53830e, !bLiveVoiceGiftItem.f44498id.equals("0001"));
        boolean zEquals = bLiveVoiceGiftItem.f44498id.equals("0001");
        VText vText = this.f53832g;
        if (zEquals) {
            vText.setText(bLiveVoiceGiftItem.name);
            this.f53832g.setTextColor(kvc0.m147352a(h1c0.f105395p1));
            hxs.m133411x(this.f53829d, i3c0.f110858S8);
            xdl0.m208344M(this.f53833h, false);
            return;
        }
        vText.setText(bLiveVoiceGiftItem.name);
        xdl0.m208344M(this.f53833h, true);
        this.f53833h.setText(BaseSei.f13930X + bLiveVoiceGiftItem.mvpAmount);
        this.f53833h.setTextColor(kvc0.m147352a(h1c0.f105386m1));
        hxs.m133408u("context_livingAct", this.f53829d, bLiveVoiceGiftItem.icon, t100.m186890d(61.0f), t100.m186890d(61.0f));
        hxs.m133408u("context_livingAct", this.f53831f, bLiveVoiceGiftItem.mvpAvatar, t100.m186890d(37.0f), t100.m186890d(37.0f));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78719i0(this);
    }

    public VoiceGiftWallLocalItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallLocalItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
