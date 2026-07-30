package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SpecialEffect specialEffect) {
            String str = specialEffect.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = specialEffect.content;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iJ = iO + CodedOutputByteBufferNano.j(3, specialEffect.expireTime);
            String str3 = specialEffect.deepLink;
            if (str3 != null) {
                iJ += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = specialEffect.style;
            if (str4 != null) {
                iJ += CodedOutputByteBufferNano.o(5, str4);
            }
            ((MessageNano) specialEffect).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SpecialEffect m19013parse(nb5 nb5Var) throws IOException {
            SpecialEffect specialEffect = new SpecialEffect();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    specialEffect.type = nb5Var.s();
                } else if (iU == 18) {
                    specialEffect.content = nb5Var.s();
                } else if (iU == 24) {
                    specialEffect.expireTime = nb5Var.k();
                } else if (iU == 34) {
                    specialEffect.deepLink = nb5Var.s();
                } else {
                    if (iU != 42) {
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
                    specialEffect.style = nb5Var.s();
                }
            }
            return specialEffect;
        }

        public void serialize(SpecialEffect specialEffect, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = specialEffect.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = specialEffect.content;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.I(3, specialEffect.expireTime);
            String str3 = specialEffect.deepLink;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = specialEffect.style;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
        }
    };
    public static JsonAdapter<SpecialEffect> JSON_ADAPTER = new ObjectJsonAdapter<SpecialEffect>() { // from class: com.p1.mobile.putong.data.SpecialEffect.2
        public Class getDataClass() {
            return SpecialEffect.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SpecialEffect mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpecialEffect) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpecialEffect) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpecialEffect new_() {
        SpecialEffect specialEffect = new SpecialEffect();
        specialEffect.nullCheck();
        return specialEffect;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SpecialEffect m19012clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
