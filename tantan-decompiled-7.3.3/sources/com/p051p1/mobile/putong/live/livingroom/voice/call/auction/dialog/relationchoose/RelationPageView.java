package com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationchoose;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionRelation;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionBasePriceGiftPageBindings;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationchoose.RelationPageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p151v.VRecyclerView;
import p153l.dqm0;
import p153l.qvk;
import p153l.rwn0;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ;\u0010\u0015\u001a\u00020\b\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationchoose/RelationPageView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceAuctionBasePriceGiftPageBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", Constants.INAPP_DATA_TAG, "Ll/rwn0;", "D", "Ll/qvk;", "presenter", "", "Lcom/p1/mobile/putong/live/base/data/BLiveAuctionRelation;", "giftList", "", "pageIndex", "e", "(Ll/qvk;Ljava/util/List;I)V", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "c", "Lkotlin/Lazy;", "getDataAdapter", "()Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "dataAdapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class RelationPageView extends LiveVoiceAuctionBasePriceGiftPageBindings {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy dataAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelationPageView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.dataAdapter = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.nwc0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RelationPageView.m79038b();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static LiveBaseAdapter m79038b() {
        return new LiveBaseAdapter();
    }

    private final LiveBaseAdapter getDataAdapter() {
        return (LiveBaseAdapter) this.dataAdapter.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final void m79041d() {
        VRecyclerView vRecyclerView = this.f49042b;
        vRecyclerView.setLayoutManager(new GridLayoutManager(vRecyclerView.getContext(), 4));
        vRecyclerView.setAdapter(getDataAdapter());
    }

    /* JADX INFO: renamed from: e */
    public final <D extends rwn0> void m79042e(@NotNull qvk<D> presenter, @NotNull List<? extends BLiveAuctionRelation> giftList, int pageIndex) {
        presenter.getClass();
        giftList.getClass();
        List<? extends BLiveAuctionRelation> list = giftList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new dqm0((BLiveAuctionRelation) it.next(), new y20() { // from class: l.owc0
                @Override // p153l.y20
                public final void call(Object obj) {
                    RelationPageView.m79040f((dqm0) obj);
                }
            }, presenter));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (pageIndex == 0 && presenter.getSelectedAdapterModel() == null) {
            presenter.m178316d4((dqm0) arrayList.get(0));
        }
        getDataAdapter().m68554Z(arrayList);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionBasePriceGiftPageBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79041d();
    }

    /* JADX INFO: renamed from: f */
    public static final void m79040f(dqm0 dqm0Var) {
    }
}
