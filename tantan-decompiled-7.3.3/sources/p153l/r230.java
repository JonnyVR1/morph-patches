package p153l;

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
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class r230 {

    /* JADX INFO: renamed from: e */
    public static final Map<String, LinkedHashSet<C19748h>> f160873e = new HashMap();

    /* JADX INFO: renamed from: f */
    public static jxd0 f160874f = new jxd0("live_no_image_mode", Boolean.FALSE);

    /* JADX INFO: renamed from: g */
    public static Integer f160875g;

    /* JADX INFO: renamed from: a */
    public C19750j f160876a;

    /* JADX INFO: renamed from: b */
    public C19745e f160877b;

    /* JADX INFO: renamed from: c */
    public C19744d f160878c;

    /* JADX INFO: renamed from: d */
    public boolean f160879d = false;

    /* JADX INFO: renamed from: l.r230$a */
    public class C19741a implements InterfaceC19747g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SimpleDraweeView f160880a;

        /* JADX INFO: renamed from: l.r230$a$a */
        public class a extends fn2 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ fn2 f160882a;

            public a(fn2 fn2Var) {
                this.f160882a = fn2Var;
            }

            @Override // p153l.fn2
            /* JADX INFO: renamed from: h */
            public void mo40111h(String str, qim qimVar, Animatable animatable) {
                super.mo40111h(str, qimVar, animatable);
                fn2 fn2Var = this.f160882a;
                if (fn2Var != null) {
                    fn2Var.mo40111h(str, qimVar, animatable);
                }
                if (animatable instanceof wp0) {
                    fhw.m125605a("AnimLiveImage", "normal use anim webp");
                }
                C19741a c19741a = C19741a.this;
                r230 r230Var = r230.this;
                r230Var.m179485F("normal", c19741a.f160880a, qimVar, r230Var.f160876a.f160897b, r230.this.f160876a.f160898c, r230.this.f160876a.f160904f);
            }
        }

        public C19741a(SimpleDraweeView simpleDraweeView) {
            this.f160880a = simpleDraweeView;
        }

        @Override // p153l.r230.InterfaceC19747g
        /* JADX INFO: renamed from: a */
        public void mo161155a(q3d0 q3d0Var) {
            boolean zIsEmpty = TextUtils.isEmpty(r230.this.f160876a.f160897b);
            r230 r230Var = r230.this;
            if (!zIsEmpty) {
                r230Var.f160876a.f160897b = r230.m179478t(r230.this.f160876a.f160907i, r230.this.f160876a.f160897b, this.f160880a, q3d0Var);
            } else if (r230Var.f160876a.f160898c != null) {
                pf60<Boolean, Integer> pf60VarM206591a = wim.m206591a(this.f160880a, q3d0Var);
                if (pf60VarM206591a.f152157b.intValue() != 0) {
                    boolean zBooleanValue = pf60VarM206591a.f152156a.booleanValue();
                    r230 r230Var2 = r230.this;
                    if (zBooleanValue) {
                        r230Var2.f160876a.f160898c.formatType = 2;
                    } else {
                        r230Var2.f160876a.f160898c.formatType = 1;
                    }
                    r230.this.f160876a.f160898c.formatWidth = wim.m206593c(pf60VarM206591a.f152157b.intValue());
                }
            }
            y20<ImageRequestBuilder> y20Var = new y20() { // from class: l.q230
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f155274a.m179499c((ImageRequestBuilder) obj);
                }
            };
            fn2 fn2Var = r230.this.f160876a.f160906h;
            r230.this.f160876a.f160906h = new a(fn2Var);
            if (TextUtils.isEmpty(r230.this.f160876a.f160897b)) {
                ImageRequest imageRequestM127129T0 = uqb0.f180374G.m127129T0(this.f160880a, r230.this.f160876a.f160898c, r230.this.f160876a.f160904f, r230.this.f160876a.f160909k, q3d0Var, r230.this.f160876a.f160906h, y20Var);
                r230 r230Var3 = r230.this;
                r230Var3.m179490m(imageRequestM127129T0, this.f160880a, r230Var3.f160876a.f160896a);
            } else {
                ImageRequest imageRequestM127131U0 = uqb0.f180374G.m127131U0(this.f160880a, r230.this.f160876a.f160897b, r230.this.f160876a.f160904f, r230.this.f160876a.f160909k, q3d0Var, r230.this.f160876a.f160906h, y20Var);
                r230 r230Var4 = r230.this;
                r230Var4.m179490m(imageRequestM127131U0, this.f160880a, r230Var4.f160876a.f160896a);
            }
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m179499c(ImageRequestBuilder imageRequestBuilder) {
            if (r230.this.f160876a.f160905g) {
                imageRequestBuilder.m8653G(phm.m172329b().m176610p(Bitmap.Config.RGB_565).m176595a());
            }
            if (r230.this.f160876a.f160910l == 0 && r230.this.f160876a.f160911m == 0) {
                return;
            }
            imageRequestBuilder.m8657K(new bkq(r230.this.f160876a.f160910l, r230.this.f160876a.f160911m));
        }
    }

    /* JADX INFO: renamed from: l.r230$b */
    public class RunnableC19742b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f160884a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC19747g f160885b;

        public RunnableC19742b(View view, InterfaceC19747g interfaceC19747g) {
            this.f160884a = view;
            this.f160885b = interfaceC19747g;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iM179497z = r230.this.m179497z(this.f160884a);
            int iM179496y = r230.this.m179496y(this.f160884a);
            if (r230.this.m179480A(iM179497z) && r230.this.m179480A(iM179496y)) {
                r230.this.f160879d = true;
                this.f160885b.mo161155a(new q3d0(iM179497z, iM179496y));
            }
        }
    }

    /* JADX INFO: renamed from: l.r230$d */
    public static final class C19744d extends C19750j {

        /* JADX INFO: renamed from: n */
        public x20 f160890n;

        /* JADX INFO: renamed from: o */
        public x20 f160891o;

        /* JADX INFO: renamed from: p */
        public int f160892p;

        public C19744d(String str) {
            super(str);
            this.f160892p = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }

        @Override // p153l.r230.C19750j
        /* JADX INFO: renamed from: k */
        public r230 mo179504k() {
            return new r230(this);
        }

        /* JADX INFO: renamed from: v */
        public C19744d m179505v(int i) {
            this.f160892p = i;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C19744d m179506w(x20 x20Var) {
            this.f160891o = x20Var;
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C19744d m179507x(x20 x20Var) {
            this.f160890n = x20Var;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.r230$e */
    public static final class C19745e extends C19746f {

        /* JADX INFO: renamed from: d */
        public Priority f160893d;

        /* JADX INFO: renamed from: e */
        public int f160894e;

        /* JADX INFO: renamed from: f */
        public int f160895f;

        public C19745e(String str) {
            super(str);
            this.f160893d = Priority.MEDIUM;
        }

        @Override // p153l.r230.C19746f
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ C19746f mo179511b(String str) {
            return super.mo179511b(str);
        }

        /* JADX INFO: renamed from: f */
        public r230 m179512f() {
            return new r230(this);
        }

        /* JADX INFO: renamed from: g */
        public C19745e m179513g(Priority priority) {
            this.f160893d = priority;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C19745e m179514h(int i, int i2) {
            this.f160894e = i;
            this.f160895f = i2;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.r230$f */
    public static class C19746f {

        /* JADX INFO: renamed from: a */
        public String f160896a;

        /* JADX INFO: renamed from: b */
        public String f160897b = null;

        /* JADX INFO: renamed from: c */
        public Picture.ImageUri f160898c = null;

        public C19746f(String str) {
            this.f160896a = str;
        }

        /* JADX INFO: renamed from: a */
        public C19746f mo179515a(Picture.ImageUri imageUri) {
            this.f160898c = imageUri;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C19746f mo179511b(String str) {
            this.f160897b = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.r230$g */
    public interface InterfaceC19747g {
        /* JADX INFO: renamed from: a */
        void mo161155a(q3d0 q3d0Var);
    }

    /* JADX INFO: renamed from: l.r230$h */
    public static class C19748h {

        /* JADX INFO: renamed from: a */
        public WeakReference<View> f160899a;

        /* JADX INFO: renamed from: b */
        public ImageRequest f160900b;

        public C19748h(View view, ImageRequest imageRequest) {
            this.f160899a = view == null ? null : new WeakReference<>(view);
            this.f160900b = imageRequest;
        }
    }

    /* JADX INFO: renamed from: l.r230$i */
    public static class C19749i extends zq0 {

        /* JADX INFO: renamed from: e */
        public int f160901e;

        public C19749i(@Nullable yq0 yq0Var, int i) {
            super(yq0Var);
            this.f160901e = i;
        }

        @Override // p153l.zq0, p153l.kr0
        public int getLoopCount() {
            return this.f160901e;
        }
    }

    /* JADX INFO: renamed from: l.r230$j */
    public static class C19750j extends C19746f {

        /* JADX INFO: renamed from: d */
        public int f160902d;

        /* JADX INFO: renamed from: e */
        public int f160903e;

        /* JADX INFO: renamed from: f */
        public boolean f160904f;

        /* JADX INFO: renamed from: g */
        public boolean f160905g;

        /* JADX INFO: renamed from: h */
        public fn2 f160906h;

        /* JADX INFO: renamed from: i */
        public boolean f160907i;

        /* JADX INFO: renamed from: j */
        public boolean f160908j;

        /* JADX INFO: renamed from: k */
        public boolean f160909k;

        /* JADX INFO: renamed from: l */
        public int f160910l;

        /* JADX INFO: renamed from: m */
        public int f160911m;

        public C19750j(String str) {
            super(str);
            this.f160902d = 0;
            this.f160903e = 0;
            this.f160904f = false;
            this.f160905g = false;
            this.f160907i = false;
            this.f160908j = false;
            this.f160909k = true;
        }

        @Override // p153l.r230.C19746f
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ C19746f mo179515a(Picture.ImageUri imageUri) {
            return super.mo179515a(imageUri);
        }

        @Override // p153l.r230.C19746f
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ C19746f mo179511b(String str) {
            return super.mo179511b(str);
        }

        /* JADX INFO: renamed from: k */
        public r230 mo179504k() {
            return new r230(this);
        }

        /* JADX INFO: renamed from: l */
        public C19750j m179524l(boolean z) {
            this.f160909k = z;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C19750j m179525m(int i, int i2) {
            this.f160910l = i;
            this.f160911m = i2;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C19750j m179526n(fn2 fn2Var) {
            this.f160906h = fn2Var;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C19750j m179527o(int i, int i2) {
            this.f160902d = i;
            this.f160903e = i2;
            this.f160908j = true;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C19750j m179528p(boolean z) {
            this.f160904f = z;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C19750j m179529q(boolean z) {
            this.f160907i = z;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C19750j m179530r(boolean z) {
            this.f160905g = z;
            return this;
        }
    }

    public r230(C19750j c19750j) {
        this.f160876a = c19750j;
    }

    /* JADX INFO: renamed from: J */
    public static String m179461J(qim qimVar) {
        return "imageInfo h = " + qimVar.getHeight() + " w = " + qimVar.getWidth();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m179465d(String str, gcg0 gcg0Var) {
        ImageRequest imageRequestM8668a = uqb0.f180374G.m98797n(str).m8668a();
        fsb0 fsb0Var = uqb0.f180374G;
        Objects.requireNonNull(gcg0Var);
        fsb0Var.m127102F(imageRequestM8668a, new vrb0(gcg0Var));
    }

    @MainThread
    /* JADX INFO: renamed from: o */
    public static void m179474o(String str) {
        Map<String, LinkedHashSet<C19748h>> map = f160873e;
        if (!map.containsKey(str) || map.get(str) == null) {
            return;
        }
        try {
            m179476q(str, map.get(str), map.get(str).size() - 50);
        } catch (Exception e) {
            CrashHelper.m82479c(new RuntimeException("evictOverSizeScene " + str, e));
        }
    }

    @MainThread
    /* JADX INFO: renamed from: p */
    public static void m179475p(String str) {
        Map<String, LinkedHashSet<C19748h>> map = f160873e;
        if (!map.containsKey(str) || map.get(str) == null) {
            return;
        }
        try {
            m179476q(str, map.get(str), map.get(str).size());
        } catch (Exception e) {
            CrashHelper.m82479c(new RuntimeException("evictOverSizeScene " + str, e));
        }
    }

    @MainThread
    /* JADX INFO: renamed from: q */
    public static void m179476q(String str, LinkedHashSet<C19748h> linkedHashSet, int i) {
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
            Iterator<C19748h> it = linkedHashSet.iterator();
            HashMap map = new HashMap();
            while (it.hasNext() && i2 < i) {
                C19748h next = it.next();
                WeakReference<View> weakReference = next.f160899a;
                View view = weakReference == null ? null : weakReference.get();
                if (view == null) {
                    hashSet.add(next);
                } else if (bnl0.m105529O0(view)) {
                    if (map.get(view) != null) {
                        i2++;
                        hashSet.add((C19748h) map.get(view));
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
        uqb0.f180374G.m127130U(new HashSet(jyb.m147486Q(hashSet, new qcj() { // from class: l.m230
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((r230.C19748h) obj).f160900b;
            }
        })));
    }

    /* JADX INFO: renamed from: s */
    public static void m179477s() {
        uqb0.f180374G.m127132V();
    }

    /* JADX INFO: renamed from: t */
    public static String m179478t(boolean z, String str, SimpleDraweeView simpleDraweeView, q3d0 q3d0Var) {
        if (z) {
            return str;
        }
        return str.contains("?") ? m179478t(z, str.split("\\?")[0], simpleDraweeView, q3d0Var) : wim.m206592b(str, simpleDraweeView, q3d0Var);
    }

    /* JADX INFO: renamed from: w */
    public static int m179479w() {
        if (f160875g == null) {
            Display defaultDisplay = ((WindowManager) yn80.m216775e((WindowManager) App.f16088e.getSystemService(BLiveBottomPopupStyleTypeEnum.window))).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f160875g = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f160875g.intValue();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m179480A(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m179481B(String str, View view, ImageRequest imageRequest) {
        Map<String, LinkedHashSet<C19748h>> map = f160873e;
        if (map.containsKey(str)) {
            LinkedHashSet<C19748h> linkedHashSet = map.get(str);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
            }
            linkedHashSet.add(new C19748h(view, imageRequest));
        } else {
            LinkedHashSet<C19748h> linkedHashSet2 = new LinkedHashSet<>();
            linkedHashSet2.add(new C19748h(view, imageRequest));
            map.put(str, linkedHashSet2);
        }
        m179492r(str, "context_common", 80);
        m179492r(str, "context_livingAct", 300);
        m179492r(str, "context_single_room", 200);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m179482C(SimpleDraweeView simpleDraweeView, q3d0 q3d0Var) {
        C19744d c19744d = this.f160878c;
        c19744d.f160897b = m179478t(false, c19744d.f160897b, simpleDraweeView, q3d0Var);
        lq70 lq70VarM8258B = f9j.m124665g().mo155332a(Uri.parse(this.f160878c.f160897b)).m8287z(this.f160878c.f160909k).m8258B(new C19743c(simpleDraweeView));
        m179490m(lq70VarM8258B.m8275n(), simpleDraweeView, this.f160878c.f160896a);
        simpleDraweeView.setController(lq70VarM8258B.build());
    }

    /* JADX INFO: renamed from: D */
    public void m179483D(final SimpleDraweeView simpleDraweeView) {
        C19744d c19744d;
        if (simpleDraweeView == null || (c19744d = this.f160878c) == null) {
            return;
        }
        if (c19744d.f160897b == null && c19744d.f160898c == null) {
            return;
        }
        m179491n(simpleDraweeView, c19744d.f160902d, c19744d.f160903e, new InterfaceC19747g() { // from class: l.n230
            @Override // p153l.r230.InterfaceC19747g
            /* JADX INFO: renamed from: a */
            public final void mo161155a(q3d0 q3d0Var) {
                this.f139807a.m179482C(simpleDraweeView, q3d0Var);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public void m179484E(SimpleDraweeView simpleDraweeView) {
        C19750j c19750j;
        if (simpleDraweeView == null || (c19750j = this.f160876a) == null) {
            return;
        }
        if (c19750j.f160897b == null && c19750j.f160898c == null) {
            return;
        }
        boolean unused = c19750j.f160908j;
        C19750j c19750j2 = this.f160876a;
        m179491n(simpleDraweeView, c19750j2.f160902d, c19750j2.f160903e, new C19741a(simpleDraweeView));
    }

    /* JADX INFO: renamed from: F */
    public final void m179485F(String str, SimpleDraweeView simpleDraweeView, qim qimVar, String str2, Picture.ImageUri imageUri, boolean z) {
        m179486H(simpleDraweeView);
        m179461J(qimVar);
        m179488K(this.f160876a, this.f160878c);
        m179487I(str2, imageUri);
        if ((qimVar.getHeight() * 1.0f) / simpleDraweeView.getMeasuredHeight() > 1.2f || (qimVar.getWidth() * 1.0f) / simpleDraweeView.getMeasuredWidth() > 1.2f) {
            try {
                simpleDraweeView.getResources().getResourceName(simpleDraweeView.getId());
            } catch (Exception unused) {
                simpleDraweeView.getId();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final String m179486H(SimpleDraweeView simpleDraweeView) {
        if (!bnl0.m105529O0(simpleDraweeView)) {
            return "origin view is gone ";
        }
        if (simpleDraweeView.getMeasuredHeight() == 0 || simpleDraweeView.getMeasuredWidth() == 0) {
            return "origin view size = 0";
        }
        return "origin view size h = " + simpleDraweeView.getMeasuredHeight() + " w = " + simpleDraweeView.getMeasuredWidth();
    }

    /* JADX INFO: renamed from: I */
    public final String m179487I(String str, Picture.ImageUri imageUri) {
        if (!TextUtils.isEmpty(str)) {
            return " url = " + str;
        }
        if (imageUri == null) {
            return "url = null";
        }
        return " url = " + imageUri.formatted();
    }

    /* JADX INFO: renamed from: K */
    public final String m179488K(C19750j c19750j, C19744d c19744d) {
        int i;
        int i2;
        if (c19750j == null && c19744d == null) {
            return "";
        }
        if (c19750j != null) {
            i = c19750j.f160902d;
            i2 = c19750j.f160903e;
        } else {
            i = 0;
            i2 = 0;
        }
        if (c19744d != null) {
            i = c19744d.f160902d;
            i2 = c19744d.f160903e;
        }
        return " suggest size w = " + i + " h = " + i2;
    }

    /* JADX INFO: renamed from: L */
    public void m179489L(boolean z) {
        String str;
        C19745e c19745e = this.f160877b;
        if (c19745e == null || (str = c19745e.f160897b) == null) {
            return;
        }
        ImageRequest imageRequestM8668a = uqb0.f180374G.m98797n(str).m8660N(this.f160877b.f160893d).m8668a();
        m179490m(imageRequestM8668a, null, this.f160877b.f160896a);
        if (z) {
            f9j.m124659a().m181734w(imageRequestM8668a, null);
        } else {
            f9j.m124659a().m181732u(imageRequestM8668a, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m179490m(final ImageRequest imageRequest, final View view, final String str) {
        l51.m152893M(new Runnable() { // from class: l.p230
            @Override // java.lang.Runnable
            public final void run() {
                this.f150236a.m179481B(str, view, imageRequest);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m179491n(View view, int i, int i2, InterfaceC19747g interfaceC19747g) {
        if (i == 0 && i2 == 0) {
            i = view.getWidth();
            i2 = view.getHeight();
        }
        if (i == 0 && i2 == 0) {
            view.post(new RunnableC19742b(view, interfaceC19747g));
        }
        if (i <= 0 || i2 <= 0) {
            return;
        }
        interfaceC19747g.mo161155a(new q3d0(i, i2));
    }

    /* JADX INFO: renamed from: r */
    public final void m179492r(String str, String str2, int i) {
        if (str2.equals(str)) {
            LinkedHashSet<C19748h> linkedHashSet = f160873e.get(str2);
            if (linkedHashSet.size() > i) {
                try {
                    m179476q(str2, linkedHashSet, (int) (i * 0.4f));
                } catch (Exception e) {
                    CrashHelper.m82479c(new RuntimeException("evictOverSizeScene " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i, e));
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public ImageRequest m179493u(y20<Bitmap> y20Var) {
        ImageRequest imageRequestM8668a = uqb0.f180374G.m98797n(this.f160877b.f160897b).m8668a();
        uqb0.f180374G.m127102F(imageRequestM8668a, y20Var);
        m179490m(imageRequestM8668a, null, this.f160877b.f160896a);
        return imageRequestM8668a;
    }

    /* JADX INFO: renamed from: v */
    public C22421c<Bitmap> m179494v() {
        if (this.f160877b == null) {
            this.f160877b = new C19745e("context_square");
        }
        final String strM179478t = (this.f160877b.f160894e <= 0 || this.f160877b.f160895f <= 0) ? this.f160877b.f160897b : m179478t(false, this.f160877b.f160897b, null, new q3d0(this.f160877b.f160894e, this.f160877b.f160895f));
        return C22421c.create(new C22421c.a() { // from class: l.o230
            @Override // p153l.y20
            public final void call(Object obj) {
                r230.m179465d(strM179478t, (gcg0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final int m179495x(View view, int i, int i2, int i3) {
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
        return m179479w();
    }

    /* JADX INFO: renamed from: y */
    public final int m179496y(View view) {
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int measuredHeight = layoutParams != null ? layoutParams.height : 0;
        if (measuredHeight == 0) {
            measuredHeight = view.getMeasuredHeight();
        }
        return m179495x(view, view.getHeight(), measuredHeight, paddingTop);
    }

    /* JADX INFO: renamed from: z */
    public final int m179497z(View view) {
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int measuredWidth = layoutParams != null ? layoutParams.width : 0;
        if (measuredWidth == 0) {
            measuredWidth = view.getMeasuredWidth();
        }
        return m179495x(view, view.getWidth(), measuredWidth, paddingLeft);
    }

    public r230(C19745e c19745e) {
        this.f160877b = c19745e;
    }

    public r230(C19744d c19744d) {
        this.f160878c = c19744d;
    }

    /* JADX INFO: renamed from: l.r230$c */
    public class C19743c extends li2<qim> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SimpleDraweeView f160887b;

        public C19743c(SimpleDraweeView simpleDraweeView) {
            this.f160887b = simpleDraweeView;
        }

        @Override // p153l.li2, p153l.v36
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo8288e(String str, @Nullable qim qimVar, @Nullable Animatable animatable) {
            if (animatable instanceof wp0) {
                fhw.m125605a("AnimLiveImage", "anim webp");
                wp0 wp0Var = (wp0) animatable;
                wp0Var.m207395i(new C19749i(wp0Var.m207390d(), r230.this.f160878c.f160892p));
                wp0Var.m207396j(new a());
            }
            r230 r230Var = r230.this;
            r230Var.m179485F("anim", this.f160887b, qimVar, r230Var.f160878c.f160897b, r230.this.f160878c.f160898c, false);
        }

        /* JADX INFO: renamed from: l.r230$c$a */
        public class a implements lr0 {
            public a() {
            }

            @Override // p153l.lr0
            /* JADX INFO: renamed from: b */
            public void mo155514b(@NonNull Drawable drawable) {
                if (r230.this.f160878c.f160891o != null) {
                    r230.this.f160878c.f160891o.call();
                }
            }

            @Override // p153l.lr0
            public void onAnimationStart(@NonNull Drawable drawable) {
                if (r230.this.f160878c.f160890n != null) {
                    r230.this.f160878c.f160890n.call();
                }
            }

            @Override // p153l.lr0
            public void onAnimationRepeat(@NonNull Drawable drawable) {
            }

            @Override // p153l.lr0
            /* JADX INFO: renamed from: a */
            public void mo77568a(@NonNull Drawable drawable, int i) {
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m179460G(Context context) {
    }
}
