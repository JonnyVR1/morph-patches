package com.p046p1.mobile.putong.core.p053ui.messages.media.widget;

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
import p149l.qic0;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class RecorderView extends ImageView {

    /* JADX INFO: renamed from: a */
    public qic0 f31825a;

    /* JADX INFO: renamed from: b */
    public StatusInfo f31826b;

    /* JADX INFO: renamed from: c */
    public long f31827c;

    /* JADX INFO: renamed from: d */
    public long f31828d;

    /* JADX INFO: renamed from: e */
    public long f31829e;

    /* JADX INFO: renamed from: f */
    public Runnable f31830f;

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
    public class RunnableC8535a implements Runnable {
        public RunnableC8535a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecorderView.this.f31825a.mo113253h();
        }
    }

    public RecorderView(Context context) {
        super(context);
        this.f31827c = 0L;
        this.f31828d = 0L;
        this.f31830f = new RunnableC8535a();
    }

    /* JADX INFO: renamed from: b */
    public RectF m49210b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* JADX INFO: renamed from: c */
    public final boolean m49211c(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f31827c = System.currentTimeMillis();
            return true;
        }
        if (action == 1 && this.f31825a != null && this.f31826b != null && m49212d(this, (int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && System.currentTimeMillis() - this.f31827c < 300) {
            this.f31825a.mo113247b(this.f31826b.getPath(), this.f31826b.isPhoto());
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: d */
    public boolean m49212d(View view, int i, int i2) {
        return m49210b(view).top < ((float) i2);
    }

    public StatusInfo getStatusInfo() {
        return this.f31826b;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        qic0 qic0Var;
        if (motionEvent.getAction() == 0) {
            if (System.currentTimeMillis() - this.f31828d < 300) {
                this.f31828d = System.currentTimeMillis();
                return false;
            }
            this.f31828d = System.currentTimeMillis();
        }
        if (this.f31826b != null) {
            return m49211c(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f31829e = System.currentTimeMillis();
            qic0 qic0Var2 = this.f31825a;
            if (qic0Var2 != null) {
                if (qic0Var2.mo113248c()) {
                    return super.onTouchEvent(motionEvent);
                }
                postDelayed(this.f31830f, 300L);
            }
            return true;
        }
        if (action == 2) {
            boolean zM49212d = m49212d(this, (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            qic0 qic0Var3 = this.f31825a;
            if (zM49212d) {
                if (qic0Var3 != null) {
                    qic0Var3.mo113251f();
                }
            } else if (qic0Var3 != null) {
                qic0Var3.mo113250e();
            }
        } else if (action == 1 || action == 3) {
            if (System.currentTimeMillis() - this.f31829e <= 300) {
                qic0 qic0Var4 = this.f31825a;
                if (qic0Var4 != null) {
                    qic0Var4.mo113252g();
                    removeCallbacks(this.f31830f);
                }
            } else if (m49212d(this, (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                qic0 qic0Var5 = this.f31825a;
                if (qic0Var5 != null) {
                    qic0Var5.mo113249d();
                }
            } else if (!m49212d(this, (int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && (qic0Var = this.f31825a) != null) {
                qic0Var.onCancel();
            }
            qic0 qic0Var6 = this.f31825a;
            if (qic0Var6 != null) {
                qic0Var6.mo113246a();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setRecorderCallback(qic0 qic0Var) {
        this.f31825a = qic0Var;
    }

    public void setStatusInfo(StatusInfo statusInfo) {
        this.f31826b = statusInfo;
    }

    public RecorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31827c = 0L;
        this.f31828d = 0L;
        this.f31830f = new RunnableC8535a();
    }

    public RecorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31827c = 0L;
        this.f31828d = 0L;
        this.f31830f = new RunnableC8535a();
    }
}
