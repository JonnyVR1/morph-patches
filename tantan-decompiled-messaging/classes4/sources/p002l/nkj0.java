package p002l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.Meta;
import com.p1.mobile.putong.live.base.data.BLiveExtraData;
import com.p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p1.mobile.putong.live.base.data.BLiveUnJailAnchorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.lsi0;
import l.tje;
import l.w8u;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ%\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, d2 = {"Ll/nkj0;", "Ll/pat;", "Ll/ho2;", "Ll/bsm;", "info", "<init>", "(Ll/bsm;)V", "", "throwable", "", "b4", "(Ljava/lang/Throwable;)V", "t", "()V", "g4", "", "anchorId", "Lkotlin/Function0;", "alertAction", "Z3", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveUnJailAnchorInfo;", "unJailAnchorInfo", "f4", "(Lcom/p1/mobile/putong/live/base/data/BLiveUnJailAnchorInfo;)V", "a4", "(Lcom/p1/mobile/putong/live/base/data/BLiveUnJailAnchorInfo;Lkotlin/jvm/functions/Function0;)V", "c4", "e4", "Ll/cfe0;", "Y3", "()Ll/cfe0;", "Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;", "bLiveGivenGiftBrief", "d4", "(Lcom/p1/mobile/putong/live/base/data/BLiveGivenGiftBrief;)V", "i", "Ljava/lang/String;", "giftId", "j", "receiverId", "Ll/tje;", "k", "Ll/tje;", "inputEditAlert", "Ll/skj0;", "l", "Ll/skj0;", "confirmDialog", "Companion", "a", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class nkj0 extends pat<ho2> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public String giftId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public String receiverId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public tje inputEditAlert;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public skj0 confirmDialog;

    /* JADX INFO: renamed from: l.nkj0$b */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"l/nkj0$b", "Ll/skj0$a;", "", "a", "()V", "b", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0705b implements skj0.InterfaceC0819a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveUnJailAnchorInfo f16087b;

        public C0705b(BLiveUnJailAnchorInfo bLiveUnJailAnchorInfo) {
            this.f16087b = bLiveUnJailAnchorInfo;
        }

        /* JADX INFO: renamed from: c */
        public static Unit m18856c(nkj0 nkj0Var) {
            skj0 skj0Var = nkj0Var.confirmDialog;
            if (skj0Var == null) {
                Intrinsics.r("confirmDialog");
                skj0Var = null;
            }
            skj0Var.m22515c();
            return Unit.INSTANCE;
        }

        @Override // p002l.skj0.InterfaceC0819a
        /* JADX INFO: renamed from: a */
        public void mo18857a() {
            final nkj0 nkj0Var = nkj0.this;
            nkj0Var.m18849a4(this.f16087b, new Function0() { // from class: l.okj0
                public final Object invoke() {
                    return nkj0.C0705b.m18856c(nkj0Var);
                }
            });
        }

        @Override // p002l.skj0.InterfaceC0819a
        /* JADX INFO: renamed from: b */
        public void mo18858b() {
            skj0 skj0Var = nkj0.this.confirmDialog;
            if (skj0Var == null) {
                Intrinsics.r("confirmDialog");
                skj0Var = null;
            }
            skj0Var.m22515c();
            nkj0.this.m18854g4();
        }
    }

    /* JADX INFO: renamed from: l.nkj0$c */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/nkj0$c", "Ll/tje$c;", "", "inputText", "", "a", "(Ljava/lang/CharSequence;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0706c implements tje.c {
        public C0706c() {
        }

        /* JADX INFO: renamed from: b */
        public static Unit m18859b(nkj0 nkj0Var) {
            tje tjeVar = nkj0Var.inputEditAlert;
            if (tjeVar == null) {
                Intrinsics.r("inputEditAlert");
                tjeVar = null;
            }
            tjeVar.d();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: a */
        public void m18860a(CharSequence inputText) {
            inputText.getClass();
            nkj0 nkj0Var = nkj0.this;
            String string = inputText.toString();
            final nkj0 nkj0Var2 = nkj0.this;
            nkj0Var.m18848Z3(string, new Function0() { // from class: l.pkj0
                public final Object invoke() {
                    return nkj0.C0706c.m18859b(nkj0Var2);
                }
            });
        }
    }

    public nkj0(@Nullable bsm<?> bsmVar) {
        super(bsmVar);
        this.receiverId = "";
    }

    /* JADX INFO: renamed from: J3 */
    public static void m18831J3(Integer num) {
    }

    /* JADX INFO: renamed from: K3 */
    public static void m18832K3(Function0 function0, nkj0 nkj0Var, BLiveExtraResponse bLiveExtraResponse) {
        BLiveUnJailAnchorInfo bLiveUnJailAnchorInfo;
        Meta meta = bLiveExtraResponse.meta;
        if (meta.code != 200) {
            lsi0.y(meta.message);
            return;
        }
        function0.invoke();
        BLiveExtraData bLiveExtraData = bLiveExtraResponse.data;
        if (bLiveExtraData == null || (bLiveUnJailAnchorInfo = bLiveExtraData.anchorInfo) == null) {
            return;
        }
        nkj0Var.m18853f4(bLiveUnJailAnchorInfo);
    }

    /* JADX INFO: renamed from: L3 */
    public static void m18833L3(nkj0 nkj0Var, Throwable th) {
        q560.INSTANCE.m21025c(th.getMessage());
        nkj0Var.m18850c4(th);
    }

    /* JADX INFO: renamed from: M3 */
    public static void m18834M3(Throwable th) {
        lsi0.y(th.getMessage());
    }

    /* JADX INFO: renamed from: N3 */
    public static void m18835N3(nkj0 nkj0Var, BLiveUnJailAnchorInfo bLiveUnJailAnchorInfo, Function0 function0, BLiveExtraResponse bLiveExtraResponse) {
        Meta meta = bLiveExtraResponse.meta;
        if (meta.code != 200) {
            q560.INSTANCE.m21025c(meta.message);
            lsi0.y(bLiveExtraResponse.meta.message);
        } else {
            nkj0Var.receiverId = String.valueOf(bLiveUnJailAnchorInfo.id);
            function0.invoke();
            nkj0Var.m18852e4(bLiveUnJailAnchorInfo);
        }
    }

    /* JADX INFO: renamed from: P3 */
    public static void m18837P3(nkj0 nkj0Var, String str) {
        str.getClass();
        nkj0Var.giftId = str;
        nkj0Var.m18854g4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public final void m18845b4(Throwable throwable) {
        q560.INSTANCE.m21023a(this.receiverId, throwable.getMessage());
    }

    /* JADX INFO: renamed from: Y3 */
    public final cfe0 m18847Y3() {
        ggv ggvVar = (ggv) ypv.l(fld0.c);
        String str = this.giftId;
        if (str == null) {
            Intrinsics.r("giftId");
            str = null;
        }
        cfe0 cfe0VarM10985w = new cfe0.C0512a().m10985w(ggvVar.m(str), new e30() { // from class: l.gkj0
            public final void call(Object obj) {
                this.f11486a.m18851d4((BLiveGivenGiftBrief) obj);
            }
        }, new e30() { // from class: l.hkj0
            public final void call(Object obj) {
                this.f12095a.m18845b4((Throwable) obj);
            }
        }, new e30() { // from class: l.ikj0
            public final void call(Object obj) {
                nkj0.m18831J3((Integer) obj);
            }
        }, false, 1, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("PacketUnJail")));
        cfe0VarM10985w.getClass();
        return cfe0VarM10985w;
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m18848Z3(String anchorId, final Function0<Unit> alertAction) {
        duringCreated(zfv.m27279k0(anchorId)).subscribe(ffw.e(new e30() { // from class: l.lkj0
            public final void call(Object obj) {
                nkj0.m18832K3(alertAction, this, (BLiveExtraResponse) obj);
            }
        }, new e30() { // from class: l.mkj0
            public final void call(Object obj) {
                nkj0.m18834M3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public final void m18849a4(final BLiveUnJailAnchorInfo unJailAnchorInfo, final Function0<Unit> alertAction) {
        duringCreated(zfv.m27285m0(String.valueOf(unJailAnchorInfo.id), unJailAnchorInfo.roomId)).subscribe(ffw.e(new e30() { // from class: l.ekj0
            public final void call(Object obj) {
                nkj0.m18835N3(this.f9839a, unJailAnchorInfo, alertAction, (BLiveExtraResponse) obj);
            }
        }, new e30() { // from class: l.fkj0
            public final void call(Object obj) {
                nkj0.m18833L3(this.f10439a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public final void m18850c4(Throwable throwable) {
        if (throwable instanceof TantanException.Client.CoreService) {
            lsi0.y(((TantanException.Client.CoreService) throwable).metaMessage);
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final void m18851d4(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        q560.INSTANCE.m21024b(this.receiverId);
    }

    /* JADX INFO: renamed from: e4 */
    public final void m18852e4(BLiveUnJailAnchorInfo unJailAnchorInfo) {
        cfe0 cfe0VarM18847Y3 = m18847Y3();
        pge0 pge0Var = cfe0VarM18847Y3.f8625a;
        pge0Var.f17277b = unJailAnchorInfo.roomId;
        pge0Var.f17276a = unJailAnchorInfo.liveId;
        pge0Var.f17290o = String.valueOf(unJailAnchorInfo.id);
        m25548F2().SendGiftEventGroup.sendGift().j(cfe0VarM18847Y3);
    }

    /* JADX INFO: renamed from: f4 */
    public final void m18853f4(BLiveUnJailAnchorInfo unJailAnchorInfo) {
        Act act = this.f22037f;
        act.getClass();
        String str = unJailAnchorInfo.name;
        str.getClass();
        skj0 skj0Var = new skj0(act, str, new C0705b(unJailAnchorInfo));
        this.confirmDialog = skj0Var;
        skj0Var.m22517g();
    }

    /* JADX INFO: renamed from: g4 */
    public final void m18854g4() {
        tje.b bVar = tje.Companion;
        Act act = this.f22037f;
        act.getClass();
        tje.a aVar = new tje.a(act);
        aVar.I(R$string.f3417lk);
        aVar.C(R$string.f3176ak);
        aVar.y(R$string.f3154Zj);
        aVar.G(R$string.f3198bk);
        String strT = w8u.t(R$string.f3198bk);
        strT.getClass();
        aVar.F(strT);
        aVar.x(new View.OnClickListener() { // from class: l.kkj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nkj0.m18846h4(view);
            }
        });
        aVar.B(new C0706c());
        aVar.w(false);
        aVar.z(false);
        aVar.A(true);
        tje tjeVarA = aVar.a();
        this.inputEditAlert = tjeVarA;
        if (tjeVarA == null) {
            Intrinsics.r("inputEditAlert");
            tjeVarA = null;
        }
        tjeVarA.f();
    }

    /* JADX INFO: renamed from: t */
    public void m18855t() {
        super.t();
        duringCreated((c) m25548F2().UnJailCardEvent.showUnJailCardInputDialog().g()).subscribe(ffw.h(new e30() { // from class: l.jkj0
            public final void call(Object obj) {
                nkj0.m18837P3(this.f13852a, (String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m18846h4(View view) {
    }
}
