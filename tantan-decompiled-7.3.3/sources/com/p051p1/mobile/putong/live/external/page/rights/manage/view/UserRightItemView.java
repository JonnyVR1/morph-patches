package com.p051p1.mobile.putong.live.external.page.rights.manage.view;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.external.page.rights.list.LiveUserRightListAct;
import p151v.VImage;
import p151v.VText;
import p153l.thk0;
import p153l.vhk0;

/* JADX INFO: loaded from: classes9.dex */
public class UserRightItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f46976d;

    /* JADX INFO: renamed from: e */
    public VText f46977e;

    /* JADX INFO: renamed from: f */
    public VImage f46978f;

    /* JADX INFO: renamed from: g */
    public thk0 f46979g;

    public UserRightItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m71839i0(View view) {
        vhk0.m201297a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m71840j0(thk0 thk0Var, View view) {
        m71842l0(thk0Var.m191263I(), thk0Var.m191262H());
    }

    /* JADX INFO: renamed from: k0 */
    public void m71841k0(final thk0 thk0Var) {
        this.f46979g = thk0Var;
        UserRightType userRightTypeM191263I = thk0Var.m191263I();
        this.f46976d.setImageResource(userRightTypeM191263I.getLeftIcon());
        this.f46977e.setText(userRightTypeM191263I.getManageTitle(getContext()));
        setOnClickListener(new View.OnClickListener() { // from class: l.uhk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179032a.m71840j0(thk0Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public final void m71842l0(UserRightType userRightType, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("right_type", userRightType.toString());
        LiveUserRightListAct.m71743Y1(getContext(), bundle);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71839i0(this);
    }

    public UserRightItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UserRightItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
