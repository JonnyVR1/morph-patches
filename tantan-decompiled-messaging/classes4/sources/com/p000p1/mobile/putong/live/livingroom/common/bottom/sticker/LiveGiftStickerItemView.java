package com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import l.hce;
import l.hxs;
import l.t0g0;
import l.t100;
import l.w8u;
import l.xdl0;
import p002l.yjs;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGiftStickerItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f4700d;

    /* JADX INFO: renamed from: e */
    public VText f4701e;

    /* JADX INFO: renamed from: f */
    public VText f4702f;

    /* JADX INFO: renamed from: g */
    public BLiveStickerTemplatesGiftItem f4703g;

    /* JADX INFO: renamed from: h */
    public int f4704h;

    /* JADX INFO: renamed from: i */
    public C0323a f4705i;

    /* JADX INFO: renamed from: j */
    public final View.OnClickListener f4706j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveGiftStickerItemView$a */
    public class ViewOnClickListenerC0319a implements View.OnClickListener {
        public ViewOnClickListenerC0319a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LiveGiftStickerItemView.this.f4705i.m5879d4(LiveGiftStickerItemView.this.f4703g, LiveGiftStickerItemView.this.f4704h);
        }
    }

    public LiveGiftStickerItemView(Context context) {
        super(context);
        this.f4706j = new ViewOnClickListenerC0319a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    private void m5755n0() {
        this.f4700d.setController((hce) null);
        this.f4701e.setText("");
        this.f4702f.setText("");
        setSelected(false);
    }

    private void setGiftName(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem) {
        xdl0.M(this.f4701e, !TextUtils.isEmpty(bLiveStickerTemplatesGiftItem.giftName));
        this.f4701e.setText(!TextUtils.isEmpty(bLiveStickerTemplatesGiftItem.giftName) ? bLiveStickerTemplatesGiftItem.giftName : "");
    }

    private void setGiftPrice(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem) {
        xdl0.M(this.f4702f, bLiveStickerTemplatesGiftItem.price > -1);
        this.f4702f.setText(w8u.u(R$string.f3433me, t0g0.d(bLiveStickerTemplatesGiftItem.price)));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m5756k0(View view) {
        yjs.m26780a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public void m5757l0(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem, C0323a c0323a, int i) {
        m5755n0();
        setSelected(bLiveStickerTemplatesGiftItem.isSelected);
        this.f4703g = bLiveStickerTemplatesGiftItem;
        this.f4704h = i;
        this.f4705i = c0323a;
        m5758m0(bLiveStickerTemplatesGiftItem);
        setGiftName(bLiveStickerTemplatesGiftItem);
        setGiftPrice(bLiveStickerTemplatesGiftItem);
        xdl0.E0(this, this.f4706j);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m5758m0(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem) {
        if (TextUtils.isEmpty(bLiveStickerTemplatesGiftItem.icon)) {
            return;
        }
        VDraweeView vDraweeView = this.f4700d;
        String str = bLiveStickerTemplatesGiftItem.icon;
        int i = t100.F;
        hxs.u("context_livingAct", vDraweeView, str, i, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5756k0(this);
    }

    public LiveGiftStickerItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4706j = new ViewOnClickListenerC0319a();
    }

    public LiveGiftStickerItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4706j = new ViewOnClickListenerC0319a();
    }
}
