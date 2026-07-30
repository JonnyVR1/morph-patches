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
import com.bumptech.glide.load.engine.C1071h;
import com.bumptech.glide.load.resource.bitmap.C1093a;
import com.bumptech.glide.load.resource.bitmap.C1095c;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.manager.C1106h;
import com.bumptech.glide.manager.InterfaceC1102d;
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
import p149l.aq3;
import p149l.bq3;
import p149l.bvj0;
import p149l.byv;
import p149l.byx;
import p149l.cci0;
import p149l.cq3;
import p149l.czf0;
import p149l.dq3;
import p149l.ewc0;
import p149l.fzf0;
import p149l.g23;
import p149l.h01;
import p149l.ikl;
import p149l.iuc0;
import p149l.j13;
import p149l.jbe;
import p149l.juc0;
import p149l.k13;
import p149l.k6f;
import p149l.kkj;
import p149l.l13;
import p149l.l1k;
import p149l.lkj;
import p149l.m13;
import p149l.mkj;
import p149l.muc0;
import p149l.n1k;
import p149l.nkj;
import p149l.nvj0;
import p149l.ogy;
import p149l.p5c;
import p149l.qf80;
import p149l.qkq0;
import p149l.sck0;
import p149l.sfi;
import p149l.skj;
import p149l.svc0;
import p149l.toj0;
import p149l.u11;
import p149l.u3l0;
import p149l.uoj0;
import p149l.up3;
import p149l.v760;
import p149l.voj0;
import p149l.vwj0;
import p149l.w760;
import p149l.w8j0;
import p149l.wvc0;
import p149l.x03;
import p149l.xp3;
import p149l.xrw;
import p149l.xzf0;
import p149l.yfi;
import p149l.ykl;
import p149l.ymb0;
import p149l.ysm;
import p149l.yvc0;
import p149l.yxx;
import p149l.zim;
import p149l.zp3;
import p149l.zsm;
import p149l.zxx;

