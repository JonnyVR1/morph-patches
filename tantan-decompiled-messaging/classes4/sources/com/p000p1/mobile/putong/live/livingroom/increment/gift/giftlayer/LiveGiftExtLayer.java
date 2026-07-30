package com.p000p1.mobile.putong.live.livingroom.increment.gift.giftlayer;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.agv;
import l.ap0;
import l.t100;
import l.xdl0;
import p002l.g5c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGiftExtLayer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f5687a;

    /* JADX INFO: renamed from: b */
    public CommonMaskAvatarView f5688b;

    /* JADX INFO: renamed from: c */
    public CommonMaskAvatarView f5689c;

    /* JADX INFO: renamed from: d */
    public LiveStrokeTextView f5690d;

    /* JADX INFO: renamed from: e */
    public LiveStrokeTextView f5691e;

    /* JADX INFO: renamed from: f */
    public CommonMaskAvatarView f5692f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f5693g;

    public LiveGiftExtLayer(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m7170a() {
        xdl0.M(this.f5692f, false);
        xdl0.M(this.f5687a, false);
    }

    /* JADX INFO: renamed from: b */
    public void m7171b(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        m7170a();
        if (bLiveGivenGiftBrief.previewUserMask != null) {
            xdl0.M(this.f5692f, true);
            agv.f(this.f5692f, t100.d(100.0f), bLiveGivenGiftBrief.previewUserMask);
            return;
        }
        if (bLiveGivenGiftBrief.senderShowMask == null || bLiveGivenGiftBrief.receiverShowMask == null) {
            return;
        }
        xdl0.M(this.f5687a, true);
        agv.f(this.f5688b, t100.d(100.0f), bLiveGivenGiftBrief.senderShowMask);
        agv.f(this.f5689c, t100.d(100.0f), bLiveGivenGiftBrief.receiverShowMask);
        this.f5690d.setText(bLiveGivenGiftBrief.senderShowMask.name);
        this.f5690d.setStrokeColor(Color.parseColor("#00CCFF"));
        this.f5691e.setText(bLiveGivenGiftBrief.receiverShowMask.name);
        this.f5691e.setStrokeColor(Color.parseColor("#FF68AC"));
        this.f5693g.l("https://auto.tancdn.com/v1/raw/ea1d53f7-efa2-4e15-8c7b-e491fea4febd14.svga", -1, (ap0) null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f5687a = (FrameLayout) findViewById(g5c0.f10875J5);
        this.f5693g = findViewById(g5c0.f11193r6);
        this.f5688b = (CommonMaskAvatarView) findViewById(g5c0.f11213u);
        this.f5689c = (CommonMaskAvatarView) findViewById(g5c0.f11222v);
        this.f5690d = (LiveStrokeTextView) findViewById(g5c0.f10858H6);
        this.f5691e = (LiveStrokeTextView) findViewById(g5c0.f10867I6);
        this.f5692f = (CommonMaskAvatarView) findViewById(g5c0.f11201s5);
    }

    public LiveGiftExtLayer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftExtLayer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
