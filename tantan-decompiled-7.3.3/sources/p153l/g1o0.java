package p153l;

import android.util.Pair;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u0010J\r\u0010\u001f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\u0010J\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b \u0010\u0013J\u0015\u0010!\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b#\u0010\"J\u0015\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u001b¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0014¢\u0006\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, m88121d2 = {"Ll/g1o0;", "Ll/rwn0;", "D", "Ll/k6o0;", "Ll/u1o0;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", "userId", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "L4", "(Ljava/lang/String;)Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "", "E4", "()V", "member", "F4", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;)V", "", "isLoad", "I4", "(Z)V", Constants.KEY_T, "Z3", "V3", "", "B4", "()I", "H4", "G4", "J4", "K4", "(Ljava/lang/String;)V", "A4", "Lcom/p1/mobile/putong/data/User;", "user", "z4", "(Lcom/p1/mobile/putong/data/User;)V", FirebaseAnalytics.Param.INDEX, "D4", "(I)V", "C4", "()Z", "j", "Ljava/lang/String;", "lastMemberEnterTime", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class g1o0<D extends rwn0> extends k6o0<D, u1o0> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public String lastMemberEnterTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1o0(@NotNull dum<D> dumVar) {
        super(dumVar);
        dumVar.getClass();
        mo52715C(new u1o0());
        this.lastMemberEnterTime = "";
    }

    /* JADX INFO: renamed from: E4 */
    private final void m128515E4() {
        C22421c<List<BLiveVoiceManagerInvite>> managerInvites = VoiceRoomApiProvider.getManagerInvites(m213810E2().m202191k(), "live", "");
        C22421c<List<BLiveVoiceManagerInvite>> managerInvites2 = VoiceRoomApiProvider.getManagerInvites(m213810E2().m202191k(), "recall", "");
        final Function2 function2 = new Function2() { // from class: l.m0o0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g1o0.m128539u4((List) obj, (List) obj2);
            }
        };
        duringCreated(C22421c.zip(managerInvites, managerInvites2, new rcj() { // from class: l.n0o0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return g1o0.m128537s4(function2, obj, obj2);
            }
        })).subscribe(dhw.m115829h(new y20() { // from class: l.o0o0
            @Override // p153l.y20
            public final void call(Object obj) {
                g1o0.m128529k4(this.f144562a, (Pair) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F4 */
    private final void m128516F4(final BLiveVoiceManagerInvite member) {
        C22421c c22421cInviteBecomeManager;
        if (m128546C4()) {
            String strM202194o = m213810E2().m202194o();
            strM202194o.getClass();
            String str = member.userId;
            str.getClass();
            c22421cInviteBecomeManager = VirtualVoiceRoomApiProvider.inviteBecomeManager(strM202194o, str, "live");
        } else {
            c22421cInviteBecomeManager = VoiceRoomApiProvider.inviteBecomeManager(m213810E2().m202191k(), member.userId, "live");
        }
        duringCreated(c22421cInviteBecomeManager).subscribe(dhw.m115826e(new y20() { // from class: l.p0o0
            @Override // p153l.y20
            public final void call(Object obj) {
                g1o0.m128540v4(this.f150081a, member, (uxj0) obj);
            }
        }, new y20() { // from class: l.q0o0
            @Override // p153l.y20
            public final void call(Object obj) {
                g1o0.m128534p4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I4 */
    private final void m128517I4(final boolean isLoad) {
        if (!isLoad) {
            this.lastMemberEnterTime = "";
        }
        C22421c<T> c22421cDuringCreated = duringCreated(VoiceRoomApiProvider.getManagerInvites(m213810E2().m202191k(), "live", this.lastMemberEnterTime));
        final Function1 function1 = new Function1() { // from class: l.j0o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g1o0.m128526h4(this.f117835a, (List) obj);
            }
        };
        c22421cDuringCreated.doOnNext(new y20() { // from class: l.k0o0
            @Override // p153l.y20
            public final void call(Object obj) {
                g1o0.m128524f4(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.l0o0
            @Override // p153l.y20
            public final void call(Object obj) {
                g1o0.m128542x4(isLoad, this, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L4 */
    private final BLiveVoiceManagerInvite m128518L4(String userId) {
        String str;
        h64 h64VarM136875n = m213810E2().m183411P2().m136875n(userId);
        if (h64VarM136875n == null || (str = h64VarM136875n.f107998b) == null) {
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
    public static void m128519a4(Throwable th) {
        r35.m179578c(th);
    }

    /* JADX INFO: renamed from: b4 */
    public static void m128520b4(g1o0 g1o0Var, uxj0 uxj0Var) {
        g1o0Var.m128549H4();
    }

    /* JADX INFO: renamed from: c4 */
    public static void m128521c4(g1o0 g1o0Var, uxj0 uxj0Var) {
        o1j0.m165636j("管理员权限已移除");
        g1o0Var.m128549H4();
    }

    /* JADX INFO: renamed from: d4 */
    public static void m128522d4(Throwable th) {
        r35.m179578c(th);
    }

    /* JADX INFO: renamed from: e4 */
    public static void m128523e4(Throwable th) {
        r35.m179578c(th);
    }

    /* JADX INFO: renamed from: f4 */
    public static void m128524f4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g4 */
    public static void m128525g4(g1o0 g1o0Var, User user) {
        user.getClass();
        g1o0Var.m128554z4(user);
    }

    /* JADX INFO: renamed from: h4 */
    public static Unit m128526h4(g1o0 g1o0Var, List list) {
        if (!jyb.m147479J(list)) {
            list.getClass();
            String str = ((BLiveVoiceManagerInvite) CollectionsKt.last(list)).entryTime;
            str.getClass();
            g1o0Var.lastMemberEnterTime = str;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i4 */
    public static void m128527i4(Throwable th) {
        r35.m179578c(th);
    }

    /* JADX INFO: renamed from: j4 */
    public static void m128528j4(g1o0 g1o0Var, uxj0 uxj0Var) {
        g1o0Var.m128549H4();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m128529k4(g1o0 g1o0Var, Pair pair) {
        ((u1o0) g1o0Var.viewModel).m194079R((List) pair.first, (List) pair.second);
    }

    /* JADX INFO: renamed from: l4 */
    public static void m128530l4(Throwable th) {
        r35.m179578c(th);
    }

    /* JADX INFO: renamed from: m4 */
    public static BLiveVoiceManagerInvite m128531m4(g1o0 g1o0Var, String str) {
        str.getClass();
        return g1o0Var.m128518L4(str);
    }

    /* JADX INFO: renamed from: n4 */
    public static void m128532n4(g1o0 g1o0Var, List list) {
        u1o0 u1o0Var = (u1o0) g1o0Var.viewModel;
        list.getClass();
        u1o0Var.m194074K(list);
    }

    /* JADX INFO: renamed from: o4 */
    public static BLiveVoiceManagerInvite m128533o4(Function1 function1, Object obj) {
        return (BLiveVoiceManagerInvite) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: p4 */
    public static void m128534p4(Throwable th) {
        r35.m179578c(th);
    }

    /* JADX INFO: renamed from: q4 */
    public static void m128535q4(g1o0 g1o0Var, Boolean bool) {
        g1o0Var.m128515E4();
    }

    /* JADX INFO: renamed from: r4 */
    public static void m128536r4(g1o0 g1o0Var, BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        bLiveVoiceManagerInvite.getClass();
        g1o0Var.m128550J4(bLiveVoiceManagerInvite);
    }

    /* JADX INFO: renamed from: s4 */
    public static Pair m128537s4(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: t4 */
    public static void m128538t4(g1o0 g1o0Var, BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        g1o0Var.m128516F4(bLiveVoiceManagerInvite);
    }

    /* JADX INFO: renamed from: u4 */
    public static Pair m128539u4(List list, List list2) {
        return new Pair(list, list2);
    }

    /* JADX INFO: renamed from: v4 */
    public static void m128540v4(g1o0 g1o0Var, BLiveVoiceManagerInvite bLiveVoiceManagerInvite, uxj0 uxj0Var) {
        ((u1o0) g1o0Var.viewModel).m194085y();
        u1o0 u1o0Var = (u1o0) g1o0Var.viewModel;
        String str = bLiveVoiceManagerInvite.mask.name;
        str.getClass();
        u1o0Var.m194078O(str, bLiveVoiceManagerInvite.mask.isFemale());
    }

    /* JADX INFO: renamed from: w4 */
    public static void m128541w4(g1o0 g1o0Var, uxj0 uxj0Var) {
        g1o0Var.m128549H4();
    }

    /* JADX INFO: renamed from: x4 */
    public static void m128542x4(boolean z, g1o0 g1o0Var, List list) {
        if (z) {
            u1o0 u1o0Var = (u1o0) g1o0Var.viewModel;
            list.getClass();
            u1o0Var.m194072I(list);
        } else {
            u1o0 u1o0Var2 = (u1o0) g1o0Var.viewModel;
            list.getClass();
            u1o0Var2.m194075L(list);
        }
        ((u1o0) g1o0Var.viewModel).m194073J();
    }

    /* JADX INFO: renamed from: y4 */
    public static void m128543y4(g1o0 g1o0Var, uxj0 uxj0Var) {
        g1o0Var.m128548G4();
    }

    /* JADX INFO: renamed from: A4 */
    public final void m128544A4(@NotNull String userId) {
        userId.getClass();
        if (!m128546C4()) {
            duringCreated(VoiceRoomApiProvider.deleteManager(m213810E2().m202191k(), userId)).subscribe(dhw.m115826e(new y20() { // from class: l.w0o0
                @Override // p153l.y20
                public final void call(Object obj) {
                    g1o0.m128528j4(this.f186622a, (uxj0) obj);
                }
            }, new y20() { // from class: l.x0o0
                @Override // p153l.y20
                public final void call(Object obj) {
                    g1o0.m128522d4((Throwable) obj);
                }
            }));
            return;
        }
        String strM202194o = m213810E2().m202194o();
        strM202194o.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.deleteManager(strM202194o, userId)).subscribe(dhw.m115826e(new y20() { // from class: l.u0o0
            @Override // p153l.y20
            public final void call(Object obj) {
                g1o0.m128520b4(this.f176920a, (uxj0) obj);
            }
        }, new y20() { // from class: l.v0o0
            @Override // p153l.y20
            public final void call(Object obj) {
                g1o0.m128519a4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B4 */
    public final int m128545B4() {
        return m128546C4() ? zrv.m221193k().m203532U5() : zrv.m221193k().m203604d6();
    }

    /* JADX INFO: renamed from: C4 */
    public final boolean m128546C4() {
        return y6s.m214494b(m213810E2().mo183435j().liveMode);
    }

    /* JADX INFO: renamed from: D4 */
    public final void m128547D4(int index) {
        m128517I4(true);
    }

    /* JADX INFO: renamed from: G4 */
    public final void m128548G4() {
        duringCreated(VoiceRoomApiProvider.getManagerInvites(m213810E2().m202191k(), "recall", "")).subscribe(dhw.m115829h(new y20() { // from class: l.f1o0
            @Override // p153l.y20
            public final void call(Object obj) {
                g1o0.m128532n4(this.f96810a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: H4 */
    public final void m128549H4() {
        m128517I4(false);
    }

    /* JADX INFO: renamed from: J4 */
    public final void m128550J4(@NotNull final BLiveVoiceManagerInvite member) {
        member.getClass();
        if (m128546C4()) {
            m128516F4(member);
            return;
        }
        List<BLiveVoiceManager> listM148530U3 = m148530U3();
        if (listM148530U3 == null || listM148530U3.isEmpty()) {
            m128516F4(member);
            return;
        }
        u1o0 u1o0Var = (u1o0) this.viewModel;
        List<BLiveVoiceManager> listM148530U4 = m148530U3();
        listM148530U4.getClass();
        String str = listM148530U4.get(0).mask.name;
        str.getClass();
        u1o0Var.m194077N(str, new x20() { // from class: l.i0o0
            @Override // p153l.x20
            public final void call() {
                g1o0.m128538t4(this.f112429a, member);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K4 */
    public final void m128551K4(@NotNull String userId) {
        C22421c c22421cInviteBecomeManager;
        userId.getClass();
        if (m128546C4()) {
            String strM202194o = m213810E2().m202194o();
            strM202194o.getClass();
            c22421cInviteBecomeManager = VirtualVoiceRoomApiProvider.inviteBecomeManager(strM202194o, userId, "recall");
        } else {
            c22421cInviteBecomeManager = VoiceRoomApiProvider.inviteBecomeManager(m213810E2().m202191k(), userId, "recall");
        }
        duringCreated(c22421cInviteBecomeManager).subscribe(dhw.m115826e(new y20() { // from class: l.r0o0
            @Override // p153l.y20
            public final void call(Object obj) {
                g1o0.m128543y4(this.f160660a, (uxj0) obj);
            }
        }, new y20() { // from class: l.t0o0
            @Override // p153l.y20
            public final void call(Object obj) {
                g1o0.m128530l4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k6o0
    /* JADX INFO: renamed from: V3 */
    public void mo128552V3() {
        super.mo128552V3();
        u1o0 u1o0Var = (u1o0) this.viewModel;
        List<BLiveVoiceManager> listM148530U3 = m148530U3();
        u1o0Var.m194080S(listM148530U3 != null ? listM148530U3.size() : 0);
    }

    @Override // p153l.k6o0
    /* JADX INFO: renamed from: Z3 */
    public void mo128553Z3() {
        super.mo128553Z3();
        m128549H4();
        m128548G4();
    }

    @Override // p153l.k6o0, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated((C22421c) m213811F2().VoiceLiveManagerEvent.openManagerInviteDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.h0o0
            @Override // p153l.y20
            public final void call(Object obj) {
                g1o0.m128535q4(this.f107315a, (Boolean) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated((C22421c) m213811F2().VoiceLiveManagerEvent.onInviteUserBecomeManager().m199270g());
        final Function1 function1 = new Function1() { // from class: l.s0o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g1o0.m128531m4(this.f165716a, (String) obj);
            }
        };
        c22421cDuringCreated.map(new qcj() { // from class: l.y0o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return g1o0.m128533o4(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.z0o0
            @Override // p153l.y20
            public final void call(Object obj) {
                g1o0.m128536r4(this.f202362a, (BLiveVoiceManagerInvite) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().VoiceLiveManagerEvent.onCancelManager().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.a1o0
            @Override // p153l.y20
            public final void call(Object obj) {
                g1o0.m128525g4(this.f67827a, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z4 */
    public final void m128554z4(@NotNull User user) {
        user.getClass();
        if (!m128546C4()) {
            duringCreated(VoiceRoomApiProvider.deleteManager(m213810E2().m202191k(), user.f56859id)).subscribe(dhw.m115826e(new y20() { // from class: l.d1o0
                @Override // p153l.y20
                public final void call(Object obj) {
                    g1o0.m128541w4(this.f84705a, (uxj0) obj);
                }
            }, new y20() { // from class: l.e1o0
                @Override // p153l.y20
                public final void call(Object obj) {
                    g1o0.m128523e4((Throwable) obj);
                }
            }));
            return;
        }
        String strM202194o = m213810E2().m202194o();
        strM202194o.getClass();
        String str = user.f56859id;
        str.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.deleteManager(strM202194o, str)).subscribe(dhw.m115826e(new y20() { // from class: l.b1o0
            @Override // p153l.y20
            public final void call(Object obj) {
                g1o0.m128521c4(this.f74389a, (uxj0) obj);
            }
        }, new y20() { // from class: l.c1o0
            @Override // p153l.y20
            public final void call(Object obj) {
                g1o0.m128527i4((Throwable) obj);
            }
        }));
    }
}
