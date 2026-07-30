package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.MatchFrom;
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
public class OptionsIcon extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "optionsicon";

    @NonNull
    @ProtobufIndex(index = 2)
    public String nonSelected;

    @NonNull
    @ProtobufIndex(index = 1)
    public String selected;
    public static ProtobufAdapter<OptionsIcon> PROTOBUF_ADAPTER = new MessageNanoAdapter<OptionsIcon>() { // from class: com.p1.mobile.putong.core.data.OptionsIcon.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OptionsIcon optionsIcon) {
            String str = optionsIcon.selected;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = optionsIcon.nonSelected;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            optionsIcon.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OptionsIcon parse(nb5 nb5Var) throws IOException {
            OptionsIcon optionsIcon = new OptionsIcon();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (optionsIcon.selected == null) {
                        optionsIcon.selected = "";
                    }
                    if (optionsIcon.nonSelected != null) {
                        break;
                    }
                    optionsIcon.nonSelected = "";
                    break;
                }
                if (iM158752u == 10) {
                    optionsIcon.selected = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (optionsIcon.selected == null) {
                            optionsIcon.selected = "";
                        }
                        if (optionsIcon.nonSelected != null) {
                            break;
                        }
                        optionsIcon.nonSelected = "";
                        return optionsIcon;
                    }
                    optionsIcon.nonSelected = nb5Var.m158750s();
                }
            }
            return optionsIcon;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OptionsIcon optionsIcon, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = optionsIcon.selected;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = optionsIcon.nonSelected;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<OptionsIcon> JSON_ADAPTER = new ObjectJsonAdapter<OptionsIcon>() { // from class: com.p1.mobile.putong.core.data.OptionsIcon.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OptionsIcon.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OptionsIcon newInstance() {
            return new OptionsIcon();
        }

        public boolean parseField(OptionsIcon optionsIcon, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("nonSelected")) {
                optionsIcon.nonSelected = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(MatchFrom.selected)) {
                return false;
            }
            optionsIcon.selected = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(OptionsIcon optionsIcon, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("nonSelected") || str.equals(MatchFrom.selected)) {
                return true;
            }
            return super.parseFieldCheck(optionsIcon, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OptionsIcon optionsIcon, JsonGenerator jsonGenerator) throws IOException {
            String str = optionsIcon.selected;
            if (str != null) {
                jsonGenerator.writeStringField(MatchFrom.selected, str);
            }
            String str2 = optionsIcon.nonSelected;
            if (str2 != null) {
                jsonGenerator.writeStringField("nonSelected", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OptionsIcon) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OptionsIcon) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OptionsIcon new_() {
        OptionsIcon optionsIcon = new OptionsIcon();
        optionsIcon.nullCheck();
        return optionsIcon;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OptionsIcon mo223809clone() {
        OptionsIcon optionsIcon = new OptionsIcon();
        optionsIcon.selected = this.selected;
        optionsIcon.nonSelected = this.nonSelected;
        return optionsIcon;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OptionsIcon)) {
            return false;
        }
        OptionsIcon optionsIcon = (OptionsIcon) obj;
        return ValueObject.util_equals(this.selected, optionsIcon.selected) && ValueObject.util_equals(this.nonSelected, optionsIcon.nonSelected);
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
        String str = this.selected;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.nonSelected;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.selected == null) {
            this.selected = "";
        }
        if (this.nonSelected == null) {
            this.nonSelected = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
