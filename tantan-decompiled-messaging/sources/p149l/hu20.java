package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class hu20 {

    /* JADX INFO: renamed from: e */
    public static final Map<String, LinkedHashSet<C17403h>> f109471e = new HashMap();

    /* JADX INFO: renamed from: f */
    public static hpd0 f109472f = new hpd0("live_no_image_mode", Boolean.FALSE);

    /* JADX INFO: renamed from: g */
    public static Integer f109473g;

    /* JADX INFO: renamed from: a */
    public C17405j f109474a;

    /* JADX INFO: renamed from: b */
    public C17400e f109475b;

    /* JADX INFO: renamed from: c */
    public C17399d f109476c;

    /* JADX INFO: renamed from: d */
    public boolean f109477d = false;

    /* JADX INFO: renamed from: l.hu20$a */
    public class C17396a implements InterfaceC17402g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SimpleDraweeView f109478a;

        /* JADX INFO: renamed from: l.hu20$a$a */
        public class a extends ym2 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ym2 f109480a;

            public a(ym2 ym2Var) {
                this.f109480a = ym2Var;
            }

            @Override // p149l.ym2
            /* JADX INFO: renamed from: h */
            public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
                super.mo39108h(str, ngmVar, animatable);
                ym2 ym2Var = this.f109480a;
                if (ym2Var != null) {
                    ym2Var.mo39108h(str, ngmVar, animatable);
                }
                if (animatable instanceof aq0) {
                    hfw.m130790a("AnimLiveImage", "normal use anim webp");
                }
                C17396a c17396a = C17396a.this;
                hu20 hu20Var = hu20.this;
                hu20Var.m132980F("normal", c17396a.f109478a, ngmVar, hu20Var.f109474a.f109495b, hu20.this.f109474a.f109496c, hu20.this.f109474a.f109502f);
            }
        }

        public C17396a(SimpleDraweeView simpleDraweeView) {
            this.f109478a = simpleDraweeView;
        }

        @Override // p149l.hu20.InterfaceC17402g
        /* JADX INFO: renamed from: a */
        public void mo113674a(nvc0 nvc0Var) {
            boolean zIsEmpty = TextUtils.isEmpty(hu20.this.f109474a.f109495b);
            hu20 hu20Var = hu20.this;
            if (!zIsEmpty) {
                hu20Var.f109474a.f109495b = hu20.m132973t(hu20.this.f109474a.f109505i, hu20.this.f109474a.f109495b, this.f109478a, nvc0Var);
            } else if (hu20Var.f109474a.f109496c != null) {
                j760<Boolean, Integer> j760VarM188819a = tgm.m188819a(this.f109478a, nvc0Var);
                if (j760VarM188819a.f116565b.intValue() != 0) {
                    boolean zBooleanValue = j760VarM188819a.f116564a.booleanValue();
                    hu20 hu20Var2 = hu20.this;
                    if (zBooleanValue) {
                        hu20Var2.f109474a.f109496c.formatType = 2;
                    } else {
                        hu20Var2.f109474a.f109496c.formatType = 1;
                    }
                    hu20.this.f109474a.f109496c.formatWidth = tgm.m188821c(j760VarM188819a.f116565b.intValue());
                }
            }
            e30<ImageRequestBuilder> e30Var = new e30() { // from class: l.gu20
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f104374a.m132994c((ImageRequestBuilder) obj);
                }
            };
            ym2 ym2Var = hu20.this.f109474a.f109504h;
            hu20.this.f109474a.f109504h = new a(ym2Var);
            if (TextUtils.isEmpty(hu20.this.f109474a.f109495b)) {
                ImageRequest imageRequestM102345T0 = qib0.f154691G.m102345T0(this.f109478a, hu20.this.f109474a.f109496c, hu20.this.f109474a.f109502f, hu20.this.f109474a.f109507k, nvc0Var, hu20.this.f109474a.f109504h, e30Var);
                hu20 hu20Var3 = hu20.this;
                hu20Var3.m132985m(imageRequestM102345T0, this.f109478a, hu20Var3.f109474a.f109494a);
            } else {
                ImageRequest imageRequestM102347U0 = qib0.f154691G.m102347U0(this.f109478a, hu20.this.f109474a.f109495b, hu20.this.f109474a.f109502f, hu20.this.f109474a.f109507k, nvc0Var, hu20.this.f109474a.f109504h, e30Var);
                hu20 hu20Var4 = hu20.this;
                hu20Var4.m132985m(imageRequestM102347U0, this.f109478a, hu20Var4.f109474a.f109494a);
            }
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m132994c(ImageRequestBuilder imageRequestBuilder) {
            if (hu20.this.f109474a.f109503g) {
                imageRequestBuilder.m8599G(zem.m218356b().m96257p(Bitmap.Config.RGB_565).m96242a());
            }
            if (hu20.this.f109474a.f109508l == 0 && hu20.this.f109474a.f109509m == 0) {
                return;
            }
            imageRequestBuilder.m8603K(new biq(hu20.this.f109474a.f109508l, hu20.this.f109474a.f109509m));
        }
    }

    /* JADX INFO: renamed from: l.hu20$b */
    public class RunnableC17397b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f109482a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC17402g f109483b;

        public RunnableC17397b(View view, InterfaceC17402g interfaceC17402g) {
            this.f109482a = view;
            this.f109483b = interfaceC17402g;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iM132992z = hu20.this.m132992z(this.f109482a);
            int iM132991y = hu20.this.m132991y(this.f109482a);
            if (hu20.this.m132975A(iM132992z) && hu20.this.m132975A(iM132991y)) {
                hu20.this.f109477d = true;
                this.f109483b.mo113674a(new nvc0(iM132992z, iM132991y));
            }
        }
    }

    /* JADX INFO: renamed from: l.hu20$d */
    public static final class C17399d extends C17405j {

        /* JADX INFO: renamed from: n */
        public d30 f109488n;

        /* JADX INFO: renamed from: o */
        public d30 f109489o;

        /* JADX INFO: renamed from: p */
        public int f109490p;

        public C17399d(String str) {
            super(str);
            this.f109490p = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }

        @Override // p149l.hu20.C17405j
        /* JADX INFO: renamed from: k */
        public hu20 mo132999k() {
            return new hu20(this);
        }

        /* JADX INFO: renamed from: v */
        public C17399d m133000v(int i) {
            this.f109490p = i;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C17399d m133001w(d30 d30Var) {
            this.f109489o = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C17399d m133002x(d30 d30Var) {
            this.f109488n = d30Var;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.hu20$e */
    public static final class C17400e extends C17401f {

        /* JADX INFO: renamed from: d */
        public Priority f109491d;

        /* JADX INFO: renamed from: e */
        public int f109492e;

        /* JADX INFO: renamed from: f */
        public int f109493f;

        public C17400e(String str) {
            super(str);
            this.f109491d = Priority.MEDIUM;
        }

        @Override // p149l.hu20.C17401f
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ C17401f mo133006b(String str) {
            return super.mo133006b(str);
        }

        /* JADX INFO: renamed from: f */
        public hu20 m133007f() {
            return new hu20(this);
        }

        /* JADX INFO: renamed from: g */
        public C17400e m133008g(Priority priority) {
            this.f109491d = priority;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C17400e m133009h(int i, int i2) {
            this.f109492e = i;
            this.f109493f = i2;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.hu20$f */
    public static class C17401f {

        /* JADX INFO: renamed from: a */
        public String f109494a;

        /* JADX INFO: renamed from: b */
        public String f109495b = null;

        /* JADX INFO: renamed from: c */
        public Picture.ImageUri f109496c = null;

        public C17401f(String str) {
            this.f109494a = str;
        }

        /* JADX INFO: renamed from: a */
        public C17401f mo133010a(Picture.ImageUri imageUri) {
            this.f109496c = imageUri;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C17401f mo133006b(String str) {
            this.f109495b = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.hu20$g */
    public interface InterfaceC17402g {
        /* JADX INFO: renamed from: a */
        void mo113674a(nvc0 nvc0Var);
    }

    /* JADX INFO: renamed from: l.hu20$h */
    public static class C17403h {

        /* JADX INFO: renamed from: a */
        public WeakReference<View> f109497a;

        /* JADX INFO: renamed from: b */
        public ImageRequest f109498b;

        public C17403h(View view, ImageRequest imageRequest) {
            this.f109497a = view == null ? null : new WeakReference<>(view);
            this.f109498b = imageRequest;
        }
    }

    /* JADX INFO: renamed from: l.hu20$i */
    public static class C17404i extends vq0 {

        /* JADX INFO: renamed from: e */
        public int f109499e;

        public C17404i(@Nullable uq0 uq0Var, int i) {
            super(uq0Var);
            this.f109499e = i;
        }

        @Override // p149l.vq0, p149l.gr0
        public int getLoopCount() {
            return this.f109499e;
        }
    }

    /* JADX INFO: renamed from: l.hu20$j */
    public static class C17405j extends C17401f {

        /* JADX INFO: renamed from: d */
        public int f109500d;

        /* JADX INFO: renamed from: e */
        public int f109501e;

        /* JADX INFO: renamed from: f */
        public boolean f109502f;

        /* JADX INFO: renamed from: g */
        public boolean f109503g;

        /* JADX INFO: renamed from: h */
        public ym2 f109504h;

        /* JADX INFO: renamed from: i */
        public boolean f109505i;

        /* JADX INFO: renamed from: j */
        public boolean f109506j;

        /* JADX INFO: renamed from: k */
        public boolean f109507k;

        /* JADX INFO: renamed from: l */
        public int f109508l;

        /* JADX INFO: renamed from: m */
        public int f109509m;

        public C17405j(String str) {
            super(str);
            this.f109500d = 0;
            this.f109501e = 0;
            this.f109502f = false;
            this.f109503g = false;
            this.f109505i = false;
            this.f109506j = false;
            this.f109507k = true;
        }

        @Override // p149l.hu20.C17401f
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ C17401f mo133010a(Picture.ImageUri imageUri) {
            return super.mo133010a(imageUri);
        }

        @Override // p149l.hu20.C17401f
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ C17401f mo133006b(String str) {
            return super.mo133006b(str);
        }

        /* JADX INFO: renamed from: k */
        public hu20 mo132999k() {
            return new hu20(this);
        }

        /* JADX INFO: renamed from: l */
        public C17405j m133019l(boolean z) {
            this.f109507k = z;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C17405j m133020m(int i, int i2) {
            this.f109508l = i;
            this.f109509m = i2;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C17405j m133021n(ym2 ym2Var) {
            this.f109504h = ym2Var;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C17405j m133022o(int i, int i2) {
            this.f109500d = i;
            this.f109501e = i2;
            this.f109506j = true;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C17405j m133023p(boolean z) {
            this.f109502f = z;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C17405j m133024q(boolean z) {
            this.f109505i = z;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C17405j m133025r(boolean z) {
            this.f109503g = z;
            return this;
        }
    }

    public hu20(C17405j c17405j) {
        this.f109474a = c17405j;
    }

    /* JADX INFO: renamed from: J */
    public static String m132956J(ngm ngmVar) {
        return "imageInfo h = " + ngmVar.getHeight() + " w = " + ngmVar.getWidth();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m132960d(String str, z3g0 z3g0Var) {
        ImageRequest imageRequestM8614a = qib0.f154691G.m184724n(str).m8614a();
        bkb0 bkb0Var = qib0.f154691G;
        Objects.requireNonNull(z3g0Var);
        bkb0Var.m102318F(imageRequestM8614a, new rjb0(z3g0Var));
    }

    @MainThread
    /* JADX INFO: renamed from: o */
    public static void m132969o(String str) {
        Map<String, LinkedHashSet<C17403h>> map = f109471e;
        if (!map.containsKey(str) || map.get(str) == null) {
            return;
        }
        try {
            m132971q(str, map.get(str), map.get(str).size() - 50);
        } catch (Exception e) {
            CrashHelper.m81296c(new RuntimeException("evictOverSizeScene " + str, e));
        }
    }

    @MainThread
    /* JADX INFO: renamed from: p */
    public static void m132970p(String str) {
        Map<String, LinkedHashSet<C17403h>> map = f109471e;
        if (!map.containsKey(str) || map.get(str) == null) {
            return;
        }
        try {
            m132971q(str, map.get(str), map.get(str).size());
        } catch (Exception e) {
            CrashHelper.m81296c(new RuntimeException("evictOverSizeScene " + str, e));
        }
    }

    @MainThread
    /* JADX INFO: renamed from: q */
    public static void m132971q(String str, LinkedHashSet<C17403h> linkedHashSet, int i) {
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        linkedHashSet.size();
        HashSet hashSet = new HashSet();
        if (linkedHashSet.size() == i) {
            hashSet.addAll(linkedHashSet);
            linkedHashSet.clear();
        } else {
            Iterator<C17403h> it = linkedHashSet.iterator();
            HashMap map = new HashMap();
            while (it.hasNext() && i2 < i) {
                C17403h next = it.next();
                WeakReference<View> weakReference = next.f109497a;
                View view = weakReference == null ? null : weakReference.get();
                if (view == null) {
                    hashSet.add(next);
                } else if (xdl0.m208349O0(view)) {
                    if (map.get(view) != null) {
                        i2++;
                        hashSet.add((C17403h) map.get(view));
                    }
                    map.put(view, next);
                } else {
                    hashSet.add(next);
                    i2++;
                }
            }
            linkedHashSet.removeAll(hashSet);
        }
        if (hashSet.isEmpty()) {
            return;
        }
        qib0.f154691G.m102346U(new HashSet(vwb.m200303Q(hashSet, new w9j() { // from class: l.cu20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((hu20.C17403h) obj).f109498b;
            }
        })));
    }

    /* JADX INFO: renamed from: s */
    public static void m132972s() {
        qib0.f154691G.m102348V();
    }

    /* JADX INFO: renamed from: t */
    public static String m132973t(boolean z, String str, SimpleDraweeView simpleDraweeView, nvc0 nvc0Var) {
        if (z) {
            return str;
        }
        return str.contains("?") ? m132973t(z, str.split("\\?")[0], simpleDraweeView, nvc0Var) : tgm.m188820b(str, simpleDraweeView, nvc0Var);
    }

    /* JADX INFO: renamed from: w */
    public static int m132974w() {
        if (f109473g == null) {
            Display defaultDisplay = ((WindowManager) tf80.m188658e((WindowManager) App.f15369e.getSystemService(BLiveBottomPopupStyleTypeEnum.window))).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f109473g = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f109473g.intValue();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m132975A(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m132976B(String str, View view, ImageRequest imageRequest) {
        Map<String, LinkedHashSet<C17403h>> map = f109471e;
        if (map.containsKey(str)) {
            LinkedHashSet<C17403h> linkedHashSet = map.get(str);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
            }
            linkedHashSet.add(new C17403h(view, imageRequest));
        } else {
            LinkedHashSet<C17403h> linkedHashSet2 = new LinkedHashSet<>();
            linkedHashSet2.add(new C17403h(view, imageRequest));
            map.put(str, linkedHashSet2);
        }
        m132987r(str, "context_common", 80);
        m132987r(str, "context_livingAct", 300);
        m132987r(str, "context_single_room", 200);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m132977C(SimpleDraweeView simpleDraweeView, nvc0 nvc0Var) {
        C17399d c17399d = this.f109476c;
        c17399d.f109495b = m132973t(false, c17399d.f109495b, simpleDraweeView, nvc0Var);
        fi70 fi70VarM8204B = l6j.m148750g().mo121501a(Uri.parse(this.f109476c.f109495b)).m8233z(this.f109476c.f109507k).m8204B(new C17398c(simpleDraweeView));
        m132985m(fi70VarM8204B.m8221n(), simpleDraweeView, this.f109476c.f109494a);
        simpleDraweeView.setController(fi70VarM8204B.build());
    }

    /* JADX INFO: renamed from: D */
    public void m132978D(final SimpleDraweeView simpleDraweeView) {
        C17399d c17399d;
        if (simpleDraweeView == null || (c17399d = this.f109476c) == null) {
            return;
        }
        if (c17399d.f109495b == null && c17399d.f109496c == null) {
            return;
        }
        m132986n(simpleDraweeView, c17399d.f109500d, c17399d.f109501e, new InterfaceC17402g() { // from class: l.du20
            @Override // p149l.hu20.InterfaceC17402g
            /* JADX INFO: renamed from: a */
            public final void mo113674a(nvc0 nvc0Var) {
                this.f87950a.m132977C(simpleDraweeView, nvc0Var);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public void m132979E(SimpleDraweeView simpleDraweeView) {
        C17405j c17405j;
        if (simpleDraweeView == null || (c17405j = this.f109474a) == null) {
            return;
        }
        if (c17405j.f109495b == null && c17405j.f109496c == null) {
            return;
        }
        boolean unused = c17405j.f109506j;
        C17405j c17405j2 = this.f109474a;
        m132986n(simpleDraweeView, c17405j2.f109500d, c17405j2.f109501e, new C17396a(simpleDraweeView));
    }

    /* JADX INFO: renamed from: F */
    public final void m132980F(String str, SimpleDraweeView simpleDraweeView, ngm ngmVar, String str2, Picture.ImageUri imageUri, boolean z) {
        m132981H(simpleDraweeView);
        m132956J(ngmVar);
        m132983K(this.f109474a, this.f109476c);
        m132982I(str2, imageUri);
        if ((ngmVar.getHeight() * 1.0f) / simpleDraweeView.getMeasuredHeight() > 1.2f || (ngmVar.getWidth() * 1.0f) / simpleDraweeView.getMeasuredWidth() > 1.2f) {
            try {
                simpleDraweeView.getResources().getResourceName(simpleDraweeView.getId());
            } catch (Exception unused) {
                simpleDraweeView.getId();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final String m132981H(SimpleDraweeView simpleDraweeView) {
        if (!xdl0.m208349O0(simpleDraweeView)) {
            return "origin view is gone ";
        }
        if (simpleDraweeView.getMeasuredHeight() == 0 || simpleDraweeView.getMeasuredWidth() == 0) {
            return "origin view size = 0";
        }
        return "origin view size h = " + simpleDraweeView.getMeasuredHeight() + " w = " + simpleDraweeView.getMeasuredWidth();
    }

    /* JADX INFO: renamed from: I */
    public final String m132982I(String str, Picture.ImageUri imageUri) {
        if (!TextUtils.isEmpty(str)) {
            return " url = " + str;
        }
        if (imageUri == null) {
            return "url = null";
        }
        return " url = " + imageUri.formatted();
    }

    /* JADX INFO: renamed from: K */
    public final String m132983K(C17405j c17405j, C17399d c17399d) {
        int i;
        int i2;
        if (c17405j == null && c17399d == null) {
            return "";
        }
        if (c17405j != null) {
            i = c17405j.f109500d;
            i2 = c17405j.f109501e;
        } else {
            i = 0;
            i2 = 0;
        }
        if (c17399d != null) {
            i = c17399d.f109500d;
            i2 = c17399d.f109501e;
        }
        return " suggest size w = " + i + " h = " + i2;
    }

    /* JADX INFO: renamed from: L */
    public void m132984L(boolean z) {
        String str;
        C17400e c17400e = this.f109475b;
        if (c17400e == null || (str = c17400e.f109495b) == null) {
            return;
        }
        ImageRequest imageRequestM8614a = qib0.f154691G.m184724n(str).m8606N(this.f109475b.f109491d).m8614a();
        m132985m(imageRequestM8614a, null, this.f109475b.f109494a);
        if (z) {
            l6j.m148744a().m164423w(imageRequestM8614a, null);
        } else {
            l6j.m148744a().m164421u(imageRequestM8614a, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m132985m(final ImageRequest imageRequest, final View view, final String str) {
        e51.m114748M(new Runnable() { // from class: l.fu20
            @Override // java.lang.Runnable
            public final void run() {
                this.f99299a.m132976B(str, view, imageRequest);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m132986n(View view, int i, int i2, InterfaceC17402g interfaceC17402g) {
        if (i == 0 && i2 == 0) {
            i = view.getWidth();
            i2 = view.getHeight();
        }
        if (i == 0 && i2 == 0) {
            view.post(new RunnableC17397b(view, interfaceC17402g));
        }
        if (i <= 0 || i2 <= 0) {
            return;
        }
        interfaceC17402g.mo113674a(new nvc0(i, i2));
    }

    /* JADX INFO: renamed from: r */
    public final void m132987r(String str, String str2, int i) {
        if (str2.equals(str)) {
            LinkedHashSet<C17403h> linkedHashSet = f109471e.get(str2);
            if (linkedHashSet.size() > i) {
                try {
                    m132971q(str2, linkedHashSet, (int) (i * 0.4f));
                } catch (Exception e) {
                    CrashHelper.m81296c(new RuntimeException("evictOverSizeScene " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i, e));
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public ImageRequest m132988u(e30<Bitmap> e30Var) {
        ImageRequest imageRequestM8614a = qib0.f154691G.m184724n(this.f109475b.f109495b).m8614a();
        qib0.f154691G.m102318F(imageRequestM8614a, e30Var);
        m132985m(imageRequestM8614a, null, this.f109475b.f109494a);
        return imageRequestM8614a;
    }

    /* JADX INFO: renamed from: v */
    public C22306c<Bitmap> m132989v() {
        if (this.f109475b == null) {
            this.f109475b = new C17400e("context_square");
        }
        final String strM132973t = (this.f109475b.f109492e <= 0 || this.f109475b.f109493f <= 0) ? this.f109475b.f109495b : m132973t(false, this.f109475b.f109495b, null, new nvc0(this.f109475b.f109492e, this.f109475b.f109493f));
        return C22306c.create(new C22306c.a() { // from class: l.eu20
            @Override // p149l.e30
            public final void call(Object obj) {
                hu20.m132960d(strM132973t, (z3g0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final int m132990x(View view, int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        if (view.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        return m132974w();
    }

    /* JADX INFO: renamed from: y */
    public final int m132991y(View view) {
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int measuredHeight = layoutParams != null ? layoutParams.height : 0;
        if (measuredHeight == 0) {
            measuredHeight = view.getMeasuredHeight();
        }
        return m132990x(view, view.getHeight(), measuredHeight, paddingTop);
    }

    /* JADX INFO: renamed from: z */
    public final int m132992z(View view) {
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int measuredWidth = layoutParams != null ? layoutParams.width : 0;
        if (measuredWidth == 0) {
            measuredWidth = view.getMeasuredWidth();
        }
        return m132990x(view, view.getWidth(), measuredWidth, paddingLeft);
    }

    public hu20(C17400e c17400e) {
        this.f109475b = c17400e;
    }

    public hu20(C17399d c17399d) {
        this.f109476c = c17399d;
    }

    /* JADX INFO: renamed from: l.hu20$c */
    public class C17398c extends ei2<ngm> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SimpleDraweeView f109485b;

        public C17398c(SimpleDraweeView simpleDraweeView) {
            this.f109485b = simpleDraweeView;
        }

        @Override // p149l.ei2, p149l.q26
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo8234e(String str, @Nullable ngm ngmVar, @Nullable Animatable animatable) {
            if (animatable instanceof aq0) {
                hfw.m130790a("AnimLiveImage", "anim webp");
                aq0 aq0Var = (aq0) animatable;
                aq0Var.m98213i(new C17404i(aq0Var.m98208d(), hu20.this.f109476c.f109490p));
                aq0Var.m98214j(new a());
            }
            hu20 hu20Var = hu20.this;
            hu20Var.m132980F("anim", this.f109485b, ngmVar, hu20Var.f109476c.f109495b, hu20.this.f109476c.f109496c, false);
        }

        /* JADX INFO: renamed from: l.hu20$c$a */
        public class a implements hr0 {
            public a() {
            }

            @Override // p149l.hr0
            /* JADX INFO: renamed from: b */
            public void mo132610b(@NonNull Drawable drawable) {
                if (hu20.this.f109476c.f109489o != null) {
                    hu20.this.f109476c.f109489o.call();
                }
            }

            @Override // p149l.hr0
            public void onAnimationStart(@NonNull Drawable drawable) {
                if (hu20.this.f109476c.f109488n != null) {
                    hu20.this.f109476c.f109488n.call();
                }
            }

            @Override // p149l.hr0
            public void onAnimationRepeat(@NonNull Drawable drawable) {
            }

            @Override // p149l.hr0
            /* JADX INFO: renamed from: a */
            public void mo76385a(@NonNull Drawable drawable, int i) {
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m132955G(Context context) {
    }
}
