package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Gender;
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
public class TalkTemplate extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "talktemplate";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public Gender gender;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f180id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String value;
    public static ProtobufAdapter<TalkTemplate> PROTOBUF_ADAPTER = new MessageNanoAdapter<TalkTemplate>() { // from class: com.p1.mobile.putong.core.data.TalkTemplate.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TalkTemplate talkTemplate) {
            String str = talkTemplate.f180id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = talkTemplate.value;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            Gender gender = talkTemplate.gender;
            if (gender != null) {
                iO += CodedOutputByteBufferNano.h(3, gender.ordinal());
            }
            Gender gender2 = talkTemplate.gender;
            if (gender2 != null) {
                iO += CodedOutputByteBufferNano.l(4, gender2, Gender.PROTOBUF_ADAPTER);
            }
            ((MessageNano) talkTemplate).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TalkTemplate m15926parse(nb5 nb5Var) throws IOException {
            TalkTemplate talkTemplate = new TalkTemplate();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (talkTemplate.gender == null && numValueOf != null) {
                        talkTemplate.gender = Gender.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (talkTemplate.f180id == null) {
                        talkTemplate.f180id = "";
                    }
                    if (talkTemplate.value == null) {
                        talkTemplate.value = "";
                    }
                    if (talkTemplate.gender != null) {
                        break;
                    }
                    talkTemplate.gender = Gender.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    talkTemplate.f180id = nb5Var.s();
                } else if (iU == 18) {
                    talkTemplate.value = nb5Var.s();
                } else if (iU == 24) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else {
                    if (iU != 34) {
                        if (talkTemplate.gender == null && numValueOf != null) {
                            talkTemplate.gender = Gender.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (talkTemplate.f180id == null) {
                            talkTemplate.f180id = "";
                        }
                        if (talkTemplate.value == null) {
                            talkTemplate.value = "";
                        }
                        if (talkTemplate.gender != null) {
                            break;
                        }
                        talkTemplate.gender = Gender.JSON_ADAPTER.defaultEnum();
                        return talkTemplate;
                    }
                    talkTemplate.gender = (Gender) nb5Var.l(Gender.PROTOBUF_ADAPTER);
                }
            }
            return talkTemplate;
        }

        public void serialize(TalkTemplate talkTemplate, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = talkTemplate.f180id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = talkTemplate.value;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            Gender gender = talkTemplate.gender;
            if (gender != null) {
                codedOutputByteBufferNano.G(3, gender.ordinal());
            }
            Gender gender2 = talkTemplate.gender;
            if (gender2 != null) {
                codedOutputByteBufferNano.K(4, gender2, Gender.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TalkTemplate> JSON_ADAPTER = new ObjectJsonAdapter<TalkTemplate>() { // from class: com.p1.mobile.putong.core.data.TalkTemplate.2
        public Class getDataClass() {
            return TalkTemplate.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TalkTemplate m15927newInstance() {
            return new TalkTemplate();
        }

        public boolean parseField(TalkTemplate talkTemplate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gender":
                    talkTemplate.gender = (Gender) Gender.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    talkTemplate.f180id = jsonParser.getValueAsString();
                    return false;
                case "value":
                    talkTemplate.value = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TalkTemplate talkTemplate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "gender":
                    return true;
                case "id":
                    return false;
                case "value":
                    return true;
                default:
                    return super.parseFieldCheck(talkTemplate, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(TalkTemplate talkTemplate, JsonGenerator jsonGenerator) throws IOException {
            String str = talkTemplate.f180id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = talkTemplate.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
            if (talkTemplate.gender != null) {
                jsonGenerator.writeFieldName("gender");
                Gender.JSON_ADAPTER.serialize(talkTemplate.gender, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TalkTemplate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TalkTemplate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TalkTemplate new_() {
        TalkTemplate talkTemplate = new TalkTemplate();
        talkTemplate.nullCheck();
        return talkTemplate;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TalkTemplate m15925clone() {
        TalkTemplate talkTemplate = new TalkTemplate();
        talkTemplate.f180id = this.f180id;
        talkTemplate.value = this.value;
        talkTemplate.gender = this.gender;
        return talkTemplate;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TalkTemplate)) {
            return false;
        }
        TalkTemplate talkTemplate = (TalkTemplate) obj;
        return ValueObject.util_equals(this.f180id, talkTemplate.f180id) && ValueObject.util_equals(this.value, talkTemplate.value) && ValueObject.util_equals(this.gender, talkTemplate.gender);
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
        String str = this.f180id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        Gender gender = this.gender;
        int iHashCode3 = iHashCode2 + (gender != null ? gender.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f180id == null) {
            this.f180id = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.gender == null) {
            this.gender = Gender.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
