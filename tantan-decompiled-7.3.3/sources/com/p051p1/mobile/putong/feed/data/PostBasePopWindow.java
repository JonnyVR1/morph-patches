package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.ButtonInfo;
import com.p051p1.mobile.putong.feed.data.UserSimpleInfo;
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
import java.util.List;
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class PostBasePopWindow extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "postbasepopwindow";

    @NonNull
    @ProtobufIndex(index = 1)
    public BasicInfoComponent basic;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<ButtonInfo> buttons;

    @NonNull
    @ProtobufIndex(index = 9)
    public CloseWindowComponent close;

    @NonNull
    @ProtobufIndex(index = 2)
    public IllustrationComponent illustration;

    @NonNull
    @ProtobufIndex(index = 6)
    public InputBoxComponent inputBox;

    @NonNull
    @ProtobufIndex(index = 7)
    public LocationComponent locations;

    @NonNull
    @ProtobufIndex(index = 5)
    public String mainBody;

    @NonNull
    @ProtobufIndex(index = 10)
    public OccasionComponent occasion;

    @NonNull
    @ProtobufIndex(index = 4)
    public String title;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<UserSimpleInfo> users;
    public static ProtobufAdapter<PostBasePopWindow> PROTOBUF_ADAPTER = new MessageNanoAdapter<PostBasePopWindow>() { // from class: com.p1.mobile.putong.feed.data.PostBasePopWindow.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PostBasePopWindow postBasePopWindow) {
            BasicInfoComponent basicInfoComponent = postBasePopWindow.basic;
            int iM17285l = basicInfoComponent != null ? CodedOutputByteBufferNano.m17285l(1, basicInfoComponent, BasicInfoComponent.PROTOBUF_ADAPTER) : 0;
            IllustrationComponent illustrationComponent = postBasePopWindow.illustration;
            if (illustrationComponent != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, illustrationComponent, IllustrationComponent.PROTOBUF_ADAPTER);
            }
            List<UserSimpleInfo> list = postBasePopWindow.users;
            if (list != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, list, UserSimpleInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = postBasePopWindow.title;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(4, str);
            }
            String str2 = postBasePopWindow.mainBody;
            if (str2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(5, str2);
            }
            InputBoxComponent inputBoxComponent = postBasePopWindow.inputBox;
            if (inputBoxComponent != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(6, inputBoxComponent, InputBoxComponent.PROTOBUF_ADAPTER);
            }
            LocationComponent locationComponent = postBasePopWindow.locations;
            if (locationComponent != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(7, locationComponent, LocationComponent.PROTOBUF_ADAPTER);
            }
            List<ButtonInfo> list2 = postBasePopWindow.buttons;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(8, list2, ButtonInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            CloseWindowComponent closeWindowComponent = postBasePopWindow.close;
            if (closeWindowComponent != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(9, closeWindowComponent, CloseWindowComponent.PROTOBUF_ADAPTER);
            }
            OccasionComponent occasionComponent = postBasePopWindow.occasion;
            if (occasionComponent != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(10, occasionComponent, OccasionComponent.PROTOBUF_ADAPTER);
            }
            postBasePopWindow.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PostBasePopWindow parse(nc5 nc5Var) throws IOException {
            PostBasePopWindow postBasePopWindow = new PostBasePopWindow();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (postBasePopWindow.basic == null) {
                            postBasePopWindow.basic = BasicInfoComponent.new_();
                        }
                        if (postBasePopWindow.illustration == null) {
                            postBasePopWindow.illustration = IllustrationComponent.new_();
                        }
                        if (postBasePopWindow.users == null) {
                            postBasePopWindow.users = new ArrayList();
                        }
                        if (postBasePopWindow.title == null) {
                            postBasePopWindow.title = "";
                        }
                        if (postBasePopWindow.mainBody == null) {
                            postBasePopWindow.mainBody = "";
                        }
                        if (postBasePopWindow.inputBox == null) {
                            postBasePopWindow.inputBox = InputBoxComponent.new_();
                        }
                        if (postBasePopWindow.locations == null) {
                            postBasePopWindow.locations = LocationComponent.new_();
                        }
                        if (postBasePopWindow.buttons == null) {
                            postBasePopWindow.buttons = new ArrayList();
                        }
                        if (postBasePopWindow.close == null) {
                            postBasePopWindow.close = CloseWindowComponent.new_();
                        }
                        if (postBasePopWindow.occasion == null) {
                            postBasePopWindow.occasion = OccasionComponent.new_();
                        }
                        break;
                    case 10:
                        postBasePopWindow.basic = (BasicInfoComponent) nc5Var.m162488l(BasicInfoComponent.PROTOBUF_ADAPTER);
                        continue;
                    case 18:
                        postBasePopWindow.illustration = (IllustrationComponent) nc5Var.m162488l(IllustrationComponent.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        postBasePopWindow.users = (List) nc5Var.m162488l(UserSimpleInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 34:
                        postBasePopWindow.title = nc5Var.m162495s();
                        continue;
                    case 42:
                        postBasePopWindow.mainBody = nc5Var.m162495s();
                        continue;
                    case 50:
                        postBasePopWindow.inputBox = (InputBoxComponent) nc5Var.m162488l(InputBoxComponent.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        postBasePopWindow.locations = (LocationComponent) nc5Var.m162488l(LocationComponent.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        postBasePopWindow.buttons = (List) nc5Var.m162488l(ButtonInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        postBasePopWindow.close = (CloseWindowComponent) nc5Var.m162488l(CloseWindowComponent.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        postBasePopWindow.occasion = (OccasionComponent) nc5Var.m162488l(OccasionComponent.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (postBasePopWindow.basic == null) {
                            postBasePopWindow.basic = BasicInfoComponent.new_();
                        }
                        if (postBasePopWindow.illustration == null) {
                            postBasePopWindow.illustration = IllustrationComponent.new_();
                        }
                        if (postBasePopWindow.users == null) {
                            postBasePopWindow.users = new ArrayList();
                        }
                        if (postBasePopWindow.title == null) {
                            postBasePopWindow.title = "";
                        }
                        if (postBasePopWindow.mainBody == null) {
                            postBasePopWindow.mainBody = "";
                        }
                        if (postBasePopWindow.inputBox == null) {
                            postBasePopWindow.inputBox = InputBoxComponent.new_();
                        }
                        if (postBasePopWindow.locations == null) {
                            postBasePopWindow.locations = LocationComponent.new_();
                        }
                        if (postBasePopWindow.buttons == null) {
                            postBasePopWindow.buttons = new ArrayList();
                        }
                        if (postBasePopWindow.close == null) {
                            postBasePopWindow.close = CloseWindowComponent.new_();
                        }
                        if (postBasePopWindow.occasion == null) {
                            postBasePopWindow.occasion = OccasionComponent.new_();
                            return postBasePopWindow;
                        }
                        break;
                }
            }
            return postBasePopWindow;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PostBasePopWindow postBasePopWindow, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            BasicInfoComponent basicInfoComponent = postBasePopWindow.basic;
            if (basicInfoComponent != null) {
                codedOutputByteBufferNano.m17309K(1, basicInfoComponent, BasicInfoComponent.PROTOBUF_ADAPTER);
            }
            IllustrationComponent illustrationComponent = postBasePopWindow.illustration;
            if (illustrationComponent != null) {
                codedOutputByteBufferNano.m17309K(2, illustrationComponent, IllustrationComponent.PROTOBUF_ADAPTER);
            }
            List<UserSimpleInfo> list = postBasePopWindow.users;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, UserSimpleInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = postBasePopWindow.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(4, str);
            }
            String str2 = postBasePopWindow.mainBody;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(5, str2);
            }
            InputBoxComponent inputBoxComponent = postBasePopWindow.inputBox;
            if (inputBoxComponent != null) {
                codedOutputByteBufferNano.m17309K(6, inputBoxComponent, InputBoxComponent.PROTOBUF_ADAPTER);
            }
            LocationComponent locationComponent = postBasePopWindow.locations;
            if (locationComponent != null) {
                codedOutputByteBufferNano.m17309K(7, locationComponent, LocationComponent.PROTOBUF_ADAPTER);
            }
            List<ButtonInfo> list2 = postBasePopWindow.buttons;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(8, list2, ButtonInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            CloseWindowComponent closeWindowComponent = postBasePopWindow.close;
            if (closeWindowComponent != null) {
                codedOutputByteBufferNano.m17309K(9, closeWindowComponent, CloseWindowComponent.PROTOBUF_ADAPTER);
            }
            OccasionComponent occasionComponent = postBasePopWindow.occasion;
            if (occasionComponent != null) {
                codedOutputByteBufferNano.m17309K(10, occasionComponent, OccasionComponent.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PostBasePopWindow> JSON_ADAPTER = new ObjectJsonAdapter<PostBasePopWindow>() { // from class: com.p1.mobile.putong.feed.data.PostBasePopWindow.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PostBasePopWindow.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PostBasePopWindow newInstance() {
            return new PostBasePopWindow();
        }

        public boolean parseField(PostBasePopWindow postBasePopWindow, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "locations":
                    postBasePopWindow.locations = LocationComponent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "mainBody":
                    postBasePopWindow.mainBody = jsonParser.getValueAsString();
                    return true;
                case "basic":
                    postBasePopWindow.basic = BasicInfoComponent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "close":
                    postBasePopWindow.close = CloseWindowComponent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    postBasePopWindow.title = jsonParser.getValueAsString();
                    return true;
                case "users":
                    postBasePopWindow.users = JsonAdapter.parseArray(jsonParser, UserSimpleInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "buttons":
                    postBasePopWindow.buttons = JsonAdapter.parseArray(jsonParser, ButtonInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "inputBox":
                    postBasePopWindow.inputBox = InputBoxComponent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "occasion":
                    postBasePopWindow.occasion = OccasionComponent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "illustration":
                    postBasePopWindow.illustration = IllustrationComponent.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PostBasePopWindow postBasePopWindow, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "locations":
                case "mainBody":
                case "basic":
                case "close":
                case "title":
                case "users":
                case "buttons":
                case "inputBox":
                case "occasion":
                case "illustration":
                    return true;
                default:
                    return super.parseFieldCheck(postBasePopWindow, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PostBasePopWindow postBasePopWindow, JsonGenerator jsonGenerator) throws IOException {
            if (postBasePopWindow.basic != null) {
                jsonGenerator.writeFieldName("basic");
                BasicInfoComponent.JSON_ADAPTER.serialize(postBasePopWindow.basic, jsonGenerator, true);
            }
            if (postBasePopWindow.illustration != null) {
                jsonGenerator.writeFieldName("illustration");
                IllustrationComponent.JSON_ADAPTER.serialize(postBasePopWindow.illustration, jsonGenerator, true);
            }
            if (postBasePopWindow.users != null) {
                jsonGenerator.writeFieldName("users");
                JsonAdapter.serializeArray(postBasePopWindow.users, jsonGenerator, UserSimpleInfo.JSON_ADAPTER);
            }
            String str = postBasePopWindow.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = postBasePopWindow.mainBody;
            if (str2 != null) {
                jsonGenerator.writeStringField("mainBody", str2);
            }
            if (postBasePopWindow.inputBox != null) {
                jsonGenerator.writeFieldName("inputBox");
                InputBoxComponent.JSON_ADAPTER.serialize(postBasePopWindow.inputBox, jsonGenerator, true);
            }
            if (postBasePopWindow.locations != null) {
                jsonGenerator.writeFieldName("locations");
                LocationComponent.JSON_ADAPTER.serialize(postBasePopWindow.locations, jsonGenerator, true);
            }
            if (postBasePopWindow.buttons != null) {
                jsonGenerator.writeFieldName(Constants.KEY_BUTTONS);
                JsonAdapter.serializeArray(postBasePopWindow.buttons, jsonGenerator, ButtonInfo.JSON_ADAPTER);
            }
            if (postBasePopWindow.close != null) {
                jsonGenerator.writeFieldName("close");
                CloseWindowComponent.JSON_ADAPTER.serialize(postBasePopWindow.close, jsonGenerator, true);
            }
            if (postBasePopWindow.occasion != null) {
                jsonGenerator.writeFieldName("occasion");
                OccasionComponent.JSON_ADAPTER.serialize(postBasePopWindow.occasion, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PostBasePopWindow) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PostBasePopWindow) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PostBasePopWindow new_() {
        PostBasePopWindow postBasePopWindow = new PostBasePopWindow();
        postBasePopWindow.nullCheck();
        return postBasePopWindow;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PostBasePopWindow mo225055clone() {
        PostBasePopWindow postBasePopWindow = new PostBasePopWindow();
        BasicInfoComponent basicInfoComponent = this.basic;
        if (basicInfoComponent != null) {
            postBasePopWindow.basic = basicInfoComponent.mo225055clone();
        }
        IllustrationComponent illustrationComponent = this.illustration;
        if (illustrationComponent != null) {
            postBasePopWindow.illustration = illustrationComponent.mo225055clone();
        }
        List<UserSimpleInfo> list = this.users;
        if (list != null) {
            postBasePopWindow.users = ValueObject.util_map(list, new qcj() { // from class: l.nl80
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((UserSimpleInfo) obj).mo225055clone();
                }
            });
        }
        postBasePopWindow.title = this.title;
        postBasePopWindow.mainBody = this.mainBody;
        InputBoxComponent inputBoxComponent = this.inputBox;
        if (inputBoxComponent != null) {
            postBasePopWindow.inputBox = inputBoxComponent.mo225055clone();
        }
        LocationComponent locationComponent = this.locations;
        if (locationComponent != null) {
            postBasePopWindow.locations = locationComponent.mo225055clone();
        }
        List<ButtonInfo> list2 = this.buttons;
        if (list2 != null) {
            postBasePopWindow.buttons = ValueObject.util_map(list2, new qcj() { // from class: l.ol80
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((ButtonInfo) obj).mo225055clone();
                }
            });
        }
        CloseWindowComponent closeWindowComponent = this.close;
        if (closeWindowComponent != null) {
            postBasePopWindow.close = closeWindowComponent.mo225055clone();
        }
        OccasionComponent occasionComponent = this.occasion;
        if (occasionComponent != null) {
            postBasePopWindow.occasion = occasionComponent.mo225055clone();
        }
        return postBasePopWindow;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PostBasePopWindow)) {
            return false;
        }
        PostBasePopWindow postBasePopWindow = (PostBasePopWindow) obj;
        return ValueObject.util_equals(this.basic, postBasePopWindow.basic) && ValueObject.util_equals(this.illustration, postBasePopWindow.illustration) && ValueObject.util_equals(this.users, postBasePopWindow.users) && ValueObject.util_equals(this.title, postBasePopWindow.title) && ValueObject.util_equals(this.mainBody, postBasePopWindow.mainBody) && ValueObject.util_equals(this.inputBox, postBasePopWindow.inputBox) && ValueObject.util_equals(this.locations, postBasePopWindow.locations) && ValueObject.util_equals(this.buttons, postBasePopWindow.buttons) && ValueObject.util_equals(this.close, postBasePopWindow.close) && ValueObject.util_equals(this.occasion, postBasePopWindow.occasion);
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
        BasicInfoComponent basicInfoComponent = this.basic;
        int iHashCode = (i2 + (basicInfoComponent != null ? basicInfoComponent.hashCode() : 0)) * 41;
        IllustrationComponent illustrationComponent = this.illustration;
        int iHashCode2 = (iHashCode + (illustrationComponent != null ? illustrationComponent.hashCode() : 0)) * 41;
        List<UserSimpleInfo> list = this.users;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.title;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.mainBody;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        InputBoxComponent inputBoxComponent = this.inputBox;
        int iHashCode6 = (iHashCode5 + (inputBoxComponent != null ? inputBoxComponent.hashCode() : 0)) * 41;
        LocationComponent locationComponent = this.locations;
        int iHashCode7 = (iHashCode6 + (locationComponent != null ? locationComponent.hashCode() : 0)) * 41;
        List<ButtonInfo> list2 = this.buttons;
        int iHashCode8 = (iHashCode7 + (list2 != null ? list2.hashCode() : 0)) * 41;
        CloseWindowComponent closeWindowComponent = this.close;
        int iHashCode9 = (iHashCode8 + (closeWindowComponent != null ? closeWindowComponent.hashCode() : 0)) * 41;
        OccasionComponent occasionComponent = this.occasion;
        int iHashCode10 = iHashCode9 + (occasionComponent != null ? occasionComponent.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.basic == null) {
            this.basic = BasicInfoComponent.new_();
        }
        if (this.illustration == null) {
            this.illustration = IllustrationComponent.new_();
        }
        if (this.users == null) {
            this.users = new ArrayList();
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.mainBody == null) {
            this.mainBody = "";
        }
        if (this.inputBox == null) {
            this.inputBox = InputBoxComponent.new_();
        }
        if (this.locations == null) {
            this.locations = LocationComponent.new_();
        }
        if (this.buttons == null) {
            this.buttons = new ArrayList();
        }
        if (this.close == null) {
            this.close = CloseWindowComponent.new_();
        }
        if (this.occasion == null) {
            this.occasion = OccasionComponent.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
