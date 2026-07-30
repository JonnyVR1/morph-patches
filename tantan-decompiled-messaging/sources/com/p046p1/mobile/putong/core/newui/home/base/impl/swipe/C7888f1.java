package com.p046p1.mobile.putong.core.newui.home.base.impl.swipe;

import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.data.User;
import p149l.jj4;
import p149l.nt30;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.f1 */
/* JADX INFO: loaded from: classes11.dex */
public class C7888f1 extends AbstractC7871a {

    /* JADX INFO: renamed from: g */
    public static volatile boolean f22079g = false;

    /* JADX INFO: renamed from: h */
    public static volatile boolean f22080h = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.base.impl.swipe.f1$a */
    public class a implements C7915o1.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C7898j.a f22081a;

        public a(C7898j.a aVar) {
            this.f22081a = aVar;
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7915o1.a
        /* JADX INFO: renamed from: a */
        public void mo37598a() {
            C7888f1.f22080h = true;
            C7888f1.f22079g = false;
            this.f22081a.f22094a.m161181X8(true);
            if (this.f22081a.f22095b.m37341q2().isAdded()) {
                this.f22081a.f22095b.m37125A2().mo38801A(SwipeDirection.UP);
            }
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.base.impl.swipe.C7915o1.a
        public void onCancel() {
            C7888f1.f22079g = false;
            this.f22081a.f22094a.m161186Y8(false);
            C7915o1.m37714c(this.f22081a.f22095b.m37125A2());
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m37615s() {
        return f22080h;
    }

    /* JADX INFO: renamed from: t */
    public static void m37616t() {
        f22080h = false;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m37617v(C7898j.a aVar) {
        jj4 jj4Var;
        if (aVar == null || (jj4Var = aVar.f22096c) == null || jj4Var.m141745d() == null) {
            return false;
        }
        User userM141745d = aVar.f22096c.m141745d();
        return C7915o1.m37715d(new C7915o1.b(userM141745d, aVar.f22097d, aVar.f22094a.m161262p6(), aVar.f22094a.m161235j6(userM141745d.f56011id)));
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(C7898j.a aVar) {
        boolean zM161266q6 = aVar.f22094a.m161266q6();
        nt30 nt30Var = aVar.f22094a;
        if (zM161266q6) {
            nt30Var.m161201c5();
            return VSwipeStack.OnCardSwipeResult.stay;
        }
        nt30Var.m161186Y8(true);
        f22079g = true;
        C7915o1.m37716e(aVar.f22095b.act(), aVar.f22096c.m141745d().f56011id, new a(aVar));
        aVar.f22094a.m161201c5();
        return VSwipeStack.OnCardSwipeResult.stay;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(C7898j.a aVar) {
        if (f22080h || f22079g) {
            return false;
        }
        return m37617v(aVar);
    }
}
