package com.p046p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import p147v.VFrame;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class GiveLikeContainer extends VFrame {

    /* JADX INFO: renamed from: a */
    public Runnable f40900a;

    /* JADX INFO: renamed from: b */
    public C11260a f40901b;

    /* JADX INFO: renamed from: c */
    public boolean f40902c;

    /* JADX INFO: renamed from: d */
    public View.OnClickListener f40903d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.GiveLikeContainer$a */
    public static class C11260a {

        /* JADX INFO: renamed from: a */
        public ArrayList<a> f40904a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.GiveLikeContainer$a$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public int f40905a;

            /* JADX INFO: renamed from: b */
            public long f40906b;

            /* JADX INFO: renamed from: c */
            public float f40907c;

            /* JADX INFO: renamed from: d */
            public float f40908d;

            public a(MotionEvent motionEvent) {
                this.f40905a = 0;
                this.f40906b = 0L;
                this.f40907c = 0.0f;
                this.f40908d = 0.0f;
                this.f40905a = motionEvent.getAction();
                this.f40906b = motionEvent.getEventTime();
                this.f40907c = motionEvent.getX();
                this.f40908d = motionEvent.getY();
            }

            public String toString() {
                int i = this.f40905a;
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

        public C11260a() {
            this.f40904a = new ArrayList<>();
        }

        /* JADX INFO: renamed from: b */
        public boolean m63134b(MotionEvent motionEvent) {
            this.f40904a.add(new a(motionEvent));
            boolean z = false;
            if (motionEvent.getAction() == 3) {
                this.f40904a.clear();
                return false;
            }
            if (motionEvent.getAction() == 1) {
                if (this.f40904a.size() > 1 && this.f40904a.get(0).f40905a == 0) {
                    ArrayList<a> arrayList = this.f40904a;
                    if (arrayList.get(arrayList.size() - 1).f40905a == 1) {
                        int iMin = Math.min(xdl0.m208412y0(), xdl0.m208408w0()) / 50;
                        a aVar = this.f40904a.get(0);
                        int i = 1;
                        while (true) {
                            int size = this.f40904a.size() - 2;
                            ArrayList<a> arrayList2 = this.f40904a;
                            if (i >= size) {
                                if (arrayList2.get(arrayList2.size() - 1).f40906b - aVar.f40906b >= 300) {
                                    break;
                                }
                                z = true;
                                break;
                            }
                            a aVar2 = arrayList2.get(i);
                            if (aVar2.f40905a != 2) {
                                break;
                            }
                            float f = iMin;
                            if (Math.abs(aVar2.f40907c - aVar.f40907c) > f || Math.abs(aVar2.f40908d - aVar.f40908d) > f) {
                                break;
                            }
                            i++;
                        }
                    }
                }
                this.f40904a.clear();
            }
            return z;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            Iterator<a> it = this.f40904a.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
                sb.append(", ");
            }
            sb.append(Constants.AES_SUFFIX);
            return sb.toString();
        }
    }

    public GiveLikeContainer(Context context) {
        super(context);
        this.f40900a = null;
        this.f40901b = new C11260a();
        this.f40902c = false;
        this.f40903d = null;
    }

    @Override // p147v.VFrame, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f40902c = false;
        if (this.f40901b.m63134b(motionEvent)) {
            this.f40900a.run();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m63132s() {
        if (NullChecker.m81303a(this.f40903d)) {
            if (this.f40901b.f40904a.size() == 0 && !this.f40902c) {
                this.f40903d.onClick(null);
            }
            this.f40903d = null;
        }
    }

    public void setClickView(View.OnClickListener onClickListener) {
        this.f40903d = onClickListener;
        postDelayed(new Runnable() { // from class: l.d1k
            @Override // java.lang.Runnable
            public final void run() {
                this.f83270a.m63132s();
            }
        }, 200L);
    }

    public void setOnClick(Runnable runnable) {
        this.f40900a = runnable;
    }

    public GiveLikeContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40900a = null;
        this.f40901b = new C11260a();
        this.f40902c = false;
        this.f40903d = null;
    }

    public GiveLikeContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40900a = null;
        this.f40901b = new C11260a();
        this.f40902c = false;
        this.f40903d = null;
    }
}
