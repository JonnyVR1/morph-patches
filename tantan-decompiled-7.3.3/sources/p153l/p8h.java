package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.C11443a;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class p8h implements wul {

    /* JADX INFO: renamed from: a */
    public List<vul> f151028a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Act f151029b;

    /* JADX INFO: renamed from: c */
    public PhotoAlbumBaseFrag f151030c;

    /* JADX INFO: renamed from: d */
    public C11443a f151031d;

    public p8h(C11443a c11443a) {
        this.f151031d = c11443a;
        if (NullChecker.m82486a(c11443a)) {
            this.f151029b = c11443a.f42228e;
            this.f151030c = c11443a.f42227d;
        }
        m171240a();
    }

    /* JADX INFO: renamed from: a */
    public final void m171240a() {
        this.f151028a.add(new hth());
        if (ymg.m216676f().m216690p()) {
            this.f151028a.add(new zmg());
        }
        this.f151028a.add(new n2f0());
    }

    /* JADX INFO: renamed from: b */
    public boolean m171241b() {
        if (jyb.m147479J(this.f151028a)) {
            return false;
        }
        Iterator<vul> it = this.f151028a.iterator();
        while (it.hasNext()) {
            if (it.next().mo156951d()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public boolean m171242c(String str) {
        if (!m171241b() && !jyb.m147479J(this.f151028a)) {
            Iterator<vul> it = this.f151028a.iterator();
            while (it.hasNext()) {
                if (it.next().mo137075a(this.f151029b, str, this)) {
                    return true;
                }
            }
        }
        return false;
    }
}
