package p153l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.C1680e;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u0003J\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/k3f;", "", "<init>", "()V", "", "msg", "", "f", "(Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "g", "", "Ljava/io/File;", "e", "()[Ljava/io/File;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public final class k3f {

    @NotNull
    public static final k3f INSTANCE = new k3f();

    /* JADX INFO: renamed from: a */
    public static void m148009a(ArrayList arrayList, GraphResponse graphResponse) {
        JSONObject jSONObjectM7659d;
        arrayList.getClass();
        graphResponse.getClass();
        try {
            if (graphResponse.getError() == null && (jSONObjectM7659d = graphResponse.getJsonObject()) != null && jSONObjectM7659d.getBoolean("success")) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((g3f) it.next()).m128726a();
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m148010b(File file, String str) {
        str.getClass();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1))).matches(str);
    }

    /* JADX INFO: renamed from: c */
    public static int m148011c(g3f g3fVar, g3f g3fVar2) {
        g3fVar2.getClass();
        return g3fVar.m128727b(g3fVar2);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m148012d() {
        if (C1600c.m8105p()) {
            m148015g();
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final File[] m148013e() {
        File fileM132980f = gym.m132980f();
        if (fileM132980f == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileM132980f.listFiles(new FilenameFilter() { // from class: l.j3f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return k3f.m148010b(file, str);
            }
        });
        fileArrListFiles.getClass();
        return fileArrListFiles;
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m148014f(@Nullable String msg) {
        try {
            new g3f(msg).m128730e();
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m148015g() {
        if (C1680e.m8882Z()) {
            return;
        }
        File[] fileArrM148013e = m148013e();
        final ArrayList arrayList = new ArrayList();
        for (File file : fileArrM148013e) {
            g3f g3fVar = new g3f(file);
            if (g3fVar.m128729d()) {
                arrayList.add(g3fVar);
            }
        }
        CollectionsKt.sortWith(arrayList, new Comparator() { // from class: l.h3f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return k3f.m148011c((g3f) obj, (g3f) obj2);
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size() && i < 1000; i++) {
            jSONArray.put(arrayList.get(i));
        }
        gym.m132990p("error_reports", jSONArray, new GraphRequest.InterfaceC1539b() { // from class: l.i3f
            @Override // com.facebook.GraphRequest.InterfaceC1539b
            /* JADX INFO: renamed from: a */
            public final void mo7602a(GraphResponse graphResponse) {
                k3f.m148009a(arrayList, graphResponse);
            }
        });
    }
}
