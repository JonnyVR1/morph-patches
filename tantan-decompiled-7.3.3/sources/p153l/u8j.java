package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.FreeTrialOperateResult;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.p058ui.freetrial.FreeTrialCard;

/* JADX INFO: loaded from: classes3.dex */
public class u8j implements sxl0 {

    /* JADX INFO: renamed from: a */
    public VirtualCardType f178047a;

    /* JADX INFO: renamed from: b */
    public x0m f178048b;

    public u8j(x0m x0mVar) {
        this.f178048b = x0mVar;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m195042i(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Boolean m195043j(Boolean bool, FreeTrialOperateResult freeTrialOperateResult) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m195045m() {
        this.f178048b.mo37749V(SwipeDirection.RIGHT);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(nec0.f141622g, viewGroup, false);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, View view2) {
        this.f178047a = virtualCardType;
        ((FreeTrialCard) view).m46596f(virtualCardType, new x20() { // from class: l.q8j
            @Override // p153l.x20
            public final void call() {
                this.f156133a.m195045m();
            }
        });
        this.f178048b.mo37745O3();
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return false;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(SwipeDirection swipeDirection, jam jamVar) {
        boolean z = swipeDirection == SwipeDirection.RIGHT;
        String strMo34433Un = CoreModule.m30933P().m143405a().mo34433Un(this.f178047a);
        m195046l(strMo34433Un, Boolean.valueOf(z));
        if (z) {
            CoreModule.m30933P().m143405a().mo34496ei(strMo34433Un);
        }
        this.f178048b.mo37742I();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: l */
    public final void m195046l(final String str, final Boolean bool) {
        this.f178048b.mo37767z1(CoreModule.f18264c.f20433v1.m117810j3(str, bool)).take(1).filter(new qcj() { // from class: l.r8j
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return u8j.m195043j(bool, (FreeTrialOperateResult) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.s8j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166828a.m195047n(str, (FreeTrialOperateResult) obj);
            }
        }, new y20() { // from class: l.t8j
            @Override // p153l.y20
            public final void call(Object obj) {
                u8j.m195042i((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m195047n(String str, FreeTrialOperateResult freeTrialOperateResult) {
        CoreModule.m30933P().m143405a().mo34616vs(this.f178048b, str, freeTrialOperateResult);
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
