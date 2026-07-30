package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p153l.mce;
import p153l.wtq0;
import p153l.ypg0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e */
/* JADX INFO: loaded from: classes.dex */
public class C0601e {

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
        public void m3672a(int i) {
            if (i < 64) {
                this.f2721a &= ~(1 << i);
                return;
            }
            a aVar = this.f2722b;
            if (aVar != null) {
                aVar.m3672a(i - 64);
            }
        }

        /* JADX INFO: renamed from: b */
        public int m3673b(int i) {
            a aVar = this.f2722b;
            if (aVar == null) {
                long j = this.f2721a;
                return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
            }
            if (i < 64) {
                return Long.bitCount(((1 << i) - 1) & this.f2721a);
            }
            return aVar.m3673b(i - 64) + Long.bitCount(this.f2721a);
        }

        /* JADX INFO: renamed from: c */
        public final void m3674c() {
            if (this.f2722b == null) {
                this.f2722b = new a();
            }
        }

        /* JADX INFO: renamed from: d */
        public boolean m3675d(int i) {
            if (i < 64) {
                return ((1 << i) & this.f2721a) != 0;
            }
            m3674c();
            return this.f2722b.m3675d(i - 64);
        }

        /* JADX INFO: renamed from: e */
        public void m3676e(int i, boolean z) {
            if (i >= 64) {
                m3674c();
                this.f2722b.m3676e(i - 64, z);
                return;
            }
            long j = this.f2721a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f2721a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                m3679h(i);
            } else {
                m3672a(i);
            }
            if (z2 || this.f2722b != null) {
                m3674c();
                this.f2722b.m3676e(0, z2);
            }
        }

        /* JADX INFO: renamed from: f */
        public boolean m3677f(int i) {
            if (i >= 64) {
                m3674c();
                return this.f2722b.m3677f(i - 64);
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
                if (aVar.m3675d(0)) {
                    m3679h(63);
                }
                this.f2722b.m3677f(0);
            }
            return z;
        }

        /* JADX INFO: renamed from: g */
        public void m3678g() {
            this.f2721a = 0L;
            a aVar = this.f2722b;
            if (aVar != null) {
                aVar.m3678g();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m3679h(int i) {
            if (i < 64) {
                this.f2721a |= 1 << i;
            } else {
                m3674c();
                this.f2722b.m3679h(i - 64);
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
        View mo3378a(int i);

        /* JADX INFO: renamed from: b */
        void mo3379b(View view);

        /* JADX INFO: renamed from: c */
        int mo3380c();

        /* JADX INFO: renamed from: d */
        RecyclerView.AbstractC0569e0 mo3381d(View view);

        /* JADX INFO: renamed from: e */
        void mo3382e(View view, int i);

        /* JADX INFO: renamed from: f */
        void mo3383f();

        /* JADX INFO: renamed from: g */
        void mo3384g(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* JADX INFO: renamed from: h */
        void mo3385h(int i);

        /* JADX INFO: renamed from: i */
        int mo3386i(View view);

        /* JADX INFO: renamed from: j */
        void mo3387j(View view);

        /* JADX INFO: renamed from: k */
        void mo3388k(int i);
    }

    public C0601e(b bVar) {
        this.f2716a = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m3652a(View view, int i, boolean z) {
        int iMo3380c = i < 0 ? this.f2716a.mo3380c() : m3659h(i);
        this.f2717b.m3676e(iMo3380c, z);
        if (z) {
            m3663l(view);
        }
        this.f2716a.mo3382e(view, iMo3380c);
    }

    /* JADX INFO: renamed from: b */
    public void m3653b(View view, boolean z) {
        m3652a(view, -1, z);
    }

    /* JADX INFO: renamed from: c */
    public void m3654c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iMo3380c = i < 0 ? this.f2716a.mo3380c() : m3659h(i);
        this.f2717b.m3676e(iMo3380c, z);
        if (z) {
            m3663l(view);
        }
        this.f2716a.mo3384g(view, iMo3380c, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public void m3655d(int i) {
        int iM3659h = m3659h(i);
        this.f2717b.m3677f(iM3659h);
        this.f2716a.mo3385h(iM3659h);
    }

    /* JADX INFO: renamed from: e */
    public View m3656e(int i) {
        int size = this.f2718c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f2718c.get(i2);
            RecyclerView.AbstractC0569e0 abstractC0569e0Mo3381d = this.f2716a.mo3381d(view);
            if (abstractC0569e0Mo3381d.getLayoutPosition() == i && !abstractC0569e0Mo3381d.isInvalid() && !abstractC0569e0Mo3381d.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public View m3657f(int i) {
        return this.f2716a.mo3378a(m3659h(i));
    }

    /* JADX INFO: renamed from: g */
    public int m3658g() {
        return this.f2716a.mo3380c() - this.f2718c.size();
    }

    /* JADX INFO: renamed from: h */
    public final int m3659h(int i) {
        if (i < 0) {
            return -1;
        }
        int iMo3380c = this.f2716a.mo3380c();
        int i2 = i;
        while (i2 < iMo3380c) {
            int iM3673b = i - (i2 - this.f2717b.m3673b(i2));
            if (iM3673b == 0) {
                while (this.f2717b.m3675d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM3673b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public View m3660i(int i) {
        return this.f2716a.mo3378a(i);
    }

    /* JADX INFO: renamed from: j */
    public int m3661j() {
        return this.f2716a.mo3380c();
    }

    /* JADX INFO: renamed from: k */
    public void m3662k(View view) {
        int iMo3386i = this.f2716a.mo3386i(view);
        if (iMo3386i < 0) {
            ypg0.m217021a("view is not a child, cannot hide ", view);
        } else {
            this.f2717b.m3679h(iMo3386i);
            m3663l(view);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3663l(View view) {
        this.f2718c.add(view);
        this.f2716a.mo3379b(view);
    }

    /* JADX INFO: renamed from: m */
    public int m3664m(View view) {
        int iMo3386i = this.f2716a.mo3386i(view);
        if (iMo3386i == -1 || this.f2717b.m3675d(iMo3386i)) {
            return -1;
        }
        return iMo3386i - this.f2717b.m3673b(iMo3386i);
    }

    /* JADX INFO: renamed from: n */
    public boolean m3665n(View view) {
        return this.f2718c.contains(view);
    }

    /* JADX INFO: renamed from: o */
    public void m3666o() {
        this.f2717b.m3678g();
        int size = this.f2718c.size();
        while (true) {
            size--;
            b bVar = this.f2716a;
            if (size < 0) {
                bVar.mo3383f();
                return;
            } else {
                bVar.mo3387j(this.f2718c.get(size));
                this.f2718c.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m3667p(View view) {
        int i = this.f2719d;
        if (i == 1) {
            wtq0.m207906a("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i == 2) {
            wtq0.m207906a("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            this.f2719d = 1;
            this.f2720e = view;
            int iMo3386i = this.f2716a.mo3386i(view);
            if (iMo3386i < 0) {
                return;
            }
            if (this.f2717b.m3677f(iMo3386i)) {
                m3671t(view);
            }
            this.f2716a.mo3388k(iMo3386i);
        } finally {
            this.f2719d = 0;
            this.f2720e = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m3668q(int i) {
        int i2 = this.f2719d;
        if (i2 == 1) {
            wtq0.m207906a("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i2 == 2) {
            wtq0.m207906a("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            int iM3659h = m3659h(i);
            View viewMo3378a = this.f2716a.mo3378a(iM3659h);
            if (viewMo3378a == null) {
                return;
            }
            this.f2719d = 1;
            this.f2720e = viewMo3378a;
            if (this.f2717b.m3677f(iM3659h)) {
                m3671t(viewMo3378a);
            }
            this.f2716a.mo3388k(iM3659h);
        } finally {
            this.f2719d = 0;
            this.f2720e = null;
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m3669r(View view) {
        int i = this.f2719d;
        if (i == 1) {
            if (this.f2720e == view) {
                return false;
            }
            wtq0.m207906a("Cannot call removeViewIfHidden within removeView(At) for a different view");
            return false;
        }
        if (i == 2) {
            wtq0.m207906a("Cannot call removeViewIfHidden within removeViewIfHidden");
            return false;
        }
        try {
            this.f2719d = 2;
            int iMo3386i = this.f2716a.mo3386i(view);
            if (iMo3386i == -1) {
                m3671t(view);
                return true;
            }
            if (!this.f2717b.m3675d(iMo3386i)) {
                return false;
            }
            this.f2717b.m3677f(iMo3386i);
            m3671t(view);
            this.f2716a.mo3388k(iMo3386i);
            return true;
        } finally {
            this.f2719d = 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m3670s(View view) {
        int iMo3386i = this.f2716a.mo3386i(view);
        if (iMo3386i < 0) {
            ypg0.m217021a("view is not a child, cannot hide ", view);
        } else if (!this.f2717b.m3675d(iMo3386i)) {
            mce.m157919a("trying to unhide a view that was not hidden", view);
        } else {
            this.f2717b.m3672a(iMo3386i);
            m3671t(view);
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m3671t(View view) {
        if (!this.f2718c.remove(view)) {
            return false;
        }
        this.f2716a.mo3387j(view);
        return true;
    }

    public String toString() {
        return this.f2717b.toString() + ", hidden list:" + this.f2718c.size();
    }
}
