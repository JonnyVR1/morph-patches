package com.appsflyer.internal;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import kotlin.Metadata;
import org.eclipse.jetty.http.MimeTypes;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, m88121d2 = {"Lcom/appsflyer/internal/AFe1uSDK;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMediationNetwork", "Ljava/lang/String;", "getMonetizationNetwork", "AFAdRevenueData", "getRevenue", "getCurrencyIso4217Code", "areAllFieldsValid", "component4", "component1", "component3"}, m88122k = 1, m88123mv = {1, 6, 0}, m88125xi = 48)
public enum AFe1uSDK {
    TEXT(MimeTypes.TEXT_PLAIN),
    JSON("application/json"),
    OCTET_STREAM(OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE),
    XML("application/xml"),
    HTML(MimeTypes.TEXT_HTML),
    FORM(MimeTypes.FORM_ENCODED),
    IMAGE_JPEG(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG),
    IMAGE_PNG(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG);


    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    public final String getMonetizationNetwork;

    AFe1uSDK(String str) {
        this.getMonetizationNetwork = str;
    }
}
