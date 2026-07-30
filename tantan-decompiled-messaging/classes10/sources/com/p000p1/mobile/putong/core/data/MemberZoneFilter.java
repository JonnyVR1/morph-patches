package com.p000p1.mobile.putong.core.data;

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
public class MemberZoneFilter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "memberzonefilter";

    @ProtobufIndex(index = 7)
    public boolean certification;

    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public boolean matched;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int max_age;

    @ProtobufIndex(index = 1)
    public int min_age;

    @ProtobufIndex(index = 8)
    public boolean nearby;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean online;

    @ProtobufIndex(index = 6)
    public boolean popular;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int radius;

    @ProtobufIndex(index = 4)
    public boolean realFace;

    @ProtobufIndex(index = 9)
    public boolean richMedia;
    public static ProtobufAdapter<MemberZoneFilter> PROTOBUF_ADAPTER = new MessageNanoAdapter<MemberZoneFilter>() { // from class: com.p1.mobile.putong.core.data.MemberZoneFilter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MemberZoneFilter memberZoneFilter) {
            int iH = CodedOutputByteBufferNano.h(1, memberZoneFilter.min_age) + CodedOutputByteBufferNano.h(2, memberZoneFilter.max_age) + CodedOutputByteBufferNano.h(3, memberZoneFilter.radius) + CodedOutputByteBufferNano.b(4, memberZoneFilter.realFace) + CodedOutputByteBufferNano.b(5, memberZoneFilter.online) + CodedOutputByteBufferNano.b(6, memberZoneFilter.popular) + CodedOutputByteBufferNano.b(7, memberZoneFilter.certification) + CodedOutputByteBufferNano.b(8, memberZoneFilter.nearby) + CodedOutputByteBufferNano.b(9, memberZoneFilter.richMedia) + CodedOutputByteBufferNano.b(10, memberZoneFilter.matched);
            ((MessageNano) memberZoneFilter).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MemberZoneFilter m14117parse(nb5 nb5Var) throws IOException {
            MemberZoneFilter memberZoneFilter = new MemberZoneFilter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    memberZoneFilter.min_age = nb5Var.j();
                } else if (iU == 16) {
                    memberZoneFilter.max_age = nb5Var.j();
                } else if (iU == 24) {
                    memberZoneFilter.radius = nb5Var.j();
                } else if (iU == 32) {
                    memberZoneFilter.realFace = nb5Var.g();
                } else if (iU == 40) {
                    memberZoneFilter.online = nb5Var.g();
                } else if (iU == 48) {
                    memberZoneFilter.popular = nb5Var.g();
                } else if (iU == 56) {
                    memberZoneFilter.certification = nb5Var.g();
                } else if (iU == 64) {
                    memberZoneFilter.nearby = nb5Var.g();
                } else if (iU == 72) {
                    memberZoneFilter.richMedia = nb5Var.g();
                } else {
                    if (iU != 80) {
                        return memberZoneFilter;
                    }
                    memberZoneFilter.matched = nb5Var.g();
                }
            }
        }

        public void serialize(MemberZoneFilter memberZoneFilter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, memberZoneFilter.min_age);
            codedOutputByteBufferNano.G(2, memberZoneFilter.max_age);
            codedOutputByteBufferNano.G(3, memberZoneFilter.radius);
            codedOutputByteBufferNano.A(4, memberZoneFilter.realFace);
            codedOutputByteBufferNano.A(5, memberZoneFilter.online);
            codedOutputByteBufferNano.A(6, memberZoneFilter.popular);
            codedOutputByteBufferNano.A(7, memberZoneFilter.certification);
            codedOutputByteBufferNano.A(8, memberZoneFilter.nearby);
            codedOutputByteBufferNano.A(9, memberZoneFilter.richMedia);
            codedOutputByteBufferNano.A(10, memberZoneFilter.matched);
        }
    };
    public static JsonAdapter<MemberZoneFilter> JSON_ADAPTER = new ObjectJsonAdapter<MemberZoneFilter>() { // from class: com.p1.mobile.putong.core.data.MemberZoneFilter.2
        public Class getDataClass() {
            return MemberZoneFilter.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MemberZoneFilter m14118newInstance() {
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

        public void serializeFields(MemberZoneFilter memberZoneFilter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("min_age", memberZoneFilter.min_age);
            jsonGenerator.writeNumberField("max_age", memberZoneFilter.max_age);
            jsonGenerator.writeNumberField("radius", memberZoneFilter.radius);
            jsonGenerator.writeBooleanField(LikeFilterSortType.realFace, memberZoneFilter.realFace);
            jsonGenerator.writeBooleanField("online", memberZoneFilter.online);
            jsonGenerator.writeBooleanField("popular", memberZoneFilter.popular);
            jsonGenerator.writeBooleanField("certification", memberZoneFilter.certification);
            jsonGenerator.writeBooleanField(MyMeetSeeReminderType.nearby, memberZoneFilter.nearby);
            jsonGenerator.writeBooleanField("richMedia", memberZoneFilter.richMedia);
            jsonGenerator.writeBooleanField("matched", memberZoneFilter.matched);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MemberZoneFilter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MemberZoneFilter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MemberZoneFilter new_() {
        MemberZoneFilter memberZoneFilter = new MemberZoneFilter();
        memberZoneFilter.nullCheck();
        return memberZoneFilter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MemberZoneFilter m14116clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((((((((((i * 41) + this.min_age) * 41) + this.max_age) * 41) + this.radius) * 41) + (this.realFace ? 1231 : 1237)) * 41) + (this.online ? 1231 : 1237)) * 41) + (this.popular ? 1231 : 1237)) * 41) + (this.certification ? 1231 : 1237)) * 41) + (this.nearby ? 1231 : 1237)) * 41) + (this.richMedia ? 1231 : 1237)) * 41) + (this.matched ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
