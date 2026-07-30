package com.clevertap.android.sdk.inapp.evaluation;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.evaluation.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u0012"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/evaluation/a;", "", "Lorg/json/JSONObject;", "limitJSON", "<init>", "(Lorg/json/JSONObject;)V", "Lcom/clevertap/android/sdk/inapp/evaluation/LimitType;", "a", "Lcom/clevertap/android/sdk/inapp/evaluation/LimitType;", "c", "()Lcom/clevertap/android/sdk/inapp/evaluation/LimitType;", "limitType", "", "b", "I", "()I", Constants.KEY_LIMIT, "frequency", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class C1262a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LimitType limitType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int limit;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int frequency;

    public C1262a(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        LimitType.Companion companion = LimitType.INSTANCE;
        String strOptString = jSONObject.optString("type");
        strOptString.getClass();
        this.limitType = companion.m6418a(strOptString);
        this.limit = jSONObject.optInt(Constants.KEY_LIMIT);
        this.frequency = jSONObject.optInt("frequency");
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getFrequency() {
        return this.frequency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final LimitType getLimitType() {
        return this.limitType;
    }
}
