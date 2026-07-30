package p149l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.p046p1.mobile.putong.core.data.Options;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class dzu0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final dzu0 f88511a = new dzu0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f88512b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f88513c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f88514d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f88515e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f88516f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f88517g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f88518h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(Options.TYPE);
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f88512b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("roughDownloadDurationMs");
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f88513c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f88514d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("exactDownloadDurationMs");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f88515e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("downloadStatus");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f88516f = builder5.withProperty(bcr0Var5.m101121b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("downloadFailureStatus");
        bcr0 bcr0Var6 = new bcr0();
        bcr0Var6.m101120a(6);
        f88517g = builder6.withProperty(bcr0Var6.m101121b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("mddDownloadErrorCodes");
        bcr0 bcr0Var7 = new bcr0();
        bcr0Var7.m101120a(7);
        f88518h = builder7.withProperty(bcr0Var7.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
