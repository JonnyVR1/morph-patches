package com.p051p1.mobile.putong.core.p058ui.tarot;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class TarotCard extends AppCompatImageView {

    /* JADX INFO: renamed from: c */
    public float f37385c;

    /* JADX INFO: renamed from: d */
    public InterfaceC9075a f37386d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.TarotCard$a */
    public interface InterfaceC9075a {
        /* JADX INFO: renamed from: a */
        void mo57036a(View view);
    }

    public TarotCard(Context context) {
        super(context);
    }

    public float getLatestRotation() {
        return this.f37385c;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getRotation() != 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            if (NullChecker.m82486a(this.f37386d)) {
                this.f37386d.mo57036a(this);
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }

    public void setLatestRotation(float f) {
        this.f37385c = f;
    }

    public void setListener(InterfaceC9075a interfaceC9075a) {
        this.f37386d = interfaceC9075a;
    }

    public TarotCard(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TarotCard(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
