package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.game.IntlGameTabFrag;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;

/* JADX INFO: loaded from: classes13.dex */
public class shn implements s7m<rhn> {

    /* JADX INFO: renamed from: a */
    public final IntlGameTabFrag f164616a;

    /* JADX INFO: renamed from: b */
    public rhn f164617b;

    /* JADX INFO: renamed from: c */
    public MKWebView f164618c;

    /* JADX INFO: renamed from: d */
    public View f164619d;

    public shn(IntlGameTabFrag intlGameTabFrag) {
        this.f164616a = intlGameTabFrag;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rhn rhnVar) {
        this.f164617b = rhnVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(s6c0.f162695P0, (ViewGroup) null);
        this.f164619d = viewInflate;
        this.f164618c = (MKWebView) viewInflate.findViewById(f5c0.f95016J2);
        return this.f164619d;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
