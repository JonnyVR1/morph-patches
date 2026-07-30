package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C1066c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.C1081h;
import com.bumptech.glide.load.resource.bitmap.C1110a;
import com.bumptech.glide.load.resource.bitmap.C1112c;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.manager.C1128m;
import com.bumptech.glide.manager.InterfaceC1119d;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p153l.a23;
import p153l.aij0;
import p153l.anj;
import p153l.ar3;
import p153l.avm;
import p153l.b21;
import p153l.b23;
import p153l.b4d0;
import p153l.b4k;
import p153l.bg60;
import p153l.bnj;
import p153l.br3;
import p153l.cli0;
import p153l.clm;
import p153l.cnj;
import p153l.cr3;
import p153l.cvb0;
import p153l.dnj;
import p153l.dr3;
import p153l.e4k;
import p153l.e4k0;
import p153l.e8g0;
import p153l.h4d0;
import p153l.inj;
import p153l.j7g0;
import p153l.l2d0;
import p153l.lpy;
import p153l.m13;
import p153l.m2d0;
import p153l.m7g0;
import p153l.nce;
import p153l.o01;
import p153l.p2d0;
import p153l.pii;
import p153l.q7f;
import p153l.r4k0;
import p153l.uq3;
import p153l.v3d0;
import p153l.v6c;
import p153l.v6y;
import p153l.vii;
import p153l.vn80;
import p153l.w23;
import p153l.w6y;
import p153l.wml;
import p153l.wtq0;
import p153l.wuw;
import p153l.wxj0;
import p153l.xq0;
import p153l.xq3;
import p153l.xxj0;
import p153l.y13;
import p153l.y6y;
import p153l.ylk0;
import p153l.yxj0;
import p153l.yzv;
import p153l.z13;
import p153l.z3d0;
import p153l.z5k0;
import p153l.zq3;

