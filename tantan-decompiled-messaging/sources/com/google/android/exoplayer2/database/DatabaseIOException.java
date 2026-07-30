package com.google.android.exoplayer2.database;

import android.database.SQLException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class DatabaseIOException extends IOException {
    public DatabaseIOException(SQLException sQLException) {
        super(sQLException);
    }

    public DatabaseIOException(SQLException sQLException, String str) {
        super(str, sQLException);
    }
}
