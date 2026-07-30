package com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.external.internal.vchat.C12505a;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogIndicator;
import p149l.elj;
import p149l.kiu;
import p149l.niu;
import p149l.s7m;
import p149l.xdl0;
import p149l.zfv;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatGiftDialogBottomBar extends ConstraintLayout implements s7m<niu<?>> {

    /* JADX INFO: renamed from: d */
    public ImageView f45148d;

    /* JADX INFO: renamed from: e */
    public TextView f45149e;

    /* JADX INFO: renamed from: f */
    public GiftDialogIndicator f45150f;

    public LiveVChatGiftDialogBottomBar(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: i0 */
    public final void m69363i0(View view) {
        kiu.m146134a(this, view);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m69364j0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public View m69364j0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kiu.m146135b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(final niu<?> niuVar) {
        xdl0.m208329E0(this.f45149e, new View.OnClickListener() { // from class: l.jiu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12505a.m69243m(niuVar.act(), false);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m69366l0(elj eljVar) {
        this.f45150f.m74454a(eljVar.getViewPager(), eljVar.getInitPosition());
        xdl0.m208344M(this.f45150f, eljVar.getDataSize() >= 2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69363i0(this);
    }

    @SuppressLint({"SetTextI18n"})
    public void setAvailableCoin(Long l2) {
        xdl0.m208344M(this.f45148d, true);
        this.f45149e.setText(zfv.m218597r0(l2.longValue()));
    }

    public LiveVChatGiftDialogBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatGiftDialogBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
