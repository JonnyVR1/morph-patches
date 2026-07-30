package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLivePkFirstKillGift;
import com.p051p1.mobile.putong.live.base.data.BLivePkStage;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.PkView;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkLaunchData;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.internal.PkViewInternal;

/* JADX INFO: loaded from: classes5.dex */
public class fr70 extends qct<mu40> implements c6m {

    /* JADX INFO: renamed from: i */
    public int f100400i;

    /* JADX INFO: renamed from: j */
    public int f100401j;

    /* JADX INFO: renamed from: k */
    public final PkView f100402k;

    /* JADX INFO: renamed from: l */
    public final PkViewInternal f100403l;

    /* JADX INFO: renamed from: m */
    public BLivePkStage f100404m;

    /* JADX INFO: renamed from: n */
    public BLivePkFirstKillGift f100405n;

    public fr70(dum dumVar, PkView pkView, PkViewInternal pkViewInternal) {
        super(dumVar);
        this.f100400i = 1;
        this.f100404m = BLivePkStage.get("unknown_");
        this.f100402k = pkView;
        this.f100403l = pkViewInternal;
        if (!wft.m206159b(2)) {
            m153103z2(new q580(dumVar));
            m153103z2(new p380(dumVar));
            m153103z2(new jw70(dumVar));
            m153103z2(new bz70(dumVar));
            return;
        }
        m153103z2(new t480(dumVar));
        m153103z2(new n280(dumVar));
        m153103z2(new gx70(dumVar));
        m153103z2(new my70(dumVar));
        m153103z2(new du70(dumVar));
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m126872O3(Integer num, MotionType motionType) {
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m126877U3(Integer num, MotionType motionType) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m126881a4(vxj0 vxj0Var) {
        m126895m4();
    }

    /* JADX INFO: renamed from: Y3 */
    public final int m126882Y3(int i) {
        if (!((Boolean) m138856F3(new qc80(600))).booleanValue() || i == 3) {
            return i;
        }
        return 3;
    }

    /* JADX INFO: renamed from: Z3 */
    public boolean m126883Z3() {
        return ((Boolean) m138856F3(new qc80(600))).booleanValue() || this.f100400i != 1;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m126884b4(jct jctVar) {
        m126894l4(jctVar.f120094a);
        m126892j4(jctVar.f120095b);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ Boolean m126885c4(adx adxVar) {
        return Boolean.valueOf(m126883Z3());
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ Integer m126886d4(aa80 aa80Var) {
        return Integer.valueOf(this.f100400i);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m126887e4(hct hctVar) {
        m126893k4(2);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ Integer m126888f4(ku70 ku70Var) {
        return Integer.valueOf(this.f100401j);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m126889g4(BLivePkFirstKillGift bLivePkFirstKillGift) {
        this.f100405n = bLivePkFirstKillGift;
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ String m126890h4(uu70 uu70Var) {
        BLivePkFirstKillGift bLivePkFirstKillGift = this.f100405n;
        return bLivePkFirstKillGift == null ? "" : bLivePkFirstKillGift.giftId;
    }

    /* JADX INFO: renamed from: i4 */
    public final void m126891i4(LivePkMessage livePkMessage) {
        String str = livePkMessage.type;
        str.getClass();
        if (str.equals("pk_created")) {
            m126897o4(true, livePkMessage);
        } else if (str.equals("pk_end")) {
            m126896n4(livePkMessage);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final void m126892j4(BLivePkStage bLivePkStage) {
        this.f100404m = bLivePkStage;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m126893k4(int i) {
        this.f100401j = i;
    }

    /* JADX INFO: renamed from: l4 */
    public void m126894l4(int i) {
        this.f100400i = m126882Y3(i);
        n180.m161096m(i);
        if (i == 2) {
            m213811F2().BottomEvent.startPkAnim().m199277p();
        } else {
            m213811F2().BottomEvent.stopPkAnim().m199277p();
        }
        if (i == -1) {
            m126897o4(false, null);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public void m126895m4() {
        if (this.f196918e.f90824j.m209548L3(MotionType.multi_connect)) {
            o1j0.m165634h(R$string.f48499ya);
            return;
        }
        if (this.f196918e.f90824j.m209548L3(MotionType.multi_call)) {
            o1j0.m165634h(R$string.f47906X7);
            return;
        }
        int i = this.f100400i;
        if (i == 1) {
            su70.m187997e(this, true);
        } else if (i == 2) {
            su70.m187996d(this, true);
        } else {
            if (i != 3) {
                return;
            }
            o1j0.m165649w(R$string.f47867Va);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    public final void m126896n4(LivePkMessage livePkMessage) {
        LongLinkLiveMessage.PkEnd pkEnd = livePkMessage.pkEnd;
        if (this.f100404m == null || !pkEnd.getIsLeave() || TextUtils.equals(pkEnd.getLeaveUserId(), ((mu40) m213810E2()).m168532l0().f56859id)) {
            return;
        }
        fhw.m125605a("LiveModuleLoadWrapper", "show end toast when receive long link end");
        if (TEnum.equals(this.f100404m, "playing")) {
            o1j0.m165649w(R$string.f48455wa);
        } else if (TEnum.equals(this.f100404m, BLivePkStage.punishing)) {
            o1j0.m165649w(R$string.f48525ze);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public final void m126897o4(boolean z, LivePkMessage livePkMessage) {
        if (z && this.f196918e.f90824j.m209549M3() == MotionType.pk) {
            return;
        }
        n180.m161093j("pk motion switch ,isAnchor:" + ((mu40) m213810E2()).mo118373p() + ",motion:" + z);
        t610 t610Var = new t610(z, MotionType.pk);
        if (z) {
            m126894l4(3);
            if (wft.m206159b(2)) {
                t610Var.m189492b(new PkLaunchData(this.f100403l, livePkMessage)).m189491a(new z20() { // from class: l.vq70
                    @Override // p153l.z20
                    public final void call(Object obj, Object obj2) {
                        fr70.m126872O3((Integer) obj, (MotionType) obj2);
                    }
                });
            } else {
                t610Var.m189492b(new PkLaunchData(this.f100402k, livePkMessage)).m189491a(new z20() { // from class: l.uq70
                    @Override // p153l.z20
                    public final void call(Object obj, Object obj2) {
                        fr70.m126877U3((Integer) obj, (MotionType) obj2);
                    }
                });
            }
        } else {
            m126894l4(1);
        }
        m213811F2().MotionEvent.motionSwitch().mo199273j(t610Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((mu40) m213810E2()).m168545q1().m98256U()).subscribe(dhw.m115825d(new y20() { // from class: l.rq70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164435a.m126891i4((LivePkMessage) obj);
            }
        }));
        duringCreated(m213811F2().LivePkEvent.clickBottomPkIcon().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.yq70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201156a.m126881a4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().LivePkEvent.pkStateEvent().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.zq70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205573a.m126884b4((jct) obj);
            }
        }));
        m138860d3(adx.class, new qcj() { // from class: l.ar70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f72917a.m126885c4((adx) obj);
            }
        });
        m138860d3(aa80.class, new qcj() { // from class: l.br70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f77989a.m126886d4((aa80) obj);
            }
        });
        duringCreated(m213811F2().LivePkEvent.showPkDialog().m199270g()).filter(new qcj() { // from class: l.cr70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((hct) obj).f108745a == 3);
            }
        }).filter(new qcj() { // from class: l.dr70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((hct) obj).f108746b);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.er70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95452a.m126887e4((hct) obj);
            }
        }));
        duringCreated(m213811F2().LivePkEvent.startRandomSeek().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.sq70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170151a.m126893k4(((Integer) obj).intValue());
            }
        }));
        m138860d3(ku70.class, new qcj() { // from class: l.tq70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f175686a.m126888f4((ku70) obj);
            }
        });
        duringCreated(m213811F2().LivePkEvent.updateFirstGift().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.wq70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190384a.m126889g4((BLivePkFirstKillGift) obj);
            }
        }));
        m138860d3(uu70.class, new qcj() { // from class: l.xq70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f195786a.m126890h4((uu70) obj);
            }
        });
    }
}
