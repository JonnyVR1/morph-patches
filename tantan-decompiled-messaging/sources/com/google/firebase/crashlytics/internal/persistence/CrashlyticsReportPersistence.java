package com.google.firebase.crashlytics.internal.persistence;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public class CrashlyticsReportPersistence {
    private static final String EVENT_COUNTER_FORMAT = "%010d";
    private static final int EVENT_COUNTER_WIDTH = 10;
    private static final String EVENT_FILE_NAME_PREFIX = "event";
    private static final int MAX_OPEN_SESSIONS = 8;
    private static final String NORMAL_EVENT_SUFFIX = "";
    private static final String PRIORITY_EVENT_SUFFIX = "_";
    private static final String REPORT_FILE_NAME = "report";
    private static final String SESSION_START_TIMESTAMP_FILE_NAME = "start-time";
    private final AtomicInteger eventCounter = new AtomicInteger(0);
    private final FileStore fileStore;
    private final CrashlyticsAppQualitySessionsSubscriber sessionsSubscriber;
    private final SettingsProvider settingsProvider;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final int EVENT_NAME_LENGTH = 15;
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private static final Comparator<? super File> LATEST_SESSION_ID_FIRST_COMPARATOR = new Comparator() { // from class: l.btb
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    };
    private static final FilenameFilter EVENT_FILE_FILTER = new FilenameFilter() { // from class: l.ctb
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("event");
        }
    };

    public CrashlyticsReportPersistence(FileStore fileStore, SettingsProvider settingsProvider, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        this.fileStore = fileStore;
        this.settingsProvider = settingsProvider;
        this.sessionsSubscriber = crashlyticsAppQualitySessionsSubscriber;
    }

    private SortedSet<String> capAndGetOpenSessions(@Nullable String str) {
        this.fileStore.cleanupPreviousFileSystems();
        SortedSet<String> openSessionIds = getOpenSessionIds();
        if (str != null) {
            openSessionIds.remove(str);
        }
        if (openSessionIds.size() > 8) {
            while (openSessionIds.size() > 8) {
                String strLast = openSessionIds.last();
                Logger.getLogger().m16721d("Removing session over cap: " + strLast);
                this.fileStore.deleteSessionFiles(strLast);
                openSessionIds.remove(strLast);
            }
        }
        return openSessionIds;
    }

    private static int capFilesCount(List<File> list, int i) {
        int size = list.size();
        for (File file : list) {
            if (size <= i) {
                break;
            }
            FileStore.recursiveDelete(file);
            size--;
        }
        return size;
    }

    private void capFinalizedReports() {
        int i = this.settingsProvider.getSettingsSync().sessionData.maxCompleteSessionsCount;
        List<File> allFinalizedReportFiles = getAllFinalizedReportFiles();
        int size = allFinalizedReportFiles.size();
        if (size <= i) {
            return;
        }
        Iterator<File> it = allFinalizedReportFiles.subList(i, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static long convertTimestampFromSecondsToMs(long j) {
        return j * 1000;
    }

    private void deleteFiles(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    @NonNull
    private static String generateEventFilename(int i, boolean z) {
        return "event" + String.format(Locale.US, EVENT_COUNTER_FORMAT, Integer.valueOf(i)) + (z ? PRIORITY_EVENT_SUFFIX : "");
    }

    private List<File> getAllFinalizedReportFiles() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.fileStore.getPriorityReports());
        arrayList.addAll(this.fileStore.getNativeReports());
        Comparator<? super File> comparator = LATEST_SESSION_ID_FIRST_COMPARATOR;
        Collections.sort(arrayList, comparator);
        List<File> reports = this.fileStore.getReports();
        Collections.sort(reports, comparator);
        arrayList.addAll(reports);
        return arrayList;
    }

    @NonNull
    private static String getEventNameWithoutPriority(@NonNull String str) {
        return str.substring(0, EVENT_NAME_LENGTH);
    }

    private static boolean isHighPriorityEventFile(@NonNull String str) {
        return str.startsWith("event") && str.endsWith(PRIORITY_EVENT_SUFFIX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNormalPriorityEventFile(@NonNull File file, @NonNull String str) {
        return str.startsWith("event") && !str.endsWith(PRIORITY_EVENT_SUFFIX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int oldestEventFileFirst(@NonNull File file, @NonNull File file2) {
        return getEventNameWithoutPriority(file.getName()).compareTo(getEventNameWithoutPriority(file2.getName()));
    }

    @NonNull
    private static String readTextFile(@NonNull File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), UTF_8);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private void synthesizeNativeReportFile(@NonNull File file, @NonNull CrashlyticsReport.FilesPayload filesPayload, @NonNull String str, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        String appQualitySessionId = this.sessionsSubscriber.getAppQualitySessionId(str);
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = TRANSFORM;
            writeTextFile(this.fileStore.getNativeReport(str), crashlyticsReportJsonTransform.reportToJson(crashlyticsReportJsonTransform.reportFromJson(readTextFile(file)).withNdkPayload(filesPayload).withApplicationExitInfo(applicationExitInfo).withAppQualitySessionId(appQualitySessionId)));
        } catch (IOException e) {
            Logger.getLogger().m16730w("Could not synthesize final native report file for " + file, e);
        }
    }

    private void synthesizeReport(String str, long j) {
        boolean z;
        List<File> sessionFiles = this.fileStore.getSessionFiles(str, EVENT_FILE_FILTER);
        if (sessionFiles.isEmpty()) {
            Logger.getLogger().m16727v("Session " + str + " has no events.");
            return;
        }
        Collections.sort(sessionFiles);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = sessionFiles.iterator();
        loop0: while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File next = it.next();
                try {
                    arrayList.add(TRANSFORM.eventFromJson(readTextFile(next)));
                    if (z || isHighPriorityEventFile(next.getName())) {
                        z = true;
                    }
                } catch (IOException e) {
                    Logger.getLogger().m16730w("Could not add event to report for " + next, e);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            synthesizeReportFile(this.fileStore.getSessionFile(str, "report"), arrayList, j, z, UserMetadata.readUserId(str, this.fileStore), this.sessionsSubscriber.getAppQualitySessionId(str));
        } else {
            Logger.getLogger().m16729w("Could not parse event files for session " + str);
        }
    }

    private void synthesizeReportFile(@NonNull File file, @NonNull List<CrashlyticsReport.Session.Event> list, long j, boolean z, @Nullable String str, @Nullable String str2) {
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = TRANSFORM;
            CrashlyticsReport crashlyticsReportWithEvents = crashlyticsReportJsonTransform.reportFromJson(readTextFile(file)).withSessionEndFields(j, z, str).withAppQualitySessionId(str2).withEvents(list);
            CrashlyticsReport.Session session = crashlyticsReportWithEvents.getSession();
            if (session == null) {
                return;
            }
            Logger.getLogger().m16721d("appQualitySessionId: " + str2);
            FileStore fileStore = this.fileStore;
            writeTextFile(z ? fileStore.getPriorityReport(session.getIdentifier()) : fileStore.getReport(session.getIdentifier()), crashlyticsReportJsonTransform.reportToJson(crashlyticsReportWithEvents));
        } catch (IOException e) {
            Logger.getLogger().m16730w("Could not synthesize final report file for " + file, e);
        }
    }

    private int trimEvents(String str, int i) {
        List<File> sessionFiles = this.fileStore.getSessionFiles(str, new FilenameFilter() { // from class: l.dtb
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return CrashlyticsReportPersistence.isNormalPriorityEventFile(file, str2);
            }
        });
        Collections.sort(sessionFiles, new Comparator() { // from class: l.etb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CrashlyticsReportPersistence.oldestEventFileFirst((File) obj, (File) obj2);
            }
        });
        return capFilesCount(sessionFiles, i);
    }

    private static void writeTextFile(File file, String str, long j) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), UTF_8);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(convertTimestampFromSecondsToMs(j));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void deleteAllReports() {
        deleteFiles(this.fileStore.getReports());
        deleteFiles(this.fileStore.getPriorityReports());
        deleteFiles(this.fileStore.getNativeReports());
    }

    public void finalizeReports(@Nullable String str, long j) {
        for (String str2 : capAndGetOpenSessions(str)) {
            Logger.getLogger().m16727v("Finalizing report for session " + str2);
            synthesizeReport(str2, j);
            this.fileStore.deleteSessionFiles(str2);
        }
        capFinalizedReports();
    }

    public void finalizeSessionWithNativeEvent(String str, CrashlyticsReport.FilesPayload filesPayload, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        File sessionFile = this.fileStore.getSessionFile(str, "report");
        Logger.getLogger().m16721d("Writing native session report for " + str + " to file: " + sessionFile);
        synthesizeNativeReportFile(sessionFile, filesPayload, str, applicationExitInfo);
    }

    public SortedSet<String> getOpenSessionIds() {
        return new TreeSet(this.fileStore.getAllOpenSessionIds()).descendingSet();
    }

    public long getStartTimestampMillis(String str) {
        return this.fileStore.getSessionFile(str, SESSION_START_TIMESTAMP_FILE_NAME).lastModified();
    }

    public boolean hasFinalizedReports() {
        return (this.fileStore.getReports().isEmpty() && this.fileStore.getPriorityReports().isEmpty() && this.fileStore.getNativeReports().isEmpty()) ? false : true;
    }

    @NonNull
    public List<CrashlyticsReportWithSessionId> loadFinalizedReports() {
        List<File> allFinalizedReportFiles = getAllFinalizedReportFiles();
        ArrayList arrayList = new ArrayList();
        for (File file : allFinalizedReportFiles) {
            try {
                arrayList.add(CrashlyticsReportWithSessionId.create(TRANSFORM.reportFromJson(readTextFile(file)), file.getName(), file));
            } catch (IOException e) {
                Logger.getLogger().m16730w("Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        return arrayList;
    }

    public void persistEvent(@NonNull CrashlyticsReport.Session.Event event, @NonNull String str, boolean z) {
        int i = this.settingsProvider.getSettingsSync().sessionData.maxCustomExceptionEvents;
        try {
            writeTextFile(this.fileStore.getSessionFile(str, generateEventFilename(this.eventCounter.getAndIncrement(), z)), TRANSFORM.eventToJson(event));
        } catch (IOException e) {
            Logger.getLogger().m16730w("Could not persist event for session " + str, e);
        }
        trimEvents(str, i);
    }

    public void persistReport(@NonNull CrashlyticsReport crashlyticsReport) {
        CrashlyticsReport.Session session = crashlyticsReport.getSession();
        if (session == null) {
            Logger.getLogger().m16721d("Could not get session for report");
            return;
        }
        String identifier = session.getIdentifier();
        try {
            writeTextFile(this.fileStore.getSessionFile(identifier, "report"), TRANSFORM.reportToJson(crashlyticsReport));
            writeTextFile(this.fileStore.getSessionFile(identifier, SESSION_START_TIMESTAMP_FILE_NAME), "", session.getStartedAt());
        } catch (IOException e) {
            Logger.getLogger().m16722d("Could not persist report for session " + identifier, e);
        }
    }

    private static void writeTextFile(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), UTF_8);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void persistEvent(@NonNull CrashlyticsReport.Session.Event event, @NonNull String str) {
        persistEvent(event, str, false);
    }
}
