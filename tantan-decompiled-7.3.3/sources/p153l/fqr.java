package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4901p;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.p058ui.MKWebViewManager;
import com.p051p1.mobile.putong.data.OMSAdCardInfo;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class fqr implements sxl0 {

    /* JADX INFO: renamed from: a */
    public x0m f100333a;

    public fqr(x0m x0mVar) {
        this.f100333a = x0mVar;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(nec0.f141638w, viewGroup, false);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, View view2) {
        if (view instanceof MKWebViewManager) {
            PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
            if (NullChecker.m82486a(partialListOptM222761e)) {
                CoreSuggested.UserInfo userInfo = partialListOptM222761e.loaded.get(i);
                if (NullChecker.m82486a(userInfo)) {
                    Object obj = userInfo.extensionObject;
                    if ((obj instanceof OMSAdCardInfo) && TextUtils.equals(((OMSAdCardInfo) obj).contentType, "literatureCardGuide")) {
                        OMSAdCardInfo oMSAdCardInfo = (OMSAdCardInfo) userInfo.extensionObject;
                        ((MKWebViewManager) view).m45109m(String.format(C4901p.f20814Y, oMSAdCardInfo.identifier), "");
                        if (i == 0) {
                            pk50.m172568j().m172574f().m181662Z(oMSAdCardInfo.identifier, 0, false);
                            fb0.m124812k(oMSAdCardInfo);
                            this.f100333a.mo37745O3();
                        }
                    }
                }
            }
        }
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return false;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(SwipeDirection swipeDirection, jam jamVar) {
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(VSwipeCard vSwipeCard) {
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(View view) {
    }
}
