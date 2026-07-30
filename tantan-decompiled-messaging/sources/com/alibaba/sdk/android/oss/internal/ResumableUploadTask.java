package com.alibaba.sdk.android.oss.internal;

import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.callback.OSSCompletedCallback;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.BinaryUtil;
import com.alibaba.sdk.android.oss.common.utils.OSSSharedPreferences;
import com.alibaba.sdk.android.oss.common.utils.OSSUtils;
import com.alibaba.sdk.android.oss.model.AbortMultipartUploadRequest;
import com.alibaba.sdk.android.oss.model.CompleteMultipartUploadResult;
import com.alibaba.sdk.android.oss.model.InitiateMultipartUploadRequest;
import com.alibaba.sdk.android.oss.model.InitiateMultipartUploadResult;
import com.alibaba.sdk.android.oss.model.ListPartsRequest;
import com.alibaba.sdk.android.oss.model.ListPartsResult;
import com.alibaba.sdk.android.oss.model.PartETag;
import com.alibaba.sdk.android.oss.model.PartSummary;
import com.alibaba.sdk.android.oss.model.ResumableUploadRequest;
import com.alibaba.sdk.android.oss.model.ResumableUploadResult;
import com.alibaba.sdk.android.oss.network.ExecutionContext;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class ResumableUploadTask extends BaseMultipartUploadTask<ResumableUploadRequest, ResumableUploadResult> implements Callable<ResumableUploadResult> {
    private ResumableUploadRequest.ExceptionTerminationMode exceptionTerminationMode;
    private List<Integer> mAlreadyUploadIndex;
    private File mCRC64RecordFile;
    private File mRecordFile;
    private OSSSharedPreferences mSp;

    public ResumableUploadTask(ResumableUploadRequest resumableUploadRequest, OSSCompletedCallback<ResumableUploadRequest, ResumableUploadResult> oSSCompletedCallback, ExecutionContext executionContext, InternalRequestOperation internalRequestOperation) {
        super(internalRequestOperation, resumableUploadRequest, oSSCompletedCallback, executionContext);
        this.mAlreadyUploadIndex = new ArrayList();
        this.mSp = OSSSharedPreferences.instance(this.mContext.getApplicationContext());
        this.exceptionTerminationMode = resumableUploadRequest.getExceptionTerminationMode();
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void abortThisUpload() {
        if (this.mUploadId != null) {
            this.mApiOperation.abortMultipartUpload(new AbortMultipartUploadRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), this.mUploadId), null).waitUntilFinished();
        }
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void checkException() throws Throwable {
        if (this.mContext.getCancellationHandler().isCancelled()) {
            if (((ResumableUploadRequest) this.mRequest).deleteUploadOnCancelling().booleanValue()) {
                abortThisUpload();
                File file = this.mRecordFile;
                if (file != null) {
                    file.delete();
                }
            } else {
                List<PartETag> list = this.mPartETags;
                if (list != null && list.size() > 0 && this.mCheckCRC64 && ((ResumableUploadRequest) this.mRequest).getRecordDirectory() != null) {
                    HashMap map = new HashMap();
                    for (PartETag partETag : this.mPartETags) {
                        map.put(Integer.valueOf(partETag.getPartNumber()), Long.valueOf(partETag.getCRC64()));
                    }
                    ObjectOutputStream objectOutputStream = null;
                    try {
                        try {
                            File file2 = new File(((ResumableUploadRequest) this.mRequest).getRecordDirectory() + File.separator + this.mUploadId);
                            this.mCRC64RecordFile = file2;
                            if (!file2.exists()) {
                                this.mCRC64RecordFile.createNewFile();
                            }
                            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(this.mCRC64RecordFile));
                            try {
                                objectOutputStream2.writeObject(map);
                                objectOutputStream2.close();
                            } catch (IOException e) {
                                e = e;
                                objectOutputStream = objectOutputStream2;
                                OSSLog.logThrowable2Local(e);
                                if (objectOutputStream != null) {
                                    objectOutputStream.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                objectOutputStream = objectOutputStream2;
                                if (objectOutputStream != null) {
                                    objectOutputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (IOException e2) {
                        e = e2;
                    }
                }
            }
        }
        super.checkException();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public ResumableUploadResult doMultipartUpload() throws Throwable {
        ThreadPoolExecutor threadPoolExecutor;
        long j = this.mUploadedLength;
        checkCancel();
        int[] iArr = this.mPartAttr;
        final int i = iArr[0];
        final int i2 = iArr[1];
        if (this.mPartETags.size() > 0 && this.mAlreadyUploadIndex.size() > 0) {
            long jLongValue = this.mUploadedLength;
            if (jLongValue > this.mFileLength) {
                throw new ClientException("The uploading file is inconsistent with before");
            }
            if (!TextUtils.isEmpty(this.mSp.getStringValue(this.mUploadId))) {
                jLongValue = Long.valueOf(this.mSp.getStringValue(this.mUploadId)).longValue();
            }
            long j2 = jLongValue;
            OSSProgressCallback<Request> oSSProgressCallback = this.mProgressCallback;
            if (oSSProgressCallback != 0) {
                oSSProgressCallback.onProgress(this.mRequest, j2, this.mFileLength);
            }
            this.mSp.removeKey(this.mUploadId);
        }
        this.mRunPartTaskCount = this.mPartETags.size();
        for (final int i3 = 0; i3 < i2; i3++) {
            if (this.exceptionTerminationMode == ResumableUploadRequest.ExceptionTerminationMode.EXCEPTION) {
                checkException();
            }
            if ((this.mAlreadyUploadIndex.size() == 0 || !this.mAlreadyUploadIndex.contains(Integer.valueOf(i3 + 1))) && (threadPoolExecutor = this.mPoolExecutor) != null) {
                if (i3 == i2 - 1) {
                    i = (int) (this.mFileLength - j);
                }
                j += (long) i;
                threadPoolExecutor.execute(new Runnable() { // from class: com.alibaba.sdk.android.oss.internal.ResumableUploadTask.1
                    @Override // java.lang.Runnable
                    public void run() throws Throwable {
                        ResumableUploadTask.this.uploadPart(i3, i, i2);
                    }
                });
            }
        }
        if (checkWaitCondition(i2)) {
            synchronized (this.mLock) {
                this.mLock.wait();
            }
        }
        checkException();
        CompleteMultipartUploadResult completeMultipartUploadResult = completeMultipartUploadResult();
        ResumableUploadResult resumableUploadResult = completeMultipartUploadResult != null ? new ResumableUploadResult(completeMultipartUploadResult) : null;
        File file = this.mRecordFile;
        if (file != null) {
            file.delete();
        }
        File file2 = this.mCRC64RecordFile;
        if (file2 != null) {
            file2.delete();
        }
        releasePool();
        return resumableUploadResult;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0346  */
    /* JADX WARN: Code duplicated, block: B:105:0x037a  */
    /* JADX WARN: Code duplicated, block: B:121:0x030e A[EDGE_INSN: B:121:0x030e->B:94:0x030e BREAK  A[LOOP:0: B:43:0x017b->B:92:0x0307], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0178  */
    /* JADX WARN: Code duplicated, block: B:92:0x0307 A[LOOP:0: B:43:0x017b->B:92:0x0307, LOOP_END] */
    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void initMultipartUploadId() throws ServiceException, ClientException, IOException {
        String strCalculateMd5Str;
        Map map;
        String str;
        boolean zIsTruncated;
        String str2 = "[initUploadId] -  ";
        OSSCompletedCallback<ListPartsRequest, ListPartsResult> oSSCompletedCallback = null;
        if (!OSSUtils.isEmptyString(((ResumableUploadRequest) this.mRequest).getRecordDirectory())) {
            if (this.mUploadUri != null) {
                OSSLog.logDebug("[initUploadId] - mUploadFilePath : " + this.mUploadUri.getPath());
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.mContext.getApplicationContext().getContentResolver().openFileDescriptor(this.mUploadUri, "r");
                try {
                    strCalculateMd5Str = BinaryUtil.calculateMd5Str(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    throw th;
                }
            } else {
                OSSLog.logDebug("[initUploadId] - mUploadFilePath : " + this.mUploadFilePath);
                strCalculateMd5Str = BinaryUtil.calculateMd5Str(this.mUploadFilePath);
            }
            OSSLog.logDebug("[initUploadId] - mRequest.getPartSize() : " + ((ResumableUploadRequest) this.mRequest).getPartSize());
            StringBuilder sb = new StringBuilder();
            sb.append(strCalculateMd5Str);
            sb.append(((ResumableUploadRequest) this.mRequest).getBucketName());
            sb.append(((ResumableUploadRequest) this.mRequest).getObjectKey());
            sb.append(String.valueOf(((ResumableUploadRequest) this.mRequest).getPartSize()));
            sb.append(this.mCheckCRC64 ? "-crc64" : "");
            String strCalculateMd5Str2 = BinaryUtil.calculateMd5Str(sb.toString().getBytes());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(((ResumableUploadRequest) this.mRequest).getRecordDirectory());
            String str3 = File.separator;
            sb2.append(str3);
            sb2.append(strCalculateMd5Str2);
            File file = new File(sb2.toString());
            this.mRecordFile = file;
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.mRecordFile));
                this.mUploadId = bufferedReader.readLine();
                bufferedReader.close();
            }
            OSSLog.logDebug("[initUploadId] - mUploadId : " + this.mUploadId);
            if (!OSSUtils.isEmptyString(this.mUploadId)) {
                if (this.mCheckCRC64) {
                    File file2 = new File(((ResumableUploadRequest) this.mRequest).getRecordDirectory() + str3 + this.mUploadId);
                    if (file2.exists()) {
                        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file2));
                        try {
                            try {
                                map = (Map) objectInputStream.readObject();
                                try {
                                    file2.delete();
                                } catch (ClassNotFoundException e) {
                                    e = e;
                                    OSSLog.logThrowable2Local(e);
                                }
                            } catch (Throwable th2) {
                                objectInputStream.close();
                                file2.delete();
                                throw th2;
                            }
                        } catch (ClassNotFoundException e2) {
                            e = e2;
                            map = null;
                        }
                        objectInputStream.close();
                        file2.delete();
                    } else {
                        map = null;
                    }
                } else {
                    map = null;
                }
                int i = 0;
                int nextPartNumberMarker = 0;
                while (true) {
                    ListPartsRequest listPartsRequest = new ListPartsRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), this.mUploadId);
                    if (nextPartNumberMarker > 0) {
                        listPartsRequest.setPartNumberMarker(Integer.valueOf(nextPartNumberMarker));
                    }
                    OSSAsyncTask<ListPartsResult> oSSAsyncTaskListParts = this.mApiOperation.listParts(listPartsRequest, oSSCompletedCallback);
                    try {
                        try {
                            ListPartsResult listPartsResult = (ListPartsResult) oSSAsyncTaskListParts.getResult();
                            zIsTruncated = listPartsResult.isTruncated();
                            nextPartNumberMarker = listPartsResult.getNextPartNumberMarker();
                            List<PartSummary> parts = listPartsResult.getParts();
                            int[] iArr = this.mPartAttr;
                            int i2 = iArr[i];
                            int i3 = iArr[1];
                            int i4 = i;
                            while (i4 < parts.size()) {
                                PartSummary partSummary = parts.get(i4);
                                PartETag partETag = new PartETag(partSummary.getPartNumber(), partSummary.getETag());
                                partETag.setPartSize(partSummary.getSize());
                                if (map != null && map.size() > 0 && map.containsKey(Integer.valueOf(partETag.getPartNumber()))) {
                                    partETag.setCRC64(((Long) map.get(Integer.valueOf(partETag.getPartNumber()))).longValue());
                                }
                                OSSLog.logDebug(str2 + i4 + " part.getPartNumber() : " + partSummary.getPartNumber());
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str2);
                                sb3.append(i4);
                                sb3.append(" part.getSize() : ");
                                int i5 = i4;
                                sb3.append(partSummary.getSize());
                                OSSLog.logDebug(sb3.toString());
                                boolean z = partSummary.getPartNumber() == i3;
                                if (z) {
                                    str = str2;
                                    try {
                                        if (partSummary.getSize() != this.mLastPartSize) {
                                            throw new ClientException("current part size " + partSummary.getSize() + " setting is inconsistent with PartSize : " + i2 + " or lastPartSize : " + this.mLastPartSize);
                                        }
                                    } catch (ServiceException e3) {
                                        e = e3;
                                        if (e.getStatusCode() != 404) {
                                            throw e;
                                        }
                                        this.mUploadId = null;
                                        zIsTruncated = false;
                                        oSSAsyncTaskListParts.waitUntilFinished();
                                        if (!zIsTruncated) {
                                            break;
                                            if (!this.mRecordFile.exists()) {
                                                throw new ClientException("Can't create file at path: " + this.mRecordFile.getAbsolutePath() + "\nPlease make sure the directory exist!");
                                            }
                                            if (OSSUtils.isEmptyString(this.mUploadId)) {
                                                this.mUploadId = ((InitiateMultipartUploadResult) this.mApiOperation.initMultipartUpload(new InitiateMultipartUploadRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), ((ResumableUploadRequest) this.mRequest).getMetadata()), null).getResult()).getUploadId();
                                                if (this.mRecordFile != null) {
                                                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.mRecordFile));
                                                    bufferedWriter.write(this.mUploadId);
                                                    bufferedWriter.close();
                                                }
                                            }
                                            ((ResumableUploadRequest) this.mRequest).setUploadId(this.mUploadId);
                                        }
                                        str2 = str;
                                        oSSCompletedCallback = null;
                                        i = 0;
                                    }
                                } else {
                                    str = str2;
                                }
                                if (!z && partSummary.getSize() != i2) {
                                    throw new ClientException("current part size " + partSummary.getSize() + " setting is inconsistent with PartSize : " + i2 + " or lastPartSize : " + this.mLastPartSize);
                                }
                                this.mPartETags.add(partETag);
                                this.mUploadedLength += partSummary.getSize();
                                this.mAlreadyUploadIndex.add(Integer.valueOf(partSummary.getPartNumber()));
                                i4 = i5 + 1;
                                str2 = str;
                            }
                            str = str2;
                        } catch (ClientException e4) {
                            throw e4;
                        }
                    } catch (ServiceException e5) {
                        e = e5;
                        str = str2;
                    }
                    oSSAsyncTaskListParts.waitUntilFinished();
                    if (!zIsTruncated) {
                        break;
                    }
                    str2 = str;
                    oSSCompletedCallback = null;
                    i = 0;
                }
            }
            if (!this.mRecordFile.exists() && !this.mRecordFile.createNewFile()) {
                throw new ClientException("Can't create file at path: " + this.mRecordFile.getAbsolutePath() + "\nPlease make sure the directory exist!");
            }
        }
        if (OSSUtils.isEmptyString(this.mUploadId)) {
            this.mUploadId = ((InitiateMultipartUploadResult) this.mApiOperation.initMultipartUpload(new InitiateMultipartUploadRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), ((ResumableUploadRequest) this.mRequest).getMetadata()), null).getResult()).getUploadId();
            if (this.mRecordFile != null) {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(this.mRecordFile));
                bufferedWriter2.write(this.mUploadId);
                bufferedWriter2.close();
            }
        }
        ((ResumableUploadRequest) this.mRequest).setUploadId(this.mUploadId);
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void processException(Exception exc) {
        synchronized (this.mLock) {
            try {
                this.mPartExceptionCount++;
                this.mUploadException = exc;
                OSSLog.logThrowable2Local(exc);
                if (this.mContext.getCancellationHandler().isCancelled() && !this.mIsCancel) {
                    this.mIsCancel = true;
                    this.mLock.notify();
                }
                if (this.exceptionTerminationMode == ResumableUploadRequest.ExceptionTerminationMode.EXCEPTION || this.mPartETags.size() == this.mRunPartTaskCount - this.mPartExceptionCount) {
                    notifyMultipartThread();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void uploadPartFinish(PartETag partETag) throws Exception {
        if (!this.mContext.getCancellationHandler().isCancelled() || this.mSp.contains(this.mUploadId)) {
            return;
        }
        this.mSp.setStringValue(this.mUploadId, String.valueOf(this.mUploadedLength));
        onProgressCallback(this.mRequest, this.mUploadedLength, this.mFileLength);
    }
}
