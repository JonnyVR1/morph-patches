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
public class MatchSuccessAnimTime extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "matchsuccessanimtime";

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int female_enter_time;

    @ProtobufIndex(index = 6)
    public int female_exit_time;

    @ProtobufIndex(index = 1)
    public int male_enter_time;

    @ProtobufIndex(index = 4)
    public int male_exit_time;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int male_keyboard_show_head_time;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int male_keyboard_show_time;
    public static ProtobufAdapter<MatchSuccessAnimTime> PROTOBUF_ADAPTER = new MessageNanoAdapter<MatchSuccessAnimTime>() { // from class: com.p1.mobile.putong.core.data.MatchSuccessAnimTime.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MatchSuccessAnimTime matchSuccessAnimTime) {
            int iH = CodedOutputByteBufferNano.h(1, matchSuccessAnimTime.male_enter_time) + CodedOutputByteBufferNano.h(2, matchSuccessAnimTime.male_keyboard_show_time) + CodedOutputByteBufferNano.h(3, matchSuccessAnimTime.male_keyboard_show_head_time) + CodedOutputByteBufferNano.h(4, matchSuccessAnimTime.male_exit_time) + CodedOutputByteBufferNano.h(5, matchSuccessAnimTime.female_enter_time) + CodedOutputByteBufferNano.h(6, matchSuccessAnimTime.female_exit_time);
            ((MessageNano) matchSuccessAnimTime).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MatchSuccessAnimTime m14077parse(nb5 nb5Var) throws IOException {
            MatchSuccessAnimTime matchSuccessAnimTime = new MatchSuccessAnimTime();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    matchSuccessAnimTime.male_enter_time = nb5Var.j();
                } else if (iU == 16) {
                    matchSuccessAnimTime.male_keyboard_show_time = nb5Var.j();
                } else if (iU == 24) {
                    matchSuccessAnimTime.male_keyboard_show_head_time = nb5Var.j();
                } else if (iU == 32) {
                    matchSuccessAnimTime.male_exit_time = nb5Var.j();
                } else if (iU == 40) {
                    matchSuccessAnimTime.female_enter_time = nb5Var.j();
                } else {
                    if (iU != 48) {
                        return matchSuccessAnimTime;
                    }
                    matchSuccessAnimTime.female_exit_time = nb5Var.j();
                }
            }
        }

        public void serialize(MatchSuccessAnimTime matchSuccessAnimTime, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, matchSuccessAnimTime.male_enter_time);
            codedOutputByteBufferNano.G(2, matchSuccessAnimTime.male_keyboard_show_time);
            codedOutputByteBufferNano.G(3, matchSuccessAnimTime.male_keyboard_show_head_time);
            codedOutputByteBufferNano.G(4, matchSuccessAnimTime.male_exit_time);
            codedOutputByteBufferNano.G(5, matchSuccessAnimTime.female_enter_time);
            codedOutputByteBufferNano.G(6, matchSuccessAnimTime.female_exit_time);
        }
    };
    public static JsonAdapter<MatchSuccessAnimTime> JSON_ADAPTER = new ObjectJsonAdapter<MatchSuccessAnimTime>() { // from class: com.p1.mobile.putong.core.data.MatchSuccessAnimTime.2
        public Class getDataClass() {
            return MatchSuccessAnimTime.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MatchSuccessAnimTime m14078newInstance() {
            return new MatchSuccessAnimTime();
        }

        public boolean parseField(MatchSuccessAnimTime matchSuccessAnimTime, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "male_enter_time":
                    matchSuccessAnimTime.male_enter_time = jsonParser.getValueAsInt();
                    return true;
                case "male_keyboard_show_time":
                    matchSuccessAnimTime.male_keyboard_show_time = jsonParser.getValueAsInt();
                    return true;
                case "female_enter_time":
                    matchSuccessAnimTime.female_enter_time = jsonParser.getValueAsInt();
                    return true;
                case "male_exit_time":
                    matchSuccessAnimTime.male_exit_time = jsonParser.getValueAsInt();
                    return true;
                case "male_keyboard_show_head_time":
                    matchSuccessAnimTime.male_keyboard_show_head_time = jsonParser.getValueAsInt();
                    return true;
                case "female_exit_time":
                    matchSuccessAnimTime.female_exit_time = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MatchSuccessAnimTime matchSuccessAnimTime, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "male_enter_time":
                case "male_keyboard_show_time":
                case "female_enter_time":
                case "male_exit_time":
                case "male_keyboard_show_head_time":
                case "female_exit_time":
                    return true;
                default:
                    return super.parseFieldCheck(matchSuccessAnimTime, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MatchSuccessAnimTime matchSuccessAnimTime, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("male_enter_time", matchSuccessAnimTime.male_enter_time);
            jsonGenerator.writeNumberField("male_keyboard_show_time", matchSuccessAnimTime.male_keyboard_show_time);
            jsonGenerator.writeNumberField("male_keyboard_show_head_time", matchSuccessAnimTime.male_keyboard_show_head_time);
            jsonGenerator.writeNumberField("male_exit_time", matchSuccessAnimTime.male_exit_time);
            jsonGenerator.writeNumberField("female_enter_time", matchSuccessAnimTime.female_enter_time);
            jsonGenerator.writeNumberField("female_exit_time", matchSuccessAnimTime.female_exit_time);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MatchSuccessAnimTime) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MatchSuccessAnimTime) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MatchSuccessAnimTime new_() {
        MatchSuccessAnimTime matchSuccessAnimTime = new MatchSuccessAnimTime();
        matchSuccessAnimTime.nullCheck();
        return matchSuccessAnimTime;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MatchSuccessAnimTime m14076clone() {
        MatchSuccessAnimTime matchSuccessAnimTime = new MatchSuccessAnimTime();
        matchSuccessAnimTime.male_enter_time = this.male_enter_time;
        matchSuccessAnimTime.male_keyboard_show_time = this.male_keyboard_show_time;
        matchSuccessAnimTime.male_keyboard_show_head_time = this.male_keyboard_show_head_time;
        matchSuccessAnimTime.male_exit_time = this.male_exit_time;
        matchSuccessAnimTime.female_enter_time = this.female_enter_time;
        matchSuccessAnimTime.female_exit_time = this.female_exit_time;
        return matchSuccessAnimTime;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MatchSuccessAnimTime)) {
            return false;
        }
        MatchSuccessAnimTime matchSuccessAnimTime = (MatchSuccessAnimTime) obj;
        return this.male_enter_time == matchSuccessAnimTime.male_enter_time && this.male_keyboard_show_time == matchSuccessAnimTime.male_keyboard_show_time && this.male_keyboard_show_head_time == matchSuccessAnimTime.male_keyboard_show_head_time && this.male_exit_time == matchSuccessAnimTime.male_exit_time && this.female_enter_time == matchSuccessAnimTime.female_enter_time && this.female_exit_time == matchSuccessAnimTime.female_exit_time;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((i * 41) + this.male_enter_time) * 41) + this.male_keyboard_show_time) * 41) + this.male_keyboard_show_head_time) * 41) + this.male_exit_time) * 41) + this.female_enter_time) * 41) + this.female_exit_time;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
