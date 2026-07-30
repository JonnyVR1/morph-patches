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
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class fyn implements s7m<cyn> {

    /* JADX INFO: renamed from: a */
    public final VDraweeView f99879a;

    /* JADX INFO: renamed from: b */
    public final View f99880b;

    /* JADX INFO: renamed from: c */
    public cyn f99881c;

    /* JADX INFO: renamed from: d */
    public boolean f99882d = false;

    /* JADX INFO: renamed from: e */
    public boolean f99883e = false;

    /* JADX INFO: renamed from: f */
    public boolean f99884f = false;

    /* JADX INFO: renamed from: g */
    public VText f99885g;

    /* JADX INFO: renamed from: h */
    public View f99886h;

    public fyn(VDraweeView vDraweeView, VText vText, View view) {
        this.f99879a = vDraweeView;
        this.f99880b = view;
        this.f99885g = vText;
    }

    /* JADX INFO: renamed from: e */
    private View m123777e() {
        View view = this.f99886h;
        if (view != null) {
            return view;
        }
        BLiveStartBtnConfig bLiveStartBtnConfigM195939s5 = s9s.f163228b.m195939s5();
        if (bLiveStartBtnConfigM195939s5 == null || TextUtils.isEmpty(bLiveStartBtnConfigM195939s5.text)) {
            this.f99886h = this.f99879a;
            this.f99885g.setVisibility(8);
            this.f99879a.setVisibility(0);
        } else {
            VText vText = this.f99885g;
            this.f99886h = vText;
            vText.setVisibility(0);
            this.f99879a.setVisibility(8);
            this.f99885g.setText(bLiveStartBtnConfigM195939s5.text);
            if (!TextUtils.isEmpty(bLiveStartBtnConfigM195939s5.textColor)) {
                this.f99885g.setTextColor(kvc0.m147358g(bLiveStartBtnConfigM195939s5.textColor));
            }
            if (!TextUtils.isEmpty(bLiveStartBtnConfigM195939s5.backgroundColor)) {
                ((GradientDrawable) this.f99885g.getBackground()).setColor(kvc0.m147358g(bLiveStartBtnConfigM195939s5.backgroundColor));
            }
        }
        return this.f99886h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m123778f(View view) {
        this.f99881c.m109384t3();
        this.f99884f = false;
        xdl0.m208344M(this.f99880b, false);
        this.f99881c.m109381n3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m123779i(String str) {
        hxs.m133406s("context_square", this.f99879a, str);
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
        return this.f99881c.getAct();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cyn cynVar) {
        this.f99881c = cynVar;
    }

    /* JADX INFO: renamed from: d */
    public void m123781d(boolean z) {
        if (!z || this.f99882d) {
            xdl0.m208344M(this.f99880b, false);
            xdl0.m208344M(this.f99886h, false);
        } else {
            xdl0.m208344M(this.f99880b, this.f99884f);
            xdl0.m208344M(this.f99886h, this.f99883e);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m123782j(BLiveTapBarStartLiveConfig bLiveTapBarStartLiveConfig) {
        if (bLiveTapBarStartLiveConfig == null) {
            return;
        }
        w8u.m202211n(bLiveTapBarStartLiveConfig.icon, new e30() { // from class: l.eyn
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93772a.m123779i((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m123783k(boolean z) {
        boolean z2 = false;
        if (this.f99882d) {
            xdl0.m208344M(this.f99886h, false);
            xdl0.m208344M(this.f99880b, false);
            return;
        }
        this.f99884f = z;
        View view = this.f99880b;
        if (z && xdl0.m208349O0(this.f99886h)) {
            z2 = true;
        }
        xdl0.m208344M(view, z2);
    }

    /* JADX INFO: renamed from: l */
    public void m123784l(boolean z) {
        boolean z2 = this.f99882d;
        View view = this.f99886h;
        if (!z2) {
            xdl0.m208344M(view, z);
        } else {
            xdl0.m208344M(view, false);
            xdl0.m208344M(this.f99880b, false);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m123785r() {
        m123777e();
        uep0.m193306A(new View.OnClickListener() { // from class: l.dyn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88410a.m123778f(view);
            }
        }, this.f99886h);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