/* JADX INFO: renamed from: com.bumptech.glide.a */
/* JADX INFO: loaded from: classes.dex */
public class ComponentCallbacks2C1057a implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: l */
    @GuardedBy("Glide.class")
    private static volatile ComponentCallbacks2C1057a f4324l;

    /* JADX INFO: renamed from: m */
    private static volatile boolean f4325m;

    /* JADX INFO: renamed from: a */
    private final C1081h f4326a;

    /* JADX INFO: renamed from: b */
    private final w23 f4327b;

    /* JADX INFO: renamed from: c */
    private final lpy f4328c;

    /* JADX INFO: renamed from: d */
    private final C1059c f4329d;

    /* JADX INFO: renamed from: e */
    private final Registry f4330e;

    /* JADX INFO: renamed from: f */
    private final o01 f4331f;

    /* JADX INFO: renamed from: g */
    private final C1128m f4332g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC1119d f4333h;

    /* JADX INFO: renamed from: j */
    private final a f4335j;

    /* JADX INFO: renamed from: i */
    @GuardedBy("managers")
    private final List<m2d0> f4334i = new ArrayList();

    /* JADX INFO: renamed from: k */
    private MemoryCategory f4336k = MemoryCategory.NORMAL;

    /* JADX INFO: renamed from: com.bumptech.glide.a$a */
    public interface a {
        @NonNull
        p2d0 build();
    }

    public ComponentCallbacks2C1057a(@NonNull Context context, @NonNull C1081h c1081h, @NonNull lpy lpyVar, @NonNull w23 w23Var, @NonNull o01 o01Var, @NonNull C1128m c1128m, @NonNull InterfaceC1119d interfaceC1119d, int i, @NonNull a aVar, @NonNull Map<Class<?>, aij0<?, ?>> map, @NonNull List<l2d0<Object>> list, C1060d c1060d) {
        z3d0 c1112c;
        z3d0 zq3Var;
        Registry registry;
        this.f4326a = c1081h;
        this.f4327b = w23Var;
        this.f4331f = o01Var;
        this.f4328c = lpyVar;
        this.f4332g = c1128m;
        this.f4333h = interfaceC1119d;
        this.f4335j = aVar;
        Resources resources = context.getResources();
        Registry registry2 = new Registry();
        this.f4330e = registry2;
        registry2.m5314o(new DefaultImageHeaderParser());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            registry2.m5314o(new q7f());
        }
        List<ImageHeaderParser> listM5306g = registry2.m5306g();
        cr3 cr3Var = new cr3(context, listM5306g, w23Var, o01Var);
        z3d0<ParcelFileDescriptor, Bitmap> z3d0VarM5552h = VideoDecoder.m5552h(w23Var);
        C1110a c1110a = new C1110a(registry2.m5306g(), resources.getDisplayMetrics(), w23Var, o01Var);
        if (i2 < 28 || !c1060d.m5351a(C1058b.c.class)) {
            xq3 xq3Var = new xq3(c1110a);
            c1112c = new C1112c(c1110a, o01Var);
            zq3Var = xq3Var;
        } else {
            c1112c = new avm();
            zq3Var = new zq3();
        }
        if (i2 >= 28 && c1060d.m5351a(C1058b.b.class)) {
            registry2.m5305e("Animation", InputStream.class, Drawable.class, xq0.m212698f(listM5306g, o01Var));
            registry2.m5305e("Animation", ByteBuffer.class, Drawable.class, xq0.m212696a(listM5306g, o01Var));
        }
        b4d0 b4d0Var = new b4d0(context);
        h4d0.C17391c c17391c = new h4d0.C17391c(resources);
        h4d0.C17392d c17392d = new h4d0.C17392d(resources);
        h4d0.C17390b c17390b = new h4d0.C17390b(resources);
        h4d0.C17389a c17389a = new h4d0.C17389a(resources);
        b23 b23Var = new b23(o01Var);
        m13 m13Var = new m13();
        cnj cnjVar = new cnj();
        ContentResolver contentResolver = context.getContentResolver();
        registry2.m5303c(ByteBuffer.class, new ar3()).m5303c(InputStream.class, new j7g0(o01Var)).m5305e("Bitmap", ByteBuffer.class, Bitmap.class, zq3Var).m5305e("Bitmap", InputStream.class, Bitmap.class, c1112c);
        if (ParcelFileDescriptorRewinder.m5368b()) {
            registry2.m5305e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new bg60(c1110a));
        }
        registry2.m5305e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, z3d0VarM5552h).m5305e("Bitmap", AssetFileDescriptor.class, Bitmap.class, VideoDecoder.m5547c(w23Var)).m5301a(Bitmap.class, Bitmap.class, yxj0.C21704a.m217720a()).m5305e("Bitmap", Bitmap.class, Bitmap.class, new wxj0()).m5304d(Bitmap.class, b23Var).m5305e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new y13(resources, zq3Var)).m5305e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new y13(resources, c1112c)).m5305e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new y13(resources, z3d0VarM5552h)).m5304d(BitmapDrawable.class, new z13(w23Var, b23Var)).m5305e("Animation", InputStream.class, bnj.class, new m7g0(listM5306g, cr3Var, o01Var)).m5305e("Animation", ByteBuffer.class, bnj.class, cr3Var).m5304d(bnj.class, new dnj()).m5301a(anj.class, anj.class, yxj0.C21704a.m217720a()).m5305e("Bitmap", anj.class, Bitmap.class, new inj(w23Var)).m5302b(Uri.class, Drawable.class, b4d0Var).m5302b(Uri.class, Bitmap.class, new v3d0(b4d0Var, w23Var)).m5315p(new dr3.C16608a()).m5301a(File.class, ByteBuffer.class, new br3.C16091b()).m5301a(File.class, InputStream.class, new vii.C20841e()).m5302b(File.class, File.class, new pii()).m5301a(File.class, ParcelFileDescriptor.class, new vii.C20838b()).m5301a(File.class, File.class, yxj0.C21704a.m217720a()).m5315p(new C1066c.a(o01Var));
        if (ParcelFileDescriptorRewinder.m5368b()) {
            registry = registry2;
            registry.m5315p(new ParcelFileDescriptorRewinder.C1063a());
        } else {
            registry = registry2;
        }
        Class cls = Integer.TYPE;
        registry.m5301a(cls, InputStream.class, c17391c).m5301a(cls, ParcelFileDescriptor.class, c17390b).m5301a(Integer.class, InputStream.class, c17391c).m5301a(Integer.class, ParcelFileDescriptor.class, c17390b).m5301a(Integer.class, Uri.class, c17392d).m5301a(cls, AssetFileDescriptor.class, c17389a).m5301a(Integer.class, AssetFileDescriptor.class, c17389a).m5301a(cls, Uri.class, c17392d).m5301a(String.class, InputStream.class, new v6c.C20771c()).m5301a(Uri.class, InputStream.class, new v6c.C20771c()).m5301a(String.class, InputStream.class, new e8g0.C16732c()).m5301a(String.class, ParcelFileDescriptor.class, new e8g0.C16731b()).m5301a(String.class, AssetFileDescriptor.class, new e8g0.C16730a()).m5301a(Uri.class, InputStream.class, new b21.C15893c(context.getAssets())).m5301a(Uri.class, AssetFileDescriptor.class, new b21.C15892b(context.getAssets())).m5301a(Uri.class, InputStream.class, new w6y.C21041a(context)).m5301a(Uri.class, InputStream.class, new y6y.C21533a(context));
        if (i2 >= 29) {
            registry.m5301a(Uri.class, InputStream.class, new cvb0.C16373c(context));
            registry.m5301a(Uri.class, ParcelFileDescriptor.class, new cvb0.C16372b(context));
        }
        registry.m5301a(Uri.class, InputStream.class, new e4k0.C16715d(contentResolver)).m5301a(Uri.class, ParcelFileDescriptor.class, new e4k0.C16713b(contentResolver)).m5301a(Uri.class, AssetFileDescriptor.class, new e4k0.C16712a(contentResolver)).m5301a(Uri.class, InputStream.class, new z5k0.C21767a()).m5301a(URL.class, InputStream.class, new r4k0.C19761a()).m5301a(Uri.class, File.class, new v6y.C20775a(context)).m5301a(e4k.class, InputStream.class, new wml.C21142a()).m5301a(byte[].class, ByteBuffer.class, new uq3.C20621a()).m5301a(byte[].class, InputStream.class, new uq3.C20624d()).m5301a(Uri.class, Uri.class, yxj0.C21704a.m217720a()).m5301a(Drawable.class, Drawable.class, yxj0.C21704a.m217720a()).m5302b(Drawable.class, Drawable.class, new xxj0()).m5316q(Bitmap.class, BitmapDrawable.class, new a23(resources)).m5316q(Bitmap.class, byte[].class, m13Var).m5316q(Drawable.class, byte[].class, new nce(w23Var, m13Var, cnjVar)).m5316q(bnj.class, byte[].class, cnjVar);
        z3d0<ByteBuffer, Bitmap> z3d0VarM5548d = VideoDecoder.m5548d(w23Var);
        registry.m5302b(ByteBuffer.class, Bitmap.class, z3d0VarM5548d);
        registry.m5302b(ByteBuffer.class, BitmapDrawable.class, new y13(resources, z3d0VarM5548d));
        this.f4329d = new C1059c(context, o01Var, registry, new clm(), aVar, map, list, c1081h, c1060d, i);
    }

    @GuardedBy("Glide.class")
    /* JADX INFO: renamed from: a */
    private static void m5318a(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        if (f4325m) {
            wtq0.m207906a("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
            return;
        }
        f4325m = true;
        m5322m(context, generatedAppGlideModule);
        f4325m = false;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static ComponentCallbacks2C1057a m5319c(@NonNull Context context) {
        if (f4324l == null) {
            GeneratedAppGlideModule generatedAppGlideModuleM5320d = m5320d(context.getApplicationContext());
            synchronized (ComponentCallbacks2C1057a.class) {
                try {
                    if (f4324l == null) {
                        m5318a(context, generatedAppGlideModuleM5320d);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4324l;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    private static GeneratedAppGlideModule m5320d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            Log.isLoggable("Glide", 5);
            return null;
        } catch (IllegalAccessException e) {
            m5324q(e);
            return null;
        } catch (InstantiationException e2) {
            m5324q(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            m5324q(e3);
            return null;
        } catch (InvocationTargetException e4) {
            m5324q(e4);
            return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    private static C1128m m5321l(@Nullable Context context) {
        vn80.m201945e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m5319c(context).m5335k();
    }

    @GuardedBy("Glide.class")
    /* JADX INFO: renamed from: m */
    private static void m5322m(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        m5323n(context, new C1058b(), generatedAppGlideModule);
    }

    @GuardedBy("Glide.class")
    /* JADX INFO: renamed from: n */
    private static void m5323n(@NonNull Context context, @NonNull C1058b c1058b, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<b4k> listM207980a = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.m193341c()) {
            listM207980a = new wuw(applicationContext).m207980a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.m5298d().isEmpty()) {
            Set<Class<?>> setM5298d = generatedAppGlideModule.m5298d();
            Iterator<b4k> it = listM207980a.iterator();
            while (it.hasNext()) {
                b4k next = it.next();
                if (setM5298d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        next.toString();
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<b4k> it2 = listM207980a.iterator();
            while (it2.hasNext()) {
                it2.next().getClass().toString();
            }
        }
        c1058b.m5341b(generatedAppGlideModule != null ? generatedAppGlideModule.m5299e() : null);
        Iterator<b4k> it3 = listM207980a.iterator();
        while (it3.hasNext()) {
            it3.next().m102468a(applicationContext, c1058b);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.m193340b(applicationContext, c1058b);
        }
        ComponentCallbacks2C1057a componentCallbacks2C1057aM5340a = c1058b.m5340a(applicationContext);
        for (b4k b4kVar : listM207980a) {
            try {
                b4kVar.m102469b(applicationContext, componentCallbacks2C1057aM5340a, componentCallbacks2C1057aM5340a.f4330e);
            } catch (AbstractMethodError e) {
                yzv.m218057a("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(b4kVar.getClass().getName()), e);
                return;
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.m180939a(applicationContext, componentCallbacks2C1057aM5340a, componentCallbacks2C1057aM5340a.f4330e);
        }
        applicationContext.registerComponentCallbacks(componentCallbacks2C1057aM5340a);
        f4324l = componentCallbacks2C1057aM5340a;
    }

    /* JADX INFO: renamed from: q */
    private static void m5324q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public static m2d0 m5325t(@NonNull Context context) {
        return m5321l(context).m5653l(context);
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public static m2d0 m5326u(@NonNull View view) {
        return m5321l(view.getContext()).m5654m(view);
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public static m2d0 m5327v(@NonNull FragmentActivity fragmentActivity) {
        return m5321l(fragmentActivity).m5656o(fragmentActivity);
    }

    /* JADX INFO: renamed from: b */
    public void m5328b() {
        ylk0.m216578b();
        this.f4328c.m155299b();
        this.f4327b.mo191125b();
        this.f4331f.mo165410b();
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public o01 m5329e() {
        return this.f4331f;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public w23 m5330f() {
        return this.f4327b;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC1119d m5331g() {
        return this.f4333h;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public Context m5332h() {
        return this.f4329d.getBaseContext();
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public C1059c m5333i() {
        return this.f4329d;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public Registry m5334j() {
        return this.f4330e;
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public C1128m m5335k() {
        return this.f4332g;
    }

    /* JADX INFO: renamed from: o */
    public void m5336o(m2d0 m2d0Var) {
        synchronized (this.f4334i) {
            try {
                if (this.f4334i.contains(m2d0Var)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f4334i.add(m2d0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        m5328b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        m5338r(i);
    }

    /* JADX INFO: renamed from: p */
    public boolean m5337p(@NonNull cli0<?> cli0Var) {
        synchronized (this.f4334i) {
            try {
                Iterator<m2d0> it = this.f4334i.iterator();
                while (it.hasNext()) {
                    if (it.next().m156810A(cli0Var)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m5338r(int i) {
        ylk0.m216578b();
        synchronized (this.f4334i) {
            try {
                Iterator<m2d0> it = this.f4334i.iterator();
                while (it.hasNext()) {
                    it.next().onTrimMemory(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4328c.mo104370a(i);
        this.f4327b.mo191124a(i);
        this.f4331f.mo165409a(i);
    }

    /* JADX INFO: renamed from: s */
    public void m5339s(m2d0 m2d0Var) {
        synchronized (this.f4334i) {
            try {
                if (!this.f4334i.contains(m2d0Var)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f4334i.remove(m2d0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
