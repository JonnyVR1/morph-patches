package com.tantanapp.common.network;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;
import p137rx.Notification;
import p137rx.subjects.C22507a;
import p153l.jyb;
import p153l.kcg0;
import p153l.kmk0;
import p153l.pcj;
import p153l.qcj;
import p153l.u11;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
final class ObservableRunner {
    public static final String TAG = "ObservableRunner";
    qcj<Throwable, Throwable> call;
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
        final String f56891id;
        public C22507a<T> notifier;
        public C22421c<T> obs;
        public kcg0 subs;

        public ReqForNow(String str, C22421c<T> c22421c, boolean z) {
            this.f56891id = str;
            this.obs = c22421c;
            this.handleError = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m82453a(ObservableRunner observableRunner, String str, ReqForNow reqForNow, Notification notification) {
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
    public static /* synthetic */ void m82454b(ObservableRunner observableRunner, Req req, Notification notification) {
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
    public static /* synthetic */ C22421c m82457e(ObservableRunner observableRunner, Req req, Throwable th) {
        qcj<Throwable, Throwable> qcjVar;
        observableRunner.getClass();
        return (!req.handleError || (qcjVar = observableRunner.call) == null) ? C22421c.error(th) : C22421c.error(qcjVar.call(th));
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C22421c m82460h(ObservableRunner observableRunner, ReqForNow reqForNow, Throwable th) {
        qcj<Throwable, Throwable> qcjVar;
        observableRunner.getClass();
        return (!reqForNow.handleError || (qcjVar = observableRunner.call) == null) ? C22421c.error(th) : C22421c.error(qcjVar.call(th));
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
                        String str2 = req.f56890id;
                        if (str2 != null && str2.equals(str) && req.type == i) {
                            kcg0 kcg0Var = req.subs;
                            if (kcg0Var != null) {
                                kcg0Var.unsubscribe();
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
                        kcg0 kcg0Var = req.subs;
                        if (kcg0Var != null) {
                            kcg0Var.unsubscribe();
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

    public <K> C22421c<K> findRequest(String str, int i) {
        synchronized (this.batches) {
            try {
                Iterator<Batch> it = this.batches.iterator();
                while (it.hasNext()) {
                    for (Req req : it.next().requests) {
                        String str2 = req.f56890id;
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

    public C22421c<uxj0> just() {
        return now(null, C22421c.just(uxj0.f181467a));
    }

    public <T> C22421c<T> now(final String str, C22421c<T> c22421c, boolean z) {
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
            final ReqForNow reqForNow2 = new ReqForNow(str, c22421c, z);
            reqForNow2.notifier = C22507a.m222758b();
            if (str != null) {
                this.executes.put(str, reqForNow2);
            } else {
                this.executesList.add(reqForNow2);
            }
            reqForNow2.subs = reqForNow2.obs.doOnEach(new y20() { // from class: com.tantanapp.common.network.c
                @Override // p153l.y20
                public final void call(Object obj) {
                    ObservableRunner.m82453a(this.f56896a, str, reqForNow2, (Notification) obj);
                }
            }).filter(new qcj() { // from class: com.tantanapp.common.network.d
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!this.f56899a.stopped);
                }
            }).onErrorResumeNext(new qcj() { // from class: com.tantanapp.common.network.e
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ObservableRunner.m82460h(this.f56900a, reqForNow2, (Throwable) obj);
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

    public <T> C22421c<T> scheduled(final String str, final int i, pcj<C22421c<T>> pcjVar, boolean z) {
        if (kmk0.f127510c) {
            u11.m193891e(str, "scheduled id should not be null");
        }
        synchronized (this.batches) {
            if (i == 0) {
                try {
                    Iterator<Batch> it = this.batches.iterator();
                    while (it.hasNext()) {
                        Req req = (Req) jyb.m147529r(it.next().requests, new qcj() { // from class: com.tantanapp.common.network.b
                            @Override // p153l.qcj
                            public final Object call(Object obj) {
                                return ((ObservableRunner.Req) obj).idempotent(str, i);
                            }
                        });
                        if (req != null) {
                            String str2 = kmk0.f127508a;
                            return req.notifier;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Req req2 = new Req(str, i, pcjVar, z);
            req2.notifier = C22507a.m222758b();
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

    public void setErrorHandler(qcj<Throwable, Throwable> qcjVar) {
        this.call = qcjVar;
    }

    public void tryRequest(final Req<Object> req) {
        if (req == null || req.subs != null || req.done) {
            return;
        }
        req.subs = req.request.call().doOnEach(new y20() { // from class: com.tantanapp.common.network.f
            @Override // p153l.y20
            public final void call(Object obj) {
                ObservableRunner.m82454b(this.f56902a, req, (Notification) obj);
            }
        }).filter(new qcj() { // from class: com.tantanapp.common.network.g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!this.f56904a.stopped);
            }
        }).onErrorResumeNext(new qcj() { // from class: com.tantanapp.common.network.h
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ObservableRunner.m82457e(this.f56905a, req, (Throwable) obj);
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

    public C22421c<uxj0> wait(String str, int i) {
        C22421c c22421cFindRequest = findRequest(str, i);
        return c22421cFindRequest == null ? C22421c.just(uxj0.f181467a) : c22421cFindRequest.materialize().first().map(new qcj() { // from class: com.tantanapp.common.network.a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    public static class Req<T> {
        public boolean done;
        public boolean handleError;

        /* JADX INFO: renamed from: id */
        final String f56890id;
        public C22507a notifier;
        final pcj<C22421c<T>> request;
        public kcg0 subs;
        final int type;

        public Req(String str, int i, pcj<C22421c<T>> pcjVar, boolean z) {
            this.f56890id = str;
            this.type = i;
            this.request = pcjVar;
            this.handleError = z;
        }

        public Boolean idempotent(String str, int i) {
            return Boolean.valueOf(i == 0 && i == this.type && str != null && str.equals(this.f56890id));
        }

        public Req(String str, int i, pcj<C22421c<T>> pcjVar) {
            this(str, i, pcjVar, true);
        }
    }

    public <T> C22421c<T> now(C22421c<T> c22421c) {
        return now(null, c22421c);
    }

    public <T> C22421c<T> now(String str, C22421c<T> c22421c) {
        return now(null, c22421c, true);
    }

    public <T> C22421c<T> scheduled(String str, int i, pcj<C22421c<T>> pcjVar) {
        return scheduled(str, i, pcjVar, true);
    }
}
