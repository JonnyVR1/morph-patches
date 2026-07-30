package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Encodable
public abstract class RolloutAssignment {
    private static final String PARAMETER_KEY = "parameterKey";
    private static final String PARAMETER_VALUE = "parameterValue";
    public static final DataEncoder ROLLOUT_ASSIGNMENT_JSON_ENCODER = new JsonDataEncoderBuilder().configureWith(AutoRolloutAssignmentEncoder.CONFIG).build();
    private static final String ROLLOUT_ID = "rolloutId";
    private static final String TEMPLATE_VERSION = "templateVersion";
    private static final String VARIANT_ID = "variantId";

    public static abstract class Builder {
        @NonNull
        public abstract RolloutAssignment build();

        @NonNull
        public abstract Builder setParameterKey(@NonNull String str);

        @NonNull
        public abstract Builder setParameterValue(@NonNull String str);

        @NonNull
        public abstract Builder setRolloutId(@NonNull String str);

        @NonNull
        public abstract Builder setTemplateVersion(long j);

        @NonNull
        public abstract Builder setVariantId(@NonNull String str);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_RolloutAssignment.Builder();
    }

    @NonNull
    public static RolloutAssignment create(@NonNull JSONObject jSONObject) throws JSONException {
        return builder().setRolloutId(jSONObject.getString("rolloutId")).setVariantId(jSONObject.getString("variantId")).setParameterKey(jSONObject.getString(PARAMETER_KEY)).setParameterValue(jSONObject.getString(PARAMETER_VALUE)).setTemplateVersion(jSONObject.getLong("templateVersion")).build();
    }

    @NonNull
    public abstract String getParameterKey();

    @NonNull
    public abstract String getParameterValue();

    @NonNull
    public abstract String getRolloutId();

    public abstract long getTemplateVersion();

    @NonNull
    public abstract String getVariantId();

    @NonNull
    public static RolloutAssignment create(@NonNull String str) throws JSONException {
        return create(new JSONObject(str));
    }
}
