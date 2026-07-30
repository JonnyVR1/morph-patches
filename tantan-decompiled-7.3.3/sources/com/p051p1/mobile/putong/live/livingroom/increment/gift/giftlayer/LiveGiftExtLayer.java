package com.p051p1.mobile.putong.live.livingroom.increment.gift.giftlayer;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import p153l.biv;
import p153l.bnl0;
import p153l.mdc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftExtLayer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f50493a;

    /* JADX INFO: renamed from: b */
    public CommonMaskAvatarView f50494b;

    /* JADX INFO: renamed from: c */
    public CommonMaskAvatarView f50495c;

    /* JADX INFO: renamed from: d */
    public LiveStrokeTextView f50496d;

    /* JADX INFO: renamed from: e */
    public LiveStrokeTextView f50497e;

    /* JADX INFO: renamed from: f */
    public CommonMaskAvatarView f50498f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f50499g;

    public LiveGiftExtLayer(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m74807a() {
        bnl0.m105524M(this.f50498f, false);
        bnl0.m105524M(this.f50493a, false);
    }

    /* JADX INFO: renamed from: b */
    public void m74808b(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        m74807a();
        if (bLiveGivenGiftBrief.previewUserMask != null) {
            bnl0.m105524M(this.f50498f, true);
            biv.m104521f(this.f50498f, qa00.m175859d(100.0f), bLiveGivenGiftBrief.previewUserMask);
            return;
        }
        if (bLiveGivenGiftBrief.senderShowMask == null || bLiveGivenGiftBrief.receiverShowMask == null) {
            return;
        }
        bnl0.m105524M(this.f50493a, true);
        biv.m104521f(this.f50494b, qa00.m175859d(100.0f), bLiveGivenGiftBrief.senderShowMask);
        biv.m104521f(this.f50495c, qa00.m175859d(100.0f), bLiveGivenGiftBrief.receiverShowMask);
        this.f50496d.setText(bLiveGivenGiftBrief.senderShowMask.name);
        this.f50496d.setStrokeColor(Color.parseColor("#00CCFF"));
        this.f50497e.setText(bLiveGivenGiftBrief.receiverShowMask.name);
        this.f50497e.setStrokeColor(Color.parseColor("#FF68AC"));
        this.f50499g.mo69685l("https://auto.tancdn.com/v1/raw/ea1d53f7-efa2-4e15-8c7b-e491fea4febd14.svga", -1, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f50493a = (FrameLayout) findViewById(mdc0.f135970J5);
        this.f50499g = (AnimEffectPlayer) findViewById(mdc0.f136288r6);
        this.f50494b = (CommonMaskAvatarView) findViewById(mdc0.f136308u);
        this.f50495c = (CommonMaskAvatarView) findViewById(mdc0.f136317v);
        this.f50496d = (LiveStrokeTextView) findViewById(mdc0.f135953H6);
        this.f50497e = (LiveStrokeTextView) findViewById(mdc0.f135962I6);
        this.f50498f = (CommonMaskAvatarView) findViewById(mdc0.f136296s5);
    }

    public LiveGiftExtLayer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftExtLayer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
