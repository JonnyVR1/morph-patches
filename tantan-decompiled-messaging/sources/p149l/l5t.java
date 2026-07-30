package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class l5t extends LiveMenuDialogHolder<k610> {

    /* JADX INFO: renamed from: k */
    public LinearLayout f126198k;

    /* JADX INFO: renamed from: l */
    public VText f126199l;

    /* JADX INFO: renamed from: m */
    public VText f126200m;

    /* JADX INFO: renamed from: n */
    public VImage f126201n;

    /* JADX INFO: renamed from: o */
    public VText f126202o;

    public l5t(Act act, @NonNull k610 k610Var) {
        super(t6c0.f168393j4, act, k610Var, j2g0.m139459f());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return m148659H().getContext();
    }

    /* JADX INFO: renamed from: F */
    public void m148657F(ViewGroup viewGroup) {
        this.f126198k = (LinearLayout) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f126199l = vText;
        String str = vText == null ? "_title" : null;
        VText vText2 = (VText) viewGroup.getChildAt(1);
        this.f126200m = vText2;
        if (vText2 == null) {
            str = "_content";
        }
        VImage vImage = (VImage) viewGroup.getChildAt(2);
        this.f126201n = vImage;
        if (vImage == null) {
            str = "_image";
        }
        VText vText3 = (VText) viewGroup.getChildAt(3);
        this.f126202o = vText3;
        if (vText3 == null) {
            str = "_sure";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: H */
    public LinearLayout m148659H() {
        return this.f126198k;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168393j4, viewGroup, false);
        m148657F((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m148657F((ViewGroup) view);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(k610 k610Var) {
    }
}
