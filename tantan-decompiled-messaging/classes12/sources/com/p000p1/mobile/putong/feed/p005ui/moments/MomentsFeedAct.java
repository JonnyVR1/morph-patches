package com.p000p1.mobile.putong.feed.p005ui.moments;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.feed.R$string;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.rol;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentsFeedAct extends PutongAct implements rol {
    /* JADX INFO: renamed from: X1 */
    public static Intent m8021X1(Context context) {
        return new Intent(context, (Class<?>) MomentsFeedAct.class);
    }

    /* JADX INFO: renamed from: Y1 */
    public MomentsFeedFrag m8022Y1() {
        return fragmentManager().h0(R.id.content);
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m8023Z1(MomentsFeedFrag momentsFeedFrag) {
        if (lifecycle_() != c.i) {
            return;
        }
        momentsFeedFrag.m8027O4(true);
    }

    public boolean disableAutoPV() {
        return true;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (fragmentManager().h0(R.id.content) != null) {
            return null;
        }
        fragmentManager().m().s(R.id.content, new MomentsFeedFrag()).i();
        fragmentManager().e0();
        return null;
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        setTitle(getResources().getString(R$string.f470Y3), true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        final MomentsFeedFrag momentsFeedFragM8022Y1 = m8022Y1();
        if (NullChecker.b(momentsFeedFragM8022Y1) && NullChecker.b(momentsFeedFragM8022Y1.m8034V4())) {
            postDelayed(new Runnable() { // from class: l.zm00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15800a.m8023Z1(momentsFeedFragM8022Y1);
                }
            }, 200L);
            if (momentsFeedFragM8022Y1.m8034V4().f5446i.f5428T.m8086U(i, i2, intent)) {
                return;
            }
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onPickImagesResult(List<Media> list) {
        MomentsFeedFrag momentsFeedFragM8022Y1 = m8022Y1();
        if (NullChecker.b(momentsFeedFragM8022Y1)) {
            momentsFeedFragM8022Y1.m8032T4(list);
        }
    }
}
