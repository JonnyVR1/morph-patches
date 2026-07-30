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
public class SuperlikeByCount extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "superlikebycount";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int count;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f172id;
    public static ProtobufAdapter<SuperlikeByCount> PROTOBUF_ADAPTER = new MessageNanoAdapter<SuperlikeByCount>() { // from class: com.p1.mobile.putong.core.data.SuperlikeByCount.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SuperlikeByCount superlikeByCount) {
            String str = superlikeByCount.f172id;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, superlikeByCount.count);
            ((MessageNano) superlikeByCount).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SuperlikeByCount m15826parse(nb5 nb5Var) throws IOException {
            SuperlikeByCount superlikeByCount = new SuperlikeByCount();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (superlikeByCount.f172id != null) {
                        break;
                    }
                    superlikeByCount.f172id = "";
                    break;
                }
                if (iU == 10) {
                    superlikeByCount.f172id = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (superlikeByCount.f172id != null) {
                            break;
                        }
                        superlikeByCount.f172id = "";
                        return superlikeByCount;
                    }
                    superlikeByCount.count = nb5Var.j();
                }
            }
            return superlikeByCount;
        }

        public void serialize(SuperlikeByCount superlikeByCount, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = superlikeByCount.f172id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, superlikeByCount.count);
        }
    };
    public static JsonAdapter<SuperlikeByCount> JSON_ADAPTER = new ObjectJsonAdapter<SuperlikeByCount>() { // from class: com.p1.mobile.putong.core.data.SuperlikeByCount.2
        public Class getDataClass() {
            return SuperlikeByCount.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SuperlikeByCount m15827newInstance() {
            return new SuperlikeByCount();
        }

        public boolean parseField(SuperlikeByCount superlikeByCount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                superlikeByCount.f172id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("count")) {
                return false;
            }
            superlikeByCount.count = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(SuperlikeByCount superlikeByCount, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("count")) {
                return true;
            }
            return super.parseFieldCheck(superlikeByCount, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(SuperlikeByCount superlikeByCount, JsonGenerator jsonGenerator) throws IOException {
            String str = superlikeByCount.f172id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("count", superlikeByCount.count);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SuperlikeByCount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SuperlikeByCount) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SuperlikeByCount new_() {
        SuperlikeByCount superlikeByCount = new SuperlikeByCount();
        superlikeByCount.nullCheck();
        return superlikeByCount;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SuperlikeByCount m15825clone() {
        SuperlikeByCount superlikeByCount = new SuperlikeByCount();
        superlikeByCount.f172id = this.f172id;
        superlikeByCount.count = this.count;
        return superlikeByCount;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SuperlikeByCount)) {
            return false;
        }
        SuperlikeByCount superlikeByCount = (SuperlikeByCount) obj;
        return ValueObject.util_equals(this.f172id, superlikeByCount.f172id) && this.count == superlikeByCount.count;
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
        String str = this.f172id;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.count;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.f172id == null) {
            this.f172id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
