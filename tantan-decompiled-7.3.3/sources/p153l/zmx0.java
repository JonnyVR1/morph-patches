package p153l;

import androidx.annotation.Nullable;
import com.tencent.ugc.TXRecordCommon;

/* JADX INFO: loaded from: classes6.dex */
public final class zmx0 implements kdx0 {

    /* JADX INFO: renamed from: b */
    @Nullable
    public btx0 f205147b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f205148c;

    /* JADX INFO: renamed from: f */
    public boolean f205151f;

    /* JADX INFO: renamed from: a */
    public final esx0 f205146a = new esx0();

    /* JADX INFO: renamed from: d */
    public int f205149d = TXRecordCommon.AUDIO_SAMPLERATE_8000;

    /* JADX INFO: renamed from: e */
    public int f205150e = TXRecordCommon.AUDIO_SAMPLERATE_8000;

    /* JADX INFO: renamed from: a */
    public final zmx0 m220526a(boolean z) {
        this.f205151f = true;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final zmx0 m220527b(int i) {
        this.f205149d = i;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final zmx0 m220528c(int i) {
        this.f205150e = i;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final zmx0 m220529d(@Nullable btx0 btx0Var) {
        this.f205147b = btx0Var;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final zmx0 m220530e(@Nullable String str) {
        this.f205148c = str;
        return this;
    }

    @Override // p153l.kdx0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final wqx0 zza() {
        wqx0 wqx0Var = new wqx0(this.f205148c, this.f205149d, this.f205150e, this.f205151f, this.f205146a);
        btx0 btx0Var = this.f205147b;
        if (btx0Var != null) {
            wqx0Var.mo101236f(btx0Var);
        }
        return wqx0Var;
    }
}
