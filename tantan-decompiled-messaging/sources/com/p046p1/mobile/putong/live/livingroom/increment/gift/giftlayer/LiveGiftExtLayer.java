package com.p046p1.mobile.putong.live.livingroom.increment.gift.giftlayer;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import p149l.agv;
import p149l.g5c0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftExtLayer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f49645a;

    /* JADX INFO: renamed from: b */
    public CommonMaskAvatarView f49646b;

    /* JADX INFO: renamed from: c */
    public CommonMaskAvatarView f49647c;

    /* JADX INFO: renamed from: d */
    public LiveStrokeTextView f49648d;

    /* JADX INFO: renamed from: e */
    public LiveStrokeTextView f49649e;

    /* JADX INFO: renamed from: f */
    public CommonMaskAvatarView f49650f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f49651g;

    public LiveGiftExtLayer(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m73624a() {
        xdl0.m208344M(this.f49650f, false);
        xdl0.m208344M(this.f49645a, false);
    }

    /* JADX INFO: renamed from: b */
    public void m73625b(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        m73624a();
        if (bLiveGivenGiftBrief.previewUserMask != null) {
            xdl0.m208344M(this.f49650f, true);
            agv.m96348f(this.f49650f, t100.m186890d(100.0f), bLiveGivenGiftBrief.previewUserMask);
            return;
        }
        if (bLiveGivenGiftBrief.senderShowMask == null || bLiveGivenGiftBrief.receiverShowMask == null) {
            return;
        }
        xdl0.m208344M(this.f49645a, true);
        agv.m96348f(this.f49646b, t100.m186890d(100.0f), bLiveGivenGiftBrief.senderShowMask);
        agv.m96348f(this.f49647c, t100.m186890d(100.0f), bLiveGivenGiftBrief.receiverShowMask);
        this.f49648d.setText(bLiveGivenGiftBrief.senderShowMask.name);
        this.f49648d.setStrokeColor(Color.parseColor("#00CCFF"));
        this.f49649e.setText(bLiveGivenGiftBrief.receiverShowMask.name);
        this.f49649e.setStrokeColor(Color.parseColor("#FF68AC"));
        this.f49651g.mo68502l("https://auto.tancdn.com/v1/raw/ea1d53f7-efa2-4e15-8c7b-e491fea4febd14.svga", -1, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f49645a = (FrameLayout) findViewById(g5c0.f100725J5);
        this.f49651g = (AnimEffectPlayer) findViewById(g5c0.f101043r6);
        this.f49646b = (CommonMaskAvatarView) findViewById(g5c0.f101063u);
        this.f49647c = (CommonMaskAvatarView) findViewById(g5c0.f101072v);
        this.f49648d = (LiveStrokeTextView) findViewById(g5c0.f100708H6);
        this.f49649e = (LiveStrokeTextView) findViewById(g5c0.f100717I6);
        this.f49650f = (CommonMaskAvatarView) findViewById(g5c0.f101051s5);
    }

    public LiveGiftExtLayer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftExtLayer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
