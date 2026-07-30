package p153l;

import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveWealthLogoInfo;
import com.p051p1.mobile.putong.live.external.module.api.LivePrivacyApiProvider;
import com.p051p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p051p1.mobile.putong.live.external.page.setting.privacy.view.HideWealthIconView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J#\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Ll/u4l;", "Ll/yw80;", "Lcom/p1/mobile/putong/live/external/page/setting/privacy/view/HideWealthIconView;", "Ll/kv80;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ll/kv80;)V", "", "o", "()I", "itemView", "", "Q", "(Lcom/p1/mobile/putong/live/external/page/setting/privacy/view/HideWealthIconView;)V", "Ll/vx80;", "presenter", "K", "(Ll/vx80;)V", "R", "Lcom/p1/mobile/putong/live/base/data/BLiveExtraResponse;", "wealthLogoResponse", "", "throwable", "P", "(Lcom/p1/mobile/putong/live/base/data/BLiveExtraResponse;Ljava/lang/Throwable;)V", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class u4l extends yw80<HideWealthIconView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4l(@NotNull kv80 kv80Var) {
        super(4, kv80Var);
        kv80Var.getClass();
    }

    /* JADX INFO: renamed from: N */
    public static void m194488N(u4l u4lVar, Throwable th) {
        u4lVar.m194490P(null, th);
    }

    /* JADX INFO: renamed from: O */
    public static void m194489O(u4l u4lVar, vx80 vx80Var, BLiveExtraResponse bLiveExtraResponse) {
        BLiveWealthLogoInfo bLiveWealthLogoInfo = bLiveExtraResponse.data.wealthLogo;
        if (bLiveWealthLogoInfo == null || !bLiveWealthLogoInfo.canHide) {
            u4lVar.m194490P(bLiveExtraResponse, null);
        } else {
            u4lVar.m194492R(vx80Var);
        }
    }

    @Override // p153l.yw80
    /* JADX INFO: renamed from: K */
    public void mo113838K(@NotNull final vx80 presenter) {
        presenter.getClass();
        super.mo113838K(presenter);
        presenter.duringCreated(LivePrivacyApiProvider.getHideWealthIconRight()).subscribe(dhw.m115826e(new y20() { // from class: l.s4l
            @Override // p153l.y20
            public final void call(Object obj) {
                u4l.m194489O(this.f166252a, presenter, (BLiveExtraResponse) obj);
            }
        }, new y20() { // from class: l.t4l
            @Override // p153l.y20
            public final void call(Object obj) {
                u4l.m194488N(this.f172087a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public final void m194490P(BLiveExtraResponse wealthLogoResponse, Throwable throwable) {
        if (wealthLogoResponse != null) {
            Meta meta = wealthLogoResponse.meta;
            if (meta.code == 43301) {
                o1j0.m165651y(meta.message);
            }
        }
        if (throwable == null || !(throwable instanceof TantanException.Client.CoreService)) {
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) throwable;
        if (coreService.code == 43301) {
            o1j0.m165651y(coreService.metaMessage);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo71749u(@NotNull HideWealthIconView itemView) {
        itemView.getClass();
        super.mo71749u(itemView);
        itemView.m71982i0(this);
    }

    /* JADX INFO: renamed from: R */
    public final void m194492R(vx80 presenter) {
        Act act = presenter.act();
        if (act != null) {
            act.startActivity(LiveIndependentSettingAct.m71882Z1(act, "hide_wealth_icon", new Bundle()));
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193773D0;
    }
}
