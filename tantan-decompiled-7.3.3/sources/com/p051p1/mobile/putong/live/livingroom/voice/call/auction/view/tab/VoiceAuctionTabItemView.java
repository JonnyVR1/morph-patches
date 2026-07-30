package com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionTabItemBindings;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view.tab.VoiceAuctionTabItemView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.czq;
import p153l.dpm0;
import p153l.eqm0;
import p153l.n3d0;
import p153l.n9c0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/view/tab/VoiceAuctionTabItemView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceAuctionTabItemBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/dpm0;", Item.TYPE, "", Constants.INAPP_DATA_TAG, "(Ll/dpm0;)V", "", "c", "(Ll/dpm0;)I", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VoiceAuctionTabItemView extends LiveVoiceAuctionTabItemBindings {
    public /* synthetic */ VoiceAuctionTabItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public static Unit m79118b(dpm0 dpm0Var, View view) {
        view.getClass();
        eqm0 tabAction = dpm0Var.getTabAction();
        if (tabAction != null) {
            tabAction.mo121948a(dpm0Var);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final int m79119c(dpm0 item) {
        return n3d0.m161277a(item.getIsSelected() ? n9c0.f140856p1 : n9c0.f140847m1);
    }

    /* JADX INFO: renamed from: d */
    public final void m79120d(@NotNull final dpm0 item) {
        item.getClass();
        this.f49097b.setSelected(item.getIsSelected());
        this.f49097b.setTextColor(m79119c(item));
        this.f49097b.setText(item.getTitle());
        VText vText = this.f49097b;
        vText.getClass();
        czq.m113347c(vText, new Function1() { // from class: l.gqm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceAuctionTabItemView.m79118b(item, (View) obj);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAuctionTabItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
