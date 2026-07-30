package p149l;

import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogContentView;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j9n0<T extends nnn0> extends ahs<T> {
    public j9n0(bsm<T> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: n6 */
    public static /* synthetic */ void m140571n6(mlj mljVar, hxn0 hxn0Var) {
        mljVar.f134441b = hxn0Var.f109896b;
        mljVar.f134440a = hxn0Var.f109897c;
    }

    /* JADX INFO: renamed from: o6 */
    public static /* synthetic */ void m140572o6(Integer num) {
    }

    /* JADX INFO: renamed from: s6 */
    public static /* synthetic */ void m140576s6(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
    }

    /* JADX INFO: renamed from: t6 */
    public static /* synthetic */ void m140577t6(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w6 */
    public /* synthetic */ void m140578w6(soj0 soj0Var) {
        m140583z6();
    }

    @Override // p149l.ahs
    /* JADX INFO: renamed from: G4 */
    public Pair<String, mnj> mo96617G4(String str) {
        return !TextUtils.isEmpty(str) ? new Pair<>(this.f69688l, m140579u6(str)) : super.mo96617G4(str);
    }

    @Override // p149l.ahs
    /* JADX INFO: renamed from: P5 */
    public void mo96635P5(GiftDialogContentView giftDialogContentView) {
        super.mo96635P5(giftDialogContentView);
        m144512z2(new lgc0(this.f188512e, giftDialogContentView.f50274j));
        m144512z2(new y2n0(this.f188512e));
    }

    @Override // p149l.ahs, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated((C22306c<T>) ((nnn0) m206027E2()).m160251Q2()).subscribe(ffw.m121197h(new e30() { // from class: l.a9n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68193a.m140580v6((bik0.C15867a) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().GiftDialogEventGroup.onVoicePositionChange().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.b9n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74595a.m140578w6((soj0) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().f170404T).subscribe(ffw.m121197h(new e30() { // from class: l.c9n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79952a.m140581x6((LongLinkLiveUserLevel.UserLiveHierarchyProgressChange) obj);
            }
        }));
        m129304h3(m206028F2().GiftDialogEventGroup.performCpGiftItemClick(), new e30() { // from class: l.d9n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85135a.m140582y6((String) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u6 */
    public mnj m140579u6(String str) {
        BLiveVoiceCall bLiveVoiceCallM102063l = ((nnn0) m206027E2()).m160249P2().m102063l(str);
        if (bLiveVoiceCallM102063l == null) {
            i54 i54VarM102065n = ((nnn0) m206027E2()).m160249P2().m102065n(str);
            return i54VarM102065n != null ? new mnj.C18509a().m155527h(mlj.m155154c(new i54(i54VarM102065n.f111520a, i54VarM102065n.f111521b, i54VarM102065n.f111522c), q44.m172921a())).m155523d() : new mnj.C18509a().m155527h(mlj.m155154c(new i54(str, "", ""), q44.m172921a())).m155523d();
        }
        final mlj mljVarM155154c = mlj.m155154c(new i54(bLiveVoiceCallM102063l.user, bLiveVoiceCallM102063l.userName, bLiveVoiceCallM102063l.userPicture), q44.m172922b(bLiveVoiceCallM102063l.f44485id, "gift-audience-none-voiceLiveMain", bLiveVoiceCallM102063l.position));
        hxn0.m133350c(((nnn0) m206027E2()).m160249P2().m102064m(bLiveVoiceCallM102063l.user)).m133351a(new e30() { // from class: l.e9n0
            @Override // p149l.e30
            public final void call(Object obj) {
                j9n0.m140571n6(mljVarM155154c, (hxn0) obj);
            }
        });
        return new mnj.C18509a().m155527h(mljVarM155154c).m155523d();
    }

    /* JADX INFO: renamed from: v6 */
    public final /* synthetic */ void m140580v6(bik0.C15867a c15867a) {
        m140583z6();
    }

    /* JADX INFO: renamed from: x6 */
    public final /* synthetic */ void m140581x6(LongLinkLiveUserLevel.UserLiveHierarchyProgressChange userLiveHierarchyProgressChange) {
        ((mfs) this.viewModel).m154451Z(userLiveHierarchyProgressChange);
    }

    /* JADX INFO: renamed from: y6 */
    public void m140582y6(String str) {
        BLiveGiftItem bLiveGiftItemM126027m = ((ggv) ypv.m215673l(fld0.f98148c)).m126027m(str);
        sge0.m184069a(this, pge0.m168675d(String.valueOf(bLiveGiftItemM126027m.f44377id), bLiveGiftItemM126027m, new e30() { // from class: l.f9n0
            @Override // p149l.e30
            public final void call(Object obj) {
                j9n0.m140576s6((BLiveGivenGiftBrief) obj);
            }
        }, new e30() { // from class: l.g9n0
            @Override // p149l.e30
            public final void call(Object obj) {
                j9n0.m140577t6((Throwable) obj);
            }
        }, new e30() { // from class: l.h9n0
            @Override // p149l.e30
            public final void call(Object obj) {
                j9n0.m140572o6((Integer) obj);
            }
        }, false, 1, this.f69688l, m96628M4(), BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.f44460cp))), new e30() { // from class: l.i9n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112242a.m96647X5((pge0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z6 */
    public final void m140583z6() {
        if (isShowing()) {
            m206028F2().GiftDialogEventGroup.onVoiceDeputyChange().mo172463j(new o3n0(mo96615F4()));
        }
    }
}
