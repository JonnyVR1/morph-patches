package com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftResLevel;
import com.p051p1.mobile.putong.live.base.view.XEGiftView;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.hre;
import p153l.izs;
import p153l.jhe;
import p153l.kdu;
import p153l.n1k0;
import p153l.vxr;
import p153l.w1k0;

/* JADX INFO: loaded from: classes4.dex */
public class UpgradeGiftEquipView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MomoLayUpSVGAImageView f51064d;

    /* JADX INFO: renamed from: e */
    public XEGiftView f51065e;

    /* JADX INFO: renamed from: f */
    public View f51066f;

    /* JADX INFO: renamed from: g */
    public TextView f51067g;

    /* JADX INFO: renamed from: h */
    public View f51068h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f51069i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f51070j;

    /* JADX INFO: renamed from: k */
    public TextView f51071k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f51072l;

    /* JADX INFO: renamed from: m */
    public TextView f51073m;

    /* JADX INFO: renamed from: n */
    public TextView f51074n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftEquipView$a */
    public class C13002a extends SVGAAnimListenerAdapter {
        public C13002a() {
        }

        @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
        public void onStart() {
            super.onStart();
            bnl0.m105524M(UpgradeGiftEquipView.this.f51064d, true);
        }
    }

    public UpgradeGiftEquipView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m75506i0(View view) {
        w1k0.m204443a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m75507j0(BLiveUpgradeGiftResLevel bLiveUpgradeGiftResLevel) {
        m75508k0(bLiveUpgradeGiftResLevel.resources.platformPicId);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m75508k0(String str) {
        if (vxr.m203876d().m170973E1()) {
            jhe.m144897r(this.f51065e, new hre(str));
        } else {
            String strM161123h = n1k0.m161123h(str, 23000);
            this.f51064d.clearInsertData();
            this.f51064d.startSVGAAnimWithLayJson(strM161123h, -1, null, new C13002a());
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m75509l0(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        final BLiveUpgradeGiftResLevel targetRedLevel = bLiveUpgradeGiftInfoItem.getTargetRedLevel();
        izs.m142868s("context_livingAct", this.f51069i, bLiveUpgradeGiftInfoItem.hdUrl);
        izs.m142868s("context_single_room", this.f51070j, targetRedLevel.resources.namePicUrl);
        this.f51071k.setText(bLiveUpgradeGiftInfoItem.name);
        bnl0.m105524M(this.f51074n, bLiveUpgradeGiftInfoItem.expiredTime > 0);
        this.f51074n.setText(kdu.m149275T(bLiveUpgradeGiftInfoItem.expiredTime));
        this.f51073m.setText(String.valueOf(bLiveUpgradeGiftInfoItem.purchasePrice));
        post(new Runnable() { // from class: l.v1k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f181983a.m75507j0(targetRedLevel);
            }
        });
    }

    public void onDestroy() {
        this.f51064d.stopAnimation();
        bnl0.m105524M(this.f51064d, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75506i0(this);
    }

    public UpgradeGiftEquipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
