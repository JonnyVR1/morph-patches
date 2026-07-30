package p014rx;

import p003l.m250;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface AsyncEmitter<T> extends m250<T> {

    public enum BackpressureMode {
        NONE,
        ERROR,
        BUFFER,
        DROP,
        LATEST
    }

    /* JADX INFO: renamed from: rx.AsyncEmitter$a */
    public interface InterfaceC1096a {
        void cancel() throws Exception;
    }
}
