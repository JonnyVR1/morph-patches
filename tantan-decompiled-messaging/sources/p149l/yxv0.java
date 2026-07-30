package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class yxv0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final yxv0 f200667a = new yxv0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f200668b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f200669c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f200670d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f200671e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f200672f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f200673g;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f200668b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("imageInfo");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f200669c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("detectorOptions");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f200670d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("loadDurationMs");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f200671e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("sessionDurationMs");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f200672f = builder5.withProperty(bcr0Var5.m101121b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("sessionTotalInferenceDurationMs");
        bcr0 bcr0Var6 = new bcr0();
        bcr0Var6.m101120a(6);
        f200673g = builder6.withProperty(bcr0Var6.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
