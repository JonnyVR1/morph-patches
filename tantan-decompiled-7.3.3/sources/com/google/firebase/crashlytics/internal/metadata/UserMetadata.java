package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p153l.m31;

/* JADX INFO: loaded from: classes7.dex */
public class UserMetadata {
    public static final String INTERNAL_KEYDATA_FILENAME = "internal-keys";
    public static final String KEYDATA_FILENAME = "keys";

    @VisibleForTesting
    public static final int MAX_ATTRIBUTES = 64;

    @VisibleForTesting
    public static final int MAX_ATTRIBUTE_SIZE = 1024;

    @VisibleForTesting
    public static final int MAX_INTERNAL_KEY_SIZE = 8192;

    @VisibleForTesting
    public static final int MAX_ROLLOUT_ASSIGNMENTS = 128;
    public static final String ROLLOUTS_STATE_FILENAME = "rollouts-state";
    public static final String USERDATA_FILENAME = "user-data";
    private final CrashlyticsWorkers crashlyticsWorkers;
    private final MetaDataStore metaDataStore;
    private String sessionIdentifier;
    private final SerializeableKeysMap customKeys = new SerializeableKeysMap(false);
    private final SerializeableKeysMap internalKeys = new SerializeableKeysMap(true);
    private final RolloutAssignmentList rolloutsState = new RolloutAssignmentList(128);
    private final AtomicMarkableReference<String> userId = new AtomicMarkableReference<>(null, false);

    public class SerializeableKeysMap {
        private final boolean isInternal;
        final AtomicMarkableReference<KeysMap> map;
        private final AtomicReference<Runnable> queuedSerializer = new AtomicReference<>(null);

        public SerializeableKeysMap(boolean z) {
            this.isInternal = z;
            this.map = new AtomicMarkableReference<>(new KeysMap(64, z ? 8192 : 1024), false);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m16817a(SerializeableKeysMap serializeableKeysMap) throws Throwable {
            serializeableKeysMap.queuedSerializer.set(null);
            serializeableKeysMap.serializeIfMarked();
        }

        private void scheduleSerializationTaskIfNeeded() {
            Runnable runnable = new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.a
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    UserMetadata.SerializeableKeysMap.m16817a(this.f11483a);
                }
            };
            if (m31.m156916a(this.queuedSerializer, null, runnable)) {
                UserMetadata.this.crashlyticsWorkers.diskWrite.submit(runnable);
            }
        }

