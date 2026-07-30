package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.AgeVerificationPatchInfo;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class zb0 extends ar2<pc0> {

    /* JADX INFO: renamed from: a */
    public double f203609a;

    /* JADX INFO: renamed from: b */
    public List<Media> f203610b;

    /* JADX INFO: renamed from: c */
    public AgeVerificationPatchInfo f203611c;

    /* JADX INFO: renamed from: d */
    public String f203612d;

    public zb0(ner nerVar) {
        super(nerVar);
        this.f203612d = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m219150j0(Bundle bundle) {
        act().setTitle(act().string(R$string.f18440F));
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null || userM116600p9.settings == null) {
            return;
        }
        this.f203611c = AgeVerificationPatchInfo.new_();
        this.f203609a = userM116600p9.settings.birthdate.doubleValue();
        ((pc0) this.viewModel).m171601r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f203612d = act().getIntent().getStringExtra("FROM");
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.wb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188185a.m219150j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public double m219151h0() {
        return this.f203609a;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m219152i0(String str) {
        return TextUtils.equals(str, "from_age_verification_dlg") || TextUtils.equals(str, "from_message");
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m219153k0(uxj0 uxj0Var) {
        act().progressDismiss();
        if (m219152i0(this.f203612d)) {
            act().lambda$debugItems$19();
        } else {
            ((pc0) this.viewModel).m171599d0();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m219154l0(Throwable th) {
        act().progressDismiss();
        o1j0.m165621C(R$string.f19605r4);
    }

    /* JADX INFO: renamed from: m0 */
    public void m219155m0(List<Media> list) {
        if (!NullChecker.m82486a(list) || list.size() <= 0) {
            return;
        }
        ((pc0) this.viewModel).m171598c0(list.get(0).url);
        this.f203610b = list;
    }

    /* JADX INFO: renamed from: n0 */
    public void m219156n0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Picture picture = new Picture();
        picture.url = oki.m168011B(str);
        picture.status = MediaLocalStatus.get("raw");
        picture.size = new Dimension(new sim(oki.m168038z(picture.url)).f168843d);
        List<Media> arrayList = new ArrayList<>();
        arrayList.add(picture);
        m219155m0(arrayList);
    }

    /* JADX INFO: renamed from: o0 */
    public void m219157o0(double d) {
        this.f203609a = d;
        ((pc0) this.viewModel).m171597b0(d);
    }

    /* JADX INFO: renamed from: p0 */
    public void m219158p0(String str) {
        this.f203611c.certType = str;
    }

    /* JADX INFO: renamed from: q0 */
    public void m219159q0() {
        act().progress(R$string.f18632L5);
        this.f203611c.birthday = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Double.valueOf(this.f203609a));
        CoreModule.f18264c.f20294B0.m32617m4(this.f203610b, this.f203611c).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.xb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193097a.m219153k0((uxj0) obj);
            }
        }, new y20() { // from class: l.yb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198268a.m219154l0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
