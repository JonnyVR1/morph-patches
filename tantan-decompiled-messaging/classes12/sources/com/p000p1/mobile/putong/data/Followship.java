package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Followship;
import com.p000p1.mobile.putong.data.MatchFrom;
import com.p000p1.mobile.putong.data.tenum.OldEnumProtobufAdapter;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Followship extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "followship";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f217id;

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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Followship followship) {
            String str = followship.f217id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = followship.owner;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = followship.otherUser;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            FollowshipStatus followshipStatus = followship.state;
            if (followshipStatus != null) {
                iO += CodedOutputByteBufferNano.h(4, followshipStatus.ordinal());
            }
            int iD = iO + CodedOutputByteBufferNano.d(5, followship.userTime) + CodedOutputByteBufferNano.d(6, followship.otherUserTime);
            List<MatchFrom> list = followship.status;
            if (list != null) {
                iD += CodedOutputByteBufferNano.l(7, MatchFrom.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FollowshipStatus followshipStatus2 = followship.maskState;
            if (followshipStatus2 != null) {
                iD += CodedOutputByteBufferNano.h(8, followshipStatus2.ordinal());
            }
            FollowshipStatus followshipStatus3 = followship.state;
            if (followshipStatus3 != null) {
                iD += CodedOutputByteBufferNano.l(9, followshipStatus3, FollowshipStatus.PROTOBUF_ADAPTER);
            }
            List<MatchFrom> list2 = followship.status;
            if (list2 != null) {
                iD += CodedOutputByteBufferNano.l(10, list2, MatchFrom.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FollowshipStatus followshipStatus4 = followship.maskState;
            if (followshipStatus4 != null) {
                iD += CodedOutputByteBufferNano.l(11, followshipStatus4, FollowshipStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) followship).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Followship m18103parse(nb5 nb5Var) throws IOException {
            Followship followship = new Followship();
            Integer numValueOf = null;
            List list = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nb5Var.u()) {
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
                        if (followship.f217id == null) {
                            followship.f217id = "";
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
                        followship.f217id = nb5Var.s();
                        continue;
                    case 18:
                        followship.owner = nb5Var.s();
                        continue;
                    case 26:
                        followship.otherUser = nb5Var.s();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.USB_HEADSET /* 32 */:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 41:
                        followship.userTime = nb5Var.h();
                        continue;
                    case 49:
                        followship.otherUserTime = nb5Var.h();
                        continue;
                    case 58:
                        list = (List) nb5Var.l(OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_SCO /* 64 */:
                        numValueOf2 = Integer.valueOf(nb5Var.j());
                        continue;
                    case 74:
                        followship.state = (FollowshipStatus) nb5Var.l(FollowshipStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 82:
                        followship.status = (List) nb5Var.l(MatchFrom.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        followship.maskState = (FollowshipStatus) nb5Var.l(FollowshipStatus.PROTOBUF_ADAPTER);
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
                        if (followship.f217id == null) {
                            followship.f217id = "";
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

        public void serialize(Followship followship, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = followship.f217id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = followship.owner;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = followship.otherUser;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            FollowshipStatus followshipStatus = followship.state;
            if (followshipStatus != null) {
                codedOutputByteBufferNano.G(4, followshipStatus.ordinal());
            }
            codedOutputByteBufferNano.C(5, followship.userTime);
            codedOutputByteBufferNano.C(6, followship.otherUserTime);
            List<MatchFrom> list = followship.status;
            if (list != null) {
                codedOutputByteBufferNano.K(7, MatchFrom.covertToOldEnumList(list), OldEnumProtobufAdapter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FollowshipStatus followshipStatus2 = followship.maskState;
            if (followshipStatus2 != null) {
                codedOutputByteBufferNano.G(8, followshipStatus2.ordinal());
            }
            FollowshipStatus followshipStatus3 = followship.state;
            if (followshipStatus3 != null) {
                codedOutputByteBufferNano.K(9, followshipStatus3, FollowshipStatus.PROTOBUF_ADAPTER);
            }
            List<MatchFrom> list2 = followship.status;
            if (list2 != null) {
                codedOutputByteBufferNano.K(10, list2, MatchFrom.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            FollowshipStatus followshipStatus4 = followship.maskState;
            if (followshipStatus4 != null) {
                codedOutputByteBufferNano.K(11, followshipStatus4, FollowshipStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Followship> JSON_ADAPTER = new ObjectJsonAdapter<Followship>() { // from class: com.p1.mobile.putong.data.Followship.2
        public Class getDataClass() {
            return Followship.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Followship mo17830newInstance() {
            return new Followship();
        }

        public boolean parseField(Followship followship, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUser":
                    followship.otherUser = (String) Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "otherUserTime":
                    followship.otherUserTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "status":
                    followship.status = JsonAdapter.parseArray(jsonParser, MatchFrom.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "userTime":
                    followship.userTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "maskState":
                    followship.maskState = (FollowshipStatus) FollowshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    followship.f217id = jsonParser.getValueAsString();
                    return false;
                case "owner":
                    followship.owner = (String) Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "state":
                    followship.state = (FollowshipStatus) FollowshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Followship followship, JsonGenerator jsonGenerator) throws IOException {
            String str = followship.f217id;
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
                jsonGenerator.writeFieldName(Channel.state);
                FollowshipStatus.JSON_ADAPTER.serialize(followship.state, jsonGenerator, true);
            }
            jsonGenerator.writeFieldName("userTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(followship.userTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("otherUserTime");
            jsonAdapter.serialize(Double.valueOf(followship.otherUserTime), jsonGenerator, true);
            if (followship.status != null) {
                jsonGenerator.writeFieldName("status");
                JsonAdapter.serializeArray(followship.status, jsonGenerator, MatchFrom.JSON_ADAPTER);
            }
            if (followship.maskState != null) {
                jsonGenerator.writeFieldName("maskState");
                FollowshipStatus.JSON_ADAPTER.serialize(followship.maskState, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Followship) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Followship) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ MatchFrom m693a(MatchFrom matchFrom) {
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

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Followship m18102clone() {
        Followship followship = new Followship();
        followship.f217id = this.f217id;
        followship.owner = this.owner;
        followship.otherUser = this.otherUser;
        followship.state = this.state;
        followship.userTime = this.userTime;
        followship.otherUserTime = this.otherUserTime;
        List<MatchFrom> list = this.status;
        if (list != null) {
            followship.status = ValueObject.util_map(list, new w9j() { // from class: l.txi
                public final Object call(Object obj) {
                    return Followship.m693a((MatchFrom) obj);
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
        return ValueObject.util_equals(this.f217id, followship.f217id) && ValueObject.util_equals(this.owner, followship.owner) && ValueObject.util_equals(this.otherUser, followship.otherUser) && ValueObject.util_equals(this.state, followship.state) && this.userTime == followship.userTime && this.otherUserTime == followship.otherUserTime && ValueObject.util_equals(this.status, followship.status) && ValueObject.util_equals(this.maskState, followship.maskState);
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
        String str = this.f217id;
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
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.f217id == null) {
            this.f217id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
