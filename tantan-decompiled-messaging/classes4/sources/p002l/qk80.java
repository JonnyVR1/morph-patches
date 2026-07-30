package p002l;

import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.base.preview.PreviewView;
import com.p000p1.mobile.putong.live.livingroom.other.livecover.LiveCoverAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.live.base.data.BLiveAnchor;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p1.mobile.putong.live.base.data.BLiveCampaignLink;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLivePageCampaign;
import com.p1.mobile.putong.live.base.data.BLivePk;
import com.p1.mobile.putong.live.base.data.BLivePkInvite;
import com.p1.mobile.putong.live.base.data.BLivePkSeek;
import com.p1.mobile.putong.live.base.data.BLivePushLimit;
import com.p1.mobile.putong.live.base.data.BLiveRoom;
import com.p1.mobile.putong.live.base.data.BLiveRoomCover;
import com.p1.mobile.putong.live.base.data.BLiveState;
import com.tantanapp.common.utils.CrashHelper;
import java.util.Map;
import java.util.Objects;
import l.ane0;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.fld0;
import l.h5j0;
import l.hpd0;
import l.idv;
import l.j760;
import l.jfd0;
import l.jo0;
import l.lsi0;
import l.qib0;
import l.qqi0;
import l.r610;
import l.s7m;
import l.soj0;
import l.uqd0;
import l.vdt;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xh0;
import l.ypv;
import rx.c;
import rx.subjects.a;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qk80 extends h4t<yl40, PreviewView> {

    /* JADX INFO: renamed from: i */
    public a<j760<Boolean, BLive>> f18060i;

    /* JADX INFO: renamed from: j */
    public BLive f18061j;

    /* JADX INFO: renamed from: k */
    public AnchorStartData f18062k;

    /* JADX INFO: renamed from: l */
    public VRelative f18063l;

    /* JADX INFO: renamed from: m */
    public boolean f18064m;

    /* JADX INFO: renamed from: n */
    public BLivePushLimit f18065n;

    /* JADX INFO: renamed from: o */
    public int f18066o;

    /* JADX INFO: renamed from: p */
    public boolean f18067p;

    /* JADX INFO: renamed from: q */
    public Dialog f18068q;

    /* JADX INFO: renamed from: r */
    public boolean f18069r;

    /* JADX INFO: renamed from: s */
    public boolean f18070s;

    /* JADX INFO: renamed from: t */
    public final tk80 f18071t;

    /* JADX INFO: renamed from: u */
    public uqd0 f18072u;

    /* JADX INFO: renamed from: v */
    public hpd0 f18073v;

    /* JADX INFO: renamed from: l.qk80$a */
    public class C0791a extends obt {
        public C0791a() {
        }

        @Override // p002l.obt, p002l.dul
        /* JADX INFO: renamed from: s0 */
        public void mo12057s0() {
            qk80.this.m21437T5();
        }
    }

    public qk80(bsm bsmVar, AnchorStartData anchorStartData, PreviewView previewView, VRelative vRelative) {
        super(bsmVar);
        this.f18060i = a.b();
        this.f18066o = 0;
        this.f18069r = false;
        this.f18070s = false;
        tk80 tk80Var = new tk80();
        this.f18071t = tk80Var;
        this.f18072u = new uqd0("liveMode" + ypv.a.D0(), "normal");
        this.f18073v = new hpd0("isAgreement" + ypv.a.D0(), Boolean.FALSE);
        this.f18062k = anchorStartData;
        this.f18063l = vRelative;
        C(previewView);
        tk80Var.m22998a();
        init();
    }

    /* JADX INFO: renamed from: C4 */
    public static /* synthetic */ void m21354C4(BLivePkInvite bLivePkInvite) {
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m21363K3(Throwable th) {
    }

    /* JADX INFO: renamed from: P5 */
    private void m21371P5() {
        this.f18071t.m23000c();
        this.f18060i.onCompleted();
        Dialog dialog = this.f18068q;
        if (dialog != null && dialog.isShowing()) {
            this.f18068q.dismiss();
        }
        this.f18068q = null;
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m21379Y3(BLivePk bLivePk) {
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m21380Z3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public /* synthetic */ void m21381Z4(soj0 soj0Var) {
        m21417I5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b5 */
    public /* synthetic */ void m21384b5(soj0 soj0Var) {
        this.f18060i.onCompleted();
        ((BLiveAbsData) this.f18061j).state = BLiveState.get("stopped");
    }

    /* JADX INFO: renamed from: d4 */
    public static /* synthetic */ void m21386d4(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        if (TextUtils.equals(this.f18062k.anchorSource, "back-from-official-show")) {
            m21438U4();
        }
        ((PreviewView) ((bwr) this).viewModel).f3907d.c.setSelected(true);
        xdl0.E0(((PreviewView) ((bwr) this).viewModel).f3907d.a, new View.OnClickListener() { // from class: l.ok80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16677a.m21461m5(view);
            }
        });
        eet.m12448b(this, "anchor_preview_show", null);
        ((PreviewView) ((bwr) this).viewModel).f3909f.h.setChecked(((Boolean) this.f18073v.get()).booleanValue());
        ((PreviewView) ((bwr) this).viewModel).f3909f.h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ri80
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f18527a.m21462n5(compoundButton, z);
            }
        });
        if (((yl40) this.f22036e.f8339h).m26790M2()) {
            m21438U4();
            ((PreviewView) ((bwr) this).viewModel).m5353i0("friends");
            c cVarLifecycle = m25549H2().lifecycle();
            final tk80 tk80Var = this.f18071t;
            Objects.requireNonNull(tk80Var);
            cVarLifecycle.subscribe(ffw.d(new e30() { // from class: l.si80
                public final void call(Object obj) {
                    tk80Var.m22999b((com.p1.mobile.android.app.c) obj);
                }
            }));
            m21450a6(new d30() { // from class: l.ti80
                public final void call() {
                    this.f20240a.m21419K5();
                }
            });
            return;
        }
        duringCreated(((yl40) m25547E2()).m17236l()).takeUntil(new l9t()).subscribe(ffw.d(new e30() { // from class: l.ui80
            public final void call(Object obj) {
                this.f20662a.m21463o5((iqv) obj);
            }
        }));
        c cVarLifecycle2 = m25549H2().lifecycle();
        final tk80 tk80Var2 = this.f18071t;
        Objects.requireNonNull(tk80Var2);
        cVarLifecycle2.subscribe(ffw.d(new e30() { // from class: l.si80
            public final void call(Object obj) {
                tk80Var2.m22999b((com.p1.mobile.android.app.c) obj);
            }
        }));
        m21423N4();
        m21450a6(null);
        duringCreated(this.f18060i.flatMap(new w9j() { // from class: l.vi80
            public final Object call(Object obj) {
                return this.f21136a.m21455g5((j760) obj);
            }
        })).filter(new w9j() { // from class: l.wi80
            public final Object call(Object obj) {
                return this.f21786a.m21456h5((BLive) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.yi80
            public final void call(Object obj) {
                this.f22899a.m21457i5((BLive) obj);
            }
        }, new e30() { // from class: l.pk80
            public final void call(Object obj) {
                this.f17456a.m21458j5((Throwable) obj);
            }
        }));
        duringCreated(zfv.m27205E0()).subscribe(ffw.e(new e30() { // from class: l.ni80
            public final void call(Object obj) {
                this.f16048a.m21460l5((BLivePageCampaign) obj);
            }
        }, new e30() { // from class: l.oi80
            public final void call(Object obj) {
                qk80.m21405w4((Throwable) obj);
            }
        }));
        duringCreated(LivingNormalApiProvider.m4955u4(ypv.a.D0())).subscribe(ffw.e(new e30() { // from class: l.pi80
            public final void call(Object obj) {
                this.f17382a.m21434S5((BLiveAnchor) obj);
            }
        }, new e30() { // from class: l.qi80
            public final void call(Object obj) {
                qk80.m21380Z3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m21399q4(Throwable th) {
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m21400r4(BLivePkSeek bLivePkSeek) {
    }

    /* JADX INFO: renamed from: u4 */
    public static /* synthetic */ void m21403u4(Throwable th) {
    }

    /* JADX INFO: renamed from: w4 */
    public static /* synthetic */ void m21405w4(Throwable th) {
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m21409A5(BLive bLive) {
        this.f18066o++;
        this.f18060i.onNext(vwb.Y(Boolean.TRUE, bLive));
        eet.m12448b(this, "anchor_preivew_stop_live", null);
    }

    /* JADX INFO: renamed from: B5 */
    public final /* synthetic */ void m21410B5(BLive bLive) {
        if (this.f18070s) {
            lsi0.h(R$string.f3043Ud);
            return;
        }
        this.f18064m = true;
        this.f18060i.onNext(vwb.Y(Boolean.FALSE, bLive));
        eet.m12448b(this, "anchor_preivew_start_live", new e30() { // from class: l.dk80
            public final void call(Object obj) {
                ((Map) obj).put("isFirstTry", "false");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ Boolean m21411C5(BLiveRoom bLiveRoom) {
        return Boolean.valueOf(((yl40) m25547E2()).m17237m().m15303f());
    }

    /* JADX INFO: renamed from: D5 */
    public final /* synthetic */ c m21412D5(BLiveRoom bLiveRoom) {
        if (!BLiveRoom.EMPTY.equals(bLiveRoom)) {
            return duringCreated(LivingNormalApiProvider.m4893n5(((BLiveAbsRoom) bLiveRoom).id));
        }
        BLivePushLimit bLivePushLimitNew_ = BLivePushLimit.new_();
        bLivePushLimitNew_.remaining = ypv.k().b5();
        return c.just(bLivePushLimitNew_);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m21413E5(BLivePushLimit bLivePushLimit) {
        if (((yl40) m25547E2()).m17237m().m15303f()) {
            this.f18065n = bLivePushLimit;
            ((PreviewView) ((bwr) this).viewModel).m5357m0(bLivePushLimit);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F5 */
    public final /* synthetic */ Boolean m21414F5(BLiveRoom bLiveRoom) {
        return Boolean.valueOf(((yl40) m25547E2()).m17237m().m15301d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G5 */
    public final /* synthetic */ Boolean m21415G5(BLiveRoom bLiveRoom) {
        return Boolean.valueOf(!BLiveRoom.EMPTY.equals(bLiveRoom) && ((yl40) m25547E2()).m17237m().m15303f());
    }

    /* JADX INFO: renamed from: H5 */
    public final /* synthetic */ void m21416H5(d30 d30Var, BLiveRoom bLiveRoom) {
        Picture pictureFp;
        BLiveRoomCover bLiveRoomCover = ((BLiveAbsRoom) bLiveRoom).cover;
        if (bLiveRoomCover != null) {
            pictureFp = bLiveRoomCover.media;
            boolean zEquals = TEnum.equals(bLiveRoomCover.status, "pending");
            s7m s7mVar = ((bwr) this).viewModel;
            if (zEquals) {
                ((PreviewView) s7mVar).m5352h0(true);
            } else {
                ((PreviewView) s7mVar).m5352h0(false);
            }
        } else {
            pictureFp = ypv.a.V().fp();
        }
        ((PreviewView) ((bwr) this).viewModel).m5358n0(TextUtils.isEmpty(bLiveRoom.mTempTitle) ? ((BLiveAbsRoom) bLiveRoom).title : bLiveRoom.mTempTitle, ((Media) pictureFp).url);
        bLiveRoom.mTempTitle = null;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I5 */
    public void m21417I5() {
        if (((yl40) m25547E2()).m17237m().m15303f()) {
            ((PreviewView) ((bwr) this).viewModel).setPreviewContentVisibility(true);
        }
    }

    /* JADX INFO: renamed from: J5 */
    public void m21418J5() {
        BLivePushLimit bLivePushLimit = this.f18065n;
        if (bLivePushLimit != null) {
            long jM21429Q5 = m21429Q5(bLivePushLimit);
            int i = this.f18065n.remaining;
            if (i <= 0 || jM21429Q5 / 1000 > 0) {
                if (i > 0) {
                    lsi0.B(ypv.e.getString(R$string.f3102X9, qqi0.e(this.f22037f, jM21429Q5)), true, true);
                    return;
                } else {
                    lsi0.y(ypv.e.getString(R$string.f3539ra));
                    return;
                }
            }
        }
        ((PreviewView) ((bwr) this).viewModel).m5350e0();
    }

    /* JADX INFO: renamed from: K5 */
    public void m21419K5() {
        if (!vdt.b(2)) {
            m21426O5();
        } else {
            Act act = this.f22037f;
            act.duringCreated(ypv.a.F0(act)).observeOn(jo0.a()).subscribe(ffw.h(new e30() { // from class: l.nk80
                public final void call(Object obj) {
                    this.f16079a.m21464p5((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: L5 */
    public void m21420L5() {
        ((zwl) m14184F3(new tt00(2600))).mo22654f();
    }

    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public final c<? extends BLiveAbsRoom> m21470v5(String str, BLiveAbsRoom bLiveAbsRoom) {
        if (!m21444X4(bLiveAbsRoom)) {
            return c.just(bLiveAbsRoom);
        }
        BLiveRoom bLiveRoomNew_ = BLiveRoom.new_();
        ((BLiveAbsRoom) bLiveRoomNew_).title = str;
        BLiveRoomCover bLiveRoomCoverNew_ = BLiveRoomCover.new_();
        bLiveRoomCoverNew_.media = bLiveAbsRoom.cover.media;
        ((BLiveAbsRoom) bLiveRoomNew_).cover = bLiveRoomCoverNew_;
        return LivingNormalApiProvider.m5002z6(bLiveAbsRoom.id, bLiveRoomNew_);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M5 */
    public void m21422M5(String str) {
        ((yl40) m25547E2()).m26797T2(str);
        m25548F2().ObsPreviewEvent.pushTypeChanged().j(str);
    }

    /* JADX INFO: renamed from: N4 */
    public final void m21423N4() {
        duringCreated(m21431R4()).filter(new w9j() { // from class: l.kj80
            public final Object call(Object obj) {
                return this.f14355a.m21452d5((BLive) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.lj80
            public final void call(Object obj) {
                this.f14887a.m21443W5((BLive) obj);
            }
        }, new e30() { // from class: l.mj80
            public final void call(Object obj) {
                this.f15406a.m21453e5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N5 */
    public final void m21424N5() {
        this.f22037f.duringCreated(LivingNormalApiProvider.m4543A6()).subscribe(ffw.e(new e30() { // from class: l.yj80
            public final void call(Object obj) {
                this.f22917a.m21465q5((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.zj80
            public final void call(Object obj) {
                this.f23450a.m21466r5((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    public final Boolean m21425O4(BLive bLive) {
        boolean zM21440V4 = m21440V4(bLive);
        boolean z = true;
        if (zM21440V4 && this.f18066o < 1) {
            if (((yl40) m25547E2()).m26790M2()) {
                return Boolean.TRUE;
            }
            m21443W5(bLive);
        }
        if (zM21440V4 && this.f18066o < 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O5 */
    public final void m21426O5() {
        tk80.m22997e("p_anchor_live_ready");
        m25548F2().RoomMysteryEventGroup.clearRoomFakeId().p();
        if (this.f18070s) {
            lsi0.h(R$string.f3043Ud);
            return;
        }
        final String title = ((PreviewView) ((bwr) this).viewModel).getTitle();
        if (!TextUtils.isEmpty(title)) {
            title = title.trim();
            if (TextUtils.isEmpty(title)) {
                act().dialog().F(ypv.e.getString(R$string.f3185b7)).s0(R$string.f3465o2).z0();
                return;
            }
        }
        h5j0.INSTANCE.d("create_live_room");
        if (!TextUtils.equals(this.f18062k.anchorSource, "back-from-official-show")) {
            act().progress(ypv.e.getString(R$string.f3145Za));
        }
        this.f18064m = true;
        duringCreated(((yl40) m25547E2()).m26789L2(title, ypv.a.V().fp()).filter(new w9j() { // from class: l.nj80
            public final Object call(Object obj) {
                return this.f16071a.m21427P4((BLiveRoom) obj);
            }
        }).flatMap(new w9j() { // from class: l.oj80
            public final Object call(Object obj) {
                return this.f16645a.m21467s5((BLiveRoom) obj);
            }
        }).filter(new w9j() { // from class: l.pj80
            public final Object call(Object obj) {
                return this.f17414a.m21425O4((BLive) obj);
            }
        }).flatMap(new w9j() { // from class: l.qj80
            public final Object call(Object obj) {
                return this.f18011a.m21468t5((BLive) obj);
            }
        }).map(new w9j() { // from class: l.rj80
            public final Object call(Object obj) {
                return this.f18564a.m21469u5((BLive) obj);
            }
        }).flatMap(new w9j() { // from class: l.sj80
            public final Object call(Object obj) {
                return this.f19053a.m21470v5(title, (BLiveAbsRoom) obj);
            }
        })).subscribe(ffw.e(new e30() { // from class: l.uj80
            public final void call(Object obj) {
                this.f20672a.m21471w5((BLiveAbsRoom) obj);
            }
        }, new e30() { // from class: l.vj80
            public final void call(Object obj) {
                this.f21186a.m21472x5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P4 */
    public final Boolean m21427P4(BLiveRoom bLiveRoom) {
        BLiveRoomCover bLiveRoomCover;
        if (BLiveRoom.EMPTY.equals(bLiveRoom)) {
            jfd0.a("room is null");
            return null;
        }
        if (this.f18069r || (bLiveRoomCover = ((BLiveAbsRoom) bLiveRoom).cover) == null || !bLiveRoomCover.isDefaultCover) {
            return Boolean.TRUE;
        }
        this.f18069r = true;
        act().progressDismiss();
        new em0().m12614k(m25549H2(), bLiveRoom);
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: Q4 */
    public boolean m21428Q4() {
        return ypv.k().C3();
    }

    /* JADX INFO: renamed from: Q5 */
    public final long m21429Q5(BLivePushLimit bLivePushLimit) {
        return ((long) bLivePushLimit.availableTime) - qib0.H.guessedCurrentServerTime();
    }

    @Override // p002l.wxs
    /* JADX INFO: renamed from: R2 */
    public String mo21430R2() {
        return "p_anchor_live_ready";
    }

    /* JADX INFO: renamed from: R4 */
    public final c<BLive> m21431R4() {
        BLive bLive = this.f18061j;
        return bLive == null ? LivingNormalApiProvider.m4560C5(ypv.a.D0()).map(new w9j() { // from class: l.wj80
            public final Object call(Object obj) {
                return this.f21800a.m21454f5((BLive) obj);
            }
        }).doOnNext(new e30() { // from class: l.xj80
            public final void call(Object obj) {
                this.f22313a.m21448Z5((BLive) obj);
            }
        }) : c.just(bLive);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R5 */
    public final void m21432R5() {
        if (m21428Q4() || ypv.k().r6()) {
            this.f18072u.put(((yl40) m25547E2()).m26788K2());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S4 */
    public BLiveRoom m21433S4() {
        return ((yl40) m25547E2()).m17238n() == null ? BLiveRoom.EMPTY : ((yl40) m25547E2()).m20501A2().mo19689j();
    }

    /* JADX INFO: renamed from: S5 */
    public final void m21434S5(BLiveAnchor bLiveAnchor) {
        if (bLiveAnchor != null && bLiveAnchor.liveSetting.callSwitch.on) {
            m25548F2().CallEvent.anchorCall().j(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m21435T() {
        super.T();
        if (ypv.k().r6()) {
            ((PreviewView) ((bwr) this).viewModel).m5356k0();
            ((PreviewView) ((bwr) this).viewModel).m5353i0((String) this.f18072u.get());
        }
        if (((idv) ypv.l(fld0.b)).f()) {
            act().dialog().D(R$string.f3074W2).k0(R$string.f3053V2).A0();
        }
        m14188d3(rk80.class, new w9j() { // from class: l.mi80
            public final Object call(Object obj) {
                return this.f15392a.m21446Y4((rk80) obj);
            }
        });
        duringCreated((c) m25548F2().LivePusherEvent.dismissBeautyDialog().g()).subscribe(ffw.d(new e30() { // from class: l.xi80
            public final void call(Object obj) {
                this.f22291a.m21381Z4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().MomoSdkEvent.sdkActionEvent().g()).filter(new w9j() { // from class: l.ij80
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() == 2);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.tj80
            public final void call(Object obj) {
                this.f20275a.m21449a5((Integer) obj);
            }
        }));
        ((kql) m14184F3(new s0f(2600))).mo12701b(new ddt(new C0791a()));
        aqe.m10039i().m10053r();
        m14191h3(m25548F2().LivePusherEvent.notifyRecoverLiveStopped(), new e30() { // from class: l.ek80
            public final void call(Object obj) {
                this.f9834a.m21384b5((soj0) obj);
            }
        });
        act().lifecycle().filter(new w9j() { // from class: l.lk80
            public final Object call(Object obj) {
                return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.i);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.mk80
            public final void call(Object obj) {
                this.f15421a.m21451c5((com.p1.mobile.android.app.c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T4 */
    public final String m21436T4(Boolean bool) {
        return bool.booleanValue() ? "preview" : "start-live-button";
    }

    /* JADX INFO: renamed from: T5 */
    public final void m21437T5() {
        this.f18070s = true;
        act().dialog().F(ypv.e.getString(R$string.f3714z9)).G0(ypv.e.getString(R$string.f2992S4)).m0(ypv.e.getString(R$string.f3704z)).v0(ypv.e.getString(R$string.f3514q7), new Runnable() { // from class: l.hj80
            @Override // java.lang.Runnable
            public final void run() {
                this.f12062a.m21473y5();
            }
        }).z0();
    }

    /* JADX INFO: renamed from: U4 */
    public void m21438U4() {
        xdl0.M(((bwr) this).viewModel, false);
    }

    /* JADX INFO: renamed from: U5 */
    public boolean m21439U5() {
        return ((PreviewView) ((bwr) this).viewModel).m5355j0();
    }

    /* JADX INFO: renamed from: V4 */
    public final boolean m21440V4(BLive bLive) {
        return TEnum.equals(((BLiveAbsData) bLive).state, "suspended") || TEnum.equals(((BLiveAbsData) bLive).state, "onlive") || TEnum.equals(((BLiveAbsData) bLive).state, "born");
    }

    /* JADX INFO: renamed from: V5 */
    public void m21441V5() {
        m25548F2().BottomEvent.showDialog().j(BLiveButtonType.get("beauty"));
        ((PreviewView) ((bwr) this).viewModel).setPreviewContentVisibility(false);
    }

    /* JADX INFO: renamed from: W4 */
    public final boolean m21442W4() {
        return this.f18060i.i() && !((Boolean) ((j760) this.f18060i.e()).a).booleanValue();
    }

    /* JADX INFO: renamed from: W5 */
    public final void m21443W5(final BLive bLive) {
        this.f18072u.put(((BLiveAbsData) bLive).liveMode);
        ((PreviewView) ((bwr) this).viewModel).m5353i0(((BLiveAbsData) bLive).liveMode);
        if ("obs".equals(((BLiveAbsData) bLive).liveMode)) {
            this.f18066o++;
            this.f18060i.onNext(vwb.Y(Boolean.TRUE, bLive));
            return;
        }
        if (!TextUtils.equals(this.f18062k.anchorSource, "back-from-official-show")) {
            final String strM22810b = t7t.m22810b(bLive);
            if (TextUtils.isEmpty(strM22810b)) {
                this.f18068q = act().dialog().F(ypv.e.getString(R$string.f3299gb)).n0(ypv.e.getString(R$string.f3233db), new Runnable() { // from class: l.bk80
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8195a.m21409A5(bLive);
                    }
                }).v0(ypv.e.getString(R$string.f3277fb), new Runnable() { // from class: l.ck80
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8708a.m21410B5(bLive);
                    }
                }).B(false).z0();
                return;
            } else {
                new xh0.a(this.f22037f).j("您有一场公演正在进行中").r("去公演").o(new View.OnClickListener() { // from class: l.ak80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f7665a.m21474z5(strM22810b, view);
                    }
                }).p(h1c0.f11777d).g(false).h(false).a().g();
                return;
            }
        }
        if (this.f18062k.switchRoomData != null) {
            ubu ubuVar = new ubu();
            ubuVar.f20575a = 1;
            AnchorStartData.OfficialShowSwitchRoomData officialShowSwitchRoomData = this.f18062k.switchRoomData;
            ubuVar.f20576b = officialShowSwitchRoomData.avatarUrl;
            ubuVar.f20577c = officialShowSwitchRoomData.name;
            ubuVar.f20578d = "已结束本次公演，感谢参与～";
            ubuVar.f20579e = "知道了";
            m25548F2().LiveTipEvent.showTip().j(ubuVar);
        }
        if (this.f18070s) {
            lsi0.h(R$string.f3043Ud);
        } else {
            this.f18064m = true;
            this.f18060i.onNext(vwb.Y(Boolean.FALSE, bLive));
        }
    }

    /* JADX INFO: renamed from: X4 */
    public final boolean m21444X4(BLiveAbsRoom bLiveAbsRoom) {
        return !TextUtils.equals(bLiveAbsRoom.title, ((PreviewView) ((bwr) this).viewModel).getTitle());
    }

    /* JADX INFO: renamed from: X5, reason: merged with bridge method [inline-methods] */
    public final void m21457i5(BLive bLive) {
        boolean zM21442W4 = m21442W4();
        m25548F2().LivePusherEvent.startLive().j(new cdt(zM21442W4, ((BLiveAbsData) this.f18061j).id, m21436T4(Boolean.valueOf(zM21442W4))));
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ Boolean m21446Y4(rk80 rk80Var) {
        return Boolean.valueOf(m21439U5());
    }

    /* JADX INFO: renamed from: Y5 */
    public void m21447Y5() {
        BLiveRoom bLiveRoomM21433S4 = m21433S4();
        bLiveRoomM21433S4.mTempTitle = ((PreviewView) ((bwr) this).viewModel).getTitle();
        m25549H2().startActivityForResult(LiveCoverAct.m9099b2(m25549H2().getContext(), ((BLiveAbsRoom) bLiveRoomM21433S4).id, "from_preview"), 100);
    }

    /* JADX INFO: renamed from: Z5 */
    public void m21448Z5(BLive bLive) {
        if (!TextUtils.isEmpty(bLive.pkInfo.ongoingId)) {
            duringCreated(LivingNormalApiProvider.m4894n6(bLive.pkInfo.ongoingId, "quit")).subscribe(ffw.e(new e30() { // from class: l.fk80
                public final void call(Object obj) {
                    qk80.m21379Y3((BLivePk) obj);
                }
            }, new e30() { // from class: l.gk80
                public final void call(Object obj) {
                    qk80.m21403u4((Throwable) obj);
                }
            }));
        }
        if (!TextUtils.isEmpty(bLive.pkInfo.ongoingSeekId)) {
            duringCreated(LivingNormalApiProvider.m4747X3(bLive.pkInfo.ongoingSeekId)).subscribe(ffw.e(new e30() { // from class: l.hk80
                public final void call(Object obj) {
                    qk80.m21400r4((BLivePkSeek) obj);
                }
            }, new e30() { // from class: l.ik80
                public final void call(Object obj) {
                    qk80.m21399q4((Throwable) obj);
                }
            }));
        }
        if (TextUtils.isEmpty(bLive.pkInfo.ongoingInviteId)) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m4738W3(bLive.pkInfo.ongoingInviteId)).subscribe(ffw.e(new e30() { // from class: l.jk80
            public final void call(Object obj) {
                qk80.m21354C4((BLivePkInvite) obj);
            }
        }, new e30() { // from class: l.kk80
            public final void call(Object obj) {
                qk80.m21363K3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m21449a5(Integer num) {
        this.f18070s = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a6 */
    public final void m21450a6(final d30 d30Var) {
        duringCreated(((yl40) m25547E2()).m26795R2().filter(new w9j() { // from class: l.zi80
            public final Object call(Object obj) {
                return this.f23441a.m21411C5((BLiveRoom) obj);
            }
        }).flatMap(new w9j() { // from class: l.aj80
            public final Object call(Object obj) {
                return this.f7660a.m21412D5((BLiveRoom) obj);
            }
        })).subscribe(ffw.e(new e30() { // from class: l.bj80
            public final void call(Object obj) {
                this.f8182a.m21413E5((BLivePushLimit) obj);
            }
        }, new e30() { // from class: l.cj80
            public final void call(Object obj) {
                qk80.m21386d4((Throwable) obj);
            }
        }));
        duringCreated(((yl40) m25547E2()).m20501A2().m21485f()).takeUntil(new w9j() { // from class: l.dj80
            public final Object call(Object obj) {
                return this.f9305a.m21414F5((BLiveRoom) obj);
            }
        }).filter(new w9j() { // from class: l.ej80
            public final Object call(Object obj) {
                return this.f9822a.m21415G5((BLiveRoom) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.fj80
            public final void call(Object obj) {
                this.f10422a.m21416H5(d30Var, (BLiveRoom) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c5 */
    public final /* synthetic */ void m21451c5(com.p1.mobile.android.app.c cVar) {
        act().progressDismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ Boolean m21452d5(BLive bLive) {
        return Boolean.valueOf(((yl40) m25547E2()).m17237m().m15303f() && m21440V4(bLive));
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ void m21453e5(Throwable th) {
        this.f18064m = false;
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ BLive m21454f5(BLive bLive) {
        this.f18061j = bLive;
        return bLive;
    }

    /* JADX INFO: renamed from: g5 */
    public final /* synthetic */ c m21455g5(j760 j760Var) {
        return (!((Boolean) j760Var.a).booleanValue() || this.f18067p) ? c.just((BLive) j760Var.b) : LivingNormalApiProvider.m4643L7(((BLiveAbsData) ((BLive) j760Var.b)).id, true);
    }

    /* JADX INFO: renamed from: h5 */
    public final /* synthetic */ Boolean m21456h5(BLive bLive) {
        if (!m21442W4()) {
            this.f18067p = true;
        }
        if (bLive.isMultiCall() && !"friends".equals(((BLiveAbsData) bLive).liveMode)) {
            r610.I(bLive.multiCallInfo.role, ((BLiveAbsData) bLive).id);
        }
        this.f18061j = bLive;
        return Boolean.valueOf(this.f18064m);
    }

    /* JADX INFO: renamed from: j5 */
    public final /* synthetic */ void m21458j5(Throwable th) {
        act().progressDismiss();
        lsi0.j(ypv.e.getString(R$string.f2762H9));
    }

    /* JADX INFO: renamed from: k5 */
    public final /* synthetic */ void m21459k5(BLiveCampaignLink bLiveCampaignLink) {
        m25548F2().OpenH5Event.open().j(jp50.m16064c(400).m16094B(bLiveCampaignLink.jumpUrl).m16103x().m16096q());
    }

    /* JADX INFO: renamed from: l5 */
    public final /* synthetic */ void m21460l5(BLivePageCampaign bLivePageCampaign) {
        ((PreviewView) ((bwr) this).viewModel).m5351g0(bLivePageCampaign, new e30() { // from class: l.jj80
            public final void call(Object obj) {
                this.f13804a.m21459k5((BLiveCampaignLink) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m5 */
    public final /* synthetic */ void m21461m5(View view) {
        this.f18063l.callOnClick();
    }

    /* JADX INFO: renamed from: n5 */
    public final /* synthetic */ void m21462n5(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.f18073v.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: o5 */
    public final /* synthetic */ void m21463o5(iqv iqvVar) {
        int iM15298a = iqvVar.m15298a();
        if (iM15298a == 1) {
            this.f18063l.setVisibility(4);
            ((PreviewView) ((bwr) this).viewModel).m5358n0("", ((Media) ypv.a.V().fp()).url);
            this.f18071t.m23001d();
        } else {
            if (iM15298a != 2) {
                return;
            }
            this.f18063l.setVisibility(0);
            m21438U4();
            m21371P5();
            m21432R5();
        }
    }

    /* JADX INFO: renamed from: p5 */
    public final /* synthetic */ void m21464p5(Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            tn0.m23076l(this.f22037f).map(new w9j() { // from class: l.gj80
                public final Object call(Object obj) {
                    return Boolean.TRUE;
                }
            }).subscribe(ffw.c());
        } else {
            m21424N5();
        }
    }

    /* JADX INFO: renamed from: q5 */
    public final /* synthetic */ void m21465q5(BLiveEnvelope bLiveEnvelope) {
        m21426O5();
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ void m21466r5(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.j(th.getLocalizedMessage());
        } else if (((TantanException.Client.CoreService) th).code == 40001) {
            m21426O5();
        }
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ c m21467s5(BLiveRoom bLiveRoom) {
        return m21431R4();
    }

    /* JADX INFO: renamed from: t5 */
    public final /* synthetic */ c m21468t5(BLive bLive) {
        return (m21442W4() || !m21440V4(bLive) || this.f18067p) ? c.just(bLive) : LivingNormalApiProvider.m4643L7(((BLiveAbsData) bLive).id, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u5 */
    public final /* synthetic */ BLiveAbsRoom m21469u5(BLive bLive) {
        this.f18067p = true;
        return ((yl40) m25547E2()).m17238n();
    }

    /* JADX INFO: renamed from: w5 */
    public final /* synthetic */ void m21471w5(BLiveAbsRoom bLiveAbsRoom) {
        act().progressDismiss();
        h5j0.INSTANCE.c("create_live_room", "checkNeedPatchRoom");
        m25548F2().LivePusherEvent.startLive().j(new cdt(false, null, m21436T4(Boolean.FALSE)));
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ void m21472x5(Throwable th) {
        act().progressDismiss();
        this.f18064m = false;
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.h(R$string.f2762H9);
            return;
        }
        TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
        if (coreService.code == 41013) {
            lsi0.j(ypv.e.getString(R$string.f3696yd));
        }
        if (coreService.code == 41024) {
            if (vdt.b(2)) {
                lsi0.j("你已提交了认证申请，请耐心等待审核结果");
            } else {
                lsi0.j(coreService.metaMessage);
            }
        }
    }

    /* JADX INFO: renamed from: y5 */
    public final /* synthetic */ void m21473y5() {
        try {
            ane0.x(act());
        } catch (Exception e) {
            CrashHelper.c(e);
            lsi0.w(R$string.f3692y9);
        }
    }

    /* JADX INFO: renamed from: z5 */
    public final /* synthetic */ void m21474z5(String str, View view) {
        m25548F2().OfficialShowEvent.recoverOfficialShow().j(str);
    }
}
