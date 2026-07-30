package com.p046mm.mmfile;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.p046mm.mmfile.core.FileWriteConfig;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes6.dex */
class MMFileUploader {
    private static final String THREAD_NAME = "MMFileUploader";
    private List<TimeConfig> configs;
    private boolean isPause;
    private Lock lock;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private TimeConfig nextConfig;

    public class ClockHandler extends Handler {
        public ClockHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            try {
                MMFileUploader.this.lock.lock();
                TimeConfig timeConfig = (TimeConfig) message.obj;
                final TimeConfig timeConfig2 = MMFileUploader.this.nextConfig;
                if (timeConfig != timeConfig2) {
                    Logger.m20636d("MMFile", "MMFileUploader: 被插队，放弃本次任务。old: %d, new: %d", Long.valueOf(timeConfig.getNextClockTime()), Long.valueOf(timeConfig2 == null ? -1L : timeConfig2.getNextClockTime()));
                } else {
                    Logger.m20636d("MMFile", "MMFileUploader: clock upload mmfile: %s", timeConfig2.toString());
                    RadarThreadUtil.run(new Runnable() { // from class: com.mm.mmfile.MMFileUploader.ClockHandler.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MMFileUploader.performUpload(timeConfig2);
                        }
                    });
                    MMFileUploader.this.nextConfig = null;
                    MMFileUploader.this.configs.remove(timeConfig2);
                    timeConfig2.nextTime();
                    MMFileUploader.this.enqueueUploadConfig(timeConfig2);
                }
            } finally {
                MMFileUploader.this.lock.unlock();
            }
        }
    }

    public static class Holder {
        private static final MMFileUploader sInstance = new MMFileUploader();

        private Holder() {
        }
    }

    public class TimeConfig {
        private FileUploadConfig fileUploadConfig;
        private long nextClockTime;

        public TimeConfig(FileUploadConfig fileUploadConfig) {
            this.fileUploadConfig = fileUploadConfig;
            nextTime();
        }

        public FileUploadConfig getFileUploadConfig() {
            return this.fileUploadConfig;
        }

        public long getNextClockTime() {
            return this.nextClockTime;
        }

        public void nextTime() {
            this.nextClockTime = SystemClock.uptimeMillis() + (this.fileUploadConfig.getUploadClockTimeSeconds() * 1000);
        }

        public String toString() {
            return "TimeConfig: " + hashCode() + "_" + this.fileUploadConfig.getUploadClockTimeSeconds();
        }
    }

    private MMFileUploader() {
        this.configs = new LinkedList();
        this.lock = new ReentrantLock();
        this.isPause = false;
    }

    private synchronized void checkThread() {
        if (this.mHandlerThread == null) {
            HandlerThread handlerThread = new HandlerThread(THREAD_NAME);
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            this.mHandler = new ClockHandler(this.mHandlerThread.getLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enqueueUploadConfig(TimeConfig timeConfig) {
        boolean zIsEmpty = this.configs.isEmpty();
        List<TimeConfig> list = this.configs;
        if (zIsEmpty) {
            list.add(timeConfig);
        } else {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (timeConfig.getNextClockTime() > this.configs.get(size).getNextClockTime()) {
                    this.configs.add(size + 1, timeConfig);
                }
            }
            this.configs.add(0, timeConfig);
        }
        Logger.m20636d("MMFile", "MMFileUploader: enqueueUploadConfig add uploadConfig: %s", timeConfig.toString());
        launchNextTask();
    }

    public static MMFileUploader get() {
        return Holder.sInstance;
    }

    private void launchNextTask() {
        if (this.isPause) {
            Logger.m20636d("MMFile", "mmfile upload task is paused", new Object[0]);
            return;
        }
        TimeConfig timeConfig = this.nextConfig;
        if (timeConfig != null) {
            if (timeConfig == this.configs.get(0)) {
                return;
            }
            Logger.m20636d("MMFile", "MMFileUploader: 插个队", new Object[0]);
            this.mHandler.removeMessages(1);
        }
        TimeConfig timeConfig2 = this.configs.get(0);
        this.nextConfig = timeConfig2;
        Logger.m20636d("MMFile", "MMFileUploader: next config: %s, time clock after: %d", timeConfig2.toString(), Long.valueOf(timeConfig2.getNextClockTime() - SystemClock.uptimeMillis()));
        Handler handler = this.mHandler;
        handler.sendMessageAtTime(Message.obtain(handler, 1, timeConfig2), timeConfig2.getNextClockTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void performUpload(TimeConfig timeConfig) {
        FileUploadConfig fileUploadConfig = timeConfig.getFileUploadConfig();
        FileWriteConfig fileWriteConfig = MMFileRegister.getFileWriteConfig(fileUploadConfig);
        MMFile ifCreated = MMFile.getIfCreated(fileWriteConfig);
        if (ifCreated != null) {
            ifCreated.flush();
        }
        File[] files = MMFileUtil.getFiles(fileWriteConfig, SortType.POSITIVE, 7, 20, true, true);
        if (ifCreated != null) {
            ifCreated.openNewLogFile();
        }
        if (files == null || files.length == 0) {
            Logger.m20639i("MMFile", "no file need to upload", new Object[0]);
            return;
        }
        Logger.m20639i("MMFile", "prepare to upload file size: %d", Integer.valueOf(files.length));
        for (File file : files) {
            uploadFile(fileUploadConfig, file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void uploadFile(FileUploadConfig fileUploadConfig, File file) {
        Logger.m20636d("MMFile", "MMFileUploader: uploadFile, %s", file.getAbsolutePath());
        if (file.exists()) {
            File file2 = new File(file.getParentFile(), System.currentTimeMillis() + "_" + file.getName());
            if (file2.exists()) {
                file2.delete();
            }
            file.renameTo(file2);
            if (!fileUploadConfig.getUploader().upload(file2)) {
                file2.renameTo(file);
            } else if (fileUploadConfig.isDeleteAfterUploaded()) {
                file2.delete();
            } else {
                file2.renameTo(file);
            }
        }
    }

    public void forceUploadMMFile() {
        Logger.m20636d("MMFile", "MMFileUploader: forceUploadMMFile", new Object[0]);
        try {
            this.lock.lock();
            if (!this.configs.isEmpty()) {
                for (final TimeConfig timeConfig : this.configs) {
                    RadarThreadUtil.run(new Runnable() { // from class: com.mm.mmfile.MMFileUploader.2
                        @Override // java.lang.Runnable
                        public void run() {
                            MMFileUploader.performUpload(timeConfig);
                        }
                    });
                }
            }
        } finally {
            this.lock.unlock();
        }
    }

    public void register(FileUploadConfig fileUploadConfig) {
        if (fileUploadConfig == null || fileUploadConfig.getUploadClockTimeSeconds() <= 0 || fileUploadConfig.getUploader() == null) {
            return;
        }
        checkThread();
        enqueueUploadConfig(fileUploadConfig);
    }

    public void setPause(boolean z) {
        boolean z2 = this.isPause;
        if (z2 == z) {
            return;
        }
        this.isPause = z;
        if (z2) {
            Logger.m20636d("MMFile", "resume upload task", new Object[0]);
            launchNextTask();
        } else {
            Logger.m20636d("MMFile", "pause upload task", new Object[0]);
            this.nextConfig = null;
            this.mHandler.removeMessages(1);
        }
    }

    public void setUploadClockTimeSeconds(FileUploadConfig fileUploadConfig, long j) {
        TimeConfig next;
        Logger.m20636d("MMFile", "MMFileUploader: setUploadClockTimeSeconds", new Object[0]);
        forceUploadMMFile();
        try {
            this.lock.lock();
            Iterator<TimeConfig> it = this.configs.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.getFileUploadConfig() != fileUploadConfig);
            if (next != null) {
                fileUploadConfig.setUploadClockTimeSeconds(j);
                next.nextTime();
                this.nextConfig = null;
                this.mHandler.removeMessages(1);
                this.configs.remove(next);
                enqueueUploadConfig(next);
            }
        } finally {
            this.lock.unlock();
        }
    }

    public void forceUploadMMFile(final String str) {
        final FileUploadConfig uploadConfigByFile = MMFileUtil.getUploadConfigByFile(str);
        if (uploadConfigByFile == null || uploadConfigByFile.getUploader() == null) {
            return;
        }
        RadarThreadUtil.run(new Runnable() { // from class: com.mm.mmfile.MMFileUploader.1
            @Override // java.lang.Runnable
            public void run() {
                MMFileUploader.uploadFile(uploadConfigByFile, new File(str));
            }
        });
    }

    private void enqueueUploadConfig(FileUploadConfig fileUploadConfig) {
        try {
            this.lock.lock();
            enqueueUploadConfig(new TimeConfig(fileUploadConfig));
        } finally {
            this.lock.unlock();
        }
    }
}
