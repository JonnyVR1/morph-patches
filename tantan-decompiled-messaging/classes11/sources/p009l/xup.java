package p009l;

import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite;
import com.p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import l.bsm;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.i54;
import l.nnn0;
import l.roj0;
import l.s25;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u000fJ\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u000fJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010\u0018J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Ll/xup;", "Ll/nnn0;", "D", "Ll/gxn0;", "Ll/gvp;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "q4", "(Lcom/p1/mobile/putong/data/User;)V", "t", "()V", "Z3", "", "s4", "()I", "v4", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "member", "x4", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;)V", "", "userId", "r4", "(Ljava/lang/String;)V", "y4", "(Ljava/lang/String;)Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "t4", "u4", "", "isLoad", "w4", "(Z)V", "j", "Ljava/lang/String;", "lastMemberEnterTime", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class xup<D extends nnn0> extends gxn0<D, gvp> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public String lastMemberEnterTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xup(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        C(new gvp());
        this.lastMemberEnterTime = "";
    }

    /* JADX INFO: renamed from: a4 */
    public static void m25002a4(xup xupVar, Boolean bool) {
        xupVar.m25021t4();
    }

    /* JADX INFO: renamed from: b4 */
    public static BLiveVoiceManagerInvite m25003b4(Function1 function1, Object obj) {
        return (BLiveVoiceManagerInvite) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c4 */
    public static void m25004c4(Throwable th) {
        s25.c(th);
    }

    /* JADX INFO: renamed from: d4 */
    public static void m25005d4(xup xupVar, BLiveVoiceManagerInvite bLiveVoiceManagerInvite, roj0 roj0Var) {
        ((gvp) ((bwr) xupVar).viewModel).m15335p();
        gvp gvpVar = (gvp) ((bwr) xupVar).viewModel;
        String str = bLiveVoiceManagerInvite.mask.name;
        str.getClass();
        gvpVar.m15328C(str, bLiveVoiceManagerInvite.mask.isFemale());
    }

    /* JADX INFO: renamed from: e4 */
    public static void m25006e4(xup xupVar, roj0 roj0Var) {
        xupVar.m25023v4();
    }

    /* JADX INFO: renamed from: f4 */
    public static Unit m25007f4(xup xupVar, List list) {
        if (!vwb.J(list)) {
            list.getClass();
            String str = ((BLiveVoiceManagerInvite) CollectionsKt.last(list)).entryTime;
            str.getClass();
            xupVar.lastMemberEnterTime = str;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static void m25008g4(xup xupVar, List list) {
        ((gvp) ((bwr) xupVar).viewModel).m15330G(list);
    }

    /* JADX INFO: renamed from: h4 */
    public static void m25009h4(xup xupVar, User user) {
        user.getClass();
        xupVar.m25018q4(user);
    }

    /* JADX INFO: renamed from: i4 */
    public static void m25010i4(boolean z, xup xupVar, List list) {
        if (z) {
            gvp gvpVar = (gvp) ((bwr) xupVar).viewModel;
            list.getClass();
            gvpVar.m15341x(list);
        } else {
            gvp gvpVar2 = (gvp) ((bwr) xupVar).viewModel;
            list.getClass();
            gvpVar2.m15343z(list);
        }
        ((gvp) ((bwr) xupVar).viewModel).m15342y();
    }

    /* JADX INFO: renamed from: j4 */
    public static void m25011j4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m25012k4(xup xupVar, roj0 roj0Var) {
        xupVar.m25023v4();
    }

    /* JADX INFO: renamed from: l4 */
    public static void m25013l4(Throwable th) {
        s25.c(th);
    }

    /* JADX INFO: renamed from: m4 */
    public static void m25014m4(xup xupVar, BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        xupVar.m25022u4(bLiveVoiceManagerInvite);
    }

    /* JADX INFO: renamed from: n4 */
    public static void m25015n4(Throwable th) {
        s25.c(th);
    }

    /* JADX INFO: renamed from: o4 */
    public static BLiveVoiceManagerInvite m25016o4(xup xupVar, String str) {
        str.getClass();
        return xupVar.m25026y4(str);
    }

    /* JADX INFO: renamed from: p4 */
    public static void m25017p4(xup xupVar, BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        bLiveVoiceManagerInvite.getClass();
        xupVar.m25025x4(bLiveVoiceManagerInvite);
    }

    /* JADX INFO: renamed from: q4 */
    private final void m25018q4(User user) {
        duringCreated(VoiceRoomApiProvider.deleteManager(E2().k(), ((DbObject) user).id)).subscribe(ffw.e(new e30() { // from class: l.uup
            public final void call(Object obj) {
                xup.m25006e4(this.f21344a, (roj0) obj);
            }
        }, new e30() { // from class: l.vup
            public final void call(Object obj) {
                xup.m25013l4((Throwable) obj);
            }
        }));
    }

    @Override // p009l.gxn0
    /* JADX INFO: renamed from: Z3 */
    public void mo12838Z3() {
        super.mo12838Z3();
        m25023v4();
    }

    /* JADX INFO: renamed from: r4 */
    public final void m25019r4(@NotNull String userId) {
        userId.getClass();
        duringCreated(VoiceRoomApiProvider.deleteManager(E2().k(), userId)).subscribe(ffw.e(new e30() { // from class: l.mup
            public final void call(Object obj) {
                xup.m25012k4(this.f17117a, (roj0) obj);
            }
        }, new e30() { // from class: l.nup
            public final void call(Object obj) {
                xup.m25015n4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s4 */
    public final int m25020s4() {
        return ypv.m25490k().d6();
    }

    @Override // p009l.gxn0
    /* JADX INFO: renamed from: t */
    public void mo12579t() {
        super.mo12579t();
        duringCreated((c) F2().VoiceLiveManagerEvent.openManagerInviteDialog().g()).subscribe(ffw.d(new e30() { // from class: l.hup
            public final void call(Object obj) {
                xup.m25002a4(this.f14259a, (Boolean) obj);
            }
        }));
        c cVarDuringCreated = duringCreated((c) F2().VoiceLiveManagerEvent.onInviteUserBecomeManager().g());
        final Function1 function1 = new Function1() { // from class: l.oup
            public final Object invoke(Object obj) {
                return xup.m25016o4(this.f18259a, (String) obj);
            }
        };
        cVarDuringCreated.map(new w9j() { // from class: l.pup
            public final Object call(Object obj) {
                return xup.m25003b4(function1, obj);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.qup
            public final void call(Object obj) {
                xup.m25017p4(this.f19557a, (BLiveVoiceManagerInvite) obj);
            }
        }));
        duringCreated((c) F2().VoiceLiveManagerEvent.onCancelManager().g()).subscribe(ffw.h(new e30() { // from class: l.rup
            public final void call(Object obj) {
                xup.m25009h4(this.f19988a, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final void m25021t4() {
        duringCreated(VoiceRoomApiProvider.getManagerInvites(E2().k(), "live", "")).subscribe(ffw.h(new e30() { // from class: l.sup
            public final void call(Object obj) {
                xup.m25008g4(this.f20477a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u4 */
    public final void m25022u4(final BLiveVoiceManagerInvite member) {
        duringCreated(VoiceRoomApiProvider.inviteBecomeManager(E2().k(), member.userId, "live")).subscribe(ffw.e(new e30() { // from class: l.wup
            public final void call(Object obj) {
                xup.m25005d4(this.f22333a, member, (roj0) obj);
            }
        }, new e30() { // from class: l.iup
            public final void call(Object obj) {
                xup.m25004c4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public final void m25023v4() {
        m25024w4(false);
    }

    /* JADX INFO: renamed from: w4 */
    public final void m25024w4(final boolean isLoad) {
        if (!isLoad) {
            this.lastMemberEnterTime = "";
        }
        c cVarDuringCreated = duringCreated(VoiceRoomApiProvider.getManagerInvites(E2().k(), "live", this.lastMemberEnterTime));
        final Function1 function1 = new Function1() { // from class: l.jup
            public final Object invoke(Object obj) {
                return xup.m25007f4(this.f15334a, (List) obj);
            }
        };
        cVarDuringCreated.doOnNext(new e30() { // from class: l.kup
            public final void call(Object obj) {
                xup.m25011j4(function1, obj);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.lup
            public final void call(Object obj) {
                xup.m25010i4(isLoad, this, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x4 */
    public final void m25025x4(@NotNull final BLiveVoiceManagerInvite member) {
        member.getClass();
        List<BLiveVoiceManager> listM15357U3 = m15357U3();
        if (listM15357U3 != null && !listM15357U3.isEmpty()) {
            List<BLiveVoiceManager> listM15357U4 = m15357U3();
            Integer numValueOf = listM15357U4 != null ? Integer.valueOf(listM15357U4.size()) : null;
            numValueOf.getClass();
            if (numValueOf.intValue() >= m25020s4()) {
                gvp gvpVar = (gvp) ((bwr) this).viewModel;
                List<BLiveVoiceManager> listM15357U5 = m15357U3();
                listM15357U5.getClass();
                String str = listM15357U5.get(0).mask.name;
                str.getClass();
                gvpVar.m15327B(str, new d30() { // from class: l.tup
                    public final void call() {
                        xup.m25014m4(this.f20877a, member);
                    }
                });
                return;
            }
        }
        m25022u4(member);
    }

    /* JADX INFO: renamed from: y4 */
    public final BLiveVoiceManagerInvite m25026y4(String userId) {
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
}
