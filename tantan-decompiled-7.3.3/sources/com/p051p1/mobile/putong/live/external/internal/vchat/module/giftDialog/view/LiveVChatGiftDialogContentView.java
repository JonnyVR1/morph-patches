package com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.GiftDialogShadeLayer;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.e060;
import p153l.eoj;
import p153l.hgc0;
import p153l.jjs;
import p153l.rku;
import p153l.vlu;
import p153l.x20;
import p153l.xec0;
import p153l.xxj;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatGiftDialogContentView extends ConstraintLayout implements eoj {

    /* JADX INFO: renamed from: d */
    public View f45999d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f46000e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f46001f;

    /* JADX INFO: renamed from: g */
    public LiveVChatGiftDialogGiftsView f46002g;

    /* JADX INFO: renamed from: h */
    public LiveVChatGiftDialogBottomBar f46003h;

    /* JADX INFO: renamed from: i */
    public GiftDialogShadeLayer f46004i;

    /* JADX INFO: renamed from: j */
    public LiveVChatGiftOperationView f46005j;

    /* JADX INFO: renamed from: k */
    public vlu<?> f46006k;

    /* JADX INFO: renamed from: l */
    public DialogC12774a f46007l;

    /* JADX INFO: renamed from: m */
    public xxj f46008m;

    public LiveVChatGiftDialogContentView(Context context) {
        super(context);
    }

    @Override // p153l.eoj
    /* JADX INFO: renamed from: e0 */
    public void mo70552e0() {
    }

    public LiveVChatGiftDialogGiftsView getCurrentShowGiftPanel() {
        return this.f46002g;
    }

    public Dialog getDialog() {
        DialogC12774a dialogC12774a = this.f46007l;
        if (dialogC12774a != null) {
            return dialogC12774a;
        }
        return null;
    }

    public e060 getFlyDestination() {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        VDraweeView vDraweeView = this.f46000e;
        if (vDraweeView != null) {
            vDraweeView.getLocationOnScreen(iArr);
            iArr[0] = bnl0.m105592y0() / 2;
        }
        LiveVChatGiftDialogGiftsView liveVChatGiftDialogGiftsView = this.f46002g;
        if (liveVChatGiftDialogGiftsView != null) {
            liveVChatGiftDialogGiftsView.getLocationOnScreen(iArr2);
            iArr2[0] = bnl0.m105592y0() / 2;
        }
        return new e060(iArr, iArr2);
    }

    public boolean isShowing() {
        DialogC12774a dialogC12774a = this.f46007l;
        return dialogC12774a != null && dialogC12774a.isShowing();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m70553j0(View view) {
        rku.m181881a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m70554k0(vlu<?> vluVar, final x20 x20Var, final DialogInterface.OnDismissListener onDismissListener) {
        this.f46006k = vluVar;
        View viewInflate = LayoutInflater.from(vluVar.act()).inflate(xec0.f193926y1, (ViewGroup) null);
        m70553j0(viewInflate);
        DialogC12774a dialogC12774a = new DialogC12774a(vluVar.act(), viewInflate);
        this.f46007l = dialogC12774a;
        dialogC12774a.m72954c0(hgc0.f109388e);
        this.f46007l.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.pku
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f152955a.m70555l0(onDismissListener, dialogInterface);
            }
        });
        this.f45999d.setOnClickListener(new View.OnClickListener() { // from class: l.qku
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        this.f46002g.m70590w0(vluVar);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m70555l0(DialogInterface.OnDismissListener onDismissListener, DialogInterface dialogInterface) {
        onDismissListener.onDismiss(dialogInterface);
        this.f46002g.m70584b();
    }

    /* JADX INFO: renamed from: m0 */
    public void m70556m0() {
        getCurrentShowGiftPanel().m70573B0();
    }

    /* JADX INFO: renamed from: n0 */
    public void m70557n0() {
        bnl0.m105525M0(this.f46002g, true);
        this.f46002g.setTranslationX(0.0f);
    }

    /* JADX INFO: renamed from: o0 */
    public void m70558o0(xxj xxjVar) {
        this.f46008m = xxjVar;
        if (!xxjVar.m213529c().m213543c()) {
            m70557n0();
        }
        this.f46002g.m70577H0(xxjVar.m213530d());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70553j0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m70559p0() {
        this.f46002g.m70578I0();
    }

    /* JADX INFO: renamed from: q0 */
    public void m70560q0() {
        DialogC12774a dialogC12774a = this.f46007l;
        if (dialogC12774a != null) {
            dialogC12774a.show();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m70561r0(jjs jjsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        LiveVChatGiftDialogGiftsView liveVChatGiftDialogGiftsView = this.f46002g;
        if (liveVChatGiftDialogGiftsView != null) {
            liveVChatGiftDialogGiftsView.m70583P0(jjsVar, bLiveGivenGiftBrief);
        }
    }

    public LiveVChatGiftDialogContentView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
