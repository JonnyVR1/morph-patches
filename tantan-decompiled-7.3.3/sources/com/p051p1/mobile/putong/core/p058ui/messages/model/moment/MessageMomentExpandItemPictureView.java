package com.p051p1.mobile.putong.core.p058ui.messages.model.moment;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VRelative;
import p153l.m000;
import p153l.uqb0;

/* JADX INFO: loaded from: classes4.dex */
public class MessageMomentExpandItemPictureView extends VRelative {

    /* JADX INFO: renamed from: d */
    public MessageMomentExpandItemPictureView f32885d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f32886e;

    /* JADX INFO: renamed from: f */
    public float f32887f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.moment.MessageMomentExpandItemPictureView$a */
    public class C8727a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f32888a;

        public C8727a(float f) {
            this.f32888a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f32888a);
        }
    }

    public MessageMomentExpandItemPictureView(Context context) {
        super(context);
        this.f32887f = -1.0f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50613p(this);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f32887f = motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p */
    public final void m50613p(View view) {
        m000.m156501a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public int m50614q() {
        float f = this.f32887f;
        if (f == -1.0f || f >= getWidth() / 3) {
            return this.f32887f > ((float) ((getWidth() * 2) / 3)) ? 1 : 0;
        }
        return -1;
    }

    public void setRadius(float f) {
        if (NullChecker.m82487b(this.f32886e)) {
            this.f32886e.setOutlineProvider(new C8727a(f));
            this.f32886e.setClipToOutline(true);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m50615z(Picture picture) {
        uqb0.f180374G.m127096B0(this.f32886e, picture.webpMaxWidth1080());
    }

    public MessageMomentExpandItemPictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32887f = -1.0f;
    }

    public MessageMomentExpandItemPictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32887f = -1.0f;
    }
}
