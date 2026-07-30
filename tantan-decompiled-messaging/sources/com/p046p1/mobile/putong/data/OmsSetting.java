package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.OmsNewTags;
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
import java.util.HashSet;
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class OmsSetting extends ValueObject<OmsSetting> implements Cloneable, Serializable {
    public static final String TYPE = "omssetting";

    @NonNull
    @ProtobufIndex(index = 1)
    public MedalCard medalCard;
    private HashSet<String> parseFieldSet = new HashSet<>();
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<OmsNewTags> tags;

    @NonNull
    @ProtobufIndex(index = 2)
    public ThemeView themeView;
    public static ProtobufAdapter<OmsSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<OmsSetting>() { // from class: com.p1.mobile.putong.data.OmsSetting.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OmsSetting omsSetting) {
            MedalCard medalCard = omsSetting.medalCard;
            int iM17230l = medalCard != null ? CodedOutputByteBufferNano.m17230l(1, medalCard, MedalCard.PROTOBUF_ADAPTER) : 0;
            ThemeView themeView = omsSetting.themeView;
            if (themeView != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, themeView, ThemeView.PROTOBUF_ADAPTER);
            }
            List<OmsNewTags> list = omsSetting.tags;
            if (list != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, list, OmsNewTags.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            omsSetting.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OmsSetting parse(nb5 nb5Var) throws IOException {
            OmsSetting omsSetting = new OmsSetting();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (omsSetting.medalCard == null) {
                        omsSetting.medalCard = MedalCard.new_();
                    }
                    if (omsSetting.themeView == null) {
                        omsSetting.themeView = ThemeView.new_();
                    }
                    if (omsSetting.tags != null) {
                        break;
                    }
                    omsSetting.tags = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    omsSetting.medalCard = (MedalCard) nb5Var.m158743l(MedalCard.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    omsSetting.themeView = (ThemeView) nb5Var.m158743l(ThemeView.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 26) {
                        if (omsSetting.medalCard == null) {
                            omsSetting.medalCard = MedalCard.new_();
                        }
                        if (omsSetting.themeView == null) {
                            omsSetting.themeView = ThemeView.new_();
                        }
                        if (omsSetting.tags != null) {
                            break;
                        }
                        omsSetting.tags = new ArrayList();
                        return omsSetting;
                    }
                    omsSetting.tags = (List) nb5Var.m158743l(OmsNewTags.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return omsSetting;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OmsSetting omsSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MedalCard medalCard = omsSetting.medalCard;
            if (medalCard != null) {
                codedOutputByteBufferNano.m17254K(1, medalCard, MedalCard.PROTOBUF_ADAPTER);
            }
            ThemeView themeView = omsSetting.themeView;
            if (themeView != null) {
                codedOutputByteBufferNano.m17254K(2, themeView, ThemeView.PROTOBUF_ADAPTER);
            }
            List<OmsNewTags> list = omsSetting.tags;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, OmsNewTags.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<OmsSetting> JSON_ADAPTER = new ObjectJsonAdapter<OmsSetting>() { // from class: com.p1.mobile.putong.data.OmsSetting.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OmsSetting.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OmsSetting newInstance() {
            return new OmsSetting();
        }

        public boolean parseField(OmsSetting omsSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tags":
                    omsSetting.tags = JsonAdapter.parseArray(jsonParser, OmsNewTags.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "themeView":
                    omsSetting.themeView = ThemeView.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "medalCard":
                    omsSetting.medalCard = MedalCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OmsSetting omsSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "tags":
                case "themeView":
                case "medalCard":
                    return true;
                default:
                    return super.parseFieldCheck(omsSetting, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OmsSetting omsSetting, JsonGenerator jsonGenerator) throws IOException {
            if (omsSetting.medalCard != null) {
                jsonGenerator.writeFieldName("medalCard");
                MedalCard.JSON_ADAPTER.serialize(omsSetting.medalCard, jsonGenerator, true);
            }
            if (omsSetting.themeView != null) {
                jsonGenerator.writeFieldName("themeView");
                ThemeView.JSON_ADAPTER.serialize(omsSetting.themeView, jsonGenerator, true);
            }
            if (omsSetting.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(omsSetting.tags, jsonGenerator, OmsNewTags.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OmsSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OmsSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OmsSetting new_() {
        OmsSetting omsSetting = new OmsSetting();
        omsSetting.nullCheck();
        return omsSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OmsSetting mo223809clone() {
        OmsSetting omsSetting = new OmsSetting();
        MedalCard medalCard = this.medalCard;
        if (medalCard != null) {
            omsSetting.medalCard = medalCard.mo223809clone();
        }
        ThemeView themeView = this.themeView;
        if (themeView != null) {
            omsSetting.themeView = themeView.mo223809clone();
        }
        List<OmsNewTags> list = this.tags;
        if (list != null) {
            omsSetting.tags = ValueObject.util_map(list, new w9j() { // from class: l.oc50
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((OmsNewTags) obj).mo223809clone();
                }
            });
        }
        return omsSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OmsSetting)) {
            return false;
        }
        OmsSetting omsSetting = (OmsSetting) obj;
        return ValueObject.util_equals(this.medalCard, omsSetting.medalCard) && ValueObject.util_equals(this.themeView, omsSetting.themeView) && ValueObject.util_equals(this.tags, omsSetting.tags);
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
        MedalCard medalCard = this.medalCard;
        int iHashCode = (i2 + (medalCard != null ? medalCard.hashCode() : 0)) * 41;
        ThemeView themeView = this.themeView;
        int iHashCode2 = (iHashCode + (themeView != null ? themeView.hashCode() : 0)) * 41;
        List<OmsNewTags> list = this.tags;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(OmsSetting omsSetting) {
        if (!shouldMergeData() || equals(omsSetting)) {
            return;
        }
        if (!isFieldParsed("medalCard")) {
            this.medalCard = omsSetting.medalCard;
        }
        if (!isFieldParsed("themeView")) {
            this.themeView = omsSetting.themeView;
        }
        if (!isFieldParsed("tags")) {
            this.tags = omsSetting.tags;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.medalCard == null) {
            this.medalCard = MedalCard.new_();
        }
        if (this.themeView == null) {
            this.themeView = ThemeView.new_();
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public OmsSetting subtract(OmsSetting omsSetting) {
        OmsSetting omsSetting2 = new OmsSetting();
        MedalCard medalCard = this.medalCard;
        if (medalCard != null) {
            omsSetting2.medalCard = medalCard.subtract(omsSetting.medalCard);
        }
        ThemeView themeView = this.themeView;
        if (themeView != null) {
            omsSetting2.themeView = themeView.subtract(omsSetting.themeView);
        }
        if (!ValueObject.util_equals(this.tags, omsSetting.tags)) {
            omsSetting2.tags = this.tags;
        }
        if (omsSetting2.equals(new OmsSetting())) {
            return null;
        }
        return omsSetting2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
