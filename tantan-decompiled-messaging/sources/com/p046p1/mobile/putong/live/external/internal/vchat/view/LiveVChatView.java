package com.p046p1.mobile.putong.live.external.internal.vchat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.external.internal.vchat.effect.LiveVChatGiftLayer;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.campaign.LiveVChatCampaignView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.tray.LiveVChatGiftTrays;
import p147v.VImage;
import p149l.cru;
import p149l.qmk0;
import p149l.s7m;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatView extends FrameLayout implements s7m<qmk0> {

    /* JADX INFO: renamed from: a */
    public LiveVChatPreviewView f45429a;

    /* JADX INFO: renamed from: b */
    public LiveVideoChatPushView f45430b;

    /* JADX INFO: renamed from: c */
    public LiveVChatInfoView f45431c;

    /* JADX INFO: renamed from: d */
    public LiveVChatCampaignView f45432d;

    /* JADX INFO: renamed from: e */
    public LiveVChatMessageView f45433e;

    /* JADX INFO: renamed from: f */
    public LiveVChatOptView f45434f;

    /* JADX INFO: renamed from: g */
    public LiveVChatGiftTrays f45435g;

    /* JADX INFO: renamed from: h */
    public View f45436h;

    /* JADX INFO: renamed from: i */
    public LiveVChatWaitingOrderView f45437i;

    /* JADX INFO: renamed from: j */
    public LiveVChatCallingView f45438j;

    /* JADX INFO: renamed from: k */
    public VImage f45439k;

    /* JADX INFO: renamed from: l */
    public LiveVChatCalledView f45440l;

    /* JADX INFO: renamed from: m */
    public LiveVChatGiftLayer f45441m;

    public LiveVChatView(@NonNull Context context) {
        super(context);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m69789a(View view) {
        cru.m108455a(this, view);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69789a(this);
    }

    public LiveVChatView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(qmk0 qmk0Var) {
    }
}
