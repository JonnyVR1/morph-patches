package p153l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class qf60 {

    /* JADX INFO: renamed from: f */
    public static final InterfaceC19560c f157245f = new C19558a();

    /* JADX INFO: renamed from: a */
    public final List<C19561d> f157246a;

    /* JADX INFO: renamed from: b */
    public final List<dli0> f157247b;

    /* JADX INFO: renamed from: d */
    public final SparseBooleanArray f157249d = new SparseBooleanArray();

    /* JADX INFO: renamed from: c */
    public final Map<dli0, C19561d> f157248c = new l01();

    /* JADX INFO: renamed from: e */
    @Nullable
    public final C19561d f157250e = m176325a();

    /* JADX INFO: renamed from: l.qf60$a */
    public static class C19558a implements InterfaceC19560c {
        @Override // p153l.qf60.InterfaceC19560c
        /* JADX INFO: renamed from: a */
        public boolean mo176335a(int i, float[] fArr) {
            return (m176338d(fArr) || m176336b(fArr) || m176337c(fArr)) ? false : true;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m176336b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m176337c(float[] fArr) {
            float f = fArr[0];
            return f >= 10.0f && f <= 37.0f && fArr[1] <= 0.82f;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m176338d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }
    }

    /* JADX INFO: renamed from: l.qf60$b */
    public static final class C19559b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final List<C19561d> f157251a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final Bitmap f157252b;

        /* JADX INFO: renamed from: c */
        public final List<dli0> f157253c;

        /* JADX INFO: renamed from: d */
        public int f157254d;

        /* JADX INFO: renamed from: e */
        public int f157255e;

        /* JADX INFO: renamed from: f */
        public int f157256f;

        /* JADX INFO: renamed from: g */
        public final List<InterfaceC19560c> f157257g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public Rect f157258h;

        public C19559b(@NonNull Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f157253c = arrayList;
            this.f157254d = 16;
            this.f157255e = 12544;
            this.f157256f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f157257g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                wg3.m206174a("Bitmap is not valid");
                throw null;
            }
            arrayList2.add(qf60.f157245f);
            this.f157252b = bitmap;
            this.f157251a = null;
            arrayList.add(dli0.f89536e);
            arrayList.add(dli0.f89537f);
            arrayList.add(dli0.f89538g);
            arrayList.add(dli0.f89539h);
            arrayList.add(dli0.f89540i);
            arrayList.add(dli0.f89541j);
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public qf60 m176339a() {
            List<C19561d> listM97295d;
            Bitmap bitmap = this.f157252b;
            InterfaceC19560c[] interfaceC19560cArr = null;
            if (bitmap != null) {
                Bitmap bitmapM176341c = m176341c(bitmap);
                Rect rect = this.f157258h;
                if (bitmapM176341c != this.f157252b && rect != null) {
                    double width = ((double) bitmapM176341c.getWidth()) / ((double) this.f157252b.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width);
                    rect.top = (int) Math.floor(((double) rect.top) * width);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), bitmapM176341c.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width), bitmapM176341c.getHeight());
                }
                int[] iArrM176340b = m176340b(bitmapM176341c);
                int i = this.f157254d;
                if (!this.f157257g.isEmpty()) {
                    List<InterfaceC19560c> list = this.f157257g;
                    interfaceC19560cArr = (InterfaceC19560c[]) list.toArray(new InterfaceC19560c[list.size()]);
                }
                af5 af5Var = new af5(iArrM176340b, i, interfaceC19560cArr);
                if (bitmapM176341c != this.f157252b) {
                    bitmapM176341c.recycle();
                }
                listM97295d = af5Var.m97295d();
            } else {
                listM97295d = this.f157251a;
                if (listM97295d == null) {
                    aqg0.m99478a();
                    return null;
                }
            }
            qf60 qf60Var = new qf60(listM97295d, this.f157253c);
            qf60Var.m176326c();
            return qf60Var;
        }

        /* JADX INFO: renamed from: b */
        public final int[] m176340b(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f157258h;
            if (rect == null) {
                return iArr;
            }
            int iWidth = rect.width();
            int iHeight = this.f157258h.height();
            int[] iArr2 = new int[iWidth * iHeight];
            for (int i = 0; i < iHeight; i++) {
                Rect rect2 = this.f157258h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * iWidth, iWidth);
            }
            return iArr2;
        }

        /* JADX INFO: renamed from: c */
        public final Bitmap m176341c(Bitmap bitmap) {
            int iMax;
            int i;
            double dSqrt = -1.0d;
            if (this.f157255e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.f157255e;
                if (width > i2) {
                    dSqrt = Math.sqrt(((double) i2) / ((double) width));
                }
            } else if (this.f157256f > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.f157256f)) {
                dSqrt = ((double) i) / ((double) iMax);
            }
            return dSqrt <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        }
    }

    /* JADX INFO: renamed from: l.qf60$c */
    public interface InterfaceC19560c {
        /* JADX INFO: renamed from: a */
        boolean mo176335a(@ColorInt int i, @NonNull float[] fArr);
    }

    /* JADX INFO: renamed from: l.qf60$d */
    public static final class C19561d {

        /* JADX INFO: renamed from: a */
        public final int f157259a;

        /* JADX INFO: renamed from: b */
        public final int f157260b;

        /* JADX INFO: renamed from: c */
        public final int f157261c;

        /* JADX INFO: renamed from: d */
        public final int f157262d;

        /* JADX INFO: renamed from: e */
        public final int f157263e;

        /* JADX INFO: renamed from: f */
        public boolean f157264f;

        /* JADX INFO: renamed from: g */
        public int f157265g;

        /* JADX INFO: renamed from: h */
        public int f157266h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public float[] f157267i;

        public C19561d(@ColorInt int i, int i2) {
            this.f157259a = Color.red(i);
            this.f157260b = Color.green(i);
            this.f157261c = Color.blue(i);
            this.f157262d = i;
            this.f157263e = i2;
        }

        /* JADX INFO: renamed from: a */
        public final void m176342a() {
            if (this.f157264f) {
                return;
            }
            int iM130043f = gf5.m130043f(-1, this.f157262d, 4.5f);
            int iM130043f2 = gf5.m130043f(-1, this.f157262d, 3.0f);
            if (iM130043f != -1 && iM130043f2 != -1) {
                this.f157266h = gf5.m130052o(-1, iM130043f);
                this.f157265g = gf5.m130052o(-1, iM130043f2);
                this.f157264f = true;
                return;
            }
            int iM130043f3 = gf5.m130043f(RoundedDrawable.DEFAULT_BORDER_COLOR, this.f157262d, 4.5f);
            int iM130043f4 = gf5.m130043f(RoundedDrawable.DEFAULT_BORDER_COLOR, this.f157262d, 3.0f);
            if (iM130043f3 == -1 || iM130043f4 == -1) {
                this.f157266h = iM130043f != -1 ? gf5.m130052o(-1, iM130043f) : gf5.m130052o(RoundedDrawable.DEFAULT_BORDER_COLOR, iM130043f3);
                this.f157265g = iM130043f2 != -1 ? gf5.m130052o(-1, iM130043f2) : gf5.m130052o(RoundedDrawable.DEFAULT_BORDER_COLOR, iM130043f4);
                this.f157264f = true;
            } else {
                this.f157266h = gf5.m130052o(RoundedDrawable.DEFAULT_BORDER_COLOR, iM130043f3);
                this.f157265g = gf5.m130052o(RoundedDrawable.DEFAULT_BORDER_COLOR, iM130043f4);
                this.f157264f = true;
            }
        }

        @ColorInt
        /* JADX INFO: renamed from: b */
        public int m176343b() {
            m176342a();
            return this.f157266h;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public float[] m176344c() {
            if (this.f157267i == null) {
                this.f157267i = new float[3];
            }
            gf5.m130038a(this.f157259a, this.f157260b, this.f157261c, this.f157267i);
            return this.f157267i;
        }

        /* JADX INFO: renamed from: d */
        public int m176345d() {
            return this.f157263e;
        }

        @ColorInt
        /* JADX INFO: renamed from: e */
        public int m176346e() {
            return this.f157262d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C19561d.class == obj.getClass()) {
                C19561d c19561d = (C19561d) obj;
                if (this.f157263e == c19561d.f157263e && this.f157262d == c19561d.f157262d) {
                    return true;
                }
            }
            return false;
        }

        @ColorInt
        /* JADX INFO: renamed from: f */
        public int m176347f() {
            m176342a();
            return this.f157265g;
        }

        public int hashCode() {
            return (this.f157262d * 31) + this.f157263e;
        }

        public String toString() {
            return C19561d.class.getSimpleName() + " [RGB: #" + Integer.toHexString(m176346e()) + "] [HSL: " + Arrays.toString(m176344c()) + "] [Population: " + this.f157263e + "] [Title Text: #" + Integer.toHexString(m176347f()) + "] [Body Text: #" + Integer.toHexString(m176343b()) + ']';
        }
    }

    public qf60(List<C19561d> list, List<dli0> list2) {
        this.f157246a = list;
        this.f157247b = list2;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C19559b m176324b(@NonNull Bitmap bitmap) {
        return new C19559b(bitmap);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final C19561d m176325a() {
        int size = this.f157246a.size();
        int iM176345d = Integer.MIN_VALUE;
        C19561d c19561d = null;
        for (int i = 0; i < size; i++) {
            C19561d c19561d2 = this.f157246a.get(i);
            if (c19561d2.m176345d() > iM176345d) {
                iM176345d = c19561d2.m176345d();
                c19561d = c19561d2;
            }
        }
        return c19561d;
    }

    /* JADX INFO: renamed from: c */
    public void m176326c() {
        int size = this.f157247b.size();
        for (int i = 0; i < size; i++) {
            dli0 dli0Var = this.f157247b.get(i);
            dli0Var.m116764k();
            this.f157248c.put(dli0Var, m176328e(dli0Var));
        }
        this.f157249d.clear();
    }

    /* JADX INFO: renamed from: d */
    public final float m176327d(C19561d c19561d, dli0 dli0Var) {
        float[] fArrM176344c = c19561d.m176344c();
        C19561d c19561d2 = this.f157250e;
        return (dli0Var.m116760g() > 0.0f ? dli0Var.m116760g() * (1.0f - Math.abs(fArrM176344c[1] - dli0Var.m116762i())) : 0.0f) + (dli0Var.m116754a() > 0.0f ? dli0Var.m116754a() * (1.0f - Math.abs(fArrM176344c[2] - dli0Var.m116761h())) : 0.0f) + (dli0Var.m116759f() > 0.0f ? dli0Var.m116759f() * (c19561d.m176345d() / (c19561d2 != null ? c19561d2.m176345d() : 1)) : 0.0f);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final C19561d m176328e(dli0 dli0Var) {
        C19561d c19561dM176332i = m176332i(dli0Var);
        if (c19561dM176332i != null && dli0Var.m116763j()) {
            this.f157249d.append(c19561dM176332i.m176346e(), true);
        }
        return c19561dM176332i;
    }

    @ColorInt
    /* JADX INFO: renamed from: f */
    public int m176329f(@NonNull dli0 dli0Var, @ColorInt int i) {
        C19561d c19561dM176333j = m176333j(dli0Var);
        return c19561dM176333j != null ? c19561dM176333j.m176346e() : i;
    }

    @ColorInt
    /* JADX INFO: renamed from: g */
    public int m176330g(@ColorInt int i) {
        return m176329f(dli0.f89541j, i);
    }

    @ColorInt
    /* JADX INFO: renamed from: h */
    public int m176331h(@ColorInt int i) {
        C19561d c19561d = this.f157250e;
        return c19561d != null ? c19561d.m176346e() : i;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final C19561d m176332i(dli0 dli0Var) {
        int size = this.f157246a.size();
        float f = 0.0f;
        C19561d c19561d = null;
        for (int i = 0; i < size; i++) {
            C19561d c19561d2 = this.f157246a.get(i);
            if (m176334k(c19561d2, dli0Var)) {
                float fM176327d = m176327d(c19561d2, dli0Var);
                if (c19561d == null || fM176327d > f) {
                    c19561d = c19561d2;
                    f = fM176327d;
                }
            }
        }
        return c19561d;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public C19561d m176333j(@NonNull dli0 dli0Var) {
        return this.f157248c.get(dli0Var);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m176334k(C19561d c19561d, dli0 dli0Var) {
        float[] fArrM176344c = c19561d.m176344c();
        return fArrM176344c[1] >= dli0Var.m116758e() && fArrM176344c[1] <= dli0Var.m116756c() && fArrM176344c[2] >= dli0Var.m116757d() && fArrM176344c[2] <= dli0Var.m116755b() && !this.f157249d.get(c19561d.m176346e());
    }
}
