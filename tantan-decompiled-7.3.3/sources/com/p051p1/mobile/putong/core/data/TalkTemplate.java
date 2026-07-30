package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Gender;
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
public class TalkTemplate extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "talktemplate";

    @NonNull
    @ProtobufIndex(index = 3)
    public Gender gender;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21260id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String value;
    public static ProtobufAdapter<TalkTemplate> PROTOBUF_ADAPTER = new MessageNanoAdapter<TalkTemplate>() { // from class: com.p1.mobile.putong.core.data.TalkTemplate.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TalkTemplate talkTemplate) {
            String str = talkTemplate.f21260id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = talkTemplate.value;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            Gender gender = talkTemplate.gender;
            if (gender != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(3, gender.ordinal());
            }
            Gender gender2 = talkTemplate.gender;
            if (gender2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, gender2, Gender.PROTOBUF_ADAPTER);
            }
            talkTemplate.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TalkTemplate parse(nc5 nc5Var) throws IOException {
            TalkTemplate talkTemplate = new TalkTemplate();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (talkTemplate.gender == null && numValueOf != null) {
                        talkTemplate.gender = (Gender) Gender.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (talkTemplate.f21260id == null) {
                        talkTemplate.f21260id = "";
                    }
                    if (talkTemplate.value == null) {
                        talkTemplate.value = "";
                    }
                    if (talkTemplate.gender != null) {
                        break;
                    }
                    talkTemplate.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 10) {
                    talkTemplate.f21260id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    talkTemplate.value = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else {
                    if (iM162497u != 34) {
                        if (talkTemplate.gender == null && numValueOf != null) {
                            talkTemplate.gender = (Gender) Gender.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (talkTemplate.f21260id == null) {
                            talkTemplate.f21260id = "";
                        }
                        if (talkTemplate.value == null) {
                            talkTemplate.value = "";
                        }
                        if (talkTemplate.gender != null) {
                            break;
                        }
                        talkTemplate.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
                        return talkTemplate;
                    }
                    talkTemplate.gender = (Gender) nc5Var.m162488l(Gender.PROTOBUF_ADAPTER);
                }
            }
            return talkTemplate;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TalkTemplate talkTemplate, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = talkTemplate.f21260id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = talkTemplate.value;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            Gender gender = talkTemplate.gender;
            if (gender != null) {
                codedOutputByteBufferNano.m17305G(3, gender.ordinal());
            }
            Gender gender2 = talkTemplate.gender;
            if (gender2 != null) {
                codedOutputByteBufferNano.m17309K(4, gender2, Gender.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TalkTemplate> JSON_ADAPTER = new ObjectJsonAdapter<TalkTemplate>() { // from class: com.p1.mobile.putong.core.data.TalkTemplate.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TalkTemplate.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TalkTemplate newInstance() {
            return new TalkTemplate();
        }

        public boolean parseField(TalkTemplate talkTemplate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "gender":
                    talkTemplate.gender = Gender.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    talkTemplate.f21260id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TalkTemplate talkTemplate, JsonGenerator jsonGenerator) throws IOException {
            String str = talkTemplate.f21260id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TalkTemplate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TalkTemplate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TalkTemplate new_() {
        TalkTemplate talkTemplate = new TalkTemplate();
        talkTemplate.nullCheck();
        return talkTemplate;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TalkTemplate mo225055clone() {
        TalkTemplate talkTemplate = new TalkTemplate();
        talkTemplate.f21260id = this.f21260id;
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
        return ValueObject.util_equals(this.f21260id, talkTemplate.f21260id) && ValueObject.util_equals(this.value, talkTemplate.value) && ValueObject.util_equals(this.gender, talkTemplate.gender);
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
        String str = this.f21260id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        Gender gender = this.gender;
        int iHashCode3 = iHashCode2 + (gender != null ? gender.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21260id == null) {
            this.f21260id = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.gender == null) {
            this.gender = (Gender) Gender.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
