package p149l;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveStartBtnConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveTapBarStartLiveConfig;
import com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonLiveView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class qws implements s7m<nws> {

    /* JADX INFO: renamed from: a */
    public final VDraweeView f156765a;

    /* JADX INFO: renamed from: b */
    public final View f156766b;

    /* JADX INFO: renamed from: c */
    public nws f156767c;

    /* JADX INFO: renamed from: d */
    public boolean f156768d = false;

    /* JADX INFO: renamed from: e */
    public boolean f156769e = false;

    /* JADX INFO: renamed from: f */
    public boolean f156770f = false;

    /* JADX INFO: renamed from: g */
    public VText f156771g;

    /* JADX INFO: renamed from: h */
    public View f156772h;

    public qws(LiveSquareTopButtonLiveView liveSquareTopButtonLiveView) {
        this.f156765a = liveSquareTopButtonLiveView.f45032b;
        this.f156766b = liveSquareTopButtonLiveView.f45034d;
        this.f156771g = liveSquareTopButtonLiveView.f45033c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m176901f(View view) {
        this.f156767c.m161918s3();
        this.f156770f = false;
        xdl0.m208344M(this.f156766b, false);
        this.f156767c.m161911k3(view);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getAct();
    }

    @Override // p149l.s7m
    @NonNull
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f156767c.getAct();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(nws nwsVar) {
        this.f156767c = nwsVar;
    }

    /* JADX INFO: renamed from: d */
    public void m176903d(boolean z) {
        if (!z || this.f156768d) {
            xdl0.m208344M(this.f156766b, false);
            xdl0.m208344M(this.f156772h, false);
        } else {
            xdl0.m208344M(this.f156766b, this.f156770f);
            xdl0.m208344M(this.f156772h, this.f156769e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final View m176904e() {
        View view = this.f156772h;
        if (view != null) {
            return view;
        }
        BLiveStartBtnConfig bLiveStartBtnConfigM195939s5 = s9s.f163228b.m195939s5();
        if (bLiveStartBtnConfigM195939s5 == null || TextUtils.isEmpty(bLiveStartBtnConfigM195939s5.text)) {
            this.f156772h = this.f156765a;
            this.f156771g.setVisibility(8);
            this.f156765a.setVisibility(0);
        } else {
            VText vText = this.f156771g;
            this.f156772h = vText;
            vText.setVisibility(0);
            this.f156765a.setVisibility(8);
            this.f156771g.setText(bLiveStartBtnConfigM195939s5.text);
            if (!TextUtils.isEmpty(bLiveStartBtnConfigM195939s5.textColor)) {
                this.f156771g.setTextColor(kvc0.m147358g(bLiveStartBtnConfigM195939s5.textColor));
            }
            if (!TextUtils.isEmpty(bLiveStartBtnConfigM195939s5.backgroundColor)) {
                ((GradientDrawable) this.f156771g.getBackground()).setColor(kvc0.m147358g(bLiveStartBtnConfigM195939s5.backgroundColor));
            }
        }
        return this.f156772h;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m176905i(String str) {
        hxs.m133406s("context_square", this.f156765a, str);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m176906j(BLiveTapBarStartLiveConfig bLiveTapBarStartLiveConfig) {
        if (bLiveTapBarStartLiveConfig == null) {
            return;
        }
        w8u.m202211n(bLiveTapBarStartLiveConfig.icon, new e30() { // from class: l.pws
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151595a.m176905i((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m176907k(boolean z) {
        boolean z2 = false;
        if (this.f156768d) {
            xdl0.m208344M(this.f156772h, false);
            xdl0.m208344M(this.f156766b, false);
            return;
        }
        this.f156770f = z;
        View view = this.f156766b;
        if (z && xdl0.m208349O0(this.f156772h)) {
            z2 = true;
        }
        xdl0.m208344M(view, z2);
    }

    /* JADX INFO: renamed from: l */
    public void m176908l(boolean z) {
        boolean z2 = this.f156768d;
        View view = this.f156772h;
        if (!z2) {
            xdl0.m208344M(view, z);
        } else {
            xdl0.m208344M(view, false);
            xdl0.m208344M(this.f156766b, false);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m176909r() {
        m176904e();
        uep0.m193306A(new View.OnClickListener() { // from class: l.ows
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146081a.m176901f(view);
            }
        }, this.f156772h);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
