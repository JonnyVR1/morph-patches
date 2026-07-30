package p149l;

import android.database.Cursor;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p118io.CloseableKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\n\u001a)\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Ll/fzg0;", "database", "", "tableName", "Ll/drh0;", "f", "(Ll/fzg0;Ljava/lang/String;)Ll/drh0;", "", "Ll/drh0$c;", "c", "(Ll/fzg0;Ljava/lang/String;)Ljava/util/Set;", "Landroid/database/Cursor;", "cursor", "", "Ll/drh0$d;", "b", "(Landroid/database/Cursor;)Ljava/util/List;", "", "Ll/drh0$a;", "a", "(Ll/fzg0;Ljava/lang/String;)Ljava/util/Map;", "Ll/drh0$e;", "e", AuthenticationTokenClaims.JSON_KEY_NAME, "", "unique", Constants.INAPP_DATA_TAG, "(Ll/fzg0;Ljava/lang/String;Z)Ll/drh0$e;", "room-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class erh0 {
    /* JADX INFO: renamed from: a */
    public static final Map<String, drh0.C16451a> m117827a(fzg0 fzg0Var, String str) {
        Cursor cursorQuery = fzg0Var.query("PRAGMA table_info(`" + str + "`)");
        try {
            Cursor cursor = cursorQuery;
            if (cursor.getColumnCount() <= 0) {
                Map<String, drh0.C16451a> mapEmptyMap = MapsKt.emptyMap();
                CloseableKt.m87404a(cursorQuery, null);
                return mapEmptyMap;
            }
            int columnIndex = cursor.getColumnIndex(AuthenticationTokenClaims.JSON_KEY_NAME);
            int columnIndex2 = cursor.getColumnIndex("type");
            int columnIndex3 = cursor.getColumnIndex("notnull");
            int columnIndex4 = cursor.getColumnIndex("pk");
            int columnIndex5 = cursor.getColumnIndex("dflt_value");
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            while (cursor.moveToNext()) {
                String string = cursor.getString(columnIndex);
                String string2 = cursor.getString(columnIndex2);
                boolean z = cursor.getInt(columnIndex3) != 0;
                int i = cursor.getInt(columnIndex4);
                String string3 = cursor.getString(columnIndex5);
                string.getClass();
                string2.getClass();
                mapCreateMapBuilder.put(string, new drh0.C16451a(string, string2, z, i, string3, 2));
            }
            Map<String, drh0.C16451a> mapBuild = MapsKt.build(mapCreateMapBuilder);
            CloseableKt.m87404a(cursorQuery, null);
            return mapBuild;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m87404a(cursorQuery, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final List<drh0.C16454d> m117828b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            string.getClass();
            String string2 = cursor.getString(columnIndex4);
            string2.getClass();
            listCreateListBuilder.add(new drh0.C16454d(i, i2, string, string2));
        }
        return CollectionsKt.sorted(CollectionsKt.build(listCreateListBuilder));
    }

    /* JADX INFO: renamed from: c */
    public static final Set<drh0.C16453c> m117829c(fzg0 fzg0Var, String str) {
        Cursor cursorQuery = fzg0Var.query("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            Cursor cursor = cursorQuery;
            int columnIndex = cursor.getColumnIndex("id");
            int columnIndex2 = cursor.getColumnIndex("seq");
            int columnIndex3 = cursor.getColumnIndex("table");
            int columnIndex4 = cursor.getColumnIndex("on_delete");
            int columnIndex5 = cursor.getColumnIndex("on_update");
            List<drh0.C16454d> listM117828b = m117828b(cursor);
            cursor.moveToPosition(-1);
            Set setCreateSetBuilder = SetsKt.createSetBuilder();
            while (cursor.moveToNext()) {
                if (cursor.getInt(columnIndex2) == 0) {
                    int i = cursor.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<drh0.C16454d> arrayList3 = new ArrayList();
                    for (Object obj : listM117828b) {
                        if (((drh0.C16454d) obj).getId() == i) {
                            arrayList3.add(obj);
                        }
                    }
                    for (drh0.C16454d c16454d : arrayList3) {
                        arrayList.add(c16454d.getFrom());
                        arrayList2.add(c16454d.getTo());
                    }
                    String string = cursor.getString(columnIndex3);
                    string.getClass();
                    String string2 = cursor.getString(columnIndex4);
                    string2.getClass();
                    String string3 = cursor.getString(columnIndex5);
                    string3.getClass();
                    setCreateSetBuilder.add(new drh0.C16453c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set<drh0.C16453c> setBuild = SetsKt.build(setCreateSetBuilder);
            CloseableKt.m87404a(cursorQuery, null);
            return setBuild;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m87404a(cursorQuery, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final drh0.C16455e m117830d(fzg0 fzg0Var, String str, boolean z) {
        Cursor cursorQuery = fzg0Var.query("PRAGMA index_xinfo(`" + str + "`)");
        try {
            Cursor cursor = cursorQuery;
            int columnIndex = cursor.getColumnIndex("seqno");
            int columnIndex2 = cursor.getColumnIndex("cid");
            int columnIndex3 = cursor.getColumnIndex(AuthenticationTokenClaims.JSON_KEY_NAME);
            int columnIndex4 = cursor.getColumnIndex(SocialConstants.PARAM_APP_DESC);
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursor.moveToNext()) {
                    if (cursor.getInt(columnIndex2) >= 0) {
                        int i = cursor.getInt(columnIndex);
                        String string = cursor.getString(columnIndex3);
                        String str2 = cursor.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i);
                        string.getClass();
                        treeMap.put(numValueOf, string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                collectionValues.getClass();
                List list = CollectionsKt.toList(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                collectionValues2.getClass();
                drh0.C16455e c16455e = new drh0.C16455e(str, z, list, CollectionsKt.toList(collectionValues2));
                CloseableKt.m87404a(cursorQuery, null);
                return c16455e;
            }
            CloseableKt.m87404a(cursorQuery, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m87404a(cursorQuery, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Set<drh0.C16455e> m117831e(fzg0 fzg0Var, String str) {
        Cursor cursorQuery = fzg0Var.query("PRAGMA index_list(`" + str + "`)");
        try {
            Cursor cursor = cursorQuery;
            int columnIndex = cursor.getColumnIndex(AuthenticationTokenClaims.JSON_KEY_NAME);
            int columnIndex2 = cursor.getColumnIndex("origin");
            int columnIndex3 = cursor.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set setCreateSetBuilder = SetsKt.createSetBuilder();
                while (cursor.moveToNext()) {
                    if (Intrinsics.m87488d("c", cursor.getString(columnIndex2))) {
                        String string = cursor.getString(columnIndex);
                        boolean z = true;
                        if (cursor.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        string.getClass();
                        drh0.C16455e c16455eM117830d = m117830d(fzg0Var, string, z);
                        if (c16455eM117830d == null) {
                            CloseableKt.m87404a(cursorQuery, null);
                            return null;
                        }
                        setCreateSetBuilder.add(c16455eM117830d);
                    }
                }
                Set<drh0.C16455e> setBuild = SetsKt.build(setCreateSetBuilder);
                CloseableKt.m87404a(cursorQuery, null);
                return setBuild;
            }
            CloseableKt.m87404a(cursorQuery, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m87404a(cursorQuery, th);
                throw th2;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final drh0 m117832f(@NotNull fzg0 fzg0Var, @NotNull String str) {
        fzg0Var.getClass();
        str.getClass();
        return new drh0(str, m117827a(fzg0Var, str), m117829c(fzg0Var, str), m117831e(fzg0Var, str));
    }
}
