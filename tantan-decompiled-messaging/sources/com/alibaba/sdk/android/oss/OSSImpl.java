package com.alibaba.sdk.android.oss;

import android.content.Context;
import com.alibaba.sdk.android.oss.callback.OSSCompletedCallback;
import com.alibaba.sdk.android.oss.common.OSSLogToFileUtils;
import com.alibaba.sdk.android.oss.common.auth.OSSCredentialProvider;
import com.alibaba.sdk.android.oss.common.utils.OSSUtils;
import com.alibaba.sdk.android.oss.internal.ExtensionRequestOperation;
import com.alibaba.sdk.android.oss.internal.InternalRequestOperation;
import com.alibaba.sdk.android.oss.internal.OSSAsyncTask;
import com.alibaba.sdk.android.oss.internal.ObjectURLPresigner;
import com.alibaba.sdk.android.oss.model.AbortMultipartUploadRequest;
import com.alibaba.sdk.android.oss.model.AbortMultipartUploadResult;
import com.alibaba.sdk.android.oss.model.AppendObjectRequest;
import com.alibaba.sdk.android.oss.model.AppendObjectResult;
import com.alibaba.sdk.android.oss.model.CompleteMultipartUploadRequest;
import com.alibaba.sdk.android.oss.model.CompleteMultipartUploadResult;
import com.alibaba.sdk.android.oss.model.CopyObjectRequest;
import com.alibaba.sdk.android.oss.model.CopyObjectResult;
import com.alibaba.sdk.android.oss.model.CreateBucketRequest;
import com.alibaba.sdk.android.oss.model.CreateBucketResult;
import com.alibaba.sdk.android.oss.model.DeleteBucketLifecycleRequest;
import com.alibaba.sdk.android.oss.model.DeleteBucketLifecycleResult;
import com.alibaba.sdk.android.oss.model.DeleteBucketLoggingRequest;
import com.alibaba.sdk.android.oss.model.DeleteBucketLoggingResult;
import com.alibaba.sdk.android.oss.model.DeleteBucketRequest;
import com.alibaba.sdk.android.oss.model.DeleteBucketResult;
import com.alibaba.sdk.android.oss.model.DeleteMultipleObjectRequest;
import com.alibaba.sdk.android.oss.model.DeleteMultipleObjectResult;
import com.alibaba.sdk.android.oss.model.DeleteObjectRequest;
import com.alibaba.sdk.android.oss.model.DeleteObjectResult;
import com.alibaba.sdk.android.oss.model.DeleteObjectTaggingRequest;
import com.alibaba.sdk.android.oss.model.DeleteObjectTaggingResult;
import com.alibaba.sdk.android.oss.model.GeneratePresignedUrlRequest;
import com.alibaba.sdk.android.oss.model.GetBucketACLRequest;
import com.alibaba.sdk.android.oss.model.GetBucketACLResult;
import com.alibaba.sdk.android.oss.model.GetBucketInfoRequest;
import com.alibaba.sdk.android.oss.model.GetBucketInfoResult;
import com.alibaba.sdk.android.oss.model.GetBucketLifecycleRequest;
import com.alibaba.sdk.android.oss.model.GetBucketLifecycleResult;
import com.alibaba.sdk.android.oss.model.GetBucketLoggingRequest;
import com.alibaba.sdk.android.oss.model.GetBucketLoggingResult;
import com.alibaba.sdk.android.oss.model.GetBucketRefererRequest;
import com.alibaba.sdk.android.oss.model.GetBucketRefererResult;
import com.alibaba.sdk.android.oss.model.GetObjectACLRequest;
import com.alibaba.sdk.android.oss.model.GetObjectACLResult;
import com.alibaba.sdk.android.oss.model.GetObjectMetaRequest;
import com.alibaba.sdk.android.oss.model.GetObjectMetaResult;
import com.alibaba.sdk.android.oss.model.GetObjectRequest;
import com.alibaba.sdk.android.oss.model.GetObjectResult;
import com.alibaba.sdk.android.oss.model.GetObjectTaggingRequest;
import com.alibaba.sdk.android.oss.model.GetObjectTaggingResult;
import com.alibaba.sdk.android.oss.model.GetSymlinkRequest;
import com.alibaba.sdk.android.oss.model.GetSymlinkResult;
import com.alibaba.sdk.android.oss.model.HeadObjectRequest;
import com.alibaba.sdk.android.oss.model.HeadObjectResult;
import com.alibaba.sdk.android.oss.model.ImagePersistRequest;
import com.alibaba.sdk.android.oss.model.ImagePersistResult;
import com.alibaba.sdk.android.oss.model.InitiateMultipartUploadRequest;
import com.alibaba.sdk.android.oss.model.InitiateMultipartUploadResult;
import com.alibaba.sdk.android.oss.model.ListBucketsRequest;
import com.alibaba.sdk.android.oss.model.ListBucketsResult;
import com.alibaba.sdk.android.oss.model.ListMultipartUploadsRequest;
import com.alibaba.sdk.android.oss.model.ListMultipartUploadsResult;
import com.alibaba.sdk.android.oss.model.ListObjectsRequest;
import com.alibaba.sdk.android.oss.model.ListObjectsResult;
import com.alibaba.sdk.android.oss.model.ListPartsRequest;
import com.alibaba.sdk.android.oss.model.ListPartsResult;
import com.alibaba.sdk.android.oss.model.MultipartUploadRequest;
import com.alibaba.sdk.android.oss.model.PutBucketLifecycleRequest;
import com.alibaba.sdk.android.oss.model.PutBucketLifecycleResult;
import com.alibaba.sdk.android.oss.model.PutBucketLoggingRequest;
import com.alibaba.sdk.android.oss.model.PutBucketLoggingResult;
import com.alibaba.sdk.android.oss.model.PutBucketRefererRequest;
import com.alibaba.sdk.android.oss.model.PutBucketRefererResult;
import com.alibaba.sdk.android.oss.model.PutObjectRequest;
import com.alibaba.sdk.android.oss.model.PutObjectResult;
import com.alibaba.sdk.android.oss.model.PutObjectTaggingRequest;
import com.alibaba.sdk.android.oss.model.PutObjectTaggingResult;
import com.alibaba.sdk.android.oss.model.PutSymlinkRequest;
import com.alibaba.sdk.android.oss.model.PutSymlinkResult;
import com.alibaba.sdk.android.oss.model.RestoreObjectRequest;
import com.alibaba.sdk.android.oss.model.RestoreObjectResult;
import com.alibaba.sdk.android.oss.model.ResumableDownloadRequest;
import com.alibaba.sdk.android.oss.model.ResumableDownloadResult;
import com.alibaba.sdk.android.oss.model.ResumableUploadRequest;
import com.alibaba.sdk.android.oss.model.ResumableUploadResult;
import com.alibaba.sdk.android.oss.model.TriggerCallbackRequest;
import com.alibaba.sdk.android.oss.model.TriggerCallbackResult;
import com.alibaba.sdk.android.oss.model.UploadPartRequest;
import com.alibaba.sdk.android.oss.model.UploadPartResult;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import p149l.ig3;

