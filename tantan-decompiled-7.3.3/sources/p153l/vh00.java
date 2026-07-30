package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.p065ui.moments.CommentView;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentDetailAct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class vh00 extends AbstractC15610a<MomentMessage> {

    /* JADX INFO: renamed from: c */
    public MomentDetailAct f184071c;

    /* JADX INFO: renamed from: d */
    public List<MomentMessage> f184072d = new ArrayList();

    public vh00(MomentDetailAct momentDetailAct) {
        this.f184071c = momentDetailAct;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return false;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        return this.f184071c.inflater().inflate(tec0.f173752s4, (ViewGroup) this.f184071c.f44527d.f121723a, false);
    }

    @Override // p153l.AbstractC15610a
    /* JADX INFO: renamed from: p */
    public List<MomentMessage> mo21403p() {
        return this.f184072d;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, MomentMessage momentMessage, int i, int i2) {
        CommentView commentView = (CommentView) view;
        zm00 zm00Var = this.f184071c.f44526c;
        commentView.m67813w(this, momentMessage, zm00Var.f205023c, zm00Var.f205022b, i2 == mo21403p().size() - 1, User.isTeamAccount(this.f184071c.f44526c.f205023c));
    }

    /* JADX INFO: renamed from: t */
    public void m201248t(List<MomentMessage> list) {
        this.f184072d = list;
        notifyDataSetChanged();
    }
}
