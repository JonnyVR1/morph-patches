package com.tencent.wcdb;

import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.wcdb.database.SQLiteClosable;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
public class CursorWindow extends SQLiteClosable implements Parcelable {
    public static final Parcelable.Creator<CursorWindow> CREATOR;
    private static final String STATS_TAG = "WCDB.CursorWindowStats";
    private static int sCursorWindowSize;
    private final String mName;
    private int mStartPos;
    public long mWindowPtr;

    static {
        int identifier = Resources.getSystem().getIdentifier("config_cursorWindowSize", "integer", "android");
        if (identifier != 0) {
            sCursorWindowSize = Resources.getSystem().getInteger(identifier) * 1024;
        } else {
            sCursorWindowSize = 2097152;
        }
        CREATOR = new Parcelable.Creator<CursorWindow>() { // from class: com.tencent.wcdb.CursorWindow.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CursorWindow createFromParcel(Parcel parcel) {
                return new CursorWindow(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public CursorWindow[] newArray(int i) {
                return new CursorWindow[i];
            }
        };
    }

    public CursorWindow(String str) {
        this.mStartPos = 0;
        str = (str == null || str.length() == 0) ? "<unnamed>" : str;
        this.mName = str;
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

    private static native void nativeCopyStringToBuffer(long j, int i, int i2, CharArrayBuffer charArrayBuffer);

    private static native long nativeCreate(String str, int i);

    private static native void nativeDispose(long j);

    private static native void nativeFreeLastRow(long j);

    private static native byte[] nativeGetBlob(long j, int i, int i2);

    private static native double nativeGetDouble(long j, int i, int i2);

    private static native long nativeGetLong(long j, int i, int i2);

    private static native int nativeGetNumRows(long j);

    private static native String nativeGetString(long j, int i, int i2);

    private static native int nativeGetType(long j, int i, int i2);

    private static native boolean nativePutBlob(long j, byte[] bArr, int i, int i2);

    private static native boolean nativePutDouble(long j, double d, int i, int i2);

    private static native boolean nativePutLong(long j, long j2, int i, int i2);

    private static native boolean nativePutNull(long j, int i, int i2);

    private static native boolean nativePutString(long j, String str, int i, int i2);

    private static native boolean nativeSetNumColumns(long j, int i);

    public static CursorWindow newFromParcel(Parcel parcel) {
        return CREATOR.createFromParcel(parcel);
    }

    public static int windowSize(int i) {
        int i2 = sCursorWindowSize;
        if (i > 0) {
            sCursorWindowSize = i;
        }
        return i2;
    }

    public boolean allocRow() {
        acquireReference();
        try {
            return nativeAllocRow(this.mWindowPtr);
        } finally {
            releaseReference();
        }
    }

    public void clear() {
        acquireReference();
        try {
            this.mStartPos = 0;
            nativeClear(this.mWindowPtr);
        } finally {
            releaseReference();
        }
    }

    public void copyStringToBuffer(int i, int i2, CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer == null) {
            ig3.m135964a("CharArrayBuffer should not be null");
            return;
        }
        acquireReference();
        try {
            nativeCopyStringToBuffer(this.mWindowPtr, i - this.mStartPos, i2, charArrayBuffer);
        } finally {
            releaseReference();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void finalize() throws Throwable {
        try {
            dispose();
        } finally {
            super.finalize();
        }
    }

    public void freeLastRow() {
        acquireReference();
        try {
            nativeFreeLastRow(this.mWindowPtr);
        } finally {
            releaseReference();
        }
    }

    public byte[] getBlob(int i, int i2) {
        acquireReference();
        try {
            return nativeGetBlob(this.mWindowPtr, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }

    public double getDouble(int i, int i2) {
        acquireReference();
        try {
            return nativeGetDouble(this.mWindowPtr, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }

    public float getFloat(int i, int i2) {
        return (float) getDouble(i, i2);
    }

    public int getInt(int i, int i2) {
        return (int) getLong(i, i2);
    }

    public long getLong(int i, int i2) {
        acquireReference();
        try {
            return nativeGetLong(this.mWindowPtr, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }

    public String getName() {
        return this.mName;
    }

    public int getNumRows() {
        acquireReference();
        try {
            return nativeGetNumRows(this.mWindowPtr);
        } finally {
            releaseReference();
        }
    }

    public short getShort(int i, int i2) {
        return (short) getLong(i, i2);
    }

    public int getStartPosition() {
        return this.mStartPos;
    }

    public String getString(int i, int i2) {
        acquireReference();
        try {
            return nativeGetString(this.mWindowPtr, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }

    public int getType(int i, int i2) {
        acquireReference();
        try {
            return nativeGetType(this.mWindowPtr, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }

    @Deprecated
    public boolean isBlob(int i, int i2) {
        int type = getType(i, i2);
        return type == 4 || type == 0;
    }

    @Deprecated
    public boolean isFloat(int i, int i2) {
        return getType(i, i2) == 2;
    }

    @Deprecated
    public boolean isLong(int i, int i2) {
        return getType(i, i2) == 1;
    }

    @Deprecated
    public boolean isNull(int i, int i2) {
        return getType(i, i2) == 0;
    }

    @Deprecated
    public boolean isString(int i, int i2) {
        int type = getType(i, i2);
        return type == 3 || type == 0;
    }

    @Override // com.tencent.wcdb.database.SQLiteClosable
    public void onAllReferencesReleased() {
        dispose();
    }

    public boolean putBlob(byte[] bArr, int i, int i2) {
        acquireReference();
        try {
            return nativePutBlob(this.mWindowPtr, bArr, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }

    public boolean putDouble(double d, int i, int i2) {
        acquireReference();
        try {
            return nativePutDouble(this.mWindowPtr, d, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }

    public boolean putLong(long j, int i, int i2) {
        acquireReference();
        try {
            return nativePutLong(this.mWindowPtr, j, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }

    public boolean putNull(int i, int i2) {
        acquireReference();
        try {
            return nativePutNull(this.mWindowPtr, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }

    public boolean putString(String str, int i, int i2) {
        acquireReference();
        try {
            return nativePutString(this.mWindowPtr, str, i - this.mStartPos, i2);
        } finally {
            releaseReference();
        }
    }

    public boolean setNumColumns(int i) {
        acquireReference();
        try {
            return nativeSetNumColumns(this.mWindowPtr, i);
        } finally {
            releaseReference();
        }
    }

    public void setStartPosition(int i) {
        this.mStartPos = i;
    }

    public String toString() {
        return getName() + " {" + Long.toHexString(this.mWindowPtr) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public CursorWindow(boolean z) {
        this((String) null);
    }

    private CursorWindow(Parcel parcel) {
        throw new UnsupportedOperationException();
    }
}
