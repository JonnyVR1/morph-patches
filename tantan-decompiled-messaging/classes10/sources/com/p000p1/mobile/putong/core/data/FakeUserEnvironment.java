package com.p000p1.mobile.putong.core.data;

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
public class FakeUserEnvironment extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fakeuserenvironment";

    @ProtobufIndex(index = 1)
    public int female_fake_user_toast_limit;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int female_good_user_toast_limit;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int male_fake_user_toast_limit;

    @ProtobufIndex(index = 4)
    public int male_good_user_toast_limit;
    public static ProtobufAdapter<FakeUserEnvironment> PROTOBUF_ADAPTER = new MessageNanoAdapter<FakeUserEnvironment>() { // from class: com.p1.mobile.putong.core.data.FakeUserEnvironment.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FakeUserEnvironment fakeUserEnvironment) {
            int iH = CodedOutputByteBufferNano.h(1, fakeUserEnvironment.female_fake_user_toast_limit) + CodedOutputByteBufferNano.h(2, fakeUserEnvironment.male_fake_user_toast_limit) + CodedOutputByteBufferNano.h(3, fakeUserEnvironment.female_good_user_toast_limit) + CodedOutputByteBufferNano.h(4, fakeUserEnvironment.male_good_user_toast_limit);
            ((MessageNano) fakeUserEnvironment).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FakeUserEnvironment m12737parse(nb5 nb5Var) throws IOException {
            FakeUserEnvironment fakeUserEnvironment = new FakeUserEnvironment();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    fakeUserEnvironment.female_fake_user_toast_limit = nb5Var.j();
                } else if (iU == 16) {
                    fakeUserEnvironment.male_fake_user_toast_limit = nb5Var.j();
                } else if (iU == 24) {
                    fakeUserEnvironment.female_good_user_toast_limit = nb5Var.j();
                } else {
                    if (iU != 32) {
                        return fakeUserEnvironment;
                    }
                    fakeUserEnvironment.male_good_user_toast_limit = nb5Var.j();
                }
            }
        }

        public void serialize(FakeUserEnvironment fakeUserEnvironment, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, fakeUserEnvironment.female_fake_user_toast_limit);
            codedOutputByteBufferNano.G(2, fakeUserEnvironment.male_fake_user_toast_limit);
            codedOutputByteBufferNano.G(3, fakeUserEnvironment.female_good_user_toast_limit);
            codedOutputByteBufferNano.G(4, fakeUserEnvironment.male_good_user_toast_limit);
        }
    };
    public static JsonAdapter<FakeUserEnvironment> JSON_ADAPTER = new ObjectJsonAdapter<FakeUserEnvironment>() { // from class: com.p1.mobile.putong.core.data.FakeUserEnvironment.2
        public Class getDataClass() {
            return FakeUserEnvironment.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FakeUserEnvironment m12738newInstance() {
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

        public void serializeFields(FakeUserEnvironment fakeUserEnvironment, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("female_fake_user_toast_limit", fakeUserEnvironment.female_fake_user_toast_limit);
            jsonGenerator.writeNumberField("male_fake_user_toast_limit", fakeUserEnvironment.male_fake_user_toast_limit);
            jsonGenerator.writeNumberField("female_good_user_toast_limit", fakeUserEnvironment.female_good_user_toast_limit);
            jsonGenerator.writeNumberField("male_good_user_toast_limit", fakeUserEnvironment.male_good_user_toast_limit);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FakeUserEnvironment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FakeUserEnvironment) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FakeUserEnvironment new_() {
        FakeUserEnvironment fakeUserEnvironment = new FakeUserEnvironment();
        fakeUserEnvironment.nullCheck();
        return fakeUserEnvironment;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FakeUserEnvironment m12736clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((i * 41) + this.female_fake_user_toast_limit) * 41) + this.male_fake_user_toast_limit) * 41) + this.female_good_user_toast_limit) * 41) + this.male_good_user_toast_limit;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
