package com.p046p1.mobile.putong.core.data;

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
public class UltraRightsUpgradeInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ultrarightsupgradeinfo";

    @ProtobufIndex(index = 1)
    public boolean isCanUpgradeUltra;

    @ProtobufIndex(index = 2)
    public int upgradeUltraDay;
    public static ProtobufAdapter<UltraRightsUpgradeInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<UltraRightsUpgradeInfo>() { // from class: com.p1.mobile.putong.core.data.UltraRightsUpgradeInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UltraRightsUpgradeInfo ultraRightsUpgradeInfo) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, ultraRightsUpgradeInfo.isCanUpgradeUltra) + CodedOutputByteBufferNano.m17226h(2, ultraRightsUpgradeInfo.upgradeUltraDay);
            ultraRightsUpgradeInfo.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UltraRightsUpgradeInfo parse(nb5 nb5Var) throws IOException {
            UltraRightsUpgradeInfo ultraRightsUpgradeInfo = new UltraRightsUpgradeInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    ultraRightsUpgradeInfo.isCanUpgradeUltra = nb5Var.m158738g();
                } else {
                    if (iM158752u != 16) {
                        return ultraRightsUpgradeInfo;
                    }
                    ultraRightsUpgradeInfo.upgradeUltraDay = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UltraRightsUpgradeInfo ultraRightsUpgradeInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, ultraRightsUpgradeInfo.isCanUpgradeUltra);
            codedOutputByteBufferNano.m17250G(2, ultraRightsUpgradeInfo.upgradeUltraDay);
        }
    };
    public static JsonAdapter<UltraRightsUpgradeInfo> JSON_ADAPTER = new ObjectJsonAdapter<UltraRightsUpgradeInfo>() { // from class: com.p1.mobile.putong.core.data.UltraRightsUpgradeInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UltraRightsUpgradeInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UltraRightsUpgradeInfo newInstance() {
            return new UltraRightsUpgradeInfo();
        }

        public boolean parseField(UltraRightsUpgradeInfo ultraRightsUpgradeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("is_can_upgrade_ultra")) {
                ultraRightsUpgradeInfo.isCanUpgradeUltra = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("upgrade_ultra_day")) {
                return false;
            }
            ultraRightsUpgradeInfo.upgradeUltraDay = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(UltraRightsUpgradeInfo ultraRightsUpgradeInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("is_can_upgrade_ultra") || str.equals("upgrade_ultra_day")) {
                return true;
            }
            return super.parseFieldCheck(ultraRightsUpgradeInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UltraRightsUpgradeInfo ultraRightsUpgradeInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("is_can_upgrade_ultra", ultraRightsUpgradeInfo.isCanUpgradeUltra);
            jsonGenerator.writeNumberField("upgrade_ultra_day", ultraRightsUpgradeInfo.upgradeUltraDay);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UltraRightsUpgradeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UltraRightsUpgradeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UltraRightsUpgradeInfo new_() {
        UltraRightsUpgradeInfo ultraRightsUpgradeInfo = new UltraRightsUpgradeInfo();
        ultraRightsUpgradeInfo.nullCheck();
        return ultraRightsUpgradeInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UltraRightsUpgradeInfo mo223809clone() {
        UltraRightsUpgradeInfo ultraRightsUpgradeInfo = new UltraRightsUpgradeInfo();
        ultraRightsUpgradeInfo.isCanUpgradeUltra = this.isCanUpgradeUltra;
        ultraRightsUpgradeInfo.upgradeUltraDay = this.upgradeUltraDay;
        return ultraRightsUpgradeInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UltraRightsUpgradeInfo)) {
            return false;
        }
        UltraRightsUpgradeInfo ultraRightsUpgradeInfo = (UltraRightsUpgradeInfo) obj;
        return this.isCanUpgradeUltra == ultraRightsUpgradeInfo.isCanUpgradeUltra && this.upgradeUltraDay == ultraRightsUpgradeInfo.upgradeUltraDay;
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
        int i2 = (((i * 41) + (this.isCanUpgradeUltra ? 1231 : 1237)) * 41) + this.upgradeUltraDay;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
