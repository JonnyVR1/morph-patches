package p153l;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class cwi {

    /* JADX INFO: renamed from: l.cwi$a */
    public interface InterfaceC16383a<T> {
        /* JADX INFO: renamed from: a */
        void mo112919a(T t, Rect rect);
    }

    /* JADX INFO: renamed from: l.cwi$b */
    public interface InterfaceC16384b<T, V> {
        /* JADX INFO: renamed from: a */
        V mo112920a(T t, int i);

        /* JADX INFO: renamed from: b */
        int mo112921b(T t);
    }

    /* JADX INFO: renamed from: l.cwi$c */
    public static class C16385c<T> implements Comparator<T> {

        /* JADX INFO: renamed from: a */
        public final Rect f84125a = new Rect();

        /* JADX INFO: renamed from: b */
        public final Rect f84126b = new Rect();

        /* JADX INFO: renamed from: c */
        public final boolean f84127c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC16383a<T> f84128d;

        public C16385c(boolean z, InterfaceC16383a<T> interfaceC16383a) {
            this.f84127c = z;
            this.f84128d = interfaceC16383a;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            Rect rect = this.f84125a;
            Rect rect2 = this.f84126b;
            this.f84128d.mo112919a(t, rect);
            this.f84128d.mo112919a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                return this.f84127c ? 1 : -1;
            }
            if (i3 > i4) {
                return this.f84127c ? -1 : 1;
            }
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                return this.f84127c ? 1 : -1;
            }
            if (i7 > i8) {
                return this.f84127c ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m112904a(int i, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        boolean zM112905b = m112905b(i, rect, rect2);
        if (m112905b(i, rect, rect3) || !zM112905b) {
            return false;
        }
        return !m112913j(i, rect, rect3) || i == 17 || i == 66 || m112914k(i, rect, rect2) < m112916m(i, rect, rect3);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m112905b(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        wg3.m206174a("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX INFO: renamed from: c */
    public static <L, T> T m112906c(@NonNull L l2, @NonNull InterfaceC16384b<L, T> interfaceC16384b, @NonNull InterfaceC16383a<T> interfaceC16383a, @Nullable T t, @NonNull Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        T t2 = null;
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i != 130) {
                wg3.m206174a("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return null;
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int iMo112921b = interfaceC16384b.mo112921b(l2);
        Rect rect3 = new Rect();
        for (int i2 = 0; i2 < iMo112921b; i2++) {
            T tMo112920a = interfaceC16384b.mo112920a(l2, i2);
            if (tMo112920a != t) {
                interfaceC16383a.mo112919a(tMo112920a, rect3);
                if (m112911h(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = tMo112920a;
                }
            }
        }
        return t2;
    }

    /* JADX INFO: renamed from: d */
    public static <L, T> T m112907d(@NonNull L l2, @NonNull InterfaceC16384b<L, T> interfaceC16384b, @NonNull InterfaceC16383a<T> interfaceC16383a, @Nullable T t, int i, boolean z, boolean z2) {
        int iMo112921b = interfaceC16384b.mo112921b(l2);
        ArrayList arrayList = new ArrayList(iMo112921b);
        for (int i2 = 0; i2 < iMo112921b; i2++) {
            arrayList.add(interfaceC16384b.mo112920a(l2, i2));
        }
        Collections.sort(arrayList, new C16385c(z, interfaceC16383a));
        if (i == 1) {
            return (T) m112909f(t, arrayList, z2);
        }
        if (i == 2) {
            return (T) m112908e(t, arrayList, z2);
        }
        wg3.m206174a("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m112908e(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int iLastIndexOf = (t == null ? -1 : arrayList.lastIndexOf(t)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* JADX INFO: renamed from: f */
    public static <T> T m112909f(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int iIndexOf = (t == null ? size : arrayList.indexOf(t)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* JADX INFO: renamed from: g */
    public static int m112910g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m112911h(int i, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        if (!m112912i(rect, rect2, i)) {
            return false;
        }
        if (m112912i(rect, rect3, i) && !m112904a(i, rect, rect2, rect3)) {
            return !m112904a(i, rect, rect3, rect2) && m112910g(m112914k(i, rect, rect2), m112918o(i, rect, rect2)) < m112910g(m112914k(i, rect, rect3), m112918o(i, rect, rect3));
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m112912i(@NonNull Rect rect, @NonNull Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            wg3.m206174a("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            return false;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m112913j(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        }
        if (i == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i == 66) {
            return rect.right <= rect2.left;
        }
        if (i == 130) {
            return rect.bottom <= rect2.top;
        }
        wg3.m206174a("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static int m112914k(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(0, m112915l(i, rect, rect2));
    }

    /* JADX INFO: renamed from: l */
    public static int m112915l(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i == 17) {
            return rect.left - rect2.right;
        }
        if (i == 33) {
            return rect.top - rect2.bottom;
        }
        if (i == 66) {
            return rect2.left - rect.right;
        }
        if (i == 130) {
            return rect2.top - rect.bottom;
        }
        wg3.m206174a("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public static int m112916m(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(1, m112917n(i, rect, rect2));
    }

    /* JADX INFO: renamed from: n */
    public static int m112917n(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i == 17) {
            return rect.left - rect2.left;
        }
        if (i == 33) {
            return rect.top - rect2.top;
        }
        if (i == 66) {
            return rect2.right - rect.right;
        }
        if (i == 130) {
            return rect2.bottom - rect.bottom;
        }
        wg3.m206174a("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public static int m112918o(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        wg3.m206174a("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
