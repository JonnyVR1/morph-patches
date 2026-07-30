package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p046p1.mobile.putong.live.base.data.BLivePkSuggestAnchor;
import p147v.VDraweeView;
import p149l.bsm;
import p149l.f30;
import p149l.h280;
import p149l.hxs;
import p149l.j760;
import p149l.t100;
import p149l.xdl0;
import p149l.ypv;
import p149l.zvf0;

/* JADX INFO: loaded from: classes5.dex */
public class PkSuggestAnchorItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f51729a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f51730b;

    /* JADX INFO: renamed from: c */
    public TextView f51731c;

    /* JADX INFO: renamed from: d */
    public TextView f51732d;

    /* JADX INFO: renamed from: e */
    public TextView f51733e;

    /* JADX INFO: renamed from: f */
    public TextView f51734f;

    public PkSuggestAnchorItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m76217c(View view) {
        h280.m129094a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m76218d(bsm<?> bsmVar, final BLivePkSuggestAnchor bLivePkSuggestAnchor, final f30<BLivePkSuggestAnchor, BLivePkInviteSource> f30Var) {
        this.f51731c.setText(bLivePkSuggestAnchor.userName);
        hxs.m133407t("context_single_room", this.f51730b, bLivePkSuggestAnchor.avatar, t100.m186890d(55.0f));
        xdl0.m208344M(this.f51732d, true);
        this.f51732d.setText("探探ID:" + bLivePkSuggestAnchor.publicId);
        xdl0.m208344M(this.f51729a, false);
        xdl0.m208344M(this.f51733e, false);
        m76219e(bLivePkSuggestAnchor);
        xdl0.m208329E0(this.f51733e, new View.OnClickListener() { // from class: l.g280
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f30 f30Var2 = f30Var;
                BLivePkSuggestAnchor bLivePkSuggestAnchor2 = bLivePkSuggestAnchor;
                f30Var2.call(bLivePkSuggestAnchor2, bLivePkSuggestAnchor2.source);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m76219e(BLivePkSuggestAnchor bLivePkSuggestAnchor) {
        boolean zEquals = TextUtils.equals(bLivePkSuggestAnchor.userId, ypv.f199493a.m199309D0());
        TextView textView = this.f51734f;
        if (zEquals) {
            xdl0.m208344M(textView, false);
            xdl0.m208344M(this.f51733e, false);
            return;
        }
        xdl0.m208344M(textView, false);
        if (!bLivePkSuggestAnchor.isOnlive) {
            this.f51734f.setText("暂未开播");
            xdl0.m208344M(this.f51734f, true);
        } else if (bLivePkSuggestAnchor.refusePk) {
            this.f51734f.setText("不接受邀请");
            xdl0.m208344M(this.f51734f, true);
        } else if (!bLivePkSuggestAnchor.isPking) {
            xdl0.m208344M(this.f51733e, true);
        } else {
            this.f51734f.setText("正在PK");
            xdl0.m208344M(this.f51734f, true);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m76220f(bsm<?> bsmVar, final BLivePkSuggestAnchor bLivePkSuggestAnchor, final f30<BLivePkSuggestAnchor, BLivePkInviteSource> f30Var) {
        this.f51731c.setText(bLivePkSuggestAnchor.userName);
        hxs.m133407t("context_single_room", this.f51730b, bLivePkSuggestAnchor.avatar, t100.m186890d(55.0f));
        xdl0.m208344M(this.f51732d, false);
        xdl0.m208344M(this.f51733e, false);
        xdl0.m208344M(this.f51729a, false);
        m76219e(bLivePkSuggestAnchor);
        if (bLivePkSuggestAnchor.source.equals("hour")) {
            xdl0.m208344M(this.f51729a, true);
            this.f51729a.setText(String.valueOf(bLivePkSuggestAnchor.rank));
        }
        xdl0.m208329E0(this.f51733e, new View.OnClickListener() { // from class: l.f280
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f30 f30Var2 = f30Var;
                BLivePkSuggestAnchor bLivePkSuggestAnchor2 = bLivePkSuggestAnchor;
                f30Var2.call(bLivePkSuggestAnchor2, bLivePkSuggestAnchor2.source);
            }
        });
        zvf0.m220368A("e_pk_invite_button", "p_anchor_live_room", j760.m140076a("anchorId", bsmVar.f77102h.m132140j0()), j760.m140076a("liveId", bsmVar.f77102h.m149814k()), j760.m140076a("other_user_id", bLivePkSuggestAnchor.userId), j760.m140076a("page_tab_type", bLivePkSuggestAnchor.source.toString()));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76217c(this);
        this.f51729a.setTypeface(Typeface.defaultFromStyle(1));
    }

    public PkSuggestAnchorItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkSuggestAnchorItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
