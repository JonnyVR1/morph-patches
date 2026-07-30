package com.p000p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.immomo.svgaplayer.listener.SVGAClickAreaListener;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftResLevel;
import com.p1.mobile.putong.live.base.view.XEGiftView;
import l.hxs;
import l.jbu;
import l.uvr;
import l.xdl0;
import p002l.dqe;
import p002l.fge;
import p002l.ksj0;
import p002l.tsj0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class UpgradeGiftEquipView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MomoLayUpSVGAImageView f6258d;

    /* JADX INFO: renamed from: e */
    public XEGiftView f6259e;

    /* JADX INFO: renamed from: f */
    public View f6260f;

    /* JADX INFO: renamed from: g */
    public TextView f6261g;

    /* JADX INFO: renamed from: h */
    public View f6262h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f6263i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f6264j;

    /* JADX INFO: renamed from: k */
    public TextView f6265k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f6266l;

    /* JADX INFO: renamed from: m */
    public TextView f6267m;

    /* JADX INFO: renamed from: n */
    public TextView f6268n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftEquipView$a */
    public class C0428a extends SVGAAnimListenerAdapter {
        public C0428a() {
        }

        public void onStart() {
            super.onStart();
            xdl0.M(UpgradeGiftEquipView.this.f6258d, true);
        }
    }

    public UpgradeGiftEquipView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m7904i0(View view) {
        tsj0.m23160a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m7905j0(BLiveUpgradeGiftResLevel bLiveUpgradeGiftResLevel) {
        m7906k0(bLiveUpgradeGiftResLevel.resources.platformPicId);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m7906k0(String str) {
        if (uvr.d().E1()) {
            fge.m13166r(this.f6259e, new dqe(str));
        } else {
            String strM16781h = ksj0.m16781h(str, 23000);
            this.f6258d.clearInsertData();
            this.f6258d.startSVGAAnimWithLayJson(strM16781h, -1, (SVGAClickAreaListener) null, new C0428a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public void m7907l0(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        final BLiveUpgradeGiftResLevel targetRedLevel = bLiveUpgradeGiftInfoItem.getTargetRedLevel();
        hxs.s("context_livingAct", this.f6263i, bLiveUpgradeGiftInfoItem.hdUrl);
        hxs.s("context_single_room", this.f6264j, targetRedLevel.resources.namePicUrl);
        this.f6265k.setText(bLiveUpgradeGiftInfoItem.name);
        xdl0.M(this.f6268n, bLiveUpgradeGiftInfoItem.expiredTime > 0);
        this.f6268n.setText(jbu.T(bLiveUpgradeGiftInfoItem.expiredTime));
        this.f6267m.setText(String.valueOf(bLiveUpgradeGiftInfoItem.purchasePrice));
        post(new Runnable() { // from class: l.ssj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19262a.m7905j0(targetRedLevel);
            }
        });
    }

    public void onDestroy() {
        this.f6258d.stopAnimation();
        xdl0.M(this.f6258d, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7904i0(this);
    }

    public UpgradeGiftEquipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
