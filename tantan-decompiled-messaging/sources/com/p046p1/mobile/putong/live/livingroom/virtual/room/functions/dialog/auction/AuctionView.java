package com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.auction;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceAuctionDialogViewBindings;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.auction.AuctionView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p147v.VText;
import p149l.cxq;
import p149l.hxs;
import p149l.i81;
import p149l.j7n0;
import p149l.t100;
import p149l.url;
import p149l.xdl0;
import p149l.ydt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/auction/AuctionView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceAuctionDialogViewBindings;", "Ll/i81;", "Ll/url;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/j7n0;", OMSTemplateType.dialog, "", "a", "(Ll/j7n0;)V", "c", "()V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class AuctionView extends LiveVirtualVoiceAuctionDialogViewBindings<i81> implements url {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuctionView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: i */
    public static Unit m77332i(AuctionView auctionView, View view) {
        view.getClass();
        ((i81) auctionView.f48099a).m134937L3();
        return Unit.INSTANCE;
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: a */
    public void mo77327a(@NotNull j7n0 dialog) {
        dialog.getClass();
        VText vText = this.f48102d;
        vText.getClass();
        cxq.m109105c(vText, new Function1() { // from class: l.r81
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AuctionView.m77332i(this.f158114a, (View) obj);
            }
        });
        this.f48102d.setSelected(true);
        xdl0.m208325C0(this.f48101c, (int) ((xdl0.m208412y0() - t100.f167276y) * 0.53731346f));
        hxs.m133406s("context_livingAct", this.f48101c, ydt.f197617g);
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: b */
    public /* bridge */ void mo77328b(boolean z) {
        super.mo77328b(z);
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: c */
    public void mo77329c() {
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: d */
    public /* bridge */ void mo77330d() {
        super.mo77330d();
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: e */
    public /* bridge */ void mo77331e() {
        super.mo77331e();
    }
}
