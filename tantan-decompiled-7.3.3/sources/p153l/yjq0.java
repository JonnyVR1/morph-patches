package p153l;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p122io.CloseableKt;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0007¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010$\u001a\u00020!H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020!H\u0001¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020!2\u0006\u0010*\u001a\u00020'H\u0001¢\u0006\u0004\b+\u0010,¨\u0006-"}, m88121d2 = {"Ll/yjq0;", "", "<init>", "()V", "Landroidx/work/WorkInfo$State;", "state", "", "k", "(Landroidx/work/WorkInfo$State;)I", "value", "g", "(I)Landroidx/work/WorkInfo$State;", "Landroidx/work/BackoffPolicy;", "backoffPolicy", "a", "(Landroidx/work/BackoffPolicy;)I", Constants.INAPP_DATA_TAG, "(I)Landroidx/work/BackoffPolicy;", "Landroidx/work/NetworkType;", "networkType", "h", "(Landroidx/work/NetworkType;)I", "e", "(I)Landroidx/work/NetworkType;", "Landroidx/work/OutOfQuotaPolicy;", "policy", RXScreenCaptureService.KEY_INDEX, "(Landroidx/work/OutOfQuotaPolicy;)I", "f", "(I)Landroidx/work/OutOfQuotaPolicy;", "", "Ll/l06$c;", "triggers", "", "j", "(Ljava/util/Set;)[B", HttpHeaderValues.BYTES, "b", "([B)Ljava/util/Set;", "Ll/al20;", BLiveStormDanmakuGiftResourceType.f45292l, "([B)Ll/al20;", "requestCompat", "c", "(Ll/al20;)[B", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class yjq0 {

    @NotNull
    public static final yjq0 INSTANCE = new yjq0();

    /* JADX INFO: renamed from: l.yjq0$a */
    @Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
    public /* synthetic */ class C21614a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f200325a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f200326b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f200327c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f200328d;

        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            try {
                iArr[WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkInfo.State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkInfo.State.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkInfo.State.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkInfo.State.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WorkInfo.State.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f200325a = iArr;
            int[] iArr2 = new int[BackoffPolicy.values().length];
            try {
                iArr2[BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BackoffPolicy.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f200326b = iArr2;
            int[] iArr3 = new int[NetworkType.values().length];
            try {
                iArr3[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f200327c = iArr3;
            int[] iArr4 = new int[OutOfQuotaPolicy.values().length];
            try {
                iArr4[OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[OutOfQuotaPolicy.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f200328d = iArr4;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m216417a(@NotNull BackoffPolicy backoffPolicy) {
        backoffPolicy.getClass();
        int i = C21614a.f200326b[backoffPolicy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        nbr.m162172a();
        return 0;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Set<l06.C18326c> m216418b(@NotNull byte[] bytes) {
        bytes.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        uri.getClass();
                        linkedHashSet.add(new l06.C18326c(uri, z));
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.m88293a(objectInputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.m88293a(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.m88293a(byteArrayInputStream, th3);
                    throw th4;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Unit unit2 = Unit.INSTANCE;
        CloseableKt.m88293a(byteArrayInputStream, null);
        return linkedHashSet;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final byte[] m216419c(@NotNull al20 requestCompat) {
        requestCompat.getClass();
        if (Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequestM98639b = requestCompat.m98639b();
        if (networkRequestM98639b == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArrM104869c = bl20.m104869c(networkRequestM98639b);
                int[] iArrM104868b = bl20.m104868b(networkRequestM98639b);
                objectOutputStream.writeInt(iArrM104869c.length);
                for (int i : iArrM104869c) {
                    objectOutputStream.writeInt(i);
                }
                objectOutputStream.writeInt(iArrM104868b.length);
                for (int i2 : iArrM104868b) {
                    objectOutputStream.writeInt(i2);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.m88293a(objectOutputStream, null);
                CloseableKt.m88293a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m88293a(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.m88293a(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final BackoffPolicy m216420d(int value) {
        if (value == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (value == 1) {
            return BackoffPolicy.LINEAR;
        }
        i2r0.m138234a("Could not convert ", value, " to BackoffPolicy");
        return null;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final NetworkType m216421e(int value) {
        if (value == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (value == 1) {
            return NetworkType.CONNECTED;
        }
        if (value == 2) {
            return NetworkType.UNMETERED;
        }
        if (value == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (value == 4) {
            return NetworkType.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && value == 5) {
            return NetworkType.TEMPORARILY_UNMETERED;
        }
        i2r0.m138234a("Could not convert ", value, " to NetworkType");
        return null;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final OutOfQuotaPolicy m216422f(int value) {
        if (value == 0) {
            return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (value == 1) {
            return OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        i2r0.m138234a("Could not convert ", value, " to OutOfQuotaPolicy");
        return null;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final WorkInfo.State m216423g(int value) {
        if (value == 0) {
            return WorkInfo.State.ENQUEUED;
        }
        if (value == 1) {
            return WorkInfo.State.RUNNING;
        }
        if (value == 2) {
            return WorkInfo.State.SUCCEEDED;
        }
        if (value == 3) {
            return WorkInfo.State.FAILED;
        }
        if (value == 4) {
            return WorkInfo.State.BLOCKED;
        }
        if (value == 5) {
            return WorkInfo.State.CANCELLED;
        }
        i2r0.m138234a("Could not convert ", value, " to State");
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final int m216424h(@NotNull NetworkType networkType) {
        networkType.getClass();
        int i = C21614a.f200327c[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED) {
            return 5;
        }
        v1d0.m199002a("Could not convert ", networkType, " to int");
        return 0;
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final int m216425i(@NotNull OutOfQuotaPolicy policy) {
        policy.getClass();
        int i = C21614a.f200328d[policy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        nbr.m162172a();
        return 0;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final byte[] m216426j(@NotNull Set<l06.C18326c> triggers) {
        triggers.getClass();
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                for (l06.C18326c c18326c : triggers) {
                    objectOutputStream.writeUTF(c18326c.getUri().toString());
                    objectOutputStream.writeBoolean(c18326c.getIsTriggeredForDescendants());
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.m88293a(objectOutputStream, null);
                CloseableKt.m88293a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m88293a(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.m88293a(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final int m216427k(@NotNull WorkInfo.State state) {
        state.getClass();
        switch (C21614a.f200325a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                nbr.m162172a();
                return 0;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final al20 m216428l(@NotNull byte[] bytes) {
        bytes.getClass();
        if (Build.VERSION.SDK_INT < 28 || bytes.length == 0) {
            return new al20(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                al20 al20VarM206738b = wk20.INSTANCE.m206738b(iArr2, iArr);
                CloseableKt.m88293a(objectInputStream, null);
                CloseableKt.m88293a(byteArrayInputStream, null);
                return al20VarM206738b;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m88293a(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.m88293a(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }
}
