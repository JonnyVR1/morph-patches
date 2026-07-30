package p149l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonViewModel;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class a7t implements s7m<y6t> {

    /* JADX INFO: renamed from: a */
    public final VNavigationBar f67951a;

    /* JADX INFO: renamed from: b */
    public LiveSquareTopButtonViewModel f67952b;

    /* JADX INFO: renamed from: c */
    public y6t f67953c;

    /* JADX INFO: renamed from: d */
    public VText f67954d;

    /* JADX INFO: renamed from: e */
    public final View f67955e;

    /* JADX INFO: renamed from: f */
    public final View f67956f;

    public a7t(VNavigationBar vNavigationBar, View view, View view2) {
        this.f67951a = vNavigationBar;
        this.f67955e = view;
        this.f67956f = view2;
        m95300r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m95299c(View view) {
        y6t y6tVar = this.f67953c;
        if (y6tVar != null) {
            y6tVar.getAct().m66873d2();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m95300r() {
        xdl0.m208325C0(this.f67956f, xdl0.m208333G0(true));
        LiveSquareTopButtonViewModel liveSquareTopButtonViewModel = (LiveSquareTopButtonViewModel) LayoutInflater.from(getContext()).inflate(s6c0.f162692O0, (ViewGroup) null);
        this.f67952b = liveSquareTopButtonViewModel;
        this.f67951a.setRightIconViews(liveSquareTopButtonViewModel);
        VText vText = new VText(getContext());
        this.f67954d = vText;
        vText.setTextSize(21.0f);
        this.f67954d.setTextColor(Color.parseColor("#cc000000"));
        this.f67954d.setTypeface(null, 1);
        this.f67954d.setPadding(0, t100.f167254c, 0, 0);
        this.f67951a.setTitleView(this.f67954d);
        m95302d(Boolean.valueOf(pgi0.m168730l().m168751x()));
        this.f67951a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.z6t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201957a.m95299c(view);
            }
        });
        this.f67951a.setBackgroundResource(h3c0.f105605D1);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        VNavigationBar vNavigationBar = this.f67951a;
        return vNavigationBar != null ? vNavigationBar.getContext() : s9s.f163227a;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(y6t y6tVar) {
        this.f67953c = y6tVar;
    }

    /* JADX INFO: renamed from: d */
    public void m95302d(Boolean bool) {
        if (this.f67954d == null) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        VNavigationBar vNavigationBar = this.f67951a;
        if (zBooleanValue) {
            vNavigationBar.setLeftIconDrawable(null);
            this.f67954d.setText("青少年模式");
        } else {
            vNavigationBar.setLeftIconDrawable(getContext().getDrawable(h3c0.f105663e));
            this.f67954d.setText("直播");
        }
    }

    /* JADX INFO: renamed from: e */
    public void m95303e(boolean z) {
        if (pgi0.m168730l().m168751x()) {
            return;
        }
        if (z) {
            this.f67951a.setLeftIconDrawable(getContext().getDrawable(h3c0.f105612G0));
            this.f67954d.setTextColor(Color.parseColor("#FFFFFF"));
            this.f67955e.setBackgroundResource(h3c0.f105605D1);
        } else {
            this.f67955e.setBackgroundResource(h3c0.f105608E1);
            this.f67951a.setLeftIconDrawable(getContext().getDrawable(h3c0.f105663e));
            this.f67954d.setTextColor(Color.parseColor("#cc000000"));
        }
    }

    /* JADX INFO: renamed from: f */
    public void m95304f(Boolean bool) {
        if ("p_live_featured".equals((String) this.f67953c.m151646N2(new dts()))) {
            boolean zBooleanValue = bool.booleanValue();
            View view = this.f67955e;
            if (zBooleanValue) {
                view.setBackgroundResource(h3c0.f105608E1);
                this.f67956f.setBackgroundResource(h3c0.f105608E1);
                this.f67951a.setLeftIconDrawable(getContext().getDrawable(h3c0.f105663e));
                this.f67954d.setTextColor(Color.parseColor("#cc000000"));
                return;
            }
            view.setBackgroundResource(h3c0.f105605D1);
            this.f67956f.setBackgroundResource(h3c0.f105605D1);
            this.f67954d.setTextColor(Color.parseColor("#FFFFFF"));
            this.f67951a.setLeftIconDrawable(getContext().getDrawable(h3c0.f105612G0));
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
