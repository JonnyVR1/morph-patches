package p149l;

import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.data.GameOperate;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaignLink;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLivePageCampaign;
import com.p046p1.mobile.putong.live.base.data.BLivePk;
import com.p046p1.mobile.putong.live.base.data.BLivePkInvite;
import com.p046p1.mobile.putong.live.base.data.BLivePkSeek;
import com.p046p1.mobile.putong.live.base.data.BLivePushLimit;
import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveRoomCover;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.base.preview.PreviewView;
import com.p046p1.mobile.putong.live.livingroom.other.livecover.LiveCoverAct;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Map;
import java.util.Objects;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VRelative;

/* JADX INFO: loaded from: classes4.dex */
public class qk80 extends h4t<yl40, PreviewView> {

    /* JADX INFO: renamed from: i */
    public C22392a<j760<Boolean, BLive>> f155075i;

    /* JADX INFO: renamed from: j */
    public BLive f155076j;

    /* JADX INFO: renamed from: k */
    public AnchorStartData f155077k;

    /* JADX INFO: renamed from: l */
    public VRelative f155078l;

    /* JADX INFO: renamed from: m */
    public boolean f155079m;

    /* JADX INFO: renamed from: n */
    public BLivePushLimit f155080n;

    /* JADX INFO: renamed from: o */
    public int f155081o;

    /* JADX INFO: renamed from: p */
    public boolean f155082p;

    /* JADX INFO: renamed from: q */
    public Dialog f155083q;

    /* JADX INFO: renamed from: r */
    public boolean f155084r;

    /* JADX INFO: renamed from: s */
    public boolean f155085s;

    /* JADX INFO: renamed from: t */
    public final tk80 f155086t;

    /* JADX INFO: renamed from: u */
    public uqd0 f155087u;

    /* JADX INFO: renamed from: v */
    public hpd0 f155088v;

    /* JADX INFO: renamed from: l.qk80$a */
    public class C19528a extends obt {
        public C19528a() {
        }

        @Override // p149l.obt, p149l.dul
        /* JADX INFO: renamed from: s0 */
        public void mo113735s0() {
            qk80.this.m175230T5();
        }
    }

    public qk80(bsm bsmVar, AnchorStartData anchorStartData, PreviewView previewView, VRelative vRelative) {
        super(bsmVar);
        this.f155075i = C22392a.m221512b();
        this.f155081o = 0;
        this.f155084r = false;
        this.f155085s = false;
        tk80 tk80Var = new tk80();
        this.f155086t = tk80Var;
        this.f155087u = new uqd0("liveMode" + ypv.f199493a.m199309D0(), "normal");
        this.f155088v = new hpd0("isAgreement" + ypv.f199493a.m199309D0(), Boolean.FALSE);
        this.f155077k = anchorStartData;
        this.f155078l = vRelative;
        mo51532C(previewView);
        tk80Var.m189432a();
        init();
    }

