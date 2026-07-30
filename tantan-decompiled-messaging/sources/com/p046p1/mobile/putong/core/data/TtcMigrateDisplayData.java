package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class TtcMigrateDisplayData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ttcmigratedisplaydata";

    @ProtobufIndex(index = 1)
    public boolean open;

    @NonNull
    @ProtobufIndex(index = 2)
    public TtcMigrateDisplayUserListData userList;
    public static ProtobufAdapter<TtcMigrateDisplayData> PROTOBUF_ADAPTER = new MessageNanoAdapter<TtcMigrateDisplayData>() { // from class: com.p1.mobile.putong.core.data.TtcMigrateDisplayData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TtcMigrateDisplayData ttcMigrateDisplayData) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, ttcMigrateDisplayData.open);
            TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData = ttcMigrateDisplayData.userList;
            if (ttcMigrateDisplayUserListData != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(2, ttcMigrateDisplayUserListData, TtcMigrateDisplayUserListData.PROTOBUF_ADAPTER);
            }
            ttcMigrateDisplayData.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TtcMigrateDisplayData parse(nb5 nb5Var) throws IOException {
            TtcMigrateDisplayData ttcMigrateDisplayData = new TtcMigrateDisplayData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (ttcMigrateDisplayData.userList != null) {
                        break;
                    }
                    ttcMigrateDisplayData.userList = TtcMigrateDisplayUserListData.new_();
                    break;
                }
                if (iM158752u == 8) {
                    ttcMigrateDisplayData.open = nb5Var.m158738g();
                } else {
                    if (iM158752u != 18) {
                        if (ttcMigrateDisplayData.userList != null) {
                            break;
                        }
                        ttcMigrateDisplayData.userList = TtcMigrateDisplayUserListData.new_();
                        return ttcMigrateDisplayData;
                    }
                    ttcMigrateDisplayData.userList = (TtcMigrateDisplayUserListData) nb5Var.m158743l(TtcMigrateDisplayUserListData.PROTOBUF_ADAPTER);
                }
            }
            return ttcMigrateDisplayData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TtcMigrateDisplayData ttcMigrateDisplayData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, ttcMigrateDisplayData.open);
            TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData = ttcMigrateDisplayData.userList;
            if (ttcMigrateDisplayUserListData != null) {
                codedOutputByteBufferNano.m17254K(2, ttcMigrateDisplayUserListData, TtcMigrateDisplayUserListData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TtcMigrateDisplayData> JSON_ADAPTER = new ObjectJsonAdapter<TtcMigrateDisplayData>() { // from class: com.p1.mobile.putong.core.data.TtcMigrateDisplayData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TtcMigrateDisplayData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TtcMigrateDisplayData newInstance() {
            return new TtcMigrateDisplayData();
        }

        public boolean parseField(TtcMigrateDisplayData ttcMigrateDisplayData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userList")) {
                ttcMigrateDisplayData.userList = TtcMigrateDisplayUserListData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TtcMigrateDisplayData ttcMigrateDisplayData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("open", ttcMigrateDisplayData.open);
            if (ttcMigrateDisplayData.userList != null) {
                jsonGenerator.writeFieldName("userList");
                TtcMigrateDisplayUserListData.JSON_ADAPTER.serialize(ttcMigrateDisplayData.userList, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TtcMigrateDisplayData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TtcMigrateDisplayData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TtcMigrateDisplayData new_() {
        TtcMigrateDisplayData ttcMigrateDisplayData = new TtcMigrateDisplayData();
        ttcMigrateDisplayData.nullCheck();
        return ttcMigrateDisplayData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TtcMigrateDisplayData mo223809clone() {
        TtcMigrateDisplayData ttcMigrateDisplayData = new TtcMigrateDisplayData();
        ttcMigrateDisplayData.open = this.open;
        TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData = this.userList;
        if (ttcMigrateDisplayUserListData != null) {
            ttcMigrateDisplayData.userList = ttcMigrateDisplayUserListData.mo223809clone();
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.open ? 1231 : 1237)) * 41;
        TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData = this.userList;
        int iHashCode = i2 + (ttcMigrateDisplayUserListData != null ? ttcMigrateDisplayUserListData.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userList == null) {
            this.userList = TtcMigrateDisplayUserListData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
