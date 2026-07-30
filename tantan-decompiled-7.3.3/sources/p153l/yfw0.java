package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class yfw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final yfw0 f199675a = new yfw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f199676b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f199677c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f199678d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f199679e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f199680f;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f199676b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("smartReplies");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f199677c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("resultStatus");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f199678d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("suggestionsCount");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f199679e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("blacklistErrorCode");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f199680f = builder5.withProperty(hlr0Var5.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
