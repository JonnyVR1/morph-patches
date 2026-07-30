package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.HomeTabShowUser;
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
public class HomeTabData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hometabdata";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public HomeTabModuleId f20414id;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<HomeTabShowUser> showUsers;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;

    @ProtobufIndex(index = 4)
    public int userCount;
    public static ProtobufAdapter<HomeTabData> PROTOBUF_ADAPTER = new MessageNanoAdapter<HomeTabData>() { // from class: com.p1.mobile.putong.core.data.HomeTabData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HomeTabData homeTabData) {
            HomeTabModuleId homeTabModuleId = homeTabData.f20414id;
            int iM17226h = homeTabModuleId != null ? CodedOutputByteBufferNano.m17226h(1, homeTabModuleId.ordinal()) : 0;
            String str = homeTabData.type;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            List<HomeTabShowUser> list = homeTabData.showUsers;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(3, list, HomeTabShowUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17226h2 = iM17226h + CodedOutputByteBufferNano.m17226h(4, homeTabData.userCount);
            HomeTabModuleId homeTabModuleId2 = homeTabData.f20414id;
            if (homeTabModuleId2 != null) {
                iM17226h2 += CodedOutputByteBufferNano.m17230l(5, homeTabModuleId2, HomeTabModuleId.PROTOBUF_ADAPTER);
            }
            homeTabData.cachedSize = iM17226h2;
            return iM17226h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HomeTabData parse(nb5 nb5Var) throws IOException {
            HomeTabData homeTabData = new HomeTabData();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (homeTabData.f20414id == null && numValueOf != null) {
                        homeTabData.f20414id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (homeTabData.f20414id == null) {
                        homeTabData.f20414id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.defaultEnum();
                    }
                    if (homeTabData.type == null) {
                        homeTabData.type = "";
                    }
                    if (homeTabData.showUsers != null) {
                        break;
                    }
                    homeTabData.showUsers = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 18) {
                    homeTabData.type = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    homeTabData.showUsers = (List) nb5Var.m158743l(HomeTabShowUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 32) {
                    homeTabData.userCount = nb5Var.m158741j();
                } else {
                    if (iM158752u != 42) {
                        if (homeTabData.f20414id == null && numValueOf != null) {
                            homeTabData.f20414id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (homeTabData.f20414id == null) {
                            homeTabData.f20414id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.defaultEnum();
                        }
                        if (homeTabData.type == null) {
                            homeTabData.type = "";
                        }
                        if (homeTabData.showUsers != null) {
                            break;
                        }
                        homeTabData.showUsers = new ArrayList();
                        return homeTabData;
                    }
                    homeTabData.f20414id = (HomeTabModuleId) nb5Var.m158743l(HomeTabModuleId.PROTOBUF_ADAPTER);
                }
            }
            return homeTabData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HomeTabData homeTabData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            HomeTabModuleId homeTabModuleId = homeTabData.f20414id;
            if (homeTabModuleId != null) {
                codedOutputByteBufferNano.m17250G(1, homeTabModuleId.ordinal());
            }
            String str = homeTabData.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            List<HomeTabShowUser> list = homeTabData.showUsers;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, HomeTabShowUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(4, homeTabData.userCount);
            HomeTabModuleId homeTabModuleId2 = homeTabData.f20414id;
            if (homeTabModuleId2 != null) {
                codedOutputByteBufferNano.m17254K(5, homeTabModuleId2, HomeTabModuleId.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HomeTabData> JSON_ADAPTER = new ObjectJsonAdapter<HomeTabData>() { // from class: com.p1.mobile.putong.core.data.HomeTabData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HomeTabData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HomeTabData newInstance() {
            return new HomeTabData();
        }

        public boolean parseField(HomeTabData homeTabData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "showUsers":
                    homeTabData.showUsers = JsonAdapter.parseArray(jsonParser, HomeTabShowUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    homeTabData.f20414id = HomeTabModuleId.JSON_ADAPTER.parse(jsonParser, str2);
                    return false;
                case "type":
                    homeTabData.type = jsonParser.getValueAsString();
                    return true;
                case "userCount":
                    homeTabData.userCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(HomeTabData homeTabData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "showUsers":
                    return true;
                case "id":
                    return false;
                case "type":
                case "userCount":
                    return true;
                default:
                    return super.parseFieldCheck(homeTabData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HomeTabData homeTabData, JsonGenerator jsonGenerator) throws IOException {
            if (homeTabData.f20414id != null) {
                jsonGenerator.writeFieldName("id");
                HomeTabModuleId.JSON_ADAPTER.serialize(homeTabData.f20414id, jsonGenerator, true);
            }
            String str = homeTabData.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            if (homeTabData.showUsers != null) {
                jsonGenerator.writeFieldName("showUsers");
                JsonAdapter.serializeArray(homeTabData.showUsers, jsonGenerator, HomeTabShowUser.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("userCount", homeTabData.userCount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HomeTabData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HomeTabData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HomeTabData new_() {
        HomeTabData homeTabData = new HomeTabData();
        homeTabData.nullCheck();
        return homeTabData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HomeTabData mo223809clone() {
        HomeTabData homeTabData = new HomeTabData();
        homeTabData.f20414id = this.f20414id;
        homeTabData.type = this.type;
        List<HomeTabShowUser> list = this.showUsers;
        if (list != null) {
            homeTabData.showUsers = ValueObject.util_map(list, new w9j() { // from class: l.c9l
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((HomeTabShowUser) obj).mo223809clone();
                }
            });
        }
        homeTabData.userCount = this.userCount;
        return homeTabData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HomeTabData)) {
            return false;
        }
        HomeTabData homeTabData = (HomeTabData) obj;
        return ValueObject.util_equals(this.f20414id, homeTabData.f20414id) && ValueObject.util_equals(this.type, homeTabData.type) && ValueObject.util_equals(this.showUsers, homeTabData.showUsers) && this.userCount == homeTabData.userCount;
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
        HomeTabModuleId homeTabModuleId = this.f20414id;
        int iHashCode = (i2 + (homeTabModuleId != null ? homeTabModuleId.hashCode() : 0)) * 41;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        List<HomeTabShowUser> list = this.showUsers;
        int iHashCode3 = ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 41) + this.userCount;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20414id == null) {
            this.f20414id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.defaultEnum();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.showUsers == null) {
            this.showUsers = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
