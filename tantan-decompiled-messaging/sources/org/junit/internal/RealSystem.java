package org.junit.internal;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes3.dex */
public class RealSystem implements JUnitSystem {
    @Override // org.junit.internal.JUnitSystem
    @Deprecated
    public void exit(int i) {
        System.exit(i);
    }

    @Override // org.junit.internal.JUnitSystem
    public PrintStream out() {
        return System.out;
    }
}
