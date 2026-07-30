package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class PictureTxtDeeplinkMsgData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "picturetxtdeeplinkmsgdata";

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String failRemind;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String schema;

    @ProtobufIndex(index = 4)
    public int type;

    @Nullable
    @ProtobufIndex(index = 1)
    public PictureTxtDeeplinkMessageView view;
    public static ProtobufAdapter<PictureTxtDeeplinkMsgData> PROTOBUF_ADAPTER = new MessageNanoAdapter<PictureTxtDeeplinkMsgData>() { // from class: com.p1.mobile.putong.core.data.PictureTxtDeeplinkMsgData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData) {
            PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageView = pictureTxtDeeplinkMsgData.view;
            int iL = pictureTxtDeeplinkMessageView != null ? CodedOutputByteBufferNano.l(1, pictureTxtDeeplinkMessageView, PictureTxtDeeplinkMessageView.PROTOBUF_ADAPTER) : 0;
            String str = pictureTxtDeeplinkMsgData.schema;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = pictureTxtDeeplinkMsgData.failRemind;
            if (str2 != null) {
                iL += CodedOutputByteBufferNano.o(3, str2);
            }
            int iH = iL + CodedOutputByteBufferNano.h(4, pictureTxtDeeplinkMsgData.type);
            ((MessageNano) pictureTxtDeeplinkMsgData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PictureTxtDeeplinkMsgData m14801parse(nb5 nb5Var) throws IOException {
            PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData = new PictureTxtDeeplinkMsgData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    pictureTxtDeeplinkMsgData.view = (PictureTxtDeeplinkMessageView) nb5Var.l(PictureTxtDeeplinkMessageView.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    pictureTxtDeeplinkMsgData.schema = nb5Var.s();
                } else if (iU == 26) {
                    pictureTxtDeeplinkMsgData.failRemind = nb5Var.s();
                } else {
                    if (iU != 32) {
                        return pictureTxtDeeplinkMsgData;
                    }
                    pictureTxtDeeplinkMsgData.type = nb5Var.j();
                }
            }
        }

        public void serialize(PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageView = pictureTxtDeeplinkMsgData.view;
            if (pictureTxtDeeplinkMessageView != null) {
                codedOutputByteBufferNano.K(1, pictureTxtDeeplinkMessageView, PictureTxtDeeplinkMessageView.PROTOBUF_ADAPTER);
            }
            String str = pictureTxtDeeplinkMsgData.schema;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = pictureTxtDeeplinkMsgData.failRemind;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            codedOutputByteBufferNano.G(4, pictureTxtDeeplinkMsgData.type);
        }
    };
    public static JsonAdapter<PictureTxtDeeplinkMsgData> JSON_ADAPTER = new ObjectJsonAdapter<PictureTxtDeeplinkMsgData>() { // from class: com.p1.mobile.putong.core.data.PictureTxtDeeplinkMsgData.2
        public Class getDataClass() {
            return PictureTxtDeeplinkMsgData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PictureTxtDeeplinkMsgData m14802newInstance() {
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
                    pictureTxtDeeplinkMsgData.view = (PictureTxtDeeplinkMessageView) PictureTxtDeeplinkMessageView.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, JsonGenerator jsonGenerator) throws IOException {
            if (pictureTxtDeeplinkMsgData.view != null) {
                jsonGenerator.writeFieldName("view");
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PictureTxtDeeplinkMsgData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PictureTxtDeeplinkMsgData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PictureTxtDeeplinkMsgData new_() {
        PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData = new PictureTxtDeeplinkMsgData();
        pictureTxtDeeplinkMsgData.nullCheck();
        return pictureTxtDeeplinkMsgData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PictureTxtDeeplinkMsgData m14800clone() {
        PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData = new PictureTxtDeeplinkMsgData();
        PictureTxtDeeplinkMessageView pictureTxtDeeplinkMessageView = this.view;
        if (pictureTxtDeeplinkMessageView != null) {
            pictureTxtDeeplinkMsgData.view = pictureTxtDeeplinkMessageView.m14796clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
