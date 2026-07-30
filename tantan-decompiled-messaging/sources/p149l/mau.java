package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveAnchors;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveSuggestPopItemView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, m87232d2 = {"Ll/mau;", "Ll/d1q;", "Lcom/p1/mobile/putong/live/external/view/widgets/LiveSuggestPopItemView;", "Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;", "data", "<init>", "(Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;)V", "", "o", "()I", "itemView", "", "K", "(Lcom/p1/mobile/putong/live/external/view/widgets/LiveSuggestPopItemView;)V", "", "", "payloads", "L", "(Lcom/p1/mobile/putong/live/external/view/widgets/LiveSuggestPopItemView;Ljava/util/List;)V", "a", "Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;", "I", "()Lcom/p1/mobile/putong/live/base/data/BLiveAnchors;", "", "b", "Z", "J", "()Z", "setCheck", "(Z)V", "isCheck", "Lkotlin/Function0;", "c", "Lkotlin/jvm/functions/Function0;", "getRefreshCall", "()Lkotlin/jvm/functions/Function0;", "N", "(Lkotlin/jvm/functions/Function0;)V", "refreshCall", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class mau extends d1q<LiveSuggestPopItemView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final BLiveAnchors data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isCheck;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> refreshCall;

    public mau(@NotNull BLiveAnchors bLiveAnchors) {
        bLiveAnchors.getClass();
        this.data = bLiveAnchors;
        this.isCheck = true;
    }

    /* JADX INFO: renamed from: H */
    public static Unit m153832H(mau mauVar) {
        mauVar.isCheck = !mauVar.isCheck;
        Function0<Unit> function0 = mauVar.refreshCall;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: I, reason: from getter */
    public final BLiveAnchors getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final boolean getIsCheck() {
        return this.isCheck;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo70566u(@NotNull LiveSuggestPopItemView itemView) {
        itemView.getClass();
        super.mo70566u(itemView);
        itemView.m70920k0(this.data, this.isCheck);
        itemView.setFollowClickAction(new Function0() { // from class: l.lau
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return mau.m153832H(this.f127243a);
            }
        });
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo70759v(@Nullable LiveSuggestPopItemView itemView, @NotNull List<Object> payloads) {
        payloads.getClass();
        super.mo70759v(itemView, payloads);
        if (vwb.m200296J(payloads) || itemView == null || !(payloads.get(0) instanceof y25)) {
            return;
        }
        itemView.m70919j0(this.isCheck);
    }

    /* JADX INFO: renamed from: N */
    public final void m153837N(@Nullable Function0<Unit> function0) {
        this.refreshCall = function0;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162787q0;
    }
}