    /* JADX INFO: renamed from: C4 */
    public static /* synthetic */ void m175149C4(BLivePkInvite bLivePkInvite) {
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m175158K3(Throwable th) {
    }

    /* JADX INFO: renamed from: P5 */
    private void m175166P5() {
        this.f155086t.m189434c();
        this.f155075i.onCompleted();
        Dialog dialog = this.f155083q;
        if (dialog != null && dialog.isShowing()) {
            this.f155083q.dismiss();
        }
        this.f155083q = null;
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m175174Y3(BLivePk bLivePk) {
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m175175Z3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m175176Z4(soj0 soj0Var) {
        m175212I5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b5 */
    public /* synthetic */ void m175179b5(soj0 soj0Var) {
        this.f155075i.onCompleted();
        this.f155076j.state = BLiveState.get("stopped");
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ void m175181d4(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        if (TextUtils.equals(this.f155077k.anchorSource, AnchorStartData.ANCHOR_SOURCE_BACK_FROM_OFFICIAL_SHOW)) {
            m175231U4();
        }
        ((PreviewView) this.viewModel).f47865d.f52011c.setSelected(true);
        xdl0.m208329E0(((PreviewView) this.viewModel).f47865d.f52009a, new View.OnClickListener() { // from class: l.ok80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144404a.m175254m5(view);
            }
        });
        eet.m116003b(this, "anchor_preview_show", null);
        ((PreviewView) this.viewModel).f47867f.f51996h.setChecked(this.f155088v.get().booleanValue());
        ((PreviewView) this.viewModel).f47867f.f51996h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ri80
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f159523a.m175255n5(compoundButton, z);
            }
        });
        if (((yl40) this.f188512e.f77102h).m215219M2()) {
            m175231U4();
            ((PreviewView) this.viewModel).m71967i0("friends");
            C22306c<C4319c> c22306cLifecycle = m206029H2().lifecycle();
            final tk80 tk80Var = this.f155086t;
            Objects.requireNonNull(tk80Var);
            c22306cLifecycle.subscribe(ffw.m121193d(new e30() { // from class: l.si80
                @Override // p149l.e30
                public final void call(Object obj) {
                    tk80Var.m189433b((C4319c) obj);
                }
            }));
            m175243a6(new d30() { // from class: l.ti80
                @Override // p149l.d30
                public final void call() {
                    this.f170538a.m175214K5();
                }
            });
            return;
        }
        duringCreated(((yl40) m206027E2()).m149815l()).takeUntil(new l9t()).subscribe(ffw.m121193d(new e30() { // from class: l.ui80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176637a.m175256o5((iqv) obj);
            }
        }));
        C22306c<C4319c> c22306cLifecycle2 = m206029H2().lifecycle();
        final tk80 tk80Var2 = this.f155086t;
        Objects.requireNonNull(tk80Var2);
        c22306cLifecycle2.subscribe(ffw.m121193d(new e30() { // from class: l.si80
            @Override // p149l.e30
            public final void call(Object obj) {
                tk80Var2.m189433b((C4319c) obj);
            }
        }));
        m175218N4();
        m175243a6(null);
        duringCreated((C22306c) this.f155075i.flatMap(new w9j() { // from class: l.vi80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f181560a.m175248g5((j760) obj);
            }
        })).filter(new w9j() { // from class: l.wi80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f186511a.m175249h5((BLive) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.yi80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198450a.m175250i5((BLive) obj);
            }
        }, new e30() { // from class: l.pk80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f149953a.m175251j5((Throwable) obj);
            }
        }));
        duringCreated(zfv.m218502E0()).subscribe(ffw.m121194e(new e30() { // from class: l.ni80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139067a.m175253l5((BLivePageCampaign) obj);
            }
        }, new e30() { // from class: l.oi80
            @Override // p149l.e30
            public final void call(Object obj) {
                qk80.m175200w4((Throwable) obj);
            }
        }));
        duringCreated(LivingNormalApiProvider.m71589u4(ypv.f199493a.m199309D0())).subscribe(ffw.m121194e(new e30() { // from class: l.pi80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f149128a.m175228S5((BLiveAnchor) obj);
            }
        }, new e30() { // from class: l.qi80
            @Override // p149l.e30
            public final void call(Object obj) {
                qk80.m175175Z3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m175194q4(Throwable th) {
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m175195r4(BLivePkSeek bLivePkSeek) {
    }

    /* JADX INFO: renamed from: u4 */
    public static /* synthetic */ void m175198u4(Throwable th) {
    }

    /* JADX INFO: renamed from: w4 */
    public static /* synthetic */ void m175200w4(Throwable th) {
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m175204A5(BLive bLive) {
        this.f155081o++;
        this.f155075i.m132487l(vwb.m200311Y(Boolean.TRUE, bLive));
        eet.m116003b(this, "anchor_preivew_stop_live", null);
    }

    /* JADX INFO: renamed from: B5 */
    public final /* synthetic */ void m175205B5(BLive bLive) {
        if (this.f155085s) {
            lsi0.m151578h(R$string.f47001Ud);
            return;
        }
        this.f155079m = true;
        this.f155075i.m132487l(vwb.m200311Y(Boolean.FALSE, bLive));
        eet.m116003b(this, "anchor_preivew_start_live", new e30() { // from class: l.dk80
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Map) obj).put("isFirstTry", "false");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ Boolean m175206C5(BLiveRoom bLiveRoom) {
        return Boolean.valueOf(((yl40) m206027E2()).m149816m().m137799f());
    }

    /* JADX INFO: renamed from: D5 */
    public final /* synthetic */ C22306c m175207D5(BLiveRoom bLiveRoom) {
        if (!BLiveRoom.EMPTY.equals(bLiveRoom)) {
            return duringCreated(LivingNormalApiProvider.m71527n5(bLiveRoom.f44324id));
        }
        BLivePushLimit bLivePushLimitNew_ = BLivePushLimit.new_();
        bLivePushLimitNew_.remaining = ypv.m215672k().m195800b5();
        return C22306c.just(bLivePushLimitNew_);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m175208E5(BLivePushLimit bLivePushLimit) {
        if (((yl40) m206027E2()).m149816m().m137799f()) {
            this.f155080n = bLivePushLimit;
            ((PreviewView) this.viewModel).m71970m0(bLivePushLimit);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F5 */
    public final /* synthetic */ Boolean m175209F5(BLiveRoom bLiveRoom) {
        return Boolean.valueOf(((yl40) m206027E2()).m149816m().m137797d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G5 */
    public final /* synthetic */ Boolean m175210G5(BLiveRoom bLiveRoom) {
        return Boolean.valueOf(!BLiveRoom.EMPTY.equals(bLiveRoom) && ((yl40) m206027E2()).m149816m().m137799f());
    }

    /* JADX INFO: renamed from: H5 */
    public final /* synthetic */ void m175211H5(d30 d30Var, BLiveRoom bLiveRoom) {
        Picture pictureM60124fp;
        BLiveRoomCover bLiveRoomCover = bLiveRoom.cover;
        if (bLiveRoomCover != null) {
            pictureM60124fp = bLiveRoomCover.media;
            boolean zEquals = TEnum.equals(bLiveRoomCover.status, "pending");
            V v2 = this.viewModel;
            if (zEquals) {
                ((PreviewView) v2).m71966h0(true);
            } else {
                ((PreviewView) v2).m71966h0(false);
            }
        } else {
            pictureM60124fp = ypv.f199493a.m199329V().m60124fp();
        }
        ((PreviewView) this.viewModel).m71971n0(TextUtils.isEmpty(bLiveRoom.mTempTitle) ? bLiveRoom.title : bLiveRoom.mTempTitle, pictureM60124fp.url);
        bLiveRoom.mTempTitle = null;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I5 */
    public void m175212I5() {
        if (((yl40) m206027E2()).m149816m().m137799f()) {
            ((PreviewView) this.viewModel).setPreviewContentVisibility(true);
        }
    }

    /* JADX INFO: renamed from: J5 */
    public void m175213J5() {
        BLivePushLimit bLivePushLimit = this.f155080n;
        if (bLivePushLimit != null) {
            long jM175224Q5 = m175224Q5(bLivePushLimit);
            int i = this.f155080n.remaining;
            if (i <= 0 || jM175224Q5 / 1000 > 0) {
                if (i > 0) {
                    lsi0.m151564B(ypv.f199497e.getString(R$string.f47060X9, qqi0.m175937e(this.f188513f, jM175224Q5)), true, true);
                    return;
                } else {
                    lsi0.m151595y(ypv.f199497e.getString(R$string.f47497ra));
                    return;
                }
            }
        }
        ((PreviewView) this.viewModel).m71964e0();
    }

    /* JADX INFO: renamed from: K5 */
    public void m175214K5() {
        if (!vdt.m198092b(2)) {
            m175221O5();
        } else {
            Act act = this.f188513f;
            act.duringCreated(ypv.f199493a.m199313F0(act)).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.nk80
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f139384a.m175257p5((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: L5 */
    public void m175215L5() {
        ((zwl) m129297F3(new tt00(2600))).mo185824f();
    }

    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public final C22306c<? extends BLiveAbsRoom> m175263v5(String str, BLiveAbsRoom bLiveAbsRoom) {
        if (!m175237X4(bLiveAbsRoom)) {
            return C22306c.just(bLiveAbsRoom);
        }
        BLiveRoom bLiveRoomNew_ = BLiveRoom.new_();
        bLiveRoomNew_.title = str;
        BLiveRoomCover bLiveRoomCoverNew_ = BLiveRoomCover.new_();
        bLiveRoomCoverNew_.media = bLiveAbsRoom.cover.media;
        bLiveRoomNew_.cover = bLiveRoomCoverNew_;
        return LivingNormalApiProvider.m71636z6(bLiveAbsRoom.f44324id, bLiveRoomNew_);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M5 */
    public void m175217M5(String str) {
        ((yl40) m206027E2()).m215226T2(str);
        m206028F2().ObsPreviewEvent.pushTypeChanged().mo172463j(str);
    }

    /* JADX INFO: renamed from: N4 */
    public final void m175218N4() {
        duringCreated(m175225R4()).filter(new w9j() { // from class: l.kj80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f123438a.m175245d5((BLive) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.lj80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128298a.m175236W5((BLive) obj);
            }
        }, new e30() { // from class: l.mj80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134109a.m175246e5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N5 */
    public final void m175219N5() {
        this.f188513f.duringCreated(LivingNormalApiProvider.m71177A6()).subscribe(ffw.m121194e(new e30() { // from class: l.yj80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198598a.m175258q5((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.zj80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203388a.m175259r5((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    public final Boolean m175220O4(BLive bLive) {
        boolean zM175233V4 = m175233V4(bLive);
        boolean z = true;
        if (zM175233V4 && this.f155081o < 1) {
            if (((yl40) m206027E2()).m215219M2()) {
                return Boolean.TRUE;
            }
            m175236W5(bLive);
        }
        if (zM175233V4 && this.f155081o < 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O5 */
    public final void m175221O5() {
        tk80.m189431e("p_anchor_live_ready");
        m206028F2().RoomMysteryEventGroup.clearRoomFakeId().m172467p();
        if (this.f155085s) {
            lsi0.m151578h(R$string.f47001Ud);
            return;
        }
        final String title = ((PreviewView) this.viewModel).getTitle();
        if (!TextUtils.isEmpty(title)) {
            title = title.trim();
            if (TextUtils.isEmpty(title)) {
                act().dialog().m20504F(ypv.f199497e.getString(R$string.f47143b7)).m20554s0(R$string.f47423o2).m20568z0();
                return;
            }
        }
        h5j0.INSTANCE.m129405d("create_live_room");
        if (!TextUtils.equals(this.f155077k.anchorSource, AnchorStartData.ANCHOR_SOURCE_BACK_FROM_OFFICIAL_SHOW)) {
            act().progress(ypv.f199497e.getString(R$string.f47103Za));
        }
        this.f155079m = true;
        duringCreated(((yl40) m206027E2()).m215218L2(title, ypv.f199493a.m199329V().m60124fp()).filter(new w9j() { // from class: l.nj80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f139218a.m175222P4((BLiveRoom) obj);
            }
        }).flatMap(new w9j() { // from class: l.oj80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f144256a.m175260s5((BLiveRoom) obj);
            }
        }).filter(new w9j() { // from class: l.pj80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f149719a.m175220O4((BLive) obj);
            }
        }).flatMap(new w9j() { // from class: l.qj80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f154905a.m175261t5((BLive) obj);
            }
        }).map(new w9j() { // from class: l.rj80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f159656a.m175262u5((BLive) obj);
            }
        }).flatMap(new w9j() { // from class: l.sj80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f164814a.m175263v5(title, (BLiveAbsRoom) obj);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.uj80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176746a.m175264w5((BLiveAbsRoom) obj);
            }
        }, new e30() { // from class: l.vj80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181667a.m175265x5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P4 */
    public final Boolean m175222P4(BLiveRoom bLiveRoom) {
        BLiveRoomCover bLiveRoomCover;
        if (BLiveRoom.EMPTY.equals(bLiveRoom)) {
            jfd0.m141176a("room is null");
            return null;
        }
        if (this.f155084r || (bLiveRoomCover = bLiveRoom.cover) == null || !bLiveRoomCover.isDefaultCover) {
            return Boolean.TRUE;
        }
        this.f155084r = true;
        act().progressDismiss();
        new em0().m117171k(m206029H2(), bLiveRoom);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: Q4 */
    public boolean m175223Q4() {
        return ypv.m215672k().m195599C3();
    }

    /* JADX INFO: renamed from: Q5 */
    public final long m175224Q5(BLivePushLimit bLivePushLimit) {
        return ((long) bLivePushLimit.availableTime) - qib0.f154693H.guessedCurrentServerTime();
    }

    @Override // p149l.wxs
    /* JADX INFO: renamed from: R2 */
    public String mo77274R2() {
        return "p_anchor_live_ready";
    }

    /* JADX INFO: renamed from: R4 */
    public final C22306c<BLive> m175225R4() {
        BLive bLive = this.f155076j;
        return bLive == null ? LivingNormalApiProvider.m71194C5(ypv.f199493a.m199309D0()).map(new w9j() { // from class: l.wj80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f186620a.m175247f5((BLive) obj);
            }
        }).doOnNext(new e30() { // from class: l.xj80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193187a.m175241Z5((BLive) obj);
            }
        }) : C22306c.just(bLive);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R5 */
    public final void m175226R5() {
        if (m175223Q4() || ypv.m215672k().m195931r6()) {
            this.f155087u.put(((yl40) m206027E2()).m215217K2());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S4 */
    public BLiveRoom m175227S4() {
        return ((yl40) m206027E2()).mo149817n() == null ? BLiveRoom.EMPTY : ((yl40) m206027E2()).m170393A2().mo165469j();
    }

    /* JADX INFO: renamed from: S5 */
    public final void m175228S5(BLiveAnchor bLiveAnchor) {
        if (bLiveAnchor != null && bLiveAnchor.liveSetting.callSwitch.f44346on) {
            m206028F2().CallEvent.anchorCall().mo172463j(Boolean.TRUE);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        if (ypv.m215672k().m195931r6()) {
            ((PreviewView) this.viewModel).m71969k0();
            ((PreviewView) this.viewModel).m71967i0(this.f155087u.get());
        }
        if (((idv) ypv.m215673l(fld0.f98147b)).m135634f()) {
            act().dialog().m20500D(R$string.f47032W2).m20541k0(R$string.f47011V2).m20495A0();
        }
        m129301d3(rk80.class, new w9j() { // from class: l.mi80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f133946a.m175239Y4((rk80) obj);
            }
        });
        duringCreated(m206028F2().LivePusherEvent.dismissBeautyDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.xi80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192969a.m175176Z4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().MomoSdkEvent.sdkActionEvent().m172460g()).filter(new w9j() { // from class: l.ij80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() == 2);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.tj80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170659a.m175242a5((Integer) obj);
            }
        }));
        ((kql) m129297F3(new s0f(2600))).mo118144b(new ddt(new C19528a()));
        aqe.m98261i().m98275r();
        m129304h3(m206028F2().LivePusherEvent.notifyRecoverLiveStopped(), new e30() { // from class: l.ek80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91957a.m175179b5((soj0) obj);
            }
        });
        act().lifecycle().filter(new w9j() { // from class: l.lk80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.mk80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134289a.m175244c5((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T4 */
    public final String m175229T4(Boolean bool) {
        return bool.booleanValue() ? "preview" : "start-live-button";
    }

    /* JADX INFO: renamed from: T5 */
    public final void m175230T5() {
        this.f155085s = true;
        act().dialog().m20504F(ypv.f199497e.getString(R$string.f47672z9)).m20507G0(ypv.f199497e.getString(R$string.f46950S4)).m20543m0(ypv.f199497e.getString(R$string.f47662z)).m20560v0(ypv.f199497e.getString(R$string.f47472q7), new Runnable() { // from class: l.hj80
            @Override // java.lang.Runnable
            public final void run() {
                this.f108045a.m175266y5();
            }
        }).m20568z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U4 */
    public void m175231U4() {
        xdl0.m208344M((View) this.viewModel, false);
    }

    /* JADX INFO: renamed from: U5 */
    public boolean m175232U5() {
        return ((PreviewView) this.viewModel).m71968j0();
    }

    /* JADX INFO: renamed from: V4 */
    public final boolean m175233V4(BLive bLive) {
        return TEnum.equals(bLive.state, "suspended") || TEnum.equals(bLive.state, "onlive") || TEnum.equals(bLive.state, "born");
    }

    /* JADX INFO: renamed from: V5 */
    public void m175234V5() {
        m206028F2().BottomEvent.showDialog().mo172463j(BLiveButtonType.get("beauty"));
        ((PreviewView) this.viewModel).setPreviewContentVisibility(false);
    }

    /* JADX INFO: renamed from: W4 */
    public final boolean m175235W4() {
        return this.f155075i.m221519i() && !this.f155075i.m221515e().f116564a.booleanValue();
    }

    /* JADX INFO: renamed from: W5 */
    public final void m175236W5(final BLive bLive) {
        this.f155087u.put(bLive.liveMode);
        ((PreviewView) this.viewModel).m71967i0(bLive.liveMode);
        if ("obs".equals(bLive.liveMode)) {
            this.f155081o++;
            this.f155075i.m132487l(vwb.m200311Y(Boolean.TRUE, bLive));
            return;
        }
        if (!TextUtils.equals(this.f155077k.anchorSource, AnchorStartData.ANCHOR_SOURCE_BACK_FROM_OFFICIAL_SHOW)) {
            final String strM187502b = t7t.m187502b(bLive);
            if (TextUtils.isEmpty(strM187502b)) {
                this.f155083q = act().dialog().m20504F(ypv.f199497e.getString(R$string.f47257gb)).m20544n0(ypv.f199497e.getString(R$string.f47191db), new Runnable() { // from class: l.bk80
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f75972a.m175204A5(bLive);
                    }
                }).m20560v0(ypv.f199497e.getString(R$string.f47235fb), new Runnable() { // from class: l.ck80
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81306a.m175205B5(bLive);
                    }
                }).m20496B(false).m20568z0();
                return;
            } else {
                new xh0.C21150a(this.f188513f).m208731j("您有一场公演正在进行中").m208739r("去公演").m208736o(new View.OnClickListener() { // from class: l.ak80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f70259a.m175267z5(strM187502b, view);
                    }
                }).m208737p(h1c0.f105357d).m208728g(false).m208729h(false).m208722a().m208721g();
                return;
            }
        }
        if (this.f155077k.switchRoomData != null) {
            ubu ubuVar = new ubu();
            ubuVar.f175753a = 1;
            AnchorStartData.OfficialShowSwitchRoomData officialShowSwitchRoomData = this.f155077k.switchRoomData;
            ubuVar.f175754b = officialShowSwitchRoomData.avatarUrl;
            ubuVar.f175755c = officialShowSwitchRoomData.name;
            ubuVar.f175756d = "已结束本次公演，感谢参与～";
            ubuVar.f175757e = "知道了";
            m206028F2().LiveTipEvent.showTip().mo172463j(ubuVar);
        }
        if (this.f155085s) {
            lsi0.m151578h(R$string.f47001Ud);
        } else {
            this.f155079m = true;
            this.f155075i.m132487l(vwb.m200311Y(Boolean.FALSE, bLive));
        }
    }

    /* JADX INFO: renamed from: X4 */
    public final boolean m175237X4(BLiveAbsRoom bLiveAbsRoom) {
        return !TextUtils.equals(bLiveAbsRoom.title, ((PreviewView) this.viewModel).getTitle());
    }

    /* JADX INFO: renamed from: X5, reason: merged with bridge method [inline-methods] */
    public final void m175250i5(BLive bLive) {
        boolean zM175235W4 = m175235W4();
        m206028F2().LivePusherEvent.startLive().mo172463j(new cdt(zM175235W4, this.f155076j.f44323id, m175229T4(Boolean.valueOf(zM175235W4))));
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ Boolean m175239Y4(rk80 rk80Var) {
        return Boolean.valueOf(m175232U5());
    }

    /* JADX INFO: renamed from: Y5 */
    public void m175240Y5() {
        BLiveRoom bLiveRoomM175227S4 = m175227S4();
        bLiveRoomM175227S4.mTempTitle = ((PreviewView) this.viewModel).getTitle();
        m206029H2().startActivityForResult(LiveCoverAct.m75466b2(m206029H2().getContext(), bLiveRoomM175227S4.f44324id, "from_preview"), 100);
    }

    /* JADX INFO: renamed from: Z5 */
    public void m175241Z5(BLive bLive) {
        if (!TextUtils.isEmpty(bLive.pkInfo.ongoingId)) {
            duringCreated(LivingNormalApiProvider.m71528n6(bLive.pkInfo.ongoingId, GameOperate.quit)).subscribe(ffw.m121194e(new e30() { // from class: l.fk80
                @Override // p149l.e30
                public final void call(Object obj) {
                    qk80.m175174Y3((BLivePk) obj);
                }
            }, new e30() { // from class: l.gk80
                @Override // p149l.e30
                public final void call(Object obj) {
                    qk80.m175198u4((Throwable) obj);
                }
            }));
        }
        if (!TextUtils.isEmpty(bLive.pkInfo.ongoingSeekId)) {
            duringCreated(LivingNormalApiProvider.m71381X3(bLive.pkInfo.ongoingSeekId)).subscribe(ffw.m121194e(new e30() { // from class: l.hk80
                @Override // p149l.e30
                public final void call(Object obj) {
                    qk80.m175195r4((BLivePkSeek) obj);
                }
            }, new e30() { // from class: l.ik80
                @Override // p149l.e30
                public final void call(Object obj) {
                    qk80.m175194q4((Throwable) obj);
                }
            }));
        }
        if (TextUtils.isEmpty(bLive.pkInfo.ongoingInviteId)) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m71372W3(bLive.pkInfo.ongoingInviteId)).subscribe(ffw.m121194e(new e30() { // from class: l.jk80
            @Override // p149l.e30
            public final void call(Object obj) {
                qk80.m175149C4((BLivePkInvite) obj);
            }
        }, new e30() { // from class: l.kk80
            @Override // p149l.e30
            public final void call(Object obj) {
                qk80.m175158K3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m175242a5(Integer num) {
        this.f155085s = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a6 */
    public final void m175243a6(final d30 d30Var) {
        duringCreated((C22306c) ((yl40) m206027E2()).m215224R2().filter(new w9j() { // from class: l.zi80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f203308a.m175206C5((BLiveRoom) obj);
            }
        }).flatMap(new w9j() { // from class: l.aj80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f70094a.m175207D5((BLiveRoom) obj);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.bj80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75889a.m175208E5((BLivePushLimit) obj);
            }
        }, new e30() { // from class: l.cj80
            @Override // p149l.e30
            public final void call(Object obj) {
                qk80.m175181d4((Throwable) obj);
            }
        }));
        duringCreated(((yl40) m206027E2()).m170393A2().m175588f()).takeUntil(new w9j() { // from class: l.dj80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f86509a.m175209F5((BLiveRoom) obj);
            }
        }).filter(new w9j() { // from class: l.ej80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f91677a.m175210G5((BLiveRoom) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.fj80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97762a.m175211H5(d30Var, (BLiveRoom) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m175244c5(C4319c c4319c) {
        act().progressDismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ Boolean m175245d5(BLive bLive) {
        return Boolean.valueOf(((yl40) m206027E2()).m149816m().m137799f() && m175233V4(bLive));
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m175246e5(Throwable th) {
        this.f155079m = false;
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ BLive m175247f5(BLive bLive) {
        this.f155076j = bLive;
        return bLive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ C22306c m175248g5(j760 j760Var) {
        return (!((Boolean) j760Var.f116564a).booleanValue() || this.f155082p) ? C22306c.just((BLive) j760Var.f116565b) : LivingNormalApiProvider.m71277L7(((BLive) j760Var.f116565b).f44323id, true);
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ Boolean m175249h5(BLive bLive) {
        if (!m175235W4()) {
            this.f155082p = true;
        }
        if (bLive.isMultiCall() && !"friends".equals(bLive.liveMode)) {
            r610.m177974I(bLive.multiCallInfo.role, bLive.f44323id);
        }
        this.f155076j = bLive;
        return Boolean.valueOf(this.f155079m);
    }

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ void m175251j5(Throwable th) {
        act().progressDismiss();
        lsi0.m151580j(ypv.f199497e.getString(R$string.f46720H9));
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m175252k5(BLiveCampaignLink bLiveCampaignLink) {
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(400).m142598B(bLiveCampaignLink.jumpUrl).m142607x().m142600q());
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m175253l5(BLivePageCampaign bLivePageCampaign) {
        ((PreviewView) this.viewModel).m71965g0(bLivePageCampaign, new e30() { // from class: l.jj80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118243a.m175252k5((BLiveCampaignLink) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m175254m5(View view) {
        this.f155078l.callOnClick();
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m175255n5(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.f155088v.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ void m175256o5(iqv iqvVar) {
        int iM137794a = iqvVar.m137794a();
        if (iM137794a == 1) {
            this.f155078l.setVisibility(4);
            ((PreviewView) this.viewModel).m71971n0("", ypv.f199493a.m199329V().m60124fp().url);
            this.f155086t.m189435d();
        } else {
            if (iM137794a != 2) {
                return;
            }
            this.f155078l.setVisibility(0);
            m175231U4();
            m175166P5();
            m175226R5();
        }
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ void m175257p5(Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            tn0.m189744l(this.f188513f).map(new w9j() { // from class: l.gj80
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.TRUE;
                }
            }).subscribe(ffw.m121192c());
        } else {
            m175219N5();
        }
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m175258q5(BLiveEnvelope bLiveEnvelope) {
        m175221O5();
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ void m175259r5(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.m151580j(th.getLocalizedMessage());
        } else if (((TantanException.Client.CoreService) th).code == 40001) {
            m175221O5();
        }
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ C22306c m175260s5(BLiveRoom bLiveRoom) {
        return m175225R4();
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ C22306c m175261t5(BLive bLive) {
        return (m175235W4() || !m175233V4(bLive) || this.f155082p) ? C22306c.just(bLive) : LivingNormalApiProvider.m71277L7(bLive.f44323id, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u5 */
    public final /* synthetic */ BLiveAbsRoom m175262u5(BLive bLive) {
        this.f155082p = true;
        return ((yl40) m206027E2()).mo149817n();
    }

    /* JADX INFO: renamed from: w5 */
    public final /* synthetic */ void m175264w5(BLiveAbsRoom bLiveAbsRoom) {
        act().progressDismiss();
        h5j0.INSTANCE.m129404c("create_live_room", "checkNeedPatchRoom");
        m206028F2().LivePusherEvent.startLive().mo172463j(new cdt(false, null, m175229T4(Boolean.FALSE)));
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ void m175265x5(Throwable th) {
        act().progressDismiss();
        this.f155079m = false;
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.m151578h(R$string.f46720H9);
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        if (coreService.code == 41013) {
            lsi0.m151580j(ypv.f199497e.getString(R$string.f47654yd));
        }
        if (coreService.code == 41024) {
            if (vdt.m198092b(2)) {
                lsi0.m151580j("你已提交了认证申请，请耐心等待审核结果");
            } else {
                lsi0.m151580j(coreService.metaMessage);
            }
        }
    }

    /* JADX INFO: renamed from: y5 */
    public final /* synthetic */ void m175266y5() {
        try {
            ane0.m97752x(act());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            lsi0.m151593w(R$string.f47650y9);
        }
    }

    /* JADX INFO: renamed from: z5 */
    public final /* synthetic */ void m175267z5(String str, View view) {
        m206028F2().OfficialShowEvent.recoverOfficialShow().mo172463j(str);
    }
}
