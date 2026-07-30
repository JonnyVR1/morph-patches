package com.p046p1.mobile.putong.live.livingroom.intl.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import p149l.efe0;
import p149l.ihs;
import p149l.olo;

/* JADX INFO: loaded from: classes4.dex */
public class IntlMultipleGiftView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public IntlMultipleGiftView f51038d;

    /* JADX INFO: renamed from: e */
    public IntlMultipleGiftItemView f51039e;

    /* JADX INFO: renamed from: f */
    public IntlMultipleGiftItemView f51040f;

    /* JADX INFO: renamed from: g */
    public IntlMultipleGiftItemView f51041g;

    /* JADX INFO: renamed from: h */
    public ihs f51042h;

    /* JADX INFO: renamed from: i */
    public LiveGiftItemView f51043i;

    /* JADX INFO: renamed from: j */
    public int f51044j;

    /* JADX INFO: renamed from: k */
    public boolean f51045k;

    /* JADX INFO: renamed from: l */
    public LiveMultipleGiftView.InterfaceC12811a f51046l;

    public IntlMultipleGiftView(@NonNull Context context) {
        super(context);
        this.f51045k = false;
    }

    /* JADX INFO: renamed from: r */
    private void m75350r() {
        m75353k0(this.f51039e, 0);
        m75353k0(this.f51040f, 1);
        m75353k0(this.f51041g, 2);
        this.f51039e.m75347b(IntlMultipleGiftItemView.IntlContinueType.SMALL);
        this.f51040f.m75347b(IntlMultipleGiftItemView.IntlContinueType.MIDDLE);
        this.f51041g.m75347b(IntlMultipleGiftItemView.IntlContinueType.LARGE);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m75351i0(View view) {
        olo.m164954a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m75352j0(IntlMultipleGiftItemView intlMultipleGiftItemView, int i, View view) {
        if (this.f51046l != null) {
            this.f51046l.mo73887a(new efe0(this.f51042h, this.f51043i, i, this.f51044j, (int) intlMultipleGiftItemView.getGears().combosHitNum));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m75353k0(final IntlMultipleGiftItemView intlMultipleGiftItemView, final int i) {
        intlMultipleGiftItemView.setOnClickListener(new View.OnClickListener() { // from class: l.nlo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139573a.m75352j0(intlMultipleGiftItemView, i, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75351i0(this);
        m75350r();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            this.f51045k = false;
        }
    }

    public IntlMultipleGiftView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51045k = false;
    }
}
