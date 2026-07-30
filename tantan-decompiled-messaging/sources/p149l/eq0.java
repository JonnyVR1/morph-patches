package p149l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;

/* JADX INFO: loaded from: classes.dex */
public class eq0 implements bq0 {

    /* JADX INFO: renamed from: a */
    public final gq0 f92735a;

    /* JADX INFO: renamed from: b */
    public final sq0 f92736b;

    /* JADX INFO: renamed from: c */
    public final nq0 f92737c;

    /* JADX INFO: renamed from: d */
    public final Rect f92738d;

    /* JADX INFO: renamed from: e */
    public final int[] f92739e;

    /* JADX INFO: renamed from: f */
    public final int[] f92740f;

    /* JADX INFO: renamed from: g */
    public final int f92741g;

    /* JADX INFO: renamed from: h */
    public final AnimatedDrawableFrameInfo[] f92742h;

    /* JADX INFO: renamed from: i */
    public final Rect f92743i = new Rect();

    /* JADX INFO: renamed from: j */
    public final Rect f92744j = new Rect();

    /* JADX INFO: renamed from: k */
    public final boolean f92745k;

    /* JADX INFO: renamed from: l */
    public final Paint f92746l;

    /* JADX INFO: renamed from: m */
    public Bitmap f92747m;

