package org.greenrobot.greendao.internal;

import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import p149l.j6f;

/* JADX INFO: loaded from: classes3.dex */
public class TableStatements {
    private final String[] allColumns;
    private DatabaseStatement countStatement;

    /* JADX INFO: renamed from: db */
    protected final Database f205959db;
    private DatabaseStatement deleteStatement;
    private DatabaseStatement insertOrReplaceStatement;
    private DatabaseStatement insertStatement;
    private final String[] pkColumns;
    private volatile String selectAll;
    private volatile String selectByKey;
    private volatile String selectByRowId;
    private volatile String selectKeys;
    protected final String tablename;
    private DatabaseStatement updateStatement;

    public TableStatements(Database database, String str, String[] strArr, String[] strArr2) {
        this.f205959db = database;
        this.tablename = str;
        this.allColumns = strArr;
        this.pkColumns = strArr2;
    }

    public DatabaseStatement getCountStatement() {
        if (this.countStatement == null) {
            this.countStatement = this.f205959db.compileStatement(SqlUtils.createSqlCount(this.tablename));
        }
        return this.countStatement;
    }

    public DatabaseStatement getDeleteStatement() {
        if (this.deleteStatement == null) {
            DatabaseStatement databaseStatementCompileStatement = this.f205959db.compileStatement(SqlUtils.createSqlDelete(this.tablename, this.pkColumns));
            synchronized (this) {
                try {
                    if (this.deleteStatement == null) {
                        this.deleteStatement = databaseStatementCompileStatement;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.deleteStatement != databaseStatementCompileStatement) {
                databaseStatementCompileStatement.close();
            }
        }
        return this.deleteStatement;
    }

    public DatabaseStatement getInsertOrReplaceStatement() {
        if (this.insertOrReplaceStatement == null) {
            DatabaseStatement databaseStatementCompileStatement = this.f205959db.compileStatement(SqlUtils.createSqlInsert("INSERT OR REPLACE INTO ", this.tablename, this.allColumns));
            synchronized (this) {
                try {
                    if (this.insertOrReplaceStatement == null) {
                        this.insertOrReplaceStatement = databaseStatementCompileStatement;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.insertOrReplaceStatement != databaseStatementCompileStatement) {
                databaseStatementCompileStatement.close();
            }
        }
        return this.insertOrReplaceStatement;
    }

    public DatabaseStatement getInsertStatement() {
        if (this.insertStatement == null) {
            DatabaseStatement databaseStatementCompileStatement = this.f205959db.compileStatement(SqlUtils.createSqlInsert("INSERT INTO ", this.tablename, this.allColumns));
            synchronized (this) {
                try {
                    if (this.insertStatement == null) {
                        this.insertStatement = databaseStatementCompileStatement;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.insertStatement != databaseStatementCompileStatement) {
                databaseStatementCompileStatement.close();
            }
        }
        return this.insertStatement;
    }

    public String getSelectAll() {
        if (this.selectAll == null) {
            this.selectAll = SqlUtils.createSqlSelect(this.tablename, j6f.GPS_DIRECTION_TRUE, this.allColumns, false);
        }
        return this.selectAll;
    }

    public String getSelectByKey() {
        if (this.selectByKey == null) {
            StringBuilder sb = new StringBuilder(getSelectAll());
            sb.append("WHERE ");
            SqlUtils.appendColumnsEqValue(sb, j6f.GPS_DIRECTION_TRUE, this.pkColumns);
            this.selectByKey = sb.toString();
        }
        return this.selectByKey;
    }

    public String getSelectByRowId() {
        if (this.selectByRowId == null) {
            this.selectByRowId = getSelectAll() + "WHERE ROWID=?";
        }
        return this.selectByRowId;
    }

    public String getSelectKeys() {
        if (this.selectKeys == null) {
            this.selectKeys = SqlUtils.createSqlSelect(this.tablename, j6f.GPS_DIRECTION_TRUE, this.pkColumns, false);
        }
        return this.selectKeys;
    }

    public DatabaseStatement getUpdateStatement() {
        if (this.updateStatement == null) {
            DatabaseStatement databaseStatementCompileStatement = this.f205959db.compileStatement(SqlUtils.createSqlUpdate(this.tablename, this.allColumns, this.pkColumns));
            synchronized (this) {
                try {
                    if (this.updateStatement == null) {
                        this.updateStatement = databaseStatementCompileStatement;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.updateStatement != databaseStatementCompileStatement) {
                databaseStatementCompileStatement.close();
            }
        }
        return this.updateStatement;
    }
}
