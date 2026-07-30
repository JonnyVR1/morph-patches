package p149l;

import android.content.ContentValues;
import android.database.Cursor;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import com.tantanapp.common.data.orm.SqlSegment;

/* JADX INFO: loaded from: classes12.dex */
public abstract class mrf0<T> {
    protected int readIndex = 0;

    public String CREATE_INDEX(orh0 orh0Var, Index index) {
        Filter filter = index.where;
        return SqlSegment.concat(vwb.m200324f0(new SqlSegment("CREATE INDEX IF NOT EXISTS " + orh0Var.f145283d + "_" + vwb.m200308V(index.columns, "_") + " ON " + orh0Var.f145283d + "(" + vwb.m200308V(index.columns, Constants.SEPARATOR_COMMA) + ")", null), filter == null ? SqlSegment.NULL : filter.emit()), " WHERE ").part;
    }

    public String CREATE_TABLE(orh0 orh0Var) {
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
