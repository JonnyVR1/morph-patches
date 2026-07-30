package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u000fJ\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u000fJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010\u0018J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m88121d2 = {"Ll/xwp;", "Ll/rwn0;", "D", "Ll/k6o0;", "Ll/gxp;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "q4", "(Lcom/p1/mobile/putong/data/User;)V", Constants.KEY_T, "()V", "Z3", "", "s4", "()I", "v4", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "member", "x4", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;)V", "", "userId", "r4", "(Ljava/lang/String;)V", "y4", "(Ljava/lang/String;)Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "t4", "u4", "", "isLoad", "w4", "(Z)V", "j", "Ljava/lang/String;", "lastMemberEnterTime", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class xwp<D extends rwn0> extends k6o0<D, gxp> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public String lastMemberEnterTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwp(@NotNull dum<D> dumVar) {
        super(dumVar);
        dumVar.getClass();
        mo52715C(new gxp());
        this.lastMemberEnterTime = "";
    }

    /* JADX INFO: renamed from: a4 */
    public static void m213367a4(xwp xwpVar, Boolean bool) {
        xwpVar.m213386t4();
    }

    /* JADX INFO: renamed from: b4 */
    public static BLiveVoiceManagerInvite m213368b4(Function1 function1, Object obj) {
        return (BLiveVoiceManagerInvite) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: c4 */
    public static void m213369c4(Throwable th) {
        r35.m179578c(th);
    }

    /* JADX INFO: renamed from: d4 */
    public static void m213370d4(xwp xwpVar, BLiveVoiceManagerInvite bLiveVoiceManagerInvite, uxj0 uxj0Var) {
        ((gxp) xwpVar.viewModel).m132913p();
        gxp gxpVar = (gxp) xwpVar.viewModel;
        String str = bLiveVoiceManagerInvite.mask.name;
        str.getClass();
        gxpVar.m132908C(str, bLiveVoiceManagerInvite.mask.isFemale());
    }

    /* JADX INFO: renamed from: e4 */
    public static void m213371e4(xwp xwpVar, uxj0 uxj0Var) {
        xwpVar.m213388v4();
    }

    /* JADX INFO: renamed from: f4 */
    public static Unit m213372f4(xwp xwpVar, List list) {
        if (!jyb.m147479J(list)) {
            list.getClass();
            String str = ((BLiveVoiceManagerInvite) CollectionsKt.last(list)).entryTime;
            str.getClass();
            xwpVar.lastMemberEnterTime = str;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static void m213373g4(xwp xwpVar, List list) {
        ((gxp) xwpVar.viewModel).m132909G(list);
    }

    /* JADX INFO: renamed from: h4 */
    public static void m213374h4(xwp xwpVar, User user) {
        user.getClass();
        xwpVar.m213383q4(user);
    }

    /* JADX INFO: renamed from: i4 */
    public static void m213375i4(boolean z, xwp xwpVar, List list) {
        if (z) {
            gxp gxpVar = (gxp) xwpVar.viewModel;
            list.getClass();
            gxpVar.m132919x(list);
        } else {
            gxp gxpVar2 = (gxp) xwpVar.viewModel;
            list.getClass();
            gxpVar2.m132921z(list);
        }
        ((gxp) xwpVar.viewModel).m132920y();
    }

    /* JADX INFO: renamed from: j4 */
    public static void m213376j4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m213377k4(xwp xwpVar, uxj0 uxj0Var) {
        xwpVar.m213388v4();
    }

    /* JADX INFO: renamed from: l4 */
    public static void m213378l4(Throwable th) {
        r35.m179578c(th);
    }

    /* JADX INFO: renamed from: m4 */
    public static void m213379m4(xwp xwpVar, BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        xwpVar.m213387u4(bLiveVoiceManagerInvite);
    }

    /* JADX INFO: renamed from: n4 */
    public static void m213380n4(Throwable th) {
        r35.m179578c(th);
    }

    /* JADX INFO: renamed from: o4 */
    public static BLiveVoiceManagerInvite m213381o4(xwp xwpVar, String str) {
        str.getClass();
        return xwpVar.m213391y4(str);
    }

    /* JADX INFO: renamed from: p4 */
    public static void m213382p4(xwp xwpVar, BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        bLiveVoiceManagerInvite.getClass();
        xwpVar.m213390x4(bLiveVoiceManagerInvite);
    }

    /* JADX INFO: renamed from: q4 */
    private final void m213383q4(User user) {
        duringCreated(VoiceRoomApiProvider.deleteManager(m213810E2().m202191k(), user.f56859id)).subscribe(dhw.m115826e(new y20() { // from class: l.uwp
            @Override // p153l.y20
            public final void call(Object obj) {
                xwp.m213371e4(this.f181314a, (uxj0) obj);
            }
        }, new y20() { // from class: l.vwp
            @Override // p153l.y20
            public final void call(Object obj) {
                xwp.m213378l4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k6o0
    /* JADX INFO: renamed from: Z3 */
    public void mo128553Z3() {
        super.mo128553Z3();
        m213388v4();
    }

    /* JADX INFO: renamed from: r4 */
    public final void m213384r4(@NotNull String userId) {
        userId.getClass();
        duringCreated(VoiceRoomApiProvider.deleteManager(m213810E2().m202191k(), userId)).subscribe(dhw.m115826e(new y20() { // from class: l.mwp
            @Override // p153l.y20
            public final void call(Object obj) {
                xwp.m213377k4(this.f139139a, (uxj0) obj);
            }
        }, new y20() { // from class: l.nwp
            @Override // p153l.y20
            public final void call(Object obj) {
                xwp.m213380n4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s4 */
    public final int m213385s4() {
        return zrv.m221193k().m203604d6();
    }

    @Override // p153l.k6o0, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated((C22421c) m213811F2().VoiceLiveManagerEvent.openManagerInviteDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.hwp
            @Override // p153l.y20
            public final void call(Object obj) {
                xwp.m213367a4(this.f111907a, (Boolean) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated((C22421c) m213811F2().VoiceLiveManagerEvent.onInviteUserBecomeManager().m199270g());
        final Function1 function1 = new Function1() { // from class: l.owp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xwp.m213381o4(this.f149548a, (String) obj);
            }
        };
        c22421cDuringCreated.map(new qcj() { // from class: l.pwp
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return xwp.m213368b4(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.qwp
            @Override // p153l.y20
            public final void call(Object obj) {
                xwp.m213382p4(this.f159960a, (BLiveVoiceManagerInvite) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().VoiceLiveManagerEvent.onCancelManager().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.rwp
            @Override // p153l.y20
            public final void call(Object obj) {
                xwp.m213374h4(this.f165210a, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public final void m213386t4() {
        duringCreated(VoiceRoomApiProvider.getManagerInvites(m213810E2().m202191k(), "live", "")).subscribe(dhw.m115829h(new y20() { // from class: l.swp
            @Override // p153l.y20
            public final void call(Object obj) {
                xwp.m213373g4(this.f170985a, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u4 */
    public final void m213387u4(final BLiveVoiceManagerInvite member) {
        duringCreated(VoiceRoomApiProvider.inviteBecomeManager(m213810E2().m202191k(), member.userId, "live")).subscribe(dhw.m115826e(new y20() { // from class: l.wwp
            @Override // p153l.y20
            public final void call(Object obj) {
                xwp.m213370d4(this.f191321a, member, (uxj0) obj);
            }
        }, new y20() { // from class: l.iwp
            @Override // p153l.y20
            public final void call(Object obj) {
                xwp.m213369c4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v4 */
    public final void m213388v4() {
        m213389w4(false);
    }

    /* JADX INFO: renamed from: w4 */
    public final void m213389w4(final boolean isLoad) {
        if (!isLoad) {
            this.lastMemberEnterTime = "";
        }
        C22421c<T> c22421cDuringCreated = duringCreated(VoiceRoomApiProvider.getManagerInvites(m213810E2().m202191k(), "live", this.lastMemberEnterTime));
        final Function1 function1 = new Function1() { // from class: l.jwp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xwp.m213372f4(this.f122949a, (List) obj);
            }
        };
        c22421cDuringCreated.doOnNext(new y20() { // from class: l.kwp
            @Override // p153l.y20
            public final void call(Object obj) {
                xwp.m213376j4(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.lwp
            @Override // p153l.y20
            public final void call(Object obj) {
                xwp.m213375i4(isLoad, this, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x4 */
    public final void m213390x4(@NotNull final BLiveVoiceManagerInvite member) {
        member.getClass();
        List<BLiveVoiceManager> listM148530U3 = m148530U3();
        if (listM148530U3 != null && !listM148530U3.isEmpty()) {
            List<BLiveVoiceManager> listM148530U4 = m148530U3();
            Integer numValueOf = listM148530U4 != null ? Integer.valueOf(listM148530U4.size()) : null;
            numValueOf.getClass();
            if (numValueOf.intValue() >= m213385s4()) {
                gxp gxpVar = (gxp) this.viewModel;
                List<BLiveVoiceManager> listM148530U5 = m148530U3();
                listM148530U5.getClass();
                String str = listM148530U5.get(0).mask.name;
                str.getClass();
                gxpVar.m132907B(str, new x20() { // from class: l.twp
                    @Override // p153l.x20
                    public final void call() {
                        xwp.m213379m4(this.f176415a, member);
                    }
                });
                return;
            }
        }
        m213387u4(member);
    }

    /* JADX INFO: renamed from: y4 */
    public final BLiveVoiceManagerInvite m213391y4(String userId) {
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
}
