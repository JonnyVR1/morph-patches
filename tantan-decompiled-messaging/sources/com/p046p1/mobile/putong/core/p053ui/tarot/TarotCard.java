package com.p046p1.mobile.putong.core.p053ui.tarot;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class TarotCard extends AppCompatImageView {

    /* JADX INFO: renamed from: c */
    public float f36537c;

    /* JADX INFO: renamed from: d */
    public InterfaceC8912a f36538d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.tarot.TarotCard$a */
    public interface InterfaceC8912a {
        /* JADX INFO: renamed from: a */
        void mo55853a(View view);
    }

    public TarotCard(Context context) {
        super(context);
    }

    public float getLatestRotation() {
        return this.f36537c;
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
            if (NullChecker.m81303a(this.f36538d)) {
                this.f36538d.mo55853a(this);
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }

    public void setLatestRotation(float f) {
        this.f36537c = f;
    }

    public void setListener(InterfaceC8912a interfaceC8912a) {
        this.f36538d = interfaceC8912a;
    }

    public TarotCard(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TarotCard(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
