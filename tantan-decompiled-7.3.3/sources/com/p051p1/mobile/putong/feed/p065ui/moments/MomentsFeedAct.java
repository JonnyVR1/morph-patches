package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.crl;

/* JADX INFO: loaded from: classes13.dex */
public class MomentsFeedAct extends PutongAct implements crl {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m68013Y1(Context context) {
        return new Intent(context, (Class<?>) MomentsFeedAct.class);
    }

    /* JADX INFO: renamed from: Z1 */
    public MomentsFeedFrag m68014Z1() {
        return (MomentsFeedFrag) fragmentManager().m2555h0(R.id.content);
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m68015a2(MomentsFeedFrag momentsFeedFrag) {
        if (lifecycle_() != C4470c.f16267i) {
            return;
        }
        momentsFeedFrag.m68016O4(true);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (fragmentManager().m2555h0(R.id.content) != null) {
            return null;
        }
        fragmentManager().m2568m().m2812s(R.id.content, new MomentsFeedFrag()).mo2708i();
        fragmentManager().m2546e0();
        return null;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        setTitle(getResources().getString(R$string.f39857Y3), true);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        final MomentsFeedFrag momentsFeedFragM68014Z1 = m68014Z1();
        if (NullChecker.m82487b(momentsFeedFragM68014Z1) && NullChecker.m82487b(momentsFeedFragM68014Z1.m68023V4())) {
            postDelayed(new Runnable() { // from class: l.iv00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f117008a.m68015a2(momentsFeedFragM68014Z1);
                }
            }, 200L);
            if (momentsFeedFragM68014Z1.m68023V4().f44833i.f44815T.m68075U(i, i2, intent)) {
                return;
            }
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        MomentsFeedFrag momentsFeedFragM68014Z1 = m68014Z1();
        if (NullChecker.m82487b(momentsFeedFragM68014Z1)) {
            momentsFeedFragM68014Z1.m68021T4(list);
        }
    }
}
