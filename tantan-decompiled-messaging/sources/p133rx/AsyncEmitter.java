package p133rx;

import p149l.m250;

/* JADX INFO: loaded from: classes3.dex */
public interface AsyncEmitter<T> extends m250<T> {

    public enum BackpressureMode {
        NONE,
        ERROR,
        BUFFER,
        DROP,
        LATEST
    }

    /* JADX INFO: renamed from: rx.AsyncEmitter$a */
    public interface InterfaceC22303a {
        void cancel() throws Exception;
    }
}
