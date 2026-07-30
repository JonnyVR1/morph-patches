package com.p051p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
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
public class HideAndSeekInfoData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hideandseekinfodata";

    @Nullable
    @ProtobufIndex(index = 1)
    public HideAndSeekGameInfo gameInfo;

    @Nullable
    @ProtobufIndex(index = 2)
    public HideAndSeekGameRole gameRole;
    public static ProtobufAdapter<HideAndSeekInfoData> PROTOBUF_ADAPTER = new MessageNanoAdapter<HideAndSeekInfoData>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekInfoData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HideAndSeekInfoData hideAndSeekInfoData) {
            HideAndSeekGameInfo hideAndSeekGameInfo = hideAndSeekInfoData.gameInfo;
            int iM17285l = hideAndSeekGameInfo != null ? CodedOutputByteBufferNano.m17285l(1, hideAndSeekGameInfo, HideAndSeekGameInfo.PROTOBUF_ADAPTER) : 0;
            HideAndSeekGameRole hideAndSeekGameRole = hideAndSeekInfoData.gameRole;
            if (hideAndSeekGameRole != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, hideAndSeekGameRole, HideAndSeekGameRole.PROTOBUF_ADAPTER);
            }
            hideAndSeekInfoData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HideAndSeekInfoData parse(nc5 nc5Var) throws IOException {
            HideAndSeekInfoData hideAndSeekInfoData = new HideAndSeekInfoData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 10) {
                    hideAndSeekInfoData.gameInfo = (HideAndSeekGameInfo) nc5Var.m162488l(HideAndSeekGameInfo.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        return hideAndSeekInfoData;
                    }
                    hideAndSeekInfoData.gameRole = (HideAndSeekGameRole) nc5Var.m162488l(HideAndSeekGameRole.PROTOBUF_ADAPTER);
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HideAndSeekInfoData hideAndSeekInfoData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            HideAndSeekGameInfo hideAndSeekGameInfo = hideAndSeekInfoData.gameInfo;
            if (hideAndSeekGameInfo != null) {
                codedOutputByteBufferNano.m17309K(1, hideAndSeekGameInfo, HideAndSeekGameInfo.PROTOBUF_ADAPTER);
            }
            HideAndSeekGameRole hideAndSeekGameRole = hideAndSeekInfoData.gameRole;
            if (hideAndSeekGameRole != null) {
                codedOutputByteBufferNano.m17309K(2, hideAndSeekGameRole, HideAndSeekGameRole.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HideAndSeekInfoData> JSON_ADAPTER = new ObjectJsonAdapter<HideAndSeekInfoData>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekInfoData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HideAndSeekInfoData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HideAndSeekInfoData newInstance() {
            return new HideAndSeekInfoData();
        }

        public boolean parseField(HideAndSeekInfoData hideAndSeekInfoData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("gameInfo")) {
                hideAndSeekInfoData.gameInfo = HideAndSeekGameInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("gameRole")) {
                return false;
            }
            hideAndSeekInfoData.gameRole = HideAndSeekGameRole.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(HideAndSeekInfoData hideAndSeekInfoData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("gameInfo") || str.equals("gameRole")) {
                return true;
            }
            return super.parseFieldCheck(hideAndSeekInfoData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HideAndSeekInfoData hideAndSeekInfoData, JsonGenerator jsonGenerator) throws IOException {
            if (hideAndSeekInfoData.gameInfo != null) {
                jsonGenerator.writeFieldName("gameInfo");
                HideAndSeekGameInfo.JSON_ADAPTER.serialize(hideAndSeekInfoData.gameInfo, jsonGenerator, true);
            }
            if (hideAndSeekInfoData.gameRole != null) {
                jsonGenerator.writeFieldName("gameRole");
                HideAndSeekGameRole.JSON_ADAPTER.serialize(hideAndSeekInfoData.gameRole, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HideAndSeekInfoData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HideAndSeekInfoData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HideAndSeekInfoData new_() {
        HideAndSeekInfoData hideAndSeekInfoData = new HideAndSeekInfoData();
        hideAndSeekInfoData.nullCheck();
        return hideAndSeekInfoData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HideAndSeekInfoData mo225055clone() {
        HideAndSeekInfoData hideAndSeekInfoData = new HideAndSeekInfoData();
        HideAndSeekGameInfo hideAndSeekGameInfo = this.gameInfo;
        if (hideAndSeekGameInfo != null) {
            hideAndSeekInfoData.gameInfo = hideAndSeekGameInfo.mo225055clone();
        }
        HideAndSeekGameRole hideAndSeekGameRole = this.gameRole;
        if (hideAndSeekGameRole != null) {
            hideAndSeekInfoData.gameRole = hideAndSeekGameRole.mo225055clone();
        }
        return hideAndSeekInfoData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HideAndSeekInfoData)) {
            return false;
        }
        HideAndSeekInfoData hideAndSeekInfoData = (HideAndSeekInfoData) obj;
        return ValueObject.util_equals(this.gameInfo, hideAndSeekInfoData.gameInfo) && ValueObject.util_equals(this.gameRole, hideAndSeekInfoData.gameRole);
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
        HideAndSeekGameInfo hideAndSeekGameInfo = this.gameInfo;
        int iHashCode = (i2 + (hideAndSeekGameInfo != null ? hideAndSeekGameInfo.hashCode() : 0)) * 41;
        HideAndSeekGameRole hideAndSeekGameRole = this.gameRole;
        int iHashCode2 = iHashCode + (hideAndSeekGameRole != null ? hideAndSeekGameRole.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
