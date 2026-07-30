package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes7.dex */
public class HeartBeatInfoStorage {
    private static final String GLOBAL = "fire-global";
    private static final String HEARTBEAT_PREFERENCES_NAME = "FirebaseHeartBeat";
    private static final int HEART_BEAT_COUNT_LIMIT = 30;
    private static final String HEART_BEAT_COUNT_TAG = "fire-count";
    private static final String LAST_STORED_DATE = "last-used-date";
    private static final String PREFERENCES_NAME = "FirebaseAppHeartBeat";
    private static HeartBeatInfoStorage instance;
    private final SharedPreferences firebaseSharedPreferences;

    public HeartBeatInfoStorage(Context context, String str) {
        this.firebaseSharedPreferences = context.getSharedPreferences(HEARTBEAT_PREFERENCES_NAME + str, 0);
    }

    private synchronized void cleanUpStoredHeartBeats() {
        try {
            long j = this.firebaseSharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.firebaseSharedPreferences.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.firebaseSharedPreferences.edit().putStringSet(key, hashSet).putLong(HEART_BEAT_COUNT_TAG, j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized String getFormattedDate(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    private synchronized String getStoredUserAgentString(String str) {
        for (Map.Entry<String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private synchronized void removeStoredDate(String str) {
        try {
            String storedUserAgentString = getStoredUserAgentString(str);
            if (storedUserAgentString == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.firebaseSharedPreferences.getStringSet(storedUserAgentString, new HashSet()));
            hashSet.remove(str);
            boolean zIsEmpty = hashSet.isEmpty();
            SharedPreferences sharedPreferences = this.firebaseSharedPreferences;
            if (zIsEmpty) {
                sharedPreferences.edit().remove(storedUserAgentString).commit();
            } else {
                sharedPreferences.edit().putStringSet(storedUserAgentString, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void updateStoredUserAgent(String str, String str2) {
        removeStoredDate(str2);
        HashSet hashSet = new HashSet(this.firebaseSharedPreferences.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.firebaseSharedPreferences.edit().putStringSet(str, hashSet).commit();
    }

    public synchronized void deleteAllHeartBeats() {
        try {
            SharedPreferences.Editor editorEdit = this.firebaseSharedPreferences.edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String formattedDate = getFormattedDate(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(formattedDate)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(formattedDate);
                        i++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i == 0) {
                editorEdit.remove(HEART_BEAT_COUNT_TAG);
            } else {
                editorEdit.putLong(HEART_BEAT_COUNT_TAG, i);
            }
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized List<HeartBeatResult> getAllHeartBeats() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(getFormattedDate(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(HeartBeatResult.create(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            updateGlobalHeartBeat(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @VisibleForTesting
    public int getHeartBeatCount() {
        return (int) this.firebaseSharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0L);
    }

    public synchronized long getLastGlobalHeartBeat() {
        return this.firebaseSharedPreferences.getLong(GLOBAL, -1L);
    }

    public synchronized boolean isSameDateUtc(long j, long j2) {
        return getFormattedDate(j).equals(getFormattedDate(j2));
    }

    public synchronized void postHeartBeatCleanUp() {
        String formattedDate = getFormattedDate(System.currentTimeMillis());
        this.firebaseSharedPreferences.edit().putString(LAST_STORED_DATE, formattedDate).commit();
        removeStoredDate(formattedDate);
    }

    public synchronized boolean shouldSendGlobalHeartBeat(long j) {
        return shouldSendSdkHeartBeat(GLOBAL, j);
    }

    public synchronized boolean shouldSendSdkHeartBeat(String str, long j) {
        boolean zContains = this.firebaseSharedPreferences.contains(str);
        SharedPreferences sharedPreferences = this.firebaseSharedPreferences;
        if (!zContains) {
            sharedPreferences.edit().putLong(str, j).commit();
            return true;
        }
        if (isSameDateUtc(sharedPreferences.getLong(str, -1L), j)) {
            return false;
        }
        this.firebaseSharedPreferences.edit().putLong(str, j).commit();
        return true;
    }

    public synchronized void storeHeartBeat(long j, String str) {
        String formattedDate = getFormattedDate(j);
        if (this.firebaseSharedPreferences.getString(LAST_STORED_DATE, "").equals(formattedDate)) {
            String storedUserAgentString = getStoredUserAgentString(formattedDate);
            if (storedUserAgentString == null) {
                return;
            }
            if (storedUserAgentString.equals(str)) {
                return;
            }
            updateStoredUserAgent(str, formattedDate);
            return;
        }
        long j2 = this.firebaseSharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0L);
        if (j2 + 1 == 30) {
            cleanUpStoredHeartBeats();
            j2 = this.firebaseSharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0L);
        }
        HashSet hashSet = new HashSet(this.firebaseSharedPreferences.getStringSet(str, new HashSet()));
        hashSet.add(formattedDate);
        this.firebaseSharedPreferences.edit().putStringSet(str, hashSet).putLong(HEART_BEAT_COUNT_TAG, j2 + 1).putString(LAST_STORED_DATE, formattedDate).commit();
    }

    public synchronized void updateGlobalHeartBeat(long j) {
        this.firebaseSharedPreferences.edit().putLong(GLOBAL, j).commit();
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @VisibleForTesting
    public HeartBeatInfoStorage(SharedPreferences sharedPreferences) {
        this.firebaseSharedPreferences = sharedPreferences;
    }
}
