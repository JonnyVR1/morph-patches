package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p051p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorFrag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Visitor;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0019\u001a\u00020\u00072*\u0010\u0018\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00150\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m88121d2 = {"Ll/xio;", "Ll/ar2;", "Ll/wjo;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "destroy", "()V", "Z", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "k0", "(IILandroid/content/Intent;)Z", "Lkotlin/Pair;", "Lcom/google/common/base/Optional;", "Ll/vg60;", "Lcom/p1/mobile/putong/data/User;", "pair", "j0", "(Lkotlin/Pair;)V", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class xio extends ar2<wjo> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xio(@NotNull Act act) {
        super(act);
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: e0 */
    public static Pair m211143e0(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: f0 */
    public static Pair m211144f0(Optional optional, Optional optional2) {
        return new Pair(optional, optional2);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m211145g0(xio xioVar, Bundle bundle) {
        Intent intent;
        ((wjo) xioVar.viewModel).m206725p();
        Act act = xioVar.act();
        boolean zEquals = TextUtils.equals((act == null || (intent = act.getIntent()) == null) ? null : intent.getStringExtra("select_tab"), Visitor.TYPE);
        V v2 = xioVar.viewModel;
        if (zEquals) {
            ((wjo) v2).m206728u(1);
        } else {
            ((wjo) v2).m206728u(0);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static void m211146h0(xio xioVar, Pair pair) {
        pair.getClass();
        xioVar.m211148j0(pair);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m211147i0() {
        CoreModule.f18264c.f20432v0.m153377n3();
        CoreModule.f18264c.f20432v0.m153376m3();
        CoreModule.f18264c.f20429u0.m31443g7(CoreLikers.LikersTriggerBy.home_tab_msg);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        Long lValueOf = CoreModule.f18264c.f20429u0.f19996l0.get();
        if (lValueOf.longValue() <= 0) {
            lValueOf = Long.valueOf(pzi0.m174454o());
        }
        CoreModule.f18264c.f20429u0.m31458m5();
        CoreModule.f18264c.f20432v0.m153377n3();
        CoreModule.f18264c.f20432v0.m153376m3();
        CoreModule.f18264c.f20432v0.m153369A3(lValueOf.longValue());
        CoreModule.f18264c.f20432v0.m153388y3("", lValueOf.longValue());
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.sio
            @Override // p153l.y20
            public final void call(Object obj) {
                xio.m211145g0(this.f168856a, (Bundle) obj);
            }
        }, new x20() { // from class: l.tio
            @Override // p153l.x20
            public final void call() {
                xio.m211147i0();
            }
        });
        C22421c<Optional<vg60<User>>> c22421cM153380q3 = CoreModule.f18264c.f20432v0.m153380q3();
        C22421c<Optional<vg60<User>>> c22421cM153379p3 = CoreModule.f18264c.f20432v0.m153379p3();
        final Function2 function2 = new Function2() { // from class: l.uio
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return xio.m211144f0((Optional) obj, (Optional) obj2);
            }
        };
        duringCreated(psd0.m173625r(c22421cM153380q3, c22421cM153379p3, new rcj() { // from class: l.vio
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return xio.m211143e0(function2, obj, obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.wio
            @Override // p153l.y20
            public final void call(Object obj) {
                xio.m211146h0(this.f189376a, (Pair) obj);
            }
        }));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX INFO: renamed from: j0 */
    public final void m211148j0(Pair<? extends Optional<vg60<User>>, ? extends Optional<vg60<User>>> pair) {
        int size;
        Optional<vg60<User>> first = pair.getFirst();
        Optional<vg60<User>> second = pair.getSecond();
        if (first.isPresent() && second.isPresent()) {
            int i = 0;
            if (first.isPresent()) {
                vg60<User> vg60Var = first.get();
                List<User> list = vg60Var.f184001a;
                list.getClass();
                if (list.isEmpty()) {
                    size = 0;
                } else {
                    size = vg60Var.f184001a.size();
                }
            } else {
                size = 0;
            }
            if (second.isPresent()) {
                vg60<User> vg60Var2 = second.get();
                List<User> list2 = vg60Var2.f184001a;
                list2.getClass();
                if (!list2.isEmpty()) {
                    i = vg60Var2.f184002b.total;
                }
            }
            ((wjo) this.viewModel).m206726q(size + i);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m211149k0(int requestCode, int resultCode, @Nullable Intent data) {
        IntlMeetLikersFrag intlMeetLikersFragM206718f = ((wjo) this.viewModel).getMeetFrag();
        if (intlMeetLikersFragM206718f != null && intlMeetLikersFragM206718f.m40385T4(requestCode, resultCode, data)) {
            return true;
        }
        IntlMeetVisitorFrag intlMeetVisitorFragM206719i = ((wjo) this.viewModel).getVisitorFrag();
        return intlMeetVisitorFragM206719i != null && intlMeetVisitorFragM206719i.m40511R4(requestCode, resultCode, data);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
