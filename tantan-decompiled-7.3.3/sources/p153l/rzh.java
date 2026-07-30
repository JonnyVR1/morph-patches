package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.state.FeedMomentPostSelectStatusAct;
import com.p051p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p051p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import com.p051p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct;
import com.p051p1.mobile.putong.feed.newui.status.selectstatus.adapter.FeedSelectStatusItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes13.dex */
public class rzh extends r8h<uzh> {

    /* JADX INFO: renamed from: c */
    public Act f165531c;

    /* JADX INFO: renamed from: d */
    public String f165532d;

    /* JADX INFO: renamed from: e */
    public List<uzh> f165533e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public y20<Emotion> f165534f;

    /* JADX INFO: renamed from: g */
    public h80 f165535g;

    public rzh(Act act, String str, h80 h80Var) {
        this.f165532d = str;
        this.f165531c = act;
        this.f165535g = h80Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f165533e.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return new FeedSelectStatusItem(this.f165531c);
    }

    @Override // p153l.r8h
    /* JADX INFO: renamed from: E */
    public View mo180207E() {
        if (cmg.m111169A() || cmg.m111238u0()) {
            TextView textView = new TextView(this.f165531c);
            textView.setTextColor(this.f165531c.getResources().getColor(k9c0.f124471C));
            textView.setTextSize(12.0f);
            return textView;
        }
        TextView textView2 = new TextView(this.f165531c);
        textView2.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        textView2.setTextSize(13.0f);
        textView2.getPaint().setFakeBoldText(true);
        return textView2;
    }

    @Override // p153l.r8h
    /* JADX INFO: renamed from: F */
    public boolean mo180208F(int i) {
        return this.f165533e.get(i).m198837e();
    }

    @Override // p153l.r8h
    /* JADX INFO: renamed from: G */
    public void mo180209G(View view, int i) {
        if (view instanceof TextView) {
            ((TextView) view).setText(this.f165533e.get(i).m198833a());
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final uzh uzhVar, int i, int i2) {
        if (view instanceof FeedSelectStatusItem) {
            FeedSelectStatusItem feedSelectStatusItem = (FeedSelectStatusItem) view;
            feedSelectStatusItem.setOnClickListener(new View.OnClickListener() { // from class: l.qzh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f160263a.m183750K(uzhVar, view2);
                }
            });
            feedSelectStatusItem.m67019S(uzhVar);
            if (cmg.m111169A()) {
                Act act = this.f165531c;
                if (act instanceof FeedSelectAndPostStatusAct) {
                    FeedSelectAndPostStatusAct feedSelectAndPostStatusAct = (FeedSelectAndPostStatusAct) act;
                    if (NullChecker.m82486a(feedSelectAndPostStatusAct.f43815h) && TextUtils.equals(feedSelectAndPostStatusAct.f43815h.f39596id, uzhVar.m198834b().f39596id)) {
                        feedSelectStatusItem.m67021V(true);
                    }
                }
            }
            if (cmg.m111238u0()) {
                Act act2 = this.f165531c;
                if (act2 instanceof FeedMomentPostSelectStatusAct) {
                    FeedMomentPostSelectStatusAct feedMomentPostSelectStatusAct = (FeedMomentPostSelectStatusAct) act2;
                    if (NullChecker.m82486a(feedMomentPostSelectStatusAct.f41651h) && TextUtils.equals(feedMomentPostSelectStatusAct.f41651h.f39596id, uzhVar.m198834b().f39596id)) {
                        feedSelectStatusItem.m67021V(true);
                    }
                }
            }
            float fM105592y0 = ((((((bnl0.m105592y0() - (qa00.m175859d(20.0f) * 2)) - (qa00.m175859d(8.0f) * 3)) / 4) * 84.0f) / 68.0f) - qa00.m175859d(52.0f)) - qa00.m175859d(17.0f);
            float f = fM105592y0 / 3.0f;
            feedSelectStatusItem.m67020T((int) f, (int) (fM105592y0 - f));
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public uzh getItem(int i) {
        return this.f165533e.get(i);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m183750K(uzh uzhVar, View view) {
        m183751L(uzhVar);
    }

    /* JADX INFO: renamed from: L */
    public void m183751L(uzh uzhVar) {
        if ((cmg.m111169A() || cmg.m111238u0()) && NullChecker.m82486a(this.f165534f)) {
            this.f165534f.call(uzhVar.m198834b());
            if (!TextUtils.equals("p_moment_fast_state_post", this.f165532d)) {
                i4g0.m138523u("e_set_my_state_type", this.f165532d, jyb.m147494Y("state_type_id", uzhVar.m198834b().f39596id));
            }
            notifyDataSetChanged();
            return;
        }
        if (cmg.m111238u0() && (this.f165531c instanceof FeedMomentPostSelectStatusAct)) {
            return;
        }
        Act act = this.f165531c;
        FeedSelectStatusAct feedSelectStatusAct = (FeedSelectStatusAct) act;
        act.startActivity(FeedPostStatusAct.m66990u2(act, uzhVar.m198834b(), this.f165532d));
        feedSelectStatusAct.overridePendingTransition(0, 0);
        feedSelectStatusAct.m66983l2();
        i4g0.m138523u("e_set_my_state_type", "p_set_my_state", jyb.m147494Y("state_type_id", uzhVar.m198834b().f39596id));
    }

    /* JADX INFO: renamed from: M */
    public void m183752M(List<uzh> list) {
        this.f165533e.clear();
        this.f165533e.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: N */
    public void m183753N(y20<Emotion> y20Var) {
        this.f165534f = y20Var;
    }

    @Override // p153l.r8h, p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        super.onBindViewHolder(abstractC0569e0, i);
        this.f165535g.m133881h(abstractC0569e0.itemView, this.f165533e.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        this.f165535g.m133880g(abstractC0569e0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f165535g.m133882i(abstractC0569e0.itemView);
    }
}
