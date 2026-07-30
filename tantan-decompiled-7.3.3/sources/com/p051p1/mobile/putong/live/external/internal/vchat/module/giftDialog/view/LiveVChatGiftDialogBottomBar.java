package com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.external.internal.vchat.C12668a;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogIndicator;
import p153l.aiv;
import p153l.bnl0;
import p153l.iam;
import p153l.lku;
import p153l.oku;
import p153l.unj;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatGiftDialogBottomBar extends ConstraintLayout implements iam<oku<?>> {

    /* JADX INFO: renamed from: d */
    public ImageView f45996d;

    /* JADX INFO: renamed from: e */
    public TextView f45997e;

    /* JADX INFO: renamed from: f */
    public GiftDialogIndicator f45998f;

    public LiveVChatGiftDialogBottomBar(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: i0 */
    public final void m70546i0(View view) {
        lku.m154655a(this, view);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m70547j0(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public View m70547j0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lku.m154656b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(final oku<?> okuVar) {
        bnl0.m105509E0(this.f45997e, new View.OnClickListener() { // from class: l.kku
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12668a.m70426m(okuVar.act(), false);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m70549l0(unj unjVar) {
        this.f45998f.m75637a(unjVar.getViewPager(), unjVar.getInitPosition());
        bnl0.m105524M(this.f45998f, unjVar.getDataSize() >= 2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70546i0(this);
    }

    @SuppressLint({"SetTextI18n"})
    public void setAvailableCoin(Long l2) {
        bnl0.m105524M(this.f45996d, true);
        this.f45997e.setText(aiv.m98131r0(l2.longValue()));
    }

    public LiveVChatGiftDialogBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatGiftDialogBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
