package com.p046p1.mobile.putong.core.p053ui.likedusers.anchor;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import java.util.Objects;
import p147v.VDraweeView;
import p149l.bkb0;
import p149l.e30;
import p149l.nvc0;
import p149l.qib0;
import p149l.tm0;
import p149l.xdl0;
import p149l.xm0;

/* JADX INFO: loaded from: classes12.dex */
public class AnchorLikedUserItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f29989a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f29990b;

    /* JADX INFO: renamed from: c */
    public LiveHaloAvatar f29991c;

    /* JADX INFO: renamed from: d */
    public TextView f29992d;

    /* JADX INFO: renamed from: e */
    public TextView f29993e;

    public AnchorLikedUserItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m46802c(View view) {
        xm0.m210035a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final Act m46803d() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m46804e(tm0 tm0Var, View view) {
        CoreModule.m29936Q().startAudienceLive(m46803d(), tm0Var.f171122c.f38767id, "liked_user", null);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m46805f(tm0 tm0Var, View view) {
        m46803d().startActivity(CoreModule.m29935P().m94651a().mo33528jr(m46803d(), tm0Var.f171121b.f56011id, "liked_users_anchor", false));
    }

    /* JADX INFO: renamed from: g */
    public void m46806g(tm0 tm0Var) {
        this.f29993e.setText(tm0Var.f171121b.name);
        if (tm0Var.m189633a()) {
            m46807h(tm0Var);
        } else {
            m46808i(tm0Var);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m46807h(final tm0 tm0Var) {
        xdl0.m208344M(this.f29991c, true);
        xdl0.m208344M(this.f29992d, true);
        xdl0.m208344M(this.f29990b, false);
        this.f29991c.m46812d(-38485, -41238);
        ImageRequest imageRequestM8614a = qib0.f154691G.m102352X0(tm0Var.f171121b.m60124fp().profileSmall()).m8607O(new nvc0(this.f29991c.getAvatarSize(), this.f29991c.getAvatarSize())).m8614a();
        bkb0 bkb0Var = qib0.f154691G;
        final LiveHaloAvatar liveHaloAvatar = this.f29991c;
        Objects.requireNonNull(liveHaloAvatar);
        bkb0Var.m102318F(imageRequestM8614a, new e30() { // from class: l.um0
            @Override // p149l.e30
            public final void call(Object obj) {
                liveHaloAvatar.setAvatar((Bitmap) obj);
            }
        });
        xdl0.m208329E0(this.f29989a, new View.OnClickListener() { // from class: l.vm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182056a.m46804e(tm0Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m46808i(final tm0 tm0Var) {
        xdl0.m208344M(this.f29991c, false);
        xdl0.m208344M(this.f29992d, false);
        xdl0.m208344M(this.f29990b, true);
        qib0.f154691G.m102341Q0(this.f29990b, tm0Var.f171121b.m60124fp().profileSmall());
        xdl0.m208329E0(this.f29989a, new View.OnClickListener() { // from class: l.wm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187040a.m46805f(tm0Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46802c(this);
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
