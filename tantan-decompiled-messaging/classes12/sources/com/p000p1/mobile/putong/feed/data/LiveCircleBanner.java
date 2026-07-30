package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Banners;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.LiveGroupBannerItem;
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
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LiveCircleBanner extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livecirclebanner";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<LiveGroupBannerItem> banners;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f685id;
    public static ProtobufAdapter<LiveCircleBanner> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveCircleBanner>() { // from class: com.p1.mobile.putong.feed.data.LiveCircleBanner.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveCircleBanner liveCircleBanner) {
            String str = liveCircleBanner.f685id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<LiveGroupBannerItem> list = liveCircleBanner.banners;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, LiveGroupBannerItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) liveCircleBanner).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveCircleBanner m19545parse(nb5 nb5Var) throws IOException {
            LiveCircleBanner liveCircleBanner = new LiveCircleBanner();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveCircleBanner.f685id == null) {
                        liveCircleBanner.f685id = "";
                    }
                    if (liveCircleBanner.banners != null) {
                        break;
                    }
                    liveCircleBanner.banners = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    liveCircleBanner.f685id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (liveCircleBanner.f685id == null) {
                            liveCircleBanner.f685id = "";
                        }
                        if (liveCircleBanner.banners != null) {
                            break;
                        }
                        liveCircleBanner.banners = new ArrayList();
                        return liveCircleBanner;
                    }
                    liveCircleBanner.banners = (List) nb5Var.l(LiveGroupBannerItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return liveCircleBanner;
        }

        public void serialize(LiveCircleBanner liveCircleBanner, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveCircleBanner.f685id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<LiveGroupBannerItem> list = liveCircleBanner.banners;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, LiveGroupBannerItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LiveCircleBanner> JSON_ADAPTER = new ObjectJsonAdapter<LiveCircleBanner>() { // from class: com.p1.mobile.putong.feed.data.LiveCircleBanner.2
        public Class getDataClass() {
            return LiveCircleBanner.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveCircleBanner mo17830newInstance() {
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
            liveCircleBanner.f685id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveCircleBanner liveCircleBanner, JsonGenerator jsonGenerator) throws IOException {
            String str = liveCircleBanner.f685id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (liveCircleBanner.banners != null) {
                jsonGenerator.writeFieldName(Banners.TYPE);
                JsonAdapter.serializeArray(liveCircleBanner.banners, jsonGenerator, LiveGroupBannerItem.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveCircleBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveCircleBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveCircleBanner new_() {
        LiveCircleBanner liveCircleBanner = new LiveCircleBanner();
        liveCircleBanner.nullCheck();
        return liveCircleBanner;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveCircleBanner m19544clone() {
        LiveCircleBanner liveCircleBanner = new LiveCircleBanner();
        liveCircleBanner.f685id = this.f685id;
        List<LiveGroupBannerItem> list = this.banners;
        if (list != null) {
            liveCircleBanner.banners = ValueObject.util_map(list, new w9j() { // from class: l.x2s
                public final Object call(Object obj) {
                    return ((LiveGroupBannerItem) obj).m19556clone();
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
        return ValueObject.util_equals(this.f685id, liveCircleBanner.f685id) && ValueObject.util_equals(this.banners, liveCircleBanner.banners);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public List<xaj0<String, String, String>> getTripleList() {
        ArrayList arrayList = new ArrayList();
        if (!this.banners.isEmpty()) {
            for (LiveGroupBannerItem liveGroupBannerItem : this.banners) {
                arrayList.add(new xaj0(liveGroupBannerItem.f687id, liveGroupBannerItem.link, liveGroupBannerItem.cover));
            }
        }
        return arrayList;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f685id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<LiveGroupBannerItem> list = this.banners;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f685id == null) {
            this.f685id = "";
        }
        if (this.banners == null) {
            this.banners = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
