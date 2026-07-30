package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p153l.c4k;
import p153l.ylk0;

/* JADX INFO: renamed from: com.bumptech.glide.manager.n */
/* JADX INFO: loaded from: classes.dex */
final class C1129n {

    /* JADX INFO: renamed from: d */
    private static volatile C1129n f4682d;

    /* JADX INFO: renamed from: a */
    private final c f4683a;

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    final Set<InterfaceC1118c.a> f4684b = new HashSet();

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    private boolean f4685c;

    /* JADX INFO: renamed from: com.bumptech.glide.manager.n$a */
    public class a implements c4k.InterfaceC16182b<ConnectivityManager> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f4686a;

        public a(Context context) {
            this.f4686a = context;
        }

        @Override // p153l.c4k.InterfaceC16182b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f4686a.getSystemService("connectivity");
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.manager.n$b */
    public class b implements InterfaceC1118c.a {
        public b() {
        }

        @Override // com.bumptech.glide.manager.InterfaceC1118c.a
        /* JADX INFO: renamed from: a */
        public void mo5629a(boolean z) {
            ArrayList arrayList;
            synchronized (C1129n.this) {
                arrayList = new ArrayList(C1129n.this.f4684b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC1118c.a) it.next()).mo5629a(z);
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.manager.n$c */
    public interface c {
        boolean register();

        void unregister();
    }

    /* JADX INFO: renamed from: com.bumptech.glide.manager.n$d */
    @RequiresApi(24)
    public static final class d implements c {

        /* JADX INFO: renamed from: a */
        boolean f4689a;

        /* JADX INFO: renamed from: b */
        final InterfaceC1118c.a f4690b;

        /* JADX INFO: renamed from: c */
        private final c4k.InterfaceC16182b<ConnectivityManager> f4691c;

        /* JADX INFO: renamed from: d */
        private final ConnectivityManager.NetworkCallback f4692d = new a();

        /* JADX INFO: renamed from: com.bumptech.glide.manager.n$d$a */
        public class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: com.bumptech.glide.manager.n$d$a$a, reason: collision with other inner class name */
            public class RunnableC22777a implements Runnable {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ boolean f4694a;

                public RunnableC22777a(boolean z) {
                    this.f4694a = z;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.m5667a(this.f4694a);
                }
            }

            public a() {
            }

            /* JADX INFO: renamed from: b */
            private void m5666b(boolean z) {
                ylk0.m216598v(new RunnableC22777a(z));
            }

            /* JADX INFO: renamed from: a */
            public void m5667a(boolean z) {
                ylk0.m216578b();
                d dVar = d.this;
                boolean z2 = dVar.f4689a;
                dVar.f4689a = z;
                if (z2 != z) {
                    dVar.f4690b.mo5629a(z);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@NonNull Network network) {
                m5666b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@NonNull Network network) {
                m5666b(false);
            }
        }

        public d(c4k.InterfaceC16182b<ConnectivityManager> interfaceC16182b, InterfaceC1118c.a aVar) {
            this.f4691c = interfaceC16182b;
            this.f4690b = aVar;
        }

        @Override // com.bumptech.glide.manager.C1129n.c
        @SuppressLint({"MissingPermission"})
        public boolean register() {
            this.f4689a = this.f4691c.get().getActiveNetwork() != null;
            try {
                this.f4691c.get().registerDefaultNetworkCallback(this.f4692d);
                return true;
            } catch (RuntimeException unused) {
                Log.isLoggable("ConnectivityMonitor", 5);
                return false;
            }
        }

        @Override // com.bumptech.glide.manager.C1129n.c
        public void unregister() {
            this.f4691c.get().unregisterNetworkCallback(this.f4692d);
        }
    }

    private C1129n(@NonNull Context context) {
        this.f4683a = new d(c4k.m107884a(new a(context)), new b());
    }

    /* JADX INFO: renamed from: a */
    public static C1129n m5660a(@NonNull Context context) {
        if (f4682d == null) {
            synchronized (C1129n.class) {
                try {
                    if (f4682d == null) {
                        f4682d = new C1129n(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f4682d;
    }

    @GuardedBy("this")
    /* JADX INFO: renamed from: b */
    private void m5661b() {
        if (this.f4685c || this.f4684b.isEmpty()) {
            return;
        }
        this.f4685c = this.f4683a.register();
    }

    @GuardedBy("this")
    /* JADX INFO: renamed from: c */
    private void m5662c() {
        if (this.f4685c && this.f4684b.isEmpty()) {
            this.f4683a.unregister();
            this.f4685c = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m5663d(InterfaceC1118c.a aVar) {
        this.f4684b.add(aVar);
        m5661b();
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m5664e(InterfaceC1118c.a aVar) {
        this.f4684b.remove(aVar);
        m5662c();
    }
}
