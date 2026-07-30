package com.p000p1.mobile.putong.core.newui.home.card.operation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p000p1.mobile.putong.core.newui.home.views.CardOperationButton;
import p009l.nsl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class BaseHomeCardExpandedButton extends FrameLayout implements nsl {

    /* JADX INFO: renamed from: a */
    public CardOperationButton.InterfaceC0213b f1454a;

    /* JADX INFO: renamed from: b */
    public boolean f1455b;

    public BaseHomeCardExpandedButton(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean m2335d(View view) {
        this.f1455b = true;
        CardOperationButton.InterfaceC0213b interfaceC0213b = this.f1454a;
        if (interfaceC0213b != null) {
            interfaceC0213b.mo1370a();
        }
        return true;
    }

    @Override // p009l.nsl
    public View getRealView() {
        return this;
    }

    @Override // p009l.nsl
    /* JADX INFO: renamed from: i */
    public void mo2336i() {
    }

    @Override // p009l.nsl
    /* JADX INFO: renamed from: j */
    public void mo2337j(float f) {
        mo2399a(f, CardProgressAction.UNKNOWN);
    }

    @Override // p009l.nsl
    public void reset() {
    }

    public void setIconAlpha(float f) {
    }

    public void setIconPressStateColor(int i) {
    }

    public void setNormalStateIcon(int i) {
    }

    @Override // p009l.nsl
    public void setNormalStateLayerBackground(Drawable drawable) {
    }

    @Override // p009l.nsl
    public void setOnLongPressListener(CardOperationButton.InterfaceC0213b interfaceC0213b) {
        this.f1454a = interfaceC0213b;
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.vl2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f21635a.m2335d(view);
            }
        });
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        CardOperationButton.InterfaceC0213b interfaceC0213b;
        super.setPressed(z);
        if (z) {
            return;
        }
        if (this.f1455b && (interfaceC0213b = this.f1454a) != null) {
            interfaceC0213b.mo1371b();
        }
        this.f1455b = false;
    }

    @Override // p009l.nsl
    public void setPressedStateLayerBackground(Drawable drawable) {
    }

    public BaseHomeCardExpandedButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseHomeCardExpandedButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
