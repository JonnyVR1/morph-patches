package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.map.intl.IntlMapItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class evg0 extends AbstractC15503a<muw> {

    /* JADX INFO: renamed from: c */
    public Context f93334c;

    /* JADX INFO: renamed from: d */
    public List<muw> f93335d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public e30<muw> f93336e;

    public evg0(Context context, e30<muw> e30Var) {
        this.f93334c = context;
        this.f93336e = e30Var;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f93334c).inflate(f6c0.f95328Dd, viewGroup, false);
    }

    @Override // p149l.AbstractC15503a
    /* JADX INFO: renamed from: p */
    public List<muw> mo20404p() {
        return this.f93335d;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, muw muwVar, int i, int i2) {
        ((IntlMapItem) view).m47395b0(muwVar, this.f93336e);
    }

    /* JADX INFO: renamed from: t */
    public void m118265t(List<muw> list) {
        this.f93335d = list;
        notifyDataSetChanged();
    }
}
