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
public class SelectedUsersConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "selectedusersconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean enabled;

    @ProtobufIndex(index = 1)
    public int leftSlidingTriggersCardInsertion;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int picksZoneEntranceRefreshFreqControl;
    public static ProtobufAdapter<SelectedUsersConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<SelectedUsersConfig>() { // from class: com.p1.mobile.putong.core.data.SelectedUsersConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SelectedUsersConfig selectedUsersConfig) {
            int iH = CodedOutputByteBufferNano.h(1, selectedUsersConfig.leftSlidingTriggersCardInsertion) + CodedOutputByteBufferNano.h(2, selectedUsersConfig.picksZoneEntranceRefreshFreqControl) + CodedOutputByteBufferNano.b(3, selectedUsersConfig.enabled);
            ((MessageNano) selectedUsersConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SelectedUsersConfig m15561parse(nb5 nb5Var) throws IOException {
            SelectedUsersConfig selectedUsersConfig = new SelectedUsersConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    selectedUsersConfig.leftSlidingTriggersCardInsertion = nb5Var.j();
                } else if (iU == 16) {
                    selectedUsersConfig.picksZoneEntranceRefreshFreqControl = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return selectedUsersConfig;
                    }
                    selectedUsersConfig.enabled = nb5Var.g();
                }
            }
        }

        public void serialize(SelectedUsersConfig selectedUsersConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, selectedUsersConfig.leftSlidingTriggersCardInsertion);
            codedOutputByteBufferNano.G(2, selectedUsersConfig.picksZoneEntranceRefreshFreqControl);
            codedOutputByteBufferNano.A(3, selectedUsersConfig.enabled);
        }
    };
    public static JsonAdapter<SelectedUsersConfig> JSON_ADAPTER = new ObjectJsonAdapter<SelectedUsersConfig>() { // from class: com.p1.mobile.putong.core.data.SelectedUsersConfig.2
        public Class getDataClass() {
            return SelectedUsersConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SelectedUsersConfig m15562newInstance() {
            return new SelectedUsersConfig();
        }

        public boolean parseField(SelectedUsersConfig selectedUsersConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enabled":
                    selectedUsersConfig.enabled = jsonParser.getValueAsBoolean();
                    return true;
                case "leftSlidingTriggersCardInsertion":
                    selectedUsersConfig.leftSlidingTriggersCardInsertion = jsonParser.getValueAsInt();
                    return true;
                case "picksZoneEntranceRefreshFreqControl":
                    selectedUsersConfig.picksZoneEntranceRefreshFreqControl = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SelectedUsersConfig selectedUsersConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enabled":
                case "leftSlidingTriggersCardInsertion":
                case "picksZoneEntranceRefreshFreqControl":
                    return true;
                default:
                    return super.parseFieldCheck(selectedUsersConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SelectedUsersConfig selectedUsersConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("leftSlidingTriggersCardInsertion", selectedUsersConfig.leftSlidingTriggersCardInsertion);
            jsonGenerator.writeNumberField("picksZoneEntranceRefreshFreqControl", selectedUsersConfig.picksZoneEntranceRefreshFreqControl);
            jsonGenerator.writeBooleanField("enabled", selectedUsersConfig.enabled);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SelectedUsersConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SelectedUsersConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SelectedUsersConfig new_() {
        SelectedUsersConfig selectedUsersConfig = new SelectedUsersConfig();
        selectedUsersConfig.nullCheck();
        return selectedUsersConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SelectedUsersConfig m15560clone() {
        SelectedUsersConfig selectedUsersConfig = new SelectedUsersConfig();
        selectedUsersConfig.leftSlidingTriggersCardInsertion = this.leftSlidingTriggersCardInsertion;
        selectedUsersConfig.picksZoneEntranceRefreshFreqControl = this.picksZoneEntranceRefreshFreqControl;
        selectedUsersConfig.enabled = this.enabled;
        return selectedUsersConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectedUsersConfig)) {
            return false;
        }
        SelectedUsersConfig selectedUsersConfig = (SelectedUsersConfig) obj;
        return this.leftSlidingTriggersCardInsertion == selectedUsersConfig.leftSlidingTriggersCardInsertion && this.picksZoneEntranceRefreshFreqControl == selectedUsersConfig.picksZoneEntranceRefreshFreqControl && this.enabled == selectedUsersConfig.enabled;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.leftSlidingTriggersCardInsertion) * 41) + this.picksZoneEntranceRefreshFreqControl) * 41) + (this.enabled ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
