package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.DatingPurpose;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class DatingPurpose extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "datingpurpose";

    @ProtobufIndex(index = 4)
    public int extension;

    @ProtobufIndex(index = 3)
    public int information;

    @ProtobufIndex(index = 6)
    public int interest;

    @ProtobufIndex(index = 2)
    public int introduction;

    @ProtobufIndex(index = 8)
    public int myrecent;

    @ProtobufIndex(index = 5)
    public int personality;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Integer> picture;

    @ProtobufIndex(index = 7)
    public int question;
    public static ProtobufAdapter<DatingPurpose> PROTOBUF_ADAPTER = new MessageNanoAdapter<DatingPurpose>() { // from class: com.p1.mobile.putong.core.data.DatingPurpose.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DatingPurpose datingPurpose) {
            List<Integer> list = datingPurpose.picture;
            int iM17230l = (list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.m17226h(2, datingPurpose.introduction) + CodedOutputByteBufferNano.m17226h(3, datingPurpose.information) + CodedOutputByteBufferNano.m17226h(4, datingPurpose.extension) + CodedOutputByteBufferNano.m17226h(5, datingPurpose.personality) + CodedOutputByteBufferNano.m17226h(6, datingPurpose.interest) + CodedOutputByteBufferNano.m17226h(7, datingPurpose.question) + CodedOutputByteBufferNano.m17226h(8, datingPurpose.myrecent);
            datingPurpose.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DatingPurpose parse(nb5 nb5Var) throws IOException {
            DatingPurpose datingPurpose = new DatingPurpose();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (datingPurpose.picture != null) {
                        break;
                    }
                    datingPurpose.picture = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    datingPurpose.picture = (List) nb5Var.m158743l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 16) {
                    datingPurpose.introduction = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    datingPurpose.information = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    datingPurpose.extension = nb5Var.m158741j();
                } else if (iM158752u == 40) {
                    datingPurpose.personality = nb5Var.m158741j();
                } else if (iM158752u == 48) {
                    datingPurpose.interest = nb5Var.m158741j();
                } else if (iM158752u == 56) {
                    datingPurpose.question = nb5Var.m158741j();
                } else {
                    if (iM158752u != 64) {
                        if (datingPurpose.picture != null) {
                            break;
                        }
                        datingPurpose.picture = new ArrayList();
                        return datingPurpose;
                    }
                    datingPurpose.myrecent = nb5Var.m158741j();
                }
            }
            return datingPurpose;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DatingPurpose datingPurpose, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Integer> list = datingPurpose.picture;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(2, datingPurpose.introduction);
            codedOutputByteBufferNano.m17250G(3, datingPurpose.information);
            codedOutputByteBufferNano.m17250G(4, datingPurpose.extension);
            codedOutputByteBufferNano.m17250G(5, datingPurpose.personality);
            codedOutputByteBufferNano.m17250G(6, datingPurpose.interest);
            codedOutputByteBufferNano.m17250G(7, datingPurpose.question);
            codedOutputByteBufferNano.m17250G(8, datingPurpose.myrecent);
        }
    };
    public static JsonAdapter<DatingPurpose> JSON_ADAPTER = new ObjectJsonAdapter<DatingPurpose>() { // from class: com.p1.mobile.putong.core.data.DatingPurpose.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DatingPurpose.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DatingPurpose newInstance() {
            return new DatingPurpose();
        }

        public boolean parseField(DatingPurpose datingPurpose, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "question":
                    datingPurpose.question = jsonParser.getValueAsInt();
                    return true;
                case "extension":
                    datingPurpose.extension = jsonParser.getValueAsInt();
                    return true;
                case "picture":
                    datingPurpose.picture = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "personality":
                    datingPurpose.personality = jsonParser.getValueAsInt();
                    return true;
                case "myrecent":
                    datingPurpose.myrecent = jsonParser.getValueAsInt();
                    return true;
                case "interest":
                    datingPurpose.interest = jsonParser.getValueAsInt();
                    return true;
                case "introduction":
                    datingPurpose.introduction = jsonParser.getValueAsInt();
                    return true;
                case "information":
                    datingPurpose.information = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DatingPurpose datingPurpose, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "question":
                case "extension":
                case "picture":
                case "personality":
                case "myrecent":
                case "interest":
                case "introduction":
                case "information":
                    return true;
                default:
                    return super.parseFieldCheck(datingPurpose, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DatingPurpose datingPurpose, JsonGenerator jsonGenerator) throws IOException {
            if (datingPurpose.picture != null) {
                jsonGenerator.writeFieldName("picture");
                JsonAdapter.serializeArray(datingPurpose.picture, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            jsonGenerator.writeNumberField("introduction", datingPurpose.introduction);
            jsonGenerator.writeNumberField("information", datingPurpose.information);
            jsonGenerator.writeNumberField("extension", datingPurpose.extension);
            jsonGenerator.writeNumberField("personality", datingPurpose.personality);
            jsonGenerator.writeNumberField("interest", datingPurpose.interest);
            jsonGenerator.writeNumberField("question", datingPurpose.question);
            jsonGenerator.writeNumberField("myrecent", datingPurpose.myrecent);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DatingPurpose) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DatingPurpose) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m35502a(Integer num) {
        return num;
    }

    public static DatingPurpose new_() {
        DatingPurpose datingPurpose = new DatingPurpose();
        datingPurpose.nullCheck();
        return datingPurpose;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DatingPurpose mo223809clone() {
        DatingPurpose datingPurpose = new DatingPurpose();
        List<Integer> list = this.picture;
        if (list != null) {
            datingPurpose.picture = ValueObject.util_map(list, new w9j() { // from class: l.x7c
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return DatingPurpose.m35502a((Integer) obj);
                }
            });
        }
        datingPurpose.introduction = this.introduction;
        datingPurpose.information = this.information;
        datingPurpose.extension = this.extension;
        datingPurpose.personality = this.personality;
        datingPurpose.interest = this.interest;
        datingPurpose.question = this.question;
        datingPurpose.myrecent = this.myrecent;
        return datingPurpose;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DatingPurpose)) {
            return false;
        }
        DatingPurpose datingPurpose = (DatingPurpose) obj;
        return ValueObject.util_equals(this.picture, datingPurpose.picture) && this.introduction == datingPurpose.introduction && this.information == datingPurpose.information && this.extension == datingPurpose.extension && this.personality == datingPurpose.personality && this.interest == datingPurpose.interest && this.question == datingPurpose.question && this.myrecent == datingPurpose.myrecent;
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
        List<Integer> list = this.picture;
        int iHashCode = ((((((((((((((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.introduction) * 41) + this.information) * 41) + this.extension) * 41) + this.personality) * 41) + this.interest) * 41) + this.question) * 41) + this.myrecent;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.picture == null) {
            this.picture = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
