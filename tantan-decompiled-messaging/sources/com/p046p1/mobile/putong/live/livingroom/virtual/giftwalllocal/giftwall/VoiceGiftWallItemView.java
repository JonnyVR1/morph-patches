package com.p046p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall;

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
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.e30;
import p149l.h1c0;
import p149l.hxs;
import p149l.i3c0;
import p149l.kbn0;
import p149l.kvc0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceGiftWallItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f52321d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f52322e;

    /* JADX INFO: renamed from: f */
    public View f52323f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f52324g;

    /* JADX INFO: renamed from: h */
    public VText f52325h;

    /* JADX INFO: renamed from: i */
    public VText f52326i;

    public VoiceGiftWallItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m76975i0(View view) {
        kbn0.m145308a(this, view);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: j0 */
    public void m76976j0(final BLiveVoiceGiftItem bLiveVoiceGiftItem, final e30<BLiveVoiceGiftItem> e30Var) {
        this.f52325h.setText(bLiveVoiceGiftItem.name);
        this.f52326i.setText(BaseSei.f13930X + bLiveVoiceGiftItem.mvpAmount);
        if (TextUtils.isEmpty(bLiveVoiceGiftItem.icon)) {
            return;
        }
        VDraweeView vDraweeView = this.f52322e;
        String str = bLiveVoiceGiftItem.icon;
        int i = t100.f167231F;
        hxs.m133408u("context_livingAct", vDraweeView, str, i, i);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ibn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveVoiceGiftItem);
            }
        });
        boolean z = false;
        xdl0.m208344M(this.f52324g, bLiveVoiceGiftItem.unlocked && !TextUtils.isEmpty(bLiveVoiceGiftItem.mvpAvatar));
        View view = this.f52323f;
        if (bLiveVoiceGiftItem.unlocked && !TextUtils.isEmpty(bLiveVoiceGiftItem.mvpAvatar)) {
            z = true;
        }
        xdl0.m208344M(view, z);
        boolean z2 = bLiveVoiceGiftItem.unlocked;
        VImage vImage = this.f52321d;
        if (z2) {
            vImage.setImageResource(i3c0.f111204w2);
            this.f52325h.setTextColor(kvc0.m147352a(h1c0.f105395p1));
            this.f52322e.setColorFilter((ColorFilter) null);
            this.f52322e.setAlpha(1.0f);
            if (TextUtils.isEmpty(bLiveVoiceGiftItem.mvpAvatar)) {
                return;
            }
            hxs.m133407t("context_livingAct", this.f52324g, bLiveVoiceGiftItem.mvpAvatar, t100.m186890d(24.0f));
            return;
        }
        vImage.setImageResource(i3c0.f111192v2);
        this.f52325h.setTextColor(kvc0.m147352a(h1c0.f105377j1));
        this.f52326i.setTextColor(kvc0.m147352a(h1c0.f105377j1));
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        this.f52322e.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.f52322e.setAlpha(0.7f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76975i0(this);
    }

    public VoiceGiftWallItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceGiftWallItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
