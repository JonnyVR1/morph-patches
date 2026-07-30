package p149l;

import android.database.sqlite.SQLiteProgram;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Ll/s5j;", "Ll/hzg0;", "Landroid/database/sqlite/SQLiteProgram;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteProgram;)V", "", FirebaseAnalytics.Param.INDEX, "", "bindNull", "(I)V", "", "value", "bindLong", "(IJ)V", "", "bindDouble", "(ID)V", "", "bindString", "(ILjava/lang/String;)V", "", "bindBlob", "(I[B)V", "close", "()V", "a", "Landroid/database/sqlite/SQLiteProgram;", "sqlite-framework_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public class s5j implements hzg0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SQLiteProgram delegate;

    public s5j(@NotNull SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.delegate = sQLiteProgram;
    }

    @Override // p149l.hzg0
    public void bindBlob(int index, @NotNull byte[] value) {
        value.getClass();
        this.delegate.bindBlob(index, value);
    }

    @Override // p149l.hzg0
    public void bindDouble(int index, double value) {
        this.delegate.bindDouble(index, value);
    }

    @Override // p149l.hzg0
    public void bindLong(int index, long value) {
        this.delegate.bindLong(index, value);
    }

    @Override // p149l.hzg0
    public void bindNull(int index) {
        this.delegate.bindNull(index);
    }

    @Override // p149l.hzg0
    public void bindString(int index, @NotNull String value) {
        value.getClass();
        this.delegate.bindString(index, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }
}
