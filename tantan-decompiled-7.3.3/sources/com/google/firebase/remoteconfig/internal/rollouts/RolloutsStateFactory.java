package com.google.firebase.remoteconfig.internal.rollouts;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class RolloutsStateFactory {
    ConfigCacheClient activatedConfigsCache;
    ConfigCacheClient defaultConfigsCache;

    public RolloutsStateFactory(ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2) {
        this.activatedConfigsCache = configCacheClient;
        this.defaultConfigsCache = configCacheClient2;
    }

    @NonNull
    public static RolloutsStateFactory create(@NonNull ConfigCacheClient configCacheClient, @NonNull ConfigCacheClient configCacheClient2) {
        return new RolloutsStateFactory(configCacheClient, configCacheClient2);
    }

    @NonNull
    private String getParameterValue(@NonNull String str) {
        String stringFromCache = getStringFromCache(this.activatedConfigsCache, str);
        if (stringFromCache != null) {
            return stringFromCache;
        }
        String stringFromCache2 = getStringFromCache(this.defaultConfigsCache, str);
        return stringFromCache2 != null ? stringFromCache2 : "";
    }

    @Nullable
    private static String getStringFromCache(@NonNull ConfigCacheClient configCacheClient, @NonNull String str) {
        ConfigContainer blocking = configCacheClient.getBlocking();
        if (blocking == null) {
            return null;
        }
        try {
            return blocking.getConfigs().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    @NonNull
    public RolloutsState getActiveRolloutsState(@NonNull ConfigContainer configContainer) throws FirebaseRemoteConfigClientException {
        JSONArray rolloutMetadata = configContainer.getRolloutMetadata();
        long templateVersionNumber = configContainer.getTemplateVersionNumber();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < rolloutMetadata.length(); i++) {
            try {
                JSONObject jSONObject = rolloutMetadata.getJSONObject(i);
                String string = jSONObject.getString(ConfigContainer.ROLLOUT_METADATA_ID);
                JSONArray jSONArray = jSONObject.getJSONArray(ConfigContainer.ROLLOUT_METADATA_AFFECTED_KEYS);
                if (jSONArray.length() > 1) {
                    String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray);
                }
                String strOptString = jSONArray.optString(0, "");
                hashSet.add(RolloutAssignment.builder().setRolloutId(string).setVariantId(jSONObject.getString("variantId")).setParameterKey(strOptString).setParameterValue(getParameterValue(strOptString)).setTemplateVersion(templateVersionNumber).build());
            } catch (JSONException e) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        return RolloutsState.create(hashSet);
    }
}
