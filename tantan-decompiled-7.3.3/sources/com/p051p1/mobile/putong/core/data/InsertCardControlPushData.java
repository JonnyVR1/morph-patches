package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class InsertCardControlPushData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "insertcardcontrolpushdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String gid;

    @NonNull
    @ProtobufIndex(index = 2)
    public String intent;

    @NonNull
    @ProtobufIndex(index = 4)
    public String pageId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String ruleKey;
    public static ProtobufAdapter<InsertCardControlPushData> PROTOBUF_ADAPTER = new MessageNanoAdapter<InsertCardControlPushData>() { // from class: com.p1.mobile.putong.core.data.InsertCardControlPushData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(InsertCardControlPushData insertCardControlPushData) {
            String str = insertCardControlPushData.gid;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = insertCardControlPushData.intent;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = insertCardControlPushData.ruleKey;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = insertCardControlPushData.pageId;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            insertCardControlPushData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public InsertCardControlPushData parse(nc5 nc5Var) throws IOException {
            InsertCardControlPushData insertCardControlPushData = new InsertCardControlPushData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (insertCardControlPushData.gid == null) {
                        insertCardControlPushData.gid = "";
                    }
                    if (insertCardControlPushData.intent == null) {
                        insertCardControlPushData.intent = "";
                    }
                    if (insertCardControlPushData.ruleKey == null) {
                        insertCardControlPushData.ruleKey = "";
                    }
                    if (insertCardControlPushData.pageId != null) {
                        break;
                    }
                    insertCardControlPushData.pageId = "";
                    break;
                }
                if (iM162497u == 10) {
                    insertCardControlPushData.gid = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    insertCardControlPushData.intent = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    insertCardControlPushData.ruleKey = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (insertCardControlPushData.gid == null) {
                            insertCardControlPushData.gid = "";
                        }
                        if (insertCardControlPushData.intent == null) {
                            insertCardControlPushData.intent = "";
                        }
                        if (insertCardControlPushData.ruleKey == null) {
                            insertCardControlPushData.ruleKey = "";
                        }
                        if (insertCardControlPushData.pageId != null) {
                            break;
                        }
                        insertCardControlPushData.pageId = "";
                        return insertCardControlPushData;
                    }
                    insertCardControlPushData.pageId = nc5Var.m162495s();
                }
            }
            return insertCardControlPushData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(InsertCardControlPushData insertCardControlPushData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = insertCardControlPushData.gid;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = insertCardControlPushData.intent;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = insertCardControlPushData.ruleKey;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = insertCardControlPushData.pageId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
        }
    };
    public static JsonAdapter<InsertCardControlPushData> JSON_ADAPTER = new ObjectJsonAdapter<InsertCardControlPushData>() { // from class: com.p1.mobile.putong.core.data.InsertCardControlPushData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return InsertCardControlPushData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public InsertCardControlPushData newInstance() {
            return new InsertCardControlPushData();
        }

        public boolean parseField(InsertCardControlPushData insertCardControlPushData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "intent":
                    insertCardControlPushData.intent = jsonParser.getValueAsString();
                    return true;
                case "pageId":
                    insertCardControlPushData.pageId = jsonParser.getValueAsString();
                    return true;
                case "gid":
                    insertCardControlPushData.gid = jsonParser.getValueAsString();
                    return true;
                case "ruleKey":
                    insertCardControlPushData.ruleKey = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(InsertCardControlPushData insertCardControlPushData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "intent":
                case "pageId":
                case "gid":
                case "ruleKey":
                    return true;
                default:
                    return super.parseFieldCheck(insertCardControlPushData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(InsertCardControlPushData insertCardControlPushData, JsonGenerator jsonGenerator) throws IOException {
            String str = insertCardControlPushData.gid;
            if (str != null) {
                jsonGenerator.writeStringField("gid", str);
            }
            String str2 = insertCardControlPushData.intent;
            if (str2 != null) {
                jsonGenerator.writeStringField("intent", str2);
            }
            String str3 = insertCardControlPushData.ruleKey;
            if (str3 != null) {
                jsonGenerator.writeStringField("ruleKey", str3);
            }
            String str4 = insertCardControlPushData.pageId;
            if (str4 != null) {
                jsonGenerator.writeStringField("pageId", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InsertCardControlPushData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InsertCardControlPushData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InsertCardControlPushData new_() {
        InsertCardControlPushData insertCardControlPushData = new InsertCardControlPushData();
        insertCardControlPushData.nullCheck();
        return insertCardControlPushData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public InsertCardControlPushData mo225055clone() {
        InsertCardControlPushData insertCardControlPushData = new InsertCardControlPushData();
        insertCardControlPushData.gid = this.gid;
        insertCardControlPushData.intent = this.intent;
        insertCardControlPushData.ruleKey = this.ruleKey;
        insertCardControlPushData.pageId = this.pageId;
        return insertCardControlPushData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InsertCardControlPushData)) {
            return false;
        }
        InsertCardControlPushData insertCardControlPushData = (InsertCardControlPushData) obj;
        return ValueObject.util_equals(this.gid, insertCardControlPushData.gid) && ValueObject.util_equals(this.intent, insertCardControlPushData.intent) && ValueObject.util_equals(this.ruleKey, insertCardControlPushData.ruleKey) && ValueObject.util_equals(this.pageId, insertCardControlPushData.pageId);
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
        String str = this.gid;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.intent;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.ruleKey;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.pageId;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.gid == null) {
            this.gid = "";
        }
        if (this.intent == null) {
            this.intent = "";
        }
        if (this.ruleKey == null) {
            this.ruleKey = "";
        }
        if (this.pageId == null) {
            this.pageId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
