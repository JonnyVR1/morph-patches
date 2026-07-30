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
public class SimpleLatestVisitor extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "simplelatestvisitor";

    @NonNull
    @ProtobufIndex(index = 1)
    public String avatar;
    public static ProtobufAdapter<SimpleLatestVisitor> PROTOBUF_ADAPTER = new MessageNanoAdapter<SimpleLatestVisitor>() { // from class: com.p1.mobile.putong.core.data.SimpleLatestVisitor.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SimpleLatestVisitor simpleLatestVisitor) {
            String str = simpleLatestVisitor.avatar;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) simpleLatestVisitor).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SimpleLatestVisitor m15664parse(nb5 nb5Var) throws IOException {
            SimpleLatestVisitor simpleLatestVisitor = new SimpleLatestVisitor();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (simpleLatestVisitor.avatar != null) {
                        break;
                    }
                    simpleLatestVisitor.avatar = "";
                    break;
                }
                if (iU != 10) {
                    if (simpleLatestVisitor.avatar != null) {
                        break;
                    }
                    simpleLatestVisitor.avatar = "";
                    return simpleLatestVisitor;
                }
                simpleLatestVisitor.avatar = nb5Var.s();
            }
            return simpleLatestVisitor;
        }

        public void serialize(SimpleLatestVisitor simpleLatestVisitor, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = simpleLatestVisitor.avatar;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<SimpleLatestVisitor> JSON_ADAPTER = new ObjectJsonAdapter<SimpleLatestVisitor>() { // from class: com.p1.mobile.putong.core.data.SimpleLatestVisitor.2
        public Class getDataClass() {
            return SimpleLatestVisitor.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SimpleLatestVisitor m15665newInstance() {
            return new SimpleLatestVisitor();
        }

        public boolean parseField(SimpleLatestVisitor simpleLatestVisitor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(ReminderAction.avatar)) {
                return false;
            }
            simpleLatestVisitor.avatar = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(SimpleLatestVisitor simpleLatestVisitor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(ReminderAction.avatar)) {
                return true;
            }
            return super.parseFieldCheck(simpleLatestVisitor, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(SimpleLatestVisitor simpleLatestVisitor, JsonGenerator jsonGenerator) throws IOException {
            String str = simpleLatestVisitor.avatar;
            if (str != null) {
                jsonGenerator.writeStringField(ReminderAction.avatar, str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimpleLatestVisitor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimpleLatestVisitor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SimpleLatestVisitor new_() {
        SimpleLatestVisitor simpleLatestVisitor = new SimpleLatestVisitor();
        simpleLatestVisitor.nullCheck();
        return simpleLatestVisitor;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimpleLatestVisitor m15663clone() {
        SimpleLatestVisitor simpleLatestVisitor = new SimpleLatestVisitor();
        simpleLatestVisitor.avatar = this.avatar;
        return simpleLatestVisitor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SimpleLatestVisitor) {
            return ValueObject.util_equals(this.avatar, ((SimpleLatestVisitor) obj).avatar);
        }
        return false;
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
        String str = this.avatar;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.avatar == null) {
            this.avatar = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
