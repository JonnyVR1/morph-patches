package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.C0491t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Objects;
import p153l.cb50;
import p153l.gvf0;
import p153l.ker;
import p153l.nll0;
import p153l.ohd;
import p153l.s120;
import p153l.sll0;
import p153l.utv;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
public class LoaderManagerImpl extends AbstractC0495a {

    /* JADX INFO: renamed from: c */
    public static boolean f2349c = false;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ker f2350a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LoaderViewModel f2351b;

    public static class LoaderViewModel extends nll0 {

        /* JADX INFO: renamed from: c */
        public static final C0491t.c f2352c = new C0492a();

        /* JADX INFO: renamed from: a */
        public gvf0<C0493a> f2353a = new gvf0<>();

        /* JADX INFO: renamed from: b */
        public boolean f2354b = false;

        /* JADX INFO: renamed from: androidx.loader.app.LoaderManagerImpl$LoaderViewModel$a */
        public static class C0492a implements C0491t.c {
            @Override // androidx.lifecycle.C0491t.c
            @NonNull
            public <T extends nll0> T create(@NonNull Class<T> cls) {
                return new LoaderViewModel();
            }
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public static LoaderViewModel m3091c(sll0 sll0Var) {
            return (LoaderViewModel) new C0491t(sll0Var, f2352c).m3074a(LoaderViewModel.class);
        }

