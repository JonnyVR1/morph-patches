package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.HomeTabModuleTopic;
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
public class HomeTabModule extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hometabmodule";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public HomeTabModuleId f20415id;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<HomeTabModuleTopic> topics;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<HomeTabModule> PROTOBUF_ADAPTER = new MessageNanoAdapter<HomeTabModule>() { // from class: com.p1.mobile.putong.core.data.HomeTabModule.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HomeTabModule homeTabModule) {
            HomeTabModuleId homeTabModuleId = homeTabModule.f20415id;
            int iM17226h = homeTabModuleId != null ? CodedOutputByteBufferNano.m17226h(1, homeTabModuleId.ordinal()) : 0;
            String str = homeTabModule.type;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            List<HomeTabModuleTopic> list = homeTabModule.topics;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(3, list, HomeTabModuleTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            HomeTabModuleId homeTabModuleId2 = homeTabModule.f20415id;
            if (homeTabModuleId2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(4, homeTabModuleId2, HomeTabModuleId.PROTOBUF_ADAPTER);
            }
            homeTabModule.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HomeTabModule parse(nb5 nb5Var) throws IOException {
            HomeTabModule homeTabModule = new HomeTabModule();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (homeTabModule.f20415id == null && numValueOf != null) {
                        homeTabModule.f20415id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (homeTabModule.f20415id == null) {
                        homeTabModule.f20415id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.defaultEnum();
                    }
                    if (homeTabModule.type == null) {
                        homeTabModule.type = "";
                    }
                    if (homeTabModule.topics != null) {
                        break;
                    }
                    homeTabModule.topics = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 18) {
                    homeTabModule.type = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    homeTabModule.topics = (List) nb5Var.m158743l(HomeTabModuleTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 34) {
                        if (homeTabModule.f20415id == null && numValueOf != null) {
                            homeTabModule.f20415id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (homeTabModule.f20415id == null) {
                            homeTabModule.f20415id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.defaultEnum();
                        }
                        if (homeTabModule.type == null) {
                            homeTabModule.type = "";
                        }
                        if (homeTabModule.topics != null) {
                            break;
                        }
                        homeTabModule.topics = new ArrayList();
                        return homeTabModule;
                    }
                    homeTabModule.f20415id = (HomeTabModuleId) nb5Var.m158743l(HomeTabModuleId.PROTOBUF_ADAPTER);
                }
            }
            return homeTabModule;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HomeTabModule homeTabModule, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            HomeTabModuleId homeTabModuleId = homeTabModule.f20415id;
            if (homeTabModuleId != null) {
                codedOutputByteBufferNano.m17250G(1, homeTabModuleId.ordinal());
            }
            String str = homeTabModule.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            List<HomeTabModuleTopic> list = homeTabModule.topics;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, HomeTabModuleTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            HomeTabModuleId homeTabModuleId2 = homeTabModule.f20415id;
            if (homeTabModuleId2 != null) {
                codedOutputByteBufferNano.m17254K(4, homeTabModuleId2, HomeTabModuleId.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HomeTabModule> JSON_ADAPTER = new ObjectJsonAdapter<HomeTabModule>() { // from class: com.p1.mobile.putong.core.data.HomeTabModule.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HomeTabModule.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HomeTabModule newInstance() {
            return new HomeTabModule();
        }

        public boolean parseField(HomeTabModule homeTabModule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "topics":
                    homeTabModule.topics = JsonAdapter.parseArray(jsonParser, HomeTabModuleTopic.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    homeTabModule.f20415id = HomeTabModuleId.JSON_ADAPTER.parse(jsonParser, str2);
                    return false;
                case "type":
                    homeTabModule.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(HomeTabModule homeTabModule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "topics":
                    return true;
                case "id":
                    return false;
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(homeTabModule, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HomeTabModule homeTabModule, JsonGenerator jsonGenerator) throws IOException {
            if (homeTabModule.f20415id != null) {
                jsonGenerator.writeFieldName("id");
                HomeTabModuleId.JSON_ADAPTER.serialize(homeTabModule.f20415id, jsonGenerator, true);
            }
            String str = homeTabModule.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            if (homeTabModule.topics != null) {
                jsonGenerator.writeFieldName("topics");
                JsonAdapter.serializeArray(homeTabModule.topics, jsonGenerator, HomeTabModuleTopic.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HomeTabModule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HomeTabModule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HomeTabModule new_() {
        HomeTabModule homeTabModule = new HomeTabModule();
        homeTabModule.nullCheck();
        return homeTabModule;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HomeTabModule mo223809clone() {
        HomeTabModule homeTabModule = new HomeTabModule();
        homeTabModule.f20415id = this.f20415id;
        homeTabModule.type = this.type;
        List<HomeTabModuleTopic> list = this.topics;
        if (list != null) {
            homeTabModule.topics = ValueObject.util_map(list, new w9j() { // from class: l.d9l
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((HomeTabModuleTopic) obj).mo223809clone();
                }
            });
        }
        return homeTabModule;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HomeTabModule)) {
            return false;
        }
        HomeTabModule homeTabModule = (HomeTabModule) obj;
        return ValueObject.util_equals(this.f20415id, homeTabModule.f20415id) && ValueObject.util_equals(this.type, homeTabModule.type) && ValueObject.util_equals(this.topics, homeTabModule.topics);
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
        HomeTabModuleId homeTabModuleId = this.f20415id;
        int iHashCode = (i2 + (homeTabModuleId != null ? homeTabModuleId.hashCode() : 0)) * 41;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        List<HomeTabModuleTopic> list = this.topics;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20415id == null) {
            this.f20415id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.defaultEnum();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.topics == null) {
            this.topics = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
