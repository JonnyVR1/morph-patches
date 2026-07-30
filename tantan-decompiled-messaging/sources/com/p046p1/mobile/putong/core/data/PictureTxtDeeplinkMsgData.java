package com.p046p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
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

/* JADX INFO: loaded from: classes10.dex */
public class PictureTxtDeeplinkMsgData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "picturetxtdeeplinkmsgdata";

    @Nullable
    @ProtobufIndex(index = 3)
    public String failRemind;

    @Nullable
    @ProtobufIndex(index = 2)
    public String schema;

    @ProtobufIndex(index = 4)
    public int type;

    @Nullable
    @ProtobufIndex(index = 1)
    public PictureTxtDeeplinkMessageView view;
    public static ProtobufAdapter<PictureTxtDeeplinkMsgData> PROTOBUF_ADAPTER = new MessageNanoAdapter<PictureTxtDeeplinkMsgData>() { // from class: com.p1.mobile.putong.core.data.PictureTxtDeeplinkMsgData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData) {
            PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageView = pictureTxtDeeplinkMsgData.view;
            int iM17230l = pictureTxtDeeplinkMessageView != null ? CodedOutputByteBufferNano.m17230l(1, pictureTxtDeeplinkMessageView, PictureTxtDeeplinkMessageView.PROTOBUF_ADAPTER) : 0;
            String str = pictureTxtDeeplinkMsgData.schema;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = pictureTxtDeeplinkMsgData.failRemind;
            if (str2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            int iM17226h = iM17230l + CodedOutputByteBufferNano.m17226h(4, pictureTxtDeeplinkMsgData.type);
            pictureTxtDeeplinkMsgData.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PictureTxtDeeplinkMsgData parse(nb5 nb5Var) throws IOException {
            PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData = new PictureTxtDeeplinkMsgData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 10) {
                    pictureTxtDeeplinkMsgData.view = (PictureTxtDeeplinkMessageView) nb5Var.m158743l(PictureTxtDeeplinkMessageView.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    pictureTxtDeeplinkMsgData.schema = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    pictureTxtDeeplinkMsgData.failRemind = nb5Var.m158750s();
                } else {
                    if (iM158752u != 32) {
                        return pictureTxtDeeplinkMsgData;
                    }
                    pictureTxtDeeplinkMsgData.type = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageView = pictureTxtDeeplinkMsgData.view;
            if (pictureTxtDeeplinkMessageView != null) {
                codedOutputByteBufferNano.m17254K(1, pictureTxtDeeplinkMessageView, PictureTxtDeeplinkMessageView.PROTOBUF_ADAPTER);
            }
            String str = pictureTxtDeeplinkMsgData.schema;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = pictureTxtDeeplinkMsgData.failRemind;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            codedOutputByteBufferNano.m17250G(4, pictureTxtDeeplinkMsgData.type);
        }
    };
    public static JsonAdapter<PictureTxtDeeplinkMsgData> JSON_ADAPTER = new ObjectJsonAdapter<PictureTxtDeeplinkMsgData>() { // from class: com.p1.mobile.putong.core.data.PictureTxtDeeplinkMsgData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PictureTxtDeeplinkMsgData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PictureTxtDeeplinkMsgData newInstance() {
            return new PictureTxtDeeplinkMsgData();
        }

        public boolean parseField(PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "schema":
                    pictureTxtDeeplinkMsgData.schema = jsonParser.getValueAsString();
                    return true;
                case "type":
                    pictureTxtDeeplinkMsgData.type = jsonParser.getValueAsInt();
                    return true;
                case "view":
                    pictureTxtDeeplinkMsgData.view = PictureTxtDeeplinkMessageView.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "failRemind":
                    pictureTxtDeeplinkMsgData.failRemind = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "schema":
                case "type":
                case "view":
                case "failRemind":
                    return true;
                default:
                    return super.parseFieldCheck(pictureTxtDeeplinkMsgData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, JsonGenerator jsonGenerator) throws IOException {
            if (pictureTxtDeeplinkMsgData.view != null) {
                jsonGenerator.writeFieldName(OMSTemplateModeType.view);
                PictureTxtDeeplinkMessageView.JSON_ADAPTER.serialize(pictureTxtDeeplinkMsgData.view, jsonGenerator, true);
            }
            String str = pictureTxtDeeplinkMsgData.schema;
            if (str != null) {
                jsonGenerator.writeStringField("schema", str);
            }
            String str2 = pictureTxtDeeplinkMsgData.failRemind;
            if (str2 != null) {
                jsonGenerator.writeStringField("failRemind", str2);
            }
            jsonGenerator.writeNumberField("type", pictureTxtDeeplinkMsgData.type);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PictureTxtDeeplinkMsgData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PictureTxtDeeplinkMsgData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PictureTxtDeeplinkMsgData new_() {
        PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData = new PictureTxtDeeplinkMsgData();
        pictureTxtDeeplinkMsgData.nullCheck();
        return pictureTxtDeeplinkMsgData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PictureTxtDeeplinkMsgData mo223809clone() {
        PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData = new PictureTxtDeeplinkMsgData();
        PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageView = this.view;
        if (pictureTxtDeeplinkMessageView != null) {
            pictureTxtDeeplinkMsgData.view = pictureTxtDeeplinkMessageView.mo223809clone();
        }
        pictureTxtDeeplinkMsgData.schema = this.schema;
        pictureTxtDeeplinkMsgData.failRemind = this.failRemind;
        pictureTxtDeeplinkMsgData.type = this.type;
        return pictureTxtDeeplinkMsgData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PictureTxtDeeplinkMsgData)) {
            return false;
        }
        PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData = (PictureTxtDeeplinkMsgData) obj;
        return ValueObject.util_equals(this.view, pictureTxtDeeplinkMsgData.view) && ValueObject.util_equals(this.schema, pictureTxtDeeplinkMsgData.schema) && ValueObject.util_equals(this.failRemind, pictureTxtDeeplinkMsgData.failRemind) && this.type == pictureTxtDeeplinkMsgData.type;
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
        PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageView = this.view;
        int iHashCode = (i2 + (pictureTxtDeeplinkMessageView != null ? pictureTxtDeeplinkMessageView.hashCode() : 0)) * 41;
        String str = this.schema;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.failRemind;
        int iHashCode3 = ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41) + this.type;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
