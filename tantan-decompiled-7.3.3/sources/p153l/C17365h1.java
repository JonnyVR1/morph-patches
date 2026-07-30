package p153l;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.C1680e;
import com.facebook.internal.instrument.InstrumentData;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.h1 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m88121d2 = {"Ll/h1;", "", "<init>", "()V", "", "c", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enabled", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public final class C17365h1 {

    @NotNull
    public static final C17365h1 INSTANCE = new C17365h1();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean enabled = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static int m133202a(InstrumentData instrumentData, InstrumentData instrumentData2) {
        if (ztb.m221490d(C17365h1.class)) {
            return 0;
        }
        try {
            instrumentData2.getClass();
            return instrumentData.m8945b(instrumentData2);
        } catch (Throwable th) {
            ztb.m221488b(th, C17365h1.class);
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m133203b(List list, GraphResponse graphResponse) {
        JSONObject jsonObject;
        if (ztb.m221490d(C17365h1.class)) {
            return;
        }
        try {
            list.getClass();
            graphResponse.getClass();
            try {
                if (graphResponse.getError() == null && (jsonObject = graphResponse.getJsonObject()) != null && jsonObject.getBoolean("success")) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((InstrumentData) it.next()).m8944a();
                    }
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            ztb.m221488b(th, C17365h1.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final synchronized void m133204c() {
        if (ztb.m221490d(C17365h1.class)) {
            return;
        }
        try {
            if (enabled.getAndSet(true)) {
                return;
            }
            if (C1600c.m8105p()) {
                m133205d();
            }
            C15885b1.m101380c();
        } catch (Throwable th) {
            ztb.m221488b(th, C17365h1.class);
        }
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static final void m133205d() {
        if (ztb.m221490d(C17365h1.class)) {
            return;
        }
        try {
            if (C1680e.m8882Z()) {
                return;
            }
            File[] fileArrM132986l = gym.m132986l();
            ArrayList arrayList = new ArrayList(fileArrM132986l.length);
            for (File file : fileArrM132986l) {
                arrayList.add(InstrumentData.C1682a.m8954d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InstrumentData) obj).m8949f()) {
                    arrayList2.add(obj);
                }
            }
            final List listSortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: l.e1
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return C17365h1.m133202a((InstrumentData) obj2, (InstrumentData) obj3);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = C15274a.m88496l(0, Math.min(listSortedWith.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listSortedWith.get(((IntIterator) it).nextInt()));
            }
            gym.m132990p("anr_reports", jSONArray, new GraphRequest.InterfaceC1539b() { // from class: l.f1
                @Override // com.facebook.GraphRequest.InterfaceC1539b
                /* JADX INFO: renamed from: a */
                public final void mo7602a(GraphResponse graphResponse) {
                    C17365h1.m133203b(listSortedWith, graphResponse);
                }
            });
        } catch (Throwable th) {
            ztb.m221488b(th, C17365h1.class);
        }
    }
}
