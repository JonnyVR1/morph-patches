package androidx.room;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p122io.CloseableKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.n7h0;
import p153l.o7h0;
import p153l.qg50;
import p153l.rid0;
import p153l.ua00;
import p153l.uid0;
import p153l.vpf0;

/* JADX INFO: renamed from: androidx.room.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0017\u0018\u0000 \u001f2\u00020\u0001:\u0003 \u000e\u001cB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u000fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e¨\u0006!"}, m88121d2 = {"Landroidx/room/i;", "Ll/o7h0$a;", "Landroidx/room/b;", "configuration", "Landroidx/room/i$b;", "delegate", "", "identityHash", "legacyHash", "<init>", "(Landroidx/room/b;Landroidx/room/i$b;Ljava/lang/String;Ljava/lang/String;)V", "Ll/n7h0;", "db", "", "b", "(Ll/n7h0;)V", Constants.INAPP_DATA_TAG, "", "oldVersion", "newVersion", "g", "(Ll/n7h0;II)V", "e", "f", "h", "j", RXScreenCaptureService.KEY_INDEX, "Landroidx/room/b;", "c", "Landroidx/room/i$b;", "Ljava/lang/String;", "Companion", "a", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension
public class C0674i extends o7h0.AbstractC19043a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public C0667b configuration;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final b delegate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String identityHash;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String legacyHash;

    /* JADX INFO: renamed from: androidx.room.i$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m88121d2 = {"Landroidx/room/i$a;", "", "<init>", "()V", "Ll/n7h0;", "db", "", "b", "(Ll/n7h0;)Z", "a", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m4005a(@NotNull n7h0 db) {
            db.getClass();
            Cursor cursorQuery = db.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                Cursor cursor = cursorQuery;
                boolean z = false;
                if (cursor.moveToFirst() && cursor.getInt(0) == 0) {
                    z = true;
                }
                CloseableKt.m88293a(cursorQuery, null);
                return z;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m88293a(cursorQuery, th);
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final boolean m4006b(@NotNull n7h0 db) {
            db.getClass();
            Cursor cursorQuery = db.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                Cursor cursor = cursorQuery;
                boolean z = false;
                if (cursor.moveToFirst() && cursor.getInt(0) != 0) {
                    z = true;
                }
                CloseableKt.m88293a(cursorQuery, null);
                return z;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m88293a(cursorQuery, th);
                    throw th2;
                }
            }
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.room.i$b */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Landroidx/room/i$b;", "", "", WBConstants.AUTH_PARAMS_VERSION, "<init>", "(I)V", "Ll/n7h0;", "db", "", "b", "(Ll/n7h0;)V", "a", Constants.INAPP_DATA_TAG, "c", "Landroidx/room/i$c;", "g", "(Ll/n7h0;)Landroidx/room/i$c;", "f", "e", "I", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        public final int version;

        public b(int i) {
            this.version = i;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo4007a(@NotNull n7h0 db);

        /* JADX INFO: renamed from: b */
        public abstract void mo4008b(@NotNull n7h0 db);

        /* JADX INFO: renamed from: c */
        public abstract void mo4009c(@NotNull n7h0 db);

        /* JADX INFO: renamed from: d */
        public abstract void mo4010d(@NotNull n7h0 db);

        /* JADX INFO: renamed from: e */
        public abstract void mo4011e(@NotNull n7h0 db);

        /* JADX INFO: renamed from: f */
        public abstract void mo4012f(@NotNull n7h0 db);

        @NotNull
        /* JADX INFO: renamed from: g */
        public abstract c mo4013g(@NotNull n7h0 db);
    }

    /* JADX INFO: renamed from: androidx.room.i$c */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Landroidx/room/i$c;", "", "", "isValid", "", "expectedFoundMsg", "<init>", "(ZLjava/lang/String;)V", "a", "Z", "b", "Ljava/lang/String;", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        public final boolean isValid;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final String expectedFoundMsg;

        public c(boolean z, @Nullable String str) {
            this.isValid = z;
            this.expectedFoundMsg = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0674i(@NotNull C0667b c0667b, @NotNull b bVar, @NotNull String str, @NotNull String str2) {
        super(bVar.version);
        c0667b.getClass();
        bVar.getClass();
        str.getClass();
        str2.getClass();
        this.configuration = c0667b;
        this.delegate = bVar;
        this.identityHash = str;
        this.legacyHash = str2;
    }

    @Override // p153l.o7h0.AbstractC19043a
    /* JADX INFO: renamed from: b */
    public void mo3997b(@NotNull n7h0 db) {
        db.getClass();
        super.mo3997b(db);
    }

    @Override // p153l.o7h0.AbstractC19043a
    /* JADX INFO: renamed from: d */
    public void mo3998d(@NotNull n7h0 db) {
        db.getClass();
        boolean zM4005a = INSTANCE.m4005a(db);
        this.delegate.mo4007a(db);
        if (!zM4005a) {
            c cVarMo4013g = this.delegate.mo4013g(db);
            if (!cVarMo4013g.isValid) {
                qg50.m176437a("Pre-packaged database has an invalid schema: ", cVarMo4013g.expectedFoundMsg);
                return;
            }
        }
        m4004j(db);
        this.delegate.mo4009c(db);
    }

    @Override // p153l.o7h0.AbstractC19043a
    /* JADX INFO: renamed from: e */
    public void mo3999e(@NotNull n7h0 db, int oldVersion, int newVersion) {
        db.getClass();
        mo4001g(db, oldVersion, newVersion);
    }

    @Override // p153l.o7h0.AbstractC19043a
    /* JADX INFO: renamed from: f */
    public void mo4000f(@NotNull n7h0 db) {
        db.getClass();
        super.mo4000f(db);
        m4002h(db);
        this.delegate.mo4010d(db);
        this.configuration = null;
    }

    @Override // p153l.o7h0.AbstractC19043a
    /* JADX INFO: renamed from: g */
    public void mo4001g(@NotNull n7h0 db, int oldVersion, int newVersion) {
        List<ua00> listM3926d;
        db.getClass();
        C0667b c0667b = this.configuration;
        if (c0667b != null && (listM3926d = c0667b.migrationContainer.m3926d(oldVersion, newVersion)) != null) {
            this.delegate.mo4012f(db);
            Iterator<T> it = listM3926d.iterator();
            while (it.hasNext()) {
                ((ua00) it.next()).mo96672a(db);
            }
            c cVarMo4013g = this.delegate.mo4013g(db);
            if (!cVarMo4013g.isValid) {
                qg50.m176437a("Migration didn't properly handle: ", cVarMo4013g.expectedFoundMsg);
                return;
            } else {
                this.delegate.mo4011e(db);
                m4004j(db);
                return;
            }
        }
        C0667b c0667b2 = this.configuration;
        if (c0667b2 != null && !c0667b2.m3940a(oldVersion, newVersion)) {
            this.delegate.mo4008b(db);
            this.delegate.mo4007a(db);
            return;
        }
        throw new IllegalStateException("A migration from " + oldVersion + " to " + newVersion + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    /* JADX INFO: renamed from: h */
    public final void m4002h(n7h0 db) {
        if (!INSTANCE.m4006b(db)) {
            c cVarMo4013g = this.delegate.mo4013g(db);
            if (!cVarMo4013g.isValid) {
                qg50.m176437a("Pre-packaged database has an invalid schema: ", cVarMo4013g.expectedFoundMsg);
                return;
            } else {
                this.delegate.mo4011e(db);
                m4004j(db);
                return;
            }
        }
        Cursor cursorMo3895E = db.mo3895E(new vpf0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            Cursor cursor = cursorMo3895E;
            String string = cursor.moveToFirst() ? cursor.getString(0) : null;
            CloseableKt.m88293a(cursorMo3895E, null);
            if (Intrinsics.m88377d(this.identityHash, string) || Intrinsics.m88377d(this.legacyHash, string)) {
                return;
            }
            uid0.m196153a("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ", this.identityHash, ", found: ", string);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m88293a(cursorMo3895E, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4003i(n7h0 db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* JADX INFO: renamed from: j */
    public final void m4004j(n7h0 db) {
        m4003i(db);
        db.execSQL(rid0.m181595a(this.identityHash));
    }
}
