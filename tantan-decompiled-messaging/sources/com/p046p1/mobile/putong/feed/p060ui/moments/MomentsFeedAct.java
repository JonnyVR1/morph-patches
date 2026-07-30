package com.p046p1.mobile.putong.feed.p060ui.moments;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.rol;

/* JADX INFO: loaded from: classes12.dex */
public class MomentsFeedAct extends PutongAct implements rol {
    /* JADX INFO: renamed from: X1 */
    public static Intent m66830X1(Context context) {
        return new Intent(context, (Class<?>) MomentsFeedAct.class);
    }

    /* JADX INFO: renamed from: Y1 */
    public MomentsFeedFrag m66831Y1() {
        return (MomentsFeedFrag) fragmentManager().m2554h0(R.id.content);
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m66832Z1(MomentsFeedFrag momentsFeedFrag) {
        if (lifecycle_() != C4319c.f15548i) {
            return;
        }
        momentsFeedFrag.m66833O4(true);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (fragmentManager().m2554h0(R.id.content) != null) {
            return null;
        }
        fragmentManager().m2567m().m2811s(R.id.content, new MomentsFeedFrag()).mo2707i();
        fragmentManager().m2545e0();
        return null;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        setTitle(getResources().getString(R$string.f39009Y3), true);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        final MomentsFeedFrag momentsFeedFragM66831Y1 = m66831Y1();
        if (NullChecker.m81304b(momentsFeedFragM66831Y1) && NullChecker.m81304b(momentsFeedFragM66831Y1.m66840V4())) {
            postDelayed(new Runnable() { // from class: l.zm00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f203685a.m66832Z1(momentsFeedFragM66831Y1);
                }
            }, 200L);
            if (momentsFeedFragM66831Y1.m66840V4().f43985i.f43967T.m66892U(i, i2, intent)) {
                return;
            }
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        MomentsFeedFrag momentsFeedFragM66831Y1 = m66831Y1();
        if (NullChecker.m81304b(momentsFeedFragM66831Y1)) {
            momentsFeedFragM66831Y1.m66838T4(list);
        }
    }
}
