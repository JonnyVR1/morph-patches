package com.idv.identity.ocr.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.y5c0;

/* JADX INFO: loaded from: classes7.dex */
public class IdentityAlertSymbol extends FrameLayout {

    /* JADX INFO: renamed from: com.idv.identity.ocr.widget.IdentityAlertSymbol$a */
    public interface InterfaceC3684a {
    }

    public IdentityAlertSymbol(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(y5c0.f196411e, this);
    }

    public void setCommAlertOverlayListener(InterfaceC3684a interfaceC3684a) {
    }

    public IdentityAlertSymbol(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IdentityAlertSymbol(@NonNull Context context) {
        this(context, null);
    }
}
