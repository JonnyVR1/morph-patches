package p149l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p046p1.mobile.putong.core.newui.home.livewindow.IntlLiveSmallWindow;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveState;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class zk4 extends AbstractC17222h4 {
    public zk4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: c */
    public boolean mo116769c() {
        return qp8.m175817b() && CoreModule.m29936Q().mo67255a().mo124839f() && !(!TextUtils.isEmpty(CoreModule.f17545c.f19663m0.f19438o2) && TextUtils.equals(CoreModule.f17545c.f19663m0.f19438o2, this.f105775b.f19472id)) && !((upa.m194665L3() && this.f105775b.renderFrom == CardInfoRenderFrom.PROFILE_PREVIEW) || this.f105775b.renderFrom == CardInfoRenderFrom.PROFILE);
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: d */
    public String mo116770d() {
        return "live";
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: h */
    public boolean mo116772h() {
        if (u59.m191833i0() && this.f105776c.mo36879d()) {
            if (!this.f105776c.mo36873b0() && this.f105776c.mo36812E() != null) {
                final IntlLiveSmallWindow intlLiveSmallWindowMo36812E = this.f105776c.mo36812E();
                if (intlLiveSmallWindowMo36812E != null) {
                    xdl0.m208344M(intlLiveSmallWindowMo36812E, true);
                    intlLiveSmallWindowMo36812E.m38739i((Act) this.f105776c.getCardView().getContext(), this.f105774a, this.f105775b.intlLiveCardPartDataWrapper.getCurrentLive(), new d30() { // from class: l.xk4
                        @Override // p149l.d30
                        public final void call() {
                            this.f193262a.m219162n(intlLiveSmallWindowMo36812E);
                        }
                    });
                }
            }
            return false;
        }
        final UserLiveState userLiveStateMo67272lt = CoreModule.m29936Q().mo67272lt(this.f105775b.f19472id);
        CoreModule.m29936Q().mo67252Zl(this.f105775b.f19472id);
        this.f105776c.mo36936u0().setTypeface(Typeface.DEFAULT_BOLD);
        User user = this.f105774a;
        if (user == null || TextUtils.isEmpty(user.f56011id) || !NullChecker.m81303a(CoreModule.m29936Q().getUserLiveId(this.f105774a.f56011id))) {
            return false;
        }
        if (this.f105776c.mo36936u0().getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f105776c.mo36936u0().getLayoutParams();
            layoutParams.leftMargin = t100.m186890d(18.0f);
            this.f105776c.mo36936u0().setLayoutParams(layoutParams);
        }
        xdl0.m208344M(this.f105776c.mo36909m0(), true);
        if (!this.f105776c.mo36926r0().isAnimating()) {
            SVGALoader.with(this.f105776c.getCardView().getContext()).from("https://auto.tancdn.com/v1/raw/b83d11f9-6b88-41a2-a0dd-c3617bde118510.so").into(this.f105776c.mo36926r0());
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f105774a.liveState.multiCallInfo.onGoingMultiCallId);
        gol golVar = this.f105776c;
        if (zIsEmpty) {
            golVar.mo36936u0().setText(R$string.f18426ch);
        } else {
            golVar.mo36936u0().setText(R$string.f18457dh);
        }
        this.f105776c.mo36909m0().setBackgroundResource(x2c0.f190701x2);
        this.f105776c.mo36909m0().setOnClickListener(new View.OnClickListener() { // from class: l.yk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198708a.m219163o(userLiveStateMo67272lt, view);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final HashMap<String, Object> m219161m(User user, UserLiveState userLiveState) {
        HashMap<String, Object> map = new HashMap<>();
        boolean z = (userLiveState == null || TextUtils.isEmpty(userLiveState.multiCallInfo.onGoingMultiCallId)) ? false : true;
        map.put("liveId", CoreModule.m29936Q().getUserLiveId(user.f56011id));
        map.put("anchorId", user.f56011id);
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
    public final /* synthetic */ void m219162n(IntlLiveSmallWindow intlLiveSmallWindow) {
        this.f105776c.setCloseSmallWindow(true);
        xdl0.m208344M(intlLiveSmallWindow, false);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m219163o(UserLiveState userLiveState, View view) {
        if (CoreModule.f17545c.f19663m0.m31020L6(this.f105774a.f56011id)) {
            return;
        }
        CoreModule.m29936Q().startAudienceLive(this.f105776c.getCardView().getContext(), CoreModule.m29936Q().getUserLiveId(this.f105774a.f56011id), "suggest-card", null);
        zvf0.m220397s("e_live_room_enter", "p_suggest_users_home_view", m219161m(this.f105774a, userLiveState));
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: a */
    public void mo116768a() {
    }
}
