package com.p051p1.mobile.putong.feed.newui.view;

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
import p153l.a2j0;
import p153l.bnl0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedVideoLikeContainerView extends FrameLayout {

    /* JADX INFO: renamed from: j */
    public static long f44282j = 300;

    /* JADX INFO: renamed from: a */
    public Runnable f44283a;

    /* JADX INFO: renamed from: b */
    public int f44284b;

    /* JADX INFO: renamed from: c */
    public int f44285c;

    /* JADX INFO: renamed from: d */
    public C11547a f44286d;

    /* JADX INFO: renamed from: e */
    public boolean f44287e;

    /* JADX INFO: renamed from: f */
    public boolean f44288f;

    /* JADX INFO: renamed from: g */
    public long f44289g;

    /* JADX INFO: renamed from: h */
    public Handler f44290h;

    /* JADX INFO: renamed from: i */
    public Runnable f44291i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView$a */
    public class C11547a {

        /* JADX INFO: renamed from: a */
        public ArrayList<a> f44292a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView$a$a */
        public class a {

            /* JADX INFO: renamed from: a */
            public int f44294a;

            /* JADX INFO: renamed from: b */
            public long f44295b;

            /* JADX INFO: renamed from: c */
            public float f44296c;

            /* JADX INFO: renamed from: d */
            public float f44297d;

            public a(MotionEvent motionEvent) {
                this.f44294a = 0;
                this.f44295b = 0L;
                this.f44296c = 0.0f;
                this.f44297d = 0.0f;
                this.f44294a = motionEvent.getAction();
                this.f44295b = motionEvent.getEventTime();
                this.f44296c = motionEvent.getX();
                this.f44297d = motionEvent.getY();
            }

            public String toString() {
                int i = this.f44294a;
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

        public C11547a() {
            this.f44292a = new ArrayList<>();
        }

        /* JADX INFO: renamed from: a */
        public boolean m67564a(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 || this.f44292a.size() > 0) {
                this.f44292a.add(new a(motionEvent));
            }
            boolean z = false;
            if (motionEvent.getAction() == 3) {
                this.f44292a.clear();
                return false;
            }
            if (motionEvent.getAction() != 1) {
                if (FeedVideoLikeContainerView.this.f44287e && this.f44292a.size() > 1) {
                    int iMin = Math.min(bnl0.m105592y0(), bnl0.m105592y0()) / 50;
                    a aVar = this.f44292a.get(0);
                    ArrayList<a> arrayList = this.f44292a;
                    if (arrayList.get(arrayList.size() - 1).f44295b - aVar.f44295b >= FeedVideoLikeContainerView.f44282j) {
                        FeedVideoLikeContainerView.this.f44287e = false;
                    }
                    for (int i = 1; i < this.f44292a.size(); i++) {
                        a aVar2 = this.f44292a.get(i);
                        if (aVar2.f44294a == 2) {
                            float f = iMin;
                            if (Math.abs(aVar2.f44296c - aVar.f44296c) > f || Math.abs(aVar2.f44297d - aVar.f44297d) > f) {
                                FeedVideoLikeContainerView.this.f44287e = false;
                            }
                        }
                    }
                    if (!FeedVideoLikeContainerView.this.f44287e) {
                        this.f44292a.clear();
                    }
                }
                return false;
            }
            if (this.f44292a.size() > 1 && this.f44292a.get(0).f44294a == 0) {
                ArrayList<a> arrayList2 = this.f44292a;
                if (arrayList2.get(arrayList2.size() - 1).f44294a == 1) {
                    int iMin2 = Math.min(bnl0.m105592y0(), bnl0.m105588w0()) / 50;
                    a aVar3 = this.f44292a.get(0);
                    int i2 = 1;
                    while (true) {
                        int size = this.f44292a.size() - 2;
                        ArrayList<a> arrayList3 = this.f44292a;
                        if (i2 >= size) {
                            if (arrayList3.get(arrayList3.size() - 1).f44295b - aVar3.f44295b >= FeedVideoLikeContainerView.f44282j) {
                                break;
                            }
                            z = true;
                            break;
                        }
                        a aVar4 = arrayList3.get(i2);
                        if (aVar4.f44294a != 2) {
                            break;
                        }
                        float f2 = iMin2;
                        if (Math.abs(aVar4.f44296c - aVar3.f44296c) > f2 || Math.abs(aVar4.f44297d - aVar3.f44297d) > f2) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            this.f44292a.clear();
            return z;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            Iterator<a> it = this.f44292a.iterator();
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
        this.f44283a = null;
        this.f44286d = new C11547a();
        this.f44287e = false;
        this.f44288f = false;
        this.f44289g = 0L;
        this.f44290h = new Handler();
        this.f44291i = new Runnable() { // from class: l.yai
            @Override // java.lang.Runnable
            public final void run() {
                this.f198207a.m67561c();
            }
        };
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m67561c() {
        this.f44287e = false;
        this.f44288f = true;
        dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, this.f44284b, this.f44285c, 0));
        dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, this.f44284b, this.f44285c, 0));
    }

    /* JADX INFO: renamed from: d */
    public boolean m67562d() {
        long jM95705h = a2j0.m95705h();
        boolean z = false;
        if (jM95705h - this.f44289g < ViewConfiguration.getDoubleTapTimeout()) {
            setVisibility(0);
            z = true;
        }
        this.f44289g = jM95705h;
        return z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f44286d.m67564a(motionEvent)) {
            this.f44284b = (int) motionEvent.getX();
            this.f44285c = (int) motionEvent.getY();
            if (this.f44288f) {
                this.f44288f = false;
                return super.dispatchTouchEvent(motionEvent);
            }
            if (!m67562d()) {
                this.f44290h.postDelayed(this.f44291i, 300L);
                return true;
            }
            if (NullChecker.m82486a(this.f44283a)) {
                this.f44287e = true;
                m67563e();
                this.f44283a.run();
            }
        }
        if (this.f44287e) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e */
    public void m67563e() {
        this.f44290h.removeMessages(0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setOnClick(Runnable runnable) {
        this.f44283a = runnable;
    }

    public FeedVideoLikeContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44283a = null;
        this.f44286d = new C11547a();
        this.f44287e = false;
        this.f44288f = false;
        this.f44289g = 0L;
        this.f44290h = new Handler();
        this.f44291i = new Runnable() { // from class: l.yai
            @Override // java.lang.Runnable
            public final void run() {
                this.f198207a.m67561c();
            }
        };
    }

    public FeedVideoLikeContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44283a = null;
        this.f44286d = new C11547a();
        this.f44287e = false;
        this.f44288f = false;
        this.f44289g = 0L;
        this.f44290h = new Handler();
        this.f44291i = new Runnable() { // from class: l.yai
            @Override // java.lang.Runnable
            public final void run() {
                this.f198207a.m67561c();
            }
        };
    }

    public FeedVideoLikeContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f44283a = null;
        this.f44286d = new C11547a();
        this.f44287e = false;
        this.f44288f = false;
        this.f44289g = 0L;
        this.f44290h = new Handler();
        this.f44291i = new Runnable() { // from class: l.yai
            @Override // java.lang.Runnable
            public final void run() {
                this.f198207a.m67561c();
            }
        };
    }
}
