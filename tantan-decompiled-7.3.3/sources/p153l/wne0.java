package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;

/* JADX INFO: loaded from: classes4.dex */
public class wne0 implements iam<une0> {

    /* JADX INFO: renamed from: a */
    public BLiveGiftBubbleConfig f189898a;

    /* JADX INFO: renamed from: b */
    public une0 f189899b;

    /* JADX INFO: renamed from: c */
    public bne0 f189900c;

    /* JADX INFO: renamed from: d */
    public DialogC12774a f189901d;

    /* JADX INFO: renamed from: e */
    public ld3 f189902e;

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(une0 une0Var) {
        this.f189899b = une0Var;
    }

    /* JADX INFO: renamed from: c */
    public final ld3 m207194c() {
        if (this.f189902e == null) {
            this.f189902e = new ld3(this.f189899b);
        }
        return this.f189902e;
    }

    /* JADX INFO: renamed from: d */
    public final void m207195d() {
        x20 x20Var = this.f189898a.extraClickAction;
        if (x20Var != null) {
            x20Var.call();
        }
        BLiveGiftBubbleConfig bLiveGiftBubbleConfig = this.f189898a;
        if (bLiveGiftBubbleConfig == null || TextUtils.isEmpty(bLiveGiftBubbleConfig.button.jumpType.toString())) {
            return;
        }
        String string = this.f189898a.button.jumpType.toString();
        string.getClass();
        if (string.equals("schema")) {
            une0 une0Var = this.f189899b;
            BLiveGiftBubbleConfig bLiveGiftBubbleConfig2 = this.f189898a;
            une0Var.m196849f4(bLiveGiftBubbleConfig2.schema, bLiveGiftBubbleConfig2.type);
        } else {
            if (string.equals("url")) {
                this.f189899b.m196857o4(this.f189898a);
                return;
            }
            une0 une0Var2 = this.f189899b;
            BLiveGiftBubbleConfig bLiveGiftBubbleConfig3 = this.f189898a;
            une0Var2.m196858p4(bLiveGiftBubbleConfig3.giftItemId, bLiveGiftBubbleConfig3.giftNums);
        }
    }

    @Override // p153l.iam
    public void destroy() {
        bne0 bne0Var = this.f189900c;
        if (bne0Var != null) {
            bne0Var.destroy();
        }
        DialogC12774a dialogC12774a = this.f189901d;
        if (dialogC12774a != null) {
            dialogC12774a.dismiss();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m207196e(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        this.f189898a = bLiveGiftBubbleConfig;
        if (bLiveGiftBubbleConfig.styleType.toString().equals("common")) {
            this.f189901d = m207194c().m153724x(bLiveGiftBubbleConfig, new vne0(this));
        } else if (bLiveGiftBubbleConfig.styleType.toString().equals(BLiveBottomPopupStyleTypeEnum.window)) {
            this.f189901d = new fe3(this.f189899b).m125206b0(bLiveGiftBubbleConfig, new vne0(this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2] */
    /* JADX INFO: renamed from: f */
    public void m207197f(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        this.f189898a = bLiveGiftBubbleConfig;
        if (this.f189900c == null) {
            this.f189900c = new bne0(getAct(), this.f189899b);
        }
        if (TextUtils.isEmpty(bLiveGiftBubbleConfig.iconUrl)) {
            bLiveGiftBubbleConfig.iconUrl = this.f189899b.m213810E2().m168532l0().m61308fp().url;
        }
        this.f189900c.m105389T(bLiveGiftBubbleConfig, this.f189899b, new vne0(this));
        i4g0.m138526x("e_live_gift_guide", this.f189899b.mo78457R2());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        bne0 bne0Var = this.f189900c;
        if (bne0Var != null && bne0Var.isShowing()) {
            return true;
        }
        DialogC12774a dialogC12774a = this.f189901d;
        return dialogC12774a != null && dialogC12774a.isShowing();
    }
}
