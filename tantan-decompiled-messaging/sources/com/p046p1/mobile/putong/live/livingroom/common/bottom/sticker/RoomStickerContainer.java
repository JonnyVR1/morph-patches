package com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveAddStickerResult;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c;
import p149l.cfe0;
import p149l.l9e;
import p149l.s7m;
import p149l.t100;
import p149l.xdd0;
import p149l.zfv;
import p149l.zwf0;

/* JADX INFO: loaded from: classes4.dex */
public class RoomStickerContainer extends FrameLayout implements s7m<xdd0> {

    /* JADX INFO: renamed from: c */
    public static final int f48716c = t100.m186890d(266.0f);

    /* JADX INFO: renamed from: d */
    public static final int f48717d = t100.m186890d(60.0f);

    /* JADX INFO: renamed from: a */
    public int f48718a;

    /* JADX INFO: renamed from: b */
    public xdd0 f48719b;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.sticker.RoomStickerContainer$a */
    public class C12733a implements zfv.C21687a.a {
        public C12733a() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: b */
        public void mo67167b() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: c */
        public void mo67168c() {
        }
    }

    public RoomStickerContainer(@NonNull Context context) {
        super(context);
        this.f48718a = l9e.m149018b();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC12736c m72370b(BLiveAddStickerResult bLiveAddStickerResult) {
        if (getChildCount() == 1) {
            removeView(getChildAt(0));
        }
        InterfaceC12736c interfaceC12736cM220591a = zwf0.m220591a(bLiveAddStickerResult, this.f48719b.act());
        int width = (int) (bLiveAddStickerResult.position.f44430x * getWidth());
        int height = (int) ((bLiveAddStickerResult.position.f44431y * (getHeight() - t100.m186890d(104.0f))) + t100.m186890d(104.0f));
        FrameLayout.LayoutParams layoutParamsMo72246C = interfaceC12736cM220591a.mo72246C();
        layoutParamsMo72246C.leftMargin = width;
        layoutParamsMo72246C.topMargin = height;
        interfaceC12736cM220591a.mo72250e(0.5f, 0.5f);
        m72371c(interfaceC12736cM220591a, layoutParamsMo72246C, bLiveAddStickerResult);
        return interfaceC12736cM220591a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m72371c(InterfaceC12736c interfaceC12736c, FrameLayout.LayoutParams layoutParams, final BLiveAddStickerResult bLiveAddStickerResult) {
        if (interfaceC12736c instanceof GiftSticker) {
            interfaceC12736c.setOnClickListener(new InterfaceC12736c.a() { // from class: l.ddd0
                @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.sticker.InterfaceC12736c.a
                /* JADX INFO: renamed from: a */
                public final void mo72469a(InterfaceC12736c interfaceC12736c2) {
                    this.f85587a.m72374f(bLiveAddStickerResult, interfaceC12736c2);
                }
            });
        }
        if (interfaceC12736c instanceof View) {
            addView((View) interfaceC12736c, layoutParams);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(xdd0 xdd0Var) {
        this.f48719b = xdd0Var;
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f48718a = l9e.m149018b();
    }

    /* JADX INFO: renamed from: e */
    public void m72373e(int i) {
        this.f48718a = i;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m72374f(BLiveAddStickerResult bLiveAddStickerResult, InterfaceC12736c interfaceC12736c) {
        cfe0 cfe0VarM106529t = new cfe0.C16123a().m106530u(bLiveAddStickerResult.giftId, new C12733a(), 1, "Room_sticker", "Room_sticker", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("sticker"))).m106529t();
        cfe0VarM106529t.f80589a.f148640D = true;
        this.f48719b.m206028F2().SendGiftEventGroup.sendGift().mo172463j(cfe0VarM106529t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public void m72375i(InterfaceC12736c interfaceC12736c) {
        if (interfaceC12736c instanceof View) {
            removeView((View) interfaceC12736c);
        }
    }

    @Override // p149l.s7m
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
        if (i5 < Math.max(measuredWidth / 2, measuredWidth - (getWidth() - this.f48718a))) {
            int i6 = height + measuredHeight;
            int height2 = getHeight();
            int i7 = f48716c;
            if (i6 > height2 - i7) {
                height = (getHeight() - i7) - measuredHeight;
            }
        }
        int i8 = height + measuredHeight;
        int height3 = getHeight();
        int i9 = f48717d;
        if (i8 > height3 - i9) {
            height = (getHeight() - i9) - measuredHeight;
        }
        childAt.layout(i5, height, measuredWidth + i5, measuredHeight + height);
    }

    public RoomStickerContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48718a = l9e.m149018b();
    }

    public RoomStickerContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48718a = l9e.m149018b();
    }
}
