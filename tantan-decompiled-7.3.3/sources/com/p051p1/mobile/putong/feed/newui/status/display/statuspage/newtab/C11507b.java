package com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p153l.bnl0;
import p153l.h80;
import p153l.i4g0;
import p153l.jic0;
import p153l.pf60;
import p153l.qa00;
import p153l.rsf0;
import p153l.tec0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.b */
/* JADX INFO: loaded from: classes13.dex */
public class C11507b extends jic0<FeedStatusSquareTabFrag.C11505f> {

    /* JADX INFO: renamed from: c */
    public List<FeedStatusSquareTabFrag.C11505f> f43738c;

    /* JADX INFO: renamed from: d */
    public Act f43739d;

    /* JADX INFO: renamed from: e */
    public y20<Integer> f43740e;

    /* JADX INFO: renamed from: f */
    public h80<FeedStatusSquareTabFrag.C11505f> f43741f = new a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.b$a */
    public class a extends h80<FeedStatusSquareTabFrag.C11505f> {
        public a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo65120k(FeedStatusSquareTabFrag.C11505f c11505f, int i, View view) {
            switch (c11505f.f43728d) {
                case 1:
                    i4g0.m138526x("e_quickchat_button", "p_state_explore");
                    break;
                case 2:
                    i4g0.m138526x("e_voicechat_button", "p_state_explore");
                    break;
                case 3:
                    i4g0.m138492A("e_searchfunchat", "p_state_explore", pf60.m172085a("funchat_remainingtimes", "" + FeedModule.m61406H().mo31749b3()));
                    break;
                case 4:
                    i4g0.m138526x("e_voice_chat", "p_state_explore");
                    break;
                case 5:
                    i4g0.m138526x("e_meet_greet", "p_state_explore");
                    break;
                case 6:
                    i4g0.m138526x("e_chatting_partner_signal", "p_state_explore");
                    break;
                case 7:
                    i4g0.m138526x("e_live_video_quickchat_button", "p_state_explore");
                    break;
            }
        }
    }

    public C11507b(Act act, List<FeedStatusSquareTabFrag.C11505f> list, y20<Integer> y20Var) {
        this.f43738c = new ArrayList();
        this.f43739d = act;
        this.f43738c = list;
        this.f43740e = y20Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f43738c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f43739d.inflater().inflate(tec0.f173730p3, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final FeedStatusSquareTabFrag.C11505f c11505f, int i, int i2) {
        if (view instanceof FeedStateSquareBottomViewItem) {
            this.f43741f.m133881h(view, c11505f, i2);
            FeedStateSquareBottomViewItem feedStateSquareBottomViewItem = (FeedStateSquareBottomViewItem) view;
            float fM175859d = qa00.m175859d(200.0f);
            if (this.f43738c.size() <= 5) {
                fM175859d = (rsf0.m182965i(bnl0.m105592y0()) - 42.0f) / Math.min(this.f43738c.size(), 5);
            }
            if (rsf0.m182965i(bnl0.m105592y0()) < 600.0f) {
                fM175859d = 105.0f;
            }
            bnl0.m105507D0(qa00.m175859d(fM175859d), view);
            feedStateSquareBottomViewItem.m66781q(c11505f, i2 == this.f43738c.size() - 1);
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.q3i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f155448a.m66905H(c11505f, view2);
                }
            });
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public FeedStatusSquareTabFrag.C11505f getItem(int i) {
        return this.f43738c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m66905H(FeedStatusSquareTabFrag.C11505f c11505f, View view) {
        if (NullChecker.m82486a(this.f43740e)) {
            this.f43740e.call(Integer.valueOf(c11505f.f43728d));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull @NotNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        this.f43741f.m133884o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull @NotNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f43741f.m133884o();
    }
}
