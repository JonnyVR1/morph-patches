package com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.GiftDialogShadeLayer;
import p147v.VDraweeView;
import p149l.c8c0;
import p149l.d30;
import p149l.hvj;
import p149l.ihs;
import p149l.olj;
import p149l.qiu;
import p149l.s6c0;
import p149l.uju;
import p149l.xdl0;
import p149l.yr50;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatGiftDialogContentView extends ConstraintLayout implements olj {

    /* JADX INFO: renamed from: d */
    public View f45151d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f45152e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f45153f;

    /* JADX INFO: renamed from: g */
    public LiveVChatGiftDialogGiftsView f45154g;

    /* JADX INFO: renamed from: h */
    public LiveVChatGiftDialogBottomBar f45155h;

    /* JADX INFO: renamed from: i */
    public GiftDialogShadeLayer f45156i;

    /* JADX INFO: renamed from: j */
    public LiveVChatGiftOperationView f45157j;

    /* JADX INFO: renamed from: k */
    public uju<?> f45158k;

    /* JADX INFO: renamed from: l */
    public DialogC12611a f45159l;

    /* JADX INFO: renamed from: m */
    public hvj f45160m;

    public LiveVChatGiftDialogContentView(Context context) {
        super(context);
    }

    @Override // p149l.olj
    /* JADX INFO: renamed from: e0 */
    public void mo69369e0() {
    }

    public LiveVChatGiftDialogGiftsView getCurrentShowGiftPanel() {
        return this.f45154g;
    }

    public Dialog getDialog() {
        DialogC12611a dialogC12611a = this.f45159l;
        if (dialogC12611a != null) {
            return dialogC12611a;
        }
        return null;
    }

    public yr50 getFlyDestination() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        VDraweeView vDraweeView = this.f45152e;
        if (vDraweeView != null) {
            vDraweeView.getLocationOnScreen(iArr);
            iArr[0] = xdl0.m208412y0() / 2;
        }
        LiveVChatGiftDialogGiftsView liveVChatGiftDialogGiftsView = this.f45154g;
        if (liveVChatGiftDialogGiftsView != null) {
            liveVChatGiftDialogGiftsView.getLocationOnScreen(iArr2);
            iArr2[0] = xdl0.m208412y0() / 2;
        }
        return new yr50(iArr, iArr2);
    }

    public boolean isShowing() {
        DialogC12611a dialogC12611a = this.f45159l;
        return dialogC12611a != null && dialogC12611a.isShowing();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m69370j0(View view) {
        qiu.m174919a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m69371k0(uju<?> ujuVar, final d30 d30Var, final DialogInterface.OnDismissListener onDismissListener) {
        this.f45158k = ujuVar;
        View viewInflate = LayoutInflater.from(ujuVar.act()).inflate(s6c0.f162812y1, (ViewGroup) null);
        m69370j0(viewInflate);
        DialogC12611a dialogC12611a = new DialogC12611a(ujuVar.act(), viewInflate);
        this.f45159l = dialogC12611a;
        dialogC12611a.m71771c0(c8c0.f79740e);
        this.f45159l.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.oiu
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f144186a.m69372l0(onDismissListener, dialogInterface);
            }
        });
        this.f45151d.setOnClickListener(new View.OnClickListener() { // from class: l.piu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        this.f45154g.m69407w0(ujuVar);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m69372l0(DialogInterface.OnDismissListener onDismissListener, DialogInterface dialogInterface) {
        onDismissListener.onDismiss(dialogInterface);
        this.f45154g.m69401b();
    }

    /* JADX INFO: renamed from: m0 */
    public void m69373m0() {
        getCurrentShowGiftPanel().m69390B0();
    }

    /* JADX INFO: renamed from: n0 */
    public void m69374n0() {
        xdl0.m208345M0(this.f45154g, true);
        this.f45154g.setTranslationX(0.0f);
    }

    /* JADX INFO: renamed from: o0 */
    public void m69375o0(hvj hvjVar) {
        this.f45160m = hvjVar;
        if (!hvjVar.m133170c().m133184c()) {
            m69374n0();
        }
        this.f45154g.m69394H0(hvjVar.m133171d());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69370j0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m69376p0() {
        this.f45154g.m69395I0();
    }

    /* JADX INFO: renamed from: q0 */
    public void m69377q0() {
        DialogC12611a dialogC12611a = this.f45159l;
        if (dialogC12611a != null) {
            dialogC12611a.show();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m69378r0(ihs ihsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        LiveVChatGiftDialogGiftsView liveVChatGiftDialogGiftsView = this.f45154g;
        if (liveVChatGiftDialogGiftsView != null) {
            liveVChatGiftDialogGiftsView.m69400P0(ihsVar, bLiveGivenGiftBrief);
        }
    }

    public LiveVChatGiftDialogContentView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
