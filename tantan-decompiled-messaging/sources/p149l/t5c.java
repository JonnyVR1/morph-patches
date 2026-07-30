package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.p013db.Table;
import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.p118io.CloseableKt;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u0001\"B+\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0011J'\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, m87232d2 = {"Ll/t5c;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", "context", "", "accountId", "dbName", "Ll/nul;", "logger", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ll/nul;)V", "q", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/database/sqlite/SQLiteDatabase;", "db", "", "u", "(Landroid/database/sqlite/SQLiteDatabase;)V", "dataString", Constants.KEY_T, "statement", "n", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V", "onCreate", "", "oldVersion", "newVersion", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "", "k", "()Z", "m", "()V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getAccountId", "()Ljava/lang/String;", "c", "Ll/nul;", "Ljava/io/File;", Constants.INAPP_DATA_TAG, "Ljava/io/File;", "databaseFile", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class t5c extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final File databaseFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5c(@NotNull Context context, @NotNull String str, @Nullable String str2, @NotNull nul nulVar) {
        super(context, str2, (SQLiteDatabase.CursorFactory) null, 7);
        context.getClass();
        str.getClass();
        nulVar.getClass();
        this.context = context;
        this.accountId = str;
        this.logger = nulVar;
        this.databaseFile = context.getDatabasePath(str2);
    }

    /* JADX INFO: renamed from: n */
    private final void m187287n(SQLiteDatabase db, String statement) {
        SQLiteStatement sQLiteStatementCompileStatement = db.compileStatement(statement);
        this.logger.verbose("Executing - " + statement);
        sQLiteStatementCompileStatement.execute();
    }

    /* JADX INFO: renamed from: q */
    private final String m187288q(String accountId) {
        String str = "deviceId:" + accountId;
        String str2 = "fallbackId:" + accountId;
        String strM156889i = mxf0.m156889i(this.context, str, null);
        if (strM156889i != null) {
            return strM156889i;
        }
        String strM156889i2 = mxf0.m156889i(this.context, str2, "");
        return strM156889i2 == null ? "" : strM156889i2;
    }

    /* JADX INFO: renamed from: t */
    private final String m187289t(String dataString) {
        Object obj;
        try {
            JSONObject jSONObject = new JSONObject(dataString);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj2 = jSONObject.get(next);
                if ((obj2 instanceof String) && C15386d.m93483J((String) obj2, Constants.DATE_PREFIX, false, 2, null)) {
                    obj = obj2;
                    obj = obj2;
                    Long lValueOf = Long.valueOf(Long.parseLong(StringsKt.m93456w0((String) obj2, Constants.DATE_PREFIX)));
                    jSONObject.put(next, lValueOf.longValue());
                    obj = lValueOf;
                }
                obj = obj2;
                obj = obj2;
                obj = obj2;
                if (obj instanceof JSONObject) {
                    if (((JSONObject) obj).has(Constants.COMMAND_SET)) {
                        jSONObject.put(next, ((JSONObject) obj).getJSONArray(Constants.COMMAND_SET));
                    } else if (((JSONObject) obj).has(Constants.COMMAND_ADD)) {
                        jSONObject.put(next, ((JSONObject) obj).getJSONArray(Constants.COMMAND_ADD));
                    }
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            this.logger.verbose("Error while migrating data column for userProfiles table for data = " + dataString, e);
            return dataString;
        }
    }

    /* JADX INFO: renamed from: u */
    private final void m187290u(SQLiteDatabase db) {
        m187287n(db, owb.f145997w);
        String strM187288q = m187288q(this.accountId);
        StringBuilder sb = new StringBuilder("SELECT _id, data FROM ");
        Table table = Table.USER_PROFILES;
        sb.append(table.getTableName());
        sb.append(';');
        Cursor cursorRawQuery = db.rawQuery(sb.toString(), null);
        cursorRawQuery.getClass();
        Cursor cursor = cursorRawQuery;
        try {
            if (cursorRawQuery.moveToFirst()) {
                String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("_id"));
                String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow("data"));
                string2.getClass();
                m187287n(db, "INSERT INTO temp_" + table.getTableName() + " (_id, deviceID, data)\n                                 VALUES ('" + string + "', '" + strM187288q + "', '" + m187289t(string2) + "');");
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.m87404a(cursor, null);
            m187287n(db, owb.f145998x);
            m187287n(db, owb.f145999y);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m87404a(cursor, th);
                throw th2;
            }
        }
    }

    @SuppressLint({"UsableSpace"})
    /* JADX INFO: renamed from: k */
    public final boolean m187291k() {
        return !this.databaseFile.exists() || Math.max(this.databaseFile.getUsableSpace(), 25165824L) >= this.databaseFile.length();
    }

    /* JADX INFO: renamed from: m */
    public final void m187292m() {
        close();
        if (this.databaseFile.delete()) {
            return;
        }
        this.logger.debug("Could not delete database");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NotNull SQLiteDatabase db) {
        db.getClass();
        this.logger.verbose("Creating CleverTap DB");
        m187287n(db, owb.f145975a);
        m187287n(db, owb.f145976b);
        m187287n(db, owb.f145980f);
        m187287n(db, owb.f145996v);
        m187287n(db, owb.f145981g);
        m187287n(db, owb.f145987m);
        m187287n(db, owb.f145989o);
        m187287n(db, owb.f145991q);
        m187287n(db, owb.f145977c);
        m187287n(db, owb.f145978d);
        m187287n(db, owb.f145979e);
        m187287n(db, owb.f145985k);
        m187287n(db, owb.f145986l);
        m187287n(db, owb.f145990p);
        m187287n(db, owb.f145988n);
        m187287n(db, owb.f145984j);
        m187287n(db, owb.f145992r);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NotNull SQLiteDatabase db, int oldVersion, int newVersion) {
        db.getClass();
        this.logger.verbose("Upgrading CleverTap DB to version " + newVersion);
        if (oldVersion == 1) {
            m187287n(db, owb.f145993s);
            m187287n(db, owb.f145994t);
            m187287n(db, owb.f145995u);
            m187287n(db, owb.f145981g);
            m187287n(db, owb.f145987m);
            m187287n(db, owb.f145989o);
            m187287n(db, owb.f145991q);
            m187287n(db, owb.f145990p);
            m187287n(db, owb.f145988n);
            m187287n(db, owb.f145984j);
            m187287n(db, owb.f145992r);
            m187290u(db);
        } else if (oldVersion == 2) {
            m187287n(db, owb.f145995u);
            m187287n(db, owb.f145991q);
            m187287n(db, owb.f145992r);
            m187290u(db);
        } else if (oldVersion == 3) {
            m187290u(db);
        }
        if (oldVersion < 5) {
            m187287n(db, owb.f145976b);
        }
        if (oldVersion < 6) {
            m187287n(db, owb.f145977c);
        }
        if (oldVersion < 7) {
            m187287n(db, owb.f145978d);
            m187287n(db, owb.f145979e);
            m187287n(db, owb.f145982h);
            m187287n(db, owb.f145983i);
        }
    }
}
