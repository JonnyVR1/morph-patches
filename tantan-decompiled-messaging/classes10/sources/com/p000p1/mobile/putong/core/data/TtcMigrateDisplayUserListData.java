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
public class TtcMigrateDisplayUserListData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ttcmigratedisplayuserlistdata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public TtcMigrateDisplayUserInfoData ttcUser;

    @NonNull
    @ProtobufIndex(index = 1)
    public TtcMigrateDisplayUserInfoData tttUser;
    public static ProtobufAdapter<TtcMigrateDisplayUserListData> PROTOBUF_ADAPTER = new MessageNanoAdapter<TtcMigrateDisplayUserListData>() { // from class: com.p1.mobile.putong.core.data.TtcMigrateDisplayUserListData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData) {
            TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData = ttcMigrateDisplayUserListData.tttUser;
            int iL = ttcMigrateDisplayUserInfoData != null ? CodedOutputByteBufferNano.l(1, ttcMigrateDisplayUserInfoData, TtcMigrateDisplayUserInfoData.PROTOBUF_ADAPTER) : 0;
            TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData2 = ttcMigrateDisplayUserListData.ttcUser;
            if (ttcMigrateDisplayUserInfoData2 != null) {
                iL += CodedOutputByteBufferNano.l(2, ttcMigrateDisplayUserInfoData2, TtcMigrateDisplayUserInfoData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) ttcMigrateDisplayUserListData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public TtcMigrateDisplayUserListData m16068parse(nb5 nb5Var) throws IOException {
            TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData = new TtcMigrateDisplayUserListData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (ttcMigrateDisplayUserListData.tttUser == null) {
                        ttcMigrateDisplayUserListData.tttUser = TtcMigrateDisplayUserInfoData.new_();
                    }
                    if (ttcMigrateDisplayUserListData.ttcUser != null) {
                        break;
                    }
                    ttcMigrateDisplayUserListData.ttcUser = TtcMigrateDisplayUserInfoData.new_();
                    break;
                }
                if (iU == 10) {
                    ttcMigrateDisplayUserListData.tttUser = (TtcMigrateDisplayUserInfoData) nb5Var.l(TtcMigrateDisplayUserInfoData.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (ttcMigrateDisplayUserListData.tttUser == null) {
                            ttcMigrateDisplayUserListData.tttUser = TtcMigrateDisplayUserInfoData.new_();
                        }
                        if (ttcMigrateDisplayUserListData.ttcUser != null) {
                            break;
                        }
                        ttcMigrateDisplayUserListData.ttcUser = TtcMigrateDisplayUserInfoData.new_();
                        return ttcMigrateDisplayUserListData;
                    }
                    ttcMigrateDisplayUserListData.ttcUser = (TtcMigrateDisplayUserInfoData) nb5Var.l(TtcMigrateDisplayUserInfoData.PROTOBUF_ADAPTER);
                }
            }
            return ttcMigrateDisplayUserListData;
        }

        public void serialize(TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData = ttcMigrateDisplayUserListData.tttUser;
            if (ttcMigrateDisplayUserInfoData != null) {
                codedOutputByteBufferNano.K(1, ttcMigrateDisplayUserInfoData, TtcMigrateDisplayUserInfoData.PROTOBUF_ADAPTER);
            }
            TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData2 = ttcMigrateDisplayUserListData.ttcUser;
            if (ttcMigrateDisplayUserInfoData2 != null) {
                codedOutputByteBufferNano.K(2, ttcMigrateDisplayUserInfoData2, TtcMigrateDisplayUserInfoData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<TtcMigrateDisplayUserListData> JSON_ADAPTER = new ObjectJsonAdapter<TtcMigrateDisplayUserListData>() { // from class: com.p1.mobile.putong.core.data.TtcMigrateDisplayUserListData.2
        public Class getDataClass() {
            return TtcMigrateDisplayUserListData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public TtcMigrateDisplayUserListData m16069newInstance() {
            return new TtcMigrateDisplayUserListData();
        }

        public boolean parseField(TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("ttcUser")) {
                ttcMigrateDisplayUserListData.ttcUser = (TtcMigrateDisplayUserInfoData) TtcMigrateDisplayUserInfoData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("tttUser")) {
                return false;
            }
            ttcMigrateDisplayUserListData.tttUser = (TtcMigrateDisplayUserInfoData) TtcMigrateDisplayUserInfoData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("ttcUser") || str.equals("tttUser")) {
                return true;
            }
            return super.parseFieldCheck(ttcMigrateDisplayUserListData, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TtcMigrateDisplayUserListData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TtcMigrateDisplayUserListData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TtcMigrateDisplayUserListData new_() {
        TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData = new TtcMigrateDisplayUserListData();
        ttcMigrateDisplayUserListData.nullCheck();
        return ttcMigrateDisplayUserListData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public TtcMigrateDisplayUserListData m16067clone() {
        TtcMigrateDisplayUserListData ttcMigrateDisplayUserListData = new TtcMigrateDisplayUserListData();
        TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData = this.tttUser;
        if (ttcMigrateDisplayUserInfoData != null) {
            ttcMigrateDisplayUserListData.tttUser = ttcMigrateDisplayUserInfoData.m16063clone();
        }
        TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData2 = this.ttcUser;
        if (ttcMigrateDisplayUserInfoData2 != null) {
            ttcMigrateDisplayUserListData.ttcUser = ttcMigrateDisplayUserInfoData2.m16063clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData = this.tttUser;
        int iHashCode = (i2 + (ttcMigrateDisplayUserInfoData != null ? ttcMigrateDisplayUserInfoData.hashCode() : 0)) * 41;
        TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData2 = this.ttcUser;
        int iHashCode2 = iHashCode + (ttcMigrateDisplayUserInfoData2 != null ? ttcMigrateDisplayUserInfoData2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.tttUser == null) {
            this.tttUser = TtcMigrateDisplayUserInfoData.new_();
        }
        if (this.ttcUser == null) {
            this.ttcUser = TtcMigrateDisplayUserInfoData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
