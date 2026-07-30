package p153l;

import android.graphics.Color;
import android.util.TimingLogger;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class af5 {

    /* JADX INFO: renamed from: g */
    public static final Comparator<C15695b> f70850g = new C15694a();

    /* JADX INFO: renamed from: a */
    public final int[] f70851a;

    /* JADX INFO: renamed from: b */
    public final int[] f70852b;

    /* JADX INFO: renamed from: c */
    public final List<qf60.C19561d> f70853c;

    /* JADX INFO: renamed from: e */
    public final qf60.InterfaceC19560c[] f70855e;

    /* JADX INFO: renamed from: f */
    public final float[] f70856f = new float[3];

    /* JADX INFO: renamed from: d */
    @Nullable
    public final TimingLogger f70854d = null;

    /* JADX INFO: renamed from: l.af5$a */
    public static class C15694a implements Comparator<C15695b> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C15695b c15695b, C15695b c15695b2) {
            return c15695b2.m97308g() - c15695b.m97308g();
        }
    }

    /* JADX INFO: renamed from: l.af5$b */
    public class C15695b {

        /* JADX INFO: renamed from: a */
        public int f70857a;

        /* JADX INFO: renamed from: b */
        public int f70858b;

        /* JADX INFO: renamed from: c */
        public int f70859c;

        /* JADX INFO: renamed from: d */
        public int f70860d;

        /* JADX INFO: renamed from: e */
        public int f70861e;

        /* JADX INFO: renamed from: f */
        public int f70862f;

        /* JADX INFO: renamed from: g */
        public int f70863g;

        /* JADX INFO: renamed from: h */
        public int f70864h;

        /* JADX INFO: renamed from: i */
        public int f70865i;

        public C15695b(int i, int i2) {
            this.f70857a = i;
            this.f70858b = i2;
            m97304c();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m97302a() {
            return m97306e() > 1;
        }

        /* JADX INFO: renamed from: b */
        public final int m97303b() {
            int iM97307f = m97307f();
            af5 af5Var = af5.this;
            int[] iArr = af5Var.f70851a;
            int[] iArr2 = af5Var.f70852b;
            af5.m97288e(iArr, iM97307f, this.f70857a, this.f70858b);
            Arrays.sort(iArr, this.f70857a, this.f70858b + 1);
            af5.m97288e(iArr, iM97307f, this.f70857a, this.f70858b);
            int i = this.f70859c / 2;
            int i2 = this.f70857a;
            int i3 = 0;
            while (true) {
                int i4 = this.f70858b;
                if (i2 > i4) {
                    return this.f70857a;
                }
                i3 += iArr2[iArr[i2]];
                if (i3 >= i) {
                    return Math.min(i4 - 1, i2);
                }
                i2++;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m97304c() {
            af5 af5Var = af5.this;
            int[] iArr = af5Var.f70851a;
            int[] iArr2 = af5Var.f70852b;
            int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = 0;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = this.f70857a; i8 <= this.f70858b; i8++) {
                int i9 = iArr[i8];
                i5 += iArr2[i9];
                int iM97293k = af5.m97293k(i9);
                int iM97292j = af5.m97292j(i9);
                int iM97291i = af5.m97291i(i9);
                if (iM97293k > i2) {
                    i2 = iM97293k;
                }
                if (iM97293k < i) {
                    i = iM97293k;
                }
                if (iM97292j > i3) {
                    i3 = iM97292j;
                }
                if (iM97292j < i6) {
                    i6 = iM97292j;
                }
                if (iM97291i > i4) {
                    i4 = iM97291i;
                }
                if (iM97291i < i7) {
                    i7 = iM97291i;
                }
            }
            this.f70860d = i;
            this.f70861e = i2;
            this.f70862f = i6;
            this.f70863g = i3;
            this.f70864h = i7;
            this.f70865i = i4;
            this.f70859c = i5;
        }

        /* JADX INFO: renamed from: d */
        public final qf60.C19561d m97305d() {
            af5 af5Var = af5.this;
            int[] iArr = af5Var.f70851a;
            int[] iArr2 = af5Var.f70852b;
            int iM97293k = 0;
            int i = 0;
            int iM97292j = 0;
            int iM97291i = 0;
            for (int i2 = this.f70857a; i2 <= this.f70858b; i2++) {
                int i3 = iArr[i2];
                int i4 = iArr2[i3];
                i += i4;
                iM97293k += af5.m97293k(i3) * i4;
                iM97292j += af5.m97292j(i3) * i4;
                iM97291i += i4 * af5.m97291i(i3);
            }
            float f = i;
            return new qf60.C19561d(af5.m97287b(Math.round(iM97293k / f), Math.round(iM97292j / f), Math.round(iM97291i / f)), i);
        }

        /* JADX INFO: renamed from: e */
        public final int m97306e() {
            return (this.f70858b + 1) - this.f70857a;
        }

        /* JADX INFO: renamed from: f */
        public final int m97307f() {
            int i = this.f70861e - this.f70860d;
            int i2 = this.f70863g - this.f70862f;
            int i3 = this.f70865i - this.f70864h;
            if (i < i2 || i < i3) {
                return (i2 < i || i2 < i3) ? -1 : -2;
            }
            return -3;
        }

        /* JADX INFO: renamed from: g */
        public final int m97308g() {
            return ((this.f70861e - this.f70860d) + 1) * ((this.f70863g - this.f70862f) + 1) * ((this.f70865i - this.f70864h) + 1);
        }

        /* JADX INFO: renamed from: h */
        public final C15695b m97309h() {
            if (!m97302a()) {
                wtq0.m207906a("Can not split a box with only 1 color");
                return null;
            }
            int iM97303b = m97303b();
            C15695b c15695b = af5.this.new C15695b(iM97303b + 1, this.f70858b);
            this.f70858b = iM97303b;
            m97304c();
            return c15695b;
        }
    }

    public af5(int[] iArr, int i, qf60.InterfaceC19560c[] interfaceC19560cArr) {
        this.f70855e = interfaceC19560cArr;
        int[] iArr2 = new int[32768];
        this.f70852b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int iM97290g = m97290g(iArr[i2]);
            iArr[i2] = iM97290g;
            iArr2[iM97290g] = iArr2[iM97290g] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0 && m97297l(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.f70851a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        if (i3 > i) {
            this.f70853c = m97296h(i);
            return;
        }
        this.f70853c = new ArrayList();
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = iArr3[i7];
            this.f70853c.add(new qf60.C19561d(m97286a(i8), iArr2[i8]));
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m97286a(int i) {
        return m97287b(m97293k(i), m97292j(i), m97291i(i));
    }

    /* JADX INFO: renamed from: b */
    public static int m97287b(int i, int i2, int i3) {
        return Color.rgb(m97289f(i, 5, 8), m97289f(i2, 5, 8), m97289f(i3, 5, 8));
    }

    /* JADX INFO: renamed from: e */
    public static void m97288e(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = m97291i(i4) | (m97292j(i4) << 10) | (m97293k(i4) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = m97293k(i5) | (m97291i(i5) << 10) | (m97292j(i5) << 5);
            i2++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m97289f(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* JADX INFO: renamed from: g */
    public static int m97290g(int i) {
        return m97289f(Color.blue(i), 8, 5) | (m97289f(Color.red(i), 8, 5) << 10) | (m97289f(Color.green(i), 8, 5) << 5);
    }

    /* JADX INFO: renamed from: i */
    public static int m97291i(int i) {
        return i & 31;
    }

    /* JADX INFO: renamed from: j */
    public static int m97292j(int i) {
        return (i >> 5) & 31;
    }

    /* JADX INFO: renamed from: k */
    public static int m97293k(int i) {
        return (i >> 10) & 31;
    }

    /* JADX INFO: renamed from: c */
    public final List<qf60.C19561d> m97294c(Collection<C15695b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<C15695b> it = collection.iterator();
        while (it.hasNext()) {
            qf60.C19561d c19561dM97305d = it.next().m97305d();
            if (!m97299n(c19561dM97305d)) {
                arrayList.add(c19561dM97305d);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public List<qf60.C19561d> m97295d() {
        return this.f70853c;
    }

    /* JADX INFO: renamed from: h */
    public final List<qf60.C19561d> m97296h(int i) {
        PriorityQueue<C15695b> priorityQueue = new PriorityQueue<>(i, f70850g);
        priorityQueue.offer(new C15695b(0, this.f70851a.length - 1));
        m97300o(priorityQueue, i);
        return m97294c(priorityQueue);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m97297l(int i) {
        int iM97286a = m97286a(i);
        gf5.m130044g(iM97286a, this.f70856f);
        return m97298m(iM97286a, this.f70856f);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m97298m(int i, float[] fArr) {
        qf60.InterfaceC19560c[] interfaceC19560cArr = this.f70855e;
        if (interfaceC19560cArr != null && interfaceC19560cArr.length > 0) {
            int length = interfaceC19560cArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f70855e[i2].mo176335a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m97299n(qf60.C19561d c19561d) {
        return m97298m(c19561d.m176346e(), c19561d.m176344c());
    }

    /* JADX INFO: renamed from: o */
    public final void m97300o(PriorityQueue<C15695b> priorityQueue, int i) {
        C15695b c15695bPoll;
        while (priorityQueue.size() < i && (c15695bPoll = priorityQueue.poll()) != null && c15695bPoll.m97302a()) {
            priorityQueue.offer(c15695bPoll.m97309h());
            priorityQueue.offer(c15695bPoll);
        }
    }
}
