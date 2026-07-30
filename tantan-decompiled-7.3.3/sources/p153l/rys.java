package p153l;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveStartBtnConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveTapBarStartLiveConfig;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.topButton.LiveSquareTopButtonLiveView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class rys implements iam<oys> {

    /* JADX INFO: renamed from: a */
    public final VDraweeView f165457a;

    /* JADX INFO: renamed from: b */
    public final View f165458b;

    /* JADX INFO: renamed from: c */
    public oys f165459c;

    /* JADX INFO: renamed from: d */
    public boolean f165460d = false;

    /* JADX INFO: renamed from: e */
    public boolean f165461e = false;

    /* JADX INFO: renamed from: f */
    public boolean f165462f = false;

    /* JADX INFO: renamed from: g */
    public VText f165463g;

    /* JADX INFO: renamed from: h */
    public View f165464h;

    public rys(LiveSquareTopButtonLiveView liveSquareTopButtonLiveView) {
        this.f165457a = liveSquareTopButtonLiveView.f45880b;
        this.f165458b = liveSquareTopButtonLiveView.f45882d;
        this.f165463g = liveSquareTopButtonLiveView.f45881c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m183641f(View view) {
        this.f165459c.m169907s3();
        this.f165462f = false;
        bnl0.m105524M(this.f165458b, false);
        this.f165459c.m169900k3(view);
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
        return this.f165459c.getAct();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(oys oysVar) {
        this.f165459c = oysVar;
    }

    /* JADX INFO: renamed from: d */
    public void m183643d(boolean z) {
        if (!z || this.f165460d) {
            bnl0.m105524M(this.f165458b, false);
            bnl0.m105524M(this.f165464h, false);
        } else {
            bnl0.m105524M(this.f165458b, this.f165462f);
            bnl0.m105524M(this.f165464h, this.f165461e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final View m183644e() {
        View view = this.f165464h;
        if (view != null) {
            return view;
        }
        BLiveStartBtnConfig bLiveStartBtnConfigM203726s5 = tbs.f172989b.m203726s5();
        if (bLiveStartBtnConfigM203726s5 == null || TextUtils.isEmpty(bLiveStartBtnConfigM203726s5.text)) {
            this.f165464h = this.f165457a;
            this.f165463g.setVisibility(8);
            this.f165457a.setVisibility(0);
        } else {
            VText vText = this.f165463g;
            this.f165464h = vText;
            vText.setVisibility(0);
            this.f165457a.setVisibility(8);
            this.f165463g.setText(bLiveStartBtnConfigM203726s5.text);
            if (!TextUtils.isEmpty(bLiveStartBtnConfigM203726s5.textColor)) {
                this.f165463g.setTextColor(n3d0.m161283g(bLiveStartBtnConfigM203726s5.textColor));
            }
            if (!TextUtils.isEmpty(bLiveStartBtnConfigM203726s5.backgroundColor)) {
                ((GradientDrawable) this.f165463g.getBackground()).setColor(n3d0.m161283g(bLiveStartBtnConfigM203726s5.backgroundColor));
            }
        }
        return this.f165464h;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m183645i(String str) {
        izs.m142868s("context_square", this.f165457a, str);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m183646j(BLiveTapBarStartLiveConfig bLiveTapBarStartLiveConfig) {
        if (bLiveTapBarStartLiveConfig == null) {
            return;
        }
        xau.m209904n(bLiveTapBarStartLiveConfig.icon, new y20() { // from class: l.qys
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160181a.m183645i((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m183647k(boolean z) {
        boolean z2 = false;
        if (this.f165460d) {
            bnl0.m105524M(this.f165464h, false);
            bnl0.m105524M(this.f165458b, false);
            return;
        }
        this.f165462f = z;
        View view = this.f165458b;
        if (z && bnl0.m105529O0(this.f165464h)) {
            z2 = true;
        }
        bnl0.m105524M(view, z2);
    }

    /* JADX INFO: renamed from: l */
    public void m183648l(boolean z) {
        boolean z2 = this.f165460d;
        View view = this.f165464h;
        if (!z2) {
            bnl0.m105524M(view, z);
        } else {
            bnl0.m105524M(view, false);
            bnl0.m105524M(this.f165458b, false);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m183649r() {
        m183644e();
        ynp0.m216916A(new View.OnClickListener() { // from class: l.pys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154687a.m183641f(view);
            }
        }, this.f165464h);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
