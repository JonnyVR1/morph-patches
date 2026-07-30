package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;

/* JADX INFO: loaded from: classes4.dex */
public class sz0 implements iam<rz0> {

    /* JADX INFO: renamed from: a */
    public rz0 f171346a;

    /* JADX INFO: renamed from: b */
    public final BottomView f171347b;

    public sz0(BottomView bottomView) {
        this.f171347b = bottomView;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m188611a(View view, BLiveButtonType bLiveButtonType) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.leftMargin = qa00.m175859d(3.0f);
        layoutParams.rightMargin = qa00.m175859d(3.0f);
        if (TEnum.equals(bLiveButtonType, BLiveButtonType.newUserTreasureBoxButton)) {
            layoutParams.bottomMargin = qa00.m175859d(6.0f);
        } else {
            layoutParams.bottomMargin = qa00.m175859d(10.0f);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(rz0 rz0Var) {
        this.f171346a = rz0Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
