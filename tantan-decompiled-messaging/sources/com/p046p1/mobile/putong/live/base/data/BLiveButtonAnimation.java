package com.p046p1.mobile.putong.live.base.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveButtonAnimation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivebuttonanimation";

    @ProtobufIndex(index = 2)
    public long enterPlayOffsetSeconds;

    @ProtobufIndex(index = 3)
    public long playGapSeconds;

    @NonNull
    @ProtobufIndex(index = 1)
    public String url;
    public static ProtobufAdapter<BLiveButtonAnimation> PROTOBUF_ADAPTER = new C11532a();
    public static JsonAdapter<BLiveButtonAnimation> JSON_ADAPTER = new ObjectJsonAdapter<BLiveButtonAnimation>() { // from class: com.p1.mobile.putong.live.base.data.BLiveButtonAnimation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveButtonAnimation.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveButtonAnimation newInstance() {
            return new BLiveButtonAnimation();
        }

        public boolean parseField(BLiveButtonAnimation bLiveButtonAnimation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "playGapSeconds":
                    bLiveButtonAnimation.playGapSeconds = jsonParser.getValueAsLong();
                    return true;
                case "url":
                    bLiveButtonAnimation.url = jsonParser.getValueAsString();
                    return true;
                case "enterPlayOffsetSeconds":
                    bLiveButtonAnimation.enterPlayOffsetSeconds = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveButtonAnimation bLiveButtonAnimation, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveButtonAnimation.url;
            if (str != null) {
                jsonGenerator.writeStringField("url", str);
            }
            jsonGenerator.writeNumberField("enterPlayOffsetSeconds", bLiveButtonAnimation.enterPlayOffsetSeconds);
            jsonGenerator.writeNumberField("playGapSeconds", bLiveButtonAnimation.playGapSeconds);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveButtonAnimation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveButtonAnimation$a */
    public class C11532a extends MessageNanoAdapter<BLiveButtonAnimation> {
        public C11532a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveButtonAnimation bLiveButtonAnimation) {
            String str = bLiveButtonAnimation.url;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17228j(2, bLiveButtonAnimation.enterPlayOffsetSeconds) + CodedOutputByteBufferNano.m17228j(3, bLiveButtonAnimation.playGapSeconds);
            bLiveButtonAnimation.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveButtonAnimation parse(nb5 nb5Var) throws IOException {
            BLiveButtonAnimation bLiveButtonAnimation = new BLiveButtonAnimation();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bLiveButtonAnimation.url != null) {
                        break;
                    }
                    bLiveButtonAnimation.url = "";
                    break;
                }
                if (iM158752u == 10) {
                    bLiveButtonAnimation.url = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    bLiveButtonAnimation.enterPlayOffsetSeconds = nb5Var.m158742k();
                } else {
                    if (iM158752u != 24) {
                        if (bLiveButtonAnimation.url != null) {
                            break;
                        }
                        bLiveButtonAnimation.url = "";
                        return bLiveButtonAnimation;
                    }
                    bLiveButtonAnimation.playGapSeconds = nb5Var.m158742k();
                }
            }
            return bLiveButtonAnimation;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveButtonAnimation bLiveButtonAnimation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveButtonAnimation.url;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17252I(2, bLiveButtonAnimation.enterPlayOffsetSeconds);
            codedOutputByteBufferNano.m17252I(3, bLiveButtonAnimation.playGapSeconds);
        }
    }

    public static BLiveButtonAnimation new_() {
        BLiveButtonAnimation bLiveButtonAnimation = new BLiveButtonAnimation();
        bLiveButtonAnimation.nullCheck();
        return bLiveButtonAnimation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveButtonAnimation mo223809clone() {
        BLiveButtonAnimation bLiveButtonAnimation = new BLiveButtonAnimation();
        bLiveButtonAnimation.url = this.url;
        bLiveButtonAnimation.enterPlayOffsetSeconds = this.enterPlayOffsetSeconds;
        bLiveButtonAnimation.playGapSeconds = this.playGapSeconds;
        return bLiveButtonAnimation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveButtonAnimation)) {
            return false;
        }
        BLiveButtonAnimation bLiveButtonAnimation = (BLiveButtonAnimation) obj;
        return ValueObject.util_equals(this.url, bLiveButtonAnimation.url) && this.enterPlayOffsetSeconds == bLiveButtonAnimation.enterPlayOffsetSeconds && this.playGapSeconds == bLiveButtonAnimation.playGapSeconds;
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
        String str = this.url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.enterPlayOffsetSeconds;
        int i3 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.playGapSeconds;
        int i4 = i3 + ((int) (j2 ^ (j2 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
