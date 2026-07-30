package p149l;

import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftNamingCardInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJJ\u0010\u0012\u001a\u00020\u00102\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\u00102\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0013JL\u0010\u0015\u001a\u00020\u00102\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JL\u0010\u001a\u001a\u00020\u00102\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u0013JL\u0010\u001b\u001a\u00020\u00102\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u0013¨\u0006\u001c"}, m87232d2 = {"Ll/p560;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "", BLiveStormDanmakuGiftResourceType.f44444l, "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;)Z", "Ll/x6s;", "presenter", "Lkotlin/Function1;", "Ll/crj;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "interceptorWrapperData", "", "sendGiftAction", "m", "(Ll/x6s;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Lkotlin/jvm/functions/Function1;)V", RXScreenCaptureService.KEY_INDEX, "j", "", "throwable", "k", "(Ljava/lang/Throwable;)V", "p", "n", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class p560 {

    @NotNull
    public static final p560 INSTANCE = new p560();

    /* JADX INFO: renamed from: l.p560$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/p560$a", "Ll/tje$c;", "", "inputText", "", "a", "(Ljava/lang/CharSequence;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C19132a implements tje.InterfaceC20189c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveGiftItem f147262a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1<crj, Unit> f147263b;

        /* JADX WARN: Multi-variable type inference failed */
        public C19132a(BLiveGiftItem bLiveGiftItem, Function1<? super crj, Unit> function1) {
            this.f147262a = bLiveGiftItem;
            this.f147263b = function1;
        }

        @Override // p149l.tje.InterfaceC20189c
        /* JADX INFO: renamed from: a */
        public void mo159949a(CharSequence inputText) {
            inputText.getClass();
            wrj.m205225c0(this.f147262a);
            Function1<crj, Unit> function1 = this.f147263b;
            crj crjVar = new crj();
            BLiveGiftNamingCardInfo bLiveGiftNamingCardInfoNew_ = BLiveGiftNamingCardInfo.new_();
            bLiveGiftNamingCardInfoNew_.namingText = inputText.toString();
            crjVar.m108379b(bLiveGiftNamingCardInfoNew_);
            function1.invoke(crjVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m167444a(BLiveGiftItem bLiveGiftItem, Throwable th) {
        wrj.m205229e0(bLiveGiftItem, "unjailCard", "network failed");
        p560 p560Var = INSTANCE;
        th.getClass();
        p560Var.m167458k(th);
    }

    /* JADX INFO: renamed from: b */
    public static void m167445b(x6s x6sVar, BLiveGiftItem bLiveGiftItem, Function1 function1, BLiveExtraResponse bLiveExtraResponse) {
        Meta meta = bLiveExtraResponse.meta;
        if (meta.code == 200) {
            INSTANCE.m167460n(x6sVar, bLiveGiftItem, function1);
            return;
        }
        wrj.m205229e0(bLiveGiftItem, "namingCard", "meta code is not 200; meta message is " + meta.message);
        lsi0.m151595y(bLiveExtraResponse.meta.message);
    }

    /* JADX INFO: renamed from: e */
    public static void m167448e(x6s x6sVar, BLiveGiftItem bLiveGiftItem, Function1 function1, BLiveExtraResponse bLiveExtraResponse) {
        Meta meta = bLiveExtraResponse.meta;
        if (meta.code == 200) {
            INSTANCE.m167461p(x6sVar, bLiveGiftItem, function1);
            return;
        }
        wrj.m205229e0(bLiveGiftItem, "unjailCard", "meta code is not 200; meta message is " + meta.message);
        lsi0.m151595y(bLiveExtraResponse.meta.message);
    }

    /* JADX INFO: renamed from: f */
    public static CharSequence m167449f(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        char[] charArray = charSequence.toString().toCharArray();
        charArray.getClass();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (!w8u.m202209h(c) && !t0g0.m186869j(String.valueOf(c)) && !Character.isDigit(c)) {
                lsi0.m151578h(R$string.f47309ik);
                return sb;
            }
            sb.append(c);
        }
        return sb;
    }

    /* JADX INFO: renamed from: h */
    public static void m167451h(BLiveGiftItem bLiveGiftItem, Throwable th) {
        wrj.m205229e0(bLiveGiftItem, "namingCard", "network failed");
        p560 p560Var = INSTANCE;
        th.getClass();
        p560Var.m167458k(th);
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final boolean m167452l(@NotNull BLiveGiftItem giftItem) {
        giftItem.getClass();
        List<String> list = giftItem.labels;
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        return giftItem.labels.contains("namingCard") || giftItem.labels.contains("unjailCard");
    }

    /* JADX INFO: renamed from: o */
    public static final void m167453o(BLiveGiftItem bLiveGiftItem, View view) {
        wrj.m205229e0(bLiveGiftItem, "namingCard", "NamingCardDialog show, and cancel button clicked");
    }

    /* JADX INFO: renamed from: q */
    public static final void m167454q(BLiveGiftItem bLiveGiftItem, View view) {
        wrj.m205229e0(bLiveGiftItem, "unjailCard", "UnJailDialog show, and cancel button clicked");
    }

    /* JADX INFO: renamed from: r */
    public static final void m167455r(BLiveGiftItem bLiveGiftItem, Function1 function1, View view) {
        wrj.m205231f0(bLiveGiftItem);
        function1.invoke(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: i */
    public final void m167456i(final x6s<?, ?> presenter, final BLiveGiftItem giftItem, final Function1<? super crj, Unit> sendGiftAction) {
        presenter.duringCreated(zfv.m218579l0(presenter.m206027E2().m132146l0().f56011id, presenter.m206027E2().m149818o())).subscribe(ffw.m121194e(new e30() { // from class: l.j560
            @Override // p149l.e30
            public final void call(Object obj) {
                p560.m167445b(presenter, giftItem, sendGiftAction, (BLiveExtraResponse) obj);
            }
        }, new e30() { // from class: l.k560
            @Override // p149l.e30
            public final void call(Object obj) {
                p560.m167451h(giftItem, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: j */
    public final void m167457j(final x6s<?, ?> presenter, final BLiveGiftItem giftItem, final Function1<? super crj, Unit> sendGiftAction) {
        presenter.duringCreated(zfv.m218582m0(presenter.m206027E2().m132146l0().f56011id, presenter.m206027E2().m149818o())).subscribe(ffw.m121194e(new e30() { // from class: l.h560
            @Override // p149l.e30
            public final void call(Object obj) {
                p560.m167448e(presenter, giftItem, sendGiftAction, (BLiveExtraResponse) obj);
            }
        }, new e30() { // from class: l.i560
            @Override // p149l.e30
            public final void call(Object obj) {
                p560.m167444a(giftItem, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final void m167458k(Throwable throwable) {
        if (throwable instanceof TantanException.Client.CoreService) {
            lsi0.m151595y(((TantanException.Client.CoreService) throwable).metaMessage);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m167459m(@NotNull x6s<?, ?> presenter, @NotNull BLiveGiftItem giftItem, @NotNull Function1<? super crj, Unit> sendGiftAction) {
        presenter.getClass();
        giftItem.getClass();
        sendGiftAction.getClass();
        if (giftItem.labels.contains("namingCard")) {
            wrj.m205227d0(giftItem, "namingCard");
            m167456i(presenter, giftItem, sendGiftAction);
        } else if (giftItem.labels.contains("unjailCard")) {
            wrj.m205227d0(giftItem, "unjailCard");
            m167457j(presenter, giftItem, sendGiftAction);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m167460n(x6s<?, ?> presenter, final BLiveGiftItem giftItem, Function1<? super crj, Unit> sendGiftAction) {
        ArrayList<InputFilter> arrayListArrayListOf = CollectionsKt.arrayListOf(new InputFilter() { // from class: l.l560
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return p560.m167449f(charSequence, i, i2, spanned, i3, i4);
            }
        });
        tje.Companion companion = tje.INSTANCE;
        Act act = presenter.act();
        act.getClass();
        tje.C20187a c20187a = new tje.C20187a(act);
        c20187a.m189265I(R$string.f47331jk);
        c20187a.m189259C(R$string.f47178ck);
        c20187a.m189290y(R$string.f47112Zj);
        c20187a.m189263G(R$string.f47288hk);
        c20187a.m189261E(3);
        String strM202217t = w8u.m202217t(R$string.f47244fk);
        strM202217t.getClass();
        c20187a.m189260D(strM202217t);
        String strM202217t2 = w8u.m202217t(R$string.f47266gk);
        strM202217t2.getClass();
        c20187a.m189262F(strM202217t2);
        c20187a.m189289x(new View.OnClickListener() { // from class: l.m560
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p560.m167453o(giftItem, view);
            }
        });
        c20187a.m189258B(new C19132a(giftItem, sendGiftAction));
        c20187a.m189264H(arrayListArrayListOf);
        c20187a.m189288w(true);
        c20187a.m189291z(false);
        c20187a.m189257A(true);
        c20187a.m189266a().m189256f();
        wrj.m205233g0(giftItem, "namingCard", "NamingCardDialog will be show");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: p */
    public final void m167461p(x6s<?, ?> presenter, final BLiveGiftItem giftItem, final Function1<? super crj, Unit> sendGiftAction) {
        xh0.C21150a c21150a = new xh0.C21150a(presenter.act());
        c21150a.m208740s(w8u.m202217t(R$string.f47375lk));
        c21150a.m208731j(w8u.m202218u(R$string.f47353kk, presenter.m206027E2().m132146l0().name));
        c21150a.m208738q(R$string.f47178ck);
        c21150a.m208726e(R$string.f47112Zj);
        c21150a.m208724c(new View.OnClickListener() { // from class: l.n560
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p560.m167454q(giftItem, view);
            }
        });
        c21150a.m208736o(new View.OnClickListener() { // from class: l.o560
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p560.m167455r(giftItem, sendGiftAction, view);
            }
        });
        c21150a.m208723b(true);
        c21150a.m208728g(false);
        c21150a.m208729h(false);
        c21150a.m208722a().m208721g();
        wrj.m205233g0(giftItem, "unjailCard", "UnJailDialog will be show");
    }
}
