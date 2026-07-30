package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallNormalItemView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\u000f\u001a\u00020\u00002!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R=\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R=\u0010/\u001a\u001d\u0012\u0013\u0012\u00110*¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\r0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(¨\u00060"}, m88121d2 = {"Ll/s910;", "Ll/d3q;", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallNormalItemView;", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "applyData", "", "callFullAndFree", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;Z)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "applyModel", "", "action", "P", "(Lkotlin/jvm/functions/Function1;)Ll/s910;", "", "o", "()I", "itemView", BloodType.f39576O, "(Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallNormalItemView;)V", "enable", "J", "(Z)V", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "L", "()Lcom/p1/mobile/putong/live/base/data/BLiveMultiCall;", "b", "Z", "c", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallNormalItemView;", "normalItem", Constants.INAPP_DATA_TAG, "Lkotlin/jvm/functions/Function1;", "K", "()Lkotlin/jvm/functions/Function1;", "setAgreeAction", "(Lkotlin/jvm/functions/Function1;)V", "agreeAction", "", "avatar", "e", "N", "setAvatarAction", "avatarAction", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class s910 extends d3q<MultiCallNormalItemView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveMultiCall applyData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean callFullAndFree;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public MultiCallNormalItemView normalItem;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public Function1<? super s910, Unit> agreeAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public Function1<? super String, Unit> avatarAction;

    public s910(@NotNull BLiveMultiCall bLiveMultiCall, boolean z) {
        bLiveMultiCall.getClass();
        this.applyData = bLiveMultiCall;
        this.callFullAndFree = z;
        this.agreeAction = new Function1() { // from class: l.q910
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s910.m185127I((s910) obj);
            }
        };
        this.avatarAction = new Function1() { // from class: l.r910
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s910.m185126H((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: H */
    public static Unit m185126H(String str) {
        str.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static Unit m185127I(s910 s910Var) {
        s910Var.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public final void m185128J(boolean enable) {
        MultiCallNormalItemView multiCallNormalItemView = this.normalItem;
        if (multiCallNormalItemView != null) {
            if (enable) {
                multiCallNormalItemView.m76955v0();
            } else {
                multiCallNormalItemView.m76954u0();
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final Function1<s910, Unit> m185129K() {
        return this.agreeAction;
    }

    @NotNull
    /* JADX INFO: renamed from: L, reason: from getter */
    public final BLiveMultiCall getApplyData() {
        return this.applyData;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final Function1<String, Unit> m185131N() {
        return this.avatarAction;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo71749u(@NotNull MultiCallNormalItemView itemView) {
        itemView.getClass();
        super.mo71749u(itemView);
        this.normalItem = itemView;
        itemView.m76952p0(this);
        bnl0.m105591y(itemView.f48875i, !this.callFullAndFree);
        if (this.callFullAndFree) {
            itemView.m76950n0(false);
            String strM209910t = xau.m209910t(R$string.f48059e9);
            strM209910t.getClass();
            itemView.m76958z0(strM209910t);
            return;
        }
        itemView.m76950n0(true);
        String strM209910t2 = xau.m209910t(R$string.f48037d9);
        strM209910t2.getClass();
        itemView.m76958z0(strM209910t2);
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final s910 m185133P(@NotNull Function1<? super s910, Unit> action) {
        action.getClass();
        this.agreeAction = action;
        return this;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199229r4;
    }
}
