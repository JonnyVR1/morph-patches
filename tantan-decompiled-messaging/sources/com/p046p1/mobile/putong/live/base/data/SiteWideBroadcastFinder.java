package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class SiteWideBroadcastFinder extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<SiteWideBroadcastFinder> JSON_ADAPTER = new ObjectJsonAdapter<SiteWideBroadcastFinder>() { // from class: com.p1.mobile.putong.live.base.data.SiteWideBroadcastFinder.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SiteWideBroadcastFinder.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SiteWideBroadcastFinder newInstance() {
            return new SiteWideBroadcastFinder();
        }

        public boolean parseField(SiteWideBroadcastFinder siteWideBroadcastFinder, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("message")) {
                return false;
            }
            siteWideBroadcastFinder.message = jsonParser.getValueAsString();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SiteWideBroadcastFinder siteWideBroadcastFinder, JsonGenerator jsonGenerator) throws IOException {
            String str = siteWideBroadcastFinder.message;
            if (str != null) {
                jsonGenerator.writeStringField("message", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SiteWideBroadcastFinder) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "sitewidebroadcastfinder";

    @NonNull
    @ProtobufIndex(index = 1)
    public String message;

    public static SiteWideBroadcastFinder new_() {
        SiteWideBroadcastFinder siteWideBroadcastFinder = new SiteWideBroadcastFinder();
        siteWideBroadcastFinder.nullCheck();
        return siteWideBroadcastFinder;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SiteWideBroadcastFinder mo223809clone() {
        SiteWideBroadcastFinder siteWideBroadcastFinder = new SiteWideBroadcastFinder();
        siteWideBroadcastFinder.message = this.message;
        return siteWideBroadcastFinder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SiteWideBroadcastFinder) {
            return ValueObject.util_equals(this.message, ((SiteWideBroadcastFinder) obj).message);
        }
        return false;
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
        String str = this.message;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.message == null) {
            this.message = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
