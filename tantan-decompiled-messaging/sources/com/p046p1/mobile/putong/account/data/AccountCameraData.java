package com.p046p1.mobile.putong.account.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.account.data.CameraCategory;
import com.p046p1.mobile.putong.account.data.CameraFilter;
import com.p046p1.mobile.putong.account.data.CameraSticker;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes9.dex */
public class AccountCameraData extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "accountcameradata";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<CameraCategory> cameraCategories;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<CameraFilter> cameraFilters;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<CameraSticker> cameraStickers;
    public static ProtobufAdapter<AccountCameraData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AccountCameraData>() { // from class: com.p1.mobile.putong.account.data.AccountCameraData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AccountCameraData accountCameraData) {
            List<CameraFilter> list = accountCameraData.cameraFilters;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, CameraFilter.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<CameraSticker> list2 = accountCameraData.cameraStickers;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, CameraSticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CameraCategory> list3 = accountCameraData.cameraCategories;
            if (list3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, list3, CameraCategory.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            accountCameraData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AccountCameraData parse(nb5 nb5Var) throws IOException {
            AccountCameraData accountCameraData = new AccountCameraData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (accountCameraData.cameraFilters == null) {
                        accountCameraData.cameraFilters = new ArrayList();
                    }
                    if (accountCameraData.cameraStickers == null) {
                        accountCameraData.cameraStickers = new ArrayList();
                    }
                    if (accountCameraData.cameraCategories != null) {
                        break;
                    }
                    accountCameraData.cameraCategories = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    accountCameraData.cameraFilters = (List) nb5Var.m158743l(CameraFilter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    accountCameraData.cameraStickers = (List) nb5Var.m158743l(CameraSticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 26) {
                        if (accountCameraData.cameraFilters == null) {
                            accountCameraData.cameraFilters = new ArrayList();
                        }
                        if (accountCameraData.cameraStickers == null) {
                            accountCameraData.cameraStickers = new ArrayList();
                        }
                        if (accountCameraData.cameraCategories != null) {
                            break;
                        }
                        accountCameraData.cameraCategories = new ArrayList();
                        return accountCameraData;
                    }
                    accountCameraData.cameraCategories = (List) nb5Var.m158743l(CameraCategory.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return accountCameraData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AccountCameraData accountCameraData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<CameraFilter> list = accountCameraData.cameraFilters;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, CameraFilter.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CameraSticker> list2 = accountCameraData.cameraStickers;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, CameraSticker.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<CameraCategory> list3 = accountCameraData.cameraCategories;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(3, list3, CameraCategory.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AccountCameraData> JSON_ADAPTER = new ObjectJsonAdapter<AccountCameraData>() { // from class: com.p1.mobile.putong.account.data.AccountCameraData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AccountCameraData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AccountCameraData newInstance() {
            return new AccountCameraData();
        }

        public boolean parseField(AccountCameraData accountCameraData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cameraFilters":
                    accountCameraData.cameraFilters = JsonAdapter.parseArray(jsonParser, CameraFilter.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "cameraStickers":
                    accountCameraData.cameraStickers = JsonAdapter.parseArray(jsonParser, CameraSticker.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "cameraCategories":
                    accountCameraData.cameraCategories = JsonAdapter.parseArray(jsonParser, CameraCategory.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AccountCameraData accountCameraData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "cameraFilters":
                case "cameraStickers":
                case "cameraCategories":
                    return true;
                default:
                    return super.parseFieldCheck(accountCameraData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AccountCameraData accountCameraData, JsonGenerator jsonGenerator) throws IOException {
            if (accountCameraData.cameraFilters != null) {
                jsonGenerator.writeFieldName("cameraFilters");
                JsonAdapter.serializeArray(accountCameraData.cameraFilters, jsonGenerator, CameraFilter.JSON_ADAPTER);
            }
            if (accountCameraData.cameraStickers != null) {
                jsonGenerator.writeFieldName("cameraStickers");
                JsonAdapter.serializeArray(accountCameraData.cameraStickers, jsonGenerator, CameraSticker.JSON_ADAPTER);
            }
            if (accountCameraData.cameraCategories != null) {
                jsonGenerator.writeFieldName("cameraCategories");
                JsonAdapter.serializeArray(accountCameraData.cameraCategories, jsonGenerator, CameraCategory.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AccountCameraData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AccountCameraData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AccountCameraData new_() {
        AccountCameraData accountCameraData = new AccountCameraData();
        accountCameraData.nullCheck();
        return accountCameraData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AccountCameraData mo223809clone() {
        AccountCameraData accountCameraData = new AccountCameraData();
        List<CameraFilter> list = this.cameraFilters;
        if (list != null) {
            accountCameraData.cameraFilters = ValueObject.util_map(list, new w9j() { // from class: l.bi
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CameraFilter) obj).mo223809clone();
                }
            });
        }
        List<CameraSticker> list2 = this.cameraStickers;
        if (list2 != null) {
            accountCameraData.cameraStickers = ValueObject.util_map(list2, new w9j() { // from class: l.ci
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CameraSticker) obj).mo223809clone();
                }
            });
        }
        List<CameraCategory> list3 = this.cameraCategories;
        if (list3 != null) {
            accountCameraData.cameraCategories = ValueObject.util_map(list3, new w9j() { // from class: l.di
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((CameraCategory) obj).mo223809clone();
                }
            });
        }
        return accountCameraData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountCameraData)) {
            return false;
        }
        AccountCameraData accountCameraData = (AccountCameraData) obj;
        return this == obj && ValueObject.util_equals(this.cameraFilters, accountCameraData.cameraFilters) && ValueObject.util_equals(this.cameraStickers, accountCameraData.cameraStickers) && ValueObject.util_equals(this.cameraCategories, accountCameraData.cameraCategories);
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
        int iHashCode = super.hashCode() * 41;
        List<CameraFilter> list = this.cameraFilters;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<CameraSticker> list2 = this.cameraStickers;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<CameraCategory> list3 = this.cameraCategories;
        int iHashCode4 = iHashCode3 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.cameraFilters == null) {
            this.cameraFilters = new ArrayList();
        }
        if (this.cameraStickers == null) {
            this.cameraStickers = new ArrayList();
        }
        if (this.cameraCategories == null) {
            this.cameraCategories = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
