package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;

/* JADX INFO: loaded from: classes4.dex */
public class lz0 implements s7m<kz0> {

    /* JADX INFO: renamed from: a */
    public kz0 f130617a;

    /* JADX INFO: renamed from: b */
    public final BottomView f130618b;

    public lz0(BottomView bottomView) {
        this.f130618b = bottomView;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m152301a(View view, BLiveButtonType bLiveButtonType) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.leftMargin = t100.m186890d(3.0f);
        layoutParams.rightMargin = t100.m186890d(3.0f);
        if (TEnum.equals(bLiveButtonType, BLiveButtonType.newUserTreasureBoxButton)) {
            layoutParams.bottomMargin = t100.m186890d(6.0f);
        } else {
            layoutParams.bottomMargin = t100.m186890d(10.0f);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(kz0 kz0Var) {
        this.f130617a = kz0Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
