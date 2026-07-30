package p153l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.CommonMedalView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class o9d0 {

    /* JADX INFO: renamed from: a */
    public ViewGroup f145552a;

    /* JADX INFO: renamed from: b */
    public VText f145553b;

    /* JADX INFO: renamed from: c */
    public VImage f145554c;

    /* JADX INFO: renamed from: d */
    public VImage f145555d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public VDraweeView f145556e;

    /* JADX INFO: renamed from: f */
    public VText f145557f;

    /* JADX INFO: renamed from: g */
    public VText f145558g;

    /* JADX INFO: renamed from: h */
    public VButton f145559h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f145560i;

    /* JADX INFO: renamed from: j */
    public CommonMedalView f145561j;

    /* JADX INFO: renamed from: k */
    public AnimEffectPlayer f145562k;

    /* JADX INFO: renamed from: l */
    public Context f145563l;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m166704a(d9d0 d9d0Var, j9d0 j9d0Var, View view) {
        if (d9d0Var == null || d9d0Var.f85760e.isGray()) {
            return;
        }
        if (d9d0Var.m115020U()) {
            o1j0.m165651y(xau.m209911u(R$string.f45052s0, String.valueOf(d9d0Var.m115017Q())));
            return;
        }
        if (d9d0Var.m115019T()) {
            o1j0.m165649w(R$string.f45049r0);
            return;
        }
        if (d9d0Var.m115015L()) {
            o1j0.m165649w(R$string.f45046q0);
        } else if (d9d0Var.f85760e.isLocked()) {
            o1j0.m165649w(R$string.f44992X0);
        } else if (j9d0Var != null) {
            j9d0Var.mo143936a(d9d0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m166705b(j9d0 j9d0Var, d9d0 d9d0Var, View view) {
        if (j9d0Var != null) {
            j9d0Var.mo143938c(d9d0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m166706c(j9d0 j9d0Var, d9d0 d9d0Var, View view) {
        if (j9d0Var == null || d9d0Var == null || TextUtils.isEmpty(d9d0Var.f85760e.jumpUrl)) {
            return;
        }
        j9d0Var.mo143937b(d9d0Var.f85760e.jumpUrl);
    }

    /* JADX INFO: renamed from: e */
    public static String m166707e(Context context, BLiveRightItem bLiveRightItem) {
        if (bLiveRightItem.permanent) {
            return context.getString(R$string.f44988V0);
        }
        return bLiveRightItem.isGray() ? context.getString(R$string.f44986U0) : kdu.m149276U(bLiveRightItem.periodEndTimeInSeconds);
    }

    /* JADX INFO: renamed from: d */
    public void m166708d(c5m c5mVar) {
        this.f145552a = c5mVar.getRightContentView();
        this.f145553b = c5mVar.getRightDurationView();
        this.f145554c = c5mVar.getRightArrowView();
        this.f145555d = c5mVar.getRightLockIconView();
        this.f145556e = c5mVar.getRightIconView();
        this.f145557f = c5mVar.getRightTitleView();
        this.f145558g = c5mVar.getRightDescView();
        this.f145559h = c5mVar.getCraftButton();
        this.f145560i = c5mVar.getDescLayout();
        this.f145561j = c5mVar.getCommonIconView();
        this.f145562k = c5mVar.getDynamicIcon();
        this.f145563l = this.f145552a.getContext();
    }

    /* JADX INFO: renamed from: f */
    public final void m166709f(d9d0 d9d0Var) {
        BLiveRightItem bLiveRightItem = d9d0Var.f85760e;
        this.f145553b.setText(m166707e(this.f145563l, bLiveRightItem));
        int color = Color.parseColor(bLiveRightItem.isGray() ? "#999999" : "#212121");
        this.f145557f.setTextColor(color);
        this.f145553b.setTextColor(color);
        VDraweeView vDraweeView = this.f145556e;
        if (vDraweeView != null) {
            vDraweeView.setAlpha(bLiveRightItem.isGray() ? 0.5f : 1.0f);
        }
        AnimEffectPlayer animEffectPlayer = this.f145562k;
        if (animEffectPlayer != null) {
            animEffectPlayer.setAlpha(bLiveRightItem.isGray() ? 0.5f : 1.0f);
        }
        Drawable drawable = this.f145563l.getResources().getDrawable(bLiveRightItem.isGray() ? mbc0.f135703s : mbc0.f135659S);
        drawable.setBounds(0, 0, qa00.m175859d(20.0f), qa00.m175859d(20.0f));
        this.f145553b.setCompoundDrawables(drawable, null, null, null);
    }

    /* JADX INFO: renamed from: g */
    public void m166710g(d9d0 d9d0Var) {
        this.f145552a.setBackgroundResource(d9d0Var.m115016N() ? mbc0.f135641A : mbc0.f135713z);
    }

    /* JADX INFO: renamed from: h */
    public final void m166711h(final d9d0 d9d0Var, final j9d0 j9d0Var) {
        this.f145552a.setOnClickListener(new View.OnClickListener() { // from class: l.m9d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o9d0.m166704a(d9d0Var, j9d0Var, view);
            }
        });
        this.f145558g.setOnClickListener(new View.OnClickListener() { // from class: l.n9d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o9d0.m166706c(j9d0Var, d9d0Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m166712i(d9d0 d9d0Var) {
        BLiveRightItem bLiveRightItem = d9d0Var.f85760e;
        this.f145557f.setText(bpj.m105844a(bLiveRightItem.rightName));
        this.f145558g.setText(bpj.m105844a(bLiveRightItem.description));
        AnimEffectPlayer animEffectPlayer = this.f145562k;
        if (animEffectPlayer != null) {
            bnl0.m105524M(animEffectPlayer, false);
        }
        if (this.f145556e != null && !xau.m209916z(bLiveRightItem.getThumbnailUrl())) {
            this.f145556e.setImageResource(mbc0.f135699q);
            izs.m142868s("context_right_act", this.f145556e, bLiveRightItem.getThumbnailUrl());
        } else if (this.f145562k != null && xau.m209916z(bLiveRightItem.getThumbnailUrl())) {
            bnl0.m105524M(this.f145562k, true);
            this.f145562k.mo69685l(bLiveRightItem.getThumbnailUrl(), -1, null);
        } else {
            CommonMedalView commonMedalView = this.f145561j;
            if (commonMedalView != null) {
                biv.m104524i(commonMedalView, qa00.m175859d(21.0f), bLiveRightItem.thumbnailUrl, bLiveRightItem.dynamicUrl);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m166713j(final d9d0 d9d0Var, final j9d0 j9d0Var) {
        if (d9d0Var == null || !d9d0Var.m115015L()) {
            this.f145559h.setVisibility(8);
            VText vText = this.f145557f;
            int i = qa00.f156323j;
            bnl0.m105539W(vText, i);
            bnl0.m105539W(this.f145560i, i);
            return;
        }
        this.f145559h.setVisibility(0);
        int iM175859d = qa00.m175859d(76.0f);
        bnl0.m105539W(this.f145557f, iM175859d);
        bnl0.m105539W(this.f145560i, iM175859d);
        this.f145559h.setOnClickListener(new View.OnClickListener() { // from class: l.l9d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o9d0.m166705b(j9d0Var, d9d0Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final void m166714k(BLiveRightItem bLiveRightItem) {
        Drawable drawable = !TextUtils.isEmpty(bLiveRightItem.jumpUrl) ? this.f145563l.getResources().getDrawable(mbc0.f135644D) : null;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        this.f145558g.setCompoundDrawables(null, null, drawable, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m166715l(d9d0 d9d0Var) {
        ViewGroup.LayoutParams layoutParams = this.f145552a.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = d9d0Var.mo103094R();
            marginLayoutParams.leftMargin = d9d0Var.mo103092O();
            marginLayoutParams.rightMargin = d9d0Var.mo103093P();
        }
        this.f145552a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: m */
    public final void m166716m(d9d0 d9d0Var) {
        m166717n(d9d0Var);
        m166709f(d9d0Var);
    }

    /* JADX INFO: renamed from: n */
    public final void m166717n(d9d0 d9d0Var) {
        int i;
        boolean zM115014K = d9d0Var.m115014K();
        bnl0.m105524M(this.f145554c, zM115014K);
        bnl0.m105524M(this.f145555d, false);
        if (zM115014K) {
            return;
        }
        if (d9d0Var.m115018S()) {
            i = mbc0.f135654N;
        } else if (d9d0Var.m115012I()) {
            i = mbc0.f135651K;
        } else {
            i = d9d0Var.m115013J() ? mbc0.f135658R : -1;
        }
        VImage vImage = this.f145555d;
        if (i == -1) {
            bnl0.m105524M(vImage, false);
        } else {
            vImage.setImageResource(i);
            bnl0.m105524M(this.f145555d, true);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m166718o(d9d0 d9d0Var, j9d0 j9d0Var) {
        m166711h(d9d0Var, j9d0Var);
        BLiveRightItem bLiveRightItem = d9d0Var.f85760e;
        m166712i(d9d0Var);
        m166714k(bLiveRightItem);
        m166715l(d9d0Var);
        m166710g(d9d0Var);
        m166716m(d9d0Var);
        m166713j(d9d0Var, j9d0Var);
    }
}
