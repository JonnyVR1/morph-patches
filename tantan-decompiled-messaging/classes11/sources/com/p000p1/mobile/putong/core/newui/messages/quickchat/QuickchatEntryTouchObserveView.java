package com.p000p1.mobile.putong.core.newui.messages.quickchat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class QuickchatEntryTouchObserveView extends View {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.quickchat.QuickchatEntryTouchObserveView$a */
    public interface InterfaceC0347a {
    }

    public QuickchatEntryTouchObserveView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (NullChecker.a((Object) null)) {
            throw null;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTouchObserver(InterfaceC0347a interfaceC0347a) {
    }

    public QuickchatEntryTouchObserveView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QuickchatEntryTouchObserveView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
