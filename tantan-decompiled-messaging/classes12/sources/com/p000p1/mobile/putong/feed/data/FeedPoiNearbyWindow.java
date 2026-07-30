package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.FeedPoiNearbyWindow;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FeedPoiNearbyWindow feedPoiNearbyWindow) {
            String str = feedPoiNearbyWindow.desc;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = feedPoiNearbyWindow.userIds;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, feedPoiNearbyWindow.newUserCount);
            ((MessageNano) feedPoiNearbyWindow).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FeedPoiNearbyWindow m19497parse(nb5 nb5Var) throws IOException {
            FeedPoiNearbyWindow feedPoiNearbyWindow = new FeedPoiNearbyWindow();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (feedPoiNearbyWindow.desc == null) {
                        feedPoiNearbyWindow.desc = "";
                    }
                    if (feedPoiNearbyWindow.userIds != null) {
                        break;
                    }
                    feedPoiNearbyWindow.userIds = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    feedPoiNearbyWindow.desc = nb5Var.s();
                } else if (iU == 18) {
                    feedPoiNearbyWindow.userIds = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 24) {
                        if (feedPoiNearbyWindow.desc == null) {
                            feedPoiNearbyWindow.desc = "";
                        }
                        if (feedPoiNearbyWindow.userIds != null) {
                            break;
                        }
                        feedPoiNearbyWindow.userIds = new ArrayList();
                        return feedPoiNearbyWindow;
                    }
                    feedPoiNearbyWindow.newUserCount = nb5Var.j();
                }
            }
            return feedPoiNearbyWindow;
        }

        public void serialize(FeedPoiNearbyWindow feedPoiNearbyWindow, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = feedPoiNearbyWindow.desc;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = feedPoiNearbyWindow.userIds;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(3, feedPoiNearbyWindow.newUserCount);
        }
    };
    public static JsonAdapter<FeedPoiNearbyWindow> JSON_ADAPTER = new ObjectJsonAdapter<FeedPoiNearbyWindow>() { // from class: com.p1.mobile.putong.feed.data.FeedPoiNearbyWindow.2
        public Class getDataClass() {
            return FeedPoiNearbyWindow.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public FeedPoiNearbyWindow mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FeedPoiNearbyWindow feedPoiNearbyWindow, JsonGenerator jsonGenerator) throws IOException {
            String str = feedPoiNearbyWindow.desc;
            if (str != null) {
                jsonGenerator.writeStringField("desc", str);
            }
            if (feedPoiNearbyWindow.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(feedPoiNearbyWindow.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("newUserCount", feedPoiNearbyWindow.newUserCount);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FeedPoiNearbyWindow) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FeedPoiNearbyWindow) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1767a(String str) {
        return str;
    }

    public static FeedPoiNearbyWindow new_() {
        FeedPoiNearbyWindow feedPoiNearbyWindow = new FeedPoiNearbyWindow();
        feedPoiNearbyWindow.nullCheck();
        return feedPoiNearbyWindow;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FeedPoiNearbyWindow m19496clone() {
        FeedPoiNearbyWindow feedPoiNearbyWindow = new FeedPoiNearbyWindow();
        feedPoiNearbyWindow.desc = this.desc;
        List<String> list = this.userIds;
        if (list != null) {
            feedPoiNearbyWindow.userIds = ValueObject.util_map(list, new w9j() { // from class: l.aph
                public final Object call(Object obj) {
                    return FeedPoiNearbyWindow.m1767a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.desc;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.userIds;
        int iHashCode2 = ((iHashCode + (list != null ? list.hashCode() : 0)) * 41) + this.newUserCount;
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
