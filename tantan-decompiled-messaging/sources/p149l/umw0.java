package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class umw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final umw0 f177316a = new umw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f177317b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f177318c;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(IjkMediaMeta.IJKM_KEY_LANGUAGE);
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f177317b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("inferenceCommonLogEvent");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f177318c = builder2.withProperty(bcr0Var2.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
