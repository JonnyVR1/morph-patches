package com.facebook.appevents.p027ml;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p153l.bqw;
import p153l.t260;
import p153l.unk0;
import p153l.wtq0;
import p153l.ztb;

/* JADX INFO: renamed from: com.facebook.appevents.ml.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u001a\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001\u000eB\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000fR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000fR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u000fR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u000fR \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, m88121d2 = {"Lcom/facebook/appevents/ml/a;", "", "", "", "Ll/bqw;", "weights", "<init>", "(Ljava/util/Map;)V", "dense", "", "texts", "task", "b", "(Ll/bqw;[Ljava/lang/String;Ljava/lang/String;)Ll/bqw;", "a", "Ll/bqw;", "embedding", "convs0Weight", "c", "convs1Weight", Constants.INAPP_DATA_TAG, "convs2Weight", "e", "convs0Bias", "f", "convs1Bias", "g", "convs2Bias", "h", "fc1Weight", RXScreenCaptureService.KEY_INDEX, "fc2Weight", "j", "fc1Bias", "k", "fc2Bias", "", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/util/Map;", "finalWeights", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class C1594a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Map<String, String> f6175m = MapsKt.hashMapOf(TuplesKt.m88129a("embedding.weight", "embed.weight"), TuplesKt.m88129a("dense1.weight", "fc1.weight"), TuplesKt.m88129a("dense2.weight", "fc2.weight"), TuplesKt.m88129a("dense3.weight", "fc3.weight"), TuplesKt.m88129a("dense1.bias", "fc1.bias"), TuplesKt.m88129a("dense2.bias", "fc2.bias"), TuplesKt.m88129a("dense3.bias", "fc3.bias"));

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final bqw embedding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final bqw convs0Weight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final bqw convs1Weight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final bqw convs2Weight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final bqw convs0Bias;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final bqw convs1Bias;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final bqw convs2Bias;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final bqw fc1Weight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final bqw fc2Weight;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final bqw fc1Bias;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final bqw fc2Bias;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Map<String, bqw> finalWeights;

    /* JADX INFO: renamed from: com.facebook.appevents.ml.a$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Lcom/facebook/appevents/ml/a$a;", "", "<init>", "()V", "Ljava/io/File;", "file", "Lcom/facebook/appevents/ml/a;", "a", "(Ljava/io/File;)Lcom/facebook/appevents/ml/a;", "", "", "Ll/bqw;", "b", "(Ljava/io/File;)Ljava/util/Map;", "", "SEQ_LEN", "I", "mapping", "Ljava/util/Map;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final C1594a m8024a(@NotNull File file) {
            file.getClass();
            Map<String, bqw> mapM8025b = m8025b(file);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (mapM8025b == null) {
                return null;
            }
            try {
                return new C1594a(mapM8025b, defaultConstructorMarker);
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public final Map<String, bqw> m8025b(File file) {
            Map<String, bqw> mapM196870c = unk0.m196870c(file);
            if (mapM196870c == null) {
                return null;
            }
            HashMap map = new HashMap();
            Map mapM8022a = C1594a.m8022a();
            for (Map.Entry<String, bqw> entry : mapM196870c.entrySet()) {
                String key = entry.getKey();
                if (mapM8022a.containsKey(entry.getKey()) && (key = (String) mapM8022a.get(entry.getKey())) == null) {
                    return null;
                }
                map.put(key, entry.getValue());
            }
            return map;
        }

        public Companion() {
        }
    }

    public C1594a(Map<String, bqw> map) {
        bqw bqwVar = map.get("embed.weight");
        if (bqwVar == null) {
            wtq0.m207906a("Required value was null.");
            throw null;
        }
        this.embedding = bqwVar;
        bqw bqwVar2 = map.get("convs.0.weight");
        if (bqwVar2 == null) {
            wtq0.m207906a("Required value was null.");
            throw null;
        }
        this.convs0Weight = t260.m188963l(bqwVar2);
        bqw bqwVar3 = map.get("convs.1.weight");
        if (bqwVar3 == null) {
            wtq0.m207906a("Required value was null.");
            throw null;
        }
        this.convs1Weight = t260.m188963l(bqwVar3);
        bqw bqwVar4 = map.get("convs.2.weight");
        if (bqwVar4 == null) {
            wtq0.m207906a("Required value was null.");
            throw null;
        }
        this.convs2Weight = t260.m188963l(bqwVar4);
        bqw bqwVar5 = map.get("convs.0.bias");
        if (bqwVar5 == null) {
            wtq0.m207906a("Required value was null.");
            throw null;
        }
        this.convs0Bias = bqwVar5;
        bqw bqwVar6 = map.get("convs.1.bias");
        if (bqwVar6 == null) {
            wtq0.m207906a("Required value was null.");
            throw null;
        }
        this.convs1Bias = bqwVar6;
        bqw bqwVar7 = map.get("convs.2.bias");
        if (bqwVar7 == null) {
            wtq0.m207906a("Required value was null.");
            throw null;
        }
        this.convs2Bias = bqwVar7;
        bqw bqwVar8 = map.get("fc1.weight");
        if (bqwVar8 == null) {
            wtq0.m207906a("Required value was null.");
            throw null;
        }
        this.fc1Weight = t260.m188962k(bqwVar8);
        bqw bqwVar9 = map.get("fc2.weight");
        if (bqwVar9 == null) {
            wtq0.m207906a("Required value was null.");
            throw null;
        }
        this.fc2Weight = t260.m188962k(bqwVar9);
        bqw bqwVar10 = map.get("fc1.bias");
        if (bqwVar10 == null) {
            wtq0.m207906a("Required value was null.");
            throw null;
        }
        this.fc1Bias = bqwVar10;
        bqw bqwVar11 = map.get("fc2.bias");
        if (bqwVar11 == null) {
            wtq0.m207906a("Required value was null.");
            throw null;
        }
        this.fc2Bias = bqwVar11;
        this.finalWeights = new HashMap();
        for (String str : SetsKt.setOf((Object[]) new String[]{ModelManager.Task.MTML_INTEGRITY_DETECT.toKey(), ModelManager.Task.MTML_APP_EVENT_PREDICTION.toKey()})) {
            String str2 = str + ".weight";
            String str3 = str + ".bias";
            bqw bqwVar12 = map.get(str2);
            bqw bqwVar13 = map.get(str3);
            if (bqwVar12 != null) {
                this.finalWeights.put(str2, t260.m188962k(bqwVar12));
            }
            if (bqwVar13 != null) {
                this.finalWeights.put(str3, bqwVar13);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ Map m8022a() {
        if (ztb.m221490d(C1594a.class)) {
            return null;
        }
        try {
            return f6175m;
        } catch (Throwable th) {
            ztb.m221488b(th, C1594a.class);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final bqw m8023b(@NotNull bqw dense, @NotNull String[] texts, @NotNull String task) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            dense.getClass();
            texts.getClass();
            task.getClass();
            bqw bqwVarM188954c = t260.m188954c(t260.m188956e(texts, 128, this.embedding), this.convs0Weight);
            t260.m188952a(bqwVarM188954c, this.convs0Bias);
            t260.m188960i(bqwVarM188954c);
            bqw bqwVarM188954c2 = t260.m188954c(bqwVarM188954c, this.convs1Weight);
            t260.m188952a(bqwVarM188954c2, this.convs1Bias);
            t260.m188960i(bqwVarM188954c2);
            bqw bqwVarM188958g = t260.m188958g(bqwVarM188954c2, 2);
            bqw bqwVarM188954c3 = t260.m188954c(bqwVarM188958g, this.convs2Weight);
            t260.m188952a(bqwVarM188954c3, this.convs2Bias);
            t260.m188960i(bqwVarM188954c3);
            bqw bqwVarM188958g2 = t260.m188958g(bqwVarM188954c, bqwVarM188954c.m106010b(1));
            bqw bqwVarM188958g3 = t260.m188958g(bqwVarM188958g, bqwVarM188958g.m106010b(1));
            bqw bqwVarM188958g4 = t260.m188958g(bqwVarM188954c3, bqwVarM188954c3.m106010b(1));
            t260.m188957f(bqwVarM188958g2, 1);
            t260.m188957f(bqwVarM188958g3, 1);
            t260.m188957f(bqwVarM188958g4, 1);
            bqw bqwVarM188955d = t260.m188955d(t260.m188953b(new bqw[]{bqwVarM188958g2, bqwVarM188958g3, bqwVarM188958g4, dense}), this.fc1Weight, this.fc1Bias);
            t260.m188960i(bqwVarM188955d);
            bqw bqwVarM188955d2 = t260.m188955d(bqwVarM188955d, this.fc2Weight, this.fc2Bias);
            t260.m188960i(bqwVarM188955d2);
            bqw bqwVar = this.finalWeights.get(task + ".weight");
            bqw bqwVar2 = this.finalWeights.get(task + ".bias");
            if (bqwVar != null && bqwVar2 != null) {
                bqw bqwVarM188955d3 = t260.m188955d(bqwVarM188955d2, bqwVar, bqwVar2);
                t260.m188961j(bqwVarM188955d3);
                return bqwVarM188955d3;
            }
            return null;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    public /* synthetic */ C1594a(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }
}
