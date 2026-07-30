package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJT\u0010\u0014\u001a\u00020\u00122\u000e\u0010\n\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2#\u0010\u0013\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m87232d2 = {"Ll/ws5;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;", "giftItem", "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;)Z", "Ll/x6s;", "presenter", "", "receiverId", "Lkotlin/Function1;", "Ll/crj;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "interceptorWrapperData", "", "sendGiftAction", "f", "(Ll/x6s;Lcom/p1/mobile/putong/live/base/data/BLiveGiftItem;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "e", "", "throwable", "c", "(Ljava/lang/Throwable;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ws5 {

    @NotNull
    public static final ws5 INSTANCE = new ws5();

    /* JADX INFO: renamed from: l.ws5$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m87232d2 = {"l/ws5$a", "Ll/jt5$a;", "", "b", "()V", "a", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20947a implements jt5.InterfaceC17853a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function1<crj, Unit> f187863a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BLiveGiftItem f187864b;

        /* JADX WARN: Multi-variable type inference failed */
        public C20947a(Function1<? super crj, Unit> function1, BLiveGiftItem bLiveGiftItem) {
            this.f187863a = function1;
            this.f187864b = bLiveGiftItem;
        }

        @Override // p149l.jt5.InterfaceC17853a
        /* JADX INFO: renamed from: a */
        public void mo143084a() {
            wrj.m205223b0(this.f187864b, "ConfirmDialog user not click send again button.");
        }

        @Override // p149l.jt5.InterfaceC17853a
        /* JADX INFO: renamed from: b */
        public void mo143085b() {
            this.f187863a.invoke(null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m205352a(x6s x6sVar, Function1 function1, BLiveGiftItem bLiveGiftItem, BLiveExtraResponse bLiveExtraResponse) {
        if (!bLiveExtraResponse.data.confessionRelationship.isMatched) {
            function1.invoke(null);
            return;
        }
        Act act = x6sVar.act();
        act.getClass();
        new jt5(x6sVar, act).m143082f0(new C20947a(function1, bLiveGiftItem));
    }

    /* JADX INFO: renamed from: b */
    public static void m205353b(BLiveGiftItem bLiveGiftItem, Throwable th) {
        wrj.m205223b0(bLiveGiftItem, "NetWork failed.");
        ws5 ws5Var = INSTANCE;
        th.getClass();
        ws5Var.m205356c(th);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m205354d(BLiveGiftItem giftItem) {
        List<String> list = giftItem.labels;
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        return giftItem.labels.contains(Channel.confession);
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m205355f(@NotNull final x6s<?, ?> presenter, @NotNull final BLiveGiftItem giftItem, @NotNull String receiverId, @NotNull final Function1<? super crj, Unit> sendGiftAction) {
        presenter.getClass();
        giftItem.getClass();
        receiverId.getClass();
        sendGiftAction.getClass();
        wrj.m205221a0(giftItem);
        if (ypv.f199493a.m199309D0().equals(receiverId)) {
            lsi0.m151593w(R$string.f47401n2);
            wrj.m205223b0(giftItem, "You cannot express love to yourself");
        } else {
            xt5 xt5Var = xt5.INSTANCE;
            String strM199309D0 = ypv.f199493a.m199309D0();
            strM199309D0.getClass();
            presenter.duringCreated(xt5Var.m210961d(strM199309D0, receiverId)).subscribe(ffw.m121194e(new e30() { // from class: l.us5
                @Override // p149l.e30
                public final void call(Object obj) {
                    ws5.m205352a(presenter, sendGiftAction, giftItem, (BLiveExtraResponse) obj);
                }
            }, new e30() { // from class: l.vs5
                @Override // p149l.e30
                public final void call(Object obj) {
                    ws5.m205353b(giftItem, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m205356c(Throwable throwable) {
        if (throwable instanceof TantanException.Client.CoreService) {
            lsi0.m151595y(((TantanException.Client.CoreService) throwable).metaMessage);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m205357e(@NotNull BLiveGiftItem giftItem) {
        giftItem.getClass();
        return m205354d(giftItem);
    }
}
