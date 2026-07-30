package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardDialogTopAnimView;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VPager;

/* JADX INFO: loaded from: classes4.dex */
public class wkl extends LiveMenuDialogHolder<rll> {

    /* JADX INFO: renamed from: k */
    public FrameLayout f189559k;

    /* JADX INFO: renamed from: l */
    public HourBoardDialogTopAnimView f189560l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f189561m;

    /* JADX INFO: renamed from: n */
    public TabLayout f189562n;

    /* JADX INFO: renamed from: o */
    public ImageView f189563o;

    /* JADX INFO: renamed from: p */
    public View f189564p;

    /* JADX INFO: renamed from: q */
    public VPager f189565q;

    /* JADX INFO: renamed from: r */
    public rll f189566r;

    /* JADX INFO: renamed from: s */
    public sll f189567s;

    /* JADX INFO: renamed from: t */
    public BLiveHourLeaderBoard f189568t;

    public wkl(@NonNull Act act, rll rllVar) {
        super(yec0.f199110i2, act, rllVar, qag0.m175924e(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m206836J(View view) {
        String str;
        BLiveConfig bLiveConfig;
        BLiveConfig bLiveConfig2;
        int currentItem = this.f189565q.getCurrentItem();
        BLiveSettings bLiveSettingsM203370A3 = zrv.m221193k().m203370A3();
        if (currentItem == 0) {
            str = this.f189568t.helperPageUrl;
        } else if (currentItem == 1) {
            str = (bLiveSettingsM203370A3 == null || (bLiveConfig2 = bLiveSettingsM203370A3.liveConfig) == null || TextUtils.isEmpty(bLiveConfig2.liveLeaderboardConfig.dayRuleUrl)) ? "https://m.tantanapp.com/fep/tantan/frontend-live/frontend-live-web-vue/src/apps/videoRoomRule/index.html?speed=true&_bid=1003189#/anchor_daily_board" : bLiveSettingsM203370A3.liveConfig.liveLeaderboardConfig.dayRuleUrl;
        } else {
            str = (bLiveSettingsM203370A3 == null || (bLiveConfig = bLiveSettingsM203370A3.liveConfig) == null || TextUtils.isEmpty(bLiveConfig.liveLeaderboardConfig.weekRuleUrl)) ? "https://m.tantanapp.com/fep/tantan/frontend-live/frontend-live-web-vue/src/apps/videoRoomRule/index.html?speed=true&_bid=1003189#/anchor_week_board" : bLiveSettingsM203370A3.liveConfig.liveLeaderboardConfig.weekRuleUrl;
        }
        this.f189566r.m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(4100).m174141B(str).m174146t(80).m174145s(24).m174142p(CommonH5Builder.BgType.TRAN_GRAY_BG).m174140A(bnl0.m105592y0(), qa00.m175859d(574.0f)).m174143q());
    }

    /* JADX INFO: renamed from: N */
    private void m206837N(List<tll> list) {
        this.f189567s.m186595q(list);
        if (this.f189567s.getCount() <= 1) {
            this.f189562n.setSelectedTabIndicatorColor(16777215);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f189559k.getContext();
    }

    /* JADX INFO: renamed from: G */
    public final void m206838G(View view) {
        xkl.m211402a(this, view);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(rll rllVar) {
        this.f189566r = rllVar;
    }

    /* JADX INFO: renamed from: K */
    public void m206840K(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        this.f189568t = bLiveHourLeaderBoard;
    }

    /* JADX INFO: renamed from: L */
    public final void m206841L() {
        if (this.f189567s != null) {
            return;
        }
        this.f189567s = new sll(null);
        this.f189565q.setScrollble(true);
        this.f189565q.setAdapter(this.f189567s);
        this.f189565q.m4187d(new C21137a());
        this.f189565q.setOffscreenPageLimit(2);
    }

    /* JADX INFO: renamed from: M */
    public void m206842M() {
        m73017E();
        this.f189565q.setCurrentItem(0);
        this.f189560l.m76004l0(true);
    }

    @Override // p153l.iam
    public Act act() {
        return ((rll) this.f48605b).act();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public void destroy() {
        super.destroy();
        if (NullChecker.m82486a(this.f189560l)) {
            this.f189560l.m76002j0();
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: l */
    public void mo73018l() {
        m206837N(((rll) this.f48605b).m182012b4());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        m206838G(view);
        m73014A(80);
        m73027z(LiveDialogEnum.MEMBER);
        this.f189562n.setupWithViewPager(this.f189565q);
        m206841L();
        this.f189560l.m76003k0();
        bnl0.m105509E0(this.f189563o, new View.OnClickListener() { // from class: l.vkl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f184494a.m206836J(view2);
            }
        });
    }

    /* JADX INFO: renamed from: l.wkl$a */
    public class C21137a implements ViewPager.InterfaceC0718j {
        public C21137a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            ((rll) wkl.this.f48605b).m182014f4(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
