package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import p151v.VFrame;
import p153l.bnl0;

/* JADX INFO: loaded from: classes13.dex */
public class GiveLikeContainer extends VFrame {

    /* JADX INFO: renamed from: a */
    public Runnable f41748a;

    /* JADX INFO: renamed from: b */
    public C11423a f41749b;

    /* JADX INFO: renamed from: c */
    public boolean f41750c;

    /* JADX INFO: renamed from: d */
    public View.OnClickListener f41751d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.GiveLikeContainer$a */
    public static class C11423a {

        /* JADX INFO: renamed from: a */
        public ArrayList<a> f41752a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.GiveLikeContainer$a$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public int f41753a;

            /* JADX INFO: renamed from: b */
            public long f41754b;

            /* JADX INFO: renamed from: c */
            public float f41755c;

            /* JADX INFO: renamed from: d */
            public float f41756d;

            public a(MotionEvent motionEvent) {
                this.f41753a = 0;
                this.f41754b = 0L;
                this.f41755c = 0.0f;
                this.f41756d = 0.0f;
                this.f41753a = motionEvent.getAction();
                this.f41754b = motionEvent.getEventTime();
                this.f41755c = motionEvent.getX();
                this.f41756d = motionEvent.getY();
            }

            public String toString() {
                int i = this.f41753a;
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

        public C11423a() {
            this.f41752a = new ArrayList<>();
        }

        /* JADX INFO: renamed from: b */
        public boolean m64317b(MotionEvent motionEvent) {
            this.f41752a.add(new a(motionEvent));
            boolean z = false;
            if (motionEvent.getAction() == 3) {
                this.f41752a.clear();
                return false;
            }
            if (motionEvent.getAction() == 1) {
                if (this.f41752a.size() > 1 && this.f41752a.get(0).f41753a == 0) {
                    ArrayList<a> arrayList = this.f41752a;
                    if (arrayList.get(arrayList.size() - 1).f41753a == 1) {
                        int iMin = Math.min(bnl0.m105592y0(), bnl0.m105588w0()) / 50;
                        a aVar = this.f41752a.get(0);
                        int i = 1;
                        while (true) {
                            int size = this.f41752a.size() - 2;
                            ArrayList<a> arrayList2 = this.f41752a;
                            if (i >= size) {
                                if (arrayList2.get(arrayList2.size() - 1).f41754b - aVar.f41754b >= 300) {
                                    break;
                                }
                                z = true;
                                break;
                            }
                            a aVar2 = arrayList2.get(i);
                            if (aVar2.f41753a != 2) {
                                break;
                            }
                            float f = iMin;
                            if (Math.abs(aVar2.f41755c - aVar.f41755c) > f || Math.abs(aVar2.f41756d - aVar.f41756d) > f) {
                                break;
                            }
                            i++;
                        }
                    }
                }
                this.f41752a.clear();
            }
            return z;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            Iterator<a> it = this.f41752a.iterator();
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
        this.f41748a = null;
        this.f41749b = new C11423a();
        this.f41750c = false;
        this.f41751d = null;
    }

    @Override // p151v.VFrame, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f41750c = false;
        if (this.f41749b.m64317b(motionEvent)) {
            this.f41748a.run();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m64315s() {
        if (NullChecker.m82486a(this.f41751d)) {
            if (this.f41749b.f41752a.size() == 0 && !this.f41750c) {
                this.f41751d.onClick(null);
            }
            this.f41751d = null;
        }
    }

    public void setClickView(View.OnClickListener onClickListener) {
        this.f41751d = onClickListener;
        postDelayed(new Runnable() { // from class: l.t3k
            @Override // java.lang.Runnable
            public final void run() {
                this.f171928a.m64315s();
            }
        }, 200L);
    }

    public void setOnClick(Runnable runnable) {
        this.f41748a = runnable;
    }

    public GiveLikeContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41748a = null;
        this.f41749b = new C11423a();
        this.f41750c = false;
        this.f41751d = null;
    }

    public GiveLikeContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41748a = null;
        this.f41749b = new C11423a();
        this.f41750c = false;
        this.f41751d = null;
    }
}
