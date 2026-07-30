package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface MessageLite extends MessageLiteOrBuilder {

    public interface Builder extends Cloneable, MessageLiteOrBuilder {
        MessageLite build();

        /* JADX INFO: renamed from: i */
        Builder mo91350i(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;
    }

    Parser<? extends MessageLite> getParserForType();

    int getSerializedSize();

    Builder newBuilderForType();

    Builder toBuilder();

    void writeTo(CodedOutputStream codedOutputStream) throws IOException;
}