/* JADX INFO: renamed from: com.bumptech.glide.a */
/* JADX INFO: loaded from: classes.dex */
public class ComponentCallbacks2C1053a implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: l */
    private static volatile ComponentCallbacks2C1053a f4324l = null;

    /* JADX INFO: renamed from: m */
    private static volatile boolean f4325m = false;

    /* JADX INFO: renamed from: n */
    private static boolean f4326n = false;

    /* JADX INFO: renamed from: a */
    private final C1071h f4327a;

    /* JADX INFO: renamed from: b */
    private final g23 f4328b;

    /* JADX INFO: renamed from: c */
    private final ogy f4329c;

    /* JADX INFO: renamed from: d */
    private final C1055c f4330d;

    /* JADX INFO: renamed from: e */
    private final Registry f4331e;

    /* JADX INFO: renamed from: f */
    private final h01 f4332f;

    /* JADX INFO: renamed from: g */
    private final C1106h f4333g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC1102d f4334h;

    /* JADX INFO: renamed from: j */
    private final a f4336j;

    /* JADX INFO: renamed from: i */
    private final List<juc0> f4335i = new ArrayList();

    /* JADX INFO: renamed from: k */
    private MemoryCategory f4337k = MemoryCategory.NORMAL;

    /* JADX INFO: renamed from: com.bumptech.glide.a$a */
    public interface a {
        @NonNull
        muc0 build();
    }

    public ComponentCallbacks2C1053a(@NonNull Context context, @NonNull C1071h c1071h, @NonNull ogy ogyVar, @NonNull g23 g23Var, @NonNull h01 h01Var, @NonNull C1106h c1106h, @NonNull InterfaceC1102d interfaceC1102d, int i, @NonNull a aVar, @NonNull Map<Class<?>, w8j0<?, ?>> map, @NonNull List<iuc0<Object>> list, boolean z, boolean z2) {
        wvc0 xp3Var;
        wvc0 c1095c;
        Registry registry;
        this.f4327a = c1071h;
        this.f4328b = g23Var;
        this.f4332f = h01Var;
        this.f4329c = ogyVar;
        this.f4333g = c1106h;
        this.f4334h = interfaceC1102d;
        this.f4336j = aVar;
        Resources resources = context.getResources();
        Registry registry2 = new Registry();
        this.f4331e = registry2;
        registry2.m5304o(new DefaultImageHeaderParser());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            registry2.m5304o(new k6f());
        }
        List<ImageHeaderParser> listM5296g = registry2.m5296g();
        cq3 cq3Var = new cq3(context, listM5296g, g23Var, h01Var);
        wvc0<ParcelFileDescriptor, Bitmap> wvc0VarM191582h = u3l0.m191582h(g23Var);
        C1093a c1093a = new C1093a(registry2.m5296g(), resources.getDisplayMetrics(), g23Var, h01Var);
        if (!z2 || i2 < 28) {
            xp3Var = new xp3(c1093a);
            c1095c = new C1095c(c1093a, h01Var);
        } else {
            c1095c = new ysm();
            xp3Var = new zp3();
        }
        yvc0 yvc0Var = new yvc0(context);
        ewc0.C16701c c16701c = new ewc0.C16701c(resources);
        ewc0.C16702d c16702d = new ewc0.C16702d(resources);
        ewc0.C16700b c16700b = new ewc0.C16700b(resources);
        ewc0.C16699a c16699a = new ewc0.C16699a(resources);
        m13 m13Var = new m13(h01Var);
        x03 x03Var = new x03();
        mkj mkjVar = new mkj();
        ContentResolver contentResolver = context.getContentResolver();
        registry2.m5293c(ByteBuffer.class, new aq3()).m5293c(InputStream.class, new czf0(h01Var)).m5295e("Bitmap", ByteBuffer.class, Bitmap.class, xp3Var).m5295e("Bitmap", InputStream.class, Bitmap.class, c1095c);
        if (w760.m202008b()) {
            registry2.m5295e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new v760(c1093a));
        }
        registry2.m5295e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, wvc0VarM191582h).m5295e("Bitmap", AssetFileDescriptor.class, Bitmap.class, u3l0.m191577c(g23Var)).m5291a(Bitmap.class, Bitmap.class, voj0.C20709a.m199167a()).m5295e("Bitmap", Bitmap.class, Bitmap.class, new toj0()).m5294d(Bitmap.class, m13Var).m5295e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new j13(resources, xp3Var)).m5295e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new j13(resources, c1095c)).m5295e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new j13(resources, wvc0VarM191582h)).m5294d(BitmapDrawable.class, new k13(g23Var, m13Var)).m5295e("Gif", InputStream.class, lkj.class, new fzf0(listM5296g, cq3Var, h01Var)).m5295e("Gif", ByteBuffer.class, lkj.class, cq3Var).m5294d(lkj.class, new nkj()).m5291a(kkj.class, kkj.class, voj0.C20709a.m199167a()).m5295e("Bitmap", kkj.class, Bitmap.class, new skj(g23Var)).m5292b(Uri.class, Drawable.class, yvc0Var).m5292b(Uri.class, Bitmap.class, new svc0(yvc0Var, g23Var)).m5306q(new dq3.C16432a()).m5291a(File.class, ByteBuffer.class, new bq3.C15942b()).m5291a(File.class, InputStream.class, new yfi.C21393e()).m5292b(File.class, File.class, new sfi()).m5291a(File.class, ParcelFileDescriptor.class, new yfi.C21390b()).m5291a(File.class, File.class, voj0.C20709a.m199167a()).m5306q(new zsm.C21760a(h01Var));
        if (w760.m202008b()) {
            registry = registry2;
            registry.m5306q(new w760.C20818a());
        } else {
            registry = registry2;
        }
        Class cls = Integer.TYPE;
        registry.m5291a(cls, InputStream.class, c16701c).m5291a(cls, ParcelFileDescriptor.class, c16700b).m5291a(Integer.class, InputStream.class, c16701c).m5291a(Integer.class, ParcelFileDescriptor.class, c16700b).m5291a(Integer.class, Uri.class, c16702d).m5291a(cls, AssetFileDescriptor.class, c16699a).m5291a(Integer.class, AssetFileDescriptor.class, c16699a).m5291a(cls, Uri.class, c16702d).m5291a(String.class, InputStream.class, new p5c.C19136c()).m5291a(Uri.class, InputStream.class, new p5c.C19136c()).m5291a(String.class, InputStream.class, new xzf0.C21267c()).m5291a(String.class, ParcelFileDescriptor.class, new xzf0.C21266b()).m5291a(String.class, AssetFileDescriptor.class, new xzf0.C21265a()).m5291a(Uri.class, InputStream.class, new ykl.C21425a()).m5291a(Uri.class, InputStream.class, new u11.C20334c(context.getAssets())).m5291a(Uri.class, ParcelFileDescriptor.class, new u11.C20333b(context.getAssets())).m5291a(Uri.class, InputStream.class, new zxx.C21813a(context)).m5291a(Uri.class, InputStream.class, new byx.C16020a(context));
        if (i2 >= 29) {
            registry.m5291a(Uri.class, InputStream.class, new ymb0.C21438c(context));
            registry.m5291a(Uri.class, ParcelFileDescriptor.class, new ymb0.C21437b(context));
        }
        registry.m5291a(Uri.class, InputStream.class, new bvj0.C15985d(contentResolver)).m5291a(Uri.class, ParcelFileDescriptor.class, new bvj0.C15983b(contentResolver)).m5291a(Uri.class, AssetFileDescriptor.class, new bvj0.C15982a(contentResolver)).m5291a(Uri.class, InputStream.class, new vwj0.C20748a()).m5291a(URL.class, InputStream.class, new nvj0.C18784a()).m5291a(Uri.class, File.class, new yxx.C21575a(context)).m5291a(n1k.class, InputStream.class, new ikl.C17570a()).m5291a(byte[].class, ByteBuffer.class, new up3.C20473a()).m5291a(byte[].class, InputStream.class, new up3.C20476d()).m5291a(Uri.class, Uri.class, voj0.C20709a.m199167a()).m5291a(Drawable.class, Drawable.class, voj0.C20709a.m199167a()).m5292b(Drawable.class, Drawable.class, new uoj0()).m5305p(Bitmap.class, BitmapDrawable.class, new l13(resources)).m5305p(Bitmap.class, byte[].class, x03Var).m5305p(Drawable.class, byte[].class, new jbe(g23Var, x03Var, mkjVar)).m5305p(lkj.class, byte[].class, mkjVar);
        wvc0<ByteBuffer, Bitmap> wvc0VarM191578d = u3l0.m191578d(g23Var);
        registry.m5292b(ByteBuffer.class, Bitmap.class, wvc0VarM191578d);
        registry.m5292b(ByteBuffer.class, BitmapDrawable.class, new j13(resources, wvc0VarM191578d));
        this.f4330d = new C1055c(context, h01Var, registry, new zim(), aVar, map, list, c1071h, z, i);
    }

    @GuardedBy("Glide.class")
    /* JADX INFO: renamed from: a */
    private static void m5308a(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        if (f4325m) {
            qkq0.m175383a("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
            return;
        }
        f4325m = true;
        m5312m(context, generatedAppGlideModule);
        f4325m = false;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static ComponentCallbacks2C1053a m5309c(@NonNull Context context) {
        if (f4324l == null) {
            GeneratedAppGlideModule generatedAppGlideModuleM5310d = m5310d(context.getApplicationContext());
            synchronized (ComponentCallbacks2C1053a.class) {
                try {
                    if (f4324l == null) {
                        m5308a(context, generatedAppGlideModuleM5310d);
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
    private static GeneratedAppGlideModule m5310d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            Log.isLoggable("Glide", 5);
            return null;
        } catch (IllegalAccessException e) {
            m5315r(e);
            return null;
        } catch (InstantiationException e2) {
            m5315r(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            m5315r(e3);
            return null;
        } catch (InvocationTargetException e4) {
            m5315r(e4);
            return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    private static C1106h m5311l(@Nullable Context context) {
        qf80.m174277e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m5309c(context).m5326k();
    }

    @GuardedBy("Glide.class")
    /* JADX INFO: renamed from: m */
    private static void m5312m(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        m5313n(context, new C1054b(), generatedAppGlideModule);
    }

    @GuardedBy("Glide.class")
    /* JADX INFO: renamed from: n */
    private static void m5313n(@NonNull Context context, @NonNull C1054b c1054b, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<l1k> listM210728a = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.m156609c()) {
            listM210728a = new xrw(applicationContext).m210728a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.m5288d().isEmpty()) {
            Set<Class<?>> setM5288d = generatedAppGlideModule.m5288d();
            Iterator<l1k> it = listM210728a.iterator();
            while (it.hasNext()) {
                l1k next = it.next();
                if (setM5288d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        next.toString();
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<l1k> it2 = listM210728a.iterator();
            while (it2.hasNext()) {
                it2.next().getClass().toString();
            }
        }
        c1054b.m5332b(generatedAppGlideModule != null ? generatedAppGlideModule.m5289e() : null);
        Iterator<l1k> it3 = listM210728a.iterator();
        while (it3.hasNext()) {
            it3.next().m148191a(applicationContext, c1054b);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.m156608b(applicationContext, c1054b);
        }
        ComponentCallbacks2C1053a componentCallbacks2C1053aM5331a = c1054b.m5331a(applicationContext);
        for (l1k l1kVar : listM210728a) {
            try {
                l1kVar.m148192b(applicationContext, componentCallbacks2C1053aM5331a, componentCallbacks2C1053aM5331a.f4331e);
            } catch (AbstractMethodError e) {
                byv.m104511a("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(l1kVar.getClass().getName()), e);
                return;
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.m168252a(applicationContext, componentCallbacks2C1053aM5331a, componentCallbacks2C1053aM5331a.f4331e);
        }
        applicationContext.registerComponentCallbacks(componentCallbacks2C1053aM5331a);
        f4324l = componentCallbacks2C1053aM5331a;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m5314o() {
        return f4326n;
    }

    /* JADX INFO: renamed from: r */
    private static void m5315r(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public static juc0 m5316u(@NonNull Context context) {
        return m5311l(context).m5608k(context);
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public static juc0 m5317v(@NonNull View view) {
        return m5311l(view.getContext()).m5609l(view);
    }

    @NonNull
    /* JADX INFO: renamed from: w */
    public static juc0 m5318w(@NonNull FragmentActivity fragmentActivity) {
        return m5311l(fragmentActivity).m5611n(fragmentActivity);
    }

    /* JADX INFO: renamed from: b */
    public void m5319b() {
        sck0.m183402b();
        this.f4329c.m164302b();
        this.f4328b.mo124141b();
        this.f4332f.mo128941b();
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public h01 m5320e() {
        return this.f4332f;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public g23 m5321f() {
        return this.f4328b;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC1102d m5322g() {
        return this.f4334h;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public Context m5323h() {
        return this.f4330d.getBaseContext();
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public C1055c m5324i() {
        return this.f4330d;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public Registry m5325j() {
        return this.f4331e;
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public C1106h m5326k() {
        return this.f4333g;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        m5319b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        m5329s(i);
    }

    /* JADX INFO: renamed from: p */
    public void m5327p(juc0 juc0Var) {
        synchronized (this.f4335i) {
            try {
                if (this.f4335i.contains(juc0Var)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f4335i.add(juc0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m5328q(@NonNull cci0<?> cci0Var) {
        synchronized (this.f4335i) {
            try {
                Iterator<juc0> it = this.f4335i.iterator();
                while (it.hasNext()) {
                    if (it.next().m143265A(cci0Var)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m5329s(int i) {
        sck0.m183402b();
        Iterator<juc0> it = this.f4335i.iterator();
        while (it.hasNext()) {
            it.next().onTrimMemory(i);
        }
        this.f4329c.mo111502a(i);
        this.f4328b.mo124140a(i);
        this.f4332f.mo128940a(i);
    }

    /* JADX INFO: renamed from: t */
    public void m5330t(juc0 juc0Var) {
        synchronized (this.f4335i) {
            try {
                if (!this.f4335i.contains(juc0Var)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f4335i.remove(juc0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
