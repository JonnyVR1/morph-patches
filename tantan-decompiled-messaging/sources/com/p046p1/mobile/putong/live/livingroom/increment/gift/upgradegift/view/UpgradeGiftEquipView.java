package com.p046p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftResLevel;
import com.p046p1.mobile.putong.live.base.view.XEGiftView;
import p147v.VDraweeView;
import p149l.dqe;
import p149l.fge;
import p149l.hxs;
import p149l.jbu;
import p149l.ksj0;
import p149l.tsj0;
import p149l.uvr;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class UpgradeGiftEquipView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MomoLayUpSVGAImageView f50216d;

    /* JADX INFO: renamed from: e */
    public XEGiftView f50217e;

    /* JADX INFO: renamed from: f */
    public View f50218f;

    /* JADX INFO: renamed from: g */
    public TextView f50219g;

    /* JADX INFO: renamed from: h */
    public View f50220h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f50221i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f50222j;

    /* JADX INFO: renamed from: k */
    public TextView f50223k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f50224l;

    /* JADX INFO: renamed from: m */
    public TextView f50225m;

    /* JADX INFO: renamed from: n */
    public TextView f50226n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftEquipView$a */
    public class C12839a extends SVGAAnimListenerAdapter {
        public C12839a() {
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onStart() {
            super.onStart();
            xdl0.m208344M(UpgradeGiftEquipView.this.f50216d, true);
        }
    }

    public UpgradeGiftEquipView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m74323i0(View view) {
        tsj0.m190562a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m74324j0(BLiveUpgradeGiftResLevel bLiveUpgradeGiftResLevel) {
        m74325k0(bLiveUpgradeGiftResLevel.resources.platformPicId);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m74325k0(String str) {
        if (uvr.m196087d().m162666E1()) {
            fge.m121214r(this.f50217e, new dqe(str));
        } else {
            String strM147081h = ksj0.m147081h(str, 23000);
            this.f50216d.clearInsertData();
            this.f50216d.startSVGAAnimWithLayJson(strM147081h, -1, null, new C12839a());
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m74326l0(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        final BLiveUpgradeGiftResLevel targetRedLevel = bLiveUpgradeGiftInfoItem.getTargetRedLevel();
        hxs.m133406s("context_livingAct", this.f50221i, bLiveUpgradeGiftInfoItem.hdUrl);
        hxs.m133406s("context_single_room", this.f50222j, targetRedLevel.resources.namePicUrl);
        this.f50223k.setText(bLiveUpgradeGiftInfoItem.name);
        xdl0.m208344M(this.f50226n, bLiveUpgradeGiftInfoItem.expiredTime > 0);
        this.f50226n.setText(jbu.m140812T(bLiveUpgradeGiftInfoItem.expiredTime));
        this.f50225m.setText(String.valueOf(bLiveUpgradeGiftInfoItem.purchasePrice));
        post(new Runnable() { // from class: l.ssj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f166218a.m74324j0(targetRedLevel);
            }
        });
    }

    public void onDestroy() {
        this.f50216d.stopAnimation();
        xdl0.m208344M(this.f50216d, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74323i0(this);
    }

    public UpgradeGiftEquipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
