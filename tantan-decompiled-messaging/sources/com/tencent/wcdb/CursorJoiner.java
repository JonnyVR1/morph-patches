package com.tencent.wcdb;

import java.util.Iterator;
import p149l.ig3;
import p149l.j850;
import p149l.qkq0;
import p149l.yfq0;

/* JADX INFO: loaded from: classes2.dex */
public final class CursorJoiner implements Iterator<Result>, Iterable<Result> {
    private int[] mColumnsLeft;
    private int[] mColumnsRight;
    private Result mCompareResult;
    private boolean mCompareResultIsValid;
    private Cursor mCursorLeft;
    private Cursor mCursorRight;
    private String[] mValues;

    /* JADX INFO: renamed from: com.tencent.wcdb.CursorJoiner$1 */
    public static /* synthetic */ class C144361 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$wcdb$CursorJoiner$Result;

        static {
            int[] iArr = new int[Result.values().length];
            $SwitchMap$com$tencent$wcdb$CursorJoiner$Result = iArr;
            try {
                iArr[Result.BOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$CursorJoiner$Result[Result.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$wcdb$CursorJoiner$Result[Result.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum Result {
        RIGHT,
        LEFT,
        BOTH
    }

    public CursorJoiner(Cursor cursor, String[] strArr, Cursor cursor2, String[] strArr2) {
        if (strArr.length != strArr2.length) {
            yfq0.m214580a("you must have the same number of columns on the left and right, ", strArr.length, " != ", strArr2.length);
            throw null;
        }
        this.mCursorLeft = cursor;
        this.mCursorRight = cursor2;
        cursor.moveToFirst();
        this.mCursorRight.moveToFirst();
        this.mCompareResultIsValid = false;
        this.mColumnsLeft = buildColumnIndiciesArray(cursor, strArr);
        this.mColumnsRight = buildColumnIndiciesArray(cursor2, strArr2);
        this.mValues = new String[this.mColumnsLeft.length * 2];
    }

    private int[] buildColumnIndiciesArray(Cursor cursor, String[] strArr) {
        int[] iArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            iArr[i] = cursor.getColumnIndexOrThrow(strArr[i]);
        }
        return iArr;
    }

    private static int compareStrings(String... strArr) {
        if (strArr.length % 2 != 0) {
            ig3.m135964a("you must specify an even number of values");
            return 0;
        }
        for (int i = 0; i < strArr.length; i += 2) {
            String str = strArr[i];
            if (str != null) {
                String str2 = strArr[i + 1];
                if (str2 == null) {
                    return 1;
                }
                int iCompareTo = str.compareTo(str2);
                if (iCompareTo != 0) {
                    return iCompareTo < 0 ? -1 : 1;
                }
            } else if (strArr[i + 1] != null) {
                return -1;
            }
        }
        return 0;
    }

    private void incrementCursors() {
        if (this.mCompareResultIsValid) {
            int i = C144361.$SwitchMap$com$tencent$wcdb$CursorJoiner$Result[this.mCompareResult.ordinal()];
            if (i == 1) {
                this.mCursorLeft.moveToNext();
                this.mCursorRight.moveToNext();
            } else if (i == 2) {
                this.mCursorLeft.moveToNext();
            } else if (i == 3) {
                this.mCursorRight.moveToNext();
            }
            this.mCompareResultIsValid = false;
        }
    }

    private static void populateValues(String[] strArr, Cursor cursor, int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            strArr[(i2 * 2) + i] = cursor.getString(iArr[i2]);
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.mCompareResultIsValid) {
            return (this.mCursorLeft.isAfterLast() && this.mCursorRight.isAfterLast()) ? false : true;
        }
        int i = C144361.$SwitchMap$com$tencent$wcdb$CursorJoiner$Result[this.mCompareResult.ordinal()];
        if (i == 1) {
            return (this.mCursorLeft.isLast() && this.mCursorRight.isLast()) ? false : true;
        }
        if (i == 2) {
            return (this.mCursorLeft.isLast() && this.mCursorRight.isAfterLast()) ? false : true;
        }
        if (i == 3) {
            return (this.mCursorLeft.isAfterLast() && this.mCursorRight.isLast()) ? false : true;
        }
        j850.m140190a("bad value for mCompareResult, ", this.mCompareResult);
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<Result> iterator() {
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public Result next() {
        if (!hasNext()) {
            qkq0.m175383a("you must only call next() when hasNext() is true");
            return null;
        }
        incrementCursors();
        boolean zIsAfterLast = this.mCursorLeft.isAfterLast();
        boolean zIsAfterLast2 = this.mCursorRight.isAfterLast();
        if (!zIsAfterLast && !zIsAfterLast2) {
            populateValues(this.mValues, this.mCursorLeft, this.mColumnsLeft, 0);
            populateValues(this.mValues, this.mCursorRight, this.mColumnsRight, 1);
            int iCompareStrings = compareStrings(this.mValues);
            if (iCompareStrings == -1) {
                this.mCompareResult = Result.LEFT;
            } else if (iCompareStrings == 0) {
                this.mCompareResult = Result.BOTH;
            } else if (iCompareStrings == 1) {
                this.mCompareResult = Result.RIGHT;
            }
        } else if (zIsAfterLast) {
            this.mCompareResult = Result.RIGHT;
        } else {
            this.mCompareResult = Result.LEFT;
        }
        this.mCompareResultIsValid = true;
        return this.mCompareResult;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("not implemented");
    }
}
