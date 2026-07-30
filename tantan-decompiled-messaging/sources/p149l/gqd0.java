package p149l;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.savedstate.C0677a;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.IntlMarketToken;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u000b\u0010\fR%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR(\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00160\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR+\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00160\r8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u001e\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001f"}, m87232d2 = {"Ll/gqd0;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", j6f.GPS_DIRECTION_TRUE, Constants.KEY_KEY, "value", "", "c", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "a", "Ljava/util/Map;", "getRegular", "()Ljava/util/Map;", IntlMarketToken.regular, "Landroidx/savedstate/a$b;", "b", "providers", "Ll/mt10;", "flows", Constants.INAPP_DATA_TAG, "getMutableFlows", "mutableFlows", "e", "Landroidx/savedstate/a$b;", "()Landroidx/savedstate/a$b;", "savedStateProvider", "lifecycle-viewmodel-savedstate_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class gqd0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Object> regular;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, C0677a.b> providers;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Map<String, mt10<Object>> flows;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<String, mt10<Object>> mutableFlows;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C0677a.b savedStateProvider;

    public gqd0(@NotNull Map<String, ? extends Object> map) {
        map.getClass();
        this.regular = MapsKt.toMutableMap(map);
        this.providers = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.mutableFlows = new LinkedHashMap();
        this.savedStateProvider = new C0677a.b() { // from class: l.fqd0
            @Override // androidx.savedstate.C0677a.b
            /* JADX INFO: renamed from: a */
            public final Bundle mo2468a() {
                return gqd0.m127568a(this.f98784a);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m127568a(gqd0 gqd0Var) {
        Pair[] pairArr;
        for (Map.Entry entry : MapsKt.toMap(gqd0Var.mutableFlows).entrySet()) {
            gqd0Var.m127570c((String) entry.getKey(), ((mt10) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : MapsKt.toMap(gqd0Var.providers).entrySet()) {
            gqd0Var.m127570c((String) entry2.getKey(), ((C0677a.b) entry2.getValue()).mo2468a());
        }
        Map<String, Object> map = gqd0Var.regular;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Object> entry3 : map.entrySet()) {
                arrayList.add(TuplesKt.m87240a(entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleM146052a = ki3.m146052a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        rqd0.m180437a(bundleM146052a);
        return bundleM146052a;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C0677a.b getSavedStateProvider() {
        return this.savedStateProvider;
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public final <T> void m127570c(@NotNull String key, @Nullable T value) {
        key.getClass();
        this.regular.put(key, value);
        mt10<Object> mt10Var = this.flows.get(key);
        if (mt10Var != null) {
            mt10Var.setValue(value);
        }
        mt10<Object> mt10Var2 = this.mutableFlows.get(key);
        if (mt10Var2 != null) {
            mt10Var2.setValue(value);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gqd0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ gqd0(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map);
    }
}
