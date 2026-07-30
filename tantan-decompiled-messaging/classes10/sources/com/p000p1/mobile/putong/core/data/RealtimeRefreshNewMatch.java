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
public class RealtimeRefreshNewMatch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "realtimerefreshnewmatch";

    @ProtobufIndex(index = 1)
    public boolean function_switch;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int message_tab_generate_new_match_refresh_interval;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int message_tab_hide_to_show_refresh_interval;
    public static ProtobufAdapter<RealtimeRefreshNewMatch> PROTOBUF_ADAPTER = new MessageNanoAdapter<RealtimeRefreshNewMatch>() { // from class: com.p1.mobile.putong.core.data.RealtimeRefreshNewMatch.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RealtimeRefreshNewMatch realtimeRefreshNewMatch) {
            int iB = CodedOutputByteBufferNano.b(1, realtimeRefreshNewMatch.function_switch) + CodedOutputByteBufferNano.h(2, realtimeRefreshNewMatch.message_tab_hide_to_show_refresh_interval) + CodedOutputByteBufferNano.h(3, realtimeRefreshNewMatch.message_tab_generate_new_match_refresh_interval);
            ((MessageNano) realtimeRefreshNewMatch).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RealtimeRefreshNewMatch m15273parse(nb5 nb5Var) throws IOException {
            RealtimeRefreshNewMatch realtimeRefreshNewMatch = new RealtimeRefreshNewMatch();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    realtimeRefreshNewMatch.function_switch = nb5Var.g();
                } else if (iU == 16) {
                    realtimeRefreshNewMatch.message_tab_hide_to_show_refresh_interval = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return realtimeRefreshNewMatch;
                    }
                    realtimeRefreshNewMatch.message_tab_generate_new_match_refresh_interval = nb5Var.j();
                }
            }
        }

        public void serialize(RealtimeRefreshNewMatch realtimeRefreshNewMatch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, realtimeRefreshNewMatch.function_switch);
            codedOutputByteBufferNano.G(2, realtimeRefreshNewMatch.message_tab_hide_to_show_refresh_interval);
            codedOutputByteBufferNano.G(3, realtimeRefreshNewMatch.message_tab_generate_new_match_refresh_interval);
        }
    };
    public static JsonAdapter<RealtimeRefreshNewMatch> JSON_ADAPTER = new ObjectJsonAdapter<RealtimeRefreshNewMatch>() { // from class: com.p1.mobile.putong.core.data.RealtimeRefreshNewMatch.2
        public Class getDataClass() {
            return RealtimeRefreshNewMatch.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RealtimeRefreshNewMatch m15274newInstance() {
            return new RealtimeRefreshNewMatch();
        }

        public boolean parseField(RealtimeRefreshNewMatch realtimeRefreshNewMatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "function_switch":
                    realtimeRefreshNewMatch.function_switch = jsonParser.getValueAsBoolean();
                    return true;
                case "message_tab_generate_new_match_refresh_interval":
                    realtimeRefreshNewMatch.message_tab_generate_new_match_refresh_interval = jsonParser.getValueAsInt();
                    return true;
                case "message_tab_hide_to_show_refresh_interval":
                    realtimeRefreshNewMatch.message_tab_hide_to_show_refresh_interval = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RealtimeRefreshNewMatch realtimeRefreshNewMatch, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "function_switch":
                case "message_tab_generate_new_match_refresh_interval":
                case "message_tab_hide_to_show_refresh_interval":
                    return true;
                default:
                    return super.parseFieldCheck(realtimeRefreshNewMatch, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(RealtimeRefreshNewMatch realtimeRefreshNewMatch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("function_switch", realtimeRefreshNewMatch.function_switch);
            jsonGenerator.writeNumberField("message_tab_hide_to_show_refresh_interval", realtimeRefreshNewMatch.message_tab_hide_to_show_refresh_interval);
            jsonGenerator.writeNumberField("message_tab_generate_new_match_refresh_interval", realtimeRefreshNewMatch.message_tab_generate_new_match_refresh_interval);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RealtimeRefreshNewMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RealtimeRefreshNewMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RealtimeRefreshNewMatch new_() {
        RealtimeRefreshNewMatch realtimeRefreshNewMatch = new RealtimeRefreshNewMatch();
        realtimeRefreshNewMatch.nullCheck();
        return realtimeRefreshNewMatch;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RealtimeRefreshNewMatch m15272clone() {
        RealtimeRefreshNewMatch realtimeRefreshNewMatch = new RealtimeRefreshNewMatch();
        realtimeRefreshNewMatch.function_switch = this.function_switch;
        realtimeRefreshNewMatch.message_tab_hide_to_show_refresh_interval = this.message_tab_hide_to_show_refresh_interval;
        realtimeRefreshNewMatch.message_tab_generate_new_match_refresh_interval = this.message_tab_generate_new_match_refresh_interval;
        return realtimeRefreshNewMatch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RealtimeRefreshNewMatch)) {
            return false;
        }
        RealtimeRefreshNewMatch realtimeRefreshNewMatch = (RealtimeRefreshNewMatch) obj;
        return this.function_switch == realtimeRefreshNewMatch.function_switch && this.message_tab_hide_to_show_refresh_interval == realtimeRefreshNewMatch.message_tab_hide_to_show_refresh_interval && this.message_tab_generate_new_match_refresh_interval == realtimeRefreshNewMatch.message_tab_generate_new_match_refresh_interval;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.function_switch ? 1231 : 1237)) * 41) + this.message_tab_hide_to_show_refresh_interval) * 41) + this.message_tab_generate_new_match_refresh_interval;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
