package com.p000p1.mobile.putong.live.livingroom.intl.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.multiple.LiveMultipleGiftView;
import p002l.efe0;
import p002l.ihs;
import p002l.olo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class IntlMultipleGiftView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public IntlMultipleGiftView f7080d;

    /* JADX INFO: renamed from: e */
    public IntlMultipleGiftItemView f7081e;

    /* JADX INFO: renamed from: f */
    public IntlMultipleGiftItemView f7082f;

    /* JADX INFO: renamed from: g */
    public IntlMultipleGiftItemView f7083g;

    /* JADX INFO: renamed from: h */
    public ihs f7084h;

    /* JADX INFO: renamed from: i */
    public LiveGiftItemView f7085i;

    /* JADX INFO: renamed from: j */
    public int f7086j;

    /* JADX INFO: renamed from: k */
    public boolean f7087k;

    /* JADX INFO: renamed from: l */
    public LiveMultipleGiftView.InterfaceC0400a f7088l;

    public IntlMultipleGiftView(@NonNull Context context) {
        super(context);
        this.f7087k = false;
    }

    /* JADX INFO: renamed from: r */
    private void m8973r() {
        m8976k0(this.f7081e, 0);
        m8976k0(this.f7082f, 1);
        m8976k0(this.f7083g, 2);
        this.f7081e.m8970b(IntlMultipleGiftItemView.IntlContinueType.SMALL);
        this.f7082f.m8970b(IntlMultipleGiftItemView.IntlContinueType.MIDDLE);
        this.f7083g.m8970b(IntlMultipleGiftItemView.IntlContinueType.LARGE);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8974i0(View view) {
        olo.m19603a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m8975j0(IntlMultipleGiftItemView intlMultipleGiftItemView, int i, View view) {
        if (this.f7088l != null) {
            this.f7088l.mo7443a(new efe0(this.f7084h, this.f7085i, i, this.f7086j, (int) intlMultipleGiftItemView.getGears().combosHitNum));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m8976k0(final IntlMultipleGiftItemView intlMultipleGiftItemView, final int i) {
        intlMultipleGiftItemView.setOnClickListener(new View.OnClickListener() { // from class: l.nlo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16098a.m8975j0(intlMultipleGiftItemView, i, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8974i0(this);
        m8973r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setVisibility(int i) {
        super/*android.view.View*/.setVisibility(i);
        if (i == 8 || i == 4) {
            this.f7087k = false;
        }
    }

    public IntlMultipleGiftView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7087k = false;
    }
}
