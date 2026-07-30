package p153l;

import android.app.Dialog;
import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class b7o0 implements iam<x6o0> {

    /* JADX INFO: renamed from: a */
    public View f75315a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f75316b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f75317c;

    /* JADX INFO: renamed from: d */
    public VImage f75318d;

    /* JADX INFO: renamed from: e */
    public VText f75319e;

    /* JADX INFO: renamed from: f */
    public VText f75320f;

    /* JADX INFO: renamed from: g */
    public View f75321g;

    /* JADX INFO: renamed from: h */
    public SvgAndImageView f75322h;

    /* JADX INFO: renamed from: i */
    public VText f75323i;

    /* JADX INFO: renamed from: j */
    public VText f75324j;

    /* JADX INFO: renamed from: k */
    public Dialog f75325k;

    /* JADX INFO: renamed from: l */
    public x6o0 f75326l;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m102860i(View view) {
        m102865f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m102861j(View view) {
        m102865f();
    }

    /* JADX INFO: renamed from: r */
    private void m102862r() {
        if (this.f75325k == null) {
            View viewM102863d = m102863d(LayoutInflater.from(this.f75326l.act()), null);
            this.f75325k = new c0s(this.f75326l, viewM102863d);
            bnl0.m105509E0(this.f75318d, new View.OnClickListener() { // from class: l.y6o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f197700a.m102860i(view);
                }
            });
            bnl0.m105509E0(this.f75315a, new View.OnClickListener() { // from class: l.z6o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f203174a.m102861j(view);
                }
            });
            qnp0.m177260c1(this.f75316b, 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
            xlj xljVar = new xlj(viewM102863d.getContext().getResources());
            xljVar.m211658v(h1e0.f107452i);
            this.f75322h.getDraweeView().setHierarchy(xljVar.m211638a());
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public View m102863d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c7o0.m108311b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(x6o0 x6o0Var) {
        this.f75326l = x6o0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m102865f() {
        Dialog dialog = this.f75325k;
        if (dialog != null && dialog.isShowing()) {
            this.f75325k.dismiss();
        }
        this.f75322h.m78657a();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m102866k(BLiveIntlMedalWallItem bLiveIntlMedalWallItem, View view) {
        this.f75326l.m209509J3(bLiveIntlMedalWallItem.gotoUrl);
    }

    /* JADX INFO: renamed from: l */
    public final void m102867l(final BLiveIntlMedalWallItem bLiveIntlMedalWallItem) {
        if (bLiveIntlMedalWallItem.isLight()) {
            bnl0.m105524M(this.f75324j, true);
            this.f75324j.setText(bLiveIntlMedalWallItem.getDescribe);
            this.f75322h.getDraweeView().clearColorFilter();
            this.f75323i.setEnabled(true);
        } else {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.f75322h.getDraweeView().setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.f75323i.setEnabled(false);
            bnl0.m105524M(this.f75324j, false);
        }
        bnl0.m105524M(this.f75320f, bLiveIntlMedalWallItem.isHaveLightButton());
        izs.m142868s("context_single_room", this.f75317c, zft.f204205M);
        this.f75319e.setText(bLiveIntlMedalWallItem.name);
        this.f75323i.setText(bLiveIntlMedalWallItem.describe);
        this.f75320f.setEnabled(true ^ bLiveIntlMedalWallItem.isOver());
        if (!bLiveIntlMedalWallItem.isOver() && !TextUtils.isEmpty(bLiveIntlMedalWallItem.gotoUrl)) {
            bnl0.m105509E0(this.f75320f, new View.OnClickListener() { // from class: l.a7o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f68831a.m102866k(bLiveIntlMedalWallItem, view);
                }
            });
            this.f75320f.setText(R$string.f48002bi);
        } else if (bLiveIntlMedalWallItem.isOver()) {
            this.f75320f.setText(R$string.f47958Zh);
        }
        String str = TextUtils.isEmpty(bLiveIntlMedalWallItem.dynamicIcon) ? bLiveIntlMedalWallItem.icon : bLiveIntlMedalWallItem.dynamicIcon;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zEndsWith = str.endsWith(".svga");
        SvgAndImageView svgAndImageView = this.f75322h;
        if (zEndsWith) {
            svgAndImageView.m78661e("", str);
        } else {
            svgAndImageView.m78661e(str, "");
        }
    }

    /* JADX INFO: renamed from: m */
    public void m102868m(BLiveIntlMedalWallItem bLiveIntlMedalWallItem) {
        m102862r();
        m102867l(bLiveIntlMedalWallItem);
        Dialog dialog = this.f75325k;
        if (dialog == null || dialog.isShowing()) {
            return;
        }
        this.f75325k.show();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
