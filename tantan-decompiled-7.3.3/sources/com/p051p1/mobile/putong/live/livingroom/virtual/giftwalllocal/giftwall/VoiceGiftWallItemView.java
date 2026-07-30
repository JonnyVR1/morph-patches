package com.p051p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.okn0;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceGiftWallItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f53169d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f53170e;

    /* JADX INFO: renamed from: f */
    public View f53171f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f53172g;

    /* JADX INFO: renamed from: h */
    public VText f53173h;

    /* JADX INFO: renamed from: i */
    public VText f53174i;

    public VoiceGiftWallItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m78158i0(View view) {
        okn0.m168042a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: j0 */
    public void m78159j0(final BLiveVoiceGiftItem bLiveVoiceGiftItem, final y20<BLiveVoiceGiftItem> y20Var) {
        this.f53173h.setText(bLiveVoiceGiftItem.name);
        this.f53174i.setText(BaseSei.f14624X + bLiveVoiceGiftItem.mvpAmount);
        if (TextUtils.isEmpty(bLiveVoiceGiftItem.icon)) {
            return;
        }
        VDraweeView vDraweeView = this.f53170e;
        String str = bLiveVoiceGiftItem.icon;
        int i = qa00.f156293F;
        izs.m142870u("context_livingAct", vDraweeView, str, i, i);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.mkn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(bLiveVoiceGiftItem);
            }
        });
        boolean z = false;
        bnl0.m105524M(this.f53172g, bLiveVoiceGiftItem.unlocked && !TextUtils.isEmpty(bLiveVoiceGiftItem.mvpAvatar));
        View view = this.f53171f;
        if (bLiveVoiceGiftItem.unlocked && !TextUtils.isEmpty(bLiveVoiceGiftItem.mvpAvatar)) {
            z = true;
        }
        bnl0.m105524M(view, z);
        boolean z2 = bLiveVoiceGiftItem.unlocked;
        VImage vImage = this.f53169d;
        if (z2) {
            vImage.setImageResource(obc0.f146532w2);
            this.f53173h.setTextColor(n3d0.m161277a(n9c0.f140856p1));
            this.f53170e.setColorFilter((ColorFilter) null);
            this.f53170e.setAlpha(1.0f);
            if (TextUtils.isEmpty(bLiveVoiceGiftItem.mvpAvatar)) {
                return;
            }
            izs.m142869t("context_livingAct", this.f53172g, bLiveVoiceGiftItem.mvpAvatar, qa00.m175859d(24.0f));
            return;
        }
        vImage.setImageResource(obc0.f146520v2);
        this.f53173h.setTextColor(n3d0.m161277a(n9c0.f140838j1));
        this.f53174i.setTextColor(n3d0.m161277a(n9c0.f140838j1));
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        this.f53170e.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.f53170e.setAlpha(0.7f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78158i0(this);
    }

    public VoiceGiftWallItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
