package com.tantanapp.media.ttmediautils.download;

import com.tantanapp.media.ttmediautils.log.SLog;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes12.dex */
public class DownloadTask {
    private String fileName;
    private int mBufferSize;
    protected long mFileLength;
    protected boolean mIsFirstRun;
    private String mLocalPath;
    private String mNetPath;
    private Action1<DownloadTask> mOnCancel;
    private Action2<DownloadTask, String> mOnConnect;
    private Action2<DownloadTask, Throwable> mOnFail;
    private Action2<DownloadTask, Integer> mOnLoading;
    private Action2<DownloadTask, Boolean> mOnPause;
    private Action1<DownloadTask> mOnStart;
    private Action2<DownloadTask, File> mOnSuccess;
    private String mOriginPath;
    protected int mPercent;
    protected int mRetryTime;
    private State mState;
    private int mUpdateInterval;
    protected long mUpdateTime;
    private URL mUrl;
    protected long mWriteLength;

    public enum State {
        NORMAL,
        NEED_PAUSE,
        NEED_RESUME,
        PAUSED,
        CANCEL
    }

    public DownloadTask(String str, File file, boolean z) {
        this.mUpdateTime = 0L;
        this.mIsFirstRun = false;
        this.mPercent = -1;
        this.mFileLength = 0L;
        this.mWriteLength = 0L;
        this.mRetryTime = 3;
        this.mNetPath = null;
        this.mOriginPath = null;
        this.mLocalPath = null;
        this.mBufferSize = 8192;
        this.mUpdateInterval = 16;
        this.mState = State.NORMAL;
        this.mOnStart = null;
        this.mOnConnect = null;
        this.mOnCancel = null;
        this.mOnLoading = null;
        this.mOnPause = null;
        this.mOnSuccess = null;
        this.mOnFail = null;
        this.mNetPath = str;
        this.mLocalPath = file.getAbsolutePath();
        this.mIsFirstRun = z;
        if (z && file.exists()) {
            this.mWriteLength = file.length();
        }
    }

