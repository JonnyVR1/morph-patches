package com.p046p1.mobile.putong.live.livingroom.virtual.userCard.middle;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserProfileMiddleCards;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceUserCardMiddleViewBindings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.d1q;
import p149l.ibp0;
import p149l.p1k0;
import p149l.v100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bJ\u001d\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/userCard/middle/VoiceVirtualUserCardMiddleView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceUserCardMiddleViewBindings;", "Ll/ibp0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Ll/p1k0;", "profileData", "c", "(Ll/p1k0;)V", "b", "", "lighted", "total", Constants.INAPP_DATA_TAG, "(II)V", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "getAdapter", "()Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "adapter", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class VoiceVirtualUserCardMiddleView extends LiveVirtualVoiceUserCardMiddleViewBindings<ibp0<?>> {

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
    public final void m77571b() {
    }

    /* JADX INFO: renamed from: c */
    public final void m77572c(@Nullable p1k0 profileData) {
        if (profileData == null || !profileData.m167100t()) {
            xdl0.m208344M(this, false);
            return;
        }
        List<BLiveVoiceUserProfileMiddleCards> list = profileData.m167098r().middleCards;
        list.getClass();
        List<BLiveVoiceUserProfileMiddleCards> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (BLiveVoiceUserProfileMiddleCards bLiveVoiceUserProfileMiddleCards : list2) {
            bLiveVoiceUserProfileMiddleCards.getClass();
            T t = this.f48185a;
            t.getClass();
            String str = profileData.m167095o().f135304a.f56011id;
            str.getClass();
            arrayList.add(new v100(bLiveVoiceUserProfileMiddleCards, (ibp0) t, str));
        }
        this.adapter.m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public final void m77573d(int lighted, int total) {
        List<d1q<?>> listM67355J = this.adapter.m67355J();
        listM67355J.getClass();
        Iterator<T> it = listM67355J.iterator();
        int i = 0;
        while (it.hasNext()) {
            d1q d1qVar = (d1q) it.next();
            if (d1qVar instanceof v100) {
                v100 v100Var = (v100) d1qVar;
                if (TEnum.equals(v100Var.getMiddleCard().type, "giftWall")) {
                    v100Var.getMiddleCard().amount = lighted;
                    v100Var.getMiddleCard().totalAmount = total;
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

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceUserCardMiddleViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f48187c.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f48187c.setOverScrollMode(2);
        this.f48187c.setAdapter(this.adapter);
    }
}
