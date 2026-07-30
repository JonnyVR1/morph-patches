package com.facebook.internal.instrument;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.C1599e;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.C1657e;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.C1662a;
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
import p149l.fwm;

/* JADX INFO: renamed from: com.facebook.internal.instrument.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003J\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m87232d2 = {"Lcom/facebook/internal/instrument/a;", "", "<init>", "()V", "", Constants.INAPP_DATA_TAG, "()Z", "", "b", "", "e", "c", "(Ljava/lang/Throwable;)V", "a", "Z", "enabled", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public final class C1662a {

    @NotNull
    public static final C1662a INSTANCE = new C1662a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: a */
    public static void m8903a(InstrumentData instrumentData, GraphResponse graphResponse) {
        JSONObject jSONObjectM7605d;
        instrumentData.getClass();
        graphResponse.getClass();
        try {
            if (graphResponse.getError() == null && (jSONObjectM7605d = graphResponse.getJsonObject()) != null && jSONObjectM7605d.getBoolean("success")) {
                instrumentData.m8890a();
            }
        } catch (JSONException unused) {
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m8904b() {
        enabled = true;
        if (C1577c.m8051p()) {
            INSTANCE.m8907e();
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m8905c(@Nullable Throwable e) {
        if (!enabled || m8906d() || e == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = e.getStackTrace();
        stackTrace.getClass();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            className.getClass();
            FeatureManager.Feature featureM8678d = FeatureManager.m8678d(className);
            if (featureM8678d != FeatureManager.Feature.Unknown) {
                FeatureManager.m8677c(featureM8678d);
                hashSet.add(featureM8678d.toString());
            }
        }
        if (!C1577c.m8051p() || hashSet.isEmpty()) {
            return;
        }
        InstrumentData.C1659a.m8899c(new JSONArray((Collection) hashSet)).m8896g();
    }

    @JvmStatic
    @VisibleForTesting(otherwise = 2)
    /* JADX INFO: renamed from: d */
    public static final boolean m8906d() {
        return false;
    }

    @VisibleForTesting(otherwise = 2)
    /* JADX INFO: renamed from: e */
    public final void m8907e() {
        if (C1657e.m8828Z()) {
            return;
        }
        File[] fileArrM123542m = fwm.m123542m();
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrM123542m) {
            final InstrumentData instrumentDataM8900d = InstrumentData.C1659a.m8900d(file);
            if (instrumentDataM8900d.m8895f()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", instrumentDataM8900d.toString());
                    GraphRequest.Companion c1517c = GraphRequest.INSTANCE;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    arrayList.add(c1517c.m7587z(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{C1577c.m8048m()}, 1)), jSONObject, new GraphRequest.InterfaceC1516b() { // from class: l.z4f
                        @Override // com.facebook.GraphRequest.InterfaceC1516b
                        /* JADX INFO: renamed from: a */
                        public final void mo7548a(GraphResponse graphResponse) {
                            C1662a.m8903a(instrumentDataM8900d, graphResponse);
                        }
                    }));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new C1599e(arrayList).m8306j();
    }
}