    public eq0(gq0 gq0Var, sq0 sq0Var, Rect rect, boolean z) {
        this.f92735a = gq0Var;
        this.f92736b = sq0Var;
        nq0 nq0VarM185429d = sq0Var.m185429d();
        this.f92737c = nq0VarM185429d;
        int[] frameDurations = nq0VarM185429d.getFrameDurations();
        this.f92739e = frameDurations;
        gq0Var.m127504a(frameDurations);
        this.f92741g = gq0Var.m127506c(frameDurations);
        this.f92740f = gq0Var.m127505b(frameDurations);
        this.f92738d = m117694j(nq0VarM185429d, rect);
        this.f92745k = z;
        this.f92742h = new AnimatedDrawableFrameInfo[nq0VarM185429d.getFrameCount()];
        for (int i = 0; i < this.f92737c.getFrameCount(); i++) {
            this.f92742h[i] = this.f92737c.getFrameInfo(i);
        }
        Paint paint = new Paint();
        this.f92746l = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    /* JADX INFO: renamed from: j */
    public static Rect m117694j(nq0 nq0Var, Rect rect) {
        return rect == null ? new Rect(0, 0, nq0Var.getWidth(), nq0Var.getHeight()) : new Rect(0, 0, Math.min(rect.width(), nq0Var.getWidth()), Math.min(rect.height(), nq0Var.getHeight()));
    }

    @Override // p149l.bq0
    /* JADX INFO: renamed from: a */
    public int mo103304a(int i) {
        return this.f92739e[i];
    }

    @Override // p149l.bq0
    /* JADX INFO: renamed from: b */
    public int mo103305b() {
        return this.f92738d.width();
    }

    @Override // p149l.bq0
    /* JADX INFO: renamed from: c */
    public sq0 mo103306c() {
        return this.f92736b;
    }

    @Override // p149l.bq0
    /* JADX INFO: renamed from: d */
    public int mo103307d() {
        return this.f92741g;
    }

    @Override // p149l.bq0
    /* JADX INFO: renamed from: e */
    public void mo103308e(int i, Canvas canvas) {
        rq0 frame = this.f92737c.getFrame(i);
        try {
            if (frame.getWidth() > 0 && frame.getHeight() > 0) {
                if (this.f92737c.doesRenderSupportScaling()) {
                    m117699n(canvas, frame);
                } else {
                    m117698m(canvas, frame);
                }
            }
        } finally {
            frame.dispose();
        }
    }

    @Override // p149l.bq0
    /* JADX INFO: renamed from: f */
    public bq0 mo103309f(Rect rect) {
        return m117694j(this.f92737c, rect).equals(this.f92738d) ? this : new eq0(this.f92735a, this.f92736b, rect, this.f92745k);
    }

    @Override // p149l.bq0
    /* JADX INFO: renamed from: g */
    public int mo103310g() {
        return this.f92738d.height();
    }

    @Override // p149l.bq0
    public int getFrameCount() {
        return this.f92737c.getFrameCount();
    }

    @Override // p149l.bq0
    public AnimatedDrawableFrameInfo getFrameInfo(int i) {
        return this.f92742h[i];
    }

    @Override // p149l.bq0
    public int getHeight() {
        return this.f92737c.getHeight();
    }

    @Override // p149l.bq0
    public int getLoopCount() {
        return this.f92737c.getLoopCount();
    }

    @Override // p149l.bq0
    public int getWidth() {
        return this.f92737c.getWidth();
    }

    @Override // p149l.bq0
    /* JADX INFO: renamed from: h */
    public void mo103311h(int i, Canvas canvas) {
        rq0 frame = this.f92737c.getFrame(i);
        AnimatedDrawableFrameInfo frameInfo = this.f92737c.getFrameInfo(i);
        AnimatedDrawableFrameInfo frameInfo2 = i == 0 ? null : this.f92737c.getFrameInfo(i - 1);
        try {
            if (frame.getWidth() > 0 && frame.getHeight() > 0) {
                if (this.f92737c.doesRenderSupportScaling()) {
                    m117701p(canvas, frame, frameInfo, frameInfo2);
                } else {
                    m117700o(canvas, frame, frameInfo, frameInfo2);
                }
            }
        } finally {
            frame.dispose();
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m117695i() {
        Bitmap bitmap = this.f92747m;
        if (bitmap != null) {
            bitmap.recycle();
            this.f92747m = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m117696k(Canvas canvas, float f, float f2, AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        if (animatedDrawableFrameInfo.f6437g == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
            int iCeil = (int) Math.ceil(animatedDrawableFrameInfo.f6434d * f);
            int iCeil2 = (int) Math.ceil(animatedDrawableFrameInfo.f6435e * f2);
            int iCeil3 = (int) Math.ceil(animatedDrawableFrameInfo.f6432b * f);
            int iCeil4 = (int) Math.ceil(animatedDrawableFrameInfo.f6433c * f2);
            canvas.drawRect(new Rect(iCeil3, iCeil4, iCeil + iCeil3, iCeil2 + iCeil4), this.f92746l);
        }
    }

    /* JADX INFO: renamed from: l */
    public final synchronized Bitmap m117697l(int i, int i2) {
        try {
            Bitmap bitmap = this.f92747m;
            if (bitmap != null && (bitmap.getWidth() < i || this.f92747m.getHeight() < i2)) {
                m117695i();
            }
            if (this.f92747m == null) {
                this.f92747m = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            }
            this.f92747m.eraseColor(0);
        } catch (Throwable th) {
            throw th;
        }
        return this.f92747m;
    }

    /* JADX INFO: renamed from: m */
    public final void m117698m(Canvas canvas, rq0 rq0Var) {
        int width;
        int height;
        int xOffset;
        int yOffset;
        if (this.f92745k) {
            float fMax = Math.max(rq0Var.getWidth() / Math.min(rq0Var.getWidth(), canvas.getWidth()), rq0Var.getHeight() / Math.min(rq0Var.getHeight(), canvas.getHeight()));
            width = (int) (rq0Var.getWidth() / fMax);
            height = (int) (rq0Var.getHeight() / fMax);
            xOffset = (int) (rq0Var.getXOffset() / fMax);
            yOffset = (int) (rq0Var.getYOffset() / fMax);
        } else {
            width = rq0Var.getWidth();
            height = rq0Var.getHeight();
            xOffset = rq0Var.getXOffset();
            yOffset = rq0Var.getYOffset();
        }
        synchronized (this) {
            Bitmap bitmapM117697l = m117697l(width, height);
            this.f92747m = bitmapM117697l;
            rq0Var.renderFrame(width, height, bitmapM117697l);
            canvas.save();
            canvas.translate(xOffset, yOffset);
            canvas.drawBitmap(this.f92747m, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m117699n(Canvas canvas, rq0 rq0Var) {
        double dWidth = ((double) this.f92738d.width()) / ((double) this.f92737c.getWidth());
        double dHeight = ((double) this.f92738d.height()) / ((double) this.f92737c.getHeight());
        int iRound = (int) Math.round(((double) rq0Var.getWidth()) * dWidth);
        int iRound2 = (int) Math.round(((double) rq0Var.getHeight()) * dHeight);
        int xOffset = (int) (((double) rq0Var.getXOffset()) * dWidth);
        int yOffset = (int) (((double) rq0Var.getYOffset()) * dHeight);
        synchronized (this) {
            try {
                int iWidth = this.f92738d.width();
                int iHeight = this.f92738d.height();
                m117697l(iWidth, iHeight);
                Bitmap bitmap = this.f92747m;
                if (bitmap != null) {
                    rq0Var.renderFrame(iRound, iRound2, bitmap);
                }
                this.f92743i.set(0, 0, iWidth, iHeight);
                this.f92744j.set(xOffset, yOffset, iWidth + xOffset, iHeight + yOffset);
                Bitmap bitmap2 = this.f92747m;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.f92743i, this.f92744j, (Paint) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m117700o(Canvas canvas, rq0 rq0Var, AnimatedDrawableFrameInfo animatedDrawableFrameInfo, AnimatedDrawableFrameInfo animatedDrawableFrameInfo2) {
        Rect rect = this.f92738d;
        if (rect == null || rect.width() <= 0 || this.f92738d.height() <= 0) {
            return;
        }
        float width = canvas.getWidth() / this.f92738d.width();
        if (animatedDrawableFrameInfo2 != null) {
            m117696k(canvas, width, width, animatedDrawableFrameInfo2);
        }
        int width2 = rq0Var.getWidth();
        int height = rq0Var.getHeight();
        Rect rect2 = new Rect(0, 0, width2, height);
        int i = (int) (width2 * width);
        int i2 = (int) (height * width);
        int xOffset = (int) (rq0Var.getXOffset() * width);
        int yOffset = (int) (rq0Var.getYOffset() * width);
        Rect rect3 = new Rect(xOffset, yOffset, i + xOffset, i2 + yOffset);
        if (animatedDrawableFrameInfo.f6436f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
            canvas.drawRect(rect3, this.f92746l);
        }
        synchronized (this) {
            Bitmap bitmapM117697l = m117697l(width2, height);
            rq0Var.renderFrame(width2, height, bitmapM117697l);
            canvas.drawBitmap(bitmapM117697l, rect2, rect3, (Paint) null);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m117701p(Canvas canvas, rq0 rq0Var, AnimatedDrawableFrameInfo animatedDrawableFrameInfo, AnimatedDrawableFrameInfo animatedDrawableFrameInfo2) {
        float f;
        float f2;
        float f3;
        float f4;
        int width = this.f92737c.getWidth();
        int height = this.f92737c.getHeight();
        float f5 = width;
        float f6 = height;
        int width2 = rq0Var.getWidth();
        int height2 = rq0Var.getHeight();
        int xOffset = rq0Var.getXOffset();
        int yOffset = rq0Var.getYOffset();
        if (f5 > canvas.getWidth() || f6 > canvas.getHeight()) {
            int iMin = Math.min(canvas.getWidth(), width);
            int iMin2 = Math.min(canvas.getHeight(), height);
            float f7 = f5 / f6;
            if (iMin > iMin2) {
                f2 = iMin;
                f = f2 / f7;
            } else {
                f = iMin2;
                f2 = f * f7;
            }
            f3 = f2 / f5;
            f4 = f / f6;
            width2 = (int) Math.ceil(rq0Var.getWidth() * f3);
            height2 = (int) Math.ceil(rq0Var.getHeight() * f4);
            xOffset = (int) Math.ceil(rq0Var.getXOffset() * f3);
            yOffset = (int) Math.ceil(rq0Var.getYOffset() * f4);
        } else {
            f3 = 1.0f;
            f4 = 1.0f;
        }
        Rect rect = new Rect(0, 0, width2, height2);
        Rect rect2 = new Rect(xOffset, yOffset, xOffset + width2, yOffset + height2);
        if (animatedDrawableFrameInfo2 != null) {
            m117696k(canvas, f3, f4, animatedDrawableFrameInfo2);
        }
        if (animatedDrawableFrameInfo.f6436f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
            canvas.drawRect(rect2, this.f92746l);
        }
        synchronized (this) {
            Bitmap bitmapM117697l = m117697l(width2, height2);
            rq0Var.renderFrame(width2, height2, bitmapM117697l);
            canvas.drawBitmap(bitmapM117697l, rect, rect2, (Paint) null);
        }
    }
}
