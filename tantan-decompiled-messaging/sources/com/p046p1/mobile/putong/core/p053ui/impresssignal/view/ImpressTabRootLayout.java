package com.p046p1.mobile.putong.core.p053ui.impresssignal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.ImpressSignalConversationHeadView;
import com.p046p1.mobile.putong.core.p053ui.impresssignal.view.ImpressTabRootLayout;
import p149l.u4c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class ImpressTabRootLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImpressSignalConversationHeadView f29762a;

    public ImpressTabRootLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m46140a(View view) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ImpressSignalConversationHeadView impressSignalConversationHeadView = (ImpressSignalConversationHeadView) findViewById(u4c0.f174310j6);
        this.f29762a = impressSignalConversationHeadView;
        xdl0.m208362Z(impressSignalConversationHeadView);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.tnm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImpressTabRootLayout.m46140a(view);
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
