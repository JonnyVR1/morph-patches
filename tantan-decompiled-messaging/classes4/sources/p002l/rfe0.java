package p002l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.live.base.data.BLiveGiftBubbleConfig;
import l.d30;
import l.s7m;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rfe0 implements s7m<pfe0> {

    /* JADX INFO: renamed from: a */
    public BLiveGiftBubbleConfig f18492a;

    /* JADX INFO: renamed from: b */
    public pfe0 f18493b;

    /* JADX INFO: renamed from: c */
    public wee0 f18494c;

    /* JADX INFO: renamed from: d */
    public C0200a f18495d;

    /* JADX INFO: renamed from: e */
    public wc3 f18496e;

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m21912C0() {
        return null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m21918i1(pfe0 pfe0Var) {
        this.f18493b = pfe0Var;
    }

    /* JADX INFO: renamed from: c */
    public final wc3 m21914c() {
        if (this.f18496e == null) {
            this.f18496e = new wc3(this.f18493b);
        }
        return this.f18496e;
    }

    /* JADX INFO: renamed from: d */
    public final void m21915d() {
        d30 d30Var = this.f18492a.extraClickAction;
        if (d30Var != null) {
            d30Var.call();
        }
        BLiveGiftBubbleConfig bLiveGiftBubbleConfig = this.f18492a;
        if (bLiveGiftBubbleConfig == null || TextUtils.isEmpty(bLiveGiftBubbleConfig.button.jumpType.toString())) {
            return;
        }
        String string = this.f18492a.button.jumpType.toString();
        string.getClass();
        if (string.equals("schema")) {
            pfe0 pfe0Var = this.f18493b;
            BLiveGiftBubbleConfig bLiveGiftBubbleConfig2 = this.f18492a;
            pfe0Var.m20210f4(bLiveGiftBubbleConfig2.schema, bLiveGiftBubbleConfig2.type);
        } else {
            if (string.equals("url")) {
                this.f18493b.m20218o4(this.f18492a);
                return;
            }
            pfe0 pfe0Var2 = this.f18493b;
            BLiveGiftBubbleConfig bLiveGiftBubbleConfig3 = this.f18492a;
            pfe0Var2.m20219p4(bLiveGiftBubbleConfig3.giftItemId, bLiveGiftBubbleConfig3.giftNums);
        }
    }

    public void destroy() {
        wee0 wee0Var = this.f18494c;
        if (wee0Var != null) {
            wee0Var.destroy();
        }
        C0200a c0200a = this.f18495d;
        if (c0200a != null) {
            c0200a.dismiss();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m21916e(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        this.f18492a = bLiveGiftBubbleConfig;
        if (bLiveGiftBubbleConfig.styleType.toString().equals("common")) {
            this.f18495d = m21914c().m24491x(bLiveGiftBubbleConfig, new qfe0(this));
        } else if (bLiveGiftBubbleConfig.styleType.toString().equals("window")) {
            this.f18495d = new qd3(this.f18493b).m21215b0(bLiveGiftBubbleConfig, new qfe0(this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX INFO: renamed from: f */
    public void m21917f(BLiveGiftBubbleConfig bLiveGiftBubbleConfig) {
        this.f18492a = bLiveGiftBubbleConfig;
        if (this.f18494c == null) {
            this.f18494c = new wee0(act(), this.f18493b);
        }
        if (TextUtils.isEmpty(bLiveGiftBubbleConfig.iconUrl)) {
            bLiveGiftBubbleConfig.iconUrl = ((Media) this.f18493b.m25547E2().m14582l0().fp()).url;
        }
        this.f18494c.m24537T(bLiveGiftBubbleConfig, this.f18493b, new qfe0(this));
        zvf0.x("e_live_gift_guide", this.f18493b.mo21430R2());
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public boolean isShowing() {
        wee0 wee0Var = this.f18494c;
        if (wee0Var != null && wee0Var.isShowing()) {
            return true;
        }
        a aVar = this.f18495d;
        return aVar != null && aVar.isShowing();
    }
}
