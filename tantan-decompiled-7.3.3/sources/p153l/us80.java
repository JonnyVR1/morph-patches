package p153l;

import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.data.GameOperate;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaignLink;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLivePageCampaign;
import com.p051p1.mobile.putong.live.base.data.BLivePk;
import com.p051p1.mobile.putong.live.base.data.BLivePkInvite;
import com.p051p1.mobile.putong.live.base.data.BLivePkSeek;
import com.p051p1.mobile.putong.live.base.data.BLivePushLimit;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveRoomCover;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.base.preview.PreviewView;
import com.p051p1.mobile.putong.live.livingroom.other.livecover.LiveCoverAct;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Map;
import java.util.Objects;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VRelative;

/* JADX INFO: loaded from: classes4.dex */
public class us80 extends i6t<mu40, PreviewView> {

    /* JADX INFO: renamed from: i */
    public C22507a<pf60<Boolean, BLive>> f180736i;

    /* JADX INFO: renamed from: j */
    public BLive f180737j;

    /* JADX INFO: renamed from: k */
    public AnchorStartData f180738k;

    /* JADX INFO: renamed from: l */
    public VRelative f180739l;

    /* JADX INFO: renamed from: m */
    public boolean f180740m;

    /* JADX INFO: renamed from: n */
    public BLivePushLimit f180741n;

    /* JADX INFO: renamed from: o */
    public int f180742o;

    /* JADX INFO: renamed from: p */
    public boolean f180743p;

    /* JADX INFO: renamed from: q */
    public Dialog f180744q;

    /* JADX INFO: renamed from: r */
    public boolean f180745r;

    /* JADX INFO: renamed from: s */
    public boolean f180746s;

    /* JADX INFO: renamed from: t */
    public final xs80 f180747t;

    /* JADX INFO: renamed from: u */
    public wyd0 f180748u;

    /* JADX INFO: renamed from: v */
    public jxd0 f180749v;

    /* JADX INFO: renamed from: l.us80$a */
    public class C20651a extends pdt {
        public C20651a() {
        }

        @Override // p153l.pdt, p153l.rwl
        /* JADX INFO: renamed from: s0 */
        public void mo171890s0() {
            us80.this.m197780T5();
        }
    }

    public us80(dum dumVar, AnchorStartData anchorStartData, PreviewView previewView, VRelative vRelative) {
        super(dumVar);
        this.f180736i = C22507a.m222758b();
        this.f180742o = 0;
        this.f180745r = false;
        this.f180746s = false;
        xs80 xs80Var = new xs80();
        this.f180747t = xs80Var;
        this.f180748u = new wyd0("liveMode" + zrv.f205799a.m207631D0(), "normal");
        this.f180749v = new jxd0("isAgreement" + zrv.f205799a.m207631D0(), Boolean.FALSE);
        this.f180738k = anchorStartData;
        this.f180739l = vRelative;
        mo52715C(previewView);
        xs80Var.m212959a();
        init();
    }

