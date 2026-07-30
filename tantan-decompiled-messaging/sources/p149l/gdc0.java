package p149l;

import androidx.datastore.preferences.protobuf.InterfaceC0321b0;
import androidx.datastore.preferences.protobuf.ProtoSyntax;

/* JADX INFO: loaded from: classes.dex */
public final class gdc0 implements f5z {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0321b0 f102103a;

    /* JADX INFO: renamed from: b */
    public final String f102104b;

    /* JADX INFO: renamed from: c */
    public final Object[] f102105c;

    /* JADX INFO: renamed from: d */
    public final int f102106d;

    public gdc0(InterfaceC0321b0 interfaceC0321b0, String str, Object[] objArr) {
        this.f102103a = interfaceC0321b0;
        this.f102104b = str;
        this.f102105c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f102106d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f102106d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // p149l.f5z
    /* JADX INFO: renamed from: a */
    public boolean mo119572a() {
        return (this.f102106d & 2) == 2;
    }

    @Override // p149l.f5z
    /* JADX INFO: renamed from: b */
    public InterfaceC0321b0 mo119573b() {
        return this.f102103a;
    }

    @Override // p149l.f5z
    /* JADX INFO: renamed from: c */
    public ProtoSyntax mo119574c() {
        return (this.f102106d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    /* JADX INFO: renamed from: d */
    public Object[] m125545d() {
        return this.f102105c;
    }

    /* JADX INFO: renamed from: e */
    public String m125546e() {
        return this.f102104b;
    }
}
