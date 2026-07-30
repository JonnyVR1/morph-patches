package com.p051p1.mobile.putong.live.livingroom.increment.knight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.view.RollItemView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.bus;
import p153l.izs;
import p153l.l6o0;
import p153l.nsv;
import p153l.obc0;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardSimpleUserView extends RollItemView<User> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f51297a;

    /* JADX INFO: renamed from: b */
    public nsv<User> f51298b;

    /* JADX INFO: renamed from: c */
    public y20<String> f51299c;

    /* JADX INFO: renamed from: d */
    public boolean f51300d;

    public LiveGuardSimpleUserView(@NonNull Context context) {
        super(context);
        this.f51300d = false;
    }

    @Override // com.p051p1.mobile.putong.live.base.view.RollItemView
    /* JADX INFO: renamed from: a */
    public void mo70019a(@Nullable nsv<User> nsvVar) {
        this.f51298b = nsvVar;
        if (nsvVar == null) {
            this.f51297a.setImageResource(obc0.f146016E2);
        } else if (!this.f51300d) {
            izs.m142869t("context_single_room", this.f51297a, nsvVar.m164643h().m61308fp().url, qa00.f156332s);
        } else {
            izs.m142869t("context_single_room", this.f51297a, ((l6o0) nsvVar.m164642g()).f130275b.avatar, qa00.f156332s);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m75837c(View view) {
        bus.m106536a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m75838d(View view) {
        if (NullChecker.m82486a(this.f51299c) && NullChecker.m82486a(this.f51298b)) {
            this.f51299c.call(this.f51298b.m164643h().f56859id);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75837c(this);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.aus
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73543a.m75838d(view);
            }
        });
    }

    public void setWithMask(boolean z) {
        this.f51300d = z;
    }

    public LiveGuardSimpleUserView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51300d = false;
    }
}
