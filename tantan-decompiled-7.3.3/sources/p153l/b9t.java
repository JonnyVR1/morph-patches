package p153l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonViewModel;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class b9t implements iam<z8t> {

    /* JADX INFO: renamed from: a */
    public final VNavigationBar f75611a;

    /* JADX INFO: renamed from: b */
    public LiveSquareTopButtonViewModel f75612b;

    /* JADX INFO: renamed from: c */
    public z8t f75613c;

    /* JADX INFO: renamed from: d */
    public VText f75614d;

    /* JADX INFO: renamed from: e */
    public final View f75615e;

    /* JADX INFO: renamed from: f */
    public final View f75616f;

    public b9t(VNavigationBar vNavigationBar, View view, View view2) {
        this.f75611a = vNavigationBar;
        this.f75615e = view;
        this.f75616f = view2;
        m103131r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m103130c(View view) {
        z8t z8tVar = this.f75613c;
        if (z8tVar != null) {
            z8tVar.getAct().m68056e2();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m103131r() {
        bnl0.m105505C0(this.f75616f, bnl0.m105513G0(true));
        LiveSquareTopButtonViewModel liveSquareTopButtonViewModel = (LiveSquareTopButtonViewModel) LayoutInflater.from(getContext()).inflate(xec0.f193806O0, (ViewGroup) null);
        this.f75612b = liveSquareTopButtonViewModel;
        this.f75611a.setRightIconViews(liveSquareTopButtonViewModel);
        VText vText = new VText(getContext());
        this.f75614d = vText;
        vText.setTextSize(21.0f);
        this.f75614d.setTextColor(Color.parseColor("#cc000000"));
        this.f75614d.setTypeface(null, 1);
        this.f75614d.setPadding(0, qa00.f156316c, 0, 0);
        this.f75611a.setTitleView(this.f75614d);
        m103133d(Boolean.valueOf(ppi0.m173207l().m173228x()));
        this.f75611a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.a9t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69074a.m103130c(view);
            }
        });
        this.f75611a.setBackgroundResource(nbc0.f141096D1);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        VNavigationBar vNavigationBar = this.f75611a;
        return vNavigationBar != null ? vNavigationBar.getContext() : tbs.f172988a;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(z8t z8tVar) {
        this.f75613c = z8tVar;
    }

    /* JADX INFO: renamed from: d */
    public void m103133d(Boolean bool) {
        if (this.f75614d == null) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        VNavigationBar vNavigationBar = this.f75611a;
        if (zBooleanValue) {
            vNavigationBar.setLeftIconDrawable(null);
            this.f75614d.setText("青少年模式");
        } else {
            vNavigationBar.setLeftIconDrawable(getContext().getDrawable(nbc0.f141154e));
            this.f75614d.setText("直播");
        }
    }

    /* JADX INFO: renamed from: e */
    public void m103134e(boolean z) {
        if (ppi0.m173207l().m173228x()) {
            return;
        }
        if (z) {
            this.f75611a.setLeftIconDrawable(getContext().getDrawable(nbc0.f141103G0));
            this.f75614d.setTextColor(Color.parseColor("#FFFFFF"));
            this.f75615e.setBackgroundResource(nbc0.f141096D1);
        } else {
            this.f75615e.setBackgroundResource(nbc0.f141099E1);
            this.f75611a.setLeftIconDrawable(getContext().getDrawable(nbc0.f141154e));
            this.f75614d.setTextColor(Color.parseColor("#cc000000"));
        }
    }

    /* JADX INFO: renamed from: f */
    public void m103135f(Boolean bool) {
        if ("p_live_featured".equals((String) this.f75613c.m160243N2(new evs()))) {
            boolean zBooleanValue = bool.booleanValue();
            View view = this.f75615e;
            if (zBooleanValue) {
                view.setBackgroundResource(nbc0.f141099E1);
                this.f75616f.setBackgroundResource(nbc0.f141099E1);
                this.f75611a.setLeftIconDrawable(getContext().getDrawable(nbc0.f141154e));
                this.f75614d.setTextColor(Color.parseColor("#cc000000"));
                return;
            }
            view.setBackgroundResource(nbc0.f141096D1);
            this.f75616f.setBackgroundResource(nbc0.f141096D1);
            this.f75614d.setTextColor(Color.parseColor("#FFFFFF"));
            this.f75611a.setLeftIconDrawable(getContext().getDrawable(nbc0.f141103G0));
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
