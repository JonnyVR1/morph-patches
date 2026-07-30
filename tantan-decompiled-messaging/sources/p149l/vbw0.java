package p149l;

import androidx.core.app.NotificationCompat;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.p046p1.mobile.putong.core.data.Options;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class vbw0 implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public static final vbw0 f180887a = new vbw0();

    /* JADX INFO: renamed from: b */
    public static final FieldDescriptor f180888b;

    /* JADX INFO: renamed from: c */
    public static final FieldDescriptor f180889c;

    /* JADX INFO: renamed from: d */
    public static final FieldDescriptor f180890d;

    /* JADX INFO: renamed from: e */
    public static final FieldDescriptor f180891e;

    /* JADX INFO: renamed from: f */
    public static final FieldDescriptor f180892f;

    /* JADX INFO: renamed from: g */
    public static final FieldDescriptor f180893g;

    /* JADX INFO: renamed from: h */
    public static final FieldDescriptor f180894h;

    /* JADX INFO: renamed from: i */
    public static final FieldDescriptor f180895i;

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("inferenceCommonLogEvent");
        bcr0 bcr0Var = new bcr0();
        bcr0Var.m101120a(1);
        f180888b = builder.withProperty(bcr0Var.m101121b()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder(Options.TYPE);
        bcr0 bcr0Var2 = new bcr0();
        bcr0Var2.m101120a(2);
        f180889c = builder2.withProperty(bcr0Var2.m101121b()).build();
        FieldDescriptor.Builder builder3 = FieldDescriptor.builder("inputLength");
        bcr0 bcr0Var3 = new bcr0();
        bcr0Var3.m101120a(3);
        f180890d = builder3.withProperty(bcr0Var3.m101121b()).build();
        FieldDescriptor.Builder builder4 = FieldDescriptor.builder("outputLength");
        bcr0 bcr0Var4 = new bcr0();
        bcr0Var4.m101120a(4);
        f180891e = builder4.withProperty(bcr0Var4.m101121b()).build();
        FieldDescriptor.Builder builder5 = FieldDescriptor.builder("loadDictionaryErrorCode");
        bcr0 bcr0Var5 = new bcr0();
        bcr0Var5.m101120a(5);
        f180892f = builder5.withProperty(bcr0Var5.m101121b()).build();
        FieldDescriptor.Builder builder6 = FieldDescriptor.builder("translateResultStatusCode");
        bcr0 bcr0Var6 = new bcr0();
        bcr0Var6.m101120a(6);
        f180893g = builder6.withProperty(bcr0Var6.m101121b()).build();
        FieldDescriptor.Builder builder7 = FieldDescriptor.builder(NotificationCompat.CATEGORY_STATUS);
        bcr0 bcr0Var7 = new bcr0();
        bcr0Var7.m101120a(7);
        f180894h = builder7.withProperty(bcr0Var7.m101121b()).build();
        FieldDescriptor.Builder builder8 = FieldDescriptor.builder("downloadHttpResponseCode");
        bcr0 bcr0Var8 = new bcr0();
        bcr0Var8.m101120a(8);
        f180895i = builder8.withProperty(bcr0Var8.m101121b()).build();
    }

    @Override // com.google.firebase.encoders.Encoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw null;
    }
}
