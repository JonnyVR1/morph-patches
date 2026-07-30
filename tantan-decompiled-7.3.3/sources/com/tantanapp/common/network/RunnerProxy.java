package com.tantanapp.common.network;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;
import p153l.pcj;
import p153l.qcj;
import p153l.uxj0;

/* JADX INFO: loaded from: classes11.dex */
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

    public <K> C22421c<K> findRequest(String str, int i) {
        doBeforeAction();
        return this.runner.findRequest(str, i);
    }

    public C22421c<uxj0> just() {
        doBeforeAction();
        return this.runner.just();
    }

    @Deprecated
    public <T> C22421c<T> now(String str, C22421c<T> c22421c, boolean z) {
        doBeforeAction();
        return this.runner.now(str, c22421c, z);
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

    public <T> C22421c<T> scheduled(String str, int i, pcj<C22421c<T>> pcjVar) {
        doBeforeAction();
        return this.runner.scheduled(str, i, pcjVar);
    }

    public void setErrorHandler(qcj<Throwable, Throwable> qcjVar) {
        this.runner.setErrorHandler(qcjVar);
    }

    public C22421c<uxj0> wait(String str, int i) {
        doBeforeAction();
        return this.runner.wait(str, i);
    }

    public <T> C22421c<T> now(C22421c<T> c22421c) {
        doBeforeAction();
        return this.runner.now(c22421c);
    }

    @Deprecated
    public <T> C22421c<T> scheduled(String str, int i, pcj<C22421c<T>> pcjVar, boolean z) {
        doBeforeAction();
        return this.runner.scheduled(str, i, pcjVar, z);
    }

    public <T> C22421c<T> now(String str, C22421c<T> c22421c) {
        doBeforeAction();
        return this.runner.now(str, c22421c);
    }

    public RunnerProxy(RunnerProxy runnerProxy) {
        this.group = null;
        this.runner = runnerProxy.runner;
    }
}
