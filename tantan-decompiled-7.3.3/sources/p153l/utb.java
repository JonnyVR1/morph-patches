package p153l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.C1680e;
import com.facebook.internal.instrument.C1685a;
import com.facebook.internal.instrument.InstrumentData;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\fB\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m88121d2 = {"Ll/utb;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "previousHandler", "<init>", "(Ljava/lang/Thread$UncaughtExceptionHandler;)V", "Ljava/lang/Thread;", Constants.KEY_T, "", "e", "", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "a", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class utb implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    public static final String f180902b = utb.class.getCanonicalName();

    /* JADX INFO: renamed from: c */
    @Nullable
    public static utb f180903c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Thread.UncaughtExceptionHandler previousHandler;

    public utb(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.previousHandler = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NotNull Thread t, @NotNull Throwable e) {
        t.getClass();
        e.getClass();
        if (gym.m132984j(e)) {
            C1685a.m8959c(e);
            InstrumentData.C1682a.m8952b(e, InstrumentData.Type.CrashReport).m8950g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.previousHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t, e);
        }
    }

    /* JADX INFO: renamed from: l.utb$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/utb$a;", "", "<init>", "()V", "", "c", Constants.INAPP_DATA_TAG, "", "MAX_CRASH_REPORT_NUM", "I", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "Ll/utb;", "instance", "Ll/utb;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m197980a(List list, GraphResponse graphResponse) {
            JSONObject jsonObject;
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
        }

        /* JADX INFO: renamed from: b */
        public static int m197981b(InstrumentData instrumentData, InstrumentData instrumentData2) {
            instrumentData2.getClass();
            return instrumentData.m8945b(instrumentData2);
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final synchronized void m197982c() {
            try {
                if (C1600c.m8105p()) {
                    m197983d();
                }
                if (utb.f180903c != null) {
                    String unused = utb.f180902b;
                } else {
                    utb.f180903c = new utb(Thread.getDefaultUncaughtExceptionHandler(), null);
                    Thread.setDefaultUncaughtExceptionHandler(utb.f180903c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m197983d() {
            if (C1680e.m8882Z()) {
                return;
            }
            File[] fileArrM132988n = gym.m132988n();
            ArrayList arrayList = new ArrayList(fileArrM132988n.length);
            for (File file : fileArrM132988n) {
                arrayList.add(InstrumentData.C1682a.m8954d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InstrumentData) obj).m8949f()) {
                    arrayList2.add(obj);
                }
            }
            final List listSortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: l.stb
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return utb.Companion.m197981b((InstrumentData) obj2, (InstrumentData) obj3);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = C15274a.m88496l(0, Math.min(listSortedWith.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listSortedWith.get(((IntIterator) it).nextInt()));
            }
            gym.m132990p("crash_reports", jSONArray, new GraphRequest.InterfaceC1539b() { // from class: l.ttb
                @Override // com.facebook.GraphRequest.InterfaceC1539b
                /* JADX INFO: renamed from: a */
                public final void mo7602a(GraphResponse graphResponse) {
                    utb.Companion.m197980a(listSortedWith, graphResponse);
                }
            });
        }

        public Companion() {
        }
    }

    public /* synthetic */ utb(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(uncaughtExceptionHandler);
    }
}
