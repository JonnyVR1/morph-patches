package p149l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.zzgaa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class ufr0 implements m7r0 {

    /* JADX INFO: renamed from: a */
    public final m7r0 f176315a;

    /* JADX INFO: renamed from: b */
    public final pfr0 f176316b;

    /* JADX INFO: renamed from: h */
    @Nullable
    public rfr0 f176322h;

    /* JADX INFO: renamed from: i */
    public mhr0 f176323i;

    /* JADX INFO: renamed from: c */
    public final jfr0 f176317c = new jfr0();

    /* JADX INFO: renamed from: e */
    public int f176319e = 0;

    /* JADX INFO: renamed from: f */
    public int f176320f = 0;

    /* JADX INFO: renamed from: g */
    public byte[] f176321g = ggw0.f102573f;

    /* JADX INFO: renamed from: d */
    public final v6w0 f176318d = new v6w0();

    public ufr0(m7r0 m7r0Var, pfr0 pfr0Var) {
        this.f176315a = m7r0Var;
        this.f176316b = pfr0Var;
    }

    @Override // p149l.m7r0
    /* JADX INFO: renamed from: a */
    public final void mo134528a(v6w0 v6w0Var, int i, int i2) {
        if (this.f176322h == null) {
            this.f176315a.mo134528a(v6w0Var, i, i2);
            return;
        }
        m193471h(i);
        v6w0Var.m197258g(this.f176321g, this.f176320f, i);
        this.f176320f += i;
    }

    @Override // p149l.m7r0
    /* JADX INFO: renamed from: b */
    public final int mo134529b(hpy0 hpy0Var, int i, boolean z, int i2) throws IOException {
        if (this.f176322h == null) {
            return this.f176315a.mo134529b(hpy0Var, i, z, 0);
        }
        m193471h(i);
        int iMo12727a = hpy0Var.mo12727a(this.f176321g, this.f176320f, i);
        if (iMo12727a != -1) {
            this.f176320f += iMo12727a;
            return iMo12727a;
        }
        if (z) {
            return -1;
        }
        hg3.m130807a();
        return 0;
    }

    @Override // p149l.m7r0
    /* JADX INFO: renamed from: c */
    public final void mo134530c(final long j, final int i, int i2, int i3, @Nullable a7r0 a7r0Var) {
        if (this.f176322h == null) {
            this.f176315a.mo134530c(j, i, i2, i3, a7r0Var);
            return;
        }
        f5v0.m119534e(a7r0Var == null, "DRM on subtitles is not supported");
        int i4 = (this.f176320f - i3) - i2;
        this.f176322h.mo101921a(this.f176321g, i4, i2, qfr0.m174372a(), new bbv0() { // from class: l.tfr0
            @Override // p149l.bbv0
            public final void zza(Object obj) {
                this.f170014a.m193470g(j, i, (kfr0) obj);
            }
        });
        int i5 = i4 + i2;
        this.f176319e = i5;
        if (i5 == this.f176320f) {
            this.f176319e = 0;
            this.f176320f = 0;
        }
    }

    @Override // p149l.m7r0
    /* JADX INFO: renamed from: d */
    public final void mo134531d(mhr0 mhr0Var) {
        String str = mhr0Var.f133892l;
        str.getClass();
        f5v0.m119533d(uys0.m196365b(str) == 3);
        if (!mhr0Var.equals(this.f176323i)) {
            this.f176323i = mhr0Var;
            this.f176322h = this.f176316b.mo149741b(mhr0Var) ? this.f176316b.mo149742c(mhr0Var) : null;
        }
        rfr0 rfr0Var = this.f176322h;
        m7r0 m7r0Var = this.f176315a;
        if (rfr0Var == null) {
            m7r0Var.mo134531d(mhr0Var);
            return;
        }
        ter0 ter0VarM154634b = mhr0Var.m154634b();
        ter0VarM154634b.m188618w("application/x-media3-cues");
        ter0VarM154634b.m188607l0(mhr0Var.f133892l);
        ter0VarM154634b.m188589B(Long.MAX_VALUE);
        ter0VarM154634b.m188595d(this.f176316b.mo149740a(mhr0Var));
        m7r0Var.mo134531d(ter0VarM154634b.m188591D());
    }

    @Override // p149l.m7r0
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int mo134532e(hpy0 hpy0Var, int i, boolean z) {
        return z6r0.m217415a(this, hpy0Var, i, z);
    }

    @Override // p149l.m7r0
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void mo134533f(v6w0 v6w0Var, int i) {
        z6r0.m217416b(this, v6w0Var, i);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m193470g(long j, int i, kfr0 kfr0Var) {
        f5v0.m119531b(this.f176323i);
        zzgaa zzgaaVar = kfr0Var.f122965a;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgaaVar.size());
        Iterator<E> it = zzgaaVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((ovu0) it.next()).m166208a());
        }
        long j2 = kfr0Var.f122967c;
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong(Constants.INAPP_DATA_TAG, j2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        v6w0 v6w0Var = this.f176318d;
        int length = bArrMarshall.length;
        v6w0Var.m197260i(bArrMarshall, length);
        this.f176315a.mo134533f(this.f176318d, length);
        int i2 = i & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        long j3 = kfr0Var.f122966b;
        mhr0 mhr0Var = this.f176323i;
        if (j3 == -9223372036854775807L) {
            f5v0.m119535f(mhr0Var.f133896p == Long.MAX_VALUE);
        } else {
            long j4 = mhr0Var.f133896p;
            j = j4 == Long.MAX_VALUE ? j + j3 : j3 + j4;
        }
        this.f176315a.mo134530c(j, i2, length, 0, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m193471h(int i) {
        int length = this.f176321g.length;
        int i2 = this.f176320f;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.f176319e;
        int iMax = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.f176321g;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f176319e, bArr2, 0, i3);
        this.f176319e = 0;
        this.f176320f = i3;
        this.f176321g = bArr2;
    }
}
