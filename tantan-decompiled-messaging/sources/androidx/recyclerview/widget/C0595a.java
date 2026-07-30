package androidx.recyclerview.widget;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSMercuryType;
import java.util.ArrayList;
import java.util.List;
import p149l.hb80;
import p149l.ig3;
import p149l.jb80;
import p149l.qhg0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0595a implements C0611q.a {

    /* JADX INFO: renamed from: a */
    public hb80<b> f2678a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<b> f2679b;

    /* JADX INFO: renamed from: c */
    public final ArrayList<b> f2680c;

    /* JADX INFO: renamed from: d */
    public final a f2681d;

    /* JADX INFO: renamed from: e */
    public Runnable f2682e;

    /* JADX INFO: renamed from: f */
    public final boolean f2683f;

    /* JADX INFO: renamed from: g */
    public final C0611q f2684g;

    /* JADX INFO: renamed from: h */
    public int f2685h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo3380a(int i, int i2);

        /* JADX INFO: renamed from: b */
        void mo3381b(b bVar);

        /* JADX INFO: renamed from: c */
        void mo3382c(b bVar);

        /* JADX INFO: renamed from: d */
        RecyclerView.AbstractC0566d0 mo3383d(int i);

        /* JADX INFO: renamed from: e */
        void mo3384e(int i, int i2);

        /* JADX INFO: renamed from: f */
        void mo3385f(int i, int i2);

        /* JADX INFO: renamed from: g */
        void mo3386g(int i, int i2);

        /* JADX INFO: renamed from: h */
        void mo3387h(int i, int i2, Object obj);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public int f2686a;

        /* JADX INFO: renamed from: b */
        public int f2687b;

        /* JADX INFO: renamed from: c */
        public Object f2688c;

        /* JADX INFO: renamed from: d */
        public int f2689d;

        public b(int i, int i2, int i3, Object obj) {
            this.f2686a = i;
            this.f2687b = i2;
            this.f2689d = i3;
            this.f2688c = obj;
        }

        /* JADX INFO: renamed from: a */
        public String m3630a() {
            int i = this.f2686a;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i != 4) {
                return i != 8 ? "??" : OMSMercuryType.f38792mv;
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.f2686a;
            if (i != bVar.f2686a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f2689d - this.f2687b) == 1 && this.f2689d == bVar.f2687b && this.f2687b == bVar.f2689d) {
                return true;
            }
            if (this.f2689d != bVar.f2689d || this.f2687b != bVar.f2687b) {
                return false;
            }
            Object obj2 = this.f2688c;
            Object obj3 = bVar.f2688c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f2686a * 31) + this.f2687b) * 31) + this.f2689d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m3630a() + ",s:" + this.f2687b + "c:" + this.f2689d + ",p:" + this.f2688c + Constants.AES_SUFFIX;
        }
    }

    public C0595a(a aVar, boolean z) {
        this.f2678a = new jb80(30);
        this.f2679b = new ArrayList<>();
        this.f2680c = new ArrayList<>();
        this.f2685h = 0;
        this.f2681d = aVar;
        this.f2683f = z;
        this.f2684g = new C0611q(this);
    }

    @Override // androidx.recyclerview.widget.C0611q.a
    /* JADX INFO: renamed from: a */
    public b mo3604a(int i, int i2, int i3, Object obj) {
        b bVarAcquire = this.f2678a.acquire();
        if (bVarAcquire == null) {
            return new b(i, i2, i3, obj);
        }
        bVarAcquire.f2686a = i;
        bVarAcquire.f2687b = i2;
        bVarAcquire.f2689d = i3;
        bVarAcquire.f2688c = obj;
        return bVarAcquire;
    }

    @Override // androidx.recyclerview.widget.C0611q.a
    /* JADX INFO: renamed from: b */
    public void mo3605b(b bVar) {
        if (this.f2683f) {
            return;
        }
        bVar.f2688c = null;
        this.f2678a.release(bVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m3606c(b bVar) {
        m3625v(bVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m3607d(b bVar) {
        m3625v(bVar);
    }

    /* JADX INFO: renamed from: e */
    public int m3608e(int i) {
        int size = this.f2679b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f2679b.get(i2);
            int i3 = bVar.f2686a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f2687b;
                    if (i4 <= i) {
                        int i5 = bVar.f2689d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f2687b;
                    if (i6 == i) {
                        i = bVar.f2689d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f2689d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f2687b <= i) {
                i += bVar.f2689d;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: f */
    public final void m3609f(b bVar) {
        boolean z;
        byte b2;
        int i = bVar.f2687b;
        int i2 = bVar.f2689d + i;
        byte b3 = -1;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f2681d.mo3383d(i3) != null || m3611h(i3)) {
                if (b3 == 0) {
                    m3614k(mo3604a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                b2 = 1;
            } else {
                if (b3 == 1) {
                    m3625v(mo3604a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                b2 = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            b3 = b2;
        }
        if (i4 != bVar.f2689d) {
            mo3605b(bVar);
            bVar = mo3604a(2, i, i4, null);
        }
        if (b3 == 0) {
            m3614k(bVar);
        } else {
            m3625v(bVar);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3610g(b bVar) {
        int i = bVar.f2687b;
        int i2 = bVar.f2689d + i;
        int i3 = 0;
        byte b2 = -1;
        int i4 = i;
        while (i < i2) {
            if (this.f2681d.mo3383d(i) != null || m3611h(i)) {
                if (b2 == 0) {
                    m3614k(mo3604a(4, i4, i3, bVar.f2688c));
                    i4 = i;
                    i3 = 0;
                }
                b2 = 1;
            } else {
                if (b2 == 1) {
                    m3625v(mo3604a(4, i4, i3, bVar.f2688c));
                    i4 = i;
                    i3 = 0;
                }
                b2 = 0;
            }
            i3++;
            i++;
        }
        if (i3 != bVar.f2689d) {
            Object obj = bVar.f2688c;
            mo3605b(bVar);
            bVar = mo3604a(4, i4, i3, obj);
        }
        if (b2 == 0) {
            m3614k(bVar);
        } else {
            m3625v(bVar);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3611h(int i) {
        int size = this.f2680c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f2680c.get(i2);
            int i3 = bVar.f2686a;
            if (i3 == 8) {
                if (m3617n(bVar.f2689d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f2687b;
                int i5 = bVar.f2689d + i4;
                while (i4 < i5) {
                    if (m3617n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m3612i() {
        int size = this.f2680c.size();
        for (int i = 0; i < size; i++) {
            this.f2681d.mo3382c(this.f2680c.get(i));
        }
        m3627x(this.f2680c);
        this.f2685h = 0;
    }

    /* JADX INFO: renamed from: j */
    public void m3613j() {
        m3612i();
        int size = this.f2679b.size();
        int i = 0;
        while (true) {
            ArrayList<b> arrayList = this.f2679b;
            if (i >= size) {
                m3627x(arrayList);
                this.f2685h = 0;
                return;
            }
            b bVar = arrayList.get(i);
            int i2 = bVar.f2686a;
            if (i2 == 1) {
                this.f2681d.mo3382c(bVar);
                this.f2681d.mo3384e(bVar.f2687b, bVar.f2689d);
            } else if (i2 == 2) {
                this.f2681d.mo3382c(bVar);
                this.f2681d.mo3385f(bVar.f2687b, bVar.f2689d);
            } else if (i2 == 4) {
                this.f2681d.mo3382c(bVar);
                this.f2681d.mo3387h(bVar.f2687b, bVar.f2689d, bVar.f2688c);
            } else if (i2 == 8) {
                this.f2681d.mo3382c(bVar);
                this.f2681d.mo3380a(bVar.f2687b, bVar.f2689d);
            }
            Runnable runnable = this.f2682e;
            if (runnable != null) {
                runnable.run();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m3614k(b bVar) {
        int i;
        int i2 = bVar.f2686a;
        if (i2 == 1 || i2 == 8) {
            ig3.m135964a("should not dispatch add or move for pre layout");
            return;
        }
        int iM3629z = m3629z(bVar.f2687b, i2);
        int i3 = bVar.f2687b;
        int i4 = bVar.f2686a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                qhg0.m174539a("op should be remove or update.", bVar);
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f2689d; i6++) {
            int iM3629z2 = m3629z(bVar.f2687b + (i * i6), bVar.f2686a);
            int i7 = bVar.f2686a;
            if (i7 == 2 ? iM3629z2 != iM3629z : !(i7 == 4 && iM3629z2 == iM3629z + 1)) {
                b bVarMo3604a = mo3604a(i7, iM3629z, i5, bVar.f2688c);
                m3615l(bVarMo3604a, i3);
                mo3605b(bVarMo3604a);
                if (bVar.f2686a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iM3629z = iM3629z2;
            } else {
                i5++;
            }
        }
        Object obj = bVar.f2688c;
        mo3605b(bVar);
        if (i5 > 0) {
            b bVarMo3604a2 = mo3604a(bVar.f2686a, iM3629z, i5, obj);
            m3615l(bVarMo3604a2, i3);
            mo3605b(bVarMo3604a2);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m3615l(b bVar, int i) {
        this.f2681d.mo3381b(bVar);
        int i2 = bVar.f2686a;
        if (i2 == 2) {
            this.f2681d.mo3385f(i, bVar.f2689d);
        } else if (i2 == 4) {
            this.f2681d.mo3387h(i, bVar.f2689d, bVar.f2688c);
        } else {
            ig3.m135964a("only remove and update ops can be dispatched in first pass");
        }
    }

    /* JADX INFO: renamed from: m */
    public int m3616m(int i) {
        return m3617n(i, 0);
    }

    /* JADX INFO: renamed from: n */
    public int m3617n(int i, int i2) {
        int size = this.f2680c.size();
        while (i2 < size) {
            b bVar = this.f2680c.get(i2);
            int i3 = bVar.f2686a;
            int i4 = bVar.f2687b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = bVar.f2689d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f2689d <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = bVar.f2689d;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += bVar.f2689d;
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: o */
    public boolean m3618o(int i) {
        return (this.f2685h & i) != 0;
    }

    /* JADX INFO: renamed from: p */
    public boolean m3619p() {
        return this.f2679b.size() > 0;
    }

    /* JADX INFO: renamed from: q */
    public boolean m3620q() {
        return (this.f2680c.isEmpty() || this.f2679b.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: r */
    public boolean m3621r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f2679b.add(mo3604a(4, i, i2, obj));
        this.f2685h |= 4;
        return this.f2679b.size() == 1;
    }

    /* JADX INFO: renamed from: s */
    public boolean m3622s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f2679b.add(mo3604a(1, i, i2, null));
        this.f2685h |= 1;
        return this.f2679b.size() == 1;
    }

    /* JADX INFO: renamed from: t */
    public boolean m3623t(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 != 1) {
            ig3.m135964a("Moving more than 1 item is not supported yet");
            return false;
        }
        this.f2679b.add(mo3604a(8, i, i2, null));
        this.f2685h |= 8;
        return this.f2679b.size() == 1;
    }

    /* JADX INFO: renamed from: u */
    public boolean m3624u(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f2679b.add(mo3604a(2, i, i2, null));
        this.f2685h |= 2;
        return this.f2679b.size() == 1;
    }

    /* JADX INFO: renamed from: v */
    public final void m3625v(b bVar) {
        this.f2680c.add(bVar);
        int i = bVar.f2686a;
        if (i == 1) {
            this.f2681d.mo3384e(bVar.f2687b, bVar.f2689d);
            return;
        }
        if (i == 2) {
            this.f2681d.mo3386g(bVar.f2687b, bVar.f2689d);
            return;
        }
        if (i == 4) {
            this.f2681d.mo3387h(bVar.f2687b, bVar.f2689d, bVar.f2688c);
        } else if (i == 8) {
            this.f2681d.mo3380a(bVar.f2687b, bVar.f2689d);
        } else {
            qhg0.m174539a("Unknown update op type for ", bVar);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m3626w() {
        this.f2684g.m3820b(this.f2679b);
        int size = this.f2679b.size();
        int i = 0;
        while (true) {
            ArrayList<b> arrayList = this.f2679b;
            if (i >= size) {
                arrayList.clear();
                return;
            }
            b bVar = arrayList.get(i);
            int i2 = bVar.f2686a;
            if (i2 == 1) {
                m3606c(bVar);
            } else if (i2 == 2) {
                m3609f(bVar);
            } else if (i2 == 4) {
                m3610g(bVar);
            } else if (i2 == 8) {
                m3607d(bVar);
            }
            Runnable runnable = this.f2682e;
            if (runnable != null) {
                runnable.run();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m3627x(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo3605b(list.get(i));
        }
        list.clear();
    }

    /* JADX INFO: renamed from: y */
    public void m3628y() {
        m3627x(this.f2679b);
        m3627x(this.f2680c);
        this.f2685h = 0;
    }

    /* JADX INFO: renamed from: z */
    public final int m3629z(int i, int i2) {
        ArrayList<b> arrayList;
        int i3;
        int i4;
        int size = this.f2680c.size() - 1;
        while (true) {
            arrayList = this.f2680c;
            if (size < 0) {
                break;
            }
            b bVar = arrayList.get(size);
            int i5 = bVar.f2686a;
            int i6 = bVar.f2687b;
            if (i5 == 8) {
                int i7 = bVar.f2689d;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.f2687b = i6 + 1;
                            bVar.f2689d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.f2687b = i6 - 1;
                            bVar.f2689d = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        bVar.f2689d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.f2689d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f2687b = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.f2687b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= bVar.f2689d;
                } else if (i5 == 2) {
                    i += bVar.f2689d;
                }
            } else if (i2 == 1) {
                bVar.f2687b = i6 + 1;
            } else if (i2 == 2) {
                bVar.f2687b = i6 - 1;
            }
            size--;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f2680c.get(size2);
            int i8 = bVar2.f2686a;
            int i9 = bVar2.f2689d;
            if (i8 == 8) {
                if (i9 == bVar2.f2687b || i9 < 0) {
                    this.f2680c.remove(size2);
                    mo3605b(bVar2);
                }
            } else if (i9 <= 0) {
                this.f2680c.remove(size2);
                mo3605b(bVar2);
            }
        }
        return i;
    }

    public C0595a(a aVar) {
        this(aVar, false);
    }
}
