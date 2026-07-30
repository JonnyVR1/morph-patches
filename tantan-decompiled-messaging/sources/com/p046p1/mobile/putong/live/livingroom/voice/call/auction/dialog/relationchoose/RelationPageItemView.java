package com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationchoose;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionBasePriceGiftItemBindings;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationchoose.RelationPageItemView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p149l.atk;
import p149l.hxs;
import p149l.i3c0;
import p149l.t100;
import p149l.zgm0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationchoose/RelationPageItemView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceAuctionBasePriceGiftItemBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/zgm0;", "model", "", "c", "(Ll/zgm0;)V", Constants.INAPP_DATA_TAG, "()V", "e", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class RelationPageItemView extends LiveVoiceAuctionBasePriceGiftItemBindings {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelationPageItemView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: b */
    public static void m77851b(atk atkVar, zgm0 zgm0Var, View view) {
        atkVar.m98829b4(zgm0Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m77852c(@NotNull final zgm0 model) {
        model.getClass();
        final atk<?> atkVarM218661H = model.m218661H();
        VDraweeView vDraweeView = this.f48190c;
        String str = model.getRelation().image;
        int i = t100.f167231F;
        hxs.m133408u("context_livingAct", vDraweeView, str, i, i);
        this.f48191d.setText(model.getRelation().name);
        if (atkVarM218661H.m98828a4(model)) {
            atkVarM218661H.m98829b4(model);
        } else {
            m77854e();
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.hoc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RelationPageItemView.m77851b(atkVarM218661H, model, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m77853d() {
        this.f48189b.setBackgroundResource(i3c0.f110824P7);
    }

    /* JADX INFO: renamed from: e */
    public final void m77854e() {
        this.f48189b.setBackground(null);
    }
}
