package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Converter;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ViewersBox extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "viewersbox";

    @ProtobufIndex(index = 1)
    public double lastViewTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;

    @ProtobufIndex(index = 3)
    public int viewCount;
    public static ProtobufAdapter<ViewersBox> PROTOBUF_ADAPTER = new MessageNanoAdapter<ViewersBox>() { // from class: com.p1.mobile.putong.feed.data.ViewersBox.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ViewersBox viewersBox) {
            int iD = CodedOutputByteBufferNano.d(1, viewersBox.lastViewTime);
            String str = viewersBox.userId;
            if (str != null) {
                iD += CodedOutputByteBufferNano.o(2, str);
            }
            int iH = iD + CodedOutputByteBufferNano.h(3, viewersBox.viewCount);
            ((MessageNano) viewersBox).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ViewersBox m19819parse(nb5 nb5Var) throws IOException {
            ViewersBox viewersBox = new ViewersBox();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (viewersBox.userId != null) {
                        break;
                    }
                    viewersBox.userId = "";
                    break;
                }
                if (iU == 9) {
                    viewersBox.lastViewTime = nb5Var.h();
                } else if (iU == 18) {
                    viewersBox.userId = nb5Var.s();
                } else {
                    if (iU != 24) {
                        if (viewersBox.userId != null) {
                            break;
                        }
                        viewersBox.userId = "";
                        return viewersBox;
                    }
                    viewersBox.viewCount = nb5Var.j();
                }
            }
            return viewersBox;
        }

        public void serialize(ViewersBox viewersBox, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.C(1, viewersBox.lastViewTime);
            String str = viewersBox.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            codedOutputByteBufferNano.G(3, viewersBox.viewCount);
        }
    };
    public static JsonAdapter<ViewersBox> JSON_ADAPTER = new ObjectJsonAdapter<ViewersBox>() { // from class: com.p1.mobile.putong.feed.data.ViewersBox.2
        public Class getDataClass() {
            return ViewersBox.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ViewersBox mo17830newInstance() {
            return new ViewersBox();
        }

        public boolean parseField(ViewersBox viewersBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "viewCount":
                    viewersBox.viewCount = jsonParser.getValueAsInt();
                    return true;
                case "userId":
                    viewersBox.userId = jsonParser.getValueAsString();
                    return true;
                case "lastViewTime":
                    viewersBox.lastViewTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ViewersBox viewersBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "viewCount":
                case "userId":
                case "lastViewTime":
                    return true;
                default:
                    return super.parseFieldCheck(viewersBox, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ViewersBox viewersBox, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("lastViewTime");
            Converter.API_TIME.serialize(Double.valueOf(viewersBox.lastViewTime), jsonGenerator, true);
            String str = viewersBox.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("viewCount", viewersBox.viewCount);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ViewersBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ViewersBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ViewersBox new_() {
        ViewersBox viewersBox = new ViewersBox();
        viewersBox.nullCheck();
        return viewersBox;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ViewersBox m19818clone() {
        ViewersBox viewersBox = new ViewersBox();
        viewersBox.lastViewTime = this.lastViewTime;
        viewersBox.userId = this.userId;
        viewersBox.viewCount = this.viewCount;
        return viewersBox;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewersBox)) {
            return false;
        }
        ViewersBox viewersBox = (ViewersBox) obj;
        return this.lastViewTime == viewersBox.lastViewTime && ValueObject.util_equals(this.userId, viewersBox.userId) && this.viewCount == viewersBox.viewCount;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.lastViewTime);
        int i2 = ((i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str = this.userId;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.viewCount;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
