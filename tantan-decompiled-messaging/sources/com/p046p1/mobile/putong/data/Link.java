package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.IdBoxed;
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
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class Link extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "link";

    @NonNull
    @ProtobufIndex(index = 3)
    public LinkChannel channel;

    @NonNull
    @ProtobufIndex(index = 5)
    public String href;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38765id;

    @NonNull
    @ProtobufIndex(index = 2)
    public LinkIntent intent;

    @NonNull
    @ProtobufIndex(index = 8)
    public String owner;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<IdBoxed> resources;

    @NonNull
    @ProtobufIndex(index = 6)
    public LinkState state;

    @NonNull
    @ProtobufIndex(index = 7)
    public String title;
    public static ProtobufAdapter<Link> PROTOBUF_ADAPTER = new MessageNanoAdapter<Link>() { // from class: com.p1.mobile.putong.data.Link.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Link link) {
            String str = link.f38765id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            LinkIntent linkIntent = link.intent;
            if (linkIntent != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(2, linkIntent.ordinal());
            }
            LinkChannel linkChannel = link.channel;
            if (linkChannel != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(3, linkChannel.ordinal());
            }
            List<IdBoxed> list = link.resources;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, list, IdBoxed.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = link.href;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str2);
            }
            LinkState linkState = link.state;
            if (linkState != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(6, linkState.ordinal());
            }
            String str3 = link.title;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str3);
            }
            String str4 = link.owner;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(8, str4);
            }
            LinkIntent linkIntent2 = link.intent;
            if (linkIntent2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(9, linkIntent2, LinkIntent.PROTOBUF_ADAPTER);
            }
            LinkChannel linkChannel2 = link.channel;
            if (linkChannel2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(10, linkChannel2, LinkChannel.PROTOBUF_ADAPTER);
            }
            LinkState linkState2 = link.state;
            if (linkState2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(11, linkState2, LinkState.PROTOBUF_ADAPTER);
            }
            link.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Link parse(nb5 nb5Var) throws IOException {
            Link link = new Link();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            Integer numValueOf3 = null;
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (link.intent == null && numValueOf != null) {
                            link.intent = (LinkIntent) LinkIntent.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (link.channel == null && numValueOf2 != null) {
                            link.channel = (LinkChannel) LinkChannel.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (link.state == null && numValueOf3 != null) {
                            link.state = (LinkState) LinkState.JSON_ADAPTER.newTEnum(null, numValueOf3.intValue());
                        }
                        if (link.f38765id == null) {
                            link.f38765id = "";
                        }
                        if (link.intent == null) {
                            link.intent = (LinkIntent) LinkIntent.JSON_ADAPTER.defaultEnum();
                        }
                        if (link.channel == null) {
                            link.channel = (LinkChannel) LinkChannel.JSON_ADAPTER.defaultEnum();
                        }
                        if (link.resources == null) {
                            link.resources = new ArrayList();
                        }
                        if (link.href == null) {
                            link.href = "";
                        }
                        if (link.state == null) {
                            link.state = (LinkState) LinkState.JSON_ADAPTER.defaultEnum();
                        }
                        if (link.title == null) {
                            link.title = "";
                        }
                        if (link.owner == null) {
                            link.owner = "";
                        }
                        break;
                    case 10:
                        link.f38765id = nb5Var.m158750s();
                        continue;
                    case 16:
                        numValueOf = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 24:
                        numValueOf2 = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 34:
                        link.resources = (List) nb5Var.m158743l(IdBoxed.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 42:
                        link.href = nb5Var.m158750s();
                        continue;
                    case 48:
                        numValueOf3 = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 58:
                        link.title = nb5Var.m158750s();
                        continue;
                    case 66:
                        link.owner = nb5Var.m158750s();
                        continue;
                    case 74:
                        link.intent = (LinkIntent) nb5Var.m158743l(LinkIntent.PROTOBUF_ADAPTER);
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        link.channel = (LinkChannel) nb5Var.m158743l(LinkChannel.PROTOBUF_ADAPTER);
                        continue;
                    case 90:
                        link.state = (LinkState) nb5Var.m158743l(LinkState.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (link.intent == null && numValueOf != null) {
                            link.intent = (LinkIntent) LinkIntent.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (link.channel == null && numValueOf2 != null) {
                            link.channel = (LinkChannel) LinkChannel.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (link.state == null && numValueOf3 != null) {
                            link.state = (LinkState) LinkState.JSON_ADAPTER.newTEnum(null, numValueOf3.intValue());
                        }
                        if (link.f38765id == null) {
                            link.f38765id = "";
                        }
                        if (link.intent == null) {
                            link.intent = (LinkIntent) LinkIntent.JSON_ADAPTER.defaultEnum();
                        }
                        if (link.channel == null) {
                            link.channel = (LinkChannel) LinkChannel.JSON_ADAPTER.defaultEnum();
                        }
                        if (link.resources == null) {
                            link.resources = new ArrayList();
                        }
                        if (link.href == null) {
                            link.href = "";
                        }
                        if (link.state == null) {
                            link.state = (LinkState) LinkState.JSON_ADAPTER.defaultEnum();
                        }
                        if (link.title == null) {
                            link.title = "";
                        }
                        if (link.owner == null) {
                            link.owner = "";
                            return link;
                        }
                        break;
                }
            }
            return link;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Link link, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = link.f38765id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            LinkIntent linkIntent = link.intent;
            if (linkIntent != null) {
                codedOutputByteBufferNano.m17250G(2, linkIntent.ordinal());
            }
            LinkChannel linkChannel = link.channel;
            if (linkChannel != null) {
                codedOutputByteBufferNano.m17250G(3, linkChannel.ordinal());
            }
            List<IdBoxed> list = link.resources;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(4, list, IdBoxed.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = link.href;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(5, str2);
            }
            LinkState linkState = link.state;
            if (linkState != null) {
                codedOutputByteBufferNano.m17250G(6, linkState.ordinal());
            }
            String str3 = link.title;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(7, str3);
            }
            String str4 = link.owner;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(8, str4);
            }
            LinkIntent linkIntent2 = link.intent;
            if (linkIntent2 != null) {
                codedOutputByteBufferNano.m17254K(9, linkIntent2, LinkIntent.PROTOBUF_ADAPTER);
            }
            LinkChannel linkChannel2 = link.channel;
            if (linkChannel2 != null) {
                codedOutputByteBufferNano.m17254K(10, linkChannel2, LinkChannel.PROTOBUF_ADAPTER);
            }
            LinkState linkState2 = link.state;
            if (linkState2 != null) {
                codedOutputByteBufferNano.m17254K(11, linkState2, LinkState.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Link> JSON_ADAPTER = new ObjectJsonAdapter<Link>() { // from class: com.p1.mobile.putong.data.Link.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Link.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Link newInstance() {
            return new Link();
        }

        public boolean parseField(Link link, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "resources":
                    link.resources = JsonAdapter.parseArray(jsonParser, IdBoxed.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "intent":
                    link.intent = LinkIntent.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    link.f38765id = jsonParser.getValueAsString();
                    return false;
                case "href":
                    link.href = jsonParser.getValueAsString();
                    return true;
                case "owner":
                    link.owner = Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "state":
                    link.state = LinkState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "title":
                    link.title = jsonParser.getValueAsString();
                    return true;
                case "channel":
                    link.channel = LinkChannel.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Link link, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "resources":
                case "intent":
                    return true;
                case "id":
                    return false;
                case "href":
                case "owner":
                case "state":
                case "title":
                case "channel":
                    return true;
                default:
                    return super.parseFieldCheck(link, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Link link, JsonGenerator jsonGenerator) throws IOException {
            String str = link.f38765id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (link.intent != null) {
                jsonGenerator.writeFieldName("intent");
                LinkIntent.JSON_ADAPTER.serialize(link.intent, jsonGenerator, true);
            }
            if (link.channel != null) {
                jsonGenerator.writeFieldName("channel");
                LinkChannel.JSON_ADAPTER.serialize(link.channel, jsonGenerator, true);
            }
            if (link.resources != null) {
                jsonGenerator.writeFieldName("resources");
                JsonAdapter.serializeArray(link.resources, jsonGenerator, IdBoxed.JSON_ADAPTER);
            }
            String str2 = link.href;
            if (str2 != null) {
                jsonGenerator.writeStringField("href", str2);
            }
            if (link.state != null) {
                jsonGenerator.writeFieldName("state");
                LinkState.JSON_ADAPTER.serialize(link.state, jsonGenerator, true);
            }
            String str3 = link.title;
            if (str3 != null) {
                jsonGenerator.writeStringField("title", str3);
            }
            if (link.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                Converter.USER_ID.serialize(link.owner, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Link) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Link) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Link new_() {
        Link link = new Link();
        link.nullCheck();
        return link;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Link mo223809clone() {
        Link link = new Link();
        link.f38765id = this.f38765id;
        link.intent = this.intent;
        link.channel = this.channel;
        List<IdBoxed> list = this.resources;
        if (list != null) {
            link.resources = ValueObject.util_map(list, new w9j() { // from class: l.nmr
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IdBoxed) obj).mo223809clone();
                }
            });
        }
        link.href = this.href;
        link.state = this.state;
        link.title = this.title;
        link.owner = this.owner;
        return link;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Link)) {
            return false;
        }
        Link link = (Link) obj;
        return ValueObject.util_equals(this.f38765id, link.f38765id) && ValueObject.util_equals(this.intent, link.intent) && ValueObject.util_equals(this.channel, link.channel) && ValueObject.util_equals(this.resources, link.resources) && ValueObject.util_equals(this.href, link.href) && ValueObject.util_equals(this.state, link.state) && ValueObject.util_equals(this.title, link.title) && ValueObject.util_equals(this.owner, link.owner);
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
        String str = this.f38765id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        LinkIntent linkIntent = this.intent;
        int iHashCode2 = (iHashCode + (linkIntent != null ? linkIntent.hashCode() : 0)) * 41;
        LinkChannel linkChannel = this.channel;
        int iHashCode3 = (iHashCode2 + (linkChannel != null ? linkChannel.hashCode() : 0)) * 41;
        List<IdBoxed> list = this.resources;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.href;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        LinkState linkState = this.state;
        int iHashCode6 = (iHashCode5 + (linkState != null ? linkState.hashCode() : 0)) * 41;
        String str3 = this.title;
        int iHashCode7 = (iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.owner;
        int iHashCode8 = iHashCode7 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38765id == null) {
            this.f38765id = "";
        }
        if (this.intent == null) {
            this.intent = (LinkIntent) LinkIntent.JSON_ADAPTER.defaultEnum();
        }
        if (this.channel == null) {
            this.channel = (LinkChannel) LinkChannel.JSON_ADAPTER.defaultEnum();
        }
        if (this.resources == null) {
            this.resources = new ArrayList();
        }
        if (this.href == null) {
            this.href = "";
        }
        if (this.state == null) {
            this.state = (LinkState) LinkState.JSON_ADAPTER.defaultEnum();
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.owner == null) {
            this.owner = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
