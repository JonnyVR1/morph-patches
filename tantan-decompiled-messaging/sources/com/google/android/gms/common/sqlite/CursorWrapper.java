package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p149l.ig3;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {
    private AbstractWindowedCursor zza;

    @KeepForSdk
    public CursorWrapper(@NonNull Cursor cursor) {
        super(cursor);
        for (int i = 0; i < 10 && (cursor instanceof android.database.CursorWrapper); i++) {
            cursor = ((android.database.CursorWrapper) cursor).getWrappedCursor();
        }
        if (!(cursor instanceof AbstractWindowedCursor)) {
            ig3.m135964a("Unknown type: ".concat(cursor.getClass().getName()));
            throw null;
        }
        this.zza = (AbstractWindowedCursor) cursor;
    }

    @Override // android.database.CrossProcessCursor
    @KeepForSdk
    public void fillWindow(int i, @NonNull CursorWindow cursorWindow) {
        this.zza.fillWindow(i, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    @Nullable
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public CursorWindow getWindow() {
        return this.zza.getWindow();
    }

    @Override // android.database.CursorWrapper
    @NonNull
    public final /* synthetic */ Cursor getWrappedCursor() {
        return this.zza;
    }

    @Override // android.database.CrossProcessCursor
    @ResultIgnorabilityUnspecified
    public final boolean onMove(int i, int i2) {
        return this.zza.onMove(i, i2);
    }

    @KeepForSdk
    public void setWindow(@Nullable CursorWindow cursorWindow) {
        this.zza.setWindow(cursorWindow);
    }
}
