package com.facebook.appevents.p026ml;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.dnw;
import p149l.lsb;
import p149l.nu50;
import p149l.oek0;
import p149l.qkq0;

/* JADX INFO: renamed from: com.facebook.appevents.ml.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u001a\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001\u000eB\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000fR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000fR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u000fR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u000fR \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, m87232d2 = {"Lcom/facebook/appevents/ml/a;", "", "", "", "Ll/dnw;", "weights", "<init>", "(Ljava/util/Map;)V", "dense", "", "texts", "task", "b", "(Ll/dnw;[Ljava/lang/String;Ljava/lang/String;)Ll/dnw;", "a", "Ll/dnw;", "embedding", "convs0Weight", "c", "convs1Weight", Constants.INAPP_DATA_TAG, "convs2Weight", "e", "convs0Bias", "f", "convs1Bias", "g", "convs2Bias", "h", "fc1Weight", RXScreenCaptureService.KEY_INDEX, "fc2Weight", "j", "fc1Bias", "k", "fc2Bias", "", BLiveStormDanmakuGiftResourceType.f44444l, "Ljava/util/Map;", "finalWeights", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C1571a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Map<String, String> f6138m = MapsKt.hashMapOf(TuplesKt.m87240a("embedding.weight", "embed.weight"), TuplesKt.m87240a("dense1.weight", "fc1.weight"), TuplesKt.m87240a("dense2.weight", "fc2.weight"), TuplesKt.m87240a("dense3.weight", "fc3.weight"), TuplesKt.m87240a("dense1.bias", "fc1.bias"), TuplesKt.m87240a("dense2.bias", "fc2.bias"), TuplesKt.m87240a("dense3.bias", "fc3.bias"));

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final dnw embedding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final dnw convs0Weight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final dnw convs1Weight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final dnw convs2Weight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final dnw convs0Bias;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final dnw convs1Bias;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final dnw convs2Bias;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final dnw fc1Weight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final dnw fc2Weight;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final dnw fc1Bias;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final dnw fc2Bias;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Map<String, dnw> finalWeights;

    /* JADX INFO: renamed from: com.facebook.appevents.ml.a$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Lcom/facebook/appevents/ml/a$a;", "", "<init>", "()V", "Ljava/io/File;", "file", "Lcom/facebook/appevents/ml/a;", "a", "(Ljava/io/File;)Lcom/facebook/appevents/ml/a;", "", "", "Ll/dnw;", "b", "(Ljava/io/File;)Ljava/util/Map;", "", "SEQ_LEN", "I", "mapping", "Ljava/util/Map;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final C1571a m7970a(@NotNull File file) {
            file.getClass();
            Map<String, dnw> mapM7971b = m7971b(file);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (mapM7971b == null) {
                return null;
            }
            try {
                return new C1571a(mapM7971b, defaultConstructorMarker);
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public final Map<String, dnw> m7971b(File file) {
            Map<String, dnw> mapM163973c = oek0.m163973c(file);
            if (mapM163973c == null) {
                return null;
            }
            HashMap map = new HashMap();
            Map mapM7968a = C1571a.m7968a();
            for (Map.Entry<String, dnw> entry : mapM163973c.entrySet()) {
                String key = entry.getKey();
                if (mapM7968a.containsKey(entry.getKey()) && (key = (String) mapM7968a.get(entry.getKey())) == null) {
                    return null;
                }
                map.put(key, entry.getValue());
            }
            return map;
        }

        public Companion() {
        }
    }

    public C1571a(Map<String, dnw> map) {
        dnw dnwVar = map.get("embed.weight");
        if (dnwVar == null) {
            qkq0.m175383a("Required value was null.");
            throw null;
        }
        this.embedding = dnwVar;
        dnw dnwVar2 = map.get("convs.0.weight");
        if (dnwVar2 == null) {
            qkq0.m175383a("Required value was null.");
            throw null;
        }
        this.convs0Weight = nu50.m161439l(dnwVar2);
        dnw dnwVar3 = map.get("convs.1.weight");
        if (dnwVar3 == null) {
            qkq0.m175383a("Required value was null.");
            throw null;
        }
        this.convs1Weight = nu50.m161439l(dnwVar3);
        dnw dnwVar4 = map.get("convs.2.weight");
        if (dnwVar4 == null) {
            qkq0.m175383a("Required value was null.");
            throw null;
        }
        this.convs2Weight = nu50.m161439l(dnwVar4);
        dnw dnwVar5 = map.get("convs.0.bias");
        if (dnwVar5 == null) {
            qkq0.m175383a("Required value was null.");
            throw null;
        }
        this.convs0Bias = dnwVar5;
        dnw dnwVar6 = map.get("convs.1.bias");
        if (dnwVar6 == null) {
            qkq0.m175383a("Required value was null.");
            throw null;
        }
        this.convs1Bias = dnwVar6;
        dnw dnwVar7 = map.get("convs.2.bias");
        if (dnwVar7 == null) {
            qkq0.m175383a("Required value was null.");
            throw null;
        }
        this.convs2Bias = dnwVar7;
        dnw dnwVar8 = map.get("fc1.weight");
        if (dnwVar8 == null) {
            qkq0.m175383a("Required value was null.");
            throw null;
        }
        this.fc1Weight = nu50.m161438k(dnwVar8);
        dnw dnwVar9 = map.get("fc2.weight");
        if (dnwVar9 == null) {
            qkq0.m175383a("Required value was null.");
            throw null;
        }
        this.fc2Weight = nu50.m161438k(dnwVar9);
        dnw dnwVar10 = map.get("fc1.bias");
        if (dnwVar10 == null) {
            qkq0.m175383a("Required value was null.");
            throw null;
        }
        this.fc1Bias = dnwVar10;
        dnw dnwVar11 = map.get("fc2.bias");
        if (dnwVar11 == null) {
            qkq0.m175383a("Required value was null.");
            throw null;
        }
        this.fc2Bias = dnwVar11;
        this.finalWeights = new HashMap();
        for (String str : SetsKt.setOf((Object[]) new String[]{ModelManager.Task.MTML_INTEGRITY_DETECT.toKey(), ModelManager.Task.MTML_APP_EVENT_PREDICTION.toKey()})) {
            String str2 = str + ".weight";
            String str3 = str + ".bias";
            dnw dnwVar12 = map.get(str2);
            dnw dnwVar13 = map.get(str3);
            if (dnwVar12 != null) {
                this.finalWeights.put(str2, nu50.m161438k(dnwVar12));
            }
            if (dnwVar13 != null) {
                this.finalWeights.put(str3, dnwVar13);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ Map m7968a() {
        if (lsb.m151554d(C1571a.class)) {
            return null;
        }
        try {
            return f6138m;
        } catch (Throwable th) {
            lsb.m151552b(th, C1571a.class);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final dnw m7969b(@NotNull dnw dense, @NotNull String[] texts, @NotNull String task) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            dense.getClass();
            texts.getClass();
            task.getClass();
            dnw dnwVarM161430c = nu50.m161430c(nu50.m161432e(texts, 128, this.embedding), this.convs0Weight);
            nu50.m161428a(dnwVarM161430c, this.convs0Bias);
            nu50.m161436i(dnwVarM161430c);
            dnw dnwVarM161430c2 = nu50.m161430c(dnwVarM161430c, this.convs1Weight);
            nu50.m161428a(dnwVarM161430c2, this.convs1Bias);
            nu50.m161436i(dnwVarM161430c2);
            dnw dnwVarM161434g = nu50.m161434g(dnwVarM161430c2, 2);
            dnw dnwVarM161430c3 = nu50.m161430c(dnwVarM161434g, this.convs2Weight);
            nu50.m161428a(dnwVarM161430c3, this.convs2Bias);
            nu50.m161436i(dnwVarM161430c3);
            dnw dnwVarM161434g2 = nu50.m161434g(dnwVarM161430c, dnwVarM161430c.m112691b(1));
            dnw dnwVarM161434g3 = nu50.m161434g(dnwVarM161434g, dnwVarM161434g.m112691b(1));
            dnw dnwVarM161434g4 = nu50.m161434g(dnwVarM161430c3, dnwVarM161430c3.m112691b(1));
            nu50.m161433f(dnwVarM161434g2, 1);
            nu50.m161433f(dnwVarM161434g3, 1);
            nu50.m161433f(dnwVarM161434g4, 1);
            dnw dnwVarM161431d = nu50.m161431d(nu50.m161429b(new dnw[]{dnwVarM161434g2, dnwVarM161434g3, dnwVarM161434g4, dense}), this.fc1Weight, this.fc1Bias);
            nu50.m161436i(dnwVarM161431d);
            dnw dnwVarM161431d2 = nu50.m161431d(dnwVarM161431d, this.fc2Weight, this.fc2Bias);
            nu50.m161436i(dnwVarM161431d2);
            dnw dnwVar = this.finalWeights.get(task + ".weight");
            dnw dnwVar2 = this.finalWeights.get(task + ".bias");
            if (dnwVar != null && dnwVar2 != null) {
                dnw dnwVarM161431d3 = nu50.m161431d(dnwVarM161431d2, dnwVar, dnwVar2);
                nu50.m161437j(dnwVarM161431d3);
                return dnwVarM161431d3;
            }
            return null;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    public /* synthetic */ C1571a(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }
}
