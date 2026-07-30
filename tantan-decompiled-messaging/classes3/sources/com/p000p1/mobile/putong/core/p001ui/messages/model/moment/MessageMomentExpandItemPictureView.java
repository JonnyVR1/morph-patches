package com.p000p1.mobile.putong.core.p001ui.messages.model.moment;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import l.prz;
import l.qib0;
import p028v.VDraweeView;
import p028v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageMomentExpandItemPictureView extends VRelative {

    /* JADX INFO: renamed from: d */
    public MessageMomentExpandItemPictureView f1928d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f1929e;

    /* JADX INFO: renamed from: f */
    public float f1930f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemPictureView$a */
    public class C0147a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f1931a;

        public C0147a(float f) {
            this.f1931a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f1931a);
        }
    }

    public MessageMomentExpandItemPictureView(Context context) {
        super(context);
        this.f1930f = -1.0f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2568p(this);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f1930f = motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p */
    public final void m2568p(View view) {
        prz.a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public int m2569q() {
        float f = this.f1930f;
        if (f == -1.0f || f >= getWidth() / 3) {
            return this.f1930f > ((float) ((getWidth() * 2) / 3)) ? 1 : 0;
        }
        return -1;
    }

    public void setRadius(float f) {
        if (NullChecker.b(this.f1929e)) {
            this.f1929e.setOutlineProvider(new C0147a(f));
            this.f1929e.setClipToOutline(true);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m2570z(Picture picture) {
        qib0.G.B0(this.f1929e, picture.webpMaxWidth1080());
    }

    public MessageMomentExpandItemPictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1930f = -1.0f;
    }

    public MessageMomentExpandItemPictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1930f = -1.0f;
    }
}
