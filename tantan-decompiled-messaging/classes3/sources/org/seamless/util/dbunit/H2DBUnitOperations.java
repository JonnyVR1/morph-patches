package org.seamless.util.dbunit;

import l.aag0;
import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.datatype.DataType;
import org.dbunit.dataset.datatype.DataTypeException;
import org.dbunit.dataset.datatype.DefaultDataTypeFactory;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class H2DBUnitOperations extends DBUnitOperations {
    @Override // org.seamless.util.dbunit.DBUnitOperations
    public void disableReferentialIntegrity(IDatabaseConnection iDatabaseConnection) {
        try {
            iDatabaseConnection.getConnection().prepareStatement("set referential_integrity FALSE").execute();
        } catch (Exception e) {
            aag0.a(e);
        }
    }

    @Override // org.seamless.util.dbunit.DBUnitOperations
    public void editConfig(DatabaseConfig databaseConfig) {
        super.editConfig(databaseConfig);
        databaseConfig.setProperty("http://www.dbunit.org/properties/datatypeFactory", new DefaultDataTypeFactory() { // from class: org.seamless.util.dbunit.H2DBUnitOperations.1
            public DataType createDataType(int i, String str) throws DataTypeException {
                return i == 16 ? DataType.BOOLEAN : super.createDataType(i, str);
            }
        });
    }

    @Override // org.seamless.util.dbunit.DBUnitOperations
    public void enableReferentialIntegrity(IDatabaseConnection iDatabaseConnection) {
        try {
            iDatabaseConnection.getConnection().prepareStatement("set referential_integrity TRUE").execute();
        } catch (Exception e) {
            aag0.a(e);
        }
    }
}
