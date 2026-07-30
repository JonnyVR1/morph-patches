package io.requery.android.database.sqlite;

import android.database.Cursor;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import android.util.Log;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import p149l.gf4;
import p149l.ig3;
import p149l.kg3;
import p149l.qhg0;

/* JADX INFO: loaded from: classes2.dex */
public class SQLiteQueryBuilder {
    private static final String TAG = "SQLiteQueryBuilder";
    private static final Pattern sLimitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    private boolean mStrict;
    private Map<String, String> mProjectionMap = null;
    private String mTables = "";
    private StringBuilder mWhereClause = null;
    private boolean mDistinct = false;
    private SQLiteDatabase.CursorFactory mFactory = null;

    private static void appendClause(StringBuilder sb, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        sb.append(str);
        sb.append(str2);
    }

    public static void appendColumns(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (str != null) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append(' ');
    }

    public static String buildQueryString(boolean z, String str, String[] strArr, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            ig3.m135964a("HAVING clauses are only permitted when using a groupBy clause");
            return null;
        }
        if (!TextUtils.isEmpty(str6) && !sLimitPattern.matcher(str6).matches()) {
            qhg0.m174539a("invalid LIMIT clauses:", str6);
            return null;
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("SELECT ");
        if (z) {
            sb.append("DISTINCT ");
        }
        if (strArr == null || strArr.length == 0) {
            sb.append("* ");
        } else {
            appendColumns(sb, strArr);
        }
        sb.append("FROM ");
        sb.append(str);
        appendClause(sb, " WHERE ", str2);
        appendClause(sb, " GROUP BY ", str3);
        appendClause(sb, " HAVING ", str4);
        appendClause(sb, " ORDER BY ", str5);
        appendClause(sb, " LIMIT ", str6);
        return sb.toString();
    }

    private String[] computeProjection(String[] strArr) {
        int i = 0;
        if (strArr == null || strArr.length <= 0) {
            Map<String, String> map = this.mProjectionMap;
            if (map == null) {
                return null;
            }
            Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
            String[] strArr2 = new String[setEntrySet.size()];
            for (Map.Entry<String, String> entry : setEntrySet) {
                if (!entry.getKey().equals("_count")) {
                    strArr2[i] = entry.getValue();
                    i++;
                }
            }
            return strArr2;
        }
        if (this.mProjectionMap == null) {
            return strArr;
        }
        String[] strArr3 = new String[strArr.length];
        int length = strArr.length;
        while (i < length) {
            String str = strArr[i];
            String str2 = this.mProjectionMap.get(str);
            if (str2 != null) {
                strArr3[i] = str2;
            } else {
                if (this.mStrict || !(str.contains(" AS ") || str.contains(" as "))) {
                    kg3.m145878a("Invalid column ", strArr[i]);
                    return null;
                }
                strArr3[i] = str;
            }
            i++;
        }
        return strArr3;
    }

    private void validateQuerySql(SQLiteDatabase sQLiteDatabase, String str, gf4 gf4Var) {
        sQLiteDatabase.getThreadSession().prepare(str, sQLiteDatabase.getThreadDefaultConnectionFlags(true), gf4Var, null);
    }

    public void appendWhere(CharSequence charSequence) {
        if (this.mWhereClause == null) {
            this.mWhereClause = new StringBuilder(charSequence.length() + 16);
        }
        if (this.mWhereClause.length() == 0) {
            this.mWhereClause.append('(');
        }
        this.mWhereClause.append(charSequence);
    }

    public void appendWhereEscapeString(String str) {
        if (this.mWhereClause == null) {
            this.mWhereClause = new StringBuilder(str.length() + 16);
        }
        if (this.mWhereClause.length() == 0) {
            this.mWhereClause.append('(');
        }
        DatabaseUtils.appendEscapedSQLString(this.mWhereClause, str);
    }

    public String buildQuery(String[] strArr, String str, String str2, String str3, String str4, String str5) {
        String[] strArrComputeProjection = computeProjection(strArr);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = this.mWhereClause;
        boolean z = sb2 != null && sb2.length() > 0;
        if (z) {
            sb.append(this.mWhereClause.toString());
            sb.append(')');
        }
        if (str != null && str.length() > 0) {
            if (z) {
                sb.append(" AND ");
            }
            sb.append('(');
            sb.append(str);
            sb.append(')');
        }
        return buildQueryString(this.mDistinct, this.mTables, strArrComputeProjection, sb.toString(), str2, str3, str4, str5);
    }

    public String buildUnionQuery(String[] strArr, String str, String str2) {
        StringBuilder sb = new StringBuilder(128);
        int length = strArr.length;
        String str3 = this.mDistinct ? " UNION " : " UNION ALL ";
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(str3);
            }
            sb.append(strArr[i]);
        }
        appendClause(sb, " ORDER BY ", str);
        appendClause(sb, " LIMIT ", str2);
        return sb.toString();
    }

    public String buildUnionSubQuery(String str, String[] strArr, Set<String> set, int i, String str2, String str3, String str4, String str5) {
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str6 = strArr[i2];
            if (str6.equals(str)) {
                strArr2[i2] = "'" + str2 + "' AS " + str;
            } else if (i2 <= i || set.contains(str6)) {
                strArr2[i2] = str6;
            } else {
                strArr2[i2] = "NULL AS ".concat(str6);
            }
        }
        return buildQuery(strArr2, str3, str4, str5, null, null);
    }

    public String getTables() {
        return this.mTables;
    }

    public Cursor query(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5, gf4 gf4Var) {
        gf4 gf4Var2;
        if (this.mTables == null) {
            return null;
        }
        if (!this.mStrict || str == null || str.length() <= 0) {
            gf4Var2 = gf4Var;
        } else {
            gf4Var2 = gf4Var;
            validateQuerySql(sQLiteDatabase, buildQuery(strArr, "(" + str + ")", str2, str3, str4, str5), gf4Var2);
        }
        String strBuildQuery = buildQuery(strArr, str, str2, str3, str4, str5);
        Log.isLoggable(TAG, 3);
        return sQLiteDatabase.rawQueryWithFactory(this.mFactory, strBuildQuery, strArr2, SQLiteDatabase.findEditTable(this.mTables), gf4Var2);
    }

    public void setCursorFactory(SQLiteDatabase.CursorFactory cursorFactory) {
        this.mFactory = cursorFactory;
    }

    public void setDistinct(boolean z) {
        this.mDistinct = z;
    }

    public void setProjectionMap(Map<String, String> map) {
        this.mProjectionMap = map;
    }

    public void setStrict(boolean z) {
        this.mStrict = z;
    }

    public void setTables(String str) {
        this.mTables = str;
    }

    public Cursor query(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        return query(sQLiteDatabase, strArr, str, strArr2, str2, str3, str4, str5, null);
    }

    public Cursor query(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4) {
        return query(sQLiteDatabase, strArr, str, strArr2, str2, str3, str4, null, null);
    }
}
