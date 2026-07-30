package p002l;

import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.Meta;
import com.p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGiftNamingCardInfo;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import l.e30;
import l.ffw;
import l.lsi0;
import l.t0g0;
import l.tje;
import l.w8u;
import l.xh0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u0012\u001a\u00020\u00102\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\u00102\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0013JL\u0010\u0015\u001a\u00020\u00102\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JL\u0010\u001a\u001a\u00020\u00102\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0013JL\u0010\u001b\u001a\u00020\u00102\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u0013¨\u0006\u001c"}, d2 = {"Ll/p560;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "", "l", "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;)Z", "Ll/x6s;", "presenter", "Lkotlin/Function1;", "Ll/crj;", "Lkotlin/ParameterName;", "name", "interceptorWrapperData", "", "sendGiftAction", "m", "(Ll/x6s;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Lkotlin/jvm/functions/Function1;)V", "i", "j", "", "throwable", "k", "(Ljava/lang/Throwable;)V", "p", "n", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class p560 {

    @NotNull
    public static final p560 INSTANCE = new p560();

    /* JADX INFO: renamed from: l.p560$a */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/p560$a", "Ll/tje$c;", "", "inputText", "", "a", "(Ljava/lang/CharSequence;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class C0740a implements tje.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveGiftItem f17008a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1<crj, Unit> f17009b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0740a(BLiveGiftItem bLiveGiftItem, Function1<? super crj, Unit> function1) {
            this.f17008a = bLiveGiftItem;
            this.f17009b = function1;
        }

        /* JADX INFO: renamed from: a */
        public void m20048a(CharSequence inputText) {
            inputText.getClass();
            wrj.m25397c0(this.f17008a);
            Function1<crj, Unit> function1 = this.f17009b;
            crj crjVar = new crj();
            BLiveGiftNamingCardInfo bLiveGiftNamingCardInfoNew_ = BLiveGiftNamingCardInfo.new_();
            bLiveGiftNamingCardInfoNew_.namingText = inputText.toString();
            crjVar.m11344b(bLiveGiftNamingCardInfoNew_);
            function1.invoke(crjVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m20030a(BLiveGiftItem bLiveGiftItem, Throwable th) {
        wrj.m25401e0(bLiveGiftItem, "unjailCard", "network failed");
        p560 p560Var = INSTANCE;
        th.getClass();
        p560Var.m20044k(th);
    }

    /* JADX INFO: renamed from: b */
    public static void m20031b(x6s x6sVar, BLiveGiftItem bLiveGiftItem, Function1 function1, BLiveExtraResponse bLiveExtraResponse) {
        Meta meta = bLiveExtraResponse.meta;
        if (meta.code == 200) {
            INSTANCE.m20046n(x6sVar, bLiveGiftItem, function1);
            return;
        }
        wrj.m25401e0(bLiveGiftItem, "namingCard", "meta code is not 200; meta message is " + meta.message);
        lsi0.y(bLiveExtraResponse.meta.message);
    }

    /* JADX INFO: renamed from: e */
    public static void m20034e(x6s x6sVar, BLiveGiftItem bLiveGiftItem, Function1 function1, BLiveExtraResponse bLiveExtraResponse) {
        Meta meta = bLiveExtraResponse.meta;
        if (meta.code == 200) {
            INSTANCE.m20047p(x6sVar, bLiveGiftItem, function1);
            return;
        }
        wrj.m25401e0(bLiveGiftItem, "unjailCard", "meta code is not 200; meta message is " + meta.message);
        lsi0.y(bLiveExtraResponse.meta.message);
    }

    /* JADX INFO: renamed from: f */
    public static CharSequence m20035f(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        char[] charArray = charSequence.toString().toCharArray();
        charArray.getClass();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (!w8u.h(c) && !t0g0.j(String.valueOf(c)) && !Character.isDigit(c)) {
                lsi0.h(R$string.f3351ik);
                return sb;
            }
            sb.append(c);
        }
        return sb;
    }

    /* JADX INFO: renamed from: h */
    public static void m20037h(BLiveGiftItem bLiveGiftItem, Throwable th) {
        wrj.m25401e0(bLiveGiftItem, "namingCard", "network failed");
        p560 p560Var = INSTANCE;
        th.getClass();
        p560Var.m20044k(th);
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final boolean m20038l(@NotNull BLiveGiftItem giftItem) {
        giftItem.getClass();
        List list = giftItem.labels;
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        return giftItem.labels.contains("namingCard") || giftItem.labels.contains("unjailCard");
    }

    /* JADX INFO: renamed from: o */
    public static final void m20039o(BLiveGiftItem bLiveGiftItem, View view) {
        wrj.m25401e0(bLiveGiftItem, "namingCard", "NamingCardDialog show, and cancel button clicked");
    }

    /* JADX INFO: renamed from: q */
    public static final void m20040q(BLiveGiftItem bLiveGiftItem, View view) {
        wrj.m25401e0(bLiveGiftItem, "unjailCard", "UnJailDialog show, and cancel button clicked");
    }

    /* JADX INFO: renamed from: r */
    public static final void m20041r(BLiveGiftItem bLiveGiftItem, Function1 function1, View view) {
        wrj.m25403f0(bLiveGiftItem);
        function1.invoke((Object) null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: i */
    public final void m20042i(final x6s<?, ?> presenter, final BLiveGiftItem giftItem, final Function1<? super crj, Unit> sendGiftAction) {
        presenter.duringCreated(zfv.m27282l0(((DbObject) presenter.m25547E2().m14582l0()).id, presenter.m25547E2().m17239o())).subscribe(ffw.e(new e30() { // from class: l.j560
            public final void call(Object obj) {
                p560.m20031b(presenter, giftItem, sendGiftAction, (BLiveExtraResponse) obj);
            }
        }, new e30() { // from class: l.k560
            public final void call(Object obj) {
                p560.m20037h(giftItem, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: j */
    public final void m20043j(final x6s<?, ?> presenter, final BLiveGiftItem giftItem, final Function1<? super crj, Unit> sendGiftAction) {
        presenter.duringCreated(zfv.m27285m0(((DbObject) presenter.m25547E2().m14582l0()).id, presenter.m25547E2().m17239o())).subscribe(ffw.e(new e30() { // from class: l.h560
            public final void call(Object obj) {
                p560.m20034e(presenter, giftItem, sendGiftAction, (BLiveExtraResponse) obj);
            }
        }, new e30() { // from class: l.i560
            public final void call(Object obj) {
                p560.m20030a(giftItem, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final void m20044k(Throwable throwable) {
        if (throwable instanceof TantanException.Client.CoreService) {
            lsi0.y(((TantanException.Client.CoreService) throwable).metaMessage);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m20045m(@NotNull x6s<?, ?> presenter, @NotNull BLiveGiftItem giftItem, @NotNull Function1<? super crj, Unit> sendGiftAction) {
        presenter.getClass();
        giftItem.getClass();
        sendGiftAction.getClass();
        if (giftItem.labels.contains("namingCard")) {
            wrj.m25399d0(giftItem, "namingCard");
            m20042i(presenter, giftItem, sendGiftAction);
        } else if (giftItem.labels.contains("unjailCard")) {
            wrj.m25399d0(giftItem, "unjailCard");
            m20043j(presenter, giftItem, sendGiftAction);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m20046n(x6s<?, ?> presenter, final BLiveGiftItem giftItem, Function1<? super crj, Unit> sendGiftAction) {
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(new InputFilter[]{new InputFilter() { // from class: l.l560
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return p560.m20035f(charSequence, i, i2, spanned, i3, i4);
            }
        }});
        tje.b bVar = tje.Companion;
        Act act = presenter.act();
        act.getClass();
        tje.a aVar = new tje.a(act);
        aVar.I(R$string.f3373jk);
        aVar.C(R$string.f3220ck);
        aVar.y(R$string.f3154Zj);
        aVar.G(R$string.f3330hk);
        aVar.E(3);
        String strT = w8u.t(R$string.f3286fk);
        strT.getClass();
        aVar.D(strT);
        String strT2 = w8u.t(R$string.f3308gk);
        strT2.getClass();
        aVar.F(strT2);
        aVar.x(new View.OnClickListener() { // from class: l.m560
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p560.m20039o(giftItem, view);
            }
        });
        aVar.B(new C0740a(giftItem, sendGiftAction));
        aVar.H(arrayListArrayListOf);
        aVar.w(true);
        aVar.z(false);
        aVar.A(true);
        aVar.a().f();
        wrj.m25405g0(giftItem, "namingCard", "NamingCardDialog will be show");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: p */
    public final void m20047p(x6s<?, ?> presenter, final BLiveGiftItem giftItem, final Function1<? super crj, Unit> sendGiftAction) {
        xh0.a aVar = new xh0.a(presenter.act());
        aVar.s(w8u.t(R$string.f3417lk));
        aVar.j(w8u.u(R$string.f3395kk, presenter.m25547E2().m14582l0().name));
        aVar.q(R$string.f3220ck);
        aVar.e(R$string.f3154Zj);
        aVar.c(new View.OnClickListener() { // from class: l.n560
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p560.m20040q(giftItem, view);
            }
        });
        aVar.o(new View.OnClickListener() { // from class: l.o560
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p560.m20041r(giftItem, sendGiftAction, view);
            }
        });
        aVar.b(true);
        aVar.g(false);
        aVar.h(false);
        aVar.a().g();
        wrj.m25405g0(giftItem, "unjailCard", "UnJailDialog will be show");
    }
}
