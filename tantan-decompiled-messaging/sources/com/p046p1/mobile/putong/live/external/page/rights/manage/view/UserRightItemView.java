package com.p046p1.mobile.putong.live.external.page.rights.manage.view;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.bean.UserRightType;
import com.p046p1.mobile.putong.live.external.page.rights.list.LiveUserRightListAct;
import p147v.VImage;
import p147v.VText;
import p149l.n8k0;
import p149l.p8k0;

/* JADX INFO: loaded from: classes13.dex */
public class UserRightItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f46128d;

    /* JADX INFO: renamed from: e */
    public VText f46129e;

    /* JADX INFO: renamed from: f */
    public VImage f46130f;

    /* JADX INFO: renamed from: g */
    public n8k0 f46131g;

    public UserRightItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m70656i0(View view) {
        p8k0.m167801a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m70657j0(n8k0 n8k0Var, View view) {
        m70659l0(n8k0Var.m158503I(), n8k0Var.m158502H());
    }

    /* JADX INFO: renamed from: k0 */
    public void m70658k0(final n8k0 n8k0Var) {
        this.f46131g = n8k0Var;
        UserRightType userRightTypeM158503I = n8k0Var.m158503I();
        this.f46128d.setImageResource(userRightTypeM158503I.getLeftIcon());
        this.f46129e.setText(userRightTypeM158503I.getManageTitle(getContext()));
        setOnClickListener(new View.OnClickListener() { // from class: l.o8k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142644a.m70657j0(n8k0Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public final void m70659l0(UserRightType userRightType, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("right_type", userRightType.toString());
        LiveUserRightListAct.m70560X1(getContext(), bundle);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70656i0(this);
    }

    public UserRightItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UserRightItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
