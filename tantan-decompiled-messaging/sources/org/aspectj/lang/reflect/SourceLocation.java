package org.aspectj.lang.reflect;

/* JADX INFO: loaded from: classes2.dex */
public interface SourceLocation {
    int getColumn();

    String getFileName();

    int getLine();

    Class getWithinType();
}
