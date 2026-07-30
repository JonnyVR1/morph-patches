package org.fourthline.cling.model;

/* JADX INFO: loaded from: classes3.dex */
public interface Command<T> {
    void execute(ServiceManager<T> serviceManager) throws Exception;
}
