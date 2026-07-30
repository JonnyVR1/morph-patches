package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveOwner;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.LiveScrollViewContainer;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p046p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.p046p1.mobile.putong.live.livingroom.view.RightSideViewGroup;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class l8d0 extends jq2<o8d0> {

    /* JADX INFO: renamed from: a */
    public final BLiveAbsData f126803a;

    /* JADX INFO: renamed from: b */
    public String f126804b;

    /* JADX INFO: renamed from: c */
    public final zgt f126805c;

    /* JADX INFO: renamed from: d */
    public final aht f126806d;

    /* JADX INFO: renamed from: e */
    public final String f126807e;

    /* JADX INFO: renamed from: f */
    public final x7d0 f126808f;

    /* JADX INFO: renamed from: g */
    public final mbd0 f126809g;

    /* JADX INFO: renamed from: h */
    public ho2 f126810h;

    /* JADX INFO: renamed from: i */
    public final RoomFrag f126811i;

    /* JADX INFO: renamed from: j */
    public a8s f126812j;

    /* JADX INFO: renamed from: k */
    public btk f126813k;

    /* JADX INFO: renamed from: l */
    public long f126814l;

    /* JADX INFO: renamed from: m */
    public boolean f126815m;

    /* JADX INFO: renamed from: n */
    public boolean f126816n;

    /* JADX INFO: renamed from: o */
    public z1j f126817o;

    /* JADX INFO: renamed from: p */
    public final boolean f126818p;

    public l8d0(RoomFrag roomFrag, ho2 ho2Var, AudienceStartData audienceStartData) {
        super(roomFrag);
        this.f126811i = roomFrag;
        this.f126810h = ho2Var;
        BLiveAbsData bLiveAbsData = audienceStartData.live;
        this.f126803a = bLiveAbsData;
        String str = audienceStartData.category;
        this.f126807e = str;
        this.f126804b = audienceStartData.traceId;
        this.f126818p = audienceStartData.handleEnterRoomResult;
        zgt zgtVar = new zgt(audienceStartData.source);
        this.f126805c = zgtVar;
        zgtVar.m218709t(audienceStartData.showSignInDialog);
        zgtVar.m218706q(audienceStartData.open);
        zgtVar.m218707r(bLiveAbsData.getRecommendCategoryForTrack());
        zgtVar.m218712w(audienceStartData.voiceEnterType);
        zgtVar.m218703n(audienceStartData.liveSchema);
        zgtVar.m218705p(audienceStartData.isOfficialShowAnchor);
        aht ahtVar = new aht();
        this.f126806d = ahtVar;
        this.f126808f = new x7d0(roomFrag, bLiveAbsData, zgtVar);
        this.f126812j = new a8s(roomFrag, this, zgtVar);
        this.f126813k = new btk();
        this.f126817o = new z1j(roomFrag, str, audienceStartData);
        mbd0 mbd0Var = new mbd0(this, roomFrag, audienceStartData, zgtVar, ahtVar);
        this.f126809g = mbd0Var;
        mbd0Var.m153880m(ho2Var);
        hfw.m130790a("[live]push", zgtVar.f203084b);
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m148861o0(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public String m148863A0() {
        return this.f126805c.f203084b;
    }

    /* JADX INFO: renamed from: B1 */
    public void m148864B1(boolean z, LiveScrollViewContainer liveScrollViewContainer, boolean z2, JumpRoomData jumpRoomData) {
        h5j0.INSTANCE.m129405d("live_swipe_in_room_rtc");
        this.f126812j.m95358a();
        if (jumpRoomData != null) {
            m148920z1(jumpRoomData, liveScrollViewContainer);
            return;
        }
        j760<BLiveAbsData, JumpRoomData> j760VarMo131643c = this.f126808f.m207275q().mo131643c(z);
        BLiveAbsData bLiveAbsDataM207276r = this.f126808f.m207276r();
        BLiveAbsData bLiveAbsData = j760VarMo131643c.f116564a;
        if (bLiveAbsData == null) {
            return;
        }
        JumpRoomData jumpRoomData2 = j760VarMo131643c.f116565b;
        AbstractC15533a6 abstractC15533a6M148920z1 = jumpRoomData2 != null ? m148920z1(jumpRoomData2, liveScrollViewContainer) : m148920z1(new JumpRoomData.C12761a().m73026o(bLiveAbsData).m73032u(this.f126805c.m218692c()).m73025n(JumpRoomType.USER_SWIPE).m73024m(), liveScrollViewContainer);
        if (z2) {
            return;
        }
        abstractC15533a6M148920z1.m206028F2().AvatarEvent.onScrollNext().mo172463j(vwb.m200311Y(Boolean.valueOf(z), bLiveAbsData.room.f44419id));
        if (bLiveAbsDataM207276r == null) {
            return;
        }
        zcu.m218091f(kht.m145995c().m146010m(bLiveAbsDataM207276r, bLiveAbsData).m146014q(this.f126805c.m218696g()).m146016s(this.f126805c.f203084b).m146018u(this.f126805c.m218692c()).m146020w(z ? "up" : "down").m146015r(this.f126808f.m207265B(bLiveAbsData.f44323id)).m146021x(this.f126805c.m218699j()).m146019v(bLiveAbsData.getRecommendCategoryForTrack()).m146009l(), pageId());
        m148868D1(bLiveAbsData, z ? "swipe_up" : "swipe_down", abstractC15533a6M148920z1.mo77274R2(), bLiveAbsDataM207276r);
    }

    /* JADX INFO: renamed from: C0 */
    public String m148865C0() {
        return this.f126807e;
    }

    /* JADX INFO: renamed from: C1 */
    public final void m148866C1(r8d0 r8d0Var) {
        kht.C18020a c18020aM146017t = kht.m145995c().m146015r(0).m146021x(this.f126805c.m218699j()).m146019v(r8d0Var.f187610c.getRecommendCategoryForTrack()).m146016s(this.f126805c.f203084b).m146018u(this.f126805c.m218692c()).m146017t(r8d0Var.f187610c.f44323id);
        User user = r8d0Var.f187608a;
        zcu.m218091f(c18020aM146017t.m146011n(user == null ? "" : user.f56011id).m146014q(this.f126805c.m218696g()).m146020w("default").m146009l(), pageId());
    }

    /* JADX INFO: renamed from: D0 */
    public RightSideViewGroup.C12940d m148867D0() {
        return ((o8d0) this.viewModel).m163122k();
    }

    /* JADX INFO: renamed from: D1 */
    public final void m148868D1(BLiveAbsData bLiveAbsData, String str, String str2, BLiveAbsData bLiveAbsData2) {
        h7d0.C17241a c17241aM129673l = h7d0.m129655x().m129663b(bLiveAbsData).m129684w(str).m129673l(this.f126808f.m207265B(bLiveAbsData.f44323id));
        BLiveOwner bLiveOwner = bLiveAbsData2.anchor;
        if (bLiveOwner != null) {
            c17241aM129673l.m129672k(bLiveOwner.f44419id);
        } else {
            CrashHelper.m81296c(new NullPointerException("Null oldLive Anchor occurs in RoomFragPresenter.trackRoomEnter"));
        }
        zcu.m218093h(c17241aM129673l.m129662a(), str2);
    }

    /* JADX INFO: renamed from: E0 */
    public x7d0 m148869E0() {
        return this.f126808f;
    }

    /* JADX INFO: renamed from: E1 */
    public final void m148870E1(final String str) {
        ((o8d0) this.viewModel).m163130v(true);
        ((o8d0) this.viewModel).f142611a.post(new Runnable() { // from class: l.i8d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f112029a.m148892d1(str);
            }
        });
    }

    /* JADX INFO: renamed from: F0 */
    public final String m148871F0() {
        BLiveAbsData bLiveAbsData;
        return (vdt.m198092b(2) || (bLiveAbsData = this.f126803a) == null || !bLiveAbsData.isVoiceLive()) ? ypv.f199497e.getString(R$string.f47377m0) : ypv.f199497e.getString(R$string.f47399n0);
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m148872F1() {
        if (this.f126803a.isVoiceLive()) {
            return false;
        }
        return this.f126813k.m103859e(this.f126803a);
    }

    /* JADX INFO: renamed from: G0 */
    public void m148873G0() {
        ((o8d0) this.viewModel).m163124m();
    }

    /* JADX INFO: renamed from: H0 */
    public void m148874H0(Act act) {
        m148904p1();
        duringCreated(ConnectivityReceiver.m81290m()).map(new w9j() { // from class: l.e8d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81287j());
            }
        }).distinctUntilChanged().subscribe(ffw.m121194e(new e30() { // from class: l.f8d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96342a.m148886W0((Boolean) obj);
            }
        }, new e30() { // from class: l.g8d0
            @Override // p149l.e30
            public final void call(Object obj) {
                l8d0.m148861o0((Throwable) obj);
            }
        }));
        if (ConnectivityReceiver.m81287j()) {
            lsi0.m151564B(m148871F0(), false, true);
        }
        act.addSwipeBackListener(new C18167a());
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: I0 */
    public void m148875I0() {
        l8d0 l8d0Var;
        h5j0 h5j0Var = h5j0.INSTANCE;
        h5j0Var.m129405d("enter_live_room");
        h5j0Var.m129405d("enter_voice_room");
        m148918y0().mo95105m(true);
        if (this.f126803a.isVoiceLive()) {
            ((o8d0) this.viewModel).m163130v(false);
            ((o8d0) this.viewModel).m163131w(false, false);
        }
        BLiveAbsData bLiveAbsDataMo149813j = m148918y0().m206027E2().mo149813j();
        AbstractC15533a6 abstractC15533a6M148918y0 = m148918y0();
        if (!this.f126816n) {
            abstractC15533a6M148918y0.m95103h4(this.f126804b);
            abstractC15533a6M148918y0.mo95104i4();
            h5j0Var.m129404c("enter_live_room", "roomPresenter.start()");
            h5j0Var.m129404c("enter_voice_room", "roomPresenter.start()");
        }
        this.f126816n = true;
        BLiveAbsData bLiveAbsData = this.f126803a;
        if (bLiveAbsDataMo149813j != null) {
            m148879O0(abstractC15533a6M148918y0, bLiveAbsData, new e30() { // from class: l.c8d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f79748a.m148899k1((r8d0) obj);
                }
            });
            l8d0Var = this;
        } else {
            l8d0Var = this;
            l8d0Var.m148878N0(abstractC15533a6M148918y0, true, bLiveAbsData, new e30() { // from class: l.d8d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f84862a.m148887X0((r8d0) obj);
                }
            }, new e30() { // from class: l.c8d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f79748a.m148899k1((r8d0) obj);
                }
            });
        }
        l8d0Var.m148906q1();
    }

    /* JADX INFO: renamed from: J0 */
    public final void m148876J0(AbstractC15533a6 abstractC15533a6, BLiveAbsData bLiveAbsData, e30<r8d0> e30Var) {
        m148878N0(abstractC15533a6, false, bLiveAbsData, null, e30Var);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m148877L0(AbstractC15533a6 abstractC15533a6, BLiveAbsData bLiveAbsData, final boolean z) {
        m148876J0(abstractC15533a6, bLiveAbsData, new e30() { // from class: l.b8d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74095a.m148888Y0(z, (r8d0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: N0 */
    public final void m148878N0(AbstractC15533a6 abstractC15533a6, boolean z, BLiveAbsData bLiveAbsData, e30<r8d0> e30Var, e30<r8d0> e30Var2) {
        h5j0 h5j0Var = h5j0.INSTANCE;
        h5j0Var.m129404c("live_enter_room_rtc", "RoomFragPresenter:initRoomInfo");
        h5j0Var.m129404c("live_enter_room_cdn", "RoomFragPresenter:initRoomInfo");
        abstractC15533a6.mo95098c4(bLiveAbsData);
        h5j0Var.m129404c("enter_live_room", "roomPresenter.quickPlay(live)");
        m148914u1(bLiveAbsData);
        abstractC15533a6.mo95088S3(bLiveAbsData, z, e30Var, e30Var2, this.f126818p);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m148879O0(AbstractC15533a6 abstractC15533a6, BLiveAbsData bLiveAbsData, e30<r8d0> e30Var) {
        abstractC15533a6.mo95098c4(bLiveAbsData);
        abstractC15533a6.mo95089T3(e30Var);
        m148914u1(bLiveAbsData);
    }

    /* JADX INFO: renamed from: P0 */
    public boolean m148880P0(int i) {
        return m148918y0().mo95090U3(i);
    }

    /* JADX INFO: renamed from: Q0 */
    public boolean m148881Q0() {
        AbstractC15533a6 abstractC15533a6M148918y0 = m148918y0();
        return abstractC15533a6M148918y0 != null && abstractC15533a6M148918y0.mo95091V3();
    }

    /* JADX INFO: renamed from: R0 */
    public boolean m148882R0() {
        return ((o8d0) this.viewModel).m163126p();
    }

    /* JADX INFO: renamed from: S0 */
    public boolean m148883S0() {
        return this.f126815m;
    }

    /* JADX INFO: renamed from: U0 */
    public boolean m148884U0() {
        return this.f126808f.m207278t().m114613g() < ypv.m215672k().m195896n5();
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: V0 */
    public void m148885V0(JumpRoomData jumpRoomData) {
        if (jumpRoomData == null) {
            return;
        }
        if (jumpRoomData.getJumpRoomType() == JumpRoomType.CHANGE_SOURCE_WITH_BACK && TextUtils.isEmpty(jumpRoomData.getOldSource())) {
            jumpRoomData.setOldSource(m148918y0().m206027E2().mo132155o0());
        }
        if (!m148893e1(1) || "chatHall".equals(jumpRoomData.getSource())) {
            BLiveAbsData bLiveAbsDataMo149813j = m148918y0().m206027E2().mo149813j();
            if (jumpRoomData.getLive() == null || bLiveAbsDataMo149813j == null || !jumpRoomData.getLive().f44323id.equals(bLiveAbsDataMo149813j.f44323id)) {
                if (jumpRoomData.getLive() == null) {
                    BLiveAbsData bLiveVoice = TextUtils.equals(BLiveAbsData.VOICE_LIVE, jumpRoomData.getLiveType()) ? new BLiveVoice() : new BLive();
                    bLiveVoice.f44323id = jumpRoomData.getToLiveId();
                    BLiveOwner bLiveOwner = new BLiveOwner();
                    bLiveVoice.room = bLiveOwner;
                    bLiveOwner.f44419id = jumpRoomData.getToRoomId();
                    if (TextUtils.isEmpty(jumpRoomData.getSource())) {
                        jumpRoomData.setSource(this.f126805c.f203084b);
                    }
                    jumpRoomData.setLive(bLiveVoice);
                    if (TextUtils.isEmpty(bLiveVoice.f44323id) && TextUtils.isEmpty(bLiveVoice.room.f44419id)) {
                        return;
                    }
                }
                ((o8d0) this.viewModel).m163128s(jumpRoomData);
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m148886W0(Boolean bool) {
        if (bool.booleanValue()) {
            lsi0.m151564B(m148871F0(), false, true);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m148887X0(r8d0 r8d0Var) {
        m148895g1(this.f126803a, r8d0Var);
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m148888Y0(boolean z, r8d0 r8d0Var) {
        this.f126808f.m207283y(r8d0Var, z);
        if (z) {
            m148866C1(r8d0Var);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ void m148889a1(AbstractC15533a6 abstractC15533a6, iqv iqvVar) {
        abstractC15533a6.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(200).m206701e(this.f126805c.m218693d()).m206699c());
    }

    /* JADX INFO: renamed from: b1 */
    public final /* synthetic */ void m148890b1(hqv hqvVar) {
        BLiveSuggestLive bLiveSuggestLiveM132599l;
        int iMo131644d = this.f126808f.m207275q().mo131644d() + 1;
        if (iMo131644d < 0 || iMo131644d >= hqvVar.m132601n()) {
            HashSet hashSet = new HashSet();
            hashSet.add(this.f126808f.m207275q().mo131645e().f44323id);
            if (this.f126808f.m207276r() != null) {
                hashSet.add(this.f126808f.m207276r().f44323id);
            }
            bLiveSuggestLiveM132599l = hqvVar.m132599l(hashSet);
        } else {
            bLiveSuggestLiveM132599l = hqvVar.m132596i(iMo131644d);
        }
        if (bLiveSuggestLiveM132599l == null) {
            return;
        }
        this.f126812j.m95359b(bLiveSuggestLiveM132599l);
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m148891c1(Bundle bundle) {
        ho2 ho2Var = this.f126810h;
        BLiveAbsData bLiveAbsDataMo149813j = ho2Var == null ? this.f126803a : ho2Var.mo149813j();
        this.f126809g.m153881n(((o8d0) this.viewModel).f142612b);
        this.f126809g.m153877j(bLiveAbsDataMo149813j, ((o8d0) this.viewModel).m163121j());
        m148875I0();
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m148892d1(String str) {
        if (vdt.m198092b(2)) {
            fze0 fze0Var = new fze0();
            if (fze0Var.m123828b(str)) {
                ((o8d0) this.viewModel).m163131w(true, false);
                fze0Var.m123827a();
                return;
            }
            return;
        }
        lbp lbpVar = new lbp();
        if (lbpVar.m149261c(str)) {
            ((o8d0) this.viewModel).m163131w(true, false);
            lbpVar.m149259a();
        }
    }

    @Override // p149l.q0m
    public void destroy() {
        m148918y0().mo69117n();
        this.f126817o.mo111727s2();
        this.f126812j.m95360c();
        this.f126813k.m103857c();
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m148893e1(int i) {
        return m148918y0().mo95093X3(i);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.bsm] */
    /* JADX INFO: renamed from: f1 */
    public boolean m148894f1() {
        AbstractC15533a6 abstractC15533a6M148918y0 = m148918y0();
        if (abstractC15533a6M148918y0 == null) {
            return false;
        }
        if (r610.m178008m(abstractC15533a6M148918y0.m154638K3())) {
            abstractC15533a6M148918y0.m206028F2().MultiCallEvent.openMatchStayDlg().mo172463j(Boolean.TRUE);
            return true;
        }
        if (m148893e1(2)) {
            return true;
        }
        if (((o8d0) this.viewModel).m163123l()) {
            m148873G0();
        }
        if (!m148872F1()) {
            return abstractC15533a6M148918y0.mo95094Y3(!m148883S0(), false);
        }
        m148917x1();
        return true;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m148895g1(BLiveAbsData bLiveAbsData, r8d0 r8d0Var) {
        if ((r8d0Var.f187610c instanceof BLive) && TextUtils.equals(bLiveAbsData.f44323id, User.ID_TEAM_ACCOUNT)) {
            this.f126805c.m218708s(((BLive) r8d0Var.f187610c).source);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.bsm] */
    /* JADX INFO: renamed from: h1 */
    public void m148896h1() {
        if (r610.m178008m(m148918y0().m154638K3())) {
            m148918y0().m206028F2().MultiCallEvent.openMatchStayDlg().mo172463j(Boolean.TRUE);
            return;
        }
        if (m148893e1(2)) {
            return;
        }
        if (m148872F1()) {
            m148917x1();
        } else {
            if (m148918y0().mo95094Y3(!m148883S0(), true)) {
                return;
            }
            r610.m177973H(m148918y0());
            m148913u0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: i1 */
    public final void m148897i1(r8d0 r8d0Var) {
        final AbstractC15533a6 abstractC15533a6M148918y0 = m148918y0();
        if (TextUtils.equals("DanmuChat", this.f126805c.m218695f())) {
            abstractC15533a6M148918y0.m206028F2().ChatEvent.chatInputClick().mo172463j(new wu4(true, "").m205592b("1"));
        } else {
            if (TextUtils.isEmpty(this.f126805c.m218693d())) {
                return;
            }
            duringCreated(abstractC15533a6M148918y0.m206027E2().mo149827y()).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.a8d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f68035a.m148889a1(abstractC15533a6M148918y0, (iqv) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m148898j1() {
        if (!m148881Q0()) {
            x680.m207168a().m207172e(true);
        }
        if (m148918y0() != null) {
            m148918y0().mo95099d4("exit");
        }
        this.f126817o.destroy();
        long jM155944o = mqi0.m155944o();
        try {
            LiveWatchCounter.m76330h().m76331e(this.f126814l, jM155944o);
        } catch (Exception e) {
            hfw.m130790a("[live]leaveRoom", "startTime: " + this.f126814l + ",currentTime :" + jM155944o);
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m148899k1(r8d0 r8d0Var) {
        if (r8d0Var.f187610c.isNormalLive() && !t7t.m187504d(r8d0Var.f187610c)) {
            m148915v1(this.f126805c.f203084b, r8d0Var);
            e51.m114743H(act(), new Runnable() { // from class: l.h8d0
                @Override // java.lang.Runnable
                public final void run() {
                    LiveWatchCounter.m76330h().m76340o();
                }
            }, 3000L);
        }
        this.f126808f.m207283y(r8d0Var, true);
        m148897i1(r8d0Var);
        m148866C1(r8d0Var);
    }

    /* JADX INFO: renamed from: l1 */
    public void m148900l1() {
        if (m148863A0().contains("group_profile_fans") || ((o8d0) this.viewModel).m163126p()) {
            return;
        }
        duringCreated(this.f126808f.m207274p().mo96934g()).filter(new w9j() { // from class: l.j8d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((hqv) obj).m132601n() > 0);
            }
        }).take(1).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.k8d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121800a.m148890b1((hqv) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m1 */
    public j760<Boolean, BLiveAbsData> m148901m1(boolean z) {
        return this.f126808f.m207275q().mo131641a(z);
    }

    /* JADX INFO: renamed from: n1 */
    public void m148902n1() {
        creates(new e30() { // from class: l.z7d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202002a.m148891c1((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o1 */
    public void m148903o1(boolean z) {
        BLiveAbsData bLiveAbsDataMo131642b = this.f126808f.m207275q().mo131642b(z);
        if (bLiveAbsDataMo131642b == null || !bLiveAbsDataMo131642b.isLiving()) {
            return;
        }
        if (((o8d0) this.viewModel).m163120i().getPresenter() == null || !((o8d0) this.viewModel).m163120i().getPresenter().mo95092W3()) {
            this.f126809g.m153876i(bLiveAbsDataMo131642b, ((o8d0) this.viewModel).m163120i()).mo95097b4(z, bLiveAbsDataMo131642b);
        }
    }

    /* JADX INFO: renamed from: p1 */
    public final void m148904p1() {
        BLiveAbsData bLiveAbsData = this.f126803a;
        if (bLiveAbsData == null || !bLiveAbsData.isNormalLive()) {
            return;
        }
        fld0<hdv> fld0Var = fld0.f98150e;
        ((hdv) ypv.m215673l(fld0Var)).f107296b.put(Long.valueOf(mqi0.m155944o()));
        if (((hdv) ypv.m215673l(fld0Var)).f107297c.get().longValue() == 0) {
            ((hdv) ypv.m215673l(fld0Var)).f107297c.put(Long.valueOf(mqi0.m155944o()));
        }
    }

    public String pageId() {
        return this.f126805c.m218694e().equals("live") ? "p_user_live_room" : "p_user_audio_room";
    }

    /* JADX INFO: renamed from: q0 */
    public void m148905q0(RightSideViewGroup.InterfaceC12939c interfaceC12939c) {
        ((o8d0) this.viewModel).m163118e(interfaceC12939c);
    }

    /* JADX INFO: renamed from: q1 */
    public final void m148906q1() {
        this.f126814l = mqi0.m155944o();
    }

    /* JADX INFO: renamed from: r0 */
    public void m148907r0(r8d0 r8d0Var) {
        this.f126808f.m207271m(r8d0Var);
    }

    /* JADX INFO: renamed from: r1 */
    public void m148908r1() {
        AbstractC15533a6 presenter = ((o8d0) this.viewModel).m163120i().getPresenter();
        if (presenter != null) {
            presenter.mo95084N3();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m148909s0() {
        ((o8d0) this.viewModel).m163128s(null);
    }

    /* JADX INFO: renamed from: s1 */
    public void m148910s1(LiveScrollViewContainer liveScrollViewContainer, boolean z) {
        if (liveScrollViewContainer.getPresenter() != null) {
            liveScrollViewContainer.getPresenter().mo95099d4(z ? "click" : "swipe");
            liveScrollViewContainer.getPresenter().mo69117n();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m148911t0() {
        return m148918y0().mo95085O3();
    }

    /* JADX INFO: renamed from: t1 */
    public void m148912t1(RightSideViewGroup.InterfaceC12939c interfaceC12939c) {
        ((o8d0) this.viewModel).m163129u(interfaceC12939c);
    }

    /* JADX INFO: renamed from: u0 */
    public void m148913u0() {
        m148918y0().mo95086P3();
        this.f126811i.act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: u1 */
    public final void m148914u1(BLiveAbsData bLiveAbsData) {
        if (t7t.m187504d(bLiveAbsData)) {
            ((o8d0) this.viewModel).m163131w(false, false);
            ((o8d0) this.viewModel).m163130v(false);
            return;
        }
        boolean zIsNormalLive = bLiveAbsData.isNormalLive();
        V v2 = this.viewModel;
        if (zIsNormalLive) {
            ((o8d0) v2).m163130v(ypv.m215672k().m195894mb(this.f126805c.m218692c()));
        } else {
            ((o8d0) v2).m163130v(false);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final void m148915v1(String str, r8d0 r8d0Var) {
        if (!TextUtils.equals("default", r8d0Var.m178244b())) {
            boolean zEquals = TextUtils.equals(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, r8d0Var.m178244b());
            V v2 = this.viewModel;
            if (zEquals) {
                ((o8d0) v2).m163130v(true);
                ((o8d0) this.viewModel).m163131w(true, false);
                return;
            } else {
                ((o8d0) v2).m163130v(true);
                ((o8d0) this.viewModel).m163131w(false, false);
                return;
            }
        }
        if (!vdt.m198092b(2) && m148884U0()) {
            ((o8d0) this.viewModel).m163130v(false);
            return;
        }
        if (uxi.m196181b(r8d0Var.f187608a, r8d0Var.f187611d)) {
            return;
        }
        if (!ypv.m215672k().m195894mb(str) || m148918y0().m206031K2().m182469l(LiveDialogEnum.SIGN_IN)) {
            ((o8d0) this.viewModel).m163130v(false);
        } else {
            m148870E1(str);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public z1j m148916x0() {
        return this.f126817o;
    }

    /* JADX INFO: renamed from: x1 */
    public void m148917x1() {
        this.f126815m = true;
        ((o8d0) this.viewModel).m163133y(this.f126813k.f77235b);
    }

    /* JADX INFO: renamed from: y0 */
    public AbstractC15533a6 m148918y0() {
        return this.f126809g.m153874g();
    }

    /* JADX INFO: renamed from: z0 */
    public BLiveAbsData m148919z0() {
        return this.f126803a;
    }

    /* JADX INFO: renamed from: z1 */
    public final AbstractC15533a6 m148920z1(JumpRoomData jumpRoomData, LiveScrollViewContainer liveScrollViewContainer) {
        this.f126805c.m218709t(false);
        this.f126805c.m218701l();
        AbstractC15533a6 abstractC15533a6M153877j = this.f126809g.m153877j(jumpRoomData.getLive(), liveScrollViewContainer);
        if (jumpRoomData.getJumpRoomType().needChangeSource()) {
            String source = jumpRoomData.getSource();
            if (TextUtils.isEmpty(source)) {
                source = this.f126805c.m218692c();
            }
            abstractC15533a6M153877j.mo95100e4(jumpRoomData);
            this.f126805c.m218702m(source);
            abstractC15533a6M153877j.m95103h4(UUID.randomUUID().toString());
            abstractC15533a6M153877j.mo95104i4();
            this.f126808f.m207266C(jumpRoomData.getSource(), jumpRoomData.getLive());
            this.f126811i.m71803U4(this.f126808f, jumpRoomData.getSource());
            m148877L0(abstractC15533a6M153877j, jumpRoomData.getLive(), true);
        } else {
            abstractC15533a6M153877j.m95103h4(UUID.randomUUID().toString());
            abstractC15533a6M153877j.mo95104i4();
            m148877L0(abstractC15533a6M153877j, jumpRoomData.getLive(), false);
        }
        this.f126808f.m207284z(jumpRoomData);
        return abstractC15533a6M153877j;
    }

    /* JADX INFO: renamed from: l.l8d0$a */
    public class C18167a implements mbh0 {
        public C18167a() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: O */
        public void mo43536O() {
            l8d0.this.m148918y0().mo95096a4();
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: E0 */
        public void mo43535E0() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: Z */
        public void mo43538Z() {
        }

        @Override // p149l.mbh0
        /* JADX INFO: renamed from: D0 */
        public void mo43534D0(boolean z, float f, int i) {
        }
    }
}
