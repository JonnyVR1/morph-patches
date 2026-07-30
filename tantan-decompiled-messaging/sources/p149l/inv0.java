package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.p046p1.mobile.putong.core.data.Options;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class inv0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final inv0 f114053a = new inv0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f114054b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f114055c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f114056d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f114057e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f114054b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(Options.TYPE);
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f114055c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("identifyLanguageResult");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f114056d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("identifyPossibleLanguagesResult");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f114057e = builder4.withProperty(bcr0Var4.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        nqx0 nqx0Var = (nqx0) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f114054b, nqx0Var.m160703a());
        objectEncoderContext2.add(f114055c, nqx0Var.m160704b());
        objectEncoderContext2.add(f114056d, nqx0Var.m160705c());
        objectEncoderContext2.add(f114057e, nqx0Var.m160706d());
    }
}
