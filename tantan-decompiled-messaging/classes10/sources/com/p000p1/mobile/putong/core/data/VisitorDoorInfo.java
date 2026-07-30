package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class VisitorDoorInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "visitordoorinfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String describe;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String title;

    @ProtobufIndex(index = 4)
    public int unReadCount;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userID;
    public static ProtobufAdapter<VisitorDoorInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<VisitorDoorInfo>() { // from class: com.p1.mobile.putong.core.data.VisitorDoorInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VisitorDoorInfo visitorDoorInfo) {
            String str = visitorDoorInfo.userID;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = visitorDoorInfo.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = visitorDoorInfo.describe;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            int iH = iO + CodedOutputByteBufferNano.h(4, visitorDoorInfo.unReadCount);
            ((MessageNano) visitorDoorInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VisitorDoorInfo m16236parse(nb5 nb5Var) throws IOException {
            VisitorDoorInfo visitorDoorInfo = new VisitorDoorInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (visitorDoorInfo.userID == null) {
                        visitorDoorInfo.userID = "";
                    }
                    if (visitorDoorInfo.title == null) {
                        visitorDoorInfo.title = "";
                    }
                    if (visitorDoorInfo.describe != null) {
                        break;
                    }
                    visitorDoorInfo.describe = "";
                    break;
                }
                if (iU == 10) {
                    visitorDoorInfo.userID = nb5Var.s();
                } else if (iU == 18) {
                    visitorDoorInfo.title = nb5Var.s();
                } else if (iU == 26) {
                    visitorDoorInfo.describe = nb5Var.s();
                } else {
                    if (iU != 32) {
                        if (visitorDoorInfo.userID == null) {
                            visitorDoorInfo.userID = "";
                        }
                        if (visitorDoorInfo.title == null) {
                            visitorDoorInfo.title = "";
                        }
                        if (visitorDoorInfo.describe != null) {
                            break;
                        }
                        visitorDoorInfo.describe = "";
                        return visitorDoorInfo;
                    }
                    visitorDoorInfo.unReadCount = nb5Var.j();
                }
            }
            return visitorDoorInfo;
        }

        public void serialize(VisitorDoorInfo visitorDoorInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = visitorDoorInfo.userID;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = visitorDoorInfo.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = visitorDoorInfo.describe;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            codedOutputByteBufferNano.G(4, visitorDoorInfo.unReadCount);
        }
    };
    public static JsonAdapter<VisitorDoorInfo> JSON_ADAPTER = new ObjectJsonAdapter<VisitorDoorInfo>() { // from class: com.p1.mobile.putong.core.data.VisitorDoorInfo.2
        public Class getDataClass() {
            return VisitorDoorInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public VisitorDoorInfo m16237newInstance() {
            return new VisitorDoorInfo();
        }

        public boolean parseField(VisitorDoorInfo visitorDoorInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userID":
                    visitorDoorInfo.userID = jsonParser.getValueAsString();
                    return true;
                case "title":
                    visitorDoorInfo.title = jsonParser.getValueAsString();
                    return true;
                case "unReadCount":
                    visitorDoorInfo.unReadCount = jsonParser.getValueAsInt();
                    return true;
                case "describe":
                    visitorDoorInfo.describe = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VisitorDoorInfo visitorDoorInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userID":
                case "title":
                case "unReadCount":
                case "describe":
                    return true;
                default:
                    return super.parseFieldCheck(visitorDoorInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(VisitorDoorInfo visitorDoorInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = visitorDoorInfo.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
            String str2 = visitorDoorInfo.title;
            if (str2 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str2);
            }
            String str3 = visitorDoorInfo.describe;
            if (str3 != null) {
                jsonGenerator.writeStringField("describe", str3);
            }
            jsonGenerator.writeNumberField("unReadCount", visitorDoorInfo.unReadCount);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VisitorDoorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VisitorDoorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VisitorDoorInfo new_() {
        VisitorDoorInfo visitorDoorInfo = new VisitorDoorInfo();
        visitorDoorInfo.nullCheck();
        return visitorDoorInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VisitorDoorInfo m16235clone() {
        VisitorDoorInfo visitorDoorInfo = new VisitorDoorInfo();
        visitorDoorInfo.userID = this.userID;
        visitorDoorInfo.title = this.title;
        visitorDoorInfo.describe = this.describe;
        visitorDoorInfo.unReadCount = this.unReadCount;
        return visitorDoorInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VisitorDoorInfo)) {
            return false;
        }
        VisitorDoorInfo visitorDoorInfo = (VisitorDoorInfo) obj;
        return ValueObject.util_equals(this.userID, visitorDoorInfo.userID) && ValueObject.util_equals(this.title, visitorDoorInfo.title) && ValueObject.util_equals(this.describe, visitorDoorInfo.describe) && this.unReadCount == visitorDoorInfo.unReadCount;
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
        String str = this.userID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.describe;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.unReadCount;
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.userID == null) {
            this.userID = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.describe == null) {
            this.describe = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
