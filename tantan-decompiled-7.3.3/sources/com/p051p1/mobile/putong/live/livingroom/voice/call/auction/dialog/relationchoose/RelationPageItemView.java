package com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationchoose;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceAuctionBasePriceGiftItemBindings;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.dialog.relationchoose.RelationPageItemView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p153l.dqm0;
import p153l.izs;
import p153l.obc0;
import p153l.qa00;
import p153l.qvk;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/call/auction/dialog/relationchoose/RelationPageItemView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceAuctionBasePriceGiftItemBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/dqm0;", "model", "", "c", "(Ll/dqm0;)V", Constants.INAPP_DATA_TAG, "()V", "e", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class RelationPageItemView extends LiveVoiceAuctionBasePriceGiftItemBindings {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelationPageItemView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: b */
    public static void m79034b(qvk qvkVar, dqm0 dqm0Var, View view) {
        qvkVar.m178314b4(dqm0Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m79035c(@NotNull final dqm0 model) {
        model.getClass();
        final qvk<?> qvkVarM117551H = model.m117551H();
        VDraweeView vDraweeView = this.f49038c;
        String str = model.getRelation().image;
        int i = qa00.f156293F;
        izs.m142870u("context_livingAct", vDraweeView, str, i, i);
        this.f49039d.setText(model.getRelation().name);
        if (qvkVarM117551H.m178313a4(model)) {
            qvkVarM117551H.m178314b4(model);
        } else {
            m79037e();
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.mwc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RelationPageItemView.m79034b(qvkVarM117551H, model, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m79036d() {
        this.f49037b.setBackgroundResource(obc0.f146152P7);
    }

    /* JADX INFO: renamed from: e */
    public final void m79037e() {
        this.f49037b.setBackground(null);
    }
}
