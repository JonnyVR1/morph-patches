package p149l;

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
import com.p046p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class xxn0 implements s7m<txn0> {

    /* JADX INFO: renamed from: a */
    public View f194886a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f194887b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f194888c;

    /* JADX INFO: renamed from: d */
    public VImage f194889d;

    /* JADX INFO: renamed from: e */
    public VText f194890e;

    /* JADX INFO: renamed from: f */
    public VText f194891f;

    /* JADX INFO: renamed from: g */
    public View f194892g;

    /* JADX INFO: renamed from: h */
    public SvgAndImageView f194893h;

    /* JADX INFO: renamed from: i */
    public VText f194894i;

    /* JADX INFO: renamed from: j */
    public VText f194895j;

    /* JADX INFO: renamed from: k */
    public Dialog f194896k;

    /* JADX INFO: renamed from: l */
    public txn0 f194897l;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m211523i(View view) {
        m211528f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m211524j(View view) {
        m211528f();
    }

    /* JADX INFO: renamed from: r */
    private void m211525r() {
        if (this.f194896k == null) {
            View viewM211526d = m211526d(LayoutInflater.from(this.f194897l.act()), null);
            this.f194896k = new byr(this.f194897l, viewM211526d);
            xdl0.m208329E0(this.f194889d, new View.OnClickListener() { // from class: l.uxn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f178751a.m211523i(view);
                }
            });
            xdl0.m208329E0(this.f194886a, new View.OnClickListener() { // from class: l.vxn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f183468a.m211524j(view);
                }
            });
            mep0.m154301c1(this.f194887b, 0, 0, 0, -t100.m186890d(24.0f), t100.m186890d(24.0f));
            ejj ejjVar = new ejj(viewM211526d.getContext().getResources());
            ejjVar.m116892v(ftd0.f99185i);
            this.f194893h.getDraweeView().setHierarchy(ejjVar.m116872a());
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public View m211526d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yxn0.m216467b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(txn0 txn0Var) {
        this.f194897l = txn0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m211528f() {
        Dialog dialog = this.f194896k;
        if (dialog != null && dialog.isShowing()) {
            this.f194896k.dismiss();
        }
        this.f194893h.m77474a();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m211529k(BLiveIntlMedalWallItem bLiveIntlMedalWallItem, View view) {
        this.f194897l.m190962J3(bLiveIntlMedalWallItem.gotoUrl);
    }

    /* JADX INFO: renamed from: l */
    public final void m211530l(final BLiveIntlMedalWallItem bLiveIntlMedalWallItem) {
        if (bLiveIntlMedalWallItem.isLight()) {
            xdl0.m208344M(this.f194895j, true);
            this.f194895j.setText(bLiveIntlMedalWallItem.getDescribe);
            this.f194893h.getDraweeView().clearColorFilter();
            this.f194894i.setEnabled(true);
        } else {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.f194893h.getDraweeView().setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.f194894i.setEnabled(false);
            xdl0.m208344M(this.f194895j, false);
        }
        xdl0.m208344M(this.f194891f, bLiveIntlMedalWallItem.isHaveLightButton());
        hxs.m133406s("context_single_room", this.f194888c, ydt.f197610M);
        this.f194890e.setText(bLiveIntlMedalWallItem.name);
        this.f194894i.setText(bLiveIntlMedalWallItem.describe);
        this.f194891f.setEnabled(true ^ bLiveIntlMedalWallItem.isOver());
        if (!bLiveIntlMedalWallItem.isOver() && !TextUtils.isEmpty(bLiveIntlMedalWallItem.gotoUrl)) {
            xdl0.m208329E0(this.f194891f, new View.OnClickListener() { // from class: l.wxn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f188498a.m211529k(bLiveIntlMedalWallItem, view);
                }
            });
            this.f194891f.setText(R$string.f47154bi);
        } else if (bLiveIntlMedalWallItem.isOver()) {
            this.f194891f.setText(R$string.f47110Zh);
        }
        String str = TextUtils.isEmpty(bLiveIntlMedalWallItem.dynamicIcon) ? bLiveIntlMedalWallItem.icon : bLiveIntlMedalWallItem.dynamicIcon;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zEndsWith = str.endsWith(".svga");
        SvgAndImageView svgAndImageView = this.f194893h;
        if (zEndsWith) {
            svgAndImageView.m77478e("", str);
        } else {
            svgAndImageView.m77478e(str, "");
        }
    }

    /* JADX INFO: renamed from: m */
    public void m211531m(BLiveIntlMedalWallItem bLiveIntlMedalWallItem) {
        m211525r();
        m211530l(bLiveIntlMedalWallItem);
        Dialog dialog = this.f194896k;
        if (dialog == null || dialog.isShowing()) {
            return;
        }
        this.f194896k.show();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
