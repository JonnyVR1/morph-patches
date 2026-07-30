package com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.gears;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftItemView;
import p153l.bmu;
import p153l.bnl0;
import p153l.jjs;
import p153l.lsj;
import p153l.qa00;
import p153l.x20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatGiftGearsLayerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LiveVChatGiftGearsProgressView f46142a;

    public LiveVChatGiftGearsLayerView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m70803a(View view) {
        bmu.m105268a(this, view);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final LiveVChatGiftGearsFlyView m70804b(jjs jjsVar) {
        if (jjsVar.m145119e() != 100.0f) {
            return null;
        }
        LiveVChatGiftGearsFlyView liveVChatGiftGearsFlyViewM155699a = lsj.m155698b().m155699a(getContext());
        addView(liveVChatGiftGearsFlyViewM155699a, new FrameLayout.LayoutParams(qa00.m175859d(20.0f), qa00.m175859d(20.0f)));
        liveVChatGiftGearsFlyViewM155699a.m70801o(jjsVar);
        return liveVChatGiftGearsFlyViewM155699a;
    }

    /* JADX INFO: renamed from: c */
    public void m70805c(x20 x20Var) {
        this.f46142a.m70821i(x20Var);
    }

    /* JADX INFO: renamed from: d */
    public void m70806d() {
        if (getChildCount() <= 1) {
            bnl0.m105525M0(this, false);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m70807e() {
        this.f46142a.m70833u();
    }

    /* JADX INFO: renamed from: f */
    public void m70808f(LiveVChatGiftItemView liveVChatGiftItemView, jjs jjsVar, int[] iArr) {
        this.f46142a.m70832t(liveVChatGiftItemView);
        bnl0.m105524M(this, true);
        this.f46142a.m70835w(jjsVar, iArr, m70804b(jjsVar));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70803a(this);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            this.f46142a.setVisibility(i);
        }
    }

    public LiveVChatGiftGearsLayerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatGiftGearsLayerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
