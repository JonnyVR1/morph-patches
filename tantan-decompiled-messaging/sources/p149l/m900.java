package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.p060ui.moments.CommentView;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentDetailAct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class m900 extends AbstractC15503a<MomentMessage> {

    /* JADX INFO: renamed from: c */
    public MomentDetailAct f132645c;

    /* JADX INFO: renamed from: d */
    public List<MomentMessage> f132646d = new ArrayList();

    public m900(MomentDetailAct momentDetailAct) {
        this.f132645c = momentDetailAct;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return false;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        return this.f132645c.inflater().inflate(o6c0.f142283s4, (ViewGroup) this.f132645c.f43679d.f69134a, false);
    }

    @Override // p149l.AbstractC15503a
    /* JADX INFO: renamed from: p */
    public List<MomentMessage> mo20404p() {
        return this.f132646d;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, MomentMessage momentMessage, int i, int i2) {
        CommentView commentView = (CommentView) view;
        qe00 qe00Var = this.f132645c.f43678c;
        commentView.m66630w(this, momentMessage, qe00Var.f153985c, qe00Var.f153984b, i2 == mo20404p().size() - 1, User.isTeamAccount(this.f132645c.f43678c.f153985c));
    }

    /* JADX INFO: renamed from: t */
    public void m153565t(List<MomentMessage> list) {
        this.f132646d = list;
        notifyDataSetChanged();
    }
}
