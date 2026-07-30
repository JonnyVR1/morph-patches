package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class OMSADLink extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsadlink";

    @NonNull
    @ProtobufIndex(index = 1)
    public LinkAction action;

    @NonNull
    @ProtobufIndex(index = 8)
    public String appID;

    @NonNull
    @ProtobufIndex(index = 4)
    public DeeplinkReport deeplinkReport;

    @Nullable
    @ProtobufIndex(index = 3)
    public OMSFallbackLink fallbackLink;

    @NonNull
    @ProtobufIndex(index = 7)
    public String originalId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String path;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;
    public static ProtobufAdapter<OMSADLink> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSADLink>() { // from class: com.p1.mobile.putong.data.OMSADLink.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSADLink oMSADLink) {
            LinkAction linkAction = oMSADLink.action;
            int iH = linkAction != null ? CodedOutputByteBufferNano.h(1, linkAction.ordinal()) : 0;
            String str = oMSADLink.url;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            OMSFallbackLink oMSFallbackLink = oMSADLink.fallbackLink;
            if (oMSFallbackLink != null) {
                iH += CodedOutputByteBufferNano.l(3, oMSFallbackLink, OMSFallbackLink.PROTOBUF_ADAPTER);
            }
            DeeplinkReport deeplinkReport = oMSADLink.deeplinkReport;
            if (deeplinkReport != null) {
                iH += CodedOutputByteBufferNano.l(4, deeplinkReport, DeeplinkReport.PROTOBUF_ADAPTER);
            }
            LinkAction linkAction2 = oMSADLink.action;
            if (linkAction2 != null) {
                iH += CodedOutputByteBufferNano.l(5, linkAction2, LinkAction.PROTOBUF_ADAPTER);
            }
            String str2 = oMSADLink.path;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(6, str2);
            }
            String str3 = oMSADLink.originalId;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(7, str3);
            }
            String str4 = oMSADLink.appID;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(8, str4);
            }
            ((MessageNano) oMSADLink).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSADLink m18561parse(nb5 nb5Var) throws IOException {
            OMSADLink oMSADLink = new OMSADLink();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSADLink.action == null && numValueOf != null) {
                        oMSADLink.action = (LinkAction) LinkAction.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (oMSADLink.action == null) {
                        oMSADLink.action = (LinkAction) LinkAction.JSON_ADAPTER.defaultEnum();
                    }
                    if (oMSADLink.url == null) {
                        oMSADLink.url = "";
                    }
                    if (oMSADLink.deeplinkReport == null) {
                        oMSADLink.deeplinkReport = DeeplinkReport.new_();
                    }
                    if (oMSADLink.path == null) {
                        oMSADLink.path = "";
                    }
                    if (oMSADLink.originalId == null) {
                        oMSADLink.originalId = "";
                    }
                    if (oMSADLink.appID != null) {
                        break;
                    }
                    oMSADLink.appID = "";
                    break;
                }
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 18) {
                    oMSADLink.url = nb5Var.s();
                } else if (iU == 26) {
                    oMSADLink.fallbackLink = (OMSFallbackLink) nb5Var.l(OMSFallbackLink.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    oMSADLink.deeplinkReport = (DeeplinkReport) nb5Var.l(DeeplinkReport.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    oMSADLink.action = (LinkAction) nb5Var.l(LinkAction.PROTOBUF_ADAPTER);
                } else if (iU == 50) {
                    oMSADLink.path = nb5Var.s();
                } else if (iU == 58) {
                    oMSADLink.originalId = nb5Var.s();
                } else {
                    if (iU != 66) {
                        if (oMSADLink.action == null && numValueOf != null) {
                            oMSADLink.action = (LinkAction) LinkAction.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSADLink.action == null) {
                            oMSADLink.action = (LinkAction) LinkAction.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSADLink.url == null) {
                            oMSADLink.url = "";
                        }
                        if (oMSADLink.deeplinkReport == null) {
                            oMSADLink.deeplinkReport = DeeplinkReport.new_();
                        }
                        if (oMSADLink.path == null) {
                            oMSADLink.path = "";
                        }
                        if (oMSADLink.originalId == null) {
                            oMSADLink.originalId = "";
                        }
                        if (oMSADLink.appID != null) {
                            break;
                        }
                        oMSADLink.appID = "";
                        return oMSADLink;
                    }
                    oMSADLink.appID = nb5Var.s();
                }
            }
            return oMSADLink;
        }

        public void serialize(OMSADLink oMSADLink, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LinkAction linkAction = oMSADLink.action;
            if (linkAction != null) {
                codedOutputByteBufferNano.G(1, linkAction.ordinal());
            }
            String str = oMSADLink.url;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            OMSFallbackLink oMSFallbackLink = oMSADLink.fallbackLink;
            if (oMSFallbackLink != null) {
                codedOutputByteBufferNano.K(3, oMSFallbackLink, OMSFallbackLink.PROTOBUF_ADAPTER);
            }
            DeeplinkReport deeplinkReport = oMSADLink.deeplinkReport;
            if (deeplinkReport != null) {
                codedOutputByteBufferNano.K(4, deeplinkReport, DeeplinkReport.PROTOBUF_ADAPTER);
            }
            LinkAction linkAction2 = oMSADLink.action;
            if (linkAction2 != null) {
                codedOutputByteBufferNano.K(5, linkAction2, LinkAction.PROTOBUF_ADAPTER);
            }
            String str2 = oMSADLink.path;
            if (str2 != null) {
                codedOutputByteBufferNano.R(6, str2);
            }
            String str3 = oMSADLink.originalId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(7, str3);
            }
            String str4 = oMSADLink.appID;
            if (str4 != null) {
                codedOutputByteBufferNano.R(8, str4);
            }
        }
    };
    public static JsonAdapter<OMSADLink> JSON_ADAPTER = new ObjectJsonAdapter<OMSADLink>() { // from class: com.p1.mobile.putong.data.OMSADLink.2
        public Class getDataClass() {
            return OMSADLink.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSADLink mo17830newInstance() {
            return new OMSADLink();
        }

        public boolean parseField(OMSADLink oMSADLink, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "originalId":
                    oMSADLink.originalId = jsonParser.getValueAsString();
                    return true;
                case "fallbackLink":
                    oMSADLink.fallbackLink = (OMSFallbackLink) OMSFallbackLink.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "action":
                    oMSADLink.action = (LinkAction) LinkAction.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "deeplinkReport":
                    oMSADLink.deeplinkReport = (DeeplinkReport) DeeplinkReport.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "url":
                    oMSADLink.url = jsonParser.getValueAsString();
                    return true;
                case "path":
                    oMSADLink.path = jsonParser.getValueAsString();
                    return true;
                case "appID":
                    oMSADLink.appID = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSADLink oMSADLink, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "originalId":
                case "fallbackLink":
                case "action":
                case "deeplinkReport":
                case "url":
                case "path":
                case "appID":
                    return true;
                default:
                    return super.parseFieldCheck(oMSADLink, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSADLink oMSADLink, JsonGenerator jsonGenerator) throws IOException {
            if (oMSADLink.action != null) {
                jsonGenerator.writeFieldName(Action.TYPE);
                LinkAction.JSON_ADAPTER.serialize(oMSADLink.action, jsonGenerator, true);
            }
            String str = oMSADLink.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            if (oMSADLink.fallbackLink != null) {
                jsonGenerator.writeFieldName("fallbackLink");
                OMSFallbackLink.JSON_ADAPTER.serialize(oMSADLink.fallbackLink, jsonGenerator, true);
            }
            if (oMSADLink.deeplinkReport != null) {
                jsonGenerator.writeFieldName("deeplinkReport");
                DeeplinkReport.JSON_ADAPTER.serialize(oMSADLink.deeplinkReport, jsonGenerator, true);
            }
            String str2 = oMSADLink.path;
            if (str2 != null) {
                jsonGenerator.writeStringField("path", str2);
            }
            String str3 = oMSADLink.originalId;
            if (str3 != null) {
                jsonGenerator.writeStringField("originalId", str3);
            }
            String str4 = oMSADLink.appID;
            if (str4 != null) {
                jsonGenerator.writeStringField("appID", str4);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSADLink) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSADLink) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSADLink new_() {
        OMSADLink oMSADLink = new OMSADLink();
        oMSADLink.nullCheck();
        return oMSADLink;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSADLink m18560clone() {
        OMSADLink oMSADLink = new OMSADLink();
        oMSADLink.action = this.action;
        oMSADLink.url = this.url;
        OMSFallbackLink oMSFallbackLink = this.fallbackLink;
        if (oMSFallbackLink != null) {
            oMSADLink.fallbackLink = oMSFallbackLink.m18623clone();
        }
        DeeplinkReport deeplinkReport = this.deeplinkReport;
        if (deeplinkReport != null) {
            oMSADLink.deeplinkReport = deeplinkReport.m17952clone();
        }
        oMSADLink.path = this.path;
        oMSADLink.originalId = this.originalId;
        oMSADLink.appID = this.appID;
        return oMSADLink;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSADLink)) {
            return false;
        }
        OMSADLink oMSADLink = (OMSADLink) obj;
        return ValueObject.util_equals(this.action, oMSADLink.action) && ValueObject.util_equals(this.url, oMSADLink.url) && ValueObject.util_equals(this.fallbackLink, oMSADLink.fallbackLink) && ValueObject.util_equals(this.deeplinkReport, oMSADLink.deeplinkReport) && ValueObject.util_equals(this.path, oMSADLink.path) && ValueObject.util_equals(this.originalId, oMSADLink.originalId) && ValueObject.util_equals(this.appID, oMSADLink.appID);
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
        LinkAction linkAction = this.action;
        int iHashCode = (i2 + (linkAction != null ? linkAction.hashCode() : 0)) * 41;
        String str = this.url;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        OMSFallbackLink oMSFallbackLink = this.fallbackLink;
        int iHashCode3 = (iHashCode2 + (oMSFallbackLink != null ? oMSFallbackLink.hashCode() : 0)) * 41;
        DeeplinkReport deeplinkReport = this.deeplinkReport;
        int iHashCode4 = (iHashCode3 + (deeplinkReport != null ? deeplinkReport.hashCode() : 0)) * 41;
        String str2 = this.path;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.originalId;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.appID;
        int iHashCode7 = iHashCode6 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public void nullCheck() {
        if (this.action == null) {
            this.action = (LinkAction) LinkAction.JSON_ADAPTER.defaultEnum();
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.deeplinkReport == null) {
            this.deeplinkReport = DeeplinkReport.new_();
        }
        if (this.path == null) {
            this.path = "";
        }
        if (this.originalId == null) {
            this.originalId = "";
        }
        if (this.appID == null) {
            this.appID = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
