package com.p000p1.mobile.putong.data;

import android.text.TextUtils;
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
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import l.mqi0;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LiveUserAvatarFrame extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveuseravatarframe";

    @ProtobufIndex(index = 3)
    public long expireTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f238id;

    @NonNull
    @ProtobufIndex(index = 4)
    public LiveRight liveRight;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;
    public static ProtobufAdapter<LiveUserAvatarFrame> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveUserAvatarFrame>() { // from class: com.p1.mobile.putong.data.LiveUserAvatarFrame.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveUserAvatarFrame liveUserAvatarFrame) {
            String str = liveUserAvatarFrame.f238id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = liveUserAvatarFrame.url;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iJ = iO + CodedOutputByteBufferNano.j(3, liveUserAvatarFrame.expireTime);
            LiveRight liveRight = liveUserAvatarFrame.liveRight;
            if (liveRight != null) {
                iJ += CodedOutputByteBufferNano.l(4, liveRight, LiveRight.PROTOBUF_ADAPTER);
            }
            ((MessageNano) liveUserAvatarFrame).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveUserAvatarFrame m18391parse(nb5 nb5Var) throws IOException {
            LiveUserAvatarFrame liveUserAvatarFrame = new LiveUserAvatarFrame();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveUserAvatarFrame.f238id == null) {
                        liveUserAvatarFrame.f238id = "";
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
                if (iU == 10) {
                    liveUserAvatarFrame.f238id = nb5Var.s();
                } else if (iU == 18) {
                    liveUserAvatarFrame.url = nb5Var.s();
                } else if (iU == 24) {
                    liveUserAvatarFrame.expireTime = nb5Var.k();
                } else {
                    if (iU != 34) {
                        if (liveUserAvatarFrame.f238id == null) {
                            liveUserAvatarFrame.f238id = "";
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
                    liveUserAvatarFrame.liveRight = (LiveRight) nb5Var.l(LiveRight.PROTOBUF_ADAPTER);
                }
            }
            return liveUserAvatarFrame;
        }

        public void serialize(LiveUserAvatarFrame liveUserAvatarFrame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveUserAvatarFrame.f238id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = liveUserAvatarFrame.url;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.I(3, liveUserAvatarFrame.expireTime);
            LiveRight liveRight = liveUserAvatarFrame.liveRight;
            if (liveRight != null) {
                codedOutputByteBufferNano.K(4, liveRight, LiveRight.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LiveUserAvatarFrame> JSON_ADAPTER = new ObjectJsonAdapter<LiveUserAvatarFrame>() { // from class: com.p1.mobile.putong.data.LiveUserAvatarFrame.2
        public Class getDataClass() {
            return LiveUserAvatarFrame.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveUserAvatarFrame mo17830newInstance() {
            return new LiveUserAvatarFrame();
        }

        public boolean parseField(LiveUserAvatarFrame liveUserAvatarFrame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expireTime":
                    liveUserAvatarFrame.expireTime = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    liveUserAvatarFrame.f238id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    liveUserAvatarFrame.url = jsonParser.getValueAsString();
                    return true;
                case "liveRight":
                    liveUserAvatarFrame.liveRight = (LiveRight) LiveRight.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveUserAvatarFrame liveUserAvatarFrame, JsonGenerator jsonGenerator) throws IOException {
            String str = liveUserAvatarFrame.f238id;
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveUserAvatarFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
        return !TextUtils.isEmpty(this.url) && this.expireTime >= mqi0.o() / 1000 && NullChecker.a(this.liveRight);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveUserAvatarFrame m18390clone() {
        LiveUserAvatarFrame liveUserAvatarFrame = new LiveUserAvatarFrame();
        liveUserAvatarFrame.f238id = this.f238id;
        liveUserAvatarFrame.url = this.url;
        liveUserAvatarFrame.expireTime = this.expireTime;
        LiveRight liveRight = this.liveRight;
        if (liveRight != null) {
            liveUserAvatarFrame.liveRight = liveRight.m18369clone();
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
        return ValueObject.util_equals(this.f238id, liveUserAvatarFrame.f238id) && ValueObject.util_equals(this.url, liveUserAvatarFrame.url) && this.expireTime == liveUserAvatarFrame.expireTime && ValueObject.util_equals(this.liveRight, liveUserAvatarFrame.liveRight);
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
        String str = this.f238id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.expireTime;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        LiveRight liveRight = this.liveRight;
        int iHashCode3 = i3 + (liveRight != null ? liveRight.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f238id == null) {
            this.f238id = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.liveRight == null) {
            this.liveRight = LiveRight.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
