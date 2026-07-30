package com.p000p1.mobile.putong.core.p001ui.likedusers.anchor;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.data.DbObject;
import java.util.Objects;
import l.bkb0;
import l.e30;
import l.nvc0;
import l.qib0;
import l.xdl0;
import l.xm0;
import p007l.tm0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class AnchorLikedUserItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f98a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f99b;

    /* JADX INFO: renamed from: c */
    public LiveHaloAvatar f100c;

    /* JADX INFO: renamed from: d */
    public TextView f101d;

    /* JADX INFO: renamed from: e */
    public TextView f102e;

    public AnchorLikedUserItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m477c(View view) {
        xm0.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final Act m478d() {
        return getContext();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m479e(tm0 tm0Var, View view) {
        CoreModule.Q().startAudienceLive(m478d(), tm0Var.f13334c.f228id, "liked_user", (String) null);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m480f(tm0 tm0Var, View view) {
        m478d().startActivity(CoreModule.P().a().jr(m478d(), ((DbObject) tm0Var.f13333b).id, "liked_users_anchor", false));
    }

    /* JADX INFO: renamed from: g */
    public void m481g(tm0 tm0Var) {
        this.f102e.setText(tm0Var.f13333b.name);
        if (tm0Var.m14566a()) {
            m482h(tm0Var);
        } else {
            m483i(tm0Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m482h(final tm0 tm0Var) {
        xdl0.M(this.f100c, true);
        xdl0.M(this.f101d, true);
        xdl0.M(this.f99b, false);
        this.f100c.m487d(-38485, -41238);
        ImageRequest imageRequestA = qib0.G.X0(tm0Var.f13333b.m1042fp().profileSmall()).O(new nvc0(this.f100c.getAvatarSize(), this.f100c.getAvatarSize())).a();
        bkb0 bkb0Var = qib0.G;
        final LiveHaloAvatar liveHaloAvatar = this.f100c;
        Objects.requireNonNull(liveHaloAvatar);
        bkb0Var.F(imageRequestA, new e30() { // from class: l.um0
            public final void call(Object obj) {
                liveHaloAvatar.setAvatar((Bitmap) obj);
            }
        });
        xdl0.E0(this.f98a, new View.OnClickListener() { // from class: l.vm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14232a.m479e(tm0Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m483i(final tm0 tm0Var) {
        xdl0.M(this.f100c, false);
        xdl0.M(this.f101d, false);
        xdl0.M(this.f99b, true);
        qib0.G.Q0(this.f99b, tm0Var.f13333b.m1042fp().profileSmall());
        xdl0.E0(this.f98a, new View.OnClickListener() { // from class: l.wm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14620a.m480f(tm0Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m477c(this);
    }

    public AnchorLikedUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnchorLikedUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AnchorLikedUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
