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
public class PrivilegeReward extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privilegereward";

    @ProtobufIndex(index = 1)
    public int count;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<PrivilegeReward> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivilegeReward>() { // from class: com.p1.mobile.putong.core.data.PrivilegeReward.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PrivilegeReward privilegeReward) {
            int iH = CodedOutputByteBufferNano.h(1, privilegeReward.count);
            String str = privilegeReward.type;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) privilegeReward).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PrivilegeReward m14889parse(nb5 nb5Var) throws IOException {
            PrivilegeReward privilegeReward = new PrivilegeReward();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (privilegeReward.type != null) {
                        break;
                    }
                    privilegeReward.type = "";
                    break;
                }
                if (iU == 8) {
                    privilegeReward.count = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (privilegeReward.type != null) {
                            break;
                        }
                        privilegeReward.type = "";
                        return privilegeReward;
                    }
                    privilegeReward.type = nb5Var.s();
                }
            }
            return privilegeReward;
        }

        public void serialize(PrivilegeReward privilegeReward, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, privilegeReward.count);
            String str = privilegeReward.type;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<PrivilegeReward> JSON_ADAPTER = new ObjectJsonAdapter<PrivilegeReward>() { // from class: com.p1.mobile.putong.core.data.PrivilegeReward.2
        public Class getDataClass() {
            return PrivilegeReward.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PrivilegeReward m14890newInstance() {
            return new PrivilegeReward();
        }

        public boolean parseField(PrivilegeReward privilegeReward, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("type")) {
                privilegeReward.type = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("count")) {
                return false;
            }
            privilegeReward.count = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(PrivilegeReward privilegeReward, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("type") || str.equals("count")) {
                return true;
            }
            return super.parseFieldCheck(privilegeReward, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(PrivilegeReward privilegeReward, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("count", privilegeReward.count);
            String str = privilegeReward.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivilegeReward) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivilegeReward) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivilegeReward new_() {
        PrivilegeReward privilegeReward = new PrivilegeReward();
        privilegeReward.nullCheck();
        return privilegeReward;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PrivilegeReward m14888clone() {
        PrivilegeReward privilegeReward = new PrivilegeReward();
        privilegeReward.count = this.count;
        privilegeReward.type = this.type;
        return privilegeReward;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivilegeReward)) {
            return false;
        }
        PrivilegeReward privilegeReward = (PrivilegeReward) obj;
        return this.count == privilegeReward.count && ValueObject.util_equals(this.type, privilegeReward.type);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.count) * 41;
        String str = this.type;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
