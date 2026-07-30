package com.p000p1.mobile.putong.core.data;

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
public class UltraRightsUpgradeInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ultrarightsupgradeinfo";

    @ProtobufIndex(index = 1)
    public boolean isCanUpgradeUltra;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int upgradeUltraDay;
    public static ProtobufAdapter<UltraRightsUpgradeInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<UltraRightsUpgradeInfo>() { // from class: com.p1.mobile.putong.core.data.UltraRightsUpgradeInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UltraRightsUpgradeInfo ultraRightsUpgradeInfo) {
            int iB = CodedOutputByteBufferNano.b(1, ultraRightsUpgradeInfo.isCanUpgradeUltra) + CodedOutputByteBufferNano.h(2, ultraRightsUpgradeInfo.upgradeUltraDay);
            ((MessageNano) ultraRightsUpgradeInfo).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UltraRightsUpgradeInfo m16080parse(nb5 nb5Var) throws IOException {
            UltraRightsUpgradeInfo ultraRightsUpgradeInfo = new UltraRightsUpgradeInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    ultraRightsUpgradeInfo.isCanUpgradeUltra = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return ultraRightsUpgradeInfo;
                    }
                    ultraRightsUpgradeInfo.upgradeUltraDay = nb5Var.j();
                }
            }
        }

        public void serialize(UltraRightsUpgradeInfo ultraRightsUpgradeInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, ultraRightsUpgradeInfo.isCanUpgradeUltra);
            codedOutputByteBufferNano.G(2, ultraRightsUpgradeInfo.upgradeUltraDay);
        }
    };
    public static JsonAdapter<UltraRightsUpgradeInfo> JSON_ADAPTER = new ObjectJsonAdapter<UltraRightsUpgradeInfo>() { // from class: com.p1.mobile.putong.core.data.UltraRightsUpgradeInfo.2
        public Class getDataClass() {
            return UltraRightsUpgradeInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UltraRightsUpgradeInfo m16081newInstance() {
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

        public void serializeFields(UltraRightsUpgradeInfo ultraRightsUpgradeInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("is_can_upgrade_ultra", ultraRightsUpgradeInfo.isCanUpgradeUltra);
            jsonGenerator.writeNumberField("upgrade_ultra_day", ultraRightsUpgradeInfo.upgradeUltraDay);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UltraRightsUpgradeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UltraRightsUpgradeInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static UltraRightsUpgradeInfo new_() {
        UltraRightsUpgradeInfo ultraRightsUpgradeInfo = new UltraRightsUpgradeInfo();
        ultraRightsUpgradeInfo.nullCheck();
        return ultraRightsUpgradeInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UltraRightsUpgradeInfo m16079clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.isCanUpgradeUltra ? 1231 : 1237)) * 41) + this.upgradeUltraDay;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
