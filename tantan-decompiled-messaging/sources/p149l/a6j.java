package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.FreeTrialOperateResult;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.p053ui.freetrial.FreeTrialCard;

/* JADX INFO: loaded from: classes10.dex */
public class a6j implements ool0 {

    /* JADX INFO: renamed from: a */
    public VirtualCardType f67774a;

    /* JADX INFO: renamed from: b */
    public eyl f67775b;

    public a6j(eyl eylVar) {
        this.f67775b = eylVar;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m95143i(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Boolean m95144j(Boolean bool, FreeTrialOperateResult freeTrialOperateResult) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m95146m() {
        this.f67775b.mo36746V(SwipeDirection.RIGHT);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(i6c0.f111712g, viewGroup, false);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, View view2) {
        this.f67774a = virtualCardType;
        ((FreeTrialCard) view).m45413f(virtualCardType, new d30() { // from class: l.w5j
            @Override // p149l.d30
            public final void call() {
                this.f184704a.m95146m();
            }
        });
        this.f67775b.mo36742O3();
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return false;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(SwipeDirection swipeDirection, t7m t7mVar) {
        boolean z = swipeDirection == SwipeDirection.RIGHT;
        String strMo33430Un = CoreModule.m29935P().m94651a().mo33430Un(this.f67774a);
        m95147l(strMo33430Un, Boolean.valueOf(z));
        if (z) {
            CoreModule.m29935P().m94651a().mo33493ei(strMo33430Un);
        }
        this.f67775b.mo36739I();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: l */
    public final void m95147l(final String str, final Boolean bool) {
        this.f67775b.mo36764z1(CoreModule.f17545c.f19691v1.m205154j3(str, bool)).take(1).filter(new w9j() { // from class: l.x5j
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return a6j.m95144j(bool, (FreeTrialOperateResult) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.y5j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196444a.m95148n(str, (FreeTrialOperateResult) obj);
            }
        }, new e30() { // from class: l.z5j
            @Override // p149l.e30
            public final void call(Object obj) {
                a6j.m95143i((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m95148n(String str, FreeTrialOperateResult freeTrialOperateResult) {
        CoreModule.m29935P().m94651a().mo33613vs(this.f67775b, str, freeTrialOperateResult);
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
