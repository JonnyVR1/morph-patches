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
import p153l.vtq0;
import p153l.wg3;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneratedMessageLite extends AbstractMessageLite implements Serializable {

    public static abstract class Builder<MessageType extends GeneratedMessageLite, BuilderType extends Builder> extends AbstractMessageLite.Builder<BuilderType> {

        /* JADX INFO: renamed from: a */
        public ByteString f66324a = ByteString.f66289a;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: d */
        public BuilderType mo91414m() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* JADX INFO: renamed from: e */
        public final ByteString m92223e() {
            return this.f66324a;
        }

        /* JADX INFO: renamed from: f */
        public abstract BuilderType mo91349f(MessageType messagetype);

        /* JADX INFO: renamed from: j */
        public final BuilderType m92224j(ByteString byteString) {
            this.f66324a = byteString;
            return this;
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType> {

        /* JADX INFO: renamed from: b */
        public FieldSet<C15395b> f66325b = FieldSet.m92197g();

        /* JADX INFO: renamed from: c */
        public boolean f66326c;

        /* JADX INFO: renamed from: l */
        public final FieldSet<C15395b> m92226l() {
            this.f66325b.m92216q();
            this.f66326c = false;
            return this.f66325b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
        /* JADX INFO: renamed from: m */
        public BuilderType mo91414m() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* JADX INFO: renamed from: n */
        public final void m92227n() {
            if (this.f66326c) {
                return;
            }
            this.f66325b = this.f66325b.clone();
            this.f66326c = true;
        }

        /* JADX INFO: renamed from: o */
        public final void m92228o(MessageType messagetype) {
            m92227n();
            this.f66325b.m92217r(((ExtendableMessage) messagetype).extensions);
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage> extends MessageLiteOrBuilder {
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> {

        /* JADX INFO: renamed from: a */
        public final ContainingType f66331a;

        /* JADX INFO: renamed from: b */
        public final Type f66332b;

        /* JADX INFO: renamed from: c */
        public final MessageLite f66333c;

        /* JADX INFO: renamed from: d */
        public final C15395b f66334d;

        /* JADX INFO: renamed from: e */
        public final Class f66335e;

        /* JADX INFO: renamed from: f */
        public final Method f66336f;

        public GeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, C15395b c15395b, Class cls) {
            if (containingtype == null) {
                wg3.m206174a("Null containingTypeDefaultInstance");
                throw null;
            }
            if (c15395b.mo92220D() == WireFormat.FieldType.MESSAGE && messageLite == null) {
                wg3.m206174a("Null messageDefaultInstance");
                throw null;
            }
            this.f66331a = containingtype;
            this.f66332b = type;
            this.f66333c = messageLite;
            this.f66334d = c15395b;
            this.f66335e = cls;
            if (Internal.EnumLite.class.isAssignableFrom(cls)) {
                this.f66336f = GeneratedMessageLite.getMethodOrDie(cls, "valueOf", Integer.TYPE);
            } else {
                this.f66336f = null;
            }
        }

        /* JADX INFO: renamed from: a */
        public Object m92230a(Object obj) {
            if (!this.f66334d.isRepeated()) {
                return m92234e(obj);
            }
            if (this.f66334d.mo92221E() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(m92234e(it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: b */
        public ContainingType m92231b() {
            return this.f66331a;
        }

        /* JADX INFO: renamed from: c */
        public MessageLite m92232c() {
            return this.f66333c;
        }

        /* JADX INFO: renamed from: d */
        public int m92233d() {
            return this.f66334d.getNumber();
        }

        /* JADX INFO: renamed from: e */
        public Object m92234e(Object obj) {
            return this.f66334d.mo92221E() == WireFormat.JavaType.ENUM ? GeneratedMessageLite.invokeOrDie(this.f66336f, null, (Integer) obj) : obj;
        }

        /* JADX INFO: renamed from: f */
        public Object m92235f(Object obj) {
            return this.f66334d.mo92221E() == WireFormat.JavaType.ENUM ? Integer.valueOf(((Internal.EnumLite) obj).getNumber()) : obj;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$a */
    public static /* synthetic */ class C15394a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66337a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f66337a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66337a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$b */
    public static final class C15395b implements FieldSet.FieldDescriptorLite<C15395b> {

        /* JADX INFO: renamed from: a */
        public final Internal.EnumLiteMap<?> f66338a;

        /* JADX INFO: renamed from: b */
        public final int f66339b;

        /* JADX INFO: renamed from: c */
        public final WireFormat.FieldType f66340c;

        /* JADX INFO: renamed from: d */
        public final boolean f66341d;

        /* JADX INFO: renamed from: e */
        public final boolean f66342e;

        public C15395b(Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.f66338a = enumLiteMap;
            this.f66339b = i;
            this.f66340c = fieldType;
            this.f66341d = z;
            this.f66342e = z2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        /* JADX INFO: renamed from: D */
        public WireFormat.FieldType mo92220D() {
            return this.f66340c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        /* JADX INFO: renamed from: E */
        public WireFormat.JavaType mo92221E() {
            return this.f66340c.getJavaType();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C15395b c15395b) {
            return this.f66339b - c15395b.f66339b;
        }

        /* JADX INFO: renamed from: b */
        public Internal.EnumLiteMap<?> m92237b() {
            return this.f66338a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
            return this.f66339b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
            return this.f66342e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
            return this.f66341d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        /* JADX INFO: renamed from: l */
        public MessageLite.Builder mo92222l(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mo91349f((GeneratedMessageLite) messageLite);
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
            vtq0.m202761a("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            vtq0.m202761a("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new GeneratedExtension<>(containingtype, Collections.EMPTY_LIST, messageLite, new C15395b(enumLiteMap, i, fieldType, true, z), cls);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type, messageLite, new C15395b(enumLiteMap, i, fieldType, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:4:0x0010  */
    public static <MessageType extends MessageLite> boolean parseUnknownField(FieldSet<C15395b> fieldSet, MessageType messagetype, CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
        boolean z;
        boolean z2;
        Object objBuild;
        MessageLite messageLite;
        int iM92262b = WireFormat.m92262b(i);
        GeneratedExtension generatedExtensionM92193b = extensionRegistryLite.m92193b(messagetype, WireFormat.m92261a(i));
        if (generatedExtensionM92193b == null) {
            z2 = true;
            z = false;
        } else if (iM92262b == FieldSet.m92198l(generatedExtensionM92193b.f66334d.mo92220D(), false)) {
            z2 = false;
            z = false;
        } else {
            C15395b c15395b = generatedExtensionM92193b.f66334d;
            if (c15395b.f66341d && c15395b.f66340c.isPackable() && iM92262b == FieldSet.m92198l(generatedExtensionM92193b.f66334d.mo92220D(), true)) {
                z = true;
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
        }
        if (z2) {
            return codedInputStream.m92081P(i, codedOutputStream);
        }
        if (z) {
            int iM92091j = codedInputStream.m92091j(codedInputStream.m92067A());
            if (generatedExtensionM92193b.f66334d.mo92220D() == WireFormat.FieldType.ENUM) {
                while (codedInputStream.m92088e() > 0) {
                    Internal.EnumLite enumLiteFindValueByNumber = generatedExtensionM92193b.f66334d.m92237b().findValueByNumber(codedInputStream.m92095n());
                    if (enumLiteFindValueByNumber == null) {
                        return true;
                    }
                    fieldSet.m92205a(generatedExtensionM92193b.f66334d, generatedExtensionM92193b.m92235f(enumLiteFindValueByNumber));
                }
            } else {
                while (codedInputStream.m92088e() > 0) {
                    fieldSet.m92205a(generatedExtensionM92193b.f66334d, FieldSet.m92200u(codedInputStream, generatedExtensionM92193b.f66334d.mo92220D(), false));
                }
            }
            codedInputStream.m92090i(iM92091j);
        } else {
            int i2 = C15394a.f66337a[generatedExtensionM92193b.f66334d.mo92221E().ordinal()];
            if (i2 == 1) {
                MessageLite.Builder builder = (generatedExtensionM92193b.f66334d.isRepeated() || (messageLite = (MessageLite) fieldSet.m92208h(generatedExtensionM92193b.f66334d)) == null) ? null : messageLite.toBuilder();
                if (builder == null) {
                    builder = generatedExtensionM92193b.m92232c().newBuilderForType();
                }
                if (generatedExtensionM92193b.f66334d.mo92220D() == WireFormat.FieldType.GROUP) {
                    codedInputStream.m92099r(generatedExtensionM92193b.m92233d(), builder, extensionRegistryLite);
                } else {
                    codedInputStream.m92103v(builder, extensionRegistryLite);
                }
                objBuild = builder.build();
            } else if (i2 != 2) {
                objBuild = FieldSet.m92200u(codedInputStream, generatedExtensionM92193b.f66334d.mo92220D(), false);
            } else {
                int iM92095n = codedInputStream.m92095n();
                Internal.EnumLite enumLiteFindValueByNumber2 = generatedExtensionM92193b.f66334d.m92237b().findValueByNumber(iM92095n);
                if (enumLiteFindValueByNumber2 == null) {
                    codedOutputStream.m92182s0(i);
                    codedOutputStream.m92147C0(iM92095n);
                    return true;
                }
                objBuild = enumLiteFindValueByNumber2;
            }
            boolean zIsRepeated = generatedExtensionM92193b.f66334d.isRepeated();
            C15395b c15395b2 = generatedExtensionM92193b.f66334d;
            if (zIsRepeated) {
                fieldSet.m92205a(c15395b2, generatedExtensionM92193b.m92235f(objBuild));
            } else {
                fieldSet.m92219v(c15395b2, generatedExtensionM92193b.m92235f(objBuild));
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
        private final FieldSet<C15395b> extensions;

        public ExtendableMessage() {
            this.extensions = FieldSet.m92199t();
        }

        private void verifyExtensionContainingType(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.m92231b() == getDefaultInstanceForType()) {
                return;
            }
            wg3.m206174a("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.m92213n();
        }

        public int extensionsSerializedSize() {
            return this.extensions.m92211k();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public abstract /* synthetic */ MessageLite getDefaultInstanceForType();

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type getExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            Object objM92208h = this.extensions.m92208h(generatedExtension.f66334d);
            return objM92208h == null ? generatedExtension.f66332b : (Type) generatedExtension.m92230a(objM92208h);
        }

        public final <Type> int getExtensionCount(GeneratedExtension<MessageType, List<Type>> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            return this.extensions.m92210j(generatedExtension.f66334d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public abstract /* synthetic */ int getSerializedSize();

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean hasExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            return this.extensions.m92212m(generatedExtension.f66334d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public abstract /* synthetic */ boolean isInitialized();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public void makeExtensionsImmutable() {
            this.extensions.m92216q();
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
            this.extensions = extendableBuilder.m92226l();
        }

        public final <Type> Type getExtension(GeneratedExtension<MessageType, List<Type>> generatedExtension, int i) {
            verifyExtensionContainingType(generatedExtension);
            return (Type) generatedExtension.m92234e(this.extensions.m92209i(generatedExtension.f66334d, i));
        }

        public class ExtensionWriter {

            /* JADX INFO: renamed from: a */
            public final Iterator<Map.Entry<C15395b, Object>> f66327a;

            /* JADX INFO: renamed from: b */
            public Map.Entry<C15395b, Object> f66328b;

            /* JADX INFO: renamed from: c */
            public final boolean f66329c;

            public ExtensionWriter(boolean z) {
                Iterator<Map.Entry<C15395b, Object>> itM92215p = ExtendableMessage.this.extensions.m92215p();
                this.f66327a = itM92215p;
                if (itM92215p.hasNext()) {
                    this.f66328b = itM92215p.next();
                }
                this.f66329c = z;
            }

            /* JADX INFO: renamed from: a */
            public void m92229a(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<C15395b, Object> entry = this.f66328b;
                    if (entry == null || entry.getKey().getNumber() >= i) {
                        return;
                    }
                    C15395b key = this.f66328b.getKey();
                    if (this.f66329c && key.mo92221E() == WireFormat.JavaType.MESSAGE && !key.isRepeated()) {
                        codedOutputStream.m92173j0(key.getNumber(), (MessageLite) this.f66328b.getValue());
                    } else {
                        FieldSet.m92204z(key, this.f66328b.getValue(), codedOutputStream);
                    }
                    if (this.f66327a.hasNext()) {
                        this.f66328b = this.f66327a.next();
                    } else {
                        this.f66328b = null;
                    }
                }
            }

            public /* synthetic */ ExtensionWriter(ExtendableMessage extendableMessage, boolean z, C15394a c15394a) {
                this(z);
            }
        }
    }

    public boolean parseUnknownField(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
        return codedInputStream.m92081P(i, codedOutputStream);
    }
}
