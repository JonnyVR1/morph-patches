package p153l;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0013\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\r\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0006J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010%R\u001a\u0010*\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010\u000eR\u001a\u0010/\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u0012\u0004\b.\u0010\u000eR\"\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u0012\u0004\b3\u0010\u000eR\"\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u0012\u0004\b7\u0010\u000eR\u001a\u0010=\u001a\u0002098\u0002X\u0082\u0004¢\u0006\f\n\u0004\b:\u0010;\u0012\u0004\b<\u0010\u000eR$\u0010A\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b?\u0010\"\u001a\u0004\b@\u0010$R\u0014\u0010D\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006F"}, m88121d2 = {"Ll/zkd0;", "Ll/q7h0;", "Ll/p7h0;", "", "capacity", "<init>", "(I)V", "", BLivePkInviteSource.query, "initArgCount", "", "n", "(Ljava/lang/String;I)V", "release", "()V", "statement", "b", "(Ll/p7h0;)V", FirebaseAnalytics.Param.INDEX, "bindNull", "", "value", "bindLong", "(IJ)V", "", "bindDouble", "(ID)V", "bindString", "(ILjava/lang/String;)V", "", "bindBlob", "(I[B)V", "close", "a", "I", "getCapacity", "()I", "Ljava/lang/String;", "", "c", "[J", "getLongBindings$annotations", "longBindings", "", Constants.INAPP_DATA_TAG, "[D", "getDoubleBindings$annotations", "doubleBindings", "", "e", "[Ljava/lang/String;", "getStringBindings$annotations", "stringBindings", "f", "[[B", "getBlobBindings$annotations", "blobBindings", "", "g", "[I", "getBindingTypes$annotations", "bindingTypes", "<set-?>", "h", "m", "argCount", "k", "()Ljava/lang/String;", "sql", "Companion", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class zkd0 implements q7h0, p7h0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i */
    @JvmField
    @NotNull
    public static final TreeMap<Integer, zkd0> f204761i = new TreeMap<>();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @VisibleForTesting
    public final int capacity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public volatile String query;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final long[] longBindings;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final double[] doubleBindings;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final String[] stringBindings;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final byte[][] blobBindings;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final int[] bindingTypes;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int argCount;

    public zkd0(int i) {
        this.capacity = i;
        int i2 = i + 1;
        this.bindingTypes = new int[i2];
        this.longBindings = new long[i2];
        this.doubleBindings = new double[i2];
        this.stringBindings = new String[i2];
        this.blobBindings = new byte[i2][];
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final zkd0 m220067d(@NotNull String str, int i) {
        return INSTANCE.m220070a(str, i);
    }

    @Override // p153l.q7h0
    /* JADX INFO: renamed from: b */
    public void mo175654b(@NotNull p7h0 statement) {
        statement.getClass();
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i = 1;
        while (true) {
            int i2 = this.bindingTypes[i];
            if (i2 == 1) {
                statement.bindNull(i);
            } else if (i2 == 2) {
                statement.bindLong(i, this.longBindings[i]);
            } else if (i2 == 3) {
                statement.bindDouble(i, this.doubleBindings[i]);
            } else if (i2 == 4) {
                String str = this.stringBindings[i];
                if (str == null) {
                    wg3.m206174a("Required value was null.");
                    return;
                }
                statement.bindString(i, str);
            } else if (i2 == 5) {
                byte[] bArr = this.blobBindings[i];
                if (bArr == null) {
                    wg3.m206174a("Required value was null.");
                    return;
                }
                statement.bindBlob(i, bArr);
            }
            if (i == argCount) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // p153l.p7h0
    public void bindBlob(int index, @NotNull byte[] value) {
        value.getClass();
        this.bindingTypes[index] = 5;
        this.blobBindings[index] = value;
    }

    @Override // p153l.p7h0
    public void bindDouble(int index, double value) {
        this.bindingTypes[index] = 3;
        this.doubleBindings[index] = value;
    }

    @Override // p153l.p7h0
    public void bindLong(int index, long value) {
        this.bindingTypes[index] = 2;
        this.longBindings[index] = value;
    }

    @Override // p153l.p7h0
    public void bindNull(int index) {
        this.bindingTypes[index] = 1;
    }

    @Override // p153l.p7h0
    public void bindString(int index, @NotNull String value) {
        value.getClass();
        this.bindingTypes[index] = 4;
        this.stringBindings[index] = value;
    }

    @Override // p153l.q7h0
    @NotNull
    /* JADX INFO: renamed from: k */
    public String getQuery() {
        String str = this.query;
        if (str != null) {
            return str;
        }
        wtq0.m207906a("Required value was null.");
        return null;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public int getArgCount() {
        return this.argCount;
    }

    /* JADX INFO: renamed from: n */
    public final void m220069n(@NotNull String query, int initArgCount) {
        query.getClass();
        this.query = query;
        this.argCount = initArgCount;
    }

    public final void release() {
        TreeMap<Integer, zkd0> treeMap = f204761i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.capacity), this);
            INSTANCE.m220071b();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: l.zkd0$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\u0003R\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, m88121d2 = {"Ll/zkd0$a;", "", "<init>", "()V", "", BLivePkInviteSource.query, "", "argumentCount", "Ll/zkd0;", "a", "(Ljava/lang/String;I)Ll/zkd0;", "", "b", "BLOB", "I", "DOUBLE", "LONG", "NULL", "STRING", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final zkd0 m220070a(@NotNull String query, int argumentCount) {
            query.getClass();
            TreeMap<Integer, zkd0> treeMap = zkd0.f204761i;
            synchronized (treeMap) {
                Map.Entry<Integer, zkd0> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(argumentCount));
                if (entryCeilingEntry != null) {
                    treeMap.remove(entryCeilingEntry.getKey());
                    zkd0 value = entryCeilingEntry.getValue();
                    value.m220069n(query, argumentCount);
                    return value;
                }
                Unit unit = Unit.INSTANCE;
                zkd0 zkd0Var = new zkd0(argumentCount, null);
                zkd0Var.m220069n(query, argumentCount);
                return zkd0Var;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m220071b() {
            TreeMap<Integer, zkd0> treeMap = zkd0.f204761i;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            it.getClass();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i;
            }
        }

        public Companion() {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public /* synthetic */ zkd0(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
