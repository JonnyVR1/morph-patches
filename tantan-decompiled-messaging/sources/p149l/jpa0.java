package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.baidu.mapapi.model.LatLng;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.Passby;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jpa0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f119136u;

    /* JADX INFO: renamed from: v */
    public VText f119137v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f119138w;

    /* JADX INFO: renamed from: x */
    public VText f119139x;

    /* JADX INFO: renamed from: y */
    public VText f119140y;

    /* JADX INFO: renamed from: z */
    public mjj f119141z;

    public jpa0(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return m131825w();
    }

    /* JADX INFO: renamed from: U */
    public View m142662U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kpa0.m146835b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m142663V(d90 d90Var) {
        String str = (!TextUtils.isEmpty(d90Var.mo110405b()) ? d90Var.mo110405b() : "") + (!TextUtils.isEmpty(d90Var.mo110406c()) ? d90Var.mo110406c() : "") + (TextUtils.isEmpty(d90Var.mo110409f()) ? "" : d90Var.mo110409f());
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f119139x;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
        } else {
            vText.setText(mo52800O().act().getString(R$string.f18186Uj, str));
            xdl0.m208344M(this.f119139x, true);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m142664W(Throwable th) {
        xdl0.m208344M(this.f119139x, false);
        App.f15368d.m20433k(th);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m142665X(LatLng latLng, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        if (i > 800) {
            i2 = (i2 * 800) / i;
            i = 800;
        }
        qib0.f154691G.m102331L0(this.f119138w, "http://api.map.baidu.com/staticimage/v2?ak=islEGFAbydBfWxshdNB3jYeG&center=" + latLng.longitude + Constants.SEPARATOR_COMMA + latLng.latitude + "&width=" + i + "&height=" + i2 + "&zoom=18&mcode=93:E8:C2:C3:D3:8A:72:EC:04:85:85:70:B3:3F:E5:FB:69:31:CC:1B;com.p1.mobile.putong");
    }

    /* JADX INFO: renamed from: Y */
    public final void m142666Y(User user) {
        Passby passby = user.location.passby;
        if (NullChecker.m81304b(passby)) {
            DoublePair doublePair = passby.location.coordinates;
            final LatLng latLngM173860b = qc2.m173860b(new LatLng(doublePair.first, doublePair.second));
            if (this.f119141z == null) {
                this.f119141z = mjj.m154842c(m131821p(), false);
            }
            this.f119141z.m154844e(m131821p(), latLngM173860b.latitude, latLngM173860b.longitude, new e30() { // from class: l.gpa0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f103772a.m142663V((d90) obj);
                }
            }, new e30() { // from class: l.hpa0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f108905a.m142664W((Throwable) obj);
                }
            });
            VText vText = this.f119137v;
            Act act = mo52800O().act();
            int i = passby.count;
            vText.setText(i0g0.m133847N(act.getString(i > 1 ? R$string.f18156Tj : R$string.f18126Sj, Integer.valueOf(i)), 0, eqh0.m117752c(3)));
            xdl0.m208353Q0(this.f119138w, new e30() { // from class: l.ipa0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f114282a.m142665X(latLngM173860b, (int[]) obj);
                }
            });
            this.f119140y.setText(mqi0.m155946q().format(new Date((long) passby.latestTime)));
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return false;
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m142662U(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        m142666Y(mo52800O().mo51069K2());
    }
}
