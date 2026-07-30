package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogTopAnimView;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VPager;

/* JADX INFO: loaded from: classes4.dex */
public class fil extends LiveMenuDialogHolder<ajl> {

    /* JADX INFO: renamed from: k */
    public FrameLayout f97685k;

    /* JADX INFO: renamed from: l */
    public HourBoardDialogTopAnimView f97686l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f97687m;

    /* JADX INFO: renamed from: n */
    public TabLayout f97688n;

    /* JADX INFO: renamed from: o */
    public ImageView f97689o;

    /* JADX INFO: renamed from: p */
    public View f97690p;

    /* JADX INFO: renamed from: q */
    public VPager f97691q;

    /* JADX INFO: renamed from: r */
    public ajl f97692r;

    /* JADX INFO: renamed from: s */
    public bjl f97693s;

    /* JADX INFO: renamed from: t */
    public BLiveHourLeaderBoard f97694t;

    public fil(@NonNull Act act, ajl ajlVar) {
        super(t6c0.f168378i2, act, ajlVar, j2g0.m139458e(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m121521J(View view) {
        String str;
        BLiveConfig bLiveConfig;
        BLiveConfig bLiveConfig2;
        int currentItem = this.f97691q.getCurrentItem();
        BLiveSettings bLiveSettingsM195583A3 = ypv.m215672k().m195583A3();
        if (currentItem == 0) {
            str = this.f97694t.helperPageUrl;
        } else if (currentItem == 1) {
            str = (bLiveSettingsM195583A3 == null || (bLiveConfig2 = bLiveSettingsM195583A3.liveConfig) == null || TextUtils.isEmpty(bLiveConfig2.liveLeaderboardConfig.dayRuleUrl)) ? "https://m.tantanapp.com/fep/tantan/frontend-live/frontend-live-web-vue/src/apps/videoRoomRule/index.html?speed=true&_bid=1003189#/anchor_daily_board" : bLiveSettingsM195583A3.liveConfig.liveLeaderboardConfig.dayRuleUrl;
        } else {
            str = (bLiveSettingsM195583A3 == null || (bLiveConfig = bLiveSettingsM195583A3.liveConfig) == null || TextUtils.isEmpty(bLiveConfig.liveLeaderboardConfig.weekRuleUrl)) ? "https://m.tantanapp.com/fep/tantan/frontend-live/frontend-live-web-vue/src/apps/videoRoomRule/index.html?speed=true&_bid=1003189#/anchor_week_board" : bLiveSettingsM195583A3.liveConfig.liveLeaderboardConfig.weekRuleUrl;
        }
        this.f97692r.m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(4100).m142598B(str).m142603t(80).m142602s(24).m142599p(CommonH5Builder.BgType.TRAN_GRAY_BG).m142597A(xdl0.m208412y0(), t100.m186890d(574.0f)).m142600q());
    }

    /* JADX INFO: renamed from: N */
    private void m121522N(List<cjl> list) {
        this.f97693s.m102186q(list);
        if (this.f97693s.getCount() <= 1) {
            this.f97688n.setSelectedTabIndicatorColor(16777215);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f97685k.getContext();
    }

    /* JADX INFO: renamed from: G */
    public final void m121523G(View view) {
        gil.m126355a(this, view);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ajl ajlVar) {
        this.f97692r = ajlVar;
    }

    /* JADX INFO: renamed from: K */
    public void m121525K(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        this.f97694t = bLiveHourLeaderBoard;
    }

    /* JADX INFO: renamed from: L */
    public final void m121526L() {
        if (this.f97693s != null) {
            return;
        }
        this.f97693s = new bjl(null);
        this.f97691q.setScrollble(true);
        this.f97691q.setAdapter(this.f97693s);
        this.f97691q.m4185d(new C16846a());
        this.f97691q.setOffscreenPageLimit(2);
    }

    /* JADX INFO: renamed from: M */
    public void m121527M() {
        m71834E();
        this.f97691q.setCurrentItem(0);
        this.f97686l.m74821l0(true);
    }

    @Override // p149l.s7m
    public Act act() {
        return ((ajl) this.f47757b).act();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public void destroy() {
        super.destroy();
        if (NullChecker.m81303a(this.f97686l)) {
            this.f97686l.m74819j0();
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: l */
    public void mo71835l() {
        m121522N(((ajl) this.f47757b).m96986b4());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        m121523G(view);
        m71831A(80);
        m71844z(LiveDialogEnum.MEMBER);
        this.f97688n.setupWithViewPager(this.f97691q);
        m121526L();
        this.f97686l.m74820k0();
        xdl0.m208329E0(this.f97689o, new View.OnClickListener() { // from class: l.eil
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f91613a.m121521J(view2);
            }
        });
    }

    /* JADX INFO: renamed from: l.fil$a */
    public class C16846a implements ViewPager.InterfaceC0716j {
        public C16846a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            ((ajl) fil.this.f47757b).m96988f4(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
