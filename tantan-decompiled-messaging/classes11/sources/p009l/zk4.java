package p009l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.home.livewindow.IntlLiveSmallWindow;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveState;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.d30;
import l.qp8;
import l.t100;
import l.u59;
import l.upa;
import l.x2c0;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class zk4 extends AbstractC0925h4 {
    public zk4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: c */
    public boolean mo13954c() {
        return qp8.b() && CoreModule.Q().m9040a().m14851f() && !(!TextUtils.isEmpty(CoreModule.c.m0.o2) && TextUtils.equals(CoreModule.c.m0.o2, this.f13855b.id)) && !((upa.L3() && this.f13855b.renderFrom == CardInfoRenderFrom.PROFILE_PREVIEW) || this.f13855b.renderFrom == CardInfoRenderFrom.PROFILE);
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: d */
    public String mo13955d() {
        return "live";
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: h */
    public boolean mo13957h() {
        if (u59.i0() && this.f13856c.mo840d()) {
            if (!this.f13856c.mo834b0() && this.f13856c.mo768E() != null) {
                final IntlLiveSmallWindow intlLiveSmallWindowMo768E = this.f13856c.mo768E();
                if (intlLiveSmallWindowMo768E != null) {
                    xdl0.M(intlLiveSmallWindowMo768E, true);
                    intlLiveSmallWindowMo768E.m2727i((Act) this.f13856c.getCardView().getContext(), this.f13854a, this.f13855b.intlLiveCardPartDataWrapper.getCurrentLive(), new d30() { // from class: l.xk4
                        public final void call() {
                            this.f22635a.m25843n(intlLiveSmallWindowMo768E);
                        }
                    });
                }
            }
            return false;
        }
        final UserLiveState userLiveStateM9057lt = CoreModule.Q().m9057lt(this.f13855b.id);
        CoreModule.Q().m9037Zl(this.f13855b.id);
        this.f13856c.mo903u0().setTypeface(Typeface.DEFAULT_BOLD);
        User user = this.f13854a;
        if (user == null || TextUtils.isEmpty(((DbObject) user).id) || !NullChecker.a(CoreModule.Q().getUserLiveId(((DbObject) this.f13854a).id))) {
            return false;
        }
        if (this.f13856c.mo903u0().getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f13856c.mo903u0().getLayoutParams();
            layoutParams.leftMargin = t100.d(18.0f);
            this.f13856c.mo903u0().setLayoutParams(layoutParams);
        }
        xdl0.M(this.f13856c.mo873m0(), true);
        if (!this.f13856c.mo892r0().isAnimating()) {
            SVGALoader.with(this.f13856c.getCardView().getContext()).from("https://auto.tancdn.com/v1/raw/b83d11f9-6b88-41a2-a0dd-c3617bde118510.so").into(this.f13856c.mo892r0());
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f13854a.liveState.multiCallInfo.onGoingMultiCallId);
        gol golVar = this.f13856c;
        if (zIsEmpty) {
            golVar.mo903u0().setText(R.string.ch);
        } else {
            golVar.mo903u0().setText(R.string.dh);
        }
        this.f13856c.mo873m0().setBackgroundResource(x2c0.x2);
        this.f13856c.mo873m0().setOnClickListener(new View.OnClickListener() { // from class: l.yk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23112a.m25844o(userLiveStateM9057lt, view);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final HashMap<String, Object> m25842m(User user, UserLiveState userLiveState) {
        HashMap<String, Object> map = new HashMap<>();
        boolean z = (userLiveState == null || TextUtils.isEmpty(userLiveState.multiCallInfo.onGoingMultiCallId)) ? false : true;
        map.put("liveId", CoreModule.Q().getUserLiveId(((DbObject) user).id));
        map.put("anchorId", ((DbObject) user).id);
        map.put("index", "NA");
        map.put("module", "page");
        map.put("trace_id", "");
        map.put("live_status", (userLiveState == null || !userLiveState.isLiveOpened()) ? "off" : "on");
        map.put("right_recommend_type", "");
        map.put("show_label", z ? "连线" : "");
        map.put("liveRecommendCategory", "basic");
        return map;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m25843n(IntlLiveSmallWindow intlLiveSmallWindow) {
        this.f13856c.setCloseSmallWindow(true);
        xdl0.M(intlLiveSmallWindow, false);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m25844o(UserLiveState userLiveState, View view) {
        if (CoreModule.c.m0.L6(((DbObject) this.f13854a).id)) {
            return;
        }
        CoreModule.Q().startAudienceLive(this.f13856c.getCardView().getContext(), CoreModule.Q().getUserLiveId(((DbObject) this.f13854a).id), "suggest-card", null);
        zvf0.s("e_live_room_enter", "p_suggest_users_home_view", m25842m(this.f13854a, userLiveState));
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: a */
    public void mo13953a() {
    }
}
