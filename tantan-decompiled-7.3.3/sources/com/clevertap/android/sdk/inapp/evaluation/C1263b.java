package com.clevertap.android.sdk.inapp.evaluation;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.evaluation.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"Lorg/json/JSONObject;", "", Constants.KEY_KEY, "Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator;", "a", "(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/clevertap/android/sdk/inapp/evaluation/TriggerOperator;", "clevertap-core_release"}, m88122k = 2, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class C1263b {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final TriggerOperator m6436a(@Nullable JSONObject jSONObject, @NotNull String str) {
        str.getClass();
        return TriggerOperator.INSTANCE.m6419a(jSONObject != null ? jSONObject.optInt(str, TriggerOperator.Equals.getOperatorValue()) : TriggerOperator.Equals.getOperatorValue());
    }
}
