package p149l;

import com.p046p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: loaded from: classes11.dex */
public class uof extends kof {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(lof.C18270a c18270a) {
        if (c18270a.f129098h || !c18270a.m150772a()) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        snf.m185058M(c18270a.f129091a, c18270a.f129097g, c18270a.f129094d, true);
        c18270a.f129101k.mo36354M3(c18270a.m150772a(), "no_condition_to_rightswipe");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(lof.C18270a c18270a) {
        return !c18270a.f129098h && c18270a.m150772a();
    }
}
