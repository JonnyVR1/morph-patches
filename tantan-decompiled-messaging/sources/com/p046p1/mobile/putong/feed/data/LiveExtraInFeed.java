package com.p046p1.mobile.putong.feed.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Live;
import com.p046p1.mobile.putong.data.Owner;
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
public class LiveExtraInFeed extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveextrainfeed";
    private static final String TYPE_MULTI_CALL = "multiCall";

    @NonNull
    @ProtobufIndex(index = 2)
    public Owner momentOwner;

    @NonNull
    @ProtobufIndex(index = 1)
    public LiveMultiCallInfo multiCallInfo;

    @NonNull
    @ProtobufIndex(index = 3)
    public String renderType;
    public static ProtobufAdapter<LiveExtraInFeed> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveExtraInFeed>() { // from class: com.p1.mobile.putong.feed.data.LiveExtraInFeed.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveExtraInFeed liveExtraInFeed) {
            LiveMultiCallInfo liveMultiCallInfo = liveExtraInFeed.multiCallInfo;
            int iM17230l = liveMultiCallInfo != null ? CodedOutputByteBufferNano.m17230l(1, liveMultiCallInfo, LiveMultiCallInfo.PROTOBUF_ADAPTER) : 0;
            Owner owner = liveExtraInFeed.momentOwner;
            if (owner != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            String str = liveExtraInFeed.renderType;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(3, str);
            }
            liveExtraInFeed.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveExtraInFeed parse(nb5 nb5Var) throws IOException {
            LiveExtraInFeed liveExtraInFeed = new LiveExtraInFeed();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveExtraInFeed.multiCallInfo == null) {
                        liveExtraInFeed.multiCallInfo = LiveMultiCallInfo.new_();
                    }
                    if (liveExtraInFeed.momentOwner == null) {
                        liveExtraInFeed.momentOwner = Owner.new_();
                    }
                    if (liveExtraInFeed.renderType != null) {
                        break;
                    }
                    liveExtraInFeed.renderType = "";
                    break;
                }
                if (iM158752u == 10) {
                    liveExtraInFeed.multiCallInfo = (LiveMultiCallInfo) nb5Var.m158743l(LiveMultiCallInfo.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    liveExtraInFeed.momentOwner = (Owner) nb5Var.m158743l(Owner.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 26) {
                        if (liveExtraInFeed.multiCallInfo == null) {
                            liveExtraInFeed.multiCallInfo = LiveMultiCallInfo.new_();
                        }
                        if (liveExtraInFeed.momentOwner == null) {
                            liveExtraInFeed.momentOwner = Owner.new_();
                        }
                        if (liveExtraInFeed.renderType != null) {
                            break;
                        }
                        liveExtraInFeed.renderType = "";
                        return liveExtraInFeed;
                    }
                    liveExtraInFeed.renderType = nb5Var.m158750s();
                }
            }
            return liveExtraInFeed;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveExtraInFeed liveExtraInFeed, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            LiveMultiCallInfo liveMultiCallInfo = liveExtraInFeed.multiCallInfo;
            if (liveMultiCallInfo != null) {
                codedOutputByteBufferNano.m17254K(1, liveMultiCallInfo, LiveMultiCallInfo.PROTOBUF_ADAPTER);
            }
            Owner owner = liveExtraInFeed.momentOwner;
            if (owner != null) {
                codedOutputByteBufferNano.m17254K(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            String str = liveExtraInFeed.renderType;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(3, str);
            }
        }
    };
    public static JsonAdapter<LiveExtraInFeed> JSON_ADAPTER = new ObjectJsonAdapter<LiveExtraInFeed>() { // from class: com.p1.mobile.putong.feed.data.LiveExtraInFeed.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveExtraInFeed.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveExtraInFeed newInstance() {
            return new LiveExtraInFeed();
        }

        public boolean parseField(LiveExtraInFeed liveExtraInFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "momentOwner":
                    liveExtraInFeed.momentOwner = Owner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "renderType":
                    liveExtraInFeed.renderType = jsonParser.getValueAsString();
                    return true;
                case "multiCallInfo":
                    liveExtraInFeed.multiCallInfo = LiveMultiCallInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveExtraInFeed liveExtraInFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "momentOwner":
                case "renderType":
                case "multiCallInfo":
                    return true;
                default:
                    return super.parseFieldCheck(liveExtraInFeed, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveExtraInFeed liveExtraInFeed, JsonGenerator jsonGenerator) throws IOException {
            if (liveExtraInFeed.multiCallInfo != null) {
                jsonGenerator.writeFieldName("multiCallInfo");
                LiveMultiCallInfo.JSON_ADAPTER.serialize(liveExtraInFeed.multiCallInfo, jsonGenerator, true);
            }
            if (liveExtraInFeed.momentOwner != null) {
                jsonGenerator.writeFieldName("momentOwner");
                Owner.JSON_ADAPTER.serialize(liveExtraInFeed.momentOwner, jsonGenerator, true);
            }
            String str = liveExtraInFeed.renderType;
            if (str != null) {
                jsonGenerator.writeStringField("renderType", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveExtraInFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveExtraInFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveExtraInFeed getFromLive(Live live) {
        Object extTabData = live.getExtTabData(LiveExtraInFeed.class);
        if (extTabData instanceof LiveExtraInFeed) {
            return (LiveExtraInFeed) extTabData;
        }
        return null;
    }

    public static LiveExtraInFeed new_() {
        LiveExtraInFeed liveExtraInFeed = new LiveExtraInFeed();
        liveExtraInFeed.nullCheck();
        return liveExtraInFeed;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveExtraInFeed mo223809clone() {
        LiveExtraInFeed liveExtraInFeed = new LiveExtraInFeed();
        LiveMultiCallInfo liveMultiCallInfo = this.multiCallInfo;
        if (liveMultiCallInfo != null) {
            liveExtraInFeed.multiCallInfo = liveMultiCallInfo.mo223809clone();
        }
        Owner owner = this.momentOwner;
        if (owner != null) {
            liveExtraInFeed.momentOwner = owner.mo223809clone();
        }
        liveExtraInFeed.renderType = this.renderType;
        return liveExtraInFeed;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveExtraInFeed)) {
            return false;
        }
        LiveExtraInFeed liveExtraInFeed = (LiveExtraInFeed) obj;
        return ValueObject.util_equals(this.multiCallInfo, liveExtraInFeed.multiCallInfo) && ValueObject.util_equals(this.momentOwner, liveExtraInFeed.momentOwner) && ValueObject.util_equals(this.renderType, liveExtraInFeed.renderType);
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
        LiveMultiCallInfo liveMultiCallInfo = this.multiCallInfo;
        int iHashCode = (i2 + (liveMultiCallInfo != null ? liveMultiCallInfo.hashCode() : 0)) * 41;
        Owner owner = this.momentOwner;
        int iHashCode2 = (iHashCode + (owner != null ? owner.hashCode() : 0)) * 41;
        String str = this.renderType;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    public boolean isMultiCallType() {
        return TextUtils.equals("multiCall", this.renderType);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.multiCallInfo == null) {
            this.multiCallInfo = LiveMultiCallInfo.new_();
        }
        if (this.momentOwner == null) {
            this.momentOwner = Owner.new_();
        }
        if (this.renderType == null) {
            this.renderType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
