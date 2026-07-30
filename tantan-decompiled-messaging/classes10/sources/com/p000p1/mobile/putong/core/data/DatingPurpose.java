package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.DatingPurpose;
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
public class DatingPurpose extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "datingpurpose";

    @ProtobufIndex(index = 4)
    public int extension;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int information;

    @ProtobufIndex(index = 6)
    public int interest;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int introduction;

    @ProtobufIndex(index = 8)
    public int myrecent;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int personality;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Integer> picture;

    @ProtobufIndex(index = 7)
    public int question;
    public static ProtobufAdapter<DatingPurpose> PROTOBUF_ADAPTER = new MessageNanoAdapter<DatingPurpose>() { // from class: com.p1.mobile.putong.core.data.DatingPurpose.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DatingPurpose datingPurpose) {
            List<Integer> list = datingPurpose.picture;
            int iL = (list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.h(2, datingPurpose.introduction) + CodedOutputByteBufferNano.h(3, datingPurpose.information) + CodedOutputByteBufferNano.h(4, datingPurpose.extension) + CodedOutputByteBufferNano.h(5, datingPurpose.personality) + CodedOutputByteBufferNano.h(6, datingPurpose.interest) + CodedOutputByteBufferNano.h(7, datingPurpose.question) + CodedOutputByteBufferNano.h(8, datingPurpose.myrecent);
            ((MessageNano) datingPurpose).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DatingPurpose m12583parse(nb5 nb5Var) throws IOException {
            DatingPurpose datingPurpose = new DatingPurpose();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (datingPurpose.picture != null) {
                        break;
                    }
                    datingPurpose.picture = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    datingPurpose.picture = (List) nb5Var.l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 16) {
                    datingPurpose.introduction = nb5Var.j();
                } else if (iU == 24) {
                    datingPurpose.information = nb5Var.j();
                } else if (iU == 32) {
                    datingPurpose.extension = nb5Var.j();
                } else if (iU == 40) {
                    datingPurpose.personality = nb5Var.j();
                } else if (iU == 48) {
                    datingPurpose.interest = nb5Var.j();
                } else if (iU == 56) {
                    datingPurpose.question = nb5Var.j();
                } else {
                    if (iU != 64) {
                        if (datingPurpose.picture != null) {
                            break;
                        }
                        datingPurpose.picture = new ArrayList();
                        return datingPurpose;
                    }
                    datingPurpose.myrecent = nb5Var.j();
                }
            }
            return datingPurpose;
        }

        public void serialize(DatingPurpose datingPurpose, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Integer> list = datingPurpose.picture;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(2, datingPurpose.introduction);
            codedOutputByteBufferNano.G(3, datingPurpose.information);
            codedOutputByteBufferNano.G(4, datingPurpose.extension);
            codedOutputByteBufferNano.G(5, datingPurpose.personality);
            codedOutputByteBufferNano.G(6, datingPurpose.interest);
            codedOutputByteBufferNano.G(7, datingPurpose.question);
            codedOutputByteBufferNano.G(8, datingPurpose.myrecent);
        }
    };
    public static JsonAdapter<DatingPurpose> JSON_ADAPTER = new ObjectJsonAdapter<DatingPurpose>() { // from class: com.p1.mobile.putong.core.data.DatingPurpose.2
        public Class getDataClass() {
            return DatingPurpose.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public DatingPurpose m12584newInstance() {
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

        public void serializeFields(DatingPurpose datingPurpose, JsonGenerator jsonGenerator) throws IOException {
            if (datingPurpose.picture != null) {
                jsonGenerator.writeFieldName("picture");
                JsonAdapter.serializeArray(datingPurpose.picture, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
            jsonGenerator.writeNumberField(ProfileLikeCategoryType.introduction, datingPurpose.introduction);
            jsonGenerator.writeNumberField("information", datingPurpose.information);
            jsonGenerator.writeNumberField("extension", datingPurpose.extension);
            jsonGenerator.writeNumberField(ProfileLikeCategoryType.personality, datingPurpose.personality);
            jsonGenerator.writeNumberField(ProfileLikeModuleType.interest, datingPurpose.interest);
            jsonGenerator.writeNumberField("question", datingPurpose.question);
            jsonGenerator.writeNumberField("myrecent", datingPurpose.myrecent);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DatingPurpose) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DatingPurpose) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m304a(Integer num) {
        return num;
    }

    public static DatingPurpose new_() {
        DatingPurpose datingPurpose = new DatingPurpose();
        datingPurpose.nullCheck();
        return datingPurpose;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DatingPurpose m12582clone() {
        DatingPurpose datingPurpose = new DatingPurpose();
        List<Integer> list = this.picture;
        if (list != null) {
            datingPurpose.picture = ValueObject.util_map(list, new w9j() { // from class: l.x7c
                public final Object call(Object obj) {
                    return DatingPurpose.m304a((Integer) obj);
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
        int iHashCode = ((((((((((((((i2 + (list != null ? list.hashCode() : 0)) * 41) + this.introduction) * 41) + this.information) * 41) + this.extension) * 41) + this.personality) * 41) + this.interest) * 41) + this.question) * 41) + this.myrecent;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.picture == null) {
            this.picture = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
