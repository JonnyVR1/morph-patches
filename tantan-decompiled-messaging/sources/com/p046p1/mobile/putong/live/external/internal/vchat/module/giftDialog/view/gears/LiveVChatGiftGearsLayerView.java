package com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.gears;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import p149l.aku;
import p149l.d30;
import p149l.ihs;
import p149l.t100;
import p149l.vpj;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatGiftGearsLayerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LiveVChatGiftGearsProgressView f45294a;

    public LiveVChatGiftGearsLayerView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m69620a(View view) {
        aku.m97178a(this, view);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final LiveVChatGiftGearsFlyView m69621b(ihs ihsVar) {
        if (ihsVar.m136280e() != 100.0f) {
            return null;
        }
        LiveVChatGiftGearsFlyView liveVChatGiftGearsFlyViewM199277a = vpj.m199276b().m199277a(getContext());
        addView(liveVChatGiftGearsFlyViewM199277a, new FrameLayout.LayoutParams(t100.m186890d(20.0f), t100.m186890d(20.0f)));
        liveVChatGiftGearsFlyViewM199277a.m69618o(ihsVar);
        return liveVChatGiftGearsFlyViewM199277a;
    }

    /* JADX INFO: renamed from: c */
    public void m69622c(d30 d30Var) {
        this.f45294a.m69638i(d30Var);
    }

    /* JADX INFO: renamed from: d */
    public void m69623d() {
        if (getChildCount() <= 1) {
            xdl0.m208345M0(this, false);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m69624e() {
        this.f45294a.m69650u();
    }

    /* JADX INFO: renamed from: f */
    public void m69625f(LiveVChatGiftItemView liveVChatGiftItemView, ihs ihsVar, int[] iArr) {
        this.f45294a.m69649t(liveVChatGiftItemView);
        xdl0.m208344M(this, true);
        this.f45294a.m69652w(ihsVar, iArr, m69621b(ihsVar));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69620a(this);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            this.f45294a.setVisibility(i);
        }
    }

    public LiveVChatGiftGearsLayerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatGiftGearsLayerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
