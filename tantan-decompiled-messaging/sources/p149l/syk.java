package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.live.base.data.BLiveHeatVoiceRoomTask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceLivePush;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000bJ\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u000bR\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m87232d2 = {"Ll/syk;", "Ll/ho2;", "D", "Ll/zi2;", "Ll/cyk;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveHeatVoiceRoomTask;", Item.TYPE, "e4", "(Lcom/p1/mobile/putong/live/base/data/BLiveHeatVoiceRoomTask;)V", "i4", "j4", "l4", "f4", "M3", "h4", "()Ll/cyk;", "k4", "", "k", "Z", "g4", "()Z", "setHasCallInvite", "(Z)V", "hasCallInvite", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class syk<D extends ho2> extends zi2<D, cyk> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean hasCallInvite;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syk(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: P3 */
    public static void m186684P3(syk sykVar, BLiveVoiceLivePush bLiveVoiceLivePush) {
        lsi0.m151595y("已召唤成员");
        sykVar.hasCallInvite = true;
        sykVar.m186706k4();
    }

    /* JADX INFO: renamed from: R3 */
    public static Boolean m186685R3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S3 */
    public static void m186686S3(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: T3 */
    public static Boolean m186687T3(syk sykVar, Boolean bool) {
        V v2 = sykVar.viewModel;
        return Boolean.valueOf(v2 != 0 && ((cyk) v2).isShowing());
    }

    /* JADX INFO: renamed from: U3 */
    public static void m186688U3(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: V3 */
    public static void m186689V3(syk sykVar, List list) {
        if (((cyk) sykVar.viewModel).isShowing()) {
            cyk cykVar = (cyk) sykVar.viewModel;
            list.getClass();
            cykVar.m109325z(list);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static Boolean m186690W3(syk sykVar, LongLinkVirtualVoice.StarRedpacketInfo starRedpacketInfo) {
        V v2 = sykVar.viewModel;
        return Boolean.valueOf(v2 != 0 && ((cyk) v2).isShowing());
    }

    /* JADX INFO: renamed from: X3 */
    public static void m186691X3(syk sykVar, LongLinkVirtualVoice.StarRedpacketInfo starRedpacketInfo) {
        sykVar.m186706k4();
    }

    /* JADX INFO: renamed from: Y3 */
    public static Boolean m186692Y3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z3 */
    public static void m186693Z3(syk sykVar, Boolean bool) {
        sykVar.m186706k4();
    }

    /* JADX INFO: renamed from: b4 */
    public static void m186695b4(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: c4 */
    public static void m186696c4(syk sykVar, BLiveVoiceLivePush bLiveVoiceLivePush) {
        if (!TextUtils.isEmpty(bLiveVoiceLivePush.message)) {
            lsi0.m151595y(bLiveVoiceLivePush.message);
        }
        sykVar.m186706k4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: d4 */
    public static void m186697d4(final syk sykVar, Boolean bool) {
        String strM149818o = sykVar.m206027E2().m149818o();
        strM149818o.getClass();
        String strM149814k = sykVar.m206027E2().m149814k();
        strM149814k.getClass();
        sykVar.duringCreated(VirtualVoiceRoomApiProvider.getVirtualHeatTasks(strM149818o, strM149814k)).subscribe(ffw.m121194e(new e30() { // from class: l.pyk
            @Override // p149l.e30
            public final void call(Object obj) {
                syk.m186698m4(this.f151860a, (List) obj);
            }
        }, new e30() { // from class: l.qyk
            @Override // p149l.e30
            public final void call(Object obj) {
                syk.m186699n4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m186698m4(syk sykVar, List list) {
        sykVar.m218910L3();
        cyk cykVar = (cyk) sykVar.viewModel;
        list.getClass();
        cykVar.m109325z(list);
        i5o0.m134522h(sykVar);
        sykVar.mo168244N3();
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m186699n4(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    @Override // p149l.zi2
    /* JADX INFO: renamed from: M3 */
    public void mo138009M3() {
        super.mo138009M3();
        this.hasCallInvite = false;
    }

    /* JADX INFO: renamed from: e4 */
    public final void m186700e4(@NotNull BLiveHeatVoiceRoomTask item) {
        item.getClass();
        m206028F2().VoiceCallEvent.callApplyEvent().mo172463j(new xpm0().m210511e(21100));
    }

    /* JADX INFO: renamed from: f4 */
    public final void m186701f4(@NotNull BLiveHeatVoiceRoomTask item) {
        item.getClass();
        duf0.m113689c(this, item.taskExt.grabStarRedPacketSchema, m206027E2().m149818o());
    }

    /* JADX INFO: renamed from: g4, reason: from getter */
    public final boolean getHasCallInvite() {
        return this.hasCallInvite;
    }

    @Override // p149l.zi2
    @NotNull
    /* JADX INFO: renamed from: h4, reason: merged with bridge method [inline-methods] */
    public cyk mo75679K3() {
        return new cyk();
    }

    /* JADX INFO: renamed from: i4 */
    public final void m186704i4(@NotNull BLiveHeatVoiceRoomTask item) {
        item.getClass();
        String strM199309D0 = ypv.f199493a.m199309D0();
        strM199309D0.getClass();
        String strM149814k = m206027E2().m149814k();
        strM149814k.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.notifyFans(strM199309D0, strM149814k)).subscribe(ffw.m121194e(new e30() { // from class: l.hyk
            @Override // p149l.e30
            public final void call(Object obj) {
                syk.m186696c4(this.f110123a, (BLiveVoiceLivePush) obj);
            }
        }, new e30() { // from class: l.iyk
            @Override // p149l.e30
            public final void call(Object obj) {
                syk.m186688U3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j4 */
    public final void m186705j4() {
        duringCreated(LivingNormalApiProvider.m71309P3(ypv.f199493a.m199309D0(), "", m206027E2().m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.fyk
            @Override // p149l.e30
            public final void call(Object obj) {
                syk.m186684P3(this.f99878a, (BLiveVoiceLivePush) obj);
            }
        }, new e30() { // from class: l.gyk
            @Override // p149l.e30
            public final void call(Object obj) {
                syk.m186686S3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m186706k4() {
        String strM149818o = m206027E2().m149818o();
        strM149818o.getClass();
        String strM149814k = m206027E2().m149814k();
        strM149814k.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.getVirtualHeatTasks(strM149818o, strM149814k)).subscribe(ffw.m121194e(new e30() { // from class: l.ryk
            @Override // p149l.e30
            public final void call(Object obj) {
                syk.m186689V3(this.f161564a, (List) obj);
            }
        }, new e30() { // from class: l.eyk
            @Override // p149l.e30
            public final void call(Object obj) {
                syk.m186695b4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public final void m186707l4() {
        m206028F2().VoiceVirtualLiveEvent.openSharePanelDialog().m172467p();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated((C22306c) m206028F2().VoiceVirtualLiveEvent.showHeatTasksDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.dyk
            @Override // p149l.e30
            public final void call(Object obj) {
                syk.m186697d4(this.f88402a, (Boolean) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated((C22306c) m206028F2().VoiceVirtualLiveEvent.refreshHeatTasks().m172460g());
        final Function1 function1 = new Function1() { // from class: l.jyk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return syk.m186687T3(this.f120312a, (Boolean) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.kyk
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return syk.m186692Y3(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.lyk
            @Override // p149l.e30
            public final void call(Object obj) {
                syk.m186693Z3(this.f130579a, (Boolean) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated2 = duringCreated(m206027E2().m132160q1().m189147u0());
        final Function1 function2 = new Function1() { // from class: l.myk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return syk.m186690W3(this.f136317a, (LongLinkVirtualVoice.StarRedpacketInfo) obj);
            }
        };
        c22306cDuringCreated2.filter(new w9j() { // from class: l.nyk
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return syk.m186685R3(function2, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.oyk
            @Override // p149l.e30
            public final void call(Object obj) {
                syk.m186691X3(this.f146332a, (LongLinkVirtualVoice.StarRedpacketInfo) obj);
            }
        }));
    }
}
