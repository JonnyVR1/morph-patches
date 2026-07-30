package com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view.tab;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionQueueTabLayoutBindings;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view.tab.VoiceAuctionTabView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VRecyclerView;
import p153l.dpm0;
import p153l.fqm0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\nR\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/view/tab/VoiceAuctionTabView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceAuctionQueueTabLayoutBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "", "Ll/dpm0;", "tabs", "e", "(Ljava/util/List;)V", "", FirebaseAnalytics.Param.INDEX, Constants.INAPP_DATA_TAG, "(I)V", "c", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "Lkotlin/Lazy;", "getDataAdapter", "()Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "dataAdapter", "Ll/fqm0;", "Ljava/util/List;", "data", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class VoiceAuctionTabView extends LiveVoiceAuctionQueueTabLayoutBindings {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy dataAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public List<fqm0> data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAuctionTabView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.dataAdapter = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.hqm0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VoiceAuctionTabView.m79121b();
            }
        });
        this.data = CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: b */
    public static LiveBaseAdapter m79121b() {
        return new LiveBaseAdapter();
    }

    private final LiveBaseAdapter getDataAdapter() {
        return (LiveBaseAdapter) this.dataAdapter.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m79122c() {
        VRecyclerView vRecyclerView = this.f49083b;
        vRecyclerView.setLayoutManager(new GridLayoutManager(vRecyclerView.getContext(), 3));
        vRecyclerView.setAdapter(getDataAdapter());
    }

    /* JADX INFO: renamed from: d */
    public final void m79123d(int index) {
        int i = 0;
        for (Object obj : this.data) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List<fqm0> list = this.data;
            if (i == index) {
                if (!list.get(i).getPage().getIsSelected()) {
                    this.data.get(i).getPage().m117413g(true);
                    getDataAdapter().m68543O(this.data.get(i));
                }
            } else if (list.get(i).getPage().getIsSelected()) {
                this.data.get(i).getPage().m117413g(false);
                getDataAdapter().m68543O(this.data.get(i));
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m79124e(@NotNull List<dpm0> tabs) {
        tabs.getClass();
        List<dpm0> list = tabs;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new fqm0((dpm0) it.next()));
        }
        this.data = arrayList;
        getDataAdapter().m68554Z(this.data);
        m79123d(0);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionQueueTabLayoutBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79122c();
    }

    public /* synthetic */ VoiceAuctionTabView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
