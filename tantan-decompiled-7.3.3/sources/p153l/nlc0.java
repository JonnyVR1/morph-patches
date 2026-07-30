package p153l;

import androidx.datastore.preferences.protobuf.InterfaceC0322b0;
import androidx.datastore.preferences.protobuf.ProtoSyntax;

/* JADX INFO: loaded from: classes.dex */
public final class nlc0 implements cez {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0322b0 f142525a;

    /* JADX INFO: renamed from: b */
    public final String f142526b;

    /* JADX INFO: renamed from: c */
    public final Object[] f142527c;

    /* JADX INFO: renamed from: d */
    public final int f142528d;

    public nlc0(InterfaceC0322b0 interfaceC0322b0, String str, Object[] objArr) {
        this.f142525a = interfaceC0322b0;
        this.f142526b = str;
        this.f142527c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f142528d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.f142528d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // p153l.cez
    /* JADX INFO: renamed from: a */
    public boolean mo103099a() {
        return (this.f142528d & 2) == 2;
    }

    @Override // p153l.cez
    /* JADX INFO: renamed from: b */
    public InterfaceC0322b0 mo103100b() {
        return this.f142525a;
    }

    @Override // p153l.cez
    /* JADX INFO: renamed from: c */
    public ProtoSyntax mo103101c() {
        return (this.f142528d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    /* JADX INFO: renamed from: d */
    public Object[] m163674d() {
        return this.f142527c;
    }

    /* JADX INFO: renamed from: e */
    public String m163675e() {
        return this.f142526b;
    }
}
