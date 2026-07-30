package com.facebook.internal.instrument;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.C1622e;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.C1680e;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.C1685a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.gym;

/* JADX INFO: renamed from: com.facebook.internal.instrument.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003J\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m88121d2 = {"Lcom/facebook/internal/instrument/a;", "", "<init>", "()V", "", Constants.INAPP_DATA_TAG, "()Z", "", "b", "", "e", "c", "(Ljava/lang/Throwable;)V", "a", "Z", "enabled", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public final class C1685a {

    @NotNull
    public static final C1685a INSTANCE = new C1685a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: a */
    public static void m8957a(InstrumentData instrumentData, GraphResponse graphResponse) {
        JSONObject jSONObjectM7659d;
        instrumentData.getClass();
        graphResponse.getClass();
        try {
            if (graphResponse.getError() == null && (jSONObjectM7659d = graphResponse.getJsonObject()) != null && jSONObjectM7659d.getBoolean("success")) {
                instrumentData.m8944a();
            }
        } catch (JSONException unused) {
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m8958b() {
        enabled = true;
        if (C1600c.m8105p()) {
            INSTANCE.m8961e();
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m8959c(@Nullable Throwable e) {
        if (!enabled || m8960d() || e == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = e.getStackTrace();
        stackTrace.getClass();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            className.getClass();
            FeatureManager.Feature featureM8732d = FeatureManager.m8732d(className);
            if (featureM8732d != FeatureManager.Feature.Unknown) {
                FeatureManager.m8731c(featureM8732d);
                hashSet.add(featureM8732d.toString());
            }
        }
        if (!C1600c.m8105p() || hashSet.isEmpty()) {
            return;
        }
        InstrumentData.C1682a.m8953c(new JSONArray((Collection) hashSet)).m8950g();
    }

    @JvmStatic
    @VisibleForTesting(otherwise = 2)
    /* JADX INFO: renamed from: d */
    public static final boolean m8960d() {
        return false;
    }

    @VisibleForTesting(otherwise = 2)
    /* JADX INFO: renamed from: e */
    public final void m8961e() {
        if (C1680e.m8882Z()) {
            return;
        }
        File[] fileArrM132987m = gym.m132987m();
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrM132987m) {
            final InstrumentData instrumentDataM8954d = InstrumentData.C1682a.m8954d(file);
            if (instrumentDataM8954d.m8949f()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", instrumentDataM8954d.toString());
                    GraphRequest.Companion c1540c = GraphRequest.INSTANCE;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    arrayList.add(c1540c.m7641z(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{C1600c.m8102m()}, 1)), jSONObject, new GraphRequest.InterfaceC1539b() { // from class: l.d6f
                        @Override // com.facebook.GraphRequest.InterfaceC1539b
                        /* JADX INFO: renamed from: a */
                        public final void mo7602a(GraphResponse graphResponse) {
                            C1685a.m8957a(instrumentDataM8954d, graphResponse);
                        }
                    }));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new C1622e(arrayList).m8360j();
    }
}
