package io.requery.android.database;

import android.database.CharArrayBuffer;
import io.requery.android.database.sqlite.SQLiteClosable;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
public class CursorWindow extends SQLiteClosable {
    private static final boolean DEBUG = false;
    private static final int WINDOW_SIZE_KB = 64;
    private static int sCursorWindowSize = -1;
    private final String mName;
    private int mStartPos = 0;
    public long mWindowPtr;

    public CursorWindow(String str) {
        str = (str == null || str.length() == 0) ? "<unnamed>" : str;
        this.mName = str;
        if (sCursorWindowSize < 0) {
            sCursorWindowSize = 65536;
        }
        long jNativeCreate = nativeCreate(str, sCursorWindowSize);
        this.mWindowPtr = jNativeCreate;
        if (jNativeCreate != 0) {
            return;
        }
        throw new CursorWindowAllocationException("Cursor window allocation of " + (sCursorWindowSize / 1024) + " kb failed. ");
    }

    private void dispose() {
        long j = this.mWindowPtr;
        if (j != 0) {
            nativeDispose(j);
            this.mWindowPtr = 0L;
        }
    }

    private static native boolean nativeAllocRow(long j);

    private static native void nativeClear(long j);

    private static native long nativeCreate(String str, int i);

    private static native void nativeDispose(long j);

    private static native void nativeFreeLastRow(long j);

    private static native byte[] nativeGetBlob(long j, int i, int i2);

    private static native double nativeGetDouble(long j, int i, int i2);

    private static native long nativeGetLong(long j, int i, int i2);

    private static native String nativeGetName(long j);

    private static native int nativeGetNumRows(long j);

    private static native String nativeGetString(long j, int i, int i2);

    private static native int nativeGetType(long j, int i, int i2);

    private static native boolean nativePutBlob(long j, byte[] bArr, int i, int i2);

    private static native boolean nativePutDouble(long j, double d, int i, int i2);

    private static native boolean nativePutLong(long j, long j2, int i, int i2);

    private static native boolean nativePutNull(long j, int i, int i2);

    private static native boolean nativePutString(long j, String str, int i, int i2);

    private static native boolean nativeSetNumColumns(long j, int i);

    public boolean allocRow() {
        return nativeAllocRow(this.mWindowPtr);
    }

    public void clear() {
        this.mStartPos = 0;
        nativeClear(this.mWindowPtr);
    }

    public void copyStringToBuffer(int i, int i2, CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer == null) {
            wg3.m206174a("CharArrayBuffer should not be null");
            return;
        }
        char[] charArray = getString(i, i2).toCharArray();
        charArrayBuffer.data = charArray;
        charArrayBuffer.sizeCopied = charArray.length;
    }

    public void finalize() throws Throwable {
        try {
            dispose();
        } finally {
            super.finalize();
        }
    }

    public void freeLastRow() {
        nativeFreeLastRow(this.mWindowPtr);
    }

    public byte[] getBlob(int i, int i2) {
        return nativeGetBlob(this.mWindowPtr, i - this.mStartPos, i2);
    }

    public double getDouble(int i, int i2) {
        return nativeGetDouble(this.mWindowPtr, i - this.mStartPos, i2);
    }

    public float getFloat(int i, int i2) {
        return (float) getDouble(i, i2);
    }

    public int getInt(int i, int i2) {
        return (int) getLong(i, i2);
    }

    public long getLong(int i, int i2) {
        return nativeGetLong(this.mWindowPtr, i - this.mStartPos, i2);
    }

    public String getName() {
        return this.mName;
    }

    public int getNumRows() {
        return nativeGetNumRows(this.mWindowPtr);
    }

    public short getShort(int i, int i2) {
        return (short) getLong(i, i2);
    }

    public int getStartPosition() {
        return this.mStartPos;
    }

    public String getString(int i, int i2) {
        String strNativeGetString = nativeGetString(this.mWindowPtr, i - this.mStartPos, i2);
        return strNativeGetString == null ? "" : strNativeGetString;
    }

    public int getType(int i, int i2) {
        return nativeGetType(this.mWindowPtr, i - this.mStartPos, i2);
    }

    @Override // io.requery.android.database.sqlite.SQLiteClosable
    public void onAllReferencesReleased() {
        dispose();
    }

    public boolean putBlob(byte[] bArr, int i, int i2) {
        return nativePutBlob(this.mWindowPtr, bArr, i - this.mStartPos, i2);
    }

    public boolean putDouble(double d, int i, int i2) {
        return nativePutDouble(this.mWindowPtr, d, i - this.mStartPos, i2);
    }

    public boolean putLong(long j, int i, int i2) {
        return nativePutLong(this.mWindowPtr, j, i - this.mStartPos, i2);
    }

    public boolean putNull(int i, int i2) {
        return nativePutNull(this.mWindowPtr, i - this.mStartPos, i2);
    }

    public boolean putString(String str, int i, int i2) {
        return nativePutString(this.mWindowPtr, str, i - this.mStartPos, i2);
    }

    public boolean setNumColumns(int i) {
        return nativeSetNumColumns(this.mWindowPtr, i);
    }

    public void setStartPosition(int i) {
        this.mStartPos = i;
    }

    public String toString() {
        return getName() + " {" + Long.toHexString(this.mWindowPtr) + "}";
    }
}
