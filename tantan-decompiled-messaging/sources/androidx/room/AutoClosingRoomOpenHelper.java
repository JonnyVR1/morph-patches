package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.bzg0;
import p149l.dzg0;
import p149l.etd;
import p149l.ezg0;
import p149l.fzg0;
import p149l.gzg0;
import p149l.izg0;
import p149l.j6f;
import p149l.jzg0;
import p149l.ke1;
import p149l.qkq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003#$\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001f¨\u0006%"}, m87232d2 = {"Landroidx/room/AutoClosingRoomOpenHelper;", "Ll/gzg0;", "Ll/etd;", "delegate", "Ll/ke1;", "autoCloser", "<init>", "(Ll/gzg0;Ll/ke1;)V", "", "enabled", "", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "a", "Ll/gzg0;", "getDelegate", "()Ll/gzg0;", "b", "Ll/ke1;", "Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "c", "Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "autoClosingDb", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Ll/fzg0;", b2s.C_ZONE, "()Ll/fzg0;", "writableDatabase", "W", "readableDatabase", "AutoClosingSupportSQLiteDatabase", "AutoClosingSupportSqliteStatement", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class AutoClosingRoomOpenHelper implements gzg0, etd {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final gzg0 delegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final ke1 autoCloser;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AutoClosingSupportSQLiteDatabase autoClosingDb;

    @Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J)\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010#2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0001H\u0002¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\u00020\b2\u0006\u0010+\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R(\u00107\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010,03j\n\u0012\u0006\u0012\u0004\u0018\u00010,`48\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, m87232d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement;", "Ll/jzg0;", "", "sql", "Ll/ke1;", "autoCloser", "<init>", "(Ljava/lang/String;Ll/ke1;)V", "", "close", "()V", "execute", "", "executeUpdateDelete", "()I", "", "executeInsert", "()J", "simpleQueryForLong", "simpleQueryForString", "()Ljava/lang/String;", FirebaseAnalytics.Param.INDEX, "bindNull", "(I)V", "value", "bindLong", "(IJ)V", "", "bindDouble", "(ID)V", "bindString", "(ILjava/lang/String;)V", "", "bindBlob", "(I[B)V", j6f.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "block", "g", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "supportSQLiteStatement", "e", "(Ll/jzg0;)V", "bindIndex", "", "h", "(ILjava/lang/Object;)V", "a", "Ljava/lang/String;", "b", "Ll/ke1;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "binds", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class AutoClosingSupportSqliteStatement implements jzg0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String sql;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final ke1 autoCloser;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final ArrayList<Object> binds;

        public AutoClosingSupportSqliteStatement(@NotNull String str, @NotNull ke1 ke1Var) {
            str.getClass();
            ke1Var.getClass();
            this.sql = str;
            this.autoCloser = ke1Var;
            this.binds = new ArrayList<>();
        }

        @Override // p149l.hzg0
        public void bindBlob(int index, @NotNull byte[] value) {
            value.getClass();
            m3903h(index, value);
        }

        @Override // p149l.hzg0
        public void bindDouble(int index, double value) {
            m3903h(index, Double.valueOf(value));
        }

        @Override // p149l.hzg0
        public void bindLong(int index, long value) {
            m3903h(index, Long.valueOf(value));
        }

        @Override // p149l.hzg0
        public void bindNull(int index) {
            m3903h(index, null);
        }

        @Override // p149l.hzg0
        public void bindString(int index, @NotNull String value) {
            value.getClass();
            m3903h(index, value);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        /* JADX INFO: renamed from: e */
        public final void m3901e(jzg0 supportSQLiteStatement) {
            Iterator<T> it = this.binds.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Object obj = this.binds.get(i);
                if (obj == null) {
                    supportSQLiteStatement.bindNull(i2);
                } else if (obj instanceof Long) {
                    supportSQLiteStatement.bindLong(i2, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    supportSQLiteStatement.bindDouble(i2, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    supportSQLiteStatement.bindString(i2, (String) obj);
                } else if (obj instanceof byte[]) {
                    supportSQLiteStatement.bindBlob(i2, (byte[]) obj);
                }
                i = i2;
            }
        }

        @Override // p149l.jzg0
        public void execute() {
            m3902g(new Function1<jzg0, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$execute$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull jzg0 jzg0Var) {
                    jzg0Var.getClass();
                    jzg0Var.execute();
                    return null;
                }
            });
        }

        @Override // p149l.jzg0
        public long executeInsert() {
            return ((Number) m3902g(new Function1<jzg0, Long>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeInsert$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Long invoke(@NotNull jzg0 jzg0Var) {
                    jzg0Var.getClass();
                    return Long.valueOf(jzg0Var.executeInsert());
                }
            })).longValue();
        }

        @Override // p149l.jzg0
        public int executeUpdateDelete() {
            return ((Number) m3902g(new Function1<jzg0, Integer>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeUpdateDelete$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Integer invoke(@NotNull jzg0 jzg0Var) {
                    jzg0Var.getClass();
                    return Integer.valueOf(jzg0Var.executeUpdateDelete());
                }
            })).intValue();
        }

        /* JADX INFO: renamed from: g */
        public final <T> T m3902g(final Function1<? super jzg0, ? extends T> block) {
            return (T) this.autoCloser.m145704e(new Function1<fzg0, T>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final T invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    jzg0 jzg0VarCompileStatement = fzg0Var.compileStatement(this.this$0.sql);
                    this.this$0.m3901e(jzg0VarCompileStatement);
                    return block.invoke(jzg0VarCompileStatement);
                }
            });
        }

        /* JADX INFO: renamed from: h */
        public final void m3903h(int bindIndex, Object value) {
            int size;
            int i = bindIndex - 1;
            if (i >= this.binds.size() && (size = this.binds.size()) <= i) {
                while (true) {
                    this.binds.add(null);
                    if (size == i) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.binds.set(i, value);
        }

        @Override // p149l.jzg0
        public long simpleQueryForLong() {
            return ((Number) m3902g(new Function1<jzg0, Long>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForLong$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Long invoke(@NotNull jzg0 jzg0Var) {
                    jzg0Var.getClass();
                    return Long.valueOf(jzg0Var.simpleQueryForLong());
                }
            })).longValue();
        }

        @Override // p149l.jzg0
        @Nullable
        public String simpleQueryForString() {
            return (String) m3902g(new Function1<jzg0, String>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForString$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final String invoke(@NotNull jzg0 jzg0Var) {
                    jzg0Var.getClass();
                    return jzg0Var.simpleQueryForString();
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.room.AutoClosingRoomOpenHelper$a */
    @Metadata(m87231d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\n \n*\u0004\u0018\u00010\u00110\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0017\u001a\u00020\u00072\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u00160\u0016H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001a\u00020\u00072\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u00160\u0016H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0018J \u0010\u001a\u001a\n \n*\u0004\u0018\u00010\u00160\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u001d\u001a(\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00160\u0016 \n*\u0014\u0012\u000e\b\u0001\u0012\n \n*\u0004\u0018\u00010\u00160\u0016\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u0015J\u0018\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\n \n*\u0004\u0018\u00010#0#H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020+2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b.\u0010\u0015J\u0018\u00100\u001a\u00020/2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b0\u00101J \u00102\u001a\n \n*\u0004\u0018\u00010\u00160\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b2\u0010\u001bJ\u0018\u00103\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b3\u0010*J\u0010\u00105\u001a\u000204H\u0096\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u000204H\u0096\u0001¢\u0006\u0004\b7\u00106J\u0010\u00108\u001a\u000204H\u0096\u0001¢\u0006\u0004\b8\u00106J\u0010\u00109\u001a\u000204H\u0096\u0001¢\u0006\u0004\b9\u00106J\u0010\u0010:\u001a\u000204H\u0096\u0001¢\u0006\u0004\b:\u00106J\u0010\u0010;\u001a\u000204H\u0096\u0001¢\u0006\u0004\b;\u00106J\u0018\u0010<\u001a\u0002042\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\u0002042\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b>\u0010=J\u0010\u0010?\u001a\u000204H\u0096\u0001¢\u0006\u0004\b?\u00106J\u0010\u0010@\u001a\u000204H\u0096\u0001¢\u0006\u0004\b@\u00106J\u0010\u0010A\u001a\u000204H\u0096\u0001¢\u0006\u0004\bA\u00106J\u0018\u0010B\u001a\u0002042\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\bB\u0010=J\u0010\u0010C\u001a\u000204H\u0096\u0001¢\u0006\u0004\bC\u00106J \u0010E\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010D0DH\u0096\u0001¢\u0006\u0004\bE\u0010FJ \u0010H\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010G0GH\u0096\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u000204H\u0097\u0001¢\u0006\u0004\bJ\u00106J(\u0010K\u001a\n \n*\u0004\u0018\u00010#0#2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010#0#H\u0096\u0001¢\u0006\u0004\bK\u0010LJ0\u0010O\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010M0M2\u000e\u0010\u000b\u001a\n \n*\u0004\u0018\u00010N0NH\u0096\u0001¢\u0006\u0004\bO\u0010PJ \u0010Q\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010D0DH\u0096\u0001¢\u0006\u0004\bQ\u0010FJ \u0010R\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010G0GH\u0096\u0001¢\u0006\u0004\bR\u0010IJ\u000f\u0010S\u001a\u00020\fH\u0016¢\u0006\u0004\bS\u0010\u0010J%\u0010W\u001a\u00020\f2\u0006\u0010T\u001a\u00020M2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020N0UH\u0017¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020NH\u0017¢\u0006\u0004\bY\u0010ZJ\u0015\u0010[\u001a\b\u0012\u0004\u0012\u00020N0UH\u0017¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\f2\u0006\u0010]\u001a\u00020#H\u0017¢\u0006\u0004\b^\u0010_R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006d"}, m87232d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$a;", "Landroid/database/Cursor;", "delegate", "Ll/ke1;", "autoCloser", "<init>", "(Landroid/database/Cursor;Ll/ke1;)V", "", "p0", "Landroid/database/CharArrayBuffer;", "kotlin.jvm.PlatformType", "p1", "", "copyStringToBuffer", "(ILandroid/database/CharArrayBuffer;)V", "deactivate", "()V", "", "getBlob", "(I)[B", "getColumnCount", "()I", "", "getColumnIndex", "(Ljava/lang/String;)I", "getColumnIndexOrThrow", "getColumnName", "(I)Ljava/lang/String;", "", "getColumnNames", "()[Ljava/lang/String;", "getCount", "", "getDouble", "(I)D", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "", "getFloat", "(I)F", "getInt", "(I)I", "", "getLong", "(I)J", "getPosition", "", "getShort", "(I)S", "getString", "getType", "", "getWantsAllOnMoveCalls", "()Z", "isAfterLast", "isBeforeFirst", "isClosed", "isFirst", "isLast", "isNull", "(I)Z", "move", "moveToFirst", "moveToLast", "moveToNext", "moveToPosition", "moveToPrevious", "Landroid/database/ContentObserver;", "registerContentObserver", "(Landroid/database/ContentObserver;)V", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "(Landroid/database/DataSetObserver;)V", "requery", "respond", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "Landroid/content/ContentResolver;", "Landroid/net/Uri;", "setNotificationUri", "(Landroid/content/ContentResolver;Landroid/net/Uri;)V", "unregisterContentObserver", "unregisterDataSetObserver", "close", "cr", "", "uris", "setNotificationUris", "(Landroid/content/ContentResolver;Ljava/util/List;)V", "getNotificationUri", "()Landroid/net/Uri;", "getNotificationUris", "()Ljava/util/List;", "extras", "setExtras", "(Landroid/os/Bundle;)V", "a", "Landroid/database/Cursor;", "b", "Ll/ke1;", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C0651a implements Cursor {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Cursor delegate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final ke1 autoCloser;

        public C0651a(@NotNull Cursor cursor, @NotNull ke1 ke1Var) {
            cursor.getClass();
            ke1Var.getClass();
            this.delegate = cursor;
            this.autoCloser = ke1Var;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            this.autoCloser.m145703d();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int p0, CharArrayBuffer p1) {
            this.delegate.copyStringToBuffer(p0, p1);
        }

        @Override // android.database.Cursor
        @Deprecated
        public void deactivate() {
            this.delegate.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int p0) {
            return this.delegate.getBlob(p0);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String p0) {
            return this.delegate.getColumnIndex(p0);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String p0) {
            return this.delegate.getColumnIndexOrThrow(p0);
        }

        @Override // android.database.Cursor
        public String getColumnName(int p0) {
            return this.delegate.getColumnName(p0);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.delegate.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int p0) {
            return this.delegate.getDouble(p0);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.delegate.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int p0) {
            return this.delegate.getFloat(p0);
        }

        @Override // android.database.Cursor
        public int getInt(int p0) {
            return this.delegate.getInt(p0);
        }

        @Override // android.database.Cursor
        public long getLong(int p0) {
            return this.delegate.getLong(p0);
        }

        @Override // android.database.Cursor
        @RequiresApi(api = 19)
        @NotNull
        public Uri getNotificationUri() {
            return bzg0.m104619a(this.delegate);
        }

        @Override // android.database.Cursor
        @RequiresApi(api = 29)
        @NotNull
        public List<Uri> getNotificationUris() {
            return ezg0.m118979a(this.delegate);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.delegate.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int p0) {
            return this.delegate.getShort(p0);
        }

        @Override // android.database.Cursor
        public String getString(int p0) {
            return this.delegate.getString(p0);
        }

        @Override // android.database.Cursor
        public int getType(int p0) {
            return this.delegate.getType(p0);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.delegate.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.delegate.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.delegate.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.delegate.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.delegate.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.delegate.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int p0) {
            return this.delegate.isNull(p0);
        }

        @Override // android.database.Cursor
        public boolean move(int p0) {
            return this.delegate.move(p0);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.delegate.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.delegate.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.delegate.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int p0) {
            return this.delegate.moveToPosition(p0);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.delegate.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver p0) {
            this.delegate.registerContentObserver(p0);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver p0) {
            this.delegate.registerDataSetObserver(p0);
        }

        @Override // android.database.Cursor
        @Deprecated
        public boolean requery() {
            return this.delegate.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle p0) {
            return this.delegate.respond(p0);
        }

        @Override // android.database.Cursor
        @RequiresApi(api = 23)
        public void setExtras(@NotNull Bundle extras) {
            extras.getClass();
            dzg0.m114118a(this.delegate, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver p0, Uri p1) {
            this.delegate.setNotificationUri(p0, p1);
        }

        @Override // android.database.Cursor
        @RequiresApi(api = 29)
        public void setNotificationUris(@NotNull ContentResolver cr, @NotNull List<? extends Uri> uris) {
            cr.getClass();
            uris.getClass();
            ezg0.m118980b(this.delegate, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver p0) {
            this.delegate.unregisterContentObserver(p0);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver p0) {
            this.delegate.unregisterDataSetObserver(p0);
        }
    }

    public AutoClosingRoomOpenHelper(@NotNull gzg0 gzg0Var, @NotNull ke1 ke1Var) {
        gzg0Var.getClass();
        ke1Var.getClass();
        this.delegate = gzg0Var;
        this.autoCloser = ke1Var;
        ke1Var.m145708i(getDelegate());
        this.autoClosingDb = new AutoClosingSupportSQLiteDatabase(ke1Var);
    }

    @Override // p149l.gzg0
    @RequiresApi(api = 24)
    @NotNull
    /* JADX INFO: renamed from: C */
    public fzg0 mo3891C() {
        this.autoClosingDb.m3898k();
        return this.autoClosingDb;
    }

    @Override // p149l.gzg0
    @RequiresApi(api = 24)
    @NotNull
    /* JADX INFO: renamed from: W */
    public fzg0 mo3892W() {
        this.autoClosingDb.m3898k();
        return this.autoClosingDb;
    }

    @Override // p149l.gzg0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.autoClosingDb.close();
    }

    @Override // p149l.gzg0
    @Nullable
    /* JADX INFO: renamed from: getDatabaseName */
    public String getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String() {
        return this.delegate.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String();
    }

    @Override // p149l.etd
    @NotNull
    public gzg0 getDelegate() {
        return this.delegate;
    }

    @Override // p149l.gzg0
    @RequiresApi(api = 16)
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        this.delegate.setWriteAheadLoggingEnabled(enabled);
    }

    @Metadata(m87231d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010 H\u0017¢\u0006\u0004\b\"\u0010#J'\u0010)\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\t2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J5\u0010/\u001a\u00020%2\u0006\u0010$\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\t2\u0012\u0010.\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010-\u0018\u00010,H\u0016¢\u0006\u0004\b/\u00100JE\u00101\u001a\u00020%2\u0006\u0010$\u001a\u00020\t2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010\t2\u0012\u0010.\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010-\u0018\u00010,H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b3\u00104J)\u00103\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0010\u00105\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010-0,H\u0016¢\u0006\u0004\b3\u00106J\u0017\u00108\u001a\u00020\u00122\u0006\u00107\u001a\u00020%H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00062\u0006\u0010>\u001a\u00020%H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0012H\u0017¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0006H\u0016¢\u0006\u0004\bD\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0014R$\u0010H\u001a\u00020%2\u0006\u0010H\u001a\u00020%8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010@R\u0014\u0010N\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR$\u0010R\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bO\u0010M\"\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\u0014R\u0014\u0010T\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010\u0014R\u0016\u0010W\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u0014R(\u0010]\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0Z\u0018\u00010Y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010\u0014¨\u0006_"}, m87232d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "Ll/fzg0;", "Ll/ke1;", "autoCloser", "<init>", "(Ll/ke1;)V", "", "k", "()V", "", "sql", "Ll/jzg0;", "compileStatement", "(Ljava/lang/String;)Ll/jzg0;", "beginTransaction", "beginTransactionNonExclusive", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "()Z", "yieldIfContendedSafely", "", "numBytes", "setMaximumSize", "(J)J", BLivePkInviteSource.query, "Landroid/database/Cursor;", "(Ljava/lang/String;)Landroid/database/Cursor;", "Ll/izg0;", "E", "(Ll/izg0;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "b0", "(Ll/izg0;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "D", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "whereClause", "", "", "whereArgs", "f", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", j6f.GPS_MEASUREMENT_INTERRUPTED, "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "(Ljava/lang/String;)V", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)V", "newVersion", "needUpgrade", "(I)Z", "Ljava/util/Locale;", "locale", "setLocale", "(Ljava/util/Locale;)V", "cacheSize", "setMaxSqlCacheSize", "(I)V", "enabled", "setForeignKeyConstraintsEnabled", "(Z)V", "close", "a", "Ll/ke1;", "isDbLockedByCurrentThread", WBConstants.AUTH_PARAMS_VERSION, "getVersion", "()I", "setVersion", "getMaximumSize", "()J", "maximumSize", "getPageSize", "setPageSize", "(J)V", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", "path", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk", "room-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class AutoClosingSupportSQLiteDatabase implements fzg0 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final ke1 autoCloser;

        public AutoClosingSupportSQLiteDatabase(@NotNull ke1 ke1Var) {
            ke1Var.getClass();
            this.autoCloser = ke1Var;
        }

        @Override // p149l.fzg0
        /* JADX INFO: renamed from: D */
        public long mo3893D(@NotNull final String table, final int conflictAlgorithm, @NotNull final ContentValues values) throws SQLException {
            table.getClass();
            values.getClass();
            return ((Number) this.autoCloser.m145704e(new Function1<fzg0, Long>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$insert$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Long invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    return Long.valueOf(fzg0Var.mo3893D(table, conflictAlgorithm, values));
                }
            })).longValue();
        }

        @Override // p149l.fzg0
        @NotNull
        /* JADX INFO: renamed from: E */
        public Cursor mo3894E(@NotNull izg0 query) {
            query.getClass();
            try {
                return new C0651a(this.autoCloser.m145707h().mo3894E(query), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.m145703d();
                throw th;
            }
        }

        @Override // p149l.fzg0
        /* JADX INFO: renamed from: V */
        public int mo3895V(@NotNull final String table, final int conflictAlgorithm, @NotNull final ContentValues values, @Nullable final String whereClause, @Nullable final Object[] whereArgs) {
            table.getClass();
            values.getClass();
            return ((Number) this.autoCloser.m145704e(new Function1<fzg0, Integer>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$update$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Integer invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    return Integer.valueOf(fzg0Var.mo3895V(table, conflictAlgorithm, values, whereClause, whereArgs));
                }
            })).intValue();
        }

        @Override // p149l.fzg0
        @RequiresApi(api = 24)
        @NotNull
        /* JADX INFO: renamed from: b0 */
        public Cursor mo3896b0(@NotNull izg0 query, @Nullable CancellationSignal cancellationSignal) {
            query.getClass();
            try {
                return new C0651a(this.autoCloser.m145707h().mo3896b0(query, cancellationSignal), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.m145703d();
                throw th;
            }
        }

        @Override // p149l.fzg0
        public void beginTransaction() {
            try {
                this.autoCloser.m145707h().beginTransaction();
            } catch (Throwable th) {
                this.autoCloser.m145703d();
                throw th;
            }
        }

        @Override // p149l.fzg0
        public void beginTransactionNonExclusive() {
            try {
                this.autoCloser.m145707h().beginTransactionNonExclusive();
            } catch (Throwable th) {
                this.autoCloser.m145703d();
                throw th;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.autoCloser.m145702c();
        }

        @Override // p149l.fzg0
        @NotNull
        public jzg0 compileStatement(@NotNull String sql) {
            sql.getClass();
            return new AutoClosingSupportSqliteStatement(sql, this.autoCloser);
        }

        @Override // p149l.fzg0
        public void endTransaction() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                qkq0.m175383a("End transaction called but delegateDb is null");
                return;
            }
            try {
                fzg0 delegateDatabase = this.autoCloser.getDelegateDatabase();
                delegateDatabase.getClass();
                delegateDatabase.endTransaction();
            } finally {
                this.autoCloser.m145703d();
            }
        }

        @Override // p149l.fzg0
        public void execSQL(@NotNull final String sql, @NotNull final Object[] bindArgs) throws SQLException {
            sql.getClass();
            bindArgs.getClass();
            this.autoCloser.m145704e(new Function1<fzg0, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    fzg0Var.execSQL(sql, bindArgs);
                    return null;
                }
            });
        }

        @Override // p149l.fzg0
        /* JADX INFO: renamed from: f */
        public int mo3897f(@NotNull final String table, @Nullable final String whereClause, @Nullable final Object[] whereArgs) {
            table.getClass();
            return ((Number) this.autoCloser.m145704e(new Function1<fzg0, Integer>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$delete$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Integer invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    return Integer.valueOf(fzg0Var.mo3897f(table, whereClause, whereArgs));
                }
            })).intValue();
        }

        @Override // p149l.fzg0
        @Nullable
        public List<Pair<String, String>> getAttachedDbs() {
            return (List) this.autoCloser.m145704e(new Function1<fzg0, List<? extends Pair<String, String>>>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final List<Pair<String, String>> invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    return fzg0Var.getAttachedDbs();
                }
            });
        }

        @Override // p149l.fzg0
        public long getMaximumSize() {
            return ((Number) this.autoCloser.m145704e(new PropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1, kotlin.reflect.KProperty1
                @Nullable
                public Object get(@Nullable Object obj) {
                    return Long.valueOf(((fzg0) obj).getMaximumSize());
                }
            })).longValue();
        }

        @Override // p149l.fzg0
        public long getPageSize() {
            return ((Number) this.autoCloser.m145704e(new MutablePropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
                @Nullable
                public Object get(@Nullable Object obj) {
                    return Long.valueOf(((fzg0) obj).getPageSize());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
                public void set(@Nullable Object obj, @Nullable Object obj2) {
                    ((fzg0) obj).setPageSize(((Number) obj2).longValue());
                }
            })).longValue();
        }

        @Override // p149l.fzg0
        @Nullable
        public String getPath() {
            return (String) this.autoCloser.m145704e(new Function1<fzg0, String>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final String invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    return fzg0Var.getPath();
                }
            });
        }

        @Override // p149l.fzg0
        public int getVersion() {
            return ((Number) this.autoCloser.m145704e(new MutablePropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KProperty1
                @Nullable
                public Object get(@Nullable Object obj) {
                    return Integer.valueOf(((fzg0) obj).getVersion());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.KMutableProperty1
                public void set(@Nullable Object obj, @Nullable Object obj2) {
                    ((fzg0) obj).setVersion(((Number) obj2).intValue());
                }
            })).intValue();
        }

        @Override // p149l.fzg0
        public boolean inTransaction() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.m145704e(C0624x5693171d.INSTANCE)).booleanValue();
        }

        @Override // p149l.fzg0
        public boolean isDatabaseIntegrityOk() {
            return ((Boolean) this.autoCloser.m145704e(new Function1<fzg0, Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDatabaseIntegrityOk$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    return Boolean.valueOf(fzg0Var.isDatabaseIntegrityOk());
                }
            })).booleanValue();
        }

        @Override // p149l.fzg0
        public boolean isDbLockedByCurrentThread() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.m145704e(new PropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDbLockedByCurrentThread$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1, kotlin.reflect.KProperty1
                @Nullable
                public Object get(@Nullable Object obj) {
                    return Boolean.valueOf(((fzg0) obj).isDbLockedByCurrentThread());
                }
            })).booleanValue();
        }

        @Override // p149l.fzg0
        public boolean isOpen() {
            fzg0 delegateDatabase = this.autoCloser.getDelegateDatabase();
            if (delegateDatabase == null) {
                return false;
            }
            return delegateDatabase.isOpen();
        }

        @Override // p149l.fzg0
        public boolean isReadOnly() {
            return ((Boolean) this.autoCloser.m145704e(new Function1<fzg0, Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    return Boolean.valueOf(fzg0Var.isReadOnly());
                }
            })).booleanValue();
        }

        @Override // p149l.fzg0
        @RequiresApi(api = 16)
        public boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.autoCloser.m145704e(new Function1<fzg0, Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1
                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    return Boolean.valueOf(fzg0Var.isWriteAheadLoggingEnabled());
                }
            })).booleanValue();
        }

        /* JADX INFO: renamed from: k */
        public final void m3898k() {
            this.autoCloser.m145704e(new Function1<fzg0, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pokeOpen$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    return null;
                }
            });
        }

        @Override // p149l.fzg0
        public boolean needUpgrade(final int newVersion) {
            return ((Boolean) this.autoCloser.m145704e(new Function1<fzg0, Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$needUpgrade$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    return Boolean.valueOf(fzg0Var.needUpgrade(newVersion));
                }
            })).booleanValue();
        }

        @Override // p149l.fzg0
        @NotNull
        public Cursor query(@NotNull String query) {
            query.getClass();
            try {
                return new C0651a(this.autoCloser.m145707h().query(query), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.m145703d();
                throw th;
            }
        }

        @Override // p149l.fzg0
        @RequiresApi(api = 16)
        public void setForeignKeyConstraintsEnabled(final boolean enabled) {
            this.autoCloser.m145704e(new Function1<fzg0, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setForeignKeyConstraintsEnabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    fzg0Var.setForeignKeyConstraintsEnabled(enabled);
                    return null;
                }
            });
        }

        @Override // p149l.fzg0
        public void setLocale(@NotNull final Locale locale) {
            locale.getClass();
            this.autoCloser.m145704e(new Function1<fzg0, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setLocale$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    fzg0Var.setLocale(locale);
                    return null;
                }
            });
        }

        @Override // p149l.fzg0
        public void setMaxSqlCacheSize(final int cacheSize) {
            this.autoCloser.m145704e(new Function1<fzg0, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaxSqlCacheSize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    fzg0Var.setMaxSqlCacheSize(cacheSize);
                    return null;
                }
            });
        }

        @Override // p149l.fzg0
        public long setMaximumSize(final long numBytes) {
            return ((Number) this.autoCloser.m145704e(new Function1<fzg0, Long>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaximumSize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Long invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    return Long.valueOf(fzg0Var.setMaximumSize(numBytes));
                }
            })).longValue();
        }

        @Override // p149l.fzg0
        public void setPageSize(final long j) {
            this.autoCloser.m145704e(new Function1<fzg0, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    fzg0Var.setPageSize(j);
                    return null;
                }
            });
        }

        @Override // p149l.fzg0
        public void setTransactionSuccessful() {
            Unit unit;
            fzg0 delegateDatabase = this.autoCloser.getDelegateDatabase();
            if (delegateDatabase != null) {
                delegateDatabase.setTransactionSuccessful();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
            qkq0.m175383a("setTransactionSuccessful called but delegateDb is null");
        }

        @Override // p149l.fzg0
        public void setVersion(final int i) {
            this.autoCloser.m145704e(new Function1<fzg0, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    fzg0Var.setVersion(i);
                    return null;
                }
            });
        }

        @Override // p149l.fzg0
        public boolean yieldIfContendedSafely() {
            return ((Boolean) this.autoCloser.m145704e(C0643x2da6dfee.INSTANCE)).booleanValue();
        }

        @Override // p149l.fzg0
        public void execSQL(@NotNull final String sql) throws SQLException {
            sql.getClass();
            this.autoCloser.m145704e(new Function1<fzg0, Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Object invoke(@NotNull fzg0 fzg0Var) {
                    fzg0Var.getClass();
                    fzg0Var.execSQL(sql);
                    return null;
                }
            });
        }
    }
}
