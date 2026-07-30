package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.FeedPoiNearbyWindow;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPoiNearbyWindow extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "feedpoinearbywindow";

    @NonNull
    @ProtobufIndex(index = 1)
    public String desc;

    @ProtobufIndex(index = 3)
    public int newUserCount;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> userIds;
    public static ProtobufAdapter<FeedPoiNearbyWindow> PROTOBUF_ADAPTER = new MessageNanoAdapter<FeedPoiNearbyWindow>() { // from class: com.p1.mobile.putong.feed.data.FeedPoiNearbyWindow.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FeedPoiNearbyWindow feedPoiNearbyWindow) {
            String str = feedPoiNearbyWindow.desc;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<String> list = feedPoiNearbyWindow.userIds;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(3, feedPoiNearbyWindow.newUserCount);
            feedPoiNearbyWindow.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FeedPoiNearbyWindow parse(nc5 nc5Var) throws IOException {
            FeedPoiNearbyWindow feedPoiNearbyWindow = new FeedPoiNearbyWindow();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (feedPoiNearbyWindow.desc == null) {
                        feedPoiNearbyWindow.desc = "";
                    }
                    if (feedPoiNearbyWindow.userIds != null) {
                        break;
                    }
                    feedPoiNearbyWindow.userIds = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    feedPoiNearbyWindow.desc = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    feedPoiNearbyWindow.userIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 24) {
                        if (feedPoiNearbyWindow.desc == null) {
                            feedPoiNearbyWindow.desc = "";
                        }
                        if (feedPoiNearbyWindow.userIds != null) {
                            break;
                        }
                        feedPoiNearbyWindow.userIds = new ArrayList();
                        return feedPoiNearbyWindow;
                    }
                    feedPoiNearbyWindow.newUserCount = nc5Var.m162486j();
                }
            }
            return feedPoiNearbyWindow;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FeedPoiNearbyWindow feedPoiNearbyWindow, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = feedPoiNearbyWindow.desc;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<String> list = feedPoiNearbyWindow.userIds;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(3, feedPoiNearbyWindow.newUserCount);
        }
    };
    public static JsonAdapter<FeedPoiNearbyWindow> JSON_ADAPTER = new ObjectJsonAdapter<FeedPoiNearbyWindow>() { // from class: com.p1.mobile.putong.feed.data.FeedPoiNearbyWindow.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FeedPoiNearbyWindow.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FeedPoiNearbyWindow newInstance() {
            return new FeedPoiNearbyWindow();
        }

        public boolean parseField(FeedPoiNearbyWindow feedPoiNearbyWindow, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userIds":
                    feedPoiNearbyWindow.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "desc":
                    feedPoiNearbyWindow.desc = jsonParser.getValueAsString();
                    return true;
                case "newUserCount":
                    feedPoiNearbyWindow.newUserCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FeedPoiNearbyWindow feedPoiNearbyWindow, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userIds":
                case "desc":
                case "newUserCount":
                    return true;
                default:
                    return super.parseFieldCheck(feedPoiNearbyWindow, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FeedPoiNearbyWindow feedPoiNearbyWindow, JsonGenerator jsonGenerator) throws IOException {
            String str = feedPoiNearbyWindow.desc;
            if (str != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str);
            }
            if (feedPoiNearbyWindow.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(feedPoiNearbyWindow.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("newUserCount", feedPoiNearbyWindow.newUserCount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FeedPoiNearbyWindow) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FeedPoiNearbyWindow) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m62025a(String str) {
        return str;
    }

    public static FeedPoiNearbyWindow new_() {
        FeedPoiNearbyWindow feedPoiNearbyWindow = new FeedPoiNearbyWindow();
        feedPoiNearbyWindow.nullCheck();
        return feedPoiNearbyWindow;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FeedPoiNearbyWindow mo225055clone() {
        FeedPoiNearbyWindow feedPoiNearbyWindow = new FeedPoiNearbyWindow();
        feedPoiNearbyWindow.desc = this.desc;
        List<String> list = this.userIds;
        if (list != null) {
            feedPoiNearbyWindow.userIds = ValueObject.util_map(list, new qcj() { // from class: l.pqh
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return FeedPoiNearbyWindow.m62025a((String) obj);
                }
            });
        }
        feedPoiNearbyWindow.newUserCount = this.newUserCount;
        return feedPoiNearbyWindow;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeedPoiNearbyWindow)) {
            return false;
        }
        FeedPoiNearbyWindow feedPoiNearbyWindow = (FeedPoiNearbyWindow) obj;
        return ValueObject.util_equals(this.desc, feedPoiNearbyWindow.desc) && ValueObject.util_equals(this.userIds, feedPoiNearbyWindow.userIds) && this.newUserCount == feedPoiNearbyWindow.newUserCount;
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
        String str = this.desc;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.userIds;
        int iHashCode2 = ((iHashCode + (list != null ? list.hashCode() : 0)) * 41) + this.newUserCount;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
