package com.p000p1.mobile.putong.core.p001ui.messages.media.widget;

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
import org.spongycastle.i18n.TextBundle;
import p003l.qic0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class RecorderView extends ImageView {

    /* JADX INFO: renamed from: a */
    public qic0 f1716a;

    /* JADX INFO: renamed from: b */
    public StatusInfo f1717b;

    /* JADX INFO: renamed from: c */
    public long f1718c;

    /* JADX INFO: renamed from: d */
    public long f1719d;

    /* JADX INFO: renamed from: e */
    public long f1720e;

    /* JADX INFO: renamed from: f */
    public Runnable f1721f;

    public static class StatusInfo implements Serializable {

        @SerializedName("isPhoto")
        private boolean isPhoto;

        @SerializedName("path")
        private String mPath;

        @SerializedName(TextBundle.TEXT_ENTRY)
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
    public class RunnableC0118a implements Runnable {
        public RunnableC0118a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecorderView.this.f1716a.mo3736h();
        }
    }

    public RecorderView(Context context) {
        super(context);
        this.f1718c = 0L;
        this.f1719d = 0L;
        this.f1721f = new RunnableC0118a();
    }

    /* JADX INFO: renamed from: b */
    public RectF m2329b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2330c(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f1718c = System.currentTimeMillis();
            return true;
        }
        if (action == 1 && this.f1716a != null && this.f1717b != null && m2331d(this, (int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && System.currentTimeMillis() - this.f1718c < 300) {
            this.f1716a.mo3730b(this.f1717b.getPath(), this.f1717b.isPhoto());
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: d */
    public boolean m2331d(View view, int i, int i2) {
        return m2329b(view).top < ((float) i2);
    }

    public StatusInfo getStatusInfo() {
        return this.f1717b;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        qic0 qic0Var;
        if (motionEvent.getAction() == 0) {
            if (System.currentTimeMillis() - this.f1719d < 300) {
                this.f1719d = System.currentTimeMillis();
                return false;
            }
            this.f1719d = System.currentTimeMillis();
        }
        if (this.f1717b != null) {
            return m2330c(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f1720e = System.currentTimeMillis();
            qic0 qic0Var2 = this.f1716a;
            if (qic0Var2 != null) {
                if (qic0Var2.mo3731c()) {
                    return super.onTouchEvent(motionEvent);
                }
                postDelayed(this.f1721f, 300L);
            }
            return true;
        }
        if (action == 2) {
            boolean zM2331d = m2331d(this, (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            qic0 qic0Var3 = this.f1716a;
            if (zM2331d) {
                if (qic0Var3 != null) {
                    qic0Var3.mo3734f();
                }
            } else if (qic0Var3 != null) {
                qic0Var3.mo3733e();
            }
        } else if (action == 1 || action == 3) {
            if (System.currentTimeMillis() - this.f1720e <= 300) {
                qic0 qic0Var4 = this.f1716a;
                if (qic0Var4 != null) {
                    qic0Var4.mo3735g();
                    removeCallbacks(this.f1721f);
                }
            } else if (m2331d(this, (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                qic0 qic0Var5 = this.f1716a;
                if (qic0Var5 != null) {
                    qic0Var5.mo3732d();
                }
            } else if (!m2331d(this, (int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && (qic0Var = this.f1716a) != null) {
                qic0Var.onCancel();
            }
            qic0 qic0Var6 = this.f1716a;
            if (qic0Var6 != null) {
                qic0Var6.mo3729a();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setRecorderCallback(qic0 qic0Var) {
        this.f1716a = qic0Var;
    }

    public void setStatusInfo(StatusInfo statusInfo) {
        this.f1717b = statusInfo;
    }

    public RecorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1718c = 0L;
        this.f1719d = 0L;
        this.f1721f = new RunnableC0118a();
    }

    public RecorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1718c = 0L;
        this.f1719d = 0L;
        this.f1721f = new RunnableC0118a();
    }
}
