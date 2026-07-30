package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.IntlOperationArticles;
import com.p046p1.mobile.putong.data.IntlOperationBanner;
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
public class IntlOperationData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intloperationdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<IntlOperationArticles> intlArticles;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<IntlOperationBanner> intlBannerActivities;
    public static ProtobufAdapter<IntlOperationData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlOperationData>() { // from class: com.p1.mobile.putong.data.IntlOperationData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlOperationData intlOperationData) {
            List<IntlOperationBanner> list = intlOperationData.intlBannerActivities;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, IntlOperationBanner.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<IntlOperationArticles> list2 = intlOperationData.intlArticles;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, IntlOperationArticles.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            intlOperationData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlOperationData parse(nb5 nb5Var) throws IOException {
            IntlOperationData intlOperationData = new IntlOperationData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlOperationData.intlBannerActivities == null) {
                        intlOperationData.intlBannerActivities = new ArrayList();
                    }
                    if (intlOperationData.intlArticles != null) {
                        break;
                    }
                    intlOperationData.intlArticles = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    intlOperationData.intlBannerActivities = (List) nb5Var.m158743l(IntlOperationBanner.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (intlOperationData.intlBannerActivities == null) {
                            intlOperationData.intlBannerActivities = new ArrayList();
                        }
                        if (intlOperationData.intlArticles != null) {
                            break;
                        }
                        intlOperationData.intlArticles = new ArrayList();
                        return intlOperationData;
                    }
                    intlOperationData.intlArticles = (List) nb5Var.m158743l(IntlOperationArticles.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intlOperationData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlOperationData intlOperationData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<IntlOperationBanner> list = intlOperationData.intlBannerActivities;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, IntlOperationBanner.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<IntlOperationArticles> list2 = intlOperationData.intlArticles;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, IntlOperationArticles.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlOperationData> JSON_ADAPTER = new ObjectJsonAdapter<IntlOperationData>() { // from class: com.p1.mobile.putong.data.IntlOperationData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlOperationData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlOperationData newInstance() {
            return new IntlOperationData();
        }

        public boolean parseField(IntlOperationData intlOperationData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("intlArticles")) {
                intlOperationData.intlArticles = JsonAdapter.parseArray(jsonParser, IntlOperationArticles.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("intlBannerActivities")) {
                return false;
            }
            intlOperationData.intlBannerActivities = JsonAdapter.parseArray(jsonParser, IntlOperationBanner.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IntlOperationData intlOperationData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("intlArticles") || str.equals("intlBannerActivities")) {
                return true;
            }
            return super.parseFieldCheck(intlOperationData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlOperationData intlOperationData, JsonGenerator jsonGenerator) throws IOException {
            if (intlOperationData.intlBannerActivities != null) {
                jsonGenerator.writeFieldName("intlBannerActivities");
                JsonAdapter.serializeArray(intlOperationData.intlBannerActivities, jsonGenerator, IntlOperationBanner.JSON_ADAPTER);
            }
            if (intlOperationData.intlArticles != null) {
                jsonGenerator.writeFieldName("intlArticles");
                JsonAdapter.serializeArray(intlOperationData.intlArticles, jsonGenerator, IntlOperationArticles.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlOperationData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlOperationData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlOperationData new_() {
        IntlOperationData intlOperationData = new IntlOperationData();
        intlOperationData.nullCheck();
        return intlOperationData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlOperationData mo223809clone() {
        IntlOperationData intlOperationData = new IntlOperationData();
        List<IntlOperationBanner> list = this.intlBannerActivities;
        if (list != null) {
            intlOperationData.intlBannerActivities = ValueObject.util_map(list, new w9j() { // from class: l.ppo
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IntlOperationBanner) obj).mo223809clone();
                }
            });
        }
        List<IntlOperationArticles> list2 = this.intlArticles;
        if (list2 != null) {
            intlOperationData.intlArticles = ValueObject.util_map(list2, new w9j() { // from class: l.qpo
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IntlOperationArticles) obj).mo223809clone();
                }
            });
        }
        return intlOperationData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlOperationData)) {
            return false;
        }
        IntlOperationData intlOperationData = (IntlOperationData) obj;
        return ValueObject.util_equals(this.intlBannerActivities, intlOperationData.intlBannerActivities) && ValueObject.util_equals(this.intlArticles, intlOperationData.intlArticles);
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
        List<IntlOperationBanner> list = this.intlBannerActivities;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<IntlOperationArticles> list2 = this.intlArticles;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.intlBannerActivities == null) {
            this.intlBannerActivities = new ArrayList();
        }
        if (this.intlArticles == null) {
            this.intlArticles = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
