package p149l;

import com.clevertap.android.sdk.Constants;
import org.greenrobot.greendao.DaoLog;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.SqlUtils;
import org.greenrobot.greendao.internal.TableStatements;
import org.greenrobot.greendao.query.QueryBuilder;

/* JADX INFO: loaded from: classes7.dex */
public class zw00 extends TableStatements {
    public zw00(Database database, String str, String[] strArr, String[] strArr2) {
        super(database, str, strArr, strArr2);
    }

    /* JADX INFO: renamed from: a */
    private String[] m220499a(Property[] propertyArr) {
        String[] strArr = new String[propertyArr.length];
        int i = 0;
        for (Property property : propertyArr) {
            strArr[i] = property.columnName;
            i++;
        }
        return strArr;
    }

    /* JADX INFO: renamed from: f */
    private String m220500f(Object[] objArr, String str, String str2, int i, int i2) {
        if (objArr == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return "";
        }
        Object obj = objArr[i];
        StringBuffer stringBuffer = new StringBuffer(i3 * ((obj == null ? 16 : obj.toString().length()) + str.length()));
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                stringBuffer.append(str);
            }
            if (objArr[i4] != null) {
                stringBuffer.append(str2 + objArr[i4] + str2);
            }
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    public String m220501b(Property[] propertyArr, Property[] propertyArr2) {
        StringBuilder sb = new StringBuilder(m220502c(propertyArr));
        if (propertyArr2 != null) {
            sb.append("WHERE ");
            SqlUtils.appendColumnsEqValue(sb, j6f.GPS_DIRECTION_TRUE, m220499a(propertyArr2));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public String m220502c(Property[] propertyArr) {
        return SqlUtils.createSqlSelect(this.tablename, j6f.GPS_DIRECTION_TRUE, m220499a(propertyArr), false);
    }

    /* JADX INFO: renamed from: d */
    public DatabaseStatement m220503d(Property[] propertyArr, Property[] propertyArr2) {
        return m220504e(propertyArr, propertyArr2, null, null);
    }

    /* JADX INFO: renamed from: e */
    public DatabaseStatement m220504e(Property[] propertyArr, Property[] propertyArr2, Property property, Object[] objArr) {
        zw00 zw00Var;
        String str = this.tablename;
        String strCreateSqlUpdate = propertyArr2 == null ? SqlUtils.createSqlUpdate(str, m220499a(propertyArr)) : SqlUtils.createSqlUpdate(str, m220499a(propertyArr), m220499a(propertyArr2));
        if (property != null) {
            StringBuilder sb = new StringBuilder(strCreateSqlUpdate);
            if (propertyArr2 == null) {
                sb.append(" WHERE ");
            } else {
                sb.append(" AND ");
            }
            sb.append(property.columnName);
            sb.append(" IN(");
            zw00Var = this;
            sb.append(zw00Var.m220500f(objArr, Constants.SEPARATOR_COMMA, "'", 0, objArr.length));
            sb.append(")");
            strCreateSqlUpdate = sb.toString();
        } else {
            zw00Var = this;
        }
        if (QueryBuilder.LOG_SQL) {
            DaoLog.m221099d("GreenDao Built SQL for query: " + strCreateSqlUpdate);
        }
        return zw00Var.f205959db.compileStatement(strCreateSqlUpdate);
    }
}
