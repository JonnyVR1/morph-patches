package p153l;

import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.MembershipRecommendUser;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m88121d2 = {"Ll/ft9;", "Ll/dy6;", "Lcom/p1/mobile/putong/core/api/c;", "api", "<init>", "(Lcom/p1/mobile/putong/core/api/c;)V", "", "id", "", "silently", "", "c3", "(Ljava/lang/String;Z)V", "Lrx/subjects/a;", "Ll/vg60;", "Lcom/p1/mobile/putong/core/data/MembershipRecommendUser;", "R", "Lrx/subjects/a;", "membershipSuggestUserBs", "Ljava/util/HashSet;", p7f.LATITUDE_SOUTH, "Ljava/util/HashSet;", "membershipSuggestUserIds", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ft9 extends dy6 {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public C22507a<vg60<MembershipRecommendUser>> membershipSuggestUserBs;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public final HashSet<String> membershipSuggestUserIds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft9(@NotNull C4883c c4883c) {
        super(c4883c);
        c4883c.getClass();
        C22507a<vg60<MembershipRecommendUser>> c22507aM222758b = C22507a.m222758b();
        c22507aM222758b.getClass();
        this.membershipSuggestUserBs = c22507aM222758b;
        this.membershipSuggestUserIds = new HashSet<>();
    }

    /* JADX INFO: renamed from: a3 */
    public static Boolean m127301a3(String str, MembershipRecommendUser membershipRecommendUser) {
        membershipRecommendUser.getClass();
        return Boolean.valueOf(Intrinsics.m88377d(membershipRecommendUser.f21181id, str));
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ void m127302d3(ft9 ft9Var, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        ft9Var.m127304c3(str, z);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: b3 */
    public final void m127303b3(@NotNull String str) {
        str.getClass();
        m127302d3(this, str, false, 2, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: c3 */
    public final void m127304c3(@NotNull final String id, boolean silently) {
        id.getClass();
        if (NullChecker.m82486a(this.membershipSuggestUserBs.m222761e()) && jyb.m147505e0(this.membershipSuggestUserBs.m222761e().f184001a, new qcj() { // from class: l.et9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ft9.m127301a3(id, (MembershipRecommendUser) obj);
            }
        })) {
            this.membershipSuggestUserBs.m222761e().f184002b.total--;
            if (silently) {
                return;
            }
            C22507a<vg60<MembershipRecommendUser>> c22507a = this.membershipSuggestUserBs;
            c22507a.onNext(c22507a.m222761e());
        }
    }
}
