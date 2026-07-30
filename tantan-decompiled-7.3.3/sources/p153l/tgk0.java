package p153l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.p014db.Table;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.p122io.CloseableKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, m88121d2 = {"Ll/tgk0;", "Ll/sgk0;", "Ll/z6c;", "dbHelper", "Ll/axl;", "logger", "Ll/j1c;", "dbEncryptionHandler", "<init>", "(Ll/z6c;Ll/axl;Ll/j1c;)V", "", "accountId", Constants.DEVICE_ID_TAG, "Lorg/json/JSONObject;", "profile", "", "b", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)J", "", "c", "(Ljava/lang/String;)Ljava/util/Map;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;", "Ll/z6c;", "Ll/axl;", "Ll/j1c;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class tgk0 implements sgk0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final z6c dbHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final j1c dbEncryptionHandler;

    public tgk0(@NotNull z6c z6cVar, @NotNull axl axlVar, @NotNull j1c j1cVar) {
        z6cVar.getClass();
        axlVar.getClass();
        j1cVar.getClass();
        this.dbHelper = z6cVar;
        this.logger = axlVar;
        this.dbEncryptionHandler = j1cVar;
    }

    @Override // p153l.sgk0
    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: a */
    public JSONObject mo185792a(@NotNull String accountId, @NotNull String deviceId) {
        SQLiteException sQLiteException;
        JSONObject jSONObject;
        accountId.getClass();
        deviceId.getClass();
        String tableName = Table.USER_PROFILES.getTableName();
        JSONObject jSONObject2 = null;
        try {
            Cursor cursorQuery = this.dbHelper.getReadableDatabase().query(tableName, null, "_id = ? AND deviceID = ?", new String[]{accountId, deviceId}, null, null, null);
            if (cursorQuery == null) {
                return null;
            }
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                try {
                    try {
                        if (cursor2.moveToFirst()) {
                            int columnIndex = cursor2.getColumnIndex("data");
                            if (columnIndex >= 0) {
                                String strM143113b = this.dbEncryptionHandler.m143113b(cursor2.getString(columnIndex));
                                if (strM143113b != null) {
                                    jSONObject = new JSONObject(strM143113b);
                                } else {
                                    this.logger.verbose("Failed profile decryption");
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.m88293a(cursor, null);
                            return jSONObject;
                        }
                        this.logger.verbose("There was no profile found in DB");
                        CloseableKt.m88293a(cursor, null);
                        return jSONObject;
                    } catch (SQLiteException e) {
                        sQLiteException = e;
                        jSONObject2 = jSONObject;
                    }
                    Unit unit2 = Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    jSONObject2 = jSONObject;
                    Throwable th2 = th;
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.m88293a(cursor, th2);
                        throw th3;
                    }
                }
                jSONObject = null;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (SQLiteException e2) {
            sQLiteException = e2;
        }
        this.logger.verbose("Could not fetch records out of database " + tableName + '.', sQLiteException);
        return jSONObject2;
    }

    @Override // p153l.sgk0
    @WorkerThread
    /* JADX INFO: renamed from: b */
    public long mo185793b(@NotNull String accountId, @NotNull String deviceId, @NotNull JSONObject profile) {
        accountId.getClass();
        deviceId.getClass();
        profile.getClass();
        if (!this.dbHelper.m218782k()) {
            this.logger.verbose("There is not enough space left on the device to store data, data discarded");
            return -2L;
        }
        String tableName = Table.USER_PROFILES.getTableName();
        this.logger.verbose("Inserting or updating userProfile for accountID = " + accountId + " + deviceID = " + deviceId);
        ContentValues contentValues = new ContentValues();
        j1c j1cVar = this.dbEncryptionHandler;
        String string = profile.toString();
        string.getClass();
        contentValues.put("data", j1cVar.m143114c(string));
        contentValues.put("_id", accountId);
        contentValues.put("deviceID", deviceId);
        try {
            return this.dbHelper.getWritableDatabase().insertWithOnConflict(tableName, null, contentValues, 5);
        } catch (SQLiteException e) {
            this.logger.verbose("Error adding data to table " + tableName + ". Recreating DB", e);
            this.dbHelper.m218783m();
            return -1L;
        }
    }

    @Override // p153l.sgk0
    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: c */
    public Map<String, JSONObject> mo185794c(@NotNull String accountId) {
        accountId.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String tableName = Table.USER_PROFILES.getTableName();
        try {
            Cursor cursorQuery = this.dbHelper.getReadableDatabase().query(tableName, null, "_id = ?", new String[]{accountId}, null, null, null);
            if (cursorQuery == null) {
                return linkedHashMap;
            }
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                int columnIndex = cursor2.getColumnIndex("data");
                int columnIndex2 = cursor2.getColumnIndex("deviceID");
                while (cursor2.moveToNext()) {
                    String string = cursor2.getString(columnIndex);
                    String string2 = cursor2.getString(columnIndex2);
                    String strM143113b = this.dbEncryptionHandler.m143113b(string);
                    if (strM143113b != null) {
                        linkedHashMap.put(string2, new JSONObject(strM143113b));
                    } else {
                        this.logger.verbose("Error decrypting JSON for profile");
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.m88293a(cursor, null);
                return linkedHashMap;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m88293a(cursor, th);
                    throw th2;
                }
            }
        } catch (SQLiteException e) {
            this.logger.verbose("Could not fetch records out of database " + tableName + '.', e);
            return linkedHashMap;
        }
    }
}
