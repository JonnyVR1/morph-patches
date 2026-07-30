package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.NearbyBanner;
import com.p051p1.mobile.putong.data.SideBarIconsInfo;
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

/* JADX INFO: loaded from: classes12.dex */
public class OMSSlotsInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsslotsinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public NavigationView navigationView;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<NearbyBanner> nearbyBanners;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<SideBarIconsInfo> sidebarIcons;
    public static ProtobufAdapter<OMSSlotsInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSSlotsInfo>() { // from class: com.p1.mobile.putong.data.OMSSlotsInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSSlotsInfo oMSSlotsInfo) {
            NavigationView navigationView = oMSSlotsInfo.navigationView;
            int iM17285l = navigationView != null ? CodedOutputByteBufferNano.m17285l(1, navigationView, NavigationView.PROTOBUF_ADAPTER) : 0;
            List<NearbyBanner> list = oMSSlotsInfo.nearbyBanners;
            if (list != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list, NearbyBanner.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SideBarIconsInfo> list2 = oMSSlotsInfo.sidebarIcons;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, list2, SideBarIconsInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            oMSSlotsInfo.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSSlotsInfo parse(nc5 nc5Var) throws IOException {
            OMSSlotsInfo oMSSlotsInfo = new OMSSlotsInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oMSSlotsInfo.navigationView == null) {
                        oMSSlotsInfo.navigationView = NavigationView.new_();
                    }
                    if (oMSSlotsInfo.nearbyBanners == null) {
                        oMSSlotsInfo.nearbyBanners = new ArrayList();
                    }
                    if (oMSSlotsInfo.sidebarIcons != null) {
                        break;
                    }
                    oMSSlotsInfo.sidebarIcons = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    oMSSlotsInfo.navigationView = (NavigationView) nc5Var.m162488l(NavigationView.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    oMSSlotsInfo.nearbyBanners = (List) nc5Var.m162488l(NearbyBanner.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 26) {
                        if (oMSSlotsInfo.navigationView == null) {
                            oMSSlotsInfo.navigationView = NavigationView.new_();
                        }
                        if (oMSSlotsInfo.nearbyBanners == null) {
                            oMSSlotsInfo.nearbyBanners = new ArrayList();
                        }
                        if (oMSSlotsInfo.sidebarIcons != null) {
                            break;
                        }
                        oMSSlotsInfo.sidebarIcons = new ArrayList();
                        return oMSSlotsInfo;
                    }
                    oMSSlotsInfo.sidebarIcons = (List) nc5Var.m162488l(SideBarIconsInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return oMSSlotsInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSSlotsInfo oMSSlotsInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            NavigationView navigationView = oMSSlotsInfo.navigationView;
            if (navigationView != null) {
                codedOutputByteBufferNano.m17309K(1, navigationView, NavigationView.PROTOBUF_ADAPTER);
            }
            List<NearbyBanner> list = oMSSlotsInfo.nearbyBanners;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, NearbyBanner.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<SideBarIconsInfo> list2 = oMSSlotsInfo.sidebarIcons;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(3, list2, SideBarIconsInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSSlotsInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSSlotsInfo>() { // from class: com.p1.mobile.putong.data.OMSSlotsInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSSlotsInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSSlotsInfo newInstance() {
            return new OMSSlotsInfo();
        }

        public boolean parseField(OMSSlotsInfo oMSSlotsInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "nearbyBanners":
                    oMSSlotsInfo.nearbyBanners = JsonAdapter.parseArray(jsonParser, NearbyBanner.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "sidebarIcons":
                    oMSSlotsInfo.sidebarIcons = JsonAdapter.parseArray(jsonParser, SideBarIconsInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "navigationView":
                    oMSSlotsInfo.navigationView = NavigationView.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OMSSlotsInfo oMSSlotsInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "nearbyBanners":
                case "sidebarIcons":
                case "navigationView":
                    return true;
                default:
                    return super.parseFieldCheck(oMSSlotsInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSSlotsInfo oMSSlotsInfo, JsonGenerator jsonGenerator) throws IOException {
            if (oMSSlotsInfo.navigationView != null) {
                jsonGenerator.writeFieldName("navigationView");
                NavigationView.JSON_ADAPTER.serialize(oMSSlotsInfo.navigationView, jsonGenerator, true);
            }
            if (oMSSlotsInfo.nearbyBanners != null) {
                jsonGenerator.writeFieldName("nearbyBanners");
                JsonAdapter.serializeArray(oMSSlotsInfo.nearbyBanners, jsonGenerator, NearbyBanner.JSON_ADAPTER);
            }
            if (oMSSlotsInfo.sidebarIcons != null) {
                jsonGenerator.writeFieldName("sidebarIcons");
                JsonAdapter.serializeArray(oMSSlotsInfo.sidebarIcons, jsonGenerator, SideBarIconsInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSSlotsInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSSlotsInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSSlotsInfo new_() {
        OMSSlotsInfo oMSSlotsInfo = new OMSSlotsInfo();
        oMSSlotsInfo.nullCheck();
        return oMSSlotsInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSSlotsInfo mo225055clone() {
        OMSSlotsInfo oMSSlotsInfo = new OMSSlotsInfo();
        NavigationView navigationView = this.navigationView;
        if (navigationView != null) {
            oMSSlotsInfo.navigationView = navigationView.mo225055clone();
        }
        List<NearbyBanner> list = this.nearbyBanners;
        if (list != null) {
            oMSSlotsInfo.nearbyBanners = ValueObject.util_map(list, new qcj() { // from class: l.a850
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((NearbyBanner) obj).mo225055clone();
                }
            });
        }
        List<SideBarIconsInfo> list2 = this.sidebarIcons;
        if (list2 != null) {
            oMSSlotsInfo.sidebarIcons = ValueObject.util_map(list2, new qcj() { // from class: l.b850
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((SideBarIconsInfo) obj).mo225055clone();
                }
            });
        }
        return oMSSlotsInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OMSSlotsInfo)) {
            return false;
        }
        OMSSlotsInfo oMSSlotsInfo = (OMSSlotsInfo) obj;
        return ValueObject.util_equals(this.navigationView, oMSSlotsInfo.navigationView) && ValueObject.util_equals(this.nearbyBanners, oMSSlotsInfo.nearbyBanners) && ValueObject.util_equals(this.sidebarIcons, oMSSlotsInfo.sidebarIcons);
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
        NavigationView navigationView = this.navigationView;
        int iHashCode = (i2 + (navigationView != null ? navigationView.hashCode() : 0)) * 41;
        List<NearbyBanner> list = this.nearbyBanners;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<SideBarIconsInfo> list2 = this.sidebarIcons;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.navigationView == null) {
            this.navigationView = NavigationView.new_();
        }
        if (this.nearbyBanners == null) {
            this.nearbyBanners = new ArrayList();
        }
        if (this.sidebarIcons == null) {
            this.sidebarIcons = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
