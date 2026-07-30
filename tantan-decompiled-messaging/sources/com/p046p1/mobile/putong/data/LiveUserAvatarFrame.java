package com.p046p1.mobile.putong.data;

import android.text.TextUtils;
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
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.mqi0;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class LiveUserAvatarFrame extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveuseravatarframe";

    @ProtobufIndex(index = 3)
    public long expireTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38777id;

    @NonNull
    @ProtobufIndex(index = 4)
    public LiveRight liveRight;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;
    public static ProtobufAdapter<LiveUserAvatarFrame> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveUserAvatarFrame>() { // from class: com.p1.mobile.putong.data.LiveUserAvatarFrame.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveUserAvatarFrame liveUserAvatarFrame) {
            String str = liveUserAvatarFrame.f38777id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = liveUserAvatarFrame.url;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17228j = iM17233o + CodedOutputByteBufferNano.m17228j(3, liveUserAvatarFrame.expireTime);
            LiveRight liveRight = liveUserAvatarFrame.liveRight;
            if (liveRight != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(4, liveRight, LiveRight.PROTOBUF_ADAPTER);
            }
            liveUserAvatarFrame.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveUserAvatarFrame parse(nb5 nb5Var) throws IOException {
            LiveUserAvatarFrame liveUserAvatarFrame = new LiveUserAvatarFrame();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveUserAvatarFrame.f38777id == null) {
                        liveUserAvatarFrame.f38777id = "";
                    }
                    if (liveUserAvatarFrame.url == null) {
                        liveUserAvatarFrame.url = "";
                    }
                    if (liveUserAvatarFrame.liveRight != null) {
                        break;
                    }
                    liveUserAvatarFrame.liveRight = LiveRight.new_();
                    break;
                }
                if (iM158752u == 10) {
                    liveUserAvatarFrame.f38777id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    liveUserAvatarFrame.url = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    liveUserAvatarFrame.expireTime = nb5Var.m158742k();
                } else {
                    if (iM158752u != 34) {
                        if (liveUserAvatarFrame.f38777id == null) {
                            liveUserAvatarFrame.f38777id = "";
                        }
                        if (liveUserAvatarFrame.url == null) {
                            liveUserAvatarFrame.url = "";
                        }
                        if (liveUserAvatarFrame.liveRight != null) {
                            break;
                        }
                        liveUserAvatarFrame.liveRight = LiveRight.new_();
                        return liveUserAvatarFrame;
                    }
                    liveUserAvatarFrame.liveRight = (LiveRight) nb5Var.m158743l(LiveRight.PROTOBUF_ADAPTER);
                }
            }
            return liveUserAvatarFrame;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveUserAvatarFrame liveUserAvatarFrame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveUserAvatarFrame.f38777id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = liveUserAvatarFrame.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17252I(3, liveUserAvatarFrame.expireTime);
            LiveRight liveRight = liveUserAvatarFrame.liveRight;
            if (liveRight != null) {
                codedOutputByteBufferNano.m17254K(4, liveRight, LiveRight.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LiveUserAvatarFrame> JSON_ADAPTER = new ObjectJsonAdapter<LiveUserAvatarFrame>() { // from class: com.p1.mobile.putong.data.LiveUserAvatarFrame.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveUserAvatarFrame.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveUserAvatarFrame newInstance() {
            return new LiveUserAvatarFrame();
        }

        public boolean parseField(LiveUserAvatarFrame liveUserAvatarFrame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expireTime":
                    liveUserAvatarFrame.expireTime = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    liveUserAvatarFrame.f38777id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    liveUserAvatarFrame.url = jsonParser.getValueAsString();
                    return true;
                case "liveRight":
                    liveUserAvatarFrame.liveRight = LiveRight.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveUserAvatarFrame liveUserAvatarFrame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "expireTime":
                    return true;
                case "id":
                    return false;
                case "url":
                case "liveRight":
                    return true;
                default:
                    return super.parseFieldCheck(liveUserAvatarFrame, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveUserAvatarFrame liveUserAvatarFrame, JsonGenerator jsonGenerator) throws IOException {
            String str = liveUserAvatarFrame.f38777id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = liveUserAvatarFrame.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            jsonGenerator.writeNumberField("expireTime", liveUserAvatarFrame.expireTime);
            if (liveUserAvatarFrame.liveRight != null) {
                jsonGenerator.writeFieldName(SchemeKey.liveRight);
                LiveRight.JSON_ADAPTER.serialize(liveUserAvatarFrame.liveRight, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveUserAvatarFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveUserAvatarFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveUserAvatarFrame new_() {
        LiveUserAvatarFrame liveUserAvatarFrame = new LiveUserAvatarFrame();
        liveUserAvatarFrame.nullCheck();
        return liveUserAvatarFrame;
    }

    public boolean canShow() {
        return !TextUtils.isEmpty(this.url) && this.expireTime >= mqi0.m155944o() / 1000 && NullChecker.m81303a(this.liveRight);
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveUserAvatarFrame mo223809clone() {
        LiveUserAvatarFrame liveUserAvatarFrame = new LiveUserAvatarFrame();
        liveUserAvatarFrame.f38777id = this.f38777id;
        liveUserAvatarFrame.url = this.url;
        liveUserAvatarFrame.expireTime = this.expireTime;
        LiveRight liveRight = this.liveRight;
        if (liveRight != null) {
            liveUserAvatarFrame.liveRight = liveRight.mo223809clone();
        }
        return liveUserAvatarFrame;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveUserAvatarFrame)) {
            return false;
        }
        LiveUserAvatarFrame liveUserAvatarFrame = (LiveUserAvatarFrame) obj;
        return ValueObject.util_equals(this.f38777id, liveUserAvatarFrame.f38777id) && ValueObject.util_equals(this.url, liveUserAvatarFrame.url) && this.expireTime == liveUserAvatarFrame.expireTime && ValueObject.util_equals(this.liveRight, liveUserAvatarFrame.liveRight);
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
        String str = this.f38777id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.expireTime;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        LiveRight liveRight = this.liveRight;
        int iHashCode3 = i3 + (liveRight != null ? liveRight.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38777id == null) {
            this.f38777id = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.liveRight == null) {
            this.liveRight = LiveRight.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
