package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.newui.meet.likers.MeetLikersFrag;
import com.p051p1.mobile.putong.core.newui.newmeet.frag.odiamond.ODiamondFrag;
import com.p051p1.mobile.putong.data.Visitor;
import com.p051p1.mobile.putong.data.VisitorCounter;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/wey;", "Ll/ar2;", "Ll/hgy;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "destroy", "()V", "Z", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "k0", "(IILandroid/content/Intent;)Z", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class wey extends ar2<hgy> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wey(@NotNull Act act) {
        super(act);
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m206033e0(wey weyVar, VisitorCounter visitorCounter) {
        ((hgy) weyVar.viewModel).m134989F(visitorCounter != null ? visitorCounter.totalCnt : 0, visitorCounter != null ? visitorCounter.newCnt : 0);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m206034f0() {
        CoreModule.f18264c.f20406m1.m35730s5();
        Long l2 = CoreModule.f18264c.f20429u0.f19996l0.get();
        CoreLikers coreLikers = CoreModule.f18264c.f20429u0;
        l2.getClass();
        coreLikers.m31457l7(l2.longValue());
        CoreModule.f18264c.f20406m1.m35711T4(CoreModule.f18264c.f20406m1.m35732u4());
    }

    /* JADX INFO: renamed from: g0 */
    public static void m206035g0(wey weyVar, Integer num) {
        hgy hgyVar = (hgy) weyVar.viewModel;
        num.getClass();
        hgyVar.m134987C(num.intValue());
    }

    /* JADX INFO: renamed from: h0 */
    public static Integer m206036h0(Function1 function1, Object obj) {
        return (Integer) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m206037i0(wey weyVar, Bundle bundle) {
        Intent intent;
        ((hgy) weyVar.viewModel).m134986B();
        ((hgy) weyVar.viewModel).m134988E();
        Act act = weyVar.act();
        String stringExtra = (act == null || (intent = act.getIntent()) == null) ? null : intent.getStringExtra("select_tab");
        if (TextUtils.equals(stringExtra, "nearby")) {
            ((hgy) weyVar.viewModel).m134994K(2);
            return;
        }
        boolean zEquals = TextUtils.equals(stringExtra, Visitor.TYPE);
        V v2 = weyVar.viewModel;
        if (zEquals) {
            ((hgy) v2).m134994K(1);
        } else {
            ((hgy) v2).m134994K(0);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static Integer m206038j0(CoreLikers.C4870a c4870a) {
        return Integer.valueOf(c4870a.f20013c);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        Intent intent;
        super.mo40472Z();
        CoreModule.f18264c.f20406m1.m35730s5();
        Act act = act();
        ((hgy) this.viewModel).m134993J(TextUtils.equals((act == null || (intent = act.getIntent()) == null) ? null : intent.getStringExtra("from"), "from_odiamond_weekly_report"));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.qey
            @Override // p153l.y20
            public final void call(Object obj) {
                wey.m206037i0(this.f157230a, (Bundle) obj);
            }
        }, new x20() { // from class: l.rey
            @Override // p153l.x20
            public final void call() {
                wey.m206034f0();
            }
        });
        C22421c<T> c22421cDuringCreated = duringCreated(CoreModule.f18264c.f20429u0.m31484u7());
        final Function1 function1 = new Function1() { // from class: l.sey
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return wey.m206038j0((CoreLikers.C4870a) obj);
            }
        };
        c22421cDuringCreated.map(new qcj() { // from class: l.tey
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return wey.m206036h0(function1, obj);
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.uey
            @Override // p153l.y20
            public final void call(Object obj) {
                wey.m206035g0(this.f178722a, (Integer) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20406m1.m35708Q4()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.vey
            @Override // p153l.y20
            public final void call(Object obj) {
                wey.m206033e0(this.f183864a, (VisitorCounter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m206039k0(int requestCode, int resultCode, @Nullable Intent data) {
        MeetLikersFrag meetLikersFragM134999q = ((hgy) this.viewModel).getMeetFrag();
        if (meetLikersFragM134999q != null && meetLikersFragM134999q.m41518R4(requestCode, resultCode, data)) {
            return true;
        }
        ODiamondFrag oDiamondFragM135001u = ((hgy) this.viewModel).getODiamondFrag();
        return oDiamondFragM135001u != null && oDiamondFragM135001u.m44040Q4(requestCode, resultCode, data);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
