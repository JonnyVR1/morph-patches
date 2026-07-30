package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.HomeTabModuleTopic;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class HomeTabModule extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hometabmodule";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public HomeTabModuleId f77id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<HomeTabModuleTopic> topics;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<HomeTabModule> PROTOBUF_ADAPTER = new MessageNanoAdapter<HomeTabModule>() { // from class: com.p1.mobile.putong.core.data.HomeTabModule.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HomeTabModule homeTabModule) {
            HomeTabModuleId homeTabModuleId = homeTabModule.f77id;
            int iH = homeTabModuleId != null ? CodedOutputByteBufferNano.h(1, homeTabModuleId.ordinal()) : 0;
            String str = homeTabModule.type;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            List<HomeTabModuleTopic> list = homeTabModule.topics;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(3, list, HomeTabModuleTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            HomeTabModuleId homeTabModuleId2 = homeTabModule.f77id;
            if (homeTabModuleId2 != null) {
                iH += CodedOutputByteBufferNano.l(4, homeTabModuleId2, HomeTabModuleId.PROTOBUF_ADAPTER);
            }
            ((MessageNano) homeTabModule).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HomeTabModule m13319parse(nb5 nb5Var) throws IOException {
            HomeTabModule homeTabModule = new HomeTabModule();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (homeTabModule.f77id == null && numValueOf != null) {
                        homeTabModule.f77id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (homeTabModule.f77id == null) {
                        homeTabModule.f77id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.defaultEnum();
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
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 18) {
                    homeTabModule.type = nb5Var.s();
                } else if (iU == 26) {
                    homeTabModule.topics = (List) nb5Var.l(HomeTabModuleTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 34) {
                        if (homeTabModule.f77id == null && numValueOf != null) {
                            homeTabModule.f77id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (homeTabModule.f77id == null) {
                            homeTabModule.f77id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.defaultEnum();
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
                    homeTabModule.f77id = (HomeTabModuleId) nb5Var.l(HomeTabModuleId.PROTOBUF_ADAPTER);
                }
            }
            return homeTabModule;
        }

        public void serialize(HomeTabModule homeTabModule, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            HomeTabModuleId homeTabModuleId = homeTabModule.f77id;
            if (homeTabModuleId != null) {
                codedOutputByteBufferNano.G(1, homeTabModuleId.ordinal());
            }
            String str = homeTabModule.type;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            List<HomeTabModuleTopic> list = homeTabModule.topics;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, HomeTabModuleTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            HomeTabModuleId homeTabModuleId2 = homeTabModule.f77id;
            if (homeTabModuleId2 != null) {
                codedOutputByteBufferNano.K(4, homeTabModuleId2, HomeTabModuleId.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HomeTabModule> JSON_ADAPTER = new ObjectJsonAdapter<HomeTabModule>() { // from class: com.p1.mobile.putong.core.data.HomeTabModule.2
        public Class getDataClass() {
            return HomeTabModule.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HomeTabModule m13320newInstance() {
            return new HomeTabModule();
        }

        public boolean parseField(HomeTabModule homeTabModule, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "topics":
                    homeTabModule.topics = JsonAdapter.parseArray(jsonParser, HomeTabModuleTopic.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    homeTabModule.f77id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.parse(jsonParser, str2);
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

        public void serializeFields(HomeTabModule homeTabModule, JsonGenerator jsonGenerator) throws IOException {
            if (homeTabModule.f77id != null) {
                jsonGenerator.writeFieldName("id");
                HomeTabModuleId.JSON_ADAPTER.serialize(homeTabModule.f77id, jsonGenerator, true);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HomeTabModule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HomeTabModule) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HomeTabModule new_() {
        HomeTabModule homeTabModule = new HomeTabModule();
        homeTabModule.nullCheck();
        return homeTabModule;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HomeTabModule m13318clone() {
        HomeTabModule homeTabModule = new HomeTabModule();
        homeTabModule.f77id = this.f77id;
        homeTabModule.type = this.type;
        List<HomeTabModuleTopic> list = this.topics;
        if (list != null) {
            homeTabModule.topics = ValueObject.util_map(list, new w9j() { // from class: l.d9l
                public final Object call(Object obj) {
                    return ((HomeTabModuleTopic) obj).m13324clone();
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
        return ValueObject.util_equals(this.f77id, homeTabModule.f77id) && ValueObject.util_equals(this.type, homeTabModule.type) && ValueObject.util_equals(this.topics, homeTabModule.topics);
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
        HomeTabModuleId homeTabModuleId = this.f77id;
        int iHashCode = (i2 + (homeTabModuleId != null ? homeTabModuleId.hashCode() : 0)) * 41;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        List<HomeTabModuleTopic> list = this.topics;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f77id == null) {
            this.f77id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.defaultEnum();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.topics == null) {
            this.topics = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
