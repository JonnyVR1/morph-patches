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
public class OMSEmitterInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsemitterinfo";

    @ProtobufIndex(index = 3)
    public boolean enable;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f249id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String url;

    @ProtobufIndex(index = 2)
    public int version;
    public static ProtobufAdapter<OMSEmitterInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSEmitterInfo>() { // from class: com.p1.mobile.putong.data.OMSEmitterInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSEmitterInfo oMSEmitterInfo) {
            String str = oMSEmitterInfo.f249id;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, oMSEmitterInfo.version) + CodedOutputByteBufferNano.b(3, oMSEmitterInfo.enable);
            String str2 = oMSEmitterInfo.url;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(4, str2);
            }
            ((MessageNano) oMSEmitterInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSEmitterInfo m18621parse(nb5 nb5Var) throws IOException {
            OMSEmitterInfo oMSEmitterInfo = new OMSEmitterInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSEmitterInfo.f249id == null) {
                        oMSEmitterInfo.f249id = "";
                    }
                    if (oMSEmitterInfo.url != null) {
                        break;
                    }
                    oMSEmitterInfo.url = "";
                    break;
                }
                if (iU == 10) {
                    oMSEmitterInfo.f249id = nb5Var.s();
                } else if (iU == 16) {
                    oMSEmitterInfo.version = nb5Var.j();
                } else if (iU == 24) {
                    oMSEmitterInfo.enable = nb5Var.g();
                } else {
                    if (iU != 34) {
                        if (oMSEmitterInfo.f249id == null) {
                            oMSEmitterInfo.f249id = "";
                        }
                        if (oMSEmitterInfo.url != null) {
                            break;
                        }
                        oMSEmitterInfo.url = "";
                        return oMSEmitterInfo;
                    }
                    oMSEmitterInfo.url = nb5Var.s();
                }
            }
            return oMSEmitterInfo;
        }

        public void serialize(OMSEmitterInfo oMSEmitterInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSEmitterInfo.f249id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, oMSEmitterInfo.version);
            codedOutputByteBufferNano.A(3, oMSEmitterInfo.enable);
            String str2 = oMSEmitterInfo.url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
        }
    };
    public static JsonAdapter<OMSEmitterInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSEmitterInfo>() { // from class: com.p1.mobile.putong.data.OMSEmitterInfo.2
        public Class getDataClass() {
            return OMSEmitterInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSEmitterInfo mo17830newInstance() {
            return new OMSEmitterInfo();
        }

        public boolean parseField(OMSEmitterInfo oMSEmitterInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    oMSEmitterInfo.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    oMSEmitterInfo.f249id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    oMSEmitterInfo.url = jsonParser.getValueAsString();
                    return true;
                case "version":
                    oMSEmitterInfo.version = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSEmitterInfo oMSEmitterInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                    return true;
                case "id":
                    return false;
                case "url":
                case "version":
                    return true;
                default:
                    return super.parseFieldCheck(oMSEmitterInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSEmitterInfo oMSEmitterInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSEmitterInfo.f249id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("version", oMSEmitterInfo.version);
            jsonGenerator.writeBooleanField("enable", oMSEmitterInfo.enable);
            String str2 = oMSEmitterInfo.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSEmitterInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSEmitterInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSEmitterInfo new_() {
        OMSEmitterInfo oMSEmitterInfo = new OMSEmitterInfo();
        oMSEmitterInfo.nullCheck();
        return oMSEmitterInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSEmitterInfo m18620clone() {
        OMSEmitterInfo oMSEmitterInfo = new OMSEmitterInfo();
        oMSEmitterInfo.f249id = this.f249id;
        oMSEmitterInfo.version = this.version;
        oMSEmitterInfo.enable = this.enable;
        oMSEmitterInfo.url = this.url;
        return oMSEmitterInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSEmitterInfo)) {
            return false;
        }
        OMSEmitterInfo oMSEmitterInfo = (OMSEmitterInfo) obj;
        return ValueObject.util_equals(this.f249id, oMSEmitterInfo.f249id) && this.version == oMSEmitterInfo.version && this.enable == oMSEmitterInfo.enable && ValueObject.util_equals(this.url, oMSEmitterInfo.url);
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
        String str = this.f249id;
        int iHashCode = (((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.version) * 41) + (this.enable ? 1231 : 1237)) * 41;
        String str2 = this.url;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f249id == null) {
            this.f249id = "";
        }
        if (this.url == null) {
            this.url = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
