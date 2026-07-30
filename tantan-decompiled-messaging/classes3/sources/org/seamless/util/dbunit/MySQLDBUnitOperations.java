package org.seamless.util.dbunit;

import l.aag0;
import org.dbunit.database.IDatabaseConnection;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class MySQLDBUnitOperations extends DBUnitOperations {
    @Override // org.seamless.util.dbunit.DBUnitOperations
    public void disableReferentialIntegrity(IDatabaseConnection iDatabaseConnection) {
        try {
            iDatabaseConnection.getConnection().prepareStatement("set foreign_key_checks=0").execute();
        } catch (Exception e) {
            aag0.a(e);
        }
    }

    @Override // org.seamless.util.dbunit.DBUnitOperations
    public void enableReferentialIntegrity(IDatabaseConnection iDatabaseConnection) {
        try {
            iDatabaseConnection.getConnection().prepareStatement("set foreign_key_checks=1").execute();
        } catch (Exception e) {
            aag0.a(e);
        }
    }
}
