package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
import com.p046p1.mobile.putong.data.tenum.TEnum;
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
import java.util.List;
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class Followship extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "followship";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38756id;

    @Nullable
    @ProtobufIndex(index = 8)
    public FollowshipStatus maskState;

    @NonNull
    @ProtobufIndex(index = 3)
    public String otherUser;

    @ProtobufIndex(index = 6)
    public double otherUserTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String owner;

    @NonNull
    @ProtobufIndex(index = 4)
    public FollowshipStatus state;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<MatchFrom> status;

    @ProtobufIndex(index = 5)
    public double userTime;
    public static final Followship EMPTY = new_();
    public static ProtobufAdapter<Followship> PROTOBUF_ADAPTER = new MessageNanoAdapter<Followship>() { // from class: com.p1.mobile.putong.data.Followship.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Followship followship) {
            String str = followship.f38756id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = followship.owner;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = followship.otherUser;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            FollowshipStatus followshipStatus = followship.state;
            if (followshipStatus != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(4, followshipStatus.ordinal());
            }
            int iM17222d = iM17233o + CodedOutputByteBufferNano.m17222d(5, followship.userTime) + CodedOutputByteBufferNano.m17222d(6, followship.otherUserTime);
            List<MatchFrom> list = followship.status;
            if (list != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(7, MatchFrom.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FollowshipStatus followshipStatus2 = followship.maskState;
            if (followshipStatus2 != null) {
                iM17222d += CodedOutputByteBufferNano.m17226h(8, followshipStatus2.ordinal());
            }
            FollowshipStatus followshipStatus3 = followship.state;
            if (followshipStatus3 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(9, followshipStatus3, FollowshipStatus.PROTOBUF_ADAPTER);
            }
            List<MatchFrom> list2 = followship.status;
            if (list2 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(10, list2, MatchFrom.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FollowshipStatus followshipStatus4 = followship.maskState;
            if (followshipStatus4 != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(11, followshipStatus4, FollowshipStatus.PROTOBUF_ADAPTER);
            }
            followship.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Followship parse(nb5 nb5Var) throws IOException {
            Followship followship = new Followship();
            Integer numValueOf = null;
            List list = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (followship.state == null && numValueOf != null) {
                            followship.state = (FollowshipStatus) FollowshipStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (followship.status == null && list != null) {
                            followship.status = MatchFrom.oldEnumCovertList(list);
                        }
                        if (followship.maskState == null && numValueOf2 != null) {
                            followship.maskState = (FollowshipStatus) FollowshipStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (followship.f38756id == null) {
                            followship.f38756id = "";
                        }
                        if (followship.owner == null) {
                            followship.owner = "";
                        }
                        if (followship.otherUser == null) {
                            followship.otherUser = "";
                        }
                        if (followship.state == null) {
                            followship.state = (FollowshipStatus) FollowshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (followship.status == null) {
                            followship.status = new ArrayList();
                        }
                        break;
                    case 10:
                        followship.f38756id = nb5Var.m158750s();
                        continue;
                    case 18:
                        followship.owner = nb5Var.m158750s();
                        continue;
                    case 26:
                        followship.otherUser = nb5Var.m158750s();
                        continue;
                    case 32:
                        numValueOf = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 41:
                        followship.userTime = nb5Var.m158739h();
                        continue;
                    case 49:
                        followship.otherUserTime = nb5Var.m158739h();
                        continue;
                    case 58:
                        list = (List) nb5Var.m158743l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 64:
                        numValueOf2 = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 74:
                        followship.state = (FollowshipStatus) nb5Var.m158743l(FollowshipStatus.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        followship.status = (List) nb5Var.m158743l(MatchFrom.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        followship.maskState = (FollowshipStatus) nb5Var.m158743l(FollowshipStatus.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (followship.state == null && numValueOf != null) {
                            followship.state = (FollowshipStatus) FollowshipStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (followship.status == null && list != null) {
                            followship.status = MatchFrom.oldEnumCovertList(list);
                        }
                        if (followship.maskState == null && numValueOf2 != null) {
                            followship.maskState = (FollowshipStatus) FollowshipStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (followship.f38756id == null) {
                            followship.f38756id = "";
                        }
                        if (followship.owner == null) {
                            followship.owner = "";
                        }
                        if (followship.otherUser == null) {
                            followship.otherUser = "";
                        }
                        if (followship.state == null) {
                            followship.state = (FollowshipStatus) FollowshipStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (followship.status == null) {
                            followship.status = new ArrayList();
                            return followship;
                        }
                        break;
                }
            }
            return followship;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Followship followship, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = followship.f38756id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = followship.owner;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = followship.otherUser;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            FollowshipStatus followshipStatus = followship.state;
            if (followshipStatus != null) {
                codedOutputByteBufferNano.m17250G(4, followshipStatus.ordinal());
            }
            codedOutputByteBufferNano.m17246C(5, followship.userTime);
            codedOutputByteBufferNano.m17246C(6, followship.otherUserTime);
            List<MatchFrom> list = followship.status;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(7, MatchFrom.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FollowshipStatus followshipStatus2 = followship.maskState;
            if (followshipStatus2 != null) {
                codedOutputByteBufferNano.m17250G(8, followshipStatus2.ordinal());
            }
            FollowshipStatus followshipStatus3 = followship.state;
            if (followshipStatus3 != null) {
                codedOutputByteBufferNano.m17254K(9, followshipStatus3, FollowshipStatus.PROTOBUF_ADAPTER);
            }
            List<MatchFrom> list2 = followship.status;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(10, list2, MatchFrom.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FollowshipStatus followshipStatus4 = followship.maskState;
            if (followshipStatus4 != null) {
                codedOutputByteBufferNano.m17254K(11, followshipStatus4, FollowshipStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Followship> JSON_ADAPTER = new ObjectJsonAdapter<Followship>() { // from class: com.p1.mobile.putong.data.Followship.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Followship.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Followship newInstance() {
            return new Followship();
        }

        public boolean parseField(Followship followship, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUser":
                    followship.otherUser = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "otherUserTime":
                    followship.otherUserTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "status":
                    followship.status = JsonAdapter.parseArray(jsonParser, MatchFrom.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "userTime":
                    followship.userTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "maskState":
                    followship.maskState = FollowshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    followship.f38756id = jsonParser.getValueAsString();
                    return false;
                case "owner":
                    followship.owner = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "state":
                    followship.state = FollowshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Followship followship, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "otherUser":
                case "otherUserTime":
                case "status":
                case "userTime":
                case "maskState":
                    return true;
                case "id":
                    return false;
                case "owner":
                case "state":
                    return true;
                default:
                    return super.parseFieldCheck(followship, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Followship followship, JsonGenerator jsonGenerator) throws IOException {
            String str = followship.f38756id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (followship.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                Converter.USER_ID.serialize(followship.owner, jsonGenerator, true);
            }
            if (followship.otherUser != null) {
                jsonGenerator.writeFieldName("otherUser");
                Converter.USER_ID.serialize(followship.otherUser, jsonGenerator, true);
            }
            if (followship.state != null) {
                jsonGenerator.writeFieldName("state");
                FollowshipStatus.JSON_ADAPTER.serialize(followship.state, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("userTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(followship.userTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("otherUserTime");
            jsonAdapter.serialize(Double.valueOf(followship.otherUserTime), jsonGenerator, true);
            if (followship.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                JsonAdapter.serializeArray(followship.status, jsonGenerator, MatchFrom.JSON_ADAPTER);
            }
            if (followship.maskState != null) {
                jsonGenerator.writeFieldName("maskState");
                FollowshipStatus.JSON_ADAPTER.serialize(followship.maskState, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Followship) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Followship) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ MatchFrom m59775a(MatchFrom matchFrom) {
        return matchFrom;
    }

    public static boolean isFollowed(Followship followship) {
        if (followship != null) {
            return TEnum.equals(followship.state, "matched") || TEnum.equals(followship.state, FollowshipStatus.following);
        }
        return false;
    }

    public static Followship new_() {
        Followship followship = new Followship();
        followship.nullCheck();
        return followship;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Followship mo223809clone() {
        Followship followship = new Followship();
        followship.f38756id = this.f38756id;
        followship.owner = this.owner;
        followship.otherUser = this.otherUser;
        followship.state = this.state;
        followship.userTime = this.userTime;
        followship.otherUserTime = this.otherUserTime;
        List<MatchFrom> list = this.status;
        if (list != null) {
            followship.status = ValueObject.util_map(list, new w9j() { // from class: l.txi
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Followship.m59775a((MatchFrom) obj);
                }
            });
        }
        followship.maskState = this.maskState;
        return followship;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Followship)) {
            return false;
        }
        Followship followship = (Followship) obj;
        return ValueObject.util_equals(this.f38756id, followship.f38756id) && ValueObject.util_equals(this.owner, followship.owner) && ValueObject.util_equals(this.otherUser, followship.otherUser) && ValueObject.util_equals(this.state, followship.state) && this.userTime == followship.userTime && this.otherUserTime == followship.otherUserTime && ValueObject.util_equals(this.status, followship.status) && ValueObject.util_equals(this.maskState, followship.maskState);
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
        String str = this.f38756id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.owner;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.otherUser;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        FollowshipStatus followshipStatus = this.state;
        int iHashCode4 = followshipStatus != null ? followshipStatus.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.userTime);
        int i3 = ((iHashCode3 + iHashCode4) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.otherUserTime);
        int i4 = ((i3 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 41;
        List<MatchFrom> list = this.status;
        int iHashCode5 = (i4 + (list != null ? list.hashCode() : 0)) * 41;
        FollowshipStatus followshipStatus2 = this.maskState;
        int iHashCode6 = iHashCode5 + (followshipStatus2 != null ? followshipStatus2.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38756id == null) {
            this.f38756id = "";
        }
        if (this.owner == null) {
            this.owner = "";
        }
        if (this.otherUser == null) {
            this.otherUser = "";
        }
        if (this.state == null) {
            this.state = (FollowshipStatus) FollowshipStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.status == null) {
            this.status = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
