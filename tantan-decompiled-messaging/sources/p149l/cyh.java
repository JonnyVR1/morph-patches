package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.state.FeedMomentPostSelectStatusAct;
import com.p046p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p046p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import com.p046p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct;
import com.p046p1.mobile.putong.feed.newui.status.selectstatus.adapter.FeedSelectStatusItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class cyh extends c7h<fyh> {

    /* JADX INFO: renamed from: c */
    public Act f82984c;

    /* JADX INFO: renamed from: d */
    public String f82985d;

    /* JADX INFO: renamed from: e */
    public List<fyh> f82986e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public e30<Emotion> f82987f;

    /* JADX INFO: renamed from: g */
    public l80 f82988g;

    public cyh(Act act, String str, l80 l80Var) {
        this.f82985d = str;
        this.f82984c = act;
        this.f82988g = l80Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f82986e.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return new FeedSelectStatusItem(this.f82984c);
    }

    @Override // p149l.c7h
    /* JADX INFO: renamed from: E */
    public View mo105564E() {
        if (nkg.m159840A() || nkg.m159909u0()) {
            TextView textView = new TextView(this.f82984c);
            textView.setTextColor(this.f82984c.getResources().getColor(e1c0.f88748C));
            textView.setTextSize(12.0f);
            return textView;
        }
        TextView textView2 = new TextView(this.f82984c);
        textView2.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        textView2.setTextSize(13.0f);
        textView2.getPaint().setFakeBoldText(true);
        return textView2;
    }

    @Override // p149l.c7h
    /* JADX INFO: renamed from: F */
    public boolean mo105565F(int i) {
        return this.f82986e.get(i).m123770e();
    }

    @Override // p149l.c7h
    /* JADX INFO: renamed from: G */
    public void mo105566G(View view, int i) {
        if (view instanceof TextView) {
            ((TextView) view).setText(this.f82986e.get(i).m123766a());
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final fyh fyhVar, int i, int i2) {
        if (view instanceof FeedSelectStatusItem) {
            FeedSelectStatusItem feedSelectStatusItem = (FeedSelectStatusItem) view;
            feedSelectStatusItem.setOnClickListener(new View.OnClickListener() { // from class: l.byh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f77919a.m109313K(fyhVar, view2);
                }
            });
            feedSelectStatusItem.m65836S(fyhVar);
            if (nkg.m159840A()) {
                Act act = this.f82984c;
                if (act instanceof FeedSelectAndPostStatusAct) {
                    FeedSelectAndPostStatusAct feedSelectAndPostStatusAct = (FeedSelectAndPostStatusAct) act;
                    if (NullChecker.m81303a(feedSelectAndPostStatusAct.f42967h) && TextUtils.equals(feedSelectAndPostStatusAct.f42967h.f38748id, fyhVar.m123767b().f38748id)) {
                        feedSelectStatusItem.m65838V(true);
                    }
                }
            }
            if (nkg.m159909u0()) {
                Act act2 = this.f82984c;
                if (act2 instanceof FeedMomentPostSelectStatusAct) {
                    FeedMomentPostSelectStatusAct feedMomentPostSelectStatusAct = (FeedMomentPostSelectStatusAct) act2;
                    if (NullChecker.m81303a(feedMomentPostSelectStatusAct.f40803h) && TextUtils.equals(feedMomentPostSelectStatusAct.f40803h.f38748id, fyhVar.m123767b().f38748id)) {
                        feedSelectStatusItem.m65838V(true);
                    }
                }
            }
            float fM208412y0 = ((((((xdl0.m208412y0() - (t100.m186890d(20.0f) * 2)) - (t100.m186890d(8.0f) * 3)) / 4) * 84.0f) / 68.0f) - t100.m186890d(52.0f)) - t100.m186890d(17.0f);
            float f = fM208412y0 / 3.0f;
            feedSelectStatusItem.m65837T((int) f, (int) (fM208412y0 - f));
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public fyh getItem(int i) {
        return this.f82986e.get(i);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m109313K(fyh fyhVar, View view) {
        m109314L(fyhVar);
    }

    /* JADX INFO: renamed from: L */
    public void m109314L(fyh fyhVar) {
        if ((nkg.m159840A() || nkg.m159909u0()) && NullChecker.m81303a(this.f82987f)) {
            this.f82987f.call(fyhVar.m123767b());
            if (!TextUtils.equals("p_moment_fast_state_post", this.f82985d)) {
                zvf0.m220399u("e_set_my_state_type", this.f82985d, vwb.m200311Y("state_type_id", fyhVar.m123767b().f38748id));
            }
            notifyDataSetChanged();
            return;
        }
        if (nkg.m159909u0() && (this.f82984c instanceof FeedMomentPostSelectStatusAct)) {
            return;
        }
        Act act = this.f82984c;
        FeedSelectStatusAct feedSelectStatusAct = (FeedSelectStatusAct) act;
        act.startActivity(FeedPostStatusAct.m65807s2(act, fyhVar.m123767b(), this.f82985d));
        feedSelectStatusAct.overridePendingTransition(0, 0);
        feedSelectStatusAct.m65800k2();
        zvf0.m220399u("e_set_my_state_type", "p_set_my_state", vwb.m200311Y("state_type_id", fyhVar.m123767b().f38748id));
    }

    /* JADX INFO: renamed from: M */
    public void m109315M(List<fyh> list) {
        this.f82986e.clear();
        this.f82986e.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: N */
    public void m109316N(e30<Emotion> e30Var) {
        this.f82987f = e30Var;
    }

    @Override // p149l.c7h, p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        super.onBindViewHolder(abstractC0566d0, i);
        this.f82988g.m148839h(abstractC0566d0.itemView, this.f82986e.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        this.f82988g.m148838g(abstractC0566d0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f82988g.m148840i(abstractC0566d0.itemView);
    }
}
