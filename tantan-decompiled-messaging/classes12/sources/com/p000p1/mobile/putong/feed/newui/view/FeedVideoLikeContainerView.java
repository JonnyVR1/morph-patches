package com.p000p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import l.xdl0;
import l.xsi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedVideoLikeContainerView extends FrameLayout {

    /* JADX INFO: renamed from: j */
    public static long f4895j = 300;

    /* JADX INFO: renamed from: a */
    public Runnable f4896a;

    /* JADX INFO: renamed from: b */
    public int f4897b;

    /* JADX INFO: renamed from: c */
    public int f4898c;

    /* JADX INFO: renamed from: d */
    public C2228a f4899d;

    /* JADX INFO: renamed from: e */
    public boolean f4900e;

    /* JADX INFO: renamed from: f */
    public boolean f4901f;

    /* JADX INFO: renamed from: g */
    public long f4902g;

    /* JADX INFO: renamed from: h */
    public Handler f4903h;

    /* JADX INFO: renamed from: i */
    public Runnable f4904i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView$a */
    public class C2228a {

        /* JADX INFO: renamed from: a */
        public ArrayList<a> f4905a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView$a$a */
        public class a {

            /* JADX INFO: renamed from: a */
            public int f4907a;

            /* JADX INFO: renamed from: b */
            public long f4908b;

            /* JADX INFO: renamed from: c */
            public float f4909c;

            /* JADX INFO: renamed from: d */
            public float f4910d;

            public a(MotionEvent motionEvent) {
                this.f4907a = 0;
                this.f4908b = 0L;
                this.f4909c = 0.0f;
                this.f4910d = 0.0f;
                this.f4907a = motionEvent.getAction();
                this.f4908b = motionEvent.getEventTime();
                this.f4909c = motionEvent.getX();
                this.f4910d = motionEvent.getY();
            }

            public String toString() {
                int i = this.f4907a;
                if (i == 0) {
                    return "down";
                }
                if (i == 1) {
                    return "up";
                }
                if (i != 2) {
                    return i != 3 ? "" : "cancel";
                }
                return "move";
            }
        }

        public C2228a() {
            this.f4905a = new ArrayList<>();
        }

        /* JADX INFO: renamed from: a */
        public boolean m7546a(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 || this.f4905a.size() > 0) {
                this.f4905a.add(new a(motionEvent));
            }
            boolean z = false;
            if (motionEvent.getAction() == 3) {
                this.f4905a.clear();
                return false;
            }
            if (motionEvent.getAction() != 1) {
                if (FeedVideoLikeContainerView.this.f4900e && this.f4905a.size() > 1) {
                    int iMin = Math.min(xdl0.y0(), xdl0.y0()) / 50;
                    a aVar = this.f4905a.get(0);
                    ArrayList<a> arrayList = this.f4905a;
                    if (arrayList.get(arrayList.size() - 1).f4908b - aVar.f4908b >= FeedVideoLikeContainerView.f4895j) {
                        FeedVideoLikeContainerView.this.f4900e = false;
                    }
                    for (int i = 1; i < this.f4905a.size(); i++) {
                        a aVar2 = this.f4905a.get(i);
                        if (aVar2.f4907a == 2) {
                            float f = iMin;
                            if (Math.abs(aVar2.f4909c - aVar.f4909c) > f || Math.abs(aVar2.f4910d - aVar.f4910d) > f) {
                                FeedVideoLikeContainerView.this.f4900e = false;
                            }
                        }
                    }
                    if (!FeedVideoLikeContainerView.this.f4900e) {
                        this.f4905a.clear();
                    }
                }
                return false;
            }
            if (this.f4905a.size() > 1 && this.f4905a.get(0).f4907a == 0) {
                ArrayList<a> arrayList2 = this.f4905a;
                if (arrayList2.get(arrayList2.size() - 1).f4907a == 1) {
                    int iMin2 = Math.min(xdl0.y0(), xdl0.w0()) / 50;
                    a aVar3 = this.f4905a.get(0);
                    int i2 = 1;
                    while (true) {
                        int size = this.f4905a.size() - 2;
                        ArrayList<a> arrayList3 = this.f4905a;
                        if (i2 >= size) {
                            if (arrayList3.get(arrayList3.size() - 1).f4908b - aVar3.f4908b >= FeedVideoLikeContainerView.f4895j) {
                                break;
                            }
                            z = true;
                            break;
                        }
                        a aVar4 = arrayList3.get(i2);
                        if (aVar4.f4907a != 2) {
                            break;
                        }
                        float f2 = iMin2;
                        if (Math.abs(aVar4.f4909c - aVar3.f4909c) > f2 || Math.abs(aVar4.f4910d - aVar3.f4910d) > f2) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            this.f4905a.clear();
            return z;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            Iterator<a> it = this.f4905a.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
                sb.append(", ");
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public FeedVideoLikeContainerView(@NonNull Context context) {
        super(context);
        this.f4896a = null;
        this.f4899d = new C2228a();
        this.f4900e = false;
        this.f4901f = false;
        this.f4902g = 0L;
        this.f4903h = new Handler();
        this.f4904i = new Runnable() { // from class: l.j9i
            @Override // java.lang.Runnable
            public final void run() {
                this.f9289a.m7543c();
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m7543c() {
        this.f4900e = false;
        this.f4901f = true;
        dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, this.f4897b, this.f4898c, 0));
        dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, this.f4897b, this.f4898c, 0));
    }

    /* JADX INFO: renamed from: d */
    public boolean m7544d() {
        long jH = xsi0.h();
        boolean z = false;
        if (jH - this.f4902g < ViewConfiguration.getDoubleTapTimeout()) {
            setVisibility(0);
            z = true;
        }
        this.f4902g = jH;
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f4899d.m7546a(motionEvent)) {
            this.f4897b = (int) motionEvent.getX();
            this.f4898c = (int) motionEvent.getY();
            if (this.f4901f) {
                this.f4901f = false;
                return super.dispatchTouchEvent(motionEvent);
            }
            if (!m7544d()) {
                this.f4903h.postDelayed(this.f4904i, 300L);
                return true;
            }
            if (NullChecker.a(this.f4896a)) {
                this.f4900e = true;
                m7545e();
                this.f4896a.run();
            }
        }
        if (this.f4900e) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public void m7545e() {
        this.f4903h.removeMessages(0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setOnClick(Runnable runnable) {
        this.f4896a = runnable;
    }

    public FeedVideoLikeContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4896a = null;
        this.f4899d = new C2228a();
        this.f4900e = false;
        this.f4901f = false;
        this.f4902g = 0L;
        this.f4903h = new Handler();
        this.f4904i = new Runnable() { // from class: l.j9i
            @Override // java.lang.Runnable
            public final void run() {
                this.f9289a.m7543c();
            }
        };
    }

    public FeedVideoLikeContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4896a = null;
        this.f4899d = new C2228a();
        this.f4900e = false;
        this.f4901f = false;
        this.f4902g = 0L;
        this.f4903h = new Handler();
        this.f4904i = new Runnable() { // from class: l.j9i
            @Override // java.lang.Runnable
            public final void run() {
                this.f9289a.m7543c();
            }
        };
    }

    public FeedVideoLikeContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4896a = null;
        this.f4899d = new C2228a();
        this.f4900e = false;
        this.f4901f = false;
        this.f4902g = 0L;
        this.f4903h = new Handler();
        this.f4904i = new Runnable() { // from class: l.j9i
            @Override // java.lang.Runnable
            public final void run() {
                this.f9289a.m7543c();
            }
        };
    }
}
