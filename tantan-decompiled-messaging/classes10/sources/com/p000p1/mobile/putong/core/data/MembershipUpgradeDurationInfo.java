package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MembershipUpgradeDurationInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "membershipupgradedurationinfo";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int count;

    @NonNull
    @ProtobufIndex(index = 1)
    public String timeUnit;
    public static ProtobufAdapter<MembershipUpgradeDurationInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<MembershipUpgradeDurationInfo>() { // from class: com.p1.mobile.putong.core.data.MembershipUpgradeDurationInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MembershipUpgradeDurationInfo membershipUpgradeDurationInfo) {
            String str = membershipUpgradeDurationInfo.timeUnit;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, membershipUpgradeDurationInfo.count);
            ((MessageNano) membershipUpgradeDurationInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MembershipUpgradeDurationInfo m14129parse(nb5 nb5Var) throws IOException {
            MembershipUpgradeDurationInfo membershipUpgradeDurationInfo = new MembershipUpgradeDurationInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (membershipUpgradeDurationInfo.timeUnit != null) {
                        break;
                    }
                    membershipUpgradeDurationInfo.timeUnit = "";
                    break;
                }
                if (iU == 10) {
                    membershipUpgradeDurationInfo.timeUnit = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (membershipUpgradeDurationInfo.timeUnit != null) {
                            break;
                        }
                        membershipUpgradeDurationInfo.timeUnit = "";
                        return membershipUpgradeDurationInfo;
                    }
                    membershipUpgradeDurationInfo.count = nb5Var.j();
                }
            }
            return membershipUpgradeDurationInfo;
        }

        public void serialize(MembershipUpgradeDurationInfo membershipUpgradeDurationInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = membershipUpgradeDurationInfo.timeUnit;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, membershipUpgradeDurationInfo.count);
        }
    };
    public static JsonAdapter<MembershipUpgradeDurationInfo> JSON_ADAPTER = new ObjectJsonAdapter<MembershipUpgradeDurationInfo>() { // from class: com.p1.mobile.putong.core.data.MembershipUpgradeDurationInfo.2
        public Class getDataClass() {
            return MembershipUpgradeDurationInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MembershipUpgradeDurationInfo m14130newInstance() {
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

        public void serializeFields(MembershipUpgradeDurationInfo membershipUpgradeDurationInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = membershipUpgradeDurationInfo.timeUnit;
            if (str != null) {
                jsonGenerator.writeStringField("timeUnit", str);
            }
            jsonGenerator.writeNumberField("count", membershipUpgradeDurationInfo.count);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MembershipUpgradeDurationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MembershipUpgradeDurationInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MembershipUpgradeDurationInfo new_() {
        MembershipUpgradeDurationInfo membershipUpgradeDurationInfo = new MembershipUpgradeDurationInfo();
        membershipUpgradeDurationInfo.nullCheck();
        return membershipUpgradeDurationInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MembershipUpgradeDurationInfo m14128clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.timeUnit;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.count;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.timeUnit == null) {
            this.timeUnit = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
