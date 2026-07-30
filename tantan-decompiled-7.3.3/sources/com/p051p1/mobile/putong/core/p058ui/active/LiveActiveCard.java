package com.p051p1.mobile.putong.core.p058ui.active;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import p151v.VDraweeView;
import p153l.arr;
import p153l.uqb0;
import p153l.x0m;
import p153l.x20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveActiveCard extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f29177a;

    /* JADX INFO: renamed from: b */
    public Button f29178b;

    /* JADX INFO: renamed from: c */
    public x0m f29179c;

    /* JADX INFO: renamed from: d */
    public boolean f29180d;

    public LiveActiveCard(@NonNull Context context) {
        super(context);
        this.f29180d = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m45412b(View view) {
        arr.m99767a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m45413c(x0m x0mVar, VirtualCardType virtualCardType, Active active, final x20 x20Var) {
        uqb0.f180374G.m127115L0(this.f29177a, active.cardBackgroundUrl);
        this.f29178b.setOnClickListener(new View.OnClickListener() { // from class: l.xqr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        this.f29179c = x0mVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f29180d) {
            return;
        }
        this.f29179c.mo37742I();
        this.f29180d = false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45412b(this);
    }

    public LiveActiveCard(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29180d = false;
    }

    public LiveActiveCard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29180d = false;
    }
}
