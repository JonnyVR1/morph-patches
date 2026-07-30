package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubSweetCompanyView;

/* JADX INFO: loaded from: classes4.dex */
public class vbg implements s7m<xbg> {

    /* JADX INFO: renamed from: a */
    public xbg f180841a;

    /* JADX INFO: renamed from: b */
    public FansClubSweetCompanyView f180842b;

    public vbg(FansClubSweetCompanyView fansClubSweetCompanyView) {
        this.f180842b = fansClubSweetCompanyView;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f180842b.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(xbg xbgVar) {
        this.f180841a = xbgVar;
    }

    /* JADX INFO: renamed from: b */
    public void m197709b() {
        this.f180842b.m72875l0();
    }

    /* JADX INFO: renamed from: c */
    public void m197710c(mcg mcgVar) {
        this.f180842b.m72876m0(mcgVar, this.f180841a);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
