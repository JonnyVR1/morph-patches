package com.p046p1.mobile.putong.live.livingroom.voice.call.auction.view.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionTabItemBindings;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.view.tab.VoiceAuctionTabItemView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.ahm0;
import p149l.cxq;
import p149l.h1c0;
import p149l.kvc0;
import p149l.zfm0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/view/tab/VoiceAuctionTabItemView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceAuctionTabItemBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/zfm0;", Item.TYPE, "", Constants.INAPP_DATA_TAG, "(Ll/zfm0;)V", "", "c", "(Ll/zfm0;)I", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VoiceAuctionTabItemView extends LiveVoiceAuctionTabItemBindings {
    public /* synthetic */ VoiceAuctionTabItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public static Unit m77935b(zfm0 zfm0Var, View view) {
        view.getClass();
        ahm0 tabAction = zfm0Var.getTabAction();
        if (tabAction != null) {
            tabAction.mo96544a(zfm0Var);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final int m77936c(zfm0 item) {
        return kvc0.m147352a(item.getIsSelected() ? h1c0.f105395p1 : h1c0.f105386m1);
    }

    /* JADX INFO: renamed from: d */
    public final void m77937d(@NotNull final zfm0 item) {
        item.getClass();
        this.f48249b.setSelected(item.getIsSelected());
        this.f48249b.setTextColor(m77936c(item));
        this.f48249b.setText(item.getTitle());
        VText vText = this.f48249b;
        vText.getClass();
        cxq.m109105c(vText, new Function1() { // from class: l.chm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceAuctionTabItemView.m77935b(item, (View) obj);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAuctionTabItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }
}
