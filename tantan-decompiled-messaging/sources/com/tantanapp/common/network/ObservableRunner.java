package com.tantanapp.common.network;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;
import p133rx.Notification;
import p133rx.subjects.C22392a;
import p149l.c4g0;
import p149l.e30;
import p149l.edk0;
import p149l.n11;
import p149l.roj0;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
final class ObservableRunner {
    public static final String TAG = "ObservableRunner";
    w9j<Throwable, Throwable> call;
    private final LinkedList<Batch> batches = new LinkedList<>();
    private final HashMap<String, ReqForNow> executes = new HashMap<>();
    private final LinkedList<ReqForNow> executesList = new LinkedList<>();
    private volatile boolean stopped = false;

    public static class Batch {
        final List<Req> requests;
        private final int type;

        public Batch(Req req, int i) {
            ArrayList arrayList = new ArrayList(2);
            this.requests = arrayList;
            arrayList.add(req);
            this.type = i;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OTypeEnum {
    }

    public static class ReqForNow<T> {
        public boolean handleError;

        /* JADX INFO: renamed from: id */
        final String f56043id;
        public C22392a<T> notifier;
        public C22306c<T> obs;
        public c4g0 subs;

        public ReqForNow(String str, C22306c<T> c22306c, boolean z) {
            this.f56043id = str;
            this.obs = c22306c;
            this.handleError = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m81270a(ObservableRunner observableRunner, String str, ReqForNow reqForNow, Notification notification) {
        synchronized (observableRunner.executes) {
            try {
                if (str != null) {
                    observableRunner.executes.remove(str);
                } else {
                    observableRunner.executesList.remove(reqForNow);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m81271b(ObservableRunner observableRunner, Req req, Notification notification) {
        observableRunner.getClass();
        if (req.done) {
            return;
        }
        synchronized (observableRunner.batches) {
            try {
                if (!req.done) {
                    req.done = true;
                    observableRunner.clearDoneRequests();
                    observableRunner.tryTopBatch();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C22306c m81274e(ObservableRunner observableRunner, Req req, Throwable th) {
        w9j<Throwable, Throwable> w9jVar;
        observableRunner.getClass();
        return (!req.handleError || (w9jVar = observableRunner.call) == null) ? C22306c.error(th) : C22306c.error(w9jVar.call(th));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C22306c m81277h(ObservableRunner observableRunner, ReqForNow reqForNow, Throwable th) {
        w9j<Throwable, Throwable> w9jVar;
        observableRunner.getClass();
        return (!reqForNow.handleError || (w9jVar = observableRunner.call) == null) ? C22306c.error(th) : C22306c.error(w9jVar.call(th));
    }

    public void clearDoneRequests() {
        List<Req> list;
        synchronized (this.batches) {
            int i = 0;
            while (i < this.batches.size()) {
                try {
                    Batch batch = this.batches.get(i);
                    int i2 = 0;
                    while (true) {
                        int size = batch.requests.size();
                        list = batch.requests;
                        if (i2 >= size) {
                            break;
                        }
                        if (list.get(i2).done) {
                            batch.requests.remove(i2);
                            i2--;
                        }
                        i2++;
                    }
                    if (list.isEmpty()) {
                        this.batches.remove(i);
                        i--;
                    }
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void clearRequests(String str, int i) {
        synchronized (this.batches) {
            try {
                Iterator<Batch> it = this.batches.iterator();
                while (it.hasNext()) {
                    for (Req req : it.next().requests) {
                        String str2 = req.f56042id;
                        if (str2 != null && str2.equals(str) && req.type == i) {
                            c4g0 c4g0Var = req.subs;
                            if (c4g0Var != null) {
                                c4g0Var.unsubscribe();
                            }
                            req.done = true;
                        }
                    }
                }
                clearDoneRequests();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void clearRequestsAndStop() {
        this.stopped = true;
        synchronized (this.batches) {
            try {
                Iterator<Batch> it = this.batches.iterator();
                while (it.hasNext()) {
                    for (Req req : it.next().requests) {
                        c4g0 c4g0Var = req.subs;
                        if (c4g0Var != null) {
                            c4g0Var.unsubscribe();
                        }
                        req.done = true;
                    }
                }
                clearDoneRequests();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.executes) {
            try {
                for (Map.Entry<String, ReqForNow> entry : this.executes.entrySet()) {
                    if (entry.getValue().subs != null) {
                        entry.getValue().subs.unsubscribe();
                    }
                }
                Iterator<ReqForNow> it2 = this.executesList.iterator();
                while (it2.hasNext()) {
                    it2.next().subs.unsubscribe();
                }
                this.executes.clear();
                this.executesList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public <K> C22306c<K> findRequest(String str, int i) {
        synchronized (this.batches) {
            try {
                Iterator<Batch> it = this.batches.iterator();
                while (it.hasNext()) {
                    for (Req req : it.next().requests) {
                        String str2 = req.f56042id;
                        if (str2 != null && str2.equals(str) && req.type == i) {
                            return req.notifier;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C22306c<roj0> just() {
        return now(null, C22306c.just(roj0.f160388a));
    }

    public <T> C22306c<T> now(final String str, C22306c<T> c22306c, boolean z) {
        synchronized (this.executes) {
            if (str != null) {
                try {
                    ReqForNow reqForNow = this.executes.get(str);
                    if (reqForNow != null) {
                        return reqForNow.notifier;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            final ReqForNow reqForNow2 = new ReqForNow(str, c22306c, z);
            reqForNow2.notifier = C22392a.m221512b();
            if (str != null) {
                this.executes.put(str, reqForNow2);
            } else {
                this.executesList.add(reqForNow2);
            }
            reqForNow2.subs = reqForNow2.obs.doOnEach(new e30() { // from class: com.tantanapp.common.network.c
                @Override // p149l.e30
                public final void call(Object obj) {
                    ObservableRunner.m81270a(this.f56048a, str, reqForNow2, (Notification) obj);
                }
            }).filter(new w9j() { // from class: com.tantanapp.common.network.d
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!this.f56051a.stopped);
                }
            }).onErrorResumeNext(new w9j() { // from class: com.tantanapp.common.network.e
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ObservableRunner.m81277h(this.f56052a, reqForNow2, (Throwable) obj);
                }
            }).subscribe(reqForNow2.notifier);
            return reqForNow2.notifier;
        }
    }

    public void runnerStart() {
        this.stopped = false;
        tryTopBatch();
    }

    public void runnerStop() {
        this.stopped = true;
    }

    public <T> C22306c<T> scheduled(final String str, final int i, v9j<C22306c<T>> v9jVar, boolean z) {
        if (edk0.f90613c) {
            n11.m157332e(str, "scheduled id should not be null");
        }
        synchronized (this.batches) {
            if (i == 0) {
                try {
                    Iterator<Batch> it = this.batches.iterator();
                    while (it.hasNext()) {
                        Req req = (Req) vwb.m200346r(it.next().requests, new w9j() { // from class: com.tantanapp.common.network.b
                            @Override // p149l.w9j
                            public final Object call(Object obj) {
                                return ((ObservableRunner.Req) obj).idempotent(str, i);
                            }
                        });
                        if (req != null) {
                            String str2 = edk0.f90611a;
                            return req.notifier;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Req req2 = new Req(str, i, v9jVar, z);
            req2.notifier = C22392a.m221512b();
            int i2 = req2.type;
            LinkedList<Batch> linkedList = this.batches;
            if (i2 == -1) {
                linkedList.add(new Batch(req2, i));
            } else if (linkedList.isEmpty() || this.batches.peek().type != i) {
                this.batches.add(new Batch(req2, i));
            } else {
                this.batches.peek().requests.add(req2);
            }
            tryTopBatch();
            return req2.notifier;
        }
    }

    public void setErrorHandler(w9j<Throwable, Throwable> w9jVar) {
        this.call = w9jVar;
    }

    public void tryRequest(final Req<Object> req) {
        if (req == null || req.subs != null || req.done) {
            return;
        }
        req.subs = req.request.call().doOnEach(new e30() { // from class: com.tantanapp.common.network.f
            @Override // p149l.e30
            public final void call(Object obj) {
                ObservableRunner.m81271b(this.f56054a, req, (Notification) obj);
            }
        }).filter(new w9j() { // from class: com.tantanapp.common.network.g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!this.f56056a.stopped);
            }
        }).onErrorResumeNext(new w9j() { // from class: com.tantanapp.common.network.h
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ObservableRunner.m81274e(this.f56057a, req, (Throwable) obj);
            }
        }).subscribe(req.notifier);
    }

    public void tryTopBatch() {
        synchronized (this.batches) {
            try {
                if (!this.stopped && !this.batches.isEmpty()) {
                    Iterator<Req> it = this.batches.peek().requests.iterator();
                    while (it.hasNext()) {
                        tryRequest(it.next());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C22306c<roj0> wait(String str, int i) {
        C22306c c22306cFindRequest = findRequest(str, i);
        return c22306cFindRequest == null ? C22306c.just(roj0.f160388a) : c22306cFindRequest.materialize().first().map(new w9j() { // from class: com.tantanapp.common.network.a
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    public static class Req<T> {
        public boolean done;
        public boolean handleError;

        /* JADX INFO: renamed from: id */
        final String f56042id;
        public C22392a notifier;
        final v9j<C22306c<T>> request;
        public c4g0 subs;
        final int type;

        public Req(String str, int i, v9j<C22306c<T>> v9jVar, boolean z) {
            this.f56042id = str;
            this.type = i;
            this.request = v9jVar;
            this.handleError = z;
        }

        public Boolean idempotent(String str, int i) {
            return Boolean.valueOf(i == 0 && i == this.type && str != null && str.equals(this.f56042id));
        }

        public Req(String str, int i, v9j<C22306c<T>> v9jVar) {
            this(str, i, v9jVar, true);
        }
    }

    public <T> C22306c<T> now(C22306c<T> c22306c) {
        return now(null, c22306c);
    }

    public <T> C22306c<T> now(String str, C22306c<T> c22306c) {
        return now(null, c22306c, true);
    }

    public <T> C22306c<T> scheduled(String str, int i, v9j<C22306c<T>> v9jVar) {
        return scheduled(str, i, v9jVar, true);
    }
}
