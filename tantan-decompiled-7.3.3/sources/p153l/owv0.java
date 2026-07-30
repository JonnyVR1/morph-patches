package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.p051p1.mobile.putong.core.data.Options;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class owv0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final owv0 f149578a = new owv0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f149579b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f149580c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f149581d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f149582e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f149579b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(Options.TYPE);
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f149580c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("identifyLanguageResult");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f149581d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("identifyPossibleLanguagesResult");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f149582e = builder4.withProperty(hlr0Var4.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        tzx0 tzx0Var = (tzx0) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f149579b, tzx0Var.m193747a());
        objectEncoderContext2.add(f149580c, tzx0Var.m193748b());
        objectEncoderContext2.add(f149581d, tzx0Var.m193749c());
        objectEncoderContext2.add(f149582e, tzx0Var.m193750d());
    }
}
