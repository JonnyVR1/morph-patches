package p149l;

import com.tencent.liteav.TXLiteAVCode;

/* JADX INFO: loaded from: classes6.dex */
public final class sfw0 extends vfw0 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ tfw0 f164347g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfw0(tfw0 tfw0Var, xfw0 xfw0Var, CharSequence charSequence) {
        super(xfw0Var, charSequence);
        this.f164347g = tfw0Var;
    }

    @Override // p149l.vfw0
    /* JADX INFO: renamed from: c */
    public final int mo174375c(int i) {
        CharSequence charSequence = this.f181318c;
        int i2 = i + TXLiteAVCode.WARNING_START_CAPTURE_IGNORED;
        if (i2 < charSequence.length()) {
            return i2;
        }
        return -1;
    }

    @Override // p149l.vfw0
    /* JADX INFO: renamed from: b */
    public final int mo174374b(int i) {
        return i;
    }
}
