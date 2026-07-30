package com.p051p1.mobile.putong.live.external.internal.vchat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.external.internal.vchat.effect.LiveVChatGiftLayer;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.campaign.LiveVChatCampaignView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.tray.LiveVChatGiftTrays;
import p151v.VImage;
import p153l.dtu;
import p153l.iam;
import p153l.wvk0;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatView extends FrameLayout implements iam<wvk0> {

    /* JADX INFO: renamed from: a */
    public LiveVChatPreviewView f46277a;

    /* JADX INFO: renamed from: b */
    public LiveVideoChatPushView f46278b;

    /* JADX INFO: renamed from: c */
    public LiveVChatInfoView f46279c;

    /* JADX INFO: renamed from: d */
    public LiveVChatCampaignView f46280d;

    /* JADX INFO: renamed from: e */
    public LiveVChatMessageView f46281e;

    /* JADX INFO: renamed from: f */
    public LiveVChatOptView f46282f;

    /* JADX INFO: renamed from: g */
    public LiveVChatGiftTrays f46283g;

    /* JADX INFO: renamed from: h */
    public View f46284h;

    /* JADX INFO: renamed from: i */
    public LiveVChatWaitingOrderView f46285i;

    /* JADX INFO: renamed from: j */
    public LiveVChatCallingView f46286j;

    /* JADX INFO: renamed from: k */
    public VImage f46287k;

    /* JADX INFO: renamed from: l */
    public LiveVChatCalledView f46288l;

    /* JADX INFO: renamed from: m */
    public LiveVChatGiftLayer f46289m;

    public LiveVChatView(@NonNull Context context) {
        super(context);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m70972a(View view) {
        dtu.m117900a(this, view);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70972a(this);
    }

    public LiveVChatView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(wvk0 wvk0Var) {
    }
}
