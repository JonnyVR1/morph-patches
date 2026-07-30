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
public class TtcMigrateDisplayData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ttcmigratedisplaydata";

    @ProtobufIndex(index = 1)
    public boolean open;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public TtcMigrateDisplayUserListData userList;
    public static ProtobufAdapter<TtcMigrateDisplayData> PROTOBUF_ADAPTER = new MessageNanoAdapter<TtcMigrateDisplayData>() { // from class: com.p1.mobile.putong.core.data.TtcMigrateDisplayData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TtcMigrateDisplayData ttcMigrateDisplayData) {
            int iB = CodedOutputByteBufferNano.b(1, ttcMigrateDisplayData.open);
            TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData = ttcMigrateDisplayData.userList;
            if (ttcMigrateDisplayUserListData != null) {
                iB += CodedOutputByteBufferNano.l(2, ttcMigrateDisplayUserListData, TtcMigrateDisplayUserListData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) ttcMigrateDisplayData).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TtcMigrateDisplayData m16056parse(nb5 nb5Var) throws IOException {
            TtcMigrateDisplayData ttcMigrateDisplayData = new TtcMigrateDisplayData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (ttcMigrateDisplayData.userList != null) {
                        break;
                    }
                    ttcMigrateDisplayData.userList = TtcMigrateDisplayUserListData.new_();
                    break;
                }
                if (iU == 8) {
                    ttcMigrateDisplayData.open = nb5Var.g();
                } else {
                    if (iU != 18) {
                        if (ttcMigrateDisplayData.userList != null) {
                            break;
                        }
                        ttcMigrateDisplayData.userList = TtcMigrateDisplayUserListData.new_();
                        return ttcMigrateDisplayData;
                    }
                    ttcMigrateDisplayData.userList = (TtcMigrateDisplayUserListData) nb5Var.l(TtcMigrateDisplayUserListData.PROTOBUF_ADAPTER);
                }
            }
            return ttcMigrateDisplayData;
        }

        public void serialize(TtcMigrateDisplayData ttcMigrateDisplayData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, ttcMigrateDisplayData.open);
            TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData = ttcMigrateDisplayData.userList;
            if (ttcMigrateDisplayUserListData != null) {
                codedOutputByteBufferNano.K(2, ttcMigrateDisplayUserListData, TtcMigrateDisplayUserListData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TtcMigrateDisplayData> JSON_ADAPTER = new ObjectJsonAdapter<TtcMigrateDisplayData>() { // from class: com.p1.mobile.putong.core.data.TtcMigrateDisplayData.2
        public Class getDataClass() {
            return TtcMigrateDisplayData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TtcMigrateDisplayData m16057newInstance() {
            return new TtcMigrateDisplayData();
        }

        public boolean parseField(TtcMigrateDisplayData ttcMigrateDisplayData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userList")) {
                ttcMigrateDisplayData.userList = (TtcMigrateDisplayUserListData) TtcMigrateDisplayUserListData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("open")) {
                return false;
            }
            ttcMigrateDisplayData.open = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(TtcMigrateDisplayData ttcMigrateDisplayData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userList") || str.equals("open")) {
                return true;
            }
            return super.parseFieldCheck(ttcMigrateDisplayData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(TtcMigrateDisplayData ttcMigrateDisplayData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("open", ttcMigrateDisplayData.open);
            if (ttcMigrateDisplayData.userList != null) {
                jsonGenerator.writeFieldName("userList");
                TtcMigrateDisplayUserListData.JSON_ADAPTER.serialize(ttcMigrateDisplayData.userList, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TtcMigrateDisplayData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TtcMigrateDisplayData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TtcMigrateDisplayData new_() {
        TtcMigrateDisplayData ttcMigrateDisplayData = new TtcMigrateDisplayData();
        ttcMigrateDisplayData.nullCheck();
        return ttcMigrateDisplayData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TtcMigrateDisplayData m16055clone() {
        TtcMigrateDisplayData ttcMigrateDisplayData = new TtcMigrateDisplayData();
        ttcMigrateDisplayData.open = this.open;
        TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData = this.userList;
        if (ttcMigrateDisplayUserListData != null) {
            ttcMigrateDisplayData.userList = ttcMigrateDisplayUserListData.m16067clone();
        }
        return ttcMigrateDisplayData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TtcMigrateDisplayData)) {
            return false;
        }
        TtcMigrateDisplayData ttcMigrateDisplayData = (TtcMigrateDisplayData) obj;
        return this.open == ttcMigrateDisplayData.open && ValueObject.util_equals(this.userList, ttcMigrateDisplayData.userList);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.open ? 1231 : 1237)) * 41;
        TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData = this.userList;
        int iHashCode = i2 + (ttcMigrateDisplayUserListData != null ? ttcMigrateDisplayUserListData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.userList == null) {
            this.userList = TtcMigrateDisplayUserListData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