    /* JADX INFO: renamed from: C4 */
    public static /* synthetic */ void m197699C4(BLivePkInvite bLivePkInvite) {
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m197708K3(Throwable th) {
    }

    /* JADX INFO: renamed from: P5 */
    private void m197716P5() {
        this.f180747t.m212961c();
        this.f180736i.onCompleted();
        Dialog dialog = this.f180744q;
        if (dialog != null && dialog.isShowing()) {
            this.f180744q.dismiss();
        }
        this.f180744q = null;
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m197724Y3(BLivePk bLivePk) {
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m197725Z3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m197726Z4(vxj0 vxj0Var) {
        m197762I5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b5 */
    public /* synthetic */ void m197729b5(vxj0 vxj0Var) {
        this.f180736i.onCompleted();
        this.f180737j.state = BLiveState.get("stopped");
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ void m197731d4(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        if (TextUtils.equals(this.f180738k.anchorSource, AnchorStartData.ANCHOR_SOURCE_BACK_FROM_OFFICIAL_SHOW)) {
            m197781U4();
        }
        ((PreviewView) this.viewModel).f48713d.f52859c.setSelected(true);
        bnl0.m105509E0(((PreviewView) this.viewModel).f48713d.f52857a, new View.OnClickListener() { // from class: l.ss80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170440a.m197804m5(view);
            }
        });
        fgt.m125530b(this, "anchor_preview_show", null);
        ((PreviewView) this.viewModel).f48715f.f52844h.setChecked(this.f180749v.get().booleanValue());
        ((PreviewView) this.viewModel).f48715f.f52844h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.vq80
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f185337a.m197805n5(compoundButton, z);
            }
        });
        if (((mu40) this.f196918e.f90822h).m160108M2()) {
            m197781U4();
            ((PreviewView) this.viewModel).m73150i0("friends");
            C22421c<C4470c> c22421cLifecycle = m213812H2().lifecycle();
            final xs80 xs80Var = this.f180747t;
            Objects.requireNonNull(xs80Var);
            c22421cLifecycle.subscribe(dhw.m115825d(new y20() { // from class: l.wq80
                @Override // p153l.y20
                public final void call(Object obj) {
                    xs80Var.m212960b((C4470c) obj);
                }
            }));
            m197793a6(new x20() { // from class: l.xq80
                @Override // p153l.x20
                public final void call() {
                    this.f195788a.m197764K5();
                }
            });
            return;
        }
        duringCreated(((mu40) m213810E2()).m202192l()).takeUntil(new mbt()).subscribe(dhw.m115825d(new y20() { // from class: l.yq80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201158a.m197806o5((jsv) obj);
            }
        }));
        C22421c<C4470c> c22421cLifecycle2 = m213812H2().lifecycle();
        final xs80 xs80Var2 = this.f180747t;
        Objects.requireNonNull(xs80Var2);
        c22421cLifecycle2.subscribe(dhw.m115825d(new y20() { // from class: l.wq80
            @Override // p153l.y20
            public final void call(Object obj) {
                xs80Var2.m212960b((C4470c) obj);
            }
        }));
        m197768N4();
        m197793a6(null);
        duringCreated((C22421c) this.f180736i.flatMap(new qcj() { // from class: l.zq80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f205574a.m197798g5((pf60) obj);
            }
        })).filter(new qcj() { // from class: l.ar80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f72919a.m197799h5((BLive) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.cr80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83306a.m197800i5((BLive) obj);
            }
        }, new y20() { // from class: l.ts80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175968a.m197801j5((Throwable) obj);
            }
        }));
        duringCreated(aiv.m98036E0()).subscribe(dhw.m115826e(new y20() { // from class: l.rq80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164437a.m197803l5((BLivePageCampaign) obj);
            }
        }, new y20() { // from class: l.sq80
            @Override // p153l.y20
            public final void call(Object obj) {
                us80.m197750w4((Throwable) obj);
            }
        }));
        duringCreated(LivingNormalApiProvider.m72772u4(zrv.f205799a.m207631D0())).subscribe(dhw.m115826e(new y20() { // from class: l.tq80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175687a.m197778S5((BLiveAnchor) obj);
            }
        }, new y20() { // from class: l.uq80
            @Override // p153l.y20
            public final void call(Object obj) {
                us80.m197725Z3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m197744q4(Throwable th) {
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m197745r4(BLivePkSeek bLivePkSeek) {
    }

    /* JADX INFO: renamed from: u4 */
    public static /* synthetic */ void m197748u4(Throwable th) {
    }

    /* JADX INFO: renamed from: w4 */
    public static /* synthetic */ void m197750w4(Throwable th) {
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m197754A5(BLive bLive) {
        this.f180742o++;
        this.f180736i.m137019l(jyb.m147494Y(Boolean.TRUE, bLive));
        fgt.m125530b(this, "anchor_preivew_stop_live", null);
    }

    /* JADX INFO: renamed from: B5 */
    public final /* synthetic */ void m197755B5(BLive bLive) {
        if (this.f180746s) {
            o1j0.m165634h(R$string.f47849Ud);
            return;
        }
        this.f180740m = true;
        this.f180736i.m137019l(jyb.m147494Y(Boolean.FALSE, bLive));
        fgt.m125530b(this, "anchor_preivew_start_live", new y20() { // from class: l.hs80
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Map) obj).put("isFirstTry", "false");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ Boolean m197756C5(BLiveRoom bLiveRoom) {
        return Boolean.valueOf(((mu40) m213810E2()).m202193m().m146880f());
    }

    /* JADX INFO: renamed from: D5 */
    public final /* synthetic */ C22421c m197757D5(BLiveRoom bLiveRoom) {
        if (!BLiveRoom.EMPTY.equals(bLiveRoom)) {
            return duringCreated(LivingNormalApiProvider.m72710n5(bLiveRoom.f45172id));
        }
        BLivePushLimit bLivePushLimitNew_ = BLivePushLimit.new_();
        bLivePushLimitNew_.remaining = zrv.m221193k().m203587b5();
        return C22421c.just(bLivePushLimitNew_);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m197758E5(BLivePushLimit bLivePushLimit) {
        if (((mu40) m213810E2()).m202193m().m146880f()) {
            this.f180741n = bLivePushLimit;
            ((PreviewView) this.viewModel).m73153m0(bLivePushLimit);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F5 */
    public final /* synthetic */ Boolean m197759F5(BLiveRoom bLiveRoom) {
        return Boolean.valueOf(((mu40) m213810E2()).m202193m().m146878d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G5 */
    public final /* synthetic */ Boolean m197760G5(BLiveRoom bLiveRoom) {
        return Boolean.valueOf(!BLiveRoom.EMPTY.equals(bLiveRoom) && ((mu40) m213810E2()).m202193m().m146880f());
    }

    /* JADX INFO: renamed from: H5 */
    public final /* synthetic */ void m197761H5(x20 x20Var, BLiveRoom bLiveRoom) {
        Picture pictureM61308fp;
        BLiveRoomCover bLiveRoomCover = bLiveRoom.cover;
        if (bLiveRoomCover != null) {
            pictureM61308fp = bLiveRoomCover.media;
            boolean zEquals = TEnum.equals(bLiveRoomCover.status, "pending");
            V v2 = this.viewModel;
            if (zEquals) {
                ((PreviewView) v2).m73149h0(true);
            } else {
                ((PreviewView) v2).m73149h0(false);
            }
        } else {
            pictureM61308fp = zrv.f205799a.m207651V().m61308fp();
        }
        ((PreviewView) this.viewModel).m73154n0(TextUtils.isEmpty(bLiveRoom.mTempTitle) ? bLiveRoom.title : bLiveRoom.mTempTitle, pictureM61308fp.url);
        bLiveRoom.mTempTitle = null;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I5 */
    public void m197762I5() {
        if (((mu40) m213810E2()).m202193m().m146880f()) {
            ((PreviewView) this.viewModel).setPreviewContentVisibility(true);
        }
    }

    /* JADX INFO: renamed from: J5 */
    public void m197763J5() {
        BLivePushLimit bLivePushLimit = this.f180741n;
        if (bLivePushLimit != null) {
            long jM197774Q5 = m197774Q5(bLivePushLimit);
            int i = this.f180741n.remaining;
            if (i <= 0 || jM197774Q5 / 1000 > 0) {
                if (i > 0) {
                    o1j0.m165620B(zrv.f205803e.getString(R$string.f47908X9, tzi0.m193667e(this.f196919f, jM197774Q5)), true, true);
                    return;
                } else {
                    o1j0.m165651y(zrv.f205803e.getString(R$string.f48345ra));
                    return;
                }
            }
        }
        ((PreviewView) this.viewModel).m73147e0();
    }

    /* JADX INFO: renamed from: K5 */
    public void m197764K5() {
        if (!wft.m206159b(2)) {
            m197771O5();
        } else {
            Act act = this.f196919f;
            act.duringCreated(zrv.f205799a.m207635F0(act)).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.rs80
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f164647a.m197807p5((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: L5 */
    public void m197765L5() {
        ((szl) m138856F3(new c210(2600))).mo101587f();
    }

    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public final C22421c<? extends BLiveAbsRoom> m197813v5(String str, BLiveAbsRoom bLiveAbsRoom) {
        if (!m197787X4(bLiveAbsRoom)) {
            return C22421c.just(bLiveAbsRoom);
        }
        BLiveRoom bLiveRoomNew_ = BLiveRoom.new_();
        bLiveRoomNew_.title = str;
        BLiveRoomCover bLiveRoomCoverNew_ = BLiveRoomCover.new_();
        bLiveRoomCoverNew_.media = bLiveAbsRoom.cover.media;
        bLiveRoomNew_.cover = bLiveRoomCoverNew_;
        return LivingNormalApiProvider.m72819z6(bLiveAbsRoom.f45172id, bLiveRoomNew_);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M5 */
    public void m197767M5(String str) {
        ((mu40) m213810E2()).m160115T2(str);
        m213811F2().ObsPreviewEvent.pushTypeChanged().mo199273j(str);
    }

    /* JADX INFO: renamed from: N4 */
    public final void m197768N4() {
        duringCreated(m197775R4()).filter(new qcj() { // from class: l.or80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f148679a.m197795d5((BLive) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.pr80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153737a.m197786W5((BLive) obj);
            }
        }, new y20() { // from class: l.qr80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159076a.m197796e5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N5 */
    public final void m197769N5() {
        this.f196919f.duringCreated(LivingNormalApiProvider.m72360A6()).subscribe(dhw.m115826e(new y20() { // from class: l.cs80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83425a.m197808q5((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.ds80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90467a.m197809r5((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    public final Boolean m197770O4(BLive bLive) {
        boolean zM197783V4 = m197783V4(bLive);
        boolean z = true;
        if (zM197783V4 && this.f180742o < 1) {
            if (((mu40) m213810E2()).m160108M2()) {
                return Boolean.TRUE;
            }
            m197786W5(bLive);
        }
        if (zM197783V4 && this.f180742o < 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O5 */
    public final void m197771O5() {
        xs80.m212958e("p_anchor_live_ready");
        m213811F2().RoomMysteryEventGroup.clearRoomFakeId().m199277p();
        if (this.f180746s) {
            o1j0.m165634h(R$string.f47849Ud);
            return;
        }
        final String title = ((PreviewView) this.viewModel).getTitle();
        if (!TextUtils.isEmpty(title)) {
            title = title.trim();
            if (TextUtils.isEmpty(title)) {
                act().dialog().m21503F(zrv.f205803e.getString(R$string.f47991b7)).m21553s0(R$string.f48271o2).m21567z0();
                return;
            }
        }
        lej0.INSTANCE.m153910d("create_live_room");
        if (!TextUtils.equals(this.f180738k.anchorSource, AnchorStartData.ANCHOR_SOURCE_BACK_FROM_OFFICIAL_SHOW)) {
            act().progress(zrv.f205803e.getString(R$string.f47951Za));
        }
        this.f180740m = true;
        duringCreated(((mu40) m213810E2()).m160107L2(title, zrv.f205799a.m207651V().m61308fp()).filter(new qcj() { // from class: l.rr80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f164560a.m197772P4((BLiveRoom) obj);
            }
        }).flatMap(new qcj() { // from class: l.sr80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f170311a.m197810s5((BLiveRoom) obj);
            }
        }).filter(new qcj() { // from class: l.tr80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f175812a.m197770O4((BLive) obj);
            }
        }).flatMap(new qcj() { // from class: l.ur80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f180577a.m197811t5((BLive) obj);
            }
        }).map(new qcj() { // from class: l.vr80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f185437a.m197812u5((BLive) obj);
            }
        }).flatMap(new qcj() { // from class: l.wr80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f190490a.m197813v5(title, (BLiveAbsRoom) obj);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.yr80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201291a.m197814w5((BLiveAbsRoom) obj);
            }
        }, new y20() { // from class: l.zr80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205745a.m197815x5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P4 */
    public final Boolean m197772P4(BLiveRoom bLiveRoom) {
        BLiveRoomCover bLiveRoomCover;
        if (BLiveRoom.EMPTY.equals(bLiveRoom)) {
            mnd0.m159157a("room is null");
            return null;
        }
        if (this.f180745r || (bLiveRoomCover = bLiveRoom.cover) == null || !bLiveRoomCover.isDefaultCover) {
            return Boolean.TRUE;
        }
        this.f180745r = true;
        act().progressDismiss();
        new am0().m98782k(m213812H2(), bLiveRoom);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: Q4 */
    public boolean m197773Q4() {
        return zrv.m221193k().m203386C3();
    }

    /* JADX INFO: renamed from: Q5 */
    public final long m197774Q5(BLivePushLimit bLivePushLimit) {
        return ((long) bLivePushLimit.availableTime) - uqb0.f180376H.guessedCurrentServerTime();
    }

    @Override // p153l.xzs
    /* JADX INFO: renamed from: R2 */
    public String mo78457R2() {
        return "p_anchor_live_ready";
    }

    /* JADX INFO: renamed from: R4 */
    public final C22421c<BLive> m197775R4() {
        BLive bLive = this.f180737j;
        return bLive == null ? LivingNormalApiProvider.m72377C5(zrv.f205799a.m207631D0()).map(new qcj() { // from class: l.as80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f73094a.m197797f5((BLive) obj);
            }
        }).doOnNext(new y20() { // from class: l.bs80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78131a.m197791Z5((BLive) obj);
            }
        }) : C22421c.just(bLive);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R5 */
    public final void m197776R5() {
        if (m197773Q4() || zrv.m221193k().m203718r6()) {
            this.f180748u.put(((mu40) m213810E2()).m160106K2());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S4 */
    public BLiveRoom m197777S4() {
        return ((mu40) m213810E2()).mo183440n() == null ? BLiveRoom.EMPTY : ((mu40) m213810E2()).m118363A2().mo122891j();
    }

    /* JADX INFO: renamed from: S5 */
    public final void m197778S5(BLiveAnchor bLiveAnchor) {
        if (bLiveAnchor != null && bLiveAnchor.liveSetting.callSwitch.f45194on) {
            m213811F2().CallEvent.anchorCall().mo199273j(Boolean.TRUE);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        if (zrv.m221193k().m203718r6()) {
            ((PreviewView) this.viewModel).m73152k0();
            ((PreviewView) this.viewModel).m73150i0(this.f180748u.get());
        }
        if (((jfv) zrv.m221194l(htd0.f111520b)).m144719f()) {
            act().dialog().m21499D(R$string.f47880W2).m21540k0(R$string.f47859V2).m21494A0();
        }
        m138860d3(vs80.class, new qcj() { // from class: l.qq80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f158967a.m197789Y4((vs80) obj);
            }
        });
        duringCreated(m213811F2().LivePusherEvent.dismissBeautyDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.br80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77991a.m197726Z4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().MomoSdkEvent.sdkActionEvent().m199270g()).filter(new qcj() { // from class: l.mr80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() == 2);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.xr80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195889a.m197792a5((Integer) obj);
            }
        }));
        ((wsl) m138856F3(new w1f(2600))).mo161149b(new eft(new C20651a()));
        ere.m122146i().m122160r();
        m138863h3(m213811F2().LivePusherEvent.notifyRecoverLiveStopped(), new y20() { // from class: l.is80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116632a.m197729b5((vxj0) obj);
            }
        });
        act().lifecycle().filter(new qcj() { // from class: l.ps80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.qs80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159257a.m197794c5((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T4 */
    public final String m197779T4(Boolean bool) {
        return bool.booleanValue() ? "preview" : "start-live-button";
    }

    /* JADX INFO: renamed from: T5 */
    public final void m197780T5() {
        this.f180746s = true;
        act().dialog().m21503F(zrv.f205803e.getString(R$string.f48520z9)).m21506G0(zrv.f205803e.getString(R$string.f47798S4)).m21542m0(zrv.f205803e.getString(R$string.f48510z)).m21559v0(zrv.f205803e.getString(R$string.f48320q7), new Runnable() { // from class: l.lr80
            @Override // java.lang.Runnable
            public final void run() {
                this.f133302a.m197816y5();
            }
        }).m21567z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U4 */
    public void m197781U4() {
        bnl0.m105524M((View) this.viewModel, false);
    }

    /* JADX INFO: renamed from: U5 */
    public boolean m197782U5() {
        return ((PreviewView) this.viewModel).m73151j0();
    }

    /* JADX INFO: renamed from: V4 */
    public final boolean m197783V4(BLive bLive) {
        return TEnum.equals(bLive.state, "suspended") || TEnum.equals(bLive.state, "onlive") || TEnum.equals(bLive.state, "born");
    }

    /* JADX INFO: renamed from: V5 */
    public void m197784V5() {
        m213811F2().BottomEvent.showDialog().mo199273j(BLiveButtonType.get("beauty"));
        ((PreviewView) this.viewModel).setPreviewContentVisibility(false);
    }

    /* JADX INFO: renamed from: W4 */
    public final boolean m197785W4() {
        return this.f180736i.m222765i() && !this.f180736i.m222761e().f152156a.booleanValue();
    }

    /* JADX INFO: renamed from: W5 */
    public final void m197786W5(final BLive bLive) {
        this.f180748u.put(bLive.liveMode);
        ((PreviewView) this.viewModel).m73150i0(bLive.liveMode);
        if ("obs".equals(bLive.liveMode)) {
            this.f180742o++;
            this.f180736i.m137019l(jyb.m147494Y(Boolean.TRUE, bLive));
            return;
        }
        if (!TextUtils.equals(this.f180738k.anchorSource, AnchorStartData.ANCHOR_SOURCE_BACK_FROM_OFFICIAL_SHOW)) {
            final String strM195113b = u9t.m195113b(bLive);
            if (TextUtils.isEmpty(strM195113b)) {
                this.f180744q = act().dialog().m21503F(zrv.f205803e.getString(R$string.f48105gb)).m21543n0(zrv.f205803e.getString(R$string.f48039db), new Runnable() { // from class: l.fs80
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f100553a.m197754A5(bLive);
                    }
                }).m21559v0(zrv.f205803e.getString(R$string.f48083fb), new Runnable() { // from class: l.gs80
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f106243a.m197755B5(bLive);
                    }
                }).m21495B(false).m21567z0();
                return;
            } else {
                new th0.C20312a(this.f196919f).m191151j("您有一场公演正在进行中").m191159r("去公演").m191156o(new View.OnClickListener() { // from class: l.es80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f95576a.m197817z5(strM195113b, view);
                    }
                }).m191157p(n9c0.f140818d).m191148g(false).m191149h(false).m191142a().m191141g();
                return;
            }
        }
        if (this.f180738k.switchRoomData != null) {
            vdu vduVar = new vdu();
            vduVar.f183659a = 1;
            AnchorStartData.OfficialShowSwitchRoomData officialShowSwitchRoomData = this.f180738k.switchRoomData;
            vduVar.f183660b = officialShowSwitchRoomData.avatarUrl;
            vduVar.f183661c = officialShowSwitchRoomData.name;
            vduVar.f183662d = "已结束本次公演，感谢参与～";
            vduVar.f183663e = "知道了";
            m213811F2().LiveTipEvent.showTip().mo199273j(vduVar);
        }
        if (this.f180746s) {
            o1j0.m165634h(R$string.f47849Ud);
        } else {
            this.f180740m = true;
            this.f180736i.m137019l(jyb.m147494Y(Boolean.FALSE, bLive));
        }
    }

    /* JADX INFO: renamed from: X4 */
    public final boolean m197787X4(BLiveAbsRoom bLiveAbsRoom) {
        return !TextUtils.equals(bLiveAbsRoom.title, ((PreviewView) this.viewModel).getTitle());
    }

    /* JADX INFO: renamed from: X5, reason: merged with bridge method [inline-methods] */
    public final void m197800i5(BLive bLive) {
        boolean zM197785W4 = m197785W4();
        m213811F2().LivePusherEvent.startLive().mo199273j(new dft(zM197785W4, this.f180737j.f45171id, m197779T4(Boolean.valueOf(zM197785W4))));
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ Boolean m197789Y4(vs80 vs80Var) {
        return Boolean.valueOf(m197782U5());
    }

    /* JADX INFO: renamed from: Y5 */
    public void m197790Y5() {
        BLiveRoom bLiveRoomM197777S4 = m197777S4();
        bLiveRoomM197777S4.mTempTitle = ((PreviewView) this.viewModel).getTitle();
        m213812H2().startActivityForResult(LiveCoverAct.m76649c2(m213812H2().getContext(), bLiveRoomM197777S4.f45172id, "from_preview"), 100);
    }

    /* JADX INFO: renamed from: Z5 */
    public void m197791Z5(BLive bLive) {
        if (!TextUtils.isEmpty(bLive.pkInfo.ongoingId)) {
            duringCreated(LivingNormalApiProvider.m72711n6(bLive.pkInfo.ongoingId, GameOperate.quit)).subscribe(dhw.m115826e(new y20() { // from class: l.js80
                @Override // p153l.y20
                public final void call(Object obj) {
                    us80.m197724Y3((BLivePk) obj);
                }
            }, new y20() { // from class: l.ks80
                @Override // p153l.y20
                public final void call(Object obj) {
                    us80.m197748u4((Throwable) obj);
                }
            }));
        }
        if (!TextUtils.isEmpty(bLive.pkInfo.ongoingSeekId)) {
            duringCreated(LivingNormalApiProvider.m72564X3(bLive.pkInfo.ongoingSeekId)).subscribe(dhw.m115826e(new y20() { // from class: l.ls80
                @Override // p153l.y20
                public final void call(Object obj) {
                    us80.m197745r4((BLivePkSeek) obj);
                }
            }, new y20() { // from class: l.ms80
                @Override // p153l.y20
                public final void call(Object obj) {
                    us80.m197744q4((Throwable) obj);
                }
            }));
        }
        if (TextUtils.isEmpty(bLive.pkInfo.ongoingInviteId)) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m72555W3(bLive.pkInfo.ongoingInviteId)).subscribe(dhw.m115826e(new y20() { // from class: l.ns80
            @Override // p153l.y20
            public final void call(Object obj) {
                us80.m197699C4((BLivePkInvite) obj);
            }
        }, new y20() { // from class: l.os80
            @Override // p153l.y20
            public final void call(Object obj) {
                us80.m197708K3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m197792a5(Integer num) {
        this.f180746s = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a6 */
    public final void m197793a6(final x20 x20Var) {
        duringCreated((C22421c) ((mu40) m213810E2()).m160113R2().filter(new qcj() { // from class: l.dr80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f90364a.m197756C5((BLiveRoom) obj);
            }
        }).flatMap(new qcj() { // from class: l.er80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f95455a.m197757D5((BLiveRoom) obj);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.fr80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100406a.m197758E5((BLivePushLimit) obj);
            }
        }, new y20() { // from class: l.gr80
            @Override // p153l.y20
            public final void call(Object obj) {
                us80.m197731d4((Throwable) obj);
            }
        }));
        duringCreated(((mu40) m213810E2()).m118363A2().m122890f()).takeUntil(new qcj() { // from class: l.hr80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f111295a.m197759F5((BLiveRoom) obj);
            }
        }).filter(new qcj() { // from class: l.ir80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f116515a.m197760G5((BLiveRoom) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.jr80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122317a.m197761H5(x20Var, (BLiveRoom) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m197794c5(C4470c c4470c) {
        act().progressDismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ Boolean m197795d5(BLive bLive) {
        return Boolean.valueOf(((mu40) m213810E2()).m202193m().m146880f() && m197783V4(bLive));
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m197796e5(Throwable th) {
        this.f180740m = false;
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ BLive m197797f5(BLive bLive) {
        this.f180737j = bLive;
        return bLive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ C22421c m197798g5(pf60 pf60Var) {
        return (!((Boolean) pf60Var.f152156a).booleanValue() || this.f180743p) ? C22421c.just((BLive) pf60Var.f152157b) : LivingNormalApiProvider.m72460L7(((BLive) pf60Var.f152157b).f45171id, true);
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ Boolean m197799h5(BLive bLive) {
        if (!m197785W4()) {
            this.f180743p = true;
        }
        if (bLive.isMultiCall() && !"friends".equals(bLive.liveMode)) {
            bf10.m103803I(bLive.multiCallInfo.role, bLive.f45171id);
        }
        this.f180737j = bLive;
        return Boolean.valueOf(this.f180740m);
    }

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ void m197801j5(Throwable th) {
        act().progressDismiss();
        o1j0.m165636j(zrv.f205803e.getString(R$string.f47568H9));
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m197802k5(BLiveCampaignLink bLiveCampaignLink) {
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(400).m174141B(bLiveCampaignLink.jumpUrl).m174150x().m174143q());
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m197803l5(BLivePageCampaign bLivePageCampaign) {
        ((PreviewView) this.viewModel).m73148g0(bLivePageCampaign, new y20() { // from class: l.nr80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143386a.m197802k5((BLiveCampaignLink) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m197804m5(View view) {
        this.f180739l.callOnClick();
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m197805n5(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.f180749v.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ void m197806o5(jsv jsvVar) {
        int iM146875a = jsvVar.m146875a();
        if (iM146875a == 1) {
            this.f180739l.setVisibility(4);
            ((PreviewView) this.viewModel).m73154n0("", zrv.f205799a.m207651V().m61308fp().url);
            this.f180747t.m212962d();
        } else {
            if (iM146875a != 2) {
                return;
            }
            this.f180739l.setVisibility(0);
            m197781U4();
            m197716P5();
            m197776R5();
        }
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ void m197807p5(Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            pn0.m172988l(this.f196919f).map(new qcj() { // from class: l.kr80
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.TRUE;
                }
            }).subscribe(dhw.m115824c());
        } else {
            m197769N5();
        }
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m197808q5(BLiveEnvelope bLiveEnvelope) {
        m197771O5();
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ void m197809r5(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            o1j0.m165636j(th.getLocalizedMessage());
        } else if (((TantanException.Client.CoreService) th).code == 40001) {
            m197771O5();
        }
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ C22421c m197810s5(BLiveRoom bLiveRoom) {
        return m197775R4();
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ C22421c m197811t5(BLive bLive) {
        return (m197785W4() || !m197783V4(bLive) || this.f180743p) ? C22421c.just(bLive) : LivingNormalApiProvider.m72460L7(bLive.f45171id, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u5 */
    public final /* synthetic */ BLiveAbsRoom m197812u5(BLive bLive) {
        this.f180743p = true;
        return ((mu40) m213810E2()).mo183440n();
    }

    /* JADX INFO: renamed from: w5 */
    public final /* synthetic */ void m197814w5(BLiveAbsRoom bLiveAbsRoom) {
        act().progressDismiss();
        lej0.INSTANCE.m153909c("create_live_room", "checkNeedPatchRoom");
        m213811F2().LivePusherEvent.startLive().mo199273j(new dft(false, null, m197779T4(Boolean.FALSE)));
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ void m197815x5(Throwable th) {
        act().progressDismiss();
        this.f180740m = false;
        if (!(th instanceof TantanException.Client.CoreService)) {
            o1j0.m165634h(R$string.f47568H9);
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        if (coreService.code == 41013) {
            o1j0.m165636j(zrv.f205803e.getString(R$string.f48502yd));
        }
        if (coreService.code == 41024) {
            if (wft.m206159b(2)) {
                o1j0.m165636j("你已提交了认证申请，请耐心等待审核结果");
            } else {
                o1j0.m165636j(coreService.metaMessage);
            }
        }
    }

    /* JADX INFO: renamed from: y5 */
    public final /* synthetic */ void m197816y5() {
        try {
            hve0.m137322x(act());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            o1j0.m165649w(R$string.f48498y9);
        }
    }

    /* JADX INFO: renamed from: z5 */
    public final /* synthetic */ void m197817z5(String str, View view) {
        m213811F2().OfficialShowEvent.recoverOfficialShow().mo199273j(str);
    }
}
