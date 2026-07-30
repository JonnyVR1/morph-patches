package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.LocationInvisibleField;
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
public class LiteraturesComments extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "literaturescomments";

    @ProtobufIndex(index = 4)
    public long createdTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 6)
    public String f20434id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String interestLevel;

    @NonNull
    @ProtobufIndex(index = 2)
    public String literatureID;

    @Nullable
    @ProtobufIndex(index = 5)
    public Literatures localLiteratures;

    @ProtobufIndex(index = 7)
    public long updatedTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userID;
    public static ProtobufAdapter<LiteraturesComments> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiteraturesComments>() { // from class: com.p1.mobile.putong.core.data.LiteraturesComments.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiteraturesComments literaturesComments) {
            String str = literaturesComments.userID;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = literaturesComments.literatureID;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = literaturesComments.interestLevel;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            int iM17228j = iM17233o + CodedOutputByteBufferNano.m17228j(4, literaturesComments.createdTime);
            Literatures literatures = literaturesComments.localLiteratures;
            if (literatures != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(5, literatures, Literatures.PROTOBUF_ADAPTER);
            }
            String str4 = literaturesComments.f20434id;
            if (str4 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(6, str4);
            }
            int iM17228j2 = iM17228j + CodedOutputByteBufferNano.m17228j(7, literaturesComments.updatedTime);
            literaturesComments.cachedSize = iM17228j2;
            return iM17228j2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiteraturesComments parse(nb5 nb5Var) throws IOException {
            LiteraturesComments literaturesComments = new LiteraturesComments();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (literaturesComments.userID == null) {
                        literaturesComments.userID = "";
                    }
                    if (literaturesComments.literatureID == null) {
                        literaturesComments.literatureID = "";
                    }
                    if (literaturesComments.interestLevel == null) {
                        literaturesComments.interestLevel = "";
                    }
                    if (literaturesComments.f20434id != null) {
                        break;
                    }
                    literaturesComments.f20434id = "";
                    break;
                }
                if (iM158752u == 10) {
                    literaturesComments.userID = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    literaturesComments.literatureID = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    literaturesComments.interestLevel = nb5Var.m158750s();
                } else if (iM158752u == 32) {
                    literaturesComments.createdTime = nb5Var.m158742k();
                } else if (iM158752u == 42) {
                    literaturesComments.localLiteratures = (Literatures) nb5Var.m158743l(Literatures.PROTOBUF_ADAPTER);
                } else if (iM158752u == 50) {
                    literaturesComments.f20434id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 56) {
                        if (literaturesComments.userID == null) {
                            literaturesComments.userID = "";
                        }
                        if (literaturesComments.literatureID == null) {
                            literaturesComments.literatureID = "";
                        }
                        if (literaturesComments.interestLevel == null) {
                            literaturesComments.interestLevel = "";
                        }
                        if (literaturesComments.f20434id != null) {
                            break;
                        }
                        literaturesComments.f20434id = "";
                        return literaturesComments;
                    }
                    literaturesComments.updatedTime = nb5Var.m158742k();
                }
            }
            return literaturesComments;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiteraturesComments literaturesComments, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = literaturesComments.userID;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = literaturesComments.literatureID;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = literaturesComments.interestLevel;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            codedOutputByteBufferNano.m17252I(4, literaturesComments.createdTime);
            Literatures literatures = literaturesComments.localLiteratures;
            if (literatures != null) {
                codedOutputByteBufferNano.m17254K(5, literatures, Literatures.PROTOBUF_ADAPTER);
            }
            String str4 = literaturesComments.f20434id;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(6, str4);
            }
            codedOutputByteBufferNano.m17252I(7, literaturesComments.updatedTime);
        }
    };
    public static JsonAdapter<LiteraturesComments> JSON_ADAPTER = new ObjectJsonAdapter<LiteraturesComments>() { // from class: com.p1.mobile.putong.core.data.LiteraturesComments.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiteraturesComments.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiteraturesComments newInstance() {
            return new LiteraturesComments();
        }

        public boolean parseField(LiteraturesComments literaturesComments, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "interestLevel":
                    literaturesComments.interestLevel = jsonParser.getValueAsString();
                    return true;
                case "literatureID":
                    literaturesComments.literatureID = jsonParser.getValueAsString();
                    return true;
                case "userID":
                    literaturesComments.userID = jsonParser.getValueAsString();
                    return true;
                case "updatedTime":
                    literaturesComments.updatedTime = jsonParser.getValueAsLong();
                    return true;
                case "localLiteratures":
                    literaturesComments.localLiteratures = Literatures.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "createdTime":
                    literaturesComments.createdTime = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    literaturesComments.f20434id = jsonParser.getValueAsString();
                    return false;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiteraturesComments literaturesComments, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "interestLevel":
                case "literatureID":
                case "userID":
                case "updatedTime":
                case "localLiteratures":
                case "createdTime":
                    return true;
                case "id":
                    return false;
                default:
                    return super.parseFieldCheck(literaturesComments, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiteraturesComments literaturesComments, JsonGenerator jsonGenerator) throws IOException {
            String str = literaturesComments.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
            String str2 = literaturesComments.literatureID;
            if (str2 != null) {
                jsonGenerator.writeStringField("literatureID", str2);
            }
            String str3 = literaturesComments.interestLevel;
            if (str3 != null) {
                jsonGenerator.writeStringField("interestLevel", str3);
            }
            jsonGenerator.writeNumberField("createdTime", literaturesComments.createdTime);
            jsonGenerator.writeNumberField(LocationInvisibleField.updatedTime, literaturesComments.updatedTime);
            if (literaturesComments.localLiteratures != null) {
                jsonGenerator.writeFieldName("localLiteratures");
                Literatures.JSON_ADAPTER.serialize(literaturesComments.localLiteratures, jsonGenerator, true);
            }
            String str4 = literaturesComments.f20434id;
            if (str4 != null) {
                jsonGenerator.writeStringField("id", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiteraturesComments) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiteraturesComments) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiteraturesComments new_() {
        LiteraturesComments literaturesComments = new LiteraturesComments();
        literaturesComments.nullCheck();
        return literaturesComments;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiteraturesComments mo223809clone() {
        LiteraturesComments literaturesComments = new LiteraturesComments();
        literaturesComments.userID = this.userID;
        literaturesComments.literatureID = this.literatureID;
        literaturesComments.interestLevel = this.interestLevel;
        literaturesComments.createdTime = this.createdTime;
        literaturesComments.updatedTime = this.updatedTime;
        Literatures literatures = this.localLiteratures;
        if (literatures != null) {
            literaturesComments.localLiteratures = literatures.mo223809clone();
        }
        literaturesComments.f20434id = this.f20434id;
        return literaturesComments;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiteraturesComments)) {
            return false;
        }
        LiteraturesComments literaturesComments = (LiteraturesComments) obj;
        return ValueObject.util_equals(this.userID, literaturesComments.userID) && ValueObject.util_equals(this.literatureID, literaturesComments.literatureID) && ValueObject.util_equals(this.interestLevel, literaturesComments.interestLevel) && this.createdTime == literaturesComments.createdTime && this.updatedTime == literaturesComments.updatedTime && ValueObject.util_equals(this.localLiteratures, literaturesComments.localLiteratures) && ValueObject.util_equals(this.f20434id, literaturesComments.f20434id);
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
        String str2 = this.literatureID;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.interestLevel;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.createdTime;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.updatedTime;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        Literatures literatures = this.localLiteratures;
        int iHashCode4 = (i4 + (literatures != null ? literatures.hashCode() : 0)) * 41;
        String str4 = this.f20434id;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userID == null) {
            this.userID = "";
        }
        if (this.literatureID == null) {
            this.literatureID = "";
        }
        if (this.interestLevel == null) {
            this.interestLevel = "";
        }
        if (this.f20434id == null) {
            this.f20434id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
