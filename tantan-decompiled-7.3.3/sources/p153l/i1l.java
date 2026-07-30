package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceLivePush;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u000bR\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m88121d2 = {"Ll/i1l;", "Ll/oo2;", "D", "Ll/hj2;", "Ll/s0l;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveHeatVoiceRoomTask;", Item.TYPE, "e4", "(Lcom/p1/mobile/putong/live/base/data/BLiveHeatVoiceRoomTask;)V", "i4", "j4", "l4", "f4", "M3", "h4", "()Ll/s0l;", "k4", "", "k", "Z", "g4", "()Z", "setHasCallInvite", "(Z)V", "hasCallInvite", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class i1l<D extends oo2> extends hj2<D, s0l> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean hasCallInvite;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1l(@NotNull dum<D> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: P3 */
    public static void m138117P3(i1l i1lVar, BLiveVoiceLivePush bLiveVoiceLivePush) {
        o1j0.m165651y("已召唤成员");
        i1lVar.hasCallInvite = true;
        i1lVar.m138139k4();
    }

    /* JADX INFO: renamed from: R3 */
    public static Boolean m138118R3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m138119S3(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: T3 */
    public static Boolean m138120T3(i1l i1lVar, Boolean bool) {
        V v2 = i1lVar.viewModel;
        return Boolean.valueOf(v2 != 0 && ((s0l) v2).isShowing());
    }

    /* JADX INFO: renamed from: U3 */
    public static void m138121U3(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m138122V3(i1l i1lVar, List list) {
        if (((s0l) i1lVar.viewModel).isShowing()) {
            s0l s0lVar = (s0l) i1lVar.viewModel;
            list.getClass();
            s0lVar.m183966z(list);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static Boolean m138123W3(i1l i1lVar, LongLinkVirtualVoice.StarRedpacketInfo starRedpacketInfo) {
        V v2 = i1lVar.viewModel;
        return Boolean.valueOf(v2 != 0 && ((s0l) v2).isShowing());
    }

    /* JADX INFO: renamed from: X3 */
    public static void m138124X3(i1l i1lVar, LongLinkVirtualVoice.StarRedpacketInfo starRedpacketInfo) {
        i1lVar.m138139k4();
    }

    /* JADX INFO: renamed from: Y3 */
    public static Boolean m138125Y3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z3 */
    public static void m138126Z3(i1l i1lVar, Boolean bool) {
        i1lVar.m138139k4();
    }

    /* JADX INFO: renamed from: b4 */
    public static void m138128b4(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: c4 */
    public static void m138129c4(i1l i1lVar, BLiveVoiceLivePush bLiveVoiceLivePush) {
        if (!TextUtils.isEmpty(bLiveVoiceLivePush.message)) {
            o1j0.m165651y(bLiveVoiceLivePush.message);
        }
        i1lVar.m138139k4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: d4 */
    public static void m138130d4(final i1l i1lVar, Boolean bool) {
        String strM202194o = i1lVar.m213810E2().m202194o();
        strM202194o.getClass();
        String strM202191k = i1lVar.m213810E2().m202191k();
        strM202191k.getClass();
        i1lVar.duringCreated(VirtualVoiceRoomApiProvider.getVirtualHeatTasks(strM202194o, strM202191k)).subscribe(dhw.m115826e(new y20() { // from class: l.f1l
            @Override // p153l.y20
            public final void call(Object obj) {
                i1l.m138131m4(this.f96803a, (List) obj);
            }
        }, new y20() { // from class: l.g1l
            @Override // p153l.y20
            public final void call(Object obj) {
                i1l.m138132n4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m138131m4(i1l i1lVar, List list) {
        i1lVar.m135319L3();
        s0l s0lVar = (s0l) i1lVar.viewModel;
        list.getClass();
        s0lVar.m183966z(list);
        meo0.m158068h(i1lVar);
        i1lVar.mo135321N3();
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m138132n4(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    @Override // p153l.hj2
    /* JADX INFO: renamed from: M3 */
    public void mo135320M3() {
        super.mo135320M3();
        this.hasCallInvite = false;
    }

    /* JADX INFO: renamed from: e4 */
    public final void m138133e4(@NotNull BLiveHeatVoiceRoomTask item) {
        item.getClass();
        m213811F2().VoiceCallEvent.callApplyEvent().mo199273j(new bzm0().m107184e(21100));
    }

    /* JADX INFO: renamed from: f4 */
    public final void m138134f4(@NotNull BLiveHeatVoiceRoomTask item) {
        item.getClass();
        m2g0.m156836c(this, item.taskExt.grabStarRedPacketSchema, m213810E2().m202194o());
    }

    /* JADX INFO: renamed from: g4, reason: from getter */
    public final boolean getHasCallInvite() {
        return this.hasCallInvite;
    }

    @Override // p153l.hj2
    @NotNull
    /* JADX INFO: renamed from: h4, reason: merged with bridge method [inline-methods] */
    public s0l mo76862K3() {
        return new s0l();
    }

    /* JADX INFO: renamed from: i4 */
    public final void m138137i4(@NotNull BLiveHeatVoiceRoomTask item) {
        item.getClass();
        String strM207631D0 = zrv.f205799a.m207631D0();
        strM207631D0.getClass();
        String strM202191k = m213810E2().m202191k();
        strM202191k.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.notifyFans(strM207631D0, strM202191k)).subscribe(dhw.m115826e(new y20() { // from class: l.x0l
            @Override // p153l.y20
            public final void call(Object obj) {
                i1l.m138129c4(this.f191917a, (BLiveVoiceLivePush) obj);
            }
        }, new y20() { // from class: l.y0l
            @Override // p153l.y20
            public final void call(Object obj) {
                i1l.m138121U3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j4 */
    public final void m138138j4() {
        duringCreated(LivingNormalApiProvider.m72492P3(zrv.f205799a.m207631D0(), "", m213810E2().m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.v0l
            @Override // p153l.y20
            public final void call(Object obj) {
                i1l.m138117P3(this.f181883a, (BLiveVoiceLivePush) obj);
            }
        }, new y20() { // from class: l.w0l
            @Override // p153l.y20
            public final void call(Object obj) {
                i1l.m138119S3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m138139k4() {
        String strM202194o = m213810E2().m202194o();
        strM202194o.getClass();
        String strM202191k = m213810E2().m202191k();
        strM202191k.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.getVirtualHeatTasks(strM202194o, strM202191k)).subscribe(dhw.m115826e(new y20() { // from class: l.h1l
            @Override // p153l.y20
            public final void call(Object obj) {
                i1l.m138122V3(this.f107468a, (List) obj);
            }
        }, new y20() { // from class: l.u0l
            @Override // p153l.y20
            public final void call(Object obj) {
                i1l.m138128b4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public final void m138140l4() {
        m213811F2().VoiceVirtualLiveEvent.openSharePanelDialog().m199277p();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated((C22421c) m213811F2().VoiceVirtualLiveEvent.showHeatTasksDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.t0l
            @Override // p153l.y20
            public final void call(Object obj) {
                i1l.m138130d4(this.f171542a, (Boolean) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated((C22421c) m213811F2().VoiceVirtualLiveEvent.refreshHeatTasks().m199270g());
        final Function1 function1 = new Function1() { // from class: l.z0l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i1l.m138120T3(this.f202356a, (Boolean) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.a1l
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return i1l.m138125Y3(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.b1l
            @Override // p153l.y20
            public final void call(Object obj) {
                i1l.m138126Z3(this.f74382a, (Boolean) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated2 = duringCreated(m213810E2().m168545q1().m98329u0());
        final Function1 function2 = new Function1() { // from class: l.c1l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i1l.m138123W3(this.f79409a, (LongLinkVirtualVoice.StarRedpacketInfo) obj);
            }
        };
        c22421cDuringCreated2.filter(new qcj() { // from class: l.d1l
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return i1l.m138118R3(function2, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.e1l
            @Override // p153l.y20
            public final void call(Object obj) {
                i1l.m138124X3(this.f91623a, (LongLinkVirtualVoice.StarRedpacketInfo) obj);
            }
        }));
    }
}
