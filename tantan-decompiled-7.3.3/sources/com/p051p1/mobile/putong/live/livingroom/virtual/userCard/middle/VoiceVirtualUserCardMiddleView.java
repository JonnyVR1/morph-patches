package com.p051p1.mobile.putong.live.livingroom.virtual.userCard.middle;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserProfileMiddleCards;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceUserCardMiddleViewBindings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.d3q;
import p153l.mkp0;
import p153l.sa00;
import p153l.vak0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\u001d\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/userCard/middle/VoiceVirtualUserCardMiddleView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceUserCardMiddleViewBindings;", "Ll/mkp0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Ll/vak0;", "profileData", "c", "(Ll/vak0;)V", "b", "", "lighted", "total", Constants.INAPP_DATA_TAG, "(II)V", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "getAdapter", "()Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "adapter", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class VoiceVirtualUserCardMiddleView extends LiveVirtualVoiceUserCardMiddleViewBindings<mkp0<?>> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final LiveBaseAdapter adapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceVirtualUserCardMiddleView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.adapter = new LiveBaseAdapter();
    }

    /* JADX INFO: renamed from: b */
    public final void m78754b() {
    }

    /* JADX INFO: renamed from: c */
    public final void m78755c(@Nullable vak0 profileData) {
        if (profileData == null || !profileData.m200545t()) {
            bnl0.m105524M(this, false);
            return;
        }
        List<BLiveVoiceUserProfileMiddleCards> list = profileData.m200543r().middleCards;
        list.getClass();
        List<BLiveVoiceUserProfileMiddleCards> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (BLiveVoiceUserProfileMiddleCards bLiveVoiceUserProfileMiddleCards : list2) {
            bLiveVoiceUserProfileMiddleCards.getClass();
            T t = this.f49033a;
            t.getClass();
            String str = profileData.m200540o().f143542a.f56859id;
            str.getClass();
            arrayList.add(new sa00(bLiveVoiceUserProfileMiddleCards, (mkp0) t, str));
        }
        this.adapter.m68554Z(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public final void m78756d(int lighted, int total) {
        List<d3q<?>> listM68538J = this.adapter.m68538J();
        listM68538J.getClass();
        Iterator<T> it = listM68538J.iterator();
        int i = 0;
        while (it.hasNext()) {
            d3q d3qVar = (d3q) it.next();
            if (d3qVar instanceof sa00) {
                sa00 sa00Var = (sa00) d3qVar;
                if (TEnum.equals(sa00Var.getMiddleCard().type, "giftWall")) {
                    sa00Var.getMiddleCard().amount = lighted;
                    sa00Var.getMiddleCard().totalAmount = total;
                    this.adapter.notifyItemChanged(i);
                }
            }
            i++;
        }
    }

    @NotNull
    public final LiveBaseAdapter getAdapter() {
        return this.adapter;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceUserCardMiddleViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f49035c.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f49035c.setOverScrollMode(2);
        this.f49035c.setAdapter(this.adapter);
    }
}
