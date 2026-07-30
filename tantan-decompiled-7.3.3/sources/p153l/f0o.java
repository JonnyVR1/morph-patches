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
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class f0o implements iam<c0o> {

    /* JADX INFO: renamed from: a */
    public final VDraweeView f96701a;

    /* JADX INFO: renamed from: b */
    public final View f96702b;

    /* JADX INFO: renamed from: c */
    public c0o f96703c;

    /* JADX INFO: renamed from: d */
    public boolean f96704d = false;

    /* JADX INFO: renamed from: e */
    public boolean f96705e = false;

    /* JADX INFO: renamed from: f */
    public boolean f96706f = false;

    /* JADX INFO: renamed from: g */
    public VText f96707g;

    /* JADX INFO: renamed from: h */
    public View f96708h;

    public f0o(VDraweeView vDraweeView, VText vText, View view) {
        this.f96701a = vDraweeView;
        this.f96702b = view;
        this.f96707g = vText;
    }

    /* JADX INFO: renamed from: e */
    private View m123491e() {
        View view = this.f96708h;
        if (view != null) {
            return view;
        }
        BLiveStartBtnConfig bLiveStartBtnConfigM203726s5 = tbs.f172989b.m203726s5();
        if (bLiveStartBtnConfigM203726s5 == null || TextUtils.isEmpty(bLiveStartBtnConfigM203726s5.text)) {
            this.f96708h = this.f96701a;
            this.f96707g.setVisibility(8);
            this.f96701a.setVisibility(0);
        } else {
            VText vText = this.f96707g;
            this.f96708h = vText;
            vText.setVisibility(0);
            this.f96701a.setVisibility(8);
            this.f96707g.setText(bLiveStartBtnConfigM203726s5.text);
            if (!TextUtils.isEmpty(bLiveStartBtnConfigM203726s5.textColor)) {
                this.f96707g.setTextColor(n3d0.m161283g(bLiveStartBtnConfigM203726s5.textColor));
            }
            if (!TextUtils.isEmpty(bLiveStartBtnConfigM203726s5.backgroundColor)) {
                ((GradientDrawable) this.f96707g.getBackground()).setColor(n3d0.m161283g(bLiveStartBtnConfigM203726s5.backgroundColor));
            }
        }
        return this.f96708h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m123492f(View view) {
        this.f96703c.m107466t3();
        this.f96706f = false;
        bnl0.m105524M(this.f96702b, false);
        this.f96703c.m107463n3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m123493i(String str) {
        izs.m142868s("context_square", this.f96701a, str);
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
        return this.f96703c.getAct();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(c0o c0oVar) {
        this.f96703c = c0oVar;
    }

    /* JADX INFO: renamed from: d */
    public void m123495d(boolean z) {
        if (!z || this.f96704d) {
            bnl0.m105524M(this.f96702b, false);
            bnl0.m105524M(this.f96708h, false);
        } else {
            bnl0.m105524M(this.f96702b, this.f96706f);
            bnl0.m105524M(this.f96708h, this.f96705e);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m123496j(BLiveTapBarStartLiveConfig bLiveTapBarStartLiveConfig) {
        if (bLiveTapBarStartLiveConfig == null) {
            return;
        }
        xau.m209904n(bLiveTapBarStartLiveConfig.icon, new y20() { // from class: l.e0o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91510a.m123493i((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m123497k(boolean z) {
        boolean z2 = false;
        if (this.f96704d) {
            bnl0.m105524M(this.f96708h, false);
            bnl0.m105524M(this.f96702b, false);
            return;
        }
        this.f96706f = z;
        View view = this.f96702b;
        if (z && bnl0.m105529O0(this.f96708h)) {
            z2 = true;
        }
        bnl0.m105524M(view, z2);
    }

    /* JADX INFO: renamed from: l */
    public void m123498l(boolean z) {
        boolean z2 = this.f96704d;
        View view = this.f96708h;
        if (!z2) {
            bnl0.m105524M(view, z);
        } else {
            bnl0.m105524M(view, false);
            bnl0.m105524M(this.f96702b, false);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m123499r() {
        m123491e();
        ynp0.m216916A(new View.OnClickListener() { // from class: l.d0o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84587a.m123492f(view);
            }
        }, this.f96708h);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
