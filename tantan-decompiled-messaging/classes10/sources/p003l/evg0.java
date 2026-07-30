package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.map.intl.IntlMapItem;
import java.util.ArrayList;
import java.util.List;
import l.a;
import l.e30;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class evg0 extends a<muw> {

    /* JADX INFO: renamed from: c */
    public Context f4347c;

    /* JADX INFO: renamed from: d */
    public List<muw> f4348d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public e30<muw> f4349e;

    public evg0(Context context, e30<muw> e30Var) {
        this.f4347c = context;
        this.f4349e = e30Var;
    }

    /* JADX INFO: renamed from: m */
    public View m6334m(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f4347c).inflate(f6c0.Dd, viewGroup, false);
    }

    /* JADX INFO: renamed from: p */
    public List<muw> m6335p() {
        return this.f4348d;
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m6333j(View view, muw muwVar, int i, int i2) {
        ((IntlMapItem) view).b0(muwVar, this.f4349e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public void m6337t(List<muw> list) {
        this.f4348d = list;
        notifyDataSetChanged();
    }
}
