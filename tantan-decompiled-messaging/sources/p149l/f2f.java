package p149l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.C1657e;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u0003J\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/f2f;", "", "<init>", "()V", "", "msg", "", "f", "(Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "g", "", "Ljava/io/File;", "e", "()[Ljava/io/File;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public final class f2f {

    @NotNull
    public static final f2f INSTANCE = new f2f();

    /* JADX INFO: renamed from: a */
    public static void m119175a(ArrayList arrayList, GraphResponse graphResponse) {
        JSONObject jSONObjectM7605d;
        arrayList.getClass();
        graphResponse.getClass();
        try {
            if (graphResponse.getError() == null && (jSONObjectM7605d = graphResponse.getJsonObject()) != null && jSONObjectM7605d.getBoolean("success")) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((b2f) it.next()).m99963a();
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m119176b(File file, String str) {
        str.getClass();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1))).matches(str);
    }

    /* JADX INFO: renamed from: c */
    public static int m119177c(b2f b2fVar, b2f b2fVar2) {
        b2fVar2.getClass();
        return b2fVar.m99964b(b2fVar2);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m119178d() {
        if (C1577c.m8051p()) {
            m119181g();
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final File[] m119179e() {
        File fileM123535f = fwm.m123535f();
        if (fileM123535f == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileM123535f.listFiles(new FilenameFilter() { // from class: l.e2f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return f2f.m119176b(file, str);
            }
        });
        fileArrListFiles.getClass();
        return fileArrListFiles;
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m119180f(@Nullable String msg) {
        try {
            new b2f(msg).m99967e();
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m119181g() {
        if (C1657e.m8828Z()) {
            return;
        }
        File[] fileArrM119179e = m119179e();
        final ArrayList arrayList = new ArrayList();
        for (File file : fileArrM119179e) {
            b2f b2fVar = new b2f(file);
            if (b2fVar.m99966d()) {
                arrayList.add(b2fVar);
            }
        }
        CollectionsKt.sortWith(arrayList, new Comparator() { // from class: l.c2f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f2f.m119177c((b2f) obj, (b2f) obj2);
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size() && i < 1000; i++) {
            jSONArray.put(arrayList.get(i));
        }
        fwm.m123545p("error_reports", jSONArray, new GraphRequest.InterfaceC1516b() { // from class: l.d2f
            @Override // com.facebook.GraphRequest.InterfaceC1516b
            /* JADX INFO: renamed from: a */
            public final void mo7548a(GraphResponse graphResponse) {
                f2f.m119175a(arrayList, graphResponse);
            }
        });
    }
}
