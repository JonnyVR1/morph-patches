package p153l;

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
public final class apr0 implements sgr0 {

    /* JADX INFO: renamed from: a */
    public final sgr0 f72743a;

    /* JADX INFO: renamed from: b */
    public final vor0 f72744b;

    /* JADX INFO: renamed from: h */
    @Nullable
    public xor0 f72750h;

    /* JADX INFO: renamed from: i */
    public sqr0 f72751i;

    /* JADX INFO: renamed from: c */
    public final por0 f72745c = new por0();

    /* JADX INFO: renamed from: e */
    public int f72747e = 0;

    /* JADX INFO: renamed from: f */
    public int f72748f = 0;

    /* JADX INFO: renamed from: g */
    public byte[] f72749g = mpw0.f137962f;

    /* JADX INFO: renamed from: d */
    public final bgw0 f72746d = new bgw0();

    public apr0(sgr0 sgr0Var, vor0 vor0Var) {
        this.f72743a = sgr0Var;
        this.f72744b = vor0Var;
    }

    @Override // p153l.sgr0
    /* JADX INFO: renamed from: a */
    public final void mo99370a(bgw0 bgw0Var, int i, int i2) {
        if (this.f72750h == null) {
            this.f72743a.mo99370a(bgw0Var, i, i2);
            return;
        }
        m99377h(i);
        bgw0Var.m104265g(this.f72749g, this.f72748f, i);
        this.f72748f += i;
    }

    @Override // p153l.sgr0
    /* JADX INFO: renamed from: b */
    public final int mo99371b(nyy0 nyy0Var, int i, boolean z, int i2) throws IOException {
        if (this.f72750h == null) {
            return this.f72743a.mo99371b(nyy0Var, i, z, 0);
        }
        m99377h(i);
        int iMo12781a = nyy0Var.mo12781a(this.f72749g, this.f72748f, i);
        if (iMo12781a != -1) {
            this.f72748f += iMo12781a;
            return iMo12781a;
        }
        if (z) {
            return -1;
        }
        vg3.m201207a();
        return 0;
    }

    @Override // p153l.sgr0
    /* JADX INFO: renamed from: c */
    public final void mo99372c(final long j, final int i, int i2, int i3, @Nullable ggr0 ggr0Var) {
        if (this.f72750h == null) {
            this.f72743a.mo99372c(j, i, i2, i3, ggr0Var);
            return;
        }
        lev0.m153957e(ggr0Var == null, "DRM on subtitles is not supported");
        int i4 = (this.f72748f - i3) - i2;
        this.f72750h.mo105973a(this.f72749g, i4, i2, wor0.m207347a(), new hkv0() { // from class: l.zor0
            @Override // p153l.hkv0
            public final void zza(Object obj) {
                this.f205385a.m99376g(j, i, (qor0) obj);
            }
        });
        int i5 = i4 + i2;
        this.f72747e = i5;
        if (i5 == this.f72748f) {
            this.f72747e = 0;
            this.f72748f = 0;
        }
    }

    @Override // p153l.sgr0
    /* JADX INFO: renamed from: d */
    public final void mo99373d(sqr0 sqr0Var) {
        String str = sqr0Var.f170251l;
        str.getClass();
        lev0.m153956d(a8t0.m96490b(str) == 3);
        if (!sqr0Var.equals(this.f72751i)) {
            this.f72751i = sqr0Var;
            this.f72750h = this.f72744b.mo182442b(sqr0Var) ? this.f72744b.mo182443c(sqr0Var) : null;
        }
        xor0 xor0Var = this.f72750h;
        sgr0 sgr0Var = this.f72743a;
        if (xor0Var == null) {
            sgr0Var.mo99373d(sqr0Var);
            return;
        }
        znr0 znr0VarM187559b = sqr0Var.m187559b();
        znr0VarM187559b.m220672w("application/x-media3-cues");
        znr0VarM187559b.m220661l0(sqr0Var.f170251l);
        znr0VarM187559b.m220643B(Long.MAX_VALUE);
        znr0VarM187559b.m220649d(this.f72744b.mo182441a(sqr0Var));
        sgr0Var.mo99373d(znr0VarM187559b.m220645D());
    }

    @Override // p153l.sgr0
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int mo99374e(nyy0 nyy0Var, int i, boolean z) {
        return fgr0.m125514a(this, nyy0Var, i, z);
    }

    @Override // p153l.sgr0
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void mo99375f(bgw0 bgw0Var, int i) {
        fgr0.m125515b(this, bgw0Var, i);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m99376g(long j, int i, qor0 qor0Var) {
        lev0.m153954b(this.f72751i);
        zzgaa zzgaaVar = qor0Var.f158751a;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgaaVar.size());
        Iterator<E> it = zzgaaVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((u4v0) it.next()).m194499a());
        }
        long j2 = qor0Var.f158753c;
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong(Constants.INAPP_DATA_TAG, j2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        bgw0 bgw0Var = this.f72746d;
        int length = bArrMarshall.length;
        bgw0Var.m104267i(bArrMarshall, length);
        this.f72743a.mo99375f(this.f72746d, length);
        int i2 = i & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        long j3 = qor0Var.f158752b;
        sqr0 sqr0Var = this.f72751i;
        if (j3 == -9223372036854775807L) {
            lev0.m153958f(sqr0Var.f170255p == Long.MAX_VALUE);
        } else {
            long j4 = sqr0Var.f170255p;
            j = j4 == Long.MAX_VALUE ? j + j3 : j3 + j4;
        }
        this.f72743a.mo99372c(j, i2, length, 0, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m99377h(int i) {
        int length = this.f72749g.length;
        int i2 = this.f72748f;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.f72747e;
        int iMax = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.f72749g;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f72747e, bArr2, 0, i3);
        this.f72747e = 0;
        this.f72748f = i3;
        this.f72749g = bArr2;
    }
}
