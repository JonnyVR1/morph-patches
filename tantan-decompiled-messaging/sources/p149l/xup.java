package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u000fJ\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u000fJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010\u0018J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m87232d2 = {"Ll/xup;", "Ll/nnn0;", "D", "Ll/gxn0;", "Ll/gvp;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "q4", "(Lcom/p1/mobile/putong/data/User;)V", Constants.KEY_T, "()V", "Z3", "", "s4", "()I", "v4", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "member", "x4", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;)V", "", "userId", "r4", "(Ljava/lang/String;)V", "y4", "(Ljava/lang/String;)Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "t4", "u4", "", "isLoad", "w4", "(Z)V", "j", "Ljava/lang/String;", "lastMemberEnterTime", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class xup<D extends nnn0> extends gxn0<D, gvp> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public String lastMemberEnterTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xup(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        mo51532C(new gvp());
        this.lastMemberEnterTime = "";
    }

    /* JADX INFO: renamed from: a4 */
    public static void m211153a4(xup xupVar, Boolean bool) {
        xupVar.m211172t4();
    }

    /* JADX INFO: renamed from: b4 */
    public static BLiveVoiceManagerInvite m211154b4(Function1 function1, Object obj) {
        return (BLiveVoiceManagerInvite) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c4 */
    public static void m211155c4(Throwable th) {
        s25.m182058c(th);
    }

    /* JADX INFO: renamed from: d4 */
    public static void m211156d4(xup xupVar, BLiveVoiceManagerInvite bLiveVoiceManagerInvite, roj0 roj0Var) {
        ((gvp) xupVar.viewModel).m128281p();
        gvp gvpVar = (gvp) xupVar.viewModel;
        String str = bLiveVoiceManagerInvite.mask.name;
        str.getClass();
        gvpVar.m128276C(str, bLiveVoiceManagerInvite.mask.isFemale());
    }

    /* JADX INFO: renamed from: e4 */
    public static void m211157e4(xup xupVar, roj0 roj0Var) {
        xupVar.m211174v4();
    }

    /* JADX INFO: renamed from: f4 */
    public static Unit m211158f4(xup xupVar, List list) {
        if (!vwb.m200296J(list)) {
            list.getClass();
            String str = ((BLiveVoiceManagerInvite) CollectionsKt.last(list)).entryTime;
            str.getClass();
            xupVar.lastMemberEnterTime = str;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static void m211159g4(xup xupVar, List list) {
        ((gvp) xupVar.viewModel).m128277G(list);
    }

    /* JADX INFO: renamed from: h4 */
    public static void m211160h4(xup xupVar, User user) {
        user.getClass();
        xupVar.m211169q4(user);
    }

    /* JADX INFO: renamed from: i4 */
    public static void m211161i4(boolean z, xup xupVar, List list) {
        if (z) {
            gvp gvpVar = (gvp) xupVar.viewModel;
            list.getClass();
            gvpVar.m128287x(list);
        } else {
            gvp gvpVar2 = (gvp) xupVar.viewModel;
            list.getClass();
            gvpVar2.m128289z(list);
        }
        ((gvp) xupVar.viewModel).m128288y();
    }

    /* JADX INFO: renamed from: j4 */
    public static void m211162j4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m211163k4(xup xupVar, roj0 roj0Var) {
        xupVar.m211174v4();
    }

    /* JADX INFO: renamed from: l4 */
    public static void m211164l4(Throwable th) {
        s25.m182058c(th);
    }

    /* JADX INFO: renamed from: m4 */
    public static void m211165m4(xup xupVar, BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        xupVar.m211173u4(bLiveVoiceManagerInvite);
    }

    /* JADX INFO: renamed from: n4 */
    public static void m211166n4(Throwable th) {
        s25.m182058c(th);
    }

    /* JADX INFO: renamed from: o4 */
    public static BLiveVoiceManagerInvite m211167o4(xup xupVar, String str) {
        str.getClass();
        return xupVar.m211177y4(str);
    }

    /* JADX INFO: renamed from: p4 */
    public static void m211168p4(xup xupVar, BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        bLiveVoiceManagerInvite.getClass();
        xupVar.m211176x4(bLiveVoiceManagerInvite);
    }

    /* JADX INFO: renamed from: q4 */
    private final void m211169q4(User user) {
        duringCreated(VoiceRoomApiProvider.deleteManager(m206027E2().m149814k(), user.f56011id)).subscribe(ffw.m121194e(new e30() { // from class: l.uup
            @Override // p149l.e30
            public final void call(Object obj) {
                xup.m211157e4(this.f178411a, (roj0) obj);
            }
        }, new e30() { // from class: l.vup
            @Override // p149l.e30
            public final void call(Object obj) {
                xup.m211164l4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.gxn0
    /* JADX INFO: renamed from: Z3 */
    public void mo108556Z3() {
        super.mo108556Z3();
        m211174v4();
    }

    /* JADX INFO: renamed from: r4 */
    public final void m211170r4(@NotNull String userId) {
        userId.getClass();
        duringCreated(VoiceRoomApiProvider.deleteManager(m206027E2().m149814k(), userId)).subscribe(ffw.m121194e(new e30() { // from class: l.mup
            @Override // p149l.e30
            public final void call(Object obj) {
                xup.m211163k4(this.f135827a, (roj0) obj);
            }
        }, new e30() { // from class: l.nup
            @Override // p149l.e30
            public final void call(Object obj) {
                xup.m211166n4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s4 */
    public final int m211171s4() {
        return ypv.m215672k().m195817d6();
    }

    @Override // p149l.gxn0, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated((C22306c) m206028F2().VoiceLiveManagerEvent.openManagerInviteDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.hup
            @Override // p149l.e30
            public final void call(Object obj) {
                xup.m211153a4(this.f109577a, (Boolean) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated((C22306c) m206028F2().VoiceLiveManagerEvent.onInviteUserBecomeManager().m172460g());
        final Function1 function1 = new Function1() { // from class: l.oup
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xup.m211167o4(this.f145717a, (String) obj);
            }
        };
        c22306cDuringCreated.map(new w9j() { // from class: l.pup
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xup.m211154b4(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.qup
            @Override // p149l.e30
            public final void call(Object obj) {
                xup.m211168p4(this.f156530a, (BLiveVoiceManagerInvite) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().VoiceLiveManagerEvent.onCancelManager().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.rup
            @Override // p149l.e30
            public final void call(Object obj) {
                xup.m211160h4(this.f161082a, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final void m211172t4() {
        duringCreated(VoiceRoomApiProvider.getManagerInvites(m206027E2().m149814k(), "live", "")).subscribe(ffw.m121197h(new e30() { // from class: l.sup
            @Override // p149l.e30
            public final void call(Object obj) {
                xup.m211159g4(this.f166491a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u4 */
    public final void m211173u4(final BLiveVoiceManagerInvite member) {
        duringCreated(VoiceRoomApiProvider.inviteBecomeManager(m206027E2().m149814k(), member.userId, "live")).subscribe(ffw.m121194e(new e30() { // from class: l.wup
            @Override // p149l.e30
            public final void call(Object obj) {
                xup.m211156d4(this.f188148a, member, (roj0) obj);
            }
        }, new e30() { // from class: l.iup
            @Override // p149l.e30
            public final void call(Object obj) {
                xup.m211155c4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public final void m211174v4() {
        m211175w4(false);
    }

    /* JADX INFO: renamed from: w4 */
    public final void m211175w4(final boolean isLoad) {
        if (!isLoad) {
            this.lastMemberEnterTime = "";
        }
        C22306c<T> c22306cDuringCreated = duringCreated(VoiceRoomApiProvider.getManagerInvites(m206027E2().m149814k(), "live", this.lastMemberEnterTime));
        final Function1 function1 = new Function1() { // from class: l.jup
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xup.m211158f4(this.f119803a, (List) obj);
            }
        };
        c22306cDuringCreated.doOnNext(new e30() { // from class: l.kup
            @Override // p149l.e30
            public final void call(Object obj) {
                xup.m211162j4(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.lup
            @Override // p149l.e30
            public final void call(Object obj) {
                xup.m211161i4(isLoad, this, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x4 */
    public final void m211176x4(@NotNull final BLiveVoiceManagerInvite member) {
        member.getClass();
        List<BLiveVoiceManager> listM128631U3 = m128631U3();
        if (listM128631U3 != null && !listM128631U3.isEmpty()) {
            List<BLiveVoiceManager> listM128631U4 = m128631U3();
            Integer numValueOf = listM128631U4 != null ? Integer.valueOf(listM128631U4.size()) : null;
            numValueOf.getClass();
            if (numValueOf.intValue() >= m211171s4()) {
                gvp gvpVar = (gvp) this.viewModel;
                List<BLiveVoiceManager> listM128631U5 = m128631U3();
                listM128631U5.getClass();
                String str = listM128631U5.get(0).mask.name;
                str.getClass();
                gvpVar.m128275B(str, new d30() { // from class: l.tup
                    @Override // p149l.d30
                    public final void call() {
                        xup.m211165m4(this.f172209a, member);
                    }
                });
                return;
            }
        }
        m211173u4(member);
    }

    /* JADX INFO: renamed from: y4 */
    public final BLiveVoiceManagerInvite m211177y4(String userId) {
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
}
