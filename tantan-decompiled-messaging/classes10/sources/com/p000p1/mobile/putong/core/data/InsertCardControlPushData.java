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
public class InsertCardControlPushData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "insertcardcontrolpushdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String gid;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String intent;

    @NonNull
    @ProtobufIndex(index = 4)
    public String pageId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String ruleKey;
    public static ProtobufAdapter<InsertCardControlPushData> PROTOBUF_ADAPTER = new MessageNanoAdapter<InsertCardControlPushData>() { // from class: com.p1.mobile.putong.core.data.InsertCardControlPushData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(InsertCardControlPushData insertCardControlPushData) {
            String str = insertCardControlPushData.gid;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = insertCardControlPushData.intent;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = insertCardControlPushData.ruleKey;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = insertCardControlPushData.pageId;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) insertCardControlPushData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public InsertCardControlPushData m13465parse(nb5 nb5Var) throws IOException {
            InsertCardControlPushData insertCardControlPushData = new InsertCardControlPushData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    insertCardControlPushData.gid = nb5Var.s();
                } else if (iU == 18) {
                    insertCardControlPushData.intent = nb5Var.s();
                } else if (iU == 26) {
                    insertCardControlPushData.ruleKey = nb5Var.s();
                } else {
                    if (iU != 34) {
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
                    insertCardControlPushData.pageId = nb5Var.s();
                }
            }
            return insertCardControlPushData;
        }

        public void serialize(InsertCardControlPushData insertCardControlPushData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = insertCardControlPushData.gid;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = insertCardControlPushData.intent;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = insertCardControlPushData.ruleKey;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = insertCardControlPushData.pageId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<InsertCardControlPushData> JSON_ADAPTER = new ObjectJsonAdapter<InsertCardControlPushData>() { // from class: com.p1.mobile.putong.core.data.InsertCardControlPushData.2
        public Class getDataClass() {
            return InsertCardControlPushData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public InsertCardControlPushData m13466newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InsertCardControlPushData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InsertCardControlPushData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InsertCardControlPushData new_() {
        InsertCardControlPushData insertCardControlPushData = new InsertCardControlPushData();
        insertCardControlPushData.nullCheck();
        return insertCardControlPushData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InsertCardControlPushData m13464clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
