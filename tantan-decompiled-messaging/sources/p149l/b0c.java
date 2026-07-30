package p149l;

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
import kotlin.p118io.CloseableKt;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a/\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Landroidx/room/RoomDatabase;", "db", "Ll/izg0;", "sqLiteQuery", "", "maybeCopy", "Landroid/os/CancellationSignal;", "signal", "Landroid/database/Cursor;", "b", "(Landroidx/room/RoomDatabase;Ll/izg0;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;", "Ll/fzg0;", "", "a", "(Ll/fzg0;)V", "Ljava/io/File;", "databaseFile", "", "c", "(Ljava/io/File;)I", "room-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@JvmName
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension
public final class b0c {
    /* JADX INFO: renamed from: a */
    public static final void m99745a(@NotNull fzg0 fzg0Var) {
        fzg0Var.getClass();
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        Cursor cursorQuery = fzg0Var.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        try {
            Cursor cursor = cursorQuery;
            while (cursor.moveToNext()) {
                listCreateListBuilder.add(cursor.getString(0));
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.m87404a(cursorQuery, null);
            for (String str : CollectionsKt.build(listCreateListBuilder)) {
                str.getClass();
                if (C15386d.m93483J(str, "room_fts_content_sync_", false, 2, null)) {
                    fzg0Var.execSQL("DROP TRIGGER IF EXISTS " + str);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m87404a(cursorQuery, th);
                throw th2;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Cursor m99746b(@NotNull RoomDatabase roomDatabase, @NotNull izg0 izg0Var, boolean z, @Nullable CancellationSignal cancellationSignal) {
        roomDatabase.getClass();
        izg0Var.getClass();
        Cursor cursorQuery = roomDatabase.query(izg0Var, cancellationSignal);
        if (!z || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? jxb.m143761a(cursorQuery) : cursorQuery;
    }

    /* JADX INFO: renamed from: c */
    public static final int m99747c(@NotNull File file) throws IOException {
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
            CloseableKt.m87404a(channel, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m87404a(channel, th);
                throw th2;
            }
        }
    }
}