    private String getDownLoadApkPath(String str) {
        try {
            String str2 = this.fileName;
            return str.replace(str2, URLEncoder.encode(str2, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            SLog.printStackTrace(e);
            return str;
        }
    }

    private boolean isDownLoadApkPath(String str) {
        try {
            URL url = new URL(str);
            this.mUrl = url;
            String file = url.getFile();
            String strSubstring = file.substring(file.lastIndexOf(47) + 1);
            this.fileName = strSubstring;
            return strSubstring.toLowerCase().endsWith(ShareConstants.PATCH_SUFFIX);
        } catch (MalformedURLException e) {
            SLog.printStackTrace(e);
            return false;
        }
    }

    public synchronized void cancel() {
        State state = this.mState;
        State state2 = State.CANCEL;
        if (state != state2) {
            this.mState = state2;
            onCancel();
            onDestroy();
        }
    }

    public int getBufferSize() {
        return this.mBufferSize;
    }

    public String getLocalPath() {
        return this.mLocalPath;
    }

    public String getNetPath() {
        return this.mNetPath;
    }

    public String getOriginPath() {
        return this.mOriginPath;
    }

    public int getPercent() {
        int iRound;
        long j = this.mFileLength;
        if (j <= 0 || (iRound = Math.round(((this.mWriteLength * 1.0f) * 100.0f) / j)) < 0) {
            return 0;
        }
        if (iRound > 100) {
            return 100;
        }
        return iRound;
    }

    public boolean isCancel() {
        return this.mState == State.CANCEL;
    }

    public boolean isNeedPause() {
        return this.mState == State.NEED_PAUSE;
    }

    public boolean isNeedResume() {
        return this.mState == State.NEED_RESUME;
    }

    public boolean isPaused() {
        return this.mState == State.PAUSED;
    }

    public synchronized void needPause() {
        if (this.mState == State.NORMAL) {
            this.mState = State.NEED_PAUSE;
        }
    }

    public synchronized void needResume() {
        if (this.mState == State.PAUSED) {
            this.mState = State.NEED_RESUME;
        }
    }

    public synchronized void onCancel() {
        Action1<DownloadTask> action1 = this.mOnCancel;
        if (action1 != null) {
            action1.call(this);
        }
    }

    public synchronized void onConnect(String str) {
        Action2<DownloadTask, String> action2 = this.mOnConnect;
        if (action2 != null) {
            action2.call(this, str);
        }
    }

    public synchronized void onDestroy() {
        this.mOnStart = null;
        this.mOnConnect = null;
        this.mOnCancel = null;
        this.mOnLoading = null;
        this.mOnPause = null;
        this.mOnSuccess = null;
        this.mOnFail = null;
    }

    public synchronized void onFail(Throwable th) {
        Action2<DownloadTask, Throwable> action2 = this.mOnFail;
        if (action2 != null) {
            action2.call(this, th);
        }
    }

    public synchronized void onLoading(int i) {
        Action2<DownloadTask, Integer> action2 = this.mOnLoading;
        if (action2 != null) {
            action2.call(this, Integer.valueOf(i));
        }
    }

    public synchronized void onPause(Boolean bool) {
        try {
            if (this.mState != State.CANCEL) {
                if (bool.booleanValue()) {
                    this.mState = State.PAUSED;
                } else {
                    this.mState = State.NORMAL;
                }
                Action2<DownloadTask, Boolean> action2 = this.mOnPause;
                if (action2 != null) {
                    action2.call(this, bool);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void onStart() {
        Action1<DownloadTask> action1 = this.mOnStart;
        if (action1 != null) {
            action1.call(this);
        }
    }

    public synchronized void onSuccess(File file) {
        Action2<DownloadTask, File> action2 = this.mOnSuccess;
        if (action2 != null) {
            action2.call(this, file);
        }
    }

    public void run() {
        State state;
        while (this.mRetryTime > 0 && (state = this.mState) != State.CANCEL && state != State.PAUSED) {
            HttpUtil.downloadFile(this);
        }
    }

    public DownloadTask setBufferSize(int i) {
        this.mBufferSize = i;
        return this;
    }

    public DownloadTask setUpdateInterval(int i) {
        this.mUpdateInterval = i;
        return this;
    }

    public void updatePercent() {
        int percent;
        if (this.mFileLength <= 0 || this.mWriteLength < 0) {
            return;
        }
        if ((this.mUpdateTime == 0 || Math.abs(System.currentTimeMillis() - this.mUpdateTime) > this.mUpdateInterval) && this.mPercent != (percent = getPercent())) {
            this.mUpdateTime = System.currentTimeMillis();
            onLoading(percent);
            this.mPercent = percent;
        }
    }

    public synchronized DownloadTask onCancel(Action1<DownloadTask> action1) {
        this.mOnCancel = action1;
        return this;
    }

    public synchronized DownloadTask onConnect(Action2<DownloadTask, String> action2) {
        this.mOnConnect = action2;
        return this;
    }

    public synchronized DownloadTask onFail(Action2<DownloadTask, Throwable> action2) {
        this.mOnFail = action2;
        return this;
    }

    public synchronized DownloadTask onStart(Action1<DownloadTask> action1) {
        this.mOnStart = action1;
        return this;
    }

    public synchronized DownloadTask onSuccess(Action2<DownloadTask, File> action2) {
        this.mOnSuccess = action2;
        return this;
    }

    public synchronized DownloadTask onLoading(Action2<DownloadTask, Integer> action2) {
        this.mOnLoading = action2;
        return this;
    }

    public synchronized DownloadTask onPause(Action2<DownloadTask, Boolean> action2) {
        this.mOnPause = action2;
        return this;
    }

    public DownloadTask(String str, String str2) {
        this.mUpdateTime = 0L;
        this.mIsFirstRun = false;
        this.mPercent = -1;
        this.mFileLength = 0L;
        this.mWriteLength = 0L;
        this.mRetryTime = 3;
        this.mNetPath = null;
        this.mOriginPath = null;
        this.mLocalPath = null;
        this.mBufferSize = 8192;
        this.mUpdateInterval = 16;
        this.mState = State.NORMAL;
        this.mOnStart = null;
        this.mOnConnect = null;
        this.mOnCancel = null;
        this.mOnLoading = null;
        this.mOnPause = null;
        this.mOnSuccess = null;
        this.mOnFail = null;
        if (isDownLoadApkPath(str)) {
            this.mNetPath = getDownLoadApkPath(str);
        } else {
            this.mNetPath = str;
        }
        this.mOriginPath = str;
        this.mLocalPath = str2;
    }
}
