package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class VisitorDoorInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "visitordoorinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public String describe;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    @ProtobufIndex(index = 4)
    public int unReadCount;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userID;
    public static ProtobufAdapter<VisitorDoorInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<VisitorDoorInfo>() { // from class: com.p1.mobile.putong.core.data.VisitorDoorInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VisitorDoorInfo visitorDoorInfo) {
            String str = visitorDoorInfo.userID;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = visitorDoorInfo.title;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = visitorDoorInfo.describe;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(4, visitorDoorInfo.unReadCount);
            visitorDoorInfo.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VisitorDoorInfo parse(nc5 nc5Var) throws IOException {
            VisitorDoorInfo visitorDoorInfo = new VisitorDoorInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    visitorDoorInfo.userID = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    visitorDoorInfo.title = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    visitorDoorInfo.describe = nc5Var.m162495s();
                } else {
                    if (iM162497u != 32) {
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
                    visitorDoorInfo.unReadCount = nc5Var.m162486j();
                }
            }
            return visitorDoorInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VisitorDoorInfo visitorDoorInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = visitorDoorInfo.userID;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = visitorDoorInfo.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = visitorDoorInfo.describe;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            codedOutputByteBufferNano.m17305G(4, visitorDoorInfo.unReadCount);
        }
    };
    public static JsonAdapter<VisitorDoorInfo> JSON_ADAPTER = new ObjectJsonAdapter<VisitorDoorInfo>() { // from class: com.p1.mobile.putong.core.data.VisitorDoorInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VisitorDoorInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VisitorDoorInfo newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VisitorDoorInfo visitorDoorInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = visitorDoorInfo.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
            String str2 = visitorDoorInfo.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = visitorDoorInfo.describe;
            if (str3 != null) {
                jsonGenerator.writeStringField("describe", str3);
            }
            jsonGenerator.writeNumberField("unReadCount", visitorDoorInfo.unReadCount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VisitorDoorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VisitorDoorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VisitorDoorInfo new_() {
        VisitorDoorInfo visitorDoorInfo = new VisitorDoorInfo();
        visitorDoorInfo.nullCheck();
        return visitorDoorInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VisitorDoorInfo mo225055clone() {
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
        String str = this.userID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.describe;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.unReadCount;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
