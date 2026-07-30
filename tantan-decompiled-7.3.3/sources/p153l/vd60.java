package p153l;

import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftNamingCardInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u0012\u001a\u00020\u00102\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\u00102\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0013JL\u0010\u0015\u001a\u00020\u00102\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JL\u0010\u001a\u001a\u00020\u00102\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0013JL\u0010\u001b\u001a\u00020\u00102\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u0013¨\u0006\u001c"}, m88121d2 = {"Ll/vd60;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;)Z", "Ll/y8s;", "presenter", "Lkotlin/Function1;", "Ll/stj;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "interceptorWrapperData", "", "sendGiftAction", "m", "(Ll/y8s;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Lkotlin/jvm/functions/Function1;)V", RXScreenCaptureService.KEY_INDEX, "j", "", "throwable", "k", "(Ljava/lang/Throwable;)V", "p", "n", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class vd60 {

    @NotNull
    public static final vd60 INSTANCE = new vd60();

    /* JADX INFO: renamed from: l.vd60$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/vd60$a", "Ll/xke$c;", "", "inputText", "", "a", "(Ljava/lang/CharSequence;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C20814a implements xke.InterfaceC21362c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveGiftItem f183542a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1<stj, Unit> f183543b;

        /* JADX WARN: Multi-variable type inference failed */
        public C20814a(BLiveGiftItem bLiveGiftItem, Function1<? super stj, Unit> function1) {
            this.f183542a = bLiveGiftItem;
            this.f183543b = function1;
        }

        @Override // p153l.xke.InterfaceC21362c
        /* JADX INFO: renamed from: a */
        public void mo177959a(CharSequence inputText) {
            inputText.getClass();
            muj.m160189c0(this.f183542a);
            Function1<stj, Unit> function1 = this.f183543b;
            stj stjVar = new stj();
            BLiveGiftNamingCardInfo bLiveGiftNamingCardInfoNew_ = BLiveGiftNamingCardInfo.new_();
            bLiveGiftNamingCardInfoNew_.namingText = inputText.toString();
            stjVar.m187871b(bLiveGiftNamingCardInfoNew_);
            function1.invoke(stjVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m200908a(BLiveGiftItem bLiveGiftItem, Throwable th) {
        muj.m160193e0(bLiveGiftItem, "unjailCard", "network failed");
        vd60 vd60Var = INSTANCE;
        th.getClass();
        vd60Var.m200922k(th);
    }

    /* JADX INFO: renamed from: b */
    public static void m200909b(y8s y8sVar, BLiveGiftItem bLiveGiftItem, Function1 function1, BLiveExtraResponse bLiveExtraResponse) {
        Meta meta = bLiveExtraResponse.meta;
        if (meta.code == 200) {
            INSTANCE.m200924n(y8sVar, bLiveGiftItem, function1);
            return;
        }
        muj.m160193e0(bLiveGiftItem, "namingCard", "meta code is not 200; meta message is " + meta.message);
        o1j0.m165651y(bLiveExtraResponse.meta.message);
    }

    /* JADX INFO: renamed from: e */
    public static void m200912e(y8s y8sVar, BLiveGiftItem bLiveGiftItem, Function1 function1, BLiveExtraResponse bLiveExtraResponse) {
        Meta meta = bLiveExtraResponse.meta;
        if (meta.code == 200) {
            INSTANCE.m200925p(y8sVar, bLiveGiftItem, function1);
            return;
        }
        muj.m160193e0(bLiveGiftItem, "unjailCard", "meta code is not 200; meta message is " + meta.message);
        o1j0.m165651y(bLiveExtraResponse.meta.message);
    }

    /* JADX INFO: renamed from: f */
    public static CharSequence m200913f(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        char[] charArray = charSequence.toString().toCharArray();
        charArray.getClass();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (!xau.m209902h(c) && !a9g0.m96575j(String.valueOf(c)) && !Character.isDigit(c)) {
                o1j0.m165634h(R$string.f48157ik);
                return sb;
            }
            sb.append(c);
        }
        return sb;
    }

    /* JADX INFO: renamed from: h */
    public static void m200915h(BLiveGiftItem bLiveGiftItem, Throwable th) {
        muj.m160193e0(bLiveGiftItem, "namingCard", "network failed");
        vd60 vd60Var = INSTANCE;
        th.getClass();
        vd60Var.m200922k(th);
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final boolean m200916l(@NotNull BLiveGiftItem giftItem) {
        giftItem.getClass();
        List<String> list = giftItem.labels;
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        return giftItem.labels.contains("namingCard") || giftItem.labels.contains("unjailCard");
    }

    /* JADX INFO: renamed from: o */
    public static final void m200917o(BLiveGiftItem bLiveGiftItem, View view) {
        muj.m160193e0(bLiveGiftItem, "namingCard", "NamingCardDialog show, and cancel button clicked");
    }

    /* JADX INFO: renamed from: q */
    public static final void m200918q(BLiveGiftItem bLiveGiftItem, View view) {
        muj.m160193e0(bLiveGiftItem, "unjailCard", "UnJailDialog show, and cancel button clicked");
    }

    /* JADX INFO: renamed from: r */
    public static final void m200919r(BLiveGiftItem bLiveGiftItem, Function1 function1, View view) {
        muj.m160195f0(bLiveGiftItem);
        function1.invoke(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX INFO: renamed from: i */
    public final void m200920i(final y8s<?, ?> presenter, final BLiveGiftItem giftItem, final Function1<? super stj, Unit> sendGiftAction) {
        presenter.duringCreated(aiv.m98113l0(presenter.m213810E2().m168532l0().f56859id, presenter.m213810E2().m202194o())).subscribe(dhw.m115826e(new y20() { // from class: l.pd60
            @Override // p153l.y20
            public final void call(Object obj) {
                vd60.m200909b(presenter, giftItem, sendGiftAction, (BLiveExtraResponse) obj);
            }
        }, new y20() { // from class: l.qd60
            @Override // p153l.y20
            public final void call(Object obj) {
                vd60.m200915h(giftItem, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX INFO: renamed from: j */
    public final void m200921j(final y8s<?, ?> presenter, final BLiveGiftItem giftItem, final Function1<? super stj, Unit> sendGiftAction) {
        presenter.duringCreated(aiv.m98116m0(presenter.m213810E2().m168532l0().f56859id, presenter.m213810E2().m202194o())).subscribe(dhw.m115826e(new y20() { // from class: l.nd60
            @Override // p153l.y20
            public final void call(Object obj) {
                vd60.m200912e(presenter, giftItem, sendGiftAction, (BLiveExtraResponse) obj);
            }
        }, new y20() { // from class: l.od60
            @Override // p153l.y20
            public final void call(Object obj) {
                vd60.m200908a(giftItem, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final void m200922k(Throwable throwable) {
        if (throwable instanceof TantanException.Client.CoreService) {
            o1j0.m165651y(((TantanException.Client.CoreService) throwable).metaMessage);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m200923m(@NotNull y8s<?, ?> presenter, @NotNull BLiveGiftItem giftItem, @NotNull Function1<? super stj, Unit> sendGiftAction) {
        presenter.getClass();
        giftItem.getClass();
        sendGiftAction.getClass();
        if (giftItem.labels.contains("namingCard")) {
            muj.m160191d0(giftItem, "namingCard");
            m200920i(presenter, giftItem, sendGiftAction);
        } else if (giftItem.labels.contains("unjailCard")) {
            muj.m160191d0(giftItem, "unjailCard");
            m200921j(presenter, giftItem, sendGiftAction);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m200924n(y8s<?, ?> presenter, final BLiveGiftItem giftItem, Function1<? super stj, Unit> sendGiftAction) {
        ArrayList<InputFilter> arrayListArrayListOf = CollectionsKt.arrayListOf(new InputFilter() { // from class: l.rd60
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return vd60.m200913f(charSequence, i, i2, spanned, i3, i4);
            }
        });
        xke.Companion companion = xke.INSTANCE;
        Act act = presenter.act();
        act.getClass();
        xke.C21360a c21360a = new xke.C21360a(act);
        c21360a.m211372I(R$string.f48179jk);
        c21360a.m211366C(R$string.f48026ck);
        c21360a.m211397y(R$string.f47960Zj);
        c21360a.m211370G(R$string.f48136hk);
        c21360a.m211368E(3);
        String strM209910t = xau.m209910t(R$string.f48092fk);
        strM209910t.getClass();
        c21360a.m211367D(strM209910t);
        String strM209910t2 = xau.m209910t(R$string.f48114gk);
        strM209910t2.getClass();
        c21360a.m211369F(strM209910t2);
        c21360a.m211396x(new View.OnClickListener() { // from class: l.sd60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vd60.m200917o(giftItem, view);
            }
        });
        c21360a.m211365B(new C20814a(giftItem, sendGiftAction));
        c21360a.m211371H(arrayListArrayListOf);
        c21360a.m211395w(true);
        c21360a.m211398z(false);
        c21360a.m211364A(true);
        c21360a.m211373a().m211363f();
        muj.m160197g0(giftItem, "namingCard", "NamingCardDialog will be show");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX INFO: renamed from: p */
    public final void m200925p(y8s<?, ?> presenter, final BLiveGiftItem giftItem, final Function1<? super stj, Unit> sendGiftAction) {
        th0.C20312a c20312a = new th0.C20312a(presenter.act());
        c20312a.m191160s(xau.m209910t(R$string.f48223lk));
        c20312a.m191151j(xau.m209911u(R$string.f48201kk, presenter.m213810E2().m168532l0().name));
        c20312a.m191158q(R$string.f48026ck);
        c20312a.m191146e(R$string.f47960Zj);
        c20312a.m191144c(new View.OnClickListener() { // from class: l.td60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vd60.m200918q(giftItem, view);
            }
        });
        c20312a.m191156o(new View.OnClickListener() { // from class: l.ud60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vd60.m200919r(giftItem, sendGiftAction, view);
            }
        });
        c20312a.m191143b(true);
        c20312a.m191148g(false);
        c20312a.m191149h(false);
        c20312a.m191142a().m191141g();
        muj.m160197g0(giftItem, "unjailCard", "UnJailDialog will be show");
    }
}
