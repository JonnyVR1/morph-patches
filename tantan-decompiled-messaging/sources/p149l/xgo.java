package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p046p1.mobile.putong.core.newui.intlmeet.visitor.IntlMeetVisitorFrag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Visitor;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0019\u001a\u00020\u00072*\u0010\u0018\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00150\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m87232d2 = {"Ll/xgo;", "Ll/jq2;", "Ll/who;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "destroy", "()V", "Z", "a0", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "k0", "(IILandroid/content/Intent;)Z", "Lkotlin/Pair;", "Lcom/google/common/base/Optional;", "Ll/q860;", "Lcom/p1/mobile/putong/data/User;", "pair", "j0", "(Lkotlin/Pair;)V", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static Pair m208685e0(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: f0 */
    public static Pair m208686f0(Optional optional, Optional optional2) {
        return new Pair(optional, optional2);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m208687g0(xgo xgoVar, Bundle bundle) {
        Intent intent;
        ((who) xgoVar.viewModel).m203236p();
        Act act = xgoVar.act();
        boolean zEquals = TextUtils.equals((act == null || (intent = act.getIntent()) == null) ? null : intent.getStringExtra("select_tab"), Visitor.TYPE);
        V v2 = xgoVar.viewModel;
        if (zEquals) {
            ((who) v2).m203239u(1);
        } else {
            ((who) v2).m203239u(0);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static void m208688h0(xgo xgoVar, Pair pair) {
        pair.getClass();
        xgoVar.m208690j0(pair);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m208689i0() {
        CoreModule.f17545c.f19690v0.m105764n3();
        CoreModule.f17545c.f19690v0.m105763m3();
        CoreModule.f17545c.f19687u0.m30433c7(CoreLikers.LikersTriggerBy.home_tab_msg);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        Long lValueOf = CoreModule.f17545c.f19687u0.f19254k0.get();
        if (lValueOf.longValue() <= 0) {
            lValueOf = Long.valueOf(mqi0.m155944o());
        }
        CoreModule.f17545c.f19687u0.m30456m5();
        CoreModule.f17545c.f19690v0.m105764n3();
        CoreModule.f17545c.f19690v0.m105763m3();
        CoreModule.f17545c.f19690v0.m105757A3(lValueOf.longValue());
        CoreModule.f17545c.f19690v0.m105775y3("", lValueOf.longValue());
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.sgo
            @Override // p149l.e30
            public final void call(Object obj) {
                xgo.m208687g0(this.f164455a, (Bundle) obj);
            }
        }, new d30() { // from class: l.tgo
            @Override // p149l.d30
            public final void call() {
                xgo.m208689i0();
            }
        });
        C22306c<Optional<q860<User>>> c22306cM105767q3 = CoreModule.f17545c.f19690v0.m105767q3();
        C22306c<Optional<q860<User>>> c22306cM105766p3 = CoreModule.f17545c.f19690v0.m105766p3();
        final Function2 function2 = new Function2() { // from class: l.ugo
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return xgo.m208686f0((Optional) obj, (Optional) obj2);
            }
        };
        duringCreated(mkd0.m154984r(c22306cM105767q3, c22306cM105766p3, new x9j() { // from class: l.vgo
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return xgo.m208685e0(function2, obj, obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.wgo
            @Override // p149l.e30
            public final void call(Object obj) {
                xgo.m208688h0(this.f186211a, (Pair) obj);
            }
        }));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX INFO: renamed from: j0 */
    public final void m208690j0(Pair<? extends Optional<q860<User>>, ? extends Optional<q860<User>>> pair) {
        int size;
        Optional<q860<User>> first = pair.getFirst();
        Optional<q860<User>> second = pair.getSecond();
        if (first.isPresent() && second.isPresent()) {
            int i = 0;
            if (first.isPresent()) {
                q860<User> q860Var = first.get();
                List<User> list = q860Var.f153135a;
                list.getClass();
                if (list.isEmpty()) {
                    size = 0;
                } else {
                    size = q860Var.f153135a.size();
                }
            } else {
                size = 0;
            }
            if (second.isPresent()) {
                q860<User> q860Var2 = second.get();
                List<User> list2 = q860Var2.f153135a;
                list2.getClass();
                if (!list2.isEmpty()) {
                    i = q860Var2.f153136b.total;
                }
            }
            ((who) this.viewModel).m203237q(size + i);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m208691k0(int requestCode, int resultCode, @Nullable Intent data) {
        IntlMeetLikersFrag intlMeetLikersFragM203229f = ((who) this.viewModel).getMeetFrag();
        if (intlMeetLikersFragM203229f != null && intlMeetLikersFragM203229f.m39382T4(requestCode, resultCode, data)) {
            return true;
        }
        IntlMeetVisitorFrag intlMeetVisitorFragM203230i = ((who) this.viewModel).getVisitorFrag();
        return intlMeetVisitorFragM203230i != null && intlMeetVisitorFragM203230i.m39508R4(requestCode, resultCode, data);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