        private void serializeIfMarked() throws Throwable {
            Map<String, String> keys;
            synchronized (this) {
                try {
                    if (this.map.isMarked()) {
                        keys = this.map.getReference().getKeys();
                        AtomicMarkableReference<KeysMap> atomicMarkableReference = this.map;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    } else {
                        keys = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (keys != null) {
                UserMetadata.this.metaDataStore.writeKeyData(UserMetadata.this.sessionIdentifier, keys, this.isInternal);
            }
        }

        public Map<String, String> getKeys() {
            return this.map.getReference().getKeys();
        }

        public boolean setKey(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.map.getReference().setKey(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<KeysMap> atomicMarkableReference = this.map;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    scheduleSerializationTaskIfNeeded();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void setKeys(Map<String, String> map) {
            synchronized (this) {
                this.map.getReference().setKeys(map);
                AtomicMarkableReference<KeysMap> atomicMarkableReference = this.map;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
            }
            scheduleSerializationTaskIfNeeded();
        }
    }

    public UserMetadata(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) {
        this.sessionIdentifier = str;
        this.metaDataStore = new MetaDataStore(fileStore);
        this.crashlyticsWorkers = crashlyticsWorkers;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m16816c(UserMetadata userMetadata, String str, Map map, List list) throws Throwable {
        if (userMetadata.getUserId() != null) {
            userMetadata.metaDataStore.writeUserData(str, userMetadata.getUserId());
        }
        if (!map.isEmpty()) {
            userMetadata.metaDataStore.writeKeyData(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        userMetadata.metaDataStore.writeRolloutState(str, list);
    }

    public static UserMetadata loadFromExistingSession(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) {
        MetaDataStore metaDataStore = new MetaDataStore(fileStore);
        UserMetadata userMetadata = new UserMetadata(str, fileStore, crashlyticsWorkers);
        userMetadata.customKeys.map.getReference().setKeys(metaDataStore.readKeyData(str, false));
        userMetadata.internalKeys.map.getReference().setKeys(metaDataStore.readKeyData(str, true));
        userMetadata.userId.set(metaDataStore.readUserId(str), false);
        userMetadata.rolloutsState.updateRolloutAssignmentList(metaDataStore.readRolloutsState(str));
        return userMetadata;
    }

    @Nullable
    public static String readUserId(String str, FileStore fileStore) {
        return new MetaDataStore(fileStore).readUserId(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serializeUserDataIfNeeded() throws Throwable {
        boolean z;
        String userId;
        synchronized (this.userId) {
            try {
                z = false;
                if (this.userId.isMarked()) {
                    userId = getUserId();
                    this.userId.set(userId, false);
                    z = true;
                } else {
                    userId = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.metaDataStore.writeUserData(this.sessionIdentifier, userId);
        }
    }

    public Map<String, String> getCustomKeys(Map<String, String> map) {
        boolean zIsEmpty = map.isEmpty();
        SerializeableKeysMap serializeableKeysMap = this.customKeys;
        if (zIsEmpty) {
            return serializeableKeysMap.getKeys();
        }
        HashMap map2 = new HashMap(serializeableKeysMap.getKeys());
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strSanitizeString = KeysMap.sanitizeString(entry.getKey(), 1024);
            if (map2.size() < 64 || map2.containsKey(strSanitizeString)) {
                map2.put(strSanitizeString, KeysMap.sanitizeString(entry.getValue(), 1024));
            } else {
                i++;
            }
        }
        if (i > 0) {
            Logger.getLogger().m16784w("Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return Collections.unmodifiableMap(map2);
    }

    public Map<String, String> getInternalKeys() {
        return this.internalKeys.getKeys();
    }

    public List<CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutsState() {
        return this.rolloutsState.getReportRolloutsState();
    }

    @Nullable
    public String getUserId() {
        return this.userId.getReference();
    }

    public boolean setCustomKey(String str, String str2) {
        return this.customKeys.setKey(str, str2);
    }

    public void setCustomKeys(Map<String, String> map) {
        this.customKeys.setKeys(map);
    }

    public boolean setInternalKey(String str, String str2) {
        return this.internalKeys.setKey(str, str2);
    }

    public void setNewSession(final String str) {
        synchronized (this.sessionIdentifier) {
            this.sessionIdentifier = str;
            final Map<String, String> keys = this.customKeys.getKeys();
            final List<RolloutAssignment> rolloutAssignmentList = this.rolloutsState.getRolloutAssignmentList();
            this.crashlyticsWorkers.diskWrite.submit(new Runnable() { // from class: l.ufk0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    UserMetadata.m16816c(this.f178782a, str, keys, rolloutAssignmentList);
                }
            });
        }
    }

    public void setUserId(String str) {
        String strSanitizeString = KeysMap.sanitizeString(str, 1024);
        synchronized (this.userId) {
            try {
                if (CommonUtils.nullSafeEquals(strSanitizeString, this.userId.getReference())) {
                    return;
                }
                this.userId.set(strSanitizeString, true);
                this.crashlyticsWorkers.diskWrite.submit(new Runnable() { // from class: l.vfk0
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f183952a.serializeUserDataIfNeeded();
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean updateRolloutsState(List<RolloutAssignment> list) {
        synchronized (this.rolloutsState) {
            try {
                if (!this.rolloutsState.updateRolloutAssignmentList(list)) {
                    return false;
                }
                final List<RolloutAssignment> rolloutAssignmentList = this.rolloutsState.getRolloutAssignmentList();
                this.crashlyticsWorkers.diskWrite.submit(new Runnable() { // from class: l.tfk0
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        UserMetadata userMetadata = this.f173977a;
                        userMetadata.metaDataStore.writeRolloutState(userMetadata.sessionIdentifier, rolloutAssignmentList);
                    }
                });
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Map<String, String> getCustomKeys() {
        return this.customKeys.getKeys();
    }
}
