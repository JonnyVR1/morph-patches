package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.ig3;
import p149l.pkq0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneratedMessageLite extends AbstractMessageLite implements Serializable {

    public static abstract class Builder<MessageType extends GeneratedMessageLite, BuilderType extends Builder> extends AbstractMessageLite.Builder<BuilderType> {

        /* JADX INFO: renamed from: a */
        public ByteString f65650a = ByteString.f65615a;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: d */
        public BuilderType mo90523m() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* JADX INFO: renamed from: e */
        public final ByteString m91332e() {
            return this.f65650a;
        }

        /* JADX INFO: renamed from: f */
        public abstract BuilderType mo90458f(MessageType messagetype);

        /* JADX INFO: renamed from: j */
        public final BuilderType m91333j(ByteString byteString) {
            this.f65650a = byteString;
            return this;
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType> {

        /* JADX INFO: renamed from: b */
        public FieldSet<C15288b> f65651b = FieldSet.m91306g();

        /* JADX INFO: renamed from: c */
        public boolean f65652c;

        /* JADX INFO: renamed from: l */
        public final FieldSet<C15288b> m91335l() {
            this.f65651b.m91325q();
            this.f65652c = false;
            return this.f65651b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
        /* JADX INFO: renamed from: m */
        public BuilderType mo90523m() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* JADX INFO: renamed from: n */
        public final void m91336n() {
            if (this.f65652c) {
                return;
            }
            this.f65651b = this.f65651b.clone();
            this.f65652c = true;
        }

        /* JADX INFO: renamed from: o */
        public final void m91337o(MessageType messagetype) {
            m91336n();
            this.f65651b.m91326r(((ExtendableMessage) messagetype).extensions);
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage> extends MessageLiteOrBuilder {
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> {

        /* JADX INFO: renamed from: a */
        public final ContainingType f65657a;

        /* JADX INFO: renamed from: b */
        public final Type f65658b;

        /* JADX INFO: renamed from: c */
        public final MessageLite f65659c;

        /* JADX INFO: renamed from: d */
        public final C15288b f65660d;

        /* JADX INFO: renamed from: e */
        public final Class f65661e;

        /* JADX INFO: renamed from: f */
        public final Method f65662f;

        public GeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, C15288b c15288b, Class cls) {
            if (containingtype == null) {
                ig3.m135964a("Null containingTypeDefaultInstance");
                throw null;
            }
            if (c15288b.mo91329D() == WireFormat.FieldType.MESSAGE && messageLite == null) {
                ig3.m135964a("Null messageDefaultInstance");
                throw null;
            }
            this.f65657a = containingtype;
            this.f65658b = type;
            this.f65659c = messageLite;
            this.f65660d = c15288b;
            this.f65661e = cls;
            if (Internal.EnumLite.class.isAssignableFrom(cls)) {
                this.f65662f = GeneratedMessageLite.getMethodOrDie(cls, "valueOf", Integer.TYPE);
            } else {
                this.f65662f = null;
            }
        }

        /* JADX INFO: renamed from: a */
        public Object m91339a(Object obj) {
            if (!this.f65660d.isRepeated()) {
                return m91343e(obj);
            }
            if (this.f65660d.mo91330E() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(m91343e(it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: b */
        public ContainingType m91340b() {
            return this.f65657a;
        }

        /* JADX INFO: renamed from: c */
        public MessageLite m91341c() {
            return this.f65659c;
        }

        /* JADX INFO: renamed from: d */
        public int m91342d() {
            return this.f65660d.getNumber();
        }

        /* JADX INFO: renamed from: e */
        public Object m91343e(Object obj) {
            return this.f65660d.mo91330E() == WireFormat.JavaType.ENUM ? GeneratedMessageLite.invokeOrDie(this.f65662f, null, (Integer) obj) : obj;
        }

        /* JADX INFO: renamed from: f */
        public Object m91344f(Object obj) {
            return this.f65660d.mo91330E() == WireFormat.JavaType.ENUM ? Integer.valueOf(((Internal.EnumLite) obj).getNumber()) : obj;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$a */
    public static /* synthetic */ class C15287a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65663a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f65663a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65663a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$b */
    public static final class C15288b implements FieldSet.FieldDescriptorLite<C15288b> {

        /* JADX INFO: renamed from: a */
        public final Internal.EnumLiteMap<?> f65664a;

        /* JADX INFO: renamed from: b */
        public final int f65665b;

        /* JADX INFO: renamed from: c */
        public final WireFormat.FieldType f65666c;

        /* JADX INFO: renamed from: d */
        public final boolean f65667d;

        /* JADX INFO: renamed from: e */
        public final boolean f65668e;

        public C15288b(Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.f65664a = enumLiteMap;
            this.f65665b = i;
            this.f65666c = fieldType;
            this.f65667d = z;
            this.f65668e = z2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        /* JADX INFO: renamed from: D */
        public WireFormat.FieldType mo91329D() {
            return this.f65666c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        /* JADX INFO: renamed from: E */
        public WireFormat.JavaType mo91330E() {
            return this.f65666c.getJavaType();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C15288b c15288b) {
            return this.f65665b - c15288b.f65665b;
        }

        /* JADX INFO: renamed from: b */
        public Internal.EnumLiteMap<?> m91346b() {
            return this.f65664a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
            return this.f65665b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
            return this.f65668e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
            return this.f65667d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        /* JADX INFO: renamed from: l */
        public MessageLite.Builder mo91331l(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mo90458f((GeneratedMessageLite) messageLite);
        }
    }

    public GeneratedMessageLite() {
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb = new StringBuilder(name.length() + 45 + strValueOf.length());
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(strValueOf);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            pkq0.m170054a("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            pkq0.m170054a("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new GeneratedExtension<>(containingtype, Collections.EMPTY_LIST, messageLite, new C15288b(enumLiteMap, i, fieldType, true, z), cls);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type, messageLite, new C15288b(enumLiteMap, i, fieldType, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:4:0x0010  */
    public static <MessageType extends MessageLite> boolean parseUnknownField(FieldSet<C15288b> fieldSet, MessageType messagetype, CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
        boolean z;
        boolean z2;
        Object objBuild;
        MessageLite messageLite;
        int iM91371b = WireFormat.m91371b(i);
        GeneratedExtension generatedExtensionM91302b = extensionRegistryLite.m91302b(messagetype, WireFormat.m91370a(i));
        if (generatedExtensionM91302b == null) {
            z2 = true;
            z = false;
        } else if (iM91371b == FieldSet.m91307l(generatedExtensionM91302b.f65660d.mo91329D(), false)) {
            z2 = false;
            z = false;
        } else {
            C15288b c15288b = generatedExtensionM91302b.f65660d;
            if (c15288b.f65667d && c15288b.f65666c.isPackable() && iM91371b == FieldSet.m91307l(generatedExtensionM91302b.f65660d.mo91329D(), true)) {
                z = true;
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
        }
        if (z2) {
            return codedInputStream.m91190P(i, codedOutputStream);
        }
        if (z) {
            int iM91200j = codedInputStream.m91200j(codedInputStream.m91176A());
            if (generatedExtensionM91302b.f65660d.mo91329D() == WireFormat.FieldType.ENUM) {
                while (codedInputStream.m91197e() > 0) {
                    Internal.EnumLite enumLiteFindValueByNumber = generatedExtensionM91302b.f65660d.m91346b().findValueByNumber(codedInputStream.m91204n());
                    if (enumLiteFindValueByNumber == null) {
                        return true;
                    }
                    fieldSet.m91314a(generatedExtensionM91302b.f65660d, generatedExtensionM91302b.m91344f(enumLiteFindValueByNumber));
                }
            } else {
                while (codedInputStream.m91197e() > 0) {
                    fieldSet.m91314a(generatedExtensionM91302b.f65660d, FieldSet.m91309u(codedInputStream, generatedExtensionM91302b.f65660d.mo91329D(), false));
                }
            }
            codedInputStream.m91199i(iM91200j);
        } else {
            int i2 = C15287a.f65663a[generatedExtensionM91302b.f65660d.mo91330E().ordinal()];
            if (i2 == 1) {
                MessageLite.Builder builder = (generatedExtensionM91302b.f65660d.isRepeated() || (messageLite = (MessageLite) fieldSet.m91317h(generatedExtensionM91302b.f65660d)) == null) ? null : messageLite.toBuilder();
                if (builder == null) {
                    builder = generatedExtensionM91302b.m91341c().newBuilderForType();
                }
                if (generatedExtensionM91302b.f65660d.mo91329D() == WireFormat.FieldType.GROUP) {
                    codedInputStream.m91208r(generatedExtensionM91302b.m91342d(), builder, extensionRegistryLite);
                } else {
                    codedInputStream.m91212v(builder, extensionRegistryLite);
                }
                objBuild = builder.build();
            } else if (i2 != 2) {
                objBuild = FieldSet.m91309u(codedInputStream, generatedExtensionM91302b.f65660d.mo91329D(), false);
            } else {
                int iM91204n = codedInputStream.m91204n();
                Internal.EnumLite enumLiteFindValueByNumber2 = generatedExtensionM91302b.f65660d.m91346b().findValueByNumber(iM91204n);
                if (enumLiteFindValueByNumber2 == null) {
                    codedOutputStream.m91291s0(i);
                    codedOutputStream.m91256C0(iM91204n);
                    return true;
                }
                objBuild = enumLiteFindValueByNumber2;
            }
            boolean zIsRepeated = generatedExtensionM91302b.f65660d.isRepeated();
            C15288b c15288b2 = generatedExtensionM91302b.f65660d;
            if (zIsRepeated) {
                fieldSet.m91314a(c15288b2, generatedExtensionM91302b.m91344f(objBuild));
            } else {
                fieldSet.m91328v(c15288b2, generatedExtensionM91302b.m91344f(objBuild));
            }
        }
        return true;
    }

    public abstract /* synthetic */ MessageLite getDefaultInstanceForType();

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public Parser<? extends MessageLite> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public abstract /* synthetic */ int getSerializedSize();

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
    public abstract /* synthetic */ boolean isInitialized();

    public void makeExtensionsImmutable() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public abstract /* synthetic */ MessageLite.Builder newBuilderForType();

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public abstract /* synthetic */ MessageLite.Builder toBuilder();

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public abstract /* synthetic */ void writeTo(CodedOutputStream codedOutputStream) throws IOException;

    public GeneratedMessageLite(Builder builder) {
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements ExtendableMessageOrBuilder<MessageType> {
        private final FieldSet<C15288b> extensions;

        public ExtendableMessage() {
            this.extensions = FieldSet.m91308t();
        }

        private void verifyExtensionContainingType(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.m91340b() == getDefaultInstanceForType()) {
                return;
            }
            ig3.m135964a("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.m91322n();
        }

        public int extensionsSerializedSize() {
            return this.extensions.m91320k();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public abstract /* synthetic */ MessageLite getDefaultInstanceForType();

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type getExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            Object objM91317h = this.extensions.m91317h(generatedExtension.f65660d);
            return objM91317h == null ? generatedExtension.f65658b : (Type) generatedExtension.m91339a(objM91317h);
        }

        public final <Type> int getExtensionCount(GeneratedExtension<MessageType, List<Type>> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            return this.extensions.m91319j(generatedExtension.f65660d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public abstract /* synthetic */ int getSerializedSize();

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean hasExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            return this.extensions.m91321m(generatedExtension.f65660d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public abstract /* synthetic */ boolean isInitialized();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public void makeExtensionsImmutable() {
            this.extensions.m91325q();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public abstract /* synthetic */ MessageLite.Builder newBuilderForType();

        public ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(this, false, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public boolean parseUnknownField(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            return GeneratedMessageLite.parseUnknownField(this.extensions, getDefaultInstanceForType(), codedInputStream, codedOutputStream, extensionRegistryLite, i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public abstract /* synthetic */ MessageLite.Builder toBuilder();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public abstract /* synthetic */ void writeTo(CodedOutputStream codedOutputStream) throws IOException;

        public ExtendableMessage(ExtendableBuilder<MessageType, ?> extendableBuilder) {
            this.extensions = extendableBuilder.m91335l();
        }

        public final <Type> Type getExtension(GeneratedExtension<MessageType, List<Type>> generatedExtension, int i) {
            verifyExtensionContainingType(generatedExtension);
            return (Type) generatedExtension.m91343e(this.extensions.m91318i(generatedExtension.f65660d, i));
        }

        public class ExtensionWriter {

            /* JADX INFO: renamed from: a */
            public final Iterator<Map.Entry<C15288b, Object>> f65653a;

            /* JADX INFO: renamed from: b */
            public Map.Entry<C15288b, Object> f65654b;

            /* JADX INFO: renamed from: c */
            public final boolean f65655c;

            public ExtensionWriter(boolean z) {
                Iterator<Map.Entry<C15288b, Object>> itM91324p = ExtendableMessage.this.extensions.m91324p();
                this.f65653a = itM91324p;
                if (itM91324p.hasNext()) {
                    this.f65654b = itM91324p.next();
                }
                this.f65655c = z;
            }

            /* JADX INFO: renamed from: a */
            public void m91338a(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<C15288b, Object> entry = this.f65654b;
                    if (entry == null || entry.getKey().getNumber() >= i) {
                        return;
                    }
                    C15288b key = this.f65654b.getKey();
                    if (this.f65655c && key.mo91330E() == WireFormat.JavaType.MESSAGE && !key.isRepeated()) {
                        codedOutputStream.m91282j0(key.getNumber(), (MessageLite) this.f65654b.getValue());
                    } else {
                        FieldSet.m91313z(key, this.f65654b.getValue(), codedOutputStream);
                    }
                    if (this.f65653a.hasNext()) {
                        this.f65654b = this.f65653a.next();
                    } else {
                        this.f65654b = null;
                    }
                }
            }

            public /* synthetic */ ExtensionWriter(ExtendableMessage extendableMessage, boolean z, C15287a c15287a) {
                this(z);
            }
        }
    }

    public boolean parseUnknownField(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
        return codedInputStream.m91190P(i, codedOutputStream);
    }
}
