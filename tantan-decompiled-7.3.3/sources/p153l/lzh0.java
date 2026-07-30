package p153l;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.room.Index$Order;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0005\u0017\u0019\u001b\u001d\u001fBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006 "}, m88121d2 = {"Ll/lzh0;", "", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "Ll/lzh0$a;", "columns", "", "Ll/lzh0$c;", "foreignKeys", "Ll/lzh0$e;", "indices", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Ljava/util/Map;", "c", "Ljava/util/Set;", Constants.INAPP_DATA_TAG, "Companion", "e", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class lzh0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Map<String, C18511a> columns;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Set<C18513c> foreignKeys;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public final Set<C18515e> indices;

    /* JADX INFO: renamed from: l.lzh0$c */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Ll/lzh0$c;", "", "", "referenceTable", "onDelete", "onUpdate", "", "columnNames", "referenceColumnNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "c", Constants.INAPP_DATA_TAG, "Ljava/util/List;", "e", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class C18513c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final String referenceTable;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final String onDelete;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final String onUpdate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final List<String> columnNames;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final List<String> referenceColumnNames;

        public C18513c(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, @NotNull List<String> list2) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            list.getClass();
            list2.getClass();
            this.referenceTable = str;
            this.onDelete = str2;
            this.onUpdate = str3;
            this.columnNames = list;
            this.referenceColumnNames = list2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C18513c)) {
                return false;
            }
            C18513c c18513c = (C18513c) other;
            if (Intrinsics.m88377d(this.referenceTable, c18513c.referenceTable) && Intrinsics.m88377d(this.onDelete, c18513c.onDelete) && Intrinsics.m88377d(this.onUpdate, c18513c.onUpdate) && Intrinsics.m88377d(this.columnNames, c18513c.columnNames)) {
                return Intrinsics.m88377d(this.referenceColumnNames, c18513c.referenceColumnNames);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.referenceTable.hashCode() * 31) + this.onDelete.hashCode()) * 31) + this.onUpdate.hashCode()) * 31) + this.columnNames.hashCode()) * 31) + this.referenceColumnNames.hashCode();
        }

        @NotNull
        public String toString() {
            return "ForeignKey{referenceTable='" + this.referenceTable + "', onDelete='" + this.onDelete + " +', onUpdate='" + this.onUpdate + "', columnNames=" + this.columnNames + ", referenceColumnNames=" + this.referenceColumnNames + '}';
        }
    }

    /* JADX INFO: renamed from: l.lzh0$d */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m88121d2 = {"Ll/lzh0$d;", "", "", "id", "sequence", "", "from", "to", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "other", "a", "(Ll/lzh0$d;)I", "I", "f", "()I", "b", "getSequence", "c", "Ljava/lang/String;", "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "g", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C18514d implements Comparable<C18514d> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int sequence;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final String from;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final String to;

        public C18514d(int i, int i2, @NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = i;
            this.sequence = i2;
            this.from = str;
            this.to = str2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull C18514d other) {
            other.getClass();
            int i = this.id - other.id;
            return i == 0 ? this.sequence - other.sequence : i;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFrom() {
            return this.from;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getTo() {
            return this.to;
        }
    }

    /* JADX INFO: renamed from: l.lzh0$e */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0013B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001b"}, m88121d2 = {"Ll/lzh0$e;", "", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "unique", "", "columns", "orders", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Z", "c", "Ljava/util/List;", Constants.INAPP_DATA_TAG, "Companion", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @SourceDebugExtension
    public static final class C18515e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        public final boolean unique;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final List<String> columns;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public List<String> orders;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
        public C18515e(@NotNull String str, boolean z, @NotNull List<String> list, @NotNull List<String> list2) {
            str.getClass();
            list.getClass();
            list2.getClass();
            this.name = str;
            this.unique = z;
            this.columns = list;
            this.orders = list2;
            List<String> arrayList = list2;
            if (arrayList.isEmpty()) {
                int size = list.size();
                arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(Index$Order.ASC.name());
                }
            }
            this.orders = (List) arrayList;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C18515e)) {
                return false;
            }
            C18515e c18515e = (C18515e) other;
            if (this.unique == c18515e.unique && Intrinsics.m88377d(this.columns, c18515e.columns) && Intrinsics.m88377d(this.orders, c18515e.orders)) {
                return C15493d.m94374J(this.name, "index_", false, 2, null) ? C15493d.m94374J(c18515e.name, "index_", false, 2, null) : Intrinsics.m88377d(this.name, c18515e.name);
            }
            return false;
        }

        public int hashCode() {
            return ((((((C15493d.m94374J(this.name, "index_", false, 2, null) ? -1184239155 : this.name.hashCode()) * 31) + (this.unique ? 1 : 0)) * 31) + this.columns.hashCode()) * 31) + this.orders.hashCode();
        }

        @NotNull
        public String toString() {
            return "Index{name='" + this.name + "', unique=" + this.unique + ", columns=" + this.columns + ", orders=" + this.orders + "'}";
        }
    }

    public lzh0(@NotNull String str, @NotNull Map<String, C18511a> map, @NotNull Set<C18513c> set, @Nullable Set<C18515e> set2) {
        str.getClass();
        map.getClass();
        set.getClass();
        this.name = str;
        this.columns = map;
        this.foreignKeys = set;
        this.indices = set2;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final lzh0 m156433a(@NotNull n7h0 n7h0Var, @NotNull String str) {
        return INSTANCE.m156437a(n7h0Var, str);
    }

    public boolean equals(@Nullable Object other) {
        Set<C18515e> set;
        if (this == other) {
            return true;
        }
        if (!(other instanceof lzh0)) {
            return false;
        }
        lzh0 lzh0Var = (lzh0) other;
        if (!Intrinsics.m88377d(this.name, lzh0Var.name) || !Intrinsics.m88377d(this.columns, lzh0Var.columns) || !Intrinsics.m88377d(this.foreignKeys, lzh0Var.foreignKeys)) {
            return false;
        }
        Set<C18515e> set2 = this.indices;
        if (set2 == null || (set = lzh0Var.indices) == null) {
            return true;
        }
        return Intrinsics.m88377d(set2, set);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.columns.hashCode()) * 31) + this.foreignKeys.hashCode();
    }

    @NotNull
    public String toString() {
        return "TableInfo{name='" + this.name + "', columns=" + this.columns + ", foreignKeys=" + this.foreignKeys + ", indices=" + this.indices + '}';
    }

    /* JADX INFO: renamed from: l.lzh0$a */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\u0018\u0000 \"2\u00020\u0001:\u0001\u0014B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001a\u0010!\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u0012\u0004\b\u001f\u0010 ¨\u0006#"}, m88121d2 = {"Ll/lzh0$a;", "", "", AuthenticationTokenClaims.JSON_KEY_NAME, "type", "", "notNull", "", "primaryKeyPosition", "defaultValue", "createdFrom", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;)I", "Ljava/lang/String;", "b", "c", "Z", Constants.INAPP_DATA_TAG, "I", "e", "f", "g", "getAffinity$annotations", "()V", "affinity", "Companion", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C18511a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final String name;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public final String type;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @JvmField
        public final boolean notNull;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @JvmField
        public final int primaryKeyPosition;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public final String defaultValue;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @JvmField
        public final int createdFrom;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @JvmField
        public final int affinity;

        public C18511a(@NotNull String str, @NotNull String str2, boolean z, int i, @Nullable String str3, int i2) {
            str.getClass();
            str2.getClass();
            this.name = str;
            this.type = str2;
            this.notNull = z;
            this.primaryKeyPosition = i;
            this.defaultValue = str3;
            this.createdFrom = i2;
            this.affinity = m156434a(str2);
        }

        /* JADX INFO: renamed from: a */
        public final int m156434a(String type) {
            if (type == null) {
                return 5;
            }
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = type.toUpperCase(locale);
            upperCase.getClass();
            if (StringsKt.m94303P(upperCase, "INT", false, 2, null)) {
                return 3;
            }
            if (StringsKt.m94303P(upperCase, "CHAR", false, 2, null) || StringsKt.m94303P(upperCase, "CLOB", false, 2, null) || StringsKt.m94303P(upperCase, "TEXT", false, 2, null)) {
                return 2;
            }
            if (StringsKt.m94303P(upperCase, "BLOB", false, 2, null)) {
                return 5;
            }
            return (StringsKt.m94303P(upperCase, "REAL", false, 2, null) || StringsKt.m94303P(upperCase, "FLOA", false, 2, null) || StringsKt.m94303P(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
        }

        public boolean equals(@Nullable Object other) {
            String str;
            String str2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof C18511a)) {
                return false;
            }
            C18511a c18511a = (C18511a) other;
            if (this.primaryKeyPosition != c18511a.primaryKeyPosition || !Intrinsics.m88377d(this.name, c18511a.name) || this.notNull != c18511a.notNull) {
                return false;
            }
            if (this.createdFrom == 1 && c18511a.createdFrom == 2 && (str2 = this.defaultValue) != null && !INSTANCE.m156436b(str2, c18511a.defaultValue)) {
                return false;
            }
            if (this.createdFrom == 2 && c18511a.createdFrom == 1 && (str = c18511a.defaultValue) != null && !INSTANCE.m156436b(str, this.defaultValue)) {
                return false;
            }
            int i = this.createdFrom;
            if (i != 0 && i == c18511a.createdFrom) {
                String str3 = this.defaultValue;
                String str4 = c18511a.defaultValue;
                if (str3 == null ? str4 != null : !INSTANCE.m156436b(str3, str4)) {
                    return false;
                }
            }
            return this.affinity == c18511a.affinity;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.affinity) * 31) + (this.notNull ? 1231 : 1237)) * 31) + this.primaryKeyPosition;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Column{name='");
            sb.append(this.name);
            sb.append("', type='");
            sb.append(this.type);
            sb.append("', affinity='");
            sb.append(this.affinity);
            sb.append("', notNull=");
            sb.append(this.notNull);
            sb.append(", primaryKeyPosition=");
            sb.append(this.primaryKeyPosition);
            sb.append(", defaultValue='");
            String str = this.defaultValue;
            if (str == null) {
                str = NotificationStatus.undefined;
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }

        /* JADX INFO: renamed from: l.lzh0$a$a, reason: from kotlin metadata */
        @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/lzh0$a$a;", "", "<init>", "()V", "", "current", "other", "", "b", "(Ljava/lang/String;Ljava/lang/String;)Z", "a", "(Ljava/lang/String;)Z", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final boolean m156435a(String current) {
                if (current.length() == 0) {
                    return false;
                }
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (i < current.length()) {
                    char cCharAt = current.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && cCharAt != '(') {
                        return false;
                    }
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != current.length() - 1) {
                        return false;
                    }
                    i++;
                    i3 = i4;
                }
                return i2 == 0;
            }

            @JvmStatic
            @VisibleForTesting
            /* JADX INFO: renamed from: b */
            public final boolean m156436b(@NotNull String current, @Nullable String other) {
                current.getClass();
                if (Intrinsics.m88377d(current, other)) {
                    return true;
                }
                if (m156435a(current)) {
                    return Intrinsics.m88377d(StringsKt.m94324Z0(current.substring(1, current.length() - 1)).toString(), other);
                }
                return false;
            }

            public Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: l.lzh0$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, m88121d2 = {"Ll/lzh0$b;", "", "<init>", "()V", "Ll/n7h0;", "database", "", "tableName", "Ll/lzh0;", "a", "(Ll/n7h0;Ljava/lang/String;)Ll/lzh0;", "", "CREATED_FROM_DATABASE", "I", "CREATED_FROM_ENTITY", "CREATED_FROM_UNKNOWN", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final lzh0 m156437a(@NotNull n7h0 database, @NotNull String tableName) {
            database.getClass();
            tableName.getClass();
            return mzh0.m160915f(database, tableName);
        }

        public Companion() {
        }
    }
}
