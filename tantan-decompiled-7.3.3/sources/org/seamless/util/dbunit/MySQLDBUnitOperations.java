package org.seamless.util.dbunit;

import org.dbunit.database.IDatabaseConnection;
import p153l.iig0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MySQLDBUnitOperations extends DBUnitOperations {
    @Override // org.seamless.util.dbunit.DBUnitOperations
    public void disableReferentialIntegrity(IDatabaseConnection iDatabaseConnection) {
        try {
            iDatabaseConnection.getConnection().prepareStatement("set foreign_key_checks=0").execute();
        } catch (Exception e) {
            iig0.m140070a(e);
        }
    }

    @Override // org.seamless.util.dbunit.DBUnitOperations
    public void enableReferentialIntegrity(IDatabaseConnection iDatabaseConnection) {
        try {
            iDatabaseConnection.getConnection().prepareStatement("set foreign_key_checks=1").execute();
        } catch (Exception e) {
            iig0.m140070a(e);
        }
    }
}
