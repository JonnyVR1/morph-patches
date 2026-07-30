package com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c;
import com.p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import l.l9e;
import l.s7m;
import l.t100;
import p002l.cfe0;
import p002l.xdd0;
import p002l.zfv;
import p002l.zwf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class RoomStickerContainer extends FrameLayout implements s7m<xdd0> {

    /* JADX INFO: renamed from: c */
    public static final int f4758c = t100.d(266.0f);

    /* JADX INFO: renamed from: d */
    public static final int f4759d = t100.d(60.0f);

    /* JADX INFO: renamed from: a */
    public int f4760a;

    /* JADX INFO: renamed from: b */
    public xdd0 f4761b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.RoomStickerContainer$a */
    public class C0322a implements zfv.C0940a.a {
        public C0322a() {
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: a */
        public void mo5855a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: b */
        public void mo5856b() {
        }

        @Override // p002l.zfv.C0940a.a
        /* JADX INFO: renamed from: c */
        public void mo5857c() {
        }
    }

    public RoomStickerContainer(@NonNull Context context) {
        super(context);
        this.f4760a = l9e.b();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5847C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC0325c m5848b(BLiveAddStickerResult bLiveAddStickerResult) {
        if (getChildCount() == 1) {
            removeView(getChildAt(0));
        }
        InterfaceC0325c interfaceC0325cM27668a = zwf0.m27668a(bLiveAddStickerResult, this.f4761b.act());
        int width = (int) (bLiveAddStickerResult.position.x * getWidth());
        int height = (int) ((bLiveAddStickerResult.position.y * (getHeight() - t100.d(104.0f))) + t100.d(104.0f));
        FrameLayout.LayoutParams layoutParamsMo5719C = interfaceC0325cM27668a.mo5719C();
        layoutParamsMo5719C.leftMargin = width;
        layoutParamsMo5719C.topMargin = height;
        interfaceC0325cM27668a.mo5723e(0.5f, 0.5f);
        m5849c(interfaceC0325cM27668a, layoutParamsMo5719C, bLiveAddStickerResult);
        return interfaceC0325cM27668a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m5849c(InterfaceC0325c interfaceC0325c, FrameLayout.LayoutParams layoutParams, final BLiveAddStickerResult bLiveAddStickerResult) {
        if (interfaceC0325c instanceof GiftSticker) {
            interfaceC0325c.setOnClickListener(new InterfaceC0325c.a() { // from class: l.ddd0
                @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC0325c.a
                /* JADX INFO: renamed from: a */
                public final void mo5954a(InterfaceC0325c interfaceC0325c2) {
                    this.f9173a.m5852f(bLiveAddStickerResult, interfaceC0325c2);
                }
            });
        }
        if (interfaceC0325c instanceof View) {
            addView((View) interfaceC0325c, layoutParams);
        }
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m5854i1(xdd0 xdd0Var) {
        this.f4761b = xdd0Var;
    }

    public void destroy() {
        this.f4760a = l9e.b();
    }

    /* JADX INFO: renamed from: e */
    public void m5851e(int i) {
        this.f4760a = i;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m5852f(BLiveAddStickerResult bLiveAddStickerResult, InterfaceC0325c interfaceC0325c) {
        cfe0 cfe0VarM10982t = new cfe0.C0512a().m10983u(bLiveAddStickerResult.giftId, new C0322a(), 1, "Room_sticker", "Room_sticker", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("sticker"))).m10982t();
        cfe0VarM10982t.f8625a.f17264D = true;
        this.f4761b.m25548F2().SendGiftEventGroup.sendGift().j(cfe0VarM10982t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public void m5853i(InterfaceC0325c interfaceC0325c) {
        if (interfaceC0325c instanceof View) {
            removeView((View) interfaceC0325c);
        }
    }

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
        if (i5 < Math.max(measuredWidth / 2, measuredWidth - (getWidth() - this.f4760a))) {
            int i6 = height + measuredHeight;
            int height2 = getHeight();
            int i7 = f4758c;
            if (i6 > height2 - i7) {
                height = (getHeight() - i7) - measuredHeight;
            }
        }
        int i8 = height + measuredHeight;
        int height3 = getHeight();
        int i9 = f4759d;
        if (i8 > height3 - i9) {
            height = (getHeight() - i9) - measuredHeight;
        }
        childAt.layout(i5, height, measuredWidth + i5, measuredHeight + height);
    }

    public RoomStickerContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4760a = l9e.b();
    }

    public RoomStickerContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4760a = l9e.b();
    }
}
