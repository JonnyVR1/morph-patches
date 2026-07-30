package p149l;

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
public final class k760 {

    /* JADX INFO: renamed from: f */
    public static final InterfaceC17939c f121532f = new C17937a();

    /* JADX INFO: renamed from: a */
    public final List<C17940d> f121533a;

    /* JADX INFO: renamed from: b */
    public final List<dci0> f121534b;

    /* JADX INFO: renamed from: d */
    public final SparseBooleanArray f121536d = new SparseBooleanArray();

    /* JADX INFO: renamed from: c */
    public final Map<dci0, C17940d> f121535c = new e01();

    /* JADX INFO: renamed from: e */
    @Nullable
    public final C17940d f121537e = m144650a();

    /* JADX INFO: renamed from: l.k760$a */
    public static class C17937a implements InterfaceC17939c {
        @Override // p149l.k760.InterfaceC17939c
        /* JADX INFO: renamed from: a */
        public boolean mo144660a(int i, float[] fArr) {
            return (m144663d(fArr) || m144661b(fArr) || m144662c(fArr)) ? false : true;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m144661b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m144662c(float[] fArr) {
            float f = fArr[0];
            return f >= 10.0f && f <= 37.0f && fArr[1] <= 0.82f;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m144663d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }
    }

    /* JADX INFO: renamed from: l.k760$b */
    public static final class C17938b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final List<C17940d> f121538a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final Bitmap f121539b;

        /* JADX INFO: renamed from: c */
        public final List<dci0> f121540c;

        /* JADX INFO: renamed from: d */
        public int f121541d;

        /* JADX INFO: renamed from: e */
        public int f121542e;

        /* JADX INFO: renamed from: f */
        public int f121543f;

        /* JADX INFO: renamed from: g */
        public final List<InterfaceC17939c> f121544g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public Rect f121545h;

