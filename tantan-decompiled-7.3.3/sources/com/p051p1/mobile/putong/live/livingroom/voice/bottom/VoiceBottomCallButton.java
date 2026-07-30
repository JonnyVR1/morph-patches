package com.p051p1.mobile.putong.live.livingroom.voice.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.izs;
import p153l.jtm0;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceBottomCallButton extends FrameLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53756a;

    /* JADX INFO: renamed from: b */
    public View f53757b;

    /* JADX INFO: renamed from: c */
    public TextView f53758c;

    /* JADX INFO: renamed from: d */
    public int f53759d;

    public VoiceBottomCallButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m78950a(View view) {
        jtm0.m146910a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m78951b(int i) {
        if (i <= 0 || bnl0.m105529O0(this.f53757b)) {
            bnl0.m105524M(this.f53758c, false);
        } else {
            bnl0.m105524M(this.f53758c, true);
            this.f53758c.setText(i > 99 ? "99+" : String.valueOf(i));
        }
        this.f53759d = i;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo73321g0(boolean z) {
        bnl0.m105524M(this.f53757b, z);
        TextView textView = this.f53758c;
        if (z) {
            bnl0.m105524M(textView, false);
        } else {
            bnl0.m105524M(textView, this.f53759d > 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78950a(this);
    }

    public void setIcon(String str) {
        izs.m142869t("context_livingAct", this.f53756a, str, qa00.f156335v);
    }

    public VoiceBottomCallButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VoiceBottomCallButton(@NonNull Context context) {
        super(context);
    }

    public void setIcon(int i) {
        this.f53756a.setImageResource(i);
    }
}
