package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p149l.ibe;
import p149l.qhg0;
import p149l.qkq0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e */
/* JADX INFO: loaded from: classes.dex */
public class C0599e {

    /* JADX INFO: renamed from: a */
    public final b f2716a;

    /* JADX INFO: renamed from: e */
    public View f2720e;

    /* JADX INFO: renamed from: d */
    public int f2719d = 0;

    /* JADX INFO: renamed from: b */
    public final a f2717b = new a();

    /* JADX INFO: renamed from: c */
    public final List<View> f2718c = new ArrayList();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public long f2721a = 0;

        /* JADX INFO: renamed from: b */
        public a f2722b;

        /* JADX INFO: renamed from: a */
        public void m3671a(int i) {
            if (i < 64) {
                this.f2721a &= ~(1 << i);
                return;
            }
            a aVar = this.f2722b;
            if (aVar != null) {
                aVar.m3671a(i - 64);
            }
        }

        /* JADX INFO: renamed from: b */
        public int m3672b(int i) {
            a aVar = this.f2722b;
            if (aVar == null) {
                long j = this.f2721a;
                return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
            }
            if (i < 64) {
                return Long.bitCount(((1 << i) - 1) & this.f2721a);
            }
            return aVar.m3672b(i - 64) + Long.bitCount(this.f2721a);
        }

        /* JADX INFO: renamed from: c */
        public final void m3673c() {
            if (this.f2722b == null) {
                this.f2722b = new a();
            }
        }

        /* JADX INFO: renamed from: d */
        public boolean m3674d(int i) {
            if (i < 64) {
                return ((1 << i) & this.f2721a) != 0;
            }
            m3673c();
            return this.f2722b.m3674d(i - 64);
        }

