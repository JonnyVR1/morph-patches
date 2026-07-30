package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.Priority;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class hxs {
    /* JADX INFO: renamed from: A */
    public static void m133386A(String str, String str2) {
        m133387B(str, str2, Priority.MEDIUM, false);
    }

    /* JADX INFO: renamed from: B */
    public static void m133387B(String str, String str2, Priority priority, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        hu20.C17400e c17400e = new hu20.C17400e(str);
        c17400e.mo133006b(str2);
        c17400e.m133008g(priority);
        c17400e.m133007f().m132984L(z);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Drawable m133389b(int i, Context context, Object[] objArr) {
        int length = objArr.length;
        for (Object obj : objArr) {
            if (obj == null || ((Bitmap) obj).isRecycled()) {
                return kvc0.m147353b(g3c0.f100398T);
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(context.getResources().getColor(f1c0.f94065b));
        if (length == 1) {
            canvas.drawBitmap(Bitmap.createScaledBitmap((Bitmap) objArr[0], i, i, false), 0.0f, 0.0f, (Paint) null);
        } else if (length == 2) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) objArr[0], i, i, false);
            Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap((Bitmap) objArr[1], i, i, false);
            int i2 = t100.f167254c / 2;
            int i3 = (i / 4) + i2;
            int i4 = i / 2;
            int i5 = i4 - i2;
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateScaledBitmap, i3, 0, i5, i);
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmapCreateScaledBitmap2, i3, 0, i5, i);
            canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(bitmapCreateBitmap3, i4 + i2, 0.0f, (Paint) null);
        } else if (length == 3) {
            Bitmap bitmapCreateScaledBitmap3 = Bitmap.createScaledBitmap((Bitmap) objArr[0], i, i, false);
            int i6 = t100.f167254c / 2;
            int i7 = i / 2;
            int i8 = i7 - i6;
            Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(bitmapCreateScaledBitmap3, (i / 4) + i6, 0, i8, i);
            Bitmap bitmapCreateScaledBitmap4 = Bitmap.createScaledBitmap((Bitmap) objArr[1], i8, i8, false);
            Bitmap bitmapCreateScaledBitmap5 = Bitmap.createScaledBitmap((Bitmap) objArr[2], i8, i8, false);
            canvas.drawBitmap(bitmapCreateBitmap4, 0.0f, 0.0f, (Paint) null);
            float f = i7 + i6;
            canvas.drawBitmap(bitmapCreateScaledBitmap4, f, 0.0f, (Paint) null);
            canvas.drawBitmap(bitmapCreateScaledBitmap5, f, f, (Paint) null);
        } else if (length == 4) {
            Bitmap bitmap = (Bitmap) objArr[0];
            int i9 = i / 2;
            int i10 = t100.f167254c / 2;
            int i11 = i9 - i10;
            Bitmap bitmapCreateScaledBitmap6 = Bitmap.createScaledBitmap(bitmap, i11, i11, false);
            Bitmap bitmapCreateScaledBitmap7 = Bitmap.createScaledBitmap((Bitmap) objArr[1], i11, i11, false);
            Bitmap bitmapCreateScaledBitmap8 = Bitmap.createScaledBitmap((Bitmap) objArr[2], i11, i11, false);
            Bitmap bitmapCreateScaledBitmap9 = Bitmap.createScaledBitmap((Bitmap) objArr[3], i11, i11, false);
            canvas.drawBitmap(bitmapCreateScaledBitmap6, 0.0f, 0.0f, (Paint) null);
            float f2 = i9 + i10;
            canvas.drawBitmap(bitmapCreateScaledBitmap7, f2, 0.0f, (Paint) null);
            canvas.drawBitmap(bitmapCreateScaledBitmap8, 0.0f, f2, (Paint) null);
            canvas.drawBitmap(bitmapCreateScaledBitmap9, f2, f2, (Paint) null);
        }
        bfd0 bfd0VarM106505a = cfd0.m106505a(context.getResources(), bitmapCreateBitmap);
        bfd0VarM106505a.m101528e(i / 2);
        return bfd0VarM106505a;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m133390c(View view, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        view.setBackground(new BitmapDrawable(bitmap));
    }

    /* JADX INFO: renamed from: d */
    public static void m133391d(mcr mcrVar, String str, final View view, String str2) {
        mcrVar.duringCreated(m133392e(str, str2)).compose(mkd0.m154951C()).subscribe(ffw.m121197h(new e30() { // from class: l.exs
            @Override // p149l.e30
            public final void call(Object obj) {
                hxs.m133390c(view, (Bitmap) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public static C22306c<Bitmap> m133392e(String str, String str2) {
        TextUtils.isEmpty(str2);
        hu20.C17400e c17400e = new hu20.C17400e(str);
        c17400e.mo133006b(str2);
        return c17400e.m133007f().m132989v();
    }

    /* JADX INFO: renamed from: f */
    public static C22306c<Bitmap> m133393f(String str, final String str2, final int i) {
        TextUtils.isEmpty(str2);
        hu20.C17400e c17400e = new hu20.C17400e(str);
        c17400e.mo133006b(str2);
        return c17400e.m133009h(i, i).m133007f().m132989v().doOnNext(new e30() { // from class: l.fxs
            @Override // p149l.e30
            public final void call(Object obj) {
                hxs.m133413z((Bitmap) obj, str2, i);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static void m133394g(String str, String str2, e30<Bitmap> e30Var) {
        TextUtils.isEmpty(str2);
        hu20.C17400e c17400e = new hu20.C17400e(str);
        c17400e.mo133006b(str2);
        c17400e.m133007f().m132988u(e30Var);
    }

    /* JADX INFO: renamed from: h */
    public static C22306c<Drawable> m133395h(final Context context, List<String> list, final int i) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m133393f("context_single_room", it.next(), i));
        }
        return C22306c.combineLatest((List) arrayList, new faj() { // from class: l.gxs
            @Override // p149l.faj
            public final Object call(Object[] objArr) {
                return hxs.m133389b(i, context, objArr);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static void m133396i(String str, SimpleDraweeView simpleDraweeView, String str2, int i, int i2, boolean z, d30 d30Var, d30 d30Var2) {
        if (simpleDraweeView == null || TextUtils.isEmpty(str2)) {
            return;
        }
        hu20.C17399d c17399d = new hu20.C17399d(str);
        c17399d.mo133006b(str2);
        if (d30Var != null) {
            c17399d.m133002x(d30Var);
        }
        if (d30Var2 != null) {
            c17399d.m133001w(d30Var2);
        }
        if (!z) {
            c17399d.m133019l(false);
        }
        if (i2 != 0) {
            c17399d.m133022o(i2, i2);
        }
        c17399d.m133000v(i);
        c17399d.mo132999k().m132978D(simpleDraweeView);
    }

    /* JADX INFO: renamed from: j */
    public static void m133397j(String str, SimpleDraweeView simpleDraweeView, String str2, int i, boolean z, d30 d30Var, d30 d30Var2) {
        m133396i(str, simpleDraweeView, str2, i, 0, z, d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: k */
    public static void m133398k(String str, SimpleDraweeView simpleDraweeView, String str2) {
        m133397j(str, simpleDraweeView, str2, Api.BaseClientBuilder.API_PRIORITY_OTHER, true, null, null);
    }

    /* JADX INFO: renamed from: l */
    public static void m133399l(String str, SimpleDraweeView simpleDraweeView, String str2, int i) {
        m133397j(str, simpleDraweeView, str2, i, true, null, null);
    }

    /* JADX INFO: renamed from: m */
    public static void m133400m(String str, SimpleDraweeView simpleDraweeView, String str2, int i, int i2) {
        m133396i(str, simpleDraweeView, str2, i, i2, true, null, null);
    }

    /* JADX INFO: renamed from: n */
    public static void m133401n(String str, SimpleDraweeView simpleDraweeView, User user) {
        if (user == null || user.m60124fp() == null) {
            return;
        }
        hu20.C17405j c17405j = new hu20.C17405j(str);
        c17405j.mo133010a(user.m60124fp().profileSmall());
        c17405j.m133023p(true);
        c17405j.mo132999k().m132979E(simpleDraweeView);
    }

    /* JADX INFO: renamed from: o */
    public static void m133402o(String str, SimpleDraweeView simpleDraweeView, String str2) {
        m133409v(str, simpleDraweeView, str2, t100.m186890d(40.0f), t100.m186890d(40.0f), true, false, ipn.m137564a(), null);
    }

    /* JADX INFO: renamed from: p */
    public static void m133403p(String str, SimpleDraweeView simpleDraweeView, String str2, int i, int i2) {
        if (simpleDraweeView == null || TextUtils.isEmpty(str2)) {
            return;
        }
        hu20.C17405j c17405j = new hu20.C17405j(str);
        c17405j.mo133006b(str2);
        c17405j.m133020m(i, i2);
        c17405j.mo132999k().m132979E(simpleDraweeView);
    }

    /* JADX INFO: renamed from: q */
    public static void m133404q(SimpleDraweeView simpleDraweeView, String str, int i, int i2) {
        if (simpleDraweeView == null || TextUtils.isEmpty(str)) {
            return;
        }
        qib0.f154691G.m102332M(simpleDraweeView, str, i, i2);
    }

    /* JADX INFO: renamed from: r */
    public static void m133405r(String str, SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri) {
        if (simpleDraweeView == null || imageUri == null) {
            return;
        }
        hu20.C17405j c17405j = new hu20.C17405j(str);
        c17405j.mo133010a(imageUri);
        c17405j.m133023p(true);
        c17405j.m133025r(ipn.m137564a());
        c17405j.mo132999k().m132979E(simpleDraweeView);
    }

    /* JADX INFO: renamed from: s */
    public static void m133406s(String str, SimpleDraweeView simpleDraweeView, String str2) {
        m133409v(str, simpleDraweeView, str2, 0, 0, false, false, false, null);
    }

    /* JADX INFO: renamed from: t */
    public static void m133407t(String str, SimpleDraweeView simpleDraweeView, String str2, int i) {
        m133409v(str, simpleDraweeView, str2, i, i, false, false, false, null);
    }

    /* JADX INFO: renamed from: u */
    public static void m133408u(String str, SimpleDraweeView simpleDraweeView, String str2, int i, int i2) {
        m133409v(str, simpleDraweeView, str2, i, i2, false, false, false, null);
    }

    /* JADX INFO: renamed from: v */
    public static void m133409v(String str, SimpleDraweeView simpleDraweeView, String str2, int i, int i2, boolean z, boolean z2, boolean z3, ym2 ym2Var) {
        if (simpleDraweeView == null || TextUtils.isEmpty(str2)) {
            return;
        }
        hu20.C17405j c17405j = new hu20.C17405j(str);
        c17405j.m133024q(z2);
        c17405j.mo133006b(str2);
        c17405j.m133023p(z);
        if (i != 0 && i2 != 0) {
            c17405j.m133022o(i, i2);
        }
        if (ym2Var != null) {
            c17405j.m133021n(ym2Var);
        }
        c17405j.m133025r(z3);
        c17405j.mo132999k().m132979E(simpleDraweeView);
    }

    /* JADX INFO: renamed from: w */
    public static void m133410w(String str, SimpleDraweeView simpleDraweeView, String str2, ym2 ym2Var) {
        m133409v(str, simpleDraweeView, str2, 0, 0, false, false, false, ym2Var);
    }

    /* JADX INFO: renamed from: x */
    public static void m133411x(SimpleDraweeView simpleDraweeView, @DrawableRes int i) {
        if (simpleDraweeView == null) {
            return;
        }
        qib0.f154691G.m102354Y0(simpleDraweeView, i);
    }

    /* JADX INFO: renamed from: y */
    public static void m133412y(VDraweeView vDraweeView, String str) {
        m133406s("context_single_room", vDraweeView, str);
    }

    /* JADX INFO: renamed from: z */
    public static void m133413z(Bitmap bitmap, String str, int i) {
        if (bitmap != null) {
            String.valueOf(bitmap.getWidth());
        }
        if (bitmap == null) {
            return;
        }
        String.valueOf(bitmap.getHeight());
    }
}
