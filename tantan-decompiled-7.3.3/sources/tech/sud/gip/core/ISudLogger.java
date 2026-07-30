package tech.sud.gip.core;

/* JADX INFO: loaded from: classes3.dex */
public interface ISudLogger {
    void log(int i, String str, String str2);

    void log(int i, String str, String str2, Throwable th);

    void setLogLevel(int i);
}
