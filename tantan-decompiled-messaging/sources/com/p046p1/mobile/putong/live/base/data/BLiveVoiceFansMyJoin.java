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
public class BLiveVoiceFansMyJoin extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivevoicefansmyjoin";

    @NonNull
    @ProtobufIndex(index = 3)
    public String anchorAvatar;

    @NonNull
    @ProtobufIndex(index = 1)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String anchorName;

    @ProtobufIndex(index = 7)
    public boolean equipped;

    @NonNull
    @ProtobufIndex(index = 5)
    public String medalColor;

    @ProtobufIndex(index = 4)
    public int medalGrade;

    @NonNull
    @ProtobufIndex(index = 6)
    public String medalName;
    public static ProtobufAdapter<BLiveVoiceFansMyJoin> PROTOBUF_ADAPTER = new C12284a();
    public static JsonAdapter<BLiveVoiceFansMyJoin> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceFansMyJoin>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceFansMyJoin.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceFansMyJoin.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceFansMyJoin newInstance() {
            return new BLiveVoiceFansMyJoin();
        }

        public boolean parseField(BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anchorAvatar":
                    bLiveVoiceFansMyJoin.anchorAvatar = jsonParser.getValueAsString();
                    return true;
                case "anchorName":
                    bLiveVoiceFansMyJoin.anchorName = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    bLiveVoiceFansMyJoin.anchorId = jsonParser.getValueAsString();
                    return true;
                case "medalColor":
                    bLiveVoiceFansMyJoin.medalColor = jsonParser.getValueAsString();
                    return true;
                case "medalGrade":
                    bLiveVoiceFansMyJoin.medalGrade = jsonParser.getValueAsInt();
                    return true;
                case "equipped":
                    bLiveVoiceFansMyJoin.equipped = jsonParser.getValueAsBoolean();
                    return true;
                case "medalName":
                    bLiveVoiceFansMyJoin.medalName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceFansMyJoin.anchorId;
            if (str != null) {
                jsonGenerator.writeStringField("anchorId", str);
            }
            String str2 = bLiveVoiceFansMyJoin.anchorName;
            if (str2 != null) {
                jsonGenerator.writeStringField("anchorName", str2);
            }
            String str3 = bLiveVoiceFansMyJoin.anchorAvatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("anchorAvatar", str3);
            }
            jsonGenerator.writeNumberField("medalGrade", bLiveVoiceFansMyJoin.medalGrade);
            String str4 = bLiveVoiceFansMyJoin.medalColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("medalColor", str4);
            }
            String str5 = bLiveVoiceFansMyJoin.medalName;
            if (str5 != null) {
                jsonGenerator.writeStringField("medalName", str5);
            }
            jsonGenerator.writeBooleanField("equipped", bLiveVoiceFansMyJoin.equipped);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceFansMyJoin) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceFansMyJoin$a */
    public class C12284a extends MessageNanoAdapter<BLiveVoiceFansMyJoin> {
        public C12284a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin) {
            String str = bLiveVoiceFansMyJoin.anchorId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = bLiveVoiceFansMyJoin.anchorName;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = bLiveVoiceFansMyJoin.anchorAvatar;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(4, bLiveVoiceFansMyJoin.medalGrade);
            String str4 = bLiveVoiceFansMyJoin.medalColor;
            if (str4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            String str5 = bLiveVoiceFansMyJoin.medalName;
            if (str5 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(6, str5);
            }
            int iM17220b = iM17226h + CodedOutputByteBufferNano.m17220b(7, bLiveVoiceFansMyJoin.equipped);
            bLiveVoiceFansMyJoin.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceFansMyJoin parse(nb5 nb5Var) throws IOException {
            BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin = new BLiveVoiceFansMyJoin();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bLiveVoiceFansMyJoin.anchorId == null) {
                        bLiveVoiceFansMyJoin.anchorId = "";
                    }
                    if (bLiveVoiceFansMyJoin.anchorName == null) {
                        bLiveVoiceFansMyJoin.anchorName = "";
                    }
                    if (bLiveVoiceFansMyJoin.anchorAvatar == null) {
                        bLiveVoiceFansMyJoin.anchorAvatar = "";
                    }
                    if (bLiveVoiceFansMyJoin.medalColor == null) {
                        bLiveVoiceFansMyJoin.medalColor = "";
                    }
                    if (bLiveVoiceFansMyJoin.medalName != null) {
                        break;
                    }
                    bLiveVoiceFansMyJoin.medalName = "";
                    break;
                }
                if (iM158752u == 10) {
                    bLiveVoiceFansMyJoin.anchorId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    bLiveVoiceFansMyJoin.anchorName = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    bLiveVoiceFansMyJoin.anchorAvatar = nb5Var.m158750s();
                } else if (iM158752u == 32) {
                    bLiveVoiceFansMyJoin.medalGrade = nb5Var.m158741j();
                } else if (iM158752u == 42) {
                    bLiveVoiceFansMyJoin.medalColor = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    bLiveVoiceFansMyJoin.medalName = nb5Var.m158750s();
                } else {
                    if (iM158752u != 56) {
                        if (bLiveVoiceFansMyJoin.anchorId == null) {
                            bLiveVoiceFansMyJoin.anchorId = "";
                        }
                        if (bLiveVoiceFansMyJoin.anchorName == null) {
                            bLiveVoiceFansMyJoin.anchorName = "";
                        }
                        if (bLiveVoiceFansMyJoin.anchorAvatar == null) {
                            bLiveVoiceFansMyJoin.anchorAvatar = "";
                        }
                        if (bLiveVoiceFansMyJoin.medalColor == null) {
                            bLiveVoiceFansMyJoin.medalColor = "";
                        }
                        if (bLiveVoiceFansMyJoin.medalName != null) {
                            break;
                        }
                        bLiveVoiceFansMyJoin.medalName = "";
                        return bLiveVoiceFansMyJoin;
                    }
                    bLiveVoiceFansMyJoin.equipped = nb5Var.m158738g();
                }
            }
            return bLiveVoiceFansMyJoin;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveVoiceFansMyJoin.anchorId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = bLiveVoiceFansMyJoin.anchorName;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = bLiveVoiceFansMyJoin.anchorAvatar;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            codedOutputByteBufferNano.m17250G(4, bLiveVoiceFansMyJoin.medalGrade);
            String str4 = bLiveVoiceFansMyJoin.medalColor;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
            String str5 = bLiveVoiceFansMyJoin.medalName;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(6, str5);
            }
            codedOutputByteBufferNano.m17244A(7, bLiveVoiceFansMyJoin.equipped);
        }
    }

    public static BLiveVoiceFansMyJoin new_() {
        BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin = new BLiveVoiceFansMyJoin();
        bLiveVoiceFansMyJoin.nullCheck();
        return bLiveVoiceFansMyJoin;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceFansMyJoin mo223809clone() {
        BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin = new BLiveVoiceFansMyJoin();
        bLiveVoiceFansMyJoin.anchorId = this.anchorId;
        bLiveVoiceFansMyJoin.anchorName = this.anchorName;
        bLiveVoiceFansMyJoin.anchorAvatar = this.anchorAvatar;
        bLiveVoiceFansMyJoin.medalGrade = this.medalGrade;
        bLiveVoiceFansMyJoin.medalColor = this.medalColor;
        bLiveVoiceFansMyJoin.medalName = this.medalName;
        bLiveVoiceFansMyJoin.equipped = this.equipped;
        return bLiveVoiceFansMyJoin;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceFansMyJoin)) {
            return false;
        }
        BLiveVoiceFansMyJoin bLiveVoiceFansMyJoin = (BLiveVoiceFansMyJoin) obj;
        return ValueObject.util_equals(this.anchorId, bLiveVoiceFansMyJoin.anchorId) && ValueObject.util_equals(this.anchorName, bLiveVoiceFansMyJoin.anchorName) && ValueObject.util_equals(this.anchorAvatar, bLiveVoiceFansMyJoin.anchorAvatar) && this.medalGrade == bLiveVoiceFansMyJoin.medalGrade && ValueObject.util_equals(this.medalColor, bLiveVoiceFansMyJoin.medalColor) && ValueObject.util_equals(this.medalName, bLiveVoiceFansMyJoin.medalName) && this.equipped == bLiveVoiceFansMyJoin.equipped;
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
        String str = this.anchorId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.anchorName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.anchorAvatar;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.medalGrade) * 41;
        String str4 = this.medalColor;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.medalName;
        int iHashCode5 = ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.equipped ? 1231 : 1237);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.anchorName == null) {
            this.anchorName = "";
        }
        if (this.anchorAvatar == null) {
            this.anchorAvatar = "";
        }
        if (this.medalColor == null) {
            this.medalColor = "";
        }
        if (this.medalName == null) {
            this.medalName = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
