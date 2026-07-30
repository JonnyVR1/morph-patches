package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Material;
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
public class NearbyBanner extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "nearbybanner";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f244id;

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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NearbyBanner nearbyBanner) {
            String str = nearbyBanner.f244id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<Material> list = nearbyBanner.materials;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, Material.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Long> list2 = nearbyBanner.timeRange;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(3, list2, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            int iJ = iO + CodedOutputByteBufferNano.j(4, nearbyBanner.slideshowSec);
            ((MessageNano) nearbyBanner).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NearbyBanner m18519parse(nb5 nb5Var) throws IOException {
            NearbyBanner nearbyBanner = new NearbyBanner();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (nearbyBanner.f244id == null) {
                        nearbyBanner.f244id = "";
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
                if (iU == 10) {
                    nearbyBanner.f244id = nb5Var.s();
                } else if (iU == 18) {
                    nearbyBanner.materials = (List) nb5Var.l(Material.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 26) {
                    nearbyBanner.timeRange = (List) nb5Var.l(ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 32) {
                        if (nearbyBanner.f244id == null) {
                            nearbyBanner.f244id = "";
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
                    nearbyBanner.slideshowSec = nb5Var.k();
                }
            }
            return nearbyBanner;
        }

        public void serialize(NearbyBanner nearbyBanner, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = nearbyBanner.f244id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<Material> list = nearbyBanner.materials;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, Material.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Long> list2 = nearbyBanner.timeRange;
            if (list2 != null) {
                codedOutputByteBufferNano.K(3, list2, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.I(4, nearbyBanner.slideshowSec);
        }
    };
    public static JsonAdapter<NearbyBanner> JSON_ADAPTER = new ObjectJsonAdapter<NearbyBanner>() { // from class: com.p1.mobile.putong.data.NearbyBanner.2
        public Class getDataClass() {
            return NearbyBanner.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public NearbyBanner mo17830newInstance() {
            return new NearbyBanner();
        }

        public boolean parseField(NearbyBanner nearbyBanner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "slideshowSec":
                    nearbyBanner.slideshowSec = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    nearbyBanner.f244id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NearbyBanner nearbyBanner, JsonGenerator jsonGenerator) throws IOException {
            String str = nearbyBanner.f244id;
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NearbyBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NearbyBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Long m786b(Long l2) {
        return l2;
    }

    public static NearbyBanner new_() {
        NearbyBanner nearbyBanner = new NearbyBanner();
        nearbyBanner.nullCheck();
        return nearbyBanner;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NearbyBanner m18518clone() {
        NearbyBanner nearbyBanner = new NearbyBanner();
        nearbyBanner.f244id = this.f244id;
        List<Material> list = this.materials;
        if (list != null) {
            nearbyBanner.materials = ValueObject.util_map(list, new w9j() { // from class: l.h720
                public final Object call(Object obj) {
                    return ((Material) obj).m18432clone();
                }
            });
        }
        List<Long> list2 = this.timeRange;
        if (list2 != null) {
            nearbyBanner.timeRange = ValueObject.util_map(list2, new w9j() { // from class: l.i720
                public final Object call(Object obj) {
                    return NearbyBanner.m786b((Long) obj);
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
        return ValueObject.util_equals(this.f244id, nearbyBanner.f244id) && ValueObject.util_equals(this.materials, nearbyBanner.materials) && ValueObject.util_equals(this.timeRange, nearbyBanner.timeRange) && this.slideshowSec == nearbyBanner.slideshowSec;
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
        String str = this.f244id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<Material> list = this.materials;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<Long> list2 = this.timeRange;
        int iHashCode3 = list2 != null ? list2.hashCode() : 0;
        long j = this.slideshowSec;
        int i3 = ((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.f244id == null) {
            this.f244id = "";
        }
        if (this.materials == null) {
            this.materials = new ArrayList();
        }
        if (this.timeRange == null) {
            this.timeRange = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
