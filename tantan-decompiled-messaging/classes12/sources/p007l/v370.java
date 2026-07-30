package p007l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFansView;
import com.p1.mobile.putong.app.PutongAct;
import java.util.Collections;
import java.util.List;
import l.wp1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class v370 extends wp1<User> {

    /* JADX INFO: renamed from: c */
    public String f14034c;

    /* JADX INFO: renamed from: d */
    public PutongAct f14035d;

    /* JADX INFO: renamed from: e */
    public List<User> f14036e = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: f */
    public u470 f14037f;

    public v370(PutongAct putongAct, String str, u470 u470Var) {
        this.f14035d = putongAct;
        this.f14034c = str;
        this.f14037f = u470Var;
    }

    /* JADX INFO: renamed from: e */
    public void m15281e(int i) {
        this.f14037f.m14768e(i);
    }

    public int getCount() {
        return this.f14036e.size();
    }

    public long getItemId(int i) {
        return i;
    }

    /* JADX INFO: renamed from: m */
    public View m15283m(ViewGroup viewGroup, int i) {
        return this.f14035d.inflater().inflate(o6c0.f11310t5, viewGroup, false);
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m15282j(View view, User user, int i, int i2) {
        ((PhotoAlbumFansView) view).m4666n(user, this.f14034c.equals("fans"), this.f14034c);
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        return this.f14036e.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public void m15286t(List<User> list) {
        this.f14036e = list;
        notifyDataSetChanged();
    }
}
