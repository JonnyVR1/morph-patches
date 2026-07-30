package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJT\u0010\u0014\u001a\u00020\u00122\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2#\u0010\u0013\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Ll/au5;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;)Z", "Ll/y8s;", "presenter", "", "receiverId", "Lkotlin/Function1;", "Ll/stj;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "interceptorWrapperData", "", "sendGiftAction", "f", "(Ll/y8s;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "e", "", "throwable", "c", "(Ljava/lang/Throwable;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class au5 {

    @NotNull
    public static final au5 INSTANCE = new au5();

    /* JADX INFO: renamed from: l.au5$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m88121d2 = {"l/au5$a", "Ll/nu5$a;", "", "b", "()V", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C15840a implements nu5.InterfaceC18951a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function1<stj, Unit> f73467a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveGiftItem f73468b;

        /* JADX WARN: Multi-variable type inference failed */
        public C15840a(Function1<? super stj, Unit> function1, BLiveGiftItem bLiveGiftItem) {
            this.f73467a = function1;
            this.f73468b = bLiveGiftItem;
        }

        @Override // p153l.nu5.InterfaceC18951a
        /* JADX INFO: renamed from: a */
        public void mo100362a() {
            muj.m160187b0(this.f73468b, "ConfirmDialog user not click send again button.");
        }

        @Override // p153l.nu5.InterfaceC18951a
        /* JADX INFO: renamed from: b */
        public void mo100363b() {
            this.f73467a.invoke(null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m100356a(y8s y8sVar, Function1 function1, BLiveGiftItem bLiveGiftItem, BLiveExtraResponse bLiveExtraResponse) {
        if (!bLiveExtraResponse.data.confessionRelationship.isMatched) {
            function1.invoke(null);
            return;
        }
        Act act = y8sVar.act();
        act.getClass();
        new nu5(y8sVar, act).m164763f0(new C15840a(function1, bLiveGiftItem));
    }

    /* JADX INFO: renamed from: b */
    public static void m100357b(BLiveGiftItem bLiveGiftItem, Throwable th) {
        muj.m160187b0(bLiveGiftItem, "NetWork failed.");
        au5 au5Var = INSTANCE;
        th.getClass();
        au5Var.m100360c(th);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m100358d(BLiveGiftItem giftItem) {
        List<String> list = giftItem.labels;
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        return giftItem.labels.contains(Channel.confession);
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m100359f(@NotNull final y8s<?, ?> presenter, @NotNull final BLiveGiftItem giftItem, @NotNull String receiverId, @NotNull final Function1<? super stj, Unit> sendGiftAction) {
        presenter.getClass();
        giftItem.getClass();
        receiverId.getClass();
        sendGiftAction.getClass();
        muj.m160185a0(giftItem);
        if (zrv.f205799a.m207631D0().equals(receiverId)) {
            o1j0.m165649w(R$string.f48249n2);
            muj.m160187b0(giftItem, "You cannot express love to yourself");
        } else {
            bv5 bv5Var = bv5.INSTANCE;
            String strM207631D0 = zrv.f205799a.m207631D0();
            strM207631D0.getClass();
            presenter.duringCreated(bv5Var.m106554d(strM207631D0, receiverId)).subscribe(dhw.m115826e(new y20() { // from class: l.yt5
                @Override // p153l.y20
                public final void call(Object obj) {
                    au5.m100356a(presenter, sendGiftAction, giftItem, (BLiveExtraResponse) obj);
                }
            }, new y20() { // from class: l.zt5
                @Override // p153l.y20
                public final void call(Object obj) {
                    au5.m100357b(giftItem, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m100360c(Throwable throwable) {
        if (throwable instanceof TantanException.Client.CoreService) {
            o1j0.m165651y(((TantanException.Client.CoreService) throwable).metaMessage);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m100361e(@NotNull BLiveGiftItem giftItem) {
        giftItem.getClass();
        return m100358d(giftItem);
    }
}
