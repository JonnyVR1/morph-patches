package p149l;

import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, m87232d2 = {"Ll/ayf0;", "Ll/aqm;", "Ll/zxf0;", "storeRegistry", "", "logTag", "<init>", "(Ll/zxf0;Ljava/lang/String;)V", "", "Lorg/json/JSONObject;", Constants.INAPP_DATA_TAG, "()Ljava/util/List;", "queue", "", "e", "(Ljava/util/List;)Lkotlin/Unit;", "inApps", "a", "(Ljava/util/List;)V", "inApp", "c", "(Lorg/json/JSONObject;)V", "b", "()Lorg/json/JSONObject;", "Ll/zxf0;", "Ljava/lang/String;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class ayf0 implements aqm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final zxf0 storeRegistry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String logTag;

    public ayf0(@NotNull zxf0 zxf0Var, @NotNull String str) {
        zxf0Var.getClass();
        str.getClass();
        this.storeRegistry = zxf0Var;
        this.logTag = str;
    }

    /* JADX INFO: renamed from: d */
    private final List<JSONObject> m99541d() {
        iqm inAppStore = this.storeRegistry.getInAppStore();
        return inAppStore == null ? CollectionsKt.emptyList() : inAppStore.m137770h();
    }

    /* JADX INFO: renamed from: e */
    private final Unit m99542e(List<? extends JSONObject> queue) {
        iqm inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore == null) {
            return null;
        }
        inAppStore.m137779t(queue);
        return Unit.INSTANCE;
    }

    @Override // p149l.aqm
    @WorkerThread
    /* JADX INFO: renamed from: a */
    public synchronized void mo98306a(@NotNull List<? extends JSONObject> inApps) {
        inApps.getClass();
        if (inApps.isEmpty()) {
            return;
        }
        List<? extends JSONObject> mutableList = CollectionsKt.toMutableList((Collection) m99541d());
        mutableList.addAll(inApps);
        m99542e(mutableList);
    }

    @Override // p149l.aqm
    @WorkerThread
    @Nullable
    /* JADX INFO: renamed from: b */
    public synchronized JSONObject mo98307b() {
        List<? extends JSONObject> mutableList = CollectionsKt.toMutableList((Collection) m99541d());
        if (mutableList.isEmpty()) {
            return null;
        }
        JSONObject jSONObjectRemove = mutableList.remove(0);
        m99542e(mutableList);
        return jSONObjectRemove;
    }

    @Override // p149l.aqm
    @WorkerThread
    /* JADX INFO: renamed from: c */
    public synchronized void mo98308c(@NotNull JSONObject inApp) {
        inApp.getClass();
        List<? extends JSONObject> mutableList = CollectionsKt.toMutableList((Collection) m99541d());
        mutableList.add(0, inApp);
        m99542e(mutableList);
    }
}
