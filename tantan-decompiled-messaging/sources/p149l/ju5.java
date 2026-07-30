package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m87232d2 = {"Ll/ju5;", "Ll/x6s;", "Ll/ho2;", "Ll/au5;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", "throwable", "", "d4", "(Ljava/lang/Throwable;)V", Constants.KEY_T, "()V", "i4", "f4", "g4", "b4", "h4", "Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "giftBrief", "e4", "(Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;)V", "", Reason.TYPE, "c4", "(I)V", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "j", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "Ll/mqv;", "Lcom/p1/mobile/putong/data/User;", "k", "Ll/mqv;", "livingUser", "", BLiveStormDanmakuGiftResourceType.f44444l, "Z", "isHasMatched", "", "m", "Ljava/lang/String;", "receiveId", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ju5 extends x6s<ho2, au5> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public BLiveGiftItem giftItem;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public mqv<User> livingUser;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public boolean isHasMatched;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public String receiveId;

    public ju5(@Nullable bsm<?> bsmVar) {
        super(bsmVar);
        this.receiveId = "";
    }

    /* JADX INFO: renamed from: S3 */
    public static void m143225S3(ju5 ju5Var, Throwable th) {
        th.getClass();
        ju5Var.m143235b4(th);
    }

    /* JADX INFO: renamed from: T3 */
    public static void m143226T3(ju5 ju5Var, Pair pair) {
        mqv<User> mqvVar = ((p1k0) pair.getFirst()).f146688c;
        mqvVar.getClass();
        ju5Var.livingUser = mqvVar;
        ju5Var.isHasMatched = ((BLiveExtraResponse) pair.getSecond()).data.confessionRelationship.isMatched;
        ju5Var.m143239g4();
    }

    /* JADX INFO: renamed from: V3 */
    public static void m143228V3(ju5 ju5Var, String str) {
        BLiveGiftItem bLiveGiftItemM126027m = ((ggv) ypv.m215673l(fld0.f98148c)).m126027m(str);
        if (bLiveGiftItemM126027m != null) {
            ju5Var.giftItem = bLiveGiftItemM126027m;
            ju5Var.m143238f4();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static Pair m143229W3(p1k0 p1k0Var, BLiveExtraResponse bLiveExtraResponse) {
        return new Pair(p1k0Var, bLiveExtraResponse);
    }

    /* JADX INFO: renamed from: Y3 */
    public static Pair m143231Y3(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: b4 */
    public final void m143235b4(Throwable throwable) {
        if (throwable instanceof TantanException.Client.CoreService) {
            lsi0.m151595y(((TantanException.Client.CoreService) throwable).metaMessage);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, l.ho2] */
    /* JADX INFO: renamed from: f4 */
    public final void m143238f4() {
        if (m206027E2() == 0) {
            return;
        }
        Object objM129297F3 = m129297F3(new iuj(701));
        objM129297F3.getClass();
        this.receiveId = (String) objM129297F3;
        a2k0 a2k0Var = new a2k0();
        String str = this.receiveId;
        ?? M206027E2 = m206027E2();
        M206027E2.getClass();
        String strM149814k = M206027E2.m149814k();
        ?? M206027E3 = m206027E2();
        M206027E3.getClass();
        String strM149818o = M206027E3.m149818o();
        ?? M206027E4 = m206027E2();
        M206027E4.getClass();
        C22306c<p1k0> c22306cM94618p = a2k0Var.m94618p(str, strM149814k, "audience", "audience", BLiveType.voiceLive, "voiceroom-live", strM149818o, M206027E4.mo132103W0());
        xt5 xt5Var = xt5.INSTANCE;
        String strM199309D0 = ypv.f199493a.m199309D0();
        strM199309D0.getClass();
        C22306c<BLiveExtraResponse> c22306cM210961d = xt5Var.m210961d(strM199309D0, this.receiveId);
        final Function2 function2 = new Function2() { // from class: l.cu5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ju5.m143229W3((p1k0) obj, (BLiveExtraResponse) obj2);
            }
        };
        duringCreated(C22306c.zip(c22306cM94618p, c22306cM210961d, new x9j() { // from class: l.du5
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return ju5.m143231Y3(function2, obj, obj2);
            }
        })).onBackpressureLatest().subscribe(ffw.m121194e(new e30() { // from class: l.eu5
            @Override // p149l.e30
            public final void call(Object obj) {
                ju5.m143226T3(this.f93216a, (Pair) obj);
            }
        }, new e30() { // from class: l.fu5
            @Override // p149l.e30
            public final void call(Object obj) {
                ju5.m143225S3(this.f99306a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public final void m143239g4() {
        if (this.viewModel == 0) {
            Act act = act();
            act.getClass();
            au5 au5Var = new au5(act, this);
            this.viewModel = au5Var;
            mo51532C(au5Var);
        }
        au5 au5Var2 = (au5) this.viewModel;
        mqv<User> mqvVar = this.livingUser;
        BLiveGiftItem bLiveGiftItem = null;
        if (mqvVar == null) {
            Intrinsics.m87502r("livingUser");
            mqvVar = null;
        }
        BLiveGiftItem bLiveGiftItem2 = this.giftItem;
        if (bLiveGiftItem2 == null) {
            Intrinsics.m87502r("giftItem");
        } else {
            bLiveGiftItem = bLiveGiftItem2;
        }
        au5Var2.m98958P(mqvVar, bLiveGiftItem);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m143240h4() {
        BLiveGiftItem bLiveGiftItem;
        BLiveGiftItem bLiveGiftItem2 = this.giftItem;
        mqv<User> mqvVar = null;
        if (bLiveGiftItem2 == null) {
            Intrinsics.m87502r("giftItem");
            bLiveGiftItem2 = null;
        }
        if (!hqe.m132447a(bLiveGiftItem2, true)) {
            lsi0.m151595y(w8u.m202217t(R$string.f47273h5));
            return;
        }
        cfe0.C16123a c16123a = new cfe0.C16123a();
        BLiveGiftItem bLiveGiftItem3 = this.giftItem;
        if (bLiveGiftItem3 == null) {
            Intrinsics.m87502r("giftItem");
            bLiveGiftItem = null;
        } else {
            bLiveGiftItem = bLiveGiftItem3;
        }
        cfe0 cfe0VarM106532w = c16123a.m106532w(bLiveGiftItem, new e30() { // from class: l.gu5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104377a.m143237e4((BLiveGivenGiftBrief) obj);
            }
        }, new e30() { // from class: l.hu5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109516a.m143234d4((Throwable) obj);
            }
        }, new e30() { // from class: l.iu5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114973a.m143236c4(((Integer) obj).intValue());
            }
        }, false, 1, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.Grabheadlines)));
        if (cfe0VarM106532w == null) {
            return;
        }
        mqv<User> mqvVar2 = this.livingUser;
        if (mqvVar2 == null) {
            Intrinsics.m87502r("livingUser");
            mqvVar2 = null;
        }
        String str = mqvVar2.f135304a.f56011id;
        mqv<User> mqvVar3 = this.livingUser;
        if (mqvVar3 == null) {
            Intrinsics.m87502r("livingUser");
            mqvVar3 = null;
        }
        String str2 = mqvVar3.f135304a.name;
        mqv<User> mqvVar4 = this.livingUser;
        if (mqvVar4 == null) {
            Intrinsics.m87502r("livingUser");
            mqvVar4 = null;
        }
        mlj mljVarM155154c = mlj.m155154c(new i54(str, str2, hxn0.m133350c(mqvVar4).f109896b.avatar), q44.m172921a());
        mqv<User> mqvVar5 = this.livingUser;
        if (mqvVar5 == null) {
            Intrinsics.m87502r("livingUser");
            mqvVar5 = null;
        }
        mljVarM155154c.f134440a = hxn0.m133350c(mqvVar5).f109897c;
        mqv<User> mqvVar6 = this.livingUser;
        if (mqvVar6 == null) {
            Intrinsics.m87502r("livingUser");
        } else {
            mqvVar = mqvVar6;
        }
        mljVarM155154c.f134441b = hxn0.m133350c(mqvVar).f109896b;
        pge0 pge0Var = cfe0VarM106532w.f80589a;
        pge0Var.f148665n = "voiceLiveConfessDetail";
        pge0Var.f148664m = new mnj.C18509a().m155527h(mljVarM155154c).m155523d();
        m206028F2().SendGiftEventGroup.sendGift().mo172463j(cfe0VarM106532w);
        au5 au5Var = (au5) this.viewModel;
        if (au5Var != null) {
            au5Var.m98953J();
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m143241i4() {
        if (ypv.f199493a.m199309D0().equals(this.receiveId)) {
            lsi0.m151593w(R$string.f47401n2);
            return;
        }
        if (!this.isHasMatched) {
            m143240h4();
            return;
        }
        Act act = act();
        act.getClass();
        new jt5(this, act).m143082f0(new C17862a());
        au5 au5Var = (au5) this.viewModel;
        if (au5Var != null) {
            au5Var.m98953J();
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().ConfessGiftEvent.showConfessGiftDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.bu5
            @Override // p149l.e30
            public final void call(Object obj) {
                ju5.m143228V3(this.f77282a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public final void m143234d4(Throwable throwable) {
    }

    /* JADX INFO: renamed from: c4 */
    public final void m143236c4(int reason) {
    }

    /* JADX INFO: renamed from: e4 */
    public final void m143237e4(BLiveGivenGiftBrief giftBrief) {
    }

    /* JADX INFO: renamed from: l.ju5$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m87232d2 = {"l/ju5$a", "Ll/jt5$a;", "", "b", "()V", "a", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C17862a implements jt5.InterfaceC17853a {
        public C17862a() {
        }

        @Override // p149l.jt5.InterfaceC17853a
        /* JADX INFO: renamed from: b */
        public void mo143085b() {
            ju5.this.m143240h4();
        }

        @Override // p149l.jt5.InterfaceC17853a
        /* JADX INFO: renamed from: a */
        public void mo143084a() {
        }
    }
}
