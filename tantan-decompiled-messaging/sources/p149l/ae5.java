package p149l;

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
public final class ae5 {

    /* JADX INFO: renamed from: g */
    public static final Comparator<C15588b> f68991g = new C15587a();

    /* JADX INFO: renamed from: a */
    public final int[] f68992a;

    /* JADX INFO: renamed from: b */
    public final int[] f68993b;

    /* JADX INFO: renamed from: c */
    public final List<k760.C17940d> f68994c;

    /* JADX INFO: renamed from: e */
    public final k760.InterfaceC17939c[] f68996e;

    /* JADX INFO: renamed from: f */
    public final float[] f68997f = new float[3];

    /* JADX INFO: renamed from: d */
    @Nullable
    public final TimingLogger f68995d = null;

    /* JADX INFO: renamed from: l.ae5$a */
    public static class C15587a implements Comparator<C15588b> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C15588b c15588b, C15588b c15588b2) {
            return c15588b2.m96041g() - c15588b.m96041g();
        }
    }

    /* JADX INFO: renamed from: l.ae5$b */
    public class C15588b {

        /* JADX INFO: renamed from: a */
        public int f68998a;

        /* JADX INFO: renamed from: b */
        public int f68999b;

        /* JADX INFO: renamed from: c */
        public int f69000c;

        /* JADX INFO: renamed from: d */
        public int f69001d;

        /* JADX INFO: renamed from: e */
        public int f69002e;

        /* JADX INFO: renamed from: f */
        public int f69003f;

        /* JADX INFO: renamed from: g */
        public int f69004g;

        /* JADX INFO: renamed from: h */
        public int f69005h;

        /* JADX INFO: renamed from: i */
        public int f69006i;

        public C15588b(int i, int i2) {
            this.f68998a = i;
            this.f68999b = i2;
            m96037c();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m96035a() {
            return m96039e() > 1;
        }

        /* JADX INFO: renamed from: b */
        public final int m96036b() {
            int iM96040f = m96040f();
            ae5 ae5Var = ae5.this;
            int[] iArr = ae5Var.f68992a;
            int[] iArr2 = ae5Var.f68993b;
            ae5.m96021e(iArr, iM96040f, this.f68998a, this.f68999b);
            Arrays.sort(iArr, this.f68998a, this.f68999b + 1);
            ae5.m96021e(iArr, iM96040f, this.f68998a, this.f68999b);
            int i = this.f69000c / 2;
            int i2 = this.f68998a;
            int i3 = 0;
            while (true) {
                int i4 = this.f68999b;
                if (i2 > i4) {
                    return this.f68998a;
                }
                i3 += iArr2[iArr[i2]];
                if (i3 >= i) {
                    return Math.min(i4 - 1, i2);
                }
                i2++;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m96037c() {
            ae5 ae5Var = ae5.this;
            int[] iArr = ae5Var.f68992a;
            int[] iArr2 = ae5Var.f68993b;
            int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = 0;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = this.f68998a; i8 <= this.f68999b; i8++) {
                int i9 = iArr[i8];
                i5 += iArr2[i9];
                int iM96026k = ae5.m96026k(i9);
                int iM96025j = ae5.m96025j(i9);
                int iM96024i = ae5.m96024i(i9);
                if (iM96026k > i2) {
                    i2 = iM96026k;
                }
                if (iM96026k < i) {
                    i = iM96026k;
                }
                if (iM96025j > i3) {
                    i3 = iM96025j;
                }
                if (iM96025j < i6) {
                    i6 = iM96025j;
                }
                if (iM96024i > i4) {
                    i4 = iM96024i;
                }
                if (iM96024i < i7) {
                    i7 = iM96024i;
                }
            }
            this.f69001d = i;
            this.f69002e = i2;
            this.f69003f = i6;
            this.f69004g = i3;
            this.f69005h = i7;
            this.f69006i = i4;
            this.f69000c = i5;
        }

        /* JADX INFO: renamed from: d */
        public final k760.C17940d m96038d() {
            ae5 ae5Var = ae5.this;
            int[] iArr = ae5Var.f68992a;
            int[] iArr2 = ae5Var.f68993b;
            int iM96026k = 0;
            int i = 0;
            int iM96025j = 0;
            int iM96024i = 0;
            for (int i2 = this.f68998a; i2 <= this.f68999b; i2++) {
                int i3 = iArr[i2];
                int i4 = iArr2[i3];
                i += i4;
                iM96026k += ae5.m96026k(i3) * i4;
                iM96025j += ae5.m96025j(i3) * i4;
                iM96024i += i4 * ae5.m96024i(i3);
            }
            float f = i;
            return new k760.C17940d(ae5.m96020b(Math.round(iM96026k / f), Math.round(iM96025j / f), Math.round(iM96024i / f)), i);
        }

        /* JADX INFO: renamed from: e */
        public final int m96039e() {
            return (this.f68999b + 1) - this.f68998a;
        }

        /* JADX INFO: renamed from: f */
        public final int m96040f() {
            int i = this.f69002e - this.f69001d;
            int i2 = this.f69004g - this.f69003f;
            int i3 = this.f69006i - this.f69005h;
            if (i < i2 || i < i3) {
                return (i2 < i || i2 < i3) ? -1 : -2;
            }
            return -3;
        }

        /* JADX INFO: renamed from: g */
        public final int m96041g() {
            return ((this.f69002e - this.f69001d) + 1) * ((this.f69004g - this.f69003f) + 1) * ((this.f69006i - this.f69005h) + 1);
        }

        /* JADX INFO: renamed from: h */
        public final C15588b m96042h() {
            if (!m96035a()) {
                qkq0.m175383a("Can not split a box with only 1 color");
                return null;
            }
            int iM96036b = m96036b();
            C15588b c15588b = ae5.this.new C15588b(iM96036b + 1, this.f68999b);
            this.f68999b = iM96036b;
            m96037c();
            return c15588b;
        }
    }

    public ae5(int[] iArr, int i, k760.InterfaceC17939c[] interfaceC17939cArr) {
        this.f68996e = interfaceC17939cArr;
        int[] iArr2 = new int[32768];
        this.f68993b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int iM96023g = m96023g(iArr[i2]);
            iArr[i2] = iM96023g;
            iArr2[iM96023g] = iArr2[iM96023g] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0 && m96030l(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.f68992a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        if (i3 > i) {
            this.f68994c = m96029h(i);
            return;
        }
        this.f68994c = new ArrayList();
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = iArr3[i7];
            this.f68994c.add(new k760.C17940d(m96019a(i8), iArr2[i8]));
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m96019a(int i) {
        return m96020b(m96026k(i), m96025j(i), m96024i(i));
    }

    /* JADX INFO: renamed from: b */
    public static int m96020b(int i, int i2, int i3) {
        return Color.rgb(m96022f(i, 5, 8), m96022f(i2, 5, 8), m96022f(i3, 5, 8));
    }

    /* JADX INFO: renamed from: e */
    public static void m96021e(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = m96024i(i4) | (m96025j(i4) << 10) | (m96026k(i4) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = m96026k(i5) | (m96024i(i5) << 10) | (m96025j(i5) << 5);
            i2++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m96022f(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* JADX INFO: renamed from: g */
    public static int m96023g(int i) {
        return m96022f(Color.blue(i), 8, 5) | (m96022f(Color.red(i), 8, 5) << 10) | (m96022f(Color.green(i), 8, 5) << 5);
    }

    /* JADX INFO: renamed from: i */
    public static int m96024i(int i) {
        return i & 31;
    }

    /* JADX INFO: renamed from: j */
    public static int m96025j(int i) {
        return (i >> 5) & 31;
    }

    /* JADX INFO: renamed from: k */
    public static int m96026k(int i) {
        return (i >> 10) & 31;
    }

    /* JADX INFO: renamed from: c */
    public final List<k760.C17940d> m96027c(Collection<C15588b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<C15588b> it = collection.iterator();
        while (it.hasNext()) {
            k760.C17940d c17940dM96038d = it.next().m96038d();
            if (!m96032n(c17940dM96038d)) {
                arrayList.add(c17940dM96038d);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public List<k760.C17940d> m96028d() {
        return this.f68994c;
    }

    /* JADX INFO: renamed from: h */
    public final List<k760.C17940d> m96029h(int i) {
        PriorityQueue<C15588b> priorityQueue = new PriorityQueue<>(i, f68991g);
        priorityQueue.offer(new C15588b(0, this.f68992a.length - 1));
        m96033o(priorityQueue, i);
        return m96027c(priorityQueue);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m96030l(int i) {
        int iM96019a = m96019a(i);
        ge5.m125670g(iM96019a, this.f68997f);
        return m96031m(iM96019a, this.f68997f);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m96031m(int i, float[] fArr) {
        k760.InterfaceC17939c[] interfaceC17939cArr = this.f68996e;
        if (interfaceC17939cArr != null && interfaceC17939cArr.length > 0) {
            int length = interfaceC17939cArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f68996e[i2].mo144660a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m96032n(k760.C17940d c17940d) {
        return m96031m(c17940d.m144671e(), c17940d.m144669c());
    }

    /* JADX INFO: renamed from: o */
    public final void m96033o(PriorityQueue<C15588b> priorityQueue, int i) {
        C15588b c15588bPoll;
        while (priorityQueue.size() < i && (c15588bPoll = priorityQueue.poll()) != null && c15588bPoll.m96035a()) {
            priorityQueue.offer(c15588bPoll.m96042h());
            priorityQueue.offer(c15588bPoll);
        }
    }
}