        /* JADX INFO: renamed from: a */
        public void m3092a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f2353a.m132554l() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f2353a.m132554l(); i++) {
                    C0493a c0493aM132555m = this.f2353a.m132555m(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f2353a.m132552j(i));
                    printWriter.print(": ");
                    printWriter.println(c0493aM132555m.toString());
                    c0493aM132555m.m3101q(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m3093b() {
            this.f2354b = false;
        }

        /* JADX INFO: renamed from: d */
        public <D> C0493a<D> m3094d(int i) {
            return this.f2353a.m132549d(i);
        }

        /* JADX INFO: renamed from: e */
        public boolean m3095e() {
            return this.f2354b;
        }

        /* JADX INFO: renamed from: f */
        public void m3096f() {
            int iM132554l = this.f2353a.m132554l();
            for (int i = 0; i < iM132554l; i++) {
                this.f2353a.m132555m(i).m3103s();
            }
        }

        /* JADX INFO: renamed from: g */
        public void m3097g(int i, @NonNull C0493a c0493a) {
            this.f2353a.m132553k(i, c0493a);
        }

        /* JADX INFO: renamed from: h */
        public void m3098h() {
            this.f2354b = true;
        }

        @Override // p153l.nll0
        public void onCleared() {
            super.onCleared();
            int iM132554l = this.f2353a.m132554l();
            int i = 0;
            while (true) {
                gvf0<C0493a> gvf0Var = this.f2353a;
                if (i >= iM132554l) {
                    gvf0Var.clear();
                    return;
                } else {
                    gvf0Var.m132555m(i).m3100p(true);
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.LoaderManagerImpl$a */
    public static class C0493a<D> extends s120<D> implements utv.InterfaceC20673b<D> {

        /* JADX INFO: renamed from: l */
        public final int f2355l;

        /* JADX INFO: renamed from: m */
        @Nullable
        public final Bundle f2356m;

        /* JADX INFO: renamed from: n */
        @NonNull
        public final utv<D> f2357n;

        /* JADX INFO: renamed from: o */
        public ker f2358o;

        /* JADX INFO: renamed from: p */
        public C0494b<D> f2359p;

        /* JADX INFO: renamed from: q */
        public utv<D> f2360q;

        public C0493a(int i, @Nullable Bundle bundle, @NonNull utv<D> utvVar, @Nullable utv<D> utvVar2) {
            this.f2355l = i;
            this.f2356m = bundle;
            this.f2357n = utvVar;
            this.f2360q = utvVar2;
            utvVar.m198103t(i, this);
        }

        @Override // p153l.utv.InterfaceC20673b
        /* JADX INFO: renamed from: a */
        public void mo3099a(@NonNull utv<D> utvVar, @Nullable D d) {
            if (LoaderManagerImpl.f2349c) {
                toString();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo2990o(d);
            } else {
                boolean z = LoaderManagerImpl.f2349c;
                mo2988m(d);
            }
        }

        @Override // androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: k */
        public void mo2986k() {
            if (LoaderManagerImpl.f2349c) {
                toString();
            }
            this.f2357n.m198106w();
        }

        @Override // androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: l */
        public void mo2987l() {
            if (LoaderManagerImpl.f2349c) {
                toString();
            }
            this.f2357n.m198107x();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: n */
        public void mo2989n(@NonNull cb50<? super D> cb50Var) {
            super.mo2989n(cb50Var);
            this.f2358o = null;
            this.f2359p = null;
        }

        @Override // p153l.s120, androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: o */
        public void mo2990o(D d) {
            super.mo2990o(d);
            utv<D> utvVar = this.f2360q;
            if (utvVar != null) {
                utvVar.m198104u();
                this.f2360q = null;
            }
        }

        @MainThread
        /* JADX INFO: renamed from: p */
        public utv<D> m3100p(boolean z) {
            if (LoaderManagerImpl.f2349c) {
                toString();
            }
            this.f2357n.m198086b();
            this.f2357n.m198085a();
            C0494b<D> c0494b = this.f2359p;
            if (c0494b != null) {
                mo2989n(c0494b);
                if (z) {
                    c0494b.m3107c();
                }
            }
            this.f2357n.m198109z(this);
            if ((c0494b == null || c0494b.m3106b()) && !z) {
                return this.f2357n;
            }
            this.f2357n.m198104u();
            return this.f2360q;
        }

        /* JADX INFO: renamed from: q */
        public void m3101q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f2355l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f2356m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f2357n);
            this.f2357n.mo198091g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f2359p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f2359p);
                this.f2359p.m3105a(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m3102r().m198088d(m2981f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(m2983h());
        }

        @NonNull
        /* JADX INFO: renamed from: r */
        public utv<D> m3102r() {
            return this.f2357n;
        }

        /* JADX INFO: renamed from: s */
        public void m3103s() {
            ker kerVar = this.f2358o;
            C0494b<D> c0494b = this.f2359p;
            if (kerVar == null || c0494b == null) {
                return;
            }
            super.mo2989n(c0494b);
            m2984i(kerVar, c0494b);
        }

        @NonNull
        @MainThread
        /* JADX INFO: renamed from: t */
        public utv<D> m3104t(@NonNull ker kerVar, @NonNull AbstractC0495a.a<D> aVar) {
            C0494b<D> c0494b = new C0494b<>(this.f2357n, aVar);
            m2984i(kerVar, c0494b);
            C0494b<D> c0494b2 = this.f2359p;
            if (c0494b2 != null) {
                mo2989n(c0494b2);
            }
            this.f2358o = kerVar;
            this.f2359p = c0494b;
            return this.f2357n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f2355l);
            sb.append(" : ");
            ohd.m167694a(this.f2357n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.LoaderManagerImpl$b */
    public static class C0494b<D> implements cb50<D> {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final utv<D> f2361a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final AbstractC0495a.a<D> f2362b;

        /* JADX INFO: renamed from: c */
        public boolean f2363c = false;

        public C0494b(@NonNull utv<D> utvVar, @NonNull AbstractC0495a.a<D> aVar) {
            this.f2361a = utvVar;
            this.f2362b = aVar;
        }

        /* JADX INFO: renamed from: a */
        public void m3105a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f2363c);
        }

        /* JADX INFO: renamed from: b */
        public boolean m3106b() {
            return this.f2363c;
        }

        @MainThread
        /* JADX INFO: renamed from: c */
        public void m3107c() {
            if (this.f2363c) {
                if (LoaderManagerImpl.f2349c) {
                    Objects.toString(this.f2361a);
                }
                this.f2362b.mo3111c(this.f2361a);
            }
        }

        @Override // p153l.cb50
        public void onChanged(@Nullable D d) {
            if (LoaderManagerImpl.f2349c) {
                Objects.toString(this.f2361a);
                this.f2361a.m198088d(d);
            }
            this.f2362b.mo3110b(this.f2361a, d);
            this.f2363c = true;
        }

        public String toString() {
            return this.f2362b.toString();
        }
    }

    public LoaderManagerImpl(@NonNull ker kerVar, @NonNull sll0 sll0Var) {
        this.f2350a = kerVar;
        this.f2351b = LoaderViewModel.m3091c(sll0Var);
    }

    @Override // androidx.loader.app.AbstractC0495a
    @Deprecated
    /* JADX INFO: renamed from: a */
    public void mo3086a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f2351b.m3092a(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.AbstractC0495a
    @NonNull
    @MainThread
    /* JADX INFO: renamed from: c */
    public <D> utv<D> mo3087c(int i, @Nullable Bundle bundle, @NonNull AbstractC0495a.a<D> aVar) {
        if (this.f2351b.m3095e()) {
            wtq0.m207906a("Called while creating a loader");
            return null;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            wtq0.m207906a("initLoader must be called on the main thread");
            return null;
        }
        C0493a<D> c0493aM3094d = this.f2351b.m3094d(i);
        if (f2349c) {
            toString();
            Objects.toString(bundle);
        }
        if (c0493aM3094d == null) {
            return m3090f(i, bundle, aVar, null);
        }
        if (f2349c) {
            c0493aM3094d.toString();
        }
        return c0493aM3094d.m3104t(this.f2350a, aVar);
    }

    @Override // androidx.loader.app.AbstractC0495a
    /* JADX INFO: renamed from: d */
    public void mo3088d() {
        this.f2351b.m3096f();
    }

    @Override // androidx.loader.app.AbstractC0495a
    @NonNull
    @MainThread
    /* JADX INFO: renamed from: e */
    public <D> utv<D> mo3089e(int i, @Nullable Bundle bundle, @NonNull AbstractC0495a.a<D> aVar) {
        if (this.f2351b.m3095e()) {
            wtq0.m207906a("Called while creating a loader");
            return null;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            wtq0.m207906a("restartLoader must be called on the main thread");
            return null;
        }
        if (f2349c) {
            toString();
            Objects.toString(bundle);
        }
        C0493a<D> c0493aM3094d = this.f2351b.m3094d(i);
        return m3090f(i, bundle, aVar, c0493aM3094d != null ? c0493aM3094d.m3100p(false) : null);
    }

    @NonNull
    @MainThread
    /* JADX INFO: renamed from: f */
    public final <D> utv<D> m3090f(int i, @Nullable Bundle bundle, @NonNull AbstractC0495a.a<D> aVar, @Nullable utv<D> utvVar) {
        try {
            this.f2351b.m3098h();
            utv<D> utvVarMo3109a = aVar.mo3109a(i, bundle);
            if (utvVarMo3109a == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (utvVarMo3109a.getClass().isMemberClass() && !Modifier.isStatic(utvVarMo3109a.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + utvVarMo3109a);
            }
            C0493a c0493a = new C0493a(i, bundle, utvVarMo3109a, utvVar);
            if (f2349c) {
                c0493a.toString();
            }
            this.f2351b.m3097g(i, c0493a);
            this.f2351b.m3093b();
            return c0493a.m3104t(this.f2350a, aVar);
        } catch (Throwable th) {
            this.f2351b.m3093b();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ohd.m167694a(this.f2350a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
