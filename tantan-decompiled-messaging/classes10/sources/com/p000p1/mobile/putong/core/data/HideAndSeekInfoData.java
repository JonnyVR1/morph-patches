package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
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
public class HideAndSeekInfoData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hideandseekinfodata";

    @Nullable
    @ProtobufIndex(index = 1)
    public HideAndSeekGameInfo gameInfo;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public HideAndSeekGameRole gameRole;
    public static ProtobufAdapter<HideAndSeekInfoData> PROTOBUF_ADAPTER = new MessageNanoAdapter<HideAndSeekInfoData>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekInfoData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HideAndSeekInfoData hideAndSeekInfoData) {
            HideAndSeekGameInfo hideAndSeekGameInfo = hideAndSeekInfoData.gameInfo;
            int iL = hideAndSeekGameInfo != null ? CodedOutputByteBufferNano.l(1, hideAndSeekGameInfo, HideAndSeekGameInfo.PROTOBUF_ADAPTER) : 0;
            HideAndSeekGameRole hideAndSeekGameRole = hideAndSeekInfoData.gameRole;
            if (hideAndSeekGameRole != null) {
                iL += CodedOutputByteBufferNano.l(2, hideAndSeekGameRole, HideAndSeekGameRole.PROTOBUF_ADAPTER);
            }
            ((MessageNano) hideAndSeekInfoData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HideAndSeekInfoData m13275parse(nb5 nb5Var) throws IOException {
            HideAndSeekInfoData hideAndSeekInfoData = new HideAndSeekInfoData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    hideAndSeekInfoData.gameInfo = (HideAndSeekGameInfo) nb5Var.l(HideAndSeekGameInfo.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        return hideAndSeekInfoData;
                    }
                    hideAndSeekInfoData.gameRole = (HideAndSeekGameRole) nb5Var.l(HideAndSeekGameRole.PROTOBUF_ADAPTER);
                }
            }
        }

        public void serialize(HideAndSeekInfoData hideAndSeekInfoData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            HideAndSeekGameInfo hideAndSeekGameInfo = hideAndSeekInfoData.gameInfo;
            if (hideAndSeekGameInfo != null) {
                codedOutputByteBufferNano.K(1, hideAndSeekGameInfo, HideAndSeekGameInfo.PROTOBUF_ADAPTER);
            }
            HideAndSeekGameRole hideAndSeekGameRole = hideAndSeekInfoData.gameRole;
            if (hideAndSeekGameRole != null) {
                codedOutputByteBufferNano.K(2, hideAndSeekGameRole, HideAndSeekGameRole.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HideAndSeekInfoData> JSON_ADAPTER = new ObjectJsonAdapter<HideAndSeekInfoData>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekInfoData.2
        public Class getDataClass() {
            return HideAndSeekInfoData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HideAndSeekInfoData m13276newInstance() {
            return new HideAndSeekInfoData();
        }

        public boolean parseField(HideAndSeekInfoData hideAndSeekInfoData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("gameInfo")) {
                hideAndSeekInfoData.gameInfo = (HideAndSeekGameInfo) HideAndSeekGameInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("gameRole")) {
                return false;
            }
            hideAndSeekInfoData.gameRole = (HideAndSeekGameRole) HideAndSeekGameRole.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(HideAndSeekInfoData hideAndSeekInfoData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("gameInfo") || str.equals("gameRole")) {
                return true;
            }
            return super.parseFieldCheck(hideAndSeekInfoData, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HideAndSeekInfoData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HideAndSeekInfoData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HideAndSeekInfoData new_() {
        HideAndSeekInfoData hideAndSeekInfoData = new HideAndSeekInfoData();
        hideAndSeekInfoData.nullCheck();
        return hideAndSeekInfoData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HideAndSeekInfoData m13274clone() {
        HideAndSeekInfoData hideAndSeekInfoData = new HideAndSeekInfoData();
        HideAndSeekGameInfo hideAndSeekGameInfo = this.gameInfo;
        if (hideAndSeekGameInfo != null) {
            hideAndSeekInfoData.gameInfo = hideAndSeekGameInfo.m13262clone();
        }
        HideAndSeekGameRole hideAndSeekGameRole = this.gameRole;
        if (hideAndSeekGameRole != null) {
            hideAndSeekInfoData.gameRole = hideAndSeekGameRole.m13266clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        HideAndSeekGameInfo hideAndSeekGameInfo = this.gameInfo;
        int iHashCode = (i2 + (hideAndSeekGameInfo != null ? hideAndSeekGameInfo.hashCode() : 0)) * 41;
        HideAndSeekGameRole hideAndSeekGameRole = this.gameRole;
        int iHashCode2 = iHashCode + (hideAndSeekGameRole != null ? hideAndSeekGameRole.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
