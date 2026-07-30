package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.FansClubSweetCompanyView;

/* JADX INFO: loaded from: classes4.dex */
public class jdg implements iam<ldg> {

    /* JADX INFO: renamed from: a */
    public ldg f120254a;

    /* JADX INFO: renamed from: b */
    public FansClubSweetCompanyView f120255b;

    public jdg(FansClubSweetCompanyView fansClubSweetCompanyView) {
        this.f120255b = fansClubSweetCompanyView;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f120255b.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ldg ldgVar) {
        this.f120254a = ldgVar;
    }

    /* JADX INFO: renamed from: b */
    public void m144424b() {
        this.f120255b.m74058l0();
    }

    /* JADX INFO: renamed from: c */
    public void m144425c(aeg aegVar) {
        this.f120255b.m74059m0(aegVar, this.f120254a);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
