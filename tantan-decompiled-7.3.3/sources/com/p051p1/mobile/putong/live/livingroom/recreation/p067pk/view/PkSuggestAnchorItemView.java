package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p051p1.mobile.putong.live.base.data.BLivePkSuggestAnchor;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.dum;
import p153l.i4g0;
import p153l.izs;
import p153l.na80;
import p153l.pf60;
import p153l.qa00;
import p153l.z20;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class PkSuggestAnchorItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f52577a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f52578b;

    /* JADX INFO: renamed from: c */
    public TextView f52579c;

    /* JADX INFO: renamed from: d */
    public TextView f52580d;

    /* JADX INFO: renamed from: e */
    public TextView f52581e;

    /* JADX INFO: renamed from: f */
    public TextView f52582f;

    public PkSuggestAnchorItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m77400c(View view) {
        na80.m162060a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m77401d(dum<?> dumVar, final BLivePkSuggestAnchor bLivePkSuggestAnchor, final z20<BLivePkSuggestAnchor, BLivePkInviteSource> z20Var) {
        this.f52579c.setText(bLivePkSuggestAnchor.userName);
        izs.m142869t("context_single_room", this.f52578b, bLivePkSuggestAnchor.avatar, qa00.m175859d(55.0f));
        bnl0.m105524M(this.f52580d, true);
        this.f52580d.setText("探探ID:" + bLivePkSuggestAnchor.publicId);
        bnl0.m105524M(this.f52577a, false);
        bnl0.m105524M(this.f52581e, false);
        m77402e(bLivePkSuggestAnchor);
        bnl0.m105509E0(this.f52581e, new View.OnClickListener() { // from class: l.ma80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z20 z20Var2 = z20Var;
                BLivePkSuggestAnchor bLivePkSuggestAnchor2 = bLivePkSuggestAnchor;
                z20Var2.call(bLivePkSuggestAnchor2, bLivePkSuggestAnchor2.source);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m77402e(BLivePkSuggestAnchor bLivePkSuggestAnchor) {
        boolean zEquals = TextUtils.equals(bLivePkSuggestAnchor.userId, zrv.f205799a.m207631D0());
        TextView textView = this.f52582f;
        if (zEquals) {
            bnl0.m105524M(textView, false);
            bnl0.m105524M(this.f52581e, false);
            return;
        }
        bnl0.m105524M(textView, false);
        if (!bLivePkSuggestAnchor.isOnlive) {
            this.f52582f.setText("暂未开播");
            bnl0.m105524M(this.f52582f, true);
        } else if (bLivePkSuggestAnchor.refusePk) {
            this.f52582f.setText("不接受邀请");
            bnl0.m105524M(this.f52582f, true);
        } else if (!bLivePkSuggestAnchor.isPking) {
            bnl0.m105524M(this.f52581e, true);
        } else {
            this.f52582f.setText("正在PK");
            bnl0.m105524M(this.f52582f, true);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m77403f(dum<?> dumVar, final BLivePkSuggestAnchor bLivePkSuggestAnchor, final z20<BLivePkSuggestAnchor, BLivePkInviteSource> z20Var) {
        this.f52579c.setText(bLivePkSuggestAnchor.userName);
        izs.m142869t("context_single_room", this.f52578b, bLivePkSuggestAnchor.avatar, qa00.m175859d(55.0f));
        bnl0.m105524M(this.f52580d, false);
        bnl0.m105524M(this.f52581e, false);
        bnl0.m105524M(this.f52577a, false);
        m77402e(bLivePkSuggestAnchor);
        if (bLivePkSuggestAnchor.source.equals("hour")) {
            bnl0.m105524M(this.f52577a, true);
            this.f52577a.setText(String.valueOf(bLivePkSuggestAnchor.rank));
        }
        bnl0.m105509E0(this.f52581e, new View.OnClickListener() { // from class: l.la80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z20 z20Var2 = z20Var;
                BLivePkSuggestAnchor bLivePkSuggestAnchor2 = bLivePkSuggestAnchor;
                z20Var2.call(bLivePkSuggestAnchor2, bLivePkSuggestAnchor2.source);
            }
        });
        i4g0.m138492A("e_pk_invite_button", "p_anchor_live_room", pf60.m172085a("anchorId", dumVar.f90822h.m168526j0()), pf60.m172085a("liveId", dumVar.f90822h.m202191k()), pf60.m172085a("other_user_id", bLivePkSuggestAnchor.userId), pf60.m172085a("page_tab_type", bLivePkSuggestAnchor.source.toString()));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77400c(this);
        this.f52577a.setTypeface(Typeface.defaultFromStyle(1));
    }

    public PkSuggestAnchorItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkSuggestAnchorItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
