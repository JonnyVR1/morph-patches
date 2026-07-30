package com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.auction;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceAuctionDialogViewBindings;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.auction.AuctionView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p151v.VText;
import p153l.bnl0;
import p153l.czq;
import p153l.iul;
import p153l.izs;
import p153l.ngn0;
import p153l.p81;
import p153l.qa00;
import p153l.zft;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/auction/AuctionView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceAuctionDialogViewBindings;", "Ll/p81;", "Ll/iul;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/ngn0;", OMSTemplateType.dialog, "", "a", "(Ll/ngn0;)V", "c", "()V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class AuctionView extends LiveVirtualVoiceAuctionDialogViewBindings<p81> implements iul {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuctionView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: i */
    public static Unit m78515i(AuctionView auctionView, View view) {
        view.getClass();
        ((p81) auctionView.f48947a).m171176L3();
        return Unit.INSTANCE;
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: a */
    public void mo78510a(@NotNull ngn0 dialog) {
        dialog.getClass();
        VText vText = this.f48950d;
        vText.getClass();
        czq.m113347c(vText, new Function1() { // from class: l.y81
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AuctionView.m78515i(this.f197934a, (View) obj);
            }
        });
        this.f48950d.setSelected(true);
        bnl0.m105505C0(this.f48949c, (int) ((bnl0.m105592y0() - qa00.f156338y) * 0.53731346f));
        izs.m142868s("context_livingAct", this.f48949c, zft.f204212g);
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: b */
    public /* bridge */ void mo78511b(boolean z) {
        super.mo78511b(z);
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: c */
    public void mo78512c() {
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: d */
    public /* bridge */ void mo78513d() {
        super.mo78513d();
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: e */
    public /* bridge */ void mo78514e() {
        super.mo78514e();
    }
}
