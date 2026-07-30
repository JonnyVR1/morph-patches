package org.greenrobot.greendao;

import android.database.SQLException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class DaoException extends SQLException {
    private static final long serialVersionUID = -5877937327907457779L;

    public DaoException(String str, Throwable th) {
        super(str);
        safeInitCause(th);
    }

    public void safeInitCause(Throwable th) {
        try {
            initCause(th);
        } catch (Throwable th2) {
            DaoLog.m9559e("Could not set initial cause", th2);
            DaoLog.m9559e("Initial cause is:", th);
        }
    }

    public DaoException(String str) {
        super(str);
    }

    public DaoException() {
    }

    public DaoException(Throwable th) {
        safeInitCause(th);
    }
}
