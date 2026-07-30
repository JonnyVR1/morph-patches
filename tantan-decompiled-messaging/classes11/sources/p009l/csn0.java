package p009l;

import android.util.Pair;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite;
import com.p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l.bsm;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.i54;
import l.lsi0;
import l.nnn0;
import l.roj0;
import l.s25;
import l.vwb;
import l.w9j;
import l.x4s;
import l.x9j;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u0010J\r\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\u0010J\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b \u0010\u0013J\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b#\u0010\"J\u0015\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u001b¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0014¢\u0006\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Ll/csn0;", "Ll/nnn0;", "D", "Ll/gxn0;", "Ll/qsn0;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "", "userId", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "L4", "(Ljava/lang/String;)Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "", "E4", "()V", "member", "F4", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;)V", "", "isLoad", "I4", "(Z)V", "t", "Z3", "V3", "", "B4", "()I", "H4", "G4", "J4", "K4", "(Ljava/lang/String;)V", "A4", "Lcom/p1/mobile/putong/data/User;", "user", "z4", "(Lcom/p1/mobile/putong/data/User;)V", "index", "D4", "(I)V", "C4", "()Z", "j", "Ljava/lang/String;", "lastMemberEnterTime", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class csn0<D extends nnn0> extends gxn0<D, qsn0> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public String lastMemberEnterTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csn0(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        C(new qsn0());
        this.lastMemberEnterTime = "";
    }

    /* JADX INFO: renamed from: E4 */
    private final void m12800E4() {
        c managerInvites = VoiceRoomApiProvider.getManagerInvites(E2().k(), "live", "");
        c managerInvites2 = VoiceRoomApiProvider.getManagerInvites(E2().k(), "recall", "");
        final Function2 function2 = new Function2() { // from class: l.irn0
            public final Object invoke(Object obj, Object obj2) {
                return csn0.m12824u4((List) obj, (List) obj2);
            }
        };
        duringCreated(c.zip(managerInvites, managerInvites2, new x9j() { // from class: l.jrn0
            public final Object call(Object obj, Object obj2) {
                return csn0.m12822s4(function2, obj, obj2);
            }
        })).subscribe(ffw.h(new e30() { // from class: l.krn0
            public final void call(Object obj) {
                csn0.m12814k4(this.f15828a, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F4 */
    private final void m12801F4(final BLiveVoiceManagerInvite member) {
        c cVarInviteBecomeManager;
        if (m12831C4()) {
            String strO = E2().o();
            strO.getClass();
            String str = member.userId;
            str.getClass();
            cVarInviteBecomeManager = VirtualVoiceRoomApiProvider.inviteBecomeManager(strO, str, "live");
        } else {
            cVarInviteBecomeManager = VoiceRoomApiProvider.inviteBecomeManager(E2().k(), member.userId, "live");
        }
        duringCreated(cVarInviteBecomeManager).subscribe(ffw.e(new e30() { // from class: l.lrn0
            public final void call(Object obj) {
                csn0.m12825v4(this.f16385a, member, (roj0) obj);
            }
        }, new e30() { // from class: l.mrn0
            public final void call(Object obj) {
                csn0.m12819p4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    private final void m12802I4(final boolean isLoad) {
        if (!isLoad) {
            this.lastMemberEnterTime = "";
        }
        c cVarDuringCreated = duringCreated(VoiceRoomApiProvider.getManagerInvites(E2().k(), "live", this.lastMemberEnterTime));
        final Function1 function1 = new Function1() { // from class: l.frn0
            public final Object invoke(Object obj) {
                return csn0.m12811h4(this.f13143a, (List) obj);
            }
        };
        cVarDuringCreated.doOnNext(new e30() { // from class: l.grn0
            public final void call(Object obj) {
                csn0.m12809f4(function1, obj);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.hrn0
            public final void call(Object obj) {
                csn0.m12827x4(isLoad, this, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L4 */
    private final BLiveVoiceManagerInvite m12803L4(String userId) {
        String str;
        i54 i54VarN = E2().P2().n(userId);
        if (i54VarN == null || (str = i54VarN.b) == null) {
            str = "";
        }
        BLiveVoiceManagerInvite bLiveVoiceManagerInviteNew_ = BLiveVoiceManagerInvite.new_();
        BLiveUserMask bLiveUserMaskNew_ = BLiveUserMask.new_();
        bLiveUserMaskNew_.name = str;
        bLiveVoiceManagerInviteNew_.userId = userId;
        bLiveVoiceManagerInviteNew_.mask = bLiveUserMaskNew_;
        return bLiveVoiceManagerInviteNew_;
    }

    /* JADX INFO: renamed from: a4 */
    public static void m12804a4(Throwable th) {
        s25.c(th);
    }

    /* JADX INFO: renamed from: b4 */
    public static void m12805b4(csn0 csn0Var, roj0 roj0Var) {
        csn0Var.m12834H4();
    }

    /* JADX INFO: renamed from: c4 */
    public static void m12806c4(csn0 csn0Var, roj0 roj0Var) {
        lsi0.j("管理员权限已移除");
        csn0Var.m12834H4();
    }

    /* JADX INFO: renamed from: d4 */
    public static void m12807d4(Throwable th) {
        s25.c(th);
    }

    /* JADX INFO: renamed from: e4 */
    public static void m12808e4(Throwable th) {
        s25.c(th);
    }

    /* JADX INFO: renamed from: f4 */
    public static void m12809f4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g4 */
    public static void m12810g4(csn0 csn0Var, User user) {
        user.getClass();
        csn0Var.m12839z4(user);
    }

    /* JADX INFO: renamed from: h4 */
    public static Unit m12811h4(csn0 csn0Var, List list) {
        if (!vwb.J(list)) {
            list.getClass();
            String str = ((BLiveVoiceManagerInvite) CollectionsKt.last(list)).entryTime;
            str.getClass();
            csn0Var.lastMemberEnterTime = str;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i4 */
    public static void m12812i4(Throwable th) {
        s25.c(th);
    }

    /* JADX INFO: renamed from: j4 */
    public static void m12813j4(csn0 csn0Var, roj0 roj0Var) {
        csn0Var.m12834H4();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m12814k4(csn0 csn0Var, Pair pair) {
        ((qsn0) ((bwr) csn0Var).viewModel).m21295R((List) pair.first, (List) pair.second);
    }

    /* JADX INFO: renamed from: l4 */
    public static void m12815l4(Throwable th) {
        s25.c(th);
    }

    /* JADX INFO: renamed from: m4 */
    public static BLiveVoiceManagerInvite m12816m4(csn0 csn0Var, String str) {
        str.getClass();
        return csn0Var.m12803L4(str);
    }

    /* JADX INFO: renamed from: n4 */
    public static void m12817n4(csn0 csn0Var, List list) {
        qsn0 qsn0Var = (qsn0) ((bwr) csn0Var).viewModel;
        list.getClass();
        qsn0Var.m21290K(list);
    }

    /* JADX INFO: renamed from: o4 */
    public static BLiveVoiceManagerInvite m12818o4(Function1 function1, Object obj) {
        return (BLiveVoiceManagerInvite) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p4 */
    public static void m12819p4(Throwable th) {
        s25.c(th);
    }

    /* JADX INFO: renamed from: q4 */
    public static void m12820q4(csn0 csn0Var, Boolean bool) {
        csn0Var.m12800E4();
    }

    /* JADX INFO: renamed from: r4 */
    public static void m12821r4(csn0 csn0Var, BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        bLiveVoiceManagerInvite.getClass();
        csn0Var.m12835J4(bLiveVoiceManagerInvite);
    }

    /* JADX INFO: renamed from: s4 */
    public static Pair m12822s4(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: t4 */
    public static void m12823t4(csn0 csn0Var, BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        csn0Var.m12801F4(bLiveVoiceManagerInvite);
    }

    /* JADX INFO: renamed from: u4 */
    public static Pair m12824u4(List list, List list2) {
        return new Pair(list, list2);
    }

    /* JADX INFO: renamed from: v4 */
    public static void m12825v4(csn0 csn0Var, BLiveVoiceManagerInvite bLiveVoiceManagerInvite, roj0 roj0Var) {
        ((qsn0) ((bwr) csn0Var).viewModel).m21302y();
        qsn0 qsn0Var = (qsn0) ((bwr) csn0Var).viewModel;
        String str = bLiveVoiceManagerInvite.mask.name;
        str.getClass();
        qsn0Var.m21294O(str, bLiveVoiceManagerInvite.mask.isFemale());
    }

    /* JADX INFO: renamed from: w4 */
    public static void m12826w4(csn0 csn0Var, roj0 roj0Var) {
        csn0Var.m12834H4();
    }

    /* JADX INFO: renamed from: x4 */
    public static void m12827x4(boolean z, csn0 csn0Var, List list) {
        if (z) {
            qsn0 qsn0Var = (qsn0) ((bwr) csn0Var).viewModel;
            list.getClass();
            qsn0Var.m21288I(list);
        } else {
            qsn0 qsn0Var2 = (qsn0) ((bwr) csn0Var).viewModel;
            list.getClass();
            qsn0Var2.m21291L(list);
        }
        ((qsn0) ((bwr) csn0Var).viewModel).m21289J();
    }

    /* JADX INFO: renamed from: y4 */
    public static void m12828y4(csn0 csn0Var, roj0 roj0Var) {
        csn0Var.m12833G4();
    }

    /* JADX INFO: renamed from: A4 */
    public final void m12829A4(@NotNull String userId) {
        userId.getClass();
        if (!m12831C4()) {
            duringCreated(VoiceRoomApiProvider.deleteManager(E2().k(), userId)).subscribe(ffw.e(new e30() { // from class: l.srn0
                public final void call(Object obj) {
                    csn0.m12813j4(this.f20441a, (roj0) obj);
                }
            }, new e30() { // from class: l.trn0
                public final void call(Object obj) {
                    csn0.m12807d4((Throwable) obj);
                }
            }));
            return;
        }
        String strO = E2().o();
        strO.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.deleteManager(strO, userId)).subscribe(ffw.e(new e30() { // from class: l.qrn0
            public final void call(Object obj) {
                csn0.m12805b4(this.f19472a, (roj0) obj);
            }
        }, new e30() { // from class: l.rrn0
            public final void call(Object obj) {
                csn0.m12804a4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B4 */
    public final int m12830B4() {
        return m12831C4() ? ypv.m25490k().U5() : ypv.m25490k().d6();
    }

    /* JADX INFO: renamed from: C4 */
    public final boolean m12831C4() {
        return x4s.b(((BLiveAbsData) E2().V2()).liveMode);
    }

    /* JADX INFO: renamed from: D4 */
    public final void m12832D4(int index) {
        m12802I4(true);
    }

    /* JADX INFO: renamed from: G4 */
    public final void m12833G4() {
        duringCreated(VoiceRoomApiProvider.getManagerInvites(E2().k(), "recall", "")).subscribe(ffw.h(new e30() { // from class: l.bsn0
            public final void call(Object obj) {
                csn0.m12817n4(this.f10295a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H4 */
    public final void m12834H4() {
        m12802I4(false);
    }

    /* JADX INFO: renamed from: J4 */
    public final void m12835J4(@NotNull final BLiveVoiceManagerInvite member) {
        member.getClass();
        if (m12831C4()) {
            m12801F4(member);
            return;
        }
        List<BLiveVoiceManager> listM15357U3 = m15357U3();
        if (listM15357U3 == null || listM15357U3.isEmpty()) {
            m12801F4(member);
            return;
        }
        qsn0 qsn0Var = (qsn0) ((bwr) this).viewModel;
        List<BLiveVoiceManager> listM15357U4 = m15357U3();
        listM15357U4.getClass();
        String str = listM15357U4.get(0).mask.name;
        str.getClass();
        qsn0Var.m21293N(str, new d30() { // from class: l.ern0
            public final void call() {
                csn0.m12823t4(this.f12672a, member);
            }
        });
    }

    /* JADX INFO: renamed from: K4 */
    public final void m12836K4(@NotNull String userId) {
        c cVarInviteBecomeManager;
        userId.getClass();
        if (m12831C4()) {
            String strO = E2().o();
            strO.getClass();
            cVarInviteBecomeManager = VirtualVoiceRoomApiProvider.inviteBecomeManager(strO, userId, "recall");
        } else {
            cVarInviteBecomeManager = VoiceRoomApiProvider.inviteBecomeManager(E2().k(), userId, "recall");
        }
        duringCreated(cVarInviteBecomeManager).subscribe(ffw.e(new e30() { // from class: l.nrn0
            public final void call(Object obj) {
                csn0.m12828y4(this.f17625a, (roj0) obj);
            }
        }, new e30() { // from class: l.prn0
            public final void call(Object obj) {
                csn0.m12815l4((Throwable) obj);
            }
        }));
    }

    @Override // p009l.gxn0
    /* JADX INFO: renamed from: V3 */
    public void mo12837V3() {
        super.mo12837V3();
        qsn0 qsn0Var = (qsn0) ((bwr) this).viewModel;
        List<BLiveVoiceManager> listM15357U3 = m15357U3();
        qsn0Var.m21296S(listM15357U3 != null ? listM15357U3.size() : 0);
    }

    @Override // p009l.gxn0
    /* JADX INFO: renamed from: Z3 */
    public void mo12838Z3() {
        super.mo12838Z3();
        m12834H4();
        m12833G4();
    }

    @Override // p009l.gxn0
    /* JADX INFO: renamed from: t */
    public void mo12579t() {
        super.mo12579t();
        duringCreated((c) F2().VoiceLiveManagerEvent.openManagerInviteDialog().g()).subscribe(ffw.d(new e30() { // from class: l.drn0
            public final void call(Object obj) {
                csn0.m12820q4(this.f11971a, (Boolean) obj);
            }
        }));
        c cVarDuringCreated = duringCreated((c) F2().VoiceLiveManagerEvent.onInviteUserBecomeManager().g());
        final Function1 function1 = new Function1() { // from class: l.orn0
            public final Object invoke(Object obj) {
                return csn0.m12816m4(this.f18225a, (String) obj);
            }
        };
        cVarDuringCreated.map(new w9j() { // from class: l.urn0
            public final Object call(Object obj) {
                return csn0.m12818o4(function1, obj);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.vrn0
            public final void call(Object obj) {
                csn0.m12821r4(this.f21754a, (BLiveVoiceManagerInvite) obj);
            }
        }));
        duringCreated((c) F2().VoiceLiveManagerEvent.onCancelManager().g()).subscribe(ffw.h(new e30() { // from class: l.wrn0
            public final void call(Object obj) {
                csn0.m12810g4(this.f22291a, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z4 */
    public final void m12839z4(@NotNull User user) {
        user.getClass();
        if (!m12831C4()) {
            duringCreated(VoiceRoomApiProvider.deleteManager(E2().k(), ((DbObject) user).id)).subscribe(ffw.e(new e30() { // from class: l.zrn0
                public final void call(Object obj) {
                    csn0.m12826w4(this.f23855a, (roj0) obj);
                }
            }, new e30() { // from class: l.asn0
                public final void call(Object obj) {
                    csn0.m12808e4((Throwable) obj);
                }
            }));
            return;
        }
        String strO = E2().o();
        strO.getClass();
        String str = ((DbObject) user).id;
        str.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.deleteManager(strO, str)).subscribe(ffw.e(new e30() { // from class: l.xrn0
            public final void call(Object obj) {
                csn0.m12806c4(this.f22701a, (roj0) obj);
            }
        }, new e30() { // from class: l.yrn0
            public final void call(Object obj) {
                csn0.m12812i4((Throwable) obj);
            }
        }));
    }
}
