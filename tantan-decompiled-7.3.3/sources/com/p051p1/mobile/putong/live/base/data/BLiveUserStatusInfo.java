package com.p051p1.mobile.putong.live.base.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveUserStatusInfo extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveUserStatusInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveUserStatusInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveUserStatusInfo.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveUserStatusInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveUserStatusInfo newInstance() {
            return new BLiveUserStatusInfo();
        }

        public boolean parseField(BLiveUserStatusInfo bLiveUserStatusInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isSidebarNewUser")) {
                return false;
            }
            bLiveUserStatusInfo.isSidebarNewUser = jsonParser.getValueAsBoolean();
            return true;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveUserStatusInfo bLiveUserStatusInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isSidebarNewUser", bLiveUserStatusInfo.isSidebarNewUser);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveUserStatusInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "bliveuserstatusinfo";

    @ProtobufIndex(index = 1)
    public boolean isSidebarNewUser;

    public static BLiveUserStatusInfo new_() {
        BLiveUserStatusInfo bLiveUserStatusInfo = new BLiveUserStatusInfo();
        bLiveUserStatusInfo.nullCheck();
        return bLiveUserStatusInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveUserStatusInfo mo225055clone() {
        BLiveUserStatusInfo bLiveUserStatusInfo = new BLiveUserStatusInfo();
        bLiveUserStatusInfo.isSidebarNewUser = this.isSidebarNewUser;
        return bLiveUserStatusInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BLiveUserStatusInfo) && this.isSidebarNewUser == ((BLiveUserStatusInfo) obj).isSidebarNewUser;
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
        int i2 = (i * 41) + (this.isSidebarNewUser ? 1231 : 1237);
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
