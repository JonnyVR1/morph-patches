package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.messaging.Constants;
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

/* JADX INFO: loaded from: classes12.dex */
public class MomentLabels extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentlabels";

    @NonNull
    @ProtobufIndex(index = 2)
    public String bgColor;

    @NonNull
    @ProtobufIndex(index = 1)
    public String display;
    public static ProtobufAdapter<MomentLabels> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentLabels>() { // from class: com.p1.mobile.putong.data.MomentLabels.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentLabels momentLabels) {
            String str = momentLabels.display;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = momentLabels.bgColor;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            momentLabels.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentLabels parse(nb5 nb5Var) throws IOException {
            MomentLabels momentLabels = new MomentLabels();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (momentLabels.display == null) {
                        momentLabels.display = "";
                    }
                    if (momentLabels.bgColor != null) {
                        break;
                    }
                    momentLabels.bgColor = "";
                    break;
                }
                if (iM158752u == 10) {
                    momentLabels.display = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (momentLabels.display == null) {
                            momentLabels.display = "";
                        }
                        if (momentLabels.bgColor != null) {
                            break;
                        }
                        momentLabels.bgColor = "";
                        return momentLabels;
                    }
                    momentLabels.bgColor = nb5Var.m158750s();
                }
            }
            return momentLabels;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentLabels momentLabels, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentLabels.display;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = momentLabels.bgColor;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<MomentLabels> JSON_ADAPTER = new ObjectJsonAdapter<MomentLabels>() { // from class: com.p1.mobile.putong.data.MomentLabels.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentLabels.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentLabels newInstance() {
            return new MomentLabels();
        }

        public boolean parseField(MomentLabels momentLabels, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("bgColor")) {
                momentLabels.bgColor = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)) {
                return false;
            }
            momentLabels.display = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MomentLabels momentLabels, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("bgColor") || str.equals(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)) {
                return true;
            }
            return super.parseFieldCheck(momentLabels, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentLabels momentLabels, JsonGenerator jsonGenerator) throws IOException {
            String str = momentLabels.display;
            if (str != null) {
                jsonGenerator.writeStringField(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, str);
            }
            String str2 = momentLabels.bgColor;
            if (str2 != null) {
                jsonGenerator.writeStringField("bgColor", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentLabels) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentLabels) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentLabels new_() {
        MomentLabels momentLabels = new MomentLabels();
        momentLabels.nullCheck();
        return momentLabels;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentLabels mo223809clone() {
        MomentLabels momentLabels = new MomentLabels();
        momentLabels.display = this.display;
        momentLabels.bgColor = this.bgColor;
        return momentLabels;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentLabels)) {
            return false;
        }
        MomentLabels momentLabels = (MomentLabels) obj;
        return ValueObject.util_equals(this.display, momentLabels.display) && ValueObject.util_equals(this.bgColor, momentLabels.bgColor);
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
        String str = this.display;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.bgColor;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.display == null) {
            this.display = "";
        }
        if (this.bgColor == null) {
            this.bgColor = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
