package com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p149l.dac0;
import p149l.e30;
import p149l.ikf0;
import p149l.j760;
import p149l.l80;
import p149l.o6c0;
import p149l.t100;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.b */
/* JADX INFO: loaded from: classes12.dex */
public class C11344b extends dac0<FeedStatusSquareTabFrag.C11342f> {

    /* JADX INFO: renamed from: c */
    public List<FeedStatusSquareTabFrag.C11342f> f42890c;

    /* JADX INFO: renamed from: d */
    public Act f42891d;

    /* JADX INFO: renamed from: e */
    public e30<Integer> f42892e;

    /* JADX INFO: renamed from: f */
    public l80<FeedStatusSquareTabFrag.C11342f> f42893f = new a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.newtab.b$a */
    public class a extends l80<FeedStatusSquareTabFrag.C11342f> {
        public a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo63937k(FeedStatusSquareTabFrag.C11342f c11342f, int i, View view) {
            switch (c11342f.f42880d) {
                case 1:
                    zvf0.m220402x("e_quickchat_button", "p_state_explore");
                    break;
                case 2:
                    zvf0.m220402x("e_voicechat_button", "p_state_explore");
                    break;
                case 3:
                    zvf0.m220368A("e_searchfunchat", "p_state_explore", j760.m140076a("funchat_remainingtimes", "" + FeedModule.m60222H().mo30746b3()));
                    break;
                case 4:
                    zvf0.m220402x("e_voice_chat", "p_state_explore");
                    break;
                case 5:
                    zvf0.m220402x("e_meet_greet", "p_state_explore");
                    break;
                case 6:
                    zvf0.m220402x("e_chatting_partner_signal", "p_state_explore");
                    break;
                case 7:
                    zvf0.m220402x("e_live_video_quickchat_button", "p_state_explore");
                    break;
            }
        }
    }

    public C11344b(Act act, List<FeedStatusSquareTabFrag.C11342f> list, e30<Integer> e30Var) {
        this.f42890c = new ArrayList();
        this.f42891d = act;
        this.f42890c = list;
        this.f42892e = e30Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f42890c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f42891d.inflater().inflate(o6c0.f142261p3, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final FeedStatusSquareTabFrag.C11342f c11342f, int i, int i2) {
        if (view instanceof FeedStateSquareBottomViewItem) {
            this.f42893f.m148839h(view, c11342f, i2);
            FeedStateSquareBottomViewItem feedStateSquareBottomViewItem = (FeedStateSquareBottomViewItem) view;
            float fM186890d = t100.m186890d(200.0f);
            if (this.f42890c.size() <= 5) {
                fM186890d = (ikf0.m136795i(xdl0.m208412y0()) - 42.0f) / Math.min(this.f42890c.size(), 5);
            }
            if (ikf0.m136795i(xdl0.m208412y0()) < 600.0f) {
                fM186890d = 105.0f;
            }
            xdl0.m208327D0(t100.m186890d(fM186890d), view);
            feedStateSquareBottomViewItem.m65598q(c11342f, i2 == this.f42890c.size() - 1);
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.b2i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f72699a.m65722H(c11342f, view2);
                }
            });
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public FeedStatusSquareTabFrag.C11342f getItem(int i) {
        return this.f42890c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m65722H(FeedStatusSquareTabFrag.C11342f c11342f, View view) {
        if (NullChecker.m81303a(this.f42892e)) {
            this.f42892e.call(Integer.valueOf(c11342f.f42880d));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull @NotNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        this.f42893f.m148842o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull @NotNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f42893f.m148842o();
    }
}
