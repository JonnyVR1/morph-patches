package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFansView;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class bc70 extends dq1<User> {

    /* JADX INFO: renamed from: c */
    public String f76104c;

    /* JADX INFO: renamed from: d */
    public PutongAct f76105d;

    /* JADX INFO: renamed from: e */
    public List<User> f76106e = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: f */
    public ad70 f76107f;

    public bc70(PutongAct putongAct, String str, ad70 ad70Var) {
        this.f76105d = putongAct;
        this.f76104c = str;
        this.f76107f = ad70Var;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: e */
    public void mo42529e(int i) {
        this.f76107f.m97062e(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f76106e.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        return this.f76105d.inflater().inflate(tec0.f173760t5, viewGroup, false);
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, User user, int i, int i2) {
        ((PhotoAlbumFansView) view).m64827n(user, this.f76104c.equals("fans"), this.f76104c);
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        return this.f76106e.get(i);
    }

    /* JADX INFO: renamed from: t */
    public void m103493t(List<User> list) {
        this.f76106e = list;
        notifyDataSetChanged();
    }
}
