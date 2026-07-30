package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.NewDatingPurpose;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class NewDatingPurpose extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newdatingpurpose";

    @ProtobufIndex(index = 8)
    public int idealType;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int information;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
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
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public String pictureExtendedText;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int question;

    @ProtobufIndex(index = 4)
    public int socialPersonalityTest;
    public static ProtobufAdapter<NewDatingPurpose> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewDatingPurpose>() { // from class: com.p1.mobile.putong.core.data.NewDatingPurpose.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NewDatingPurpose newDatingPurpose) {
            List<Integer> list = newDatingPurpose.picture;
            int iL = (list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.h(2, newDatingPurpose.introduction) + CodedOutputByteBufferNano.h(3, newDatingPurpose.question) + CodedOutputByteBufferNano.h(4, newDatingPurpose.socialPersonalityTest) + CodedOutputByteBufferNano.h(5, newDatingPurpose.information) + CodedOutputByteBufferNano.h(6, newDatingPurpose.livingHabit) + CodedOutputByteBufferNano.h(7, newDatingPurpose.myAssets) + CodedOutputByteBufferNano.h(8, newDatingPurpose.idealType) + CodedOutputByteBufferNano.h(9, newDatingPurpose.others);
            String str = newDatingPurpose.pictureExtendedText;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(10, str);
            }
            ((MessageNano) newDatingPurpose).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NewDatingPurpose m14503parse(nb5 nb5Var) throws IOException {
            NewDatingPurpose newDatingPurpose = new NewDatingPurpose();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (newDatingPurpose.picture == null) {
                            newDatingPurpose.picture = new ArrayList();
                        }
                        if (newDatingPurpose.pictureExtendedText == null) {
                            newDatingPurpose.pictureExtendedText = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        newDatingPurpose.picture = (List) nb5Var.l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 16:
                        newDatingPurpose.introduction = nb5Var.j();
                        continue;
                    case 24:
                        newDatingPurpose.question = nb5Var.j();
                        continue;
                    case 32:
                        newDatingPurpose.socialPersonalityTest = nb5Var.j();
                        continue;
                    case 40:
                        newDatingPurpose.information = nb5Var.j();
                        continue;
                    case 48:
                        newDatingPurpose.livingHabit = nb5Var.j();
                        continue;
                    case 56:
                        newDatingPurpose.myAssets = nb5Var.j();
                        continue;
                    case 64:
                        newDatingPurpose.idealType = nb5Var.j();
                        continue;
                    case 72:
                        newDatingPurpose.others = nb5Var.j();
                        continue;
                    case 82:
                        newDatingPurpose.pictureExtendedText = nb5Var.s();
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

        public void serialize(NewDatingPurpose newDatingPurpose, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Integer> list = newDatingPurpose.picture;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(2, newDatingPurpose.introduction);
            codedOutputByteBufferNano.G(3, newDatingPurpose.question);
            codedOutputByteBufferNano.G(4, newDatingPurpose.socialPersonalityTest);
            codedOutputByteBufferNano.G(5, newDatingPurpose.information);
            codedOutputByteBufferNano.G(6, newDatingPurpose.livingHabit);
            codedOutputByteBufferNano.G(7, newDatingPurpose.myAssets);
            codedOutputByteBufferNano.G(8, newDatingPurpose.idealType);
            codedOutputByteBufferNano.G(9, newDatingPurpose.others);
            String str = newDatingPurpose.pictureExtendedText;
            if (str != null) {
                codedOutputByteBufferNano.R(10, str);
            }
        }
    };
    public static JsonAdapter<NewDatingPurpose> JSON_ADAPTER = new ObjectJsonAdapter<NewDatingPurpose>() { // from class: com.p1.mobile.putong.core.data.NewDatingPurpose.2
        public Class getDataClass() {
            return NewDatingPurpose.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NewDatingPurpose m14504newInstance() {
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

        public void serializeFields(NewDatingPurpose newDatingPurpose, JsonGenerator jsonGenerator) throws IOException {
            if (newDatingPurpose.picture != null) {
                jsonGenerator.writeFieldName("picture");
                JsonAdapter.serializeArray(newDatingPurpose.picture, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            jsonGenerator.writeNumberField(ProfileLikeCategoryType.introduction, newDatingPurpose.introduction);
            jsonGenerator.writeNumberField("question", newDatingPurpose.question);
            jsonGenerator.writeNumberField("socialPersonalityTest", newDatingPurpose.socialPersonalityTest);
            jsonGenerator.writeNumberField("information", newDatingPurpose.information);
            jsonGenerator.writeNumberField("livingHabit", newDatingPurpose.livingHabit);
            jsonGenerator.writeNumberField("myAssets", newDatingPurpose.myAssets);
            jsonGenerator.writeNumberField("idealType", newDatingPurpose.idealType);
            jsonGenerator.writeNumberField("others", newDatingPurpose.others);
            String str = newDatingPurpose.pictureExtendedText;
            if (str != null) {
                jsonGenerator.writeStringField("pictureExtendedText", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewDatingPurpose) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewDatingPurpose) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m520a(Integer num) {
        return num;
    }

    public static NewDatingPurpose new_() {
        NewDatingPurpose newDatingPurpose = new NewDatingPurpose();
        newDatingPurpose.nullCheck();
        return newDatingPurpose;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NewDatingPurpose m14502clone() {
        NewDatingPurpose newDatingPurpose = new NewDatingPurpose();
        List<Integer> list = this.picture;
        if (list != null) {
            newDatingPurpose.picture = ValueObject.util_map(list, new w9j() { // from class: l.em20
                public final Object call(Object obj) {
                    return NewDatingPurpose.m520a((Integer) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<Integer> list = this.picture;
        int iHashCode = (((((((((((((((((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.introduction) * 41) + this.question) * 41) + this.socialPersonalityTest) * 41) + this.information) * 41) + this.livingHabit) * 41) + this.myAssets) * 41) + this.idealType) * 41) + this.others) * 41;
        String str = this.pictureExtendedText;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.picture == null) {
            this.picture = new ArrayList();
        }
        if (this.pictureExtendedText == null) {
            this.pictureExtendedText = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
