package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR'\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, m87232d2 = {"Ll/a5j;", "", "Lorg/json/JSONObject;", "json", "<init>", "(Lorg/json/JSONObject;)V", "", "a", "I", "()I", "setIndex", "(I)V", FirebaseAnalytics.Param.INDEX, "Ljava/util/ArrayList;", "Ll/j3j;", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "list", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class a5j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<j3j> list;

    /* JADX INFO: renamed from: l.a5j$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class C15532a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return cn5.m107733d(Integer.valueOf(((j3j) t).getCom.immomo.momomediaext.sei.BaseSei.Z java.lang.String()), Integer.valueOf(((j3j) t2).getCom.immomo.momomediaext.sei.BaseSei.Z java.lang.String()));
        }
    }

    public a5j(@NotNull JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        jSONObject.getClass();
        this.list = new ArrayList<>();
        this.index = jSONObject.getInt(RXScreenCaptureService.KEY_INDEX);
        JSONArray jSONArray = jSONObject.getJSONArray("obj");
        int length = jSONArray != null ? jSONArray.length() : 0;
        for (int i = 0; i < length; i++) {
            if (jSONArray != null && (jSONObject2 = jSONArray.getJSONObject(i)) != null) {
                this.list.add(new j3j(this.index, jSONObject2));
            }
        }
        ArrayList<j3j> arrayList = this.list;
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new C15532a());
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ArrayList<j3j> m95044b() {
        return this.list;
    }
}
