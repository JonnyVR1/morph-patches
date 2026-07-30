package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.HomeTabShowUser;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class HomeTabData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hometabdata";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public HomeTabModuleId f21156id;

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
            HomeTabModuleId homeTabModuleId = homeTabData.f21156id;
            int iM17281h = homeTabModuleId != null ? CodedOutputByteBufferNano.m17281h(1, homeTabModuleId.ordinal()) : 0;
            String str = homeTabData.type;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            List<HomeTabShowUser> list = homeTabData.showUsers;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(3, list, HomeTabShowUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(4, homeTabData.userCount);
            HomeTabModuleId homeTabModuleId2 = homeTabData.f21156id;
            if (homeTabModuleId2 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17285l(5, homeTabModuleId2, HomeTabModuleId.PROTOBUF_ADAPTER);
            }
            homeTabData.cachedSize = iM17281h2;
            return iM17281h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HomeTabData parse(nc5 nc5Var) throws IOException {
            HomeTabData homeTabData = new HomeTabData();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (homeTabData.f21156id == null && numValueOf != null) {
                        homeTabData.f21156id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (homeTabData.f21156id == null) {
                        homeTabData.f21156id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.defaultEnum();
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
                if (iM162497u == 8) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 18) {
                    homeTabData.type = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    homeTabData.showUsers = (List) nc5Var.m162488l(HomeTabShowUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 32) {
                    homeTabData.userCount = nc5Var.m162486j();
                } else {
                    if (iM162497u != 42) {
                        if (homeTabData.f21156id == null && numValueOf != null) {
                            homeTabData.f21156id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (homeTabData.f21156id == null) {
                            homeTabData.f21156id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.defaultEnum();
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
                    homeTabData.f21156id = (HomeTabModuleId) nc5Var.m162488l(HomeTabModuleId.PROTOBUF_ADAPTER);
                }
            }
            return homeTabData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HomeTabData homeTabData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            HomeTabModuleId homeTabModuleId = homeTabData.f21156id;
            if (homeTabModuleId != null) {
                codedOutputByteBufferNano.m17305G(1, homeTabModuleId.ordinal());
            }
            String str = homeTabData.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            List<HomeTabShowUser> list = homeTabData.showUsers;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, HomeTabShowUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(4, homeTabData.userCount);
            HomeTabModuleId homeTabModuleId2 = homeTabData.f21156id;
            if (homeTabModuleId2 != null) {
                codedOutputByteBufferNano.m17309K(5, homeTabModuleId2, HomeTabModuleId.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HomeTabData> JSON_ADAPTER = new ObjectJsonAdapter<HomeTabData>() { // from class: com.p1.mobile.putong.core.data.HomeTabData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HomeTabData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    homeTabData.f21156id = HomeTabModuleId.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HomeTabData homeTabData, JsonGenerator jsonGenerator) throws IOException {
            if (homeTabData.f21156id != null) {
                jsonGenerator.writeFieldName("id");
                HomeTabModuleId.JSON_ADAPTER.serialize(homeTabData.f21156id, jsonGenerator, true);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HomeTabData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public HomeTabData mo225055clone() {
        HomeTabData homeTabData = new HomeTabData();
        homeTabData.f21156id = this.f21156id;
        homeTabData.type = this.type;
        List<HomeTabShowUser> list = this.showUsers;
        if (list != null) {
            homeTabData.showUsers = ValueObject.util_map(list, new qcj() { // from class: l.sbl
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((HomeTabShowUser) obj).mo225055clone();
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
        return ValueObject.util_equals(this.f21156id, homeTabData.f21156id) && ValueObject.util_equals(this.type, homeTabData.type) && ValueObject.util_equals(this.showUsers, homeTabData.showUsers) && this.userCount == homeTabData.userCount;
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
        HomeTabModuleId homeTabModuleId = this.f21156id;
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
        if (this.f21156id == null) {
            this.f21156id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.defaultEnum();
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
