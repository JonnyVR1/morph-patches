package com.tencent.wcdb;

/* JADX INFO: loaded from: classes2.dex */
public interface CrossProcessCursor extends Cursor {
    void fillWindow(int i, CursorWindow cursorWindow);

    CursorWindow getWindow();

    boolean onMove(int i, int i2);
}
