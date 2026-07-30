package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class MembershipUpgradeDurationInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "membershipupgradedurationinfo";

    @ProtobufIndex(index = 2)
    public int count;

    @NonNull
    @ProtobufIndex(index = 1)
    public String timeUnit;
    public static ProtobufAdapter<MembershipUpgradeDurationInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<MembershipUpgradeDurationInfo>() { // from class: com.p1.mobile.putong.core.data.MembershipUpgradeDurationInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MembershipUpgradeDurationInfo membershipUpgradeDurationInfo) {
            String str = membershipUpgradeDurationInfo.timeUnit;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, membershipUpgradeDurationInfo.count);
            membershipUpgradeDurationInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MembershipUpgradeDurationInfo parse(nb5 nb5Var) throws IOException {
            MembershipUpgradeDurationInfo membershipUpgradeDurationInfo = new MembershipUpgradeDurationInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (membershipUpgradeDurationInfo.timeUnit != null) {
                        break;
                    }
                    membershipUpgradeDurationInfo.timeUnit = "";
                    break;
                }
                if (iM158752u == 10) {
                    membershipUpgradeDurationInfo.timeUnit = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (membershipUpgradeDurationInfo.timeUnit != null) {
                            break;
                        }
                        membershipUpgradeDurationInfo.timeUnit = "";
                        return membershipUpgradeDurationInfo;
                    }
                    membershipUpgradeDurationInfo.count = nb5Var.m158741j();
                }
            }
            return membershipUpgradeDurationInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MembershipUpgradeDurationInfo membershipUpgradeDurationInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = membershipUpgradeDurationInfo.timeUnit;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, membershipUpgradeDurationInfo.count);
        }
    };
    public static JsonAdapter<MembershipUpgradeDurationInfo> JSON_ADAPTER = new ObjectJsonAdapter<MembershipUpgradeDurationInfo>() { // from class: com.p1.mobile.putong.core.data.MembershipUpgradeDurationInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MembershipUpgradeDurationInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MembershipUpgradeDurationInfo newInstance() {
            return new MembershipUpgradeDurationInfo();
        }

        public boolean parseField(MembershipUpgradeDurationInfo membershipUpgradeDurationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("timeUnit")) {
                membershipUpgradeDurationInfo.timeUnit = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("count")) {
                return false;
            }
            membershipUpgradeDurationInfo.count = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(MembershipUpgradeDurationInfo membershipUpgradeDurationInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("timeUnit") || str.equals("count")) {
                return true;
            }
            return super.parseFieldCheck(membershipUpgradeDurationInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MembershipUpgradeDurationInfo membershipUpgradeDurationInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = membershipUpgradeDurationInfo.timeUnit;
            if (str != null) {
                jsonGenerator.writeStringField("timeUnit", str);
            }
            jsonGenerator.writeNumberField("count", membershipUpgradeDurationInfo.count);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MembershipUpgradeDurationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MembershipUpgradeDurationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MembershipUpgradeDurationInfo new_() {
        MembershipUpgradeDurationInfo membershipUpgradeDurationInfo = new MembershipUpgradeDurationInfo();
        membershipUpgradeDurationInfo.nullCheck();
        return membershipUpgradeDurationInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MembershipUpgradeDurationInfo mo223809clone() {
        MembershipUpgradeDurationInfo membershipUpgradeDurationInfo = new MembershipUpgradeDurationInfo();
        membershipUpgradeDurationInfo.timeUnit = this.timeUnit;
        membershipUpgradeDurationInfo.count = this.count;
        return membershipUpgradeDurationInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MembershipUpgradeDurationInfo)) {
            return false;
        }
        MembershipUpgradeDurationInfo membershipUpgradeDurationInfo = (MembershipUpgradeDurationInfo) obj;
        return ValueObject.util_equals(this.timeUnit, membershipUpgradeDurationInfo.timeUnit) && this.count == membershipUpgradeDurationInfo.count;
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
        String str = this.timeUnit;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.count;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.timeUnit == null) {
            this.timeUnit = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
