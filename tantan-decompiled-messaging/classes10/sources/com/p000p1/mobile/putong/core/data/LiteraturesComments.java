package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class LiteraturesComments extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "literaturescomments";

    @ProtobufIndex(index = 4)
    public long createdTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 6)
    public String f96id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String interestLevel;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String literatureID;

    @Nullable
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public Literatures localLiteratures;

    @ProtobufIndex(index = 7)
    public long updatedTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userID;
    public static ProtobufAdapter<LiteraturesComments> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiteraturesComments>() { // from class: com.p1.mobile.putong.core.data.LiteraturesComments.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiteraturesComments literaturesComments) {
            String str = literaturesComments.userID;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = literaturesComments.literatureID;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = literaturesComments.interestLevel;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            int iJ = iO + CodedOutputByteBufferNano.j(4, literaturesComments.createdTime);
            Literatures literatures = literaturesComments.localLiteratures;
            if (literatures != null) {
                iJ += CodedOutputByteBufferNano.l(5, literatures, Literatures.PROTOBUF_ADAPTER);
            }
            String str4 = literaturesComments.f96id;
            if (str4 != null) {
                iJ += CodedOutputByteBufferNano.o(6, str4);
            }
            int iJ2 = iJ + CodedOutputByteBufferNano.j(7, literaturesComments.updatedTime);
            ((MessageNano) literaturesComments).cachedSize = iJ2;
            return iJ2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiteraturesComments m13919parse(nb5 nb5Var) throws IOException {
            LiteraturesComments literaturesComments = new LiteraturesComments();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (literaturesComments.userID == null) {
                        literaturesComments.userID = "";
                    }
                    if (literaturesComments.literatureID == null) {
                        literaturesComments.literatureID = "";
                    }
                    if (literaturesComments.interestLevel == null) {
                        literaturesComments.interestLevel = "";
                    }
                    if (literaturesComments.f96id != null) {
                        break;
                    }
                    literaturesComments.f96id = "";
                    break;
                }
                if (iU == 10) {
                    literaturesComments.userID = nb5Var.s();
                } else if (iU == 18) {
                    literaturesComments.literatureID = nb5Var.s();
                } else if (iU == 26) {
                    literaturesComments.interestLevel = nb5Var.s();
                } else if (iU == 32) {
                    literaturesComments.createdTime = nb5Var.k();
                } else if (iU == 42) {
                    literaturesComments.localLiteratures = (Literatures) nb5Var.l(Literatures.PROTOBUF_ADAPTER);
                } else if (iU == 50) {
                    literaturesComments.f96id = nb5Var.s();
                } else {
                    if (iU != 56) {
                        if (literaturesComments.userID == null) {
                            literaturesComments.userID = "";
                        }
                        if (literaturesComments.literatureID == null) {
                            literaturesComments.literatureID = "";
                        }
                        if (literaturesComments.interestLevel == null) {
                            literaturesComments.interestLevel = "";
                        }
                        if (literaturesComments.f96id != null) {
                            break;
                        }
                        literaturesComments.f96id = "";
                        return literaturesComments;
                    }
                    literaturesComments.updatedTime = nb5Var.k();
                }
            }
            return literaturesComments;
        }

        public void serialize(LiteraturesComments literaturesComments, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = literaturesComments.userID;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = literaturesComments.literatureID;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = literaturesComments.interestLevel;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            codedOutputByteBufferNano.I(4, literaturesComments.createdTime);
            Literatures literatures = literaturesComments.localLiteratures;
            if (literatures != null) {
                codedOutputByteBufferNano.K(5, literatures, Literatures.PROTOBUF_ADAPTER);
            }
            String str4 = literaturesComments.f96id;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
            codedOutputByteBufferNano.I(7, literaturesComments.updatedTime);
        }
    };
    public static JsonAdapter<LiteraturesComments> JSON_ADAPTER = new ObjectJsonAdapter<LiteraturesComments>() { // from class: com.p1.mobile.putong.core.data.LiteraturesComments.2
        public Class getDataClass() {
            return LiteraturesComments.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LiteraturesComments m13920newInstance() {
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
                    literaturesComments.localLiteratures = (Literatures) Literatures.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "createdTime":
                    literaturesComments.createdTime = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    literaturesComments.f96id = jsonParser.getValueAsString();
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
            jsonGenerator.writeNumberField("updatedTime", literaturesComments.updatedTime);
            if (literaturesComments.localLiteratures != null) {
                jsonGenerator.writeFieldName("localLiteratures");
                Literatures.JSON_ADAPTER.serialize(literaturesComments.localLiteratures, jsonGenerator, true);
            }
            String str4 = literaturesComments.f96id;
            if (str4 != null) {
                jsonGenerator.writeStringField("id", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiteraturesComments) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiteraturesComments) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiteraturesComments new_() {
        LiteraturesComments literaturesComments = new LiteraturesComments();
        literaturesComments.nullCheck();
        return literaturesComments;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiteraturesComments m13918clone() {
        LiteraturesComments literaturesComments = new LiteraturesComments();
        literaturesComments.userID = this.userID;
        literaturesComments.literatureID = this.literatureID;
        literaturesComments.interestLevel = this.interestLevel;
        literaturesComments.createdTime = this.createdTime;
        literaturesComments.updatedTime = this.updatedTime;
        Literatures literatures = this.localLiteratures;
        if (literatures != null) {
            literaturesComments.localLiteratures = literatures.m13914clone();
        }
        literaturesComments.f96id = this.f96id;
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
        return ValueObject.util_equals(this.userID, literaturesComments.userID) && ValueObject.util_equals(this.literatureID, literaturesComments.literatureID) && ValueObject.util_equals(this.interestLevel, literaturesComments.interestLevel) && this.createdTime == literaturesComments.createdTime && this.updatedTime == literaturesComments.updatedTime && ValueObject.util_equals(this.localLiteratures, literaturesComments.localLiteratures) && ValueObject.util_equals(this.f96id, literaturesComments.f96id);
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
        String str4 = this.f96id;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

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
        if (this.f96id == null) {
            this.f96id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
