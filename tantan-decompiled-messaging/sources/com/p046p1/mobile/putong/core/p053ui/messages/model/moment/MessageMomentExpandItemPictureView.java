package com.p046p1.mobile.putong.core.p053ui.messages.model.moment;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VRelative;
import p149l.prz;
import p149l.qib0;

/* JADX INFO: loaded from: classes3.dex */
public class MessageMomentExpandItemPictureView extends VRelative {

    /* JADX INFO: renamed from: d */
    public MessageMomentExpandItemPictureView f32037d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f32038e;

    /* JADX INFO: renamed from: f */
    public float f32039f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemPictureView$a */
    public class C8564a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f32040a;

        public C8564a(float f) {
            this.f32040a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f32040a);
        }
    }

    public MessageMomentExpandItemPictureView(Context context) {
        super(context);
        this.f32039f = -1.0f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49430p(this);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f32039f = motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p */
    public final void m49430p(View view) {
        prz.m171093a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public int m49431q() {
        float f = this.f32039f;
        if (f == -1.0f || f >= getWidth() / 3) {
            return this.f32039f > ((float) ((getWidth() * 2) / 3)) ? 1 : 0;
        }
        return -1;
    }

    public void setRadius(float f) {
        if (NullChecker.m81304b(this.f32038e)) {
            this.f32038e.setOutlineProvider(new C8564a(f));
            this.f32038e.setClipToOutline(true);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m49432z(Picture picture) {
        qib0.f154691G.m102312B0(this.f32038e, picture.webpMaxWidth1080());
    }

    public MessageMomentExpandItemPictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32039f = -1.0f;
    }

    public MessageMomentExpandItemPictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32039f = -1.0f;
    }
}
