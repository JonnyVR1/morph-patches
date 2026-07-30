package com.p051p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.qa00;
import p153l.y20;
import p153l.ykn0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceGiftWallLocalItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f54677d;

    /* JADX INFO: renamed from: e */
    public View f54678e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f54679f;

    /* JADX INFO: renamed from: g */
    public VText f54680g;

    /* JADX INFO: renamed from: h */
    public VText f54681h;

    public VoiceGiftWallLocalItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m79902i0(View view) {
        ykn0.m216528a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: j0 */
    public void m79903j0(final BLiveVoiceGiftItem bLiveVoiceGiftItem, final y20<BLiveVoiceGiftItem> y20Var) {
        if (bLiveVoiceGiftItem == null) {
            return;
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.xkn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(bLiveVoiceGiftItem);
            }
        });
        bnl0.m105524M(this.f54679f, !bLiveVoiceGiftItem.f45346id.equals("0001"));
        bnl0.m105524M(this.f54678e, !bLiveVoiceGiftItem.f45346id.equals("0001"));
        boolean zEquals = bLiveVoiceGiftItem.f45346id.equals("0001");
        VText vText = this.f54680g;
        if (zEquals) {
            vText.setText(bLiveVoiceGiftItem.name);
            this.f54680g.setTextColor(n3d0.m161277a(n9c0.f140856p1));
            izs.m142873x(this.f54677d, obc0.f146186S8);
            bnl0.m105524M(this.f54681h, false);
            return;
        }
        vText.setText(bLiveVoiceGiftItem.name);
        bnl0.m105524M(this.f54681h, true);
        this.f54681h.setText(BaseSei.f14624X + bLiveVoiceGiftItem.mvpAmount);
        this.f54681h.setTextColor(n3d0.m161277a(n9c0.f140847m1));
        izs.m142870u("context_livingAct", this.f54677d, bLiveVoiceGiftItem.icon, qa00.m175859d(61.0f), qa00.m175859d(61.0f));
        izs.m142870u("context_livingAct", this.f54679f, bLiveVoiceGiftItem.mvpAvatar, qa00.m175859d(37.0f), qa00.m175859d(37.0f));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79902i0(this);
    }

    public VoiceGiftWallLocalItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallLocalItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
