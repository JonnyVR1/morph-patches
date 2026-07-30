package com.tantanapp.common.data;

import androidx.annotation.NonNull;
import com.tantanapp.common.data.ValueObject;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CopyObject<D extends ValueObject> extends ValueObject<D> implements Cloneable {
    public static final String FAKE_ID_PREFIX = "fake_id_";
    public long _id;

    /* JADX INFO: renamed from: id */
    @NonNull
    public String f56008id;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DbObject)) {
            return false;
        }
        DbObject dbObject = (DbObject) obj;
        return ValueObject.util_equals(this.f56008id, dbObject.f56011id) && this._id == dbObject._id;
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
        String str = this.f56008id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setCopyId(long j) {
        this._id = j;
    }
}
