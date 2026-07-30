package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class w4v0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final w4v0 f187442a = new w4v0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f187443b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f187444c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f187445d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("identifyLanguageConfidenceThreshold");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f187443b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("identifyAllLanguagesConfidenceThreshold");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f187444c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("confidenceThreshold");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f187445d = builder3.withProperty(hlr0Var3.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f187443b, (Object) null);
        objectEncoderContext2.add(f187444c, (Object) null);
        objectEncoderContext2.add(f187445d, ((lsx0) obj).m155736a());
    }
}
