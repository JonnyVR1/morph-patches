package p153l;

import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.base.data.BLiveUnJailAnchorInfo;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ%\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, m88121d2 = {"Ll/qtj0;", "Ll/qct;", "Ll/oo2;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", "throwable", "", "b4", "(Ljava/lang/Throwable;)V", Constants.KEY_T, "()V", "g4", "", "anchorId", "Lkotlin/Function0;", "alertAction", "Z3", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveUnJailAnchorInfo;", "unJailAnchorInfo", "f4", "(Lcom/p1/mobile/putong/live/base/data/BLiveUnJailAnchorInfo;)V", "a4", "(Lcom/p1/mobile/putong/live/base/data/BLiveUnJailAnchorInfo;Lkotlin/jvm/functions/Function0;)V", "c4", "e4", "Ll/hne0;", "Y3", "()Ll/hne0;", "Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "bLiveGivenGiftBrief", "d4", "(Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;)V", RXScreenCaptureService.KEY_INDEX, "Ljava/lang/String;", "giftId", "j", "receiverId", "Ll/xke;", "k", "Ll/xke;", "inputEditAlert", "Ll/vtj0;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/vtj0;", "confirmDialog", "Companion", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class qtj0 extends qct<oo2> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public String giftId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public String receiverId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public xke inputEditAlert;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public vtj0 confirmDialog;

    /* JADX INFO: renamed from: l.qtj0$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m88121d2 = {"l/qtj0$b", "Ll/vtj0$a;", "", "a", "()V", "b", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19654b implements vtj0.InterfaceC20932a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveUnJailAnchorInfo f159452b;

        public C19654b(BLiveUnJailAnchorInfo bLiveUnJailAnchorInfo) {
            this.f159452b = bLiveUnJailAnchorInfo;
        }

        /* JADX INFO: renamed from: c */
        public static Unit m177955c(qtj0 qtj0Var) {
            vtj0 vtj0Var = qtj0Var.confirmDialog;
            if (vtj0Var == null) {
                Intrinsics.m88391r("confirmDialog");
                vtj0Var = null;
            }
            vtj0Var.m202685c();
            return Unit.INSTANCE;
        }

        @Override // p153l.vtj0.InterfaceC20932a
        /* JADX INFO: renamed from: a */
        public void mo177956a() {
            final qtj0 qtj0Var = qtj0.this;
            qtj0Var.m177949a4(this.f159452b, new Function0() { // from class: l.rtj0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qtj0.C19654b.m177955c(qtj0Var);
                }
            });
        }

        @Override // p153l.vtj0.InterfaceC20932a
        /* JADX INFO: renamed from: b */
        public void mo177957b() {
            vtj0 vtj0Var = qtj0.this.confirmDialog;
            if (vtj0Var == null) {
                Intrinsics.m88391r("confirmDialog");
                vtj0Var = null;
            }
            vtj0Var.m202685c();
            qtj0.this.m177954g4();
        }
    }

    /* JADX INFO: renamed from: l.qtj0$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/qtj0$c", "Ll/xke$c;", "", "inputText", "", "a", "(Ljava/lang/CharSequence;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19655c implements xke.InterfaceC21362c {
        public C19655c() {
        }

        /* JADX INFO: renamed from: b */
        public static Unit m177958b(qtj0 qtj0Var) {
            xke xkeVar = qtj0Var.inputEditAlert;
            if (xkeVar == null) {
                Intrinsics.m88391r("inputEditAlert");
                xkeVar = null;
            }
            xkeVar.m211361d();
            return Unit.INSTANCE;
        }

        @Override // p153l.xke.InterfaceC21362c
        /* JADX INFO: renamed from: a */
        public void mo177959a(CharSequence inputText) {
            inputText.getClass();
            qtj0 qtj0Var = qtj0.this;
            String string = inputText.toString();
            final qtj0 qtj0Var2 = qtj0.this;
            qtj0Var.m177948Z3(string, new Function0() { // from class: l.stj0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return qtj0.C19655c.m177958b(qtj0Var2);
                }
            });
        }
    }

    public qtj0(@Nullable dum<?> dumVar) {
        super(dumVar);
        this.receiverId = "";
    }

    /* JADX INFO: renamed from: J3 */
    public static void m177931J3(Integer num) {
    }

    /* JADX INFO: renamed from: K3 */
    public static void m177932K3(Function0 function0, qtj0 qtj0Var, BLiveExtraResponse bLiveExtraResponse) {
        BLiveUnJailAnchorInfo bLiveUnJailAnchorInfo;
        Meta meta = bLiveExtraResponse.meta;
        if (meta.code != 200) {
            o1j0.m165651y(meta.message);
            return;
        }
        function0.invoke();
        BLiveExtraData bLiveExtraData = bLiveExtraResponse.data;
        if (bLiveExtraData == null || (bLiveUnJailAnchorInfo = bLiveExtraData.anchorInfo) == null) {
            return;
        }
        qtj0Var.m177953f4(bLiveUnJailAnchorInfo);
    }

    /* JADX INFO: renamed from: L3 */
    public static void m177933L3(qtj0 qtj0Var, Throwable th) {
        wd60.INSTANCE.m205846c(th.getMessage());
        qtj0Var.m177950c4(th);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m177934M3(Throwable th) {
        o1j0.m165651y(th.getMessage());
    }

    /* JADX INFO: renamed from: N3 */
    public static void m177935N3(qtj0 qtj0Var, BLiveUnJailAnchorInfo bLiveUnJailAnchorInfo, Function0 function0, BLiveExtraResponse bLiveExtraResponse) {
        Meta meta = bLiveExtraResponse.meta;
        if (meta.code != 200) {
            wd60.INSTANCE.m205846c(meta.message);
            o1j0.m165651y(bLiveExtraResponse.meta.message);
        } else {
            qtj0Var.receiverId = String.valueOf(bLiveUnJailAnchorInfo.f45311id);
            function0.invoke();
            qtj0Var.m177952e4(bLiveUnJailAnchorInfo);
        }
    }

    /* JADX INFO: renamed from: P3 */
    public static void m177937P3(qtj0 qtj0Var, String str) {
        str.getClass();
        qtj0Var.giftId = str;
        qtj0Var.m177954g4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public final void m177945b4(Throwable throwable) {
        wd60.INSTANCE.m205844a(this.receiverId, throwable.getMessage());
    }

    /* JADX INFO: renamed from: Y3 */
    public final hne0 m177947Y3() {
        hiv hivVar = (hiv) zrv.m221194l(htd0.f111521c);
        String str = this.giftId;
        if (str == null) {
            Intrinsics.m88391r("giftId");
            str = null;
        }
        hne0 hne0VarM136086w = new hne0.C17513a().m136086w(hivVar.m135161m(str), new y20() { // from class: l.jtj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122599a.m177951d4((BLiveGivenGiftBrief) obj);
            }
        }, new y20() { // from class: l.ktj0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128710a.m177945b4((Throwable) obj);
            }
        }, new y20() { // from class: l.ltj0
            @Override // p153l.y20
            public final void call(Object obj) {
                qtj0.m177931J3((Integer) obj);
            }
        }, false, 1, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.PacketUnJail)));
        hne0VarM136086w.getClass();
        return hne0VarM136086w;
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m177948Z3(String anchorId, final Function0<Unit> alertAction) {
        duringCreated(aiv.m98110k0(anchorId)).subscribe(dhw.m115826e(new y20() { // from class: l.otj0
            @Override // p153l.y20
            public final void call(Object obj) {
                qtj0.m177932K3(alertAction, this, (BLiveExtraResponse) obj);
            }
        }, new y20() { // from class: l.ptj0
            @Override // p153l.y20
            public final void call(Object obj) {
                qtj0.m177934M3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public final void m177949a4(final BLiveUnJailAnchorInfo unJailAnchorInfo, final Function0<Unit> alertAction) {
        duringCreated(aiv.m98116m0(String.valueOf(unJailAnchorInfo.f45311id), unJailAnchorInfo.roomId)).subscribe(dhw.m115826e(new y20() { // from class: l.htj0
            @Override // p153l.y20
            public final void call(Object obj) {
                qtj0.m177935N3(this.f111555a, unJailAnchorInfo, alertAction, (BLiveExtraResponse) obj);
            }
        }, new y20() { // from class: l.itj0
            @Override // p153l.y20
            public final void call(Object obj) {
                qtj0.m177933L3(this.f116849a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public final void m177950c4(Throwable throwable) {
        if (throwable instanceof TantanException.Client.CoreService) {
            o1j0.m165651y(((TantanException.Client.CoreService) throwable).metaMessage);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final void m177951d4(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        wd60.INSTANCE.m205845b(this.receiverId);
    }

    /* JADX INFO: renamed from: e4 */
    public final void m177952e4(BLiveUnJailAnchorInfo unJailAnchorInfo) {
        hne0 hne0VarM177947Y3 = m177947Y3();
        uoe0 uoe0Var = hne0VarM177947Y3.f110732a;
        uoe0Var.f180054b = unJailAnchorInfo.roomId;
        uoe0Var.f180053a = unJailAnchorInfo.liveId;
        uoe0Var.f180067o = String.valueOf(unJailAnchorInfo.f45311id);
        m213811F2().SendGiftEventGroup.sendGift().mo199273j(hne0VarM177947Y3);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m177953f4(BLiveUnJailAnchorInfo unJailAnchorInfo) {
        Act act = this.f196919f;
        act.getClass();
        String str = unJailAnchorInfo.name;
        str.getClass();
        vtj0 vtj0Var = new vtj0(act, str, new C19654b(unJailAnchorInfo));
        this.confirmDialog = vtj0Var;
        vtj0Var.m202687g();
    }

    /* JADX INFO: renamed from: g4 */
    public final void m177954g4() {
        xke.Companion companion = xke.INSTANCE;
        Act act = this.f196919f;
        act.getClass();
        xke.C21360a c21360a = new xke.C21360a(act);
        c21360a.m211372I(R$string.f48223lk);
        c21360a.m211366C(R$string.f47982ak);
        c21360a.m211397y(R$string.f47960Zj);
        c21360a.m211370G(R$string.f48004bk);
        String strM209910t = xau.m209910t(R$string.f48004bk);
        strM209910t.getClass();
        c21360a.m211369F(strM209910t);
        c21360a.m211396x(new View.OnClickListener() { // from class: l.ntj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qtj0.m177946h4(view);
            }
        });
        c21360a.m211365B(new C19655c());
        c21360a.m211395w(false);
        c21360a.m211398z(false);
        c21360a.m211364A(true);
        xke xkeVarM211373a = c21360a.m211373a();
        this.inputEditAlert = xkeVarM211373a;
        if (xkeVarM211373a == null) {
            Intrinsics.m88391r("inputEditAlert");
            xkeVarM211373a = null;
        }
        xkeVarM211373a.m211363f();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().UnJailCardEvent.showUnJailCardInputDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.mtj0
            @Override // p153l.y20
            public final void call(Object obj) {
                qtj0.m177937P3(this.f138634a, (String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m177946h4(View view) {
    }
}
