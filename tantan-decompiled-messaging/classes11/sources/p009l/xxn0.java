package p009l;

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
import com.p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.virtual.roomInfo.view.SvgAndImageView;
import l.byr;
import l.ejj;
import l.ftd0;
import l.hxs;
import l.mep0;
import l.s7m;
import l.t100;
import l.xdl0;
import l.ydt;
import l.yxn0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xxn0 implements s7m<txn0> {

    /* JADX INFO: renamed from: a */
    public View f22786a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f22787b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f22788c;

    /* JADX INFO: renamed from: d */
    public VImage f22789d;

    /* JADX INFO: renamed from: e */
    public VText f22790e;

    /* JADX INFO: renamed from: f */
    public VText f22791f;

    /* JADX INFO: renamed from: g */
    public View f22792g;

    /* JADX INFO: renamed from: h */
    public SvgAndImageView f22793h;

    /* JADX INFO: renamed from: i */
    public VText f22794i;

    /* JADX INFO: renamed from: j */
    public VText f22795j;

    /* JADX INFO: renamed from: k */
    public Dialog f22796k;

    /* JADX INFO: renamed from: l */
    public txn0 f22797l;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m25054i(View view) {
        m25060f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m25055j(View view) {
        m25060f();
    }

    /* JADX INFO: renamed from: r */
    private void m25056r() {
        if (this.f22796k == null) {
            View viewM25058d = m25058d(LayoutInflater.from(this.f22797l.act()), null);
            this.f22796k = new byr(this.f22797l, viewM25058d);
            xdl0.E0(this.f22789d, new View.OnClickListener() { // from class: l.uxn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21364a.m25054i(view);
                }
            });
            xdl0.E0(this.f22786a, new View.OnClickListener() { // from class: l.vxn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21817a.m25055j(view);
                }
            });
            mep0.c1(this.f22787b, 0, 0, 0, -t100.d(24.0f), t100.d(24.0f));
            ejj ejjVar = new ejj(viewM25058d.getContext().getResources());
            ejjVar.v(ftd0.i);
            this.f22793h.getDraweeView().setHierarchy(ejjVar.a());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m25057C0() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public View m25058d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yxn0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m25061i1(txn0 txn0Var) {
        this.f22797l = txn0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m25060f() {
        Dialog dialog = this.f22796k;
        if (dialog != null && dialog.isShowing()) {
            this.f22796k.dismiss();
        }
        this.f22793h.a();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m25062k(BLiveIntlMedalWallItem bLiveIntlMedalWallItem, View view) {
        this.f22797l.m22692J3(bLiveIntlMedalWallItem.gotoUrl);
    }

    /* JADX INFO: renamed from: l */
    public final void m25063l(final BLiveIntlMedalWallItem bLiveIntlMedalWallItem) {
        if (bLiveIntlMedalWallItem.isLight()) {
            xdl0.M(this.f22795j, true);
            this.f22795j.setText(bLiveIntlMedalWallItem.getDescribe);
            this.f22793h.getDraweeView().clearColorFilter();
            this.f22794i.setEnabled(true);
        } else {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.f22793h.getDraweeView().setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.f22794i.setEnabled(false);
            xdl0.M(this.f22795j, false);
        }
        xdl0.M(this.f22791f, bLiveIntlMedalWallItem.isHaveLightButton());
        hxs.s("context_single_room", this.f22788c, ydt.M);
        this.f22790e.setText(bLiveIntlMedalWallItem.name);
        this.f22794i.setText(bLiveIntlMedalWallItem.describe);
        this.f22791f.setEnabled(true ^ bLiveIntlMedalWallItem.isOver());
        if (!bLiveIntlMedalWallItem.isOver() && !TextUtils.isEmpty(bLiveIntlMedalWallItem.gotoUrl)) {
            xdl0.E0(this.f22791f, new View.OnClickListener() { // from class: l.wxn0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22360a.m25062k(bLiveIntlMedalWallItem, view);
                }
            });
            this.f22791f.setText(R.string.bi);
        } else if (bLiveIntlMedalWallItem.isOver()) {
            this.f22791f.setText(R.string.Zh);
        }
        String str = TextUtils.isEmpty(bLiveIntlMedalWallItem.dynamicIcon) ? bLiveIntlMedalWallItem.icon : bLiveIntlMedalWallItem.dynamicIcon;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zEndsWith = str.endsWith(".svga");
        SvgAndImageView svgAndImageView = this.f22793h;
        if (zEndsWith) {
            svgAndImageView.e("", str);
        } else {
            svgAndImageView.e(str, "");
        }
    }

    /* JADX INFO: renamed from: m */
    public void m25064m(BLiveIntlMedalWallItem bLiveIntlMedalWallItem) {
        m25056r();
        m25063l(bLiveIntlMedalWallItem);
        Dialog dialog = this.f22796k;
        if (dialog == null || dialog.isShowing()) {
            return;
        }
        this.f22796k.show();
    }

    public void destroy() {
    }
}
