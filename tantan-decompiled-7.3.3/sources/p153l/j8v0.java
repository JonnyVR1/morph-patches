package p153l;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.p051p1.mobile.putong.core.data.Options;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class j8v0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final j8v0 f118820a = new j8v0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f118821b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f118822c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f118823d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f118824e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f118825f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f118826g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f118827h;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(Options.TYPE);
        hlr0 hlr0Var = new hlr0();
        hlr0Var.m135770a(1);
        f118821b = builder.withProperty(hlr0Var.m135771b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("roughDownloadDurationMs");
        hlr0 hlr0Var2 = new hlr0();
        hlr0Var2.m135770a(2);
        f118822c = builder2.withProperty(hlr0Var2.m135771b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("errorCode");
        hlr0 hlr0Var3 = new hlr0();
        hlr0Var3.m135770a(3);
        f118823d = builder3.withProperty(hlr0Var3.m135771b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("exactDownloadDurationMs");
        hlr0 hlr0Var4 = new hlr0();
        hlr0Var4.m135770a(4);
        f118824e = builder4.withProperty(hlr0Var4.m135771b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("downloadStatus");
        hlr0 hlr0Var5 = new hlr0();
        hlr0Var5.m135770a(5);
        f118825f = builder5.withProperty(hlr0Var5.m135771b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("downloadFailureStatus");
        hlr0 hlr0Var6 = new hlr0();
        hlr0Var6.m135770a(6);
        f118826g = builder6.withProperty(hlr0Var6.m135771b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder("mddDownloadErrorCodes");
        hlr0 hlr0Var7 = new hlr0();
        hlr0Var7.m135770a(7);
        f118827h = builder7.withProperty(hlr0Var7.m135771b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
