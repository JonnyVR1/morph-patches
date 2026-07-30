package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Banners;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.LiveGroupBannerItem;
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
import p149l.xaj0;

/* JADX INFO: loaded from: classes12.dex */
public class LiveCircleBanner extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livecirclebanner";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<LiveGroupBannerItem> banners;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39224id;
    public static ProtobufAdapter<LiveCircleBanner> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveCircleBanner>() { // from class: com.p1.mobile.putong.feed.data.LiveCircleBanner.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveCircleBanner liveCircleBanner) {
            String str = liveCircleBanner.f39224id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<LiveGroupBannerItem> list = liveCircleBanner.banners;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, LiveGroupBannerItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            liveCircleBanner.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveCircleBanner parse(nb5 nb5Var) throws IOException {
            LiveCircleBanner liveCircleBanner = new LiveCircleBanner();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveCircleBanner.f39224id == null) {
                        liveCircleBanner.f39224id = "";
                    }
                    if (liveCircleBanner.banners != null) {
                        break;
                    }
                    liveCircleBanner.banners = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    liveCircleBanner.f39224id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (liveCircleBanner.f39224id == null) {
                            liveCircleBanner.f39224id = "";
                        }
                        if (liveCircleBanner.banners != null) {
                            break;
                        }
                        liveCircleBanner.banners = new ArrayList();
                        return liveCircleBanner;
                    }
                    liveCircleBanner.banners = (List) nb5Var.m158743l(LiveGroupBannerItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return liveCircleBanner;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveCircleBanner liveCircleBanner, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveCircleBanner.f39224id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<LiveGroupBannerItem> list = liveCircleBanner.banners;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, LiveGroupBannerItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LiveCircleBanner> JSON_ADAPTER = new ObjectJsonAdapter<LiveCircleBanner>() { // from class: com.p1.mobile.putong.feed.data.LiveCircleBanner.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveCircleBanner.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
            liveCircleBanner.f39224id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveCircleBanner liveCircleBanner, JsonGenerator jsonGenerator) throws IOException {
            String str = liveCircleBanner.f39224id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (liveCircleBanner.banners != null) {
                jsonGenerator.writeFieldName(Banners.TYPE);
                JsonAdapter.serializeArray(liveCircleBanner.banners, jsonGenerator, LiveGroupBannerItem.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveCircleBanner) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public LiveCircleBanner mo223809clone() {
        LiveCircleBanner liveCircleBanner = new LiveCircleBanner();
        liveCircleBanner.f39224id = this.f39224id;
        List<LiveGroupBannerItem> list = this.banners;
        if (list != null) {
            liveCircleBanner.banners = ValueObject.util_map(list, new w9j() { // from class: l.x2s
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((LiveGroupBannerItem) obj).mo223809clone();
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
        return ValueObject.util_equals(this.f39224id, liveCircleBanner.f39224id) && ValueObject.util_equals(this.banners, liveCircleBanner.banners);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public List<xaj0<String, String, String>> getTripleList() {
        ArrayList arrayList = new ArrayList();
        if (!this.banners.isEmpty()) {
            for (LiveGroupBannerItem liveGroupBannerItem : this.banners) {
                arrayList.add(new xaj0(liveGroupBannerItem.f39226id, liveGroupBannerItem.link, liveGroupBannerItem.cover));
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
        String str = this.f39224id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<LiveGroupBannerItem> list = this.banners;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39224id == null) {
            this.f39224id = "";
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
