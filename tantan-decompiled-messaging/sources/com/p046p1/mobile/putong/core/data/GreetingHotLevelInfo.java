package com.p046p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.GreetingPermission;
import com.p046p1.mobile.putong.core.data.HotLevel;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class GreetingHotLevelInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "greetinghotlevelinfo";

    @Nullable
    @ProtobufIndex(index = 1)
    public List<GreetingPermission> greetingPermissions;

    @Nullable
    @ProtobufIndex(index = 2)
    public List<Greeting> greetings;

    @Nullable
    @ProtobufIndex(index = 3)
    public List<HotLevel> hotLevels;
    public static ProtobufAdapter<GreetingHotLevelInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingHotLevelInfo>() { // from class: com.p1.mobile.putong.core.data.GreetingHotLevelInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GreetingHotLevelInfo greetingHotLevelInfo) {
            List<GreetingPermission> list = greetingHotLevelInfo.greetingPermissions;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, GreetingPermission.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Greeting> list2 = greetingHotLevelInfo.greetings;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, Greeting.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<HotLevel> list3 = greetingHotLevelInfo.hotLevels;
            if (list3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, list3, HotLevel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            greetingHotLevelInfo.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GreetingHotLevelInfo parse(nb5 nb5Var) throws IOException {
            GreetingHotLevelInfo greetingHotLevelInfo = new GreetingHotLevelInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 10) {
                    greetingHotLevelInfo.greetingPermissions = (List) nb5Var.m158743l(GreetingPermission.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    greetingHotLevelInfo.greetings = (List) nb5Var.m158743l(Greeting.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 26) {
                        return greetingHotLevelInfo;
                    }
                    greetingHotLevelInfo.hotLevels = (List) nb5Var.m158743l(HotLevel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GreetingHotLevelInfo greetingHotLevelInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<GreetingPermission> list = greetingHotLevelInfo.greetingPermissions;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, GreetingPermission.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Greeting> list2 = greetingHotLevelInfo.greetings;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, Greeting.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<HotLevel> list3 = greetingHotLevelInfo.hotLevels;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(3, list3, HotLevel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GreetingHotLevelInfo> JSON_ADAPTER = new ObjectJsonAdapter<GreetingHotLevelInfo>() { // from class: com.p1.mobile.putong.core.data.GreetingHotLevelInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GreetingHotLevelInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GreetingHotLevelInfo newInstance() {
            return new GreetingHotLevelInfo();
        }

        public boolean parseField(GreetingHotLevelInfo greetingHotLevelInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "greetingPermissions":
                    greetingHotLevelInfo.greetingPermissions = JsonAdapter.parseArray(jsonParser, GreetingPermission.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "hotLevels":
                    greetingHotLevelInfo.hotLevels = JsonAdapter.parseArray(jsonParser, HotLevel.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "greetings":
                    greetingHotLevelInfo.greetings = JsonAdapter.parseArray(jsonParser, Greeting.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GreetingHotLevelInfo greetingHotLevelInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "greetingPermissions":
                case "hotLevels":
                case "greetings":
                    return true;
                default:
                    return super.parseFieldCheck(greetingHotLevelInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GreetingHotLevelInfo greetingHotLevelInfo, JsonGenerator jsonGenerator) throws IOException {
            if (greetingHotLevelInfo.greetingPermissions != null) {
                jsonGenerator.writeFieldName("greetingPermissions");
                JsonAdapter.serializeArray(greetingHotLevelInfo.greetingPermissions, jsonGenerator, GreetingPermission.JSON_ADAPTER);
            }
            if (greetingHotLevelInfo.greetings != null) {
                jsonGenerator.writeFieldName("greetings");
                JsonAdapter.serializeArray(greetingHotLevelInfo.greetings, jsonGenerator, Greeting.JSON_ADAPTER);
            }
            if (greetingHotLevelInfo.hotLevels != null) {
                jsonGenerator.writeFieldName("hotLevels");
                JsonAdapter.serializeArray(greetingHotLevelInfo.hotLevels, jsonGenerator, HotLevel.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingHotLevelInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingHotLevelInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingHotLevelInfo new_() {
        GreetingHotLevelInfo greetingHotLevelInfo = new GreetingHotLevelInfo();
        greetingHotLevelInfo.nullCheck();
        return greetingHotLevelInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GreetingHotLevelInfo mo223809clone() {
        GreetingHotLevelInfo greetingHotLevelInfo = new GreetingHotLevelInfo();
        List<GreetingPermission> list = this.greetingPermissions;
        if (list != null) {
            greetingHotLevelInfo.greetingPermissions = ValueObject.util_map(list, new w9j() { // from class: l.kak
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((GreetingPermission) obj).mo223809clone();
                }
            });
        }
        List<Greeting> list2 = this.greetings;
        if (list2 != null) {
            greetingHotLevelInfo.greetings = ValueObject.util_map(list2, new w9j() { // from class: l.lak
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Greeting) obj).mo223809clone();
                }
            });
        }
        List<HotLevel> list3 = this.hotLevels;
        if (list3 != null) {
            greetingHotLevelInfo.hotLevels = ValueObject.util_map(list3, new w9j() { // from class: l.mak
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((HotLevel) obj).mo223809clone();
                }
            });
        }
        return greetingHotLevelInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GreetingHotLevelInfo)) {
            return false;
        }
        GreetingHotLevelInfo greetingHotLevelInfo = (GreetingHotLevelInfo) obj;
        return ValueObject.util_equals(this.greetingPermissions, greetingHotLevelInfo.greetingPermissions) && ValueObject.util_equals(this.greetings, greetingHotLevelInfo.greetings) && ValueObject.util_equals(this.hotLevels, greetingHotLevelInfo.hotLevels);
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
        List<GreetingPermission> list = this.greetingPermissions;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Greeting> list2 = this.greetings;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<HotLevel> list3 = this.hotLevels;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
