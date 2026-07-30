package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLivePkFirstKillGift;
import com.p046p1.mobile.putong.live.base.data.BLivePkStage;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.PkView;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkLaunchData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.internal.PkViewInternal;

/* JADX INFO: loaded from: classes5.dex */
public class zi70 extends pat<yl40> implements l3m {

    /* JADX INFO: renamed from: i */
    public int f203301i;

    /* JADX INFO: renamed from: j */
    public int f203302j;

    /* JADX INFO: renamed from: k */
    public final PkView f203303k;

    /* JADX INFO: renamed from: l */
    public final PkViewInternal f203304l;

    /* JADX INFO: renamed from: m */
    public BLivePkStage f203305m;

    /* JADX INFO: renamed from: n */
    public BLivePkFirstKillGift f203306n;

    public zi70(bsm bsmVar, PkView pkView, PkViewInternal pkViewInternal) {
        super(bsmVar);
        this.f203301i = 1;
        this.f203305m = BLivePkStage.get("unknown_");
        this.f203303k = pkView;
        this.f203304l = pkViewInternal;
        if (!vdt.m198092b(2)) {
            m144512z2(new kx70(bsmVar));
            m144512z2(new jv70(bsmVar));
            m144512z2(new do70(bsmVar));
            m144512z2(new vq70(bsmVar));
            return;
        }
        m144512z2(new nw70(bsmVar));
        m144512z2(new hu70(bsmVar));
        m144512z2(new ap70(bsmVar));
        m144512z2(new gq70(bsmVar));
        m144512z2(new xl70(bsmVar));
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ void m218999O3(Integer num, MotionType motionType) {
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m219004U3(Integer num, MotionType motionType) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m219008a4(soj0 soj0Var) {
        m219022m4();
    }

    /* JADX INFO: renamed from: Y3 */
    public final int m219009Y3(int i) {
        if (!((Boolean) m129297F3(new k480(600))).booleanValue() || i == 3) {
            return i;
        }
        return 3;
    }

    /* JADX INFO: renamed from: Z3 */
    public boolean m219010Z3() {
        return ((Boolean) m129297F3(new k480(600))).booleanValue() || this.f203301i != 1;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m219011b4(iat iatVar) {
        m219021l4(iatVar.f112323a);
        m219019j4(iatVar.f112324b);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ Boolean m219012c4(bax baxVar) {
        return Boolean.valueOf(m219010Z3());
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ Integer m219013d4(u180 u180Var) {
        return Integer.valueOf(this.f203301i);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m219014e4(gat gatVar) {
        m219020k4(2);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ Integer m219015f4(em70 em70Var) {
        return Integer.valueOf(this.f203302j);
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m219016g4(BLivePkFirstKillGift bLivePkFirstKillGift) {
        this.f203306n = bLivePkFirstKillGift;
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ String m219017h4(om70 om70Var) {
        BLivePkFirstKillGift bLivePkFirstKillGift = this.f203306n;
        return bLivePkFirstKillGift == null ? "" : bLivePkFirstKillGift.giftId;
    }

    /* JADX INFO: renamed from: i4 */
    public final void m219018i4(LivePkMessage livePkMessage) {
        String str = livePkMessage.type;
        str.getClass();
        if (str.equals("pk_created")) {
            m219024o4(true, livePkMessage);
        } else if (str.equals("pk_end")) {
            m219023n4(livePkMessage);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final void m219019j4(BLivePkStage bLivePkStage) {
        this.f203305m = bLivePkStage;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m219020k4(int i) {
        this.f203302j = i;
    }

    /* JADX INFO: renamed from: l4 */
    public void m219021l4(int i) {
        this.f203301i = m219009Y3(i);
        ht70.m132856m(i);
        if (i == 2) {
            m206028F2().BottomEvent.startPkAnim().m172467p();
        } else {
            m206028F2().BottomEvent.stopPkAnim().m172467p();
        }
        if (i == -1) {
            m219024o4(false, null);
        }
    }

    /* JADX INFO: renamed from: m4 */
    public void m219022m4() {
        if (this.f188512e.f77104j.m201577L3(MotionType.multi_connect)) {
            lsi0.m151578h(R$string.f47651ya);
            return;
        }
        if (this.f188512e.f77104j.m201577L3(MotionType.multi_call)) {
            lsi0.m151578h(R$string.f47058X7);
            return;
        }
        int i = this.f203301i;
        if (i == 1) {
            mm70.m155309e(this, true);
        } else if (i == 2) {
            mm70.m155308d(this, true);
        } else {
            if (i != 3) {
                return;
            }
            lsi0.m151593w(R$string.f47019Va);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    public final void m219023n4(LivePkMessage livePkMessage) {
        LongLinkLiveMessage.PkEnd pkEnd = livePkMessage.pkEnd;
        if (this.f203305m == null || !pkEnd.getIsLeave() || TextUtils.equals(pkEnd.getLeaveUserId(), ((yl40) m206027E2()).m132146l0().f56011id)) {
            return;
        }
        hfw.m130790a("LiveModuleLoadWrapper", "show end toast when receive long link end");
        if (TEnum.equals(this.f203305m, "playing")) {
            lsi0.m151593w(R$string.f47607wa);
        } else if (TEnum.equals(this.f203305m, BLivePkStage.punishing)) {
            lsi0.m151593w(R$string.f47677ze);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public final void m219024o4(boolean z, LivePkMessage livePkMessage) {
        if (z && this.f188512e.f77104j.m201578M3() == MotionType.pk) {
            return;
        }
        ht70.m132853j("pk motion switch ,isAnchor:" + ((yl40) m206027E2()).mo97490p() + ",motion:" + z);
        jy00 jy00Var = new jy00(z, MotionType.pk);
        if (z) {
            m219021l4(3);
            if (vdt.m198092b(2)) {
                jy00Var.m143840b(new PkLaunchData(this.f203304l, livePkMessage)).m143839a(new f30() { // from class: l.pi70
                    @Override // p149l.f30
                    public final void call(Object obj, Object obj2) {
                        zi70.m218999O3((Integer) obj, (MotionType) obj2);
                    }
                });
            } else {
                jy00Var.m143840b(new PkLaunchData(this.f203303k, livePkMessage)).m143839a(new f30() { // from class: l.oi70
                    @Override // p149l.f30
                    public final void call(Object obj, Object obj2) {
                        zi70.m219004U3((Integer) obj, (MotionType) obj2);
                    }
                });
            }
        } else {
            m219021l4(1);
        }
        m206028F2().MotionEvent.motionSwitch().mo172463j(jy00Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((yl40) m206027E2()).m132160q1().m189074U()).subscribe(ffw.m121193d(new e30() { // from class: l.li70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128172a.m219018i4((LivePkMessage) obj);
            }
        }));
        duringCreated(m206028F2().LivePkEvent.clickBottomPkIcon().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.si70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164690a.m219008a4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().LivePkEvent.pkStateEvent().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ti70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170537a.m219011b4((iat) obj);
            }
        }));
        m129301d3(bax.class, new w9j() { // from class: l.ui70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f176636a.m219012c4((bax) obj);
            }
        });
        m129301d3(u180.class, new w9j() { // from class: l.vi70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f181559a.m219013d4((u180) obj);
            }
        });
        duringCreated(m206028F2().LivePkEvent.showPkDialog().m172460g()).filter(new w9j() { // from class: l.wi70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((gat) obj).f101703a == 3);
            }
        }).filter(new w9j() { // from class: l.xi70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((gat) obj).f101704b);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.yi70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198449a.m219014e4((gat) obj);
            }
        }));
        duringCreated(m206028F2().LivePkEvent.startRandomSeek().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.mi70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133945a.m219020k4(((Integer) obj).intValue());
            }
        }));
        m129301d3(em70.class, new w9j() { // from class: l.ni70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f139066a.m219015f4((em70) obj);
            }
        });
        duringCreated(m206028F2().LivePkEvent.updateFirstGift().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.qi70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154673a.m219016g4((BLivePkFirstKillGift) obj);
            }
        }));
        m129301d3(om70.class, new w9j() { // from class: l.ri70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f159522a.m219017h4((om70) obj);
            }
        });
    }
}
