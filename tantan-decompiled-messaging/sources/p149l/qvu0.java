package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class qvu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final qvu0 f156629a = new qvu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f156630b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f156631c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f156632d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("identifyLanguageConfidenceThreshold");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f156630b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("identifyAllLanguagesConfidenceThreshold");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f156631c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("confidenceThreshold");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f156632d = builder3.withProperty(bcr0Var3.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f156630b, (Object) null);
        objectEncoderContext2.add(f156631c, (Object) null);
        objectEncoderContext2.add(f156632d, ((fjx0) obj).m121841a());
    }
}
