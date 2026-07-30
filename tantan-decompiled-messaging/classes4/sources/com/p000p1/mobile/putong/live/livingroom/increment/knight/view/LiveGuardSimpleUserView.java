package com.p000p1.mobile.putong.live.livingroom.increment.knight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.view.RollItemView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.hxs;
import l.mqv;
import l.t100;
import l.xdl0;
import p002l.ass;
import p002l.i3c0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGuardSimpleUserView extends RollItemView<User> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f6491a;

    /* JADX INFO: renamed from: b */
    public mqv<User> f6492b;

    /* JADX INFO: renamed from: c */
    public e30<String> f6493c;

    /* JADX INFO: renamed from: d */
    public boolean f6494d;

    public LiveGuardSimpleUserView(@NonNull Context context) {
        super(context);
        this.f6494d = false;
    }

    /* JADX INFO: renamed from: a */
    public void m8247a(@Nullable mqv<User> mqvVar) {
        this.f6492b = mqvVar;
        if (mqvVar == null) {
            this.f6491a.setImageResource(i3c0.f12473E2);
        } else if (!this.f6494d) {
            hxs.t("context_single_room", this.f6491a, ((Media) mqvVar.h().fp()).url, t100.s);
        } else {
            hxs.t("context_single_room", this.f6491a, mqvVar.g().b.avatar, t100.s);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8248c(View view) {
        ass.m10072a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m8249d(View view) {
        if (NullChecker.a(this.f6493c) && NullChecker.a(this.f6492b)) {
            this.f6493c.call(((DbObject) this.f6492b.h()).id);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8248c(this);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.zrs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23575a.m8249d(view);
            }
        });
    }

    public void setWithMask(boolean z) {
        this.f6494d = z;
    }

    public LiveGuardSimpleUserView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6494d = false;
    }
}
