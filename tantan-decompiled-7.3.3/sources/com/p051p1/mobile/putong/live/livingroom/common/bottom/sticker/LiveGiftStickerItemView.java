package com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VText;
import p153l.a9g0;
import p153l.bnl0;
import p153l.izs;
import p153l.qa00;
import p153l.xau;
import p153l.zls;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftStickerItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f49506d;

    /* JADX INFO: renamed from: e */
    public VText f49507e;

    /* JADX INFO: renamed from: f */
    public VText f49508f;

    /* JADX INFO: renamed from: g */
    public BLiveStickerTemplatesGiftItem f49509g;

    /* JADX INFO: renamed from: h */
    public int f49510h;

    /* JADX INFO: renamed from: i */
    public C12897a f49511i;

    /* JADX INFO: renamed from: j */
    public final View.OnClickListener f49512j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveGiftStickerItemView$a */
    public class ViewOnClickListenerC12893a implements View.OnClickListener {
        public ViewOnClickListenerC12893a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LiveGiftStickerItemView.this.f49511i.m73579d4(LiveGiftStickerItemView.this.f49509g, LiveGiftStickerItemView.this.f49510h);
        }
    }

    public LiveGiftStickerItemView(Context context) {
        super(context);
        this.f49512j = new ViewOnClickListenerC12893a();
    }

    /* JADX INFO: renamed from: n0 */
    private void m73465n0() {
        this.f49506d.setController(null);
        this.f49507e.setText("");
        this.f49508f.setText("");
        setSelected(false);
    }

    private void setGiftName(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem) {
        bnl0.m105524M(this.f49507e, !TextUtils.isEmpty(bLiveStickerTemplatesGiftItem.giftName));
        this.f49507e.setText(!TextUtils.isEmpty(bLiveStickerTemplatesGiftItem.giftName) ? bLiveStickerTemplatesGiftItem.giftName : "");
    }

    private void setGiftPrice(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem) {
        bnl0.m105524M(this.f49508f, bLiveStickerTemplatesGiftItem.price > -1);
        this.f49508f.setText(xau.m209911u(R$string.f48239me, a9g0.m96569d(bLiveStickerTemplatesGiftItem.price)));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m73466k0(View view) {
        zls.m220302a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public void m73467l0(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem, C12897a c12897a, int i) {
        m73465n0();
        setSelected(bLiveStickerTemplatesGiftItem.isSelected);
        this.f49509g = bLiveStickerTemplatesGiftItem;
        this.f49510h = i;
        this.f49511i = c12897a;
        m73468m0(bLiveStickerTemplatesGiftItem);
        setGiftName(bLiveStickerTemplatesGiftItem);
        setGiftPrice(bLiveStickerTemplatesGiftItem);
        bnl0.m105509E0(this, this.f49512j);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m73468m0(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem) {
        if (TextUtils.isEmpty(bLiveStickerTemplatesGiftItem.icon)) {
            return;
        }
        VDraweeView vDraweeView = this.f49506d;
        String str = bLiveStickerTemplatesGiftItem.icon;
        int i = qa00.f156293F;
        izs.m142870u("context_livingAct", vDraweeView, str, i, i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73466k0(this);
    }

    public LiveGiftStickerItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49512j = new ViewOnClickListenerC12893a();
    }

    public LiveGiftStickerItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49512j = new ViewOnClickListenerC12893a();
    }
}
