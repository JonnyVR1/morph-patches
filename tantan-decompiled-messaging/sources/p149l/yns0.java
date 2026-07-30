package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class yns0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final yns0 f199210a = new yns0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f199211b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f199212c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f199213d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f199214e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f199215f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f199216g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f199217h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("durationMs");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f199211b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("handledErrors");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f199212c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("partiallyHandledErrors");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f199213d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("unhandledErrors");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f199214e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("modelNamespace");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f199215f = builder5.withProperty(bcr0Var5.m101121b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("delegateFilter");
        bcr0 bcr0Var6 = new bcr0();
        bcr0Var6.m101120a(6);
        f199216g = builder6.withProperty(bcr0Var6.m101121b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("httpResponseCode");
        bcr0 bcr0Var7 = new bcr0();
        bcr0Var7.m101120a(7);
        f199217h = builder7.withProperty(bcr0Var7.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
