package p149l;

import androidx.annotation.Nullable;
import com.tencent.ugc.TXRecordCommon;

/* JADX INFO: loaded from: classes6.dex */
public final class tdx0 implements e4x0 {

    /* JADX INFO: renamed from: b */
    @Nullable
    public vjx0 f169776b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f169777c;

    /* JADX INFO: renamed from: f */
    public boolean f169780f;

    /* JADX INFO: renamed from: a */
    public final yix0 f169775a = new yix0();

    /* JADX INFO: renamed from: d */
    public int f169778d = TXRecordCommon.AUDIO_SAMPLERATE_8000;

    /* JADX INFO: renamed from: e */
    public int f169779e = TXRecordCommon.AUDIO_SAMPLERATE_8000;

    /* JADX INFO: renamed from: a */
    public final tdx0 m188464a(boolean z) {
        this.f169780f = true;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final tdx0 m188465b(int i) {
        this.f169778d = i;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final tdx0 m188466c(int i) {
        this.f169779e = i;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final tdx0 m188467d(@Nullable vjx0 vjx0Var) {
        this.f169776b = vjx0Var;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final tdx0 m188468e(@Nullable String str) {
        this.f169777c = str;
        return this;
    }

    @Override // p149l.e4x0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final qhx0 zza() {
        qhx0 qhx0Var = new qhx0(this.f169777c, this.f169778d, this.f169779e, this.f169780f, this.f169775a);
        vjx0 vjx0Var = this.f169776b;
        if (vjx0Var != null) {
            qhx0Var.mo128921f(vjx0Var);
        }
        return qhx0Var;
    }
}
