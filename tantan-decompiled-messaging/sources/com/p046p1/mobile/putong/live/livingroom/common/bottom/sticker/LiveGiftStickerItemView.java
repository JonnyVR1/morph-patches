package com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveStickerTemplatesGiftItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hxs;
import p149l.t0g0;
import p149l.t100;
import p149l.w8u;
import p149l.xdl0;
import p149l.yjs;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftStickerItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f48658d;

    /* JADX INFO: renamed from: e */
    public VText f48659e;

    /* JADX INFO: renamed from: f */
    public VText f48660f;

    /* JADX INFO: renamed from: g */
    public BLiveStickerTemplatesGiftItem f48661g;

    /* JADX INFO: renamed from: h */
    public int f48662h;

    /* JADX INFO: renamed from: i */
    public C12734a f48663i;

    /* JADX INFO: renamed from: j */
    public final View.OnClickListener f48664j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.LiveGiftStickerItemView$a */
    public class ViewOnClickListenerC12730a implements View.OnClickListener {
        public ViewOnClickListenerC12730a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LiveGiftStickerItemView.this.f48663i.m72396d4(LiveGiftStickerItemView.this.f48661g, LiveGiftStickerItemView.this.f48662h);
        }
    }

    public LiveGiftStickerItemView(Context context) {
        super(context);
        this.f48664j = new ViewOnClickListenerC12730a();
    }

    /* JADX INFO: renamed from: n0 */
    private void m72282n0() {
        this.f48658d.setController(null);
        this.f48659e.setText("");
        this.f48660f.setText("");
        setSelected(false);
    }

    private void setGiftName(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem) {
        xdl0.m208344M(this.f48659e, !TextUtils.isEmpty(bLiveStickerTemplatesGiftItem.giftName));
        this.f48659e.setText(!TextUtils.isEmpty(bLiveStickerTemplatesGiftItem.giftName) ? bLiveStickerTemplatesGiftItem.giftName : "");
    }

    private void setGiftPrice(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem) {
        xdl0.m208344M(this.f48660f, bLiveStickerTemplatesGiftItem.price > -1);
        this.f48660f.setText(w8u.m202218u(R$string.f47391me, t0g0.m186863d(bLiveStickerTemplatesGiftItem.price)));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m72283k0(View view) {
        yjs.m215097a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public void m72284l0(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem, C12734a c12734a, int i) {
        m72282n0();
        setSelected(bLiveStickerTemplatesGiftItem.isSelected);
        this.f48661g = bLiveStickerTemplatesGiftItem;
        this.f48662h = i;
        this.f48663i = c12734a;
        m72285m0(bLiveStickerTemplatesGiftItem);
        setGiftName(bLiveStickerTemplatesGiftItem);
        setGiftPrice(bLiveStickerTemplatesGiftItem);
        xdl0.m208329E0(this, this.f48664j);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m72285m0(BLiveStickerTemplatesGiftItem bLiveStickerTemplatesGiftItem) {
        if (TextUtils.isEmpty(bLiveStickerTemplatesGiftItem.icon)) {
            return;
        }
        VDraweeView vDraweeView = this.f48658d;
        String str = bLiveStickerTemplatesGiftItem.icon;
        int i = t100.f167231F;
        hxs.m133408u("context_livingAct", vDraweeView, str, i, i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72283k0(this);
    }

    public LiveGiftStickerItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48664j = new ViewOnClickListenerC12730a();
    }

    public LiveGiftStickerItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48664j = new ViewOnClickListenerC12730a();
    }
}
