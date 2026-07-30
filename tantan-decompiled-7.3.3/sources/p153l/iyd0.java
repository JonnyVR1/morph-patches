package p153l;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.savedstate.C0679a;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.IntlMarketToken;
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
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u000b\u0010\fR%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR(\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00160\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR+\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00160\r8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u001e\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001f"}, m88121d2 = {"Ll/iyd0;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", p7f.GPS_DIRECTION_TRUE, Constants.KEY_KEY, "value", "", "c", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "a", "Ljava/util/Map;", "getRegular", "()Ljava/util/Map;", IntlMarketToken.regular, "Landroidx/savedstate/a$b;", "b", "providers", "Ll/u120;", "flows", Constants.INAPP_DATA_TAG, "getMutableFlows", "mutableFlows", "e", "Landroidx/savedstate/a$b;", "()Landroidx/savedstate/a$b;", "savedStateProvider", "lifecycle-viewmodel-savedstate_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class iyd0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<String, Object> regular;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Map<String, C0679a.b> providers;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Map<String, u120<Object>> flows;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<String, u120<Object>> mutableFlows;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C0679a.b savedStateProvider;

    public iyd0(@NotNull Map<String, ? extends Object> map) {
        map.getClass();
        this.regular = MapsKt.toMutableMap(map);
        this.providers = new LinkedHashMap();
        this.flows = new LinkedHashMap();
        this.mutableFlows = new LinkedHashMap();
        this.savedStateProvider = new C0679a.b() { // from class: l.hyd0
            @Override // androidx.savedstate.C0679a.b
            /* JADX INFO: renamed from: a */
            public final Bundle mo2469a() {
                return iyd0.m142619a(this.f112107a);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m142619a(iyd0 iyd0Var) {
        Pair[] pairArr;
        for (Map.Entry entry : MapsKt.toMap(iyd0Var.mutableFlows).entrySet()) {
            iyd0Var.m142621c((String) entry.getKey(), ((u120) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : MapsKt.toMap(iyd0Var.providers).entrySet()) {
            iyd0Var.m142621c((String) entry2.getKey(), ((C0679a.b) entry2.getValue()).mo2469a());
        }
        Map<String, Object> map = iyd0Var.regular;
        if (map.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Object> entry3 : map.entrySet()) {
                arrayList.add(TuplesKt.m88129a(entry3.getKey(), entry3.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleM216006a = yi3.m216006a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        tyd0.m193567a(bundleM216006a);
        return bundleM216006a;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C0679a.b getSavedStateProvider() {
        return this.savedStateProvider;
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public final <T> void m142621c(@NotNull String key, @Nullable T value) {
        key.getClass();
        this.regular.put(key, value);
        u120<Object> u120Var = this.flows.get(key);
        if (u120Var != null) {
            u120Var.setValue(value);
        }
        u120<Object> u120Var2 = this.mutableFlows.get(key);
        if (u120Var2 != null) {
            u120Var2.setValue(value);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public iyd0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ iyd0(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map);
    }
}
