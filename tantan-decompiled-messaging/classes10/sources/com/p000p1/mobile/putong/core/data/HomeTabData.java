package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.HomeTabShowUser;
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
public class HomeTabData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hometabdata";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public HomeTabModuleId f76id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<HomeTabShowUser> showUsers;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;

    @ProtobufIndex(index = 4)
    public int userCount;
    public static ProtobufAdapter<HomeTabData> PROTOBUF_ADAPTER = new MessageNanoAdapter<HomeTabData>() { // from class: com.p1.mobile.putong.core.data.HomeTabData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HomeTabData homeTabData) {
            HomeTabModuleId homeTabModuleId = homeTabData.f76id;
            int iH = homeTabModuleId != null ? CodedOutputByteBufferNano.h(1, homeTabModuleId.ordinal()) : 0;
            String str = homeTabData.type;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            List<HomeTabShowUser> list = homeTabData.showUsers;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(3, list, HomeTabShowUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(4, homeTabData.userCount);
            HomeTabModuleId homeTabModuleId2 = homeTabData.f76id;
            if (homeTabModuleId2 != null) {
                iH2 += CodedOutputByteBufferNano.l(5, homeTabModuleId2, HomeTabModuleId.PROTOBUF_ADAPTER);
            }
            ((MessageNano) homeTabData).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HomeTabData m13315parse(nb5 nb5Var) throws IOException {
            HomeTabData homeTabData = new HomeTabData();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (homeTabData.f76id == null && numValueOf != null) {
                        homeTabData.f76id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (homeTabData.f76id == null) {
                        homeTabData.f76id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.defaultEnum();
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
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 18) {
                    homeTabData.type = nb5Var.s();
                } else if (iU == 26) {
                    homeTabData.showUsers = (List) nb5Var.l(HomeTabShowUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 32) {
                    homeTabData.userCount = nb5Var.j();
                } else {
                    if (iU != 42) {
                        if (homeTabData.f76id == null && numValueOf != null) {
                            homeTabData.f76id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (homeTabData.f76id == null) {
                            homeTabData.f76id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.defaultEnum();
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
                    homeTabData.f76id = (HomeTabModuleId) nb5Var.l(HomeTabModuleId.PROTOBUF_ADAPTER);
                }
            }
            return homeTabData;
        }

        public void serialize(HomeTabData homeTabData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            HomeTabModuleId homeTabModuleId = homeTabData.f76id;
            if (homeTabModuleId != null) {
                codedOutputByteBufferNano.G(1, homeTabModuleId.ordinal());
            }
            String str = homeTabData.type;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            List<HomeTabShowUser> list = homeTabData.showUsers;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, HomeTabShowUser.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(4, homeTabData.userCount);
            HomeTabModuleId homeTabModuleId2 = homeTabData.f76id;
            if (homeTabModuleId2 != null) {
                codedOutputByteBufferNano.K(5, homeTabModuleId2, HomeTabModuleId.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HomeTabData> JSON_ADAPTER = new ObjectJsonAdapter<HomeTabData>() { // from class: com.p1.mobile.putong.core.data.HomeTabData.2
        public Class getDataClass() {
            return HomeTabData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HomeTabData m13316newInstance() {
            return new HomeTabData();
        }

        public boolean parseField(HomeTabData homeTabData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "showUsers":
                    homeTabData.showUsers = JsonAdapter.parseArray(jsonParser, HomeTabShowUser.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    homeTabData.f76id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.parse(jsonParser, str2);
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

        public void serializeFields(HomeTabData homeTabData, JsonGenerator jsonGenerator) throws IOException {
            if (homeTabData.f76id != null) {
                jsonGenerator.writeFieldName("id");
                HomeTabModuleId.JSON_ADAPTER.serialize(homeTabData.f76id, jsonGenerator, true);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HomeTabData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HomeTabData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HomeTabData new_() {
        HomeTabData homeTabData = new HomeTabData();
        homeTabData.nullCheck();
        return homeTabData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HomeTabData m13314clone() {
        HomeTabData homeTabData = new HomeTabData();
        homeTabData.f76id = this.f76id;
        homeTabData.type = this.type;
        List<HomeTabShowUser> list = this.showUsers;
        if (list != null) {
            homeTabData.showUsers = ValueObject.util_map(list, new w9j() { // from class: l.c9l
                public final Object call(Object obj) {
                    return ((HomeTabShowUser) obj).m13332clone();
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
        return ValueObject.util_equals(this.f76id, homeTabData.f76id) && ValueObject.util_equals(this.type, homeTabData.type) && ValueObject.util_equals(this.showUsers, homeTabData.showUsers) && this.userCount == homeTabData.userCount;
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
        HomeTabModuleId homeTabModuleId = this.f76id;
        int iHashCode = (i2 + (homeTabModuleId != null ? homeTabModuleId.hashCode() : 0)) * 41;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        List<HomeTabShowUser> list = this.showUsers;
        int iHashCode3 = ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 41) + this.userCount;
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f76id == null) {
            this.f76id = (HomeTabModuleId) HomeTabModuleId.JSON_ADAPTER.defaultEnum();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.showUsers == null) {
            this.showUsers = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
