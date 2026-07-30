package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
public class LimitTimePicture extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "limittimepicture";

    @ProtobufIndex(index = 1)
    public int duration;

    @NonNull
    @ProtobufIndex(index = 2)
    public LimitTimePictureStatus status;
    public static ProtobufAdapter<LimitTimePicture> PROTOBUF_ADAPTER = new MessageNanoAdapter<LimitTimePicture>() { // from class: com.p1.mobile.putong.core.data.LimitTimePicture.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LimitTimePicture limitTimePicture) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, limitTimePicture.duration);
            LimitTimePictureStatus limitTimePictureStatus = limitTimePicture.status;
            if (limitTimePictureStatus != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, limitTimePictureStatus, LimitTimePictureStatus.PROTOBUF_ADAPTER);
            }
            limitTimePicture.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LimitTimePicture parse(nb5 nb5Var) throws IOException {
            LimitTimePicture limitTimePicture = new LimitTimePicture();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (limitTimePicture.status != null) {
                        break;
                    }
                    limitTimePicture.status = (LimitTimePictureStatus) LimitTimePictureStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 8) {
                    limitTimePicture.duration = nb5Var.m158741j();
                } else {
                    if (iM158752u != 18) {
                        if (limitTimePicture.status != null) {
                            break;
                        }
                        limitTimePicture.status = (LimitTimePictureStatus) LimitTimePictureStatus.JSON_ADAPTER.defaultEnum();
                        return limitTimePicture;
                    }
                    limitTimePicture.status = (LimitTimePictureStatus) nb5Var.m158743l(LimitTimePictureStatus.PROTOBUF_ADAPTER);
                }
            }
            return limitTimePicture;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LimitTimePicture limitTimePicture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, limitTimePicture.duration);
            LimitTimePictureStatus limitTimePictureStatus = limitTimePicture.status;
            if (limitTimePictureStatus != null) {
                codedOutputByteBufferNano.m17254K(2, limitTimePictureStatus, LimitTimePictureStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LimitTimePicture> JSON_ADAPTER = new ObjectJsonAdapter<LimitTimePicture>() { // from class: com.p1.mobile.putong.core.data.LimitTimePicture.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LimitTimePicture.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LimitTimePicture newInstance() {
            return new LimitTimePicture();
        }

        public boolean parseField(LimitTimePicture limitTimePicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(BLiveOperationTitleShowType.duration)) {
                limitTimePicture.duration = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return false;
            }
            limitTimePicture.status = LimitTimePictureStatus.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(LimitTimePicture limitTimePicture, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(BLiveOperationTitleShowType.duration) || str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return true;
            }
            return super.parseFieldCheck(limitTimePicture, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LimitTimePicture limitTimePicture, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, limitTimePicture.duration);
            if (limitTimePicture.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                LimitTimePictureStatus.JSON_ADAPTER.serialize(limitTimePicture.status, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LimitTimePicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LimitTimePicture) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LimitTimePicture new_() {
        LimitTimePicture limitTimePicture = new LimitTimePicture();
        limitTimePicture.nullCheck();
        return limitTimePicture;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LimitTimePicture mo223809clone() {
        LimitTimePicture limitTimePicture = new LimitTimePicture();
        limitTimePicture.duration = this.duration;
        limitTimePicture.status = this.status;
        return limitTimePicture;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LimitTimePicture)) {
            return false;
        }
        LimitTimePicture limitTimePicture = (LimitTimePicture) obj;
        return this.duration == limitTimePicture.duration && ValueObject.util_equals(this.status, limitTimePicture.status);
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
        int i2 = ((i * 41) + this.duration) * 41;
        LimitTimePictureStatus limitTimePictureStatus = this.status;
        int iHashCode = i2 + (limitTimePictureStatus != null ? limitTimePictureStatus.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.status == null) {
            this.status = (LimitTimePictureStatus) LimitTimePictureStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
