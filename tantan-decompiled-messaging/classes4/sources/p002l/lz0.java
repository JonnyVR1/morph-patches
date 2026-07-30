package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import l.s7m;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lz0 implements s7m<kz0> {

    /* JADX INFO: renamed from: a */
    public kz0 f15179a;

    /* JADX INFO: renamed from: b */
    public final BottomView f15180b;

    public lz0(BottomView bottomView) {
        this.f15180b = bottomView;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m17623C0() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m17624a(View view, BLiveButtonType bLiveButtonType) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.leftMargin = t100.d(3.0f);
        layoutParams.rightMargin = t100.d(3.0f);
        if (TEnum.equals(bLiveButtonType, "newUserTreasureBoxButton")) {
            layoutParams.bottomMargin = t100.d(6.0f);
        } else {
            layoutParams.bottomMargin = t100.d(10.0f);
        }
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m17626i1(kz0 kz0Var) {
        this.f15179a = kz0Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }
}
