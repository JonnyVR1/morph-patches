package p149l;

import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u0010J\r\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\u0010J\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b \u0010\u0013J\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b#\u0010\"J\u0015\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u001b¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0014¢\u0006\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m87232d2 = {"Ll/csn0;", "Ll/nnn0;", "D", "Ll/gxn0;", "Ll/qsn0;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", "userId", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "L4", "(Ljava/lang/String;)Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "", "E4", "()V", "member", "F4", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;)V", "", "isLoad", "I4", "(Z)V", Constants.KEY_T, "Z3", "V3", "", "B4", "()I", "H4", "G4", "J4", "K4", "(Ljava/lang/String;)V", "A4", "Lcom/p1/mobile/putong/data/User;", "user", "z4", "(Lcom/p1/mobile/putong/data/User;)V", FirebaseAnalytics.Param.INDEX, "D4", "(I)V", "C4", "()Z", "j", "Ljava/lang/String;", "lastMemberEnterTime", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class csn0<D extends nnn0> extends gxn0<D, qsn0> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public String lastMemberEnterTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csn0(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        mo51532C(new qsn0());
        this.lastMemberEnterTime = "";
    }

    /* JADX INFO: renamed from: E4 */
    private final void m108518E4() {
        C22306c<List<BLiveVoiceManagerInvite>> managerInvites = VoiceRoomApiProvider.getManagerInvites(m206027E2().m149814k(), "live", "");
        C22306c<List<BLiveVoiceManagerInvite>> managerInvites2 = VoiceRoomApiProvider.getManagerInvites(m206027E2().m149814k(), "recall", "");
        final Function2 function2 = new Function2() { // from class: l.irn0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return csn0.m108542u4((List) obj, (List) obj2);
            }
        };
        duringCreated(C22306c.zip(managerInvites, managerInvites2, new x9j() { // from class: l.jrn0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return csn0.m108540s4(function2, obj, obj2);
            }
        })).subscribe(ffw.m121197h(new e30() { // from class: l.krn0
            @Override // p149l.e30
            public final void call(Object obj) {
                csn0.m108532k4(this.f124376a, (Pair) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F4 */
    private final void m108519F4(final BLiveVoiceManagerInvite member) {
        C22306c c22306cInviteBecomeManager;
        if (m108549C4()) {
            String strM149818o = m206027E2().m149818o();
            strM149818o.getClass();
            String str = member.userId;
            str.getClass();
            c22306cInviteBecomeManager = VirtualVoiceRoomApiProvider.inviteBecomeManager(strM149818o, str, "live");
        } else {
            c22306cInviteBecomeManager = VoiceRoomApiProvider.inviteBecomeManager(m206027E2().m149814k(), member.userId, "live");
        }
        duringCreated(c22306cInviteBecomeManager).subscribe(ffw.m121194e(new e30() { // from class: l.lrn0
            @Override // p149l.e30
            public final void call(Object obj) {
                csn0.m108543v4(this.f129738a, member, (roj0) obj);
            }
        }, new e30() { // from class: l.mrn0
            @Override // p149l.e30
            public final void call(Object obj) {
                csn0.m108537p4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    private final void m108520I4(final boolean isLoad) {
        if (!isLoad) {
            this.lastMemberEnterTime = "";
        }
        C22306c<T> c22306cDuringCreated = duringCreated(VoiceRoomApiProvider.getManagerInvites(m206027E2().m149814k(), "live", this.lastMemberEnterTime));
        final Function1 function1 = new Function1() { // from class: l.frn0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return csn0.m108529h4(this.f98982a, (List) obj);
            }
        };
        c22306cDuringCreated.doOnNext(new e30() { // from class: l.grn0
            @Override // p149l.e30
            public final void call(Object obj) {
                csn0.m108527f4(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.hrn0
            @Override // p149l.e30
            public final void call(Object obj) {
                csn0.m108545x4(isLoad, this, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L4 */
    private final BLiveVoiceManagerInvite m108521L4(String userId) {
        String str;
        i54 i54VarM102065n = m206027E2().m160249P2().m102065n(userId);
        if (i54VarM102065n == null || (str = i54VarM102065n.f111521b) == null) {
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
    public static void m108522a4(Throwable th) {
        s25.m182058c(th);
    }

    /* JADX INFO: renamed from: b4 */
    public static void m108523b4(csn0 csn0Var, roj0 roj0Var) {
        csn0Var.m108552H4();
    }

    /* JADX INFO: renamed from: c4 */
    public static void m108524c4(csn0 csn0Var, roj0 roj0Var) {
        lsi0.m151580j("管理员权限已移除");
        csn0Var.m108552H4();
    }

    /* JADX INFO: renamed from: d4 */
    public static void m108525d4(Throwable th) {
        s25.m182058c(th);
    }

    /* JADX INFO: renamed from: e4 */
    public static void m108526e4(Throwable th) {
        s25.m182058c(th);
    }

    /* JADX INFO: renamed from: f4 */
    public static void m108527f4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g4 */
    public static void m108528g4(csn0 csn0Var, User user) {
        user.getClass();
        csn0Var.m108557z4(user);
    }

    /* JADX INFO: renamed from: h4 */
    public static Unit m108529h4(csn0 csn0Var, List list) {
        if (!vwb.m200296J(list)) {
            list.getClass();
            String str = ((BLiveVoiceManagerInvite) CollectionsKt.last(list)).entryTime;
            str.getClass();
            csn0Var.lastMemberEnterTime = str;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i4 */
    public static void m108530i4(Throwable th) {
        s25.m182058c(th);
    }

    /* JADX INFO: renamed from: j4 */
    public static void m108531j4(csn0 csn0Var, roj0 roj0Var) {
        csn0Var.m108552H4();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m108532k4(csn0 csn0Var, Pair pair) {
        ((qsn0) csn0Var.viewModel).m176361R((List) pair.first, (List) pair.second);
    }

    /* JADX INFO: renamed from: l4 */
    public static void m108533l4(Throwable th) {
        s25.m182058c(th);
    }

    /* JADX INFO: renamed from: m4 */
    public static BLiveVoiceManagerInvite m108534m4(csn0 csn0Var, String str) {
        str.getClass();
        return csn0Var.m108521L4(str);
    }

    /* JADX INFO: renamed from: n4 */
    public static void m108535n4(csn0 csn0Var, List list) {
        qsn0 qsn0Var = (qsn0) csn0Var.viewModel;
        list.getClass();
        qsn0Var.m176356K(list);
    }

    /* JADX INFO: renamed from: o4 */
    public static BLiveVoiceManagerInvite m108536o4(Function1 function1, Object obj) {
        return (BLiveVoiceManagerInvite) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p4 */
    public static void m108537p4(Throwable th) {
        s25.m182058c(th);
    }

    /* JADX INFO: renamed from: q4 */
    public static void m108538q4(csn0 csn0Var, Boolean bool) {
        csn0Var.m108518E4();
    }

    /* JADX INFO: renamed from: r4 */
    public static void m108539r4(csn0 csn0Var, BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        bLiveVoiceManagerInvite.getClass();
        csn0Var.m108553J4(bLiveVoiceManagerInvite);
    }

    /* JADX INFO: renamed from: s4 */
    public static Pair m108540s4(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: t4 */
    public static void m108541t4(csn0 csn0Var, BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        csn0Var.m108519F4(bLiveVoiceManagerInvite);
    }

    /* JADX INFO: renamed from: u4 */
    public static Pair m108542u4(List list, List list2) {
        return new Pair(list, list2);
    }

    /* JADX INFO: renamed from: v4 */
    public static void m108543v4(csn0 csn0Var, BLiveVoiceManagerInvite bLiveVoiceManagerInvite, roj0 roj0Var) {
        ((qsn0) csn0Var.viewModel).m176367y();
        qsn0 qsn0Var = (qsn0) csn0Var.viewModel;
        String str = bLiveVoiceManagerInvite.mask.name;
        str.getClass();
        qsn0Var.m176360O(str, bLiveVoiceManagerInvite.mask.isFemale());
    }

    /* JADX INFO: renamed from: w4 */
    public static void m108544w4(csn0 csn0Var, roj0 roj0Var) {
        csn0Var.m108552H4();
    }

    /* JADX INFO: renamed from: x4 */
    public static void m108545x4(boolean z, csn0 csn0Var, List list) {
        if (z) {
            qsn0 qsn0Var = (qsn0) csn0Var.viewModel;
            list.getClass();
            qsn0Var.m176354I(list);
        } else {
            qsn0 qsn0Var2 = (qsn0) csn0Var.viewModel;
            list.getClass();
            qsn0Var2.m176357L(list);
        }
        ((qsn0) csn0Var.viewModel).m176355J();
    }

    /* JADX INFO: renamed from: y4 */
    public static void m108546y4(csn0 csn0Var, roj0 roj0Var) {
        csn0Var.m108551G4();
    }

    /* JADX INFO: renamed from: A4 */
    public final void m108547A4(@NotNull String userId) {
        userId.getClass();
        if (!m108549C4()) {
            duringCreated(VoiceRoomApiProvider.deleteManager(m206027E2().m149814k(), userId)).subscribe(ffw.m121194e(new e30() { // from class: l.srn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    csn0.m108531j4(this.f166116a, (roj0) obj);
                }
            }, new e30() { // from class: l.trn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    csn0.m108525d4((Throwable) obj);
                }
            }));
            return;
        }
        String strM149818o = m206027E2().m149818o();
        strM149818o.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.deleteManager(strM149818o, userId)).subscribe(ffw.m121194e(new e30() { // from class: l.qrn0
            @Override // p149l.e30
            public final void call(Object obj) {
                csn0.m108523b4(this.f156011a, (roj0) obj);
            }
        }, new e30() { // from class: l.rrn0
            @Override // p149l.e30
            public final void call(Object obj) {
                csn0.m108522a4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B4 */
    public final int m108548B4() {
        return m108549C4() ? ypv.m215672k().m195745U5() : ypv.m215672k().m195817d6();
    }

    /* JADX INFO: renamed from: C4 */
    public final boolean m108549C4() {
        return x4s.m207012b(m206027E2().mo149813j().liveMode);
    }

    /* JADX INFO: renamed from: D4 */
    public final void m108550D4(int index) {
        m108520I4(true);
    }

    /* JADX INFO: renamed from: G4 */
    public final void m108551G4() {
        duringCreated(VoiceRoomApiProvider.getManagerInvites(m206027E2().m149814k(), "recall", "")).subscribe(ffw.m121197h(new e30() { // from class: l.bsn0
            @Override // p149l.e30
            public final void call(Object obj) {
                csn0.m108535n4(this.f77111a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H4 */
    public final void m108552H4() {
        m108520I4(false);
    }

    /* JADX INFO: renamed from: J4 */
    public final void m108553J4(@NotNull final BLiveVoiceManagerInvite member) {
        member.getClass();
        if (m108549C4()) {
            m108519F4(member);
            return;
        }
        List<BLiveVoiceManager> listM128631U3 = m128631U3();
        if (listM128631U3 == null || listM128631U3.isEmpty()) {
            m108519F4(member);
            return;
        }
        qsn0 qsn0Var = (qsn0) this.viewModel;
        List<BLiveVoiceManager> listM128631U4 = m128631U3();
        listM128631U4.getClass();
        String str = listM128631U4.get(0).mask.name;
        str.getClass();
        qsn0Var.m176359N(str, new d30() { // from class: l.ern0
            @Override // p149l.d30
            public final void call() {
                csn0.m108541t4(this.f92946a, member);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K4 */
    public final void m108554K4(@NotNull String userId) {
        C22306c c22306cInviteBecomeManager;
        userId.getClass();
        if (m108549C4()) {
            String strM149818o = m206027E2().m149818o();
            strM149818o.getClass();
            c22306cInviteBecomeManager = VirtualVoiceRoomApiProvider.inviteBecomeManager(strM149818o, userId, "recall");
        } else {
            c22306cInviteBecomeManager = VoiceRoomApiProvider.inviteBecomeManager(m206027E2().m149814k(), userId, "recall");
        }
        duringCreated(c22306cInviteBecomeManager).subscribe(ffw.m121194e(new e30() { // from class: l.nrn0
            @Override // p149l.e30
            public final void call(Object obj) {
                csn0.m108546y4(this.f140208a, (roj0) obj);
            }
        }, new e30() { // from class: l.prn0
            @Override // p149l.e30
            public final void call(Object obj) {
                csn0.m108533l4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.gxn0
    /* JADX INFO: renamed from: V3 */
    public void mo108555V3() {
        super.mo108555V3();
        qsn0 qsn0Var = (qsn0) this.viewModel;
        List<BLiveVoiceManager> listM128631U3 = m128631U3();
        qsn0Var.m176362S(listM128631U3 != null ? listM128631U3.size() : 0);
    }

    @Override // p149l.gxn0
    /* JADX INFO: renamed from: Z3 */
    public void mo108556Z3() {
        super.mo108556Z3();
        m108552H4();
        m108551G4();
    }

    @Override // p149l.gxn0, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated((C22306c) m206028F2().VoiceLiveManagerEvent.openManagerInviteDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.drn0
            @Override // p149l.e30
            public final void call(Object obj) {
                csn0.m108538q4(this.f87653a, (Boolean) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated((C22306c) m206028F2().VoiceLiveManagerEvent.onInviteUserBecomeManager().m172460g());
        final Function1 function1 = new Function1() { // from class: l.orn0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return csn0.m108534m4(this.f145342a, (String) obj);
            }
        };
        c22306cDuringCreated.map(new w9j() { // from class: l.urn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return csn0.m108536o4(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.vrn0
            @Override // p149l.e30
            public final void call(Object obj) {
                csn0.m108539r4(this.f182735a, (BLiveVoiceManagerInvite) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().VoiceLiveManagerEvent.onCancelManager().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.wrn0
            @Override // p149l.e30
            public final void call(Object obj) {
                csn0.m108528g4(this.f187810a, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z4 */
    public final void m108557z4(@NotNull User user) {
        user.getClass();
        if (!m108549C4()) {
            duringCreated(VoiceRoomApiProvider.deleteManager(m206027E2().m149814k(), user.f56011id)).subscribe(ffw.m121194e(new e30() { // from class: l.zrn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    csn0.m108544w4(this.f204531a, (roj0) obj);
                }
            }, new e30() { // from class: l.asn0
                @Override // p149l.e30
                public final void call(Object obj) {
                    csn0.m108526e4((Throwable) obj);
                }
            }));
            return;
        }
        String strM149818o = m206027E2().m149818o();
        strM149818o.getClass();
        String str = user.f56011id;
        str.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.deleteManager(strM149818o, str)).subscribe(ffw.m121194e(new e30() { // from class: l.xrn0
            @Override // p149l.e30
            public final void call(Object obj) {
                csn0.m108524c4(this.f194156a, (roj0) obj);
            }
        }, new e30() { // from class: l.yrn0
            @Override // p149l.e30
            public final void call(Object obj) {
                csn0.m108530i4((Throwable) obj);
            }
        }));
    }
}
