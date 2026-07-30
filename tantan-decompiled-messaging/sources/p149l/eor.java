package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4750p;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.p053ui.MKWebViewManager;
import com.p046p1.mobile.putong.data.OMSAdCardInfo;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class eor implements ool0 {

    /* JADX INFO: renamed from: a */
    public eyl f92491a;

    public eor(eyl eylVar) {
        this.f92491a = eylVar;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(i6c0.f111728w, viewGroup, false);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, View view2) {
        if (view instanceof MKWebViewManager) {
            PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
            if (NullChecker.m81303a(partialListOptM221515e)) {
                CoreSuggested.UserInfo userInfo = partialListOptM221515e.loaded.get(i);
                if (NullChecker.m81303a(userInfo)) {
                    Object obj = userInfo.extensionObject;
                    if ((obj instanceof OMSAdCardInfo) && TextUtils.equals(((OMSAdCardInfo) obj).contentType, "literatureCardGuide")) {
                        OMSAdCardInfo oMSAdCardInfo = (OMSAdCardInfo) userInfo.extensionObject;
                        ((MKWebViewManager) view).m43926m(String.format(C4750p.f20072Y, oMSAdCardInfo.identifier), "");
                        if (i == 0) {
                            ic50.m135327j().m135333f().m145239Z(oMSAdCardInfo.identifier, 0, false);
                            jb0.m140733k(oMSAdCardInfo);
                            this.f92491a.mo36742O3();
                        }
                    }
                }
            }
        }
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return false;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(SwipeDirection swipeDirection, t7m t7mVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(VSwipeCard vSwipeCard) {
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(View view) {
    }
}
