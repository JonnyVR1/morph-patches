package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
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

/* JADX INFO: loaded from: classes10.dex */
public class BuzzRegion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "buzzregion";

    @NonNull
    @ProtobufIndex(index = 8)
    public String countryCode;

    @NonNull
    @ProtobufIndex(index = 9)
    public String emoji;

    @NonNull
    @ProtobufIndex(index = 7)
    public String iconName;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20357id;

    @NonNull
    @ProtobufIndex(index = 4)
    public String nameEn;

    @NonNull
    @ProtobufIndex(index = 6)
    public String nameJa;

    @NonNull
    @ProtobufIndex(index = 5)
    public String nameKo;

    @NonNull
    @ProtobufIndex(index = 3)
    public String nameZh;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<BuzzRegion> PROTOBUF_ADAPTER = new MessageNanoAdapter<BuzzRegion>() { // from class: com.p1.mobile.putong.core.data.BuzzRegion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BuzzRegion buzzRegion) {
            String str = buzzRegion.f20357id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = buzzRegion.type;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = buzzRegion.nameZh;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = buzzRegion.nameEn;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = buzzRegion.nameKo;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = buzzRegion.nameJa;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            String str7 = buzzRegion.iconName;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str7);
            }
            String str8 = buzzRegion.countryCode;
            if (str8 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(8, str8);
            }
            String str9 = buzzRegion.emoji;
            if (str9 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(9, str9);
            }
            buzzRegion.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BuzzRegion parse(nb5 nb5Var) throws IOException {
            BuzzRegion buzzRegion = new BuzzRegion();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (buzzRegion.f20357id == null) {
                        buzzRegion.f20357id = "";
                    }
                    if (buzzRegion.type == null) {
                        buzzRegion.type = "";
                    }
                    if (buzzRegion.nameZh == null) {
                        buzzRegion.nameZh = "";
                    }
                    if (buzzRegion.nameEn == null) {
                        buzzRegion.nameEn = "";
                    }
                    if (buzzRegion.nameKo == null) {
                        buzzRegion.nameKo = "";
                    }
                    if (buzzRegion.nameJa == null) {
                        buzzRegion.nameJa = "";
                    }
                    if (buzzRegion.iconName == null) {
                        buzzRegion.iconName = "";
                    }
                    if (buzzRegion.countryCode == null) {
                        buzzRegion.countryCode = "";
                    }
                    if (buzzRegion.emoji != null) {
                        break;
                    }
                    buzzRegion.emoji = "";
                    break;
                }
                if (iM158752u == 10) {
                    buzzRegion.f20357id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    buzzRegion.type = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    buzzRegion.nameZh = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    buzzRegion.nameEn = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    buzzRegion.nameKo = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    buzzRegion.nameJa = nb5Var.m158750s();
                } else if (iM158752u == 58) {
                    buzzRegion.iconName = nb5Var.m158750s();
                } else if (iM158752u == 66) {
                    buzzRegion.countryCode = nb5Var.m158750s();
                } else {
                    if (iM158752u != 74) {
                        if (buzzRegion.f20357id == null) {
                            buzzRegion.f20357id = "";
                        }
                        if (buzzRegion.type == null) {
                            buzzRegion.type = "";
                        }
                        if (buzzRegion.nameZh == null) {
                            buzzRegion.nameZh = "";
                        }
                        if (buzzRegion.nameEn == null) {
                            buzzRegion.nameEn = "";
                        }
                        if (buzzRegion.nameKo == null) {
                            buzzRegion.nameKo = "";
                        }
                        if (buzzRegion.nameJa == null) {
                            buzzRegion.nameJa = "";
                        }
                        if (buzzRegion.iconName == null) {
                            buzzRegion.iconName = "";
                        }
                        if (buzzRegion.countryCode == null) {
                            buzzRegion.countryCode = "";
                        }
                        if (buzzRegion.emoji != null) {
                            break;
                        }
                        buzzRegion.emoji = "";
                        return buzzRegion;
                    }
                    buzzRegion.emoji = nb5Var.m158750s();
                }
            }
            return buzzRegion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BuzzRegion buzzRegion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = buzzRegion.f20357id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = buzzRegion.type;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = buzzRegion.nameZh;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = buzzRegion.nameEn;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = buzzRegion.nameKo;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = buzzRegion.nameJa;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
            String str7 = buzzRegion.iconName;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(7, str7);
            }
            String str8 = buzzRegion.countryCode;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(8, str8);
            }
            String str9 = buzzRegion.emoji;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(9, str9);
            }
        }
    };
    public static JsonAdapter<BuzzRegion> JSON_ADAPTER = new ObjectJsonAdapter<BuzzRegion>() { // from class: com.p1.mobile.putong.core.data.BuzzRegion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BuzzRegion.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BuzzRegion newInstance() {
            return new BuzzRegion();
        }

        public boolean parseField(BuzzRegion buzzRegion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "countryCode":
                    buzzRegion.countryCode = jsonParser.getValueAsString();
                    return true;
                case "nameEn":
                    buzzRegion.nameEn = jsonParser.getValueAsString();
                    return true;
                case "nameJa":
                    buzzRegion.nameJa = jsonParser.getValueAsString();
                    return true;
                case "nameKo":
                    buzzRegion.nameKo = jsonParser.getValueAsString();
                    return true;
                case "nameZh":
                    buzzRegion.nameZh = jsonParser.getValueAsString();
                    return true;
                case "iconName":
                    buzzRegion.iconName = jsonParser.getValueAsString();
                    return true;
                case "id":
                    buzzRegion.f20357id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    buzzRegion.type = jsonParser.getValueAsString();
                    return true;
                case "emoji":
                    buzzRegion.emoji = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BuzzRegion buzzRegion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "countryCode":
                case "nameEn":
                case "nameJa":
                case "nameKo":
                case "nameZh":
                case "iconName":
                    return true;
                case "id":
                    return false;
                case "type":
                case "emoji":
                    return true;
                default:
                    return super.parseFieldCheck(buzzRegion, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BuzzRegion buzzRegion, JsonGenerator jsonGenerator) throws IOException {
            String str = buzzRegion.f20357id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = buzzRegion.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = buzzRegion.nameZh;
            if (str3 != null) {
                jsonGenerator.writeStringField("nameZh", str3);
            }
            String str4 = buzzRegion.nameEn;
            if (str4 != null) {
                jsonGenerator.writeStringField("nameEn", str4);
            }
            String str5 = buzzRegion.nameKo;
            if (str5 != null) {
                jsonGenerator.writeStringField("nameKo", str5);
            }
            String str6 = buzzRegion.nameJa;
            if (str6 != null) {
                jsonGenerator.writeStringField("nameJa", str6);
            }
            String str7 = buzzRegion.iconName;
            if (str7 != null) {
                jsonGenerator.writeStringField("iconName", str7);
            }
            String str8 = buzzRegion.countryCode;
            if (str8 != null) {
                jsonGenerator.writeStringField(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, str8);
            }
            String str9 = buzzRegion.emoji;
            if (str9 != null) {
                jsonGenerator.writeStringField("emoji", str9);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BuzzRegion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BuzzRegion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BuzzRegion new_() {
        BuzzRegion buzzRegion = new BuzzRegion();
        buzzRegion.nullCheck();
        return buzzRegion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BuzzRegion mo223809clone() {
        BuzzRegion buzzRegion = new BuzzRegion();
        buzzRegion.f20357id = this.f20357id;
        buzzRegion.type = this.type;
        buzzRegion.nameZh = this.nameZh;
        buzzRegion.nameEn = this.nameEn;
        buzzRegion.nameKo = this.nameKo;
        buzzRegion.nameJa = this.nameJa;
        buzzRegion.iconName = this.iconName;
        buzzRegion.countryCode = this.countryCode;
        buzzRegion.emoji = this.emoji;
        return buzzRegion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BuzzRegion)) {
            return false;
        }
        BuzzRegion buzzRegion = (BuzzRegion) obj;
        return ValueObject.util_equals(this.f20357id, buzzRegion.f20357id) && ValueObject.util_equals(this.type, buzzRegion.type) && ValueObject.util_equals(this.nameZh, buzzRegion.nameZh) && ValueObject.util_equals(this.nameEn, buzzRegion.nameEn) && ValueObject.util_equals(this.nameKo, buzzRegion.nameKo) && ValueObject.util_equals(this.nameJa, buzzRegion.nameJa) && ValueObject.util_equals(this.iconName, buzzRegion.iconName) && ValueObject.util_equals(this.countryCode, buzzRegion.countryCode) && ValueObject.util_equals(this.emoji, buzzRegion.emoji);
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
        String str = this.f20357id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.nameZh;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.nameEn;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.nameKo;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.nameJa;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.iconName;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.countryCode;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.emoji;
        int iHashCode9 = iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20357id == null) {
            this.f20357id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.nameZh == null) {
            this.nameZh = "";
        }
        if (this.nameEn == null) {
            this.nameEn = "";
        }
        if (this.nameKo == null) {
            this.nameKo = "";
        }
        if (this.nameJa == null) {
            this.nameJa = "";
        }
        if (this.iconName == null) {
            this.iconName = "";
        }
        if (this.countryCode == null) {
            this.countryCode = "";
        }
        if (this.emoji == null) {
            this.emoji = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
