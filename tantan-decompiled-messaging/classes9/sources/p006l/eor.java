package p006l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0176p;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p000p1.mobile.putong.core.card.VSwipeCard;
import com.p000p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.ui.MKWebViewManager;
import com.p1.mobile.putong.data.OMSAdCardInfo;
import com.tantanapp.common.utils.NullChecker;
import l.eyl;
import l.ic50;
import l.ool0;
import l.t7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class eor implements ool0 {

    /* JADX INFO: renamed from: a */
    public eyl f11313a;

    public eor(eyl eylVar) {
        this.f11313a = eylVar;
    }

    /* JADX INFO: renamed from: d */
    public View m14750d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(i6c0.f14262w, viewGroup, false);
    }

    /* JADX INFO: renamed from: e */
    public void m14751e(View view, int i, VirtualCardType virtualCardType, View view2) {
        if (view instanceof MKWebViewManager) {
            PartialListOpt partialListOpt = (PartialListOpt) CoreModule.f1534c.f3652m0.f3383a0.e();
            if (NullChecker.a(partialListOpt)) {
                CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) partialListOpt.loaded.get(i);
                if (NullChecker.a(userInfo)) {
                    Object obj = userInfo.extensionObject;
                    if ((obj instanceof OMSAdCardInfo) && TextUtils.equals(((OMSAdCardInfo) obj).contentType, "literatureCardGuide")) {
                        OMSAdCardInfo oMSAdCardInfo = (OMSAdCardInfo) userInfo.extensionObject;
                        ((MKWebViewManager) view).m(String.format(C0176p.f4061Y, oMSAdCardInfo.identifier), "");
                        if (i == 0) {
                            ic50.j().f().Z(oMSAdCardInfo.identifier, 0, false);
                            jb0.m17424k(oMSAdCardInfo);
                            this.f11313a.O3();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m14752f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m14753g(SwipeDirection swipeDirection, t7m t7mVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: b */
    public void m14748b(VSwipeCard vSwipeCard) {
    }

    /* JADX INFO: renamed from: c */
    public void m14749c(View view) {
    }
}
