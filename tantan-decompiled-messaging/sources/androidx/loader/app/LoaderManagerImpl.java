package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.C0490t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Objects;
import p149l.igd;
import p149l.jcl0;
import p149l.jcr;
import p149l.kt10;
import p149l.n250;
import p149l.ocl0;
import p149l.qkq0;
import p149l.trv;
import p149l.xmf0;

/* JADX INFO: loaded from: classes.dex */
public class LoaderManagerImpl extends AbstractC0494a {

    /* JADX INFO: renamed from: c */
    public static boolean f2349c = false;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final jcr f2350a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LoaderViewModel f2351b;

    public static class LoaderViewModel extends jcl0 {

        /* JADX INFO: renamed from: c */
        public static final C0490t.c f2352c = new C0491a();

        /* JADX INFO: renamed from: a */
        public xmf0<C0492a> f2353a = new xmf0<>();

        /* JADX INFO: renamed from: b */
        public boolean f2354b = false;

        /* JADX INFO: renamed from: androidx.loader.app.LoaderManagerImpl$LoaderViewModel$a */
        public static class C0491a implements C0490t.c {
            @Override // androidx.lifecycle.C0490t.c
            @NonNull
            public <T extends jcl0> T create(@NonNull Class<T> cls) {
                return new LoaderViewModel();
            }
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public static LoaderViewModel m3090c(ocl0 ocl0Var) {
            return (LoaderViewModel) new C0490t(ocl0Var, f2352c).m3073a(LoaderViewModel.class);
        }

