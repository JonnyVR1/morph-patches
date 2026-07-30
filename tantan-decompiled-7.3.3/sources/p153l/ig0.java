package p153l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.aialbum.view.AiAlbumResultItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ig0 extends jic0<String> {

    /* JADX INFO: renamed from: c */
    public List<String> f114724c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public InterfaceC17714a f114725d;

    /* JADX INFO: renamed from: e */
    public String f114726e;

    /* JADX INFO: renamed from: l.ig0$a */
    public interface InterfaceC17714a {
        /* JADX INFO: renamed from: a */
        void mo45477a(String str, int i);

        /* JADX INFO: renamed from: b */
        void mo45478b(String str, int i);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f114724c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f126143y, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final String str, int i, final int i2) {
        if (i == 1) {
            AiAlbumResultItemView aiAlbumResultItemView = (AiAlbumResultItemView) view;
            aiAlbumResultItemView.m45463z(str, TextUtils.equals(this.f114726e, str));
            bnl0.m105509E0(aiAlbumResultItemView.f29260e, new View.OnClickListener() { // from class: l.gg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f103977a.m139758I(str, i2, view2);
                }
            });
            bnl0.m105509E0(aiAlbumResultItemView.f29261f, new View.OnClickListener() { // from class: l.hg0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f109359a.m139759J(str, i2, view2);
                }
            });
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        if (jyb.m147479J(this.f114724c)) {
            return null;
        }
        return this.f114724c.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m139758I(String str, int i, View view) {
        if (NullChecker.m82486a(this.f114725d)) {
            this.f114725d.mo45477a(str, i);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m139759J(String str, int i, View view) {
        if (NullChecker.m82486a(this.f114725d)) {
            this.f114725d.mo45478b(str, i);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m139760K(InterfaceC17714a interfaceC17714a) {
        this.f114725d = interfaceC17714a;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: L */
    public void m139761L(List<String> list) {
        this.f114724c.clear();
        this.f114724c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: M */
    public void m139762M(String str) {
        this.f114726e = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 1;
    }
}
