package p009l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p000p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.data.User;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import l.d30;
import l.e30;
import l.jq2;
import l.mkd0;
import l.s7m;
import l.x9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0019\u001a\u00020\u00072*\u0010\u0018\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00150\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Ll/xgo;", "Ll/jq2;", "Ll/who;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "destroy", "()V", "Z", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "", "k0", "(IILandroid/content/Intent;)Z", "Lkotlin/Pair;", "Lcom/google/common/base/Optional;", "Ll/q860;", "Lcom/p1/mobile/putong/data/User;", "pair", "j0", "(Lkotlin/Pair;)V", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class xgo extends jq2<who> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgo(@NotNull Act act) {
        super(act);
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: e0 */
    public static Pair m24885e0(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: f0 */
    public static Pair m24886f0(Optional optional, Optional optional2) {
        return new Pair(optional, optional2);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m24887g0(xgo xgoVar, Bundle bundle) {
        Intent intent;
        ((who) ((jq2) xgoVar).viewModel).m24217p();
        Act act = xgoVar.act();
        boolean zEquals = TextUtils.equals((act == null || (intent = act.getIntent()) == null) ? null : intent.getStringExtra("select_tab"), "visitor");
        s7m s7mVar = ((jq2) xgoVar).viewModel;
        if (zEquals) {
            ((who) s7mVar).m24220u(1);
        } else {
            ((who) s7mVar).m24220u(0);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static void m24888h0(xgo xgoVar, Pair pair) {
        pair.getClass();
        xgoVar.m24892j0(pair);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m24889i0() {
        CoreModule.c.v0.n3();
        CoreModule.c.v0.m3();
        CoreModule.c.u0.c7(CoreLikers.LikersTriggerBy.home_tab_msg);
    }

    /* JADX INFO: renamed from: Z */
    public void m24890Z() {
        super.Z();
        Long lValueOf = (Long) CoreModule.c.u0.k0.get();
        if (lValueOf.longValue() <= 0) {
            lValueOf = Long.valueOf(mqi0.m18550o());
        }
        CoreModule.c.u0.m5();
        CoreModule.c.v0.n3();
        CoreModule.c.v0.m3();
        CoreModule.c.v0.A3(lValueOf.longValue());
        CoreModule.c.v0.y3("", lValueOf.longValue());
    }

    /* JADX INFO: renamed from: a0 */
    public void m24891a0() {
        super.a0();
        creates(new e30() { // from class: l.sgo
            public final void call(Object obj) {
                xgo.m24887g0(this.f20251a, (Bundle) obj);
            }
        }, new d30() { // from class: l.tgo
            public final void call() {
                xgo.m24889i0();
            }
        });
        c cVarQ3 = CoreModule.c.v0.q3();
        c cVarP3 = CoreModule.c.v0.p3();
        final Function2 function2 = new Function2() { // from class: l.ugo
            public final Object invoke(Object obj, Object obj2) {
                return xgo.m24886f0((Optional) obj, (Optional) obj2);
            }
        };
        duringCreated(mkd0.r(cVarQ3, cVarP3, new x9j() { // from class: l.vgo
            public final Object call(Object obj, Object obj2) {
                return xgo.m24885e0(function2, obj, obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.wgo
            public final void call(Object obj) {
                xgo.m24888h0(this.f22105a, (Pair) obj);
            }
        }));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX INFO: renamed from: j0 */
    public final void m24892j0(Pair<? extends Optional<q860<User>>, ? extends Optional<q860<User>>> pair) {
        int size;
        Optional optional = (Optional) pair.getFirst();
        Optional optional2 = (Optional) pair.getSecond();
        if (optional.isPresent() && optional2.isPresent()) {
            int i = 0;
            if (optional.isPresent()) {
                q860 q860Var = (q860) optional.get();
                Collection collection = q860Var.f19068a;
                collection.getClass();
                if (collection.isEmpty()) {
                    size = 0;
                } else {
                    size = q860Var.f19068a.size();
                }
            } else {
                size = 0;
            }
            if (optional2.isPresent()) {
                q860 q860Var2 = (q860) optional2.get();
                Collection collection2 = q860Var2.f19068a;
                collection2.getClass();
                if (!collection2.isEmpty()) {
                    i = q860Var2.f19069b.total;
                }
            }
            ((who) ((jq2) this).viewModel).m24218q(size + i);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m24893k0(int requestCode, int resultCode, @Nullable Intent data) {
        IntlMeetLikersFrag meetFrag = ((who) ((jq2) this).viewModel).getMeetFrag();
        if (meetFrag != null && meetFrag.m3427T4(requestCode, resultCode, data)) {
            return true;
        }
        IntlMeetVisitorFrag visitorFrag = ((who) ((jq2) this).viewModel).getVisitorFrag();
        return visitorFrag != null && visitorFrag.m3568R4(requestCode, resultCode, data);
    }

    public void destroy() {
    }
}
