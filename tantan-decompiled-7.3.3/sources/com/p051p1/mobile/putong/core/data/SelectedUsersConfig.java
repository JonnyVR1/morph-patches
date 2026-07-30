package com.p051p1.mobile.putong.core.data;

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
public class SelectedUsersConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "selectedusersconfig";

    @ProtobufIndex(index = 3)
    public boolean enabled;

    @ProtobufIndex(index = 1)
    public int leftSlidingTriggersCardInsertion;

    @ProtobufIndex(index = 2)
    public int picksZoneEntranceRefreshFreqControl;
    public static ProtobufAdapter<SelectedUsersConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<SelectedUsersConfig>() { // from class: com.p1.mobile.putong.core.data.SelectedUsersConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SelectedUsersConfig selectedUsersConfig) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, selectedUsersConfig.leftSlidingTriggersCardInsertion) + CodedOutputByteBufferNano.m17281h(2, selectedUsersConfig.picksZoneEntranceRefreshFreqControl) + CodedOutputByteBufferNano.m17275b(3, selectedUsersConfig.enabled);
            selectedUsersConfig.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SelectedUsersConfig parse(nc5 nc5Var) throws IOException {
            SelectedUsersConfig selectedUsersConfig = new SelectedUsersConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    selectedUsersConfig.leftSlidingTriggersCardInsertion = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    selectedUsersConfig.picksZoneEntranceRefreshFreqControl = nc5Var.m162486j();
                } else {
                    if (iM162497u != 24) {
                        return selectedUsersConfig;
                    }
                    selectedUsersConfig.enabled = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SelectedUsersConfig selectedUsersConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, selectedUsersConfig.leftSlidingTriggersCardInsertion);
            codedOutputByteBufferNano.m17305G(2, selectedUsersConfig.picksZoneEntranceRefreshFreqControl);
            codedOutputByteBufferNano.m17299A(3, selectedUsersConfig.enabled);
        }
    };
    public static JsonAdapter<SelectedUsersConfig> JSON_ADAPTER = new ObjectJsonAdapter<SelectedUsersConfig>() { // from class: com.p1.mobile.putong.core.data.SelectedUsersConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SelectedUsersConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SelectedUsersConfig newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SelectedUsersConfig selectedUsersConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("leftSlidingTriggersCardInsertion", selectedUsersConfig.leftSlidingTriggersCardInsertion);
            jsonGenerator.writeNumberField("picksZoneEntranceRefreshFreqControl", selectedUsersConfig.picksZoneEntranceRefreshFreqControl);
            jsonGenerator.writeBooleanField("enabled", selectedUsersConfig.enabled);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SelectedUsersConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SelectedUsersConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SelectedUsersConfig new_() {
        SelectedUsersConfig selectedUsersConfig = new SelectedUsersConfig();
        selectedUsersConfig.nullCheck();
        return selectedUsersConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SelectedUsersConfig mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.leftSlidingTriggersCardInsertion) * 41) + this.picksZoneEntranceRefreshFreqControl) * 41) + (this.enabled ? 1231 : 1237);
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
