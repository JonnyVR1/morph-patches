package p153l;

import android.annotation.SuppressLint;
import android.net.NetworkRequest;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.NetworkType;
import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 82\u00020\u0001:\u0003&*.B1\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB;\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000bB_\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0012Bg\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0015B\u0011\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u0019J\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0097\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0017¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0014\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010/R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010/R\u001a\u0010\r\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00101\u001a\u0004\b*\u00102R\u001a\u0010\u000e\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00101\u001a\u0004\b&\u00102R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b.\u00104R\u0013\u00107\u001a\u0004\u0018\u0001058G¢\u0006\u0006\u001a\u0004\b0\u00106¨\u00069"}, m88121d2 = {"Ll/l06;", "", "Landroidx/work/NetworkType;", "requiredNetworkType", "", "requiresCharging", "requiresBatteryNotLow", "requiresStorageNotLow", "<init>", "(Landroidx/work/NetworkType;ZZZ)V", "requiresDeviceIdle", "(Landroidx/work/NetworkType;ZZZZ)V", "", "contentTriggerUpdateDelayMillis", "contentTriggerMaxDelayMillis", "", "Ll/l06$c;", "contentUriTriggers", "(Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V", "Ll/al20;", "requiredNetworkRequestCompat", "(Ll/al20;Landroidx/work/NetworkType;ZZZZJJLjava/util/Set;)V", "other", "(Ll/l06;)V", RXScreenCaptureService.KEY_INDEX, "()Z", "j", "h", "k", "g", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/work/NetworkType;", "f", "()Landroidx/work/NetworkType;", "b", "Ll/al20;", "e", "()Ll/al20;", "c", "Z", Constants.INAPP_DATA_TAG, "J", "()J", "Ljava/util/Set;", "()Ljava/util/Set;", "Landroid/net/NetworkRequest;", "()Landroid/net/NetworkRequest;", "requiredNetworkRequest", "Companion", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class l06 {

    /* JADX INFO: renamed from: j */
    @JvmField
    @NotNull
    public static final l06 f129522j = new l06(null, false, false, false, 15, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final NetworkType requiredNetworkType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final al20 requiredNetworkRequestCompat;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean requiresCharging;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean requiresDeviceIdle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean requiresBatteryNotLow;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean requiresStorageNotLow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final long contentTriggerUpdateDelayMillis;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final long contentTriggerMaxDelayMillis;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Set<C18326c> contentUriTriggers;

    /* JADX INFO: renamed from: l.l06$a */
    @Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0007J\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m88121d2 = {"Ll/l06$a;", "", "<init>", "()V", "", "requiresCharging", Constants.INAPP_DATA_TAG, "(Z)Ll/l06$a;", "Landroidx/work/NetworkType;", "networkType", "b", "(Landroidx/work/NetworkType;)Ll/l06$a;", "requiresBatteryNotLow", "c", "Ll/l06;", "a", "()Ll/l06;", "Z", "requiresDeviceIdle", "Ll/al20;", "Ll/al20;", "requiredNetworkRequest", "Landroidx/work/NetworkType;", "requiredNetworkType", "e", "f", "requiresStorageNotLow", "", "g", "J", "triggerContentUpdateDelay", "h", "triggerContentMaxDelay", "", "Ll/l06$c;", RXScreenCaptureService.KEY_INDEX, "Ljava/util/Set;", "contentUriTriggers", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C18324a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean requiresCharging;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean requiresDeviceIdle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public boolean requiresBatteryNotLow;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public boolean requiresStorageNotLow;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public al20 requiredNetworkRequest = new al20(null, 1, null);

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public NetworkType requiredNetworkType = NetworkType.NOT_REQUIRED;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public long triggerContentUpdateDelay = -1;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public long triggerContentMaxDelay = -1;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public Set<C18326c> contentUriTriggers = new LinkedHashSet();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final l06 m152318a() {
            Set set = CollectionsKt.toSet(this.contentUriTriggers);
            return new l06(this.requiredNetworkRequest, this.requiredNetworkType, this.requiresCharging, this.requiresDeviceIdle, this.requiresBatteryNotLow, this.requiresStorageNotLow, this.triggerContentUpdateDelay, this.triggerContentMaxDelay, set);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C18324a m152319b(@NotNull NetworkType networkType) {
            networkType.getClass();
            this.requiredNetworkType = networkType;
            this.requiredNetworkRequest = new al20(null, 1, null);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C18324a m152320c(boolean requiresBatteryNotLow) {
            this.requiresBatteryNotLow = requiresBatteryNotLow;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C18324a m152321d(boolean requiresCharging) {
            this.requiresCharging = requiresCharging;
            return this;
        }
    }

    /* JADX INFO: renamed from: l.l06$c */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/l06$c;", "", "Landroid/net/Uri;", "uri", "", "isTriggeredForDescendants", "<init>", "(Landroid/net/Uri;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "b", "Z", "()Z", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C18326c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Uri uri;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final boolean isTriggeredForDescendants;

        public C18326c(@NotNull Uri uri, boolean z) {
            uri.getClass();
            this.uri = uri;
            this.isTriggeredForDescendants = z;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsTriggeredForDescendants() {
            return this.isTriggeredForDescendants;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.m88377d(C18326c.class, other != null ? other.getClass() : null)) {
                return false;
            }
            other.getClass();
            C18326c c18326c = (C18326c) other;
            return Intrinsics.m88377d(this.uri, c18326c.uri) && this.isTriggeredForDescendants == c18326c.isTriggeredForDescendants;
        }

        public int hashCode() {
            return (this.uri.hashCode() * 31) + Boolean.hashCode(this.isTriggeredForDescendants);
        }
    }

    public /* synthetic */ l06(NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? -1L : j, (i & 64) != 0 ? -1L : j2, (i & 128) != 0 ? SetsKt.emptySet() : set);
    }

    @RequiresApi(24)
    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getContentTriggerMaxDelayMillis() {
        return this.contentTriggerMaxDelayMillis;
    }

    @RequiresApi(24)
    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getContentTriggerUpdateDelayMillis() {
        return this.contentTriggerUpdateDelayMillis;
    }

    @RequiresApi(24)
    @NotNull
    /* JADX INFO: renamed from: c */
    public final Set<C18326c> m152309c() {
        return this.contentUriTriggers;
    }

    @RequiresApi(21)
    @Nullable
    /* JADX INFO: renamed from: d */
    public final NetworkRequest m152310d() {
        return this.requiredNetworkRequestCompat.m98639b();
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final al20 getRequiredNetworkRequestCompat() {
        return this.requiredNetworkRequestCompat;
    }

    @SuppressLint({"NewApi"})
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.m88377d(l06.class, other.getClass())) {
            return false;
        }
        l06 l06Var = (l06) other;
        if (this.requiresCharging == l06Var.requiresCharging && this.requiresDeviceIdle == l06Var.requiresDeviceIdle && this.requiresBatteryNotLow == l06Var.requiresBatteryNotLow && this.requiresStorageNotLow == l06Var.requiresStorageNotLow && this.contentTriggerUpdateDelayMillis == l06Var.contentTriggerUpdateDelayMillis && this.contentTriggerMaxDelayMillis == l06Var.contentTriggerMaxDelayMillis && Intrinsics.m88377d(m152310d(), l06Var.m152310d()) && this.requiredNetworkType == l06Var.requiredNetworkType) {
            return Intrinsics.m88377d(this.contentUriTriggers, l06Var.contentUriTriggers);
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final NetworkType getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: g */
    public final boolean m152313g() {
        return !this.contentUriTriggers.isEmpty();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getRequiresBatteryNotLow() {
        return this.requiresBatteryNotLow;
    }

    @SuppressLint({"NewApi"})
    public int hashCode() {
        int iHashCode = ((((((((this.requiredNetworkType.hashCode() * 31) + (this.requiresCharging ? 1 : 0)) * 31) + (this.requiresDeviceIdle ? 1 : 0)) * 31) + (this.requiresBatteryNotLow ? 1 : 0)) * 31) + (this.requiresStorageNotLow ? 1 : 0)) * 31;
        long j = this.contentTriggerUpdateDelayMillis;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.contentTriggerMaxDelayMillis;
        int iHashCode2 = (((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.contentUriTriggers.hashCode()) * 31;
        NetworkRequest networkRequestM152310d = m152310d();
        return iHashCode2 + (networkRequestM152310d != null ? networkRequestM152310d.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getRequiresCharging() {
        return this.requiresCharging;
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getRequiresDeviceIdle() {
        return this.requiresDeviceIdle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getRequiresStorageNotLow() {
        return this.requiresStorageNotLow;
    }

    @SuppressLint({"NewApi"})
    @NotNull
    public String toString() {
        return "Constraints{requiredNetworkType=" + this.requiredNetworkType + ", requiresCharging=" + this.requiresCharging + ", requiresDeviceIdle=" + this.requiresDeviceIdle + ", requiresBatteryNotLow=" + this.requiresBatteryNotLow + ", requiresStorageNotLow=" + this.requiresStorageNotLow + ", contentTriggerUpdateDelayMillis=" + this.contentTriggerUpdateDelayMillis + ", contentTriggerMaxDelayMillis=" + this.contentTriggerMaxDelayMillis + ", contentUriTriggers=" + this.contentUriTriggers + ", }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"NewApi"})
    public l06(@NotNull NetworkType networkType, boolean z, boolean z2, boolean z3) {
        this(networkType, z, false, z2, z3);
        networkType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RequiresApi(23)
    @SuppressLint({"NewApi"})
    public l06(@NotNull NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4) {
        this(networkType, z, z2, z3, z4, -1L, 0L, null, 192, null);
        networkType.getClass();
    }

    public /* synthetic */ l06(NetworkType networkType, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }

    @RequiresApi(24)
    public l06(@NotNull NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, @NotNull Set<C18326c> set) {
        networkType.getClass();
        set.getClass();
        this.requiredNetworkRequestCompat = new al20(null, 1, null);
        this.requiredNetworkType = networkType;
        this.requiresCharging = z;
        this.requiresDeviceIdle = z2;
        this.requiresBatteryNotLow = z3;
        this.requiresStorageNotLow = z4;
        this.contentTriggerUpdateDelayMillis = j;
        this.contentTriggerMaxDelayMillis = j2;
        this.contentUriTriggers = set;
    }

    public l06(@NotNull al20 al20Var, @NotNull NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, @NotNull Set<C18326c> set) {
        al20Var.getClass();
        networkType.getClass();
        set.getClass();
        this.requiredNetworkRequestCompat = al20Var;
        this.requiredNetworkType = networkType;
        this.requiresCharging = z;
        this.requiresDeviceIdle = z2;
        this.requiresBatteryNotLow = z3;
        this.requiresStorageNotLow = z4;
        this.contentTriggerUpdateDelayMillis = j;
        this.contentTriggerMaxDelayMillis = j2;
        this.contentUriTriggers = set;
    }

    @SuppressLint({"NewApi"})
    public l06(@NotNull l06 l06Var) {
        l06Var.getClass();
        this.requiresCharging = l06Var.requiresCharging;
        this.requiresDeviceIdle = l06Var.requiresDeviceIdle;
        this.requiredNetworkRequestCompat = l06Var.requiredNetworkRequestCompat;
        this.requiredNetworkType = l06Var.requiredNetworkType;
        this.requiresBatteryNotLow = l06Var.requiresBatteryNotLow;
        this.requiresStorageNotLow = l06Var.requiresStorageNotLow;
        this.contentUriTriggers = l06Var.contentUriTriggers;
        this.contentTriggerUpdateDelayMillis = l06Var.contentTriggerUpdateDelayMillis;
        this.contentTriggerMaxDelayMillis = l06Var.contentTriggerMaxDelayMillis;
    }
}
