package com.google.firebase.abt;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.ig3;

/* JADX INFO: loaded from: classes7.dex */
public class FirebaseABTesting {

    @VisibleForTesting
    static final String ABT_PREFERENCES = "com.google.firebase.abt";

    @VisibleForTesting
    static final String ORIGIN_LAST_KNOWN_START_TIME_KEY_FORMAT = "%s_lastKnownExperimentStartTime";
    private final Provider<AnalyticsConnector> analyticsConnector;

    @Nullable
    private Integer maxUserProperties = null;
    private final String originService;

    @Retention(RetentionPolicy.SOURCE)
    public @interface OriginService {
        public static final String INAPP_MESSAGING = "fiam";
        public static final String REMOTE_CONFIG = "frc";
    }

    public FirebaseABTesting(Context context, Provider<AnalyticsConnector> provider, String str) {
        this.analyticsConnector = provider;
        this.originService = str;
    }

    private void addExperimentToAnalytics(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        this.analyticsConnector.get().setConditionalUserProperty(conditionalUserProperty);
    }

    private void addExperiments(List<AbtExperimentInfo> list) {
        ArrayDeque arrayDeque = new ArrayDeque(getAllExperimentsInAnalytics());
        int maxUserPropertiesInAnalytics = getMaxUserPropertiesInAnalytics();
        for (AbtExperimentInfo abtExperimentInfo : list) {
            while (arrayDeque.size() >= maxUserPropertiesInAnalytics) {
                removeExperimentFromAnalytics(((AnalyticsConnector.ConditionalUserProperty) arrayDeque.pollFirst()).name);
            }
            AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = abtExperimentInfo.toConditionalUserProperty(this.originService);
            addExperimentToAnalytics(conditionalUserProperty);
            arrayDeque.offer(conditionalUserProperty);
        }
    }

    private static List<AbtExperimentInfo> convertMapsToExperimentInfos(List<Map<String, String>> list) throws AbtException {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbtExperimentInfo.fromMap(it.next()));
        }
        return arrayList;
    }

    private boolean experimentsListContainsExperiment(List<AbtExperimentInfo> list, AbtExperimentInfo abtExperimentInfo) {
        String experimentId = abtExperimentInfo.getExperimentId();
        String variantId = abtExperimentInfo.getVariantId();
        for (AbtExperimentInfo abtExperimentInfo2 : list) {
            if (abtExperimentInfo2.getExperimentId().equals(experimentId) && abtExperimentInfo2.getVariantId().equals(variantId)) {
                return true;
            }
        }
        return false;
    }

    @WorkerThread
    private List<AnalyticsConnector.ConditionalUserProperty> getAllExperimentsInAnalytics() {
        return this.analyticsConnector.get().getConditionalUserProperties(this.originService, "");
    }

    private ArrayList<AbtExperimentInfo> getExperimentsToAdd(List<AbtExperimentInfo> list, List<AbtExperimentInfo> list2) {
        ArrayList<AbtExperimentInfo> arrayList = new ArrayList<>();
        for (AbtExperimentInfo abtExperimentInfo : list) {
            if (!experimentsListContainsExperiment(list2, abtExperimentInfo)) {
                arrayList.add(abtExperimentInfo);
            }
        }
        return arrayList;
    }

    private ArrayList<AnalyticsConnector.ConditionalUserProperty> getExperimentsToRemove(List<AbtExperimentInfo> list, List<AbtExperimentInfo> list2) {
        ArrayList<AnalyticsConnector.ConditionalUserProperty> arrayList = new ArrayList<>();
        for (AbtExperimentInfo abtExperimentInfo : list) {
            if (!experimentsListContainsExperiment(list2, abtExperimentInfo)) {
                arrayList.add(abtExperimentInfo.toConditionalUserProperty(this.originService));
            }
        }
        return arrayList;
    }

    @WorkerThread
    private int getMaxUserPropertiesInAnalytics() {
        if (this.maxUserProperties == null) {
            this.maxUserProperties = Integer.valueOf(this.analyticsConnector.get().getMaxUserProperties(this.originService));
        }
        return this.maxUserProperties.intValue();
    }

    private void removeExperimentFromAnalytics(String str) {
        this.analyticsConnector.get().clearConditionalUserProperty(str, null, null);
    }

    private void removeExperiments(Collection<AnalyticsConnector.ConditionalUserProperty> collection) {
        Iterator<AnalyticsConnector.ConditionalUserProperty> it = collection.iterator();
        while (it.hasNext()) {
            removeExperimentFromAnalytics(it.next().name);
        }
    }

    private void replaceAllExperimentsWith(List<AbtExperimentInfo> list) throws AbtException {
        if (list.isEmpty()) {
            removeAllExperiments();
            return;
        }
        List<AbtExperimentInfo> allExperiments = getAllExperiments();
        removeExperiments(getExperimentsToRemove(allExperiments, list));
        addExperiments(getExperimentsToAdd(list, allExperiments));
    }

    private void throwAbtExceptionIfAnalyticsIsNull() throws AbtException {
        if (this.analyticsConnector.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    @WorkerThread
    public List<AbtExperimentInfo> getAllExperiments() throws AbtException {
        throwAbtExceptionIfAnalyticsIsNull();
        List<AnalyticsConnector.ConditionalUserProperty> allExperimentsInAnalytics = getAllExperimentsInAnalytics();
        ArrayList arrayList = new ArrayList();
        Iterator<AnalyticsConnector.ConditionalUserProperty> it = allExperimentsInAnalytics.iterator();
        while (it.hasNext()) {
            arrayList.add(AbtExperimentInfo.fromConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    @WorkerThread
    public void removeAllExperiments() throws AbtException {
        throwAbtExceptionIfAnalyticsIsNull();
        removeExperiments(getAllExperimentsInAnalytics());
    }

    @WorkerThread
    public void replaceAllExperiments(List<Map<String, String>> list) throws AbtException {
        throwAbtExceptionIfAnalyticsIsNull();
        if (list != null) {
            replaceAllExperimentsWith(convertMapsToExperimentInfos(list));
        } else {
            ig3.m135964a("The replacementExperiments list is null.");
        }
    }

    @WorkerThread
    public void reportActiveExperiment(AbtExperimentInfo abtExperimentInfo) throws AbtException {
        throwAbtExceptionIfAnalyticsIsNull();
        AbtExperimentInfo.validateAbtExperimentInfo(abtExperimentInfo);
        ArrayList arrayList = new ArrayList();
        Map<String, String> stringMap = abtExperimentInfo.toStringMap();
        stringMap.remove("triggerEvent");
        arrayList.add(AbtExperimentInfo.fromMap(stringMap));
        addExperiments(arrayList);
    }

    @WorkerThread
    public void validateRunningExperiments(List<AbtExperimentInfo> list) throws AbtException {
        throwAbtExceptionIfAnalyticsIsNull();
        removeExperiments(getExperimentsToRemove(getAllExperiments(), list));
    }
}
