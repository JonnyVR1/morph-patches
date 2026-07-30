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
public class TtcMigrateDisplayUserListData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ttcmigratedisplayuserlistdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public TtcMigrateDisplayUserInfoData ttcUser;

    @NonNull
    @ProtobufIndex(index = 1)
    public TtcMigrateDisplayUserInfoData tttUser;
    public static ProtobufAdapter<TtcMigrateDisplayUserListData> PROTOBUF_ADAPTER = new MessageNanoAdapter<TtcMigrateDisplayUserListData>() { // from class: com.p1.mobile.putong.core.data.TtcMigrateDisplayUserListData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData) {
            TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData = ttcMigrateDisplayUserListData.tttUser;
            int iM17285l = ttcMigrateDisplayUserInfoData != null ? CodedOutputByteBufferNano.m17285l(1, ttcMigrateDisplayUserInfoData, TtcMigrateDisplayUserInfoData.PROTOBUF_ADAPTER) : 0;
            TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData2 = ttcMigrateDisplayUserListData.ttcUser;
            if (ttcMigrateDisplayUserInfoData2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, ttcMigrateDisplayUserInfoData2, TtcMigrateDisplayUserInfoData.PROTOBUF_ADAPTER);
            }
            ttcMigrateDisplayUserListData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TtcMigrateDisplayUserListData parse(nc5 nc5Var) throws IOException {
            TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData = new TtcMigrateDisplayUserListData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (ttcMigrateDisplayUserListData.tttUser == null) {
                        ttcMigrateDisplayUserListData.tttUser = TtcMigrateDisplayUserInfoData.new_();
                    }
                    if (ttcMigrateDisplayUserListData.ttcUser != null) {
                        break;
                    }
                    ttcMigrateDisplayUserListData.ttcUser = TtcMigrateDisplayUserInfoData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    ttcMigrateDisplayUserListData.tttUser = (TtcMigrateDisplayUserInfoData) nc5Var.m162488l(TtcMigrateDisplayUserInfoData.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (ttcMigrateDisplayUserListData.tttUser == null) {
                            ttcMigrateDisplayUserListData.tttUser = TtcMigrateDisplayUserInfoData.new_();
                        }
                        if (ttcMigrateDisplayUserListData.ttcUser != null) {
                            break;
                        }
                        ttcMigrateDisplayUserListData.ttcUser = TtcMigrateDisplayUserInfoData.new_();
                        return ttcMigrateDisplayUserListData;
                    }
                    ttcMigrateDisplayUserListData.ttcUser = (TtcMigrateDisplayUserInfoData) nc5Var.m162488l(TtcMigrateDisplayUserInfoData.PROTOBUF_ADAPTER);
                }
            }
            return ttcMigrateDisplayUserListData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData = ttcMigrateDisplayUserListData.tttUser;
            if (ttcMigrateDisplayUserInfoData != null) {
                codedOutputByteBufferNano.m17309K(1, ttcMigrateDisplayUserInfoData, TtcMigrateDisplayUserInfoData.PROTOBUF_ADAPTER);
            }
            TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData2 = ttcMigrateDisplayUserListData.ttcUser;
            if (ttcMigrateDisplayUserInfoData2 != null) {
                codedOutputByteBufferNano.m17309K(2, ttcMigrateDisplayUserInfoData2, TtcMigrateDisplayUserInfoData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TtcMigrateDisplayUserListData> JSON_ADAPTER = new ObjectJsonAdapter<TtcMigrateDisplayUserListData>() { // from class: com.p1.mobile.putong.core.data.TtcMigrateDisplayUserListData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TtcMigrateDisplayUserListData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TtcMigrateDisplayUserListData newInstance() {
            return new TtcMigrateDisplayUserListData();
        }

        public boolean parseField(TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("ttcUser")) {
                ttcMigrateDisplayUserListData.ttcUser = TtcMigrateDisplayUserInfoData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("tttUser")) {
                return false;
            }
            ttcMigrateDisplayUserListData.tttUser = TtcMigrateDisplayUserInfoData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("ttcUser") || str.equals("tttUser")) {
                return true;
            }
            return super.parseFieldCheck(ttcMigrateDisplayUserListData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData, JsonGenerator jsonGenerator) throws IOException {
            if (ttcMigrateDisplayUserListData.tttUser != null) {
                jsonGenerator.writeFieldName("tttUser");
                TtcMigrateDisplayUserInfoData.JSON_ADAPTER.serialize(ttcMigrateDisplayUserListData.tttUser, jsonGenerator, true);
            }
            if (ttcMigrateDisplayUserListData.ttcUser != null) {
                jsonGenerator.writeFieldName("ttcUser");
                TtcMigrateDisplayUserInfoData.JSON_ADAPTER.serialize(ttcMigrateDisplayUserListData.ttcUser, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TtcMigrateDisplayUserListData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TtcMigrateDisplayUserListData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TtcMigrateDisplayUserListData new_() {
        TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData = new TtcMigrateDisplayUserListData();
        ttcMigrateDisplayUserListData.nullCheck();
        return ttcMigrateDisplayUserListData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TtcMigrateDisplayUserListData mo225055clone() {
        TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData = new TtcMigrateDisplayUserListData();
        TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData = this.tttUser;
        if (ttcMigrateDisplayUserInfoData != null) {
            ttcMigrateDisplayUserListData.tttUser = ttcMigrateDisplayUserInfoData.mo225055clone();
        }
        TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData2 = this.ttcUser;
        if (ttcMigrateDisplayUserInfoData2 != null) {
            ttcMigrateDisplayUserListData.ttcUser = ttcMigrateDisplayUserInfoData2.mo225055clone();
        }
        return ttcMigrateDisplayUserListData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TtcMigrateDisplayUserListData)) {
            return false;
        }
        TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData = (TtcMigrateDisplayUserListData) obj;
        return ValueObject.util_equals(this.tttUser, ttcMigrateDisplayUserListData.tttUser) && ValueObject.util_equals(this.ttcUser, ttcMigrateDisplayUserListData.ttcUser);
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
        TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData = this.tttUser;
        int iHashCode = (i2 + (ttcMigrateDisplayUserInfoData != null ? ttcMigrateDisplayUserInfoData.hashCode() : 0)) * 41;
        TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData2 = this.ttcUser;
        int iHashCode2 = iHashCode + (ttcMigrateDisplayUserInfoData2 != null ? ttcMigrateDisplayUserInfoData2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.tttUser == null) {
            this.tttUser = TtcMigrateDisplayUserInfoData.new_();
        }
        if (this.ttcUser == null) {
            this.ttcUser = TtcMigrateDisplayUserInfoData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
