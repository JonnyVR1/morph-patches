package com.p046p1.mobile.putong.core.newui.home.card.operation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p046p1.mobile.putong.core.newui.home.views.CardOperationButton;
import p149l.nsl;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseHomeCardExpandedButton extends FrameLayout implements nsl {

    /* JADX INFO: renamed from: a */
    public CardOperationButton.InterfaceC8049b f22676a;

    /* JADX INFO: renamed from: b */
    public boolean f22677b;

    public BaseHomeCardExpandedButton(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean m38357d(View view) {
        this.f22677b = true;
        CardOperationButton.InterfaceC8049b interfaceC8049b = this.f22676a;
        if (interfaceC8049b != null) {
            interfaceC8049b.mo37399a();
        }
        return true;
    }

    @Override // p149l.nsl
    public View getRealView() {
        return this;
    }

    @Override // p149l.nsl
    /* JADX INFO: renamed from: i */
    public void mo38358i() {
    }

    @Override // p149l.nsl
    /* JADX INFO: renamed from: j */
    public void mo38359j(float f) {
        mo38421a(f, CardProgressAction.UNKNOWN);
    }

    @Override // p149l.nsl
    public void reset() {
    }

    public void setIconAlpha(float f) {
    }

    public void setIconPressStateColor(int i) {
    }

    public void setNormalStateIcon(int i) {
    }

    @Override // p149l.nsl
    public void setNormalStateLayerBackground(Drawable drawable) {
    }

    @Override // p149l.nsl
    public void setOnLongPressListener(CardOperationButton.InterfaceC8049b interfaceC8049b) {
        this.f22676a = interfaceC8049b;
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.vl2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f181912a.m38357d(view);
            }
        });
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        CardOperationButton.InterfaceC8049b interfaceC8049b;
        super.setPressed(z);
        if (z) {
            return;
        }
        if (this.f22677b && (interfaceC8049b = this.f22676a) != null) {
            interfaceC8049b.mo37400b();
        }
        this.f22677b = false;
    }

    @Override // p149l.nsl
    public void setPressedStateLayerBackground(Drawable drawable) {
    }

    public BaseHomeCardExpandedButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseHomeCardExpandedButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
