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
public class Target extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "target";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String f182id;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<Target> PROTOBUF_ADAPTER = new MessageNanoAdapter<Target>() { // from class: com.p1.mobile.putong.core.data.Target.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Target target) {
            String str = target.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = target.f182id;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) target).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Target m15938parse(nb5 nb5Var) throws IOException {
            Target target = new Target();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (target.type == null) {
                        target.type = "";
                    }
                    if (target.f182id != null) {
                        break;
                    }
                    target.f182id = "";
                    break;
                }
                if (iU == 10) {
                    target.type = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (target.type == null) {
                            target.type = "";
                        }
                        if (target.f182id != null) {
                            break;
                        }
                        target.f182id = "";
                        return target;
                    }
                    target.f182id = nb5Var.s();
                }
            }
            return target;
        }

        public void serialize(Target target, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = target.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = target.f182id;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<Target> JSON_ADAPTER = new ObjectJsonAdapter<Target>() { // from class: com.p1.mobile.putong.core.data.Target.2
        public Class getDataClass() {
            return Target.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Target m15939newInstance() {
            return new Target();
        }

        public boolean parseField(Target target, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                target.f182id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("type")) {
                return false;
            }
            target.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(Target target, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(target, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(Target target, JsonGenerator jsonGenerator) throws IOException {
            String str = target.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = target.f182id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Target) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Target) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Target new_() {
        Target target = new Target();
        target.nullCheck();
        return target;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Target m15937clone() {
        Target target = new Target();
        target.type = this.type;
        target.f182id = this.f182id;
        return target;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Target)) {
            return false;
        }
        Target target = (Target) obj;
        return ValueObject.util_equals(this.type, target.type) && ValueObject.util_equals(this.f182id, target.f182id);
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
        String str2 = this.f182id;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.f182id == null) {
            this.f182id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
