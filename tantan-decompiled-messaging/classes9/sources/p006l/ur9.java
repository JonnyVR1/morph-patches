package p006l;

import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.MembershipRecommendUser;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import l.q860;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ll/ur9;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "id", "", "silently", "", "c3", "(Ljava/lang/String;Z)V", "Lrx/subjects/a;", "Ll/q860;", "Lcom/p1/mobile/putong/core/data/MembershipRecommendUser;", "R", "Lrx/subjects/a;", "membershipSuggestUserBs", "Ljava/util/HashSet;", "S", "Ljava/util/HashSet;", "membershipSuggestUserIds", "b_core_base"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ur9 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public a<q860<MembershipRecommendUser>> membershipSuggestUserBs;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final HashSet<String> membershipSuggestUserIds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur9(@NotNull C0158c c0158c) {
        super(c0158c);
        c0158c.getClass();
        a<q860<MembershipRecommendUser>> aVarB = a.b();
        aVarB.getClass();
        this.membershipSuggestUserBs = aVarB;
        this.membershipSuggestUserIds = new HashSet<>();
    }

    /* JADX INFO: renamed from: a3 */
    public static Boolean m25551a3(String str, MembershipRecommendUser membershipRecommendUser) {
        membershipRecommendUser.getClass();
        return Boolean.valueOf(Intrinsics.d(membershipRecommendUser.id, str));
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ void m25552d3(ur9 ur9Var, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        ur9Var.m25554c3(str, z);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: b3 */
    public final void m25553b3(@NotNull String str) {
        str.getClass();
        m25552d3(this, str, false, 2, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: c3 */
    public final void m25554c3(@NotNull final String id, boolean silently) {
        id.getClass();
        if (NullChecker.a(this.membershipSuggestUserBs.e()) && vwb.e0(((q860) this.membershipSuggestUserBs.e()).a, new w9j() { // from class: l.tr9
            public final Object call(Object obj) {
                return ur9.m25551a3(id, (MembershipRecommendUser) obj);
            }
        })) {
            ((q860) this.membershipSuggestUserBs.e()).b.total--;
            if (silently) {
                return;
            }
            a<q860<MembershipRecommendUser>> aVar = this.membershipSuggestUserBs;
            aVar.onNext(aVar.e());
        }
    }
}
