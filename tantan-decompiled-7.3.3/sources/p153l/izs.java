package p153l;

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
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class izs {
    /* JADX INFO: renamed from: A */
    public static void m142848A(String str, String str2) {
        m142849B(str, str2, Priority.MEDIUM, false);
    }

    /* JADX INFO: renamed from: B */
    public static void m142849B(String str, String str2, Priority priority, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        r230.C19745e c19745e = new r230.C19745e(str);
        c19745e.mo179511b(str2);
        c19745e.m179513g(priority);
        c19745e.m179512f().m179489L(z);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Drawable m142851b(int i, Context context, Object[] objArr) {
        int length = objArr.length;
        for (Object obj : objArr) {
            if (obj == null || ((Bitmap) obj).isRecycled()) {
                return n3d0.m161278b(mbc0.f135660T);
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(context.getResources().getColor(l9c0.f130589b));
        if (length == 1) {
            canvas.drawBitmap(Bitmap.createScaledBitmap((Bitmap) objArr[0], i, i, false), 0.0f, 0.0f, (Paint) null);
        } else if (length == 2) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) objArr[0], i, i, false);
            Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap((Bitmap) objArr[1], i, i, false);
            int i2 = qa00.f156316c / 2;
            int i3 = (i / 4) + i2;
            int i4 = i / 2;
            int i5 = i4 - i2;
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateScaledBitmap, i3, 0, i5, i);
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmapCreateScaledBitmap2, i3, 0, i5, i);
            canvas.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(bitmapCreateBitmap3, i4 + i2, 0.0f, (Paint) null);
        } else if (length == 3) {
            Bitmap bitmapCreateScaledBitmap3 = Bitmap.createScaledBitmap((Bitmap) objArr[0], i, i, false);
            int i6 = qa00.f156316c / 2;
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
            int i10 = qa00.f156316c / 2;
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
        dnd0 dnd0VarM121524a = end0.m121524a(context.getResources(), bitmapCreateBitmap);
        dnd0VarM121524a.m117059e(i / 2);
        return dnd0VarM121524a;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m142852c(View view, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        view.setBackground(new BitmapDrawable(bitmap));
    }

    /* JADX INFO: renamed from: d */
    public static void m142853d(ner nerVar, String str, final View view, String str2) {
        nerVar.duringCreated(m142854e(str, str2)).compose(psd0.m173592C()).subscribe(dhw.m115829h(new y20() { // from class: l.fzs
            @Override // p153l.y20
            public final void call(Object obj) {
                izs.m142852c(view, (Bitmap) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public static C22421c<Bitmap> m142854e(String str, String str2) {
        TextUtils.isEmpty(str2);
        r230.C19745e c19745e = new r230.C19745e(str);
        c19745e.mo179511b(str2);
        return c19745e.m179512f().m179494v();
    }

    /* JADX INFO: renamed from: f */
    public static C22421c<Bitmap> m142855f(String str, final String str2, final int i) {
        TextUtils.isEmpty(str2);
        r230.C19745e c19745e = new r230.C19745e(str);
        c19745e.mo179511b(str2);
        return c19745e.m179514h(i, i).m179512f().m179494v().doOnNext(new y20() { // from class: l.gzs
            @Override // p153l.y20
            public final void call(Object obj) {
                izs.m142875z((Bitmap) obj, str2, i);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static void m142856g(String str, String str2, y20<Bitmap> y20Var) {
        TextUtils.isEmpty(str2);
        r230.C19745e c19745e = new r230.C19745e(str);
        c19745e.mo179511b(str2);
        c19745e.m179512f().m179493u(y20Var);
    }

    /* JADX INFO: renamed from: h */
    public static C22421c<Drawable> m142857h(final Context context, List<String> list, final int i) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m142855f("context_single_room", it.next(), i));
        }
        return C22421c.combineLatest((List) arrayList, new zcj() { // from class: l.hzs
            @Override // p153l.zcj
            public final Object call(Object[] objArr) {
                return izs.m142851b(i, context, objArr);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static void m142858i(String str, SimpleDraweeView simpleDraweeView, String str2, int i, int i2, boolean z, x20 x20Var, x20 x20Var2) {
        if (simpleDraweeView == null || TextUtils.isEmpty(str2)) {
            return;
        }
        r230.C19744d c19744d = new r230.C19744d(str);
        c19744d.mo179511b(str2);
        if (x20Var != null) {
            c19744d.m179507x(x20Var);
        }
        if (x20Var2 != null) {
            c19744d.m179506w(x20Var2);
        }
        if (!z) {
            c19744d.m179524l(false);
        }
        if (i2 != 0) {
            c19744d.m179527o(i2, i2);
        }
        c19744d.m179505v(i);
        c19744d.mo179504k().m179483D(simpleDraweeView);
    }

    /* JADX INFO: renamed from: j */
    public static void m142859j(String str, SimpleDraweeView simpleDraweeView, String str2, int i, boolean z, x20 x20Var, x20 x20Var2) {
        m142858i(str, simpleDraweeView, str2, i, 0, z, x20Var, x20Var2);
    }

    /* JADX INFO: renamed from: k */
    public static void m142860k(String str, SimpleDraweeView simpleDraweeView, String str2) {
        m142859j(str, simpleDraweeView, str2, Api.BaseClientBuilder.API_PRIORITY_OTHER, true, null, null);
    }

    /* JADX INFO: renamed from: l */
    public static void m142861l(String str, SimpleDraweeView simpleDraweeView, String str2, int i) {
        m142859j(str, simpleDraweeView, str2, i, true, null, null);
    }

    /* JADX INFO: renamed from: m */
    public static void m142862m(String str, SimpleDraweeView simpleDraweeView, String str2, int i, int i2) {
        m142858i(str, simpleDraweeView, str2, i, i2, true, null, null);
    }

    /* JADX INFO: renamed from: n */
    public static void m142863n(String str, SimpleDraweeView simpleDraweeView, User user) {
        if (user == null || user.m61308fp() == null) {
            return;
        }
        r230.C19750j c19750j = new r230.C19750j(str);
        c19750j.mo179515a(user.m61308fp().profileSmall());
        c19750j.m179528p(true);
        c19750j.mo179504k().m179484E(simpleDraweeView);
    }

    /* JADX INFO: renamed from: o */
    public static void m142864o(String str, SimpleDraweeView simpleDraweeView, String str2) {
        m142871v(str, simpleDraweeView, str2, qa00.m175859d(40.0f), qa00.m175859d(40.0f), true, false, irn.m141839a(), null);
    }

    /* JADX INFO: renamed from: p */
    public static void m142865p(String str, SimpleDraweeView simpleDraweeView, String str2, int i, int i2) {
        if (simpleDraweeView == null || TextUtils.isEmpty(str2)) {
            return;
        }
        r230.C19750j c19750j = new r230.C19750j(str);
        c19750j.mo179511b(str2);
        c19750j.m179525m(i, i2);
        c19750j.mo179504k().m179484E(simpleDraweeView);
    }

    /* JADX INFO: renamed from: q */
    public static void m142866q(SimpleDraweeView simpleDraweeView, String str, int i, int i2) {
        if (simpleDraweeView == null || TextUtils.isEmpty(str)) {
            return;
        }
        uqb0.f180374G.m127116M(simpleDraweeView, str, i, i2);
    }

    /* JADX INFO: renamed from: r */
    public static void m142867r(String str, SimpleDraweeView simpleDraweeView, Picture.ImageUri imageUri) {
        if (simpleDraweeView == null || imageUri == null) {
            return;
        }
        r230.C19750j c19750j = new r230.C19750j(str);
        c19750j.mo179515a(imageUri);
        c19750j.m179528p(true);
        c19750j.m179530r(irn.m141839a());
        c19750j.mo179504k().m179484E(simpleDraweeView);
    }

    /* JADX INFO: renamed from: s */
    public static void m142868s(String str, SimpleDraweeView simpleDraweeView, String str2) {
        m142871v(str, simpleDraweeView, str2, 0, 0, false, false, false, null);
    }

    /* JADX INFO: renamed from: t */
    public static void m142869t(String str, SimpleDraweeView simpleDraweeView, String str2, int i) {
        m142871v(str, simpleDraweeView, str2, i, i, false, false, false, null);
    }

    /* JADX INFO: renamed from: u */
    public static void m142870u(String str, SimpleDraweeView simpleDraweeView, String str2, int i, int i2) {
        m142871v(str, simpleDraweeView, str2, i, i2, false, false, false, null);
    }

    /* JADX INFO: renamed from: v */
    public static void m142871v(String str, SimpleDraweeView simpleDraweeView, String str2, int i, int i2, boolean z, boolean z2, boolean z3, fn2 fn2Var) {
        if (simpleDraweeView == null || TextUtils.isEmpty(str2)) {
            return;
        }
        r230.C19750j c19750j = new r230.C19750j(str);
        c19750j.m179529q(z2);
        c19750j.mo179511b(str2);
        c19750j.m179528p(z);
        if (i != 0 && i2 != 0) {
            c19750j.m179527o(i, i2);
        }
        if (fn2Var != null) {
            c19750j.m179526n(fn2Var);
        }
        c19750j.m179530r(z3);
        c19750j.mo179504k().m179484E(simpleDraweeView);
    }

    /* JADX INFO: renamed from: w */
    public static void m142872w(String str, SimpleDraweeView simpleDraweeView, String str2, fn2 fn2Var) {
        m142871v(str, simpleDraweeView, str2, 0, 0, false, false, false, fn2Var);
    }

    /* JADX INFO: renamed from: x */
    public static void m142873x(SimpleDraweeView simpleDraweeView, @DrawableRes int i) {
        if (simpleDraweeView == null) {
            return;
        }
        uqb0.f180374G.m127138Y0(simpleDraweeView, i);
    }

    /* JADX INFO: renamed from: y */
    public static void m142874y(VDraweeView vDraweeView, String str) {
        m142868s("context_single_room", vDraweeView, str);
    }

    /* JADX INFO: renamed from: z */
    public static void m142875z(Bitmap bitmap, String str, int i) {
        if (bitmap != null) {
            String.valueOf(bitmap.getWidth());
        }
        if (bitmap == null) {
            return;
        }
        String.valueOf(bitmap.getHeight());
    }
}
