package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.base.data.BLiveRightItem;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightChatShadingView;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class h9d0 extends d9d0<RightChatShadingView> {
    public h9d0(BLiveRightItem bLiveRightItem, int i, String str, boolean z, j9d0 j9d0Var) {
        super(bLiveRightItem, i, str, z, j9d0Var);
        this.f85765j = UserRightType.CHAT_UNDER_SHADE;
        this.f92626a = i == 0;
    }

    @Override // p153l.d9d0
    /* JADX INFO: renamed from: O */
    public int mo103092O() {
        return qa00.m175859d(10.0f);
    }

    @Override // p153l.d9d0
    /* JADX INFO: renamed from: P */
    public int mo103093P() {
        return qa00.m175859d(10.0f);
    }

    @Override // p153l.d9d0
    /* JADX INFO: renamed from: R */
    public int mo103094R() {
        if (this.f92626a) {
            return qa00.m175859d(12.0f);
        }
        return 0;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo71749u(RightChatShadingView rightChatShadingView) {
        super.mo71749u(rightChatShadingView);
        rightChatShadingView.m71759e(this, this.f85764i);
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo71942v(RightChatShadingView rightChatShadingView, @NonNull List<Object> list) {
        super.mo71942v(rightChatShadingView, list);
        if (jyb.m147479J(list)) {
            mo71749u(rightChatShadingView);
            return;
        }
        int iIntValue = ((Integer) list.get(0)).intValue();
        if (iIntValue == 1) {
            rightChatShadingView.m71758d();
        } else if (iIntValue == 2) {
            rightChatShadingView.m71757c();
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193863f1;
    }
}