        public C17938b(@NonNull Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f121540c = arrayList;
            this.f121541d = 16;
            this.f121542e = 12544;
            this.f121543f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f121544g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                ig3.m135964a("Bitmap is not valid");
                throw null;
            }
            arrayList2.add(k760.f121532f);
            this.f121539b = bitmap;
            this.f121538a = null;
            arrayList.add(dci0.f85405e);
            arrayList.add(dci0.f85406f);
            arrayList.add(dci0.f85407g);
            arrayList.add(dci0.f85408h);
            arrayList.add(dci0.f85409i);
            arrayList.add(dci0.f85410j);
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public k760 m144664a() {
            List<C17940d> listM96028d;
            Bitmap bitmap = this.f121539b;
            InterfaceC17939c[] interfaceC17939cArr = null;
            if (bitmap != null) {
                Bitmap bitmapM144666c = m144666c(bitmap);
                Rect rect = this.f121545h;
                if (bitmapM144666c != this.f121539b && rect != null) {
                    double width = ((double) bitmapM144666c.getWidth()) / ((double) this.f121539b.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width);
                    rect.top = (int) Math.floor(((double) rect.top) * width);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), bitmapM144666c.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width), bitmapM144666c.getHeight());
                }
                int[] iArrM144665b = m144665b(bitmapM144666c);
                int i = this.f121541d;
                if (!this.f121544g.isEmpty()) {
                    List<InterfaceC17939c> list = this.f121544g;
                    interfaceC17939cArr = (InterfaceC17939c[]) list.toArray(new InterfaceC17939c[list.size()]);
                }
                ae5 ae5Var = new ae5(iArrM144665b, i, interfaceC17939cArr);
                if (bitmapM144666c != this.f121539b) {
                    bitmapM144666c.recycle();
                }
                listM96028d = ae5Var.m96028d();
            } else {
                listM96028d = this.f121538a;
                if (listM96028d == null) {
                    shg0.m184191a();
                    return null;
                }
            }
            k760 k760Var = new k760(listM96028d, this.f121540c);
            k760Var.m144651c();
            return k760Var;
        }

        /* JADX INFO: renamed from: b */
        public final int[] m144665b(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f121545h;
            if (rect == null) {
                return iArr;
            }
            int iWidth = rect.width();
            int iHeight = this.f121545h.height();
            int[] iArr2 = new int[iWidth * iHeight];
            for (int i = 0; i < iHeight; i++) {
                Rect rect2 = this.f121545h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * iWidth, iWidth);
            }
            return iArr2;
        }

        /* JADX INFO: renamed from: c */
        public final Bitmap m144666c(Bitmap bitmap) {
            int iMax;
            int i;
            double dSqrt = -1.0d;
            if (this.f121542e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.f121542e;
                if (width > i2) {
                    dSqrt = Math.sqrt(((double) i2) / ((double) width));
                }
            } else if (this.f121543f > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.f121543f)) {
                dSqrt = ((double) i) / ((double) iMax);
            }
            return dSqrt <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        }
    }

    /* JADX INFO: renamed from: l.k760$c */
    public interface InterfaceC17939c {
        /* JADX INFO: renamed from: a */
        boolean mo144660a(@ColorInt int i, @NonNull float[] fArr);
    }

    /* JADX INFO: renamed from: l.k760$d */
    public static final class C17940d {

        /* JADX INFO: renamed from: a */
        public final int f121546a;

        /* JADX INFO: renamed from: b */
        public final int f121547b;

        /* JADX INFO: renamed from: c */
        public final int f121548c;

        /* JADX INFO: renamed from: d */
        public final int f121549d;

        /* JADX INFO: renamed from: e */
        public final int f121550e;

        /* JADX INFO: renamed from: f */
        public boolean f121551f;

        /* JADX INFO: renamed from: g */
        public int f121552g;

        /* JADX INFO: renamed from: h */
        public int f121553h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public float[] f121554i;

        public C17940d(@ColorInt int i, int i2) {
            this.f121546a = Color.red(i);
            this.f121547b = Color.green(i);
            this.f121548c = Color.blue(i);
            this.f121549d = i;
            this.f121550e = i2;
        }

        /* JADX INFO: renamed from: a */
        public final void m144667a() {
            if (this.f121551f) {
                return;
            }
            int iM125669f = ge5.m125669f(-1, this.f121549d, 4.5f);
            int iM125669f2 = ge5.m125669f(-1, this.f121549d, 3.0f);
            if (iM125669f != -1 && iM125669f2 != -1) {
                this.f121553h = ge5.m125678o(-1, iM125669f);
                this.f121552g = ge5.m125678o(-1, iM125669f2);
                this.f121551f = true;
                return;
            }
            int iM125669f3 = ge5.m125669f(RoundedDrawable.DEFAULT_BORDER_COLOR, this.f121549d, 4.5f);
            int iM125669f4 = ge5.m125669f(RoundedDrawable.DEFAULT_BORDER_COLOR, this.f121549d, 3.0f);
            if (iM125669f3 == -1 || iM125669f4 == -1) {
                this.f121553h = iM125669f != -1 ? ge5.m125678o(-1, iM125669f) : ge5.m125678o(RoundedDrawable.DEFAULT_BORDER_COLOR, iM125669f3);
                this.f121552g = iM125669f2 != -1 ? ge5.m125678o(-1, iM125669f2) : ge5.m125678o(RoundedDrawable.DEFAULT_BORDER_COLOR, iM125669f4);
                this.f121551f = true;
            } else {
                this.f121553h = ge5.m125678o(RoundedDrawable.DEFAULT_BORDER_COLOR, iM125669f3);
                this.f121552g = ge5.m125678o(RoundedDrawable.DEFAULT_BORDER_COLOR, iM125669f4);
                this.f121551f = true;
            }
        }

        @ColorInt
        /* JADX INFO: renamed from: b */
        public int m144668b() {
            m144667a();
            return this.f121553h;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public float[] m144669c() {
            if (this.f121554i == null) {
                this.f121554i = new float[3];
            }
            ge5.m125664a(this.f121546a, this.f121547b, this.f121548c, this.f121554i);
            return this.f121554i;
        }

        /* JADX INFO: renamed from: d */
        public int m144670d() {
            return this.f121550e;
        }

        @ColorInt
        /* JADX INFO: renamed from: e */
        public int m144671e() {
            return this.f121549d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C17940d.class == obj.getClass()) {
                C17940d c17940d = (C17940d) obj;
                if (this.f121550e == c17940d.f121550e && this.f121549d == c17940d.f121549d) {
                    return true;
                }
            }
            return false;
        }

        @ColorInt
        /* JADX INFO: renamed from: f */
        public int m144672f() {
            m144667a();
            return this.f121552g;
        }

        public int hashCode() {
            return (this.f121549d * 31) + this.f121550e;
        }

        public String toString() {
            return C17940d.class.getSimpleName() + " [RGB: #" + Integer.toHexString(m144671e()) + "] [HSL: " + Arrays.toString(m144669c()) + "] [Population: " + this.f121550e + "] [Title Text: #" + Integer.toHexString(m144672f()) + "] [Body Text: #" + Integer.toHexString(m144668b()) + ']';
        }
    }

    public k760(List<C17940d> list, List<dci0> list2) {
        this.f121533a = list;
        this.f121534b = list2;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C17938b m144649b(@NonNull Bitmap bitmap) {
        return new C17938b(bitmap);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final C17940d m144650a() {
        int size = this.f121533a.size();
        int iM144670d = Integer.MIN_VALUE;
        C17940d c17940d = null;
        for (int i = 0; i < size; i++) {
            C17940d c17940d2 = this.f121533a.get(i);
            if (c17940d2.m144670d() > iM144670d) {
                iM144670d = c17940d2.m144670d();
                c17940d = c17940d2;
            }
        }
        return c17940d;
    }

    /* JADX INFO: renamed from: c */
    public void m144651c() {
        int size = this.f121534b.size();
        for (int i = 0; i < size; i++) {
            dci0 dci0Var = this.f121534b.get(i);
            dci0Var.m110690k();
            this.f121535c.put(dci0Var, m144653e(dci0Var));
        }
        this.f121536d.clear();
    }

    /* JADX INFO: renamed from: d */
    public final float m144652d(C17940d c17940d, dci0 dci0Var) {
        float[] fArrM144669c = c17940d.m144669c();
        C17940d c17940d2 = this.f121537e;
        return (dci0Var.m110686g() > 0.0f ? dci0Var.m110686g() * (1.0f - Math.abs(fArrM144669c[1] - dci0Var.m110688i())) : 0.0f) + (dci0Var.m110680a() > 0.0f ? dci0Var.m110680a() * (1.0f - Math.abs(fArrM144669c[2] - dci0Var.m110687h())) : 0.0f) + (dci0Var.m110685f() > 0.0f ? dci0Var.m110685f() * (c17940d.m144670d() / (c17940d2 != null ? c17940d2.m144670d() : 1)) : 0.0f);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final C17940d m144653e(dci0 dci0Var) {
        C17940d c17940dM144657i = m144657i(dci0Var);
        if (c17940dM144657i != null && dci0Var.m110689j()) {
            this.f121536d.append(c17940dM144657i.m144671e(), true);
        }
        return c17940dM144657i;
    }

    @ColorInt
    /* JADX INFO: renamed from: f */
    public int m144654f(@NonNull dci0 dci0Var, @ColorInt int i) {
        C17940d c17940dM144658j = m144658j(dci0Var);
        return c17940dM144658j != null ? c17940dM144658j.m144671e() : i;
    }

    @ColorInt
    /* JADX INFO: renamed from: g */
    public int m144655g(@ColorInt int i) {
        return m144654f(dci0.f85410j, i);
    }

    @ColorInt
    /* JADX INFO: renamed from: h */
    public int m144656h(@ColorInt int i) {
        C17940d c17940d = this.f121537e;
        return c17940d != null ? c17940d.m144671e() : i;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final C17940d m144657i(dci0 dci0Var) {
        int size = this.f121533a.size();
        float f = 0.0f;
        C17940d c17940d = null;
        for (int i = 0; i < size; i++) {
            C17940d c17940d2 = this.f121533a.get(i);
            if (m144659k(c17940d2, dci0Var)) {
                float fM144652d = m144652d(c17940d2, dci0Var);
                if (c17940d == null || fM144652d > f) {
                    c17940d = c17940d2;
                    f = fM144652d;
                }
            }
        }
        return c17940d;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public C17940d m144658j(@NonNull dci0 dci0Var) {
        return this.f121535c.get(dci0Var);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m144659k(C17940d c17940d, dci0 dci0Var) {
        float[] fArrM144669c = c17940d.m144669c();
        return fArrM144669c[1] >= dci0Var.m110684e() && fArrM144669c[1] <= dci0Var.m110682c() && fArrM144669c[2] >= dci0Var.m110683d() && fArrM144669c[2] <= dci0Var.m110681b() && !this.f121536d.get(c17940d.m144671e());
    }
}
