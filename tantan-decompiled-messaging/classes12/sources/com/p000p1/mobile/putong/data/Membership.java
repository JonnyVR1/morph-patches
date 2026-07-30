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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Membership membership) {
            MembershipType membershipType = membership.name;
            int iH = (membershipType != null ? CodedOutputByteBufferNano.h(1, membershipType.ordinal()) : 0) + CodedOutputByteBufferNano.b(2, membership.active) + CodedOutputByteBufferNano.d(3, membership.expiresTime) + CodedOutputByteBufferNano.j(4, membership.duration);
            VIPBadgeType vIPBadgeType = membership.vipBadgeType;
            if (vIPBadgeType != null) {
                iH += CodedOutputByteBufferNano.h(5, vIPBadgeType.ordinal());
            }
            int iB = iH + CodedOutputByteBufferNano.b(6, membership.hideVIP) + CodedOutputByteBufferNano.b(7, membership.hideActivityTime);
            MembershipType membershipType2 = membership.name;
            if (membershipType2 != null) {
                iB += CodedOutputByteBufferNano.l(8, membershipType2, MembershipType.PROTOBUF_ADAPTER);
            }
            VIPBadgeType vIPBadgeType2 = membership.vipBadgeType;
            if (vIPBadgeType2 != null) {
                iB += CodedOutputByteBufferNano.l(9, vIPBadgeType2, VIPBadgeType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) membership).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Membership m18447parse(nb5 nb5Var) throws IOException {
            Membership membership = new Membership();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 16) {
                    membership.active = nb5Var.g();
                } else if (iU == 25) {
                    membership.expiresTime = nb5Var.h();
                } else if (iU == 32) {
                    membership.duration = nb5Var.k();
                } else if (iU == 40) {
                    numValueOf2 = Integer.valueOf(nb5Var.j());
                } else if (iU == 48) {
                    membership.hideVIP = nb5Var.g();
                } else if (iU == 56) {
                    membership.hideActivityTime = nb5Var.g();
                } else if (iU == 66) {
                    membership.name = (MembershipType) nb5Var.l(MembershipType.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 74) {
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
                    membership.vipBadgeType = (VIPBadgeType) nb5Var.l(VIPBadgeType.PROTOBUF_ADAPTER);
                }
            }
            return membership;
        }

        public void serialize(Membership membership, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MembershipType membershipType = membership.name;
            if (membershipType != null) {
                codedOutputByteBufferNano.G(1, membershipType.ordinal());
            }
            codedOutputByteBufferNano.A(2, membership.active);
            codedOutputByteBufferNano.C(3, membership.expiresTime);
            codedOutputByteBufferNano.I(4, membership.duration);
            VIPBadgeType vIPBadgeType = membership.vipBadgeType;
            if (vIPBadgeType != null) {
                codedOutputByteBufferNano.G(5, vIPBadgeType.ordinal());
            }
            codedOutputByteBufferNano.A(6, membership.hideVIP);
            codedOutputByteBufferNano.A(7, membership.hideActivityTime);
            MembershipType membershipType2 = membership.name;
            if (membershipType2 != null) {
                codedOutputByteBufferNano.K(8, membershipType2, MembershipType.PROTOBUF_ADAPTER);
            }
            VIPBadgeType vIPBadgeType2 = membership.vipBadgeType;
            if (vIPBadgeType2 != null) {
                codedOutputByteBufferNano.K(9, vIPBadgeType2, VIPBadgeType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Membership> JSON_ADAPTER = new ObjectJsonAdapter<Membership>() { // from class: com.p1.mobile.putong.data.Membership.2
        public Class getDataClass() {
            return Membership.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Membership mo17830newInstance() {
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
                    membership.expiresTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "name":
                    membership.name = (MembershipType) MembershipType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "hideVIP":
                    membership.hideVIP = jsonParser.getValueAsBoolean();
                    return true;
                case "hideActivityTime":
                    membership.hideActivityTime = jsonParser.getValueAsBoolean();
                    return true;
                case "vipBadgeType":
                    membership.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Membership membership, JsonGenerator jsonGenerator) throws IOException {
            if (membership.name != null) {
                jsonGenerator.writeFieldName("name");
                MembershipType.JSON_ADAPTER.serialize(membership.name, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("active", membership.active);
            jsonGenerator.writeFieldName("expiresTime");
            Converter.API_TIME.serialize(Double.valueOf(membership.expiresTime), jsonGenerator, true);
            jsonGenerator.writeNumberField("duration", membership.duration);
            if (membership.vipBadgeType != null) {
                jsonGenerator.writeFieldName("vipBadgeType");
                VIPBadgeType.JSON_ADAPTER.serialize(membership.vipBadgeType, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("hideVIP", membership.hideVIP);
            jsonGenerator.writeBooleanField("hideActivityTime", membership.hideActivityTime);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Membership) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Membership) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Membership new_() {
        Membership membership = new Membership();
        membership.nullCheck();
        return membership;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Membership m18446clone() {
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

    public String getClassParseName() {
        return "membership";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = (MembershipType) MembershipType.JSON_ADAPTER.defaultEnum();
        }
        if (this.vipBadgeType == null) {
            this.vipBadgeType = (VIPBadgeType) VIPBadgeType.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
