package io.requery.android.database.sqlite;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteDatabaseConfiguration {
    private static final Pattern EMAIL_IN_DB_PATTERN = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");
    public static final String MEMORY_DB_PATH = ":memory:";
    public final List<SQLiteCustomExtension> customExtensions;
    public final List<SQLiteCustomFunction> customFunctions;
    public boolean disableSharePrimaryConnection;
    public boolean foreignKeyConstraintsEnabled;
    public final String label;
    public Locale locale;
    public int maxSqlCacheSize;
    public int openFlags;
    public final String path;

    public SQLiteDatabaseConfiguration(String str, int i) {
        this.disableSharePrimaryConnection = false;
        this.customFunctions = new ArrayList();
        this.customExtensions = new ArrayList();
        if (str == null) {
            ig3.m135964a("path must not be null.");
            throw null;
        }
        this.path = str;
        this.label = stripPathForLogs(str);
        this.openFlags = i;
        this.maxSqlCacheSize = 25;
        this.locale = Locale.getDefault();
    }

    private static String stripPathForLogs(String str) {
        return str.indexOf(64) == -1 ? str : EMAIL_IN_DB_PATTERN.matcher(str).replaceAll("XX@YY");
    }

    public boolean isInMemoryDb() {
        return this.path.equalsIgnoreCase(":memory:");
    }

    public void updateParametersFrom(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            ig3.m135964a("other must not be null.");
            return;
        }
        if (!this.path.equals(sQLiteDatabaseConfiguration.path)) {
            ig3.m135964a("other configuration must refer to the same database.");
            return;
        }
        this.openFlags = sQLiteDatabaseConfiguration.openFlags;
        this.disableSharePrimaryConnection = sQLiteDatabaseConfiguration.disableSharePrimaryConnection;
        this.maxSqlCacheSize = sQLiteDatabaseConfiguration.maxSqlCacheSize;
        this.locale = sQLiteDatabaseConfiguration.locale;
        this.foreignKeyConstraintsEnabled = sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled;
        this.customFunctions.clear();
        this.customFunctions.addAll(sQLiteDatabaseConfiguration.customFunctions);
        this.customExtensions.clear();
        this.customExtensions.addAll(sQLiteDatabaseConfiguration.customExtensions);
    }

    public SQLiteDatabaseConfiguration(String str, int i, List<SQLiteCustomFunction> list, List<SQLiteCustomExtension> list2) {
        this(str, i);
        this.customFunctions.addAll(list);
        this.customExtensions.addAll(list2);
    }

    public SQLiteDatabaseConfiguration(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.disableSharePrimaryConnection = false;
        this.customFunctions = new ArrayList();
        this.customExtensions = new ArrayList();
        if (sQLiteDatabaseConfiguration != null) {
            this.path = sQLiteDatabaseConfiguration.path;
            this.label = sQLiteDatabaseConfiguration.label;
            updateParametersFrom(sQLiteDatabaseConfiguration);
            return;
        }
        ig3.m135964a("other must not be null.");
        throw null;
    }
}
