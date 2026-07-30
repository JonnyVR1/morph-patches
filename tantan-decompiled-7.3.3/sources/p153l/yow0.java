package p153l;

import com.tencent.liteav.TXLiteAVCode;

/* JADX INFO: loaded from: classes6.dex */
public final class yow0 extends bpw0 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ zow0 f201021g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yow0(zow0 zow0Var, dpw0 dpw0Var, CharSequence charSequence) {
        super(dpw0Var, charSequence);
        this.f201021g = zow0Var;
    }

    @Override // p153l.bpw0
    /* JADX INFO: renamed from: c */
    public final int mo105854c(int i) {
        CharSequence charSequence = this.f77825c;
        int i2 = i + TXLiteAVCode.WARNING_START_CAPTURE_IGNORED;
        if (i2 < charSequence.length()) {
            return i2;
        }
        return -1;
    }

    @Override // p153l.bpw0
    /* JADX INFO: renamed from: b */
    public final int mo105853b(int i) {
        return i;
    }
}
