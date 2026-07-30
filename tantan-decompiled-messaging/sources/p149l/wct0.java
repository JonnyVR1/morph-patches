package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class wct0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final wct0 f185714a = new wct0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f185715b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f185716c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f185717d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("logEventKey");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f185715b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("eventCount");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f185716c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inferenceDurationStats");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f185717d = builder3.withProperty(bcr0Var3.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
