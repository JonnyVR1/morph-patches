package com.p051p1.mobile.putong.live.external.page.rights.list;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseAct;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import com.p051p1.mobile.putong.live.external.page.rights.niceNumber.LiveUserRightNiceNumberFrag;
import org.jetbrains.annotations.NotNull;
import p153l.r230;

/* JADX INFO: loaded from: classes9.dex */
public class LiveUserRightListAct extends LiveBaseAct {
    /* JADX INFO: renamed from: Y1 */
    public static void m71743Y1(Context context, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) LiveUserRightListAct.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    @NotNull
    /* JADX INFO: renamed from: X1 */
    public final LiveBaseFrag m71744X1() {
        Bundle extras = getIntent().getExtras();
        return UserRightType.valueOf(extras.getString("right_type")) == UserRightType.LIVE_NICE_NUMBER ? LiveUserRightNiceNumberFrag.m71843M4(extras) : LiveUserRightListFrag.m71745M4(extras);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (fragmentManager().m2555h0(R.id.content) != null) {
            return null;
        }
        fragmentManager().m2568m().m2812s(R.id.content, m71744X1()).mo2708i();
        fragmentManager().m2546e0();
        return null;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        r230.m179475p("context_right_act");
    }
}
