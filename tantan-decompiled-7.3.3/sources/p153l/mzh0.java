package p153l;

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
import kotlin.p122io.CloseableKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\n\u001a)\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m88121d2 = {"Ll/n7h0;", "database", "", "tableName", "Ll/lzh0;", "f", "(Ll/n7h0;Ljava/lang/String;)Ll/lzh0;", "", "Ll/lzh0$c;", "c", "(Ll/n7h0;Ljava/lang/String;)Ljava/util/Set;", "Landroid/database/Cursor;", "cursor", "", "Ll/lzh0$d;", "b", "(Landroid/database/Cursor;)Ljava/util/List;", "", "Ll/lzh0$a;", "a", "(Ll/n7h0;Ljava/lang/String;)Ljava/util/Map;", "Ll/lzh0$e;", "e", AuthenticationTokenClaims.JSON_KEY_NAME, "", "unique", Constants.INAPP_DATA_TAG, "(Ll/n7h0;Ljava/lang/String;Z)Ll/lzh0$e;", "room-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class mzh0 {
    /* JADX INFO: renamed from: a */
    public static final Map<String, lzh0.C18511a> m160910a(n7h0 n7h0Var, String str) {
        Cursor cursorQuery = n7h0Var.query("PRAGMA table_info(`" + str + "`)");
        try {
            Cursor cursor = cursorQuery;
            if (cursor.getColumnCount() <= 0) {
                Map<String, lzh0.C18511a> mapEmptyMap = MapsKt.emptyMap();
                CloseableKt.m88293a(cursorQuery, null);
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
                mapCreateMapBuilder.put(string, new lzh0.C18511a(string, string2, z, i, string3, 2));
            }
            Map<String, lzh0.C18511a> mapBuild = MapsKt.build(mapCreateMapBuilder);
            CloseableKt.m88293a(cursorQuery, null);
            return mapBuild;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m88293a(cursorQuery, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final List<lzh0.C18514d> m160911b(Cursor cursor) {
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
            listCreateListBuilder.add(new lzh0.C18514d(i, i2, string, string2));
        }
        return CollectionsKt.sorted(CollectionsKt.build(listCreateListBuilder));
    }

    /* JADX INFO: renamed from: c */
    public static final Set<lzh0.C18513c> m160912c(n7h0 n7h0Var, String str) {
        Cursor cursorQuery = n7h0Var.query("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            Cursor cursor = cursorQuery;
            int columnIndex = cursor.getColumnIndex("id");
            int columnIndex2 = cursor.getColumnIndex("seq");
            int columnIndex3 = cursor.getColumnIndex("table");
            int columnIndex4 = cursor.getColumnIndex("on_delete");
            int columnIndex5 = cursor.getColumnIndex("on_update");
            List<lzh0.C18514d> listM160911b = m160911b(cursor);
            cursor.moveToPosition(-1);
            Set setCreateSetBuilder = SetsKt.createSetBuilder();
            while (cursor.moveToNext()) {
                if (cursor.getInt(columnIndex2) == 0) {
                    int i = cursor.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<lzh0.C18514d> arrayList3 = new ArrayList();
                    for (Object obj : listM160911b) {
                        if (((lzh0.C18514d) obj).getId() == i) {
                            arrayList3.add(obj);
                        }
                    }
                    for (lzh0.C18514d c18514d : arrayList3) {
                        arrayList.add(c18514d.getFrom());
                        arrayList2.add(c18514d.getTo());
                    }
                    String string = cursor.getString(columnIndex3);
                    string.getClass();
                    String string2 = cursor.getString(columnIndex4);
                    string2.getClass();
                    String string3 = cursor.getString(columnIndex5);
                    string3.getClass();
                    setCreateSetBuilder.add(new lzh0.C18513c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set<lzh0.C18513c> setBuild = SetsKt.build(setCreateSetBuilder);
            CloseableKt.m88293a(cursorQuery, null);
            return setBuild;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m88293a(cursorQuery, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final lzh0.C18515e m160913d(n7h0 n7h0Var, String str, boolean z) {
        Cursor cursorQuery = n7h0Var.query("PRAGMA index_xinfo(`" + str + "`)");
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
                lzh0.C18515e c18515e = new lzh0.C18515e(str, z, list, CollectionsKt.toList(collectionValues2));
                CloseableKt.m88293a(cursorQuery, null);
                return c18515e;
            }
            CloseableKt.m88293a(cursorQuery, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m88293a(cursorQuery, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Set<lzh0.C18515e> m160914e(n7h0 n7h0Var, String str) {
        Cursor cursorQuery = n7h0Var.query("PRAGMA index_list(`" + str + "`)");
        try {
            Cursor cursor = cursorQuery;
            int columnIndex = cursor.getColumnIndex(AuthenticationTokenClaims.JSON_KEY_NAME);
            int columnIndex2 = cursor.getColumnIndex("origin");
            int columnIndex3 = cursor.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set setCreateSetBuilder = SetsKt.createSetBuilder();
                while (cursor.moveToNext()) {
                    if (Intrinsics.m88377d("c", cursor.getString(columnIndex2))) {
                        String string = cursor.getString(columnIndex);
                        boolean z = true;
                        if (cursor.getInt(columnIndex3) != 1) {
                            z = false;
                        }
                        string.getClass();
                        lzh0.C18515e c18515eM160913d = m160913d(n7h0Var, string, z);
                        if (c18515eM160913d == null) {
                            CloseableKt.m88293a(cursorQuery, null);
                            return null;
                        }
                        setCreateSetBuilder.add(c18515eM160913d);
                    }
                }
                Set<lzh0.C18515e> setBuild = SetsKt.build(setCreateSetBuilder);
                CloseableKt.m88293a(cursorQuery, null);
                return setBuild;
            }
            CloseableKt.m88293a(cursorQuery, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.m88293a(cursorQuery, th);
                throw th2;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final lzh0 m160915f(@NotNull n7h0 n7h0Var, @NotNull String str) {
        n7h0Var.getClass();
        str.getClass();
        return new lzh0(str, m160910a(n7h0Var, str), m160912c(n7h0Var, str), m160914e(n7h0Var, str));
    }
}
