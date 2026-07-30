package com.tencent.wcdb;

/* JADX INFO: loaded from: classes2.dex */
public class CrossProcessCursorWrapper extends CursorWrapper implements CrossProcessCursor {
    public CrossProcessCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    @Override // com.tencent.wcdb.CrossProcessCursor
    public void fillWindow(int i, CursorWindow cursorWindow) {
        Cursor cursor = this.mCursor;
        if (cursor instanceof CrossProcessCursor) {
            ((CrossProcessCursor) cursor).fillWindow(i, cursorWindow);
        } else {
            DatabaseUtils.cursorFillWindow(cursor, i, cursorWindow);
        }
    }

    @Override // com.tencent.wcdb.CrossProcessCursor
    public CursorWindow getWindow() {
        Cursor cursor = this.mCursor;
        if (cursor instanceof CrossProcessCursor) {
            return ((CrossProcessCursor) cursor).getWindow();
        }
        return null;
    }

    @Override // com.tencent.wcdb.CrossProcessCursor
    public boolean onMove(int i, int i2) {
        Cursor cursor = this.mCursor;
        if (cursor instanceof CrossProcessCursor) {
            return ((CrossProcessCursor) cursor).onMove(i, i2);
        }
        return true;
    }
}
