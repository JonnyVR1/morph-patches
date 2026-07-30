package androidx.privacysandbox.ads.adservices.java.measurement;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Trigger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15531f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.hpr;
import p153l.qox;
import p153l.r5e;
import p153l.xh3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u0004H'¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH'¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m88121d2 = {"Landroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures;", "", "<init>", "()V", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "Ll/hpr;", "", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;)Ll/hpr;", Trigger.TYPE, Constants.INAPP_DATA_TAG, "(Landroid/net/Uri;)Ll/hpr;", "", "b", "()Ll/hpr;", "Companion", "Api33Ext5JavaImpl", "a", "ads-adservices-java_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public abstract class MeasurementManagerFutures {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\nH\u0017¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m88121d2 = {"Landroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures$Api33Ext5JavaImpl;", "Landroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures;", "Ll/qox;", "mMeasurementManager", "<init>", "(Ll/qox;)V", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "Ll/hpr;", "", "c", "(Landroid/net/Uri;Landroid/view/InputEvent;)Ll/hpr;", Trigger.TYPE, Constants.INAPP_DATA_TAG, "(Landroid/net/Uri;)Ll/hpr;", "", "b", "()Ll/hpr;", "a", "Ll/qox;", "ads-adservices-java_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Api33Ext5JavaImpl extends MeasurementManagerFutures {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final qox mMeasurementManager;

        public Api33Ext5JavaImpl(@NotNull qox qoxVar) {
            qoxVar.getClass();
            this.mMeasurementManager = qoxVar;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        /* JADX INFO: renamed from: b */
        public hpr<Integer> mo3207b() {
            return CoroutineAdapterKt.m3205c(xh3.m210978b(C15531f.m94947a(r5e.m179860a()), null, null, new C0536x3feaa97c(this, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        /* JADX INFO: renamed from: c */
        public hpr<Unit> mo3208c(@NotNull Uri attributionSource, @Nullable InputEvent inputEvent) {
            attributionSource.getClass();
            return CoroutineAdapterKt.m3205c(xh3.m210978b(C15531f.m94947a(r5e.m179860a()), null, null, new C0537x2c3ae252(this, attributionSource, inputEvent, null), 3, null), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        /* JADX INFO: renamed from: d */
        public hpr<Unit> mo3209d(@NotNull Uri trigger) {
            trigger.getClass();
            return CoroutineAdapterKt.m3205c(xh3.m210978b(C15531f.m94947a(r5e.m179860a()), null, null, new C0538x9b0c78cd(this, trigger, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Landroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures;", "a", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/java/measurement/MeasurementManagerFutures;", "ads-adservices-java_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: a */
        public final MeasurementManagerFutures m3211a(@NotNull Context context) {
            context.getClass();
            qox qoxVarM177388a = qox.INSTANCE.m177388a(context);
            if (qoxVarM177388a != null) {
                return new Api33Ext5JavaImpl(qoxVarM177388a);
            }
            return null;
        }

        public Companion() {
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final MeasurementManagerFutures m3206a(@NotNull Context context) {
        return INSTANCE.m3211a(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract hpr<Integer> mo3207b();

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract hpr<Unit> mo3208c(@NotNull Uri attributionSource, @Nullable InputEvent inputEvent);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    /* JADX INFO: renamed from: d */
    public abstract hpr<Unit> mo3209d(@NotNull Uri trigger);
}
