package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.game.IntlGameTabFrag;

/* JADX INFO: loaded from: classes9.dex */
public class sjn implements iam<rjn> {

    /* JADX INFO: renamed from: a */
    public final IntlGameTabFrag f169125a;

    /* JADX INFO: renamed from: b */
    public rjn f169126b;

    /* JADX INFO: renamed from: c */
    public MKWebView f169127c;

    /* JADX INFO: renamed from: d */
    public View f169128d;

    public sjn(IntlGameTabFrag intlGameTabFrag) {
        this.f169125a = intlGameTabFrag;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(rjn rjnVar) {
        this.f169126b = rjnVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(xec0.f193809P0, (ViewGroup) null);
        this.f169128d = viewInflate;
        this.f169127c = (MKWebView) viewInflate.findViewById(ldc0.f131473J2);
        return this.f169128d;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
