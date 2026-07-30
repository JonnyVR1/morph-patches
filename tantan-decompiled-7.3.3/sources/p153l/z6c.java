package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.p014db.Table;
import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.p122io.CloseableKt;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u0001\"B+\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\fJ\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0011J'\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, m88121d2 = {"Ll/z6c;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", "context", "", "accountId", "dbName", "Ll/axl;", "logger", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ll/axl;)V", "q", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/database/sqlite/SQLiteDatabase;", "db", "", "u", "(Landroid/database/sqlite/SQLiteDatabase;)V", "dataString", Constants.KEY_T, "statement", "n", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V", "onCreate", "", "oldVersion", "newVersion", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "", "k", "()Z", "m", "()V", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getAccountId", "()Ljava/lang/String;", "c", "Ll/axl;", "Ljava/io/File;", Constants.INAPP_DATA_TAG, "Ljava/io/File;", "databaseFile", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class z6c extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final File databaseFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6c(@NotNull Context context, @NotNull String str, @Nullable String str2, @NotNull axl axlVar) {
        super(context, str2, (SQLiteDatabase.CursorFactory) null, 7);
        context.getClass();
        str.getClass();
        axlVar.getClass();
        this.context = context;
        this.accountId = str;
        this.logger = axlVar;
        this.databaseFile = context.getDatabasePath(str2);
    }

    /* JADX INFO: renamed from: n */
    private final void m218778n(SQLiteDatabase db, String statement) {
        SQLiteStatement sQLiteStatementCompileStatement = db.compileStatement(statement);
        this.logger.verbose("Executing - " + statement);
        sQLiteStatementCompileStatement.execute();
    }

    /* JADX INFO: renamed from: q */
    private final String m218779q(String accountId) {
        String str = "deviceId:" + accountId;
        String str2 = "fallbackId:" + accountId;
        String strM199855i = v5g0.m199855i(this.context, str, null);
        if (strM199855i != null) {
            return strM199855i;
        }
        String strM199855i2 = v5g0.m199855i(this.context, str2, "");
        return strM199855i2 == null ? "" : strM199855i2;
    }

    /* JADX INFO: renamed from: t */
    private final String m218780t(String dataString) {
        Object obj;
        try {
            JSONObject jSONObject = new JSONObject(dataString);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj2 = jSONObject.get(next);
                if ((obj2 instanceof String) && C15493d.m94374J((String) obj2, Constants.DATE_PREFIX, false, 2, null)) {
                    obj = obj2;
                    obj = obj2;
                    Long lValueOf = Long.valueOf(Long.parseLong(StringsKt.m94347w0((String) obj2, Constants.DATE_PREFIX)));
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
    private final void m218781u(SQLiteDatabase db) {
        m218778n(db, cyb.f84345w);
        String strM218779q = m218779q(this.accountId);
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
                m218778n(db, "INSERT INTO temp_" + table.getTableName() + " (_id, deviceID, data)\n                                 VALUES ('" + string + "', '" + strM218779q + "', '" + m218780t(string2) + "');");
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.m88293a(cursor, null);
            m218778n(db, cyb.f84346x);
            m218778n(db, cyb.f84347y);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m88293a(cursor, th);
                throw th2;
            }
        }
    }

    @SuppressLint({"UsableSpace"})
    /* JADX INFO: renamed from: k */
    public final boolean m218782k() {
        return !this.databaseFile.exists() || Math.max(this.databaseFile.getUsableSpace(), 25165824L) >= this.databaseFile.length();
    }

    /* JADX INFO: renamed from: m */
    public final void m218783m() {
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
        m218778n(db, cyb.f84323a);
        m218778n(db, cyb.f84324b);
        m218778n(db, cyb.f84328f);
        m218778n(db, cyb.f84344v);
        m218778n(db, cyb.f84329g);
        m218778n(db, cyb.f84335m);
        m218778n(db, cyb.f84337o);
        m218778n(db, cyb.f84339q);
        m218778n(db, cyb.f84325c);
        m218778n(db, cyb.f84326d);
        m218778n(db, cyb.f84327e);
        m218778n(db, cyb.f84333k);
        m218778n(db, cyb.f84334l);
        m218778n(db, cyb.f84338p);
        m218778n(db, cyb.f84336n);
        m218778n(db, cyb.f84332j);
        m218778n(db, cyb.f84340r);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NotNull SQLiteDatabase db, int oldVersion, int newVersion) {
        db.getClass();
        this.logger.verbose("Upgrading CleverTap DB to version " + newVersion);
        if (oldVersion == 1) {
            m218778n(db, cyb.f84341s);
            m218778n(db, cyb.f84342t);
            m218778n(db, cyb.f84343u);
            m218778n(db, cyb.f84329g);
            m218778n(db, cyb.f84335m);
            m218778n(db, cyb.f84337o);
            m218778n(db, cyb.f84339q);
            m218778n(db, cyb.f84338p);
            m218778n(db, cyb.f84336n);
            m218778n(db, cyb.f84332j);
            m218778n(db, cyb.f84340r);
            m218781u(db);
        } else if (oldVersion == 2) {
            m218778n(db, cyb.f84343u);
            m218778n(db, cyb.f84339q);
            m218778n(db, cyb.f84340r);
            m218781u(db);
        } else if (oldVersion == 3) {
            m218781u(db);
        }
        if (oldVersion < 5) {
            m218778n(db, cyb.f84324b);
        }
        if (oldVersion < 6) {
            m218778n(db, cyb.f84325c);
        }
        if (oldVersion < 7) {
            m218778n(db, cyb.f84326d);
            m218778n(db, cyb.f84327e);
            m218778n(db, cyb.f84330h);
            m218778n(db, cyb.f84331i);
        }
    }
}
