package p002l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.baidu.mapapi.model.LatLng;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.Passby;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import l.d90;
import l.e30;
import l.eqh0;
import l.i0g0;
import l.kpa0;
import l.mcr;
import l.mjj;
import l.mqi0;
import l.qc2;
import l.qib0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VDraweeView;
import v.VLinear_Dividers;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jpa0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f13970u;

    /* JADX INFO: renamed from: v */
    public VText f13971v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f13972w;

    /* JADX INFO: renamed from: x */
    public VText f13973x;

    /* JADX INFO: renamed from: y */
    public VText f13974y;

    /* JADX INFO: renamed from: z */
    public mjj f13975z;

    public jpa0(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return m14465w();
    }

    /* JADX INFO: renamed from: U */
    public View m16158U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kpa0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m16159V(d90 d90Var) {
        String str = (!TextUtils.isEmpty(d90Var.b()) ? d90Var.b() : "") + (!TextUtils.isEmpty(d90Var.c()) ? d90Var.c() : "") + (TextUtils.isEmpty(d90Var.f()) ? "" : d90Var.f());
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f13973x;
        if (zIsEmpty) {
            xdl0.M(vText, false);
        } else {
            vText.setText(mo3351O().act().getString(R.string.Uj, str));
            xdl0.M(this.f13973x, true);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m16160W(Throwable th) {
        xdl0.M(this.f13973x, false);
        App.d.k(th);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m16161X(LatLng latLng, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        if (i > 800) {
            i2 = (i2 * 800) / i;
            i = 800;
        }
        qib0.G.L0(this.f13972w, "http://api.map.baidu.com/staticimage/v2?ak=islEGFAbydBfWxshdNB3jYeG&center=" + latLng.longitude + "," + latLng.latitude + "&width=" + i + "&height=" + i2 + "&zoom=18&mcode=93:E8:C2:C3:D3:8A:72:EC:04:85:85:70:B3:3F:E5:FB:69:31:CC:1B;com.p1.mobile.putong");
    }

    /* JADX INFO: renamed from: Y */
    public final void m16162Y(User user) {
        Passby passby = user.location.passby;
        if (NullChecker.b(passby)) {
            DoublePair doublePair = passby.location.coordinates;
            final LatLng latLngB = qc2.b(new LatLng(doublePair.first, doublePair.second));
            if (this.f13975z == null) {
                this.f13975z = mjj.c(m14461p(), false);
            }
            this.f13975z.e(m14461p(), latLngB.latitude, latLngB.longitude, new e30() { // from class: l.gpa0
                public final void call(Object obj) {
                    this.f11574a.m16159V((d90) obj);
                }
            }, new e30() { // from class: l.hpa0
                public final void call(Object obj) {
                    this.f12210a.m16160W((Throwable) obj);
                }
            });
            VText vText = this.f13971v;
            Act act = mo3351O().act();
            int i = passby.count;
            vText.setText(i0g0.N(act.getString(i > 1 ? R.string.Tj : R.string.Sj, Integer.valueOf(i)), 0, eqh0.c(3)));
            xdl0.Q0(this.f13972w, new e30() { // from class: l.ipa0
                public final void call(Object obj) {
                    this.f13351a.m16161X(latLngB, (int[]) obj);
                }
            });
            this.f13974y.setText(mqi0.q().format(new Date((long) passby.latestTime)));
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return false;
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m16158U(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        m16162Y(mo3351O().mo1517K2());
    }
}
