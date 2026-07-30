package com.p051p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class MatchSuccessAnimTime extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "matchsuccessanimtime";

    @ProtobufIndex(index = 5)
    public int female_enter_time;

    @ProtobufIndex(index = 6)
    public int female_exit_time;

    @ProtobufIndex(index = 1)
    public int male_enter_time;

    @ProtobufIndex(index = 4)
    public int male_exit_time;

    @ProtobufIndex(index = 3)
    public int male_keyboard_show_head_time;

    @ProtobufIndex(index = 2)
    public int male_keyboard_show_time;
    public static ProtobufAdapter<MatchSuccessAnimTime> PROTOBUF_ADAPTER = new MessageNanoAdapter<MatchSuccessAnimTime>() { // from class: com.p1.mobile.putong.core.data.MatchSuccessAnimTime.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MatchSuccessAnimTime matchSuccessAnimTime) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, matchSuccessAnimTime.male_enter_time) + CodedOutputByteBufferNano.m17281h(2, matchSuccessAnimTime.male_keyboard_show_time) + CodedOutputByteBufferNano.m17281h(3, matchSuccessAnimTime.male_keyboard_show_head_time) + CodedOutputByteBufferNano.m17281h(4, matchSuccessAnimTime.male_exit_time) + CodedOutputByteBufferNano.m17281h(5, matchSuccessAnimTime.female_enter_time) + CodedOutputByteBufferNano.m17281h(6, matchSuccessAnimTime.female_exit_time);
            matchSuccessAnimTime.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MatchSuccessAnimTime parse(nc5 nc5Var) throws IOException {
            MatchSuccessAnimTime matchSuccessAnimTime = new MatchSuccessAnimTime();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    matchSuccessAnimTime.male_enter_time = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    matchSuccessAnimTime.male_keyboard_show_time = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    matchSuccessAnimTime.male_keyboard_show_head_time = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    matchSuccessAnimTime.male_exit_time = nc5Var.m162486j();
                } else if (iM162497u == 40) {
                    matchSuccessAnimTime.female_enter_time = nc5Var.m162486j();
                } else {
                    if (iM162497u != 48) {
                        return matchSuccessAnimTime;
                    }
                    matchSuccessAnimTime.female_exit_time = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MatchSuccessAnimTime matchSuccessAnimTime, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, matchSuccessAnimTime.male_enter_time);
            codedOutputByteBufferNano.m17305G(2, matchSuccessAnimTime.male_keyboard_show_time);
            codedOutputByteBufferNano.m17305G(3, matchSuccessAnimTime.male_keyboard_show_head_time);
            codedOutputByteBufferNano.m17305G(4, matchSuccessAnimTime.male_exit_time);
            codedOutputByteBufferNano.m17305G(5, matchSuccessAnimTime.female_enter_time);
            codedOutputByteBufferNano.m17305G(6, matchSuccessAnimTime.female_exit_time);
        }
    };
    public static JsonAdapter<MatchSuccessAnimTime> JSON_ADAPTER = new ObjectJsonAdapter<MatchSuccessAnimTime>() { // from class: com.p1.mobile.putong.core.data.MatchSuccessAnimTime.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MatchSuccessAnimTime.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MatchSuccessAnimTime newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MatchSuccessAnimTime matchSuccessAnimTime, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("male_enter_time", matchSuccessAnimTime.male_enter_time);
            jsonGenerator.writeNumberField("male_keyboard_show_time", matchSuccessAnimTime.male_keyboard_show_time);
            jsonGenerator.writeNumberField("male_keyboard_show_head_time", matchSuccessAnimTime.male_keyboard_show_head_time);
            jsonGenerator.writeNumberField("male_exit_time", matchSuccessAnimTime.male_exit_time);
            jsonGenerator.writeNumberField("female_enter_time", matchSuccessAnimTime.female_enter_time);
            jsonGenerator.writeNumberField("female_exit_time", matchSuccessAnimTime.female_exit_time);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MatchSuccessAnimTime) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MatchSuccessAnimTime) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MatchSuccessAnimTime new_() {
        MatchSuccessAnimTime matchSuccessAnimTime = new MatchSuccessAnimTime();
        matchSuccessAnimTime.nullCheck();
        return matchSuccessAnimTime;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MatchSuccessAnimTime mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((i * 41) + this.male_enter_time) * 41) + this.male_keyboard_show_time) * 41) + this.male_keyboard_show_head_time) * 41) + this.male_exit_time) * 41) + this.female_enter_time) * 41) + this.female_exit_time;
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
