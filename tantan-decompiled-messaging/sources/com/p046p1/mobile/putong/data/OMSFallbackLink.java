package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class OMSFallbackLink extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsfallbacklink";

    @NonNull
    @ProtobufIndex(index = 1)
    public LinkAction action;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;
    public static ProtobufAdapter<OMSFallbackLink> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSFallbackLink>() { // from class: com.p1.mobile.putong.data.OMSFallbackLink.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSFallbackLink oMSFallbackLink) {
            LinkAction linkAction = oMSFallbackLink.action;
            int iM17226h = linkAction != null ? CodedOutputByteBufferNano.m17226h(1, linkAction.ordinal()) : 0;
            String str = oMSFallbackLink.url;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            LinkAction linkAction2 = oMSFallbackLink.action;
            if (linkAction2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(3, linkAction2, LinkAction.PROTOBUF_ADAPTER);
            }
            oMSFallbackLink.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSFallbackLink parse(nb5 nb5Var) throws IOException {
            OMSFallbackLink oMSFallbackLink = new OMSFallbackLink();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oMSFallbackLink.action == null && numValueOf != null) {
                        oMSFallbackLink.action = (LinkAction) LinkAction.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (oMSFallbackLink.action == null) {
                        oMSFallbackLink.action = (LinkAction) LinkAction.JSON_ADAPTER.defaultEnum();
                    }
                    if (oMSFallbackLink.url != null) {
                        break;
                    }
                    oMSFallbackLink.url = "";
                    break;
                }
                if (iM158752u == 8) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 18) {
                    oMSFallbackLink.url = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (oMSFallbackLink.action == null && numValueOf != null) {
                            oMSFallbackLink.action = (LinkAction) LinkAction.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (oMSFallbackLink.action == null) {
                            oMSFallbackLink.action = (LinkAction) LinkAction.JSON_ADAPTER.defaultEnum();
                        }
                        if (oMSFallbackLink.url != null) {
                            break;
                        }
                        oMSFallbackLink.url = "";
                        return oMSFallbackLink;
                    }
                    oMSFallbackLink.action = (LinkAction) nb5Var.m158743l(LinkAction.PROTOBUF_ADAPTER);
                }
            }
            return oMSFallbackLink;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSFallbackLink oMSFallbackLink, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LinkAction linkAction = oMSFallbackLink.action;
            if (linkAction != null) {
                codedOutputByteBufferNano.m17250G(1, linkAction.ordinal());
            }
            String str = oMSFallbackLink.url;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            LinkAction linkAction2 = oMSFallbackLink.action;
            if (linkAction2 != null) {
                codedOutputByteBufferNano.m17254K(3, linkAction2, LinkAction.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OMSFallbackLink> JSON_ADAPTER = new ObjectJsonAdapter<OMSFallbackLink>() { // from class: com.p1.mobile.putong.data.OMSFallbackLink.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSFallbackLink.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSFallbackLink newInstance() {
            return new OMSFallbackLink();
        }

        public boolean parseField(OMSFallbackLink oMSFallbackLink, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("action")) {
                oMSFallbackLink.action = LinkAction.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals("url")) {
                return false;
            }
            oMSFallbackLink.url = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(OMSFallbackLink oMSFallbackLink, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("action") || str.equals("url")) {
                return true;
            }
            return super.parseFieldCheck(oMSFallbackLink, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSFallbackLink oMSFallbackLink, JsonGenerator jsonGenerator) throws IOException {
            if (oMSFallbackLink.action != null) {
                jsonGenerator.writeFieldName("action");
                LinkAction.JSON_ADAPTER.serialize(oMSFallbackLink.action, jsonGenerator, true);
            }
            String str = oMSFallbackLink.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSFallbackLink) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSFallbackLink) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSFallbackLink new_() {
        OMSFallbackLink oMSFallbackLink = new OMSFallbackLink();
        oMSFallbackLink.nullCheck();
        return oMSFallbackLink;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSFallbackLink mo223809clone() {
        OMSFallbackLink oMSFallbackLink = new OMSFallbackLink();
        oMSFallbackLink.action = this.action;
        oMSFallbackLink.url = this.url;
        return oMSFallbackLink;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSFallbackLink)) {
            return false;
        }
        OMSFallbackLink oMSFallbackLink = (OMSFallbackLink) obj;
        return ValueObject.util_equals(this.action, oMSFallbackLink.action) && ValueObject.util_equals(this.url, oMSFallbackLink.url);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        LinkAction linkAction = this.action;
        int iHashCode = (i2 + (linkAction != null ? linkAction.hashCode() : 0)) * 41;
        String str = this.url;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.action == null) {
            this.action = (LinkAction) LinkAction.JSON_ADAPTER.defaultEnum();
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
