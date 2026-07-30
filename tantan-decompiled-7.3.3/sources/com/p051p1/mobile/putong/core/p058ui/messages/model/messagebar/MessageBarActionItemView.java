package com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VImage;
import p151v.VText;
import p153l.byy;
import p153l.gta;

/* JADX INFO: loaded from: classes4.dex */
public class MessageBarActionItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f32776a;

    /* JADX INFO: renamed from: b */
    public View f32777b;

    /* JADX INFO: renamed from: c */
    public VText f32778c;

    /* JADX INFO: renamed from: d */
    public View f32779d;

    public MessageBarActionItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m50506a(View view) {
        byy.m107101a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50506a(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32776a.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            this.f32776a.setLayoutParams(layoutParams);
        }
        this.f32778c.getPaint().setFakeBoldText(true);
    }

    public MessageBarActionItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageBarActionItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
