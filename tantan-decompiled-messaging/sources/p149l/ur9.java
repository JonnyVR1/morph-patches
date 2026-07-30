package p149l;

import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.MembershipRecommendUser;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Ll/ur9;", "Ll/ax6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "id", "", "silently", "", "c3", "(Ljava/lang/String;Z)V", "Lrx/subjects/a;", "Ll/q860;", "Lcom/p1/mobile/putong/core/data/MembershipRecommendUser;", "R", "Lrx/subjects/a;", "membershipSuggestUserBs", "Ljava/util/HashSet;", j6f.LATITUDE_SOUTH, "Ljava/util/HashSet;", "membershipSuggestUserIds", "b_core_base"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ur9 extends ax6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public C22392a<q860<MembershipRecommendUser>> membershipSuggestUserBs;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final HashSet<String> membershipSuggestUserIds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur9(@NotNull C4732c c4732c) {
        super(c4732c);
        c4732c.getClass();
        C22392a<q860<MembershipRecommendUser>> c22392aM221512b = C22392a.m221512b();
        c22392aM221512b.getClass();
        this.membershipSuggestUserBs = c22392aM221512b;
        this.membershipSuggestUserIds = new HashSet<>();
    }

    /* JADX INFO: renamed from: a3 */
    public static Boolean m195049a3(String str, MembershipRecommendUser membershipRecommendUser) {
        membershipRecommendUser.getClass();
        return Boolean.valueOf(Intrinsics.m87488d(membershipRecommendUser.f20439id, str));
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ void m195050d3(ur9 ur9Var, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        ur9Var.m195052c3(str, z);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: b3 */
    public final void m195051b3(@NotNull String str) {
        str.getClass();
        m195050d3(this, str, false, 2, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: c3 */
    public final void m195052c3(@NotNull final String id, boolean silently) {
        id.getClass();
        if (NullChecker.m81303a(this.membershipSuggestUserBs.m221515e()) && vwb.m200322e0(this.membershipSuggestUserBs.m221515e().f153135a, new w9j() { // from class: l.tr9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ur9.m195049a3(id, (MembershipRecommendUser) obj);
            }
        })) {
            this.membershipSuggestUserBs.m221515e().f153136b.total--;
            if (silently) {
                return;
            }
            C22392a<q860<MembershipRecommendUser>> c22392a = this.membershipSuggestUserBs;
            c22392a.onNext(c22392a.m221515e());
        }
    }
}
