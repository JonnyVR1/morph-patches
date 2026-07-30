package com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c;
import p153l.aiv;
import p153l.hne0;
import p153l.iam;
import p153l.j5g0;
import p153l.pae;
import p153l.qa00;
import p153l.zld0;

/* JADX INFO: loaded from: classes4.dex */
public class RoomStickerContainer extends FrameLayout implements iam<zld0> {

    /* JADX INFO: renamed from: c */
    public static final int f49564c = qa00.m175859d(266.0f);

    /* JADX INFO: renamed from: d */
    public static final int f49565d = qa00.m175859d(60.0f);

    /* JADX INFO: renamed from: a */
    public int f49566a;

    /* JADX INFO: renamed from: b */
    public zld0 f49567b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.RoomStickerContainer$a */
    public class C12896a implements aiv.C15716a.a {
        public C12896a() {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: b */
        public void mo68350b() {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: c */
        public void mo68351c() {
        }
    }

    public RoomStickerContainer(@NonNull Context context) {
        super(context);
        this.f49566a = pae.m171419b();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC12899c m73553b(BLiveAddStickerResult bLiveAddStickerResult) {
        if (getChildCount() == 1) {
            removeView(getChildAt(0));
        }
        InterfaceC12899c interfaceC12899cM143525a = j5g0.m143525a(bLiveAddStickerResult, this.f49567b.act());
        int width = (int) (bLiveAddStickerResult.position.f45278x * getWidth());
        int height = (int) ((bLiveAddStickerResult.position.f45279y * (getHeight() - qa00.m175859d(104.0f))) + qa00.m175859d(104.0f));
        FrameLayout.LayoutParams layoutParamsMo73429C = interfaceC12899cM143525a.mo73429C();
        layoutParamsMo73429C.leftMargin = width;
        layoutParamsMo73429C.topMargin = height;
        interfaceC12899cM143525a.mo73433e(0.5f, 0.5f);
        m73554c(interfaceC12899cM143525a, layoutParamsMo73429C, bLiveAddStickerResult);
        return interfaceC12899cM143525a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m73554c(InterfaceC12899c interfaceC12899c, FrameLayout.LayoutParams layoutParams, final BLiveAddStickerResult bLiveAddStickerResult) {
        if (interfaceC12899c instanceof GiftSticker) {
            interfaceC12899c.setOnClickListener(new InterfaceC12899c.a() { // from class: l.fld0
                @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12899c.a
                /* JADX INFO: renamed from: a */
                public final void mo73652a(InterfaceC12899c interfaceC12899c2) {
                    this.f99637a.m73557f(bLiveAddStickerResult, interfaceC12899c2);
                }
            });
        }
        if (interfaceC12899c instanceof View) {
            addView((View) interfaceC12899c, layoutParams);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(zld0 zld0Var) {
        this.f49567b = zld0Var;
    }

    @Override // p153l.iam
    public void destroy() {
        this.f49566a = pae.m171419b();
    }

    /* JADX INFO: renamed from: e */
    public void m73556e(int i) {
        this.f49566a = i;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m73557f(BLiveAddStickerResult bLiveAddStickerResult, InterfaceC12899c interfaceC12899c) {
        hne0 hne0VarM136083t = new hne0.C17513a().m136084u(bLiveAddStickerResult.giftId, new C12896a(), 1, "Room_sticker", "Room_sticker", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("sticker"))).m136083t();
        hne0VarM136083t.f110732a.f180041D = true;
        this.f49567b.m213811F2().SendGiftEventGroup.sendGift().mo199273j(hne0VarM136083t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public void m73558i(InterfaceC12899c interfaceC12899c) {
        if (interfaceC12899c instanceof View) {
            removeView((View) interfaceC12899c);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() == 0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        View childAt = getChildAt(0);
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = layoutParams.leftMargin;
        int height = layoutParams.topMargin;
        if (i5 < Math.max(measuredWidth / 2, measuredWidth - (getWidth() - this.f49566a))) {
            int i6 = height + measuredHeight;
            int height2 = getHeight();
            int i7 = f49564c;
            if (i6 > height2 - i7) {
                height = (getHeight() - i7) - measuredHeight;
            }
        }
        int i8 = height + measuredHeight;
        int height3 = getHeight();
        int i9 = f49565d;
        if (i8 > height3 - i9) {
            height = (getHeight() - i9) - measuredHeight;
        }
        childAt.layout(i5, height, measuredWidth + i5, measuredHeight + height);
    }

    public RoomStickerContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49566a = pae.m171419b();
    }

    public RoomStickerContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49566a = pae.m171419b();
    }
}
