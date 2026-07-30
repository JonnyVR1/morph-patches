package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class eew0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final eew0 f90788a = new eew0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f90789b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f90790c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f90791d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(AuthenticationTokenClaims.JSON_KEY_NAME);
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f90789b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("stages");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f90790c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("runMiniBenchmark");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f90791d = builder3.withProperty(bcr0Var3.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
