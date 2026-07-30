package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Banners;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.LiveGroupBannerItem;
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
import p153l.bkj0;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class LiveCircleBanner extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livecirclebanner";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<LiveGroupBannerItem> banners;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f40072id;
    public static ProtobufAdapter<LiveCircleBanner> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveCircleBanner>() { // from class: com.p1.mobile.putong.feed.data.LiveCircleBanner.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveCircleBanner liveCircleBanner) {
            String str = liveCircleBanner.f40072id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<LiveGroupBannerItem> list = liveCircleBanner.banners;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, LiveGroupBannerItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            liveCircleBanner.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveCircleBanner parse(nc5 nc5Var) throws IOException {
            LiveCircleBanner liveCircleBanner = new LiveCircleBanner();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (liveCircleBanner.f40072id == null) {
                        liveCircleBanner.f40072id = "";
                    }
                    if (liveCircleBanner.banners != null) {
                        break;
                    }
                    liveCircleBanner.banners = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    liveCircleBanner.f40072id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (liveCircleBanner.f40072id == null) {
                            liveCircleBanner.f40072id = "";
                        }
                        if (liveCircleBanner.banners != null) {
                            break;
                        }
                        liveCircleBanner.banners = new ArrayList();
                        return liveCircleBanner;
                    }
                    liveCircleBanner.banners = (List) nc5Var.m162488l(LiveGroupBannerItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return liveCircleBanner;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveCircleBanner liveCircleBanner, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveCircleBanner.f40072id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<LiveGroupBannerItem> list = liveCircleBanner.banners;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, LiveGroupBannerItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LiveCircleBanner> JSON_ADAPTER = new ObjectJsonAdapter<LiveCircleBanner>() { // from class: com.p1.mobile.putong.feed.data.LiveCircleBanner.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveCircleBanner.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveCircleBanner newInstance() {
            return new LiveCircleBanner();
        }

        public boolean parseField(LiveCircleBanner liveCircleBanner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Banners.TYPE)) {
                liveCircleBanner.banners = JsonAdapter.parseArray(jsonParser, LiveGroupBannerItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("id")) {
                return false;
            }
            liveCircleBanner.f40072id = jsonParser.getValueAsString();
            return false;
        }

        public boolean parseFieldCheck(LiveCircleBanner liveCircleBanner, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Banners.TYPE)) {
                return true;
            }
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(liveCircleBanner, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveCircleBanner liveCircleBanner, JsonGenerator jsonGenerator) throws IOException {
            String str = liveCircleBanner.f40072id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (liveCircleBanner.banners != null) {
                jsonGenerator.writeFieldName(Banners.TYPE);
                JsonAdapter.serializeArray(liveCircleBanner.banners, jsonGenerator, LiveGroupBannerItem.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveCircleBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveCircleBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveCircleBanner new_() {
        LiveCircleBanner liveCircleBanner = new LiveCircleBanner();
        liveCircleBanner.nullCheck();
        return liveCircleBanner;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveCircleBanner mo225055clone() {
        LiveCircleBanner liveCircleBanner = new LiveCircleBanner();
        liveCircleBanner.f40072id = this.f40072id;
        List<LiveGroupBannerItem> list = this.banners;
        if (list != null) {
            liveCircleBanner.banners = ValueObject.util_map(list, new qcj() { // from class: l.y4s
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LiveGroupBannerItem) obj).mo225055clone();
                }
            });
        }
        return liveCircleBanner;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveCircleBanner)) {
            return false;
        }
        LiveCircleBanner liveCircleBanner = (LiveCircleBanner) obj;
        return ValueObject.util_equals(this.f40072id, liveCircleBanner.f40072id) && ValueObject.util_equals(this.banners, liveCircleBanner.banners);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public List<bkj0<String, String, String>> getTripleList() {
        ArrayList arrayList = new ArrayList();
        if (!this.banners.isEmpty()) {
            for (LiveGroupBannerItem liveGroupBannerItem : this.banners) {
                arrayList.add(new bkj0(liveGroupBannerItem.f40074id, liveGroupBannerItem.link, liveGroupBannerItem.cover));
            }
        }
        return arrayList;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f40072id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<LiveGroupBannerItem> list = this.banners;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f40072id == null) {
            this.f40072id = "";
        }
        if (this.banners == null) {
            this.banners = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
