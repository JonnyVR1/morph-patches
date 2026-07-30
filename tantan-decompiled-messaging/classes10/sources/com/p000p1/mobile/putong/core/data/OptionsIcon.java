package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class OptionsIcon extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "optionsicon";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String nonSelected;

    @NonNull
    @ProtobufIndex(index = 1)
    public String selected;
    public static ProtobufAdapter<OptionsIcon> PROTOBUF_ADAPTER = new MessageNanoAdapter<OptionsIcon>() { // from class: com.p1.mobile.putong.core.data.OptionsIcon.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OptionsIcon optionsIcon) {
            String str = optionsIcon.selected;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = optionsIcon.nonSelected;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) optionsIcon).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OptionsIcon m14695parse(nb5 nb5Var) throws IOException {
            OptionsIcon optionsIcon = new OptionsIcon();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (optionsIcon.selected == null) {
                        optionsIcon.selected = "";
                    }
                    if (optionsIcon.nonSelected != null) {
                        break;
                    }
                    optionsIcon.nonSelected = "";
                    break;
                }
                if (iU == 10) {
                    optionsIcon.selected = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (optionsIcon.selected == null) {
                            optionsIcon.selected = "";
                        }
                        if (optionsIcon.nonSelected != null) {
                            break;
                        }
                        optionsIcon.nonSelected = "";
                        return optionsIcon;
                    }
                    optionsIcon.nonSelected = nb5Var.s();
                }
            }
            return optionsIcon;
        }

        public void serialize(OptionsIcon optionsIcon, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = optionsIcon.selected;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = optionsIcon.nonSelected;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<OptionsIcon> JSON_ADAPTER = new ObjectJsonAdapter<OptionsIcon>() { // from class: com.p1.mobile.putong.core.data.OptionsIcon.2
        public Class getDataClass() {
            return OptionsIcon.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public OptionsIcon m14696newInstance() {
            return new OptionsIcon();
        }

        public boolean parseField(OptionsIcon optionsIcon, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("nonSelected")) {
                optionsIcon.nonSelected = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("selected")) {
                return false;
            }
            optionsIcon.selected = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(OptionsIcon optionsIcon, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("nonSelected") || str.equals("selected")) {
                return true;
            }
            return super.parseFieldCheck(optionsIcon, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(OptionsIcon optionsIcon, JsonGenerator jsonGenerator) throws IOException {
            String str = optionsIcon.selected;
            if (str != null) {
                jsonGenerator.writeStringField("selected", str);
            }
            String str2 = optionsIcon.nonSelected;
            if (str2 != null) {
                jsonGenerator.writeStringField("nonSelected", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OptionsIcon) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OptionsIcon) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OptionsIcon new_() {
        OptionsIcon optionsIcon = new OptionsIcon();
        optionsIcon.nullCheck();
        return optionsIcon;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OptionsIcon m14694clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.selected;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.nonSelected;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.selected == null) {
            this.selected = "";
        }
        if (this.nonSelected == null) {
            this.nonSelected = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
