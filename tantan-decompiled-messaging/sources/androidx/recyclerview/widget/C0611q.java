package androidx.recyclerview.widget;

import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.q */
/* JADX INFO: loaded from: classes.dex */
public class C0611q {

    /* JADX INFO: renamed from: a */
    public final a f2911a;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.q$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        C0595a.b mo3604a(int i, int i2, int i3, Object obj);

        /* JADX INFO: renamed from: b */
        void mo3605b(C0595a.b bVar);
    }

    public C0611q(a aVar) {
        this.f2911a = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m3819a(List<C0595a.b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f2686a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public void m3820b(List<C0595a.b> list) {
        while (true) {
            int iM3819a = m3819a(list);
            if (iM3819a == -1) {
                return;
            } else {
                m3822d(list, iM3819a, iM3819a + 1);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3821c(List<C0595a.b> list, int i, C0595a.b bVar, int i2, C0595a.b bVar2) {
        int i3 = bVar.f2689d;
        int i4 = bVar2.f2687b;
        int i5 = i3 < i4 ? -1 : 0;
        int i6 = bVar.f2687b;
        if (i6 < i4) {
            i5++;
        }
        if (i4 <= i6) {
            bVar.f2687b = i6 + bVar2.f2689d;
        }
        int i7 = bVar2.f2687b;
        if (i7 <= i3) {
            bVar.f2689d = i3 + bVar2.f2689d;
        }
        bVar2.f2687b = i7 + i5;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m3822d(List<C0595a.b> list, int i, int i2) {
        C0595a.b bVar = list.get(i);
        C0595a.b bVar2 = list.get(i2);
        int i3 = bVar2.f2686a;
        if (i3 == 1) {
            m3821c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            m3823e(list, i, bVar, i2, bVar2);
        } else {
            if (i3 != 4) {
                return;
            }
            m3824f(list, i, bVar, i2, bVar2);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m3823e(List<C0595a.b> list, int i, C0595a.b bVar, int i2, C0595a.b bVar2) {
        boolean z;
        int i3 = bVar.f2687b;
        int i4 = bVar.f2689d;
        boolean z2 = false;
        if (i3 < i4) {
            if (bVar2.f2687b == i3 && bVar2.f2689d == i4 - i3) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (bVar2.f2687b == i4 + 1 && bVar2.f2689d == i3 - i4) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        int i5 = bVar2.f2687b;
        if (i4 < i5) {
            bVar2.f2687b = i5 - 1;
        } else {
            int i6 = bVar2.f2689d;
            if (i4 < i5 + i6) {
                bVar2.f2689d = i6 - 1;
                bVar.f2686a = 2;
                bVar.f2689d = 1;
                if (bVar2.f2689d == 0) {
                    list.remove(i2);
                    this.f2911a.mo3605b(bVar2);
                    return;
                }
                return;
            }
        }
        int i7 = bVar.f2687b;
        int i8 = bVar2.f2687b;
        C0595a.b bVarMo3604a = null;
        if (i7 <= i8) {
            bVar2.f2687b = i8 + 1;
        } else {
            int i9 = bVar2.f2689d;
            if (i7 < i8 + i9) {
                bVarMo3604a = this.f2911a.mo3604a(2, i7 + 1, (i8 + i9) - i7, null);
                bVar2.f2689d = bVar.f2687b - bVar2.f2687b;
            }
        }
        if (z2) {
            list.set(i, bVar2);
            list.remove(i2);
            this.f2911a.mo3605b(bVar);
            return;
        }
        if (z) {
            if (bVarMo3604a != null) {
                int i10 = bVar.f2687b;
                if (i10 > bVarMo3604a.f2687b) {
                    bVar.f2687b = i10 - bVarMo3604a.f2689d;
                }
                int i11 = bVar.f2689d;
                if (i11 > bVarMo3604a.f2687b) {
                    bVar.f2689d = i11 - bVarMo3604a.f2689d;
                }
            }
            int i12 = bVar.f2687b;
            if (i12 > bVar2.f2687b) {
                bVar.f2687b = i12 - bVar2.f2689d;
            }
            int i13 = bVar.f2689d;
            if (i13 > bVar2.f2687b) {
                bVar.f2689d = i13 - bVar2.f2689d;
            }
        } else {
            if (bVarMo3604a != null) {
                int i14 = bVar.f2687b;
                if (i14 >= bVarMo3604a.f2687b) {
                    bVar.f2687b = i14 - bVarMo3604a.f2689d;
                }
                int i15 = bVar.f2689d;
                if (i15 >= bVarMo3604a.f2687b) {
                    bVar.f2689d = i15 - bVarMo3604a.f2689d;
                }
            }
            int i16 = bVar.f2687b;
            if (i16 >= bVar2.f2687b) {
                bVar.f2687b = i16 - bVar2.f2689d;
            }
            int i17 = bVar.f2689d;
            if (i17 >= bVar2.f2687b) {
                bVar.f2689d = i17 - bVar2.f2689d;
            }
        }
        list.set(i, bVar2);
        if (bVar.f2687b != bVar.f2689d) {
            list.set(i2, bVar);
        } else {
            list.remove(i2);
        }
        if (bVarMo3604a != null) {
            list.add(i, bVarMo3604a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public void m3824f(List<C0595a.b> list, int i, C0595a.b bVar, int i2, C0595a.b bVar2) {
        C0595a.b bVarMo3604a;
        int i3;
        int i4;
        int i5;
        int i6 = bVar.f2689d;
        int i7 = bVar2.f2687b;
        C0595a.b bVarMo3604a2 = null;
        if (i6 >= i7) {
            int i8 = bVar2.f2689d;
            if (i6 < i7 + i8) {
                bVar2.f2689d = i8 - 1;
                bVarMo3604a = this.f2911a.mo3604a(4, bVar.f2687b, 1, bVar2.f2688c);
            }
            i3 = bVar.f2687b;
            i4 = bVar2.f2687b;
            if (i3 <= i4) {
                bVar2.f2687b = i4 + 1;
            } else {
                i5 = bVar2.f2689d;
                if (i3 < i4 + i5) {
                    int i9 = (i4 + i5) - i3;
                    bVarMo3604a2 = this.f2911a.mo3604a(4, i3 + 1, i9, bVar2.f2688c);
                    bVar2.f2689d -= i9;
                }
            }
            list.set(i2, bVar);
            if (bVar2.f2689d > 0) {
                list.set(i, bVar2);
            } else {
                list.remove(i);
                this.f2911a.mo3605b(bVar2);
            }
            if (bVarMo3604a != null) {
                list.add(i, bVarMo3604a);
            }
            if (bVarMo3604a2 != null) {
                list.add(i, bVarMo3604a2);
            }
        }
        bVar2.f2687b = i7 - 1;
        bVarMo3604a = null;
        i3 = bVar.f2687b;
        i4 = bVar2.f2687b;
        if (i3 <= i4) {
            bVar2.f2687b = i4 + 1;
        } else {
            i5 = bVar2.f2689d;
            if (i3 < i4 + i5) {
                int i10 = (i4 + i5) - i3;
                bVarMo3604a2 = this.f2911a.mo3604a(4, i3 + 1, i10, bVar2.f2688c);
                bVar2.f2689d -= i10;
            }
        }
        list.set(i2, bVar);
        if (bVar2.f2689d > 0) {
            list.set(i, bVar2);
        } else {
            list.remove(i);
            this.f2911a.mo3605b(bVar2);
        }
        if (bVarMo3604a != null) {
            list.add(i, bVarMo3604a);
        }
        if (bVarMo3604a2 != null) {
            list.add(i, bVarMo3604a2);
        }
    }
}
