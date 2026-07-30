package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class mnw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final mnw0 f134801a = new mnw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f134802b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f134803c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f134804d;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(IjkMediaMeta.IJKM_KEY_LANGUAGE);
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f134802b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("durationMs");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f134803c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f134804d = builder3.withProperty(bcr0Var3.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
