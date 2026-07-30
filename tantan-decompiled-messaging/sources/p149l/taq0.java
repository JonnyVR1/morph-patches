package p149l;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.p118io.CloseableKt;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0007¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010$\u001a\u00020!H\u0007¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020!H\u0001¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020!2\u0006\u0010*\u001a\u00020'H\u0001¢\u0006\u0004\b+\u0010,¨\u0006-"}, m87232d2 = {"Ll/taq0;", "", "<init>", "()V", "Landroidx/work/WorkInfo$State;", "state", "", "k", "(Landroidx/work/WorkInfo$State;)I", "value", "g", "(I)Landroidx/work/WorkInfo$State;", "Landroidx/work/BackoffPolicy;", "backoffPolicy", "a", "(Landroidx/work/BackoffPolicy;)I", Constants.INAPP_DATA_TAG, "(I)Landroidx/work/BackoffPolicy;", "Landroidx/work/NetworkType;", "networkType", "h", "(Landroidx/work/NetworkType;)I", "e", "(I)Landroidx/work/NetworkType;", "Landroidx/work/OutOfQuotaPolicy;", "policy", RXScreenCaptureService.KEY_INDEX, "(Landroidx/work/OutOfQuotaPolicy;)I", "f", "(I)Landroidx/work/OutOfQuotaPolicy;", "", "Ll/gz5$c;", "triggers", "", "j", "(Ljava/util/Set;)[B", HttpHeaderValues.BYTES, "b", "([B)Ljava/util/Set;", "Ll/qc20;", BLiveStormDanmakuGiftResourceType.f44444l, "([B)Ll/qc20;", "requestCompat", "c", "(Ll/qc20;)[B", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class taq0 {

    @NotNull
    public static final taq0 INSTANCE = new taq0();

    /* JADX INFO: renamed from: l.taq0$a */
    @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
    public /* synthetic */ class C20135a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f169176a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f169177b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f169178c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f169179d;

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
            f169176a = iArr;
            int[] iArr2 = new int[BackoffPolicy.values().length];
            try {
                iArr2[BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BackoffPolicy.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f169177b = iArr2;
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
            f169178c = iArr3;
            int[] iArr4 = new int[OutOfQuotaPolicy.values().length];
            try {
                iArr4[OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[OutOfQuotaPolicy.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f169179d = iArr4;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m187767a(@NotNull BackoffPolicy backoffPolicy) {
        backoffPolicy.getClass();
        int i = C20135a.f169177b[backoffPolicy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        l9r.m149037a();
        return 0;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Set<gz5.C17207c> m187768b(@NotNull byte[] bytes) {
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
                        linkedHashSet.add(new gz5.C17207c(uri, z));
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.m87404a(objectInputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.m87404a(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    CloseableKt.m87404a(byteArrayInputStream, th3);
                    throw th4;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Unit unit2 = Unit.INSTANCE;
        CloseableKt.m87404a(byteArrayInputStream, null);
        return linkedHashSet;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final byte[] m187769c(@NotNull qc20 requestCompat) {
        requestCompat.getClass();
        if (Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequestM173862b = requestCompat.m173862b();
        if (networkRequestM173862b == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArrM178737c = rc20.m178737c(networkRequestM173862b);
                int[] iArrM178736b = rc20.m178736b(networkRequestM173862b);
                objectOutputStream.writeInt(iArrM178737c.length);
                for (int i : iArrM178737c) {
                    objectOutputStream.writeInt(i);
                }
                objectOutputStream.writeInt(iArrM178736b.length);
                for (int i2 : iArrM178736b) {
                    objectOutputStream.writeInt(i2);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.m87404a(objectOutputStream, null);
                CloseableKt.m87404a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m87404a(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.m87404a(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final BackoffPolicy m187770d(int value) {
        if (value == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (value == 1) {
            return BackoffPolicy.LINEAR;
        }
        ctq0.m108694a("Could not convert ", value, " to BackoffPolicy");
        return null;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final NetworkType m187771e(int value) {
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
        ctq0.m108694a("Could not convert ", value, " to NetworkType");
        return null;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final OutOfQuotaPolicy m187772f(int value) {
        if (value == 0) {
            return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (value == 1) {
            return OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        ctq0.m108694a("Could not convert ", value, " to OutOfQuotaPolicy");
        return null;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final WorkInfo.State m187773g(int value) {
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
        ctq0.m108694a("Could not convert ", value, " to State");
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final int m187774h(@NotNull NetworkType networkType) {
        networkType.getClass();
        int i = C20135a.f169178c[networkType.ordinal()];
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
        qtc0.m176411a("Could not convert ", networkType, " to int");
        return 0;
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final int m187775i(@NotNull OutOfQuotaPolicy policy) {
        policy.getClass();
        int i = C20135a.f169179d[policy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        l9r.m149037a();
        return 0;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final byte[] m187776j(@NotNull Set<gz5.C17207c> triggers) {
        triggers.getClass();
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                for (gz5.C17207c c17207c : triggers) {
                    objectOutputStream.writeUTF(c17207c.getUri().toString());
                    objectOutputStream.writeBoolean(c17207c.getIsTriggeredForDescendants());
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.m87404a(objectOutputStream, null);
                CloseableKt.m87404a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m87404a(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.m87404a(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final int m187777k(@NotNull WorkInfo.State state) {
        state.getClass();
        switch (C20135a.f169176a[state.ordinal()]) {
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
                l9r.m149037a();
                return 0;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final qc20 m187778l(@NotNull byte[] bytes) {
        bytes.getClass();
        if (Build.VERSION.SDK_INT < 28 || bytes.length == 0) {
            return new qc20(null);
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
                qc20 qc20VarM153980b = mc20.INSTANCE.m153980b(iArr2, iArr);
                CloseableKt.m87404a(objectInputStream, null);
                CloseableKt.m87404a(byteArrayInputStream, null);
                return qc20VarM153980b;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m87404a(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.m87404a(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }
}
