package p153l;

import android.content.ContentValues;
import android.database.Cursor;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import com.tantanapp.common.data.orm.SqlSegment;

/* JADX INFO: loaded from: classes12.dex */
public abstract class vzf0<T> {
    protected int readIndex = 0;

    public String CREATE_INDEX(wzh0 wzh0Var, Index index) {
        Filter filter = index.where;
        return SqlSegment.concat(jyb.m147507f0(new SqlSegment("CREATE INDEX IF NOT EXISTS " + wzh0Var.f191760d + "_" + jyb.m147491V(index.columns, "_") + " ON " + wzh0Var.f191760d + "(" + jyb.m147491V(index.columns, Constants.SEPARATOR_COMMA) + ")", null), filter == null ? SqlSegment.NULL : filter.emit()), " WHERE ").part;
    }

    public String CREATE_TABLE(wzh0 wzh0Var) {
        return null;
    }

    public abstract Class getDataClass();

    public int getReadIndex() {
        return this.readIndex;
    }

    public abstract T init();

    public abstract T read(Cursor cursor, int i);

    public abstract void write(T t, ContentValues contentValues);
}
