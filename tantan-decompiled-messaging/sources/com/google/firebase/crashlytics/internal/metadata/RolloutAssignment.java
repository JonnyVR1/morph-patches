package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Encodable
public abstract class RolloutAssignment {
    private static final int MAX_PARAMETER_VALUE_LENGTH = 256;
    public static final DataEncoder ROLLOUT_ASSIGNMENT_JSON_ENCODER = new JsonDataEncoderBuilder().configureWith(AutoRolloutAssignmentEncoder.CONFIG).build();

    public static RolloutAssignment create(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return create(jSONObject.getString(ConfigContainer.ROLLOUT_METADATA_ID), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER));
    }

    private static String validate(String str) {
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    public abstract String getParameterKey();

    public abstract String getParameterValue();

    public abstract String getRolloutId();

    public abstract long getTemplateVersion();

    public abstract String getVariantId();

    public CrashlyticsReport.Session.Event.RolloutAssignment toReportProto() {
        return CrashlyticsReport.Session.Event.RolloutAssignment.builder().setRolloutVariant(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.builder().setVariantId(getVariantId()).setRolloutId(getRolloutId()).build()).setParameterKey(getParameterKey()).setParameterValue(getParameterValue()).setTemplateVersion(getTemplateVersion()).build();
    }

    public static RolloutAssignment create(String str, String str2, String str3, String str4, long j) {
        return new AutoValue_RolloutAssignment(str, str2, validate(str3), str4, j);
    }
}
