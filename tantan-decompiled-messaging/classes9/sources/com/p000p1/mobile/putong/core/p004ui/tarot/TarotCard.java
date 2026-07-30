package com.p000p1.mobile.putong.core.p004ui.tarot;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TarotCard extends AppCompatImageView {

    /* JADX INFO: renamed from: c */
    public float f6318c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0348a f6319d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.TarotCard$a */
    public interface InterfaceC0348a {
        /* JADX INFO: renamed from: a */
        void mo9251a(View view);
    }

    public TarotCard(Context context) {
        super(context);
    }

    public float getLatestRotation() {
        return this.f6318c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getRotation() != 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            if (NullChecker.a(this.f6319d)) {
                this.f6319d.mo9251a(this);
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }

    public void setLatestRotation(float f) {
        this.f6318c = f;
    }

    public void setListener(InterfaceC0348a interfaceC0348a) {
        this.f6319d = interfaceC0348a;
    }

    public TarotCard(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TarotCard(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
