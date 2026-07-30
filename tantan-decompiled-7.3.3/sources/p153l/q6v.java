package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.external.R$string;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class q6v implements iam<o6v> {

    /* JADX INFO: renamed from: a */
    public final VDraweeView f155841a;

    /* JADX INFO: renamed from: b */
    public o6v f155842b;

    /* JADX INFO: renamed from: c */
    public boolean f155843c;

    /* JADX INFO: renamed from: d */
    public String f155844d;

    /* JADX INFO: renamed from: e */
    public jxd0 f155845e = new jxd0("HAS_SHOW_CREATE_VOICE_TIP" + mbs.m157870o0(), Boolean.FALSE);

    public q6v(VDraweeView vDraweeView) {
        this.f155841a = vDraweeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m175612d(View view) {
        this.f155842b.m166298U2(view);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getAct();
    }

    @Override // p153l.iam
    @NonNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f155842b.getAct();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(o6v o6vVar) {
        this.f155842b = o6vVar;
    }

    /* JADX INFO: renamed from: c */
    public void m175614c() {
        C4499d.m21895l().m21899k(this.f155844d);
    }

    @Override // p153l.iam
    public void destroy() {
        m175614c();
    }

    /* JADX INFO: renamed from: e */
    public void m175615e(boolean z) {
        if (this.f155843c || !tbs.f172989b.m203755v7()) {
            bnl0.m105524M(this.f155841a, false);
            return;
        }
        bnl0.m105524M(this.f155841a, z);
        if (z) {
            evo0.m122806d();
        } else {
            m175614c();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m175616f(Boolean bool) {
        this.f155843c = bool.booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public void m175617i() {
        if (!TEnum.equals(uqb0.f180402h0, LiveRegionTag.mainland)) {
            fhw.m125605a("[live][square]", "非mainland不展示");
            return;
        }
        if (this.f155845e.get().booleanValue()) {
            return;
        }
        VText vText = new VText(getAct());
        int i = bnl0.f77544e;
        vText.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        vText.setText(R$string.f45786y0);
        int i2 = qa00.f156323j;
        vText.setPadding(i2, qa00.m175859d(11.0f), i2, qa00.m175859d(11.0f));
        vText.setTextColor(-1);
        this.f155844d = C4499d.m21895l().m21907t(new C4496a(getAct()).m21876s(vText).m21881x(qa00.f156321h).m21863e(true).m21882y(true).m21869k(getAct().getResources().getColor(m9c0.f135376a)).m21854J(13.0f).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21874q(C4496a.f16399N | C4496a.f16401P).m21872o(C4496a.f16401P, qa00.m175859d(7.0f)).m21878u(qa00.f156316c), this.f155841a);
        this.f155845e.put(Boolean.TRUE);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public void m175618r() {
        bnl0.m105509E0(this.f155841a, new View.OnClickListener() { // from class: l.p6v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150876a.m175612d(view);
            }
        });
    }
}
