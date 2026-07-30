package com.p046p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import p149l.xdl0;
import p149l.xsi0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedVideoLikeContainerView extends FrameLayout {

    /* JADX INFO: renamed from: j */
    public static long f43434j = 300;

    /* JADX INFO: renamed from: a */
    public Runnable f43435a;

    /* JADX INFO: renamed from: b */
    public int f43436b;

    /* JADX INFO: renamed from: c */
    public int f43437c;

    /* JADX INFO: renamed from: d */
    public C11384a f43438d;

    /* JADX INFO: renamed from: e */
    public boolean f43439e;

    /* JADX INFO: renamed from: f */
    public boolean f43440f;

    /* JADX INFO: renamed from: g */
    public long f43441g;

    /* JADX INFO: renamed from: h */
    public Handler f43442h;

    /* JADX INFO: renamed from: i */
    public Runnable f43443i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView$a */
    public class C11384a {

        /* JADX INFO: renamed from: a */
        public ArrayList<a> f43444a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView$a$a */
        public class a {

            /* JADX INFO: renamed from: a */
            public int f43446a;

            /* JADX INFO: renamed from: b */
            public long f43447b;

            /* JADX INFO: renamed from: c */
            public float f43448c;

            /* JADX INFO: renamed from: d */
            public float f43449d;

            public a(MotionEvent motionEvent) {
                this.f43446a = 0;
                this.f43447b = 0L;
                this.f43448c = 0.0f;
                this.f43449d = 0.0f;
                this.f43446a = motionEvent.getAction();
                this.f43447b = motionEvent.getEventTime();
                this.f43448c = motionEvent.getX();
                this.f43449d = motionEvent.getY();
            }

            public String toString() {
                int i = this.f43446a;
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

        public C11384a() {
            this.f43444a = new ArrayList<>();
        }

        /* JADX INFO: renamed from: a */
        public boolean m66381a(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 || this.f43444a.size() > 0) {
                this.f43444a.add(new a(motionEvent));
            }
            boolean z = false;
            if (motionEvent.getAction() == 3) {
                this.f43444a.clear();
                return false;
            }
            if (motionEvent.getAction() != 1) {
                if (FeedVideoLikeContainerView.this.f43439e && this.f43444a.size() > 1) {
                    int iMin = Math.min(xdl0.m208412y0(), xdl0.m208412y0()) / 50;
                    a aVar = this.f43444a.get(0);
                    ArrayList<a> arrayList = this.f43444a;
                    if (arrayList.get(arrayList.size() - 1).f43447b - aVar.f43447b >= FeedVideoLikeContainerView.f43434j) {
                        FeedVideoLikeContainerView.this.f43439e = false;
                    }
                    for (int i = 1; i < this.f43444a.size(); i++) {
                        a aVar2 = this.f43444a.get(i);
                        if (aVar2.f43446a == 2) {
                            float f = iMin;
                            if (Math.abs(aVar2.f43448c - aVar.f43448c) > f || Math.abs(aVar2.f43449d - aVar.f43449d) > f) {
                                FeedVideoLikeContainerView.this.f43439e = false;
                            }
                        }
                    }
                    if (!FeedVideoLikeContainerView.this.f43439e) {
                        this.f43444a.clear();
                    }
                }
                return false;
            }
            if (this.f43444a.size() > 1 && this.f43444a.get(0).f43446a == 0) {
                ArrayList<a> arrayList2 = this.f43444a;
                if (arrayList2.get(arrayList2.size() - 1).f43446a == 1) {
                    int iMin2 = Math.min(xdl0.m208412y0(), xdl0.m208408w0()) / 50;
                    a aVar3 = this.f43444a.get(0);
                    int i2 = 1;
                    while (true) {
                        int size = this.f43444a.size() - 2;
                        ArrayList<a> arrayList3 = this.f43444a;
                        if (i2 >= size) {
                            if (arrayList3.get(arrayList3.size() - 1).f43447b - aVar3.f43447b >= FeedVideoLikeContainerView.f43434j) {
                                break;
                            }
                            z = true;
                            break;
                        }
                        a aVar4 = arrayList3.get(i2);
                        if (aVar4.f43446a != 2) {
                            break;
                        }
                        float f2 = iMin2;
                        if (Math.abs(aVar4.f43448c - aVar3.f43448c) > f2 || Math.abs(aVar4.f43449d - aVar3.f43449d) > f2) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            this.f43444a.clear();
            return z;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            Iterator<a> it = this.f43444a.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
                sb.append(", ");
            }
            sb.append(Constants.AES_SUFFIX);
            return sb.toString();
        }
    }

    public FeedVideoLikeContainerView(@NonNull Context context) {
        super(context);
        this.f43435a = null;
        this.f43438d = new C11384a();
        this.f43439e = false;
        this.f43440f = false;
        this.f43441g = 0L;
        this.f43442h = new Handler();
        this.f43443i = new Runnable() { // from class: l.j9i
            @Override // java.lang.Runnable
            public final void run() {
                this.f116929a.m66378c();
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m66378c() {
        this.f43439e = false;
        this.f43440f = true;
        dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, this.f43436b, this.f43437c, 0));
        dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, this.f43436b, this.f43437c, 0));
    }

    /* JADX INFO: renamed from: d */
    public boolean m66379d() {
        long jM210767h = xsi0.m210767h();
        boolean z = false;
        if (jM210767h - this.f43441g < ViewConfiguration.getDoubleTapTimeout()) {
            setVisibility(0);
            z = true;
        }
        this.f43441g = jM210767h;
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f43438d.m66381a(motionEvent)) {
            this.f43436b = (int) motionEvent.getX();
            this.f43437c = (int) motionEvent.getY();
            if (this.f43440f) {
                this.f43440f = false;
                return super.dispatchTouchEvent(motionEvent);
            }
            if (!m66379d()) {
                this.f43442h.postDelayed(this.f43443i, 300L);
                return true;
            }
            if (NullChecker.m81303a(this.f43435a)) {
                this.f43439e = true;
                m66380e();
                this.f43435a.run();
            }
        }
        if (this.f43439e) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public void m66380e() {
        this.f43442h.removeMessages(0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setOnClick(Runnable runnable) {
        this.f43435a = runnable;
    }

    public FeedVideoLikeContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43435a = null;
        this.f43438d = new C11384a();
        this.f43439e = false;
        this.f43440f = false;
        this.f43441g = 0L;
        this.f43442h = new Handler();
        this.f43443i = new Runnable() { // from class: l.j9i
            @Override // java.lang.Runnable
            public final void run() {
                this.f116929a.m66378c();
            }
        };
    }

    public FeedVideoLikeContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43435a = null;
        this.f43438d = new C11384a();
        this.f43439e = false;
        this.f43440f = false;
        this.f43441g = 0L;
        this.f43442h = new Handler();
        this.f43443i = new Runnable() { // from class: l.j9i
            @Override // java.lang.Runnable
            public final void run() {
                this.f116929a.m66378c();
            }
        };
    }

    public FeedVideoLikeContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f43435a = null;
        this.f43438d = new C11384a();
        this.f43439e = false;
        this.f43440f = false;
        this.f43441g = 0L;
        this.f43442h = new Handler();
        this.f43443i = new Runnable() { // from class: l.j9i
            @Override // java.lang.Runnable
            public final void run() {
                this.f116929a.m66378c();
            }
        };
    }
}
