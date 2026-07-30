package com.alibaba.sdk.android.oss.internal;

import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.TaskCancelException;
import com.alibaba.sdk.android.oss.callback.OSSCompletedCallback;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.BinaryUtil;
import com.alibaba.sdk.android.oss.common.utils.CRC64;
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
import com.alibaba.sdk.android.oss.model.UploadPartRequest;
import com.alibaba.sdk.android.oss.model.UploadPartResult;
import com.alibaba.sdk.android.oss.network.ExecutionContext;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.CheckedInputStream;

/* JADX INFO: loaded from: classes.dex */
public class SequenceUploadTask extends BaseMultipartUploadTask<ResumableUploadRequest, ResumableUploadResult> implements Callable<ResumableUploadResult> {
    private List<Integer> mAlreadyUploadIndex;
    private File mCRC64RecordFile;
    private long mFirstPartSize;
    private File mRecordFile;
    private OSSSharedPreferences mSp;

    public SequenceUploadTask(ResumableUploadRequest resumableUploadRequest, OSSCompletedCallback<ResumableUploadRequest, ResumableUploadResult> oSSCompletedCallback, ExecutionContext executionContext, InternalRequestOperation internalRequestOperation) {
        super(internalRequestOperation, resumableUploadRequest, oSSCompletedCallback, executionContext);
        this.mAlreadyUploadIndex = new ArrayList();
        this.mSp = OSSSharedPreferences.instance(this.mContext.getApplicationContext());
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
        long j = this.mUploadedLength;
        checkCancel();
        int[] iArr = this.mPartAttr;
        int i = iArr[0];
        int i2 = iArr[1];
        if (this.mPartETags.size() > 0 && this.mAlreadyUploadIndex.size() > 0) {
            long jLongValue = this.mUploadedLength;
            if (jLongValue > this.mFileLength) {
                throw new ClientException("The uploading file is inconsistent with before");
            }
            if (this.mFirstPartSize != i) {
                throw new ClientException("The part size setting is inconsistent with before");
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
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.mAlreadyUploadIndex.size() == 0 || !this.mAlreadyUploadIndex.contains(Integer.valueOf(i3 + 1))) {
                if (i3 == i2 - 1) {
                    i = (int) (this.mFileLength - j);
                }
                OSSLog.logDebug("upload part readByte : " + i);
                j += (long) i;
                uploadPart(i3, i, i2);
                if (this.mUploadException != null) {
                    break;
                }
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
        return resumableUploadResult;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0137  */
    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void initMultipartUploadId() throws ServiceException, ClientException, IOException {
        String strCalculateMd5Str;
        Map map;
        boolean zIsTruncated;
        if (!OSSUtils.isEmptyString(((ResumableUploadRequest) this.mRequest).getRecordDirectory())) {
            if (this.mUploadUri != null) {
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
                strCalculateMd5Str = BinaryUtil.calculateMd5Str(this.mUploadFilePath);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(strCalculateMd5Str);
            sb.append(((ResumableUploadRequest) this.mRequest).getBucketName());
            sb.append(((ResumableUploadRequest) this.mRequest).getObjectKey());
            sb.append(String.valueOf(((ResumableUploadRequest) this.mRequest).getPartSize()));
            sb.append(this.mCheckCRC64 ? "-crc64" : "");
            sb.append("-sequence");
            String strCalculateMd5Str2 = BinaryUtil.calculateMd5Str(sb.toString().getBytes());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(((ResumableUploadRequest) this.mRequest).getRecordDirectory());
            String str = File.separator;
            sb2.append(str);
            sb2.append(strCalculateMd5Str2);
            File file = new File(sb2.toString());
            this.mRecordFile = file;
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(this.mRecordFile));
                this.mUploadId = bufferedReader.readLine();
                bufferedReader.close();
                OSSLog.logDebug("sequence [initUploadId] - Found record file, uploadid: " + this.mUploadId);
            }
            if (!OSSUtils.isEmptyString(this.mUploadId)) {
                if (this.mCheckCRC64) {
                    File file2 = new File(((ResumableUploadRequest) this.mRequest).getRecordDirectory() + str + this.mUploadId);
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
                int nextPartNumberMarker = 0;
                do {
                    ListPartsRequest listPartsRequest = new ListPartsRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), this.mUploadId);
                    if (nextPartNumberMarker > 0) {
                        listPartsRequest.setPartNumberMarker(Integer.valueOf(nextPartNumberMarker));
                    }
                    OSSAsyncTask<ListPartsResult> oSSAsyncTaskListParts = this.mApiOperation.listParts(listPartsRequest, null);
                    try {
                        ListPartsResult listPartsResult = (ListPartsResult) oSSAsyncTaskListParts.getResult();
                        zIsTruncated = listPartsResult.isTruncated();
                        nextPartNumberMarker = listPartsResult.getNextPartNumberMarker();
                        List<PartSummary> parts = listPartsResult.getParts();
                        for (int i = 0; i < parts.size(); i++) {
                            PartSummary partSummary = parts.get(i);
                            PartETag partETag = new PartETag(partSummary.getPartNumber(), partSummary.getETag());
                            partETag.setPartSize(partSummary.getSize());
                            if (map != null && map.size() > 0 && map.containsKey(Integer.valueOf(partETag.getPartNumber()))) {
                                partETag.setCRC64(((Long) map.get(Integer.valueOf(partETag.getPartNumber()))).longValue());
                            }
                            this.mPartETags.add(partETag);
                            this.mUploadedLength += partSummary.getSize();
                            this.mAlreadyUploadIndex.add(Integer.valueOf(partSummary.getPartNumber()));
                            if (i == 0) {
                                this.mFirstPartSize = partSummary.getSize();
                            }
                        }
                    } catch (ClientException e3) {
                        throw e3;
                    } catch (ServiceException e4) {
                        if (e4.getStatusCode() != 404) {
                            throw e4;
                        }
                        this.mUploadId = null;
                        zIsTruncated = false;
                    }
                    oSSAsyncTaskListParts.waitUntilFinished();
                } while (zIsTruncated);
            }
            if (!this.mRecordFile.exists() && !this.mRecordFile.createNewFile()) {
                throw new ClientException("Can't create file at path: " + this.mRecordFile.getAbsolutePath() + "\nPlease make sure the directory exist!");
            }
        }
        if (OSSUtils.isEmptyString(this.mUploadId)) {
            InitiateMultipartUploadRequest initiateMultipartUploadRequest = new InitiateMultipartUploadRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), ((ResumableUploadRequest) this.mRequest).getMetadata());
            initiateMultipartUploadRequest.isSequential = true;
            this.mUploadId = ((InitiateMultipartUploadResult) this.mApiOperation.initMultipartUpload(initiateMultipartUploadRequest, null).getResult()).getUploadId();
            if (this.mRecordFile != null) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.mRecordFile));
                bufferedWriter.write(this.mUploadId);
                bufferedWriter.close();
            }
        }
        ((ResumableUploadRequest) this.mRequest).setUploadId(this.mUploadId);
    }

    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void processException(Exception exc) {
        if (this.mUploadException == null || !exc.getMessage().equals(this.mUploadException.getMessage())) {
            this.mUploadException = exc;
        }
        OSSLog.logThrowable2Local(exc);
        if (!this.mContext.getCancellationHandler().isCancelled() || this.mIsCancel) {
            return;
        }
        this.mIsCancel = true;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0 A[Catch: all -> 0x00dc, Exception -> 0x00e1, ServiceException -> 0x00e5, TryCatch #14 {ServiceException -> 0x00e5, blocks: (B:37:0x00a0, B:39:0x00d0, B:46:0x00e9, B:48:0x0102, B:58:0x0122, B:59:0x0134), top: B:109:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0102 A[Catch: all -> 0x00dc, Exception -> 0x00e1, ServiceException -> 0x00e5, TRY_LEAVE, TryCatch #14 {ServiceException -> 0x00e5, blocks: (B:37:0x00a0, B:39:0x00d0, B:46:0x00e9, B:48:0x0102, B:58:0x0122, B:59:0x0134), top: B:109:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x010e A[Catch: IOException -> 0x011c, TRY_ENTER, TryCatch #17 {IOException -> 0x011c, blocks: (B:50:0x010e, B:52:0x0113, B:54:0x0118, B:70:0x014d, B:72:0x0152, B:74:0x0157, B:86:0x01af, B:88:0x01b4), top: B:110:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0113 A[Catch: IOException -> 0x011c, TryCatch #17 {IOException -> 0x011c, blocks: (B:50:0x010e, B:52:0x0113, B:54:0x0118, B:70:0x014d, B:72:0x0152, B:74:0x0157, B:86:0x01af, B:88:0x01b4), top: B:110:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0118 A[Catch: IOException -> 0x011c, TRY_LEAVE, TryCatch #17 {IOException -> 0x011c, blocks: (B:50:0x010e, B:52:0x0113, B:54:0x0118, B:70:0x014d, B:72:0x0152, B:74:0x0157, B:86:0x01af, B:88:0x01b4), top: B:110:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0122 A[Catch: all -> 0x00dc, Exception -> 0x00e1, ServiceException -> 0x00e5, TRY_ENTER, TryCatch #14 {ServiceException -> 0x00e5, blocks: (B:37:0x00a0, B:39:0x00d0, B:46:0x00e9, B:48:0x0102, B:58:0x0122, B:59:0x0134), top: B:109:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x014d A[Catch: IOException -> 0x011c, TRY_ENTER, TryCatch #17 {IOException -> 0x011c, blocks: (B:50:0x010e, B:52:0x0113, B:54:0x0118, B:70:0x014d, B:72:0x0152, B:74:0x0157, B:86:0x01af, B:88:0x01b4), top: B:110:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0152 A[Catch: IOException -> 0x011c, TryCatch #17 {IOException -> 0x011c, blocks: (B:50:0x010e, B:52:0x0113, B:54:0x0118, B:70:0x014d, B:72:0x0152, B:74:0x0157, B:86:0x01af, B:88:0x01b4), top: B:110:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0166 A[Catch: all -> 0x00dc, TryCatch #15 {all -> 0x00dc, blocks: (B:36:0x0087, B:37:0x00a0, B:39:0x00d0, B:46:0x00e9, B:48:0x0102, B:58:0x0122, B:59:0x0134, B:78:0x015e, B:80:0x0166, B:81:0x016a, B:83:0x0184, B:84:0x01a2), top: B:103:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x016a A[Catch: all -> 0x00dc, TryCatch #15 {all -> 0x00dc, blocks: (B:36:0x0087, B:37:0x00a0, B:39:0x00d0, B:46:0x00e9, B:48:0x0102, B:58:0x0122, B:59:0x0134, B:78:0x015e, B:80:0x0166, B:81:0x016a, B:83:0x0184, B:84:0x01a2), top: B:103:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0184 A[Catch: all -> 0x00dc, TryCatch #15 {all -> 0x00dc, blocks: (B:36:0x0087, B:37:0x00a0, B:39:0x00d0, B:46:0x00e9, B:48:0x0102, B:58:0x0122, B:59:0x0134, B:78:0x015e, B:80:0x0166, B:81:0x016a, B:83:0x0184, B:84:0x01a2), top: B:103:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01af A[Catch: IOException -> 0x011c, TRY_ENTER, TryCatch #17 {IOException -> 0x011c, blocks: (B:50:0x010e, B:52:0x0113, B:54:0x0118, B:70:0x014d, B:72:0x0152, B:74:0x0157, B:86:0x01af, B:88:0x01b4), top: B:110:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b4 A[Catch: IOException -> 0x011c, TRY_LEAVE, TryCatch #17 {IOException -> 0x011c, blocks: (B:50:0x010e, B:52:0x0113, B:54:0x0118, B:70:0x014d, B:72:0x0152, B:74:0x0157, B:86:0x01af, B:88:0x01b4), top: B:110:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01c5 A[Catch: IOException -> 0x01c1, TryCatch #11 {IOException -> 0x01c1, blocks: (B:93:0x01bd, B:97:0x01c5, B:99:0x01ca), top: B:105:0x01bd }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01ca A[Catch: IOException -> 0x01c1, TRY_LEAVE, TryCatch #11 {IOException -> 0x01c1, blocks: (B:93:0x01bd, B:97:0x01c5, B:99:0x01ca), top: B:105:0x01bd }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask, com.alibaba.sdk.android.oss.internal.SequenceUploadTask] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v19, types: [Request extends com.alibaba.sdk.android.oss.model.MultipartUploadRequest, com.alibaba.sdk.android.oss.model.MultipartUploadRequest] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.alibaba.sdk.android.oss.model.UploadPartRequest] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // com.alibaba.sdk.android.oss.internal.BaseMultipartUploadTask
    public void uploadPart(int i, int i2, int i3) throws Throwable {
        Throwable th;
        ?? r9;
        ?? r10;
        ?? r7;
        ?? r8;
        ?? r11;
        ?? r12;
        PartETag partETag;
        UploadPartRequest uploadPartRequest;
        UploadPartResult uploadPartResultSyncUploadPart;
        PartETag partETag2;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        ?? r2 = 0;
        r2 = 0;
        r2 = 0;
        ?? r3 = 0;
        ?? r4 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        try {
            try {
                if (!this.mContext.getCancellationHandler().isCancelled()) {
                    this.mRunPartTaskCount++;
                    preUploadPart(i, i2, i3);
                    long partSize = ((long) i) * ((ResumableUploadRequest) this.mRequest).getPartSize();
                    byte[] bArr = new byte[i2];
                    if (this.mUploadUri != null) {
                        InputStream inputStreamOpenInputStream = this.mContext.getApplicationContext().getContentResolver().openInputStream(this.mUploadUri);
                        try {
                            BufferedInputStream bufferedInputStream3 = new BufferedInputStream(inputStreamOpenInputStream);
                            try {
                                bufferedInputStream3.skip(partSize);
                                bufferedInputStream3.read(bArr, 0, i2);
                                r7 = 0;
                                r10 = bufferedInputStream3;
                                r8 = inputStreamOpenInputStream;
                                try {
                                    try {
                                        try {
                                            uploadPartRequest = new UploadPartRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), this.mUploadId, i + 1);
                                            try {
                                                uploadPartRequest.setPartContent(bArr);
                                                uploadPartRequest.setMd5Digest(BinaryUtil.calculateBase64Md5(bArr));
                                                uploadPartRequest.setCRC64(((ResumableUploadRequest) this.mRequest).getCRC64());
                                                uploadPartResultSyncUploadPart = this.mApiOperation.syncUploadPart(uploadPartRequest);
                                                partETag2 = new PartETag(uploadPartRequest.getPartNumber(), uploadPartResultSyncUploadPart.getETag());
                                                long j = i2;
                                                partETag2.setPartSize(j);
                                                if (this.mCheckCRC64) {
                                                    partETag2.setCRC64(uploadPartResultSyncUploadPart.getClientCRC().longValue());
                                                }
                                                this.mPartETags.add(partETag2);
                                                this.mUploadedLength += j;
                                                uploadPartFinish(partETag2);
                                                if (!this.mContext.getCancellationHandler().isCancelled()) {
                                                    TaskCancelException taskCancelException = new TaskCancelException("sequence upload task cancel");
                                                    throw new ClientException(taskCancelException.getMessage(), taskCancelException, Boolean.TRUE);
                                                }
                                                r2 = this.mRequest;
                                                onProgressCallback(r2, this.mUploadedLength, this.mFileLength);
                                                if (r7 != 0) {
                                                    r7.close();
                                                }
                                                if (r8 != 0) {
                                                    r8.close();
                                                }
                                                if (r10 != 0) {
                                                    r10.close();
                                                }
                                            } catch (ServiceException e) {
                                                e = e;
                                                r2 = uploadPartRequest;
                                                if (e.getStatusCode() != 409) {
                                                    processException(e);
                                                } else {
                                                    partETag = new PartETag(r2.getPartNumber(), e.getPartEtag());
                                                    partETag.setPartSize(r2.getPartContent().length);
                                                    if (this.mCheckCRC64) {
                                                        partETag.setCRC64(new CheckedInputStream(new ByteArrayInputStream(r2.getPartContent()), new CRC64()).getChecksum().getValue());
                                                    }
                                                    this.mPartETags.add(partETag);
                                                    this.mUploadedLength += (long) i2;
                                                }
                                                if (r7 != 0) {
                                                    r7.close();
                                                }
                                                if (r8 != 0) {
                                                    r8.close();
                                                }
                                                if (r10 == 0) {
                                                    return;
                                                }
                                                r10.close();
                                            }
                                        } catch (ServiceException e2) {
                                            e = e2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r4 = r7;
                                        r12 = r8;
                                        r9 = r10;
                                        if (r4 != 0) {
                                            try {
                                                r4.close();
                                            } catch (IOException e3) {
                                                OSSLog.logThrowable2Local(e3);
                                                throw th;
                                            }
                                        }
                                        if (r12 != 0) {
                                            r12.close();
                                        }
                                        if (r9 != 0) {
                                            throw th;
                                        }
                                        r9.close();
                                        throw th;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    r3 = r7;
                                    r11 = r8;
                                    r10 = r10;
                                    try {
                                        processException(e);
                                        if (r3 != 0) {
                                            r3.close();
                                        }
                                        if (r11 != 0) {
                                            r11.close();
                                        }
                                        if (r10 == 0) {
                                            return;
                                        }
                                        r10.close();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r4 = r3;
                                        r12 = r11;
                                        r9 = r10;
                                        if (r4 != 0) {
                                            r4.close();
                                        }
                                        if (r12 != 0) {
                                            r12.close();
                                        }
                                        if (r9 != 0) {
                                            throw th;
                                        }
                                        r9.close();
                                        throw th;
                                    }
                                }
                            } catch (ServiceException e5) {
                                e = e5;
                                r7 = 0;
                                r10 = bufferedInputStream3;
                                r8 = inputStreamOpenInputStream;
                                if (e.getStatusCode() != 409) {
                                    processException(e);
                                } else {
                                    partETag = new PartETag(r2.getPartNumber(), e.getPartEtag());
                                    partETag.setPartSize(r2.getPartContent().length);
                                    if (this.mCheckCRC64) {
                                        partETag.setCRC64(new CheckedInputStream(new ByteArrayInputStream(r2.getPartContent()), new CRC64()).getChecksum().getValue());
                                    }
                                    this.mPartETags.add(partETag);
                                    this.mUploadedLength += (long) i2;
                                }
                                if (r7 != 0) {
                                    r7.close();
                                }
                                if (r8 != 0) {
                                    r8.close();
                                }
                                if (r10 == 0) {
                                    return;
                                }
                                r10.close();
                            } catch (Exception e6) {
                                e = e6;
                                bufferedInputStream2 = bufferedInputStream3;
                                r11 = inputStreamOpenInputStream;
                                r10 = bufferedInputStream2;
                                processException(e);
                                if (r3 != 0) {
                                    r3.close();
                                }
                                if (r11 != 0) {
                                    r11.close();
                                }
                                if (r10 == 0) {
                                    return;
                                }
                                r10.close();
                            } catch (Throwable th4) {
                                th = th4;
                                bufferedInputStream = bufferedInputStream3;
                                r12 = inputStreamOpenInputStream;
                                r9 = bufferedInputStream;
                                if (r4 != 0) {
                                    r4.close();
                                }
                                if (r12 != 0) {
                                    r12.close();
                                }
                                if (r9 != 0) {
                                    throw th;
                                }
                                r9.close();
                                throw th;
                            }
                        } catch (ServiceException e7) {
                            e = e7;
                            r7 = 0;
                            r10 = 0;
                        } catch (Exception e8) {
                            e = e8;
                            bufferedInputStream2 = null;
                        } catch (Throwable th5) {
                            th = th5;
                            bufferedInputStream = null;
                        }
                    } else {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(this.mUploadFile, "r");
                        try {
                            randomAccessFile.seek(partSize);
                            randomAccessFile.readFully(bArr, 0, i2);
                            r8 = 0;
                            r10 = 0;
                            r7 = randomAccessFile;
                            uploadPartRequest = new UploadPartRequest(((ResumableUploadRequest) this.mRequest).getBucketName(), ((ResumableUploadRequest) this.mRequest).getObjectKey(), this.mUploadId, i + 1);
                            uploadPartRequest.setPartContent(bArr);
                            uploadPartRequest.setMd5Digest(BinaryUtil.calculateBase64Md5(bArr));
                            uploadPartRequest.setCRC64(((ResumableUploadRequest) this.mRequest).getCRC64());
                            uploadPartResultSyncUploadPart = this.mApiOperation.syncUploadPart(uploadPartRequest);
                            partETag2 = new PartETag(uploadPartRequest.getPartNumber(), uploadPartResultSyncUploadPart.getETag());
                            long j2 = i2;
                            partETag2.setPartSize(j2);
                            if (this.mCheckCRC64) {
                                partETag2.setCRC64(uploadPartResultSyncUploadPart.getClientCRC().longValue());
                            }
                            this.mPartETags.add(partETag2);
                            this.mUploadedLength += j2;
                            uploadPartFinish(partETag2);
                            if (!this.mContext.getCancellationHandler().isCancelled()) {
                                TaskCancelException taskCancelException2 = new TaskCancelException("sequence upload task cancel");
                                throw new ClientException(taskCancelException2.getMessage(), taskCancelException2, Boolean.TRUE);
                            }
                            r2 = this.mRequest;
                            onProgressCallback(r2, this.mUploadedLength, this.mFileLength);
                            if (r7 != 0) {
                                r7.close();
                            }
                            if (r8 != 0) {
                                r8.close();
                            }
                            if (r10 != 0) {
                                r10.close();
                            }
                        } catch (ServiceException e9) {
                            e = e9;
                            r8 = 0;
                            r10 = 0;
                            r7 = randomAccessFile;
                            if (e.getStatusCode() != 409) {
                                processException(e);
                            } else {
                                partETag = new PartETag(r2.getPartNumber(), e.getPartEtag());
                                partETag.setPartSize(r2.getPartContent().length);
                                if (this.mCheckCRC64) {
                                    partETag.setCRC64(new CheckedInputStream(new ByteArrayInputStream(r2.getPartContent()), new CRC64()).getChecksum().getValue());
                                }
                                this.mPartETags.add(partETag);
                                this.mUploadedLength += (long) i2;
                            }
                            if (r7 != 0) {
                                r7.close();
                            }
                            if (r8 != 0) {
                                r8.close();
                            }
                            if (r10 == 0) {
                                return;
                            }
                            r10.close();
                        } catch (Exception e10) {
                            e = e10;
                            r11 = 0;
                            r10 = 0;
                            r3 = randomAccessFile;
                            processException(e);
                            if (r3 != 0) {
                                r3.close();
                            }
                            if (r11 != 0) {
                                r11.close();
                            }
                            if (r10 == 0) {
                                return;
                            }
                            r10.close();
                        } catch (Throwable th6) {
                            th = th6;
                            r12 = 0;
                            r9 = 0;
                            r4 = randomAccessFile;
                            if (r4 != 0) {
                                r4.close();
                            }
                            if (r12 != 0) {
                                r12.close();
                            }
                            if (r9 != 0) {
                                throw th;
                            }
                            r9.close();
                            throw th;
                        }
                    }
                }
            } catch (IOException e11) {
                OSSLog.logThrowable2Local(e11);
            }
        } catch (ServiceException e12) {
            e = e12;
            r7 = r2;
            r8 = r7;
            r10 = r8;
        } catch (Exception e13) {
            e = e13;
            ?? r13 = r2;
            r10 = r13;
            r3 = r2;
            r11 = r13;
        } catch (Throwable th7) {
            th = th7;
            ?? r14 = r2;
            r9 = r14;
            r4 = r2;
            r12 = r14;
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
