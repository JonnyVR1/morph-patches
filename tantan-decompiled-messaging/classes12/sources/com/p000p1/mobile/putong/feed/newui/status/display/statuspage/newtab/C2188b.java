package com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.ikf0;
import l.j760;
import l.t100;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import p007l.l80;
import p007l.o6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2188b extends dac0<FeedStatusSquareTabFrag.C2186f> {

    /* JADX INFO: renamed from: c */
    public List<FeedStatusSquareTabFrag.C2186f> f4351c;

    /* JADX INFO: renamed from: d */
    public Act f4352d;

    /* JADX INFO: renamed from: e */
    public e30<Integer> f4353e;

    /* JADX INFO: renamed from: f */
    public l80<FeedStatusSquareTabFrag.C2186f> f4354f = new a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.b$a */
    public class a extends l80<FeedStatusSquareTabFrag.C2186f> {
        public a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo4975k(FeedStatusSquareTabFrag.C2186f c2186f, int i, View view) {
            switch (c2186f.f4341d) {
                case 1:
                    zvf0.x("e_quickchat_button", "p_state_explore");
                    break;
                case 2:
                    zvf0.x("e_voicechat_button", "p_state_explore");
                    break;
                case 3:
                    zvf0.A("e_searchfunchat", "p_state_explore", new j760[]{j760.a("funchat_remainingtimes", "" + FeedModule.m1140H().b3())});
                    break;
                case 4:
                    zvf0.x("e_voice_chat", "p_state_explore");
                    break;
                case 5:
                    zvf0.x("e_meet_greet", "p_state_explore");
                    break;
                case 6:
                    zvf0.x("e_chatting_partner_signal", "p_state_explore");
                    break;
                case 7:
                    zvf0.x("e_live_video_quickchat_button", "p_state_explore");
                    break;
            }
        }
    }

    public C2188b(Act act, List<FeedStatusSquareTabFrag.C2186f> list, e30<Integer> e30Var) {
        this.f4351c = new ArrayList();
        this.f4352d = act;
        this.f4351c = list;
        this.f4353e = e30Var;
    }

    /* JADX INFO: renamed from: C */
    public int m6864C() {
        return this.f4351c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m6865D(ViewGroup viewGroup, int i) {
        return this.f4352d.inflater().inflate(o6c0.f11280p3, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m6863A(View view, final FeedStatusSquareTabFrag.C2186f c2186f, int i, int i2) {
        if (view instanceof FeedStateSquareBottomViewItem) {
            this.f4354f.m11594h(view, c2186f, i2);
            FeedStateSquareBottomViewItem feedStateSquareBottomViewItem = (FeedStateSquareBottomViewItem) view;
            float fD = t100.d(200.0f);
            if (this.f4351c.size() <= 5) {
                fD = (ikf0.i(xdl0.y0()) - 42.0f) / Math.min(this.f4351c.size(), 5);
            }
            if (ikf0.i(xdl0.y0()) < 600.0f) {
                fD = 105.0f;
            }
            xdl0.D0(t100.d(fD), new View[]{view});
            feedStateSquareBottomViewItem.m6735q(c2186f, i2 == this.f4351c.size() - 1);
            xdl0.E0(view, new View.OnClickListener() { // from class: l.b2i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f5893a.m6868H(c2186f, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public FeedStatusSquareTabFrag.C2186f getItem(int i) {
        return this.f4351c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m6868H(FeedStatusSquareTabFrag.C2186f c2186f, View view) {
        if (NullChecker.a(this.f4353e)) {
            this.f4353e.call(Integer.valueOf(c2186f.f4341d));
        }
    }

    public void onViewAttachedToWindow(@NonNull @NotNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        this.f4354f.m11597o();
    }

    public void onViewDetachedFromWindow(@NonNull @NotNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        this.f4354f.m11597o();
    }
}
