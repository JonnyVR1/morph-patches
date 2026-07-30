package p149l;

import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.util.TriState;
import com.facebook.imagepipeline.common.Priority;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public abstract class vm10<K, T extends Closeable> implements sc90<T> {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final Map<K, vm10<K, T>.C20662a> f182060a;

    /* JADX INFO: renamed from: b */
    public final sc90<T> f182061b;

    /* JADX INFO: renamed from: c */
    public final boolean f182062c;

    /* JADX INFO: renamed from: d */
    public final String f182063d;

    /* JADX INFO: renamed from: e */
    public final String f182064e;

    /* JADX INFO: renamed from: l.vm10$a */
    @VisibleForTesting
    public class C20662a {

        /* JADX INFO: renamed from: a */
        public final K f182065a;

        /* JADX INFO: renamed from: b */
        public final CopyOnWriteArraySet<Pair<uz5<T>, uc90>> f182066b = ume0.m194341a();

        /* JADX INFO: renamed from: c */
        public T f182067c;

        /* JADX INFO: renamed from: d */
        public float f182068d;

        /* JADX INFO: renamed from: e */
        public int f182069e;

        /* JADX INFO: renamed from: f */
        public mq2 f182070f;

        /* JADX INFO: renamed from: g */
        public vm10<K, T>.C20662a.b f182071g;

        /* JADX INFO: renamed from: l.vm10$a$a */
        public class a extends nq2 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Pair f182073a;

            public a(Pair pair) {
                this.f182073a = pair;
            }

            @Override // p149l.nq2, p149l.vc90
            /* JADX INFO: renamed from: a */
            public void mo8530a() {
                mq2.m155854c(C20662a.this.m198895r());
            }

            @Override // p149l.nq2, p149l.vc90
            /* JADX INFO: renamed from: b */
            public void mo8497b() {
                boolean zRemove;
                List list;
                mq2 mq2Var;
                List listM198897t;
                List listM198895r;
                synchronized (C20662a.this) {
                    try {
                        zRemove = C20662a.this.f182066b.remove(this.f182073a);
                        list = null;
                        if (zRemove) {
                            boolean zIsEmpty = C20662a.this.f182066b.isEmpty();
                            C20662a c20662a = C20662a.this;
                            if (zIsEmpty) {
                                mq2Var = c20662a.f182070f;
                                listM198897t = null;
                            } else {
                                List listM198896s = c20662a.m198896s();
                                listM198897t = C20662a.this.m198897t();
                                listM198895r = C20662a.this.m198895r();
                                mq2Var = null;
                                list = listM198896s;
                            }
                        } else {
                            mq2Var = null;
                            listM198897t = null;
                        }
                        listM198895r = listM198897t;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                mq2.m155855f(list);
                mq2.m155856g(listM198897t);
                mq2.m155854c(listM198895r);
                if (mq2Var != null) {
                    if (!vm10.this.f182062c || mq2Var.mo155859H()) {
                        mq2Var.m155864h();
                    } else {
                        mq2.m155856g(mq2Var.m155871o(Priority.LOW));
                    }
                }
                if (zRemove) {
                    ((uz5) this.f182073a.first).mo107034a();
                }
            }

            @Override // p149l.nq2, p149l.vc90
            /* JADX INFO: renamed from: c */
            public void mo160552c() {
                mq2.m155855f(C20662a.this.m198896s());
            }

            @Override // p149l.nq2, p149l.vc90
            /* JADX INFO: renamed from: d */
            public void mo160553d() {
                mq2.m155856g(C20662a.this.m198897t());
            }
        }

        /* JADX INFO: renamed from: l.vm10$a$b */
        public class b extends ci2<T> {
            public b() {
            }

            @Override // p149l.ci2
            /* JADX INFO: renamed from: f */
            public void mo8521f() {
                try {
                    if (o6j.m162852d()) {
                        o6j.m162850a("MultiplexProducer#onCancellation");
                    }
                    C20662a.this.m198890m(this);
                } finally {
                    if (o6j.m162852d()) {
                        o6j.m162851b();
                    }
                }
            }

            @Override // p149l.ci2
            /* JADX INFO: renamed from: g */
            public void mo8522g(Throwable th) {
                try {
                    if (o6j.m162852d()) {
                        o6j.m162850a("MultiplexProducer#onFailure");
                    }
                    C20662a.this.m198891n(this, th);
                } finally {
                    if (o6j.m162852d()) {
                        o6j.m162851b();
                    }
                }
            }

            @Override // p149l.ci2
            /* JADX INFO: renamed from: i */
            public void mo8524i(float f) {
                try {
                    if (o6j.m162852d()) {
                        o6j.m162850a("MultiplexProducer#onProgressUpdate");
                    }
                    C20662a.this.m198893p(this, f);
                } finally {
                    if (o6j.m162852d()) {
                        o6j.m162851b();
                    }
                }
            }

            @Override // p149l.ci2
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public void mo8523h(T t, int i) {
                try {
                    if (o6j.m162852d()) {
                        o6j.m162850a("MultiplexProducer#onNewResult");
                    }
                    C20662a.this.m198892o(this, t, i);
                } finally {
                    if (o6j.m162852d()) {
                        o6j.m162851b();
                    }
                }
            }
        }

        public C20662a(K k) {
            this.f182065a = k;
        }

        /* JADX INFO: renamed from: g */
        public final void m198884g(Pair<uz5<T>, uc90> pair, uc90 uc90Var) {
            uc90Var.mo155872q(new a(pair));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: h */
        public boolean m198885h(uz5<T> uz5Var, uc90 uc90Var) {
            Pair<uz5<T>, uc90> pairCreate = Pair.create(uz5Var, uc90Var);
            synchronized (this) {
                try {
                    if (vm10.this.m198876i(this.f182065a) != this) {
                        return false;
                    }
                    this.f182066b.add(pairCreate);
                    List<vc90> listM198896s = m198896s();
                    List<vc90> listM198897t = m198897t();
                    List<vc90> listM198895r = m198895r();
                    Closeable closeableMo133668g = this.f182067c;
                    float f = this.f182068d;
                    int i = this.f182069e;
                    mq2.m155855f(listM198896s);
                    mq2.m155856g(listM198897t);
                    mq2.m155854c(listM198895r);
                    synchronized (pairCreate) {
                        try {
                            synchronized (this) {
                                try {
                                    if (closeableMo133668g != this.f182067c) {
                                        closeableMo133668g = null;
                                    } else if (closeableMo133668g != null) {
                                        closeableMo133668g = vm10.this.mo133668g(closeableMo133668g);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (closeableMo133668g != null) {
                                if (f > 0.0f) {
                                    uz5Var.mo107036c(f);
                                }
                                uz5Var.mo107035b(closeableMo133668g, i);
                                m198886i(closeableMo133668g);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    m198884g(pairCreate, uc90Var);
                    return true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m198886i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    aag0.m95543a(e);
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public final synchronized boolean m198887j() {
            Iterator<Pair<uz5<T>, uc90>> it = this.f182066b.iterator();
            while (it.hasNext()) {
                if (((uc90) it.next().second).mo155858F()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: k */
        public final synchronized boolean m198888k() {
            Iterator<Pair<uz5<T>, uc90>> it = this.f182066b.iterator();
            while (it.hasNext()) {
                if (!((uc90) it.next().second).mo155859H()) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: l */
        public final synchronized Priority m198889l() {
            Priority higherPriority;
            higherPriority = Priority.LOW;
            Iterator<Pair<uz5<T>, uc90>> it = this.f182066b.iterator();
            while (it.hasNext()) {
                higherPriority = Priority.getHigherPriority(higherPriority, ((uc90) it.next().second).getPriority());
            }
            return higherPriority;
        }

        /* JADX INFO: renamed from: m */
        public void m198890m(vm10<K, T>.C20662a.b bVar) {
            synchronized (this) {
                try {
                    if (this.f182071g != bVar) {
                        return;
                    }
                    this.f182071g = null;
                    this.f182070f = null;
                    m198886i(this.f182067c);
                    this.f182067c = null;
                    m198894q(TriState.UNSET);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public void m198891n(vm10<K, T>.C20662a.b bVar, Throwable th) {
            synchronized (this) {
                try {
                    if (this.f182071g != bVar) {
                        return;
                    }
                    this.f182066b.clear();
                    vm10.this.m198877k(this.f182065a, this);
                    m198886i(this.f182067c);
                    this.f182067c = null;
                    for (Pair<uz5<T>, uc90> pair : this.f182066b) {
                        synchronized (pair) {
                            try {
                                ((uc90) pair.second).mo155870n().mo104757i((uc90) pair.second, vm10.this.f182063d, th, null);
                                mq2 mq2Var = this.f182070f;
                                if (mq2Var != null) {
                                    ((uc90) pair.second).mo155862d(mq2Var.getExtras());
                                }
                                ((uz5) pair.first).onFailure(th);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* JADX INFO: renamed from: o */
        public void m198892o(vm10<K, T>.C20662a.b bVar, T t, int i) {
            synchronized (this) {
                try {
                    if (this.f182071g != bVar) {
                        return;
                    }
                    m198886i(this.f182067c);
                    this.f182067c = null;
                    int size = this.f182066b.size();
                    if (ci2.m107029e(i)) {
                        this.f182067c = (T) vm10.this.mo133668g(t);
                        this.f182069e = i;
                    } else {
                        this.f182066b.clear();
                        vm10.this.m198877k(this.f182065a, this);
                    }
                    for (Pair<uz5<T>, uc90> pair : this.f182066b) {
                        synchronized (pair) {
                            try {
                                if (ci2.m107028d(i)) {
                                    ((uc90) pair.second).mo155870n().mo104756f((uc90) pair.second, vm10.this.f182063d, null);
                                    mq2 mq2Var = this.f182070f;
                                    if (mq2Var != null) {
                                        ((uc90) pair.second).mo155862d(mq2Var.getExtras());
                                    }
                                    ((uc90) pair.second).mo155861b(vm10.this.f182064e, Integer.valueOf(size));
                                }
                                ((uz5) pair.first).mo107035b(t, i);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: p */
        public void m198893p(vm10<K, T>.C20662a.b bVar, float f) {
            synchronized (this) {
                try {
                    if (this.f182071g != bVar) {
                        return;
                    }
                    this.f182068d = f;
                    for (Pair<uz5<T>, uc90> pair : this.f182066b) {
                        synchronized (pair) {
                            ((uz5) pair.first).mo107036c(f);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: q */
        public final void m198894q(TriState triState) {
            synchronized (this) {
                try {
                    rf80.m179111b(Boolean.valueOf(this.f182070f == null));
                    rf80.m179111b(Boolean.valueOf(this.f182071g == null));
                    if (this.f182066b.isEmpty()) {
                        vm10.this.m198877k(this.f182065a, this);
                        return;
                    }
                    uc90 uc90Var = (uc90) this.f182066b.iterator().next().second;
                    mq2 mq2Var = new mq2(uc90Var.mo155873t(), uc90Var.getId(), uc90Var.mo155870n(), uc90Var.mo155867k(), uc90Var.mo155860I(), m198888k(), m198887j(), m198889l(), uc90Var.mo155869m());
                    this.f182070f = mq2Var;
                    mq2Var.mo155862d(uc90Var.getExtras());
                    if (triState.isSet()) {
                        this.f182070f.mo155861b("started_as_prefetch", Boolean.valueOf(triState.asBoolean()));
                    }
                    vm10<K, T>.C20662a.b bVar = new b();
                    this.f182071g = bVar;
                    vm10.this.f182061b.mo8485b(bVar, this.f182070f);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: r */
        public final synchronized List<vc90> m198895r() {
            mq2 mq2Var = this.f182070f;
            if (mq2Var == null) {
                return null;
            }
            return mq2Var.m155866j(m198887j());
        }

        /* JADX INFO: renamed from: s */
        public final synchronized List<vc90> m198896s() {
            mq2 mq2Var = this.f182070f;
            if (mq2Var == null) {
                return null;
            }
            return mq2Var.m155868l(m198888k());
        }

        /* JADX INFO: renamed from: t */
        public final synchronized List<vc90> m198897t() {
            mq2 mq2Var = this.f182070f;
            if (mq2Var == null) {
                return null;
            }
            return mq2Var.m155871o(m198889l());
        }
    }

    public vm10(sc90<T> sc90Var, String str, String str2, boolean z) {
        this.f182061b = sc90Var;
        this.f182060a = new HashMap();
        this.f182062c = z;
        this.f182063d = str;
        this.f182064e = str2;
    }

    @Override // p149l.sc90
    /* JADX INFO: renamed from: b */
    public void mo8485b(uz5<T> uz5Var, uc90 uc90Var) {
        vm10<K, T>.C20662a c20662aM198876i;
        boolean z;
        try {
            if (o6j.m162852d()) {
                o6j.m162850a("MultiplexProducer#produceResults");
            }
            uc90Var.mo155870n().mo104754d(uc90Var, this.f182063d);
            K kMo133669j = mo133669j(uc90Var);
            do {
                synchronized (this) {
                    try {
                        c20662aM198876i = m198876i(kMo133669j);
                        if (c20662aM198876i == null) {
                            c20662aM198876i = m198875h(kMo133669j);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (!c20662aM198876i.m198885h(uz5Var, uc90Var));
            if (z) {
                c20662aM198876i.m198894q(TriState.valueOf(uc90Var.mo155859H()));
            }
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
        } catch (Throwable th2) {
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract T mo133668g(T t);

    /* JADX INFO: renamed from: h */
    public final synchronized vm10<K, T>.C20662a m198875h(K k) {
        vm10<K, T>.C20662a c20662a;
        c20662a = new C20662a(k);
        this.f182060a.put(k, c20662a);
        return c20662a;
    }

    /* JADX INFO: renamed from: i */
    public synchronized vm10<K, T>.C20662a m198876i(K k) {
        return this.f182060a.get(k);
    }

    /* JADX INFO: renamed from: j */
    public abstract K mo133669j(uc90 uc90Var);

    /* JADX INFO: renamed from: k */
    public synchronized void m198877k(K k, vm10<K, T>.C20662a c20662a) {
        if (this.f182060a.get(k) == c20662a) {
            this.f182060a.remove(k);
        }
    }

    public vm10(sc90<T> sc90Var, String str, String str2) {
        this(sc90Var, str, str2, false);
    }
}
