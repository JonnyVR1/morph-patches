package com.p051p1.mobile.putong.core.p058ui.likedusers.anchor;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import java.util.Objects;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.fsb0;
import p153l.pm0;
import p153l.q3d0;
import p153l.tm0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class AnchorLikedUserItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f30837a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f30838b;

    /* JADX INFO: renamed from: c */
    public LiveHaloAvatar f30839c;

    /* JADX INFO: renamed from: d */
    public TextView f30840d;

    /* JADX INFO: renamed from: e */
    public TextView f30841e;

    public AnchorLikedUserItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m47985c(View view) {
        tm0.m191702a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final Act m47986d() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m47987e(pm0 pm0Var, View view) {
        CoreModule.m30934Q().startAudienceLive(m47986d(), pm0Var.f153113c.f39615id, "liked_user", null);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m47988f(pm0 pm0Var, View view) {
        m47986d().startActivity(CoreModule.m30933P().m143405a().mo34531jr(m47986d(), pm0Var.f153112b.f56859id, "liked_users_anchor", false));
    }

    /* JADX INFO: renamed from: g */
    public void m47989g(pm0 pm0Var) {
        this.f30841e.setText(pm0Var.f153112b.name);
        if (pm0Var.m172912a()) {
            m47990h(pm0Var);
        } else {
            m47991i(pm0Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m47990h(final pm0 pm0Var) {
        bnl0.m105524M(this.f30839c, true);
        bnl0.m105524M(this.f30840d, true);
        bnl0.m105524M(this.f30838b, false);
        this.f30839c.m47995d(-38485, -41238);
        ImageRequest imageRequestM8668a = uqb0.f180374G.m127136X0(pm0Var.f153112b.m61308fp().profileSmall()).m8661O(new q3d0(this.f30839c.getAvatarSize(), this.f30839c.getAvatarSize())).m8668a();
        fsb0 fsb0Var = uqb0.f180374G;
        final LiveHaloAvatar liveHaloAvatar = this.f30839c;
        Objects.requireNonNull(liveHaloAvatar);
        fsb0Var.m127102F(imageRequestM8668a, new y20() { // from class: l.qm0
            @Override // p153l.y20
            public final void call(Object obj) {
                liveHaloAvatar.setAvatar((Bitmap) obj);
            }
        });
        bnl0.m105509E0(this.f30837a, new View.OnClickListener() { // from class: l.rm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163815a.m47987e(pm0Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m47991i(final pm0 pm0Var) {
        bnl0.m105524M(this.f30839c, false);
        bnl0.m105524M(this.f30840d, false);
        bnl0.m105524M(this.f30838b, true);
        uqb0.f180374G.m127125Q0(this.f30838b, pm0Var.f153112b.m61308fp().profileSmall());
        bnl0.m105509E0(this.f30837a, new View.OnClickListener() { // from class: l.sm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169481a.m47988f(pm0Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47985c(this);
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
