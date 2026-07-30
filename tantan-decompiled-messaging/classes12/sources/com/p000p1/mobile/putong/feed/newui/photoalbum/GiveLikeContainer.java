package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import l.xdl0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class GiveLikeContainer extends VFrame {

    /* JADX INFO: renamed from: a */
    public Runnable f2361a;

    /* JADX INFO: renamed from: b */
    public C2104a f2362b;

    /* JADX INFO: renamed from: c */
    public boolean f2363c;

    /* JADX INFO: renamed from: d */
    public View.OnClickListener f2364d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.GiveLikeContainer$a */
    public static class C2104a {

        /* JADX INFO: renamed from: a */
        public ArrayList<a> f2365a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.GiveLikeContainer$a$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public int f2366a;

            /* JADX INFO: renamed from: b */
            public long f2367b;

            /* JADX INFO: renamed from: c */
            public float f2368c;

            /* JADX INFO: renamed from: d */
            public float f2369d;

            public a(MotionEvent motionEvent) {
                this.f2366a = 0;
                this.f2367b = 0L;
                this.f2368c = 0.0f;
                this.f2369d = 0.0f;
                this.f2366a = motionEvent.getAction();
                this.f2367b = motionEvent.getEventTime();
                this.f2368c = motionEvent.getX();
                this.f2369d = motionEvent.getY();
            }

            public String toString() {
                int i = this.f2366a;
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

        public C2104a() {
            this.f2365a = new ArrayList<>();
        }

        /* JADX INFO: renamed from: b */
        public boolean m4150b(MotionEvent motionEvent) {
            this.f2365a.add(new a(motionEvent));
            boolean z = false;
            if (motionEvent.getAction() == 3) {
                this.f2365a.clear();
                return false;
            }
            if (motionEvent.getAction() == 1) {
                if (this.f2365a.size() > 1 && this.f2365a.get(0).f2366a == 0) {
                    ArrayList<a> arrayList = this.f2365a;
                    if (arrayList.get(arrayList.size() - 1).f2366a == 1) {
                        int iMin = Math.min(xdl0.y0(), xdl0.w0()) / 50;
                        a aVar = this.f2365a.get(0);
                        int i = 1;
                        while (true) {
                            int size = this.f2365a.size() - 2;
                            ArrayList<a> arrayList2 = this.f2365a;
                            if (i >= size) {
                                if (arrayList2.get(arrayList2.size() - 1).f2367b - aVar.f2367b >= 300) {
                                    break;
                                }
                                z = true;
                                break;
                            }
                            a aVar2 = arrayList2.get(i);
                            if (aVar2.f2366a != 2) {
                                break;
                            }
                            float f = iMin;
                            if (Math.abs(aVar2.f2368c - aVar.f2368c) > f || Math.abs(aVar2.f2369d - aVar.f2369d) > f) {
                                break;
                            }
                            i++;
                        }
                    }
                }
                this.f2365a.clear();
            }
            return z;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            Iterator<a> it = this.f2365a.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
                sb.append(", ");
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public GiveLikeContainer(Context context) {
        super(context);
        this.f2361a = null;
        this.f2362b = new C2104a();
        this.f2363c = false;
        this.f2364d = null;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f2363c = false;
        if (this.f2362b.m4150b(motionEvent)) {
            this.f2361a.run();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m4148s() {
        if (NullChecker.a(this.f2364d)) {
            if (this.f2362b.f2365a.size() == 0 && !this.f2363c) {
                this.f2364d.onClick(null);
            }
            this.f2364d = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setClickView(View.OnClickListener onClickListener) {
        this.f2364d = onClickListener;
        postDelayed(new Runnable() { // from class: l.d1k
            @Override // java.lang.Runnable
            public final void run() {
                this.f6778a.m4148s();
            }
        }, 200L);
    }

    public void setOnClick(Runnable runnable) {
        this.f2361a = runnable;
    }

    public GiveLikeContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2361a = null;
        this.f2362b = new C2104a();
        this.f2363c = false;
        this.f2364d = null;
    }

    public GiveLikeContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2361a = null;
        this.f2362b = new C2104a();
        this.f2363c = false;
        this.f2364d = null;
    }
}
