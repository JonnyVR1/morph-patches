package com.tantanapp.media.ttmediautils.download;

import android.os.Process;
import com.tantanapp.media.ttmediautils.download.DownloadManager;
import com.tantanapp.media.ttmediautils.download.DownloadTask;
import com.tantanapp.media.ttmediautils.log.SLog;
import com.tantanapp.media.ttmediautils.task.NamedRunnable;
import com.tantanapp.media.ttmediautils.task.TaskManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public class DownloadManager {
    private static DownloadManager mDownloadManager;
    protected ArrayList<DownloadTask> mLstPause = new ArrayList<>();
    protected ArrayList<DownloadTask> mLstTodo = new ArrayList<>();
    protected ArrayList<DownloadTask> mLstDoing = new ArrayList<>();
    private AtomicInteger currentThreadNum = new AtomicInteger();
    private NamedRunnable mTaskRunnable = new NamedRunnable("download") { // from class: com.tantanapp.media.ttmediautils.download.DownloadManager.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(10);
                DownloadTask nextTask = DownloadManager.this.getNextTask();
                while (nextTask != null) {
                    DownloadManager.this.addDoingTask(nextTask);
                    try {
                        nextTask.run();
                    } catch (Throwable th) {
                        SLog.printStackTrace(th);
                        nextTask.onFail(th);
                    }
                    boolean zIsPaused = nextTask.isPaused();
                    DownloadManager downloadManager = DownloadManager.this;
                    if (zIsPaused) {
                        downloadManager.addPauseTask(nextTask);
                    } else {
                        downloadManager.removeDoingTask(nextTask);
                        nextTask.onDestroy();
                    }
                    nextTask = DownloadManager.this.getNextTask();
                }
            } catch (IllegalArgumentException e) {
                SLog.printStackTrace(e);
            } catch (SecurityException e2) {
                SLog.printStackTrace(e2);
            }
        }
    };

    private DownloadManager() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m82577a(Action1 action1, DownloadTask downloadTask, File file) {
        if (action1 != null) {
            action1.call(file);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m82578b(Action1 action1, DownloadTask downloadTask, Throwable th) {
        if (action1 != null) {
            action1.call(th);
        }
    }

    private synchronized void executeTask() {
        if (this.mLstTodo.size() > 0 && this.currentThreadNum.get() < 3) {
            TaskManager.startRunnableRequestInPool(this.mTaskRunnable, 2);
            this.currentThreadNum.incrementAndGet();
        }
    }

    public static DownloadManager getInstance() {
        if (mDownloadManager == null) {
            synchronized (DownloadManager.class) {
                try {
                    if (mDownloadManager == null) {
                        mDownloadManager = new DownloadManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mDownloadManager;
    }

    public synchronized void addDoingTask(DownloadTask downloadTask) {
        removeDoingTask(downloadTask);
        this.mLstDoing.add(downloadTask);
    }

    public synchronized void addPauseTask(DownloadTask downloadTask) {
        removeDoingTask(downloadTask);
        this.mLstPause.add(downloadTask);
    }

    public synchronized void addTodoTask(DownloadTask downloadTask) {
        this.mLstTodo.remove(downloadTask);
        this.mLstTodo.add(downloadTask);
    }

    public synchronized void clearTask() {
        DownloadTask downloadTask;
        try {
            if (this.mLstDoing.size() > 0) {
                downloadTask = this.mLstDoing.get(0);
                this.mLstDoing.remove(downloadTask);
            } else if (this.mLstTodo.size() > 0) {
                downloadTask = this.mLstTodo.get(0);
                this.mLstTodo.remove(downloadTask);
            } else if (this.mLstPause.size() > 0) {
                downloadTask = this.mLstPause.get(0);
                this.mLstPause.remove(downloadTask);
            } else {
                downloadTask = null;
            }
            if (downloadTask != null) {
                downloadTask.cancel();
                clearTask();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean contains(DownloadTask downloadTask) {
        return this.mLstTodo.contains(downloadTask) || this.mLstDoing.contains(downloadTask) || this.mLstPause.contains(downloadTask);
    }

    public void download(DownloadTask downloadTask) {
        if (downloadTask != null) {
            addTodoTask(downloadTask);
            executeTask();
        }
    }

    public DownloadTask downloadApk(String str, String str2, final Action1<File> action1, final Action1<Throwable> action2) {
        DownloadTask downloadTaskOnFail = new DownloadTask(str, str2).setBufferSize(16384).setUpdateInterval(500).onSuccess(new Action2() { // from class: l.o9e
            @Override // com.tantanapp.media.ttmediautils.download.Action2
            public final void call(Object obj, Object obj2) {
                DownloadManager.m82577a(action1, (DownloadTask) obj, (File) obj2);
            }
        }).onFail(new Action2() { // from class: l.q9e
            @Override // com.tantanapp.media.ttmediautils.download.Action2
            public final void call(Object obj, Object obj2) {
                DownloadManager.m82578b(action2, (DownloadTask) obj, (Throwable) obj2);
            }
        });
        download(downloadTaskOnFail);
        return downloadTaskOnFail;
    }

    public synchronized DownloadTask getDoingTaskByPath(String str) {
        for (DownloadTask downloadTask : this.mLstTodo) {
            if (downloadTask.getNetPath().equals(str)) {
                return downloadTask;
            }
        }
        for (DownloadTask downloadTask2 : this.mLstDoing) {
            if (downloadTask2.getNetPath().equals(str)) {
                return downloadTask2;
            }
        }
        for (DownloadTask downloadTask3 : this.mLstPause) {
            if (downloadTask3.getNetPath().equals(str)) {
                return downloadTask3;
            }
        }
        return null;
    }

    public DownloadTask getDownloadTask(int i) {
        return getTask(i);
    }

    public synchronized DownloadTask getNextTask() {
        DownloadTask downloadTask;
        try {
            if (this.mLstTodo.size() > 0) {
                downloadTask = this.mLstTodo.get(0);
                this.mLstTodo.remove(0);
            } else {
                downloadTask = null;
            }
            if (downloadTask == null) {
                this.currentThreadNum.decrementAndGet();
            }
        } catch (Throwable th) {
            throw th;
        }
        return downloadTask;
    }

    public synchronized DownloadTask getTask(int i) {
        for (DownloadTask downloadTask : this.mLstDoing) {
            if (downloadTask != null && downloadTask.hashCode() == i) {
                return downloadTask;
            }
        }
        for (DownloadTask downloadTask2 : this.mLstPause) {
            if (downloadTask2 != null && downloadTask2.hashCode() == i) {
                return downloadTask2;
            }
        }
        for (DownloadTask downloadTask3 : this.mLstTodo) {
            if (downloadTask3 != null && downloadTask3.hashCode() == i) {
                return downloadTask3;
            }
        }
        return null;
    }

    public synchronized boolean isDoing(String str) {
        boolean z;
        z = false;
        if (str != null) {
            try {
                Iterator<DownloadTask> it = this.mLstTodo.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getOriginPath())) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    Iterator<DownloadTask> it2 = this.mLstDoing.iterator();
                    while (it2.hasNext()) {
                        if (str.equals(it2.next().getOriginPath())) {
                            z = true;
                            break;
                        }
                    }
                }
                if (!z) {
                    Iterator<DownloadTask> it3 = this.mLstPause.iterator();
                    while (it3.hasNext()) {
                        if (str.equals(it3.next().getOriginPath())) {
                            z = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public void pauseTask(DownloadTask downloadTask) {
        if (downloadTask != null) {
            downloadTask.needPause();
        }
    }

    public synchronized void removeDoingTask(DownloadTask downloadTask) {
        this.mLstDoing.remove(downloadTask);
    }

    public synchronized void removeTask(DownloadTask downloadTask) {
        this.mLstTodo.remove(downloadTask);
        this.mLstDoing.remove(downloadTask);
        this.mLstPause.remove(downloadTask);
    }

    public synchronized void resumePauseTask(DownloadTask downloadTask) {
        if (this.mLstPause.contains(downloadTask)) {
            this.mLstPause.remove(downloadTask);
            downloadTask.needResume();
            this.mLstTodo.add(downloadTask);
        }
    }

    public void resumeTask(DownloadTask downloadTask) {
        if (downloadTask == null || !downloadTask.isPaused()) {
            return;
        }
        resumePauseTask(downloadTask);
        executeTask();
    }

    public void clearTask(DownloadTask downloadTask) {
        if (downloadTask != null) {
            removeTask(downloadTask);
            downloadTask.cancel();
        }
    }
}
