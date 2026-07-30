package p153l;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p122io.CloseableKt;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a/\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Landroidx/room/RoomDatabase;", "db", "Ll/q7h0;", "sqLiteQuery", "", "maybeCopy", "Landroid/os/CancellationSignal;", "signal", "Landroid/database/Cursor;", "b", "(Landroidx/room/RoomDatabase;Ll/q7h0;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;", "Ll/n7h0;", "", "a", "(Ll/n7h0;)V", "Ljava/io/File;", "databaseFile", "", "c", "(Ljava/io/File;)I", "room-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@JvmName
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension
public final class o1c {
    /* JADX INFO: renamed from: a */
    public static final void m165591a(@NotNull n7h0 n7h0Var) {
        n7h0Var.getClass();
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        Cursor cursorQuery = n7h0Var.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        try {
            Cursor cursor = cursorQuery;
            while (cursor.moveToNext()) {
                listCreateListBuilder.add(cursor.getString(0));
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.m88293a(cursorQuery, null);
            for (String str : CollectionsKt.build(listCreateListBuilder)) {
                str.getClass();
                if (C15493d.m94374J(str, "room_fts_content_sync_", false, 2, null)) {
                    n7h0Var.execSQL("DROP TRIGGER IF EXISTS " + str);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m88293a(cursorQuery, th);
                throw th2;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Cursor m165592b(@NotNull RoomDatabase roomDatabase, @NotNull q7h0 q7h0Var, boolean z, @Nullable CancellationSignal cancellationSignal) {
        roomDatabase.getClass();
        q7h0Var.getClass();
        Cursor cursorQuery = roomDatabase.query(q7h0Var, cancellationSignal);
        if (!z || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? xyb.m213604a(cursorQuery) : cursorQuery;
    }

    /* JADX INFO: renamed from: c */
    public static final int m165593c(@NotNull File file) throws IOException {
        file.getClass();
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i = byteBufferAllocate.getInt();
            CloseableKt.m88293a(channel, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m88293a(channel, th);
                throw th2;
            }
        }
    }
}
