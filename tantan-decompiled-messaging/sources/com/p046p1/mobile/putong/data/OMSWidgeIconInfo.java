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
public class OMSWidgeIconInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omswidgeiconinfo";

    @ProtobufIndex(index = 3)
    public int height;

    @NonNull
    @ProtobufIndex(index = 1)
    public String identifier;

    @ProtobufIndex(index = 2)
    public int width;
    public static ProtobufAdapter<OMSWidgeIconInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSWidgeIconInfo>() { // from class: com.p1.mobile.putong.data.OMSWidgeIconInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSWidgeIconInfo oMSWidgeIconInfo) {
            String str = oMSWidgeIconInfo.identifier;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, oMSWidgeIconInfo.width) + CodedOutputByteBufferNano.m17226h(3, oMSWidgeIconInfo.height);
            oMSWidgeIconInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSWidgeIconInfo parse(nb5 nb5Var) throws IOException {
            OMSWidgeIconInfo oMSWidgeIconInfo = new OMSWidgeIconInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oMSWidgeIconInfo.identifier != null) {
                        break;
                    }
                    oMSWidgeIconInfo.identifier = "";
                    break;
                }
                if (iM158752u == 10) {
                    oMSWidgeIconInfo.identifier = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    oMSWidgeIconInfo.width = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        if (oMSWidgeIconInfo.identifier != null) {
                            break;
                        }
                        oMSWidgeIconInfo.identifier = "";
                        return oMSWidgeIconInfo;
                    }
                    oMSWidgeIconInfo.height = nb5Var.m158741j();
                }
            }
            return oMSWidgeIconInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSWidgeIconInfo oMSWidgeIconInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oMSWidgeIconInfo.identifier;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, oMSWidgeIconInfo.width);
            codedOutputByteBufferNano.m17250G(3, oMSWidgeIconInfo.height);
        }
    };
    public static JsonAdapter<OMSWidgeIconInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSWidgeIconInfo>() { // from class: com.p1.mobile.putong.data.OMSWidgeIconInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSWidgeIconInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSWidgeIconInfo newInstance() {
            return new OMSWidgeIconInfo();
        }

        public boolean parseField(OMSWidgeIconInfo oMSWidgeIconInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "identifier":
                    oMSWidgeIconInfo.identifier = jsonParser.getValueAsString();
                    return true;
                case "height":
                    oMSWidgeIconInfo.height = jsonParser.getValueAsInt();
                    return true;
                case "width":
                    oMSWidgeIconInfo.width = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSWidgeIconInfo oMSWidgeIconInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "identifier":
                case "height":
                case "width":
                    return true;
                default:
                    return super.parseFieldCheck(oMSWidgeIconInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSWidgeIconInfo oMSWidgeIconInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = oMSWidgeIconInfo.identifier;
            if (str != null) {
                jsonGenerator.writeStringField("identifier", str);
            }
            jsonGenerator.writeNumberField("width", oMSWidgeIconInfo.width);
            jsonGenerator.writeNumberField("height", oMSWidgeIconInfo.height);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSWidgeIconInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSWidgeIconInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSWidgeIconInfo new_() {
        OMSWidgeIconInfo oMSWidgeIconInfo = new OMSWidgeIconInfo();
        oMSWidgeIconInfo.nullCheck();
        return oMSWidgeIconInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSWidgeIconInfo mo223809clone() {
        OMSWidgeIconInfo oMSWidgeIconInfo = new OMSWidgeIconInfo();
        oMSWidgeIconInfo.identifier = this.identifier;
        oMSWidgeIconInfo.width = this.width;
        oMSWidgeIconInfo.height = this.height;
        return oMSWidgeIconInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSWidgeIconInfo)) {
            return false;
        }
        OMSWidgeIconInfo oMSWidgeIconInfo = (OMSWidgeIconInfo) obj;
        return ValueObject.util_equals(this.identifier, oMSWidgeIconInfo.identifier) && this.width == oMSWidgeIconInfo.width && this.height == oMSWidgeIconInfo.height;
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
        String str = this.identifier;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.width) * 41) + this.height;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.identifier == null) {
            this.identifier = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
