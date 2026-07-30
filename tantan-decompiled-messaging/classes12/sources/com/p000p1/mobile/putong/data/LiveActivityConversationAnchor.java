package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LiveActivityConversationAnchor extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveactivityconversationanchor";

    @NonNull
    @ProtobufIndex(index = 1)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String avatar;

    @NonNull
    @ProtobufIndex(index = 3)
    public String scheme;
    public static ProtobufAdapter<LiveActivityConversationAnchor> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveActivityConversationAnchor>() { // from class: com.p1.mobile.putong.data.LiveActivityConversationAnchor.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveActivityConversationAnchor liveActivityConversationAnchor) {
            String str = liveActivityConversationAnchor.anchorId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = liveActivityConversationAnchor.avatar;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = liveActivityConversationAnchor.scheme;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) liveActivityConversationAnchor).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveActivityConversationAnchor m18310parse(nb5 nb5Var) throws IOException {
            LiveActivityConversationAnchor liveActivityConversationAnchor = new LiveActivityConversationAnchor();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveActivityConversationAnchor.anchorId == null) {
                        liveActivityConversationAnchor.anchorId = "";
                    }
                    if (liveActivityConversationAnchor.avatar == null) {
                        liveActivityConversationAnchor.avatar = "";
                    }
                    if (liveActivityConversationAnchor.scheme != null) {
                        break;
                    }
                    liveActivityConversationAnchor.scheme = "";
                    break;
                }
                if (iU == 10) {
                    liveActivityConversationAnchor.anchorId = nb5Var.s();
                } else if (iU == 18) {
                    liveActivityConversationAnchor.avatar = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (liveActivityConversationAnchor.anchorId == null) {
                            liveActivityConversationAnchor.anchorId = "";
                        }
                        if (liveActivityConversationAnchor.avatar == null) {
                            liveActivityConversationAnchor.avatar = "";
                        }
                        if (liveActivityConversationAnchor.scheme != null) {
                            break;
                        }
                        liveActivityConversationAnchor.scheme = "";
                        return liveActivityConversationAnchor;
                    }
                    liveActivityConversationAnchor.scheme = nb5Var.s();
                }
            }
            return liveActivityConversationAnchor;
        }

        public void serialize(LiveActivityConversationAnchor liveActivityConversationAnchor, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveActivityConversationAnchor.anchorId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = liveActivityConversationAnchor.avatar;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = liveActivityConversationAnchor.scheme;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<LiveActivityConversationAnchor> JSON_ADAPTER = new ObjectJsonAdapter<LiveActivityConversationAnchor>() { // from class: com.p1.mobile.putong.data.LiveActivityConversationAnchor.2
        public Class getDataClass() {
            return LiveActivityConversationAnchor.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveActivityConversationAnchor mo17830newInstance() {
            return new LiveActivityConversationAnchor();
        }

        public boolean parseField(LiveActivityConversationAnchor liveActivityConversationAnchor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    liveActivityConversationAnchor.avatar = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    liveActivityConversationAnchor.anchorId = jsonParser.getValueAsString();
                    return true;
                case "scheme":
                    liveActivityConversationAnchor.scheme = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveActivityConversationAnchor liveActivityConversationAnchor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "avatar":
                case "anchorId":
                case "scheme":
                    return true;
                default:
                    return super.parseFieldCheck(liveActivityConversationAnchor, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveActivityConversationAnchor liveActivityConversationAnchor, JsonGenerator jsonGenerator) throws IOException {
            String str = liveActivityConversationAnchor.anchorId;
            if (str != null) {
                jsonGenerator.writeStringField("anchorId", str);
            }
            String str2 = liveActivityConversationAnchor.avatar;
            if (str2 != null) {
                jsonGenerator.writeStringField("avatar", str2);
            }
            String str3 = liveActivityConversationAnchor.scheme;
            if (str3 != null) {
                jsonGenerator.writeStringField("scheme", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveActivityConversationAnchor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveActivityConversationAnchor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveActivityConversationAnchor new_() {
        LiveActivityConversationAnchor liveActivityConversationAnchor = new LiveActivityConversationAnchor();
        liveActivityConversationAnchor.nullCheck();
        return liveActivityConversationAnchor;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveActivityConversationAnchor m18309clone() {
        LiveActivityConversationAnchor liveActivityConversationAnchor = new LiveActivityConversationAnchor();
        liveActivityConversationAnchor.anchorId = this.anchorId;
        liveActivityConversationAnchor.avatar = this.avatar;
        liveActivityConversationAnchor.scheme = this.scheme;
        return liveActivityConversationAnchor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveActivityConversationAnchor)) {
            return false;
        }
        LiveActivityConversationAnchor liveActivityConversationAnchor = (LiveActivityConversationAnchor) obj;
        return ValueObject.util_equals(this.anchorId, liveActivityConversationAnchor.anchorId) && ValueObject.util_equals(this.avatar, liveActivityConversationAnchor.avatar) && ValueObject.util_equals(this.scheme, liveActivityConversationAnchor.scheme);
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
        String str = this.anchorId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.avatar;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.scheme;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.scheme == null) {
            this.scheme = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
