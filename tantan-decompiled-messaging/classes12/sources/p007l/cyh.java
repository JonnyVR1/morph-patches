package p007l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.state.FeedMomentPostSelectStatusAct;
import com.p000p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p000p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import com.p000p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct;
import com.p000p1.mobile.putong.feed.newui.status.selectstatus.adapter.FeedSelectStatusItem;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.j760;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class cyh extends c7h<fyh> {

    /* JADX INFO: renamed from: c */
    public Act f6745c;

    /* JADX INFO: renamed from: d */
    public String f6746d;

    /* JADX INFO: renamed from: e */
    public List<fyh> f6747e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public e30<Emotion> f6748f;

    /* JADX INFO: renamed from: g */
    public l80 f6749g;

    public cyh(Act act, String str, l80 l80Var) {
        this.f6746d = str;
        this.f6745c = act;
        this.f6749g = l80Var;
    }

    /* JADX INFO: renamed from: C */
    public int m9257C() {
        return this.f6747e.size();
    }

    /* JADX INFO: renamed from: D */
    public View m9258D(ViewGroup viewGroup, int i) {
        return new FeedSelectStatusItem(this.f6745c);
    }

    @Override // p007l.c7h
    /* JADX INFO: renamed from: E */
    public View mo9106E() {
        if (nkg.m12199A() || nkg.m12268u0()) {
            TextView textView = new TextView(this.f6745c);
            textView.setTextColor(this.f6745c.getResources().getColor(e1c0.f7104C));
            textView.setTextSize(12.0f);
            return textView;
        }
        TextView textView2 = new TextView(this.f6745c);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(13.0f);
        textView2.getPaint().setFakeBoldText(true);
        return textView2;
    }

    @Override // p007l.c7h
    /* JADX INFO: renamed from: F */
    public boolean mo9107F(int i) {
        return this.f6747e.get(i).m10331e();
    }

    @Override // p007l.c7h
    /* JADX INFO: renamed from: G */
    public void mo9108G(View view, int i) {
        if (view instanceof TextView) {
            ((TextView) view).setText(this.f6747e.get(i).m10327a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void m9256A(View view, final fyh fyhVar, int i, int i2) {
        if (view instanceof FeedSelectStatusItem) {
            FeedSelectStatusItem feedSelectStatusItem = (FeedSelectStatusItem) view;
            feedSelectStatusItem.setOnClickListener(new View.OnClickListener() { // from class: l.byh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f6469a.m9261K(fyhVar, view2);
                }
            });
            feedSelectStatusItem.m6983S(fyhVar);
            if (nkg.m12199A()) {
                FeedSelectAndPostStatusAct feedSelectAndPostStatusAct = this.f6745c;
                if (feedSelectAndPostStatusAct instanceof FeedSelectAndPostStatusAct) {
                    FeedSelectAndPostStatusAct feedSelectAndPostStatusAct2 = feedSelectAndPostStatusAct;
                    if (NullChecker.a(feedSelectAndPostStatusAct2.f4428h) && TextUtils.equals(feedSelectAndPostStatusAct2.f4428h.f209id, fyhVar.m10328b().f209id)) {
                        feedSelectStatusItem.m6985V(true);
                    }
                }
            }
            if (nkg.m12268u0()) {
                FeedMomentPostSelectStatusAct feedMomentPostSelectStatusAct = this.f6745c;
                if (feedMomentPostSelectStatusAct instanceof FeedMomentPostSelectStatusAct) {
                    FeedMomentPostSelectStatusAct feedMomentPostSelectStatusAct2 = feedMomentPostSelectStatusAct;
                    if (NullChecker.a(feedMomentPostSelectStatusAct2.f2264h) && TextUtils.equals(feedMomentPostSelectStatusAct2.f2264h.f209id, fyhVar.m10328b().f209id)) {
                        feedSelectStatusItem.m6985V(true);
                    }
                }
            }
            float fY0 = ((((((xdl0.y0() - (t100.d(20.0f) * 2)) - (t100.d(8.0f) * 3)) / 4) * 84.0f) / 68.0f) - t100.d(52.0f)) - t100.d(17.0f);
            float f = fY0 / 3.0f;
            feedSelectStatusItem.m6984T((int) f, (int) (fY0 - f));
        }
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public fyh getItem(int i) {
        return this.f6747e.get(i);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m9261K(fyh fyhVar, View view) {
        m9262L(fyhVar);
    }

    /* JADX INFO: renamed from: L */
    public void m9262L(fyh fyhVar) {
        if ((nkg.m12199A() || nkg.m12268u0()) && NullChecker.a(this.f6748f)) {
            this.f6748f.call(fyhVar.m10328b());
            if (!TextUtils.equals("p_moment_fast_state_post", this.f6746d)) {
                zvf0.u("e_set_my_state_type", this.f6746d, new j760[]{vwb.Y("state_type_id", fyhVar.m10328b().f209id)});
            }
            notifyDataSetChanged();
            return;
        }
        if (nkg.m12268u0() && (this.f6745c instanceof FeedMomentPostSelectStatusAct)) {
            return;
        }
        Act act = this.f6745c;
        FeedSelectStatusAct feedSelectStatusAct = (FeedSelectStatusAct) act;
        act.startActivity(FeedPostStatusAct.m6953s2(act, fyhVar.m10328b(), this.f6746d));
        feedSelectStatusAct.overridePendingTransition(0, 0);
        feedSelectStatusAct.m6946k2();
        zvf0.u("e_set_my_state_type", "p_set_my_state", new j760[]{vwb.Y("state_type_id", fyhVar.m10328b().f209id)});
    }

    /* JADX INFO: renamed from: M */
    public void m9263M(List<fyh> list) {
        this.f6747e.clear();
        this.f6747e.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: N */
    public void m9264N(e30<Emotion> e30Var) {
        this.f6748f = e30Var;
    }

    @Override // p007l.c7h
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        super.onBindViewHolder(d0Var, i);
        this.f6749g.m11594h(d0Var.itemView, this.f6747e.get(i), i);
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        this.f6749g.m11593g(d0Var.itemView);
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        this.f6749g.m11595i(d0Var.itemView);
    }
}
