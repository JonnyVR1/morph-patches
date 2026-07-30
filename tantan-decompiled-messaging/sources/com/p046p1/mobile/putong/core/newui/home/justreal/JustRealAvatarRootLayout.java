package com.p046p1.mobile.putong.core.newui.home.justreal;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreJustVerificationCardApi;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.e30;
import p149l.mkd0;
import p149l.roj0;
import p149l.t100;
import p149l.vwb;

/* JADX INFO: loaded from: classes11.dex */
public class JustRealAvatarRootLayout extends ViewGroup implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public List<C8003a> f23067a;

    /* JADX INFO: renamed from: b */
    public int[] f23068b;

    /* JADX INFO: renamed from: c */
    public PathInterpolator f23069c;

    /* JADX INFO: renamed from: d */
    public e30<Integer> f23070d;

    /* JADX INFO: renamed from: e */
    public int f23071e;

    /* JADX INFO: renamed from: f */
    public e30<User> f23072f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.justreal.JustRealAvatarRootLayout$a */
    public static class C8003a {

        /* JADX INFO: renamed from: a */
        public JustRealAvatarItem f23073a;

        /* JADX INFO: renamed from: f */
        public int f23078f;

        /* JADX INFO: renamed from: g */
        public int f23079g;

        /* JADX INFO: renamed from: k */
        public long f23083k;

        /* JADX INFO: renamed from: l */
        public long f23084l;

        /* JADX INFO: renamed from: b */
        public float f23074b = 0.0f;

        /* JADX INFO: renamed from: c */
        public float f23075c = 0.0f;

        /* JADX INFO: renamed from: d */
        public float f23076d = 0.0f;

        /* JADX INFO: renamed from: e */
        public float f23077e = 0.0f;

        /* JADX INFO: renamed from: h */
        public float f23080h = 0.0f;

        /* JADX INFO: renamed from: i */
        public float f23081i = 0.0f;

        /* JADX INFO: renamed from: j */
        public float f23082j = 0.0f;

        public C8003a(Context context) {
            this.f23073a = new JustRealAvatarItem(context);
        }

        /* JADX INFO: renamed from: a */
        public void m38641a() {
            this.f23081i = this.f23080h;
            this.f23076d = this.f23074b;
        }

        /* JADX INFO: renamed from: b */
        public void m38642b() {
            this.f23080h = 1.0f;
            this.f23074b = 0.0f;
            this.f23075c = 0.0f;
        }

        /* JADX INFO: renamed from: c */
        public void m38643c() {
            this.f23082j = 1.0f;
            this.f23077e = this.f23079g * t100.m186890d(16.0f);
            m38641a();
            long jElapsedRealtime = SystemClock.elapsedRealtime() + (((long) this.f23079g) * 20);
            this.f23083k = jElapsedRealtime;
            this.f23084l = jElapsedRealtime + 300;
        }

        /* JADX INFO: renamed from: d */
        public void m38644d(float f, float f2) {
            float f3 = this.f23081i;
            this.f23080h = Math.min(1.0f, Math.max(0.0f, f3 + ((this.f23082j - f3) * f2 * 1.5f)));
            float f4 = this.f23076d;
            float f5 = this.f23077e;
            this.f23074b = ((f5 - f4) * f) + f4;
            this.f23075c = f4 + ((f5 - f4) * f2);
        }
    }

    public JustRealAvatarRootLayout(@NonNull Context context) {
        super(context);
        this.f23068b = new int[]{-65536, -16711936, -16776961, -256};
        this.f23071e = t100.m186890d(28.0f);
        m38636d();
    }

    /* JADX INFO: renamed from: c */
    public final void m38635c(User user, boolean z) {
        C8003a next;
        Iterator<C8003a> it = this.f23067a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.f23079g >= 0);
        if (next == null) {
            return;
        }
        next.f23079g = 0;
        next.m38642b();
        next.m38643c();
        next.f23078f = this.f23067a.size() - 1;
        next.f23073a.m38632b(user);
        if (NullChecker.m81303a(this.f23072f)) {
            this.f23072f.call(user);
        }
        for (C8003a c8003a : this.f23067a) {
            if (c8003a != next && c8003a.f23079g >= 0) {
                c8003a.f23078f = ((this.f23067a.size() + c8003a.f23078f) - 1) % this.f23067a.size();
                c8003a.f23079g++;
                c8003a.m38643c();
                if (c8003a.f23079g == this.f23067a.size() - 1) {
                    c8003a.f23082j = 0.0f;
                }
            }
        }
        if (!z) {
            next.m38644d(1.0f, 1.0f);
        } else {
            m38640h();
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m38636d() {
        this.f23069c = new PathInterpolator(0.8f, 0.52f, 0.63f, 1.31f);
        this.f23067a = new ArrayList();
        for (int i = 0; i < 4; i++) {
            C8003a c8003a = new C8003a(getContext());
            c8003a.f23078f = 3 - i;
            c8003a.f23079g = -1;
            c8003a.f23080h = 0.0f;
            this.f23067a.add(c8003a);
            JustRealAvatarItem justRealAvatarItem = c8003a.f23073a;
            int i2 = this.f23071e;
            addView(justRealAvatarItem, new ViewGroup.LayoutParams(i2, i2));
            c8003a.f23073a.setElevation(0.0f);
            c8003a.f23073a.setAlpha(1.0f);
        }
        setLayerType(0, null);
        setChildrenDrawingOrderEnabled(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        for (C8003a c8003a : this.f23067a) {
            if (c8003a.f23079g >= 0 && jElapsedRealtime >= c8003a.f23083k) {
                long jMin = Math.min(c8003a.f23084l, jElapsedRealtime);
                long j2 = c8003a.f23083k;
                float f = (jMin - j2) / (c8003a.f23084l - j2);
                c8003a.m38644d(this.f23069c.getInterpolation(f), f);
                if (jElapsedRealtime < c8003a.f23084l) {
                    z = true;
                }
            }
        }
        if (z) {
            Choreographer.getInstance().postFrameCallback(this);
        }
        for (C8003a c8003a2 : this.f23067a) {
            if (c8003a2.f23079g == this.f23067a.size() - 1 && jElapsedRealtime >= c8003a2.f23084l) {
                c8003a2.f23079g = -1;
                c8003a2.f23080h = 0.0f;
            }
        }
        m38640h();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m38637e(User user) {
        m38635c(user, true);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m38638f(roj0 roj0Var) {
        if (vwb.m200296J(this.f23067a)) {
            return;
        }
        for (int i = 0; i < this.f23067a.size(); i++) {
            C8003a c8003a = this.f23067a.get(i);
            c8003a.f23078f = 3 - i;
            c8003a.f23079g = -1;
            c8003a.f23080h = 0.0f;
            c8003a.f23073a.setElevation(0.0f);
            c8003a.f23073a.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m38639g(Act act) {
        act.duringCreated(CoreModule.f17545c.f19704z2.m30258u3()).subscribe(mkd0.m154955G(new e30() { // from class: l.yqq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199611a.m38637e((User) obj);
            }
        }));
        act.duringCreated(CoreModule.f17545c.f19704z2.f19216U).subscribe(mkd0.m154955G(new e30() { // from class: l.zqq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204409a.m38638f((roj0) obj);
            }
        }));
        ArrayList arrayList = new ArrayList();
        List<CoreJustVerificationCardApi.C4718a> listM30249l3 = CoreModule.f17545c.f19704z2.m30249l3();
        if (vwb.m200296J(listM30249l3)) {
            return;
        }
        int iMin = Math.min(3, listM30249l3.size());
        for (int i = 0; i < iMin; i++) {
            arrayList.add(0, listM30249l3.get((listM30249l3.size() - 1) - i).f19232a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m38635c((User) it.next(), true);
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f23067a.get(i2).f23078f;
        int i4 = 0;
        while (true) {
            int size = this.f23067a.size();
            List<C8003a> list = this.f23067a;
            if (i4 >= size) {
                return list.get(i2).f23078f;
            }
            if (list.get(i4).f23078f == i2) {
                return i4;
            }
            i4++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m38640h() {
        float fMax = 0.0f;
        for (C8003a c8003a : this.f23067a) {
            int i = c8003a.f23079g;
            JustRealAvatarItem justRealAvatarItem = c8003a.f23073a;
            if (i >= 0) {
                justRealAvatarItem.setAlpha(c8003a.f23080h);
                c8003a.f23073a.setTranslationX(c8003a.f23074b);
                if (c8003a.f23079g < this.f23067a.size() - 1) {
                    fMax = Math.max(c8003a.f23075c, fMax);
                }
                if (c8003a.f23079g == this.f23067a.size() - 1) {
                    fMax = Math.max(c8003a.f23076d, fMax);
                }
            } else {
                justRealAvatarItem.setAlpha(0.0f);
            }
        }
        invalidate();
        requestLayout();
        if (NullChecker.m81303a(this.f23070d)) {
            this.f23070d.call(Integer.valueOf((int) fMax));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int size = this.f23067a.size();
        for (int i5 = 0; i5 < size; i5++) {
            JustRealAvatarItem justRealAvatarItem = this.f23067a.get(i5).f23073a;
            int i6 = this.f23071e;
            justRealAvatarItem.layout(0, 0, i6, i6);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = this.f23067a.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f23067a.get(i3).f23073a.measure(View.MeasureSpec.makeMeasureSpec(this.f23071e, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f23071e, 1073741824));
        }
    }

    public void setRenderUserCall(e30<User> e30Var) {
        this.f23072f = e30Var;
    }

    public void setTitleTransCall(e30<Integer> e30Var) {
        this.f23070d = e30Var;
    }

    public JustRealAvatarRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23068b = new int[]{-65536, -16711936, -16776961, -256};
        this.f23071e = t100.m186890d(28.0f);
        m38636d();
    }

    public JustRealAvatarRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23068b = new int[]{-65536, -16711936, -16776961, -256};
        this.f23071e = t100.m186890d(28.0f);
        m38636d();
    }
}
