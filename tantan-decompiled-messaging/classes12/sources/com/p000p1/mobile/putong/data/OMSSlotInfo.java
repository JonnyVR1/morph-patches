package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.NearbyBanner;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class OMSSlotInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsslotinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<NearbyBanner> nearbyBanners;
    public static ProtobufAdapter<OMSSlotInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OMSSlotInfo>() { // from class: com.p1.mobile.putong.data.OMSSlotInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OMSSlotInfo oMSSlotInfo) {
            List<NearbyBanner> list = oMSSlotInfo.nearbyBanners;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, NearbyBanner.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) oMSSlotInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OMSSlotInfo m18660parse(nb5 nb5Var) throws IOException {
            OMSSlotInfo oMSSlotInfo = new OMSSlotInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oMSSlotInfo.nearbyBanners != null) {
                        break;
                    }
                    oMSSlotInfo.nearbyBanners = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (oMSSlotInfo.nearbyBanners != null) {
                        break;
                    }
                    oMSSlotInfo.nearbyBanners = new ArrayList();
                    return oMSSlotInfo;
                }
                oMSSlotInfo.nearbyBanners = (List) nb5Var.l(NearbyBanner.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return oMSSlotInfo;
        }

        public void serialize(OMSSlotInfo oMSSlotInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<NearbyBanner> list = oMSSlotInfo.nearbyBanners;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, NearbyBanner.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OMSSlotInfo> JSON_ADAPTER = new ObjectJsonAdapter<OMSSlotInfo>() { // from class: com.p1.mobile.putong.data.OMSSlotInfo.2
        public Class getDataClass() {
            return OMSSlotInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OMSSlotInfo mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OMSSlotInfo oMSSlotInfo, JsonGenerator jsonGenerator) throws IOException {
            if (oMSSlotInfo.nearbyBanners != null) {
                jsonGenerator.writeFieldName("nearbyBanners");
                JsonAdapter.serializeArray(oMSSlotInfo.nearbyBanners, jsonGenerator, NearbyBanner.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OMSSlotInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OMSSlotInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OMSSlotInfo new_() {
        OMSSlotInfo oMSSlotInfo = new OMSSlotInfo();
        oMSSlotInfo.nullCheck();
        return oMSSlotInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OMSSlotInfo m18659clone() {
        OMSSlotInfo oMSSlotInfo = new OMSSlotInfo();
        List<NearbyBanner> list = this.nearbyBanners;
        if (list != null) {
            oMSSlotInfo.nearbyBanners = ValueObject.util_map(list, new w9j() { // from class: l.kz40
                public final Object call(Object obj) {
                    return ((NearbyBanner) obj).m18518clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<NearbyBanner> list = this.nearbyBanners;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.nearbyBanners == null) {
            this.nearbyBanners = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
