package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.x520;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJM\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ;\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$¨\u0006'"}, m87232d2 = {"Lcom/facebook/FacebookContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "Landroid/net/Uri;", "uri", "Landroid/util/Pair;", "Ljava/util/UUID;", "", "parseCallIdAndAttachmentName", "(Landroid/net/Uri;)Landroid/util/Pair;", "", "onCreate", "()Z", "", "strings", BLiveStormDanmakuGiftResourceType.f44446s, "strings2", "s2", "Landroid/database/Cursor;", BLivePkInviteSource.query, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "(Landroid/net/Uri;)Ljava/lang/String;", "Landroid/content/ContentValues;", "contentValues", "insert", "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;", "", RequestParameters.SUBRESOURCE_DELETE, "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "mode", "Landroid/os/ParcelFileDescriptor;", "openFile", "(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;", "Companion", "a", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class FacebookContentProvider extends ContentProvider {

    @NotNull
    private static final String ATTACHMENT_URL_BASE = "content://com.facebook.app.FacebookContentProvider";

    @NotNull
    private static final String INVALID_FILE_NAME = "..";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = FacebookContentProvider.class.getName();

    /* JADX INFO: renamed from: com.facebook.FacebookContentProvider$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, m87232d2 = {"Lcom/facebook/FacebookContentProvider$a;", "", "<init>", "()V", "", "applicationId", "Ljava/util/UUID;", "callId", "attachmentName", "a", "(Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)Ljava/lang/String;", "ATTACHMENT_URL_BASE", "Ljava/lang/String;", "INVALID_FILE_NAME", "kotlin.jvm.PlatformType", "TAG", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m7492a(@Nullable String applicationId, @NotNull UUID callId, @Nullable String attachmentName) {
            callId.getClass();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format("%s%s/%s/%s", Arrays.copyOf(new Object[]{FacebookContentProvider.ATTACHMENT_URL_BASE, applicationId, callId.toString(), attachmentName}, 4));
        }

        public Companion() {
        }
    }

    @JvmStatic
    @NotNull
    public static final String getAttachmentUrl(@Nullable String str, @NotNull UUID uuid, @Nullable String str2) {
        return INSTANCE.m7492a(str, uuid, str2);
    }

    private final Pair<UUID, String> parseCallIdAndAttachmentName(Uri uri) {
        try {
            String path = uri.getPath();
            if (path == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String[] strArr = (String[]) StringsKt.split$default(path.substring(1), new String[]{"/"}, false, 0, 6, null).toArray(new String[0]);
            String str = strArr[0];
            String str2 = strArr[1];
            if (INVALID_FILE_NAME.contentEquals(str) || INVALID_FILE_NAME.contentEquals(str2)) {
                throw new Exception();
            }
            return new Pair<>(UUID.fromString(str), str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, @Nullable String s, @Nullable String[] strings) {
        uri.getClass();
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NotNull Uri uri) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public ParcelFileDescriptor openFile(@NotNull Uri uri, @NotNull String mode) throws FileNotFoundException {
        uri.getClass();
        mode.getClass();
        Pair<UUID, String> callIdAndAttachmentName = parseCallIdAndAttachmentName(uri);
        if (callIdAndAttachmentName == null) {
            throw new FileNotFoundException();
        }
        try {
            File fileM207068c = x520.m207068c((UUID) callIdAndAttachmentName.first, (String) callIdAndAttachmentName.second);
            if (fileM207068c != null) {
                return ParcelFileDescriptor.open(fileM207068c, 268435456);
            }
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            Log.e(TAG, "Got unexpected exception:" + e);
            throw e;
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NotNull Uri uri, @Nullable String[] strings, @Nullable String s, @Nullable String[] strings2, @Nullable String s2) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable String s, @Nullable String[] strings) {
        uri.getClass();
        return 0;
    }
}
