package org.eclipse.jetty.util;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.eclipse.jetty.util.component.AbstractLifeCycle;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Scanner extends AbstractLifeCycle {
    private static final Logger LOG = Log.getLogger((Class<?>) Scanner.class);
    private static int __scannerId = 0;
    private FilenameFilter _filter;
    private int _scanInterval;
    private TimerTask _task;
    private Timer _timer;
    private int _scanCount = 0;
    private final List<Listener> _listeners = new ArrayList();
    private final Map<String, TimeNSize> _prevScan = new HashMap();
    private final Map<String, TimeNSize> _currentScan = new HashMap();
    private final List<File> _scanDirs = new ArrayList();
    private volatile boolean _running = false;
    private boolean _reportExisting = true;
    private boolean _reportDirs = true;
    private int _scanDepth = 0;
    private final Map<String, Notification> _notifications = new HashMap();

    /* JADX INFO: renamed from: org.eclipse.jetty.util.Scanner$2 */
    public static /* synthetic */ class C07512 {
        static final /* synthetic */ int[] $SwitchMap$org$eclipse$jetty$util$Scanner$Notification;

        static {
            int[] iArr = new int[Notification.values().length];
            $SwitchMap$org$eclipse$jetty$util$Scanner$Notification = iArr;
            try {
                iArr[Notification.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$eclipse$jetty$util$Scanner$Notification[Notification.CHANGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$eclipse$jetty$util$Scanner$Notification[Notification.ADDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface BulkListener extends Listener {
        void filesChanged(List<String> list) throws Exception;
    }

    public interface DiscreteListener extends Listener {
        void fileAdded(String str) throws Exception;

        void fileChanged(String str) throws Exception;

        void fileRemoved(String str) throws Exception;
    }

    public interface Listener {
    }

    public enum Notification {
        ADDED,
        CHANGED,
        REMOVED
    }

    public interface ScanCycleListener extends Listener {
        void scanEnded(int i) throws Exception;

        void scanStarted(int i) throws Exception;
    }

    public interface ScanListener extends Listener {
        void scan();
    }

    public static class TimeNSize {
        final long _lastModified;
        final long _size;

        public TimeNSize(long j, long j2) {
            this._lastModified = j;
            this._size = j2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof TimeNSize) {
                TimeNSize timeNSize = (TimeNSize) obj;
                if (timeNSize._lastModified == this._lastModified && timeNSize._size == this._size) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((int) this._size) ^ ((int) this._lastModified);
        }

        public String toString() {
            return "[lm=" + this._lastModified + ",s=" + this._size + "]";
        }
    }

    private void reportAddition(String str) {
        for (Listener listener : this._listeners) {
            try {
                if (listener instanceof DiscreteListener) {
                    ((DiscreteListener) listener).fileAdded(str);
                }
            } catch (Error e) {
                warn(listener, str, e);
            } catch (Exception e2) {
                warn(listener, str, e2);
            }
        }
    }

    private void reportBulkChanges(List<String> list) {
        for (Listener listener : this._listeners) {
            try {
                if (listener instanceof BulkListener) {
                    ((BulkListener) listener).filesChanged(list);
                }
            } catch (Error e) {
                warn(listener, list.toString(), e);
            } catch (Exception e2) {
                warn(listener, list.toString(), e2);
            }
        }
    }

    private void reportChange(String str) {
        for (Listener listener : this._listeners) {
            try {
                if (listener instanceof DiscreteListener) {
                    ((DiscreteListener) listener).fileChanged(str);
                }
            } catch (Error e) {
                warn(listener, str, e);
            } catch (Exception e2) {
                warn(listener, str, e2);
            }
        }
    }

    private void reportRemoval(String str) {
        for (Listener listener : this._listeners) {
            try {
                if (listener instanceof DiscreteListener) {
                    ((DiscreteListener) listener).fileRemoved(str);
                }
            } catch (Error e) {
                warn(listener, str, e);
            } catch (Exception e2) {
                warn(listener, str, e2);
            }
        }
    }

    private void reportScanEnd(int i) {
        for (Listener listener : this._listeners) {
            try {
                if (listener instanceof ScanCycleListener) {
                    ((ScanCycleListener) listener).scanEnded(i);
                }
            } catch (Exception e) {
                LOG.warn(listener + " failed on scan end for cycle " + i, e);
            }
        }
    }

    private void reportScanStart(int i) {
        for (Listener listener : this._listeners) {
            try {
                if (listener instanceof ScanCycleListener) {
                    ((ScanCycleListener) listener).scanStarted(i);
                }
            } catch (Exception e) {
                LOG.warn(listener + " failed on scan start for cycle " + i, e);
            }
        }
    }

    private void scanFile(File file, Map<String, TimeNSize> map, int i) {
        FilenameFilter filenameFilter;
        try {
            if (file.exists()) {
                if ((file.isFile() || (i > 0 && this._reportDirs && file.isDirectory())) && ((filenameFilter = this._filter) == null || (filenameFilter != null && filenameFilter.accept(file.getParentFile(), file.getName())))) {
                    map.put(file.getCanonicalPath(), new TimeNSize(file.lastModified(), file.length()));
                }
                if (file.isDirectory()) {
                    int i2 = this._scanDepth;
                    if (i < i2 || i2 == -1 || this._scanDirs.contains(file)) {
                        for (File file2 : file.listFiles()) {
                            scanFile(file2, map, i + 1);
                        }
                    }
                }
            }
        } catch (IOException e) {
            LOG.warn("Error scanning watched files", e);
        }
    }

    private void warn(Object obj, String str, Throwable th) {
        LOG.warn(obj + " failed on '" + str, th);
    }

    public synchronized void addListener(Listener listener) {
        if (listener == null) {
            return;
        }
        this._listeners.add(listener);
    }

    public synchronized void addScanDir(File file) {
        this._scanDirs.add(file);
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public synchronized void doStart() {
        try {
            if (this._running) {
                return;
            }
            this._running = true;
            if (this._reportExisting) {
                scan();
                scan();
            } else {
                scanFiles();
                this._prevScan.putAll(this._currentScan);
            }
            schedule();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public synchronized void doStop() {
        try {
            if (this._running) {
                this._running = false;
                Timer timer = this._timer;
                if (timer != null) {
                    timer.cancel();
                }
                TimerTask timerTask = this._task;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                this._task = null;
                this._timer = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public FilenameFilter getFilenameFilter() {
        return this._filter;
    }

    public boolean getRecursive() {
        return this._scanDepth == -1;
    }

    public boolean getReportDirs() {
        return this._reportDirs;
    }

    public boolean getReportExistingFilesOnStartup() {
        return this._reportExisting;
    }

    public int getScanDepth() {
        return this._scanDepth;
    }

    @Deprecated
    public File getScanDir() {
        List<File> list = this._scanDirs;
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    public List<File> getScanDirs() {
        return Collections.unmodifiableList(this._scanDirs);
    }

    public int getScanInterval() {
        return this._scanInterval;
    }

    public Timer newTimer() {
        StringBuilder sb = new StringBuilder("Scanner-");
        int i = __scannerId;
        __scannerId = i + 1;
        sb.append(i);
        return new Timer(sb.toString(), true);
    }

    public TimerTask newTimerTask() {
        return new TimerTask() { // from class: org.eclipse.jetty.util.Scanner.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Scanner.this.scan();
            }
        };
    }

    public synchronized void removeListener(Listener listener) {
        if (listener == null) {
            return;
        }
        this._listeners.remove(listener);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0137 A[SYNTHETIC] */
    public synchronized void reportDifferences(Map<String, TimeNSize> map, Map<String, TimeNSize> map2) {
        int i;
        Notification notificationPut;
        int i2;
        Notification notificationPut2;
        try {
            HashSet hashSet = new HashSet(map2.keySet());
            Iterator<Map.Entry<String, TimeNSize>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (!hashSet.contains(key)) {
                    Notification notificationPut3 = this._notifications.put(key, Notification.ADDED);
                    if (notificationPut3 != null && ((i2 = C07512.$SwitchMap$org$eclipse$jetty$util$Scanner$Notification[notificationPut3.ordinal()]) == 1 || i2 == 2)) {
                        this._notifications.put(key, Notification.CHANGED);
                    }
                } else if (!map2.get(key).equals(map.get(key)) && (notificationPut2 = this._notifications.put(key, Notification.CHANGED)) != null && C07512.$SwitchMap$org$eclipse$jetty$util$Scanner$Notification[notificationPut2.ordinal()] == 3) {
                    this._notifications.put(key, Notification.ADDED);
                }
            }
            for (String str : map2.keySet()) {
                if (!map.containsKey(str) && (notificationPut = this._notifications.put(str, Notification.REMOVED)) != null && C07512.$SwitchMap$org$eclipse$jetty$util$Scanner$Notification[notificationPut.ordinal()] == 3) {
                    this._notifications.remove(str);
                }
            }
            Logger logger = LOG;
            if (logger.isDebugEnabled()) {
                logger.debug("scanned " + this._scanDirs + ": " + this._notifications, new Object[0]);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, Notification>> it2 = this._notifications.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, Notification> next = it2.next();
                String key2 = next.getKey();
                if (map2.containsKey(key2)) {
                    if (map2.get(key2).equals(map.get(key2))) {
                        Notification value = next.getValue();
                        it2.remove();
                        arrayList.add(key2);
                        i = C07512.$SwitchMap$org$eclipse$jetty$util$Scanner$Notification[value.ordinal()];
                        if (i != 1) {
                            reportRemoval(key2);
                        } else if (i != 2) {
                            reportChange(key2);
                        } else if (i != 3) {
                            reportAddition(key2);
                        }
                    }
                } else if (!map.containsKey(key2)) {
                    Notification value2 = next.getValue();
                    it2.remove();
                    arrayList.add(key2);
                    i = C07512.$SwitchMap$org$eclipse$jetty$util$Scanner$Notification[value2.ordinal()];
                    if (i != 1) {
                        reportRemoval(key2);
                    } else if (i != 2) {
                        reportChange(key2);
                    } else if (i != 3) {
                        reportAddition(key2);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                reportBulkChanges(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void scan() {
        try {
            int i = this._scanCount + 1;
            this._scanCount = i;
            reportScanStart(i);
            scanFiles();
            reportDifferences(this._currentScan, this._prevScan);
            this._prevScan.clear();
            this._prevScan.putAll(this._currentScan);
            reportScanEnd(this._scanCount);
            for (Listener listener : this._listeners) {
                try {
                    try {
                        if (listener instanceof ScanListener) {
                            ((ScanListener) listener).scan();
                        }
                    } catch (Exception e) {
                        LOG.warn(e);
                    }
                } catch (Error e2) {
                    LOG.warn(e2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void scanFiles() {
        if (this._scanDirs == null) {
            return;
        }
        this._currentScan.clear();
        for (File file : this._scanDirs) {
            if (file != null && file.exists()) {
                try {
                    scanFile(file.getCanonicalFile(), this._currentScan, 0);
                } catch (IOException e) {
                    LOG.warn("Error scanning files.", e);
                }
            }
        }
    }

    public void schedule() {
        if (this._running) {
            Timer timer = this._timer;
            if (timer != null) {
                timer.cancel();
            }
            TimerTask timerTask = this._task;
            if (timerTask != null) {
                timerTask.cancel();
            }
            if (getScanInterval() > 0) {
                this._timer = newTimer();
                TimerTask timerTaskNewTimerTask = newTimerTask();
                this._task = timerTaskNewTimerTask;
                this._timer.schedule(timerTaskNewTimerTask, ((long) getScanInterval()) * 1010, 1010 * ((long) getScanInterval()));
            }
        }
    }

    public void setFilenameFilter(FilenameFilter filenameFilter) {
        this._filter = filenameFilter;
    }

    public void setRecursive(boolean z) {
        this._scanDepth = z ? -1 : 0;
    }

    public void setReportDirs(boolean z) {
        this._reportDirs = z;
    }

    public void setReportExistingFilesOnStartup(boolean z) {
        this._reportExisting = z;
    }

    public void setScanDepth(int i) {
        this._scanDepth = i;
    }

    @Deprecated
    public void setScanDir(File file) {
        this._scanDirs.clear();
        this._scanDirs.add(file);
    }

    public void setScanDirs(List<File> list) {
        this._scanDirs.clear();
        this._scanDirs.addAll(list);
    }

    public synchronized void setScanInterval(int i) {
        this._scanInterval = i;
        schedule();
    }
}