        /* JADX INFO: renamed from: a */
        public void m3091a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f2353a.m210134l() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f2353a.m210134l(); i++) {
                    C0492a c0492aM210135m = this.f2353a.m210135m(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f2353a.m210132j(i));
                    printWriter.print(": ");
                    printWriter.println(c0492aM210135m.toString());
                    c0492aM210135m.m3100q(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m3092b() {
            this.f2354b = false;
        }

        /* JADX INFO: renamed from: d */
        public <D> C0492a<D> m3093d(int i) {
            return this.f2353a.m210129d(i);
        }

        /* JADX INFO: renamed from: e */
        public boolean m3094e() {
            return this.f2354b;
        }

        /* JADX INFO: renamed from: f */
        public void m3095f() {
            int iM210134l = this.f2353a.m210134l();
            for (int i = 0; i < iM210134l; i++) {
                this.f2353a.m210135m(i).m3102s();
            }
        }

        /* JADX INFO: renamed from: g */
        public void m3096g(int i, @NonNull C0492a c0492a) {
            this.f2353a.m210133k(i, c0492a);
        }

        /* JADX INFO: renamed from: h */
        public void m3097h() {
            this.f2354b = true;
        }

        @Override // p149l.jcl0
        public void onCleared() {
            super.onCleared();
            int iM210134l = this.f2353a.m210134l();
            int i = 0;
            while (true) {
                xmf0<C0492a> xmf0Var = this.f2353a;
                if (i >= iM210134l) {
                    xmf0Var.clear();
                    return;
                } else {
                    xmf0Var.m210135m(i).m3099p(true);
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.LoaderManagerImpl$a */
    public static class C0492a<D> extends kt10<D> implements trv.InterfaceC20262b<D> {

        /* JADX INFO: renamed from: l */
        public final int f2355l;

        /* JADX INFO: renamed from: m */
        @Nullable
        public final Bundle f2356m;

        /* JADX INFO: renamed from: n */
        @NonNull
        public final trv<D> f2357n;

        /* JADX INFO: renamed from: o */
        public jcr f2358o;

        /* JADX INFO: renamed from: p */
        public C0493b<D> f2359p;

        /* JADX INFO: renamed from: q */
        public trv<D> f2360q;

        public C0492a(int i, @Nullable Bundle bundle, @NonNull trv<D> trvVar, @Nullable trv<D> trvVar2) {
            this.f2355l = i;
            this.f2356m = bundle;
            this.f2357n = trvVar;
            this.f2360q = trvVar2;
            trvVar.m190460t(i, this);
        }

        @Override // p149l.trv.InterfaceC20262b
        /* JADX INFO: renamed from: a */
        public void mo3098a(@NonNull trv<D> trvVar, @Nullable D d) {
            if (LoaderManagerImpl.f2349c) {
                toString();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo2989o(d);
            } else {
                boolean z = LoaderManagerImpl.f2349c;
                mo2987m(d);
            }
        }

        @Override // androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: k */
        public void mo2985k() {
            if (LoaderManagerImpl.f2349c) {
                toString();
            }
            this.f2357n.m190463w();
        }

        @Override // androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: l */
        public void mo2986l() {
            if (LoaderManagerImpl.f2349c) {
                toString();
            }
            this.f2357n.m190464x();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: n */
        public void mo2988n(@NonNull n250<? super D> n250Var) {
            super.mo2988n(n250Var);
            this.f2358o = null;
            this.f2359p = null;
        }

        @Override // p149l.kt10, androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: o */
        public void mo2989o(D d) {
            super.mo2989o(d);
            trv<D> trvVar = this.f2360q;
            if (trvVar != null) {
                trvVar.m190461u();
                this.f2360q = null;
            }
        }

        @MainThread
        /* JADX INFO: renamed from: p */
        public trv<D> m3099p(boolean z) {
            if (LoaderManagerImpl.f2349c) {
                toString();
            }
            this.f2357n.m190449b();
            this.f2357n.m190448a();
            C0493b<D> c0493b = this.f2359p;
            if (c0493b != null) {
                mo2988n(c0493b);
                if (z) {
                    c0493b.m3106c();
                }
            }
            this.f2357n.m190466z(this);
            if ((c0493b == null || c0493b.m3105b()) && !z) {
                return this.f2357n;
            }
            this.f2357n.m190461u();
            return this.f2360q;
        }

        /* JADX INFO: renamed from: q */
        public void m3100q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f2355l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f2356m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f2357n);
            this.f2357n.mo138801g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f2359p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f2359p);
                this.f2359p.m3104a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m3101r().m190451d(m2980f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(m2982h());
        }

        @NonNull
        /* JADX INFO: renamed from: r */
        public trv<D> m3101r() {
            return this.f2357n;
        }

        /* JADX INFO: renamed from: s */
        public void m3102s() {
            jcr jcrVar = this.f2358o;
            C0493b<D> c0493b = this.f2359p;
            if (jcrVar == null || c0493b == null) {
                return;
            }
            super.mo2988n(c0493b);
            m2983i(jcrVar, c0493b);
        }

        @NonNull
        @MainThread
        /* JADX INFO: renamed from: t */
        public trv<D> m3103t(@NonNull jcr jcrVar, @NonNull AbstractC0494a.a<D> aVar) {
            C0493b<D> c0493b = new C0493b<>(this.f2357n, aVar);
            m2983i(jcrVar, c0493b);
            C0493b<D> c0493b2 = this.f2359p;
            if (c0493b2 != null) {
                mo2988n(c0493b2);
            }
            this.f2358o = jcrVar;
            this.f2359p = c0493b;
            return this.f2357n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f2355l);
            sb.append(" : ");
            igd.m135980a(this.f2357n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.LoaderManagerImpl$b */
    public static class C0493b<D> implements n250<D> {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final trv<D> f2361a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final AbstractC0494a.a<D> f2362b;

        /* JADX INFO: renamed from: c */
        public boolean f2363c = false;

        public C0493b(@NonNull trv<D> trvVar, @NonNull AbstractC0494a.a<D> aVar) {
            this.f2361a = trvVar;
            this.f2362b = aVar;
        }

        /* JADX INFO: renamed from: a */
        public void m3104a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f2363c);
        }

        /* JADX INFO: renamed from: b */
        public boolean m3105b() {
            return this.f2363c;
        }

        @MainThread
        /* JADX INFO: renamed from: c */
        public void m3106c() {
            if (this.f2363c) {
                if (LoaderManagerImpl.f2349c) {
                    Objects.toString(this.f2361a);
                }
                this.f2362b.mo3110c(this.f2361a);
            }
        }

        @Override // p149l.n250
        public void onChanged(@Nullable D d) {
            if (LoaderManagerImpl.f2349c) {
                Objects.toString(this.f2361a);
                this.f2361a.m190451d(d);
            }
            this.f2362b.mo3109b(this.f2361a, d);
            this.f2363c = true;
        }

        public String toString() {
            return this.f2362b.toString();
        }
    }

    public LoaderManagerImpl(@NonNull jcr jcrVar, @NonNull ocl0 ocl0Var) {
        this.f2350a = jcrVar;
        this.f2351b = LoaderViewModel.m3090c(ocl0Var);
    }

    @Override // androidx.loader.app.AbstractC0494a
    @Deprecated
    /* JADX INFO: renamed from: a */
    public void mo3085a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f2351b.m3091a(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.AbstractC0494a
    @NonNull
    @MainThread
    /* JADX INFO: renamed from: c */
    public <D> trv<D> mo3086c(int i, @Nullable Bundle bundle, @NonNull AbstractC0494a.a<D> aVar) {
        if (this.f2351b.m3094e()) {
            qkq0.m175383a("Called while creating a loader");
            return null;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            qkq0.m175383a("initLoader must be called on the main thread");
            return null;
        }
        C0492a<D> c0492aM3093d = this.f2351b.m3093d(i);
        if (f2349c) {
            toString();
            Objects.toString(bundle);
        }
        if (c0492aM3093d == null) {
            return m3089f(i, bundle, aVar, null);
        }
        if (f2349c) {
            c0492aM3093d.toString();
        }
        return c0492aM3093d.m3103t(this.f2350a, aVar);
    }

    @Override // androidx.loader.app.AbstractC0494a
    /* JADX INFO: renamed from: d */
    public void mo3087d() {
        this.f2351b.m3095f();
    }

    @Override // androidx.loader.app.AbstractC0494a
    @NonNull
    @MainThread
    /* JADX INFO: renamed from: e */
    public <D> trv<D> mo3088e(int i, @Nullable Bundle bundle, @NonNull AbstractC0494a.a<D> aVar) {
        if (this.f2351b.m3094e()) {
            qkq0.m175383a("Called while creating a loader");
            return null;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            qkq0.m175383a("restartLoader must be called on the main thread");
            return null;
        }
        if (f2349c) {
            toString();
            Objects.toString(bundle);
        }
        C0492a<D> c0492aM3093d = this.f2351b.m3093d(i);
        return m3089f(i, bundle, aVar, c0492aM3093d != null ? c0492aM3093d.m3099p(false) : null);
    }

    @NonNull
    @MainThread
    /* JADX INFO: renamed from: f */
    public final <D> trv<D> m3089f(int i, @Nullable Bundle bundle, @NonNull AbstractC0494a.a<D> aVar, @Nullable trv<D> trvVar) {
        try {
            this.f2351b.m3097h();
            trv<D> trvVarMo3108a = aVar.mo3108a(i, bundle);
            if (trvVarMo3108a == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (trvVarMo3108a.getClass().isMemberClass() && !Modifier.isStatic(trvVarMo3108a.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + trvVarMo3108a);
            }
            C0492a c0492a = new C0492a(i, bundle, trvVarMo3108a, trvVar);
            if (f2349c) {
                c0492a.toString();
            }
            this.f2351b.m3096g(i, c0492a);
            this.f2351b.m3092b();
            return c0492a.m3103t(this.f2350a, aVar);
        } catch (Throwable th) {
            this.f2351b.m3092b();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        igd.m135980a(this.f2350a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
