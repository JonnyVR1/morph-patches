package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.NewDatingPurpose;
import com.p046p1.mobile.putong.data.LiveRegionTag;
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
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class NewDatingPurpose extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newdatingpurpose";

    @ProtobufIndex(index = 8)
    public int idealType;

    @ProtobufIndex(index = 5)
    public int information;

    @ProtobufIndex(index = 2)
    public int introduction;

    @ProtobufIndex(index = 6)
    public int livingHabit;

    @ProtobufIndex(index = 7)
    public int myAssets;

    @ProtobufIndex(index = 9)
    public int others;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Integer> picture;

    @NonNull
    @ProtobufIndex(index = 10)
    public String pictureExtendedText;

    @ProtobufIndex(index = 3)
    public int question;

    @ProtobufIndex(index = 4)
    public int socialPersonalityTest;
    public static ProtobufAdapter<NewDatingPurpose> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewDatingPurpose>() { // from class: com.p1.mobile.putong.core.data.NewDatingPurpose.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NewDatingPurpose newDatingPurpose) {
            List<Integer> list = newDatingPurpose.picture;
            int iM17230l = (list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.m17226h(2, newDatingPurpose.introduction) + CodedOutputByteBufferNano.m17226h(3, newDatingPurpose.question) + CodedOutputByteBufferNano.m17226h(4, newDatingPurpose.socialPersonalityTest) + CodedOutputByteBufferNano.m17226h(5, newDatingPurpose.information) + CodedOutputByteBufferNano.m17226h(6, newDatingPurpose.livingHabit) + CodedOutputByteBufferNano.m17226h(7, newDatingPurpose.myAssets) + CodedOutputByteBufferNano.m17226h(8, newDatingPurpose.idealType) + CodedOutputByteBufferNano.m17226h(9, newDatingPurpose.others);
            String str = newDatingPurpose.pictureExtendedText;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(10, str);
            }
            newDatingPurpose.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NewDatingPurpose parse(nb5 nb5Var) throws IOException {
            NewDatingPurpose newDatingPurpose = new NewDatingPurpose();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (newDatingPurpose.picture == null) {
                            newDatingPurpose.picture = new ArrayList();
                        }
                        if (newDatingPurpose.pictureExtendedText == null) {
                            newDatingPurpose.pictureExtendedText = "";
                        }
                        break;
                    case 10:
                        newDatingPurpose.picture = (List) nb5Var.m158743l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 16:
                        newDatingPurpose.introduction = nb5Var.m158741j();
                        continue;
                    case 24:
                        newDatingPurpose.question = nb5Var.m158741j();
                        continue;
                    case 32:
                        newDatingPurpose.socialPersonalityTest = nb5Var.m158741j();
                        continue;
                    case 40:
                        newDatingPurpose.information = nb5Var.m158741j();
                        continue;
                    case 48:
                        newDatingPurpose.livingHabit = nb5Var.m158741j();
                        continue;
                    case 56:
                        newDatingPurpose.myAssets = nb5Var.m158741j();
                        continue;
                    case 64:
                        newDatingPurpose.idealType = nb5Var.m158741j();
                        continue;
                    case 72:
                        newDatingPurpose.others = nb5Var.m158741j();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        newDatingPurpose.pictureExtendedText = nb5Var.m158750s();
                        continue;
                    default:
                        if (newDatingPurpose.picture == null) {
                            newDatingPurpose.picture = new ArrayList();
                        }
                        if (newDatingPurpose.pictureExtendedText == null) {
                            newDatingPurpose.pictureExtendedText = "";
                            return newDatingPurpose;
                        }
                        break;
                }
            }
            return newDatingPurpose;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NewDatingPurpose newDatingPurpose, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Integer> list = newDatingPurpose.picture;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(2, newDatingPurpose.introduction);
            codedOutputByteBufferNano.m17250G(3, newDatingPurpose.question);
            codedOutputByteBufferNano.m17250G(4, newDatingPurpose.socialPersonalityTest);
            codedOutputByteBufferNano.m17250G(5, newDatingPurpose.information);
            codedOutputByteBufferNano.m17250G(6, newDatingPurpose.livingHabit);
            codedOutputByteBufferNano.m17250G(7, newDatingPurpose.myAssets);
            codedOutputByteBufferNano.m17250G(8, newDatingPurpose.idealType);
            codedOutputByteBufferNano.m17250G(9, newDatingPurpose.others);
            String str = newDatingPurpose.pictureExtendedText;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(10, str);
            }
        }
    };
    public static JsonAdapter<NewDatingPurpose> JSON_ADAPTER = new ObjectJsonAdapter<NewDatingPurpose>() { // from class: com.p1.mobile.putong.core.data.NewDatingPurpose.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NewDatingPurpose.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NewDatingPurpose newInstance() {
            return new NewDatingPurpose();
        }

        public boolean parseField(NewDatingPurpose newDatingPurpose, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "myAssets":
                    newDatingPurpose.myAssets = jsonParser.getValueAsInt();
                    return true;
                case "question":
                    newDatingPurpose.question = jsonParser.getValueAsInt();
                    return true;
                case "others":
                    newDatingPurpose.others = jsonParser.getValueAsInt();
                    return true;
                case "pictureExtendedText":
                    newDatingPurpose.pictureExtendedText = jsonParser.getValueAsString();
                    return true;
                case "picture":
                    newDatingPurpose.picture = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "socialPersonalityTest":
                    newDatingPurpose.socialPersonalityTest = jsonParser.getValueAsInt();
                    return true;
                case "idealType":
                    newDatingPurpose.idealType = jsonParser.getValueAsInt();
                    return true;
                case "introduction":
                    newDatingPurpose.introduction = jsonParser.getValueAsInt();
                    return true;
                case "livingHabit":
                    newDatingPurpose.livingHabit = jsonParser.getValueAsInt();
                    return true;
                case "information":
                    newDatingPurpose.information = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NewDatingPurpose newDatingPurpose, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "myAssets":
                case "question":
                case "others":
                case "pictureExtendedText":
                case "picture":
                case "socialPersonalityTest":
                case "idealType":
                case "introduction":
                case "livingHabit":
                case "information":
                    return true;
                default:
                    return super.parseFieldCheck(newDatingPurpose, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NewDatingPurpose newDatingPurpose, JsonGenerator jsonGenerator) throws IOException {
            if (newDatingPurpose.picture != null) {
                jsonGenerator.writeFieldName("picture");
                JsonAdapter.serializeArray(newDatingPurpose.picture, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            jsonGenerator.writeNumberField("introduction", newDatingPurpose.introduction);
            jsonGenerator.writeNumberField("question", newDatingPurpose.question);
            jsonGenerator.writeNumberField("socialPersonalityTest", newDatingPurpose.socialPersonalityTest);
            jsonGenerator.writeNumberField("information", newDatingPurpose.information);
            jsonGenerator.writeNumberField("livingHabit", newDatingPurpose.livingHabit);
            jsonGenerator.writeNumberField("myAssets", newDatingPurpose.myAssets);
            jsonGenerator.writeNumberField("idealType", newDatingPurpose.idealType);
            jsonGenerator.writeNumberField(LiveRegionTag.others, newDatingPurpose.others);
            String str = newDatingPurpose.pictureExtendedText;
            if (str != null) {
                jsonGenerator.writeStringField("pictureExtendedText", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewDatingPurpose) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewDatingPurpose) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m35718a(Integer num) {
        return num;
    }

    public static NewDatingPurpose new_() {
        NewDatingPurpose newDatingPurpose = new NewDatingPurpose();
        newDatingPurpose.nullCheck();
        return newDatingPurpose;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NewDatingPurpose mo223809clone() {
        NewDatingPurpose newDatingPurpose = new NewDatingPurpose();
        List<Integer> list = this.picture;
        if (list != null) {
            newDatingPurpose.picture = ValueObject.util_map(list, new w9j() { // from class: l.em20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return NewDatingPurpose.m35718a((Integer) obj);
                }
            });
        }
        newDatingPurpose.introduction = this.introduction;
        newDatingPurpose.question = this.question;
        newDatingPurpose.socialPersonalityTest = this.socialPersonalityTest;
        newDatingPurpose.information = this.information;
        newDatingPurpose.livingHabit = this.livingHabit;
        newDatingPurpose.myAssets = this.myAssets;
        newDatingPurpose.idealType = this.idealType;
        newDatingPurpose.others = this.others;
        newDatingPurpose.pictureExtendedText = this.pictureExtendedText;
        return newDatingPurpose;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewDatingPurpose)) {
            return false;
        }
        NewDatingPurpose newDatingPurpose = (NewDatingPurpose) obj;
        return ValueObject.util_equals(this.picture, newDatingPurpose.picture) && this.introduction == newDatingPurpose.introduction && this.question == newDatingPurpose.question && this.socialPersonalityTest == newDatingPurpose.socialPersonalityTest && this.information == newDatingPurpose.information && this.livingHabit == newDatingPurpose.livingHabit && this.myAssets == newDatingPurpose.myAssets && this.idealType == newDatingPurpose.idealType && this.others == newDatingPurpose.others && ValueObject.util_equals(this.pictureExtendedText, newDatingPurpose.pictureExtendedText);
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
        int iHashCode = (((((((((((((((((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.introduction) * 41) + this.question) * 41) + this.socialPersonalityTest) * 41) + this.information) * 41) + this.livingHabit) * 41) + this.myAssets) * 41) + this.idealType) * 41) + this.others) * 41;
        String str = this.pictureExtendedText;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.picture == null) {
            this.picture = new ArrayList();
        }
        if (this.pictureExtendedText == null) {
            this.pictureExtendedText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
