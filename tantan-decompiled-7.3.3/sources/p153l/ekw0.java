package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ekw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final ekw0 f94456a = new ekw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f94457b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f94458c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f94459d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("languageOption");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(3);
        f94457b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("isUsingLegacyApi");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(4);
        f94458c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("sdkVersion");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(5);
        f94459d = builder3.withProperty(hlr0Var3.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
