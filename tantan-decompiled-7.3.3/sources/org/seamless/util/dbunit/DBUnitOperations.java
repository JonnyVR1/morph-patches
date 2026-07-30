package org.seamless.util.dbunit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ReplacementDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.operation.DatabaseOperation;
import p153l.iig0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DBUnitOperations extends ArrayList<AbstractC22263Op> {
    private static final Logger log = Logger.getLogger(DBUnitOperations.class.getName());

    public abstract void disableReferentialIntegrity(IDatabaseConnection iDatabaseConnection);

    public void editConfig(DatabaseConfig databaseConfig) {
    }

    public abstract void enableReferentialIntegrity(IDatabaseConnection iDatabaseConnection);

    public void execute() throws Throwable {
        IDatabaseConnection connection;
        log.info("Executing DBUnit operations: " + size());
        try {
            connection = getConnection();
            try {
                disableReferentialIntegrity(connection);
                Iterator<AbstractC22263Op> it = iterator();
                while (it.hasNext()) {
                    it.next().execute(connection);
                }
                enableReferentialIntegrity(connection);
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (Exception e) {
                        log.log(Level.WARNING, "Failed to close connection after DBUnit operation: " + e, (Throwable) e);
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (Exception e2) {
                        log.log(Level.WARNING, "Failed to close connection after DBUnit operation: " + e2, (Throwable) e2);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            connection = null;
        }
    }

    public IDatabaseConnection getConnection() {
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection(getDataSource().getConnection());
            editConfig(databaseConnection.getConfig());
            return databaseConnection;
        } catch (Exception e) {
            iig0.m140070a(e);
            return null;
        }
    }

    public abstract DataSource getDataSource();

    public static class ClasspathOp extends AbstractC22263Op {
        public ClasspathOp(String str) {
            super(str);
        }

        @Override // org.seamless.util.dbunit.DBUnitOperations.AbstractC22263Op
        public InputStream openStream(String str) {
            return Thread.currentThread().getContextClassLoader().getResourceAsStream(str);
        }

        public ClasspathOp(String str, String str2) {
            super(str, str2);
        }

        public ClasspathOp(String str, String str2, DatabaseOperation databaseOperation) {
            super(str, str2, databaseOperation);
        }
    }

    public class FileOp extends AbstractC22263Op {
        public FileOp(String str) {
            super(str);
        }

        @Override // org.seamless.util.dbunit.DBUnitOperations.AbstractC22263Op
        public InputStream openStream(String str) {
            try {
                return new FileInputStream(str);
            } catch (FileNotFoundException e) {
                iig0.m140070a(e);
                return null;
            }
        }

        public FileOp(String str, String str2) {
            super(str, str2);
        }

        public FileOp(String str, String str2, DatabaseOperation databaseOperation) {
            super(str, str2, databaseOperation);
        }
    }

    /* JADX INFO: renamed from: org.seamless.util.dbunit.DBUnitOperations$Op */
    public static abstract class AbstractC22263Op {
        ReplacementDataSet dataSet;
        DatabaseOperation operation;

        public AbstractC22263Op(String str, String str2, DatabaseOperation databaseOperation) {
            try {
                ReplacementDataSet replacementDataSet = str2 != null ? new ReplacementDataSet(new FlatXmlDataSet(openStream(str), openStream(str2))) : new ReplacementDataSet(new FlatXmlDataSet(openStream(str)));
                this.dataSet = replacementDataSet;
                replacementDataSet.addReplacementObject("[NULL]", (Object) null);
                this.operation = databaseOperation;
            } catch (Exception e) {
                iig0.m140070a(e);
                throw null;
            }
        }

        public void execute(IDatabaseConnection iDatabaseConnection) {
            try {
                this.operation.execute(iDatabaseConnection, this.dataSet);
            } catch (Exception e) {
                iig0.m140070a(e);
            }
        }

        public IDataSet getDataSet() {
            return this.dataSet;
        }

        public DatabaseOperation getOperation() {
            return this.operation;
        }

        public abstract InputStream openStream(String str);

        public AbstractC22263Op(String str, String str2) {
            this(str, str2, DatabaseOperation.CLEAN_INSERT);
        }

        public AbstractC22263Op(String str) {
            this(str, null, DatabaseOperation.CLEAN_INSERT);
        }
    }
}
