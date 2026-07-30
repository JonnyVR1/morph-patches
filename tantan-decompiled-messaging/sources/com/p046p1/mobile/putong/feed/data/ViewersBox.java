package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ViewersBox viewersBox) {
            int iM17222d = CodedOutputByteBufferNano.m17222d(1, viewersBox.lastViewTime);
            String str = viewersBox.userId;
            if (str != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(2, str);
            }
            int iM17226h = iM17222d + CodedOutputByteBufferNano.m17226h(3, viewersBox.viewCount);
            viewersBox.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ViewersBox parse(nb5 nb5Var) throws IOException {
            ViewersBox viewersBox = new ViewersBox();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (viewersBox.userId != null) {
                        break;
                    }
                    viewersBox.userId = "";
                    break;
                }
                if (iM158752u == 9) {
                    viewersBox.lastViewTime = nb5Var.m158739h();
                } else if (iM158752u == 18) {
                    viewersBox.userId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 24) {
                        if (viewersBox.userId != null) {
                            break;
                        }
                        viewersBox.userId = "";
                        return viewersBox;
                    }
                    viewersBox.viewCount = nb5Var.m158741j();
                }
            }
            return viewersBox;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ViewersBox viewersBox, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17246C(1, viewersBox.lastViewTime);
            String str = viewersBox.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            codedOutputByteBufferNano.m17250G(3, viewersBox.viewCount);
        }
    };
    public static JsonAdapter<ViewersBox> JSON_ADAPTER = new ObjectJsonAdapter<ViewersBox>() { // from class: com.p1.mobile.putong.feed.data.ViewersBox.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ViewersBox.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ViewersBox newInstance() {
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
                    viewersBox.lastViewTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ViewersBox viewersBox, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("lastViewTime");
            Converter.API_TIME.serialize(Double.valueOf(viewersBox.lastViewTime), jsonGenerator, true);
            String str = viewersBox.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("viewCount", viewersBox.viewCount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ViewersBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ViewersBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ViewersBox new_() {
        ViewersBox viewersBox = new ViewersBox();
        viewersBox.nullCheck();
        return viewersBox;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ViewersBox mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.lastViewTime);
        int i2 = ((i * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str = this.userId;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.viewCount;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
