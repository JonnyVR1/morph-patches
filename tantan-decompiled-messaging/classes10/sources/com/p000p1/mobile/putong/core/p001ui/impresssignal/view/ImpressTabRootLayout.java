package com.p000p1.mobile.putong.core.p001ui.impresssignal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.impresssignal.view.ImpressTabRootLayout;
import com.p1.mobile.putong.core.newui.messages.anim.view.ImpressSignalConversationHeadView;
import l.u4c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ImpressTabRootLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImpressSignalConversationHeadView f2156a;

    public ImpressTabRootLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3505a(View view) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View view = (ImpressSignalConversationHeadView) findViewById(u4c0.j6);
        this.f2156a = view;
        xdl0.Z(new View[]{view});
        xdl0.E0(this, new View.OnClickListener() { // from class: l.tnm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ImpressTabRootLayout.m3505a(view2);
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
