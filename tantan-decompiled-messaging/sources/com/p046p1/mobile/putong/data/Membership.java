package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
public class Membership extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "membership";

    @ProtobufIndex(index = 2)
    public boolean active;

    @ProtobufIndex(index = 4)
    public long duration;

    @ProtobufIndex(index = 3)
    public double expiresTime;

    @ProtobufIndex(index = 7)
    public boolean hideActivityTime;

    @ProtobufIndex(index = 6)
    public boolean hideVIP;

    @NonNull
    @ProtobufIndex(index = 1)
    public MembershipType name;

    @NonNull
    @ProtobufIndex(index = 5)
    public VIPBadgeType vipBadgeType;
    public static ProtobufAdapter<Membership> PROTOBUF_ADAPTER = new MessageNanoAdapter<Membership>() { // from class: com.p1.mobile.putong.data.Membership.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Membership membership) {
            MembershipType membershipType = membership.name;
            int iM17226h = (membershipType != null ? CodedOutputByteBufferNano.m17226h(1, membershipType.ordinal()) : 0) + CodedOutputByteBufferNano.m17220b(2, membership.active) + CodedOutputByteBufferNano.m17222d(3, membership.expiresTime) + CodedOutputByteBufferNano.m17228j(4, membership.duration);
            VIPBadgeType vIPBadgeType = membership.vipBadgeType;
            if (vIPBadgeType != null) {
                iM17226h += CodedOutputByteBufferNano.m17226h(5, vIPBadgeType.ordinal());
            }
            int iM17220b = iM17226h + CodedOutputByteBufferNano.m17220b(6, membership.hideVIP) + CodedOutputByteBufferNano.m17220b(7, membership.hideActivityTime);
            MembershipType membershipType2 = membership.name;
            if (membershipType2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(8, membershipType2, MembershipType.PROTOBUF_ADAPTER);
            }
            VIPBadgeType vIPBadgeType2 = membership.vipBadgeType;
            if (vIPBadgeType2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(9, vIPBadgeType2, VIPBadgeType.PROTOBUF_ADAPTER);
            }
            membership.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Membership parse(nb5 nb5Var) throws IOException {
            Membership membership = new Membership();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (membership.name == null && numValueOf != null) {
                        membership.name = (MembershipType) MembershipType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (membership.vipBadgeType == null && numValueOf2 != null) {
                        membership.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                    }
                    if (membership.name == null) {
                        membership.name = (MembershipType) MembershipType.JSON_ADAPTER.defaultEnum();
                    }
                    if (membership.vipBadgeType != null) {
                        break;
                    }
                    membership.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 8) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 16) {
                    membership.active = nb5Var.m158738g();
                } else if (iM158752u == 25) {
                    membership.expiresTime = nb5Var.m158739h();
                } else if (iM158752u == 32) {
                    membership.duration = nb5Var.m158742k();
                } else if (iM158752u == 40) {
                    numValueOf2 = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 48) {
                    membership.hideVIP = nb5Var.m158738g();
                } else if (iM158752u == 56) {
                    membership.hideActivityTime = nb5Var.m158738g();
                } else if (iM158752u == 66) {
                    membership.name = (MembershipType) nb5Var.m158743l(MembershipType.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 74) {
                        if (membership.name == null && numValueOf != null) {
                            membership.name = (MembershipType) MembershipType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (membership.vipBadgeType == null && numValueOf2 != null) {
                            membership.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (membership.name == null) {
                            membership.name = (MembershipType) MembershipType.JSON_ADAPTER.defaultEnum();
                        }
                        if (membership.vipBadgeType != null) {
                            break;
                        }
                        membership.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.defaultEnum();
                        return membership;
                    }
                    membership.vipBadgeType = (VIPBadgeType) nb5Var.m158743l(VIPBadgeType.PROTOBUF_ADAPTER);
                }
            }
            return membership;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Membership membership, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MembershipType membershipType = membership.name;
            if (membershipType != null) {
                codedOutputByteBufferNano.m17250G(1, membershipType.ordinal());
            }
            codedOutputByteBufferNano.m17244A(2, membership.active);
            codedOutputByteBufferNano.m17246C(3, membership.expiresTime);
            codedOutputByteBufferNano.m17252I(4, membership.duration);
            VIPBadgeType vIPBadgeType = membership.vipBadgeType;
            if (vIPBadgeType != null) {
                codedOutputByteBufferNano.m17250G(5, vIPBadgeType.ordinal());
            }
            codedOutputByteBufferNano.m17244A(6, membership.hideVIP);
            codedOutputByteBufferNano.m17244A(7, membership.hideActivityTime);
            MembershipType membershipType2 = membership.name;
            if (membershipType2 != null) {
                codedOutputByteBufferNano.m17254K(8, membershipType2, MembershipType.PROTOBUF_ADAPTER);
            }
            VIPBadgeType vIPBadgeType2 = membership.vipBadgeType;
            if (vIPBadgeType2 != null) {
                codedOutputByteBufferNano.m17254K(9, vIPBadgeType2, VIPBadgeType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Membership> JSON_ADAPTER = new ObjectJsonAdapter<Membership>() { // from class: com.p1.mobile.putong.data.Membership.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Membership.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Membership newInstance() {
            return new Membership();
        }

        public boolean parseField(Membership membership, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    membership.duration = jsonParser.getValueAsLong();
                    return true;
                case "active":
                    membership.active = jsonParser.getValueAsBoolean();
                    return true;
                case "expiresTime":
                    membership.expiresTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "name":
                    membership.name = MembershipType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "hideVIP":
                    membership.hideVIP = jsonParser.getValueAsBoolean();
                    return true;
                case "hideActivityTime":
                    membership.hideActivityTime = jsonParser.getValueAsBoolean();
                    return true;
                case "vipBadgeType":
                    membership.vipBadgeType = VIPBadgeType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Membership membership, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "active":
                case "expiresTime":
                case "name":
                case "hideVIP":
                case "hideActivityTime":
                case "vipBadgeType":
                    return true;
                default:
                    return super.parseFieldCheck(membership, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Membership membership, JsonGenerator jsonGenerator) throws IOException {
            if (membership.name != null) {
                jsonGenerator.writeFieldName(AuthenticationTokenClaims.JSON_KEY_NAME);
                MembershipType.JSON_ADAPTER.serialize(membership.name, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField(Active.TYPE, membership.active);
            jsonGenerator.writeFieldName("expiresTime");
            Converter.API_TIME.serialize(Double.valueOf(membership.expiresTime), jsonGenerator, true);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, membership.duration);
            if (membership.vipBadgeType != null) {
                jsonGenerator.writeFieldName("vipBadgeType");
                VIPBadgeType.JSON_ADAPTER.serialize(membership.vipBadgeType, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("hideVIP", membership.hideVIP);
            jsonGenerator.writeBooleanField("hideActivityTime", membership.hideActivityTime);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Membership) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Membership) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Membership new_() {
        Membership membership = new Membership();
        membership.nullCheck();
        return membership;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Membership mo223809clone() {
        Membership membership = new Membership();
        membership.name = this.name;
        membership.active = this.active;
        membership.expiresTime = this.expiresTime;
        membership.duration = this.duration;
        membership.vipBadgeType = this.vipBadgeType;
        membership.hideVIP = this.hideVIP;
        membership.hideActivityTime = this.hideActivityTime;
        return membership;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Membership)) {
            return false;
        }
        Membership membership = (Membership) obj;
        return ValueObject.util_equals(this.name, membership.name) && this.active == membership.active && this.expiresTime == membership.expiresTime && this.duration == membership.duration && ValueObject.util_equals(this.vipBadgeType, membership.vipBadgeType) && this.hideVIP == membership.hideVIP && this.hideActivityTime == membership.hideActivityTime;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "membership";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        MembershipType membershipType = this.name;
        int iHashCode = (i2 + (membershipType != null ? membershipType.hashCode() : 0)) * 41;
        int i3 = this.active ? 1231 : 1237;
        long jDoubleToLongBits = Double.doubleToLongBits(this.expiresTime);
        int i4 = (((iHashCode + i3) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        long j = this.duration;
        int i5 = (i4 + ((int) (j ^ (j >>> 32)))) * 41;
        VIPBadgeType vIPBadgeType = this.vipBadgeType;
        int iHashCode2 = ((((i5 + (vIPBadgeType != null ? vIPBadgeType.hashCode() : 0)) * 41) + (this.hideVIP ? 1231 : 1237)) * 41) + (this.hideActivityTime ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = (MembershipType) MembershipType.JSON_ADAPTER.defaultEnum();
        }
        if (this.vipBadgeType == null) {
            this.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
