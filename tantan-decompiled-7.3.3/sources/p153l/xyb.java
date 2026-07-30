package p153l;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p122io.CloseableKt;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\b\u001a%\u0010\u0001\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0001\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Landroid/database/Cursor;", "c", "a", "(Landroid/database/Cursor;)Landroid/database/Cursor;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", Constants.INAPP_DATA_TAG, "(Landroid/database/Cursor;Ljava/lang/String;)I", "e", "cursor", "b", "", "columnNames", "([Ljava/lang/String;Ljava/lang/String;)I", "room-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@JvmName
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension
public final class xyb {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Cursor m213604a(@NotNull Cursor cursor) {
        cursor.getClass();
        Cursor cursor2 = cursor;
        try {
            Cursor cursor3 = cursor2;
            MatrixCursor matrixCursor = new MatrixCursor(cursor3.getColumnNames(), cursor3.getCount());
            while (cursor3.moveToNext()) {
                Object[] objArr = new Object[cursor3.getColumnCount()];
                int columnCount = cursor.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    int type = cursor3.getType(i);
                    if (type == 0) {
                        objArr[i] = null;
                    } else if (type == 1) {
                        objArr[i] = Long.valueOf(cursor3.getLong(i));
                    } else if (type == 2) {
                        objArr[i] = Double.valueOf(cursor3.getDouble(i));
                    } else if (type == 3) {
                        objArr[i] = cursor3.getString(i);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i] = cursor3.getBlob(i);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            CloseableKt.m88293a(cursor2, null);
            return matrixCursor;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m88293a(cursor2, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final int m213605b(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        columnNames.getClass();
        return m213606c(columnNames, str);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public static final int m213606c(@NotNull String[] strArr, @NotNull String str) {
        strArr.getClass();
        str.getClass();
        String str2 = "." + str;
        String str3 = "." + str + '`';
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str4 = strArr[i];
            int i3 = i2 + 1;
            if (str4.length() >= str.length() + 2 && (C15493d.m94380w(str4, str2, false, 2, null) || (str4.charAt(0) == '`' && C15493d.m94380w(str4, str3, false, 2, null)))) {
                return i2;
            }
            i++;
            i2 = i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static final int m213607d(@NotNull Cursor cursor, @NotNull String str) {
        cursor.getClass();
        str.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        return columnIndex2 >= 0 ? columnIndex2 : m213605b(cursor, str);
    }

    /* JADX INFO: renamed from: e */
    public static final int m213608e(@NotNull Cursor cursor, @NotNull String str) {
        String strJoinToString$default;
        cursor.getClass();
        str.getClass();
        int iM213607d = m213607d(cursor, str);
        if (iM213607d >= 0) {
            return iM213607d;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            columnNames.getClass();
            strJoinToString$default = ArraysKt.joinToString$default(columnNames, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        } catch (Exception unused) {
            strJoinToString$default = "unknown";
        }
        wwq0.m208289a("column '", str, "' does not exist. Available columns: ", strJoinToString$default);
        return 0;
    }
}
