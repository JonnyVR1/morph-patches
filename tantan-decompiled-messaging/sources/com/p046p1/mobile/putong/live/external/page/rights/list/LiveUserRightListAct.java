package com.p046p1.mobile.putong.live.external.page.rights.list;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.bean.UserRightType;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseAct;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseFrag;
import com.p046p1.mobile.putong.live.external.page.rights.niceNumber.LiveUserRightNiceNumberFrag;
import org.jetbrains.annotations.NotNull;
import p149l.hu20;

/* JADX INFO: loaded from: classes13.dex */
public class LiveUserRightListAct extends LiveBaseAct {
    /* JADX INFO: renamed from: X1 */
    public static void m70560X1(Context context, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) LiveUserRightListAct.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    @NotNull
    /* JADX INFO: renamed from: V1 */
    public final LiveBaseFrag m70561V1() {
        Bundle extras = getIntent().getExtras();
        return UserRightType.valueOf(extras.getString("right_type")) == UserRightType.LIVE_NICE_NUMBER ? LiveUserRightNiceNumberFrag.m70660M4(extras) : LiveUserRightListFrag.m70562M4(extras);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (fragmentManager().m2554h0(R.id.content) != null) {
            return null;
        }
        fragmentManager().m2567m().m2811s(R.id.content, m70561V1()).mo2707i();
        fragmentManager().m2545e0();
        return null;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        hu20.m132970p("context_right_act");
    }
}
