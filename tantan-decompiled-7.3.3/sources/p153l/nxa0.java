package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.baidu.mapapi.model.LatLng;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.Passby;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class nxa0 extends ep90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f144099u;

    /* JADX INFO: renamed from: v */
    public VText f144100v;

    /* JADX INFO: renamed from: w */
    public VDraweeView f144101w;

    /* JADX INFO: renamed from: x */
    public VText f144102x;

    /* JADX INFO: renamed from: y */
    public VText f144103y;

    /* JADX INFO: renamed from: z */
    public fmj f144104z;

    public nxa0(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return m168325w();
    }

    /* JADX INFO: renamed from: U */
    public View m165105U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return oxa0.m169683b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m165106V(z80 z80Var) {
        String str = (!TextUtils.isEmpty(z80Var.mo143670b()) ? z80Var.mo143670b() : "") + (!TextUtils.isEmpty(z80Var.mo143671c()) ? z80Var.mo143671c() : "") + (TextUtils.isEmpty(z80Var.mo143672f()) ? "" : z80Var.mo143672f());
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText vText = this.f144102x;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
        } else {
            vText.setText(mo53983O().act().getString(R$string.f19590qk, str));
            bnl0.m105524M(this.f144102x, true);
        }
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m165107W(Throwable th) {
        bnl0.m105524M(this.f144102x, false);
        App.f16087d.m21432k(th);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m165108X(LatLng latLng, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        if (i > 800) {
            i2 = (i2 * 800) / i;
            i = 800;
        }
        uqb0.f180374G.m127115L0(this.f144101w, "http://api.map.baidu.com/staticimage/v2?ak=islEGFAbydBfWxshdNB3jYeG&center=" + latLng.longitude + Constants.SEPARATOR_COMMA + latLng.latitude + "&width=" + i + "&height=" + i2 + "&zoom=18&mcode=93:E8:C2:C3:D3:8A:72:EC:04:85:85:70:B3:3F:E5:FB:69:31:CC:1B;com.p1.mobile.putong");
    }

    /* JADX INFO: renamed from: Y */
    public final void m165109Y(User user) {
        Passby passby = user.location.passby;
        if (NullChecker.m82487b(passby)) {
            DoublePair doublePair = passby.location.coordinates;
            final LatLng latLngM210088b = xc2.m210088b(new LatLng(doublePair.first, doublePair.second));
            if (this.f144104z == null) {
                this.f144104z = fmj.m126236c(m168321p(), false);
            }
            this.f144104z.m126239e(m168321p(), latLngM210088b.latitude, latLngM210088b.longitude, new y20() { // from class: l.kxa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f129181a.m165106V((z80) obj);
                }
            }, new y20() { // from class: l.lxa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f133914a.m165107W((Throwable) obj);
                }
            });
            VText vText = this.f144100v;
            Act act = mo53983O().act();
            int i = passby.count;
            vText.setText(q8g0.m175782N(act.getString(i > 1 ? R$string.f19559pk : R$string.f19528ok, Integer.valueOf(i)), 0, lyh0.m156283c(3)));
            bnl0.m105533Q0(this.f144101w, new y20() { // from class: l.mxa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f139216a.m165108X(latLngM210088b, (int[]) obj);
                }
            });
            this.f144103y.setText(pzi0.m174456q().format(new Date((long) passby.latestTime)));
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return false;
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m165105U(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        m165109Y(mo53983O().mo52252K2());
    }
}
