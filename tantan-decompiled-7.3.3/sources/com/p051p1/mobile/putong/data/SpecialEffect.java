package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes12.dex */
public class SpecialEffect extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "specialeffect";

    @NonNull
    @ProtobufIndex(index = 2)
    public String content;

    @NonNull
    @ProtobufIndex(index = 4)
    public String deepLink;

    @ProtobufIndex(index = 3)
    public long expireTime;

    @NonNull
    @ProtobufIndex(index = 5)
    public String style;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<SpecialEffect> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpecialEffect>() { // from class: com.p1.mobile.putong.data.SpecialEffect.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SpecialEffect specialEffect) {
            String str = specialEffect.type;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = specialEffect.content;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17283j = iM17288o + CodedOutputByteBufferNano.m17283j(3, specialEffect.expireTime);
            String str3 = specialEffect.deepLink;
            if (str3 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = specialEffect.style;
            if (str4 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            specialEffect.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SpecialEffect parse(nc5 nc5Var) throws IOException {
            SpecialEffect specialEffect = new SpecialEffect();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (specialEffect.type == null) {
                        specialEffect.type = "";
                    }
                    if (specialEffect.content == null) {
                        specialEffect.content = "";
                    }
                    if (specialEffect.deepLink == null) {
                        specialEffect.deepLink = "";
                    }
                    if (specialEffect.style != null) {
                        break;
                    }
                    specialEffect.style = "";
                    break;
                }
                if (iM162497u == 10) {
                    specialEffect.type = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    specialEffect.content = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    specialEffect.expireTime = nc5Var.m162487k();
                } else if (iM162497u == 34) {
                    specialEffect.deepLink = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
                        if (specialEffect.type == null) {
                            specialEffect.type = "";
                        }
                        if (specialEffect.content == null) {
                            specialEffect.content = "";
                        }
                        if (specialEffect.deepLink == null) {
                            specialEffect.deepLink = "";
                        }
                        if (specialEffect.style != null) {
                            break;
                        }
                        specialEffect.style = "";
                        return specialEffect;
                    }
                    specialEffect.style = nc5Var.m162495s();
                }
            }
            return specialEffect;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SpecialEffect specialEffect, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = specialEffect.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = specialEffect.content;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17307I(3, specialEffect.expireTime);
            String str3 = specialEffect.deepLink;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = specialEffect.style;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
        }
    };
    public static JsonAdapter<SpecialEffect> JSON_ADAPTER = new ObjectJsonAdapter<SpecialEffect>() { // from class: com.p1.mobile.putong.data.SpecialEffect.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SpecialEffect.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SpecialEffect newInstance() {
            return new SpecialEffect();
        }

        public boolean parseField(SpecialEffect specialEffect, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expireTime":
                    specialEffect.expireTime = jsonParser.getValueAsLong();
                    return true;
                case "type":
                    specialEffect.type = jsonParser.getValueAsString();
                    return true;
                case "style":
                    specialEffect.style = jsonParser.getValueAsString();
                    return true;
                case "deepLink":
                    specialEffect.deepLink = jsonParser.getValueAsString();
                    return true;
                case "content":
                    specialEffect.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SpecialEffect specialEffect, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "expireTime":
                case "type":
                case "style":
                case "deepLink":
                case "content":
                    return true;
                default:
                    return super.parseFieldCheck(specialEffect, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SpecialEffect specialEffect, JsonGenerator jsonGenerator) throws IOException {
            String str = specialEffect.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = specialEffect.content;
            if (str2 != null) {
                jsonGenerator.writeStringField("content", str2);
            }
            jsonGenerator.writeNumberField("expireTime", specialEffect.expireTime);
            String str3 = specialEffect.deepLink;
            if (str3 != null) {
                jsonGenerator.writeStringField("deepLink", str3);
            }
            String str4 = specialEffect.style;
            if (str4 != null) {
                jsonGenerator.writeStringField("style", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpecialEffect) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpecialEffect) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpecialEffect new_() {
        SpecialEffect specialEffect = new SpecialEffect();
        specialEffect.nullCheck();
        return specialEffect;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SpecialEffect mo225055clone() {
        SpecialEffect specialEffect = new SpecialEffect();
        specialEffect.type = this.type;
        specialEffect.content = this.content;
        specialEffect.expireTime = this.expireTime;
        specialEffect.deepLink = this.deepLink;
        specialEffect.style = this.style;
        return specialEffect;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpecialEffect)) {
            return false;
        }
        SpecialEffect specialEffect = (SpecialEffect) obj;
        return ValueObject.util_equals(this.type, specialEffect.type) && ValueObject.util_equals(this.content, specialEffect.content) && this.expireTime == specialEffect.expireTime && ValueObject.util_equals(this.deepLink, specialEffect.deepLink) && ValueObject.util_equals(this.style, specialEffect.style);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.content;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.expireTime;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str3 = this.deepLink;
        int iHashCode3 = (i3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.style;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.content == null) {
            this.content = "";
        }
        if (this.deepLink == null) {
            this.deepLink = "";
        }
        if (this.style == null) {
            this.style = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
