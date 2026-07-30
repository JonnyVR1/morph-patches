package com.p051p1.mobile.putong.core.p058ui.impresssignal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.ImpressSignalConversationHeadView;
import com.p051p1.mobile.putong.core.p058ui.impresssignal.view.ImpressTabRootLayout;
import p153l.adc0;
import p153l.bnl0;

/* JADX INFO: loaded from: classes3.dex */
public class ImpressTabRootLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImpressSignalConversationHeadView f30610a;

    public ImpressTabRootLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m47323a(View view) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ImpressSignalConversationHeadView impressSignalConversationHeadView = (ImpressSignalConversationHeadView) findViewById(adc0.f70435l6);
        this.f30610a = impressSignalConversationHeadView;
        bnl0.m105542Z(impressSignalConversationHeadView);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.vpm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImpressTabRootLayout.m47323a(view);
            }
        });
    }

    public ImpressTabRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ImpressTabRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
