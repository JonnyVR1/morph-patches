package com.p051p1.mobile.putong.core.newui.home.card.operation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p051p1.mobile.putong.core.newui.home.views.CardOperationButton;
import p153l.avl;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseHomeCardExpandedButton extends FrameLayout implements avl {

    /* JADX INFO: renamed from: a */
    public CardOperationButton.InterfaceC8200b f23418a;

    /* JADX INFO: renamed from: b */
    public boolean f23419b;

    public BaseHomeCardExpandedButton(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean m39360d(View view) {
        this.f23419b = true;
        CardOperationButton.InterfaceC8200b interfaceC8200b = this.f23418a;
        if (interfaceC8200b != null) {
            interfaceC8200b.mo38402a();
        }
        return true;
    }

    @Override // p153l.avl
    public View getRealView() {
        return this;
    }

    @Override // p153l.avl
    /* JADX INFO: renamed from: i */
    public void mo39361i() {
    }

    @Override // p153l.avl
    /* JADX INFO: renamed from: j */
    public void mo39362j(float f) {
        mo39424a(f, CardProgressAction.UNKNOWN);
    }

    @Override // p153l.avl
    public void reset() {
    }

    public void setIconAlpha(float f) {
    }

    public void setIconPressStateColor(int i) {
    }

    public void setNormalStateIcon(int i) {
    }

    @Override // p153l.avl
    public void setNormalStateLayerBackground(Drawable drawable) {
    }

    @Override // p153l.avl
    public void setOnLongPressListener(CardOperationButton.InterfaceC8200b interfaceC8200b) {
        this.f23418a = interfaceC8200b;
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.dm2
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f89598a.m39360d(view);
            }
        });
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        CardOperationButton.InterfaceC8200b interfaceC8200b;
        super.setPressed(z);
        if (z) {
            return;
        }
        if (this.f23419b && (interfaceC8200b = this.f23418a) != null) {
            interfaceC8200b.mo38403b();
        }
        this.f23419b = false;
    }

    @Override // p153l.avl
    public void setPressedStateLayerBackground(Drawable drawable) {
    }

    public BaseHomeCardExpandedButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BaseHomeCardExpandedButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
