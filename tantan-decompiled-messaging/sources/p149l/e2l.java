package p149l;

import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveWealthLogoInfo;
import com.p046p1.mobile.putong.live.external.module.api.LivePrivacyApiProvider;
import com.p046p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p046p1.mobile.putong.live.external.page.setting.privacy.view.HideWealthIconView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J#\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m87232d2 = {"Ll/e2l;", "Ll/uo80;", "Lcom/p1/mobile/putong/live/external/page/setting/privacy/view/HideWealthIconView;", "Ll/gn80;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ll/gn80;)V", "", "o", "()I", "itemView", "", "Q", "(Lcom/p1/mobile/putong/live/external/page/setting/privacy/view/HideWealthIconView;)V", "Ll/rp80;", "presenter", "K", "(Ll/rp80;)V", "R", "Lcom/p1/mobile/putong/live/base/data/BLiveExtraResponse;", "wealthLogoResponse", "", "throwable", "P", "(Lcom/p1/mobile/putong/live/base/data/BLiveExtraResponse;Ljava/lang/Throwable;)V", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class e2l extends uo80<HideWealthIconView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2l(@NotNull gn80 gn80Var) {
        super(4, gn80Var);
        gn80Var.getClass();
    }

    /* JADX INFO: renamed from: N */
    public static void m114503N(e2l e2lVar, Throwable th) {
        e2lVar.m114506P(null, th);
    }

    /* JADX INFO: renamed from: O */
    public static void m114504O(e2l e2lVar, rp80 rp80Var, BLiveExtraResponse bLiveExtraResponse) {
        BLiveWealthLogoInfo bLiveWealthLogoInfo = bLiveExtraResponse.data.wealthLogo;
        if (bLiveWealthLogoInfo == null || !bLiveWealthLogoInfo.canHide) {
            e2lVar.m114506P(bLiveExtraResponse, null);
        } else {
            e2lVar.m114508R(rp80Var);
        }
    }

    @Override // p149l.uo80
    /* JADX INFO: renamed from: K */
    public void mo114505K(@NotNull final rp80 presenter) {
        presenter.getClass();
        super.mo114505K(presenter);
        presenter.duringCreated(LivePrivacyApiProvider.getHideWealthIconRight()).subscribe(ffw.m121194e(new e30() { // from class: l.c2l
            @Override // p149l.e30
            public final void call(Object obj) {
                e2l.m114504O(this.f78367a, presenter, (BLiveExtraResponse) obj);
            }
        }, new e30() { // from class: l.d2l
            @Override // p149l.e30
            public final void call(Object obj) {
                e2l.m114503N(this.f83417a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public final void m114506P(BLiveExtraResponse wealthLogoResponse, Throwable throwable) {
        if (wealthLogoResponse != null) {
            Meta meta = wealthLogoResponse.meta;
            if (meta.code == 43301) {
                lsi0.m151595y(meta.message);
            }
        }
        if (throwable == null || !(throwable instanceof TantanException.Client.CoreService)) {
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) throwable;
        if (coreService.code == 43301) {
            lsi0.m151595y(coreService.metaMessage);
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo70566u(@NotNull HideWealthIconView itemView) {
        itemView.getClass();
        super.mo70566u(itemView);
        itemView.m70799i0(this);
    }

    /* JADX INFO: renamed from: R */
    public final void m114508R(rp80 presenter) {
        Act act = presenter.act();
        if (act != null) {
            act.startActivity(LiveIndependentSettingAct.m70699Y1(act, "hide_wealth_icon", new Bundle()));
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162659D0;
    }
}
