package p006l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.putong.data.AgeVerificationPatchInfo;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l.e30;
import l.jo0;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.pgm;
import l.rhi;
import l.roj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class dc0 extends jq2<tc0> {

    /* JADX INFO: renamed from: a */
    public double f10282a;

    /* JADX INFO: renamed from: b */
    public List<Media> f10283b;

    /* JADX INFO: renamed from: c */
    public AgeVerificationPatchInfo f10284c;

    /* JADX INFO: renamed from: d */
    public String f10285d;

    public dc0(mcr mcrVar) {
        super(mcrVar);
        this.f10285d = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m13890j0(Bundle bundle) {
        act().setTitle(act().string(R$string.f1705F));
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (userM21490p9 == null || userM21490p9.settings == null) {
            return;
        }
        this.f10284c = AgeVerificationPatchInfo.new_();
        this.f10282a = userM21490p9.settings.birthdate.doubleValue();
        ((tc0) ((jq2) this).viewModel).m24659r();
    }

    /* JADX INFO: renamed from: Z */
    public void m13891Z() {
        super.Z();
        this.f10285d = act().getIntent().getStringExtra("FROM");
    }

    /* JADX INFO: renamed from: a0 */
    public void m13892a0() {
        creates(new e30() { // from class: l.ac0
            public final void call(Object obj) {
                this.f8207a.m13890j0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public double m13893h0() {
        return this.f10282a;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m13894i0(String str) {
        return TextUtils.equals(str, "from_age_verification_dlg") || TextUtils.equals(str, "from_message");
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m13895k0(roj0 roj0Var) {
        act().progressDismiss();
        if (m13894i0(this.f10285d)) {
            act().finish();
        } else {
            ((tc0) ((jq2) this).viewModel).m24656d0();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m13896l0(Throwable th) {
        act().progressDismiss();
        lsi0.C(R$string.f2802p4);
    }

    /* JADX INFO: renamed from: m0 */
    public void m13897m0(List<Media> list) {
        if (!NullChecker.a(list) || list.size() <= 0) {
            return;
        }
        ((tc0) ((jq2) this).viewModel).m24655c0(list.get(0).url);
        this.f10283b = list;
    }

    /* JADX INFO: renamed from: n0 */
    public void m13898n0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Picture picture = new Picture();
        ((Media) picture).url = rhi.B(str);
        ((Media) picture).status = MediaLocalStatus.get("raw");
        picture.size = new Dimension(new pgm(rhi.z(((Media) picture).url)).d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(picture);
        m13897m0(arrayList);
    }

    /* JADX INFO: renamed from: o0 */
    public void m13899o0(double d) {
        this.f10282a = d;
        ((tc0) ((jq2) this).viewModel).m24654b0(d);
    }

    /* JADX INFO: renamed from: p0 */
    public void m13900p0(String str) {
        this.f10284c.certType = str;
    }

    /* JADX INFO: renamed from: q0 */
    public void m13901q0() {
        act().progress(R$string.f1831J5);
        this.f10284c.birthday = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Double.valueOf(this.f10282a));
        CoreModule.f1534c.f3541B0.m3544m4(this.f10283b, this.f10284c).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.bc0
            public final void call(Object obj) {
                this.f8809a.m13895k0((roj0) obj);
            }
        }, new e30() { // from class: l.cc0
            public final void call(Object obj) {
                this.f9585a.m13896l0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
