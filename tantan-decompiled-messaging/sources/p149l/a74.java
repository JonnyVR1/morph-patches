package p149l;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a74 extends h4t<ho2, p14> {

    /* JADX INFO: renamed from: i */
    public q0s f67836i;

    /* JADX INFO: renamed from: j */
    public HashMap<String, BLiveCall> f67837j;

    public a74(bsm bsmVar, FrameLayout frameLayout, q0s q0sVar) {
        super(bsmVar);
        this.f67837j = new HashMap<>();
        this.f67836i = q0sVar;
        p14 p14Var = new p14();
        mo51532C(p14Var);
        m95213f4(frameLayout, p14Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m95182A4(tzd tzdVar) {
        m95222o4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r6v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r6v13, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r6v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r6v9, types: [l.ho2] */
    /* JADX INFO: renamed from: D4 */
    public void m95183D4(String str) {
        BLiveCall bLiveCallM108753f = this.f67836i.m162531Z3().m108753f(str);
        if (v44.m196937e(bLiveCallM108753f)) {
            m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(4400).userId(str).giftSource(v44.m196940h(bLiveCallM108753f) ? "callVideoVice" : "callVoiceVice").setFromIdentity(bqq.m103386a(this, m206027E2().m132146l0().f56011id, str, 4400)).setTo(bqq.m103389d(this, m206027E2().m132146l0().f56011id, str, 4400)).setSource("live").setScene("call").trackFrom("liveRoom").build());
        } else {
            m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(4400).userId(str).setFromIdentity(bqq.m103386a(this, m206027E2().m132146l0().f56011id, str, 4400)).setTo(bqq.m103389d(this, m206027E2().m132146l0().f56011id, str, 4400)).setSource("live").setScene("call").trackFrom("liveRoom").build());
        }
    }

    /* JADX INFO: renamed from: G4 */
    private void m95184G4(List<d1q<?>> list) {
        ((p14) this.viewModel).m167025k(list);
    }

    /* JADX INFO: renamed from: I4 */
    private void m95185I4() {
        m206028F2().CallEvent.updateCallNum().mo172464m(Integer.valueOf(vwb.m200339n(this.f67837j.values(), new w9j() { // from class: l.x64
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveCall bLiveCall = (BLiveCall) obj;
                return Boolean.valueOf((v44.m196940h(bLiveCall) || v44.m196941i(bLiveCall)) ? false : true);
            }
        }).size()));
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ Boolean m95191O3(BLiveCall bLiveCall, d1q d1qVar) {
        return d1qVar instanceof mfp0 ? Boolean.valueOf(TextUtils.equals(((mfp0) d1qVar).f133608a, bLiveCall.f44342id)) : Boolean.FALSE;
    }

    private boolean isShowing() {
        return m206031K2().m182463f(LiveDialogEnum.CALL_ANCHOR_CHECK_DIALOG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public void m95204r4(cud cudVar) {
        int i = cudVar.f82558e;
        if (i == 3) {
            if (cudVar.m108762o()) {
                m95207E4(cudVar.f82557d);
            }
        } else if (i == 4 && cudVar.m108762o()) {
            m95212e4(cudVar.f82557d);
        }
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ Boolean m95205B4(a35 a35Var) {
        return Boolean.valueOf(m95223p4() > 0);
    }

    /* JADX INFO: renamed from: C4 */
    public final void m95206C4(BLiveCall bLiveCall, i54 i54Var, mfp0 mfp0Var) {
        m95209H4(bLiveCall, mfp0Var);
        this.f67836i.m172355z4(new z24(bLiveCall, i54Var));
    }

    /* JADX INFO: renamed from: E4 */
    public void m95207E4(BLiveCall bLiveCall) {
        this.f67837j.remove(bLiveCall.f44342id);
        m95185I4();
        if (isShowing()) {
            ((p14) this.viewModel).m167024j(m95220m4(bLiveCall));
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final void m95208F4(i0s i0sVar) {
        this.f67837j.clear();
        vwb.m200354z(i0sVar.m133919m(), new e30() { // from class: l.n64
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137267a.m95232z4((BLiveCall) obj);
            }
        });
        m95185I4();
        this.f67836i.m201783e5(m95219l4(i0sVar));
        m95184G4(m95215h4(i0sVar));
    }

    /* JADX INFO: renamed from: H4 */
    public final void m95209H4(BLiveCall bLiveCall, mfp0 mfp0Var) {
        mfp0Var.m154407S(bLiveCall);
        ((p14) this.viewModel).m167023i(mfp0Var);
    }

    /* JADX INFO: renamed from: c4 */
    public final void m95210c4(BLiveCall bLiveCall, i54 i54Var) {
        this.f67837j.put(bLiveCall.f44342id, bLiveCall);
        m95185I4();
        if (isShowing()) {
            List<d1q<?>> listM167021d = ((p14) this.viewModel).m167021d();
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < listM167021d.size(); i3++) {
                if (listM167021d.get(i3) instanceof mfp0) {
                    if (!v44.m196937e(((mfp0) listM167021d.get(i3)).m154401J())) {
                        if (i3 != 0) {
                            i = i3 - 1;
                        }
                        m95184G4(new ArrayList(m95211d4(bLiveCall, i54Var, i)));
                    } else if (i3 == listM167021d.size() - 2) {
                        i2 = i3 + 1;
                    }
                }
            }
            i = i2;
            m95184G4(new ArrayList(m95211d4(bLiveCall, i54Var, i)));
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final List<d1q<?>> m95211d4(BLiveCall bLiveCall, i54 i54Var, int i) {
        List<d1q<?>> listM167021d = ((p14) this.viewModel).m167021d();
        listM167021d.add(i, m95218k4(bLiveCall, i54Var));
        return listM167021d;
    }

    /* JADX INFO: renamed from: e4 */
    public final void m95212e4(BLiveCall bLiveCall) {
        this.f67837j.put(bLiveCall.f44342id, bLiveCall);
        m95185I4();
        if (isShowing()) {
            m95216i4();
            List<BLiveCall> listM108759l = this.f67836i.m162531Z3().m108759l();
            for (int i = 0; i < listM108759l.size(); i++) {
                List<d1q<?>> listM95211d4 = m95211d4(listM108759l.get(i), this.f67836i.m162531Z3().m108760m().m133917k(listM108759l.get(i).user), i);
                if (i == listM108759l.size() - 1) {
                    m95184G4(new ArrayList(listM95211d4));
                }
            }
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m95213f4(FrameLayout frameLayout, p14 p14Var) {
        View viewM167022e = p14Var.m167022e();
        int i = xdl0.f192403e;
        frameLayout.addView(viewM167022e, new FrameLayout.LayoutParams(i, i));
    }

    /* JADX INFO: renamed from: g4 */
    public void m95214g4(final mfp0 mfp0Var) {
        duringCreated(LivingNormalApiProvider.m71183B3(mfp0Var.m154401J().f44342id)).subscribe(ffw.m121194e(new e30() { // from class: l.p64
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147364a.m95227u4(mfp0Var, (BLiveCall) obj);
            }
        }, new e30() { // from class: l.q64
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152850a.m95226t4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public final List<d1q<?>> m95215h4(final i0s i0sVar) {
        return vwb.m200303Q(i0sVar.m133919m(), new w9j() { // from class: l.o64
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f141972a.m95228v4(i0sVar, (BLiveCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i4 */
    public final void m95216i4() {
        List<d1q<?>> listM167021d = ((p14) this.viewModel).m167021d();
        ArrayList arrayList = new ArrayList(listM167021d);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof mfp0) {
                mfp0 mfp0Var = (mfp0) arrayList.get(i);
                if (this.f67836i.m162531Z3().m108752e(mfp0Var.m154401J().f44342id) != null) {
                    listM167021d.remove(mfp0Var);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j4 */
    public void m95217j4(final mfp0 mfp0Var) {
        new xh0.C21150a(act()).m208731j(this.f188513f.getString(R$string.f47159c1, mfp0Var.m154402K().f111521b)).m208737p(h1c0.f105394p0).m208738q(R$string.f47137b1).m208736o(new View.OnClickListener() { // from class: l.l64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126228a.m95229w4(mfp0Var, view);
            }
        }).m208725d(h1c0.f105343X0).m208726e(R$string.f46842N1).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: k4 */
    public final mfp0 m95218k4(BLiveCall bLiveCall, i54 i54Var) {
        return new mfp0(bLiveCall, i54Var).m154404P(new e30() { // from class: l.y64
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196508a.m95217j4((mfp0) obj);
            }
        }).m154406R(new e30() { // from class: l.z64
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201885a.m95221n4((mfp0) obj);
            }
        }).m154405Q(new e30() { // from class: l.h64
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106006a.m95183D4((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l4 */
    public final i0s m95219l4(i0s i0sVar) {
        return new i0s(i0sVar, "on-video", "on-voice");
    }

    /* JADX INFO: renamed from: m4 */
    public final mfp0 m95220m4(final BLiveCall bLiveCall) {
        return (mfp0) vwb.m200346r(((p14) this.viewModel).m167021d(), new w9j() { // from class: l.k64
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return a74.m95191O3(bLiveCall, (d1q) obj);
            }
        });
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f67837j.clear();
        m206028F2().CallEvent.updateCallNum().mo172464m(0);
    }

    /* JADX INFO: renamed from: n4 */
    public final void m95221n4(final mfp0 mfp0Var) {
        new xh0.C21150a(act()).m208731j(this.f188513f.getString(R$string.f47489r2, mfp0Var.m154402K().f111521b)).m208737p(h1c0.f105394p0).m208738q(R$string.f47423o2).m208736o(new View.OnClickListener() { // from class: l.m64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131442a.m95230x4(mfp0Var, view);
            }
        }).m208725d(h1c0.f105343X0).m208726e(R$string.f46842N1).m208722a().m208721g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: o4 */
    public final void m95222o4() {
        duringCreated(LivingNormalApiProvider.m71273L3(m206027E2().m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.i64
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111674a.m95208F4((i0s) obj);
            }
        }, new e30() { // from class: l.j64
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116386a.m95231y4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p4 */
    public int m95223p4() {
        return this.f67837j.size();
    }

    /* JADX INFO: renamed from: q4 */
    public final void m95224q4(LiveCallMessage liveCallMessage) {
        int type = liveCallMessage.getType();
        if (type == 3) {
            m95210c4(liveCallMessage.getCall(), liveCallMessage.getCallUser());
            return;
        }
        if (type == 4) {
            m95207E4(liveCallMessage.getCall());
        } else if (type == 30 && r14.f157235f.equals(liveCallMessage.getCall())) {
            lsi0.m151593w(R$string.f47291i1);
            m95207E4(liveCallMessage.getCall());
        }
    }

    /* JADX INFO: renamed from: s4 */
    public void m95225s4() {
        m206031K2().m182470m(LiveDialogEnum.CALL_ANCHOR_CHECK_DIALOG);
        m206028F2().CallEvent.anchorInviteAudience().m172467p();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m95222o4();
        duringCreated(m206028F2().DialogCenterEvent.changeVisibility().m172460g()).filter(new w9j() { // from class: l.g64
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((tzd) obj).f172729a == LiveDialogEnum.CALL_ANCHOR_CHECK_DIALOG);
            }
        }).filter(new w9j() { // from class: l.r64
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((tzd) obj).f172731c);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.s64
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162613a.m95182A4((tzd) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189101f()).subscribe(ffw.m121193d(new e30() { // from class: l.t64
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167921a.m95224q4((LiveCallMessage) obj);
            }
        }));
        duringCreated(this.f67836i.m162532a4()).subscribe(ffw.m121193d(new e30() { // from class: l.u64
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174794a.m95204r4((cud) obj);
            }
        }));
        m129301d3(a35.class, new w9j() { // from class: l.v64
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f180153a.m95205B4((a35) obj);
            }
        });
        duringCreated(m206028F2().CallEvent.removeCallCheck().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.w64
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184806a.m95207E4((BLiveCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m95226t4(Throwable th) {
        this.f67836i.m162527V3(th);
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m95227u4(mfp0 mfp0Var, BLiveCall bLiveCall) {
        m95206C4(bLiveCall, mfp0Var.m154402K(), mfp0Var);
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ d1q m95228v4(i0s i0sVar, BLiveCall bLiveCall) {
        return m95218k4(bLiveCall, i0sVar.m133917k(bLiveCall.user));
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m95229w4(mfp0 mfp0Var, View view) {
        m95214g4(mfp0Var);
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m95230x4(mfp0 mfp0Var, View view) {
        this.f67836i.m162528W3(mfp0Var.m154401J());
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m95231y4(Throwable th) {
        this.f67836i.m162527V3(th);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m95232z4(BLiveCall bLiveCall) {
        this.f67837j.put(bLiveCall.f44342id, bLiveCall);
    }
}
