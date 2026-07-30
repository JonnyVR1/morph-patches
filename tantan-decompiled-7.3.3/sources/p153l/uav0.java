package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class uav0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final uav0 f178235a = new uav0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f178236b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f178237c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f178238d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f178239e;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("modelInfo");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f178236b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("initialDownloadConditions");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f178237c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("updateDownloadConditions");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f178238d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("isModelUpdateEnabled");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f178239e = builder4.withProperty(hlr0Var4.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
