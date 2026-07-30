package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.p051p1.mobile.putong.core.data.Options;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class i4t0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final i4t0 f112941a = new i4t0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f112942b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f112943c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f112944d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f112945e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f112946f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f112947g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f112948h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("errorCode");
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f112942b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("hasResult");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f112943c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("isColdCall");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f112944d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("imageInfo");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f112945e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder(Options.TYPE);
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f112946f = builder5.withProperty(hlr0Var5.m135771b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("detectedBarcodeFormats");
        hlr0 hlr0Var6 = new hlr0();
        hlr0Var6.m135770a(6);
        f112947g = builder6.withProperty(hlr0Var6.m135771b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("detectedBarcodeValueTypes");
        hlr0 hlr0Var7 = new hlr0();
        hlr0Var7.m135770a(7);
        f112948h = builder7.withProperty(hlr0Var7.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
