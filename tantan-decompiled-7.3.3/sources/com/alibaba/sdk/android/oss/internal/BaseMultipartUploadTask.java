package com.alibaba.sdk.android.oss.internal;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.TaskCancelException;
import com.alibaba.sdk.android.oss.callback.OSSCompletedCallback;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.BinaryUtil;
import com.alibaba.sdk.android.oss.model.CompleteMultipartUploadRequest;
import com.alibaba.sdk.android.oss.model.CompleteMultipartUploadResult;
import com.alibaba.sdk.android.oss.model.MultipartUploadRequest;
import com.alibaba.sdk.android.oss.model.OSSRequest;
import com.alibaba.sdk.android.oss.model.ObjectMetadata;
import com.alibaba.sdk.android.oss.model.PartETag;
import com.alibaba.sdk.android.oss.model.UploadPartRequest;
import com.alibaba.sdk.android.oss.model.UploadPartResult;
import com.alibaba.sdk.android.oss.network.ExecutionContext;
import com.clevertap.android.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMultipartUploadTask<Request extends MultipartUploadRequest, Result extends CompleteMultipartUploadResult> implements Callable<Result> {
    protected final int CPU_SIZE;
    protected final int KEEP_ALIVE_TIME;
    protected final int MAX_CORE_POOL_SIZE;
    protected final int MAX_IMUM_POOL_SIZE;
    protected final int MAX_QUEUE_SIZE;
    protected final int PART_SIZE_ALIGN_NUM;
    protected InternalRequestOperation mApiOperation;
    protected boolean mCheckCRC64;
    protected OSSCompletedCallback<Request, Result> mCompletedCallback;
    protected ExecutionContext mContext;
    protected long mFileLength;
    protected boolean mIsCancel;
    protected long mLastPartSize;
    protected Object mLock;
    protected int[] mPartAttr;
    protected List<PartETag> mPartETags;
    protected int mPartExceptionCount;
    protected ThreadPoolExecutor mPoolExecutor;
    protected OSSProgressCallback<Request> mProgressCallback;
    protected Request mRequest;
    protected int mRunPartTaskCount;
    protected Exception mUploadException;
    protected File mUploadFile;
    protected String mUploadFilePath;
    protected String mUploadId;
    protected Uri mUploadUri;
    protected long mUploadedLength;

    public BaseMultipartUploadTask(InternalRequestOperation internalRequestOperation, Request request, OSSCompletedCallback<Request, Result> oSSCompletedCallback, ExecutionContext executionContext) {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors() * 2;
        this.CPU_SIZE = iAvailableProcessors;
        int iIntValue = iAvailableProcessors < 5 ? iAvailableProcessors : 5;
        this.MAX_CORE_POOL_SIZE = iIntValue;
        this.MAX_IMUM_POOL_SIZE = iAvailableProcessors;
        this.KEEP_ALIVE_TIME = 3000;
        this.MAX_QUEUE_SIZE = 5000;
        this.PART_SIZE_ALIGN_NUM = 4096;
        this.mPartETags = new ArrayList();
        this.mLock = new Object();
        this.mUploadedLength = 0L;
        this.mCheckCRC64 = false;
        this.mPartAttr = new int[2];
        this.mApiOperation = internalRequestOperation;
        this.mRequest = request;
        this.mProgressCallback = request.getProgressCallback();
        this.mCompletedCallback = oSSCompletedCallback;
        this.mContext = executionContext;
        this.mCheckCRC64 = request.getCRC64() == OSSRequest.CRC64Config.YES;
        if (request.getThreadNum() != null && request.getThreadNum().intValue() > 0) {
            iIntValue = request.getThreadNum().intValue();
            iAvailableProcessors = request.getThreadNum().intValue();
        }
        this.mPoolExecutor = new ThreadPoolExecutor(iIntValue, iAvailableProcessors, 3000L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(5000), new ThreadFactory() { // from class: com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "oss-android-multipart-thread");
            }
        });
    }

    public abstract void abortThisUpload();

    @Override // java.util.concurrent.Callable
    public Result call() throws Exception {
        try {
            checkInitData();
            initMultipartUploadId();
            Result result = (Result) doMultipartUpload();
            OSSCompletedCallback<Request, Result> oSSCompletedCallback = this.mCompletedCallback;
            if (oSSCompletedCallback == null) {
                return result;
            }
            oSSCompletedCallback.onSuccess(this.mRequest, result);
            return result;
        } catch (ServiceException e) {
            OSSCompletedCallback<Request, Result> oSSCompletedCallback2 = this.mCompletedCallback;
            if (oSSCompletedCallback2 != null) {
                oSSCompletedCallback2.onFailure(this.mRequest, null, e);
            }
            throw e;
        } catch (Exception e2) {
            ClientException clientException = e2 instanceof ClientException ? (ClientException) e2 : new ClientException(e2.toString(), e2);
            OSSCompletedCallback<Request, Result> oSSCompletedCallback3 = this.mCompletedCallback;
            if (oSSCompletedCallback3 != null) {
                oSSCompletedCallback3.onFailure(this.mRequest, clientException, null);
            }
            throw clientException;
        }
    }

    public long ceilPartSize(long j) {
        return ((j + 4095) / 4096) * 4096;
    }

    public void checkCancel() throws ClientException {
        if (this.mContext.getCancellationHandler().isCancelled()) {
            TaskCancelException taskCancelException = new TaskCancelException("multipart cancel");
            throw new ClientException(taskCancelException.getMessage(), taskCancelException, Boolean.TRUE);
        }
    }

    public void checkException() throws ServiceException, ClientException, IOException {
        if (this.mUploadException != null) {
            releasePool();
            Exception exc = this.mUploadException;
            if (exc instanceof IOException) {
                throw ((IOException) exc);
            }
            if (exc instanceof ServiceException) {
                throw ((ServiceException) exc);
            }
            if (!(exc instanceof ClientException)) {
                throw new ClientException(this.mUploadException.getMessage(), this.mUploadException);
            }
            throw ((ClientException) exc);
        }
    }

    public void checkInitData() throws ClientException {
        String uploadFilePath = this.mRequest.getUploadFilePath();
        Request request = this.mRequest;
        if (uploadFilePath != null) {
            this.mUploadFilePath = request.getUploadFilePath();
            this.mUploadedLength = 0L;
            File file = new File(this.mUploadFilePath);
            this.mUploadFile = file;
            this.mFileLength = file.length();
        } else if (request.getUploadUri() != null) {
            this.mUploadUri = this.mRequest.getUploadUri();
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = null;
            try {
                try {
                    parcelFileDescriptorOpenFileDescriptor = this.mContext.getApplicationContext().getContentResolver().openFileDescriptor(this.mUploadUri, "r");
                    this.mFileLength = parcelFileDescriptorOpenFileDescriptor.getStatSize();
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (IOException e) {
                        OSSLog.logThrowable2Local(e);
                    }
                } catch (IOException e2) {
                    throw new ClientException(e2.getMessage(), e2, Boolean.TRUE);
                }
            } catch (Throwable th) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (IOException e3) {
                        OSSLog.logThrowable2Local(e3);
                    }
                }
                throw th;
            }
        }
        if (this.mFileLength == 0) {
            throw new ClientException("file length must not be 0");
        }
        checkPartSize(this.mPartAttr);
        long partSize = this.mRequest.getPartSize();
        int i = this.mPartAttr[1];
        OSSLog.logDebug("[checkInitData] - partNumber : " + i);
        OSSLog.logDebug("[checkInitData] - partSize : " + partSize);
        if (i > 1 && partSize < OSSConstants.MIN_PART_SIZE_LIMIT) {
            throw new ClientException("Part size must be greater than or equal to 100KB!");
        }
    }

    public void checkPartSize(int[] iArr) {
        long partSize = this.mRequest.getPartSize();
        OSSLog.logDebug("[checkPartSize] - mFileLength : " + this.mFileLength);
        OSSLog.logDebug("[checkPartSize] - partSize : " + partSize);
        long j = this.mFileLength;
        long j2 = j / partSize;
        if (j % partSize != 0) {
            j2++;
        }
        if (j2 == 1) {
            partSize = j;
        } else if (j2 > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            partSize = ceilPartSize(j / 4999);
            long j3 = this.mFileLength;
            j2 = (j3 / partSize) + (j3 % partSize == 0 ? 0L : 1L);
        }
        int i = (int) partSize;
        iArr[0] = i;
        iArr[1] = (int) j2;
        this.mRequest.setPartSize(i);
        OSSLog.logDebug("[checkPartSize] - partNumber : " + j2);
        OSSLog.logDebug("[checkPartSize] - partSize : " + i);
        long j4 = this.mFileLength % partSize;
        if (j4 != 0) {
            partSize = j4;
        }
        this.mLastPartSize = partSize;
    }

    public boolean checkWaitCondition(int i) {
        return this.mPartETags.size() != i;
    }

    public CompleteMultipartUploadResult completeMultipartUploadResult() throws ServiceException, ClientException {
        CompleteMultipartUploadResult completeMultipartUploadResultSyncCompleteMultipartUpload;
        if (this.mPartETags.size() > 0) {
            Collections.sort(this.mPartETags, new Comparator<PartETag>() { // from class: com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask.2
                @Override // java.util.Comparator
                public int compare(PartETag partETag, PartETag partETag2) {
                    if (partETag.getPartNumber() < partETag2.getPartNumber()) {
                        return -1;
                    }
                    return partETag.getPartNumber() > partETag2.getPartNumber() ? 1 : 0;
                }
            });
            CompleteMultipartUploadRequest completeMultipartUploadRequest = new CompleteMultipartUploadRequest(this.mRequest.getBucketName(), this.mRequest.getObjectKey(), this.mUploadId, this.mPartETags);
            if (this.mRequest.getCallbackParam() != null) {
                completeMultipartUploadRequest.setCallbackParam(this.mRequest.getCallbackParam());
            }
            if (this.mRequest.getCallbackVars() != null) {
                completeMultipartUploadRequest.setCallbackVars(this.mRequest.getCallbackVars());
            }
            if (this.mRequest.getMetadata() != null) {
                ObjectMetadata objectMetadata = new ObjectMetadata();
                for (String str : this.mRequest.getMetadata().getRawMetadata().keySet()) {
                    if (!str.equals(OSSHeaders.STORAGE_CLASS)) {
                        objectMetadata.setHeader(str, this.mRequest.getMetadata().getRawMetadata().get(str));
                    }
                }
                completeMultipartUploadRequest.setMetadata(objectMetadata);
            }
            completeMultipartUploadRequest.setCRC64(this.mRequest.getCRC64());
            completeMultipartUploadResultSyncCompleteMultipartUpload = this.mApiOperation.syncCompleteMultipartUpload(completeMultipartUploadRequest);
        } else {
            completeMultipartUploadResultSyncCompleteMultipartUpload = null;
        }
        this.mUploadedLength = 0L;
        return completeMultipartUploadResultSyncCompleteMultipartUpload;
    }

    public abstract Result doMultipartUpload() throws ServiceException, ClientException, InterruptedException, IOException;

    public abstract void initMultipartUploadId() throws ServiceException, ClientException, IOException;

    public void notifyMultipartThread() {
        this.mLock.notify();
        this.mPartExceptionCount = 0;
    }

    public void onProgressCallback(Request request, long j, long j2) {
        OSSProgressCallback<Request> oSSProgressCallback = this.mProgressCallback;
        if (oSSProgressCallback != null) {
            oSSProgressCallback.onProgress(request, j, j2);
        }
    }

    public void preUploadPart(int i, int i2, int i3) throws Exception {
    }

    public abstract void processException(Exception exc);

    public void releasePool() {
        ThreadPoolExecutor threadPoolExecutor = this.mPoolExecutor;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.getQueue().clear();
            this.mPoolExecutor.shutdown();
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0152 A[Catch: IOException -> 0x0133, TRY_ENTER, TryCatch #3 {IOException -> 0x0133, blocks: (B:54:0x0125, B:56:0x012a, B:58:0x012f, B:78:0x0152, B:80:0x0157, B:82:0x015c), top: B:99:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0157 A[Catch: IOException -> 0x0133, TryCatch #3 {IOException -> 0x0133, blocks: (B:54:0x0125, B:56:0x012a, B:58:0x012f, B:78:0x0152, B:80:0x0157, B:82:0x015c), top: B:99:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x015c A[Catch: IOException -> 0x0133, TRY_LEAVE, TryCatch #3 {IOException -> 0x0133, blocks: (B:54:0x0125, B:56:0x012a, B:58:0x012f, B:78:0x0152, B:80:0x0157, B:82:0x015c), top: B:99:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x016c A[Catch: IOException -> 0x0168, TryCatch #8 {IOException -> 0x0168, blocks: (B:87:0x0164, B:91:0x016c, B:93:0x0171), top: B:103:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0171 A[Catch: IOException -> 0x0168, TRY_LEAVE, TryCatch #8 {IOException -> 0x0168, blocks: (B:87:0x0164, B:91:0x016c, B:93:0x0171), top: B:103:0x0164 }] */
    public void uploadPart(int i, int i2, int i3) throws Throwable {
        Throwable th;
        InputStream inputStream;
        BufferedInputStream bufferedInputStream;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (this.mContext.getCancellationHandler().isCancelled()) {
                    this.mPoolExecutor.getQueue().clear();
                    return;
                }
                synchronized (this.mLock) {
                    this.mRunPartTaskCount++;
                }
                preUploadPart(i, i2, i3);
                byte[] bArr = new byte[i2];
                long partSize = ((long) i) * this.mRequest.getPartSize();
                if (this.mUploadUri != null) {
                    InputStream inputStreamOpenInputStream = this.mContext.getApplicationContext().getContentResolver().openInputStream(this.mUploadUri);
                    try {
                        bufferedInputStream = new BufferedInputStream(inputStreamOpenInputStream);
                        try {
                            bufferedInputStream.skip(partSize);
                            bufferedInputStream.read(bArr, 0, i2);
                            inputStream = inputStreamOpenInputStream;
                            randomAccessFile = null;
                        } catch (Exception e) {
                            e = e;
                            inputStream = inputStreamOpenInputStream;
                            try {
                                processException(e);
                                if (randomAccessFile2 != null) {
                                    randomAccessFile2.close();
                                }
                                if (bufferedInputStream != null) {
                                    bufferedInputStream.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (randomAccessFile2 != null) {
                                    try {
                                        randomAccessFile2.close();
                                    } catch (IOException e2) {
                                        OSSLog.logThrowable2Local(e2);
                                        throw th;
                                    }
                                }
                                if (bufferedInputStream != null) {
                                    bufferedInputStream.close();
                                }
                                if (inputStream != null) {
                                    throw th;
                                }
                                inputStream.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = inputStreamOpenInputStream;
                            if (randomAccessFile2 != null) {
                                randomAccessFile2.close();
                            }
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            }
                            if (inputStream != null) {
                                throw th;
                            }
                            inputStream.close();
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        bufferedInputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedInputStream = null;
                    }
                } else {
                    randomAccessFile = new RandomAccessFile(this.mUploadFile, "r");
                    try {
                        randomAccessFile.seek(partSize);
                        randomAccessFile.readFully(bArr, 0, i2);
                        inputStream = null;
                        bufferedInputStream = null;
                    } catch (Exception e4) {
                        e = e4;
                        inputStream = null;
                        bufferedInputStream = null;
                        randomAccessFile2 = randomAccessFile;
                        processException(e);
                        if (randomAccessFile2 != null) {
                            randomAccessFile2.close();
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        inputStream = null;
                        bufferedInputStream = null;
                        randomAccessFile2 = randomAccessFile;
                        if (randomAccessFile2 != null) {
                            randomAccessFile2.close();
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        if (inputStream != null) {
                            throw th;
                        }
                        inputStream.close();
                        throw th;
                    }
                }
                try {
                    UploadPartRequest uploadPartRequest = new UploadPartRequest(this.mRequest.getBucketName(), this.mRequest.getObjectKey(), this.mUploadId, i + 1);
                    uploadPartRequest.setPartContent(bArr);
                    uploadPartRequest.setMd5Digest(BinaryUtil.calculateBase64Md5(bArr));
                    uploadPartRequest.setCRC64(this.mRequest.getCRC64());
                    UploadPartResult uploadPartResultSyncUploadPart = this.mApiOperation.syncUploadPart(uploadPartRequest);
                    synchronized (this.mLock) {
                        try {
                            PartETag partETag = new PartETag(uploadPartRequest.getPartNumber(), uploadPartResultSyncUploadPart.getETag());
                            long j = i2;
                            partETag.setPartSize(j);
                            if (this.mCheckCRC64) {
                                partETag.setCRC64(uploadPartResultSyncUploadPart.getClientCRC().longValue());
                            }
                            this.mPartETags.add(partETag);
                            this.mUploadedLength += j;
                            uploadPartFinish(partETag);
                            boolean zIsCancelled = this.mContext.getCancellationHandler().isCancelled();
                            List<PartETag> list = this.mPartETags;
                            if (!zIsCancelled) {
                                if (list.size() == i3 - this.mPartExceptionCount) {
                                    notifyMultipartThread();
                                }
                                onProgressCallback(this.mRequest, this.mUploadedLength, this.mFileLength);
                            } else if (list.size() == this.mRunPartTaskCount - this.mPartExceptionCount) {
                                TaskCancelException taskCancelException = new TaskCancelException("multipart cancel");
                                throw new ClientException(taskCancelException.getMessage(), taskCancelException, Boolean.TRUE);
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Exception e5) {
                    e = e5;
                    randomAccessFile2 = randomAccessFile;
                    processException(e);
                    if (randomAccessFile2 != null) {
                        randomAccessFile2.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable th7) {
                    th = th7;
                    randomAccessFile2 = randomAccessFile;
                    if (randomAccessFile2 != null) {
                        randomAccessFile2.close();
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (inputStream != null) {
                        throw th;
                    }
                    inputStream.close();
                    throw th;
                }
            } catch (IOException e6) {
                OSSLog.logThrowable2Local(e6);
            }
        } catch (Exception e7) {
            e = e7;
            inputStream = null;
            bufferedInputStream = null;
        } catch (Throwable th8) {
            th = th8;
            inputStream = null;
            bufferedInputStream = null;
        }
    }

    public void uploadPartFinish(PartETag partETag) throws Exception {
    }
}