        /* JADX INFO: renamed from: e */
        public void m3675e(int i, boolean z) {
            if (i >= 64) {
                m3673c();
                this.f2722b.m3675e(i - 64, z);
                return;
            }
            long j = this.f2721a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f2721a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                m3678h(i);
            } else {
                m3671a(i);
            }
            if (z2 || this.f2722b != null) {
                m3673c();
                this.f2722b.m3675e(0, z2);
            }
        }

        /* JADX INFO: renamed from: f */
        public boolean m3676f(int i) {
            if (i >= 64) {
                m3673c();
                return this.f2722b.m3676f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f2721a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f2721a = j3;
            long j4 = j - 1;
            this.f2721a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.f2722b;
            if (aVar != null) {
                if (aVar.m3674d(0)) {
                    m3678h(63);
                }
                this.f2722b.m3676f(0);
            }
            return z;
        }

        /* JADX INFO: renamed from: g */
        public void m3677g() {
            this.f2721a = 0L;
            a aVar = this.f2722b;
            if (aVar != null) {
                aVar.m3677g();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m3678h(int i) {
            if (i < 64) {
                this.f2721a |= 1 << i;
            } else {
                m3673c();
                this.f2722b.m3678h(i - 64);
            }
        }

        public String toString() {
            if (this.f2722b == null) {
                return Long.toBinaryString(this.f2721a);
            }
            return this.f2722b.toString() + "xx" + Long.toBinaryString(this.f2721a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.e$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        View mo3369a(int i);

        /* JADX INFO: renamed from: b */
        void mo3370b(View view);

        /* JADX INFO: renamed from: c */
        int mo3371c();

        /* JADX INFO: renamed from: d */
        RecyclerView.AbstractC0566d0 mo3372d(View view);

        /* JADX INFO: renamed from: e */
        void mo3373e(View view, int i);

        /* JADX INFO: renamed from: f */
        void mo3374f();

        /* JADX INFO: renamed from: g */
        void mo3375g(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* JADX INFO: renamed from: h */
        void mo3376h(int i);

        /* JADX INFO: renamed from: i */
        int mo3377i(View view);

        /* JADX INFO: renamed from: j */
        void mo3378j(View view);

        /* JADX INFO: renamed from: k */
        void mo3379k(int i);
    }

    public C0599e(b bVar) {
        this.f2716a = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m3651a(View view, int i, boolean z) {
        int iMo3371c = i < 0 ? this.f2716a.mo3371c() : m3658h(i);
        this.f2717b.m3675e(iMo3371c, z);
        if (z) {
            m3662l(view);
        }
        this.f2716a.mo3373e(view, iMo3371c);
    }

    /* JADX INFO: renamed from: b */
    public void m3652b(View view, boolean z) {
        m3651a(view, -1, z);
    }

    /* JADX INFO: renamed from: c */
    public void m3653c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iMo3371c = i < 0 ? this.f2716a.mo3371c() : m3658h(i);
        this.f2717b.m3675e(iMo3371c, z);
        if (z) {
            m3662l(view);
        }
        this.f2716a.mo3375g(view, iMo3371c, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public void m3654d(int i) {
        int iM3658h = m3658h(i);
        this.f2717b.m3676f(iM3658h);
        this.f2716a.mo3376h(iM3658h);
    }

    /* JADX INFO: renamed from: e */
    public View m3655e(int i) {
        int size = this.f2718c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f2718c.get(i2);
            RecyclerView.AbstractC0566d0 abstractC0566d0Mo3372d = this.f2716a.mo3372d(view);
            if (abstractC0566d0Mo3372d.getLayoutPosition() == i && !abstractC0566d0Mo3372d.isInvalid() && !abstractC0566d0Mo3372d.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public View m3656f(int i) {
        return this.f2716a.mo3369a(m3658h(i));
    }

    /* JADX INFO: renamed from: g */
    public int m3657g() {
        return this.f2716a.mo3371c() - this.f2718c.size();
    }

    /* JADX INFO: renamed from: h */
    public final int m3658h(int i) {
        if (i < 0) {
            return -1;
        }
        int iMo3371c = this.f2716a.mo3371c();
        int i2 = i;
        while (i2 < iMo3371c) {
            int iM3672b = i - (i2 - this.f2717b.m3672b(i2));
            if (iM3672b == 0) {
                while (this.f2717b.m3674d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM3672b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public View m3659i(int i) {
        return this.f2716a.mo3369a(i);
    }

    /* JADX INFO: renamed from: j */
    public int m3660j() {
        return this.f2716a.mo3371c();
    }

    /* JADX INFO: renamed from: k */
    public void m3661k(View view) {
        int iMo3377i = this.f2716a.mo3377i(view);
        if (iMo3377i < 0) {
            qhg0.m174539a("view is not a child, cannot hide ", view);
        } else {
            this.f2717b.m3678h(iMo3377i);
            m3662l(view);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3662l(View view) {
        this.f2718c.add(view);
        this.f2716a.mo3370b(view);
    }

    /* JADX INFO: renamed from: m */
    public int m3663m(View view) {
        int iMo3377i = this.f2716a.mo3377i(view);
        if (iMo3377i == -1 || this.f2717b.m3674d(iMo3377i)) {
            return -1;
        }
        return iMo3377i - this.f2717b.m3672b(iMo3377i);
    }

    /* JADX INFO: renamed from: n */
    public boolean m3664n(View view) {
        return this.f2718c.contains(view);
    }

    /* JADX INFO: renamed from: o */
    public void m3665o() {
        this.f2717b.m3677g();
        int size = this.f2718c.size();
        while (true) {
            size--;
            b bVar = this.f2716a;
            if (size < 0) {
                bVar.mo3374f();
                return;
            } else {
                bVar.mo3378j(this.f2718c.get(size));
                this.f2718c.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m3666p(View view) {
        int i = this.f2719d;
        if (i == 1) {
            qkq0.m175383a("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i == 2) {
            qkq0.m175383a("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            this.f2719d = 1;
            this.f2720e = view;
            int iMo3377i = this.f2716a.mo3377i(view);
            if (iMo3377i < 0) {
                return;
            }
            if (this.f2717b.m3676f(iMo3377i)) {
                m3670t(view);
            }
            this.f2716a.mo3379k(iMo3377i);
        } finally {
            this.f2719d = 0;
            this.f2720e = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m3667q(int i) {
        int i2 = this.f2719d;
        if (i2 == 1) {
            qkq0.m175383a("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i2 == 2) {
            qkq0.m175383a("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            int iM3658h = m3658h(i);
            View viewMo3369a = this.f2716a.mo3369a(iM3658h);
            if (viewMo3369a == null) {
                return;
            }
            this.f2719d = 1;
            this.f2720e = viewMo3369a;
            if (this.f2717b.m3676f(iM3658h)) {
                m3670t(viewMo3369a);
            }
            this.f2716a.mo3379k(iM3658h);
        } finally {
            this.f2719d = 0;
            this.f2720e = null;
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m3668r(View view) {
        int i = this.f2719d;
        if (i == 1) {
            if (this.f2720e == view) {
                return false;
            }
            qkq0.m175383a("Cannot call removeViewIfHidden within removeView(At) for a different view");
            return false;
        }
        if (i == 2) {
            qkq0.m175383a("Cannot call removeViewIfHidden within removeViewIfHidden");
            return false;
        }
        try {
            this.f2719d = 2;
            int iMo3377i = this.f2716a.mo3377i(view);
            if (iMo3377i == -1) {
                m3670t(view);
                return true;
            }
            if (!this.f2717b.m3674d(iMo3377i)) {
                return false;
            }
            this.f2717b.m3676f(iMo3377i);
            m3670t(view);
            this.f2716a.mo3379k(iMo3377i);
            return true;
        } finally {
            this.f2719d = 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m3669s(View view) {
        int iMo3377i = this.f2716a.mo3377i(view);
        if (iMo3377i < 0) {
            qhg0.m174539a("view is not a child, cannot hide ", view);
        } else if (!this.f2717b.m3674d(iMo3377i)) {
            ibe.m135253a("trying to unhide a view that was not hidden", view);
        } else {
            this.f2717b.m3671a(iMo3377i);
            m3670t(view);
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m3670t(View view) {
        if (!this.f2718c.remove(view)) {
            return false;
        }
        this.f2716a.mo3378j(view);
        return true;
    }

    public String toString() {
        return this.f2717b.toString() + ", hidden list:" + this.f2718c.size();
    }
}
