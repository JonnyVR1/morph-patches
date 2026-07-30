package p153l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p051p1.mobile.putong.core.newui.home.livewindow.IntlLiveSmallWindow;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveState;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class yl4 extends AbstractC17382h4 {
    public yl4(rql rqlVar, User user, CoreSuggested.UserInfo userInfo) {
        super(rqlVar, user, userInfo);
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: c */
    public boolean mo116206c() {
        return vq8.m202358b() && CoreModule.m30934Q().mo68438a().mo134414f() && !(!TextUtils.isEmpty(CoreModule.f18264c.f20405m0.f20180o2) && TextUtils.equals(CoreModule.f18264c.f20405m0.f20180o2, this.f107714b.f20214id)) && !((gra.m131596L3() && this.f107714b.renderFrom == CardInfoRenderFrom.PROFILE_PREVIEW) || this.f107714b.renderFrom == CardInfoRenderFrom.PROFILE);
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: d */
    public String mo116207d() {
        return "live";
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: h */
    public boolean mo116209h() {
        if (d79.m114691m0() && this.f107715c.mo37882d()) {
            if (!this.f107715c.mo37876b0() && this.f107715c.mo37815E() != null) {
                final IntlLiveSmallWindow intlLiveSmallWindowMo37815E = this.f107715c.mo37815E();
                if (intlLiveSmallWindowMo37815E != null) {
                    bnl0.m105524M(intlLiveSmallWindowMo37815E, true);
                    intlLiveSmallWindowMo37815E.m39742i((Act) this.f107715c.getCardView().getContext(), this.f107713a, this.f107714b.intlLiveCardPartDataWrapper.getCurrentLive(), new x20() { // from class: l.wl4
                        @Override // p153l.x20
                        public final void call() {
                            this.f189635a.m216562n(intlLiveSmallWindowMo37815E);
                        }
                    });
                }
            }
            return false;
        }
        final UserLiveState userLiveStateMo68455lt = CoreModule.m30934Q().mo68455lt(this.f107714b.f20214id);
        CoreModule.m30934Q().mo68435Zl(this.f107714b.f20214id);
        this.f107715c.mo37939u0().setTypeface(Typeface.DEFAULT_BOLD);
        User user = this.f107713a;
        if (user == null || TextUtils.isEmpty(user.f56859id) || !NullChecker.m82486a(CoreModule.m30934Q().getUserLiveId(this.f107713a.f56859id))) {
            return false;
        }
        if (this.f107715c.mo37939u0().getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f107715c.mo37939u0().getLayoutParams();
            layoutParams.leftMargin = qa00.m175859d(18.0f);
            this.f107715c.mo37939u0().setLayoutParams(layoutParams);
        }
        bnl0.m105524M(this.f107715c.mo37912m0(), true);
        if (!this.f107715c.mo37929r0().isAnimating()) {
            SVGALoader.with(this.f107715c.getCardView().getContext()).from("https://auto.tancdn.com/v1/raw/b83d11f9-6b88-41a2-a0dd-c3617bde118510.so").into(this.f107715c.mo37929r0());
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f107713a.liveState.multiCallInfo.onGoingMultiCallId);
        rql rqlVar = this.f107715c;
        if (zIsEmpty) {
            rqlVar.mo37939u0().setText(R$string.f19804xh);
        } else {
            rqlVar.mo37939u0().setText(R$string.f19835yh);
        }
        this.f107715c.mo37912m0().setBackgroundResource(dbc0.f87596y2);
        this.f107715c.mo37912m0().setOnClickListener(new View.OnClickListener() { // from class: l.xl4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194857a.m216563o(userLiveStateMo68455lt, view);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final HashMap<String, Object> m216561m(User user, UserLiveState userLiveState) {
        HashMap<String, Object> map = new HashMap<>();
        boolean z = (userLiveState == null || TextUtils.isEmpty(userLiveState.multiCallInfo.onGoingMultiCallId)) ? false : true;
        map.put("liveId", CoreModule.m30934Q().getUserLiveId(user.f56859id));
        map.put("anchorId", user.f56859id);
        map.put(FirebaseAnalytics.Param.INDEX, "NA");
        map.put("module", OMSTemplateModeType.page);
        map.put("trace_id", "");
        map.put("live_status", (userLiveState == null || !userLiveState.isLiveOpened()) ? BLiveOperationTitleShowType.off : "on");
        map.put("right_recommend_type", "");
        map.put("show_label", z ? "连线" : "");
        map.put("liveRecommendCategory", "basic");
        return map;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m216562n(IntlLiveSmallWindow intlLiveSmallWindow) {
        this.f107715c.setCloseSmallWindow(true);
        bnl0.m105524M(intlLiveSmallWindow, false);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m216563o(UserLiveState userLiveState, View view) {
        if (CoreModule.f18264c.f20405m0.m32023L6(this.f107713a.f56859id)) {
            return;
        }
        CoreModule.m30934Q().startAudienceLive(this.f107715c.getCardView().getContext(), CoreModule.m30934Q().getUserLiveId(this.f107713a.f56859id), "suggest-card", null);
        i4g0.m138521s("e_live_room_enter", "p_suggest_users_home_view", m216561m(this.f107713a, userLiveState));
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: a */
    public void mo116205a() {
    }
}
