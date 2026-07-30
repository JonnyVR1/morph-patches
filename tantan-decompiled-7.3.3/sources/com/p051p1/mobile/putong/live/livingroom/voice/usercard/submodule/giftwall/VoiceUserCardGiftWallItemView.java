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
import p153l.qa00;
import p153l.s6p0;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceUserCardGiftWallItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f54682d;

    /* JADX INFO: renamed from: e */
    public View f54683e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f54684f;

    /* JADX INFO: renamed from: g */
    public VText f54685g;

    public VoiceUserCardGiftWallItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m79905i0(View view) {
        s6p0.m184918a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: j0 */
    public void m79906j0(final BLiveVoiceGiftItem bLiveVoiceGiftItem, final y20<BLiveVoiceGiftItem> y20Var) {
        if (bLiveVoiceGiftItem == null) {
            return;
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.r6p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(bLiveVoiceGiftItem);
            }
        });
        bnl0.m105524M(this.f54684f, !bLiveVoiceGiftItem.f45346id.equals("0001"));
        bnl0.m105524M(this.f54683e, !bLiveVoiceGiftItem.f45346id.equals("0001"));
        boolean zEquals = bLiveVoiceGiftItem.f45346id.equals("0001");
        VText vText = this.f54685g;
        if (zEquals) {
            vText.setText(bLiveVoiceGiftItem.name);
            this.f54685g.setTextColor(n3d0.m161277a(n9c0.f140832h1));
            izs.m142868s("context_livingAct", this.f54682d, "https://auto.tancdn.com/v1/images/eyJpZCI6IldLR1I3U0ozRlBURkVXQlRINDVHWk9PVlRJS0pDTzE0IiwidyI6MTQ0LCJoIjoxNDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNDU1NTYzMzk5NTYzMTgzNjE2fQ.png");
            return;
        }
        vText.setText(bLiveVoiceGiftItem.name + BaseSei.f14624X + bLiveVoiceGiftItem.mvpAmount);
        this.f54685g.setTextColor(n3d0.m161277a(n9c0.f140847m1));
        VDraweeView vDraweeView = this.f54682d;
        String str = bLiveVoiceGiftItem.icon;
        int i = qa00.f156291D;
        izs.m142870u("context_livingAct", vDraweeView, str, i, i);
        VDraweeView vDraweeView2 = this.f54684f;
        String str2 = bLiveVoiceGiftItem.mvpAvatar;
        int i2 = qa00.f156329p;
        izs.m142870u("context_livingAct", vDraweeView2, str2, i2, i2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79905i0(this);
    }

    public VoiceUserCardGiftWallItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceUserCardGiftWallItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
