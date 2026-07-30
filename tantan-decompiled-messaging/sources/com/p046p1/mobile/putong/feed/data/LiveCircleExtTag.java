package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class LiveCircleExtTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livecircleexttag";

    @NonNull
    @ProtobufIndex(index = 1)
    public String tagName;

    @NonNull
    @ProtobufIndex(index = 2)
    public String tagUrl;
    public static ProtobufAdapter<LiveCircleExtTag> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveCircleExtTag>() { // from class: com.p1.mobile.putong.feed.data.LiveCircleExtTag.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveCircleExtTag liveCircleExtTag) {
            String str = liveCircleExtTag.tagName;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = liveCircleExtTag.tagUrl;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            liveCircleExtTag.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveCircleExtTag parse(nb5 nb5Var) throws IOException {
            LiveCircleExtTag liveCircleExtTag = new LiveCircleExtTag();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveCircleExtTag.tagName == null) {
                        liveCircleExtTag.tagName = "";
                    }
                    if (liveCircleExtTag.tagUrl != null) {
                        break;
                    }
                    liveCircleExtTag.tagUrl = "";
                    break;
                }
                if (iM158752u == 10) {
                    liveCircleExtTag.tagName = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (liveCircleExtTag.tagName == null) {
                            liveCircleExtTag.tagName = "";
                        }
                        if (liveCircleExtTag.tagUrl != null) {
                            break;
                        }
                        liveCircleExtTag.tagUrl = "";
                        return liveCircleExtTag;
                    }
                    liveCircleExtTag.tagUrl = nb5Var.m158750s();
                }
            }
            return liveCircleExtTag;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveCircleExtTag liveCircleExtTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveCircleExtTag.tagName;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = liveCircleExtTag.tagUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<LiveCircleExtTag> JSON_ADAPTER = new ObjectJsonAdapter<LiveCircleExtTag>() { // from class: com.p1.mobile.putong.feed.data.LiveCircleExtTag.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveCircleExtTag.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveCircleExtTag newInstance() {
            return new LiveCircleExtTag();
        }

        public boolean parseField(LiveCircleExtTag liveCircleExtTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("tagName")) {
                liveCircleExtTag.tagName = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("tagUrl")) {
                return false;
            }
            liveCircleExtTag.tagUrl = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LiveCircleExtTag liveCircleExtTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("tagName") || str.equals("tagUrl")) {
                return true;
            }
            return super.parseFieldCheck(liveCircleExtTag, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveCircleExtTag liveCircleExtTag, JsonGenerator jsonGenerator) throws IOException {
            String str = liveCircleExtTag.tagName;
            if (str != null) {
                jsonGenerator.writeStringField("tagName", str);
            }
            String str2 = liveCircleExtTag.tagUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("tagUrl", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveCircleExtTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveCircleExtTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveCircleExtTag new_() {
        LiveCircleExtTag liveCircleExtTag = new LiveCircleExtTag();
        liveCircleExtTag.nullCheck();
        return liveCircleExtTag;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveCircleExtTag mo223809clone() {
        LiveCircleExtTag liveCircleExtTag = new LiveCircleExtTag();
        liveCircleExtTag.tagName = this.tagName;
        liveCircleExtTag.tagUrl = this.tagUrl;
        return liveCircleExtTag;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveCircleExtTag)) {
            return false;
        }
        LiveCircleExtTag liveCircleExtTag = (LiveCircleExtTag) obj;
        return ValueObject.util_equals(this.tagName, liveCircleExtTag.tagName) && ValueObject.util_equals(this.tagUrl, liveCircleExtTag.tagUrl);
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
        String str = this.tagName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.tagUrl;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.tagName == null) {
            this.tagName = "";
        }
        if (this.tagUrl == null) {
            this.tagUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
