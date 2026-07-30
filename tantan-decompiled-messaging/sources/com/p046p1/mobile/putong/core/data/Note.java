package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class Note extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "note";

    @NonNull
    @ProtobufIndex(index = 2)
    public String content;

    @NonNull
    @ProtobufIndex(index = 3)
    public String picURL;

    @NonNull
    @ProtobufIndex(index = 5)
    public String reason;

    @ProtobufIndex(index = 1)
    public int remain;

    @NonNull
    @ProtobufIndex(index = 4)
    public String status;
    public static ProtobufAdapter<Note> PROTOBUF_ADAPTER = new MessageNanoAdapter<Note>() { // from class: com.p1.mobile.putong.core.data.Note.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Note note) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, note.remain);
            String str = note.content;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = note.picURL;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = note.status;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            String str4 = note.reason;
            if (str4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            note.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Note parse(nb5 nb5Var) throws IOException {
            Note note = new Note();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (note.content == null) {
                        note.content = "";
                    }
                    if (note.picURL == null) {
                        note.picURL = "";
                    }
                    if (note.status == null) {
                        note.status = "";
                    }
                    if (note.reason != null) {
                        break;
                    }
                    note.reason = "";
                    break;
                }
                if (iM158752u == 8) {
                    note.remain = nb5Var.m158741j();
                } else if (iM158752u == 18) {
                    note.content = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    note.picURL = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    note.status = nb5Var.m158750s();
                } else {
                    if (iM158752u != 42) {
                        if (note.content == null) {
                            note.content = "";
                        }
                        if (note.picURL == null) {
                            note.picURL = "";
                        }
                        if (note.status == null) {
                            note.status = "";
                        }
                        if (note.reason != null) {
                            break;
                        }
                        note.reason = "";
                        return note;
                    }
                    note.reason = nb5Var.m158750s();
                }
            }
            return note;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Note note, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, note.remain);
            String str = note.content;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = note.picURL;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = note.status;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            String str4 = note.reason;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
        }
    };
    public static JsonAdapter<Note> JSON_ADAPTER = new ObjectJsonAdapter<Note>() { // from class: com.p1.mobile.putong.core.data.Note.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Note.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Note newInstance() {
            return new Note();
        }

        public boolean parseField(Note note, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "picURL":
                    note.picURL = jsonParser.getValueAsString();
                    return true;
                case "reason":
                    note.reason = jsonParser.getValueAsString();
                    return true;
                case "remain":
                    note.remain = jsonParser.getValueAsInt();
                    return true;
                case "status":
                    note.status = jsonParser.getValueAsString();
                    return true;
                case "content":
                    note.content = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Note note, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "picURL":
                case "reason":
                case "remain":
                case "status":
                case "content":
                    return true;
                default:
                    return super.parseFieldCheck(note, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Note note, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("remain", note.remain);
            String str = note.content;
            if (str != null) {
                jsonGenerator.writeStringField("content", str);
            }
            String str2 = note.picURL;
            if (str2 != null) {
                jsonGenerator.writeStringField("picURL", str2);
            }
            String str3 = note.status;
            if (str3 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str3);
            }
            String str4 = note.reason;
            if (str4 != null) {
                jsonGenerator.writeStringField(Reason.TYPE, str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Note) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Note) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Note new_() {
        Note note = new Note();
        note.nullCheck();
        return note;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Note mo223809clone() {
        Note note = new Note();
        note.remain = this.remain;
        note.content = this.content;
        note.picURL = this.picURL;
        note.status = this.status;
        note.reason = this.reason;
        return note;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Note)) {
            return false;
        }
        Note note = (Note) obj;
        return this.remain == note.remain && ValueObject.util_equals(this.content, note.content) && ValueObject.util_equals(this.picURL, note.picURL) && ValueObject.util_equals(this.status, note.status) && ValueObject.util_equals(this.reason, note.reason);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "note";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.remain) * 41;
        String str = this.content;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.picURL;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.status;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.reason;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.content == null) {
            this.content = "";
        }
        if (this.picURL == null) {
            this.picURL = "";
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.reason == null) {
            this.reason = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
