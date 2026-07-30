package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p1.mobile.android.app.Act;
import l.jfd0;
import l.k610;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class l5t extends LiveMenuDialogHolder<k610> {

    /* JADX INFO: renamed from: k */
    public LinearLayout f14680k;

    /* JADX INFO: renamed from: l */
    public VText f14681l;

    /* JADX INFO: renamed from: m */
    public VText f14682m;

    /* JADX INFO: renamed from: n */
    public VImage f14683n;

    /* JADX INFO: renamed from: o */
    public VText f14684o;

    public l5t(Act act, @NonNull k610 k610Var) {
        super(t6c0.f19889j4, act, k610Var, j2g0.m15580f());
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return m17014H().getContext();
    }

    /* JADX INFO: renamed from: F */
    public void m17012F(ViewGroup viewGroup) {
        this.f14680k = (LinearLayout) viewGroup;
        VText childAt = viewGroup.getChildAt(0);
        this.f14681l = childAt;
        String str = childAt == null ? "_title" : null;
        VText childAt2 = viewGroup.getChildAt(1);
        this.f14682m = childAt2;
        if (childAt2 == null) {
            str = "_content";
        }
        VImage childAt3 = viewGroup.getChildAt(2);
        this.f14683n = childAt3;
        if (childAt3 == null) {
            str = "_image";
        }
        VText childAt4 = viewGroup.getChildAt(3);
        this.f14684o = childAt4;
        if (childAt4 == null) {
            str = "_sure";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: H */
    public LinearLayout m17014H() {
        return this.f14680k;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19889j4, viewGroup, false);
        m17012F((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        super.mo5214m(view);
        m17012F((ViewGroup) view);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(k610 k610Var) {
    }
}
