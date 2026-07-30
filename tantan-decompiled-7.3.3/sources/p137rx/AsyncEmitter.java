package p137rx;

import p153l.bb50;

/* JADX INFO: loaded from: classes3.dex */
public interface AsyncEmitter<T> extends bb50<T> {

    public enum BackpressureMode {
        NONE,
        ERROR,
        BUFFER,
        DROP,
        LATEST
    }

    /* JADX INFO: renamed from: rx.AsyncEmitter$a */
    public interface InterfaceC22418a {
        void cancel() throws Exception;
    }
}
