package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;

/* JADX INFO: loaded from: classes4.dex */
public class rfe0 implements s7m<pfe0> {

    /* JADX INFO: renamed from: a */
    public BLiveGiftBubbleConfig f159141a;

    /* JADX INFO: renamed from: b */
    public pfe0 f159142b;

    /* JADX INFO: renamed from: c */
    public wee0 f159143c;

    /* JADX INFO: renamed from: d */
    public DialogC12611a f159144d;

    /* JADX INFO: renamed from: e */
    public wc3 f159145e;

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(pfe0 pfe0Var) {
        this.f159142b = pfe0Var;
    }

    /* JADX INFO: renamed from: c */
    public final wc3 m179129c() {
        if (this.f159145e == null) {
            this.f159145e = new wc3(this.f159142b);
        }
        return this.f159145e;
    }

    /* JADX INFO: renamed from: d */
    public final void m179130d() {
        d30 d30Var = this.f159141a.extraClickAction;
        if (d30Var != null) {
            d30Var.call();
        }
        BLiveGiftBubbleConfig bLiveGiftBubbleConfig = this.f159141a;
        if (bLiveGiftBubbleConfig == null || TextUtils.isEmpty(bLiveGiftBubbleConfig.button.jumpType.toString())) {
            return;
        }
        String string = this.f159141a.button.jumpType.toString();
        string.getClass();
        if (string.equals("schema")) {
            pfe0 pfe0Var = this.f159142b;
            BLiveGiftBubbleConfig bLiveGiftBubbleConfig2 = this.f159141a;
            pfe0Var.m168623f4(bLiveGiftBubbleConfig2.schema, bLiveGiftBubbleConfig2.type);
        } else {
            if (string.equals("url")) {
                this.f159142b.m168631o4(this.f159141a);
                return;
            }
            pfe0 pfe0Var2 = this.f159142b;
            BLiveGiftBubbleConfig bLiveGiftBubbleConfig3 = this.f159141a;
            pfe0Var2.m168632p4(bLiveGiftBubbleConfig3.giftItemId, bLiveGiftBubbleConfig3.giftNums);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
        wee0 wee0Var = this.f159143c;
        if (wee0Var != null) {
            wee0Var.destroy();
        }
        DialogC12611a dialogC12611a = this.f159144d;
        if (dialogC12611a != null) {
            dialogC12611a.dismiss();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m179131e(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        this.f159141a = bLiveGiftBubbleConfig;
        if (bLiveGiftBubbleConfig.styleType.toString().equals("common")) {
            this.f159144d = m179129c().m202625x(bLiveGiftBubbleConfig, new qfe0(this));
        } else if (bLiveGiftBubbleConfig.styleType.toString().equals(BLiveBottomPopupStyleTypeEnum.window)) {
            this.f159144d = new qd3(this.f159142b).m173989b0(bLiveGiftBubbleConfig, new qfe0(this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX INFO: renamed from: f */
    public void m179132f(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        this.f159141a = bLiveGiftBubbleConfig;
        if (this.f159143c == null) {
            this.f159143c = new wee0(getAct(), this.f159142b);
        }
        if (TextUtils.isEmpty(bLiveGiftBubbleConfig.iconUrl)) {
            bLiveGiftBubbleConfig.iconUrl = this.f159142b.m206027E2().m132146l0().m60124fp().url;
        }
        this.f159143c.m202904T(bLiveGiftBubbleConfig, this.f159142b, new qfe0(this));
        zvf0.m220402x("e_live_gift_guide", this.f159142b.mo77274R2());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        wee0 wee0Var = this.f159143c;
        if (wee0Var != null && wee0Var.isShowing()) {
            return true;
        }
        DialogC12611a dialogC12611a = this.f159144d;
        return dialogC12611a != null && dialogC12611a.isShowing();
    }
}
