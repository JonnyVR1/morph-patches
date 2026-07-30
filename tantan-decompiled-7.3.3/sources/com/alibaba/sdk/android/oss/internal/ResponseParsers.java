package com.alibaba.sdk.android.oss.internal;

import android.text.TextUtils;
import android.util.Xml;
import com.alibaba.sdk.android.oss.ClientException;
import com.alibaba.sdk.android.oss.ServiceException;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.CRC64;
import com.alibaba.sdk.android.oss.common.utils.DateUtil;
import com.alibaba.sdk.android.oss.common.utils.OSSUtils;
import com.alibaba.sdk.android.oss.model.AbortMultipartUploadResult;
import com.alibaba.sdk.android.oss.model.AppendObjectResult;
import com.alibaba.sdk.android.oss.model.BucketLifecycleRule;
import com.alibaba.sdk.android.oss.model.CompleteMultipartUploadResult;
import com.alibaba.sdk.android.oss.model.CopyObjectResult;
import com.alibaba.sdk.android.oss.model.CreateBucketRequest;
import com.alibaba.sdk.android.oss.model.CreateBucketResult;
import com.alibaba.sdk.android.oss.model.DeleteBucketLifecycleResult;
import com.alibaba.sdk.android.oss.model.DeleteBucketLoggingResult;
import com.alibaba.sdk.android.oss.model.DeleteBucketResult;
import com.alibaba.sdk.android.oss.model.DeleteMultipleObjectResult;
import com.alibaba.sdk.android.oss.model.DeleteObjectResult;
import com.alibaba.sdk.android.oss.model.DeleteObjectTaggingResult;
import com.alibaba.sdk.android.oss.model.GetBucketACLResult;
import com.alibaba.sdk.android.oss.model.GetBucketInfoResult;
import com.alibaba.sdk.android.oss.model.GetBucketLifecycleResult;
import com.alibaba.sdk.android.oss.model.GetBucketLoggingResult;
import com.alibaba.sdk.android.oss.model.GetBucketRefererResult;
import com.alibaba.sdk.android.oss.model.GetObjectACLResult;
import com.alibaba.sdk.android.oss.model.GetObjectMetaResult;
import com.alibaba.sdk.android.oss.model.GetObjectResult;
import com.alibaba.sdk.android.oss.model.GetObjectTaggingResult;
import com.alibaba.sdk.android.oss.model.GetSymlinkResult;
import com.alibaba.sdk.android.oss.model.HeadObjectResult;
import com.alibaba.sdk.android.oss.model.ImagePersistResult;
import com.alibaba.sdk.android.oss.model.InitiateMultipartUploadResult;
import com.alibaba.sdk.android.oss.model.ListBucketsResult;
import com.alibaba.sdk.android.oss.model.ListMultipartUploadsResult;
import com.alibaba.sdk.android.oss.model.ListObjectsResult;
import com.alibaba.sdk.android.oss.model.ListPartsResult;
import com.alibaba.sdk.android.oss.model.OSSBucketSummary;
import com.alibaba.sdk.android.oss.model.OSSObjectSummary;
import com.alibaba.sdk.android.oss.model.ObjectMetadata;
import com.alibaba.sdk.android.oss.model.Owner;
import com.alibaba.sdk.android.oss.model.PartSummary;
import com.alibaba.sdk.android.oss.model.PutBucketLifecycleResult;
import com.alibaba.sdk.android.oss.model.PutBucketLoggingResult;
import com.alibaba.sdk.android.oss.model.PutBucketRefererResult;
import com.alibaba.sdk.android.oss.model.PutObjectResult;
import com.alibaba.sdk.android.oss.model.PutObjectTaggingResult;
import com.alibaba.sdk.android.oss.model.PutSymlinkResult;
import com.alibaba.sdk.android.oss.model.RestoreObjectResult;
import com.alibaba.sdk.android.oss.model.TriggerCallbackResult;
import com.alibaba.sdk.android.oss.model.UploadPartResult;
import com.clevertap.android.sdk.Constants;
import com.momo.rtcbase.PeerConnectionFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.jetty.http.HttpHeaders;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class ResponseParsers {

    public static final class AppendObjectResponseParser extends AbstractResponseParser<AppendObjectResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public AppendObjectResult parseData(ResponseMessage responseMessage, AppendObjectResult appendObjectResult) throws IOException {
            String str = (String) responseMessage.getHeaders().get(OSSHeaders.OSS_NEXT_APPEND_POSITION);
            if (str != null) {
                appendObjectResult.setNextPosition(Long.valueOf(str));
            }
            appendObjectResult.setObjectCRC64((String) responseMessage.getHeaders().get(OSSHeaders.OSS_HASH_CRC64_ECMA));
            return appendObjectResult;
        }
    }

    public static final class CompleteMultipartUploadResponseParser extends AbstractResponseParser<CompleteMultipartUploadResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public CompleteMultipartUploadResult parseData(ResponseMessage responseMessage, CompleteMultipartUploadResult completeMultipartUploadResult) throws Exception {
            if (((String) responseMessage.getHeaders().get("Content-Type")).equals("application/xml")) {
                return ResponseParsers.parseCompleteMultipartUploadResponseXML(responseMessage.getContent(), completeMultipartUploadResult);
            }
            String strString = responseMessage.getResponse().m138670k().string();
            if (!TextUtils.isEmpty(strString)) {
                completeMultipartUploadResult.setServerCallbackReturnBody(strString);
            }
            return completeMultipartUploadResult;
        }
    }

    public static final class CopyObjectResponseParser extends AbstractResponseParser<CopyObjectResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public CopyObjectResult parseData(ResponseMessage responseMessage, CopyObjectResult copyObjectResult) throws Exception {
            return ResponseParsers.parseCopyObjectResponseXML(responseMessage.getContent(), copyObjectResult);
        }
    }

    public static final class CreateBucketResponseParser extends AbstractResponseParser<CreateBucketResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public CreateBucketResult parseData(ResponseMessage responseMessage, CreateBucketResult createBucketResult) throws Exception {
            if (createBucketResult.getResponseHeader().containsKey("Location")) {
                createBucketResult.bucketLocation = createBucketResult.getResponseHeader().get("Location");
            }
            return createBucketResult;
        }
    }

    public static final class DeleteMultipleObjectResponseParser extends AbstractResponseParser<DeleteMultipleObjectResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public DeleteMultipleObjectResult parseData(ResponseMessage responseMessage, DeleteMultipleObjectResult deleteMultipleObjectResult) throws Exception {
            return ResponseParsers.parseDeleteMultipleObjectResponse(responseMessage.getContent(), deleteMultipleObjectResult);
        }
    }

    public static final class GetBucketACLResponseParser extends AbstractResponseParser<GetBucketACLResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public GetBucketACLResult parseData(ResponseMessage responseMessage, GetBucketACLResult getBucketACLResult) throws Exception {
            return ResponseParsers.parseGetBucketACLResponse(responseMessage.getContent(), getBucketACLResult);
        }
    }

    public static final class GetBucketInfoResponseParser extends AbstractResponseParser<GetBucketInfoResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public GetBucketInfoResult parseData(ResponseMessage responseMessage, GetBucketInfoResult getBucketInfoResult) throws Exception {
            return ResponseParsers.parseGetBucketInfoResponse(responseMessage.getContent(), getBucketInfoResult);
        }
    }

    public static final class GetBucketLifecycleResponseParser extends AbstractResponseParser<GetBucketLifecycleResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public GetBucketLifecycleResult parseData(ResponseMessage responseMessage, GetBucketLifecycleResult getBucketLifecycleResult) throws Exception {
            return ResponseParsers.parseGetBucketLifecycleResponse(responseMessage.getContent(), getBucketLifecycleResult);
        }
    }

    public static final class GetBucketLoggingResponseParser extends AbstractResponseParser<GetBucketLoggingResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public GetBucketLoggingResult parseData(ResponseMessage responseMessage, GetBucketLoggingResult getBucketLoggingResult) throws Exception {
            return ResponseParsers.parseGetBucketLoggingResponse(responseMessage.getContent(), getBucketLoggingResult);
        }
    }

    public static final class GetBucketRefererResponseParser extends AbstractResponseParser<GetBucketRefererResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public GetBucketRefererResult parseData(ResponseMessage responseMessage, GetBucketRefererResult getBucketRefererResult) throws Exception {
            return ResponseParsers.parseGetBucketRefererResponse(responseMessage.getContent(), getBucketRefererResult);
        }
    }

    public static final class GetObjectACLResponseParser extends AbstractResponseParser<GetObjectACLResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public GetObjectACLResult parseData(ResponseMessage responseMessage, GetObjectACLResult getObjectACLResult) throws Exception {
            return ResponseParsers.parseGetObjectACLResponse(responseMessage.getContent(), getObjectACLResult);
        }
    }

    public static final class GetObjectMetaResponseParser extends AbstractResponseParser<GetObjectMetaResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public GetObjectMetaResult parseData(ResponseMessage responseMessage, GetObjectMetaResult getObjectMetaResult) throws Exception {
            getObjectMetaResult.setMetadata(ResponseParsers.parseObjectMetadata(getObjectMetaResult.getResponseHeader()));
            return getObjectMetaResult;
        }
    }

    public static final class GetObjectResponseParser extends AbstractResponseParser<GetObjectResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public boolean needCloseResponse() {
            return false;
        }

        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public GetObjectResult parseData(ResponseMessage responseMessage, GetObjectResult getObjectResult) throws Exception {
            getObjectResult.setMetadata(ResponseParsers.parseObjectMetadata(getObjectResult.getResponseHeader()));
            getObjectResult.setContentLength(responseMessage.getContentLength());
            if (responseMessage.getRequest().isCheckCRC64()) {
                getObjectResult.setObjectContent(new CheckCRC64DownloadInputStream(responseMessage.getContent(), new CRC64(), responseMessage.getContentLength(), getObjectResult.getServerCRC().longValue(), getObjectResult.getRequestId()));
                return getObjectResult;
            }
            getObjectResult.setObjectContent(responseMessage.getContent());
            return getObjectResult;
        }
    }

    public static final class GetObjectTaggingResponseParser extends AbstractResponseParser<GetObjectTaggingResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public GetObjectTaggingResult parseData(ResponseMessage responseMessage, GetObjectTaggingResult getObjectTaggingResult) throws Exception {
            return ResponseParsers.parseGetObjectTaggingResponse(responseMessage.getContent(), getObjectTaggingResult);
        }
    }

    public static final class GetSymlinkResponseParser extends AbstractResponseParser<GetSymlinkResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public GetSymlinkResult parseData(ResponseMessage responseMessage, GetSymlinkResult getSymlinkResult) throws Exception {
            getSymlinkResult.setTargetObjectName((String) responseMessage.getHeaders().get(OSSHeaders.OSS_HEADER_SYMLINK_TARGET));
            return getSymlinkResult;
        }
    }

    public static final class HeadObjectResponseParser extends AbstractResponseParser<HeadObjectResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public HeadObjectResult parseData(ResponseMessage responseMessage, HeadObjectResult headObjectResult) throws Exception {
            headObjectResult.setMetadata(ResponseParsers.parseObjectMetadata(headObjectResult.getResponseHeader()));
            return headObjectResult;
        }
    }

    public static final class InitMultipartResponseParser extends AbstractResponseParser<InitiateMultipartUploadResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public InitiateMultipartUploadResult parseData(ResponseMessage responseMessage, InitiateMultipartUploadResult initiateMultipartUploadResult) throws Exception {
            return ResponseParsers.parseInitMultipartResponseXML(responseMessage.getContent(), initiateMultipartUploadResult);
        }
    }

    public static final class ListBucketResponseParser extends AbstractResponseParser<ListBucketsResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public ListBucketsResult parseData(ResponseMessage responseMessage, ListBucketsResult listBucketsResult) throws Exception {
            return ResponseParsers.parseBucketListResponse(responseMessage.getContent(), listBucketsResult);
        }
    }

    public static final class ListObjectsResponseParser extends AbstractResponseParser<ListObjectsResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public ListObjectsResult parseData(ResponseMessage responseMessage, ListObjectsResult listObjectsResult) throws Exception {
            return ResponseParsers.parseObjectListResponse(responseMessage.getContent(), listObjectsResult);
        }
    }

    public static final class ListPartsResponseParser extends AbstractResponseParser<ListPartsResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public ListPartsResult parseData(ResponseMessage responseMessage, ListPartsResult listPartsResult) throws Exception {
            return ResponseParsers.parseListPartsResponseXML(responseMessage.getContent(), listPartsResult);
        }
    }

    public static final class PutObjectResponseParser extends AbstractResponseParser<PutObjectResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public PutObjectResult parseData(ResponseMessage responseMessage, PutObjectResult putObjectResult) throws IOException {
            putObjectResult.setETag(ResponseParsers.trimQuotes((String) responseMessage.getHeaders().get("ETag")));
            String strString = responseMessage.getResponse().m138670k().string();
            if (!TextUtils.isEmpty(strString)) {
                putObjectResult.setServerCallbackReturnBody(strString);
            }
            return putObjectResult;
        }
    }

    public static final class TriggerCallbackResponseParser extends AbstractResponseParser<TriggerCallbackResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public TriggerCallbackResult parseData(ResponseMessage responseMessage, TriggerCallbackResult triggerCallbackResult) throws Exception {
            String strString = responseMessage.getResponse().m138670k().string();
            if (!TextUtils.isEmpty(strString)) {
                triggerCallbackResult.setServerCallbackReturnBody(strString);
            }
            return triggerCallbackResult;
        }
    }

    public static final class UploadPartResponseParser extends AbstractResponseParser<UploadPartResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public UploadPartResult parseData(ResponseMessage responseMessage, UploadPartResult uploadPartResult) throws Exception {
            uploadPartResult.setETag(ResponseParsers.trimQuotes((String) responseMessage.getHeaders().get("ETag")));
            return uploadPartResult;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ListBucketsResult parseBucketListResponse(InputStream inputStream, ListBucketsResult listBucketsResult) throws Exception {
        listBucketsResult.clearBucketList();
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
        int eventType = xmlPullParserNewPullParser.getEventType();
        OSSBucketSummary oSSBucketSummary = null;
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlPullParserNewPullParser.getName();
                if (name != null) {
                    if ("Prefix".equals(name)) {
                        listBucketsResult.setPrefix(xmlPullParserNewPullParser.nextText());
                    } else if ("Marker".equals(name)) {
                        listBucketsResult.setMarker(xmlPullParserNewPullParser.nextText());
                    } else if ("MaxKeys".equals(name)) {
                        String strNextText = xmlPullParserNewPullParser.nextText();
                        if (strNextText != null) {
                            listBucketsResult.setMaxKeys(Integer.valueOf(strNextText).intValue());
                        }
                    } else if ("IsTruncated".equals(name)) {
                        String strNextText2 = xmlPullParserNewPullParser.nextText();
                        if (strNextText2 != null) {
                            listBucketsResult.setTruncated(Boolean.valueOf(strNextText2).booleanValue());
                        }
                    } else if ("NextMarker".equals(name)) {
                        listBucketsResult.setNextMarker(xmlPullParserNewPullParser.nextText());
                    } else if ("ID".equals(name)) {
                        listBucketsResult.setOwnerId(xmlPullParserNewPullParser.nextText());
                    } else if ("DisplayName".equals(name)) {
                        listBucketsResult.setOwnerDisplayName(xmlPullParserNewPullParser.nextText());
                    } else if ("Bucket".equals(name)) {
                        oSSBucketSummary = new OSSBucketSummary();
                    } else if ("CreationDate".equals(name)) {
                        if (oSSBucketSummary != null) {
                            oSSBucketSummary.createDate = DateUtil.parseIso8601Date(xmlPullParserNewPullParser.nextText());
                        }
                    } else if ("ExtranetEndpoint".equals(name)) {
                        if (oSSBucketSummary != null) {
                            oSSBucketSummary.extranetEndpoint = xmlPullParserNewPullParser.nextText();
                        }
                    } else if ("IntranetEndpoint".equals(name)) {
                        if (oSSBucketSummary != null) {
                            oSSBucketSummary.intranetEndpoint = xmlPullParserNewPullParser.nextText();
                        }
                    } else if ("Location".equals(name)) {
                        if (oSSBucketSummary != null) {
                            oSSBucketSummary.location = xmlPullParserNewPullParser.nextText();
                        }
                    } else if (Constants.KEY_ENCRYPTION_NAME.equals(name)) {
                        if (oSSBucketSummary != null) {
                            oSSBucketSummary.name = xmlPullParserNewPullParser.nextText();
                        }
                    } else if (CreateBucketRequest.TAB_STORAGECLASS.equals(name) && oSSBucketSummary != null) {
                        oSSBucketSummary.storageClass = xmlPullParserNewPullParser.nextText();
                    }
                }
            } else if (eventType == 3 && "Bucket".equals(xmlPullParserNewPullParser.getName()) && oSSBucketSummary != null) {
                listBucketsResult.addBucket(oSSBucketSummary);
            }
            eventType = xmlPullParserNewPullParser.next();
            if (eventType == 4) {
                eventType = xmlPullParserNewPullParser.next();
            }
        }
        return listBucketsResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CompleteMultipartUploadResult parseCompleteMultipartUploadResponseXML(InputStream inputStream, CompleteMultipartUploadResult completeMultipartUploadResult) throws Exception {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
        int eventType = xmlPullParserNewPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlPullParserNewPullParser.getName();
                if ("Location".equals(name)) {
                    completeMultipartUploadResult.setLocation(xmlPullParserNewPullParser.nextText());
                } else if ("Bucket".equals(name)) {
                    completeMultipartUploadResult.setBucketName(xmlPullParserNewPullParser.nextText());
                } else if ("Key".equals(name)) {
                    completeMultipartUploadResult.setObjectKey(xmlPullParserNewPullParser.nextText());
                } else if ("ETag".equals(name)) {
                    completeMultipartUploadResult.setETag(xmlPullParserNewPullParser.nextText());
                }
            }
            eventType = xmlPullParserNewPullParser.next();
            if (eventType == 4) {
                eventType = xmlPullParserNewPullParser.next();
            }
        }
        return completeMultipartUploadResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CopyObjectResult parseCopyObjectResponseXML(InputStream inputStream, CopyObjectResult copyObjectResult) throws Exception {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
        int eventType = xmlPullParserNewPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlPullParserNewPullParser.getName();
                if ("LastModified".equals(name)) {
                    copyObjectResult.setLastModified(DateUtil.parseIso8601Date(xmlPullParserNewPullParser.nextText()));
                } else if ("ETag".equals(name)) {
                    copyObjectResult.setEtag(xmlPullParserNewPullParser.nextText());
                }
            }
            eventType = xmlPullParserNewPullParser.next();
            if (eventType == 4) {
                eventType = xmlPullParserNewPullParser.next();
            }
        }
        return copyObjectResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DeleteMultipleObjectResult parseDeleteMultipleObjectResponse(InputStream inputStream, DeleteMultipleObjectResult deleteMultipleObjectResult) throws Exception {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
        int eventType = xmlPullParserNewPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2 && "Key".equals(xmlPullParserNewPullParser.getName())) {
                deleteMultipleObjectResult.addDeletedObject(xmlPullParserNewPullParser.nextText());
            }
            eventType = xmlPullParserNewPullParser.next();
            if (eventType == 4) {
                eventType = xmlPullParserNewPullParser.next();
            }
        }
        return deleteMultipleObjectResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GetBucketACLResult parseGetBucketACLResponse(InputStream inputStream, GetBucketACLResult getBucketACLResult) throws Exception {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
        int eventType = xmlPullParserNewPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlPullParserNewPullParser.getName();
                if ("Grant".equals(name)) {
                    getBucketACLResult.setBucketACL(xmlPullParserNewPullParser.nextText());
                } else if ("ID".equals(name)) {
                    getBucketACLResult.setBucketOwnerID(xmlPullParserNewPullParser.nextText());
                } else if ("DisplayName".equals(name)) {
                    getBucketACLResult.setBucketOwner(xmlPullParserNewPullParser.nextText());
                }
            }
            eventType = xmlPullParserNewPullParser.next();
            if (eventType == 4) {
                eventType = xmlPullParserNewPullParser.next();
            }
        }
        return getBucketACLResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GetBucketInfoResult parseGetBucketInfoResponse(InputStream inputStream, GetBucketInfoResult getBucketInfoResult) throws Exception {
        String name;
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
        int eventType = xmlPullParserNewPullParser.getEventType();
        OSSBucketSummary oSSBucketSummary = null;
        Owner owner = null;
        while (eventType != 1) {
            if (eventType == 2) {
                String name2 = xmlPullParserNewPullParser.getName();
                if (name2 != null) {
                    if ("Owner".equals(name2)) {
                        owner = new Owner();
                    } else if ("ID".equals(name2)) {
                        if (owner != null) {
                            owner.setId(xmlPullParserNewPullParser.nextText());
                        }
                    } else if ("DisplayName".equals(name2)) {
                        if (owner != null) {
                            owner.setDisplayName(xmlPullParserNewPullParser.nextText());
                        }
                    } else if ("Bucket".equals(name2)) {
                        oSSBucketSummary = new OSSBucketSummary();
                    } else if ("CreationDate".equals(name2)) {
                        if (oSSBucketSummary != null) {
                            oSSBucketSummary.createDate = DateUtil.parseIso8601Date(xmlPullParserNewPullParser.nextText());
                        }
                    } else if ("ExtranetEndpoint".equals(name2)) {
                        if (oSSBucketSummary != null) {
                            oSSBucketSummary.extranetEndpoint = xmlPullParserNewPullParser.nextText();
                        }
                    } else if ("IntranetEndpoint".equals(name2)) {
                        if (oSSBucketSummary != null) {
                            oSSBucketSummary.intranetEndpoint = xmlPullParserNewPullParser.nextText();
                        }
                    } else if ("Location".equals(name2)) {
                        if (oSSBucketSummary != null) {
                            oSSBucketSummary.location = xmlPullParserNewPullParser.nextText();
                        }
                    } else if (Constants.KEY_ENCRYPTION_NAME.equals(name2)) {
                        if (oSSBucketSummary != null) {
                            oSSBucketSummary.name = xmlPullParserNewPullParser.nextText();
                        }
                    } else if (CreateBucketRequest.TAB_STORAGECLASS.equals(name2)) {
                        if (oSSBucketSummary != null) {
                            oSSBucketSummary.storageClass = xmlPullParserNewPullParser.nextText();
                        }
                    } else if ("Grant".equals(name2) && oSSBucketSummary != null) {
                        oSSBucketSummary.setAcl(xmlPullParserNewPullParser.nextText());
                    }
                }
            } else if (eventType == 3 && (name = xmlPullParserNewPullParser.getName()) != null) {
                if ("Bucket".equals(name)) {
                    if (oSSBucketSummary != null) {
                        getBucketInfoResult.setBucket(oSSBucketSummary);
                    }
                } else if ("Owner".equals(name) && oSSBucketSummary != null) {
                    oSSBucketSummary.owner = owner;
                }
            }
            eventType = xmlPullParserNewPullParser.next();
            if (eventType == 4) {
                eventType = xmlPullParserNewPullParser.next();
            }
        }
        return getBucketInfoResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GetBucketLifecycleResult parseGetBucketLifecycleResponse(InputStream inputStream, GetBucketLifecycleResult getBucketLifecycleResult) throws Exception {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
        int eventType = xmlPullParserNewPullParser.getEventType();
        BucketLifecycleRule bucketLifecycleRule = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String strNextText = null;
        String strNextText2 = null;
        String strNextText3 = null;
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlPullParserNewPullParser.getName();
                if ("Rule".equals(name)) {
                    bucketLifecycleRule = new BucketLifecycleRule();
                } else if ("ID".equals(name)) {
                    bucketLifecycleRule.setIdentifier(xmlPullParserNewPullParser.nextText());
                } else if ("Prefix".equals(name)) {
                    bucketLifecycleRule.setPrefix(xmlPullParserNewPullParser.nextText());
                } else if ("Status".equals(name)) {
                    if (PeerConnectionFactory.TRIAL_ENABLED.equals(xmlPullParserNewPullParser.nextText())) {
                        bucketLifecycleRule.setStatus(true);
                    } else {
                        bucketLifecycleRule.setStatus(false);
                    }
                } else if ("Expiration".equals(name)) {
                    z = true;
                } else if ("AbortMultipartUpload".equals(name)) {
                    z2 = true;
                } else if ("Transition".equals(name)) {
                    z3 = true;
                } else if ("Days".equals(name)) {
                    strNextText = xmlPullParserNewPullParser.nextText();
                    if (bucketLifecycleRule != null) {
                        if (z) {
                            bucketLifecycleRule.setDays(strNextText);
                        } else if (z2) {
                            bucketLifecycleRule.setMultipartDays(strNextText);
                        } else if (z3 && strNextText3 != null) {
                            if ("IA".equals(strNextText3)) {
                                bucketLifecycleRule.setIADays(strNextText);
                            } else if ("Archive".equals(strNextText3)) {
                                bucketLifecycleRule.setArchiveDays(strNextText);
                            }
                        }
                    }
                } else if ("Date".equals(name)) {
                    strNextText2 = xmlPullParserNewPullParser.nextText();
                    if (bucketLifecycleRule != null) {
                        if (z) {
                            bucketLifecycleRule.setExpireDate(strNextText2);
                        } else if (z2) {
                            bucketLifecycleRule.setMultipartExpireDate(strNextText2);
                        } else if (z3 && strNextText3 != null) {
                            if ("IA".equals(strNextText3)) {
                                bucketLifecycleRule.setIAExpireDate(strNextText2);
                            } else if ("Archive".equals(strNextText3)) {
                                bucketLifecycleRule.setArchiveExpireDate(strNextText2);
                            }
                        }
                    }
                } else if (CreateBucketRequest.TAB_STORAGECLASS.equals(name)) {
                    strNextText3 = xmlPullParserNewPullParser.nextText();
                    if (bucketLifecycleRule != null) {
                        if ("IA".equals(strNextText3)) {
                            bucketLifecycleRule.setIADays(strNextText);
                            bucketLifecycleRule.setIAExpireDate(strNextText2);
                        } else if ("Archive".equals(strNextText3)) {
                            bucketLifecycleRule.setArchiveDays(strNextText2);
                            bucketLifecycleRule.setArchiveExpireDate(strNextText2);
                        }
                    }
                }
            } else if (eventType == 3) {
                String name2 = xmlPullParserNewPullParser.getName();
                if ("Rule".equals(name2)) {
                    getBucketLifecycleResult.addLifecycleRule(bucketLifecycleRule);
                } else if ("Expiration".equals(name2)) {
                    z = false;
                } else if ("AbortMultipartUpload".equals(name2)) {
                    z2 = false;
                } else if ("Transition".equals(name2)) {
                    z3 = false;
                    strNextText = null;
                    strNextText2 = null;
                    strNextText3 = null;
                }
            }
            eventType = xmlPullParserNewPullParser.next();
            if (eventType == 4) {
                eventType = xmlPullParserNewPullParser.next();
            }
        }
        return getBucketLifecycleResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GetBucketLoggingResult parseGetBucketLoggingResponse(InputStream inputStream, GetBucketLoggingResult getBucketLoggingResult) throws Exception {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
        int eventType = xmlPullParserNewPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlPullParserNewPullParser.getName();
                if ("LoggingEnabled".equals(name)) {
                    getBucketLoggingResult.setLoggingEnabled(true);
                } else if ("TargetBucket".equals(name)) {
                    getBucketLoggingResult.setTargetBucketName(xmlPullParserNewPullParser.nextText());
                } else if ("TargetPrefix".equals(name)) {
                    getBucketLoggingResult.setTargetPrefix(xmlPullParserNewPullParser.nextText());
                }
            }
            eventType = xmlPullParserNewPullParser.next();
            if (eventType == 4) {
                eventType = xmlPullParserNewPullParser.next();
            }
        }
        return getBucketLoggingResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GetBucketRefererResult parseGetBucketRefererResponse(InputStream inputStream, GetBucketRefererResult getBucketRefererResult) throws Exception {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
        int eventType = xmlPullParserNewPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2 && HttpHeaders.REFERER.equals(xmlPullParserNewPullParser.getName())) {
                getBucketRefererResult.addReferer(xmlPullParserNewPullParser.nextText());
            }
            eventType = xmlPullParserNewPullParser.next();
            if (eventType == 4) {
                eventType = xmlPullParserNewPullParser.next();
            }
        }
        return getBucketRefererResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GetObjectACLResult parseGetObjectACLResponse(InputStream inputStream, GetObjectACLResult getObjectACLResult) throws Exception {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
        int eventType = xmlPullParserNewPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlPullParserNewPullParser.getName();
                if ("Grant".equals(name)) {
                    getObjectACLResult.setObjectACL(xmlPullParserNewPullParser.nextText());
                } else if ("ID".equals(name)) {
                    getObjectACLResult.setObjectOwnerID(xmlPullParserNewPullParser.nextText());
                } else if ("DisplayName".equals(name)) {
                    getObjectACLResult.setObjectOwner(xmlPullParserNewPullParser.nextText());
                }
            }
            eventType = xmlPullParserNewPullParser.next();
            if (eventType == 4) {
                eventType = xmlPullParserNewPullParser.next();
            }
        }
        return getObjectACLResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GetObjectTaggingResult parseGetObjectTaggingResponse(InputStream inputStream, GetObjectTaggingResult getObjectTaggingResult) throws Exception {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
        int eventType = xmlPullParserNewPullParser.getEventType();
        HashMap map = new HashMap();
        String strNextText = null;
        String strNextText2 = null;
        while (eventType != 1) {
            String name = xmlPullParserNewPullParser.getName();
            if (eventType != 2) {
                if (eventType == 3 && "Tag".equals(name)) {
                    if (strNextText != null && strNextText2 != null) {
                        map.put(strNextText, strNextText2);
                    }
                    strNextText = null;
                    strNextText2 = null;
                }
            } else if ("Key".equals(name)) {
                strNextText = xmlPullParserNewPullParser.nextText();
            } else if ("Value".equals(name)) {
                strNextText2 = xmlPullParserNewPullParser.nextText();
            }
            eventType = xmlPullParserNewPullParser.next();
            if (eventType == 4) {
                eventType = xmlPullParserNewPullParser.next();
            }
        }
        getObjectTaggingResult.setTags(map);
        return getObjectTaggingResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitiateMultipartUploadResult parseInitMultipartResponseXML(InputStream inputStream, InitiateMultipartUploadResult initiateMultipartUploadResult) throws Exception {
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
        int eventType = xmlPullParserNewPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlPullParserNewPullParser.getName();
                if ("Bucket".equals(name)) {
                    initiateMultipartUploadResult.setBucketName(xmlPullParserNewPullParser.nextText());
                } else if ("Key".equals(name)) {
                    initiateMultipartUploadResult.setObjectKey(xmlPullParserNewPullParser.nextText());
                } else if ("UploadId".equals(name)) {
                    initiateMultipartUploadResult.setUploadId(xmlPullParserNewPullParser.nextText());
                }
            }
            eventType = xmlPullParserNewPullParser.next();
            if (eventType == 4) {
                eventType = xmlPullParserNewPullParser.next();
            }
        }
        return initiateMultipartUploadResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ListPartsResult parseListPartsResponseXML(InputStream inputStream, ListPartsResult listPartsResult) throws Exception {
        ArrayList arrayList = new ArrayList();
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
        int eventType = xmlPullParserNewPullParser.getEventType();
        PartSummary partSummary = null;
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlPullParserNewPullParser.getName();
                if ("Bucket".equals(name)) {
                    listPartsResult.setBucketName(xmlPullParserNewPullParser.nextText());
                } else if ("Key".equals(name)) {
                    listPartsResult.setKey(xmlPullParserNewPullParser.nextText());
                } else if ("UploadId".equals(name)) {
                    listPartsResult.setUploadId(xmlPullParserNewPullParser.nextText());
                } else if ("PartNumberMarker".equals(name)) {
                    String strNextText = xmlPullParserNewPullParser.nextText();
                    if (!OSSUtils.isEmptyString(strNextText)) {
                        listPartsResult.setPartNumberMarker(Integer.parseInt(strNextText));
                    }
                } else if ("NextPartNumberMarker".equals(name)) {
                    String strNextText2 = xmlPullParserNewPullParser.nextText();
                    if (!OSSUtils.isEmptyString(strNextText2)) {
                        listPartsResult.setNextPartNumberMarker(Integer.parseInt(strNextText2));
                    }
                } else if ("MaxParts".equals(name)) {
                    String strNextText3 = xmlPullParserNewPullParser.nextText();
                    if (!OSSUtils.isEmptyString(strNextText3)) {
                        listPartsResult.setMaxParts(Integer.parseInt(strNextText3));
                    }
                } else if ("IsTruncated".equals(name)) {
                    String strNextText4 = xmlPullParserNewPullParser.nextText();
                    if (!OSSUtils.isEmptyString(strNextText4)) {
                        listPartsResult.setTruncated(Boolean.valueOf(strNextText4).booleanValue());
                    }
                } else if (CreateBucketRequest.TAB_STORAGECLASS.equals(name)) {
                    listPartsResult.setStorageClass(xmlPullParserNewPullParser.nextText());
                } else if ("Part".equals(name)) {
                    partSummary = new PartSummary();
                } else if ("PartNumber".equals(name)) {
                    String strNextText5 = xmlPullParserNewPullParser.nextText();
                    if (!OSSUtils.isEmptyString(strNextText5)) {
                        partSummary.setPartNumber(Integer.valueOf(strNextText5).intValue());
                    }
                } else if ("LastModified".equals(name)) {
                    partSummary.setLastModified(DateUtil.parseIso8601Date(xmlPullParserNewPullParser.nextText()));
                } else if ("ETag".equals(name)) {
                    partSummary.setETag(xmlPullParserNewPullParser.nextText());
                } else if ("Size".equals(name)) {
                    String strNextText6 = xmlPullParserNewPullParser.nextText();
                    if (!OSSUtils.isEmptyString(strNextText6)) {
                        partSummary.setSize(Long.valueOf(strNextText6).longValue());
                    }
                }
            } else if (eventType == 3 && "Part".equals(xmlPullParserNewPullParser.getName())) {
                arrayList.add(partSummary);
            }
            eventType = xmlPullParserNewPullParser.next();
            if (eventType == 4) {
                eventType = xmlPullParserNewPullParser.next();
            }
        }
        if (arrayList.size() > 0) {
            listPartsResult.setParts(arrayList);
        }
        return listPartsResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ListObjectsResult parseObjectListResponse(InputStream inputStream, ListObjectsResult listObjectsResult) throws Exception {
        listObjectsResult.clearCommonPrefixes();
        listObjectsResult.clearObjectSummaries();
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
        int eventType = xmlPullParserNewPullParser.getEventType();
        Owner owner = null;
        OSSObjectSummary oSSObjectSummary = null;
        boolean z = false;
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlPullParserNewPullParser.getName();
                if (Constants.KEY_ENCRYPTION_NAME.equals(name)) {
                    listObjectsResult.setBucketName(xmlPullParserNewPullParser.nextText());
                } else if ("Prefix".equals(name)) {
                    if (z) {
                        String strNextText = xmlPullParserNewPullParser.nextText();
                        if (!OSSUtils.isEmptyString(strNextText)) {
                            listObjectsResult.addCommonPrefix(strNextText);
                        }
                    } else {
                        listObjectsResult.setPrefix(xmlPullParserNewPullParser.nextText());
                    }
                } else if ("Marker".equals(name)) {
                    listObjectsResult.setMarker(xmlPullParserNewPullParser.nextText());
                } else if ("Delimiter".equals(name)) {
                    listObjectsResult.setDelimiter(xmlPullParserNewPullParser.nextText());
                } else if ("EncodingType".equals(name)) {
                    listObjectsResult.setEncodingType(xmlPullParserNewPullParser.nextText());
                } else if ("MaxKeys".equals(name)) {
                    String strNextText2 = xmlPullParserNewPullParser.nextText();
                    if (!OSSUtils.isEmptyString(strNextText2)) {
                        listObjectsResult.setMaxKeys(Integer.valueOf(strNextText2).intValue());
                    }
                } else if ("NextMarker".equals(name)) {
                    listObjectsResult.setNextMarker(xmlPullParserNewPullParser.nextText());
                } else if ("IsTruncated".equals(name)) {
                    String strNextText3 = xmlPullParserNewPullParser.nextText();
                    if (!OSSUtils.isEmptyString(strNextText3)) {
                        listObjectsResult.setTruncated(Boolean.valueOf(strNextText3).booleanValue());
                    }
                } else if ("Contents".equals(name)) {
                    oSSObjectSummary = new OSSObjectSummary();
                } else if ("Key".equals(name)) {
                    oSSObjectSummary.setKey(xmlPullParserNewPullParser.nextText());
                } else if ("LastModified".equals(name)) {
                    oSSObjectSummary.setLastModified(DateUtil.parseIso8601Date(xmlPullParserNewPullParser.nextText()));
                } else if ("Size".equals(name)) {
                    String strNextText4 = xmlPullParserNewPullParser.nextText();
                    if (!OSSUtils.isEmptyString(strNextText4)) {
                        oSSObjectSummary.setSize(Long.valueOf(strNextText4).longValue());
                    }
                } else if ("ETag".equals(name)) {
                    oSSObjectSummary.setETag(xmlPullParserNewPullParser.nextText());
                } else if ("Type".equals(name)) {
                    oSSObjectSummary.setType(xmlPullParserNewPullParser.nextText());
                } else if (CreateBucketRequest.TAB_STORAGECLASS.equals(name)) {
                    oSSObjectSummary.setStorageClass(xmlPullParserNewPullParser.nextText());
                } else if ("Owner".equals(name)) {
                    owner = new Owner();
                } else if ("ID".equals(name)) {
                    owner.setId(xmlPullParserNewPullParser.nextText());
                } else if ("DisplayName".equals(name)) {
                    owner.setDisplayName(xmlPullParserNewPullParser.nextText());
                } else if ("CommonPrefixes".equals(name)) {
                    z = true;
                }
            } else if (eventType == 3) {
                String name2 = xmlPullParserNewPullParser.getName();
                if ("Owner".equals(xmlPullParserNewPullParser.getName())) {
                    if (owner != null) {
                        oSSObjectSummary.setOwner(owner);
                    }
                } else if ("Contents".equals(name2)) {
                    if (oSSObjectSummary != null) {
                        oSSObjectSummary.setBucketName(listObjectsResult.getBucketName());
                        listObjectsResult.addObjectSummary(oSSObjectSummary);
                    }
                } else if ("CommonPrefixes".equals(name2)) {
                    z = false;
                }
            }
            eventType = xmlPullParserNewPullParser.next();
            if (eventType == 4) {
                eventType = xmlPullParserNewPullParser.next();
            }
        }
        return listObjectsResult;
    }

    public static ObjectMetadata parseObjectMetadata(Map<String, String> map) throws Exception {
        try {
            ObjectMetadata objectMetadata = new ObjectMetadata();
            for (String str : map.keySet()) {
                if (str.indexOf(OSSHeaders.OSS_USER_METADATA_PREFIX) >= 0) {
                    objectMetadata.addUserMetadata(str, map.get(str));
                } else if (str.equalsIgnoreCase("Last-Modified") || str.equalsIgnoreCase("Date")) {
                    try {
                        objectMetadata.setHeader(str, DateUtil.parseRfc822Date(map.get(str)));
                    } catch (ParseException e) {
                        throw new IOException(e.getMessage(), e);
                    }
                } else if (str.equalsIgnoreCase("Content-Length")) {
                    objectMetadata.setHeader(str, Long.valueOf(map.get(str)));
                } else if (str.equalsIgnoreCase("ETag")) {
                    objectMetadata.setHeader(str, trimQuotes(map.get(str)));
                } else {
                    objectMetadata.setHeader(str, map.get(str));
                }
            }
            return objectMetadata;
        } catch (Exception e2) {
            throw new IOException(e2.getMessage(), e2);
        }
    }

    public static Exception parseResponseErrorXML(ResponseMessage responseMessage, boolean z) {
        String strNextText;
        String strNextText2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int statusCode = responseMessage.getStatusCode();
        String strM138675u = responseMessage.getResponse().m138675u(OSSHeaders.OSS_HEADER_REQUEST_ID);
        String strM138675u2 = responseMessage.getResponse().m138675u(OSSHeaders.OSS_HEADER_EC);
        String strM138675u3 = responseMessage.getResponse().m138675u("Date");
        String strNextText3 = null;
        if (z) {
            str4 = strM138675u2;
            str3 = null;
            str = null;
            str5 = null;
            strNextText = null;
            str2 = null;
            strNextText2 = null;
        } else {
            try {
                String strString = responseMessage.getResponse().m138670k().string();
                OSSLog.logDebug("errorMessage  ：  \n " + strString);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(strString.getBytes());
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                xmlPullParserNewPullParser.setInput(byteArrayInputStream, "utf-8");
                int eventType = xmlPullParserNewPullParser.getEventType();
                String strNextText4 = null;
                strNextText = null;
                String strNextText5 = null;
                String strNextText6 = null;
                strNextText2 = null;
                while (eventType != 1) {
                    if (eventType == 2) {
                        if ("Code".equals(xmlPullParserNewPullParser.getName())) {
                            strNextText3 = xmlPullParserNewPullParser.nextText();
                        } else if ("Message".equals(xmlPullParserNewPullParser.getName())) {
                            strNextText4 = xmlPullParserNewPullParser.nextText();
                        } else if ("RequestId".equals(xmlPullParserNewPullParser.getName())) {
                            strM138675u = xmlPullParserNewPullParser.nextText();
                        } else if ("HostId".equals(xmlPullParserNewPullParser.getName())) {
                            strNextText = xmlPullParserNewPullParser.nextText();
                        } else if ("PartNumber".equals(xmlPullParserNewPullParser.getName())) {
                            strNextText5 = xmlPullParserNewPullParser.nextText();
                        } else if ("PartEtag".equals(xmlPullParserNewPullParser.getName())) {
                            strNextText6 = xmlPullParserNewPullParser.nextText();
                        } else if ("EC".equals(xmlPullParserNewPullParser.getName())) {
                            strM138675u2 = xmlPullParserNewPullParser.nextText();
                        } else if ("RecommendDoc".equals(xmlPullParserNewPullParser.getName())) {
                            strNextText2 = xmlPullParserNewPullParser.nextText();
                        }
                    }
                    eventType = xmlPullParserNewPullParser.next();
                    if (eventType == 4) {
                        eventType = xmlPullParserNewPullParser.next();
                    }
                }
                str = strNextText5;
                str2 = strString;
                str3 = strNextText6;
                str4 = strM138675u2;
                str5 = strNextText4;
            } catch (IOException e) {
                return new ClientException(e.getMessage(), e);
            } catch (XmlPullParserException e2) {
                return new ClientException(e2.getMessage(), e2);
            }
        }
        ServiceException serviceException = new ServiceException(statusCode, str5, strNextText3, strM138675u, strNextText, str2, str4);
        if (!TextUtils.isEmpty(str3)) {
            serviceException.setPartEtag(str3);
        }
        if (!TextUtils.isEmpty(str)) {
            serviceException.setPartNumber(str);
        }
        if (!TextUtils.isEmpty(strNextText2)) {
            serviceException.setRecommendDoc(strNextText2);
        }
        if (!TextUtils.isEmpty(strM138675u3)) {
            serviceException.setDate(strM138675u3);
        }
        return serviceException;
    }

    public static String trimQuotes(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("\"")) {
            strTrim = strTrim.substring(1);
        }
        return strTrim.endsWith("\"") ? strTrim.substring(0, strTrim.length() - 1) : strTrim;
    }

    public static final class AbortMultipartUploadResponseParser extends AbstractResponseParser<AbortMultipartUploadResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public AbortMultipartUploadResult parseData(ResponseMessage responseMessage, AbortMultipartUploadResult abortMultipartUploadResult) throws Exception {
            return abortMultipartUploadResult;
        }
    }

    public static final class DeleteBucketLifecycleResponseParser extends AbstractResponseParser<DeleteBucketLifecycleResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public DeleteBucketLifecycleResult parseData(ResponseMessage responseMessage, DeleteBucketLifecycleResult deleteBucketLifecycleResult) throws Exception {
            return deleteBucketLifecycleResult;
        }
    }

    public static final class DeleteBucketLoggingResponseParser extends AbstractResponseParser<DeleteBucketLoggingResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public DeleteBucketLoggingResult parseData(ResponseMessage responseMessage, DeleteBucketLoggingResult deleteBucketLoggingResult) throws Exception {
            return deleteBucketLoggingResult;
        }
    }

    public static final class DeleteBucketResponseParser extends AbstractResponseParser<DeleteBucketResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public DeleteBucketResult parseData(ResponseMessage responseMessage, DeleteBucketResult deleteBucketResult) throws Exception {
            return deleteBucketResult;
        }
    }

    public static final class DeleteObjectResponseParser extends AbstractResponseParser<DeleteObjectResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public DeleteObjectResult parseData(ResponseMessage responseMessage, DeleteObjectResult deleteObjectResult) throws Exception {
            return deleteObjectResult;
        }
    }

    public static final class DeleteObjectTaggingResponseParser extends AbstractResponseParser<DeleteObjectTaggingResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public DeleteObjectTaggingResult parseData(ResponseMessage responseMessage, DeleteObjectTaggingResult deleteObjectTaggingResult) throws Exception {
            return deleteObjectTaggingResult;
        }
    }

    public static final class ImagePersistResponseParser extends AbstractResponseParser<ImagePersistResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public ImagePersistResult parseData(ResponseMessage responseMessage, ImagePersistResult imagePersistResult) throws Exception {
            return imagePersistResult;
        }
    }

    public static final class ListMultipartUploadsResponseParser extends AbstractResponseParser<ListMultipartUploadsResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public ListMultipartUploadsResult parseData(ResponseMessage responseMessage, ListMultipartUploadsResult listMultipartUploadsResult) throws Exception {
            return listMultipartUploadsResult.parseData(responseMessage);
        }
    }

    public static final class PutBucketLifecycleResponseParser extends AbstractResponseParser<PutBucketLifecycleResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public PutBucketLifecycleResult parseData(ResponseMessage responseMessage, PutBucketLifecycleResult putBucketLifecycleResult) throws Exception {
            return putBucketLifecycleResult;
        }
    }

    public static final class PutBucketLoggingResponseParser extends AbstractResponseParser<PutBucketLoggingResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public PutBucketLoggingResult parseData(ResponseMessage responseMessage, PutBucketLoggingResult putBucketLoggingResult) throws Exception {
            return putBucketLoggingResult;
        }
    }

    public static final class PutBucketRefererResponseParser extends AbstractResponseParser<PutBucketRefererResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public PutBucketRefererResult parseData(ResponseMessage responseMessage, PutBucketRefererResult putBucketRefererResult) throws Exception {
            return putBucketRefererResult;
        }
    }

    public static final class PutObjectTaggingResponseParser extends AbstractResponseParser<PutObjectTaggingResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public PutObjectTaggingResult parseData(ResponseMessage responseMessage, PutObjectTaggingResult putObjectTaggingResult) throws Exception {
            return putObjectTaggingResult;
        }
    }

    public static final class PutSymlinkResponseParser extends AbstractResponseParser<PutSymlinkResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public PutSymlinkResult parseData(ResponseMessage responseMessage, PutSymlinkResult putSymlinkResult) throws Exception {
            return putSymlinkResult;
        }
    }

    public static final class RestoreObjectResponseParser extends AbstractResponseParser<RestoreObjectResult> {
        @Override // com.alibaba.sdk.android.oss.internal.AbstractResponseParser
        public RestoreObjectResult parseData(ResponseMessage responseMessage, RestoreObjectResult restoreObjectResult) throws Exception {
            return restoreObjectResult;
        }
    }
}
