package com.p000p1.mobile.putong.core.newui.home.justreal;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.e30;
import l.mkd0;
import l.roj0;
import l.t100;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class JustRealAvatarRootLayout extends ViewGroup implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public List<C0167a> f1845a;

    /* JADX INFO: renamed from: b */
    public int[] f1846b;

    /* JADX INFO: renamed from: c */
    public PathInterpolator f1847c;

    /* JADX INFO: renamed from: d */
    public e30<Integer> f1848d;

    /* JADX INFO: renamed from: e */
    public int f1849e;

    /* JADX INFO: renamed from: f */
    public e30<User> f1850f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealAvatarRootLayout$a */
    public static class C0167a {

        /* JADX INFO: renamed from: a */
        public JustRealAvatarItem f1851a;

        /* JADX INFO: renamed from: f */
        public int f1856f;

        /* JADX INFO: renamed from: g */
        public int f1857g;

        /* JADX INFO: renamed from: k */
        public long f1861k;

        /* JADX INFO: renamed from: l */
        public long f1862l;

        /* JADX INFO: renamed from: b */
        public float f1852b = 0.0f;

        /* JADX INFO: renamed from: c */
        public float f1853c = 0.0f;

        /* JADX INFO: renamed from: d */
        public float f1854d = 0.0f;

        /* JADX INFO: renamed from: e */
        public float f1855e = 0.0f;

        /* JADX INFO: renamed from: h */
        public float f1858h = 0.0f;

        /* JADX INFO: renamed from: i */
        public float f1859i = 0.0f;

        /* JADX INFO: renamed from: j */
        public float f1860j = 0.0f;

        public C0167a(Context context) {
            this.f1851a = new JustRealAvatarItem(context);
        }

        /* JADX INFO: renamed from: a */
        public void m2627a() {
            this.f1859i = this.f1858h;
            this.f1854d = this.f1852b;
        }

        /* JADX INFO: renamed from: b */
        public void m2628b() {
            this.f1858h = 1.0f;
            this.f1852b = 0.0f;
            this.f1853c = 0.0f;
        }

        /* JADX INFO: renamed from: c */
        public void m2629c() {
            this.f1860j = 1.0f;
            this.f1855e = this.f1857g * t100.d(16.0f);
            m2627a();
            long jElapsedRealtime = SystemClock.elapsedRealtime() + (((long) this.f1857g) * 20);
            this.f1861k = jElapsedRealtime;
            this.f1862l = jElapsedRealtime + 300;
        }

        /* JADX INFO: renamed from: d */
        public void m2630d(float f, float f2) {
            float f3 = this.f1859i;
            this.f1858h = Math.min(1.0f, Math.max(0.0f, f3 + ((this.f1860j - f3) * f2 * 1.5f)));
            float f4 = this.f1854d;
            float f5 = this.f1855e;
            this.f1852b = ((f5 - f4) * f) + f4;
            this.f1853c = f4 + ((f5 - f4) * f2);
        }
    }

    public JustRealAvatarRootLayout(@NonNull Context context) {
        super(context);
        this.f1846b = new int[]{-65536, -16711936, -16776961, -256};
        this.f1849e = t100.d(28.0f);
        m2622d();
    }

    /* JADX INFO: renamed from: c */
    public final void m2621c(User user, boolean z) {
        C0167a next;
        Iterator<C0167a> it = this.f1845a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.f1857g >= 0);
        if (next == null) {
            return;
        }
        next.f1857g = 0;
        next.m2628b();
        next.m2629c();
        next.f1856f = this.f1845a.size() - 1;
        next.f1851a.m2618b(user);
        if (NullChecker.a(this.f1850f)) {
            this.f1850f.call(user);
        }
        for (C0167a c0167a : this.f1845a) {
            if (c0167a != next && c0167a.f1857g >= 0) {
                c0167a.f1856f = ((this.f1845a.size() + c0167a.f1856f) - 1) % this.f1845a.size();
                c0167a.f1857g++;
                c0167a.m2629c();
                if (c0167a.f1857g == this.f1845a.size() - 1) {
                    c0167a.f1860j = 0.0f;
                }
            }
        }
        if (!z) {
            next.m2630d(1.0f, 1.0f);
        } else {
            m2626h();
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2622d() {
        this.f1847c = new PathInterpolator(0.8f, 0.52f, 0.63f, 1.31f);
        this.f1845a = new ArrayList();
        for (int i = 0; i < 4; i++) {
            C0167a c0167a = new C0167a(getContext());
            c0167a.f1856f = 3 - i;
            c0167a.f1857g = -1;
            c0167a.f1858h = 0.0f;
            this.f1845a.add(c0167a);
            JustRealAvatarItem justRealAvatarItem = c0167a.f1851a;
            int i2 = this.f1849e;
            addView(justRealAvatarItem, new ViewGroup.LayoutParams(i2, i2));
            c0167a.f1851a.setElevation(0.0f);
            c0167a.f1851a.setAlpha(1.0f);
        }
        setLayerType(0, null);
        setChildrenDrawingOrderEnabled(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        for (C0167a c0167a : this.f1845a) {
            if (c0167a.f1857g >= 0 && jElapsedRealtime >= c0167a.f1861k) {
                long jMin = Math.min(c0167a.f1862l, jElapsedRealtime);
                long j2 = c0167a.f1861k;
                float f = (jMin - j2) / (c0167a.f1862l - j2);
                c0167a.m2630d(this.f1847c.getInterpolation(f), f);
                if (jElapsedRealtime < c0167a.f1862l) {
                    z = true;
                }
            }
        }
        if (z) {
            Choreographer.getInstance().postFrameCallback(this);
        }
        for (C0167a c0167a2 : this.f1845a) {
            if (c0167a2.f1857g == this.f1845a.size() - 1 && jElapsedRealtime >= c0167a2.f1862l) {
                c0167a2.f1857g = -1;
                c0167a2.f1858h = 0.0f;
            }
        }
        m2626h();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m2623e(User user) {
        m2621c(user, true);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m2624f(roj0 roj0Var) {
        if (vwb.J(this.f1845a)) {
            return;
        }
        for (int i = 0; i < this.f1845a.size(); i++) {
            C0167a c0167a = this.f1845a.get(i);
            c0167a.f1856f = 3 - i;
            c0167a.f1857g = -1;
            c0167a.f1858h = 0.0f;
            c0167a.f1851a.setElevation(0.0f);
            c0167a.f1851a.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m2625g(Act act) {
        act.duringCreated(CoreModule.c.z2.u3()).subscribe(mkd0.G(new e30() { // from class: l.yqq
            public final void call(Object obj) {
                this.f23211a.m2623e((User) obj);
            }
        }));
        act.duringCreated(CoreModule.c.z2.U).subscribe(mkd0.G(new e30() { // from class: l.zqq
            public final void call(Object obj) {
                this.f23838a.m2624f((roj0) obj);
            }
        }));
        ArrayList arrayList = new ArrayList();
        List listL3 = CoreModule.c.z2.l3();
        if (vwb.J(listL3)) {
            return;
        }
        int iMin = Math.min(3, listL3.size());
        for (int i = 0; i < iMin; i++) {
            arrayList.add(0, ((CoreJustVerificationCardApi.a) listL3.get((listL3.size() - 1) - i)).a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m2621c((User) it.next(), true);
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f1845a.get(i2).f1856f;
        int i4 = 0;
        while (true) {
            int size = this.f1845a.size();
            List<C0167a> list = this.f1845a;
            if (i4 >= size) {
                return list.get(i2).f1856f;
            }
            if (list.get(i4).f1856f == i2) {
                return i4;
            }
            i4++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2626h() {
        float fMax = 0.0f;
        for (C0167a c0167a : this.f1845a) {
            int i = c0167a.f1857g;
            JustRealAvatarItem justRealAvatarItem = c0167a.f1851a;
            if (i >= 0) {
                justRealAvatarItem.setAlpha(c0167a.f1858h);
                c0167a.f1851a.setTranslationX(c0167a.f1852b);
                if (c0167a.f1857g < this.f1845a.size() - 1) {
                    fMax = Math.max(c0167a.f1853c, fMax);
                }
                if (c0167a.f1857g == this.f1845a.size() - 1) {
                    fMax = Math.max(c0167a.f1854d, fMax);
                }
            } else {
                justRealAvatarItem.setAlpha(0.0f);
            }
        }
        invalidate();
        requestLayout();
        if (NullChecker.a(this.f1848d)) {
            this.f1848d.call(Integer.valueOf((int) fMax));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int size = this.f1845a.size();
        for (int i5 = 0; i5 < size; i5++) {
            JustRealAvatarItem justRealAvatarItem = this.f1845a.get(i5).f1851a;
            int i6 = this.f1849e;
            justRealAvatarItem.layout(0, 0, i6, i6);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = this.f1845a.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f1845a.get(i3).f1851a.measure(View.MeasureSpec.makeMeasureSpec(this.f1849e, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f1849e, 1073741824));
        }
    }

    public void setRenderUserCall(e30<User> e30Var) {
        this.f1850f = e30Var;
    }

    public void setTitleTransCall(e30<Integer> e30Var) {
        this.f1848d = e30Var;
    }

    public JustRealAvatarRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1846b = new int[]{-65536, -16711936, -16776961, -256};
        this.f1849e = t100.d(28.0f);
        m2622d();
    }

    public JustRealAvatarRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1846b = new int[]{-65536, -16711936, -16776961, -256};
        this.f1849e = t100.d(28.0f);
        m2622d();
    }
}
