package com.p046p1.mobile.putong.core.data;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.SuperlikeReason;
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
public class MemberZoneFilter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "memberzonefilter";

    @ProtobufIndex(index = 7)
    public boolean certification;

    @ProtobufIndex(index = 10)
    public boolean matched;

    @ProtobufIndex(index = 2)
    public int max_age;

    @ProtobufIndex(index = 1)
    public int min_age;

    @ProtobufIndex(index = 8)
    public boolean nearby;

    @ProtobufIndex(index = 5)
    public boolean online;

    @ProtobufIndex(index = 6)
    public boolean popular;

    @ProtobufIndex(index = 3)
    public int radius;

    @ProtobufIndex(index = 4)
    public boolean realFace;

    @ProtobufIndex(index = 9)
    public boolean richMedia;
    public static ProtobufAdapter<MemberZoneFilter> PROTOBUF_ADAPTER = new MessageNanoAdapter<MemberZoneFilter>() { // from class: com.p1.mobile.putong.core.data.MemberZoneFilter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MemberZoneFilter memberZoneFilter) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, memberZoneFilter.min_age) + CodedOutputByteBufferNano.m17226h(2, memberZoneFilter.max_age) + CodedOutputByteBufferNano.m17226h(3, memberZoneFilter.radius) + CodedOutputByteBufferNano.m17220b(4, memberZoneFilter.realFace) + CodedOutputByteBufferNano.m17220b(5, memberZoneFilter.online) + CodedOutputByteBufferNano.m17220b(6, memberZoneFilter.popular) + CodedOutputByteBufferNano.m17220b(7, memberZoneFilter.certification) + CodedOutputByteBufferNano.m17220b(8, memberZoneFilter.nearby) + CodedOutputByteBufferNano.m17220b(9, memberZoneFilter.richMedia) + CodedOutputByteBufferNano.m17220b(10, memberZoneFilter.matched);
            memberZoneFilter.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MemberZoneFilter parse(nb5 nb5Var) throws IOException {
            MemberZoneFilter memberZoneFilter = new MemberZoneFilter();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    memberZoneFilter.min_age = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    memberZoneFilter.max_age = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    memberZoneFilter.radius = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    memberZoneFilter.realFace = nb5Var.m158738g();
                } else if (iM158752u == 40) {
                    memberZoneFilter.online = nb5Var.m158738g();
                } else if (iM158752u == 48) {
                    memberZoneFilter.popular = nb5Var.m158738g();
                } else if (iM158752u == 56) {
                    memberZoneFilter.certification = nb5Var.m158738g();
                } else if (iM158752u == 64) {
                    memberZoneFilter.nearby = nb5Var.m158738g();
                } else if (iM158752u == 72) {
                    memberZoneFilter.richMedia = nb5Var.m158738g();
                } else {
                    if (iM158752u != 80) {
                        return memberZoneFilter;
                    }
                    memberZoneFilter.matched = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MemberZoneFilter memberZoneFilter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, memberZoneFilter.min_age);
            codedOutputByteBufferNano.m17250G(2, memberZoneFilter.max_age);
            codedOutputByteBufferNano.m17250G(3, memberZoneFilter.radius);
            codedOutputByteBufferNano.m17244A(4, memberZoneFilter.realFace);
            codedOutputByteBufferNano.m17244A(5, memberZoneFilter.online);
            codedOutputByteBufferNano.m17244A(6, memberZoneFilter.popular);
            codedOutputByteBufferNano.m17244A(7, memberZoneFilter.certification);
            codedOutputByteBufferNano.m17244A(8, memberZoneFilter.nearby);
            codedOutputByteBufferNano.m17244A(9, memberZoneFilter.richMedia);
            codedOutputByteBufferNano.m17244A(10, memberZoneFilter.matched);
        }
    };
    public static JsonAdapter<MemberZoneFilter> JSON_ADAPTER = new ObjectJsonAdapter<MemberZoneFilter>() { // from class: com.p1.mobile.putong.core.data.MemberZoneFilter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MemberZoneFilter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MemberZoneFilter newInstance() {
            return new MemberZoneFilter();
        }

        public boolean parseField(MemberZoneFilter memberZoneFilter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "nearby":
                    memberZoneFilter.nearby = jsonParser.getValueAsBoolean();
                    return true;
                case "online":
                    memberZoneFilter.online = jsonParser.getValueAsBoolean();
                    return true;
                case "radius":
                    memberZoneFilter.radius = jsonParser.getValueAsInt();
                    return true;
                case "realFace":
                    memberZoneFilter.realFace = jsonParser.getValueAsBoolean();
                    return true;
                case "richMedia":
                    memberZoneFilter.richMedia = jsonParser.getValueAsBoolean();
                    return true;
                case "certification":
                    memberZoneFilter.certification = jsonParser.getValueAsBoolean();
                    return true;
                case "popular":
                    memberZoneFilter.popular = jsonParser.getValueAsBoolean();
                    return true;
                case "matched":
                    memberZoneFilter.matched = jsonParser.getValueAsBoolean();
                    return true;
                case "max_age":
                    memberZoneFilter.max_age = jsonParser.getValueAsInt();
                    return true;
                case "min_age":
                    memberZoneFilter.min_age = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MemberZoneFilter memberZoneFilter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "nearby":
                case "online":
                case "radius":
                case "realFace":
                case "richMedia":
                case "certification":
                case "popular":
                case "matched":
                case "max_age":
                case "min_age":
                    return true;
                default:
                    return super.parseFieldCheck(memberZoneFilter, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MemberZoneFilter memberZoneFilter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("min_age", memberZoneFilter.min_age);
            jsonGenerator.writeNumberField("max_age", memberZoneFilter.max_age);
            jsonGenerator.writeNumberField(Constants.KEY_RADIUS, memberZoneFilter.radius);
            jsonGenerator.writeBooleanField(LikeFilterSortType.realFace, memberZoneFilter.realFace);
            jsonGenerator.writeBooleanField("online", memberZoneFilter.online);
            jsonGenerator.writeBooleanField(SuperlikeReason.popular, memberZoneFilter.popular);
            jsonGenerator.writeBooleanField("certification", memberZoneFilter.certification);
            jsonGenerator.writeBooleanField("nearby", memberZoneFilter.nearby);
            jsonGenerator.writeBooleanField("richMedia", memberZoneFilter.richMedia);
            jsonGenerator.writeBooleanField("matched", memberZoneFilter.matched);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MemberZoneFilter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MemberZoneFilter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MemberZoneFilter new_() {
        MemberZoneFilter memberZoneFilter = new MemberZoneFilter();
        memberZoneFilter.nullCheck();
        return memberZoneFilter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MemberZoneFilter mo223809clone() {
        MemberZoneFilter memberZoneFilter = new MemberZoneFilter();
        memberZoneFilter.min_age = this.min_age;
        memberZoneFilter.max_age = this.max_age;
        memberZoneFilter.radius = this.radius;
        memberZoneFilter.realFace = this.realFace;
        memberZoneFilter.online = this.online;
        memberZoneFilter.popular = this.popular;
        memberZoneFilter.certification = this.certification;
        memberZoneFilter.nearby = this.nearby;
        memberZoneFilter.richMedia = this.richMedia;
        memberZoneFilter.matched = this.matched;
        return memberZoneFilter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MemberZoneFilter)) {
            return false;
        }
        MemberZoneFilter memberZoneFilter = (MemberZoneFilter) obj;
        return this.min_age == memberZoneFilter.min_age && this.max_age == memberZoneFilter.max_age && this.radius == memberZoneFilter.radius && this.realFace == memberZoneFilter.realFace && this.online == memberZoneFilter.online && this.popular == memberZoneFilter.popular && this.certification == memberZoneFilter.certification && this.nearby == memberZoneFilter.nearby && this.richMedia == memberZoneFilter.richMedia && this.matched == memberZoneFilter.matched;
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
        int i2 = (((((((((((((((((((i * 41) + this.min_age) * 41) + this.max_age) * 41) + this.radius) * 41) + (this.realFace ? 1231 : 1237)) * 41) + (this.online ? 1231 : 1237)) * 41) + (this.popular ? 1231 : 1237)) * 41) + (this.certification ? 1231 : 1237)) * 41) + (this.nearby ? 1231 : 1237)) * 41) + (this.richMedia ? 1231 : 1237)) * 41) + (this.matched ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
