package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class m7t extends LiveMenuDialogHolder<ue10> {

    /* JADX INFO: renamed from: k */
    public LinearLayout f135102k;

    /* JADX INFO: renamed from: l */
    public VText f135103l;

    /* JADX INFO: renamed from: m */
    public VText f135104m;

    /* JADX INFO: renamed from: n */
    public VImage f135105n;

    /* JADX INFO: renamed from: o */
    public VText f135106o;

    public m7t(Act act, @NonNull ue10 ue10Var) {
        super(yec0.f199125j4, act, ue10Var, qag0.m175925f());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return m157291H().getContext();
    }

    /* JADX INFO: renamed from: F */
    public void m157289F(ViewGroup viewGroup) {
        this.f135102k = (LinearLayout) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f135103l = vText;
        String str = vText == null ? "_title" : null;
        VText vText2 = (VText) viewGroup.getChildAt(1);
        this.f135104m = vText2;
        if (vText2 == null) {
            str = "_content";
        }
        VImage vImage = (VImage) viewGroup.getChildAt(2);
        this.f135105n = vImage;
        if (vImage == null) {
            str = "_image";
        }
        VText vText3 = (VText) viewGroup.getChildAt(3);
        this.f135106o = vText3;
        if (vText3 == null) {
            str = "_sure";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: H */
    public LinearLayout m157291H() {
        return this.f135102k;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199125j4, viewGroup, false);
        m157289F((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m157289F((ViewGroup) view);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ue10 ue10Var) {
    }
}
