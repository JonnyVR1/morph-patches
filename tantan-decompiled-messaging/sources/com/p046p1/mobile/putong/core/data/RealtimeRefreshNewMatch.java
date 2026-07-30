package com.p046p1.mobile.putong.core.data;

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
public class RealtimeRefreshNewMatch extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "realtimerefreshnewmatch";

    @ProtobufIndex(index = 1)
    public boolean function_switch;

    @ProtobufIndex(index = 3)
    public int message_tab_generate_new_match_refresh_interval;

    @ProtobufIndex(index = 2)
    public int message_tab_hide_to_show_refresh_interval;
    public static ProtobufAdapter<RealtimeRefreshNewMatch> PROTOBUF_ADAPTER = new MessageNanoAdapter<RealtimeRefreshNewMatch>() { // from class: com.p1.mobile.putong.core.data.RealtimeRefreshNewMatch.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RealtimeRefreshNewMatch realtimeRefreshNewMatch) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, realtimeRefreshNewMatch.function_switch) + CodedOutputByteBufferNano.m17226h(2, realtimeRefreshNewMatch.message_tab_hide_to_show_refresh_interval) + CodedOutputByteBufferNano.m17226h(3, realtimeRefreshNewMatch.message_tab_generate_new_match_refresh_interval);
            realtimeRefreshNewMatch.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RealtimeRefreshNewMatch parse(nb5 nb5Var) throws IOException {
            RealtimeRefreshNewMatch realtimeRefreshNewMatch = new RealtimeRefreshNewMatch();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    realtimeRefreshNewMatch.function_switch = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    realtimeRefreshNewMatch.message_tab_hide_to_show_refresh_interval = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        return realtimeRefreshNewMatch;
                    }
                    realtimeRefreshNewMatch.message_tab_generate_new_match_refresh_interval = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RealtimeRefreshNewMatch realtimeRefreshNewMatch, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, realtimeRefreshNewMatch.function_switch);
            codedOutputByteBufferNano.m17250G(2, realtimeRefreshNewMatch.message_tab_hide_to_show_refresh_interval);
            codedOutputByteBufferNano.m17250G(3, realtimeRefreshNewMatch.message_tab_generate_new_match_refresh_interval);
        }
    };
    public static JsonAdapter<RealtimeRefreshNewMatch> JSON_ADAPTER = new ObjectJsonAdapter<RealtimeRefreshNewMatch>() { // from class: com.p1.mobile.putong.core.data.RealtimeRefreshNewMatch.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RealtimeRefreshNewMatch.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RealtimeRefreshNewMatch newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RealtimeRefreshNewMatch realtimeRefreshNewMatch, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("function_switch", realtimeRefreshNewMatch.function_switch);
            jsonGenerator.writeNumberField("message_tab_hide_to_show_refresh_interval", realtimeRefreshNewMatch.message_tab_hide_to_show_refresh_interval);
            jsonGenerator.writeNumberField("message_tab_generate_new_match_refresh_interval", realtimeRefreshNewMatch.message_tab_generate_new_match_refresh_interval);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RealtimeRefreshNewMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RealtimeRefreshNewMatch) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RealtimeRefreshNewMatch new_() {
        RealtimeRefreshNewMatch realtimeRefreshNewMatch = new RealtimeRefreshNewMatch();
        realtimeRefreshNewMatch.nullCheck();
        return realtimeRefreshNewMatch;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RealtimeRefreshNewMatch mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.function_switch ? 1231 : 1237)) * 41) + this.message_tab_hide_to_show_refresh_interval) * 41) + this.message_tab_generate_new_match_refresh_interval;
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
