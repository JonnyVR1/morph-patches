package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.NearbyBanner;
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

/* JADX INFO: loaded from: classes12.dex */
public class OMSSlotInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsslotinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<NearbyBanner> nearbyBanners;
    public static ProtobufAdapter<OMSSlotInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSSlotInfo>() { // from class: com.p1.mobile.putong.data.OMSSlotInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OMSSlotInfo oMSSlotInfo) {
            List<NearbyBanner> list = oMSSlotInfo.nearbyBanners;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, NearbyBanner.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            oMSSlotInfo.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OMSSlotInfo parse(nb5 nb5Var) throws IOException {
            OMSSlotInfo oMSSlotInfo = new OMSSlotInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (oMSSlotInfo.nearbyBanners != null) {
                        break;
                    }
                    oMSSlotInfo.nearbyBanners = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (oMSSlotInfo.nearbyBanners != null) {
                        break;
                    }
                    oMSSlotInfo.nearbyBanners = new ArrayList();
                    return oMSSlotInfo;
                }
                oMSSlotInfo.nearbyBanners = (List) nb5Var.m158743l(NearbyBanner.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return oMSSlotInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OMSSlotInfo oMSSlotInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<NearbyBanner> list = oMSSlotInfo.nearbyBanners;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, NearbyBanner.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSSlotInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSSlotInfo>() { // from class: com.p1.mobile.putong.data.OMSSlotInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OMSSlotInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OMSSlotInfo newInstance() {
            return new OMSSlotInfo();
        }

        public boolean parseField(OMSSlotInfo oMSSlotInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("nearbyBanners")) {
                return false;
            }
            oMSSlotInfo.nearbyBanners = JsonAdapter.parseArray(jsonParser, NearbyBanner.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OMSSlotInfo oMSSlotInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("nearbyBanners")) {
                return true;
            }
            return super.parseFieldCheck(oMSSlotInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSSlotInfo oMSSlotInfo, JsonGenerator jsonGenerator) throws IOException {
            if (oMSSlotInfo.nearbyBanners != null) {
                jsonGenerator.writeFieldName("nearbyBanners");
                JsonAdapter.serializeArray(oMSSlotInfo.nearbyBanners, jsonGenerator, NearbyBanner.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSSlotInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSSlotInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSSlotInfo new_() {
        OMSSlotInfo oMSSlotInfo = new OMSSlotInfo();
        oMSSlotInfo.nullCheck();
        return oMSSlotInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OMSSlotInfo mo223809clone() {
        OMSSlotInfo oMSSlotInfo = new OMSSlotInfo();
        List<NearbyBanner> list = this.nearbyBanners;
        if (list != null) {
            oMSSlotInfo.nearbyBanners = ValueObject.util_map(list, new w9j() { // from class: l.kz40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((NearbyBanner) obj).mo223809clone();
                }
            });
        }
        return oMSSlotInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OMSSlotInfo) {
            return ValueObject.util_equals(this.nearbyBanners, ((OMSSlotInfo) obj).nearbyBanners);
        }
        return false;
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
        List<NearbyBanner> list = this.nearbyBanners;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.nearbyBanners == null) {
            this.nearbyBanners = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
