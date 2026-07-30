package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Material;
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
public class NearbyBanner extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "nearbybanner";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38783id;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Material> materials;

    @ProtobufIndex(index = 4)
    public long slideshowSec;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<Long> timeRange;
    public static ProtobufAdapter<NearbyBanner> PROTOBUF_ADAPTER = new MessageNanoAdapter<NearbyBanner>() { // from class: com.p1.mobile.putong.data.NearbyBanner.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NearbyBanner nearbyBanner) {
            String str = nearbyBanner.f38783id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<Material> list = nearbyBanner.materials;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, Material.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Long> list2 = nearbyBanner.timeRange;
            if (list2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, list2, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17228j = iM17233o + CodedOutputByteBufferNano.m17228j(4, nearbyBanner.slideshowSec);
            nearbyBanner.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NearbyBanner parse(nb5 nb5Var) throws IOException {
            NearbyBanner nearbyBanner = new NearbyBanner();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (nearbyBanner.f38783id == null) {
                        nearbyBanner.f38783id = "";
                    }
                    if (nearbyBanner.materials == null) {
                        nearbyBanner.materials = new ArrayList();
                    }
                    if (nearbyBanner.timeRange != null) {
                        break;
                    }
                    nearbyBanner.timeRange = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    nearbyBanner.f38783id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    nearbyBanner.materials = (List) nb5Var.m158743l(Material.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 26) {
                    nearbyBanner.timeRange = (List) nb5Var.m158743l(ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 32) {
                        if (nearbyBanner.f38783id == null) {
                            nearbyBanner.f38783id = "";
                        }
                        if (nearbyBanner.materials == null) {
                            nearbyBanner.materials = new ArrayList();
                        }
                        if (nearbyBanner.timeRange != null) {
                            break;
                        }
                        nearbyBanner.timeRange = new ArrayList();
                        return nearbyBanner;
                    }
                    nearbyBanner.slideshowSec = nb5Var.m158742k();
                }
            }
            return nearbyBanner;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NearbyBanner nearbyBanner, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = nearbyBanner.f38783id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<Material> list = nearbyBanner.materials;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, Material.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Long> list2 = nearbyBanner.timeRange;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(3, list2, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17252I(4, nearbyBanner.slideshowSec);
        }
    };
    public static JsonAdapter<NearbyBanner> JSON_ADAPTER = new ObjectJsonAdapter<NearbyBanner>() { // from class: com.p1.mobile.putong.data.NearbyBanner.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NearbyBanner.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NearbyBanner newInstance() {
            return new NearbyBanner();
        }

        public boolean parseField(NearbyBanner nearbyBanner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "slideshowSec":
                    nearbyBanner.slideshowSec = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    nearbyBanner.f38783id = jsonParser.getValueAsString();
                    return false;
                case "timeRange":
                    nearbyBanner.timeRange = JsonAdapter.parseArray(jsonParser, JsonAdapter.LONG_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "materials":
                    nearbyBanner.materials = JsonAdapter.parseArray(jsonParser, Material.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NearbyBanner nearbyBanner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "slideshowSec":
                    return true;
                case "id":
                    return false;
                case "timeRange":
                case "materials":
                    return true;
                default:
                    return super.parseFieldCheck(nearbyBanner, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NearbyBanner nearbyBanner, JsonGenerator jsonGenerator) throws IOException {
            String str = nearbyBanner.f38783id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (nearbyBanner.materials != null) {
                jsonGenerator.writeFieldName("materials");
                JsonAdapter.serializeArray(nearbyBanner.materials, jsonGenerator, Material.JSON_ADAPTER);
            }
            if (nearbyBanner.timeRange != null) {
                jsonGenerator.writeFieldName("timeRange");
                JsonAdapter.serializeArray(nearbyBanner.timeRange, jsonGenerator, JsonAdapter.LONG_BOXED_ADAPTER);
            }
            jsonGenerator.writeNumberField("slideshowSec", nearbyBanner.slideshowSec);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NearbyBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NearbyBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Long m59868b(Long l2) {
        return l2;
    }

    public static NearbyBanner new_() {
        NearbyBanner nearbyBanner = new NearbyBanner();
        nearbyBanner.nullCheck();
        return nearbyBanner;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NearbyBanner mo223809clone() {
        NearbyBanner nearbyBanner = new NearbyBanner();
        nearbyBanner.f38783id = this.f38783id;
        List<Material> list = this.materials;
        if (list != null) {
            nearbyBanner.materials = ValueObject.util_map(list, new w9j() { // from class: l.h720
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Material) obj).mo223809clone();
                }
            });
        }
        List<Long> list2 = this.timeRange;
        if (list2 != null) {
            nearbyBanner.timeRange = ValueObject.util_map(list2, new w9j() { // from class: l.i720
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return NearbyBanner.m59868b((Long) obj);
                }
            });
        }
        nearbyBanner.slideshowSec = this.slideshowSec;
        return nearbyBanner;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NearbyBanner)) {
            return false;
        }
        NearbyBanner nearbyBanner = (NearbyBanner) obj;
        return ValueObject.util_equals(this.f38783id, nearbyBanner.f38783id) && ValueObject.util_equals(this.materials, nearbyBanner.materials) && ValueObject.util_equals(this.timeRange, nearbyBanner.timeRange) && this.slideshowSec == nearbyBanner.slideshowSec;
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
        String str = this.f38783id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<Material> list = this.materials;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<Long> list2 = this.timeRange;
        int iHashCode3 = list2 != null ? list2.hashCode() : 0;
        long j = this.slideshowSec;
        int i3 = ((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38783id == null) {
            this.f38783id = "";
        }
        if (this.materials == null) {
            this.materials = new ArrayList();
        }
        if (this.timeRange == null) {
            this.timeRange = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
