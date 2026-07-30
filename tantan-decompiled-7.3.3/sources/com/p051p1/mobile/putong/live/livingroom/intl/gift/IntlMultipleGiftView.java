package com.p051p1.mobile.putong.live.livingroom.intl.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import p153l.jjs;
import p153l.jne0;
import p153l.ono;

/* JADX INFO: loaded from: classes5.dex */
public class IntlMultipleGiftView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public IntlMultipleGiftView f51886d;

    /* JADX INFO: renamed from: e */
    public IntlMultipleGiftItemView f51887e;

    /* JADX INFO: renamed from: f */
    public IntlMultipleGiftItemView f51888f;

    /* JADX INFO: renamed from: g */
    public IntlMultipleGiftItemView f51889g;

    /* JADX INFO: renamed from: h */
    public jjs f51890h;

    /* JADX INFO: renamed from: i */
    public LiveGiftItemView f51891i;

    /* JADX INFO: renamed from: j */
    public int f51892j;

    /* JADX INFO: renamed from: k */
    public boolean f51893k;

    /* JADX INFO: renamed from: l */
    public LiveMultipleGiftView.InterfaceC12974a f51894l;

    public IntlMultipleGiftView(@NonNull Context context) {
        super(context);
        this.f51893k = false;
    }

    /* JADX INFO: renamed from: r */
    private void m76533r() {
        m76536k0(this.f51887e, 0);
        m76536k0(this.f51888f, 1);
        m76536k0(this.f51889g, 2);
        this.f51887e.m76530b(IntlMultipleGiftItemView.IntlContinueType.SMALL);
        this.f51888f.m76530b(IntlMultipleGiftItemView.IntlContinueType.MIDDLE);
        this.f51889g.m76530b(IntlMultipleGiftItemView.IntlContinueType.LARGE);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m76534i0(View view) {
        ono.m168344a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m76535j0(IntlMultipleGiftItemView intlMultipleGiftItemView, int i, View view) {
        if (this.f51894l != null) {
            this.f51894l.mo75070a(new jne0(this.f51890h, this.f51891i, i, this.f51892j, (int) intlMultipleGiftItemView.getGears().combosHitNum));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m76536k0(final IntlMultipleGiftItemView intlMultipleGiftItemView, final int i) {
        intlMultipleGiftItemView.setOnClickListener(new View.OnClickListener() { // from class: l.nno
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142812a.m76535j0(intlMultipleGiftItemView, i, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76534i0(this);
        m76533r();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            this.f51893k = false;
        }
    }

    public IntlMultipleGiftView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51893k = false;
    }
}