/* JADX INFO: loaded from: classes.dex */
class OSSImpl implements OSS {
    private ClientConfiguration conf;
    private OSSCredentialProvider credentialProvider;
    private URI endpointURI;
    private ExtensionRequestOperation extensionRequestOperation;
    private InternalRequestOperation internalRequestOperation;
    private ObjectURLPresigner objectURLPresigner;

    public OSSImpl(Context context, String str, OSSCredentialProvider oSSCredentialProvider, ClientConfiguration clientConfiguration) {
        this.conf = clientConfiguration == null ? ClientConfiguration.getDefaultConf() : clientConfiguration;
        OSSLogToFileUtils.init(context.getApplicationContext(), clientConfiguration);
        try {
            String strTrim = str.trim();
            if (!strTrim.startsWith("http")) {
                strTrim = this.conf.getHttpProtocol().toString() + "://" + strTrim;
            }
            URI uri = new URI(strTrim);
            this.endpointURI = uri;
            if (oSSCredentialProvider == null) {
                ig3.m135964a("CredentialProvider can't be null.");
                throw null;
            }
            Boolean boolValueOf = Boolean.FALSE;
            try {
                boolValueOf = Boolean.valueOf(OSSUtils.isValidateIP(uri.getHost()));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (this.endpointURI.getScheme().equals("https") && boolValueOf.booleanValue()) {
                ig3.m135964a("endpoint should not be format with https://ip.");
                throw null;
            }
            this.credentialProvider = oSSCredentialProvider;
            this.internalRequestOperation = new InternalRequestOperation(context.getApplicationContext(), this.endpointURI, oSSCredentialProvider, this.conf);
            this.extensionRequestOperation = new ExtensionRequestOperation(this.internalRequestOperation);
            this.objectURLPresigner = new ObjectURLPresigner(this.endpointURI, this.credentialProvider, this.conf);
        } catch (URISyntaxException unused) {
            ig3.m135964a("Endpoint must be a string like 'http://oss-cn-****.aliyuncs.com',or your cname like 'http://image.cnamedomain.com'!");
            throw null;
        }
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public AbortMultipartUploadResult abortMultipartUpload(AbortMultipartUploadRequest abortMultipartUploadRequest) throws ServiceException, ClientException {
        return (AbortMultipartUploadResult) this.internalRequestOperation.abortMultipartUpload(abortMultipartUploadRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public void abortResumableUpload(ResumableUploadRequest resumableUploadRequest) throws IOException {
        this.extensionRequestOperation.abortResumableUpload(resumableUploadRequest);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public AppendObjectResult appendObject(AppendObjectRequest appendObjectRequest) throws ServiceException, ClientException {
        return this.internalRequestOperation.syncAppendObject(appendObjectRequest);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<AbortMultipartUploadResult> asyncAbortMultipartUpload(AbortMultipartUploadRequest abortMultipartUploadRequest, OSSCompletedCallback<AbortMultipartUploadRequest, AbortMultipartUploadResult> oSSCompletedCallback) {
        return this.internalRequestOperation.abortMultipartUpload(abortMultipartUploadRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<AppendObjectResult> asyncAppendObject(AppendObjectRequest appendObjectRequest, OSSCompletedCallback<AppendObjectRequest, AppendObjectResult> oSSCompletedCallback) {
        return this.internalRequestOperation.appendObject(appendObjectRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<CompleteMultipartUploadResult> asyncCompleteMultipartUpload(CompleteMultipartUploadRequest completeMultipartUploadRequest, OSSCompletedCallback<CompleteMultipartUploadRequest, CompleteMultipartUploadResult> oSSCompletedCallback) {
        return this.internalRequestOperation.completeMultipartUpload(completeMultipartUploadRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<CopyObjectResult> asyncCopyObject(CopyObjectRequest copyObjectRequest, OSSCompletedCallback<CopyObjectRequest, CopyObjectResult> oSSCompletedCallback) {
        return this.internalRequestOperation.copyObject(copyObjectRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<CreateBucketResult> asyncCreateBucket(CreateBucketRequest createBucketRequest, OSSCompletedCallback<CreateBucketRequest, CreateBucketResult> oSSCompletedCallback) {
        return this.internalRequestOperation.createBucket(createBucketRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<DeleteBucketResult> asyncDeleteBucket(DeleteBucketRequest deleteBucketRequest, OSSCompletedCallback<DeleteBucketRequest, DeleteBucketResult> oSSCompletedCallback) {
        return this.internalRequestOperation.deleteBucket(deleteBucketRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<DeleteBucketLifecycleResult> asyncDeleteBucketLifecycle(DeleteBucketLifecycleRequest deleteBucketLifecycleRequest, OSSCompletedCallback<DeleteBucketLifecycleRequest, DeleteBucketLifecycleResult> oSSCompletedCallback) {
        return this.internalRequestOperation.deleteBucketLifecycle(deleteBucketLifecycleRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<DeleteBucketLoggingResult> asyncDeleteBucketLogging(DeleteBucketLoggingRequest deleteBucketLoggingRequest, OSSCompletedCallback<DeleteBucketLoggingRequest, DeleteBucketLoggingResult> oSSCompletedCallback) {
        return this.internalRequestOperation.deleteBucketLogging(deleteBucketLoggingRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<DeleteMultipleObjectResult> asyncDeleteMultipleObject(DeleteMultipleObjectRequest deleteMultipleObjectRequest, OSSCompletedCallback<DeleteMultipleObjectRequest, DeleteMultipleObjectResult> oSSCompletedCallback) {
        return this.internalRequestOperation.deleteMultipleObject(deleteMultipleObjectRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<DeleteObjectResult> asyncDeleteObject(DeleteObjectRequest deleteObjectRequest, OSSCompletedCallback<DeleteObjectRequest, DeleteObjectResult> oSSCompletedCallback) {
        return this.internalRequestOperation.deleteObject(deleteObjectRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<DeleteObjectTaggingResult> asyncDeleteObjectTagging(DeleteObjectTaggingRequest deleteObjectTaggingRequest, OSSCompletedCallback<DeleteObjectTaggingRequest, DeleteObjectTaggingResult> oSSCompletedCallback) {
        return this.internalRequestOperation.deleteObjectTagging(deleteObjectTaggingRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<GetBucketACLResult> asyncGetBucketACL(GetBucketACLRequest getBucketACLRequest, OSSCompletedCallback<GetBucketACLRequest, GetBucketACLResult> oSSCompletedCallback) {
        return this.internalRequestOperation.getBucketACL(getBucketACLRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<GetBucketInfoResult> asyncGetBucketInfo(GetBucketInfoRequest getBucketInfoRequest, OSSCompletedCallback<GetBucketInfoRequest, GetBucketInfoResult> oSSCompletedCallback) {
        return this.internalRequestOperation.getBucketInfo(getBucketInfoRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<GetBucketLifecycleResult> asyncGetBucketLifecycle(GetBucketLifecycleRequest getBucketLifecycleRequest, OSSCompletedCallback<GetBucketLifecycleRequest, GetBucketLifecycleResult> oSSCompletedCallback) {
        return this.internalRequestOperation.getBucketLifecycle(getBucketLifecycleRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<GetBucketLoggingResult> asyncGetBucketLogging(GetBucketLoggingRequest getBucketLoggingRequest, OSSCompletedCallback<GetBucketLoggingRequest, GetBucketLoggingResult> oSSCompletedCallback) {
        return this.internalRequestOperation.getBucketLogging(getBucketLoggingRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<GetBucketRefererResult> asyncGetBucketReferer(GetBucketRefererRequest getBucketRefererRequest, OSSCompletedCallback<GetBucketRefererRequest, GetBucketRefererResult> oSSCompletedCallback) {
        return this.internalRequestOperation.getBucketReferer(getBucketRefererRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<GetObjectResult> asyncGetObject(GetObjectRequest getObjectRequest, OSSCompletedCallback<GetObjectRequest, GetObjectResult> oSSCompletedCallback) {
        return this.internalRequestOperation.getObject(getObjectRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<GetObjectACLResult> asyncGetObjectACL(GetObjectACLRequest getObjectACLRequest, OSSCompletedCallback<GetObjectACLRequest, GetObjectACLResult> oSSCompletedCallback) {
        return this.internalRequestOperation.getObjectACL(getObjectACLRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<GetObjectMetaResult> asyncGetObjectMeta(GetObjectMetaRequest getObjectMetaRequest, OSSCompletedCallback<GetObjectMetaRequest, GetObjectMetaResult> oSSCompletedCallback) {
        return this.internalRequestOperation.getObjectMeta(getObjectMetaRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<GetObjectTaggingResult> asyncGetObjectTagging(GetObjectTaggingRequest getObjectTaggingRequest, OSSCompletedCallback<GetObjectTaggingRequest, GetObjectTaggingResult> oSSCompletedCallback) {
        return this.internalRequestOperation.getObjectTagging(getObjectTaggingRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<GetSymlinkResult> asyncGetSymlink(GetSymlinkRequest getSymlinkRequest, OSSCompletedCallback<GetSymlinkRequest, GetSymlinkResult> oSSCompletedCallback) {
        return this.internalRequestOperation.getSymlink(getSymlinkRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<HeadObjectResult> asyncHeadObject(HeadObjectRequest headObjectRequest, OSSCompletedCallback<HeadObjectRequest, HeadObjectResult> oSSCompletedCallback) {
        return this.internalRequestOperation.headObject(headObjectRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<ImagePersistResult> asyncImagePersist(ImagePersistRequest imagePersistRequest, OSSCompletedCallback<ImagePersistRequest, ImagePersistResult> oSSCompletedCallback) {
        return this.internalRequestOperation.imageActionPersist(imagePersistRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<InitiateMultipartUploadResult> asyncInitMultipartUpload(InitiateMultipartUploadRequest initiateMultipartUploadRequest, OSSCompletedCallback<InitiateMultipartUploadRequest, InitiateMultipartUploadResult> oSSCompletedCallback) {
        return this.internalRequestOperation.initMultipartUpload(initiateMultipartUploadRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<ListBucketsResult> asyncListBuckets(ListBucketsRequest listBucketsRequest, OSSCompletedCallback<ListBucketsRequest, ListBucketsResult> oSSCompletedCallback) {
        return this.internalRequestOperation.listBuckets(listBucketsRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<ListMultipartUploadsResult> asyncListMultipartUploads(ListMultipartUploadsRequest listMultipartUploadsRequest, OSSCompletedCallback<ListMultipartUploadsRequest, ListMultipartUploadsResult> oSSCompletedCallback) {
        return this.internalRequestOperation.listMultipartUploads(listMultipartUploadsRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<ListObjectsResult> asyncListObjects(ListObjectsRequest listObjectsRequest, OSSCompletedCallback<ListObjectsRequest, ListObjectsResult> oSSCompletedCallback) {
        return this.internalRequestOperation.listObjects(listObjectsRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<ListPartsResult> asyncListParts(ListPartsRequest listPartsRequest, OSSCompletedCallback<ListPartsRequest, ListPartsResult> oSSCompletedCallback) {
        return this.internalRequestOperation.listParts(listPartsRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<CompleteMultipartUploadResult> asyncMultipartUpload(MultipartUploadRequest multipartUploadRequest, OSSCompletedCallback<MultipartUploadRequest, CompleteMultipartUploadResult> oSSCompletedCallback) {
        return this.extensionRequestOperation.multipartUpload(multipartUploadRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<PutBucketLifecycleResult> asyncPutBucketLifecycle(PutBucketLifecycleRequest putBucketLifecycleRequest, OSSCompletedCallback<PutBucketLifecycleRequest, PutBucketLifecycleResult> oSSCompletedCallback) {
        return this.internalRequestOperation.putBucketLifecycle(putBucketLifecycleRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<PutBucketLoggingResult> asyncPutBucketLogging(PutBucketLoggingRequest putBucketLoggingRequest, OSSCompletedCallback<PutBucketLoggingRequest, PutBucketLoggingResult> oSSCompletedCallback) {
        return this.internalRequestOperation.putBucketLogging(putBucketLoggingRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<PutBucketRefererResult> asyncPutBucketReferer(PutBucketRefererRequest putBucketRefererRequest, OSSCompletedCallback<PutBucketRefererRequest, PutBucketRefererResult> oSSCompletedCallback) {
        return this.internalRequestOperation.putBucketReferer(putBucketRefererRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<PutObjectResult> asyncPutObject(PutObjectRequest putObjectRequest, OSSCompletedCallback<PutObjectRequest, PutObjectResult> oSSCompletedCallback) {
        return this.internalRequestOperation.putObject(putObjectRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<PutObjectTaggingResult> asyncPutObjectTagging(PutObjectTaggingRequest putObjectTaggingRequest, OSSCompletedCallback<PutObjectTaggingRequest, PutObjectTaggingResult> oSSCompletedCallback) {
        return this.internalRequestOperation.putObjectTagging(putObjectTaggingRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<PutSymlinkResult> asyncPutSymlink(PutSymlinkRequest putSymlinkRequest, OSSCompletedCallback<PutSymlinkRequest, PutSymlinkResult> oSSCompletedCallback) {
        return this.internalRequestOperation.putSymlink(putSymlinkRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<RestoreObjectResult> asyncRestoreObject(RestoreObjectRequest restoreObjectRequest, OSSCompletedCallback<RestoreObjectRequest, RestoreObjectResult> oSSCompletedCallback) {
        return this.internalRequestOperation.restoreObject(restoreObjectRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<ResumableDownloadResult> asyncResumableDownload(ResumableDownloadRequest resumableDownloadRequest, OSSCompletedCallback<ResumableDownloadRequest, ResumableDownloadResult> oSSCompletedCallback) {
        return this.extensionRequestOperation.resumableDownload(resumableDownloadRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<ResumableUploadResult> asyncResumableUpload(ResumableUploadRequest resumableUploadRequest, OSSCompletedCallback<ResumableUploadRequest, ResumableUploadResult> oSSCompletedCallback) {
        return this.extensionRequestOperation.resumableUpload(resumableUploadRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<ResumableUploadResult> asyncSequenceUpload(ResumableUploadRequest resumableUploadRequest, OSSCompletedCallback<ResumableUploadRequest, ResumableUploadResult> oSSCompletedCallback) {
        return this.extensionRequestOperation.sequenceUpload(resumableUploadRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<TriggerCallbackResult> asyncTriggerCallback(TriggerCallbackRequest triggerCallbackRequest, OSSCompletedCallback<TriggerCallbackRequest, TriggerCallbackResult> oSSCompletedCallback) {
        return this.internalRequestOperation.triggerCallback(triggerCallbackRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public OSSAsyncTask<UploadPartResult> asyncUploadPart(UploadPartRequest uploadPartRequest, OSSCompletedCallback<UploadPartRequest, UploadPartResult> oSSCompletedCallback) {
        return this.internalRequestOperation.uploadPart(uploadPartRequest, oSSCompletedCallback);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public CompleteMultipartUploadResult completeMultipartUpload(CompleteMultipartUploadRequest completeMultipartUploadRequest) throws ServiceException, ClientException {
        return this.internalRequestOperation.syncCompleteMultipartUpload(completeMultipartUploadRequest);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public CopyObjectResult copyObject(CopyObjectRequest copyObjectRequest) throws ServiceException, ClientException {
        return (CopyObjectResult) this.internalRequestOperation.copyObject(copyObjectRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public CreateBucketResult createBucket(CreateBucketRequest createBucketRequest) throws ServiceException, ClientException {
        return (CreateBucketResult) this.internalRequestOperation.createBucket(createBucketRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public DeleteBucketResult deleteBucket(DeleteBucketRequest deleteBucketRequest) throws ServiceException, ClientException {
        return (DeleteBucketResult) this.internalRequestOperation.deleteBucket(deleteBucketRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public DeleteBucketLifecycleResult deleteBucketLifecycle(DeleteBucketLifecycleRequest deleteBucketLifecycleRequest) throws ServiceException, ClientException {
        return (DeleteBucketLifecycleResult) this.internalRequestOperation.deleteBucketLifecycle(deleteBucketLifecycleRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public DeleteBucketLoggingResult deleteBucketLogging(DeleteBucketLoggingRequest deleteBucketLoggingRequest) throws ServiceException, ClientException {
        return (DeleteBucketLoggingResult) this.internalRequestOperation.deleteBucketLogging(deleteBucketLoggingRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public DeleteMultipleObjectResult deleteMultipleObject(DeleteMultipleObjectRequest deleteMultipleObjectRequest) throws ServiceException, ClientException {
        return (DeleteMultipleObjectResult) this.internalRequestOperation.deleteMultipleObject(deleteMultipleObjectRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public DeleteObjectResult deleteObject(DeleteObjectRequest deleteObjectRequest) throws ServiceException, ClientException {
        return (DeleteObjectResult) this.internalRequestOperation.deleteObject(deleteObjectRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public DeleteObjectTaggingResult deleteObjectTagging(DeleteObjectTaggingRequest deleteObjectTaggingRequest) throws ServiceException, ClientException {
        return this.internalRequestOperation.syncDeleteObjectTagging(deleteObjectTaggingRequest);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public boolean doesObjectExist(String str, String str2) throws ServiceException, ClientException {
        return this.extensionRequestOperation.doesObjectExist(str, str2);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public GetBucketACLResult getBucketACL(GetBucketACLRequest getBucketACLRequest) throws ServiceException, ClientException {
        return (GetBucketACLResult) this.internalRequestOperation.getBucketACL(getBucketACLRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public GetBucketInfoResult getBucketInfo(GetBucketInfoRequest getBucketInfoRequest) throws ServiceException, ClientException {
        return (GetBucketInfoResult) this.internalRequestOperation.getBucketInfo(getBucketInfoRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public GetBucketLifecycleResult getBucketLifecycle(GetBucketLifecycleRequest getBucketLifecycleRequest) throws ServiceException, ClientException {
        return (GetBucketLifecycleResult) this.internalRequestOperation.getBucketLifecycle(getBucketLifecycleRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public GetBucketLoggingResult getBucketLogging(GetBucketLoggingRequest getBucketLoggingRequest) throws ServiceException, ClientException {
        return (GetBucketLoggingResult) this.internalRequestOperation.getBucketLogging(getBucketLoggingRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public GetBucketRefererResult getBucketReferer(GetBucketRefererRequest getBucketRefererRequest) throws ServiceException, ClientException {
        return (GetBucketRefererResult) this.internalRequestOperation.getBucketReferer(getBucketRefererRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public GetObjectResult getObject(GetObjectRequest getObjectRequest) throws ServiceException, ClientException {
        return (GetObjectResult) this.internalRequestOperation.getObject(getObjectRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public GetObjectACLResult getObjectACL(GetObjectACLRequest getObjectACLRequest) throws ServiceException, ClientException {
        return (GetObjectACLResult) this.internalRequestOperation.getObjectACL(getObjectACLRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public GetObjectMetaResult getObjectMeta(GetObjectMetaRequest getObjectMetaRequest) throws ServiceException, ClientException {
        return (GetObjectMetaResult) this.internalRequestOperation.getObjectMeta(getObjectMetaRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public GetObjectTaggingResult getObjectTagging(GetObjectTaggingRequest getObjectTaggingRequest) throws ServiceException, ClientException {
        return this.internalRequestOperation.syncGetObjectTagging(getObjectTaggingRequest);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public GetSymlinkResult getSymlink(GetSymlinkRequest getSymlinkRequest) throws ServiceException, ClientException {
        return this.internalRequestOperation.syncGetSymlink(getSymlinkRequest);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public HeadObjectResult headObject(HeadObjectRequest headObjectRequest) throws ServiceException, ClientException {
        return (HeadObjectResult) this.internalRequestOperation.headObject(headObjectRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public ImagePersistResult imagePersist(ImagePersistRequest imagePersistRequest) throws ServiceException, ClientException {
        return (ImagePersistResult) this.internalRequestOperation.imageActionPersist(imagePersistRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public InitiateMultipartUploadResult initMultipartUpload(InitiateMultipartUploadRequest initiateMultipartUploadRequest) throws ServiceException, ClientException {
        return (InitiateMultipartUploadResult) this.internalRequestOperation.initMultipartUpload(initiateMultipartUploadRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public ListBucketsResult listBuckets(ListBucketsRequest listBucketsRequest) throws ServiceException, ClientException {
        return (ListBucketsResult) this.internalRequestOperation.listBuckets(listBucketsRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public ListMultipartUploadsResult listMultipartUploads(ListMultipartUploadsRequest listMultipartUploadsRequest) throws ServiceException, ClientException {
        return (ListMultipartUploadsResult) this.internalRequestOperation.listMultipartUploads(listMultipartUploadsRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public ListObjectsResult listObjects(ListObjectsRequest listObjectsRequest) throws ServiceException, ClientException {
        return (ListObjectsResult) this.internalRequestOperation.listObjects(listObjectsRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public ListPartsResult listParts(ListPartsRequest listPartsRequest) throws ServiceException, ClientException {
        return (ListPartsResult) this.internalRequestOperation.listParts(listPartsRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public CompleteMultipartUploadResult multipartUpload(MultipartUploadRequest multipartUploadRequest) throws ServiceException, ClientException {
        return (CompleteMultipartUploadResult) this.extensionRequestOperation.multipartUpload(multipartUploadRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public String presignConstrainedObjectURL(GeneratePresignedUrlRequest generatePresignedUrlRequest) throws ClientException {
        return this.objectURLPresigner.presignConstrainedURL(generatePresignedUrlRequest);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public String presignPublicObjectURL(String str, String str2) {
        return this.objectURLPresigner.presignPublicURL(str, str2);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public PutBucketLifecycleResult putBucketLifecycle(PutBucketLifecycleRequest putBucketLifecycleRequest) throws ServiceException, ClientException {
        return (PutBucketLifecycleResult) this.internalRequestOperation.putBucketLifecycle(putBucketLifecycleRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public PutBucketLoggingResult putBucketLogging(PutBucketLoggingRequest putBucketLoggingRequest) throws ServiceException, ClientException {
        return (PutBucketLoggingResult) this.internalRequestOperation.putBucketLogging(putBucketLoggingRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public PutBucketRefererResult putBucketReferer(PutBucketRefererRequest putBucketRefererRequest) throws ServiceException, ClientException {
        return (PutBucketRefererResult) this.internalRequestOperation.putBucketReferer(putBucketRefererRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public PutObjectResult putObject(PutObjectRequest putObjectRequest) throws ServiceException, ClientException {
        return this.internalRequestOperation.syncPutObject(putObjectRequest);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public PutObjectTaggingResult putObjectTagging(PutObjectTaggingRequest putObjectTaggingRequest) throws ServiceException, ClientException {
        return this.internalRequestOperation.syncPutObjectTagging(putObjectTaggingRequest);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public PutSymlinkResult putSymlink(PutSymlinkRequest putSymlinkRequest) throws ServiceException, ClientException {
        return this.internalRequestOperation.syncPutSymlink(putSymlinkRequest);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public RestoreObjectResult restoreObject(RestoreObjectRequest restoreObjectRequest) throws ServiceException, ClientException {
        return this.internalRequestOperation.syncRestoreObject(restoreObjectRequest);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public ResumableUploadResult resumableUpload(ResumableUploadRequest resumableUploadRequest) throws ServiceException, ClientException {
        return (ResumableUploadResult) this.extensionRequestOperation.resumableUpload(resumableUploadRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public ResumableUploadResult sequenceUpload(ResumableUploadRequest resumableUploadRequest) throws ServiceException, ClientException {
        return (ResumableUploadResult) this.extensionRequestOperation.sequenceUpload(resumableUploadRequest, null).getResult();
    }

    public void setCloudBoxId(String str) {
        this.internalRequestOperation.setCloudBoxId(str);
        ObjectURLPresigner objectURLPresigner = this.objectURLPresigner;
        if (objectURLPresigner != null) {
            objectURLPresigner.setCloudBoxId(str);
        }
    }

    public void setProduct(String str) {
        this.internalRequestOperation.setProduct(str);
        ObjectURLPresigner objectURLPresigner = this.objectURLPresigner;
        if (objectURLPresigner != null) {
            objectURLPresigner.setProduct(str);
        }
    }

    public void setRegion(String str) {
        this.internalRequestOperation.setRegion(str);
        ObjectURLPresigner objectURLPresigner = this.objectURLPresigner;
        if (objectURLPresigner != null) {
            objectURLPresigner.setRegion(str);
        }
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public ResumableDownloadResult syncResumableDownload(ResumableDownloadRequest resumableDownloadRequest) throws ServiceException, ClientException {
        return (ResumableDownloadResult) this.extensionRequestOperation.resumableDownload(resumableDownloadRequest, null).getResult();
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public TriggerCallbackResult triggerCallback(TriggerCallbackRequest triggerCallbackRequest) throws ServiceException, ClientException {
        return this.internalRequestOperation.asyncTriggerCallback(triggerCallbackRequest);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public void updateCredentialProvider(OSSCredentialProvider oSSCredentialProvider) {
        this.credentialProvider = oSSCredentialProvider;
        this.internalRequestOperation.setCredentialProvider(oSSCredentialProvider);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public UploadPartResult uploadPart(UploadPartRequest uploadPartRequest) throws ServiceException, ClientException {
        return this.internalRequestOperation.syncUploadPart(uploadPartRequest);
    }

    @Override // com.alibaba.sdk.android.oss.OSS
    public String presignConstrainedObjectURL(String str, String str2, long j) throws ClientException {
        return this.objectURLPresigner.presignConstrainedURL(str, str2, j);
    }

    public OSSImpl(Context context, OSSCredentialProvider oSSCredentialProvider, ClientConfiguration clientConfiguration) {
        this.credentialProvider = oSSCredentialProvider;
        this.conf = clientConfiguration == null ? ClientConfiguration.getDefaultConf() : clientConfiguration;
        this.internalRequestOperation = new InternalRequestOperation(context.getApplicationContext(), oSSCredentialProvider, this.conf);
        this.extensionRequestOperation = new ExtensionRequestOperation(this.internalRequestOperation);
    }
}
