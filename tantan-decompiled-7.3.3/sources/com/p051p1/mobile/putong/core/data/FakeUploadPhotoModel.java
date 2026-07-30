package com.p051p1.mobile.putong.core.data;

import com.alibaba.fastjson.asm.Opcodes;
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
public class FakeUploadPhotoModel extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fakeuploadphotomodel";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @ProtobufIndex(index = 12)
    public int female_profile_count;

    @ProtobufIndex(index = 7)
    public int female_right_swipe_count;

    @ProtobufIndex(index = 6)
    public int female_swipe_count;

    @ProtobufIndex(index = 11)
    public int male_profile_count;

    @ProtobufIndex(index = 9)
    public int male_right_swipe_count;

    @ProtobufIndex(index = 8)
    public int male_swipe_count;

    @ProtobufIndex(index = 3)
    public int new_female_right_swipe_count;

    @ProtobufIndex(index = 2)
    public int new_female_swipe_count;

    @ProtobufIndex(index = 5)
    public int new_male_right_swipe_count;

    @ProtobufIndex(index = 4)
    public int new_male_swipe_count;

    @ProtobufIndex(index = 10)
    public int new_profile_count;
    public static ProtobufAdapter<FakeUploadPhotoModel> PROTOBUF_ADAPTER = new MessageNanoAdapter<FakeUploadPhotoModel>() { // from class: com.p1.mobile.putong.core.data.FakeUploadPhotoModel.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FakeUploadPhotoModel fakeUploadPhotoModel) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, fakeUploadPhotoModel.enable) + CodedOutputByteBufferNano.m17281h(2, fakeUploadPhotoModel.new_female_swipe_count) + CodedOutputByteBufferNano.m17281h(3, fakeUploadPhotoModel.new_female_right_swipe_count) + CodedOutputByteBufferNano.m17281h(4, fakeUploadPhotoModel.new_male_swipe_count) + CodedOutputByteBufferNano.m17281h(5, fakeUploadPhotoModel.new_male_right_swipe_count) + CodedOutputByteBufferNano.m17281h(6, fakeUploadPhotoModel.female_swipe_count) + CodedOutputByteBufferNano.m17281h(7, fakeUploadPhotoModel.female_right_swipe_count) + CodedOutputByteBufferNano.m17281h(8, fakeUploadPhotoModel.male_swipe_count) + CodedOutputByteBufferNano.m17281h(9, fakeUploadPhotoModel.male_right_swipe_count) + CodedOutputByteBufferNano.m17281h(10, fakeUploadPhotoModel.new_profile_count) + CodedOutputByteBufferNano.m17281h(11, fakeUploadPhotoModel.male_profile_count) + CodedOutputByteBufferNano.m17281h(12, fakeUploadPhotoModel.female_profile_count);
            fakeUploadPhotoModel.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FakeUploadPhotoModel parse(nc5 nc5Var) throws IOException {
            FakeUploadPhotoModel fakeUploadPhotoModel = new FakeUploadPhotoModel();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 8:
                        fakeUploadPhotoModel.enable = nc5Var.m162483g();
                        break;
                    case 16:
                        fakeUploadPhotoModel.new_female_swipe_count = nc5Var.m162486j();
                        break;
                    case 24:
                        fakeUploadPhotoModel.new_female_right_swipe_count = nc5Var.m162486j();
                        break;
                    case 32:
                        fakeUploadPhotoModel.new_male_swipe_count = nc5Var.m162486j();
                        break;
                    case 40:
                        fakeUploadPhotoModel.new_male_right_swipe_count = nc5Var.m162486j();
                        break;
                    case 48:
                        fakeUploadPhotoModel.female_swipe_count = nc5Var.m162486j();
                        break;
                    case 56:
                        fakeUploadPhotoModel.female_right_swipe_count = nc5Var.m162486j();
                        break;
                    case 64:
                        fakeUploadPhotoModel.male_swipe_count = nc5Var.m162486j();
                        break;
                    case 72:
                        fakeUploadPhotoModel.male_right_swipe_count = nc5Var.m162486j();
                        break;
                    case 80:
                        fakeUploadPhotoModel.new_profile_count = nc5Var.m162486j();
                        break;
                    case 88:
                        fakeUploadPhotoModel.male_profile_count = nc5Var.m162486j();
                        break;
                    case Opcodes.IADD /* 96 */:
                        fakeUploadPhotoModel.female_profile_count = nc5Var.m162486j();
                        break;
                    default:
                        return fakeUploadPhotoModel;
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FakeUploadPhotoModel fakeUploadPhotoModel, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, fakeUploadPhotoModel.enable);
            codedOutputByteBufferNano.m17305G(2, fakeUploadPhotoModel.new_female_swipe_count);
            codedOutputByteBufferNano.m17305G(3, fakeUploadPhotoModel.new_female_right_swipe_count);
            codedOutputByteBufferNano.m17305G(4, fakeUploadPhotoModel.new_male_swipe_count);
            codedOutputByteBufferNano.m17305G(5, fakeUploadPhotoModel.new_male_right_swipe_count);
            codedOutputByteBufferNano.m17305G(6, fakeUploadPhotoModel.female_swipe_count);
            codedOutputByteBufferNano.m17305G(7, fakeUploadPhotoModel.female_right_swipe_count);
            codedOutputByteBufferNano.m17305G(8, fakeUploadPhotoModel.male_swipe_count);
            codedOutputByteBufferNano.m17305G(9, fakeUploadPhotoModel.male_right_swipe_count);
            codedOutputByteBufferNano.m17305G(10, fakeUploadPhotoModel.new_profile_count);
            codedOutputByteBufferNano.m17305G(11, fakeUploadPhotoModel.male_profile_count);
            codedOutputByteBufferNano.m17305G(12, fakeUploadPhotoModel.female_profile_count);
        }
    };
    public static JsonAdapter<FakeUploadPhotoModel> JSON_ADAPTER = new ObjectJsonAdapter<FakeUploadPhotoModel>() { // from class: com.p1.mobile.putong.core.data.FakeUploadPhotoModel.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FakeUploadPhotoModel.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FakeUploadPhotoModel newInstance() {
            return new FakeUploadPhotoModel();
        }

        public boolean parseField(FakeUploadPhotoModel fakeUploadPhotoModel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "male_profile_count":
                    fakeUploadPhotoModel.male_profile_count = jsonParser.getValueAsInt();
                    return true;
                case "new_male_swipe_count":
                    fakeUploadPhotoModel.new_male_swipe_count = jsonParser.getValueAsInt();
                    return true;
                case "male_swipe_count":
                    fakeUploadPhotoModel.male_swipe_count = jsonParser.getValueAsInt();
                    return true;
                case "enable":
                    fakeUploadPhotoModel.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "female_swipe_count":
                    fakeUploadPhotoModel.female_swipe_count = jsonParser.getValueAsInt();
                    return true;
                case "female_profile_count":
                    fakeUploadPhotoModel.female_profile_count = jsonParser.getValueAsInt();
                    return true;
                case "new_male_right_swipe_count":
                    fakeUploadPhotoModel.new_male_right_swipe_count = jsonParser.getValueAsInt();
                    return true;
                case "female_right_swipe_count":
                    fakeUploadPhotoModel.female_right_swipe_count = jsonParser.getValueAsInt();
                    return true;
                case "new_female_right_swipe_count":
                    fakeUploadPhotoModel.new_female_right_swipe_count = jsonParser.getValueAsInt();
                    return true;
                case "new_profile_count":
                    fakeUploadPhotoModel.new_profile_count = jsonParser.getValueAsInt();
                    return true;
                case "male_right_swipe_count":
                    fakeUploadPhotoModel.male_right_swipe_count = jsonParser.getValueAsInt();
                    return true;
                case "new_female_swipe_count":
                    fakeUploadPhotoModel.new_female_swipe_count = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FakeUploadPhotoModel fakeUploadPhotoModel, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "male_profile_count":
                case "new_male_swipe_count":
                case "male_swipe_count":
                case "enable":
                case "female_swipe_count":
                case "female_profile_count":
                case "new_male_right_swipe_count":
                case "female_right_swipe_count":
                case "new_female_right_swipe_count":
                case "new_profile_count":
                case "male_right_swipe_count":
                case "new_female_swipe_count":
                    return true;
                default:
                    return super.parseFieldCheck(fakeUploadPhotoModel, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FakeUploadPhotoModel fakeUploadPhotoModel, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", fakeUploadPhotoModel.enable);
            jsonGenerator.writeNumberField("new_female_swipe_count", fakeUploadPhotoModel.new_female_swipe_count);
            jsonGenerator.writeNumberField("new_female_right_swipe_count", fakeUploadPhotoModel.new_female_right_swipe_count);
            jsonGenerator.writeNumberField("new_male_swipe_count", fakeUploadPhotoModel.new_male_swipe_count);
            jsonGenerator.writeNumberField("new_male_right_swipe_count", fakeUploadPhotoModel.new_male_right_swipe_count);
            jsonGenerator.writeNumberField("female_swipe_count", fakeUploadPhotoModel.female_swipe_count);
            jsonGenerator.writeNumberField("female_right_swipe_count", fakeUploadPhotoModel.female_right_swipe_count);
            jsonGenerator.writeNumberField("male_swipe_count", fakeUploadPhotoModel.male_swipe_count);
            jsonGenerator.writeNumberField("male_right_swipe_count", fakeUploadPhotoModel.male_right_swipe_count);
            jsonGenerator.writeNumberField("new_profile_count", fakeUploadPhotoModel.new_profile_count);
            jsonGenerator.writeNumberField("male_profile_count", fakeUploadPhotoModel.male_profile_count);
            jsonGenerator.writeNumberField("female_profile_count", fakeUploadPhotoModel.female_profile_count);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FakeUploadPhotoModel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FakeUploadPhotoModel) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FakeUploadPhotoModel new_() {
        FakeUploadPhotoModel fakeUploadPhotoModel = new FakeUploadPhotoModel();
        fakeUploadPhotoModel.nullCheck();
        return fakeUploadPhotoModel;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FakeUploadPhotoModel mo225055clone() {
        FakeUploadPhotoModel fakeUploadPhotoModel = new FakeUploadPhotoModel();
        fakeUploadPhotoModel.enable = this.enable;
        fakeUploadPhotoModel.new_female_swipe_count = this.new_female_swipe_count;
        fakeUploadPhotoModel.new_female_right_swipe_count = this.new_female_right_swipe_count;
        fakeUploadPhotoModel.new_male_swipe_count = this.new_male_swipe_count;
        fakeUploadPhotoModel.new_male_right_swipe_count = this.new_male_right_swipe_count;
        fakeUploadPhotoModel.female_swipe_count = this.female_swipe_count;
        fakeUploadPhotoModel.female_right_swipe_count = this.female_right_swipe_count;
        fakeUploadPhotoModel.male_swipe_count = this.male_swipe_count;
        fakeUploadPhotoModel.male_right_swipe_count = this.male_right_swipe_count;
        fakeUploadPhotoModel.new_profile_count = this.new_profile_count;
        fakeUploadPhotoModel.male_profile_count = this.male_profile_count;
        fakeUploadPhotoModel.female_profile_count = this.female_profile_count;
        return fakeUploadPhotoModel;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FakeUploadPhotoModel)) {
            return false;
        }
        FakeUploadPhotoModel fakeUploadPhotoModel = (FakeUploadPhotoModel) obj;
        return this.enable == fakeUploadPhotoModel.enable && this.new_female_swipe_count == fakeUploadPhotoModel.new_female_swipe_count && this.new_female_right_swipe_count == fakeUploadPhotoModel.new_female_right_swipe_count && this.new_male_swipe_count == fakeUploadPhotoModel.new_male_swipe_count && this.new_male_right_swipe_count == fakeUploadPhotoModel.new_male_right_swipe_count && this.female_swipe_count == fakeUploadPhotoModel.female_swipe_count && this.female_right_swipe_count == fakeUploadPhotoModel.female_right_swipe_count && this.male_swipe_count == fakeUploadPhotoModel.male_swipe_count && this.male_right_swipe_count == fakeUploadPhotoModel.male_right_swipe_count && this.new_profile_count == fakeUploadPhotoModel.new_profile_count && this.male_profile_count == fakeUploadPhotoModel.male_profile_count && this.female_profile_count == fakeUploadPhotoModel.female_profile_count;
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
        int i2 = (((((((((((((((((((((((i * 41) + (this.enable ? 1231 : 1237)) * 41) + this.new_female_swipe_count) * 41) + this.new_female_right_swipe_count) * 41) + this.new_male_swipe_count) * 41) + this.new_male_right_swipe_count) * 41) + this.female_swipe_count) * 41) + this.female_right_swipe_count) * 41) + this.male_swipe_count) * 41) + this.male_right_swipe_count) * 41) + this.new_profile_count) * 41) + this.male_profile_count) * 41) + this.female_profile_count;
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
