package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.AgeVerificationPatchInfo;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class dc0 extends jq2<tc0> {

    /* JADX INFO: renamed from: a */
    public double f85354a;

    /* JADX INFO: renamed from: b */
    public List<Media> f85355b;

    /* JADX INFO: renamed from: c */
    public AgeVerificationPatchInfo f85356c;

    /* JADX INFO: renamed from: d */
    public String f85357d;

    public dc0(mcr mcrVar) {
        super(mcrVar);
        this.f85357d = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m110655j0(Bundle bundle) {
        act().setTitle(act().string(R$string.f17716F));
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 == null || userM169527p9.settings == null) {
            return;
        }
        this.f85356c = AgeVerificationPatchInfo.new_();
        this.f85354a = userM169527p9.settings.birthdate.doubleValue();
        ((tc0) this.viewModel).m187973r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f85357d = act().getIntent().getStringExtra("FROM");
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.ac0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68759a.m110655j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public double m110656h0() {
        return this.f85354a;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m110657i0(String str) {
        return TextUtils.equals(str, "from_age_verification_dlg") || TextUtils.equals(str, "from_message");
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m110658k0(roj0 roj0Var) {
        act().progressDismiss();
        if (m110657i0(this.f85357d)) {
            act().lambda$debugItems$19();
        } else {
            ((tc0) this.viewModel).m187971d0();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m110659l0(Throwable th) {
        act().progressDismiss();
        lsi0.m151565C(R$string.f18813p4);
    }

    /* JADX INFO: renamed from: m0 */
    public void m110660m0(List<Media> list) {
        if (!NullChecker.m81303a(list) || list.size() <= 0) {
            return;
        }
        ((tc0) this.viewModel).m187970c0(list.get(0).url);
        this.f85355b = list;
    }

    /* JADX INFO: renamed from: n0 */
    public void m110661n0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Picture picture = new Picture();
        picture.url = rhi.m179355B(str);
        picture.status = MediaLocalStatus.get("raw");
        picture.size = new Dimension(new pgm(rhi.m179382z(picture.url)).f148730d);
        List<Media> arrayList = new ArrayList<>();
        arrayList.add(picture);
        m110660m0(arrayList);
    }

    /* JADX INFO: renamed from: o0 */
    public void m110662o0(double d) {
        this.f85354a = d;
        ((tc0) this.viewModel).m187969b0(d);
    }

    /* JADX INFO: renamed from: p0 */
    public void m110663p0(String str) {
        this.f85356c.certType = str;
    }

    /* JADX INFO: renamed from: q0 */
    public void m110664q0() {
        act().progress(R$string.f17842J5);
        this.f85356c.birthday = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Double.valueOf(this.f85354a));
        CoreModule.f17545c.f19552B0.m31614m4(this.f85355b, this.f85356c).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.bc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74893a.m110658k0((roj0) obj);
            }
        }, new e30() { // from class: l.cc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80194a.m110659l0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
