package com.p051p1.mobile.putong.core.p058ui.messages.media.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import p153l.xqc0;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class RecorderView extends ImageView {

    /* JADX INFO: renamed from: a */
    public xqc0 f32673a;

    /* JADX INFO: renamed from: b */
    public StatusInfo f32674b;

    /* JADX INFO: renamed from: c */
    public long f32675c;

    /* JADX INFO: renamed from: d */
    public long f32676d;

    /* JADX INFO: renamed from: e */
    public long f32677e;

    /* JADX INFO: renamed from: f */
    public Runnable f32678f;

    public static class StatusInfo implements Serializable {

        @SerializedName("isPhoto")
        private boolean isPhoto;

        @SerializedName("path")
        private String mPath;

        @SerializedName("text")
        private String mText;

        public StatusInfo(String str, boolean z) {
            this.mPath = str;
            this.isPhoto = z;
        }

        public String getPath() {
            return this.mPath;
        }

        public String getText() {
            return this.mText;
        }

        public boolean isPhoto() {
            return this.isPhoto;
        }

        public void setText(String str) {
            this.mText = str;
        }

        @NonNull
        public String toString() {
            return "path = " + this.mPath + ", text = " + this.mText + ", isPhoto = " + this.isPhoto;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.media.widget.RecorderView$a */
    public class RunnableC8698a implements Runnable {
        public RunnableC8698a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecorderView.this.f32673a.mo101232h();
        }
    }

    public RecorderView(Context context) {
        super(context);
        this.f32675c = 0L;
        this.f32676d = 0L;
        this.f32678f = new RunnableC8698a();
    }

    /* JADX INFO: renamed from: b */
    public RectF m50393b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* JADX INFO: renamed from: c */
    public final boolean m50394c(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f32675c = System.currentTimeMillis();
            return true;
        }
        if (action == 1 && this.f32673a != null && this.f32674b != null && m50395d(this, (int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && System.currentTimeMillis() - this.f32675c < 300) {
            this.f32673a.mo101226b(this.f32674b.getPath(), this.f32674b.isPhoto());
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: d */
    public boolean m50395d(View view, int i, int i2) {
        return m50393b(view).top < ((float) i2);
    }

    public StatusInfo getStatusInfo() {
        return this.f32674b;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        xqc0 xqc0Var;
        if (motionEvent.getAction() == 0) {
            if (System.currentTimeMillis() - this.f32676d < 300) {
                this.f32676d = System.currentTimeMillis();
                return false;
            }
            this.f32676d = System.currentTimeMillis();
        }
        if (this.f32674b != null) {
            return m50394c(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f32677e = System.currentTimeMillis();
            xqc0 xqc0Var2 = this.f32673a;
            if (xqc0Var2 != null) {
                if (xqc0Var2.mo101227c()) {
                    return super.onTouchEvent(motionEvent);
                }
                postDelayed(this.f32678f, 300L);
            }
            return true;
        }
        if (action == 2) {
            boolean zM50395d = m50395d(this, (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            xqc0 xqc0Var3 = this.f32673a;
            if (zM50395d) {
                if (xqc0Var3 != null) {
                    xqc0Var3.mo101230f();
                }
            } else if (xqc0Var3 != null) {
                xqc0Var3.mo101229e();
            }
        } else if (action == 1 || action == 3) {
            if (System.currentTimeMillis() - this.f32677e <= 300) {
                xqc0 xqc0Var4 = this.f32673a;
                if (xqc0Var4 != null) {
                    xqc0Var4.mo101231g();
                    removeCallbacks(this.f32678f);
                }
            } else if (m50395d(this, (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                xqc0 xqc0Var5 = this.f32673a;
                if (xqc0Var5 != null) {
                    xqc0Var5.mo101228d();
                }
            } else if (!m50395d(this, (int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && (xqc0Var = this.f32673a) != null) {
                xqc0Var.onCancel();
            }
            xqc0 xqc0Var6 = this.f32673a;
            if (xqc0Var6 != null) {
                xqc0Var6.mo101225a();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setRecorderCallback(xqc0 xqc0Var) {
        this.f32673a = xqc0Var;
    }

    public void setStatusInfo(StatusInfo statusInfo) {
        this.f32674b = statusInfo;
    }

    public RecorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32675c = 0L;
        this.f32676d = 0L;
        this.f32678f = new RunnableC8698a();
    }

    public RecorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32675c = 0L;
        this.f32676d = 0L;
        this.f32678f = new RunnableC8698a();
    }
}
