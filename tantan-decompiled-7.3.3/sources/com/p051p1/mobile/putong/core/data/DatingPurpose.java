package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.DatingPurpose;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

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
            int iM17285l = (list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.m17281h(2, datingPurpose.introduction) + CodedOutputByteBufferNano.m17281h(3, datingPurpose.information) + CodedOutputByteBufferNano.m17281h(4, datingPurpose.extension) + CodedOutputByteBufferNano.m17281h(5, datingPurpose.personality) + CodedOutputByteBufferNano.m17281h(6, datingPurpose.interest) + CodedOutputByteBufferNano.m17281h(7, datingPurpose.question) + CodedOutputByteBufferNano.m17281h(8, datingPurpose.myrecent);
            datingPurpose.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DatingPurpose parse(nc5 nc5Var) throws IOException {
            DatingPurpose datingPurpose = new DatingPurpose();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (datingPurpose.picture != null) {
                        break;
                    }
                    datingPurpose.picture = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    datingPurpose.picture = (List) nc5Var.m162488l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 16) {
                    datingPurpose.introduction = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    datingPurpose.information = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    datingPurpose.extension = nc5Var.m162486j();
                } else if (iM162497u == 40) {
                    datingPurpose.personality = nc5Var.m162486j();
                } else if (iM162497u == 48) {
                    datingPurpose.interest = nc5Var.m162486j();
                } else if (iM162497u == 56) {
                    datingPurpose.question = nc5Var.m162486j();
                } else {
                    if (iM162497u != 64) {
                        if (datingPurpose.picture != null) {
                            break;
                        }
                        datingPurpose.picture = new ArrayList();
                        return datingPurpose;
                    }
                    datingPurpose.myrecent = nc5Var.m162486j();
                }
            }
            return datingPurpose;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DatingPurpose datingPurpose, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Integer> list = datingPurpose.picture;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(2, datingPurpose.introduction);
            codedOutputByteBufferNano.m17305G(3, datingPurpose.information);
            codedOutputByteBufferNano.m17305G(4, datingPurpose.extension);
            codedOutputByteBufferNano.m17305G(5, datingPurpose.personality);
            codedOutputByteBufferNano.m17305G(6, datingPurpose.interest);
            codedOutputByteBufferNano.m17305G(7, datingPurpose.question);
            codedOutputByteBufferNano.m17305G(8, datingPurpose.myrecent);
        }
    };
    public static JsonAdapter<DatingPurpose> JSON_ADAPTER = new ObjectJsonAdapter<DatingPurpose>() { // from class: com.p1.mobile.putong.core.data.DatingPurpose.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DatingPurpose.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DatingPurpose) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DatingPurpose) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m36505a(Integer num) {
        return num;
    }

    public static DatingPurpose new_() {
        DatingPurpose datingPurpose = new DatingPurpose();
        datingPurpose.nullCheck();
        return datingPurpose;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DatingPurpose mo225055clone() {
        DatingPurpose datingPurpose = new DatingPurpose();
        List<Integer> list = this.picture;
        if (list != null) {
            datingPurpose.picture = ValueObject.util_map(list, new qcj() { // from class: l.d9c
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return DatingPurpose.m36505a((Integer) obj);
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
