package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubSweetCompanyView;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vbg implements s7m<xbg> {

    /* JADX INFO: renamed from: a */
    public xbg f21059a;

    /* JADX INFO: renamed from: b */
    public FansClubSweetCompanyView f21060b;

    public vbg(FansClubSweetCompanyView fansClubSweetCompanyView) {
        this.f21060b = fansClubSweetCompanyView;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m23812C0() {
        return this.f21060b.getContext();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m23816i1(xbg xbgVar) {
        this.f21059a = xbgVar;
    }

    /* JADX INFO: renamed from: b */
    public void m23814b() {
        this.f21060b.m6394l0();
    }

    /* JADX INFO: renamed from: c */
    public void m23815c(mcg mcgVar) {
        this.f21060b.m6395m0(mcgVar, this.f21059a);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }
}
