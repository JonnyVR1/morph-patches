package com.p046p1.mobile.putong.live.livingroom.increment.knight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.view.RollItemView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p149l.ass;
import p149l.e30;
import p149l.hxn0;
import p149l.hxs;
import p149l.i3c0;
import p149l.mqv;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardSimpleUserView extends RollItemView<User> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f50449a;

    /* JADX INFO: renamed from: b */
    public mqv<User> f50450b;

    /* JADX INFO: renamed from: c */
    public e30<String> f50451c;

    /* JADX INFO: renamed from: d */
    public boolean f50452d;

    public LiveGuardSimpleUserView(@NonNull Context context) {
        super(context);
        this.f50452d = false;
    }

    @Override // com.p046p1.mobile.putong.live.base.view.RollItemView
    /* JADX INFO: renamed from: a */
    public void mo68836a(@Nullable mqv<User> mqvVar) {
        this.f50450b = mqvVar;
        if (mqvVar == null) {
            this.f50449a.setImageResource(i3c0.f110688E2);
        } else if (!this.f50452d) {
            hxs.m133407t("context_single_room", this.f50449a, mqvVar.m156005h().m60124fp().url, t100.f167270s);
        } else {
            hxs.m133407t("context_single_room", this.f50449a, ((hxn0) mqvVar.m156004g()).f109896b.avatar, t100.f167270s);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m74654c(View view) {
        ass.m98602a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m74655d(View view) {
        if (NullChecker.m81303a(this.f50451c) && NullChecker.m81303a(this.f50450b)) {
            this.f50451c.call(this.f50450b.m156005h().f56011id);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74654c(this);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.zrs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204541a.m74655d(view);
            }
        });
    }

    public void setWithMask(boolean z) {
        this.f50452d = z;
    }

    public LiveGuardSimpleUserView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50452d = false;
    }
}
