package p007l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.p005ui.moments.CommentView;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentDetailAct;
import java.util.ArrayList;
import java.util.List;
import l.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class m900 extends a<MomentMessage> {

    /* JADX INFO: renamed from: c */
    public MomentDetailAct f10276c;

    /* JADX INFO: renamed from: d */
    public List<MomentMessage> f10277d = new ArrayList();

    public m900(MomentDetailAct momentDetailAct) {
        this.f10276c = momentDetailAct;
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    public boolean isEnabled(int i) {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public View m11865m(ViewGroup viewGroup, int i) {
        return this.f10276c.inflater().inflate(o6c0.f11302s4, (ViewGroup) this.f10276c.f5140d.f5718a, false);
    }

    /* JADX INFO: renamed from: p */
    public List m11866p() {
        return this.f10277d;
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m11864j(View view, MomentMessage momentMessage, int i, int i2) {
        CommentView commentView = (CommentView) view;
        qe00 qe00Var = this.f10276c.f5139c;
        commentView.m7821w(this, momentMessage, qe00Var.f12212c, qe00Var.f12211b, i2 == m11866p().size() - 1, User.isTeamAccount(this.f10276c.f5139c.f12212c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public void m11868t(List<MomentMessage> list) {
        this.f10277d = list;
        notifyDataSetChanged();
    }
}
