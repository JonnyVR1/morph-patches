package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m88121d2 = {"Ll/nv5;", "Ll/y8s;", "Ll/oo2;", "Ll/ev5;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", "throwable", "", "d4", "(Ljava/lang/Throwable;)V", Constants.KEY_T, "()V", "i4", "f4", "g4", "b4", "h4", "Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "giftBrief", "e4", "(Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;)V", "", Reason.TYPE, "c4", "(I)V", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "j", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "Ll/nsv;", "Lcom/p1/mobile/putong/data/User;", "k", "Ll/nsv;", "livingUser", "", BLiveStormDanmakuGiftResourceType.f45292l, "Z", "isHasMatched", "", "m", "Ljava/lang/String;", "receiveId", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class nv5 extends y8s<oo2, ev5> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public BLiveGiftItem giftItem;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public nsv<User> livingUser;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean isHasMatched;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public String receiveId;

    public nv5(@Nullable dum<?> dumVar) {
        super(dumVar);
        this.receiveId = "";
    }

    /* JADX INFO: renamed from: S3 */
    public static void m164846S3(nv5 nv5Var, Throwable th) {
        th.getClass();
        nv5Var.m164856b4(th);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m164847T3(nv5 nv5Var, Pair pair) {
        nsv<User> nsvVar = ((vak0) pair.getFirst()).f183108c;
        nsvVar.getClass();
        nv5Var.livingUser = nsvVar;
        nv5Var.isHasMatched = ((BLiveExtraResponse) pair.getSecond()).data.confessionRelationship.isMatched;
        nv5Var.m164860g4();
    }

    /* JADX INFO: renamed from: V3 */
    public static void m164849V3(nv5 nv5Var, String str) {
        BLiveGiftItem bLiveGiftItemM135161m = ((hiv) zrv.m221194l(htd0.f111521c)).m135161m(str);
        if (bLiveGiftItemM135161m != null) {
            nv5Var.giftItem = bLiveGiftItemM135161m;
            nv5Var.m164859f4();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static Pair m164850W3(vak0 vak0Var, BLiveExtraResponse bLiveExtraResponse) {
        return new Pair(vak0Var, bLiveExtraResponse);
    }

    /* JADX INFO: renamed from: Y3 */
    public static Pair m164852Y3(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: b4 */
    public final void m164856b4(Throwable throwable) {
        if (throwable instanceof TantanException.Client.CoreService) {
            o1j0.m165651y(((TantanException.Client.CoreService) throwable).metaMessage);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, l.oo2] */
    /* JADX INFO: renamed from: f4 */
    public final void m164859f4() {
        if (m213810E2() == 0) {
            return;
        }
        Object objM138856F3 = m138856F3(new ywj(701));
        objM138856F3.getClass();
        this.receiveId = (String) objM138856F3;
        gbk0 gbk0Var = new gbk0();
        String str = this.receiveId;
        ?? M213810E2 = m213810E2();
        M213810E2.getClass();
        String strM202191k = M213810E2.m202191k();
        ?? M213810E3 = m213810E2();
        M213810E3.getClass();
        String strM202194o = M213810E3.m202194o();
        ?? M213810E4 = m213810E2();
        M213810E4.getClass();
        C22421c<vak0> c22421cM129796p = gbk0Var.m129796p(str, strM202191k, "audience", "audience", BLiveType.voiceLive, "voiceroom-live", strM202194o, M213810E4.mo168489W0());
        bv5 bv5Var = bv5.INSTANCE;
        String strM207631D0 = zrv.f205799a.m207631D0();
        strM207631D0.getClass();
        C22421c<BLiveExtraResponse> c22421cM106554d = bv5Var.m106554d(strM207631D0, this.receiveId);
        final Function2 function2 = new Function2() { // from class: l.gv5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return nv5.m164850W3((vak0) obj, (BLiveExtraResponse) obj2);
            }
        };
        duringCreated(C22421c.zip(c22421cM129796p, c22421cM106554d, new rcj() { // from class: l.hv5
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return nv5.m164852Y3(function2, obj, obj2);
            }
        })).onBackpressureLatest().subscribe(dhw.m115826e(new y20() { // from class: l.iv5
            @Override // p153l.y20
            public final void call(Object obj) {
                nv5.m164847T3(this.f117015a, (Pair) obj);
            }
        }, new y20() { // from class: l.jv5
            @Override // p153l.y20
            public final void call(Object obj) {
                nv5.m164846S3(this.f122767a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public final void m164860g4() {
        if (this.viewModel == 0) {
            Act act = act();
            act.getClass();
            ev5 ev5Var = new ev5(act, this);
            this.viewModel = ev5Var;
            mo52715C(ev5Var);
        }
        ev5 ev5Var2 = (ev5) this.viewModel;
        nsv<User> nsvVar = this.livingUser;
        BLiveGiftItem bLiveGiftItem = null;
        if (nsvVar == null) {
            Intrinsics.m88391r("livingUser");
            nsvVar = null;
        }
        BLiveGiftItem bLiveGiftItem2 = this.giftItem;
        if (bLiveGiftItem2 == null) {
            Intrinsics.m88391r("giftItem");
        } else {
            bLiveGiftItem = bLiveGiftItem2;
        }
        ev5Var2.m122769P(nsvVar, bLiveGiftItem);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m164861h4() {
        BLiveGiftItem bLiveGiftItem;
        BLiveGiftItem bLiveGiftItem2 = this.giftItem;
        nsv<User> nsvVar = null;
        if (bLiveGiftItem2 == null) {
            Intrinsics.m88391r("giftItem");
            bLiveGiftItem2 = null;
        }
        if (!lre.m155614a(bLiveGiftItem2, true)) {
            o1j0.m165651y(xau.m209910t(R$string.f48121h5));
            return;
        }
        hne0.C17513a c17513a = new hne0.C17513a();
        BLiveGiftItem bLiveGiftItem3 = this.giftItem;
        if (bLiveGiftItem3 == null) {
            Intrinsics.m88391r("giftItem");
            bLiveGiftItem = null;
        } else {
            bLiveGiftItem = bLiveGiftItem3;
        }
        hne0 hne0VarM136086w = c17513a.m136086w(bLiveGiftItem, new y20() { // from class: l.kv5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128943a.m164858e4((BLiveGivenGiftBrief) obj);
            }
        }, new y20() { // from class: l.lv5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133683a.m164855d4((Throwable) obj);
            }
        }, new y20() { // from class: l.mv5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138872a.m164857c4(((Integer) obj).intValue());
            }
        }, false, 1, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.Grabheadlines)));
        if (hne0VarM136086w == null) {
            return;
        }
        nsv<User> nsvVar2 = this.livingUser;
        if (nsvVar2 == null) {
            Intrinsics.m88391r("livingUser");
            nsvVar2 = null;
        }
        String str = nsvVar2.f143542a.f56859id;
        nsv<User> nsvVar3 = this.livingUser;
        if (nsvVar3 == null) {
            Intrinsics.m88391r("livingUser");
            nsvVar3 = null;
        }
        String str2 = nsvVar3.f143542a.name;
        nsv<User> nsvVar4 = this.livingUser;
        if (nsvVar4 == null) {
            Intrinsics.m88391r("livingUser");
            nsvVar4 = null;
        }
        coj cojVarM111661c = coj.m111661c(new h64(str, str2, l6o0.m153068c(nsvVar4).f130275b.avatar), p54.m170591a());
        nsv<User> nsvVar5 = this.livingUser;
        if (nsvVar5 == null) {
            Intrinsics.m88391r("livingUser");
            nsvVar5 = null;
        }
        cojVarM111661c.f82885a = l6o0.m153068c(nsvVar5).f130276c;
        nsv<User> nsvVar6 = this.livingUser;
        if (nsvVar6 == null) {
            Intrinsics.m88391r("livingUser");
        } else {
            nsvVar = nsvVar6;
        }
        cojVarM111661c.f82886b = l6o0.m153068c(nsvVar).f130275b;
        uoe0 uoe0Var = hne0VarM136086w.f110732a;
        uoe0Var.f180066n = "voiceLiveConfessDetail";
        uoe0Var.f180065m = new cqj.C16337a().m111927h(cojVarM111661c).m111923d();
        m213811F2().SendGiftEventGroup.sendGift().mo199273j(hne0VarM136086w);
        ev5 ev5Var = (ev5) this.viewModel;
        if (ev5Var != null) {
            ev5Var.m122764J();
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m164862i4() {
        if (zrv.f205799a.m207631D0().equals(this.receiveId)) {
            o1j0.m165649w(R$string.f48249n2);
            return;
        }
        if (!this.isHasMatched) {
            m164861h4();
            return;
        }
        Act act = act();
        act.getClass();
        new nu5(this, act).m164763f0(new C18957a());
        ev5 ev5Var = (ev5) this.viewModel;
        if (ev5Var != null) {
            ev5Var.m122764J();
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().ConfessGiftEvent.showConfessGiftDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.fv5
            @Override // p153l.y20
            public final void call(Object obj) {
                nv5.m164849V3(this.f100986a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public final void m164855d4(Throwable throwable) {
    }

    /* JADX INFO: renamed from: c4 */
    public final void m164857c4(int reason) {
    }

    /* JADX INFO: renamed from: e4 */
    public final void m164858e4(BLiveGivenGiftBrief giftBrief) {
    }

    /* JADX INFO: renamed from: l.nv5$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m88121d2 = {"l/nv5$a", "Ll/nu5$a;", "", "b", "()V", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18957a implements nu5.InterfaceC18951a {
        public C18957a() {
        }

        @Override // p153l.nu5.InterfaceC18951a
        /* JADX INFO: renamed from: b */
        public void mo100363b() {
            nv5.this.m164861h4();
        }

        @Override // p153l.nu5.InterfaceC18951a
        /* JADX INFO: renamed from: a */
        public void mo100362a() {
        }
    }
}
