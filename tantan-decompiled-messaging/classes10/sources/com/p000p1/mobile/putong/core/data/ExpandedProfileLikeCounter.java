package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
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
public class ExpandedProfileLikeCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "expandedprofilelikecounter";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean canLike;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public ProfileLikeComment profileLikeComment;

    @ProtobufIndex(index = 1)
    public int receive;
    public static ProtobufAdapter<ExpandedProfileLikeCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<ExpandedProfileLikeCounter>() { // from class: com.p1.mobile.putong.core.data.ExpandedProfileLikeCounter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ExpandedProfileLikeCounter expandedProfileLikeCounter) {
            int iH = CodedOutputByteBufferNano.h(1, expandedProfileLikeCounter.receive) + CodedOutputByteBufferNano.b(2, expandedProfileLikeCounter.canLike);
            ProfileLikeComment profileLikeComment = expandedProfileLikeCounter.profileLikeComment;
            if (profileLikeComment != null) {
                iH += CodedOutputByteBufferNano.l(3, profileLikeComment, ProfileLikeComment.PROTOBUF_ADAPTER);
            }
            ((MessageNano) expandedProfileLikeCounter).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ExpandedProfileLikeCounter m12669parse(nb5 nb5Var) throws IOException {
            ExpandedProfileLikeCounter expandedProfileLikeCounter = new ExpandedProfileLikeCounter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    expandedProfileLikeCounter.receive = nb5Var.j();
                } else if (iU == 16) {
                    expandedProfileLikeCounter.canLike = nb5Var.g();
                } else {
                    if (iU != 26) {
                        return expandedProfileLikeCounter;
                    }
                    expandedProfileLikeCounter.profileLikeComment = (ProfileLikeComment) nb5Var.l(ProfileLikeComment.PROTOBUF_ADAPTER);
                }
            }
        }

        public void serialize(ExpandedProfileLikeCounter expandedProfileLikeCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, expandedProfileLikeCounter.receive);
            codedOutputByteBufferNano.A(2, expandedProfileLikeCounter.canLike);
            ProfileLikeComment profileLikeComment = expandedProfileLikeCounter.profileLikeComment;
            if (profileLikeComment != null) {
                codedOutputByteBufferNano.K(3, profileLikeComment, ProfileLikeComment.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ExpandedProfileLikeCounter> JSON_ADAPTER = new ObjectJsonAdapter<ExpandedProfileLikeCounter>() { // from class: com.p1.mobile.putong.core.data.ExpandedProfileLikeCounter.2
        public Class getDataClass() {
            return ExpandedProfileLikeCounter.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ExpandedProfileLikeCounter m12670newInstance() {
            return new ExpandedProfileLikeCounter();
        }

        public boolean parseField(ExpandedProfileLikeCounter expandedProfileLikeCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "profileLikeComment":
                    expandedProfileLikeCounter.profileLikeComment = (ProfileLikeComment) ProfileLikeComment.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "canLike":
                    expandedProfileLikeCounter.canLike = jsonParser.getValueAsBoolean();
                    return true;
                case "receive":
                    expandedProfileLikeCounter.receive = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ExpandedProfileLikeCounter expandedProfileLikeCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "profileLikeComment":
                case "canLike":
                case "receive":
                    return true;
                default:
                    return super.parseFieldCheck(expandedProfileLikeCounter, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ExpandedProfileLikeCounter expandedProfileLikeCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("receive", expandedProfileLikeCounter.receive);
            jsonGenerator.writeBooleanField("canLike", expandedProfileLikeCounter.canLike);
            if (expandedProfileLikeCounter.profileLikeComment != null) {
                jsonGenerator.writeFieldName("profileLikeComment");
                ProfileLikeComment.JSON_ADAPTER.serialize(expandedProfileLikeCounter.profileLikeComment, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ExpandedProfileLikeCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ExpandedProfileLikeCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ExpandedProfileLikeCounter new_() {
        ExpandedProfileLikeCounter expandedProfileLikeCounter = new ExpandedProfileLikeCounter();
        expandedProfileLikeCounter.nullCheck();
        return expandedProfileLikeCounter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ExpandedProfileLikeCounter m12668clone() {
        ExpandedProfileLikeCounter expandedProfileLikeCounter = new ExpandedProfileLikeCounter();
        expandedProfileLikeCounter.receive = this.receive;
        expandedProfileLikeCounter.canLike = this.canLike;
        ProfileLikeComment profileLikeComment = this.profileLikeComment;
        if (profileLikeComment != null) {
            expandedProfileLikeCounter.profileLikeComment = profileLikeComment.m14982clone();
        }
        return expandedProfileLikeCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExpandedProfileLikeCounter)) {
            return false;
        }
        ExpandedProfileLikeCounter expandedProfileLikeCounter = (ExpandedProfileLikeCounter) obj;
        return this.receive == expandedProfileLikeCounter.receive && this.canLike == expandedProfileLikeCounter.canLike && ValueObject.util_equals(this.profileLikeComment, expandedProfileLikeCounter.profileLikeComment);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.receive) * 41) + (this.canLike ? 1231 : 1237)) * 41;
        ProfileLikeComment profileLikeComment = this.profileLikeComment;
        int iHashCode = i2 + (profileLikeComment != null ? profileLikeComment.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
