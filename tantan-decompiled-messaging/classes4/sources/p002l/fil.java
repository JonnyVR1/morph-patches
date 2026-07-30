package p002l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogTopAnimView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveConfig;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p1.mobile.putong.live.base.data.BLiveSettings;
import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.t100;
import l.xdl0;
import l.ypv;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fil extends LiveMenuDialogHolder<ajl> {

    /* JADX INFO: renamed from: k */
    public FrameLayout f10406k;

    /* JADX INFO: renamed from: l */
    public HourBoardDialogTopAnimView f10407l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f10408m;

    /* JADX INFO: renamed from: n */
    public TabLayout f10409n;

    /* JADX INFO: renamed from: o */
    public ImageView f10410o;

    /* JADX INFO: renamed from: p */
    public View f10411p;

    /* JADX INFO: renamed from: q */
    public VPager f10412q;

    /* JADX INFO: renamed from: r */
    public ajl f10413r;

    /* JADX INFO: renamed from: s */
    public bjl f10414s;

    /* JADX INFO: renamed from: t */
    public BLiveHourLeaderBoard f10415t;

    public fil(@NonNull Act act, ajl ajlVar) {
        super(t6c0.f19874i2, act, ajlVar, j2g0.m15579e(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m13253J(View view) {
        String str;
        BLiveConfig bLiveConfig;
        BLiveConfig bLiveConfig2;
        int currentItem = this.f10412q.getCurrentItem();
        BLiveSettings bLiveSettingsA3 = ypv.k().A3();
        if (currentItem == 0) {
            str = this.f10415t.helperPageUrl;
        } else if (currentItem == 1) {
            str = (bLiveSettingsA3 == null || (bLiveConfig2 = bLiveSettingsA3.liveConfig) == null || TextUtils.isEmpty(bLiveConfig2.liveLeaderboardConfig.dayRuleUrl)) ? "https://m.tantanapp.com/fep/tantan/frontend-live/frontend-live-web-vue/src/apps/videoRoomRule/index.html?speed=true&_bid=1003189#/anchor_daily_board" : bLiveSettingsA3.liveConfig.liveLeaderboardConfig.dayRuleUrl;
        } else {
            str = (bLiveSettingsA3 == null || (bLiveConfig = bLiveSettingsA3.liveConfig) == null || TextUtils.isEmpty(bLiveConfig.liveLeaderboardConfig.weekRuleUrl)) ? "https://m.tantanapp.com/fep/tantan/frontend-live/frontend-live-web-vue/src/apps/videoRoomRule/index.html?speed=true&_bid=1003189#/anchor_week_board" : bLiveSettingsA3.liveConfig.liveLeaderboardConfig.weekRuleUrl;
        }
        this.f10413r.m25548F2().OpenH5Event.open().j(jp50.m16064c(4100).m16094B(str).m16099t(80).m16098s(24).m16095p(CommonH5Builder.BgType.TRAN_GRAY_BG).m16093A(xdl0.y0(), t100.d(574.0f)).m16096q());
    }

    /* JADX INFO: renamed from: N */
    private void m13254N(List<cjl> list) {
        this.f10414s.m10387q(list);
        if (this.f10414s.getCount() <= 1) {
            this.f10409n.setSelectedTabIndicatorColor(16777215);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return this.f10406k.getContext();
    }

    /* JADX INFO: renamed from: G */
    public final void m13255G(View view) {
        gil.m13827a(this, view);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(ajl ajlVar) {
        this.f10413r = ajlVar;
    }

    /* JADX INFO: renamed from: K */
    public void m13257K(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        this.f10415t = bLiveHourLeaderBoard;
    }

    /* JADX INFO: renamed from: L */
    public final void m13258L() {
        if (this.f10414s != null) {
            return;
        }
        this.f10414s = new bjl(null);
        this.f10412q.setScrollble(true);
        this.f10412q.setAdapter(this.f10414s);
        this.f10412q.d(new C0571a());
        this.f10412q.setOffscreenPageLimit(2);
    }

    /* JADX INFO: renamed from: M */
    public void m13259M() {
        m5211E();
        this.f10412q.setCurrentItem(0);
        this.f10407l.m8420l0(true);
    }

    public Act act() {
        return ((ajl) this.f3799b).act();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public void destroy() {
        super.destroy();
        if (NullChecker.a(this.f10407l)) {
            this.f10407l.m8418j0();
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: l */
    public void mo5213l() {
        m13254N(((ajl) this.f3799b).m9825b4());
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        m13255G(view);
        m5207A(80);
        m5222z(LiveDialogEnum.MEMBER);
        this.f10409n.setupWithViewPager(this.f10412q);
        m13258L();
        this.f10407l.m8419k0();
        xdl0.E0(this.f10410o, new View.OnClickListener() { // from class: l.eil
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9811a.m13253J(view2);
            }
        });
    }

    /* JADX INFO: renamed from: l.fil$a */
    public class C0571a implements ViewPager.j {
        public C0571a() {
        }

        public void onPageSelected(int i) {
            ((ajl) fil.this.f3799b).m9827f4(i);
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
