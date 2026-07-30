package com.tantanapp.common.network;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;
import p149l.roj0;
import p149l.v9j;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class RunnerProxy {
    private List<RunnerProxy> group;
    protected ObservableRunner runner;

    public RunnerProxy() {
        this.group = null;
        this.runner = new ObservableRunner();
    }

    public void bind(RunnerProxy runnerProxy) {
        if (this.group == null) {
            this.group = new ArrayList();
        }
        this.group.add(runnerProxy);
    }

    public void clearRequests(String str, int i) {
        doBeforeAction();
        this.runner.clearRequests(str, i);
    }

    public void clearRequestsAndStop() {
        doBeforeAction();
        this.runner.clearRequestsAndStop();
    }

    public void doBeforeAction() {
    }

    public <K> C22306c<K> findRequest(String str, int i) {
        doBeforeAction();
        return this.runner.findRequest(str, i);
    }

    public C22306c<roj0> just() {
        doBeforeAction();
        return this.runner.just();
    }

    @Deprecated
    public <T> C22306c<T> now(String str, C22306c<T> c22306c, boolean z) {
        doBeforeAction();
        return this.runner.now(str, c22306c, z);
    }

    public void runnerStart() {
        List<RunnerProxy> list = this.group;
        if (list != null) {
            Iterator<RunnerProxy> it = list.iterator();
            while (it.hasNext()) {
                it.next().runnerStart();
            }
        }
        this.runner.runnerStart();
    }

    public void runnerStop() {
        List<RunnerProxy> list = this.group;
        if (list != null) {
            Iterator<RunnerProxy> it = list.iterator();
            while (it.hasNext()) {
                it.next().runnerStop();
            }
        }
        this.runner.runnerStop();
    }

    public <T> C22306c<T> scheduled(String str, int i, v9j<C22306c<T>> v9jVar) {
        doBeforeAction();
        return this.runner.scheduled(str, i, v9jVar);
    }

    public void setErrorHandler(w9j<Throwable, Throwable> w9jVar) {
        this.runner.setErrorHandler(w9jVar);
    }

    public C22306c<roj0> wait(String str, int i) {
        doBeforeAction();
        return this.runner.wait(str, i);
    }

    public <T> C22306c<T> now(C22306c<T> c22306c) {
        doBeforeAction();
        return this.runner.now(c22306c);
    }

    @Deprecated
    public <T> C22306c<T> scheduled(String str, int i, v9j<C22306c<T>> v9jVar, boolean z) {
        doBeforeAction();
        return this.runner.scheduled(str, i, v9jVar, z);
    }

    public <T> C22306c<T> now(String str, C22306c<T> c22306c) {
        doBeforeAction();
        return this.runner.now(str, c22306c);
    }

    public RunnerProxy(RunnerProxy runnerProxy) {
        this.group = null;
        this.runner = runnerProxy.runner;
    }
}
