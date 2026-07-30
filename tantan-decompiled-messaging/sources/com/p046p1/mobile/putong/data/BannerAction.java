package com.p046p1.mobile.putong.data;

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
public class BannerAction extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "banneraction";

    @NonNull
    @ProtobufIndex(index = 1)
    public BannerFrequency frequency;

    @NonNull
    @ProtobufIndex(index = 3)
    public BannerRedDot red_dot;

    @NonNull
    @ProtobufIndex(index = 4)
    public BannerScroll scroll;

    @ProtobufIndex(index = 2)
    public int swipe_count;
    public static ProtobufAdapter<BannerAction> PROTOBUF_ADAPTER = new MessageNanoAdapter<BannerAction>() { // from class: com.p1.mobile.putong.data.BannerAction.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BannerAction bannerAction) {
            BannerFrequency bannerFrequency = bannerAction.frequency;
            int iM17230l = (bannerFrequency != null ? CodedOutputByteBufferNano.m17230l(1, bannerFrequency, BannerFrequency.PROTOBUF_ADAPTER) : 0) + CodedOutputByteBufferNano.m17226h(2, bannerAction.swipe_count);
            BannerRedDot bannerRedDot = bannerAction.red_dot;
            if (bannerRedDot != null) {
                iM17230l += CodedOutputByteBufferNano.m17226h(3, bannerRedDot.ordinal());
            }
            BannerScroll bannerScroll = bannerAction.scroll;
            if (bannerScroll != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(4, bannerScroll, BannerScroll.PROTOBUF_ADAPTER);
            }
            BannerRedDot bannerRedDot2 = bannerAction.red_dot;
            if (bannerRedDot2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(5, bannerRedDot2, BannerRedDot.PROTOBUF_ADAPTER);
            }
            bannerAction.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BannerAction parse(nb5 nb5Var) throws IOException {
            BannerAction bannerAction = new BannerAction();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bannerAction.red_dot == null && numValueOf != null) {
                        bannerAction.red_dot = (BannerRedDot) BannerRedDot.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (bannerAction.frequency == null) {
                        bannerAction.frequency = BannerFrequency.new_();
                    }
                    if (bannerAction.red_dot == null) {
                        bannerAction.red_dot = (BannerRedDot) BannerRedDot.JSON_ADAPTER.defaultEnum();
                    }
                    if (bannerAction.scroll != null) {
                        break;
                    }
                    bannerAction.scroll = BannerScroll.new_();
                    break;
                }
                if (iM158752u == 10) {
                    bannerAction.frequency = (BannerFrequency) nb5Var.m158743l(BannerFrequency.PROTOBUF_ADAPTER);
                } else if (iM158752u == 16) {
                    bannerAction.swipe_count = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 34) {
                    bannerAction.scroll = (BannerScroll) nb5Var.m158743l(BannerScroll.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 42) {
                        if (bannerAction.red_dot == null && numValueOf != null) {
                            bannerAction.red_dot = (BannerRedDot) BannerRedDot.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (bannerAction.frequency == null) {
                            bannerAction.frequency = BannerFrequency.new_();
                        }
                        if (bannerAction.red_dot == null) {
                            bannerAction.red_dot = (BannerRedDot) BannerRedDot.JSON_ADAPTER.defaultEnum();
                        }
                        if (bannerAction.scroll != null) {
                            break;
                        }
                        bannerAction.scroll = BannerScroll.new_();
                        return bannerAction;
                    }
                    bannerAction.red_dot = (BannerRedDot) nb5Var.m158743l(BannerRedDot.PROTOBUF_ADAPTER);
                }
            }
            return bannerAction;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BannerAction bannerAction, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            BannerFrequency bannerFrequency = bannerAction.frequency;
            if (bannerFrequency != null) {
                codedOutputByteBufferNano.m17254K(1, bannerFrequency, BannerFrequency.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(2, bannerAction.swipe_count);
            BannerRedDot bannerRedDot = bannerAction.red_dot;
            if (bannerRedDot != null) {
                codedOutputByteBufferNano.m17250G(3, bannerRedDot.ordinal());
            }
            BannerScroll bannerScroll = bannerAction.scroll;
            if (bannerScroll != null) {
                codedOutputByteBufferNano.m17254K(4, bannerScroll, BannerScroll.PROTOBUF_ADAPTER);
            }
            BannerRedDot bannerRedDot2 = bannerAction.red_dot;
            if (bannerRedDot2 != null) {
                codedOutputByteBufferNano.m17254K(5, bannerRedDot2, BannerRedDot.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<BannerAction> JSON_ADAPTER = new ObjectJsonAdapter<BannerAction>() { // from class: com.p1.mobile.putong.data.BannerAction.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BannerAction.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BannerAction newInstance() {
            return new BannerAction();
        }

        public boolean parseField(BannerAction bannerAction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "scroll":
                    bannerAction.scroll = BannerScroll.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "frequency":
                    bannerAction.frequency = BannerFrequency.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "swipe_count":
                    bannerAction.swipe_count = jsonParser.getValueAsInt();
                    return true;
                case "red_dot":
                    bannerAction.red_dot = BannerRedDot.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BannerAction bannerAction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "scroll":
                case "frequency":
                case "swipe_count":
                case "red_dot":
                    return true;
                default:
                    return super.parseFieldCheck(bannerAction, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BannerAction bannerAction, JsonGenerator jsonGenerator) throws IOException {
            if (bannerAction.frequency != null) {
                jsonGenerator.writeFieldName("frequency");
                BannerFrequency.JSON_ADAPTER.serialize(bannerAction.frequency, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("swipe_count", bannerAction.swipe_count);
            if (bannerAction.red_dot != null) {
                jsonGenerator.writeFieldName("red_dot");
                BannerRedDot.JSON_ADAPTER.serialize(bannerAction.red_dot, jsonGenerator, true);
            }
            if (bannerAction.scroll != null) {
                jsonGenerator.writeFieldName("scroll");
                BannerScroll.JSON_ADAPTER.serialize(bannerAction.scroll, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BannerAction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BannerAction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BannerAction new_() {
        BannerAction bannerAction = new BannerAction();
        bannerAction.nullCheck();
        return bannerAction;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BannerAction mo223809clone() {
        BannerAction bannerAction = new BannerAction();
        BannerFrequency bannerFrequency = this.frequency;
        if (bannerFrequency != null) {
            bannerAction.frequency = bannerFrequency.mo223809clone();
        }
        bannerAction.swipe_count = this.swipe_count;
        bannerAction.red_dot = this.red_dot;
        BannerScroll bannerScroll = this.scroll;
        if (bannerScroll != null) {
            bannerAction.scroll = bannerScroll.mo223809clone();
        }
        return bannerAction;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BannerAction)) {
            return false;
        }
        BannerAction bannerAction = (BannerAction) obj;
        return ValueObject.util_equals(this.frequency, bannerAction.frequency) && this.swipe_count == bannerAction.swipe_count && ValueObject.util_equals(this.red_dot, bannerAction.red_dot) && ValueObject.util_equals(this.scroll, bannerAction.scroll);
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
        BannerFrequency bannerFrequency = this.frequency;
        int iHashCode = (((i2 + (bannerFrequency != null ? bannerFrequency.hashCode() : 0)) * 41) + this.swipe_count) * 41;
        BannerRedDot bannerRedDot = this.red_dot;
        int iHashCode2 = (iHashCode + (bannerRedDot != null ? bannerRedDot.hashCode() : 0)) * 41;
        BannerScroll bannerScroll = this.scroll;
        int iHashCode3 = iHashCode2 + (bannerScroll != null ? bannerScroll.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.frequency == null) {
            this.frequency = BannerFrequency.new_();
        }
        if (this.red_dot == null) {
            this.red_dot = (BannerRedDot) BannerRedDot.JSON_ADAPTER.defaultEnum();
        }
        if (this.scroll == null) {
            this.scroll = BannerScroll.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
