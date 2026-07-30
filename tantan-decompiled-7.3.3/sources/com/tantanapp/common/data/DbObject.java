package com.tantanapp.common.data;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.DatabaseStore;
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.StringColumn;

/* JADX INFO: loaded from: classes11.dex */
public abstract class DbObject<D extends ValueObject> extends ValueObject<D> implements Cloneable {
    public static final boolean DETAILED_LOG_READ_WRITE;
    public static final String FAKE_ID_PREFIX = "fake_id_";
    public static final String FAKE_ID_PRIVATE_QUESTION_PREFIX = "fake_private_question_id_";

    /* JADX INFO: renamed from: ID */
    public static final StringColumn f56857ID = new StringColumn<DbObject>("id_c") { // from class: com.tantanapp.common.data.DbObject.1
        @Override // com.tantanapp.common.data.orm.Column
        public String get(DbObject dbObject) {
            return dbObject.f56859id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(DbObject dbObject, String str) {
            dbObject.f56859id = str;
        }
    };
    public static final LongColumn<DbObject> _ID = new LongColumn<DbObject>("_id") { // from class: com.tantanapp.common.data.DbObject.2
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(DbObject dbObject) {
            return Long.valueOf(dbObject._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(DbObject dbObject, Long l2) {
            dbObject._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: i */
    static int f56858i;
    public long _id;

    /* JADX INFO: renamed from: id */
    @NonNull
    public String f56859id;

    static {
        boolean z = DatabaseStore.DETAILED_LOGGING;
        DETAILED_LOG_READ_WRITE = false;
    }

    public static String GENERATE_UNIQUE_FAKE_ID(int i) {
        StringBuilder sb = new StringBuilder("fake_id_");
        sb.append(i);
        sb.append(System.nanoTime());
        int i2 = f56858i;
        f56858i = i2 + 1;
        sb.append(i2);
        return sb.toString();
    }

    public static void cvPut(ContentValues contentValues, String str, Boolean bool) {
        if (bool == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
    }

    public static void logSqlite(long j, String str) {
        long j2 = j / 1000000;
        String name = Thread.currentThread().getName();
        if (DETAILED_LOG_READ_WRITE) {
            if (j2 > 0 && j2 > 10) {
                name.equals(BLiveTraceServerLocation.main);
                return;
            }
            return;
        }
        if (j2 < 10 || !name.equals(BLiveTraceServerLocation.main)) {
            return;
        }
        boolean z = DatabaseStore.DETAILED_LOGGING;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DbObject)) {
            return false;
        }
        DbObject dbObject = (DbObject) obj;
        return ValueObject.util_equals(this.f56859id, dbObject.f56859id) && this._id == dbObject._id;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public long getCopyId() {
        return this._id;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean hasCopyId() {
        return true;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        long j = this._id;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.f56859id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setCopyId(long j) {
        this._id = j;
    }

    public static void cvPut(ContentValues contentValues, String str, String str2) {
        if (str2 == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, str2);
        }
    }

    public static void cvPut(ContentValues contentValues, String str, Byte b) {
        if (b == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, b);
        }
    }

    public static void cvPut(ContentValues contentValues, String str, byte[] bArr) {
        if (bArr == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, bArr);
        }
    }

    public static void cvPut(ContentValues contentValues, String str, Double d) {
        if (d == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, d);
        }
    }

    public static void cvPut(ContentValues contentValues, String str, Float f) {
        if (f == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, f);
        }
    }

    public static void cvPut(ContentValues contentValues, String str, Integer num) {
        if (num == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, num);
        }
    }

    public static void cvPut(ContentValues contentValues, String str, Long l2) {
        if (l2 == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, l2);
        }
    }

    public static void cvPut(ContentValues contentValues, String str, Short sh) {
        if (sh == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, sh);
        }
    }
}
