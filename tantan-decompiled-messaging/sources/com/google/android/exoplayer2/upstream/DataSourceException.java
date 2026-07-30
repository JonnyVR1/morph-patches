package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class DataSourceException extends IOException {

    @Deprecated
    public static final int POSITION_OUT_OF_RANGE = 2008;
    public final int reason;

    public DataSourceException(int i) {
        this.reason = i;
    }

    public static boolean isCausedByPositionOutOfRange(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).reason == 2008) {
                return true;
            }
        }
        return false;
    }

    public DataSourceException(@Nullable Throwable th, int i) {
        super(th);
        this.reason = i;
    }

    public DataSourceException(@Nullable String str, int i) {
        super(str);
        this.reason = i;
    }

    public DataSourceException(@Nullable String str, @Nullable Throwable th, int i) {
        super(str, th);
        this.reason = i;
    }
}
