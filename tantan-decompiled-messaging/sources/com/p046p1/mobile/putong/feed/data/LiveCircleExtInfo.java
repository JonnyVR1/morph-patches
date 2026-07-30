package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Grade;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.LiveCircleExtTag;
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
public class LiveCircleExtInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livecircleextinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public String coverUrl;

    @ProtobufIndex(index = 2)
    public int grade;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39225id;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<LiveCircleExtTag> tags;

    @ProtobufIndex(index = 5)
    public int views;
    public static ProtobufAdapter<LiveCircleExtInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveCircleExtInfo>() { // from class: com.p1.mobile.putong.feed.data.LiveCircleExtInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveCircleExtInfo liveCircleExtInfo) {
            String str = liveCircleExtInfo.f39225id;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, liveCircleExtInfo.grade);
            String str2 = liveCircleExtInfo.coverUrl;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            List<LiveCircleExtTag> list = liveCircleExtInfo.tags;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, list, LiveCircleExtTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(5, liveCircleExtInfo.views);
            liveCircleExtInfo.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveCircleExtInfo parse(nb5 nb5Var) throws IOException {
            LiveCircleExtInfo liveCircleExtInfo = new LiveCircleExtInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveCircleExtInfo.f39225id == null) {
                        liveCircleExtInfo.f39225id = "";
                    }
                    if (liveCircleExtInfo.coverUrl == null) {
                        liveCircleExtInfo.coverUrl = "";
                    }
                    if (liveCircleExtInfo.tags != null) {
                        break;
                    }
                    liveCircleExtInfo.tags = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    liveCircleExtInfo.f39225id = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    liveCircleExtInfo.grade = nb5Var.m158741j();
                } else if (iM158752u == 26) {
                    liveCircleExtInfo.coverUrl = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    liveCircleExtInfo.tags = (List) nb5Var.m158743l(LiveCircleExtTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 40) {
                        if (liveCircleExtInfo.f39225id == null) {
                            liveCircleExtInfo.f39225id = "";
                        }
                        if (liveCircleExtInfo.coverUrl == null) {
                            liveCircleExtInfo.coverUrl = "";
                        }
                        if (liveCircleExtInfo.tags != null) {
                            break;
                        }
                        liveCircleExtInfo.tags = new ArrayList();
                        return liveCircleExtInfo;
                    }
                    liveCircleExtInfo.views = nb5Var.m158741j();
                }
            }
            return liveCircleExtInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveCircleExtInfo liveCircleExtInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveCircleExtInfo.f39225id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, liveCircleExtInfo.grade);
            String str2 = liveCircleExtInfo.coverUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            List<LiveCircleExtTag> list = liveCircleExtInfo.tags;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(4, list, LiveCircleExtTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(5, liveCircleExtInfo.views);
        }
    };
    public static JsonAdapter<LiveCircleExtInfo> JSON_ADAPTER = new ObjectJsonAdapter<LiveCircleExtInfo>() { // from class: com.p1.mobile.putong.feed.data.LiveCircleExtInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveCircleExtInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveCircleExtInfo newInstance() {
            return new LiveCircleExtInfo();
        }

        public boolean parseField(LiveCircleExtInfo liveCircleExtInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "coverUrl":
                    liveCircleExtInfo.coverUrl = jsonParser.getValueAsString();
                    return true;
                case "id":
                    liveCircleExtInfo.f39225id = jsonParser.getValueAsString();
                    return false;
                case "tags":
                    liveCircleExtInfo.tags = JsonAdapter.parseArray(jsonParser, LiveCircleExtTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "grade":
                    liveCircleExtInfo.grade = jsonParser.getValueAsInt();
                    return true;
                case "views":
                    liveCircleExtInfo.views = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveCircleExtInfo liveCircleExtInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "coverUrl":
                    return true;
                case "id":
                    return false;
                case "tags":
                case "grade":
                case "views":
                    return true;
                default:
                    return super.parseFieldCheck(liveCircleExtInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveCircleExtInfo liveCircleExtInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = liveCircleExtInfo.f39225id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField(Grade.TYPE, liveCircleExtInfo.grade);
            String str2 = liveCircleExtInfo.coverUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("coverUrl", str2);
            }
            if (liveCircleExtInfo.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(liveCircleExtInfo.tags, jsonGenerator, LiveCircleExtTag.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("views", liveCircleExtInfo.views);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveCircleExtInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveCircleExtInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveCircleExtInfo new_() {
        LiveCircleExtInfo liveCircleExtInfo = new LiveCircleExtInfo();
        liveCircleExtInfo.nullCheck();
        return liveCircleExtInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveCircleExtInfo mo223809clone() {
        LiveCircleExtInfo liveCircleExtInfo = new LiveCircleExtInfo();
        liveCircleExtInfo.f39225id = this.f39225id;
        liveCircleExtInfo.grade = this.grade;
        liveCircleExtInfo.coverUrl = this.coverUrl;
        List<LiveCircleExtTag> list = this.tags;
        if (list != null) {
            liveCircleExtInfo.tags = ValueObject.util_map(list, new w9j() { // from class: l.y2s
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((LiveCircleExtTag) obj).mo223809clone();
                }
            });
        }
        liveCircleExtInfo.views = this.views;
        return liveCircleExtInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveCircleExtInfo)) {
            return false;
        }
        LiveCircleExtInfo liveCircleExtInfo = (LiveCircleExtInfo) obj;
        return ValueObject.util_equals(this.f39225id, liveCircleExtInfo.f39225id) && this.grade == liveCircleExtInfo.grade && ValueObject.util_equals(this.coverUrl, liveCircleExtInfo.coverUrl) && ValueObject.util_equals(this.tags, liveCircleExtInfo.tags) && this.views == liveCircleExtInfo.views;
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
        String str = this.f39225id;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.grade) * 41;
        String str2 = this.coverUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<LiveCircleExtTag> list = this.tags;
        int iHashCode3 = ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 41) + this.views;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39225id == null) {
            this.f39225id = "";
        }
        if (this.coverUrl == null) {
            this.coverUrl = "";
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
