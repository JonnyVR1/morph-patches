package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class FakeUserEnvironment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fakeuserenvironment";

    @ProtobufIndex(index = 1)
    public int female_fake_user_toast_limit;

    @ProtobufIndex(index = 3)
    public int female_good_user_toast_limit;

    @ProtobufIndex(index = 2)
    public int male_fake_user_toast_limit;

    @ProtobufIndex(index = 4)
    public int male_good_user_toast_limit;
    public static ProtobufAdapter<FakeUserEnvironment> PROTOBUF_ADAPTER = new MessageNanoAdapter<FakeUserEnvironment>() { // from class: com.p1.mobile.putong.core.data.FakeUserEnvironment.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FakeUserEnvironment fakeUserEnvironment) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, fakeUserEnvironment.female_fake_user_toast_limit) + CodedOutputByteBufferNano.m17226h(2, fakeUserEnvironment.male_fake_user_toast_limit) + CodedOutputByteBufferNano.m17226h(3, fakeUserEnvironment.female_good_user_toast_limit) + CodedOutputByteBufferNano.m17226h(4, fakeUserEnvironment.male_good_user_toast_limit);
            fakeUserEnvironment.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FakeUserEnvironment parse(nb5 nb5Var) throws IOException {
            FakeUserEnvironment fakeUserEnvironment = new FakeUserEnvironment();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    fakeUserEnvironment.female_fake_user_toast_limit = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    fakeUserEnvironment.male_fake_user_toast_limit = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    fakeUserEnvironment.female_good_user_toast_limit = nb5Var.m158741j();
                } else {
                    if (iM158752u != 32) {
                        return fakeUserEnvironment;
                    }
                    fakeUserEnvironment.male_good_user_toast_limit = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FakeUserEnvironment fakeUserEnvironment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, fakeUserEnvironment.female_fake_user_toast_limit);
            codedOutputByteBufferNano.m17250G(2, fakeUserEnvironment.male_fake_user_toast_limit);
            codedOutputByteBufferNano.m17250G(3, fakeUserEnvironment.female_good_user_toast_limit);
            codedOutputByteBufferNano.m17250G(4, fakeUserEnvironment.male_good_user_toast_limit);
        }
    };
    public static JsonAdapter<FakeUserEnvironment> JSON_ADAPTER = new ObjectJsonAdapter<FakeUserEnvironment>() { // from class: com.p1.mobile.putong.core.data.FakeUserEnvironment.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FakeUserEnvironment.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FakeUserEnvironment newInstance() {
            return new FakeUserEnvironment();
        }

        public boolean parseField(FakeUserEnvironment fakeUserEnvironment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "female_fake_user_toast_limit":
                    fakeUserEnvironment.female_fake_user_toast_limit = jsonParser.getValueAsInt();
                    return true;
                case "female_good_user_toast_limit":
                    fakeUserEnvironment.female_good_user_toast_limit = jsonParser.getValueAsInt();
                    return true;
                case "male_fake_user_toast_limit":
                    fakeUserEnvironment.male_fake_user_toast_limit = jsonParser.getValueAsInt();
                    return true;
                case "male_good_user_toast_limit":
                    fakeUserEnvironment.male_good_user_toast_limit = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FakeUserEnvironment fakeUserEnvironment, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "female_fake_user_toast_limit":
                case "female_good_user_toast_limit":
                case "male_fake_user_toast_limit":
                case "male_good_user_toast_limit":
                    return true;
                default:
                    return super.parseFieldCheck(fakeUserEnvironment, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FakeUserEnvironment fakeUserEnvironment, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("female_fake_user_toast_limit", fakeUserEnvironment.female_fake_user_toast_limit);
            jsonGenerator.writeNumberField("male_fake_user_toast_limit", fakeUserEnvironment.male_fake_user_toast_limit);
            jsonGenerator.writeNumberField("female_good_user_toast_limit", fakeUserEnvironment.female_good_user_toast_limit);
            jsonGenerator.writeNumberField("male_good_user_toast_limit", fakeUserEnvironment.male_good_user_toast_limit);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FakeUserEnvironment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FakeUserEnvironment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FakeUserEnvironment new_() {
        FakeUserEnvironment fakeUserEnvironment = new FakeUserEnvironment();
        fakeUserEnvironment.nullCheck();
        return fakeUserEnvironment;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FakeUserEnvironment mo223809clone() {
        FakeUserEnvironment fakeUserEnvironment = new FakeUserEnvironment();
        fakeUserEnvironment.female_fake_user_toast_limit = this.female_fake_user_toast_limit;
        fakeUserEnvironment.male_fake_user_toast_limit = this.male_fake_user_toast_limit;
        fakeUserEnvironment.female_good_user_toast_limit = this.female_good_user_toast_limit;
        fakeUserEnvironment.male_good_user_toast_limit = this.male_good_user_toast_limit;
        return fakeUserEnvironment;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FakeUserEnvironment)) {
            return false;
        }
        FakeUserEnvironment fakeUserEnvironment = (FakeUserEnvironment) obj;
        return this.female_fake_user_toast_limit == fakeUserEnvironment.female_fake_user_toast_limit && this.male_fake_user_toast_limit == fakeUserEnvironment.male_fake_user_toast_limit && this.female_good_user_toast_limit == fakeUserEnvironment.female_good_user_toast_limit && this.male_good_user_toast_limit == fakeUserEnvironment.male_good_user_toast_limit;
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
        int i2 = (((((((i * 41) + this.female_fake_user_toast_limit) * 41) + this.male_fake_user_toast_limit) * 41) + this.female_good_user_toast_limit) * 41) + this.male_good_user_toast_limit;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
