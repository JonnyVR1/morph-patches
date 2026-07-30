package androidx.privacysandbox.ads.adservices.java.measurement;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Trigger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15424f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.d4e;
import p149l.gnr;
import p149l.jh3;
import p149l.sfx;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u0004H'¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH'¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m87232d2 = {"Landroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures;", "", "<init>", "()V", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "Ll/gnr;", "", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;)Ll/gnr;", Trigger.TYPE, Constants.INAPP_DATA_TAG, "(Landroid/net/Uri;)Ll/gnr;", "", "b", "()Ll/gnr;", "Companion", "Api33Ext5JavaImpl", "a", "ads-adservices-java_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public abstract class MeasurementManagerFutures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\nH\u0017¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m87232d2 = {"Landroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures$Api33Ext5JavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures;", "Ll/sfx;", "mMeasurementManager", "<init>", "(Ll/sfx;)V", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "Ll/gnr;", "", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;)Ll/gnr;", Trigger.TYPE, Constants.INAPP_DATA_TAG, "(Landroid/net/Uri;)Ll/gnr;", "", "b", "()Ll/gnr;", "a", "Ll/sfx;", "ads-adservices-java_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Api33Ext5JavaImpl extends MeasurementManagerFutures {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final sfx mMeasurementManager;

        public Api33Ext5JavaImpl(@NotNull sfx sfxVar) {
            sfxVar.getClass();
            this.mMeasurementManager = sfxVar;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        /* JADX INFO: renamed from: b */
        public gnr<Integer> mo3206b() {
            return CoroutineAdapterKt.m3204c(jh3.m141365b(C15424f.m94055a(d4e.m109980a()), null, null, new C0535x3feaa97c(this, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        /* JADX INFO: renamed from: c */
        public gnr<Unit> mo3207c(@NotNull Uri attributionSource, @Nullable InputEvent inputEvent) {
            attributionSource.getClass();
            return CoroutineAdapterKt.m3204c(jh3.m141365b(C15424f.m94055a(d4e.m109980a()), null, null, new C0536x2c3ae252(this, attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        /* JADX INFO: renamed from: d */
        public gnr<Unit> mo3208d(@NotNull Uri trigger) {
            trigger.getClass();
            return CoroutineAdapterKt.m3204c(jh3.m141365b(C15424f.m94055a(d4e.m109980a()), null, null, new C0537x9b0c78cd(this, trigger, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Landroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures;", "a", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures;", "ads-adservices-java_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: a */
        public final MeasurementManagerFutures m3210a(@NotNull Context context) {
            context.getClass();
            sfx sfxVarM184011a = sfx.INSTANCE.m184011a(context);
            if (sfxVarM184011a != null) {
                return new Api33Ext5JavaImpl(sfxVarM184011a);
            }
            return null;
        }

        public Companion() {
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final MeasurementManagerFutures m3205a(@NotNull Context context) {
        return INSTANCE.m3210a(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract gnr<Integer> mo3206b();

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract gnr<Unit> mo3207c(@NotNull Uri attributionSource, @Nullable InputEvent inputEvent);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    /* JADX INFO: renamed from: d */
    public abstract gnr<Unit> mo3208d(@NotNull Uri trigger);
}
