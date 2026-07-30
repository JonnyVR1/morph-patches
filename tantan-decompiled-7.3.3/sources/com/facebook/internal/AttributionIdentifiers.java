package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.C1600c;
import com.facebook.FacebookException;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.exf;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u001c2\u00020\u0001:\u0003\u0005\t\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR(\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u000fR$\u0010\u0019\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001d"}, m88121d2 = {"Lcom/facebook/internal/AttributionIdentifiers;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "androidAdvertiserIdValue", "", "b", "J", "fetchTime", "<set-?>", "c", "j", "()Ljava/lang/String;", "attributionId", Constants.INAPP_DATA_TAG, RXScreenCaptureService.KEY_INDEX, "androidInstallerPackage", "", "e", "Z", BLiveStormDanmakuGiftResourceType.f45292l, "()Z", "isTrackingLimited", "h", "androidAdvertiserId", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class AttributionIdentifiers {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final String f6630f = AttributionIdentifiers.class.getCanonicalName();

    /* JADX INFO: renamed from: g */
    @JvmField
    @Nullable
    public static AttributionIdentifiers f6631g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public String androidAdvertiserIdValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long fetchTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public String attributionId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public String androidInstallerPackage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean isTrackingLimited;

    /* JADX INFO: renamed from: com.facebook.internal.AttributionIdentifiers$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0017R\u001c\u0010\"\u001a\n !*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0017¨\u0006#"}, m88121d2 = {"Lcom/facebook/internal/AttributionIdentifiers$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "h", "(Landroid/content/Context;)Z", "Lcom/facebook/internal/AttributionIdentifiers;", "e", "(Landroid/content/Context;)Lcom/facebook/internal/AttributionIdentifiers;", "b", "c", "g", Constants.INAPP_DATA_TAG, "identifiers", "a", "(Lcom/facebook/internal/AttributionIdentifiers;)Lcom/facebook/internal/AttributionIdentifiers;", "", "f", "(Landroid/content/Context;)Ljava/lang/String;", "ANDROID_ID_COLUMN_NAME", "Ljava/lang/String;", "ATTRIBUTION_ID_COLUMN_NAME", "ATTRIBUTION_ID_CONTENT_PROVIDER_WAKIZASHI", "", "CONNECTION_RESULT_SUCCESS", "I", "", "IDENTIFIER_REFRESH_INTERVAL_MILLIS", "J", "LIMIT_TRACKING_COLUMN_NAME", "kotlin.jvm.PlatformType", "TAG", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AttributionIdentifiers m8702a(AttributionIdentifiers identifiers) {
            identifiers.fetchTime = System.currentTimeMillis();
            AttributionIdentifiers.f6631g = identifiers;
            return identifiers;
        }

        /* JADX INFO: renamed from: b */
        public final AttributionIdentifiers m8703b(Context context) {
            AttributionIdentifiers attributionIdentifiersM8704c = m8704c(context);
            if (attributionIdentifiersM8704c != null) {
                return attributionIdentifiersM8704c;
            }
            AttributionIdentifiers attributionIdentifiersM8705d = m8705d(context);
            return attributionIdentifiersM8705d == null ? new AttributionIdentifiers() : attributionIdentifiersM8705d;
        }

        /* JADX INFO: renamed from: c */
        public final AttributionIdentifiers m8704c(Context context) {
            Method methodM8873L;
            Object objM8876T;
            try {
                if (!m8708g(context) || (methodM8873L = C1680e.m8873L("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) == null || (objM8876T = C1680e.m8876T(null, methodM8873L, context)) == null) {
                    return null;
                }
                Method methodM8872K = C1680e.m8872K(objM8876T.getClass(), "getId", new Class[0]);
                Method methodM8872K2 = C1680e.m8872K(objM8876T.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (methodM8872K != null && methodM8872K2 != null) {
                    AttributionIdentifiers attributionIdentifiers = new AttributionIdentifiers();
                    attributionIdentifiers.androidAdvertiserIdValue = (String) C1680e.m8876T(objM8876T, methodM8872K, new Object[0]);
                    Boolean bool = (Boolean) C1680e.m8876T(objM8876T, methodM8872K2, new Object[0]);
                    attributionIdentifiers.isTrackingLimited = bool != null ? bool.booleanValue() : false;
                    return attributionIdentifiers;
                }
                return null;
            } catch (Exception e) {
                C1680e.m8896i0("android_id", e);
                return null;
            }
        }

        /* JADX INFO: renamed from: d */
        public final AttributionIdentifiers m8705d(Context context) {
            if (!m8708g(context)) {
                return null;
            }
            ServiceConnectionC1657c serviceConnectionC1657c = new ServiceConnectionC1657c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                try {
                    if (context.bindService(intent, serviceConnectionC1657c, 1)) {
                        C1656b c1656b = new C1656b(serviceConnectionC1657c.m8712a());
                        AttributionIdentifiers attributionIdentifiers = new AttributionIdentifiers();
                        attributionIdentifiers.androidAdvertiserIdValue = c1656b.m8710O();
                        attributionIdentifiers.isTrackingLimited = c1656b.m8711P2();
                        return attributionIdentifiers;
                    }
                } catch (Exception e) {
                    C1680e.m8896i0("android_id", e);
                } finally {
                    context.unbindService(serviceConnectionC1657c);
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x006a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:21:0x006c A[Catch: all -> 0x0033, Exception -> 0x0037, TryCatch #4 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:14:0x003c, B:16:0x0057, B:18:0x0062, B:25:0x007f, B:27:0x0085, B:29:0x008a, B:31:0x008f, B:21:0x006c, B:23:0x0077, B:53:0x00ec, B:54:0x00f3), top: B:62:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x0077 A[Catch: all -> 0x0033, Exception -> 0x0037, TryCatch #4 {Exception -> 0x0037, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:14:0x003c, B:16:0x0057, B:18:0x0062, B:25:0x007f, B:27:0x0085, B:29:0x008a, B:31:0x008f, B:21:0x006c, B:23:0x0077, B:53:0x00ec, B:54:0x00f3), top: B:62:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:60:0x010f  */
        /* JADX WARN: Code duplicated, block: B:64:? A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
        /* JADX WARN: Type inference failed for: r5v2 */
        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: e */
        public final AttributionIdentifiers m8706e(@NotNull Context context) throws Throwable {
            Throwable th;
            Exception exc;
            Cursor cursorQuery;
            Uri uri;
            String str;
            Uri uri2;
            context.getClass();
            AttributionIdentifiers attributionIdentifiersM8703b = m8703b(context);
            ?? r5 = 0;
            try {
                try {
                    if (Intrinsics.m88377d(Looper.myLooper(), Looper.getMainLooper())) {
                        throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
                    }
                    AttributionIdentifiers attributionIdentifiers = AttributionIdentifiers.f6631g;
                    if (attributionIdentifiers != null && System.currentTimeMillis() - attributionIdentifiers.fetchTime < 3600000) {
                        return attributionIdentifiers;
                    }
                    String[] strArr = {"aid", "androidid", "limit_tracking"};
                    ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                    ProviderInfo providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                    if (providerInfoResolveContentProvider != null) {
                        String str2 = providerInfoResolveContentProvider.packageName;
                        str2.getClass();
                        if (exf.m123053a(context, str2)) {
                            uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                        } else {
                            if (providerInfoResolveContentProvider2 != null) {
                                str = providerInfoResolveContentProvider2.packageName;
                                str.getClass();
                                if (exf.m123053a(context, str)) {
                                    uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                }
                            }
                            uri = null;
                        }
                        uri = uri2;
                    } else {
                        if (providerInfoResolveContentProvider2 != null) {
                            str = providerInfoResolveContentProvider2.packageName;
                            str.getClass();
                            if (exf.m123053a(context, str)) {
                                uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                                uri = uri2;
                            }
                        }
                        uri = null;
                    }
                    String strM8707f = m8707f(context);
                    if (strM8707f != null) {
                        attributionIdentifiersM8703b.androidInstallerPackage = strM8707f;
                    }
                    if (uri == null) {
                        return m8702a(attributionIdentifiersM8703b);
                    }
                    cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                int columnIndex = cursorQuery.getColumnIndex("aid");
                                int columnIndex2 = cursorQuery.getColumnIndex("androidid");
                                int columnIndex3 = cursorQuery.getColumnIndex("limit_tracking");
                                attributionIdentifiersM8703b.attributionId = cursorQuery.getString(columnIndex);
                                if (columnIndex2 > 0 && columnIndex3 > 0 && attributionIdentifiersM8703b.m8698h() == null) {
                                    attributionIdentifiersM8703b.androidAdvertiserIdValue = cursorQuery.getString(columnIndex2);
                                    attributionIdentifiersM8703b.isTrackingLimited = Boolean.parseBoolean(cursorQuery.getString(columnIndex3));
                                }
                                cursorQuery.close();
                                return m8702a(attributionIdentifiersM8703b);
                            }
                        } catch (Exception e) {
                            exc = e;
                            C1680e.m8898j0(AttributionIdentifiers.f6630f, "Caught unexpected exception in getAttributionId(): " + exc);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return null;
                        }
                    }
                    AttributionIdentifiers attributionIdentifiersM8702a = m8702a(attributionIdentifiersM8703b);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return attributionIdentifiersM8702a;
                } catch (Throwable th2) {
                    th = th2;
                    r5 = context;
                    if (r5 != 0) {
                        throw th;
                    }
                    r5.close();
                    throw th;
                }
            } catch (Exception e2) {
                exc = e2;
                cursorQuery = null;
            } catch (Throwable th3) {
                th = th3;
                if (r5 != 0) {
                    throw th;
                }
                r5.close();
                throw th;
            }
        }

        /* JADX INFO: renamed from: f */
        public final String m8707f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                return packageManager.getInstallerPackageName(context.getPackageName());
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m8708g(Context context) {
            Method methodM8873L = C1680e.m8873L("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (methodM8873L == null) {
                return false;
            }
            Object objM8876T = C1680e.m8876T(null, methodM8873L, context);
            return (objM8876T instanceof Integer) && Intrinsics.m88377d(objM8876T, 0);
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        /* JADX INFO: renamed from: h */
        public final boolean m8709h(@NotNull Context context) throws Throwable {
            context.getClass();
            AttributionIdentifiers attributionIdentifiersM8706e = m8706e(context);
            return attributionIdentifiersM8706e != null && attributionIdentifiersM8706e.getIsTrackingLimited();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.AttributionIdentifiers$b */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m88121d2 = {"Lcom/facebook/internal/AttributionIdentifiers$b;", "Landroid/os/IInterface;", "Landroid/os/IBinder;", "binder", "<init>", "(Landroid/os/IBinder;)V", "asBinder", "()Landroid/os/IBinder;", "a", "Landroid/os/IBinder;", "", BloodType.f39576O, "()Ljava/lang/String;", "advertiserId", "", "P2", "()Z", "isTrackingLimited", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C1656b implements IInterface {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final IBinder binder;

        public C1656b(@NotNull IBinder iBinder) {
            iBinder.getClass();
            this.binder = iBinder;
        }

        @Nullable
        /* JADX INFO: renamed from: O */
        public final String m8710O() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.getClass();
            Parcel parcelObtain2 = Parcel.obtain();
            parcelObtain2.getClass();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.binder.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        /* JADX INFO: renamed from: P2 */
        public final boolean m8711P2() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.getClass();
            Parcel parcelObtain2 = Parcel.obtain();
            parcelObtain2.getClass();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.binder.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        @NotNull
        public IBinder asBinder() {
            return this.binder;
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.AttributionIdentifiers$c */
    @Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, m88121d2 = {"Lcom/facebook/internal/AttributionIdentifiers$c;", "Landroid/content/ServiceConnection;", "<init>", "()V", "Landroid/content/ComponentName;", AuthenticationTokenClaims.JSON_KEY_NAME, "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "consumed", "Ljava/util/concurrent/BlockingQueue;", "b", "Ljava/util/concurrent/BlockingQueue;", "queue", "()Landroid/os/IBinder;", "binder", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class ServiceConnectionC1657c implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final AtomicBoolean consumed = new AtomicBoolean(false);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final BlockingQueue<IBinder> queue = new LinkedBlockingDeque();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final IBinder m8712a() throws InterruptedException {
            if (this.consumed.compareAndSet(true, true)) {
                wtq0.m207906a("Binder already consumed");
                return null;
            }
            IBinder iBinderTake = this.queue.take();
            iBinderTake.getClass();
            return iBinderTake;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@Nullable ComponentName name, @Nullable IBinder service) {
            if (service != null) {
                try {
                    this.queue.put(service);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@Nullable ComponentName name) {
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: k */
    public static final AttributionIdentifiers m8697k(@NotNull Context context) {
        return INSTANCE.m8706e(context);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final String m8698h() {
        if (C1600c.m8081F() && C1600c.m8100k()) {
            return this.androidAdvertiserIdValue;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getAndroidInstallerPackage() {
        return this.androidInstallerPackage;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getAttributionId() {
        return this.attributionId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsTrackingLimited() {
        return this.isTrackingLimited;
    }
}
