package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ADInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "adinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public OMSADLink link;

    @NonNull
    @ProtobufIndex(index = 1)
    public OMSADTrackingInfo trackingURLs;
    public static ProtobufAdapter<ADInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ADInfo>() { // from class: com.p1.mobile.putong.data.ADInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ADInfo aDInfo) {
            OMSADTrackingInfo oMSADTrackingInfo = aDInfo.trackingURLs;
            int iL = oMSADTrackingInfo != null ? CodedOutputByteBufferNano.l(1, oMSADTrackingInfo, OMSADTrackingInfo.PROTOBUF_ADAPTER) : 0;
            OMSADLink oMSADLink = aDInfo.link;
            if (oMSADLink != null) {
                iL += CodedOutputByteBufferNano.l(2, oMSADLink, OMSADLink.PROTOBUF_ADAPTER);
            }
            ((MessageNano) aDInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ADInfo m17608parse(nb5 nb5Var) throws IOException {
            ADInfo aDInfo = new ADInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (aDInfo.trackingURLs == null) {
                        aDInfo.trackingURLs = OMSADTrackingInfo.new_();
                    }
                    if (aDInfo.link != null) {
                        break;
                    }
                    aDInfo.link = OMSADLink.new_();
                    break;
                }
                if (iU == 10) {
                    aDInfo.trackingURLs = (OMSADTrackingInfo) nb5Var.l(OMSADTrackingInfo.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (aDInfo.trackingURLs == null) {
                            aDInfo.trackingURLs = OMSADTrackingInfo.new_();
                        }
                        if (aDInfo.link != null) {
                            break;
                        }
                        aDInfo.link = OMSADLink.new_();
                        return aDInfo;
                    }
                    aDInfo.link = (OMSADLink) nb5Var.l(OMSADLink.PROTOBUF_ADAPTER);
                }
            }
            return aDInfo;
        }

        public void serialize(ADInfo aDInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            OMSADTrackingInfo oMSADTrackingInfo = aDInfo.trackingURLs;
            if (oMSADTrackingInfo != null) {
                codedOutputByteBufferNano.K(1, oMSADTrackingInfo, OMSADTrackingInfo.PROTOBUF_ADAPTER);
            }
            OMSADLink oMSADLink = aDInfo.link;
            if (oMSADLink != null) {
                codedOutputByteBufferNano.K(2, oMSADLink, OMSADLink.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ADInfo> JSON_ADAPTER = new ObjectJsonAdapter<ADInfo>() { // from class: com.p1.mobile.putong.data.ADInfo.2
        public Class getDataClass() {
            return ADInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ADInfo mo17830newInstance() {
            return new ADInfo();
        }

        public boolean parseField(ADInfo aDInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("trackingURLs")) {
                aDInfo.trackingURLs = (OMSADTrackingInfo) OMSADTrackingInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Link.TYPE)) {
                return false;
            }
            aDInfo.link = (OMSADLink) OMSADLink.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ADInfo aDInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("trackingURLs") || str.equals(Link.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(aDInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ADInfo aDInfo, JsonGenerator jsonGenerator) throws IOException {
            if (aDInfo.trackingURLs != null) {
                jsonGenerator.writeFieldName("trackingURLs");
                OMSADTrackingInfo.JSON_ADAPTER.serialize(aDInfo.trackingURLs, jsonGenerator, true);
            }
            if (aDInfo.link != null) {
                jsonGenerator.writeFieldName(Link.TYPE);
                OMSADLink.JSON_ADAPTER.serialize(aDInfo.link, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ADInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ADInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ADInfo new_() {
        ADInfo aDInfo = new ADInfo();
        aDInfo.nullCheck();
        return aDInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ADInfo m17607clone() {
        ADInfo aDInfo = new ADInfo();
        OMSADTrackingInfo oMSADTrackingInfo = this.trackingURLs;
        if (oMSADTrackingInfo != null) {
            aDInfo.trackingURLs = oMSADTrackingInfo.m18563clone();
        }
        OMSADLink oMSADLink = this.link;
        if (oMSADLink != null) {
            aDInfo.link = oMSADLink.m18560clone();
        }
        return aDInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ADInfo)) {
            return false;
        }
        ADInfo aDInfo = (ADInfo) obj;
        return ValueObject.util_equals(this.trackingURLs, aDInfo.trackingURLs) && ValueObject.util_equals(this.link, aDInfo.link);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        OMSADTrackingInfo oMSADTrackingInfo = this.trackingURLs;
        int iHashCode = (i2 + (oMSADTrackingInfo != null ? oMSADTrackingInfo.hashCode() : 0)) * 41;
        OMSADLink oMSADLink = this.link;
        int iHashCode2 = iHashCode + (oMSADLink != null ? oMSADLink.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.trackingURLs == null) {
            this.trackingURLs = OMSADTrackingInfo.new_();
        }
        if (this.link == null) {
            this.link = OMSADLink.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
