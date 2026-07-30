package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class InModeration extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "inmoderation";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String description;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;

    @NonNull
    @ProtobufIndex(index = 1)
    public String nickName;
    public static ProtobufAdapter<InModeration> PROTOBUF_ADAPTER = new MessageNanoAdapter<InModeration>() { // from class: com.p1.mobile.putong.core.data.InModeration.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(InModeration inModeration) {
            String str = inModeration.nickName;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = inModeration.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = inModeration.description;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) inModeration).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public InModeration m13445parse(nb5 nb5Var) throws IOException {
            InModeration inModeration = new InModeration();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (inModeration.nickName == null) {
                        inModeration.nickName = "";
                    }
                    if (inModeration.name == null) {
                        inModeration.name = "";
                    }
                    if (inModeration.description != null) {
                        break;
                    }
                    inModeration.description = "";
                    break;
                }
                if (iU == 10) {
                    inModeration.nickName = nb5Var.s();
                } else if (iU == 18) {
                    inModeration.name = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (inModeration.nickName == null) {
                            inModeration.nickName = "";
                        }
                        if (inModeration.name == null) {
                            inModeration.name = "";
                        }
                        if (inModeration.description != null) {
                            break;
                        }
                        inModeration.description = "";
                        return inModeration;
                    }
                    inModeration.description = nb5Var.s();
                }
            }
            return inModeration;
        }

        public void serialize(InModeration inModeration, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = inModeration.nickName;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = inModeration.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = inModeration.description;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<InModeration> JSON_ADAPTER = new ObjectJsonAdapter<InModeration>() { // from class: com.p1.mobile.putong.core.data.InModeration.2
        public Class getDataClass() {
            return InModeration.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public InModeration m13446newInstance() {
            return new InModeration();
        }

        public boolean parseField(InModeration inModeration, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    inModeration.description = jsonParser.getValueAsString();
                    return true;
                case "name":
                    inModeration.name = jsonParser.getValueAsString();
                    return true;
                case "nickName":
                    inModeration.nickName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(InModeration inModeration, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "name":
                case "nickName":
                    return true;
                default:
                    return super.parseFieldCheck(inModeration, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(InModeration inModeration, JsonGenerator jsonGenerator) throws IOException {
            String str = inModeration.nickName;
            if (str != null) {
                jsonGenerator.writeStringField("nickName", str);
            }
            String str2 = inModeration.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = inModeration.description;
            if (str3 != null) {
                jsonGenerator.writeStringField("description", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InModeration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InModeration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InModeration new_() {
        InModeration inModeration = new InModeration();
        inModeration.nullCheck();
        return inModeration;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InModeration m13444clone() {
        InModeration inModeration = new InModeration();
        inModeration.nickName = this.nickName;
        inModeration.name = this.name;
        inModeration.description = this.description;
        return inModeration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InModeration)) {
            return false;
        }
        InModeration inModeration = (InModeration) obj;
        return ValueObject.util_equals(this.nickName, inModeration.nickName) && ValueObject.util_equals(this.name, inModeration.name) && ValueObject.util_equals(this.description, inModeration.description);
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
        String str = this.nickName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.description;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.nickName == null) {
            this.nickName = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.description == null) {
            this.description = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
